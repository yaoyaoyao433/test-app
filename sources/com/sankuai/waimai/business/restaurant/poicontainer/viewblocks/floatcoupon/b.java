package com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon;

import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b extends com.sankuai.waimai.business.restaurant.framework.a {
    public static ChangeQuickRedirect l;
    protected Fragment m;

    public b(Fragment fragment) {
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1e81ed40ec29166473b4be41a2647eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1e81ed40ec29166473b4be41a2647eb");
        } else {
            this.m = fragment;
        }
    }

    public final Fragment h() {
        return this.m;
    }
}
