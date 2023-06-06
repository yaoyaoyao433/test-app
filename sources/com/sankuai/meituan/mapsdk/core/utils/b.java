package com.sankuai.meituan.mapsdk.core.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.MarkerOptions;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static List<MarkerOptions> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "492125421b5802116211ff914bf34daf", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "492125421b5802116211ff914bf34daf");
        }
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("features");
            if (jSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String optString = jSONObject.optString("id");
                    JSONArray jSONArray2 = jSONObject.getJSONObject("geometry").getJSONArray("coordinates");
                    jSONObject.getJSONObject("properties");
                    MarkerOptions markerOptions = new MarkerOptions();
                    markerOptions.id(optString).position(new LatLng(jSONArray2.getDouble(1), jSONArray2.getDouble(0))).allowOverlap(false).ignorePlacement(false);
                    arrayList.add(markerOptions);
                }
                return arrayList;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
