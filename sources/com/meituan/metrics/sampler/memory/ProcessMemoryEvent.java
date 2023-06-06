package com.meituan.metrics.sampler.memory;

import com.meituan.metrics.common.Constants;
import com.meituan.metrics.util.JSONUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ProcessMemoryEvent extends MemoryEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String processName;

    @Override // com.meituan.metrics.sampler.memory.MemoryEvent, com.meituan.metrics.sampler.AbstractSampleEvent, com.meituan.metrics.model.AbstractEvent
    public String getLocalEventType() {
        return Constants.MEMORY_PROCESS;
    }

    public ProcessMemoryEvent(int i) {
        super(i);
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4985d1314e9915019f9f663c0bfb24a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4985d1314e9915019f9f663c0bfb24a");
        }
    }

    public void setProcessName(String str) {
        this.processName = str;
    }

    public String getProcessName() {
        return this.processName;
    }

    @Override // com.meituan.metrics.sampler.memory.MemoryEvent
    public Map<String, Object> getDetails() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1de355d1b7ba7c975471f9fddf6c6637", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1de355d1b7ba7c975471f9fddf6c6637") : super.getDetails(false);
    }

    @Override // com.meituan.metrics.sampler.memory.MemoryEvent, com.meituan.metrics.model.AbstractEvent
    public void convertToJson(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46b6daa9d6e45e7756e7f06e0303189e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46b6daa9d6e45e7756e7f06e0303189e");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("processName", this.processName);
        jSONArray.put(JSONUtils.buildLogUnit(Constants.MEMORY_PROCESS, df.format(getMetricValue()), jSONObject2, this.ts));
        jSONObject.put(Constants.METRICS, jSONArray);
    }
}
