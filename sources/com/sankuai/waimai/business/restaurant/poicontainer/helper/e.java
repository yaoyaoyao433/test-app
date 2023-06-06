package com.sankuai.waimai.business.restaurant.poicontainer.helper;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static boolean a(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2f625eb91c6091dd0a9ab5863f82aa78", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2f625eb91c6091dd0a9ab5863f82aa78")).booleanValue() : goodsSpu != null && goodsSpu.isManySku() && goodsSpu.isDiscountGood();
    }

    public static boolean b(GoodsSpu goodsSpu) {
        List<GoodsSku> skus;
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "302f03c107b337b4acbd9cfc5e8869db", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "302f03c107b337b4acbd9cfc5e8869db")).booleanValue();
        }
        if (goodsSpu != null && (skus = goodsSpu.getSkus()) != null && skus.size() > 1) {
            for (GoodsSku goodsSku : skus) {
                if (goodsSku != null && goodsSku.isSoldable() && goodsSku.activityType == 1 && goodsSku.restrict > 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
