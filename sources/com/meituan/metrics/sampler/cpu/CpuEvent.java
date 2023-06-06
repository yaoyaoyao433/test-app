package com.meituan.metrics.sampler.cpu;

import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.sampler.AbstractSampleEvent;
import com.meituan.metrics.util.JSONUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CpuEvent extends AbstractSampleEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    private double avgAppCpuRate;
    private double maxAppCpuRate;
    private String pageName;
    private int sampleCount;

    @Override // com.meituan.metrics.sampler.AbstractSampleEvent, com.meituan.metrics.model.AbstractEvent
    public String getLocalEventType() {
        return Constants.CPU_V2;
    }

    @Deprecated
    public String getOldLocalEventType() {
        return Constants.CPU_AVG;
    }

    public CpuEvent() {
    }

    public CpuEvent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eabb6ab6824a53bf59d2ae9510c99ef9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eabb6ab6824a53bf59d2ae9510c99ef9");
        } else {
            this.pageName = str;
        }
    }

    public void computeAvg(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d05ded615656638a592a00943b6e4462", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d05ded615656638a592a00943b6e4462");
            return;
        }
        this.avgAppCpuRate = ((this.avgAppCpuRate * this.sampleCount) + d) / (this.sampleCount + 1);
        if (this.maxAppCpuRate < d) {
            this.maxAppCpuRate = d;
        }
        this.sampleCount++;
        Logger.getMetricsLogger().d("CpuEvent ", toString());
    }

    public double getAvgAppCpuRate() {
        return this.avgAppCpuRate;
    }

    public int getSampleCount() {
        return this.sampleCount;
    }

    public double getMaxAppCpuRate() {
        return this.maxAppCpuRate;
    }

    @Override // com.meituan.metrics.model.AbstractEvent
    public String getPageName() {
        return this.pageName;
    }

    @Override // com.meituan.metrics.model.AbstractEvent
    public double getMetricValue() {
        return this.avgAppCpuRate;
    }

    @Override // com.meituan.metrics.model.AbstractEvent
    public void convertToJson(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3168d0737c16dad90fdc77f380023ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3168d0737c16dad90fdc77f380023ce");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("pageName", this.pageName);
        jSONArray.put(JSONUtils.buildLogUnit(Constants.CPU_AVG, df.format(this.avgAppCpuRate), jSONObject2, this.ts));
        jSONArray.put(JSONUtils.buildLogUnit(Constants.CPU_MAX, df.format(this.maxAppCpuRate), jSONObject2, this.ts));
        jSONObject.put(Constants.METRICS, jSONArray);
    }
}
