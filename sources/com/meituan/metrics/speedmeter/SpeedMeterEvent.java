package com.meituan.metrics.speedmeter;

import com.meituan.metrics.common.Constants;
import com.meituan.metrics.sampler.AbstractSampleEvent;
import com.meituan.metrics.util.JSONUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SpeedMeterEvent extends AbstractSampleEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final long duration;
    private final String id;
    private final String step;
    private Map<String, Long> steps;
    private final int type;

    public SpeedMeterEvent(String str, long j, int i, String str2) {
        Object[] objArr = {str, new Long(j), Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c993c8109ee2c2085059289b7e88da5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c993c8109ee2c2085059289b7e88da5");
            return;
        }
        this.step = str;
        this.duration = j;
        this.type = i;
        this.id = str2;
    }

    public SpeedMeterEvent(String str, long j, int i, String str2, int i2) {
        this(str, j, i, str2);
        Object[] objArr = {str, new Long(j), Integer.valueOf(i), str2, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4bc5f02b4a4e85edd190c2f65794f8d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4bc5f02b4a4e85edd190c2f65794f8d8");
        } else {
            this.configFrom = i2;
        }
    }

    public SpeedMeterEvent(String str, long j, Map<String, Long> map, int i, String str2) {
        this(str, j, i, str2);
        Object[] objArr = {str, new Long(j), map, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8fa684b1d74801fcf40dc86c24e1ebb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8fa684b1d74801fcf40dc86c24e1ebb");
            return;
        }
        this.steps = new HashMap();
        this.steps.put(str, Long.valueOf(j));
        this.steps.putAll(map);
    }

    public long getDuration() {
        return this.duration;
    }

    public String getStep() {
        return this.step;
    }

    public Map<String, Long> getSteps() {
        return this.steps;
    }

    public int getType() {
        return this.type;
    }

    public String getId() {
        return this.id;
    }

    @Override // com.meituan.metrics.model.AbstractEvent
    public String getPageName() {
        return this.id;
    }

    @Override // com.meituan.metrics.sampler.AbstractSampleEvent, com.meituan.metrics.model.AbstractEvent
    public String getLocalEventType() {
        switch (this.type) {
            case 1:
                return Constants.COLD_LAUNCH_METER;
            case 2:
                return Constants.PAGE_LOAD_METER;
            case 3:
                return Constants.CUSTOM_SPEED_METER;
            default:
                return "default";
        }
    }

    @Override // com.meituan.metrics.model.AbstractEvent
    public double getMetricValue() {
        return this.duration;
    }

    @Override // com.meituan.metrics.model.AbstractEvent
    public void convertToJson(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b196f0c719ac217f00ce363b47f763d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b196f0c719ac217f00ce363b47f763d5");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(Constants.SPEED_METER_STEP, this.step);
        switch (this.type) {
            case 1:
                jSONArray.put(JSONUtils.buildLogUnit(Constants.COLD_LAUNCH_METER, Long.valueOf(this.duration), jSONObject2, this.ts));
                break;
            case 2:
                jSONObject2.put("pageName", this.id);
                jSONArray.put(JSONUtils.buildLogUnit(Constants.PAGE_LOAD_METER, Long.valueOf(this.duration), jSONObject2, this.ts));
                break;
            case 3:
                jSONObject2.put("key", this.id);
                jSONArray.put(JSONUtils.buildLogUnit(Constants.CUSTOM_SPEED_METER, Long.valueOf(this.duration), jSONObject2, this.ts));
                break;
        }
        jSONObject.put(Constants.METRICS, jSONArray);
    }
}
