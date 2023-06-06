package com.sankuai.waimai.business.restaurant;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.business.restaurant.goodsdetail.GoodDetailActivity;
import com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity;
import com.sankuai.waimai.router.core.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.router.activity.a {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.router.activity.a
    @NonNull
    public final Intent b(@NonNull j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb2364275a4b20acb7952cc8f2c9f71e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb2364275a4b20acb7952cc8f2c9f71e");
        }
        Intent intent = new Intent(jVar.c, GoodDetailActivity.class);
        Context context = jVar.c;
        if (context instanceof WMRestaurantActivity) {
            intent.putExtra(FoodDetailNetWorkPreLoader.INTENT_POI, ((WMRestaurantActivity) context).h());
        }
        return intent;
    }
}
