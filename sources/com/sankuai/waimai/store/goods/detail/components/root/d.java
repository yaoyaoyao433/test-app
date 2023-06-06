package com.sankuai.waimai.store.goods.detail.components.root;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static GoodsSku a(List<GoodsSku> list, long j) {
        Object[] objArr = {list, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5fc4ff0274c92fb31267194252365a46", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsSku) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5fc4ff0274c92fb31267194252365a46");
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        for (GoodsSku goodsSku : list) {
            if (goodsSku != null && j == goodsSku.getSkuId()) {
                return goodsSku;
            }
        }
        return null;
    }

    public static GoodsSku a(List<GoodsSku> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e06ea62992d09cd472996325510efc8", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsSku) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e06ea62992d09cd472996325510efc8");
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return null;
        }
        for (GoodsSku goodsSku : list) {
            if (goodsSku != null && goodsSku.isSoldable()) {
                return goodsSku;
            }
        }
        return null;
    }

    public static OrderedFood a(List<OrderedFood> list, List<GoodsSku> list2, Map<String, List<GoodsAttr>> map) {
        Object[] objArr = {list, list2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "41dd59fbe02bd28015a8166b85229d0e", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderedFood) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "41dd59fbe02bd28015a8166b85229d0e");
        }
        if (com.sankuai.shangou.stone.util.a.b(list) || com.sankuai.shangou.stone.util.a.b(list2)) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (GoodsSku goodsSku : list2) {
            StringBuilder sb = new StringBuilder();
            sb.append(goodsSku.id);
            String sb2 = sb.toString();
            for (OrderedFood orderedFood : list) {
                if (orderedFood.sku.id == goodsSku.id) {
                    if (map == null || map.size() == 0) {
                        return orderedFood;
                    }
                    List list3 = (List) linkedHashMap.get(sb2);
                    if (list3 == null) {
                        list3 = new ArrayList();
                        linkedHashMap.put(sb2, list3);
                    }
                    list3.add(orderedFood);
                }
            }
        }
        if (linkedHashMap.size() == 0) {
            return null;
        }
        for (List<OrderedFood> list4 : linkedHashMap.values()) {
            if (map == null || map.size() == 0) {
                return null;
            }
            for (List<GoodsAttr> list5 : map.values()) {
                if (com.sankuai.shangou.stone.util.a.b(list4)) {
                    break;
                }
                ArrayList arrayList = new ArrayList();
                for (GoodsAttr goodsAttr : list5) {
                    for (OrderedFood orderedFood2 : list4) {
                        if (orderedFood2.getAttrIds() != null && Arrays.asList(orderedFood2.getAttrIds()).contains(goodsAttr)) {
                            arrayList.add(orderedFood2);
                        }
                    }
                }
                list4 = arrayList;
            }
            if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list4)) {
                return a(list4, map);
            }
        }
        return null;
    }

    private static OrderedFood a(List<OrderedFood> list, Map<String, List<GoodsAttr>> map) {
        Object[] objArr = {list, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "75635e16ab13a44d8708c9e3c521bc00", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderedFood) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "75635e16ab13a44d8708c9e3c521bc00");
        }
        for (List<GoodsAttr> list2 : map.values()) {
            for (GoodsAttr goodsAttr : list2) {
                for (OrderedFood orderedFood : list) {
                    if (orderedFood.getAttrIds() != null && Arrays.asList(orderedFood.getAttrIds()).contains(goodsAttr)) {
                        return orderedFood;
                    }
                }
            }
        }
        return null;
    }
}
