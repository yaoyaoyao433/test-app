package com.meituan.passport.pojo.request;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g<T> extends c {
    public static ChangeQuickRedirect a;
    public com.meituan.passport.clickaction.d<T> b;

    public g(com.meituan.passport.clickaction.d<T> dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3731aefbf0bd22a8d880eed9dd6527c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3731aefbf0bd22a8d880eed9dd6527c");
        } else {
            this.b = dVar;
        }
    }

    @Override // com.meituan.passport.pojo.request.b
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c31ee0ff4af714c62234255e4a13c5b1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c31ee0ff4af714c62234255e4a13c5b1")).booleanValue() : super.a() && this.b != null;
    }

    @Override // com.meituan.passport.pojo.request.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e617239f00b12e0a216d264bcce7ebc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e617239f00b12e0a216d264bcce7ebc0");
            return;
        }
        super.b();
        this.b.a();
    }
}
