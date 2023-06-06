package com.sankuai.waimai.business.restaurant.poicontainer.helper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity;
import com.sankuai.waimai.business.restaurant.poicontainer.pga.RestaurantSchemeParams;
import com.sankuai.waimai.log.judas.JudasManualManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class l {
    public static ChangeQuickRedirect a;

    public static Object a(JSONObject jSONObject, String str, Object obj) {
        Object opt;
        Object[] objArr = {jSONObject, str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0dae909c0b1b73083785158b0618995f", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0dae909c0b1b73083785158b0618995f") : (jSONObject == null || TextUtils.isEmpty(str) || (opt = jSONObject.opt(str)) == null) ? obj : opt;
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "56c75976d7a2690fcaa955909f66a55b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "56c75976d7a2690fcaa955909f66a55b");
        } else {
            JudasManualManager.b("b_waimai_793sg3k3_mv", "c_CijEL", str).a("poi_id", str2).a();
        }
    }

    public static Map<String, Object> a(Context context, Map<String, Object> map) {
        Intent intent;
        JSONObject jSONObject;
        RestaurantSchemeParams restaurantSchemeParams;
        Object[] objArr = {context, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "de0e6f19489ab461f864e7a21351e716", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "de0e6f19489ab461f864e7a21351e716");
        }
        if (map == null) {
            map = new HashMap<>();
        }
        if (context instanceof WMRestaurantActivity) {
            WMRestaurantActivity wMRestaurantActivity = (WMRestaurantActivity) context;
            if (wMRestaurantActivity.e != null && wMRestaurantActivity.e.D != null && (restaurantSchemeParams = wMRestaurantActivity.e.D.a().b) != null && restaurantSchemeParams.adSource != null) {
                map.put("adSource", restaurantSchemeParams.adSource);
            }
        } else if (!(context instanceof Activity) || (intent = ((Activity) context).getIntent()) == null) {
            return map;
        } else {
            try {
                String a2 = com.sankuai.waimai.foundation.core.utils.e.a(intent);
                if (TextUtils.isEmpty(a2) || (jSONObject = new JSONObject(a2).getJSONObject("adSource")) == null) {
                    return map;
                }
                map.put("adSource", JsonUtil.jsonObjectToMap(jSONObject));
            } catch (Exception unused) {
            }
        }
        return map;
    }
}
