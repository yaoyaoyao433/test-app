package com.sankuai.waimai.drug.util;

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
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static GoodsSku a(List<GoodsSku> list, long j) {
        Object[] objArr = {list, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a3610e0995aa56c5e7a6af6f97c8ea92", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsSku) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a3610e0995aa56c5e7a6af6f97c8ea92");
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static GoodsSku a(List<GoodsSku> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f7943b50b95ca92b93cc176c2fe3466", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsSku) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f7943b50b95ca92b93cc176c2fe3466");
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static OrderedFood a(List<OrderedFood> list, List<GoodsSku> list2, Map<String, List<GoodsAttr>> map) {
        Object[] objArr = {list, list2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a5c49c3d30ca372218dca0e937bfb356", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderedFood) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a5c49c3d30ca372218dca0e937bfb356");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90133470eaa28196328e1dad5b326262", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderedFood) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90133470eaa28196328e1dad5b326262");
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
