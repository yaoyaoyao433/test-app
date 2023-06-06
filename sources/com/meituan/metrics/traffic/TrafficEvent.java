package com.meituan.metrics.traffic;

import com.meituan.metrics.common.Constants;
import com.meituan.metrics.model.AbstractEvent;
import com.meituan.metrics.util.JSONUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NumberUtils;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class TrafficEvent extends AbstractEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String date;
    public double downJavaCoverage;
    public double downNativeCoverage;
    private final Map<String, ?> traffic;
    public double upJavaCoverage;
    public double upNativeCoverage;
    private double value;
    public String webviewPackageName;
    public String webviewVersion;

    @Override // com.meituan.metrics.model.AbstractEvent
    public String getEventType() {
        return "default";
    }

    @Override // com.meituan.metrics.model.AbstractEvent
    public String getLocalEventType() {
        return Constants.TRAFFIC_DAILY_TOTAL_STREAM;
    }

    @Override // com.meituan.metrics.model.AbstractEvent
    public String getPageName() {
        return "";
    }

    public TrafficEvent(Map<String, ?> map, String str) {
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "640f4e755c68168983dcb5d66d777893", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "640f4e755c68168983dcb5d66d777893");
            return;
        }
        this.traffic = map;
        this.date = str;
        this.value = NumberUtils.parseLong(String.valueOf(map.get(Constants.TRAFFIC_DAILY_TOTAL_UPSTREAM)), -1L) + NumberUtils.parseLong(String.valueOf(map.get(Constants.TRAFFIC_DAILY_TOTAL_DOWNSTREAM)), -1L);
    }

    public Map getTraffic() {
        return this.traffic;
    }

    public String getDate() {
        return this.date;
    }

    @Override // com.meituan.metrics.model.AbstractEvent
    public void convertToJson(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a38846c5fdef11ad6901864667bb59a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a38846c5fdef11ad6901864667bb59a2");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject(this.traffic);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("date", this.date.replace(CommonConstant.Symbol.MINUS, "/"));
        jSONObject.put("tags", jSONObject3);
        jSONArray.put(JSONUtils.buildTrafficLogUnit(Constants.TRAFFIC_DAILY_TOTAL_STREAM, Double.valueOf(this.value), jSONObject2, jSONObject3, this.ts));
        jSONObject.put(Constants.METRICS, jSONArray);
    }

    public Map<String, Object> getDetails() {
        return this.traffic;
    }

    @Override // com.meituan.metrics.model.AbstractEvent
    public double getMetricValue() {
        return this.value;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    @Override // com.meituan.metrics.model.AbstractEvent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isValid() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.metrics.traffic.TrafficEvent.changeQuickRedirect
            java.lang.String r10 = "892a1de92543465859b9802aa1eb84dc"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1f
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L1f:
            double r1 = r11.value
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L28
            return r0
        L28:
            java.util.Map<java.lang.String, ?> r1 = r11.traffic
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L32:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5c
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Map<java.lang.String, ?> r3 = r11.traffic
            java.lang.Object r3 = r3.get(r2)
            java.util.Map<java.lang.String, ?> r4 = r11.traffic
            java.lang.Object r2 = r4.get(r2)
            boolean r2 = r2 instanceof java.lang.Long
            if (r2 == 0) goto L5b
            java.lang.Long r3 = (java.lang.Long) r3
            long r2 = r3.longValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L32
            return r0
        L5b:
            return r0
        L5c:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.metrics.traffic.TrafficEvent.isValid():boolean");
    }
}
