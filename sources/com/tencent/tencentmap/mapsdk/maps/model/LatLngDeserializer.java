package com.tencent.tencentmap.mapsdk.maps.model;

import com.meituan.robust.common.CommonConstant;
import com.tencent.map.tools.json.JsonParser;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class LatLngDeserializer implements JsonParser.Deserializer<LatLng> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.map.tools.json.JsonParser.Deserializer
    public LatLng deserialize(Object obj, String str, Object obj2) throws JSONException {
        if (obj2 == null) {
            return null;
        }
        if (obj2 instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj2;
            return new LatLng(jSONObject.optDouble("lat"), jSONObject.optDouble("lng"));
        } else if (obj2 instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj2;
            if (jSONArray.length() < 2) {
                return null;
            }
            if (jSONArray.length() > 2) {
                return new LatLng(jSONArray.getDouble(0), jSONArray.getDouble(1), jSONArray.getDouble(2));
            }
            return new LatLng(jSONArray.getDouble(0), jSONArray.getDouble(1));
        } else if ((obj2 instanceof JSONStringer) || (obj2 instanceof String)) {
            String[] split = obj2.toString().split(CommonConstant.Symbol.COMMA);
            if (split.length < 2) {
                return null;
            }
            if (split.length > 2) {
                return new LatLng(Double.parseDouble(split[0]), Double.parseDouble(split[1]), Double.parseDouble(split[2]));
            }
            return new LatLng(Double.parseDouble(split[0]), Double.parseDouble(split[1]));
        } else {
            return null;
        }
    }
}
