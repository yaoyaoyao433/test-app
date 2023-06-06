package com.sankuai.waimai.restaurant.shopcart.utils;

import android.app.Activity;
import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static int a(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f91d29594e3000b29cb7af78406e5a23", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f91d29594e3000b29cb7af78406e5a23")).intValue() : goodsSpu.getSkuList().get(0).getStock();
    }

    public static int a(com.sankuai.waimai.business.restaurant.base.shopcart.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a00c06316595188db6bea14a3370bc4c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a00c06316595188db6bea14a3370bc4c")).intValue() : gVar.h.getFoodSku().getStock();
    }

    public static int a(String str, GoodsSpu goodsSpu) {
        Object[] objArr = {str, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "78ec0140b5c3b0b3719d44dba245e9ce", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "78ec0140b5c3b0b3719d44dba245e9ce")).intValue() : a(str, goodsSpu, goodsSpu.getSkuList().get(0));
    }

    public static int a(String str, GoodsSpu goodsSpu, GoodsSku goodsSku) {
        Object[] objArr = {str, goodsSpu, goodsSku};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "883d4970162b1b61e7d36dad45e61a2d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "883d4970162b1b61e7d36dad45e61a2d")).intValue() : k.a().n(str).a(goodsSpu.getId(), goodsSku.id);
    }

    public static void a(View view, boolean z) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "214be5a679fc844ce5cd6395f2c861cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "214be5a679fc844ce5cd6395f2c861cc");
        } else if (view != null) {
            view.setEnabled(z);
        }
    }

    public static void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6bd8fe0cb0041bac0657a5924a9e8451", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6bd8fe0cb0041bac0657a5924a9e8451");
        } else {
            ae.a(activity, com.meituan.android.singleton.b.a.getString(R.string.wm_restaurant_out_of_stock));
        }
    }
}
