package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.JsonParser;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ef implements JsonParser.Deserializer<List<LatLng>> {
    private static List<LatLng> a(Object obj) throws JSONException {
        if (obj == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            if ((jSONArray.get(0) instanceof Double) || (jSONArray.get(0) instanceof Integer)) {
                if (jSONArray.length() < 2) {
                    return null;
                }
                if (jSONArray.length() == 2) {
                    arrayList.add(new LatLng(jSONArray.getDouble(0), jSONArray.getDouble(1)));
                } else {
                    arrayList.add(new LatLng(jSONArray.getDouble(0), jSONArray.getDouble(1), jSONArray.getDouble(2)));
                }
            } else if (jSONArray.get(0) instanceof JSONArray) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONArray jSONArray2 = (JSONArray) jSONArray.get(i);
                    if (jSONArray2.length() < 2) {
                        return null;
                    }
                    if (jSONArray2.length() > 2) {
                        arrayList.add(new LatLng(jSONArray2.getDouble(0), jSONArray2.getDouble(1), jSONArray2.getDouble(2)));
                    } else {
                        arrayList.add(new LatLng(jSONArray2.getDouble(0), jSONArray2.getDouble(1)));
                    }
                }
            }
            return arrayList;
        }
        return null;
    }

    @Override // com.tencent.map.tools.json.JsonParser.Deserializer
    public final /* synthetic */ List<LatLng> deserialize(Object obj, String str, Object obj2) throws JSONException {
        if (obj2 != null) {
            ArrayList arrayList = new ArrayList();
            if (obj2 instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj2;
                if ((jSONArray.get(0) instanceof Double) || (jSONArray.get(0) instanceof Integer)) {
                    if (jSONArray.length() < 2) {
                        return null;
                    }
                    if (jSONArray.length() == 2) {
                        arrayList.add(new LatLng(jSONArray.getDouble(0), jSONArray.getDouble(1)));
                    } else {
                        arrayList.add(new LatLng(jSONArray.getDouble(0), jSONArray.getDouble(1), jSONArray.getDouble(2)));
                    }
                } else if (jSONArray.get(0) instanceof JSONArray) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONArray jSONArray2 = (JSONArray) jSONArray.get(i);
                        if (jSONArray2.length() < 2) {
                            return null;
                        }
                        if (jSONArray2.length() > 2) {
                            arrayList.add(new LatLng(jSONArray2.getDouble(0), jSONArray2.getDouble(1), jSONArray2.getDouble(2)));
                        } else {
                            arrayList.add(new LatLng(jSONArray2.getDouble(0), jSONArray2.getDouble(1)));
                        }
                    }
                }
                return arrayList;
            }
            return null;
        }
        return null;
    }
}
