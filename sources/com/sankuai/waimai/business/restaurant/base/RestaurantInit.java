package com.sankuai.waimai.business.restaurant.base;

import android.app.Application;
import android.graphics.drawable.Drawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import com.sankuai.waimai.restaurant.shopcart.config.b;
import com.sankuai.waimai.router.method.Func1;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class RestaurantInit extends AbsInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public String tag() {
        return "RestaurantInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea1fe335156f47b48bb85c5abf8c3d8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea1fe335156f47b48bb85c5abf8c3d8a");
            return;
        }
        GlobalCartManager.getInstance().registerOrderManager(k.a());
        Func1 func1 = (Func1) com.sankuai.waimai.router.a.a(Func1.class, "/page/resource_controller_get_show_drawable", application);
        if (func1 != null) {
            b.a().b = (Drawable) func1.call("btn_shopping_cart_normal");
            b.a().c = (Drawable) func1.call("btn_shopping_cart_disabled");
        }
    }
}
