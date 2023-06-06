package com.sankuai.waimai.restaurant.shopcart.utils;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.business.restaurant.base.shopcart.CrossOrderedFood;
import com.sankuai.waimai.business.restaurant.base.shopcart.ShopCartItem;
import com.sankuai.waimai.platform.capacity.log.i;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static boolean a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "24dda095a6f0551e3a3f60d5a98609d0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "24dda095a6f0551e3a3f60d5a98609d0")).booleanValue() : a(com.sankuai.waimai.business.restaurant.poicontainer.utils.g.a(intent, "extra", "extra", ""));
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c9456faa964ab8e0f3d5881fe023cd2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c9456faa964ab8e0f3d5881fe023cd2")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return new JSONObject(str).getBoolean("is_cross_order");
        } catch (JSONException e) {
            i.d(new com.sankuai.waimai.business.restaurant.base.log.d().a("waimai_restaurant").c(e.getMessage()).b());
            return false;
        }
    }

    public static String a(com.sankuai.waimai.business.restaurant.base.manager.order.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ed280eb4c423faf0536106c0bc854c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ed280eb4c423faf0536106c0bc854c3");
        }
        if (gVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_cross_order", gVar.m);
        } catch (JSONException e) {
            e.printStackTrace();
            i.d(new com.sankuai.waimai.business.restaurant.base.log.d().a("waimai_restaurant").c(e.getMessage()).b());
        }
        return jSONObject.toString();
    }

    private static String a(List<com.sankuai.waimai.business.restaurant.base.shopcart.g> list, com.sankuai.waimai.business.restaurant.base.manager.order.g gVar) {
        ShopCartItem shopCartItem;
        Object[] objArr = {list, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "867fd3097cfec1260d5c45b95cd5ef09", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "867fd3097cfec1260d5c45b95cd5ef09");
        }
        ArrayList arrayList = new ArrayList();
        JsonObject jsonObject = new JsonObject();
        try {
            if (!b.a(list)) {
                for (com.sankuai.waimai.business.restaurant.base.shopcart.g gVar2 : list) {
                    if (gVar2 != null && (shopCartItem = gVar2.h) != null) {
                        arrayList.add(CrossOrderedFood.convert(shopCartItem));
                    }
                }
            }
            jsonObject.add("foods", new Gson().toJsonTree(arrayList, new TypeToken<List<CrossOrderedFood>>() { // from class: com.sankuai.waimai.restaurant.shopcart.utils.c.1
            }.getType()));
            jsonObject.addProperty("poi_id", Long.valueOf(com.sankuai.waimai.platform.domain.core.poi.b.a(gVar.f())));
            jsonObject.addProperty(FoodDetailNetWorkPreLoader.URI_POI_STR, gVar.f());
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
        return jsonObject.toString();
    }

    public static void a(com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, Activity activity) {
        Object[] objArr = {gVar, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e15a27f073d2a2cda9231d12910f87f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e15a27f073d2a2cda9231d12910f87f8");
        } else if (gVar.m) {
            List<com.sankuai.waimai.business.restaurant.base.shopcart.g> a2 = h.a(k.a().n(gVar.f()), gVar);
            Intent intent = new Intent();
            intent.putExtra("resultData", a(a2, gVar));
            activity.setResult(-1, intent);
        }
    }
}
