package com.sankuai.waimai.restaurant.shopcart.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class q extends com.meituan.android.cube.pga.viewmodel.a {
    public static ChangeQuickRedirect o;

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final Boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33669c81487c591a767534091ce9add3", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33669c81487c591a767534091ce9add3") : Boolean.TRUE;
    }
}
