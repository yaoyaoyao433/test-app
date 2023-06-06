package com.meituan.android.common.sniffer.bear;

import android.os.Build;
import android.os.Looper;
import android.support.annotation.AnyThread;
import android.support.annotation.GuardedBy;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.KiteFlyConstants;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.metricx.utils.NetWorkUtils;
import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.android.common.sniffer.bear.Bear;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.waimai.launcher.util.aop.b;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BearCub {
    private static final String APP_HASH = "appHash";
    private static final String BUSINESS = "business";
    private static final String CASE_DESCRIBE = "caseDescribe";
    private static final String CASE_MODULE = "caseModule";
    private static final String CASE_PAGE = "casePage";
    private static final String CASE_TYPE = "caseType";
    private static final String CITY_ID = "cityId";
    private static final int SAMPLE_MAX = 100000;
    private static final String USER_ID = "userId";
    private final Bear bear;
    private final Key key;
    private final String keyStr;
    private final Object mBadBodyCookie;
    private HoneyConfig mHoneyConfig;
    @VisibleForTesting
    volatile boolean mInitDone;
    private Random mRandom;
    private final ReadWriteLock mReadWriteLock = new ReentrantReadWriteLock();
    @GuardedBy("mReadWriteLock")
    private Queue<Honey> mInitQueue = new ConcurrentLinkedQueue();
    private final Queue<Honey> mBgWorkers = new ConcurrentLinkedQueue();
    private final AtomicBoolean mWaiting = new AtomicBoolean();
    private long mLastLogReportMs = -1;
    private final Runnable mWorkerRunnable = new Bear.SafeRunnable() { // from class: com.meituan.android.common.sniffer.bear.BearCub.1
        @Override // com.meituan.android.common.sniffer.bear.Bear.SafeRunnable
        public void safeRun() {
            BearCub.this.worker();
        }
    };

    public BearCub(@NonNull Bear bear, @NonNull Key key) {
        this.bear = bear;
        this.key = key;
        this.keyStr = key.business + CommonConstant.Symbol.DOLLAR + key.module;
        if (Bear.sBadBodyGrave != null) {
            this.mBadBodyCookie = Bear.sBadBodyGrave.onNewBearCub(this);
        } else {
            this.mBadBodyCookie = null;
        }
    }

    @WorkerThread
    public void onCreate() {
        if (this.mInitDone) {
            return;
        }
        onConfigChanged();
        if (Build.VERSION.SDK_INT >= 21) {
            this.mRandom = ThreadLocalRandom.current();
        } else {
            this.mRandom = new Random();
        }
        this.mReadWriteLock.writeLock().lock();
        Queue<Honey> queue = this.mInitQueue;
        this.mInitQueue = null;
        this.mInitDone = true;
        this.mReadWriteLock.writeLock().unlock();
        for (Honey honey : queue) {
            worker(honey);
        }
    }

    @WorkerThread
    public void onConfigChanged() {
        HoneyConfig honeyConfig = this.bear.mKey2HoneyConfig.get(this.key);
        if (honeyConfig == null) {
            honeyConfig = this.bear.mDefaultHoneyConfig;
        }
        this.mHoneyConfig = honeyConfig;
    }

    @AnyThread
    public void sniffer(@NonNull Honey honey) {
        if (this.mInitDone) {
            workerMayOnMain(honey);
            return;
        }
        this.mReadWriteLock.readLock().lock();
        if (this.mInitQueue != null) {
            this.mInitQueue.offer(honey);
            this.mReadWriteLock.readLock().unlock();
            return;
        }
        this.mReadWriteLock.readLock().unlock();
        workerMayOnMain(honey);
    }

    @AnyThread
    private void workerMayOnMain(@NonNull Honey honey) {
        if (filter(honey, honey.type)) {
            honey.recycle();
            return;
        }
        this.mBgWorkers.add(honey);
        if (this.mWaiting.compareAndSet(false, true)) {
            b.a(this.bear.mWorker, this.mWorkerRunnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public void worker() {
        this.mWaiting.set(false);
        while (true) {
            Honey poll = this.mBgWorkers.poll();
            if (poll == null) {
                return;
            }
            worker(poll);
        }
    }

    @AnyThread
    private boolean filter(@NonNull Honey honey, @Nullable String str) {
        if (Looper.getMainLooper() == Looper.myLooper() || honey.filtered) {
            return false;
        }
        honey.filtered = true;
        if (this.mHoneyConfig.mRemoteIgnore != 0) {
            return true;
        }
        if (honey.normal) {
            int nextInt = this.mRandom.nextInt(100000);
            honey.metricsSample = this.mHoneyConfig.sampleOfSuccessMetricsForType(str);
            return nextInt >= honey.metricsSample;
        }
        int sampleOfErrorLogForType = this.mHoneyConfig.sampleOfErrorLogForType(str);
        if (sampleOfErrorLogForType == 100000 || errOverTime()) {
            honey.snifferSample = 100000;
        } else if (this.mRandom.nextInt(100000) < sampleOfErrorLogForType) {
            honey.snifferSample = sampleOfErrorLogForType;
        }
        int sampleOfFailedMetricsForType = this.mHoneyConfig.sampleOfFailedMetricsForType(str);
        if (sampleOfFailedMetricsForType != 0 && (sampleOfFailedMetricsForType == 100000 || this.mRandom.nextInt(100000) < sampleOfFailedMetricsForType)) {
            honey.metricsSample = sampleOfFailedMetricsForType;
        }
        return honey.snifferSample < 0 && honey.metricsSample < 0;
    }

    @AnyThread
    private boolean errOverTime() {
        if (this.mLastLogReportMs == -1) {
            this.mLastLogReportMs = this.bear.mStorage.b(this.keyStr, 0L);
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = currentTimeMillis - this.mLastLogReportMs > 86400000;
        if (z) {
            this.mLastLogReportMs = currentTimeMillis;
            this.bear.mStorage.a(this.keyStr, this.mLastLogReportMs);
        }
        return z;
    }

    @WorkerThread
    private void worker(@NonNull Honey honey) {
        if (filter(honey, honey.type)) {
            honey.recycle();
            return;
        }
        if (this.mBadBodyCookie != null) {
            Bear.sBadBodyGrave.onHoneyReport(honey, this.mBadBodyCookie);
        }
        if (honey.normal) {
            reportMetrics(honey);
        } else {
            if (honey.snifferSample > 0) {
                reportSniffer(honey);
            }
            if (honey.metricsSample > 0) {
                reportMetrics(honey);
            }
        }
        honey.recycle();
    }

    @VisibleForTesting
    String convertLog(@NonNull Honey honey) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("networkState", NetWorkUtils.getNetWorkTypeForCrashAndSniffer(this.bear.mContext));
            if (!TextUtils.isEmpty(honey.log)) {
                jSONObject2.put("extra", new JSONObject(honey.log));
            }
            jSONObject.put("exts", jSONObject2);
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    private void reportSniffer(@NonNull Honey honey) {
        HashMap hashMap = new HashMap();
        hashMap.put("business", this.key.business);
        hashMap.put(CASE_MODULE, this.key.module);
        hashMap.put(CASE_TYPE, honey.type);
        hashMap.put(CASE_PAGE, honey.page);
        hashMap.put(CITY_ID, Sniffer.getSnifferConfig().getCityId());
        hashMap.put(APP_HASH, Sniffer.getSnifferConfig().getApkHash());
        hashMap.put("userId", Sniffer.getSnifferConfig().getUserId());
        hashMap.put(CASE_DESCRIBE, honey.describe);
        hashMap.put("fromNew", "1");
        hashMap.put("$sr", Double.valueOf((honey.snifferSample * 1.0d) / 100000.0d));
        Babel.logRT(new Log.Builder(convertLog(honey)).tag(KiteFlyConstants.SNIFFER).optional(hashMap).lv4LocalStatus(true).value(honey.weight).reportChannel("s0").build());
    }

    @VisibleForTesting
    void skyeyeAdapter(@NonNull Honey honey, @NonNull Map<String, Object> map) {
        if (TextUtils.isEmpty(honey.log)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(honey.log);
            Object obj = jSONObject.get("skyeyeVersion");
            if (obj instanceof String) {
                map.put("skyeyeVersion", obj);
            }
            Object obj2 = jSONObject.get("belongPage");
            if (obj2 instanceof String) {
                map.put("belongPage", obj2);
            }
        } catch (JSONException unused) {
        }
    }

    private void reportMetrics(@NonNull Honey honey) {
        HashMap hashMap = new HashMap();
        hashMap.put("business", this.key.business);
        hashMap.put(CASE_MODULE, this.key.module);
        hashMap.put(CASE_TYPE, honey.type);
        hashMap.put(CASE_PAGE, honey.page);
        hashMap.put(CITY_ID, Sniffer.getSnifferConfig().getCityId());
        if (honey.customFieldMap != null) {
            int i = 0;
            for (String str : honey.customFieldMap.keySet()) {
                hashMap.put(str, honey.customFieldMap.get(str));
                i++;
                if (i >= 5) {
                    break;
                }
            }
        }
        skyeyeAdapter(honey, hashMap);
        hashMap.put("fromNew", "1");
        hashMap.put("$sr", Double.valueOf((honey.metricsSample * 1.0d) / 100000.0d));
        Babel.logRT(new Log.Builder(honey.log).tag(honey.normal ? KiteFlyConstants.SNIFFER_SUCCESS_METRICS : KiteFlyConstants.SNIFFER_FAIL_METRICS).optional(hashMap).lv4LocalStatus(true).value(honey.weight).reportChannel("s0").build());
    }
}
