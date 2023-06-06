package com.sankuai.waimai.router.generated;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.common.IPageAnnotationInit;
import com.sankuai.waimai.router.common.e;
import com.sankuai.waimai.router.core.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class UriRouter_RouterPage_4e7fa537e4bf58dcf2530671eec15e7a implements IPageAnnotationInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.router.components.b
    public void init(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4508922955c3740ce2132fe87061ca30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4508922955c3740ce2132fe87061ca30");
            return;
        }
        eVar.a("/restaurant", "com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity", new i[0]);
        eVar.a("/restrictrestaurant", "com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity", new i[0]);
        eVar.a("/selfdeliveryshop", "com.sankuai.waimai.business.restaurant.poicontainer.selfdelivery.SelfDeliveryRestaurantActivity", new i[0]);
        eVar.a("/goodsdetail", "com.sankuai.waimai.business.restaurant.goodsdetail.GoodDetailActivity", new i[0]);
        eVar.a("/webimagepreview", "com.sankuai.waimai.business.restaurant.base.WebImagePreviewActivity", new i[0]);
    }
}
