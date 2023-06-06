package com.sankuai.waimai.business.restaurant.base.abtest;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.RestaurantSP;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.monitor.model.ErrorCode;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.platform.capacity.abtest.a {
    public static ChangeQuickRedirect a;

    public static ABStrategy a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "13474ce69f7113526f6cc48f3149ba44", RobustBitConfig.DEFAULT_VALUE) ? (ABStrategy) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "13474ce69f7113526f6cc48f3149ba44") : a("wm_cart_api_test", null);
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "836d16419de53d443783156ab2aa294d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "836d16419de53d443783156ab2aa294d")).booleanValue();
        }
        int a2 = RestaurantSP.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        ABStrategy a3 = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "17fbe0b303bfb433cb46104aba0f82ea", RobustBitConfig.DEFAULT_VALUE) ? (ABStrategy) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "17fbe0b303bfb433cb46104aba0f82ea") : a("waimai_localcart_session_cache", null);
        if (a3 != null && a3.expName.equals(ErrorCode.ERROR_TYPE_B) && a2 > 0) {
            com.sankuai.waimai.foundation.utils.log.a.b("ShopCartSession", " use session cache ! sessionInterval = " + a2, new Object[0]);
            return true;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("ShopCartSession", " don't use session cache !", new Object[0]);
        return false;
    }
}
