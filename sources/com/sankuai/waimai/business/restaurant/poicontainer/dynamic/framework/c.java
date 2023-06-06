package com.sankuai.waimai.business.restaurant.poicontainer.dynamic.framework;

import android.support.annotation.LayoutRes;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;

    @LayoutRes
    public static int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a6cda51417e89d9e907ed08b09b08a30", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a6cda51417e89d9e907ed08b09b08a30")).intValue();
        }
        if (str.hashCode() != 113114) {
            return R.layout.wm_restaurant_market_adapter_goods_dynamic;
        }
        str.equals("row");
        return R.layout.wm_restaurant_market_adapter_goods_dynamic;
    }
}
