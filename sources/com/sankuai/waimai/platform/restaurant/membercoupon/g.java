package com.sankuai.waimai.platform.restaurant.membercoupon;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g {
    public static ChangeQuickRedirect a;

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f8b111d7f2a1e79a2d2354da272c36db", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f8b111d7f2a1e79a2d2354da272c36db")).booleanValue();
        }
        ABStrategy strategy = ABTestManager.getInstance().getStrategy("waimai-select-redpacket-entry", null);
        return strategy != null && "mach".equals(strategy.expName);
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ed2b8177a544f090cc3937928d3c087", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ed2b8177a544f090cc3937928d3c087")).booleanValue();
        }
        ABStrategy strategy = ABTestManager.getInstance().getStrategy("waimai-restaurant-member-coupon-entry", null);
        return strategy != null && "mach".equals(strategy.expName);
    }
}
