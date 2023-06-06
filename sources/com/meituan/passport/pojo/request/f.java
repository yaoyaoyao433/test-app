package com.meituan.passport.pojo.request;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f extends c {
    public static ChangeQuickRedirect a;
    public com.meituan.passport.clickaction.d<String> b;

    public f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "069c4b42ff307fb4b183e273d5e12a4e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "069c4b42ff307fb4b183e273d5e12a4e");
        } else {
            this.b = com.meituan.passport.clickaction.d.a(str);
        }
    }

    @Override // com.meituan.passport.pojo.request.b
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "824220936df378e48635cbefcc9d211c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "824220936df378e48635cbefcc9d211c")).booleanValue() : super.a() && this.b != null;
    }

    @Override // com.meituan.passport.pojo.request.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18a2dd5e97cb495b559cc414262c4a68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18a2dd5e97cb495b559cc414262c4a68");
        } else {
            this.b.a();
        }
    }
}
