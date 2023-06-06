package com.sankuai.waimai.store.shopping.cart.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static Map<String, Object> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fdf70033a8a24ee60be201feedeb53fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fdf70033a8a24ee60be201feedeb53fa");
        }
        List<OrderedFood> p = com.sankuai.waimai.store.order.a.e().p(str);
        if (com.sankuai.shangou.stone.util.a.a((List) p) > 0) {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            for (OrderedFood orderedFood : p) {
                if (orderedFood != null) {
                    long j = orderedFood.spu == null ? 0L : orderedFood.spu.id;
                    int count = orderedFood.getCount();
                    if (hashMap.containsKey(Long.valueOf(j))) {
                        hashMap.put(Long.valueOf(j), Integer.valueOf(count + ((Integer) hashMap.get(Long.valueOf(j))).intValue()));
                    } else {
                        hashMap.put(Long.valueOf(j), Integer.valueOf(count));
                    }
                }
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("spu_id", entry.getKey());
                    jSONObject.put("count", entry.getValue());
                    arrayList.add(jSONObject);
                } catch (Exception unused) {
                }
            }
            if (com.sankuai.shangou.stone.util.a.a((List) arrayList) > 0) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("shopcart_item_list", arrayList);
                return hashMap2;
            }
        }
        return null;
    }

    public static Map<String, Object> b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4da0655a1e8af4b304afe31a29e4c896", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4da0655a1e8af4b304afe31a29e4c896");
        }
        List<OrderedFood> p = com.sankuai.waimai.store.order.a.e().p(str);
        if (com.sankuai.shangou.stone.util.a.a((List) p) > 0) {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            for (OrderedFood orderedFood : p) {
                if (orderedFood != null) {
                    long j = orderedFood.sku == null ? 0L : orderedFood.sku.id;
                    int count = orderedFood.getCount();
                    if (hashMap.containsKey(Long.valueOf(j))) {
                        hashMap.put(Long.valueOf(j), Integer.valueOf(count + ((Integer) hashMap.get(Long.valueOf(j))).intValue()));
                    } else {
                        hashMap.put(Long.valueOf(j), Integer.valueOf(count));
                    }
                }
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("sku_id", entry.getKey());
                    jSONObject.put("count", entry.getValue());
                    arrayList.add(jSONObject);
                } catch (Exception unused) {
                }
            }
            if (com.sankuai.shangou.stone.util.a.a((List) arrayList) > 0) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("shopcart_item_list", arrayList);
                return hashMap2;
            }
        }
        return null;
    }
}
