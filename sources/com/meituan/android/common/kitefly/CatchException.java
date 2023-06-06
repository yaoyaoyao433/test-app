package com.meituan.android.common.kitefly;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.support.annotation.AnyThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.metricx.helpers.UrlFactory;
import com.meituan.android.common.metricx.utils.ApkUtil;
import com.meituan.android.common.metricx.utils.ILogger;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.android.common.statistics.Constants;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.metrics.util.DeviceUtil;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.android.jarvis.c;
import com.sankuai.common.utils.NetWorkUtils;
import com.sankuai.common.utils.ProcessUtils;
import com.squareup.okhttp.u;
import com.squareup.okhttp.x;
import com.squareup.okhttp.y;
import com.squareup.okhttp.z;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CatchException {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final UrlFactory.MetricxUrl exceptionUrl = UrlFactory.getInstance().createUrl("https://p2.d.zservey.com/perf/catchexception", "https://p2.d.meituan.net/perf/catchexception");
    private final ILogger logger;
    private final AtomicLong mLastReportTime;
    private final int mMaxNum;
    private final long mMinInterval;
    private final String mName;
    private final AtomicInteger mReportNum;
    private ScheduledExecutorService mService;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface CallBack {
        void onFinish();
    }

    public CatchException(@NonNull String str, int i, long j) {
        int i2 = 1;
        Object[] objArr = {str, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ffc0c043fe666a2262fbfbf5b5742b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ffc0c043fe666a2262fbfbf5b5742b4");
            return;
        }
        this.mReportNum = new AtomicInteger(0);
        this.mLastReportTime = new AtomicLong(0L);
        this.logger = Logger.getBabelLogger();
        this.mName = str;
        this.mMinInterval = j;
        this.mMaxNum = (Babel.getBabelConfig() == null || !Babel.getBabelConfig().isReportExceptionLimited()) ? i : i2;
    }

    @AnyThread
    public void reportException(@NonNull Throwable th, Map<String, String> map) {
        Object[] objArr = {th, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "763cb7ca26204d10779b3edd949c2d4f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "763cb7ca26204d10779b3edd949c2d4f");
        } else {
            checkAndReport(th, map);
        }
    }

    @AnyThread
    public void reportException(@NonNull Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0130eca349332bee74fb64128f6efe98", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0130eca349332bee74fb64128f6efe98");
        } else {
            checkAndReport(th, null);
        }
    }

    @AnyThread
    public void reportException(@NonNull Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec173a71f0bc8eb985b6941c08cda164", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec173a71f0bc8eb985b6941c08cda164");
        } else {
            checkAndReport(null, map);
        }
    }

    private void checkAndReport(Throwable th, Map<String, String> map) {
        Object[] objArr = {th, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d0e5cae61393fa02b151a11355d5208", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d0e5cae61393fa02b151a11355d5208");
            return;
        }
        this.logger.e(this.mName, "reportException: ", th);
        if (th instanceof BabelException) {
            throw ((BabelException) th);
        }
        if (this.mReportNum.get() > this.mMaxNum) {
            this.logger.d(this.mName, "reportException, mReportNum > mMaxNum, stop report");
            return;
        }
        if (this.mMinInterval > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.mLastReportTime.get() < this.mMinInterval) {
                this.logger.d(this.mName, "reportException, interval too small, stop report");
                return;
            }
            this.mLastReportTime.set(elapsedRealtime);
        }
        this.mReportNum.addAndGet(1);
        report(th, map);
    }

    private void report(@Nullable final Throwable th, final Map<String, String> map) {
        Object[] objArr = {th, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "119a44ba009a41ae40c9f02062739712", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "119a44ba009a41ae40c9f02062739712");
            return;
        }
        this.logger.d(this.mName, "report exception");
        if (this.mService == null) {
            synchronized (this) {
                if (this.mService == null) {
                    this.mService = c.c("babel-catchexception");
                }
            }
        }
        this.mService.execute(new Runnable() { // from class: com.meituan.android.common.kitefly.CatchException.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e08e410540821f5ae6fb76d24a801259", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e08e410540821f5ae6fb76d24a801259");
                    return;
                }
                try {
                    CatchException.this.directUploadCrash(th, map);
                } catch (Throwable th2) {
                    CatchException.this.logger.e("catchException failed", th2);
                }
            }
        });
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96999df5e363a2f00d737705a075ab7a", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96999df5e363a2f00d737705a075ab7a");
        }
        return "CatchException{mName='" + this.mName + "', mMaxNum=" + this.mMaxNum + ", mMinInterval=" + this.mMinInterval + '}';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void directUploadCrash(Throwable th, Map<String, String> map) {
        Object[] objArr = {th, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9cbd30ab987c0615a46cae92e7ea464", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9cbd30ab987c0615a46cae92e7ea464");
            return;
        }
        Context context = KiteFly.getContext();
        if (context == null) {
            return;
        }
        if (!NetWorkUtils.isNetworkConnected(context)) {
            this.logger.e("CatchException, no net connected return");
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("os", "Android");
        jsonObject.addProperty("osVersion", Build.VERSION.RELEASE);
        jsonObject.addProperty("processName", ProcessUtils.getCurrentProcessName(context));
        jsonObject.addProperty("isMainThread", (Number) 0);
        jsonObject.addProperty("appVersion", Babel.getBabelConfig().getAppVersion());
        jsonObject.addProperty(NetLogConstants.Environment.DEVICE_PROVIDER, Build.MANUFACTURER);
        jsonObject.addProperty("app", ApkUtil.obtainPackageName(context));
        jsonObject.addProperty("deviceType", Build.MODEL);
        jsonObject.addProperty(NetLogConstants.Environment.MCC_MNC, com.meituan.android.common.metricx.utils.NetWorkUtils.getMccmnc(context));
        jsonObject.addProperty("token", Babel.getBabelConfig().getToken());
        jsonObject.addProperty("babelid", Babel.getBabelConfig().getUuid());
        jsonObject.addProperty("networkType", com.meituan.android.common.metricx.utils.NetWorkUtils.getNetWorkTypeForBabel(context));
        jsonObject.addProperty(NetLogConstants.Environment.BUILD_VERSION, Babel.getBabelConfig().getBuildVersion());
        jsonObject.addProperty("env_ts", Long.valueOf(TimeUtil.currentTimeMillisSNTP()));
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty(NetLogConstants.Environment.BUILD_VERSION, Babel.getBabelConfig().getBuildVersion());
        jsonObject2.addProperty(Constants.Environment.KEY_CH, Babel.getBabelConfig().getChannel());
        jsonObject2.addProperty("guid", UUID.randomUUID().toString());
        jsonObject2.addProperty(Constants.Environment.KEY_CITYID, (Number) (-1));
        jsonObject2.addProperty("net", com.meituan.android.common.metricx.utils.NetWorkUtils.getNetWorkTypeForBabel(context));
        jsonObject2.addProperty("source", "babel");
        jsonObject2.addProperty("appVersion", Babel.getBabelConfig().getAppVersion());
        jsonObject2.addProperty("exceptionName", this.mName);
        JsonObject jsonObject3 = new JsonObject();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jsonObject3.addProperty(entry.getKey(), entry.getValue());
            }
        }
        if (th != null) {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            jsonObject2.addProperty(SnifferDBHelper.COLUMN_LOG, stringWriter.toString());
        }
        jsonObject3.addProperty("apkHash", Babel.getBabelConfig().getApkHash());
        jsonObject3.addProperty("appVersion", Babel.getBabelConfig().getAppVersion());
        jsonObject3.addProperty("is_root", Integer.valueOf(DeviceUtil.isRoot() ? 1 : 0));
        jsonObject2.addProperty("option", jsonObject3.toString());
        JsonObject jsonObject4 = new JsonObject();
        jsonObject4.add("tags", jsonObject2);
        jsonObject4.addProperty("type", "catchexception");
        jsonObject4.addProperty("ts", Long.valueOf(TimeUtil.currentTimeMillisSNTP()));
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(jsonObject4);
        jsonObject.addProperty("category", "babel-general");
        jsonObject.addProperty("category_type", "fe_perf");
        jsonObject.add("events", jsonArray);
        try {
            z a = Reporter.getOkHttpClient().a(new x.a().a(exceptionUrl.getUrl()).a("POST", y.create(u.a(PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_JSON), jsonObject.toString())).a()).a();
            this.logger.e("CatchException, upload catchexception: ", Integer.valueOf(a.c));
            a.g.close();
        } catch (IOException e) {
            this.logger.e("CatchException, Http error: ", e);
        }
    }

    public void reportWithCallBack(final Throwable th, final Map<String, String> map, final CallBack callBack) {
        Object[] objArr = {th, map, callBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6afb7e339f2150ac8935525a10cb288d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6afb7e339f2150ac8935525a10cb288d");
            return;
        }
        this.logger.d(this.mName, "reportWithCallBack exception: ", th.getMessage());
        if (this.mService == null) {
            synchronized (this) {
                if (this.mService == null) {
                    this.mService = c.c("babel-catchexception");
                }
            }
        }
        this.mService.execute(new Runnable() { // from class: com.meituan.android.common.kitefly.CatchException.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b29becb00ce834d753e2e069833f0882", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b29becb00ce834d753e2e069833f0882");
                    return;
                }
                try {
                    CatchException.this.directUploadCrash(th, map);
                } catch (Throwable th2) {
                    try {
                        CatchException.this.logger.e("catchException failed", th2);
                        if (callBack == null) {
                        }
                    } finally {
                        if (callBack != null) {
                            callBack.onFinish();
                        }
                    }
                }
            }
        });
    }
}
