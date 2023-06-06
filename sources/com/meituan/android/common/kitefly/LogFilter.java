package com.meituan.android.common.kitefly;

import android.support.annotation.AnyThread;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LogFilter {
    private static final String TAG = "LogFilter";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final LogFilter sInstance = new LogFilter();
    private LogSampler logSampler;
    private final AtomicInteger mCurrentHourReportTimes;
    public final ConcurrentHashMap<String, Boolean> mDynamicBlackList;
    private final CatchException mErrorReporter;
    private final AtomicLong mLastReportTime;
    private final ConcurrentHashMap<String, Boolean> mRemoteBlackList;

    public LogFilter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dedbaa2cd5129d230069a83bbe33ce2b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dedbaa2cd5129d230069a83bbe33ce2b");
            return;
        }
        this.mRemoteBlackList = new ConcurrentHashMap<>();
        this.mLastReportTime = new AtomicLong(0L);
        this.mCurrentHourReportTimes = new AtomicInteger(0);
        this.mDynamicBlackList = new ConcurrentHashMap<>();
        this.mErrorReporter = new CatchException(TAG, 2, 100L);
    }

    public static LogFilter getInstance() {
        return sInstance;
    }

    private boolean isInBlackList(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51947647ec9da09d12413d68db3b256f", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51947647ec9da09d12413d68db3b256f")).booleanValue() : this.mRemoteBlackList.containsKey(str) || this.mDynamicBlackList.containsKey(str);
    }

    public void register() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa881d516285310386423e9ce27115c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa881d516285310386423e9ce27115c0");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("babelVersion", "4.7.24.2-waimai");
        hashMap.put("babelToken", Babel.getBabelConfig().getToken());
        Horn.register("babel-sample-config", new HornCallback() { // from class: com.meituan.android.common.kitefly.LogFilter.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.horn.HornCallback
            public void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b9e5641057a380b74d69b97b9eaf15ab", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b9e5641057a380b74d69b97b9eaf15ab");
                } else {
                    LogFilter.this.onSampleConfigChange(str);
                }
            }
        }, hashMap);
    }

    public void onFetch() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91b8ec8b6d1b47264eb0ddb1cbe3de5a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91b8ec8b6d1b47264eb0ddb1cbe3de5a");
        } else if (this.logSampler == null) {
            synchronized (this) {
                if (this.logSampler == null) {
                    onSampleConfigChange(Horn.accessCache("babel-sample-config"));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSampleConfigChange(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8cc05d7cdd8d6c9401068c3052c73fab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8cc05d7cdd8d6c9401068c3052c73fab");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "{}";
        }
        try {
            this.logSampler = new LogSampler(str);
        } catch (Throwable th) {
            this.mErrorReporter.reportException(th);
            this.logSampler = LogSampler.empty();
        }
    }

    public void resetRemoteBlackList(List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08a8b2386a66cb44e7f85c40f7851e90", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08a8b2386a66cb44e7f85c40f7851e90");
            return;
        }
        this.mRemoteBlackList.clear();
        if (list != null) {
            for (String str : list) {
                if (str != null) {
                    this.mRemoteBlackList.put(str, Boolean.TRUE);
                }
            }
        }
    }

    public void addDynamicBlackList(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c2a5480225010f451c600b43ef56c27", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c2a5480225010f451c600b43ef56c27");
        } else {
            this.mDynamicBlackList.put(str, Boolean.TRUE);
        }
    }

    private boolean needLimit(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e92f04c5148c7a44ca07e2f4565d3753", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e92f04c5148c7a44ca07e2f4565d3753")).booleanValue();
        }
        if ("catchexception".equals(str)) {
            long currentTimeMillisSNTP = TimeUtil.currentTimeMillisSNTP();
            if (currentTimeMillisSNTP - this.mLastReportTime.get() <= DDLoadConstants.TIME_HOURS_MILLIS) {
                return this.mCurrentHourReportTimes.addAndGet(1) > 10;
            }
            this.mLastReportTime.set(currentTimeMillisSNTP);
            this.mCurrentHourReportTimes.set(1);
            return false;
        }
        return false;
    }

    @AnyThread
    public boolean filter(Log log) {
        Object[] objArr = {log};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78d7fa7690402f98000c9d8c3f9bb557", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78d7fa7690402f98000c9d8c3f9bb557")).booleanValue();
        }
        if (TextUtils.isEmpty(log.tag)) {
            if (KiteFly.isDebug) {
                throw new IllegalArgumentException("Babel Log.tag is null. Please fix: ");
            }
            return true;
        } else if (isInBlackList(log.tag)) {
            Logger.getBabelLogger().i(TAG, log.tag, "is in blacklist. Please fix");
            return true;
        } else if (this.logSampler != null && this.logSampler.sampleFilterLog(log)) {
            Logger.getBabelLogger().d(TAG, log.tag, "filter by sample");
            return true;
        } else {
            return needLimit(log.tag);
        }
    }
}
