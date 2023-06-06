package com.huawei.hms.framework.common.hianalytics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hianalytics.v2.HiAnalytics;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HianalyticsHelper {
    private static final String EVENT_ID = "networkkit_restclient";
    private static final String HWID_HA_SERVICE_TAG = "hms_hwid";
    private static final String TAG = "HianalyticsHelper";
    private static final int TYPE_MAINTF = 1;
    private static final String USER_EXPERIENCE_INVOLVED = "user_experience_involved";
    private static final int USER_EXPERIENCE_ON = 1;
    @SuppressLint({"StaticFieldLeak"})
    private static volatile HianalyticsHelper instance;
    private boolean hasHianalytics;
    private String haTag = HWID_HA_SERVICE_TAG;
    private HiAnalyticsInstance hInstance = null;
    private ExecutorService reportExecutor = ExecutorsUtils.newSingleThreadExecutor("report_ha");

    private HianalyticsHelper() {
        try {
            HiAnalytics.getInitFlag();
            this.hasHianalytics = true;
        } catch (Throwable unused) {
            Logger.w(TAG, "maybe you need add Hianalytics sdk");
            this.hasHianalytics = false;
        }
    }

    public static HianalyticsHelper getInstance() {
        if (instance == null) {
            synchronized (HianalyticsHelper.class) {
                if (instance == null) {
                    instance = new HianalyticsHelper();
                }
            }
        }
        return instance;
    }

    public ExecutorService getReportExecutor() {
        return this.reportExecutor;
    }

    public boolean isEnableReport(Context context) {
        if (this.hasHianalytics) {
            return isEnableReportNoSeed(context);
        }
        return false;
    }

    public boolean isEnableReportNoSeed(Context context) {
        String str;
        String str2;
        if (!this.hasHianalytics) {
            str = TAG;
            str2 = "Hianalytics sdk need to be initialized";
        } else if (context == null) {
            str = TAG;
            str2 = "HianalyticsHelper context can't be null";
        } else if (Settings.Secure.getInt(context.getContentResolver(), USER_EXPERIENCE_INVOLVED, -1) == 1) {
            if (HiAnalytics.getInitFlag()) {
                return true;
            }
            if (this.hInstance == null) {
                this.hInstance = HiAnalyticsManager.getInstanceByTag(this.haTag);
            }
            return this.hInstance != null;
        } else {
            str = TAG;
            str2 = "user experience involved needs to be opened";
        }
        Logger.i(str, str2);
        return false;
    }

    public void onEvent(LinkedHashMap<String, String> linkedHashMap) {
        onEvent(linkedHashMap, EVENT_ID);
    }

    public void onEvent(LinkedHashMap<String, String> linkedHashMap, String str) {
        if (this.hasHianalytics && linkedHashMap != null) {
            Logger.v(TAG, "data = %s", linkedHashMap);
            if (HiAnalytics.getInitFlag()) {
                HiAnalytics.onEvent(1, str, linkedHashMap);
                return;
            }
            HiAnalyticsInstance hiAnalyticsInstance = this.hInstance;
            if (hiAnalyticsInstance != null) {
                hiAnalyticsInstance.onEvent(1, str, linkedHashMap);
            }
        }
    }

    public void reportException(final Throwable th, final String str) {
        final String name = Thread.currentThread().getName();
        try {
            this.reportExecutor.submit(new Runnable() { // from class: com.huawei.hms.framework.common.hianalytics.HianalyticsHelper.1
                @Override // java.lang.Runnable
                public void run() {
                    CrashHianalyticsData crashHianalyticsData = new CrashHianalyticsData();
                    crashHianalyticsData.put("thread_name", name);
                    crashHianalyticsData.put(CrashHianalyticsData.EXCEPTION_NAME, th.getClass().getName());
                    crashHianalyticsData.put("message", StringUtils.anonymizeMessage(th.getMessage()));
                    crashHianalyticsData.put(CrashHianalyticsData.STACK_TRACE, StringUtils.getTraceInfo(th));
                    HianalyticsHelper.getInstance().onEvent(crashHianalyticsData.get(), str);
                }
            });
        } catch (RejectedExecutionException unused) {
            Logger.i(TAG, "reportException error RejectedExecutionException");
        } catch (Exception unused2) {
            Logger.i(TAG, "reportException error!", th);
        }
    }

    public void setHaTag(String str) {
        this.haTag = str;
    }
}
