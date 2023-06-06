package com.sankuai.waimai.restaurant.shopcart.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static boolean a() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7efdad8f332f1212be360b7d13b97446", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7efdad8f332f1212be360b7d13b97446")).booleanValue();
        }
        if (com.sankuai.waimai.foundation.core.a.e()) {
            str = "mt_restaurant_mach_pro_shop_cart_android_group1";
        } else {
            str = com.sankuai.waimai.foundation.core.a.f() ? "dp_restaurant_mach_pro_shop_cart_android_group1" : "wm_restaurant_mach_pro_shop_cart_android_group1";
        }
        ABStrategy strategy = ABTestManager.getInstance(com.meituan.android.singleton.b.a).getStrategy(str, null);
        return strategy != null && ErrorCode.ERROR_TYPE_B.equalsIgnoreCase(strategy.expName);
    }
}
