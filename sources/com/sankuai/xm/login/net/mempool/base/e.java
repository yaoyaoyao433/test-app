package com.sankuai.xm.login.net.mempool.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class e<T> {
    public static ChangeQuickRedirect a;
    protected int b;
    protected int c;
    protected d<T> d;

    public abstract d<T> d();

    public e(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bd2b92a2f3ce0c40b995f92e138f07c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bd2b92a2f3ce0c40b995f92e138f07c");
            return;
        }
        this.b = i;
        this.c = i2;
        if (this.c < 4096) {
            this.c = 4096;
        }
        if (this.b < this.c) {
            this.b = this.c;
        }
        e();
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcfb9854a2db7a89d36298e286212a9d", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcfb9854a2db7a89d36298e286212a9d")).intValue();
        }
        d<T> dVar = this.d;
        while (dVar != null) {
            i += dVar.c();
            dVar = dVar.b();
            if (dVar == null) {
                break;
            }
        }
        return i;
    }

    public final d<T> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45e5d898589a8d41fb092bb29f115d22", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45e5d898589a8d41fb092bb29f115d22");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "15d5f1a6d7ba04880ec3c63f69a96c5a", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "15d5f1a6d7ba04880ec3c63f69a96c5a");
        }
        if (this.d == null) {
            return null;
        }
        d<T> b = this.d.b();
        d<T> dVar = this.d;
        dVar.a((d) null);
        this.d = b;
        return dVar;
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d34bb8981d13bd1f49a4f11e10508bcd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d34bb8981d13bd1f49a4f11e10508bcd");
            return;
        }
        int i = (this.b / this.c) + (this.b % this.c > 0 ? 1 : 0);
        for (int i2 = 0; i2 < i; i2++) {
            a(d());
        }
    }

    public final boolean a(d<T> dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cf041ecf8a5cb457f62e986abb47dfa", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cf041ecf8a5cb457f62e986abb47dfa")).booleanValue();
        }
        if (dVar == null) {
            return false;
        }
        if (this.d == null) {
            this.d = dVar;
        } else {
            dVar.a(this.d);
            this.d = dVar;
        }
        return true;
    }
}
