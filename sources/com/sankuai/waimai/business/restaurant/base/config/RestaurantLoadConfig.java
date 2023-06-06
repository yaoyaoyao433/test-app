package com.sankuai.waimai.business.restaurant.base.config;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.business.restaurant.poicontainer.dynamic.framework.e;
import com.sankuai.waimai.platform.config.ILoadConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class RestaurantLoadConfig implements ILoadConfig {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.config.ILoadConfig
    public void loadConfig(Context context, JSONObject jSONObject) {
        List<com.sankuai.waimai.business.restaurant.poicontainer.dynamic.model.b> list;
        e eVar;
        Object[] objArr = {context, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ecca766d47a156c97f9e989ad570eec9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ecca766d47a156c97f9e989ad570eec9");
        } else if (jSONObject != null) {
            setHasGlobalShoppingCart(context, jSONObject);
            setMultiPersonOrderCart(context, jSONObject);
            setStartConfig(context, jSONObject);
            setRefreshTimeClock(context, jSONObject);
            boolean optBoolean = jSONObject.optBoolean("use_dynamic_style", false);
            JSONArray optJSONArray = jSONObject.optJSONArray("food_card_style_info");
            Object[] objArr2 = {optJSONArray};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.restaurant.poicontainer.dynamic.model.b.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "3045e3232cf9939d0ab2cd86d01eb30d", RobustBitConfig.DEFAULT_VALUE)) {
                list = (List) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "3045e3232cf9939d0ab2cd86d01eb30d");
            } else {
                ArrayList arrayList = new ArrayList();
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        com.sankuai.waimai.business.restaurant.poicontainer.dynamic.model.b bVar = new com.sankuai.waimai.business.restaurant.poicontainer.dynamic.model.b();
                        bVar.b = optJSONObject.optString("page_scene");
                        bVar.c = com.sankuai.waimai.business.restaurant.poicontainer.dynamic.model.a.a(optJSONObject.optJSONArray("styles"));
                        arrayList.add(bVar);
                    }
                }
                list = arrayList;
            }
            if (!optBoolean || com.sankuai.waimai.modular.utils.a.a(list)) {
                return;
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = e.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "06cb832b759e587be8a8f5fac932af68", RobustBitConfig.DEFAULT_VALUE)) {
                eVar = (e) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "06cb832b759e587be8a8f5fac932af68");
            } else {
                if (e.b == null) {
                    e.b = new e();
                }
                eVar = e.b;
            }
            eVar.a(list);
        }
    }

    private void setStartConfig(Context context, JSONObject jSONObject) {
        Object[] objArr = {context, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4078b7dd064ee6e20bf4ef7b2461d661", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4078b7dd064ee6e20bf4ef7b2461d661");
        } else {
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "start_config", jSONObject.optString("startconfig"));
        }
    }

    private void setMultiPersonOrderCart(Context context, JSONObject jSONObject) {
        String str;
        String str2;
        long j;
        boolean z = false;
        Object[] objArr = {context, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "787f6e090fcdf73b102f901cfdd8525a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "787f6e090fcdf73b102f901cfdd8525a");
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("shopping_cart_info");
        if (optJSONObject != null) {
            j = optJSONObject.optLong("wm_poi_id");
            str = optJSONObject.optString(FoodDetailNetWorkPreLoader.URI_POI_STR);
            str2 = optJSONObject.optString("cart_id");
            com.sankuai.waimai.platform.domain.core.poi.b.a(j, str);
        } else {
            str = "";
            str2 = "";
            j = 0;
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i != 0 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            z = true;
        }
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "has_multi_person_order", z);
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "multi_person_order_poi_id", j);
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "multi_person_order_poi_id_str", str);
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "multi_person_order_cart_id", str2);
        if (!isMtPlatform() || i == 0 || TextUtils.isEmpty(str2) || !(context instanceof Activity)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        com.sankuai.waimai.business.restaurant.composeorder.a.a((Activity) context, 3, sb.toString(), str2);
    }

    private void setHasGlobalShoppingCart(Context context, JSONObject jSONObject) {
        Object[] objArr = {context, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef9faa3ba18ec86fa6928395380723cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef9faa3ba18ec86fa6928395380723cb");
        } else {
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "global_shopping_cart_entrance_switch", jSONObject.optBoolean("global_shopping_cart_entrance_switch", true));
        }
    }

    private void setRefreshTimeClock(Context context, JSONObject jSONObject) {
        Object[] objArr = {context, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a3fa3784ebe4bf7988d9c8feac24bd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a3fa3784ebe4bf7988d9c8feac24bd9");
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("refresh_time_clock");
        long j = 0;
        int i = 3;
        if (optJSONObject != null) {
            i = optJSONObject.optInt("refreshClock", 3);
            j = optJSONObject.optLong("delayTimeInMil", 0L);
        }
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "poi_id_need_refresh_time_hour", i);
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "poi_id_need_refresh_time_millis_delay", j);
    }

    private static boolean isMtPlatform() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e61b4710762a07c3e26545d12bd8ad1b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e61b4710762a07c3e26545d12bd8ad1b")).booleanValue() : com.meituan.android.singleton.b.a.getResources().getBoolean(R.bool.wm_is_mt_flavor);
    }
}
