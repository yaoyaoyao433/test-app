package com.sankuai.waimai.store.platform.domain.manager.order;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static int a(GoodsSku goodsSku, int i, int i2) {
        Object[] objArr = {goodsSku, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d29b3dfefb4a51be932a1b6f26e1514f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d29b3dfefb4a51be932a1b6f26e1514f")).intValue();
        }
        int minOrderCount = goodsSku.getMinOrderCount();
        if (i <= 0) {
            int max = Math.max(i2, minOrderCount);
            if (max > 1) {
                return max;
            }
        } else if (minOrderCount >= i2) {
            int i3 = minOrderCount - i;
            if (i3 > 1) {
                return i3;
            }
        } else if (i2 > 0) {
            return i2;
        }
        return 1;
    }

    public static boolean a(OrderedFood orderedFood, GoodsSpu goodsSpu) {
        Object[] objArr = {orderedFood, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c9a3473fe6734ebe473ef076184af1a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c9a3473fe6734ebe473ef076184af1a")).booleanValue();
        }
        if (orderedFood == null || goodsSpu == null) {
            return false;
        }
        List<GoodsSku> skuList = goodsSpu.getSkuList();
        if (!com.sankuai.shangou.stone.util.a.b(skuList)) {
            for (GoodsSku goodsSku : skuList) {
                if (goodsSku != null && orderedFood.getSkuId() == goodsSku.getSkuId()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0c1d97452a93a242d9cf2b37cac5fc84", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0c1d97452a93a242d9cf2b37cac5fc84")).booleanValue() : goodsSpu != null && goodsSpu.getStatus() == 0;
    }
}
