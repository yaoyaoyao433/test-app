package com.meituan.metrics.traffic.trace;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.cipstorage.ag;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.traffic.TrafficDispatcher;
import com.meituan.metrics.traffic.TrafficListenerProxy;
import com.meituan.metrics.traffic.TrafficSysManager;
import com.meituan.metrics.traffic.TrafficTrace;
import com.meituan.metrics.util.BasicTrafficUnit;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NumberUtils;
import com.sankuai.common.utils.ProcessUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SysSummaryTrafficTrace extends TrafficTrace implements TrafficSysManager.ISysTrafficListener {
    private static final String STORAGE_PREFIX = "metrics_traffic_trace_";
    private static final long UPDATE_THRESHOLD = 62914560;
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int LRU_SIZE;
    private Gson gson;
    private long lastTotalTraffic;
    private final ag serializer;
    private LinkedList<HashMap<String, Long>> sysSummaryList;

    public SysSummaryTrafficTrace() {
        super(Constants.TRACE_SYS);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1aaed42304265c19ded8dd017f2839f7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1aaed42304265c19ded8dd017f2839f7");
            return;
        }
        this.sysSummaryList = new LinkedList<>();
        this.lastTotalTraffic = 0L;
        this.LRU_SIZE = 20;
        this.gson = new Gson();
        this.serializer = new ag() { // from class: com.meituan.metrics.traffic.trace.SysSummaryTrafficTrace.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.cipstorage.ag
            public Object deserializeFromString(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3f7a865a1aa9face7e0d451eac269634", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3f7a865a1aa9face7e0d451eac269634");
                }
                try {
                    return SysSummaryTrafficTrace.this.gson.fromJson(str, new TypeToken<LinkedList<HashMap<String, Object>>>() { // from class: com.meituan.metrics.traffic.trace.SysSummaryTrafficTrace.1.1
                        public static ChangeQuickRedirect changeQuickRedirect;
                    }.getType());
                } catch (Throwable th) {
                    Logger.getMetricxLogger().e(SysSummaryTrafficTrace.this.getName(), th);
                    return null;
                }
            }

            @Override // com.meituan.android.cipstorage.ag
            public String serializeAsString(Object obj) {
                Object[] objArr2 = {obj};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "81e7552f9dbdbe366fef16cee47a5f79", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "81e7552f9dbdbe366fef16cee47a5f79") : SysSummaryTrafficTrace.this.gson.toJson(obj);
            }
        };
    }

    @Override // com.meituan.metrics.Trace
    public void setEnable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1344f1d83186eb571f63c3e75a7fc88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1344f1d83186eb571f63c3e75a7fc88");
        } else if (ProcessUtils.isMainProcess(Metrics.getInstance().getContext())) {
            super.setEnable(z);
            if (z) {
                TrafficListenerProxy.getInstance().register(this);
            } else {
                TrafficListenerProxy.getInstance().unregister(this);
            }
        }
    }

    @Override // com.meituan.metrics.traffic.TrafficTrace, com.meituan.metrics.traffic.TrafficTraceHandler
    public void initTraceFromStorage() {
        LinkedList<HashMap<String, Long>> linkedList;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49a4730afca669c0dc977ece1a1072f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49a4730afca669c0dc977ece1a1072f9");
            return;
        }
        Context context = Metrics.getInstance().getContext();
        try {
            this.sysSummaryList = (LinkedList) q.a(context, STORAGE_PREFIX + getName(), 1).a(TimeUtil.currentSysDate(), this.serializer);
        } catch (Throwable th) {
            try {
                Logger.getMetricxLogger().e(getName(), th);
                if (this.sysSummaryList == null) {
                    linkedList = new LinkedList<>();
                }
            } catch (Throwable th2) {
                if (this.sysSummaryList == null) {
                    this.sysSummaryList = new LinkedList<>();
                }
                throw th2;
            }
        }
        if (this.sysSummaryList == null) {
            linkedList = new LinkedList<>();
            this.sysSummaryList = linkedList;
        }
        if (this.sysSummaryList.size() > 0) {
            this.lastTotalTraffic = NumberUtils.parseLong(String.valueOf(this.sysSummaryList.getLast().get("total")), 0L);
        }
    }

    @Override // com.meituan.metrics.traffic.TrafficTrace, com.meituan.metrics.traffic.TrafficTraceHandler
    public void saveTraceToStorage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f56fb469cefbda5fd89b7396c1441c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f56fb469cefbda5fd89b7396c1441c2");
        } else if (isEnable()) {
            Context context = Metrics.getInstance().getContext();
            q.a(context, STORAGE_PREFIX + getName(), 1).a(TimeUtil.currentSysDate(), (String) this.sysSummaryList, (ag<String>) this.serializer);
        }
    }

    @Override // com.meituan.metrics.traffic.TrafficTrace, com.meituan.metrics.traffic.TrafficTraceHandler
    public Object fetchTraceForReport(String str, TrafficDispatcher trafficDispatcher) {
        JSONArray jSONArray;
        Object[] objArr = {str, trafficDispatcher};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e57715aa3589c709b8d75fc5c4d5583", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e57715aa3589c709b8d75fc5c4d5583");
        }
        Context context = Metrics.getInstance().getContext();
        try {
            jSONArray = new JSONArray((Collection) ((LinkedList) q.a(context, STORAGE_PREFIX + getName(), 1).a(str, this.serializer)));
        } catch (Throwable th) {
            try {
                Logger.getMetricxLogger().e(getName(), th);
            } finally {
                new JSONArray();
            }
        }
        trafficDispatcher.onLoganNeeded(jSONArray.toString(), getName());
        return jSONArray;
    }

    @Override // com.meituan.metrics.traffic.TrafficTrace, com.meituan.metrics.traffic.TrafficTraceHandler
    public void clearTraceStorage(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36dcbb197d9d7816a0031d6dd0747c6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36dcbb197d9d7816a0031d6dd0747c6c");
            return;
        }
        Context context = Metrics.getInstance().getContext();
        q.a(context, STORAGE_PREFIX + getName(), 1).b(str);
    }

    @Override // com.meituan.metrics.traffic.TrafficTrace, com.meituan.metrics.traffic.TrafficSysManager.ISysTrafficListener
    public void onSysTrafficChanged(BasicTrafficUnit basicTrafficUnit) {
        Object[] objArr = {basicTrafficUnit};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58f805208f5cc747ed37b38eeaccb524", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58f805208f5cc747ed37b38eeaccb524");
        } else if (isEnable() && basicTrafficUnit.total - this.lastTotalTraffic >= UPDATE_THRESHOLD) {
            HashMap<String, Long> details = basicTrafficUnit.getDetails();
            details.put("ts", Long.valueOf(TimeUtil.currentTimeMillis()));
            this.sysSummaryList.add(details);
            if (this.sysSummaryList.size() > 20) {
                this.sysSummaryList.removeFirst();
            }
            this.lastTotalTraffic = basicTrafficUnit.total;
        }
    }
}
