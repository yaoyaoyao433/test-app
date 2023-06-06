package com.dianping.nvnetwork.shark.monitor;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class c {
    public static ChangeQuickRedirect a;
    private static c n;
    final k b;
    final k c;
    final k d;
    e e;
    b f;
    g g;
    i h;
    long i;
    long j;
    int k;
    int l;
    int m;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e785607c92c46546086b85ca41fffe8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e785607c92c46546086b85ca41fffe8");
            return;
        }
        this.b = new k();
        this.c = new k();
        this.d = new k();
        this.f = new b();
        this.g = new g(2);
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c8022715e3e66cba06b3d3700b8617c7", 6917529027641081856L)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c8022715e3e66cba06b3d3700b8617c7");
        }
        if (n == null) {
            synchronized (c.class) {
                if (n == null) {
                    n = new c();
                }
            }
        }
        return n;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e45402b3f68203d7244f88bc5b426219", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e45402b3f68203d7244f88bc5b426219");
        } else if (c()) {
            d();
        }
    }

    private boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9123a3f9b2a3ed6b700730858e4ff5d", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9123a3f9b2a3ed6b700730858e4ff5d")).booleanValue();
        }
        int i = this.k + this.l + this.m;
        return com.dianping.nvnetwork.shark.g.a() - this.i > 10000 || this.j - this.i > 0 || i > 32 || i > (((this.b.b + this.c.b) + this.d.b) >> 1);
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de1e82bfb678becd60ad7668cc704b4e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de1e82bfb678becd60ad7668cc704b4e");
            return;
        }
        long a2 = com.dianping.nvnetwork.shark.g.a();
        g gVar = new g(2);
        if (com.dianping.nvtunnelkit.utils.c.a()) {
            gVar.b = a2;
            int a3 = f.a();
            gVar.c = a3;
            gVar.d = this.c.a(a2, a3);
            if (gVar.d <= 0.0d) {
                g a4 = this.f.a(a3);
                gVar.d = a4 != null ? a4.d : 0.0d;
            }
            gVar.e = this.b.a(a2, a3);
            gVar.f = this.d.a(a2, a3);
            com.dianping.nvnetwork.util.g.a("NetDataProcess", "networkId = " + a3 + " ,TcpRTT = " + gVar.d + " ,HttpRTT = " + gVar.e + " ,ThroughPut = " + gVar.f);
            this.f.a(gVar);
            this.e = a(gVar);
        } else {
            this.e = e.OFFLINE;
        }
        this.g = gVar;
        this.h.a(this.e, gVar);
        this.i = a2;
        this.k = 0;
        this.l = 0;
        this.m = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e a(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c6d7396cd6bae5f162c1d32ad4f34ba", 6917529027641081856L)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c6d7396cd6bae5f162c1d32ad4f34ba");
        }
        if (gVar.d < 5.0d) {
            return e.UNKNOWN;
        }
        if (gVar.d < d.a().d()) {
            return e.GOOD;
        }
        if (gVar.d < d.a().e()) {
            return e.MODERATE;
        }
        return e.BAD;
    }
}
