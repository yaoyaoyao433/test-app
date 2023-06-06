package com.sankuai.waimai.business.restaurant.base.manager.order;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static int a(GoodsSku goodsSku, int i, int i2) {
        Object[] objArr = {goodsSku, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6fd446d807b434518e12acc116f6d202", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6fd446d807b434518e12acc116f6d202")).intValue();
        }
        int minOrderCount = goodsSku.getMinOrderCount();
        if (i > 0) {
            int i3 = minOrderCount - i;
            if (i3 > i2) {
                return i3;
            }
        } else if (minOrderCount > i2) {
            return minOrderCount;
        }
        return i2;
    }

    public static void a(OrderedFood orderedFood, GoodsSpu goodsSpu) {
        boolean z = true;
        Object[] objArr = {orderedFood, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d947d4ddbd603f6354af661a6198d9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d947d4ddbd603f6354af661a6198d9f");
        } else if (orderedFood != null && goodsSpu != null && goodsSpu.getStatus() == 0) {
            Iterator<GoodsSku> it = goodsSpu.getSkuList().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().getSkuId() == orderedFood.getSkuId()) {
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                Map<String, List<GoodsAttr>> attrList = goodsSpu.getAttrList();
                GoodsAttr[] attrIds = orderedFood.getAttrIds();
                if (attrList == null || attrIds == null) {
                    return;
                }
                GoodsAttr[] goodsAttrArr = new GoodsAttr[attrIds.length];
                HashMap hashMap = new HashMap();
                for (int i = 0; i < goodsSpu.getAttrNameList().size(); i++) {
                    for (GoodsAttr goodsAttr : attrList.get(goodsSpu.getAttrNameList().get(i))) {
                        hashMap.put(Long.valueOf(goodsAttr.id), Integer.valueOf(i));
                    }
                }
                for (GoodsAttr goodsAttr2 : attrIds) {
                    Integer num = (Integer) hashMap.get(Long.valueOf(goodsAttr2.id));
                    if (num != null && num.intValue() >= 0 && num.intValue() < goodsAttrArr.length) {
                        goodsAttrArr[num.intValue()] = goodsAttr2;
                    }
                }
                orderedFood.setAttrIds(goodsAttrArr);
            }
        }
    }

    public static boolean b(OrderedFood orderedFood, GoodsSpu goodsSpu) {
        boolean z;
        boolean z2;
        Object[] objArr = {orderedFood, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "864321ad12f7c9949d43f9aae1be4d2e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "864321ad12f7c9949d43f9aae1be4d2e")).booleanValue();
        }
        if (orderedFood == null || goodsSpu == null || goodsSpu.getStatus() != 0) {
            return true;
        }
        Iterator<GoodsSku> it = goodsSpu.getSkuList().iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().getSkuId() == orderedFood.getSkuId()) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            if (orderedFood.getMode() != 999) {
                Map<String, List<GoodsAttr>> attrList = goodsSpu.getAttrList();
                GoodsAttr[] attrIds = orderedFood.getAttrIds();
                if (attrList != null && attrIds != null) {
                    int i = 0;
                    for (String str : goodsSpu.getAttrNameList()) {
                        Iterator<GoodsAttr> it2 = attrList.get(str).iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = false;
                                break;
                            }
                            GoodsAttr next = it2.next();
                            if (i < attrIds.length && next.equals(attrIds[i])) {
                                z2 = true;
                                break;
                            }
                        }
                        if (!z2) {
                            break;
                        }
                        i++;
                        if (i == attrIds.length) {
                            break;
                        }
                    }
                    if (i >= attrIds.length) {
                        return false;
                    }
                } else if ((attrList == null || attrList.size() == 0) && (attrIds == null || attrIds.length == 0)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean c(OrderedFood orderedFood, GoodsSpu goodsSpu) {
        Object[] objArr = {orderedFood, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        GoodsSku goodsSku = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "99d7ecc0f92aedb699c7495839bb2fb9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "99d7ecc0f92aedb699c7495839bb2fb9")).booleanValue();
        }
        if (orderedFood == null || goodsSpu == null || goodsSpu.getStatus() != 0) {
            return false;
        }
        int count = orderedFood.getCount();
        List<GoodsSku> skuList = goodsSpu.getSkuList();
        if (skuList == null) {
            return false;
        }
        for (GoodsSku goodsSku2 : skuList) {
            if (orderedFood.getSkuId() == goodsSku2.getSkuId()) {
                goodsSku = goodsSku2;
            }
        }
        if (goodsSku == null || goodsSku.getStock() == 0) {
            return false;
        }
        if (a(goodsSpu, goodsSku, 0, count)) {
            orderedFood.setCount(goodsSku.getStock());
        }
        int count2 = orderedFood.getCount();
        int minCount = orderedFood.getMinCount();
        return minCount <= 1 || count2 >= minCount || !a(orderedFood.spu, goodsSku, 0, minCount);
    }

    private static boolean a(GoodsSpu goodsSpu, GoodsSku goodsSku, int i, int i2) {
        Object[] objArr = {goodsSpu, goodsSku, 0, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7abe10b3e4c65d91c208bce0b8924323", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7abe10b3e4c65d91c208bce0b8924323")).booleanValue();
        }
        int stock = goodsSku.getStock();
        return stock >= 0 && i2 + 0 > stock;
    }

    public static boolean a(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c68af0f721d10d64c23f7285280a11e2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c68af0f721d10d64c23f7285280a11e2")).booleanValue() : goodsSpu != null && (goodsSpu.getStatus() == 0 || goodsSpu.getStatus() == 5);
    }
}
