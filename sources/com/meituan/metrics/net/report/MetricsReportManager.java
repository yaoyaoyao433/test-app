package com.meituan.metrics.net.report;

import android.content.Context;
import android.text.TextUtils;
import com.dianping.monitor.impl.a;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.KiteFly;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.kitefly.SLACounter;
import com.meituan.android.common.metricx.Internal;
import com.meituan.android.common.metricx.PreloadInjection;
import com.meituan.android.common.metricx.config.MetricXConfigManager;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.android.common.statistics.Constants;
import com.meituan.metrics.Environment;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.SeqIdFactory;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.model.AbstractEvent;
import com.meituan.metrics.model.ExitInfoEvent;
import com.meituan.metrics.sampler.cpu.CpuEvent;
import com.meituan.metrics.sampler.cpu.ProcessCpuEvent;
import com.meituan.metrics.sampler.fps.FpsEvent;
import com.meituan.metrics.sampler.memory.MemoryEvent;
import com.meituan.metrics.sampler.memory.ProcessMemoryEvent;
import com.meituan.metrics.speedmeter.SpeedMeterEvent;
import com.meituan.metrics.traffic.TrafficEvent;
import com.meituan.metrics.util.DeviceUtil;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.metrics.util.thread.Task;
import com.meituan.metrics.util.thread.ThreadManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.Message;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MetricsReportManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static MetricsReportManager sInstance;
    private String categoryStr;
    private boolean isStarted;
    private CatService mCatService;

    @Deprecated
    public void reportImmediately(String str) {
    }

    public static MetricsReportManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "012ec3d436a6dc293b884d31614c3858", RobustBitConfig.DEFAULT_VALUE)) {
            return (MetricsReportManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "012ec3d436a6dc293b884d31614c3858");
        }
        if (sInstance == null) {
            synchronized (MetricsReportManager.class) {
                if (sInstance == null) {
                    sInstance = new MetricsReportManager();
                }
            }
        }
        return sInstance;
    }

    public MetricsReportManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "899a9a52135613df2810928a12fab75a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "899a9a52135613df2810928a12fab75a");
        } else {
            this.categoryStr = "m2";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void reportByBabel(final AbstractEvent abstractEvent) {
        char c;
        Map<String, Object> details;
        HashMap hashMap;
        Object[] objArr = {abstractEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "666d63c131199f29cb929ac236769f79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "666d63c131199f29cb929ac236769f79");
            return;
        }
        Logger.getMetricsLogger().d("reportByBabel", abstractEvent);
        Environment environment = Metrics.getEnvironment();
        if (environment == null) {
            return;
        }
        String token = environment.getToken();
        String localEventType = abstractEvent.getLocalEventType();
        double metricValue = abstractEvent.getMetricValue();
        if (TextUtils.isEmpty(token) || TextUtils.isEmpty(localEventType) || metricValue <= 0.0d) {
            return;
        }
        HashMap hashMap2 = new HashMap();
        switch (localEventType.hashCode()) {
            case -1792322499:
                if (localEventType.equals(Constants.MEMORY_V2)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1312219555:
                if (localEventType.equals(Constants.CPU_PROCESS)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1225808762:
                if (localEventType.equals(Constants.FPS_PAGE_AVG)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1213322918:
                if (localEventType.equals(Constants.PAGE_LOAD_METER)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -824151218:
                if (localEventType.equals(Constants.CPU_V2)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -639047374:
                if (localEventType.equals(Constants.EXIT_INFO_TYPE)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -43454776:
                if (localEventType.equals(Constants.FPS_SCROLL_AVG)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 515410340:
                if (localEventType.equals(Constants.FPS_CUSTOM_AVG)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 660945209:
                if (localEventType.equals(Constants.COLD_LAUNCH_METER)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 735569964:
                if (localEventType.equals(Constants.MEMORY_PROCESS)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1174807922:
                if (localEventType.equals(Constants.TRAFFIC_DAILY_TOTAL_STREAM)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1189634760:
                if (localEventType.equals(Constants.FPS_SCROLL_AVG_N)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1874447228:
                if (localEventType.equals(Constants.CUSTOM_SPEED_METER)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2014164419:
                if (localEventType.equals(Constants.PAGE_LOAD_AUTO)) {
                    c = 7;
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
                hashMap2.put("source", Constants.METRICS);
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                hashMap2.put("pageName", abstractEvent.getPageName());
                break;
            case '\b':
            case '\t':
                hashMap2.put("key", abstractEvent.getPageName());
                break;
            case '\n':
                TrafficEvent trafficEvent = (TrafficEvent) abstractEvent;
                hashMap2.put("upJavaCoverage", Double.valueOf(trafficEvent.upJavaCoverage));
                hashMap2.put("upNativeCoverage", Double.valueOf(trafficEvent.upNativeCoverage));
                hashMap2.put("downJavaCoverage", Double.valueOf(trafficEvent.downJavaCoverage));
                hashMap2.put("downNativeCoverage", Double.valueOf(trafficEvent.downNativeCoverage));
                hashMap2.put("webviewName", trafficEvent.webviewPackageName);
                hashMap2.put("webviewVersion", trafficEvent.webviewVersion);
                break;
            case 11:
            case '\f':
            case '\r':
                break;
            default:
                return;
        }
        if (abstractEvent.optionTags != null) {
            hashMap2.putAll(abstractEvent.optionTags);
        }
        if (abstractEvent instanceof SpeedMeterEvent) {
            Map<String, Long> steps = ((SpeedMeterEvent) abstractEvent).getSteps();
            if (steps != null) {
                details = new HashMap<>(steps);
            }
            details = null;
        } else if (abstractEvent instanceof FpsEvent) {
            FpsEvent fpsEvent = (FpsEvent) abstractEvent;
            details = fpsEvent.getDetails();
            hashMap2.put("maxFrameCount", Integer.valueOf(fpsEvent.getMaxFrameCount()));
        } else {
            if (abstractEvent instanceof ProcessCpuEvent) {
                ProcessCpuEvent processCpuEvent = (ProcessCpuEvent) abstractEvent;
                hashMap2.put("processName", processCpuEvent.getProcessName());
                hashMap = new HashMap();
                hashMap.put(Constants.CPU_MAX_V2, Double.valueOf(processCpuEvent.getMaxAppCpuRate()));
            } else if (abstractEvent instanceof ProcessMemoryEvent) {
                ProcessMemoryEvent processMemoryEvent = (ProcessMemoryEvent) abstractEvent;
                details = processMemoryEvent.getDetails();
                hashMap2.put("dalvikMax", Integer.valueOf(processMemoryEvent.dalvikMax));
                hashMap2.put("processName", processMemoryEvent.getProcessName());
            } else if (abstractEvent instanceof MemoryEvent) {
                MemoryEvent memoryEvent = (MemoryEvent) abstractEvent;
                details = memoryEvent.getDetails();
                hashMap2.put("dalvikMax", Integer.valueOf(memoryEvent.dalvikMax));
            } else if (abstractEvent instanceof CpuEvent) {
                hashMap = new HashMap();
                hashMap.put(Constants.CPU_MAX_V2, Double.valueOf(((CpuEvent) abstractEvent).getMaxAppCpuRate()));
            } else if (abstractEvent instanceof TrafficEvent) {
                TrafficEvent trafficEvent2 = (TrafficEvent) abstractEvent;
                details = trafficEvent2.getDetails();
                hashMap2.put("date", trafficEvent2.getDate().replace(CommonConstant.Symbol.MINUS, "/"));
            } else {
                if (abstractEvent instanceof ExitInfoEvent) {
                    ((ExitInfoEvent) abstractEvent).convertToJson(hashMap2);
                }
                details = null;
            }
            details = hashMap;
        }
        if (!(abstractEvent instanceof TrafficEvent)) {
            if (abstractEvent.getPid() != -1) {
                hashMap2.put(com.dianping.titans.utils.Constants.MULTI_PROCESS_PID, Integer.valueOf(abstractEvent.getPid()));
            }
            hashMap2.put(Message.SID, abstractEvent.getSid());
            String session = environment.getSession();
            if (!TextUtils.isEmpty(session)) {
                hashMap2.put("lx_sid", session);
            }
        }
        SeqIdFactory.getInstance(Metrics.getInstance().getContext()).setSequenceId(localEventType, hashMap2);
        SLACounter.getInstance().incrementMetricsCount(1);
        hashMap2.put("metricsSdkVersion", environment.sdkVersion);
        hashMap2.put(Constants.Environment.KEY_CH, environment.getCh());
        if (MetricXConfigManager.metricXConfigBean != null) {
            hashMap2.put("trackMode", Integer.valueOf(MetricXConfigManager.metricXConfigBean.track_mode));
        }
        DeviceUtil.addDeviceInfo(hashMap2, null, Metrics.getInstance().getContext());
        PreloadInjection.appendTags(hashMap2);
        Logger.getMetricsLogger().d("Call Babel", token, localEventType, Double.valueOf(metricValue), details, abstractEvent.raw, hashMap2);
        KiteFly.logVIP(new Log.Builder("").tag(localEventType).value(metricValue).reportChannel(this.categoryStr).token(token).details(convertMap2str(details)).raw(abstractEvent.raw).optional(hashMap2).lv4LocalStatus(true).build(), 0);
        if (localEventType.equals(com.meituan.metrics.common.Constants.COLD_LAUNCH_METER)) {
            HashMap hashMap3 = new HashMap(hashMap2);
            hashMap3.put("report_type", com.meituan.metrics.common.Constants.COLD_LAUNCH_METER);
            hashMap3.put("metricsSdkVersion", environment.sdkVersion);
            hashMap3.put("appVersion", Internal.getAppEnvironment().getAppVersion());
            hashMap3.put("log_ts", Long.valueOf(TimeUtil.currentTimeMillisSNTP()));
            reportCat(hashMap3);
        }
        Metrics.getInstance().getInterceptorChain().onNewEvent(abstractEvent);
        ThreadManager.getInstance().postIO(new Task() { // from class: com.meituan.metrics.net.report.MetricsReportManager.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.metrics.util.thread.Task
            public void schedule() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e86bc1589903a50dc6b02b3ec1a571c5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e86bc1589903a50dc6b02b3ec1a571c5");
                } else {
                    Metrics.getInstance().getInterceptorChain().onReportEvent(abstractEvent);
                }
            }
        });
    }

    public void setCategory(String str) {
        this.categoryStr = str;
    }

    public String getCategory() {
        return this.categoryStr;
    }

    private static String convertMap2str(Map map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9fd0a05b74c868c4078c1e2bfede6053", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9fd0a05b74c868c4078c1e2bfede6053");
        }
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        }
        return jSONObject.toString();
    }

    private void reportCat(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "449bf1bc9e0c144abc9165daa54af97a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "449bf1bc9e0c144abc9165daa54af97a");
            return;
        }
        JSONObject jSONObject = null;
        try {
            jSONObject = new JSONObject(map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (jSONObject == null) {
            return;
        }
        if (this.mCatService == null) {
            this.mCatService = new CatService(Metrics.getInstance().getContext());
        }
        this.mCatService.pv4(0L, "bable_metrics_reporter_homepage", 0, 0, 0, 0, 0, 0, null, jSONObject.toString(), 100);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class CatService extends a {
        public static ChangeQuickRedirect changeQuickRedirect;

        public CatService(Context context) {
            super(context, 10);
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc3b774a467f599ecdb3ce7dae388306", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc3b774a467f599ecdb3ce7dae388306");
            }
        }

        @Override // com.dianping.monitor.impl.a
        public String getUnionid() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "869cc7cee963fc5902126373b227d925", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "869cc7cee963fc5902126373b227d925") : Babel.getBabelConfig().getUuid();
        }
    }
}
