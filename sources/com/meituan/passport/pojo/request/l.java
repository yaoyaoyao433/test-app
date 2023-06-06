package com.meituan.passport.pojo.request;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class l extends c {
    public static ChangeQuickRedirect a;
    public com.meituan.passport.clickaction.d<String> b;
    public com.meituan.passport.clickaction.d<String> c;
    public com.meituan.passport.clickaction.d<String> i;

    public l(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0b9110048d3a0ba3fa76f40213d6f5c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0b9110048d3a0ba3fa76f40213d6f5c");
            return;
        }
        this.b = com.meituan.passport.clickaction.d.a(str);
        this.c = com.meituan.passport.clickaction.d.a(str2);
        this.i = com.meituan.passport.clickaction.d.a(str3);
    }

    @Override // com.meituan.passport.pojo.request.b
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbdf395a8f2ee52bcd6472b018820399", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbdf395a8f2ee52bcd6472b018820399")).booleanValue() : (this.b == null || this.c == null || this.i == null) ? false : true;
    }

    @Override // com.meituan.passport.pojo.request.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "822b5d6ce2597619397c7ae0a5068698", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "822b5d6ce2597619397c7ae0a5068698");
            return;
        }
        this.b.a();
        this.c.a();
        this.i.a();
    }
}
