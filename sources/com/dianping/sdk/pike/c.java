package com.dianping.sdk.pike;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Pair;
import com.dianping.sdk.pike.packet.aa;
import com.dianping.sdk.pike.packet.n;
import com.dianping.sdk.pike.packet.p;
import com.dianping.sdk.pike.packet.w;
import com.dianping.sdk.pike.service.q;
import com.dianping.sdk.pike.service.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class c implements com.dianping.sdk.pike.service.a {
    public static ChangeQuickRedirect a;
    Context b;
    public final e c;
    public q d;
    final AtomicBoolean e;
    public com.dianping.sdk.pike.auth.b f;
    com.dianping.sdk.pike.auth.a g;
    volatile String h;
    final AtomicReference<a> i;
    final AtomicBoolean j;
    final AtomicInteger k;
    final AtomicInteger l;
    List<Pair<Runnable, com.dianping.sdk.pike.a>> m;
    AtomicBoolean n;
    final com.dianping.sdk.pike.service.f o;
    final Runnable p;
    private volatile long q;
    private final Runnable r;

    public abstract void b(@NonNull String str);

    public abstract void c(@NonNull String str);

    public static /* synthetic */ void a(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "88a794b42c6fcfba8eeacf8444ca2c8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "88a794b42c6fcfba8eeacf8444ca2c8f");
            return;
        }
        synchronized (cVar.m) {
            cVar.f();
            i.a("PikeBaseClient", cVar.d("checkAuth: check authCacheList size: " + cVar.m.size()));
            if (!cVar.m.isEmpty() && cVar.e.get()) {
                for (Pair<Runnable, com.dianping.sdk.pike.a> pair : cVar.m) {
                    if (cVar.d != null) {
                        ((Runnable) pair.first).run();
                    } else {
                        cVar.a((com.dianping.sdk.pike.a) pair.second, -65, "raw client is null");
                    }
                }
            }
            cVar.m.clear();
        }
    }

    public static /* synthetic */ void a(c cVar, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "fc22b39d63cb59c3a2e5f8e8e1a8ba03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "fc22b39d63cb59c3a2e5f8e8e1a8ba03");
        } else if (cVar.q > 0) {
            com.dianping.sdk.pike.util.f.a(str, (int) (com.dianping.sdk.pike.util.g.c() - cVar.q));
            cVar.q = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum a {
        NeedAuth,
        Fail,
        Success;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c44ec91d45b2150079a892277037d66", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c44ec91d45b2150079a892277037d66");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "52d0207c93127163bdd9bbcfe79e470b", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "52d0207c93127163bdd9bbcfe79e470b") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ef7c6955ba9b3d86c4011b9b3f258ca", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ef7c6955ba9b3d86c4011b9b3f258ca") : (a[]) values().clone();
        }
    }

    public c(@NonNull Context context, @NonNull e eVar) {
        Object[] objArr = {context, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfb732e22d636f854c8e58ce6e9bbb72", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfb732e22d636f854c8e58ce6e9bbb72");
            return;
        }
        this.m = new ArrayList();
        this.n = new AtomicBoolean(false);
        this.o = new com.dianping.sdk.pike.service.f();
        this.p = new Runnable() { // from class: com.dianping.sdk.pike.c.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "810e9f4eef39e4ae977df4c19e7a7bd7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "810e9f4eef39e4ae977df4c19e7a7bd7");
                } else if (c.this.j.compareAndSet(false, true) && c.this.e.get() && c.this.d != null) {
                    p pVar = new p();
                    pVar.b = c.this.c.a;
                    pVar.e = c.this.c.c;
                    pVar.c = c.this.k.get() == 0 ? c.this.c.b : null;
                    pVar.d = c.this.k.get() == 0 ? 1 : 2;
                    pVar.f = c.this.h;
                    q qVar = c.this.d;
                    com.dianping.sdk.pike.a aVar = new com.dianping.sdk.pike.a() { // from class: com.dianping.sdk.pike.c.2.1
                        public static ChangeQuickRedirect a;

                        @Override // com.dianping.sdk.pike.a
                        public final void a(String str) {
                            Object[] objArr3 = {str};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "34ff47d073db31ec6fc5a8ea4b7003a1", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "34ff47d073db31ec6fc5a8ea4b7003a1");
                                return;
                            }
                            c.this.j.set(false);
                            c.this.l.set(0);
                            c.this.i.set(a.Success);
                            c.a(c.this);
                            c.this.k.incrementAndGet();
                            if (c.this.k.get() == 1) {
                                if (c.this.f != null) {
                                    c.this.f.a(c.this.g.a);
                                }
                                c.a(c.this, c.this.c.a);
                            }
                            c.this.d.a(true);
                        }

                        @Override // com.dianping.sdk.pike.a
                        public final void a(int i, String str) {
                            Object[] objArr3 = {Integer.valueOf(i), str};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3bb9008b9a0f0ca1bef0cf2380aa5e6a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3bb9008b9a0f0ca1bef0cf2380aa5e6a");
                                return;
                            }
                            c.this.j.set(false);
                            if (i == -60) {
                                c.this.i.set(a.Fail);
                                c.a(c.this);
                                c.this.e();
                                if (c.this.f != null) {
                                    c.this.f.a(i, str);
                                }
                                c.a(c.this, c.this.c.a);
                                return;
                            }
                            c.this.l.incrementAndGet();
                            int i2 = c.this.l.get();
                            if (i2 > 10) {
                                i2 = 10;
                            }
                            com.dianping.nvtunnelkit.core.c.a().a(c.this.p, com.dianping.nvtunnelkit.utils.g.a(i2) * 1000);
                            if (i2 >= 3) {
                                c.this.d.a(false);
                            }
                        }
                    };
                    Object[] objArr3 = {pVar, aVar};
                    ChangeQuickRedirect changeQuickRedirect3 = q.a;
                    if (PatchProxy.isSupport(objArr3, qVar, changeQuickRedirect3, false, "29cca74cc1c5610a6ce38f9fb427ddac", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, qVar, changeQuickRedirect3, false, "29cca74cc1c5610a6ce38f9fb427ddac");
                    } else {
                        qVar.a(pVar, aVar);
                    }
                }
            }
        };
        this.r = new Runnable() { // from class: com.dianping.sdk.pike.c.6
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "32b0f5181d12249d1190a361ed1e9772", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "32b0f5181d12249d1190a361ed1e9772");
                    return;
                }
                synchronized (c.this.m) {
                    if (!c.this.m.isEmpty() && c.this.e.get()) {
                        for (Pair<Runnable, com.dianping.sdk.pike.a> pair : c.this.m) {
                            c.this.a((com.dianping.sdk.pike.a) pair.second, -64, "auth timeout");
                        }
                    }
                    c.this.m.clear();
                    c.this.n.set(false);
                }
            }
        };
        this.b = context.getApplicationContext();
        this.c = eVar;
        this.e = new AtomicBoolean(false);
        this.g = new com.dianping.sdk.pike.auth.a();
        this.i = new AtomicReference<>(a.NeedAuth);
        this.j = new AtomicBoolean(false);
        this.k = new AtomicInteger(0);
        this.l = new AtomicInteger(0);
        if (com.dianping.nvtunnelkit.utils.f.a(eVar.a)) {
            i.b("PikeBaseClient", "biz id can not be empty.");
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "741e69a7cf6101c5167e6adaaf9091a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "741e69a7cf6101c5167e6adaaf9091a1");
        } else if (!f.q) {
            i.a("PikeBaseClient", "pike global disable.");
        } else {
            final String str = this.c.a;
            if (com.dianping.nvtunnelkit.utils.f.a(str)) {
                i.b("PikeBaseClient", "biz id can not be empty.");
            } else if (this.e.compareAndSet(false, true)) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c2d6941e2cacb427f86f515300ffb64f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c2d6941e2cacb427f86f515300ffb64f");
                } else {
                    this.q = com.dianping.sdk.pike.util.g.c();
                    a(true);
                }
                h.a(new Runnable() { // from class: com.dianping.sdk.pike.c.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "51cfa42388983fa45e58dc93d18fd2d1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "51cfa42388983fa45e58dc93d18fd2d1");
                            return;
                        }
                        c.this.d = com.dianping.sdk.pike.service.e.a(c.this.b).a(str);
                        final r rVar = c.this.d.j;
                        final String str2 = str;
                        final c cVar = c.this;
                        Object[] objArr4 = {str2, cVar};
                        ChangeQuickRedirect changeQuickRedirect4 = r.a;
                        if (PatchProxy.isSupport(objArr4, rVar, changeQuickRedirect4, false, "e5e9969f826798877120ea08c7b8fe4c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, rVar, changeQuickRedirect4, false, "e5e9969f826798877120ea08c7b8fe4c");
                        } else if (!com.dianping.nvtunnelkit.utils.f.a(str2)) {
                            rVar.b.a(new Runnable() { // from class: com.dianping.sdk.pike.service.r.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    List<a> arrayList;
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "b5f0999a56d2a42602c0c314d4e1240e", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "b5f0999a56d2a42602c0c314d4e1240e");
                                        return;
                                    }
                                    if (r.this.c.containsKey(str2)) {
                                        com.dianping.sdk.pike.i.a("ReceiverManager", "bizId: " + str2 + " event listener registered, do overwrite the previous.");
                                        arrayList = r.this.c.get(str2);
                                    } else {
                                        arrayList = new ArrayList<>();
                                        r.this.c.put(str2, arrayList);
                                    }
                                    if (arrayList.contains(cVar)) {
                                        return;
                                    }
                                    arrayList.add(cVar);
                                }
                            });
                        }
                        com.dianping.sdk.pike.service.f fVar = c.this.o;
                        String str3 = str;
                        q qVar = c.this.d;
                        fVar.b = str3;
                        fVar.c = qVar;
                        c.this.b(str);
                        c.this.b();
                    }
                });
            }
        }
    }

    void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6f0d5b548a31c963df2a21affd8602b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6f0d5b548a31c963df2a21affd8602b");
        } else {
            this.p.run();
        }
    }

    void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c5bc13b763f5a8c9ae2e303fde7f3dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c5bc13b763f5a8c9ae2e303fde7f3dc");
            return;
        }
        this.j.set(false);
        com.dianping.nvtunnelkit.core.c.a().b(this.p);
        if (z) {
            this.i.set(a.NeedAuth);
            this.k.set(0);
        }
    }

    @Override // com.dianping.sdk.pike.service.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fb05fb92656732bbc925fdc064580b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fb05fb92656732bbc925fdc064580b5");
        } else {
            a(false);
        }
    }

    @Override // com.dianping.sdk.pike.service.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfb3b0eea8651d55f643dc2e8d6feab0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfb3b0eea8651d55f643dc2e8d6feab0");
        } else if (this.g.b || a.NeedAuth.equals(this.i.get())) {
            b();
        }
    }

    @Override // com.dianping.sdk.pike.service.a
    public final void a(com.dianping.sdk.pike.auth.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08d61e02d770fcc1ef7362bd5ea00e24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08d61e02d770fcc1ef7362bd5ea00e24");
            return;
        }
        this.g = aVar;
        final com.dianping.sdk.pike.service.f fVar = this.o;
        final com.dianping.sdk.pike.message.c cVar = aVar.c;
        Object[] objArr2 = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.sdk.pike.service.f.a;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "8384e9047670a2d9952ee2faa0e2aa26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "8384e9047670a2d9952ee2faa0e2aa26");
        } else {
            fVar.a(new Runnable() { // from class: com.dianping.sdk.pike.service.f.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a9aab46bd2c2d7bbf5174a327372ccba", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a9aab46bd2c2d7bbf5174a327372ccba");
                    } else if (f.this.g || cVar == null) {
                    } else {
                        f.this.g = true;
                        f.this.d = cVar;
                    }
                }
            });
        }
    }

    @Override // com.dianping.sdk.pike.service.a
    public final void a(String str) {
        this.h = str;
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6b1bbc0f4831d9d27672b8297f2b21a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6b1bbc0f4831d9d27672b8297f2b21a");
        } else if (!f.q) {
            i.a("PikeBaseClient", "pike global disable.");
        } else {
            final String str = this.c.a;
            if (com.dianping.nvtunnelkit.utils.f.a(str)) {
                i.b("PikeBaseClient", "biz id can not be empty.");
            } else if (this.e.compareAndSet(true, false)) {
                h.a(new Runnable() { // from class: com.dianping.sdk.pike.c.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "151192b0c0ae43c603c9d54a4bb9ba1e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "151192b0c0ae43c603c9d54a4bb9ba1e");
                            return;
                        }
                        c.this.c(str);
                        c.this.f();
                        c.this.a(false);
                        if (c.this.d != null) {
                            final r rVar = c.this.d.j;
                            final String str2 = str;
                            final c cVar = c.this;
                            Object[] objArr3 = {str2, cVar};
                            ChangeQuickRedirect changeQuickRedirect3 = r.a;
                            if (PatchProxy.isSupport(objArr3, rVar, changeQuickRedirect3, false, "05aa4165e66d1dbf5e5e40725651e6be", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, rVar, changeQuickRedirect3, false, "05aa4165e66d1dbf5e5e40725651e6be");
                            } else if (!com.dianping.nvtunnelkit.utils.f.a(str2)) {
                                rVar.b.a(new Runnable() { // from class: com.dianping.sdk.pike.service.r.2
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr4 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e10f14f49a6df8469f678352522c0a8c", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e10f14f49a6df8469f678352522c0a8c");
                                            return;
                                        }
                                        List<a> list = r.this.c.get(str2);
                                        if (list != null) {
                                            list.remove(cVar);
                                            if (list.isEmpty()) {
                                                r.this.c.remove(str2);
                                            }
                                        }
                                    }
                                });
                            }
                            final q qVar = c.this.d;
                            final String str3 = str;
                            Object[] objArr4 = {str3, null};
                            ChangeQuickRedirect changeQuickRedirect4 = q.a;
                            if (PatchProxy.isSupport(objArr4, qVar, changeQuickRedirect4, false, "676a9bf65f2a7496ec87a3477fca019a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, qVar, changeQuickRedirect4, false, "676a9bf65f2a7496ec87a3477fca019a");
                            } else if (com.dianping.nvtunnelkit.utils.f.a(str3)) {
                            } else {
                                qVar.a(new Runnable() { // from class: com.dianping.sdk.pike.service.q.24
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean z = false;
                                        Object[] objArr5 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a21c7b4ef49c0eddc2c8c3cc10b1989e", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a21c7b4ef49c0eddc2c8c3cc10b1989e");
                                            return;
                                        }
                                        q qVar2 = q.this;
                                        String str4 = str3;
                                        Object[] objArr6 = {str4};
                                        ChangeQuickRedirect changeQuickRedirect6 = q.a;
                                        if (PatchProxy.isSupport(objArr6, qVar2, changeQuickRedirect6, false, "e1fed8bbd926950a3193f7130d0c9957", RobustBitConfig.DEFAULT_VALUE)) {
                                            z = ((Boolean) PatchProxy.accessDispatch(objArr6, qVar2, changeQuickRedirect6, false, "e1fed8bbd926950a3193f7130d0c9957")).booleanValue();
                                        } else {
                                            r rVar2 = qVar2.j;
                                            Object[] objArr7 = {str4};
                                            ChangeQuickRedirect changeQuickRedirect7 = r.a;
                                            if (PatchProxy.isSupport(objArr7, rVar2, changeQuickRedirect7, false, "5bdf9fec66c51381db78dddf5ba401a6", RobustBitConfig.DEFAULT_VALUE)) {
                                                z = ((Boolean) PatchProxy.accessDispatch(objArr7, rVar2, changeQuickRedirect7, false, "5bdf9fec66c51381db78dddf5ba401a6")).booleanValue();
                                            } else if (com.dianping.nvtunnelkit.utils.f.b(str4) && rVar2.d.containsKey(str4)) {
                                                z = true;
                                            }
                                        }
                                        if (z) {
                                            q qVar3 = q.this;
                                            com.dianping.sdk.pike.a aVar = r3;
                                            qVar3.a(aVar, "bizId is also been used, logout bizId: " + str3 + " success.");
                                            return;
                                        }
                                        w wVar = new w();
                                        wVar.b = str3;
                                        q.this.a(wVar, r3);
                                    }
                                });
                            }
                        }
                    }
                });
            }
        }
    }

    public final void a(String str, com.dianping.sdk.pike.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dab985fc72f0c9b5a22dfa2f2c32f303", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dab985fc72f0c9b5a22dfa2f2c32f303");
        } else if (a(aVar)) {
            if (com.dianping.nvtunnelkit.utils.f.a(str)) {
                a(aVar, -11, "add alias is null.");
            } else {
                a(str, true, aVar);
            }
        }
    }

    public void a(final String str, final boolean z, final com.dianping.sdk.pike.a aVar) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30e7cbe02cad5c5429b92e07e17cc12f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30e7cbe02cad5c5429b92e07e17cc12f");
        } else {
            a(new Runnable() { // from class: com.dianping.sdk.pike.c.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f22d453e959bf8967df6a22b8244670d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f22d453e959bf8967df6a22b8244670d");
                        return;
                    }
                    final com.dianping.sdk.pike.packet.b bVar = new com.dianping.sdk.pike.packet.b();
                    bVar.c = str;
                    bVar.b = c.this.c.a;
                    bVar.d = !z ? 1 : 0;
                    final q qVar = c.this.d;
                    final com.dianping.sdk.pike.a aVar2 = aVar;
                    Object[] objArr3 = {bVar, aVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = q.a;
                    if (PatchProxy.isSupport(objArr3, qVar, changeQuickRedirect3, false, "bb5f86ed8bff8f67a3d8c248604d59da", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, qVar, changeQuickRedirect3, false, "bb5f86ed8bff8f67a3d8c248604d59da");
                    } else {
                        qVar.a(new Runnable() { // from class: com.dianping.sdk.pike.service.q.14
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e6d0d73e8b2cee17deff4283dadd3856", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e6d0d73e8b2cee17deff4283dadd3856");
                                } else if (bVar.d == 1) {
                                    q qVar2 = q.this;
                                    com.dianping.sdk.pike.packet.b bVar2 = bVar;
                                    com.dianping.sdk.pike.a aVar3 = aVar2;
                                    Object[] objArr5 = {bVar2, aVar3};
                                    ChangeQuickRedirect changeQuickRedirect5 = q.a;
                                    if (PatchProxy.isSupport(objArr5, qVar2, changeQuickRedirect5, false, "fbaeea786d29f18bcf8d466937817697", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, qVar2, changeQuickRedirect5, false, "fbaeea786d29f18bcf8d466937817697");
                                        return;
                                    }
                                    qVar2.e();
                                    List<String> list = qVar2.d.n.get(bVar2.b);
                                    if (list != null && list.contains(bVar2.c)) {
                                        qVar2.a(bVar2, aVar3);
                                    } else {
                                        qVar2.a(aVar3, -13, "remove alias not exist");
                                    }
                                } else {
                                    q.this.a(bVar, aVar2);
                                }
                            }
                        });
                    }
                }
            }, aVar);
        }
    }

    public void b(final String str, final boolean z, final com.dianping.sdk.pike.a aVar) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e54eaf56be3f419aa614407a175ac3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e54eaf56be3f419aa614407a175ac3a");
        } else {
            a(new Runnable() { // from class: com.dianping.sdk.pike.c.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b5b69fcaa1a523062c1ba29ee4046dd8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b5b69fcaa1a523062c1ba29ee4046dd8");
                        return;
                    }
                    n nVar = new n();
                    nVar.b = c.this.c.a;
                    nVar.d = str;
                    nVar.c = z ? 1 : 0;
                    q qVar = c.this.d;
                    com.dianping.sdk.pike.a aVar2 = aVar;
                    Object[] objArr3 = {nVar, aVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = q.a;
                    if (PatchProxy.isSupport(objArr3, qVar, changeQuickRedirect3, false, "700601ce78fd8b80b210a935fc291bc5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, qVar, changeQuickRedirect3, false, "700601ce78fd8b80b210a935fc291bc5");
                    } else {
                        qVar.a(nVar, aVar2);
                    }
                }
            }, aVar);
        }
    }

    public final void a(final aa aaVar, final long j, final boolean z, final com.dianping.sdk.pike.a aVar) {
        Object[] objArr = {aaVar, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51f9e96070a99ac1b69eeff82ea8376a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51f9e96070a99ac1b69eeff82ea8376a");
            return;
        }
        final com.dianping.sdk.pike.service.f fVar = this.o;
        Object[] objArr2 = {aaVar, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.sdk.pike.service.f.a;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "b5b1a138e6bd7b2102337e3d18458cd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "b5b1a138e6bd7b2102337e3d18458cd5");
        } else {
            fVar.a(new Runnable() { // from class: com.dianping.sdk.pike.service.f.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean z2 = false;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4651ce8347d7dbea1e17cc6466619415", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4651ce8347d7dbea1e17cc6466619415");
                        return;
                    }
                    a aVar2 = new a(aaVar, j, z, aVar);
                    if (f.this.e.size() < f.this.d.c) {
                        f.this.e.offer(aVar2);
                        z2 = true;
                    } else {
                        int size = f.this.f.size();
                        com.dianping.sdk.pike.message.c cVar = f.this.d;
                        if (size < cVar.b - cVar.c) {
                            f.this.f.offer(aVar2);
                        } else {
                            c.a().a(aVar2.d, -62, "send cache queue size limit");
                            return;
                        }
                    }
                    if (z2) {
                        f.a(f.this, aVar2);
                    }
                }
            });
        }
    }

    public final boolean a(com.dianping.sdk.pike.a aVar) {
        g gVar;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a281ae12929ec73c07af8a5d20a9673", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a281ae12929ec73c07af8a5d20a9673")).booleanValue();
        }
        if (a.Fail.equals(this.i.get())) {
            gVar = g.AuthFail;
        } else if (!f.q || !this.e.get()) {
            gVar = g.NeedStart;
        } else {
            gVar = g.Enable;
        }
        if (g.Enable.equals(gVar)) {
            return true;
        }
        a(aVar, gVar.e, gVar.f);
        return false;
    }

    public final void a(com.dianping.sdk.pike.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "092770efe2d860da13e091a65d0fe1fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "092770efe2d860da13e091a65d0fe1fa");
        } else {
            com.dianping.sdk.pike.service.c.a().a(aVar, str);
        }
    }

    public final void a(com.dianping.sdk.pike.a aVar, int i, String str) {
        Object[] objArr = {aVar, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86c1a80dcd17ac9878e768e509e51830", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86c1a80dcd17ac9878e768e509e51830");
            return;
        }
        com.dianping.sdk.pike.service.c.a().a(aVar, i, str);
        i.a("PikeBaseClient", "errorCode: " + i + ", errorMessage: " + str);
    }

    public final void a(Runnable runnable, com.dianping.sdk.pike.a aVar) {
        Object[] objArr = {runnable, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "399dab5bca47997ce24332b444108a04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "399dab5bca47997ce24332b444108a04");
        } else if (!h.a(this.c.a)) {
            a(aVar, -83, "pike only used in the main process");
        } else {
            synchronized (this.m) {
                if (a.NeedAuth.equals(this.i.get())) {
                    i.a("PikeBaseClient", d("checkAuth: need auth finish"));
                    if (this.m.size() < 30) {
                        this.m.add(new Pair<>(runnable, aVar));
                        i.a("PikeBaseClient", d("checkAuth: put authCacheList, size: " + this.m.size()));
                    } else {
                        a(aVar, -62, "send cache queue size limit");
                    }
                    g();
                } else if (this.d != null) {
                    runnable.run();
                } else {
                    a(aVar, -65, "raw client is null");
                }
            }
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "247c66b43077c11a43a2c97ea0342598", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "247c66b43077c11a43a2c97ea0342598");
        } else if (this.n.compareAndSet(false, true)) {
            com.dianping.nvtunnelkit.core.c.a().a(this.r, f.t);
        }
    }

    void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa252b0a32d9c399d021a7100dd38f0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa252b0a32d9c399d021a7100dd38f0c");
            return;
        }
        com.dianping.nvtunnelkit.core.c.a().b(this.r);
        this.n.set(false);
    }

    private String d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7adff53177f262257c0404b0707de3c2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7adff53177f262257c0404b0707de3c2");
        }
        return "bizId: " + this.c.a + ", " + str;
    }
}
