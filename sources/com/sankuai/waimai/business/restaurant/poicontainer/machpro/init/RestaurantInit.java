package com.sankuai.waimai.business.restaurant.poicontainer.machpro.init;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.poicontainer.IRestaurantInit;
import com.sankuai.waimai.business.restaurant.poicontainer.machpro.price.a;
import com.sankuai.waimai.machpro.f;
import com.sankuai.waimai.restaurant.shopcart.ui.RestaurantMPModule;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class RestaurantInit implements IRestaurantInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.IRestaurantInit
    public void initRestaurant() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11cc4b0a624fed05b02bf094665f4b27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11cc4b0a624fed05b02bf094665f4b27");
            return;
        }
        f.a().b("price", a.class);
        f.a().b("roo-image", com.sankuai.waimai.business.restaurant.poicontainer.machpro.rooimage.a.class);
        f.a().b("iconfont", com.sankuai.waimai.business.restaurant.poicontainer.machpro.iconfont.a.class);
        f.a().a("RestaurantModule", RestaurantMPModule.class);
    }
}
