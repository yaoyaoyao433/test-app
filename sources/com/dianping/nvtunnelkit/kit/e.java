package com.dianping.nvtunnelkit.kit;

import android.content.Context;
import android.os.Looper;
import com.dianping.nvtunnelkit.core.d;
import com.dianping.nvtunnelkit.ext.f;
import com.dianping.nvtunnelkit.kit.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.SocketAddress;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e<C extends w> implements com.dianping.nvtunnelkit.core.f<C>, com.dianping.nvtunnelkit.ext.b<C>, d<C>, p<C, r, q> {
    public static ChangeQuickRedirect a;
    public com.dianping.nvtunnelkit.core.e<C> b;
    public final v c;
    com.dianping.nvtunnelkit.ext.e d;
    private final String e;
    private final s<C> f;
    private final AtomicBoolean g;
    private com.dianping.nvtunnelkit.ext.f<C> h;
    private com.dianping.nvtunnelkit.ext.b<C> i;
    private final a j;
    private i<C, r> k;
    private l<C, r, q> l;
    private h<C> m;
    private g<C> n;
    private m o;
    private j<C, r> p;
    private final AtomicBoolean q;

    public static /* synthetic */ void a(e eVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "2fc8d02590d49cfdac7d8e35add70eb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "2fc8d02590d49cfdac7d8e35add70eb2");
        } else if (i > 0) {
            if (eVar.q.compareAndSet(false, true)) {
                eVar.a(true);
            }
        } else if (eVar.q.compareAndSet(true, false)) {
            eVar.a(false);
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.i
    public final /* synthetic */ Object a(Object obj) {
        r rVar = (r) obj;
        Object[] objArr = {rVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "578445dc547d1dae3648b2d57d44bd8f", RobustBitConfig.DEFAULT_VALUE)) {
            return (w) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "578445dc547d1dae3648b2d57d44bd8f");
        }
        Object[] objArr2 = {rVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b56e82665115d2e90d30e4c1f6345cf6", RobustBitConfig.DEFAULT_VALUE)) {
            return (w) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b56e82665115d2e90d30e4c1f6345cf6");
        }
        if (this.k != null) {
            return this.k.a(rVar);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.kit.h
    public final /* synthetic */ void a(com.dianping.nvtunnelkit.conn.c cVar) {
        b((e<C>) ((w) cVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.kit.h
    public final /* bridge */ /* synthetic */ void a(com.dianping.nvtunnelkit.conn.c cVar, Throwable th) {
        a((e<C>) ((w) cVar), th);
    }

    @Override // com.dianping.nvtunnelkit.kit.l
    public final /* synthetic */ void a(Object obj, com.dianping.nvtunnelkit.exception.d dVar) {
        r rVar = (r) obj;
        Object[] objArr = {rVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c918bb4ad114bd81c88206d56fabffc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c918bb4ad114bd81c88206d56fabffc4");
            return;
        }
        Object[] objArr2 = {rVar, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "359237fd6fa7c247d7adb1f35d635c88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "359237fd6fa7c247d7adb1f35d635c88");
        } else if (this.l != null) {
            this.l.a(rVar, dVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.kit.i
    public final /* synthetic */ void a(Object obj, Object obj2) {
        r rVar = (r) obj;
        w wVar = (w) obj2;
        Object[] objArr = {rVar, wVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23970abecbc1d76949db3cb81956a715", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23970abecbc1d76949db3cb81956a715");
            return;
        }
        Object[] objArr2 = {rVar, wVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d31accc7aa8ec9540531f28f26593588", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d31accc7aa8ec9540531f28f26593588");
        } else if (this.k != null) {
            this.k.a(rVar, wVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.kit.j
    public final /* synthetic */ void a(Object obj, Object obj2, byte b) {
        r rVar = (r) obj;
        w wVar = (w) obj2;
        Object[] objArr = {rVar, wVar, Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df357b944e88820094d91c1cc4f914f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df357b944e88820094d91c1cc4f914f9");
            return;
        }
        Object[] objArr2 = {rVar, wVar, Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7c503f92e94cccd061ffa641e09c07b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7c503f92e94cccd061ffa641e09c07b3");
        } else if (this.p != null) {
            this.p.a(rVar, wVar, b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.kit.l
    public final /* synthetic */ void a(Object obj, Object obj2, int i) {
        q qVar = (q) obj;
        w wVar = (w) obj2;
        Object[] objArr = {qVar, wVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dc6b1d0eeae23b194e6cd1cdcfe9abd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dc6b1d0eeae23b194e6cd1cdcfe9abd");
            return;
        }
        Object[] objArr2 = {qVar, wVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "95c52f96b595c6c1b8146badb782aa65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "95c52f96b595c6c1b8146badb782aa65");
        } else if (this.l != null) {
            this.l.a(qVar, wVar, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.kit.j
    public final /* synthetic */ void a(Object obj, Object obj2, long j, int i, byte b) {
        r rVar = (r) obj;
        w wVar = (w) obj2;
        Object[] objArr = {rVar, wVar, new Long(j), Integer.valueOf(i), Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4075b554634355cd33800fe431b786ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4075b554634355cd33800fe431b786ad");
            return;
        }
        Object[] objArr2 = {rVar, wVar, new Long(j), Integer.valueOf(i), Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6dd1e1be8dbf20fe45ffb8d317de6c45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6dd1e1be8dbf20fe45ffb8d317de6c45");
        } else if (this.p != null) {
            this.p.a(rVar, wVar, j, i, b);
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.i
    public final /* synthetic */ void a_(Object obj, com.dianping.nvtunnelkit.exception.d dVar) {
        r rVar = (r) obj;
        Object[] objArr = {rVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66c1106b3c9bab2fda74140d3641c372", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66c1106b3c9bab2fda74140d3641c372");
            return;
        }
        Object[] objArr2 = {rVar, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "238c3f6f4b4c3417c8ed5c9c6835ab36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "238c3f6f4b4c3417c8ed5c9c6835ab36");
        } else if (this.k != null) {
            this.k.a_(rVar, dVar);
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.g
    public final /* synthetic */ com.dianping.nvtunnelkit.conn.c b(com.dianping.nvtunnelkit.conn.a aVar, SocketAddress socketAddress) {
        Object[] objArr = {aVar, socketAddress};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e766f742708b6a05c74672d98d49463d", RobustBitConfig.DEFAULT_VALUE) ? (w) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e766f742708b6a05c74672d98d49463d") : a(aVar, socketAddress);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.kit.h
    public final /* synthetic */ void b(com.dianping.nvtunnelkit.conn.c cVar) {
        a((e<C>) ((w) cVar));
    }

    @Override // com.dianping.nvtunnelkit.kit.i
    public final /* synthetic */ void b(Object obj) {
        r rVar = (r) obj;
        Object[] objArr = {rVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ef2b3dd03d0d563df9d8fba036070f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ef2b3dd03d0d563df9d8fba036070f0");
            return;
        }
        Object[] objArr2 = {rVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de12b1297e0dad5687a9faa3a544c9c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de12b1297e0dad5687a9faa3a544c9c2");
        } else if (this.k != null) {
            this.k.b(rVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.kit.i
    public final /* synthetic */ boolean b(Object obj, Object obj2) {
        r rVar = (r) obj;
        w wVar = (w) obj2;
        Object[] objArr = {rVar, wVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23d1ebf43f47aa48d259d63d0e760d1f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23d1ebf43f47aa48d259d63d0e760d1f")).booleanValue();
        }
        Object[] objArr2 = {rVar, wVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "229346598318ef21f96c406a717340c4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "229346598318ef21f96c406a717340c4")).booleanValue() : this.k != null && this.k.b(rVar, wVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.ext.b
    public final /* synthetic */ void c(com.dianping.nvtunnelkit.conn.c cVar) {
        w wVar = (w) cVar;
        Object[] objArr = {wVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a3f84038f78d1e683fcc705db899ff6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a3f84038f78d1e683fcc705db899ff6");
        } else if (this.c.m) {
            this.i.c(wVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.kit.i
    public final /* synthetic */ void c(Object obj, Object obj2) {
        r rVar = (r) obj;
        w wVar = (w) obj2;
        Object[] objArr = {rVar, wVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8631736e805856472a34a11f926ded8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8631736e805856472a34a11f926ded8");
            return;
        }
        Object[] objArr2 = {rVar, wVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "88d282d971cb60b68e1ef792ebdc604a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "88d282d971cb60b68e1ef792ebdc604a");
        } else if (this.k != null) {
            this.k.c(rVar, wVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.kit.n
    public final /* synthetic */ void d(com.dianping.nvtunnelkit.conn.c cVar) {
        c((e<C>) ((w) cVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.kit.k
    public final /* synthetic */ void d(Object obj, Object obj2) {
        r rVar = (r) obj;
        w wVar = (w) obj2;
        Object[] objArr = {rVar, wVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0e87e7d3873031d47ac7f0e13394b8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0e87e7d3873031d47ac7f0e13394b8a");
        } else {
            this.f.a(rVar, (r) wVar);
        }
    }

    public e(Context context, v vVar, a aVar) {
        Object[] objArr = {context, vVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05e8375d45282b4ab17c7d5daa3959bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05e8375d45282b4ab17c7d5daa3959bc");
            return;
        }
        this.g = new AtomicBoolean(true);
        com.dianping.nvtunnelkit.utils.c.a(context);
        this.c = vVar;
        this.e = com.dianping.nvtunnelkit.logger.a.a(this.c.b, "BaseTunnelKit");
        this.q = new AtomicBoolean(false);
        this.b = new f<C>(this) { // from class: com.dianping.nvtunnelkit.kit.e.1
            public static ChangeQuickRedirect e;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.dianping.nvtunnelkit.kit.f, com.dianping.nvtunnelkit.ext.g
            public final /* bridge */ /* synthetic */ void a(com.dianping.nvtunnelkit.conn.b bVar) {
                a((AnonymousClass1) ((w) bVar));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.dianping.nvtunnelkit.kit.f, com.dianping.nvtunnelkit.ext.g, com.dianping.nvtunnelkit.core.g, com.dianping.nvtunnelkit.conn.d
            public final /* bridge */ /* synthetic */ void a(com.dianping.nvtunnelkit.conn.c cVar) {
                a((AnonymousClass1) ((w) cVar));
            }

            @Override // com.dianping.nvtunnelkit.core.g, com.dianping.nvtunnelkit.conn.d
            public final /* synthetic */ void a(com.dianping.nvtunnelkit.conn.c cVar, Throwable th) {
                w wVar = (w) cVar;
                Object[] objArr2 = {wVar, th};
                ChangeQuickRedirect changeQuickRedirect2 = e;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "48a038b0615789d81e2fd42c40e4c0f6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "48a038b0615789d81e2fd42c40e4c0f6");
                    return;
                }
                super.a((AnonymousClass1) wVar, th);
                e.a(e.this, com.dianping.nvtunnelkit.utils.a.a(this.b));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.dianping.nvtunnelkit.ext.g
            public final /* synthetic */ void b(com.dianping.nvtunnelkit.conn.b bVar) {
                c((AnonymousClass1) ((w) bVar));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.dianping.nvtunnelkit.kit.f, com.dianping.nvtunnelkit.core.g, com.dianping.nvtunnelkit.conn.d
            public final /* bridge */ /* synthetic */ void b(com.dianping.nvtunnelkit.conn.c cVar) {
                b((AnonymousClass1) ((w) cVar));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.dianping.nvtunnelkit.ext.g
            public final /* synthetic */ void c(com.dianping.nvtunnelkit.conn.b bVar) {
                d((AnonymousClass1) ((w) bVar));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.dianping.nvtunnelkit.ext.g, com.dianping.nvtunnelkit.core.e
            public final /* bridge */ /* synthetic */ void c(com.dianping.nvtunnelkit.conn.c cVar) {
                c((AnonymousClass1) ((w) cVar));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.dianping.nvtunnelkit.ext.g, com.dianping.nvtunnelkit.core.e
            public final /* bridge */ /* synthetic */ void d(com.dianping.nvtunnelkit.conn.c cVar) {
                d((AnonymousClass1) ((w) cVar));
            }

            private void c(C c) {
                Object[] objArr2 = {c};
                ChangeQuickRedirect changeQuickRedirect2 = e;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5cdca0ac01dc3e08ebad49f2d44bfb04", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5cdca0ac01dc3e08ebad49f2d44bfb04");
                    return;
                }
                super.b((AnonymousClass1) c);
                e.a(e.this, com.dianping.nvtunnelkit.utils.a.a(this.b));
            }

            private void d(C c) {
                Object[] objArr2 = {c};
                ChangeQuickRedirect changeQuickRedirect2 = e;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "473ea882d13bb7a7473da8b353de389b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "473ea882d13bb7a7473da8b353de389b");
                    return;
                }
                super.c((AnonymousClass1) c);
                e.a(e.this, com.dianping.nvtunnelkit.utils.a.a(this.b));
            }

            @Override // com.dianping.nvtunnelkit.ext.g, com.dianping.nvtunnelkit.core.e
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = e;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d9bc155e5f7a1a5ee7c70d4fbf55bc7d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d9bc155e5f7a1a5ee7c70d4fbf55bc7d");
                    return;
                }
                super.d();
                e.a(e.this, com.dianping.nvtunnelkit.utils.a.a(this.b));
            }

            @Override // com.dianping.nvtunnelkit.kit.f
            public final void a(C c) {
                Object[] objArr2 = {c};
                ChangeQuickRedirect changeQuickRedirect2 = e;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "71df3e9529fea150a0818e61f207312d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "71df3e9529fea150a0818e61f207312d");
                    return;
                }
                super.a((AnonymousClass1) c);
                e.a(e.this, com.dianping.nvtunnelkit.utils.a.a(this.b));
            }

            @Override // com.dianping.nvtunnelkit.kit.f
            public final void b(C c) {
                Object[] objArr2 = {c};
                ChangeQuickRedirect changeQuickRedirect2 = e;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bbb6d7d5ce13cc3b9566b465abb2408c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bbb6d7d5ce13cc3b9566b465abb2408c");
                    return;
                }
                super.b((AnonymousClass1) c);
                e.a(e.this, com.dianping.nvtunnelkit.utils.a.a(this.b));
            }
        };
        this.b.a(vVar.e);
        this.b.a(vVar.f);
        com.dianping.nvtunnelkit.ext.f<C> fVar = new com.dianping.nvtunnelkit.ext.f<>(this);
        Object[] objArr2 = {fVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "30337d448d5a2ecaf56a8aa26f0d4a2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "30337d448d5a2ecaf56a8aa26f0d4a2b");
        } else {
            this.h = fVar;
            if (this.h != null) {
                this.h.f = new com.dianping.nvtunnelkit.ext.e() { // from class: com.dianping.nvtunnelkit.kit.e.2
                    public static ChangeQuickRedirect a;

                    @Override // com.dianping.nvtunnelkit.ext.e
                    public final void a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5749854dbb7fa963c1476d99cbb8c2d0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5749854dbb7fa963c1476d99cbb8c2d0");
                        } else if (e.this.d != null) {
                            e.this.d.a();
                        }
                    }
                };
            }
        }
        this.j = aVar;
        this.i = new com.dianping.nvtunnelkit.ext.h(this, aVar, new com.dianping.nvtunnelkit.ext.j(context));
        this.f = new s<>(this);
        this.f.g = this;
        this.f.h = this;
        this.f.i = this;
        d.a.a(vVar.b, vVar.e, vVar.q);
    }

    @Override // com.dianping.nvtunnelkit.kit.d
    public final void a(com.dianping.nvtunnelkit.ext.e eVar) {
        this.d = eVar;
    }

    @Override // com.dianping.nvtunnelkit.kit.n
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "408d74ecf9e3be8c1df55b55f46b2482", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "408d74ecf9e3be8c1df55b55f46b2482");
            return;
        }
        this.g.set(false);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.b.a();
        } else {
            com.dianping.nvtunnelkit.core.c.a().a(new Runnable() { // from class: com.dianping.nvtunnelkit.kit.e.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6600d02f1a5e531229e7d8c090af1766", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6600d02f1a5e531229e7d8c090af1766");
                    } else {
                        e.this.b.a();
                    }
                }
            });
        }
        if (this.h != null) {
            com.dianping.nvtunnelkit.ext.f<C> fVar = this.h;
            v vVar = this.c;
            Object[] objArr2 = {vVar};
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.nvtunnelkit.ext.f.a;
            if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "95bb6745b18f0dc2ec669153d983afa9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "95bb6745b18f0dc2ec669153d983afa9");
                return;
            }
            fVar.b = com.dianping.nvtunnelkit.logger.a.a(vVar.b, "NvHeartConnectionManager");
            fVar.d = vVar.g;
            fVar.g = vVar.t;
            fVar.h = vVar.u;
            fVar.e = vVar.h;
            if (fVar.c.compareAndSet(false, true)) {
                String str = vVar.b;
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = com.dianping.nvtunnelkit.ext.f.a;
                if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "4a3670b43e9d6392c747942ef15b963b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "4a3670b43e9d6392c747942ef15b963b");
                } else if (fVar.h) {
                    fVar.i = com.sankuai.android.jarvis.c.c("tunnel_kit_heartbeat_" + str);
                    fVar.i.schedule(new f.a(), fVar.d, TimeUnit.MILLISECONDS);
                } else {
                    com.sankuai.android.jarvis.c.a("tunnel_heartbeat_jarvis", "tunnel_kit_heartbeat_" + str, 60L).execute(new f.b());
                }
            }
        }
    }

    @Override // com.dianping.nvtunnelkit.ext.b
    public final void a(List<SocketAddress> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bef0c10a8624f7ae1c29c3f651582358", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bef0c10a8624f7ae1c29c3f651582358");
            return;
        }
        com.dianping.nvtunnelkit.logger.b.b(this.e, "startRacing...");
        if (this.c.n) {
            this.i.a(list);
        }
    }

    public final C a(SocketAddress socketAddress) {
        Object[] objArr = {socketAddress};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8b23ab89c9c27fdafb7332beb6a5035", RobustBitConfig.DEFAULT_VALUE)) {
            return (C) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8b23ab89c9c27fdafb7332beb6a5035");
        }
        com.dianping.nvtunnelkit.conn.a aVar = this.c.w;
        aVar.a(this.c.b);
        C a2 = a(aVar, socketAddress);
        a2.a(new com.dianping.nvtunnelkit.conn.d<C>() { // from class: com.dianping.nvtunnelkit.kit.e.4
            public static ChangeQuickRedirect a;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.dianping.nvtunnelkit.conn.d
            public final /* synthetic */ void a(com.dianping.nvtunnelkit.conn.c cVar) {
                w wVar = (w) cVar;
                Object[] objArr2 = {wVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "80c177b207eac1821c7be819e1aa967f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "80c177b207eac1821c7be819e1aa967f");
                } else {
                    e.this.a((e) wVar);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.dianping.nvtunnelkit.conn.d
            public final /* synthetic */ void a(com.dianping.nvtunnelkit.conn.c cVar, Throwable th) {
                w wVar = (w) cVar;
                Object[] objArr2 = {wVar, th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cdf71a2e7a796a689a93d5b70878a675", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cdf71a2e7a796a689a93d5b70878a675");
                } else {
                    e.this.a((e) wVar, th);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.dianping.nvtunnelkit.conn.d
            public final /* synthetic */ void b(com.dianping.nvtunnelkit.conn.c cVar) {
                w wVar = (w) cVar;
                Object[] objArr2 = {wVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "33a5a1cd9eb2119a5a6afcb830ecb213", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "33a5a1cd9eb2119a5a6afcb830ecb213");
                } else {
                    e.this.b((e) wVar);
                }
            }
        });
        a2.y = this.f;
        a2.z = this.f;
        a2.A = this.c.r;
        return a2;
    }

    @Override // com.dianping.nvtunnelkit.core.f, com.dianping.nvtunnelkit.kit.n
    public final com.dianping.nvtunnelkit.core.e<C> a() {
        return this.b;
    }

    public final List<SocketAddress> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac701ceb9f74aef6099426ee7865d9b0", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac701ceb9f74aef6099426ee7865d9b0") : this.j.c();
    }

    @Override // com.dianping.nvtunnelkit.kit.n
    public final v t_() {
        return this.c;
    }

    @Override // com.dianping.nvtunnelkit.ext.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27bc9dfd8dff4349242ea38166084db0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27bc9dfd8dff4349242ea38166084db0");
            return;
        }
        com.dianping.nvtunnelkit.logger.b.b(this.e, "stopRacing...");
        if (this.c.n) {
            this.i.b();
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.k
    public final void cancel(r rVar) {
        Object[] objArr = {rVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d32623bbdf3165c76a120487d8a8ff32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d32623bbdf3165c76a120487d8a8ff32");
        } else if (rVar == null) {
        } else {
            this.f.cancel(rVar);
        }
    }

    @Override // com.dianping.nvtunnelkit.ext.b
    public final List<SocketAddress> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa3943e26e7b93b4ec98576957493602", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa3943e26e7b93b4ec98576957493602");
        }
        if (this.c.n) {
            return this.i.c();
        }
        return null;
    }

    @Override // com.dianping.nvtunnelkit.ext.b
    public final List<com.dianping.nvtunnelkit.ext.c> d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "479879ab269c7e69c786a208319ee11d", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "479879ab269c7e69c786a208319ee11d");
        }
        if (this.c.m) {
            return this.i.d();
        }
        return null;
    }

    public final void a(C c) {
        Object[] objArr = {c};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b67e6a4594085d295103c4ad6f5f8a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b67e6a4594085d295103c4ad6f5f8a8");
            return;
        }
        Object[] objArr2 = {c};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f7d5597252110ccd2c04b088a63a6740", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f7d5597252110ccd2c04b088a63a6740");
        } else if (this.m != null) {
            this.m.b(c);
        }
    }

    public final void b(C c) {
        Object[] objArr = {c};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66c51ecec1540c2e87a5f579b3727b41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66c51ecec1540c2e87a5f579b3727b41");
            return;
        }
        Object[] objArr2 = {c};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "817f15b093f9198e3f0ab02e85b90d85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "817f15b093f9198e3f0ab02e85b90d85");
        } else if (this.m != null) {
            this.m.a(c);
        }
    }

    public final void a(C c, Throwable th) {
        Object[] objArr = {c, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d084cf6d043730179ac3b4b75da6eebe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d084cf6d043730179ac3b4b75da6eebe");
            return;
        }
        Object[] objArr2 = {c, th};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f479cf01cf2d018ff2d29d993bab6dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f479cf01cf2d018ff2d29d993bab6dd");
        } else if (this.m != null) {
            this.m.a(c, th);
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.h.a
    public final void a(h<C> hVar) {
        this.m = hVar;
    }

    @Override // com.dianping.nvtunnelkit.kit.g.a
    public final void a(g<C> gVar) {
        this.n = gVar;
    }

    private C a(com.dianping.nvtunnelkit.conn.a aVar, SocketAddress socketAddress) {
        Object[] objArr = {aVar, socketAddress};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b8144d2847e67efbe6cdec38424a1ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (C) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b8144d2847e67efbe6cdec38424a1ca");
        }
        if (this.n != null) {
            return this.n.b(aVar, socketAddress);
        }
        return null;
    }

    @Override // com.dianping.nvtunnelkit.kit.i
    public final void a_(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14028cbf568d295ca83460105fe21895", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14028cbf568d295ca83460105fe21895");
            return;
        }
        Object[] objArr2 = {th};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "04c7c97bf839db8c650f074dbbc2bef5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "04c7c97bf839db8c650f074dbbc2bef5");
        } else if (this.k != null) {
            this.k.a_(th);
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.i.a
    public final void a(i<C, r> iVar) {
        this.k = iVar;
    }

    @Override // com.dianping.nvtunnelkit.kit.l
    public final void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "118efbf934b0e250116e5415153db238", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "118efbf934b0e250116e5415153db238");
            return;
        }
        Object[] objArr2 = {th};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "310966618df3ea1ad17bd4de06fc2e6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "310966618df3ea1ad17bd4de06fc2e6c");
        } else if (this.l != null) {
            this.l.a(th);
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.l.a
    public final void a(l<C, r, q> lVar) {
        this.l = lVar;
    }

    public final void c(C c) {
        Object[] objArr = {c};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb4d16f0e6520c2ee2647937ab42b570", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb4d16f0e6520c2ee2647937ab42b570");
        } else if (c == null) {
        } else {
            if (this.c.t) {
                c.t();
            }
            this.b.c(c);
        }
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf4b9c764a3c2eef7a57c080d5ff8880", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf4b9c764a3c2eef7a57c080d5ff8880");
        } else {
            this.b.d();
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.n
    public final boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e8d6b8d4951794282adb502fedbd599", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e8d6b8d4951794282adb502fedbd599")).booleanValue() : !this.g.get() && com.dianping.nvtunnelkit.utils.a.c(this.b.b());
    }

    @Override // com.dianping.nvtunnelkit.kit.n
    public final boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c999c63024e289ff91f79b9faf0d6b0a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c999c63024e289ff91f79b9faf0d6b0a")).booleanValue() : this.g.get();
    }

    @Override // com.dianping.nvtunnelkit.kit.n
    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74a97fbf9c3182062e519fe13960c3ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74a97fbf9c3182062e519fe13960c3ce");
            return;
        }
        com.dianping.nvtunnelkit.logger.b.a(this.e, "close tunnel...");
        this.g.set(true);
        b();
        this.b.d();
    }

    @Override // com.dianping.nvtunnelkit.kit.m
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16892a653c95916080b43f32125835a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16892a653c95916080b43f32125835a4");
        } else {
            b(z);
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.m.a
    public final void a(m mVar) {
        this.o = mVar;
    }

    private void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfbc613404def32083415ae2b703a7c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfbc613404def32083415ae2b703a7c3");
        } else if (this.o != null) {
            this.o.a(z);
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.j.a
    public final void a(j<C, r> jVar) {
        this.p = jVar;
    }
}
