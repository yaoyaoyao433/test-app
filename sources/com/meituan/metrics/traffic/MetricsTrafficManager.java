package com.meituan.metrics.traffic;

import android.content.Context;
import android.os.Build;
import android.support.annotation.CheckResult;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Pair;
import com.dianping.titans.utils.Constants;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.metricx.helpers.AppBus;
import com.meituan.android.common.metricx.helpers.SysDateAlarm;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.android.common.metricx.utils.StoreUtils;
import com.meituan.android.common.metricx.utils.WebViewUtils;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.cache.MetricsCacheManager;
import com.meituan.metrics.config.MetricsConfig;
import com.meituan.metrics.config.MetricsRemoteConfigManager;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.metrics.traffic.report.DataUtils;
import com.meituan.metrics.traffic.trace.MTWebviewSummaryTrafficTrace;
import com.meituan.metrics.util.BasicTrafficUnit;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.meituan.retrofit2.ext.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MetricsTrafficManager implements AppBus.OnBackgroundListener, SysDateAlarm.Alarm {
    private static final long CLEAN_UP_TIMEOUT = 1800000;
    public static final int MTWEBVIEW_SUCCESS_CODE = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile MetricsTrafficManager sInstance;
    private Runnable cleanUpTimeoutRequestRecords;
    private volatile AtomicBoolean init;
    private final MTWebviewSummaryTrafficTrace mtWebviewSummaryTrafficTrace;
    private final ConcurrentHashMap<Integer, TrafficRecord> trafficRecords;
    private static final AtomicInteger idGenerator = new AtomicInteger(0);
    public static final TrafficRecordProcessHandler TrafficHandler = new TrafficRecordProcessHandler(c.c("metrics-traffic"));

    public MetricsTrafficManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8825d1551cd59602d840c97d3829134b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8825d1551cd59602d840c97d3829134b");
            return;
        }
        this.trafficRecords = new ConcurrentHashMap<>();
        this.init = new AtomicBoolean(false);
        this.mtWebviewSummaryTrafficTrace = new MTWebviewSummaryTrafficTrace();
        this.cleanUpTimeoutRequestRecords = new Runnable() { // from class: com.meituan.metrics.traffic.MetricsTrafficManager.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "75d2b054fdb90234f3cf0c97be6f0ef6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "75d2b054fdb90234f3cf0c97be6f0ef6");
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                for (Integer num : MetricsTrafficManager.this.trafficRecords.keySet()) {
                    TrafficRecord trafficRecord = (TrafficRecord) MetricsTrafficManager.this.trafficRecords.get(num);
                    if (trafficRecord != null && currentTimeMillis - trafficRecord.startTime >= 1800000) {
                        arrayList.add(num);
                        if (MetricsTrafficManager.this.init.get() && trafficRecord.requestBodySize + trafficRecord.requestHeaderSize > 0) {
                            TrafficInterceptedManager.getInstance().handleNewRecord(Metrics.getInstance().getContext(), trafficRecord, 1000);
                        }
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    MetricsTrafficManager.this.trafficRecords.remove((Integer) it.next());
                }
            }
        };
    }

    public void init(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a204a4fb1878fdd909f9dd2a2bc35e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a204a4fb1878fdd909f9dd2a2bc35e9");
            return;
        }
        TrafficHandler.postDelayed(this.cleanUpTimeoutRequestRecords, 1800000L, "cleanUpTimeOutRequestRecordsWhenInit");
        if (MetricsRemoteConfigManager.getInstance().isTrafficEnable()) {
            if (ProcessUtils.isMainProcess(context)) {
                TrafficSysManager.getInstance().init(context);
                TrafficTraceMainManager.getInstance().addTrace(this.mtWebviewSummaryTrafficTrace);
                TrafficTraceMainManager.getInstance().init();
                TrafficTraceMainManager.getInstance().addTrace(this.mtWebviewSummaryTrafficTrace);
            } else {
                TrafficTraceSubManager.getInstance().addTrace(this.mtWebviewSummaryTrafficTrace);
                TrafficTraceSubManager.getInstance().init();
                TrafficTraceSubManager.getInstance().addTrace(this.mtWebviewSummaryTrafficTrace);
            }
            this.init.compareAndSet(false, true);
            AppBus.getInstance().register((AppBus.OnBackgroundListener) this, false);
            SysDateAlarm.getInstance().registerListener(this);
        }
    }

    @CheckResult
    @Nullable
    public BasicTrafficUnit getTodayTotalTraffic() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7ca42ba4d42c2831229d975af18e734", RobustBitConfig.DEFAULT_VALUE) ? (BasicTrafficUnit) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7ca42ba4d42c2831229d975af18e734") : TrafficSysManager.getInstance().getTodayIncreaseTraffic();
    }

    public static MetricsTrafficManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c86879341c47eb75dd4d131de6be68f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (MetricsTrafficManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c86879341c47eb75dd4d131de6be68f7");
        }
        if (sInstance == null) {
            synchronized (MetricsTrafficManager.class) {
                if (sInstance == null) {
                    sInstance = new MetricsTrafficManager();
                }
            }
        }
        return sInstance;
    }

    public int getNextRequestId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df8c9e65406189cfa831ce4b70f62be5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df8c9e65406189cfa831ce4b70f62be5")).intValue() : idGenerator.incrementAndGet();
    }

    public void onPreRequest(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e36ae7c5910a1e6dd3533313079f4878", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e36ae7c5910a1e6dd3533313079f4878");
        } else if (MetricsRemoteConfigManager.getInstance().isTrafficEnable()) {
            this.trafficRecords.put(Integer.valueOf(i), new TrafficRecord(str));
        }
    }

    public void onRequest(int i, String str, Map<String, List<String>> map) {
        Object[] objArr = {Integer.valueOf(i), str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b719024214353f30149c2dc89bebfaa8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b719024214353f30149c2dc89bebfaa8");
            return;
        }
        TrafficRecord trafficRecord = this.trafficRecords.get(Integer.valueOf(i));
        if (trafficRecord == null) {
            return;
        }
        trafficRecord.setRequestHeaders(str, map);
        TrafficHandler.sendMsg(1003, trafficRecord);
    }

    public void onPostRequest(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ad061280be68fb4690aeb006ec32961", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ad061280be68fb4690aeb006ec32961");
            return;
        }
        TrafficRecord trafficRecord = this.trafficRecords.get(Integer.valueOf(i));
        if (trafficRecord == null) {
            return;
        }
        trafficRecord.setRequestBodySize(Math.max(0L, j));
    }

    public void onResponse(int i, int i2, String str, Map<String, List<String>> map) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56c72c18f8717206501ed6dca8bc18fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56c72c18f8717206501ed6dca8bc18fa");
            return;
        }
        TrafficRecord trafficRecord = this.trafficRecords.get(Integer.valueOf(i));
        if (trafficRecord == null) {
            return;
        }
        if (trafficRecord.type == -1) {
            trafficRecord.type = getTrafficType(trafficRecord.url, map);
        }
        if (trafficRecord.detail != null && trafficRecord.detail.elapsedTime < 0) {
            trafficRecord.detail.startTime = trafficRecord.startTime;
            trafficRecord.detail.endTime = System.currentTimeMillis();
            trafficRecord.detail.elapsedTime = trafficRecord.detail.endTime - trafficRecord.detail.startTime;
        }
        trafficRecord.setResponseCode(i2);
        trafficRecord.setResponseHeaders(str, map);
        if (i2 != 200) {
            onRequestFailed(i, null);
        }
    }

    public void onResponseBody(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f641cc369b3d3b7251a248e469582ad3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f641cc369b3d3b7251a248e469582ad3");
            return;
        }
        TrafficRecord trafficRecord = this.trafficRecords.get(Integer.valueOf(i));
        if (trafficRecord == null) {
            return;
        }
        trafficRecord.setResponseBodySize(Math.max(0L, j));
    }

    private int getTrafficType(String str, Map<String, List<String>> map) {
        List<String> list;
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "068c70a002db23ab9982e34da114d786", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "068c70a002db23ab9982e34da114d786")).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        MetricsConfig appConfig = Metrics.getInstance().getAppConfig();
        if (appConfig == null) {
            return 3;
        }
        if (safeMatch(appConfig.getTrafficWebUrlPattern(), str)) {
            String str2 = null;
            if (map != null && (list = map.get("Content-Type")) != null && list.size() > 0) {
                str2 = list.get(0);
            }
            if (!TextUtils.isEmpty(str2) && (str2.contains("text/css") || str2.contains(Constants.MIME_TYPE_HTML) || str2.contains("application/x-javascript") || str2.contains("application/javascript"))) {
                return 1;
            }
        }
        if (safeMatch(appConfig.getTrafficApiUrlPattern(), str)) {
            return 0;
        }
        return safeMatch(appConfig.getTrafficResUrlPattern(), str) ? 2 : 3;
    }

    public void onRequestFinished(int i) {
        boolean z = true;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15de955ae472717fc3dc5e893e048c88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15de955ae472717fc3dc5e893e048c88");
            return;
        }
        TrafficRecord trafficRecord = this.trafficRecords.get(Integer.valueOf(i));
        if (trafficRecord == null) {
            return;
        }
        this.trafficRecords.remove(Integer.valueOf(i));
        if (Metrics.getInstance().getAppConfig().isTrafficStatDisabled()) {
            return;
        }
        trafficRecord.endTime = System.currentTimeMillis();
        trafficRecord.duration = trafficRecord.endTime - trafficRecord.startTime;
        boolean z2 = trafficRecord.detail != null;
        if (trafficRecord.detail != null && !trafficRecord.detail.needReportTraffic) {
            z = false;
        }
        if (z2) {
            long delayTime = DataUtils.getDelayTime(trafficRecord.detail);
            if (delayTime > 0) {
                TrafficHandler.postDelayed(1002, trafficRecord, delayTime, "recordDetailOnRequestFinishWithDelay");
            } else {
                TrafficHandler.sendMsg(1002, trafficRecord);
            }
        }
        if (z) {
            TrafficHandler.sendMsg(1000, trafficRecord);
            for (MetricsNetworkInterceptor metricsNetworkInterceptor : TrafficListenerProxy.getInstance().getNetworkInterceptors()) {
                metricsNetworkInterceptor.onNetworkTraffic(trafficRecord);
            }
        }
    }

    public void onRequestFailed(int i, Throwable th) {
        boolean z = false;
        Object[] objArr = {Integer.valueOf(i), th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0dd7a028250620a0e1330a214ac2c3b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0dd7a028250620a0e1330a214ac2c3b4");
            return;
        }
        TrafficRecord remove = this.trafficRecords.remove(Integer.valueOf(i));
        if (remove != null) {
            boolean z2 = remove.detail != null;
            z = (remove.detail == null || remove.detail.needReportTraffic) ? true : true;
            if (z2) {
                if (remove.detail != null && remove.detail.elapsedTime < 0) {
                    remove.detail.startTime = remove.startTime;
                    remove.detail.endTime = System.currentTimeMillis();
                    remove.detail.elapsedTime = remove.detail.endTime - remove.detail.startTime;
                }
                remove.detail.exception = th;
                long delayTime = DataUtils.getDelayTime(remove.detail);
                if (delayTime > 0) {
                    TrafficHandler.postDelayed(1002, remove, delayTime, "recordDetailOnRequestFailWithDelay");
                } else {
                    TrafficHandler.sendMsg(1002, remove);
                }
            }
            if (z) {
                TrafficHandler.sendMsg(1000, remove);
            }
        }
    }

    public void setDetail(int i, TrafficRecord.Detail detail) {
        Object[] objArr = {Integer.valueOf(i), detail};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af8397bc6177d3a5c0d2d16668a15071", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af8397bc6177d3a5c0d2d16668a15071");
            return;
        }
        TrafficRecord trafficRecord = this.trafficRecords.get(Integer.valueOf(i));
        if (trafficRecord == null) {
            return;
        }
        trafficRecord.setDetail(detail);
        if (detail == null || !DataUtils.isSupportRetrofit()) {
            return;
        }
        detail.responseExt = b.b();
    }

    public TrafficRecord getRecord(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2423c1fa709633600e2cac1f2619410a", RobustBitConfig.DEFAULT_VALUE) ? (TrafficRecord) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2423c1fa709633600e2cac1f2619410a") : this.trafficRecords.get(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportTotalTraffic(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35787598f8d21b1dcd17309a85d16837", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35787598f8d21b1dcd17309a85d16837");
            return;
        }
        HashMap<String, Long> hashMap = new HashMap<>();
        Context context = Metrics.getInstance().getContext();
        reportMonitorInfo(context, str);
        TrafficTraceMainManager.getInstance().reportBucket(com.meituan.metrics.common.Constants.TRAFFIC_DAILY_TOTAL_STREAM, str);
        Pair<Long, Long> fetchSysTrafficForReport = TrafficSysManager.getInstance().fetchSysTrafficForReport(str, hashMap, context);
        TrafficInterceptedManager.getInstance().fetchInterceptedTrafficForReport(str, hashMap, context);
        if (hashMap.size() == 0) {
            return;
        }
        TrafficEvent trafficEvent = new TrafficEvent(hashMap, str);
        calCoverage(hashMap, trafficEvent);
        trafficEvent.webviewPackageName = WebViewUtils.getChromePackageName(context);
        trafficEvent.webviewVersion = WebViewUtils.getChromeWebviewVersion(context);
        MetricsCacheManager.getInstance().addToCache(trafficEvent);
        TrafficTraceMainManager.getInstance().reportTotalIfNeed(str, ((Long) fetchSysTrafficForReport.first).longValue(), ((Long) fetchSysTrafficForReport.second).longValue());
        TrafficTraceMainManager.getInstance().clearTraceStorage(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void calCoverage(HashMap<String, Long> hashMap, TrafficEvent trafficEvent) {
        char c;
        Object[] objArr = {hashMap, trafficEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb9e8747dfa88f67c990310d8ce8a22a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb9e8747dfa88f67c990310d8ce8a22a");
            return;
        }
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        for (Map.Entry<String, Long> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            Long value = entry.getValue();
            switch (key.hashCode()) {
                case -2067895157:
                    if (key.equals(com.meituan.metrics.common.Constants.TRAFFIC_DAILY_OTHER_UPSTREAM)) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1802728745:
                    if (key.equals(com.meituan.metrics.common.Constants.TRAFFIC_DAILY_TOTAL_UPSTREAM)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -429935278:
                    if (key.equals(com.meituan.metrics.common.Constants.TRAFFIC_DAILY_OTHER_DOWNSTREAM)) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -87037625:
                    if (key.equals(com.meituan.metrics.common.Constants.TRAFFIC_DAILY_WEB_UPSTREAM)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 157291015:
                    if (key.equals(com.meituan.metrics.common.Constants.TRAFFIC_DAILY_NATIVE_DOWNSTREAM)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 221786491:
                    if (key.equals(com.meituan.metrics.common.Constants.TRAFFIC_DAILY_RES_UPSTREAM)) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 423124070:
                    if (key.equals(com.meituan.metrics.common.Constants.TRAFFIC_DAILY_CUSTOM_UPSTREAM)) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 503640846:
                    if (key.equals(com.meituan.metrics.common.Constants.TRAFFIC_DAILY_WEB_DOWNSTREAM)) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 712141960:
                    if (key.equals(com.meituan.metrics.common.Constants.TRAFFIC_DAILY_API_DOWNSTREAM)) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 930872898:
                    if (key.equals(com.meituan.metrics.common.Constants.TRAFFIC_DAILY_RES_DOWNSTREAM)) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 991916190:
                    if (key.equals(com.meituan.metrics.common.Constants.TRAFFIC_DAILY_TOTAL_DOWNSTREAM)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1142757997:
                    if (key.equals(com.meituan.metrics.common.Constants.TRAFFIC_DAILY_CUSTOM_DOWNSTREAM)) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 1512600192:
                    if (key.equals(com.meituan.metrics.common.Constants.TRAFFIC_DAILY_NATIVE_UPSTREAM)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1700886849:
                    if (key.equals(com.meituan.metrics.common.Constants.TRAFFIC_DAILY_API_UPSTREAM)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    d = value.longValue();
                    break;
                case 1:
                    d2 = value.longValue();
                    break;
                case 2:
                    j3 = value.longValue();
                    break;
                case 3:
                    j4 = value.longValue();
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case '\b':
                    j2 += value.longValue();
                    break;
                case '\t':
                case '\n':
                case 11:
                case '\f':
                case '\r':
                    j += value.longValue();
                    break;
            }
        }
        if (d != 0.0d) {
            trafficEvent.upJavaCoverage = j2 / d;
            trafficEvent.upNativeCoverage = j4 / d;
        }
        if (d2 != 0.0d) {
            trafficEvent.downJavaCoverage = j / d2;
            trafficEvent.downNativeCoverage = j3 / d2;
        }
    }

    private void reportMonitorInfo(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60c9990d7e08f2adfac21e6e411133b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60c9990d7e08f2adfac21e6e411133b6");
        } else if (Build.VERSION.SDK_INT >= 28) {
            String str2 = SystemTrafficProviderV28Plus.CHANNEL_FAIL_COUNT_PREFIX + str;
            q a = q.a(context, str2, 2);
            int b = a.b(SystemTrafficProviderV28Plus.KEY_WIFI_FAIL_COUNT, 0);
            int b2 = a.b(SystemTrafficProviderV28Plus.KEY_MOBILE_FAIL_COUNT, 0);
            if (b == 0 && b2 == 0) {
                StoreUtils.removeCIPStorageObject(a, context, str2);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("date", str);
            if (b > 0) {
                int b3 = a.b(SystemTrafficProviderV28Plus.KEY_WIFI_TOTAl_COUNT, 0);
                boolean b4 = a.b(SystemTrafficProviderV28Plus.KEY_LAST_WIFI_FAIL, false);
                hashMap.put("wifiFailCount", Integer.valueOf(b));
                hashMap.put("wifiTotalCount", Integer.valueOf(b3));
                hashMap.put("wifiFailRatio", Double.valueOf(b / (b3 + 0.0d)));
                hashMap.put("lastWifiFail", Boolean.valueOf(b4));
            }
            if (b2 > 0) {
                int b5 = a.b(SystemTrafficProviderV28Plus.KEY_MOBILE_TOTAl_COUNT, 0);
                boolean b6 = a.b(SystemTrafficProviderV28Plus.KEY_LAST_MOBILE_FAIL, false);
                hashMap.put("mobileFailCount", Integer.valueOf(b2));
                hashMap.put("mobileTotalCount", Integer.valueOf(b5));
                hashMap.put("mobileFailRatio", Double.valueOf(b2 / (b5 + 0.0d)));
                hashMap.put("lastMobileFail", Boolean.valueOf(b6));
            }
            Babel.logRT(new Log.Builder("").optional(hashMap).generalChannelStatus(true).tag("sys26Fail").build());
            StoreUtils.removeCIPStorageObject(a, context, str2);
        }
    }

    @Override // com.meituan.android.common.metricx.helpers.AppBus.OnBackgroundListener
    public void onBackground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b96491c71537ccb683c49cd4ae21b26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b96491c71537ccb683c49cd4ae21b26");
            return;
        }
        TrafficHandler.removeCallbacks(this.cleanUpTimeoutRequestRecords);
        TrafficHandler.post(this.cleanUpTimeoutRequestRecords, " cleanUpTimeOutRequestRecordsOnBackground");
    }

    public void addCustomTraffic(TrafficRecord trafficRecord) {
        Object[] objArr = {trafficRecord};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1767ead54111cd348c01514374670b44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1767ead54111cd348c01514374670b44");
        } else if (this.init.get()) {
            trafficRecord.type = 5;
            TrafficHandler.sendMsg(1000, trafficRecord);
        }
    }

    public void onNativeNewTraffic(TrafficRecord trafficRecord) {
        Object[] objArr = {trafficRecord};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "55c4e18e09379a67dfc318b99df871a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "55c4e18e09379a67dfc318b99df871a1");
        } else {
            TrafficHandler.sendMsg(1001, trafficRecord);
        }
    }

    private boolean safeMatch(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c68c3ecae7df0c2d278247805807267", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c68c3ecae7df0c2d278247805807267")).booleanValue();
        }
        try {
            return Pattern.matches(str, str2);
        } catch (Throwable th) {
            Logger.getMetricsLogger().e(th.getLocalizedMessage());
            return false;
        }
    }

    public static void reportTodayTraceAsync() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "277fcd345bb23621897717333de3f6cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "277fcd345bb23621897717333de3f6cc");
        } else {
            TrafficHandler.post(new Runnable() { // from class: com.meituan.metrics.traffic.MetricsTrafficManager.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5abfb4975563d5263c590ccdda8dc9fe", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5abfb4975563d5263c590ccdda8dc9fe");
                        return;
                    }
                    String currentSysDate = TimeUtil.currentSysDate();
                    BasicTrafficUnit todayTotalTraffic = MetricsTrafficManager.getInstance().getTodayTotalTraffic();
                    TrafficTraceMainManager.getInstance().reportTraceOnMainProcess(com.meituan.metrics.common.Constants.TRACE_TYPE_TOTAL, currentSysDate, todayTotalTraffic.rxBytes, todayTotalTraffic.txBytes);
                }
            }, "reportTodayTraceAsync");
        }
    }

    @Override // com.meituan.android.common.metricx.helpers.SysDateAlarm.Alarm
    public void onMainProcessNewDate(final String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b92ed08d3705e507897a2aec5b8cb17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b92ed08d3705e507897a2aec5b8cb17");
        } else if (this.init.get()) {
            TrafficHandler.post(new Runnable() { // from class: com.meituan.metrics.traffic.MetricsTrafficManager.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4facd7de79c4f3065770b4e8fb33d062", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4facd7de79c4f3065770b4e8fb33d062");
                    } else if (TextUtils.isEmpty(str)) {
                    } else {
                        MetricsTrafficManager.this.reportTotalTraffic(str);
                    }
                }
            }, "reportTotalTrafficOnNewDate");
        }
    }

    public boolean isMTWebviewTrafficEnable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ebf52416c13a2393f3ce3c7e8c67527f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ebf52416c13a2393f3ce3c7e8c67527f")).booleanValue() : this.mtWebviewSummaryTrafficTrace.isEnable();
    }

    public void onMTWebviewStatisticsStart(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c3eaf0192b1c18585fa17c9ac9f81c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c3eaf0192b1c18585fa17c9ac9f81c1");
        } else if (i != 0) {
            MTWebviewSummaryTrafficTrace mTWebviewSummaryTrafficTrace = this.mtWebviewSummaryTrafficTrace;
            mTWebviewSummaryTrafficTrace.reportError(i, "[start] " + str);
        }
    }

    public void onMTWebviewStatisticsEnd(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f13f444afe25ef67782023c044f3e2c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f13f444afe25ef67782023c044f3e2c9");
        } else if (i != 0) {
            MTWebviewSummaryTrafficTrace mTWebviewSummaryTrafficTrace = this.mtWebviewSummaryTrafficTrace;
            mTWebviewSummaryTrafficTrace.reportError(i, "[end] " + str);
        }
    }

    public void onMTWebviewReceiveValue(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a142e6ffe5f8147ea1a13b075d8d981", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a142e6ffe5f8147ea1a13b075d8d981");
        } else {
            TrafficHandler.post(new Runnable() { // from class: com.meituan.metrics.traffic.MetricsTrafficManager.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5360114a1fbed61a7924820e14926297", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5360114a1fbed61a7924820e14926297");
                    } else {
                        MetricsTrafficManager.this.mtWebviewSummaryTrafficTrace.onMTWebviewReceiveValue(str);
                    }
                }
            }, "onMTWebviewReceiveValue");
        }
    }
}
