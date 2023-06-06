package com.dianping.nvtunnelkit.kit;

import com.dianping.nvtunnelkit.kit.w;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import dianping.com.nvlinker.NVLinker;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class f<C extends w> extends com.dianping.nvtunnelkit.ext.g<C> {
    public static ChangeQuickRedirect g;
    private volatile int e;
    private final e<C> f;
    String h;
    private volatile long i;
    private final AtomicReference<List<SocketAddress>> j;
    private final Comparator<C> k;
    private Runnable l;
    private Runnable m;
    private int n;
    private boolean o;

    public static /* synthetic */ void b(f fVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "7feddcee2fad33d94ac9032be071f5e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "7feddcee2fad33d94ac9032be071f5e5");
            return;
        }
        fVar.e++;
        if (fVar.e > 14) {
            fVar.e = 14;
        }
        long a2 = com.dianping.nvtunnelkit.utils.g.a(fVar.e) * 1000;
        com.dianping.nvtunnelkit.logger.b.b(fVar.h, "triggerReconnect Task, time: " + a2);
        com.dianping.nvtunnelkit.core.c.a().b(fVar.m);
        com.dianping.nvtunnelkit.core.c.a().a(fVar.m, a2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.ext.g
    public /* bridge */ /* synthetic */ void a(com.dianping.nvtunnelkit.conn.b bVar) {
        a((f<C>) ((w) bVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.ext.g, com.dianping.nvtunnelkit.core.g, com.dianping.nvtunnelkit.conn.d
    public /* bridge */ /* synthetic */ void a(com.dianping.nvtunnelkit.conn.c cVar) {
        a((f<C>) ((w) cVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.core.g, com.dianping.nvtunnelkit.conn.d
    public /* bridge */ /* synthetic */ void b(com.dianping.nvtunnelkit.conn.c cVar) {
        b((f<C>) ((w) cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double c(C c) {
        Object[] objArr = {c};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec0e5fe769bbe60228ff468b18442dd5", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec0e5fe769bbe60228ff468b18442dd5")).doubleValue() : c.g();
    }

    public f(e<C> eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ffe2ed97fb23d686ab32880ad0004d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ffe2ed97fb23d686ab32880ad0004d1");
            return;
        }
        this.k = (Comparator<C>) new Comparator<C>() { // from class: com.dianping.nvtunnelkit.kit.f.1
            public static ChangeQuickRedirect a;

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                w wVar = (w) obj;
                w wVar2 = (w) obj2;
                Object[] objArr2 = {wVar, wVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e839b225dc74cac4052044432839914", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e839b225dc74cac4052044432839914")).intValue() : Double.compare(f.this.c((f) wVar2), f.this.c((f) wVar));
            }
        };
        this.l = new Runnable() { // from class: com.dianping.nvtunnelkit.kit.f.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0bcc66e0b8a60ea1b0716e18e00e6d8b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0bcc66e0b8a60ea1b0716e18e00e6d8b");
                } else if (!f.this.f.j() && f.this.f.c.k) {
                    if (!f.this.f()) {
                        com.dianping.nvtunnelkit.logger.b.b(f.this.h, "no need to reconnect.");
                    } else {
                        f.b(f.this);
                    }
                }
            }
        };
        this.m = new Runnable() { // from class: com.dianping.nvtunnelkit.kit.f.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "affdc68f90474455188f76f0e2072944", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "affdc68f90474455188f76f0e2072944");
                } else {
                    f.this.a();
                }
            }
        };
        this.n = 0;
        this.o = false;
        this.f = eVar;
        this.j = new AtomicReference<>();
        this.h = com.dianping.nvtunnelkit.logger.a.a(eVar.c.b, "ConnectionManager");
    }

    @Override // com.dianping.nvtunnelkit.ext.g, com.dianping.nvtunnelkit.core.e
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e3574f96223bacc85c25f6483727f3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e3574f96223bacc85c25f6483727f3a");
        } else if (!this.f.j() && f()) {
            if (!com.dianping.nvtunnelkit.utils.c.a()) {
                com.dianping.nvtunnelkit.logger.b.b(this.h, "net work not connected.");
                h();
                return;
            }
            super.a();
        }
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a1145de994ae877f16b598e3cd15a03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a1145de994ae877f16b598e3cd15a03");
            return;
        }
        com.dianping.nvtunnelkit.core.c.a().b(this.l);
        com.dianping.nvtunnelkit.core.c.a().a(this.l, 500L);
    }

    @Override // com.dianping.nvtunnelkit.core.e
    public final List<SocketAddress> c() {
        ArrayList arrayList;
        AtomicReference<List<SocketAddress>> atomicReference;
        ArrayList arrayList2;
        InetAddress address;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7666fc0823d9fd1c38fae0e42fc96462", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7666fc0823d9fd1c38fae0e42fc96462");
        }
        if (com.dianping.nvtunnelkit.debug.a.a().b) {
            return this.f.e();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.j.get() != null && currentTimeMillis - this.i < LocationStrategy.LOCATION_TIMEOUT) {
            return this.j.get();
        }
        HashSet hashSet = new HashSet();
        try {
            if (this.f.c.n) {
                List<SocketAddress> c = this.f.c();
                if (com.dianping.nvtunnelkit.utils.a.c(c)) {
                    hashSet.addAll(c);
                }
            }
            List<SocketAddress> e = this.f.e();
            if (com.dianping.nvtunnelkit.utils.a.c(e)) {
                hashSet.addAll(e);
            }
            if (this.f.c.m) {
                List<com.dianping.nvtunnelkit.ext.c> d = this.f.d();
                if (com.dianping.nvtunnelkit.utils.a.c(d)) {
                    long j = this.f.c.v.k;
                    loop0: for (com.dianping.nvtunnelkit.ext.c cVar : d) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            if (com.dianping.nvtunnelkit.utils.a.a(hashSet) <= this.d) {
                                arrayList = new ArrayList(hashSet);
                                this.i = currentTimeMillis;
                                atomicReference = this.j;
                                arrayList2 = new ArrayList(hashSet);
                                break loop0;
                            }
                            SocketAddress socketAddress = (SocketAddress) it.next();
                            if ((socketAddress instanceof InetSocketAddress) && (address = ((InetSocketAddress) socketAddress).getAddress()) != null && cVar != null && com.dianping.nvtunnelkit.utils.f.a(address.getHostAddress(), cVar.b) && com.dianping.nvtunnelkit.utils.c.c() == cVar.d && System.currentTimeMillis() - cVar.c < j) {
                                it.remove();
                            }
                        }
                    }
                }
            }
            arrayList = new ArrayList(hashSet);
            this.i = currentTimeMillis;
            atomicReference = this.j;
            arrayList2 = new ArrayList(hashSet);
            atomicReference.set(arrayList2);
            return arrayList;
        } catch (Throwable th) {
            this.i = currentTimeMillis;
            this.j.set(new ArrayList(hashSet));
            throw th;
        }
    }

    @Override // com.dianping.nvtunnelkit.ext.g, com.dianping.nvtunnelkit.core.g
    public final String e() {
        return this.h;
    }

    public void b(C c) {
        Object[] objArr = {c};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c882c8c88bf5da0346f821b91a305c64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c882c8c88bf5da0346f821b91a305c64");
            return;
        }
        super.b((f<C>) c);
        if (c != null) {
            String str = this.h;
            com.dianping.nvtunnelkit.logger.b.b(str, "onConnectClosed, connection: " + c.hashCode());
        }
        h();
    }

    public void a(C c) {
        Object[] objArr = {c};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6047fd031b423c19260581a3566c47bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6047fd031b423c19260581a3566c47bf");
            return;
        }
        super.a((f<C>) c);
        this.e = 0;
        if (this.f.j()) {
            com.dianping.nvtunnelkit.logger.b.b(this.h, "tunnel closed, close this conn.");
            b((f<C>) c);
        }
    }

    @Override // com.dianping.nvtunnelkit.ext.g, com.dianping.nvtunnelkit.core.e
    public final void a(List<C> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6117b0bdd2cb219a4e0251093f1a15b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6117b0bdd2cb219a4e0251093f1a15b7");
            return;
        }
        super.a(list);
        if (list.size() == 1) {
            c((f<C>) list.get(0));
        } else {
            Collections.sort(list, this.k);
        }
    }

    @Override // com.dianping.nvtunnelkit.ext.g
    public final com.dianping.nvtunnelkit.ext.a<C> b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "707427f76dd34a3d593405146c1048ea", RobustBitConfig.DEFAULT_VALUE) ? (com.dianping.nvtunnelkit.ext.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "707427f76dd34a3d593405146c1048ea") : new a(this.f, this, i);
    }

    @Override // com.dianping.nvtunnelkit.ext.g
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2566f580a9b45b4bd192da6a48ab8d38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2566f580a9b45b4bd192da6a48ab8d38");
        } else {
            this.o = NVLinker.isAppBackground();
        }
    }

    @Override // com.dianping.nvtunnelkit.ext.g
    public final void c(int i) {
        boolean z = true;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40a1b2d80356924c499b36cde33f7915", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40a1b2d80356924c499b36cde33f7915");
            return;
        }
        try {
            if (!this.o && !NVLinker.isAppBackground()) {
                int i2 = i > 0 ? 200 : -200;
                if (this.n != 0 && i2 == this.n) {
                    z = false;
                }
                this.n = i2;
                if (z) {
                    com.dianping.nvtunnelkit.ext.d.a().pv4(0L, this.f.c.b + "_racing_complete", 0, 0, i2, 0, 0, 0, "", "", this.f.c.s);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class a<C extends w> extends com.dianping.nvtunnelkit.ext.a<C> {
        public static ChangeQuickRedirect e;
        private final e<C> f;
        private final String g;

        @Override // com.dianping.nvtunnelkit.ext.a
        public final /* synthetic */ com.dianping.nvtunnelkit.conn.b a(SocketAddress socketAddress) {
            Object[] objArr = {socketAddress};
            ChangeQuickRedirect changeQuickRedirect = e;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1617b3906eb774f3fdcfaa7e27ae5565", RobustBitConfig.DEFAULT_VALUE) ? (w) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1617b3906eb774f3fdcfaa7e27ae5565") : this.f.a(socketAddress);
        }

        public a(e<C> eVar, com.dianping.nvtunnelkit.conn.d dVar, int i) {
            super(dVar, i);
            Object[] objArr = {eVar, dVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3eee8ac7d257b76a9da1686d0c0d04ae", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3eee8ac7d257b76a9da1686d0c0d04ae");
                return;
            }
            this.f = eVar;
            this.g = com.dianping.nvtunnelkit.logger.a.a(this.f.c.b, "MyConnectRacingTask");
            if (this.f.c.w.p) {
                rx.g a = rx.schedulers.a.a(com.sankuai.android.jarvis.c.a("connect_racing_thread_jarvis", "connect_racing_thread_" + this.f.c.b, 60L));
                if (a != null) {
                    this.d = a;
                }
            }
        }

        @Override // com.dianping.nvtunnelkit.ext.a
        public final String a() {
            return this.g;
        }
    }
}
