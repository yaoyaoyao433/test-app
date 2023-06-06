package com.dianping.networklog;

import com.dianping.logreportswitcher.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* loaded from: classes.dex */
public final class n implements s {
    public static ChangeQuickRedirect a;

    @Override // com.dianping.networklog.s
    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d740f016114aa25783e90280789b457", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d740f016114aa25783e90280789b457")).booleanValue() : c.b.a.a(str);
    }

    @Override // com.dianping.networklog.s
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad984e0e8685f4cbffaef8230492cede", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad984e0e8685f4cbffaef8230492cede") : c.b.a.b();
    }
}
