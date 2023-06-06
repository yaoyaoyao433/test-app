package com.meituan.metrics.traffic;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.CatchException;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.metricx.config.MetricXConfigBean;
import com.meituan.android.common.metricx.config.MetricXConfigManager;
import com.meituan.android.common.metricx.helpers.AppBus;
import com.meituan.android.common.metricx.utils.ILogger;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.android.common.metricx.utils.StoreUtils;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.net.report.MetricsReportManager;
import com.meituan.metrics.traffic.TrafficSysManager;
import com.meituan.metrics.traffic.trace.CronetSummaryTrafficTrace;
import com.meituan.metrics.traffic.trace.DaxiangSummaryTrafficTrace;
import com.meituan.metrics.traffic.trace.DownloadManagerSummaryTrafficTrace;
import com.meituan.metrics.traffic.trace.MTLiveSummaryTrafficTrace;
import com.meituan.metrics.traffic.trace.NativeHostDetailTrafficTrace;
import com.meituan.metrics.traffic.trace.PageTrafficTrace;
import com.meituan.metrics.traffic.trace.PikeSummaryTrafficTrace;
import com.meituan.metrics.traffic.trace.SharkSummaryTrafficTrace;
import com.meituan.metrics.traffic.trace.SysSummaryTrafficTrace;
import com.meituan.metrics.traffic.trace.URIDetailTrafficTrace;
import com.meituan.metrics.util.BasicTrafficUnit;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class TrafficTraceMainManager implements MetricXConfigManager.ConfigChangedListener, AppBus.OnBackgroundListener, TrafficSysManager.ISysTrafficListener {
    private static volatile long COLLECT_THRESHOLD = -1;
    private static volatile long P0_ALARM_THRESHOLD = -1;
    private static volatile long P1_ALARM_THRESHOLD = -1;
    private static final long SAVE_TRACE_DELAY = 10000;
    private static final long SAVE_TRACE_INTERVAL = 30000;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static volatile boolean isInit = false;
    private static volatile boolean isP0Alarmed = false;
    private static volatile boolean isP1Alarmed = false;
    private static volatile boolean isTraceActivated = false;
    private final Runnable saveTraceTask;
    private static final ConcurrentHashMap<String, TrafficTrace> trafficTraceMap = new ConcurrentHashMap<>();
    private static final TrafficTraceMainManager sInstance = new TrafficTraceMainManager();
    private static final String TAG = "TrafficTraceManager";
    private static final CatchException catchException = new CatchException(TAG, 1, 300000);

    public TrafficTraceMainManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80b3c4cfd3a0eabdb9a574f61d919f3e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80b3c4cfd3a0eabdb9a574f61d919f3e");
        } else {
            this.saveTraceTask = new Runnable() { // from class: com.meituan.metrics.traffic.TrafficTraceMainManager.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "aac0ea34e671642899635e41f2817827", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "aac0ea34e671642899635e41f2817827");
                    } else {
                        TrafficTraceUtil.saveTrace(TrafficTraceMainManager.trafficTraceMap);
                    }
                }
            };
        }
    }

    public static TrafficTraceMainManager getInstance() {
        return sInstance;
    }

    public void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "209870570679092b37a49d49392716dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "209870570679092b37a49d49392716dc");
            return;
        }
        String currentSysDate = TimeUtil.currentSysDate();
        isP0Alarmed = TrafficTraceUtil.checkTraceType(Constants.TRACE_TYPE_P0, currentSysDate);
        isP1Alarmed = TrafficTraceUtil.checkTraceType(Constants.TRACE_TYPE_P1, currentSysDate);
        if (isP0Alarmed) {
            return;
        }
        trafficTraceMap.put(Constants.TRACE_SYS, new SysSummaryTrafficTrace());
        trafficTraceMap.put(Constants.TRACE_PAGE, new PageTrafficTrace());
        trafficTraceMap.put(Constants.TRACE_URI, new URIDetailTrafficTrace());
        trafficTraceMap.put(Constants.TRACE_NATIVE, new NativeHostDetailTrafficTrace());
        trafficTraceMap.put(Constants.TRACE_SHARK, new SharkSummaryTrafficTrace());
        trafficTraceMap.put(Constants.TRACE_DAXIANG, new DaxiangSummaryTrafficTrace());
        trafficTraceMap.put(Constants.TRACE_MTLIVE, new MTLiveSummaryTrafficTrace());
        trafficTraceMap.put(Constants.TRACE_PIKE, new PikeSummaryTrafficTrace());
        trafficTraceMap.put(Constants.TRACE_CRONET, new CronetSummaryTrafficTrace());
        trafficTraceMap.put("downloadManager", new DownloadManagerSummaryTrafficTrace());
        isInit = true;
        TrafficListenerProxy.getInstance().register(this);
        MetricXConfigManager.getInstance().register(this);
    }

    public void addTrace(TrafficTrace trafficTrace) {
        Object[] objArr = {trafficTrace};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92011a4912715b7f7e8483c993d46240", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92011a4912715b7f7e8483c993d46240");
        } else {
            trafficTraceMap.put(trafficTrace.getName(), trafficTrace);
        }
    }

    public void setTraceEnable(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4f8cf71d4c15541f386717aa631c88a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4f8cf71d4c15541f386717aa631c88a");
        } else if (trafficTraceMap.containsKey(str)) {
            trafficTraceMap.get(str).setEnable(z);
        } else {
            ILogger metricxLogger = Logger.getMetricxLogger();
            metricxLogger.e("Trace " + str + " doesn't exist!");
        }
    }

    private void handleTracePipeline(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1874012e7a0ec86b581aa207503ae17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1874012e7a0ec86b581aa207503ae17");
            return;
        }
        long j3 = j + j2;
        String currentSysDate = TimeUtil.currentSysDate();
        if (j3 > COLLECT_THRESHOLD && COLLECT_THRESHOLD >= 0 && !isTraceActivated) {
            TrafficTraceUtil.markTraceType(Constants.TRACE_TYPE_COLLECT, currentSysDate);
            TrafficTraceUtil.activateTrace(trafficTraceMap, true);
            isTraceActivated = true;
            MetricsTrafficManager.TrafficHandler.scheduleAtFixedRate(this.saveTraceTask, 10000L, 30000L, "triggerSaveTraceOnMainWhenInit");
            AppBus.getInstance().register((AppBus.OnBackgroundListener) this, false);
        }
        if (j3 > P1_ALARM_THRESHOLD && P1_ALARM_THRESHOLD >= 0 && !isP1Alarmed) {
            isP1Alarmed = true;
            TrafficTraceUtil.saveTrace(trafficTraceMap);
            reportTraceOnMainProcess(Constants.TRACE_TYPE_P1, currentSysDate, j, j2);
        }
        if (j3 <= P0_ALARM_THRESHOLD || P0_ALARM_THRESHOLD < 0 || isP0Alarmed) {
            return;
        }
        isP0Alarmed = true;
        TrafficTraceUtil.saveTrace(trafficTraceMap);
        reportTraceOnMainProcess(Constants.TRACE_TYPE_P0, currentSysDate, j, j2);
        TrafficTraceUtil.clearTrafficTrace(trafficTraceMap, TimeUtil.currentSysDate(), true);
        TrafficListenerProxy.getInstance().unregister(this);
        AppBus.getInstance().unregister(this);
        MetricsTrafficManager.TrafficHandler.removeCallbacks(this.saveTraceTask);
    }

    public void reportTraceOnMainProcess(String str, String str2, long j, long j2) {
        Object[] objArr = {str, str2, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc8c391849fd64e4cdbd474f5d683a01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc8c391849fd64e4cdbd474f5d683a01");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        TrafficDispatcher trafficDispatcher = Metrics.getInstance().getAppConfig().getTrafficDispatcher();
        for (TrafficTrace trafficTrace : trafficTraceMap.values()) {
            try {
                jSONObject.put(trafficTrace.getName(), trafficTrace.fetchTraceForReport(str2, trafficDispatcher));
            } catch (Throwable th) {
                catchException.reportException(th);
            }
        }
        String str3 = TrafficTraceUtil.checkTraceType(Constants.TRACE_TYPE_P2, str2) ? Constants.TRACE_TYPE_P2 : str;
        long j3 = j + j2;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("traceType", str3);
            hashMap.put("trace", jSONObject.toString());
            hashMap.put("date", str2);
            hashMap.put("upStream", Long.valueOf(j2));
            hashMap.put("downStream", Long.valueOf(j));
            hashMap.put("total", Long.valueOf(j3));
            Log.Builder reportChannel = new Log.Builder("").optional(hashMap).lv4LocalStatus(true).reportChannel(MetricsReportManager.getInstance().getCategory());
            Babel.logRT(reportChannel.tag(Constants.TRAFFIC_TYPE_TRACE + str3).value(j3).build());
        } catch (Throwable th2) {
            catchException.reportException(th2);
        }
        TrafficTraceUtil.markTraceType(str, str2);
        if (!TextUtils.equals(Constants.TRACE_TYPE_TOTAL, str)) {
            reportBucket(Constants.TRAFFIC_TYPE_TRACE + str3, str2);
        }
        for (OnTraceReportListener onTraceReportListener : TrafficListenerProxy.getInstance().getTraceReportListeners()) {
            onTraceReportListener.onTraceReport(str2, str, j3, jSONObject);
        }
    }

    public void reportTotalIfNeed(String str, long j, long j2) {
        Object[] objArr = {str, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f29cb773c2665b66526792dd6608e4a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f29cb773c2665b66526792dd6608e4a8");
            return;
        }
        long j3 = j2 + j;
        if ((P1_ALARM_THRESHOLD < 0 || j3 < P1_ALARM_THRESHOLD || TrafficTraceUtil.checkTraceType(Constants.TRACE_TYPE_P1, str)) && (P0_ALARM_THRESHOLD < 0 || j3 < P0_ALARM_THRESHOLD || TrafficTraceUtil.checkTraceType(Constants.TRACE_TYPE_P0, str))) {
            return;
        }
        reportTraceOnMainProcess("mobile.traffic.trace.Total", str, j2, j);
    }

    public void clearTraceStorage(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9121a636a567cc0163ba99cfed0be15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9121a636a567cc0163ba99cfed0be15");
            return;
        }
        for (TrafficTrace trafficTrace : trafficTraceMap.values()) {
            trafficTrace.clearTraceStorage(str);
        }
        Context context = Metrics.getInstance().getContext();
        String str2 = TrafficTraceUtil.CIPS_TRACE_CONFIG_PREFIX + str;
        StoreUtils.removeCIPStorageObject(q.a(context, str2, 2), context, str2);
    }

    @Override // com.meituan.metrics.traffic.TrafficSysManager.ISysTrafficListener
    public void onSysTrafficChanged(BasicTrafficUnit basicTrafficUnit) {
        Object[] objArr = {basicTrafficUnit};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d140e7df99e64a204f310691827c4b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d140e7df99e64a204f310691827c4b6");
        } else if (isInit) {
            handleTracePipeline(basicTrafficUnit.rxBytes, basicTrafficUnit.txBytes);
        }
    }

    @Override // com.meituan.android.common.metricx.config.MetricXConfigManager.ConfigChangedListener
    public void onConfigChanged(@NonNull MetricXConfigBean metricXConfigBean) {
        Object[] objArr = {metricXConfigBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e89f6faa4d32d3fb07a33567da9f53e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e89f6faa4d32d3fb07a33567da9f53e");
            return;
        }
        COLLECT_THRESHOLD = metricXConfigBean.traffic_collect_threshold;
        P1_ALARM_THRESHOLD = metricXConfigBean.traffic_p1_alarm_threshold;
        P0_ALARM_THRESHOLD = metricXConfigBean.traffic_p0_alarm_threshold;
        String currentSysDate = TimeUtil.currentSysDate();
        if (!TrafficTraceUtil.checkTraceType(Constants.TRACE_TYPE_P0, currentSysDate) && TrafficTraceUtil.checkTraceType(Constants.TRACE_TYPE_COLLECT, currentSysDate) && COLLECT_THRESHOLD >= 0 && !isTraceActivated) {
            MetricsTrafficManager.TrafficHandler.post(new Runnable() { // from class: com.meituan.metrics.traffic.TrafficTraceMainManager.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "27f383da028c04a70f911cef8b755c4c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "27f383da028c04a70f911cef8b755c4c");
                    } else if (TrafficTraceMainManager.isTraceActivated) {
                    } else {
                        TrafficTraceUtil.activateTrace(TrafficTraceMainManager.trafficTraceMap, true);
                        boolean unused = TrafficTraceMainManager.isTraceActivated = true;
                        MetricsTrafficManager.TrafficHandler.scheduleAtFixedRate(TrafficTraceMainManager.this.saveTraceTask, 10000L, 30000L, "triggerSaveTraceOnMainWhenConfigChanged");
                        AppBus.getInstance().register((AppBus.OnBackgroundListener) TrafficTraceMainManager.sInstance, false);
                    }
                }
            }, "activateTraceOnMainOnConfigChanged");
        }
    }

    @Override // com.meituan.android.common.metricx.helpers.AppBus.OnBackgroundListener
    public void onBackground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47995bbbfadb23885a72ff506b248065", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47995bbbfadb23885a72ff506b248065");
        } else if (isInit) {
            MetricsTrafficManager.TrafficHandler.post(this.saveTraceTask, "triggerSaveTraceOnMainWhenBackground");
        }
    }

    public void reportBucket(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79ff692cc5a623f9beddd78cf73e732d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79ff692cc5a623f9beddd78cf73e732d");
            return;
        }
        q a = q.a(Metrics.getInstance().getContext(), SystemTrafficProvider.CIPS_CH_SYS_TRAFFIC + str2, 1);
        String b = a.b("systraffic_bucket", "");
        long b2 = a.b("systraffic_beginTs", -1L);
        HashMap hashMap = new HashMap();
        hashMap.put("lastBucketMap", b);
        hashMap.put("lastTodayBeginTs", Long.valueOf(b2));
        hashMap.put("metricsType", str);
        hashMap.put("date", str2);
        Babel.logRT(new Log.Builder("").optional(hashMap).tag("trafficVerification").generalChannelStatus(true).build());
    }
}
