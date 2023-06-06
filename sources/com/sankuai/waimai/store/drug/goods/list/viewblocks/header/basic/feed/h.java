package com.sankuai.waimai.store.drug.goods.list.viewblocks.header.basic.feed;

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
public final class h {
    public static ChangeQuickRedirect a;

    public static Map<String, Object> a(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d71397181458bc91957bc52ed590b6a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d71397181458bc91957bc52ed590b6a2");
        }
        if (aVar == null) {
            return null;
        }
        List<OrderedFood> p = com.sankuai.waimai.store.order.a.e().p(aVar.d());
        if (com.sankuai.shangou.stone.util.a.a((List) p) > 0) {
            ArrayList arrayList = new ArrayList();
            for (OrderedFood orderedFood : p) {
                if (orderedFood != null) {
                    long j = orderedFood.spu == null ? 0L : orderedFood.spu.id;
                    int count = orderedFood.getCount();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("spu_id", j);
                        jSONObject.put("count", count);
                        arrayList.add(jSONObject);
                    } catch (Exception e) {
                        com.sankuai.waimai.store.base.log.a.a(e);
                    }
                }
            }
            if (com.sankuai.shangou.stone.util.a.a((List) arrayList) > 0) {
                HashMap hashMap = new HashMap();
                hashMap.put("shopcart_item_list", arrayList);
                return hashMap;
            }
        }
        return null;
    }
}
