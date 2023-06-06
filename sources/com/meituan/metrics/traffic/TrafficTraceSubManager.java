package com.meituan.metrics.traffic;

import com.meituan.android.common.metricx.helpers.AppBus;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.traffic.trace.CronetSummaryTrafficTrace;
import com.meituan.metrics.traffic.trace.DaxiangSummaryTrafficTrace;
import com.meituan.metrics.traffic.trace.MTLiveSummaryTrafficTrace;
import com.meituan.metrics.traffic.trace.NativeHostDetailTrafficTrace;
import com.meituan.metrics.traffic.trace.PikeSummaryTrafficTrace;
import com.meituan.metrics.traffic.trace.SharkSummaryTrafficTrace;
import com.meituan.metrics.traffic.trace.URIDetailTrafficTrace;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class TrafficTraceSubManager implements AppBus.OnBackgroundListener {
    private static final long HANDLE_TRACE_DELAY = 10000;
    private static final long HANDLE_TRACE_INTERVAL = 30000;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile boolean isInit;
    private static final TrafficTraceSubManager sInstance = new TrafficTraceSubManager();
    private static final ConcurrentHashMap<String, TrafficTrace> trafficTraceMap = new ConcurrentHashMap<>();
    private final Runnable handleTraceTask;
    private boolean isP0Alarmed;
    private boolean isTraceActivated;

    public TrafficTraceSubManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06718d7c94d9c2687fbd405c57b9b9f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06718d7c94d9c2687fbd405c57b9b9f6");
        } else {
            this.handleTraceTask = new Runnable() { // from class: com.meituan.metrics.traffic.TrafficTraceSubManager.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b643a5584d9f99f4de50103b6b4eb56e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b643a5584d9f99f4de50103b6b4eb56e");
                    } else {
                        TrafficTraceSubManager.this.handleTracePipeline();
                    }
                }
            };
        }
    }

    public static TrafficTraceSubManager getInstance() {
        return sInstance;
    }

    public void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77bfd219d9e2b0554af0f126f748da79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77bfd219d9e2b0554af0f126f748da79");
            return;
        }
        String currentSysDate = TimeUtil.currentSysDate();
        this.isP0Alarmed = TrafficTraceUtil.checkTraceType(Constants.TRACE_TYPE_P0, currentSysDate);
        if (this.isP0Alarmed) {
            return;
        }
        trafficTraceMap.put(Constants.TRACE_URI, new URIDetailTrafficTrace());
        trafficTraceMap.put(Constants.TRACE_NATIVE, new NativeHostDetailTrafficTrace());
        trafficTraceMap.put(Constants.TRACE_SHARK, new SharkSummaryTrafficTrace());
        trafficTraceMap.put(Constants.TRACE_DAXIANG, new DaxiangSummaryTrafficTrace());
        trafficTraceMap.put(Constants.TRACE_MTLIVE, new MTLiveSummaryTrafficTrace());
        trafficTraceMap.put(Constants.TRACE_PIKE, new PikeSummaryTrafficTrace());
        trafficTraceMap.put(Constants.TRACE_CRONET, new CronetSummaryTrafficTrace());
        this.isTraceActivated = TrafficTraceUtil.checkTraceType(Constants.TRACE_TYPE_COLLECT, currentSysDate);
        if (this.isTraceActivated) {
            MetricsTrafficManager.TrafficHandler.post(new Runnable() { // from class: com.meituan.metrics.traffic.TrafficTraceSubManager.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6c35d02a61250113c9740a3d7dd3527f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6c35d02a61250113c9740a3d7dd3527f");
                        return;
                    }
                    TrafficTraceUtil.activateTrace(TrafficTraceSubManager.trafficTraceMap, true);
                    AppBus.getInstance().register((AppBus.OnBackgroundListener) TrafficTraceSubManager.sInstance, false);
                }
            }, "activateTraceOnSubWhenInit");
        }
        MetricsTrafficManager.TrafficHandler.scheduleAtFixedRate(this.handleTraceTask, 10000L, 30000L, "triggerHandleTraceOnSubWhenInit");
        isInit = true;
    }

    public void addTrace(TrafficTrace trafficTrace) {
        Object[] objArr = {trafficTrace};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3131c0ab8b894cfb416dd015eddff8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3131c0ab8b894cfb416dd015eddff8e");
        } else {
            trafficTraceMap.put(trafficTrace.getName(), trafficTrace);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleTracePipeline() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e957dbad0c95011f88c250657ede96bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e957dbad0c95011f88c250657ede96bb");
            return;
        }
        String currentSysDate = TimeUtil.currentSysDate();
        this.isP0Alarmed = TrafficTraceUtil.checkTraceType(Constants.TRACE_TYPE_P0, currentSysDate);
        if (this.isP0Alarmed) {
            TrafficTraceUtil.clearTrafficTrace(trafficTraceMap, currentSysDate, false);
            AppBus.getInstance().unregister(this);
            MetricsTrafficManager.TrafficHandler.removeCallbacks(this.handleTraceTask);
        } else if (this.isTraceActivated) {
            TrafficTraceUtil.saveTrace(trafficTraceMap);
        } else {
            this.isTraceActivated = TrafficTraceUtil.checkTraceType(Constants.TRACE_TYPE_COLLECT, currentSysDate);
            if (this.isTraceActivated) {
                TrafficTraceUtil.activateTrace(trafficTraceMap, true);
            }
        }
    }

    @Override // com.meituan.android.common.metricx.helpers.AppBus.OnBackgroundListener
    public void onBackground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75bad46955ede7ed568654b3c4c4a8d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75bad46955ede7ed568654b3c4c4a8d5");
        } else if (isInit) {
            MetricsTrafficManager.TrafficHandler.post(new Runnable() { // from class: com.meituan.metrics.traffic.TrafficTraceSubManager.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7d1aaf9836dd83f9e67ad6b4d64a3695", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7d1aaf9836dd83f9e67ad6b4d64a3695");
                    } else {
                        TrafficTraceUtil.saveTrace(TrafficTraceSubManager.trafficTraceMap);
                    }
                }
            }, "triggerSaveTraceOnSubWhenBackground");
        }
    }
}
