package com.tencent.mapsdk.internal;

import com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng;
import com.tencent.map.tools.json.JsonParser;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class eg implements JsonParser.Deserializer<List<WeightedLatLng>> {
    private static List<WeightedLatLng> a(List<Double> list) {
        if (list.size() < 3) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new WeightedLatLng(new LatLng(list.get(0).doubleValue(), list.get(1).doubleValue()), list.get(2).doubleValue()));
        for (int i = 3; i < list.size(); i += 3) {
            WeightedLatLng weightedLatLng = (WeightedLatLng) arrayList.get((i / 3) - 1);
            arrayList.add(new WeightedLatLng(new LatLng(weightedLatLng.getPoint().latitude + (list.get(i).doubleValue() / 1000000.0d), weightedLatLng.getPoint().longitude + (list.get(i + 1).doubleValue() / 1000000.0d)), weightedLatLng.getIntensity() + (list.get(i + 2).doubleValue() / 100.0d)));
        }
        return arrayList;
    }

    private static List<WeightedLatLng> a(Object obj) {
        if (obj != null && (obj instanceof JSONArray)) {
            JSONArray jSONArray = (JSONArray) obj;
            if (jSONArray.length() > 0) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(Double.valueOf(jSONArray.optDouble(i)));
                }
                return a((List<Double>) arrayList);
            }
        }
        return null;
    }

    @Override // com.tencent.map.tools.json.JsonParser.Deserializer
    public final /* synthetic */ List<WeightedLatLng> deserialize(Object obj, String str, Object obj2) throws JSONException {
        if (obj2 == null || !(obj2 instanceof JSONArray)) {
            return null;
        }
        JSONArray jSONArray = (JSONArray) obj2;
        if (jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(Double.valueOf(jSONArray.optDouble(i)));
            }
            return a((List<Double>) arrayList);
        }
        return null;
    }
}
