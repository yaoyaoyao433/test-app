package com.meituan.metrics.sampler.cpu;

import com.meituan.metrics.common.Constants;
import com.meituan.metrics.util.JSONUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ProcessCpuEvent extends CpuEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String processName;

    @Override // com.meituan.metrics.sampler.cpu.CpuEvent, com.meituan.metrics.sampler.AbstractSampleEvent, com.meituan.metrics.model.AbstractEvent
    public String getLocalEventType() {
        return Constants.CPU_PROCESS;
    }

    public ProcessCpuEvent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64a9907672b3f4b0d04cb5eb5d9b8530", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64a9907672b3f4b0d04cb5eb5d9b8530");
        } else {
            this.processName = str;
        }
    }

    public String getProcessName() {
        return this.processName;
    }

    @Override // com.meituan.metrics.sampler.cpu.CpuEvent, com.meituan.metrics.model.AbstractEvent
    public void convertToJson(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "921d09f5fb521365c408a99682eb22e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "921d09f5fb521365c408a99682eb22e0");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("processName", this.processName);
        jSONArray.put(JSONUtils.buildLogUnit(Constants.CPU_PROCESS, df.format(getMetricValue()), jSONObject2, this.ts));
        jSONObject.put(Constants.METRICS, jSONArray);
    }
}
