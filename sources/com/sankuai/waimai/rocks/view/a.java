package com.sankuai.waimai.rocks.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.l;
import com.sankuai.waimai.mach.recycler.h;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import com.sankuai.waimai.rocks.view.block.d;
import com.sankuai.waimai.rocks.view.c;
import com.sankuai.waimai.rocks.view.mach.c;
import com.sankuai.waimai.rocks.view.recyclerview.b;
import com.sankuai.waimai.rocks.view.viewmodel.d;
import com.sankuai.waimai.rocks.view.viewmodel.e;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    Context b;
    public com.sankuai.waimai.rocks.view.mach.a c;
    public com.sankuai.waimai.rocks.view.recyclerview.b d;
    boolean e;
    private RecyclerView f;
    private com.sankuai.waimai.rocks.expose.a g;
    private b.a h;
    private com.sankuai.waimai.rocks.view.c i;
    private d j;
    private boolean k;
    private boolean l;
    private String m;
    private boolean n;
    private String o;
    private Fragment p;
    private com.sankuai.waimai.rocks.log.b q;
    private com.sankuai.waimai.rocks.view.recyclerview.footer.a r;
    private c.a s;
    private d.a t;
    private Mach.d u;
    private c.b v;
    private c.a w;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a();

        void a(e eVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c {
        void a();

        void a(List<com.sankuai.waimai.rocks.node.a> list);

        void b();
    }

    public a(C1132a c1132a) {
        Object[] objArr = {c1132a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a16857a50b58b3846b38f47ca060f89e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a16857a50b58b3846b38f47ca060f89e");
            return;
        }
        this.e = true;
        this.b = c1132a.c;
        this.l = c1132a.m;
        this.m = c1132a.i;
        this.n = c1132a.j;
        this.o = !TextUtils.isEmpty(c1132a.k) ? c1132a.k : this.m;
        this.f = c1132a.f;
        this.g = c1132a.g;
        this.h = c1132a.h;
        this.k = c1132a.n;
        this.s = c1132a.u;
        this.q = c1132a.s;
        if (this.q == null) {
            this.q = new com.sankuai.waimai.rocks.log.a();
        }
        this.r = c1132a.t;
        this.t = c1132a.v;
        this.u = c1132a.w;
        this.v = c1132a.e;
        this.w = c1132a.x;
        if (this.w == null) {
            this.w = new c.a() { // from class: com.sankuai.waimai.rocks.view.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.rocks.view.mach.c.a
                public final com.sankuai.waimai.mach.recycler.c a(String str, h hVar, Mach.a aVar, String str2, String str3) {
                    Object[] objArr2 = {str, hVar, aVar, str2, str3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c1fc46eb01197af2826b305e538b74a3", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.recycler.c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c1fc46eb01197af2826b305e538b74a3") : new com.sankuai.waimai.mach.recycler.c(str, hVar, aVar, str2, str3);
                }

                @Override // com.sankuai.waimai.rocks.view.mach.c.a
                public final com.sankuai.waimai.mach.recycler.c a(String str, String str2, Mach.a aVar, String str3, String str4) {
                    Object[] objArr2 = {str, str2, aVar, str3, str4};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8d9ae4529135e583d9702ca25dac28ea", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.recycler.c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8d9ae4529135e583d9702ca25dac28ea") : new com.sankuai.waimai.mach.recycler.c(str, str2, aVar, str3, str4);
                }
            };
        }
        if (this.l) {
            this.c = new com.sankuai.waimai.rocks.view.mach.c((Activity) this.b, this.m, this.o, this.q, c1132a.d, c1132a.r, this.u, this.v, this.w, c1132a.y, c1132a.z).a(c1132a.b);
        } else {
            this.c = new com.sankuai.waimai.rocks.view.mach.b((Activity) this.b, this.m, this.o, this.q, c1132a.d, c1132a.r, this.u, c1132a.z);
        }
        this.p = c1132a.p;
        com.sankuai.waimai.rocks.view.block.c cVar = c1132a.q;
        com.sankuai.waimai.rocks.view.block.c cVar2 = cVar == null ? new com.sankuai.waimai.rocks.view.block.c(this.b) : cVar;
        this.d = new com.sankuai.waimai.rocks.view.recyclerview.b(cVar2, this.f, this.r, this.h, this.g, this.c, this.o, this.p, cVar2, this.t, this.n);
        if (c1132a.l != null) {
            this.d.a(c1132a.l);
        }
        this.j = new com.sankuai.waimai.rocks.view.viewmodel.d();
        this.i = new com.sankuai.waimai.rocks.view.c(this.b, this.c, this.j, this.k, c1132a.o, c1132a.y, this.o, this.n);
    }

    public final void a(RocksServerModel rocksServerModel, boolean z, boolean z2, c cVar) {
        Object[] objArr = {rocksServerModel, (byte) 0, (byte) 0, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d6abf922951340e904467484ea20c98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d6abf922951340e904467484ea20c98");
        } else {
            a(rocksServerModel, false, false, false, false, 0, cVar);
        }
    }

    public final void a(RocksServerModel rocksServerModel, boolean z, boolean z2, boolean z3, boolean z4, final int i, final c cVar) {
        Object[] objArr = {rocksServerModel, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Byte.valueOf(z4 ? (byte) 1 : (byte) 0), Integer.valueOf(i), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05393d771c3dba3824ffc231271d8b27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05393d771c3dba3824ffc231271d8b27");
            return;
        }
        final com.sankuai.waimai.rocks.node.c a2 = com.sankuai.waimai.rocks.utils.a.a(this.q, this.o, rocksServerModel);
        this.j.r = z2;
        this.j.s = z4;
        this.j.t = z3;
        if (rocksServerModel != null) {
            this.j.b = rocksServerModel.isCache;
        }
        if (a2 instanceof com.sankuai.waimai.rocks.node.b) {
            if (i > 0) {
                try {
                    if (this.d.G() != null && this.d.G().o != null && i < this.d.G().o.size()) {
                        this.i.a(i, this.s);
                    }
                } catch (Throwable th) {
                    com.sankuai.waimai.foundation.utils.log.a.a("render_exception, ", th);
                    cVar.b();
                    return;
                }
            }
            this.i.a((com.sankuai.waimai.rocks.node.b) a2, z3, z, this.e, new c.InterfaceC1133c() { // from class: com.sankuai.waimai.rocks.view.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.rocks.view.c.InterfaceC1133c
                public final void a(com.sankuai.waimai.rocks.view.viewmodel.d dVar) {
                    T t;
                    boolean z5 = true;
                    Object[] objArr2 = {dVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "22f8ef0fd95eb670900359061dd4eab0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "22f8ef0fd95eb670900359061dd4eab0");
                    } else if (!f.a(a.this.b)) {
                        if (a.this.e) {
                            a.this.e = false;
                        }
                        try {
                            a aVar = a.this;
                            Object[] objArr3 = {dVar};
                            ChangeQuickRedirect changeQuickRedirect3 = a.a;
                            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "884568e5b3ade35e96670cd1b342870f", RobustBitConfig.DEFAULT_VALUE)) {
                                z5 = ((Boolean) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "884568e5b3ade35e96670cd1b342870f")).booleanValue();
                            } else {
                                if (dVar.o.size() > 0) {
                                    for (e eVar : dVar.o) {
                                        if (!(eVar instanceof com.sankuai.waimai.rocks.view.viewmodel.a) || ((t = ((com.sankuai.waimai.rocks.view.viewmodel.a) eVar).p) != 0 && t.b() != null)) {
                                            break;
                                        }
                                    }
                                }
                                z5 = false;
                            }
                            if (!z5 && !CollectionUtils.isEmpty(((com.sankuai.waimai.rocks.node.b) a2).b)) {
                                cVar.b();
                                return;
                            }
                            a.this.d.a(dVar, i);
                            cVar.a();
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                            cVar.b();
                        }
                    }
                }

                @Override // com.sankuai.waimai.rocks.view.c.InterfaceC1133c
                public final void a(List<com.sankuai.waimai.rocks.node.a> list) {
                    Object[] objArr2 = {list};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8e75959bc5bf09c0cb1b2c3cba9e59fd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8e75959bc5bf09c0cb1b2c3cba9e59fd");
                    } else if (cVar == null) {
                    } else {
                        cVar.a(list);
                    }
                }
            }, this.s);
        }
    }

    public final void a(RocksServerModel rocksServerModel, int i, boolean z, final b bVar) {
        Object[] objArr = {rocksServerModel, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28196e0a9a9e19d0dbfe5969953dc433", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28196e0a9a9e19d0dbfe5969953dc433");
            return;
        }
        com.sankuai.waimai.rocks.node.a a2 = a(rocksServerModel);
        if (a2 != null) {
            this.i.a(a2, i, z, new c.b() { // from class: com.sankuai.waimai.rocks.view.a.3
                public static ChangeQuickRedirect a;

                /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
                    r2.a(r14);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
                    return;
                 */
                @Override // com.sankuai.waimai.rocks.view.c.b
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void a(com.sankuai.waimai.rocks.view.viewmodel.e r14) {
                    /*
                        r13 = this;
                        r0 = 1
                        java.lang.Object[] r8 = new java.lang.Object[r0]
                        r9 = 0
                        r8[r9] = r14
                        com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.rocks.view.a.AnonymousClass3.a
                        java.lang.String r11 = "dde416e96a10d9a1463232ee8807584e"
                        r4 = 0
                        r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                        r1 = r8
                        r2 = r13
                        r3 = r10
                        r5 = r11
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                        if (r1 == 0) goto L1b
                        com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r10, r9, r11)
                        return
                    L1b:
                        com.sankuai.waimai.rocks.view.a r1 = com.sankuai.waimai.rocks.view.a.this
                        android.content.Context r1 = r1.b
                        boolean r1 = com.sankuai.waimai.foundation.utils.f.a(r1)
                        if (r1 == 0) goto L26
                        return
                    L26:
                        com.sankuai.waimai.rocks.view.a r1 = com.sankuai.waimai.rocks.view.a.this     // Catch: java.lang.Throwable -> L69
                        java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L69
                        r10[r9] = r14     // Catch: java.lang.Throwable -> L69
                        com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.waimai.rocks.view.a.a     // Catch: java.lang.Throwable -> L69
                        java.lang.String r12 = "1cc360d30ab6cd859ec0108d69e06507"
                        r5 = 0
                        r7 = 4611686018427387904(0x4000000000000000, double:2.0)
                        r2 = r10
                        r3 = r1
                        r4 = r11
                        r6 = r12
                        boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L69
                        if (r2 == 0) goto L48
                        java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r1, r11, r9, r12)     // Catch: java.lang.Throwable -> L69
                        java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L69
                        boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L69
                        goto L5b
                    L48:
                        boolean r1 = r14 instanceof com.sankuai.waimai.rocks.view.viewmodel.a     // Catch: java.lang.Throwable -> L69
                        if (r1 == 0) goto L5b
                        r1 = r14
                        com.sankuai.waimai.rocks.view.viewmodel.a r1 = (com.sankuai.waimai.rocks.view.viewmodel.a) r1     // Catch: java.lang.Throwable -> L69
                        T extends com.sankuai.waimai.mach.recycler.a r1 = r1.p     // Catch: java.lang.Throwable -> L69
                        if (r1 == 0) goto L5a
                        com.sankuai.waimai.mach.node.a r1 = r1.b()     // Catch: java.lang.Throwable -> L69
                        if (r1 == 0) goto L5a
                        goto L5b
                    L5a:
                        r0 = 0
                    L5b:
                        if (r0 == 0) goto L63
                        com.sankuai.waimai.rocks.view.a$b r0 = r2     // Catch: java.lang.Throwable -> L69
                        r0.a(r14)     // Catch: java.lang.Throwable -> L69
                        goto L6e
                    L63:
                        com.sankuai.waimai.rocks.view.a$b r14 = r2     // Catch: java.lang.Throwable -> L69
                        r14.a()     // Catch: java.lang.Throwable -> L69
                        return
                    L69:
                        com.sankuai.waimai.rocks.view.a$b r14 = r2
                        r14.a()
                    L6e:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.rocks.view.a.AnonymousClass3.a(com.sankuai.waimai.rocks.view.viewmodel.e):void");
                }

                @Override // com.sankuai.waimai.rocks.view.c.b
                public final void a(com.sankuai.waimai.rocks.node.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dbc232588e61a1dc695ef97b7ae5caee", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dbc232588e61a1dc695ef97b7ae5caee");
                    } else if (bVar == null) {
                    }
                }
            });
        } else if (bVar != null) {
            bVar.a();
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ada4d742a48dbb37d3bcb784e44ecf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ada4d742a48dbb37d3bcb784e44ecf8");
        } else {
            this.i.a();
        }
    }

    private com.sankuai.waimai.rocks.node.a a(RocksServerModel rocksServerModel) {
        Object[] objArr = {rocksServerModel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8047571581b7f671865fea64f458ab76", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.rocks.node.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8047571581b7f671865fea64f458ab76");
        }
        com.sankuai.waimai.rocks.node.c a2 = com.sankuai.waimai.rocks.utils.a.a(this.q, this.o, rocksServerModel);
        if (a2 instanceof com.sankuai.waimai.rocks.node.a) {
            return (com.sankuai.waimai.rocks.node.a) a2;
        }
        return null;
    }

    public final void a(e eVar, int i) {
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "122f8b7e1df8eb6578cb7ede6754fcfa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "122f8b7e1df8eb6578cb7ede6754fcfa");
        } else {
            this.d.a(eVar, i);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.rocks.view.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1132a {
        public static ChangeQuickRedirect a;
        public int b;
        public Context c;
        public com.sankuai.waimai.rocks.view.mach.d d;
        public c.b e;
        public RecyclerView f;
        public com.sankuai.waimai.rocks.expose.a g;
        public b.a h;
        public String i;
        public boolean j;
        public String k;
        public Rect l;
        public boolean m;
        public boolean n;
        public boolean o;
        public Fragment p;
        public com.sankuai.waimai.rocks.view.block.c q;
        public Map<String, Object> r;
        public com.sankuai.waimai.rocks.log.b s;
        public com.sankuai.waimai.rocks.view.recyclerview.footer.a t;
        public c.a u;
        public d.a v;
        public Mach.d w;
        public c.a x;
        public boolean y;
        public rx.functions.c<com.sankuai.waimai.rocks.view.recyclerview.a, Integer> z;

        public C1132a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8858ab8bbc16308719541ab3ce28f7e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8858ab8bbc16308719541ab3ce28f7e");
                return;
            }
            this.b = 5000;
            this.y = l.a(com.meituan.android.singleton.b.a, "waimai_platform", "MACH_THREAD_OPT", false);
            this.i = str;
        }

        public final a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa83dc2577624a606f088d1dfedfbeb7", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa83dc2577624a606f088d1dfedfbeb7") : new a(this);
        }
    }
}
