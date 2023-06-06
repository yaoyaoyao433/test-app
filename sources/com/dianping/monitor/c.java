package com.dianping.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c implements com.dianping.logreportswitcher.b {
    public static ChangeQuickRedirect a;
    private String b;
    private String c;

    @Override // com.dianping.logreportswitcher.b
    public final boolean c() {
        return false;
    }

    public c(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "376bce5ee03a11fdd2fb07f45284a311", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "376bce5ee03a11fdd2fb07f45284a311");
            return;
        }
        this.b = str;
        this.c = str2;
    }

    @Override // com.dianping.logreportswitcher.b
    public final String a() {
        return this.b;
    }

    @Override // com.dianping.logreportswitcher.b
    public final String b() {
        return this.c;
    }
}
