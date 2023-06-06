package com.sankuai.waimai.business.knb.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final a c = new a();
    public IKNBProvider b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f33a211ed0095927c893fa57973477a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f33a211ed0095927c893fa57973477a7");
        } else {
            this.b = (IKNBProvider) com.sankuai.waimai.router.a.a(IKNBProvider.class, "wm_knb");
        }
    }

    public static a a() {
        return c;
    }
}
