package com.meituan.metrics.laggy;

import android.support.annotation.NonNull;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.model.AbstractEvent;
import com.meituan.metrics.util.ThreadStackUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class LaggyEvent extends AbstractEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String appState;
    public String cpuStat;
    private final long duration;
    public String guid;
    public boolean isScrolling;
    private final String page;
    public String pendingWorkFinishers;
    private List<ThreadStackEntity> stackEntities;
    private final List<StackTraceElement[]> stackTraceElements;
    private final long threshold;
    public long timestamp;
    private String unionStackTrace;

    @Override // com.meituan.metrics.model.AbstractEvent
    public String getEventType() {
        return "lag_log";
    }

    @Override // com.meituan.metrics.model.AbstractEvent
    public String getLocalEventType() {
        return "lag_log";
    }

    @Override // com.meituan.metrics.model.AbstractEvent
    public double getMetricValue() {
        return 0.0d;
    }

    public LaggyEvent(String str, long j, long j2, @NonNull List<ThreadStackEntity> list, String str2) {
        Object[] objArr = {str, new Long(j), new Long(j2), list, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0ffbe5567442157585943b5528bc281", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0ffbe5567442157585943b5528bc281");
            return;
        }
        this.page = str;
        this.duration = j;
        this.threshold = j2;
        this.stackEntities = list;
        this.stackTraceElements = new ArrayList();
        for (ThreadStackEntity threadStackEntity : list) {
            this.stackTraceElements.add(threadStackEntity.stackTraceElements);
        }
        this.cpuStat = str2;
    }

    public void setAppState(String str) {
        this.appState = str;
    }

    public String getAppState() {
        return this.appState;
    }

    public String getPage() {
        return this.page;
    }

    public long getDuration() {
        return this.duration;
    }

    public long getThreshold() {
        return this.threshold;
    }

    public List<StackTraceElement[]> getStackTraceElements() {
        return this.stackTraceElements;
    }

    public String resolveUnionStack() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5628746fa6ceb6298f9d9454ec3b1d0e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5628746fa6ceb6298f9d9454ec3b1d0e");
        }
        if (this.unionStackTrace != null) {
            return this.unionStackTrace;
        }
        this.unionStackTrace = ThreadStackUtils.resolveUnionStack(this.stackTraceElements);
        return this.unionStackTrace;
    }

    public String getAllStack() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "463836830174a97b4a98cf88891e81ee", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "463836830174a97b4a98cf88891e81ee") : ThreadStackUtils.getAllStackTrace(this.stackEntities);
    }

    @Override // com.meituan.metrics.model.AbstractEvent
    public String getPageName() {
        return this.page;
    }

    @Override // com.meituan.metrics.model.AbstractEvent
    public void convertToJson(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d22041c88a9591a9753719cc91f8392d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d22041c88a9591a9753719cc91f8392d");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("pageName", this.page);
        jSONObject2.put("event_type", "stack");
        jSONObject2.put("lag_log", resolveUnionStack());
        jSONObject2.put(Constants.LAG_THRESHOLD, this.threshold);
        jSONArray.put(jSONObject2);
        jSONObject.put(Constants.METRICS, jSONArray);
    }
}
