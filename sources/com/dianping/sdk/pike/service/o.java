package com.dianping.sdk.pike.service;

import android.content.Context;
import android.text.TextUtils;
import com.dianping.nvnetwork.v;
import com.dianping.nvnetwork.y;
import com.dianping.sdk.pike.packet.af;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import dianping.com.nvlinker.NVLinker;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class o implements com.dianping.nvtunnelkit.kit.a {
    public static ChangeQuickRedirect a;
    final n b;
    final com.dianping.nvlbservice.f c;
    final com.dianping.nvlbservice.f d;
    final AtomicBoolean e;
    private final Context f;
    private final AtomicBoolean g;
    private volatile long h;
    private final AtomicBoolean i;
    private final boolean j;
    private int k;
    private final Runnable l;

    public o(Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d098bcccacdf4f26087ce21b77add041", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d098bcccacdf4f26087ce21b77add041");
            return;
        }
        this.e = new AtomicBoolean(false);
        this.g = new AtomicBoolean(false);
        this.i = new AtomicBoolean(false);
        this.k = 0;
        this.l = new Runnable() { // from class: com.dianping.sdk.pike.service.o.5
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9a789cd46950a1b85842c84589e5277", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9a789cd46950a1b85842c84589e5277");
                } else if (o.this.e.get()) {
                    com.dianping.sdk.pike.i.a("PikeTunnelService", "pike r-close..");
                    o.this.b.k();
                }
            }
        };
        this.f = context.getApplicationContext();
        this.j = z;
        this.b = new n(this.f, new y(), com.dianping.sdk.pike.util.g.b(), this);
        this.b.l().a(new com.dianping.nvtunnelkit.ext.e() { // from class: com.dianping.sdk.pike.service.o.1
            public static ChangeQuickRedirect a;

            @Override // com.dianping.nvtunnelkit.ext.e
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "664a106706ee9e784ccaf31d69facf74", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "664a106706ee9e784ccaf31d69facf74");
                    return;
                }
                if (o.this.e()) {
                    com.dianping.sdk.pike.i.a("PikeTunnelService", "pike onHeartBeatReached, tunnel ready: true");
                } else {
                    com.dianping.sdk.pike.i.a("PikeTunnelService", "pike onHeartBeatReached, tunnel ready: false");
                }
                o.this.a(true, true);
            }
        });
        if (com.dianping.sdk.pike.f.o && com.dianping.nvtunnelkit.ext.d.a().b == null) {
            com.dianping.nvtunnelkit.ext.d.a().b = com.dianping.sdk.pike.f.e();
        }
        this.c = com.dianping.nvlbservice.b.a();
        this.d = com.dianping.nvlbservice.b.a(com.dianping.nvlbservice.m.PIKE, new com.dianping.nvlbservice.d() { // from class: com.dianping.sdk.pike.service.o.2
            public static ChangeQuickRedirect a;

            @Override // com.dianping.nvlbservice.d
            public final boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9c7ce2b54b6aecce09d9c9195082fcc6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9c7ce2b54b6aecce09d9c9195082fcc6")).booleanValue() : o.this.f();
            }

            @Override // com.dianping.nvlbservice.d
            public final String b() {
                return com.dianping.sdk.pike.f.h;
            }

            @Override // com.dianping.nvlbservice.d
            public final int c() {
                return com.dianping.sdk.pike.f.i * 1000;
            }
        });
        j();
        NVLinker.registerBackgroundStateListener(new NVLinker.AppBackgroundStateListener() { // from class: com.dianping.sdk.pike.service.o.3
            public static ChangeQuickRedirect a;

            @Override // dianping.com.nvlinker.NVLinker.AppBackgroundStateListener
            public final void onBackgroundStateChanged(boolean z2) {
                Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d3053344247f74de47559593e7bee828", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d3053344247f74de47559593e7bee828");
                    return;
                }
                StringBuilder sb = new StringBuilder("PikeClientService mode ");
                sb.append(z2 ? "background" : "foreground");
                com.dianping.sdk.pike.i.a("PikeTunnelService", sb.toString());
                o.this.a(!z2 ? 1 : 0, false);
            }
        });
    }

    void a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85e547793d04664c3d6ff28fa2c4abd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85e547793d04664c3d6ff28fa2c4abd7");
        } else if (this.g.compareAndSet(false, true)) {
            boolean b = b();
            if (b && this.e.get()) {
                this.e.set(false);
                com.dianping.nvtunnelkit.core.c.a().b(this.l);
            }
            if (b && (z || this.b.j())) {
                if (z2) {
                    if (this.b.b()) {
                        this.k = 0;
                    } else {
                        this.k++;
                        if (com.dianping.sdk.pike.f.B > 0 && this.k >= com.dianping.sdk.pike.f.B) {
                            com.dianping.sdk.pike.i.a("PikeTunnelService", "pike check state force close");
                            this.b.k();
                            this.k = 0;
                        }
                    }
                }
                com.dianping.sdk.pike.i.a("PikeTunnelService", "pike check state start");
                this.b.f();
            }
            if (!b && !this.b.j() && !this.e.get()) {
                com.dianping.sdk.pike.i.a("PikeTunnelService", "pike check state close");
                this.e.set(true);
                long j = com.dianping.sdk.pike.f.c;
                if (j <= 0) {
                    this.b.k();
                } else {
                    com.dianping.nvtunnelkit.core.c.a().a(this.l, j);
                }
            }
            this.g.set(false);
        }
    }

    public final void a(com.dianping.sdk.pike.j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8b9cd98e7204530f3338bb64d863fba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8b9cd98e7204530f3338bb64d863fba");
        } else {
            this.b.a(jVar);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f86ee31b692522d189d6eca62c53be4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f86ee31b692522d189d6eca62c53be4");
            return;
        }
        this.i.set(true);
        i();
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ffa5f476d2d4d5d1f9ca28878ca2769", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ffa5f476d2d4d5d1f9ca28878ca2769");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = currentTimeMillis - this.h > 150;
        this.h = currentTimeMillis;
        a(z, false);
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8b02dcebc79bfc0181b8a95d0b1e5c3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8b02dcebc79bfc0181b8a95d0b1e5c3")).booleanValue();
        }
        if (com.dianping.sdk.pike.f.q && this.i.get()) {
            return !NVLinker.isAppBackground() || com.dianping.sdk.pike.f.b;
        }
        return false;
    }

    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d0d27b315d54aa0db0bf325b4ecfce1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d0d27b315d54aa0db0bf325b4ecfce1")).booleanValue() : this.b.b();
    }

    public final void a(af afVar) {
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "604de4883ad3ffeb05377d60669016c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "604de4883ad3ffeb05377d60669016c5");
            return;
        }
        i();
        v vVar = new v();
        try {
            vVar.c = afVar.e;
            vVar.e = afVar.j;
            vVar.n = this.j;
            this.b.a_(vVar);
        } catch (Exception unused) {
            this.b.a(vVar, (com.dianping.nvtunnelkit.exception.d) new com.dianping.nvtunnelkit.exception.e());
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.a
    public final List<SocketAddress> c() {
        List<com.dianping.nvlbservice.h> a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c590ffa25a4128c5861443175e9c1deb", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c590ffa25a4128c5861443175e9c1deb");
        }
        if (this.b == null || this.b.j()) {
            return null;
        }
        com.dianping.nvlbservice.f fVar = f() ? this.d : this.c;
        Object[] objArr2 = {fVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "91862405f563f017bbbcca61177ed6e6", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "91862405f563f017bbbcca61177ed6e6");
        } else if (com.dianping.sdk.pike.f.C) {
            a2 = new ArrayList<>();
            a2.addAll(fVar.a(com.dianping.nvlbservice.m.PIKE));
            a2.addAll(fVar.a(com.dianping.nvlbservice.m.PIKE_IPV6));
        } else {
            a2 = fVar.a(com.dianping.nvlbservice.m.PIKE);
        }
        List<SocketAddress> a3 = com.dianping.sdk.pike.util.g.a(a2);
        com.dianping.sdk.pike.i.a("PikeTunnelService", "addresses: " + a3);
        return a3;
    }

    @Override // com.dianping.nvtunnelkit.kit.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c2420c3182b13fdacc1b3db8d0d8610", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c2420c3182b13fdacc1b3db8d0d8610");
        } else {
            j();
        }
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e35bd56344b86c758effe3244ccb3c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e35bd56344b86c758effe3244ccb3c6");
        } else {
            com.dianping.nvtunnelkit.core.c.a().a(new Runnable() { // from class: com.dianping.sdk.pike.service.o.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "177639264fdae46f4bbdd0497cc9cf26", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "177639264fdae46f4bbdd0497cc9cf26");
                    } else if (o.this.f()) {
                        if (o.this.d != null) {
                            o.this.d.a(com.dianping.sdk.pike.f.i * 1000);
                        }
                    } else if (o.this.c != null) {
                        o.this.c.a(0L);
                    }
                }
            });
        }
    }

    boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f9f395e5d35e694c8d4ced61dacc304", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f9f395e5d35e694c8d4ced61dacc304")).booleanValue() : com.dianping.sdk.pike.f.g && !TextUtils.isEmpty(com.dianping.sdk.pike.f.h) && com.dianping.sdk.pike.f.i > 0;
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e0c424792aa52ce481e8b940f7fc74a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e0c424792aa52ce481e8b940f7fc74a");
            return;
        }
        this.i.set(false);
        this.b.k();
    }

    public final String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0529f622e47cec9daeb4f70128725a74", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0529f622e47cec9daeb4f70128725a74");
        }
        try {
            List b = this.b.a().b();
            if (b.size() > 0) {
                return ((d) b.get(0)).q;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
