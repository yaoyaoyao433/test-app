package com.sankuai.xm.base.trace;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private g b;

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c20f341d38717efd3f425be708d588dd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c20f341d38717efd3f425be708d588dd");
            return;
        }
        g a2 = j.a();
        if (a2 == null) {
            return;
        }
        if (this.b == null) {
            this.b = a2;
        } else {
            this.b.b(a2.b);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e49320f974ed4ef95d9e00adeddcc336", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e49320f974ed4ef95d9e00adeddcc336");
        } else {
            j.b(this.b);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0930edad8116536e8535383f8b65adfe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0930edad8116536e8535383f8b65adfe");
        } else {
            j.c(this.b);
        }
    }

    public final void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10ae3956dce64b4c62dc09d6fca1f9d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10ae3956dce64b4c62dc09d6fca1f9d5");
        } else {
            j.a(this.b, th);
        }
    }
}
