package com.sankuai.waimai.business.restaurant.poicontainer.utils;

import android.support.annotation.NonNull;
import com.google.gson.Gson;
import com.meituan.android.common.aidata.raptoruploader.RaptorConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v2 */
    public static ArrayList<com.sankuai.waimai.business.restaurant.base.domain.moneyoff.b> a(String str) {
        List<OrderedFood> list;
        int i;
        boolean z;
        char c;
        char c2;
        int i2 = 1;
        char c3 = 0;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        Object obj = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "25186af1eeba8d125528d09c8e59e27b", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "25186af1eeba8d125528d09c8e59e27b");
        }
        List<OrderedFood> o = k.a().o(str);
        ArrayList<com.sankuai.waimai.business.restaurant.base.domain.moneyoff.b> arrayList = new ArrayList<>();
        if (o != null) {
            int i3 = 0;
            while (i3 < o.size()) {
                OrderedFood orderedFood = o.get(i3);
                if (orderedFood != null) {
                    com.sankuai.waimai.business.restaurant.base.domain.moneyoff.b bVar = new com.sankuai.waimai.business.restaurant.base.domain.moneyoff.b();
                    long spuId = orderedFood.getSpuId();
                    long skuId = orderedFood.getSkuId();
                    String name = orderedFood.getName();
                    int count = orderedFood.getCount();
                    Object[] objArr2 = new Object[i2];
                    objArr2[c3] = orderedFood;
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "806a902866686cc368f2137061d79784", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr2, obj, changeQuickRedirect2, i2, "806a902866686cc368f2137061d79784")).booleanValue();
                    } else {
                        GoodsSpu goodsSpu = orderedFood.spu;
                        z = goodsSpu != null && (goodsSpu.getActivityType() == i2 || goodsSpu.getActivityType() == 2);
                    }
                    double originPrice = orderedFood.getOriginPrice();
                    GoodsAttr[] attrIds = orderedFood.getAttrIds();
                    Object[] objArr3 = new Object[i2];
                    objArr3[0] = new Long(skuId);
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.restaurant.base.domain.moneyoff.b.a;
                    list = o;
                    i = i3;
                    if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "9e157639d5978ee1ca4e6c0e89b185e8", RobustBitConfig.DEFAULT_VALUE)) {
                        c = 0;
                        PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "9e157639d5978ee1ca4e6c0e89b185e8");
                    } else {
                        c = 0;
                        bVar.c = skuId;
                    }
                    Object[] objArr4 = new Object[1];
                    objArr4[c] = new Long(spuId);
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.restaurant.base.domain.moneyoff.b.a;
                    if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "4dd0998e5f65c746799001a8639d9043", RobustBitConfig.DEFAULT_VALUE)) {
                        c2 = 0;
                        PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "4dd0998e5f65c746799001a8639d9043");
                    } else {
                        c2 = 0;
                        bVar.b = spuId;
                    }
                    bVar.d = name;
                    bVar.e = count;
                    bVar.g = z;
                    bVar.h = attrIds;
                    Object[] objArr5 = new Object[1];
                    objArr5[c2] = Double.valueOf(originPrice);
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.restaurant.base.domain.moneyoff.b.a;
                    if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "4b7a5576cb6823d51b287835abc8df49", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "4b7a5576cb6823d51b287835abc8df49");
                    } else {
                        bVar.f = originPrice;
                    }
                    arrayList.add(bVar);
                } else {
                    list = o;
                    i = i3;
                }
                i3 = i + 1;
                o = list;
                i2 = 1;
                obj = null;
                c3 = 0;
            }
        }
        return arrayList;
    }

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc3be1e177b96f1eee82b0a007693b39", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc3be1e177b96f1eee82b0a007693b39");
        }
        ArrayList<com.sankuai.waimai.business.restaurant.base.domain.moneyoff.b> a2 = a(str);
        com.sankuai.waimai.business.restaurant.base.repository.model.a aVar = new com.sankuai.waimai.business.restaurant.base.repository.model.a();
        aVar.a = a2;
        return new Gson().toJson(aVar);
    }

    public static JSONArray a(@NonNull List<GoodsSpu> list) throws JSONException {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "49178baa379e8196eb8308a2ce6aee7c", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "49178baa379e8196eb8308a2ce6aee7c");
        }
        JSONArray jSONArray = new JSONArray();
        for (GoodsSpu goodsSpu : list) {
            if (goodsSpu != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("spu_id", goodsSpu.getId());
                if (com.sankuai.waimai.foundation.utils.b.a(goodsSpu.getSkuList()) && goodsSpu.getSkuList().get(0) != null) {
                    jSONObject.put("sku_id", goodsSpu.getSkuList().get(0).getSkuId());
                    jSONObject.put(RaptorConstants.JS_BATCH_NUM, goodsSpu.getSkuList().get(0).count);
                }
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }
}
