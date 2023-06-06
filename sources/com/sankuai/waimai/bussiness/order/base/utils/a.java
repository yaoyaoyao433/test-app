package com.sankuai.waimai.bussiness.order.base.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    public static int b = 1;

    public static String a(long j, String str, int i, List<Long> list) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d350ca38c8e0185879379aae11a8f03", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d350ca38c8e0185879379aae11a8f03");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("wm_poi_id", j);
            jSONObject.put(FoodDetailNetWorkPreLoader.URI_POI_STR, str);
            jSONObject.put("scenes", i);
            WMLocation p = com.sankuai.waimai.foundation.location.v2.g.a().p();
            if (p != null) {
                jSONObject.put("user_latitude", (long) (p.getLatitude() * 1000000.0d));
                jSONObject.put("user_longitude", (long) (p.getLongitude() * 1000000.0d));
            }
            if (!com.sankuai.waimai.foundation.utils.b.b(list)) {
                JSONArray jSONArray = new JSONArray();
                for (Long l : list) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("wm_poi_id", l);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("poi_list", jSONArray);
            }
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }
}
