package com.sankuai.waimai.business.restaurant.base.skuchoose;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static OrderedFood a(List<OrderedFood> list, List<GoodsSku> list2, Map<String, List<GoodsAttr>> map) {
        Object[] objArr = {list, list2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b0a0630275270fa32276e8fbdd3de41a", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderedFood) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b0a0630275270fa32276e8fbdd3de41a");
        }
        if (list == null || list.size() == 0 || list2 == null || list2.size() == 0) {
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
                if (list4 == null || list4.size() == 0) {
                    break;
                }
                ArrayList arrayList = new ArrayList();
                for (GoodsAttr goodsAttr : list5) {
                    for (OrderedFood orderedFood2 : list4) {
                        if (orderedFood2 != null && orderedFood2.getAttrIds() != null && Arrays.asList(orderedFood2.getAttrIds()).contains(goodsAttr)) {
                            arrayList.add(orderedFood2);
                        }
                    }
                }
                list4 = arrayList;
            }
            if (list4 != null && list4.size() > 0) {
                return a(list4, map);
            }
        }
        return null;
    }

    private static OrderedFood a(List<OrderedFood> list, Map<String, List<GoodsAttr>> map) {
        Object[] objArr = {list, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3a9adc3122451673de4b9c68ba42d989", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderedFood) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3a9adc3122451673de4b9c68ba42d989");
        }
        for (List<GoodsAttr> list2 : map.values()) {
            for (GoodsAttr goodsAttr : list2) {
                for (OrderedFood orderedFood : list) {
                    if (orderedFood != null && orderedFood.getAttrIds() != null && Arrays.asList(orderedFood.getAttrIds()).contains(goodsAttr)) {
                        return orderedFood;
                    }
                }
            }
        }
        return null;
    }
}
