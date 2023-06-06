package com.dianping.nvtunnelkit.kit;

import com.dianping.nvtunnelkit.codec.a;
import com.dianping.nvtunnelkit.codec.b;
import com.dianping.nvtunnelkit.core.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class c<C, S, R, S2 extends com.dianping.nvtunnelkit.core.b<? super S2>, R2> implements u<C, S, R> {
    public static ChangeQuickRedirect a;
    private static final boolean h = com.dianping.nvtunnelkit.logger.b.a();
    private static final String i = com.dianping.nvtunnelkit.logger.a.a("BaseTransmitter");
    final com.dianping.nvtunnelkit.codec.a<C, S, S2> b;
    final com.dianping.nvtunnelkit.codec.b<C, R2, R> c;
    public l<C, S, R> d;
    public i<C, S> e;
    public j<C, S> f;
    final Map<C, b<C, S, S2, R2, R>> g;
    private final com.dianping.nvtunnelkit.core.a<S2, S> j;
    private final u k;

    public abstract S2 c(S s);

    /* JADX WARN: Multi-variable type inference failed */
    public c(u<C, ? super S2, R2> uVar, a.InterfaceC0104a<C, S, S2> interfaceC0104a, b.a<C, R2, R> aVar) {
        Object[] objArr = {uVar, interfaceC0104a, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5d733753f34ae3bbe46ed2bc9e96caf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5d733753f34ae3bbe46ed2bc9e96caf");
            return;
        }
        this.j = new com.dianping.nvtunnelkit.core.a<>();
        this.b = interfaceC0104a.g();
        this.c = aVar.h();
        this.g = new ConcurrentHashMap();
        this.k = uVar;
        this.k.a((l) new l<C, S2, R2>() { // from class: com.dianping.nvtunnelkit.kit.c.1
            public static ChangeQuickRedirect a;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.dianping.nvtunnelkit.kit.l
            public final /* synthetic */ void a(Object obj, com.dianping.nvtunnelkit.exception.d dVar) {
                com.dianping.nvtunnelkit.core.b bVar = (com.dianping.nvtunnelkit.core.b) obj;
                Object[] objArr2 = {bVar, dVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ad38efb5594a538449f436c3f1949fe9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ad38efb5594a538449f436c3f1949fe9");
                    return;
                }
                Object a2 = c.this.j.a(bVar);
                if (a2 == null) {
                    String str = c.i;
                    com.dianping.nvtunnelkit.logger.b.b(str, "onError() called with: pkg is null, clz " + c.this.a());
                }
                c cVar = c.this;
                Object[] objArr3 = {a2, dVar};
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "f314830e10c81b75eaa0639fec366591", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "f314830e10c81b75eaa0639fec366591");
                } else if (cVar.d != null) {
                    cVar.d.a(a2, dVar);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.dianping.nvtunnelkit.kit.l
            public final void a(R2 r2, C c, int i2) {
                Object[] objArr2 = {r2, c, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e778819875012e710d839ebc9163c3db", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e778819875012e710d839ebc9163c3db");
                    return;
                }
                b bVar = (b) c.this.g.get(c);
                if (bVar == null) {
                    return;
                }
                LinkedList linkedList = new LinkedList();
                try {
                    bVar.a(c, i2, r2, linkedList);
                } catch (Exception e) {
                    if (c.h) {
                        e.printStackTrace();
                    }
                    String str = c.i;
                    com.dianping.nvtunnelkit.logger.b.a(str, "decode err in " + c.this.a(), e);
                }
                for (Object obj : linkedList) {
                    c cVar = c.this;
                    Object[] objArr3 = {obj, c, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = c.a;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "38155348e0f0b7d1a35a020d3c079b49", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "38155348e0f0b7d1a35a020d3c079b49");
                    } else if (cVar.d != null) {
                        cVar.d.a(obj, c, i2);
                    }
                }
            }

            @Override // com.dianping.nvtunnelkit.kit.l
            public final void a(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dfbe504399eba64949814bf02779330c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dfbe504399eba64949814bf02779330c");
                    return;
                }
                String str = c.i;
                com.dianping.nvtunnelkit.logger.b.a(str, "onError(), clz " + c.this.a(), th);
                c cVar = c.this;
                Object[] objArr3 = {th};
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "1c256584e982cb592f1df53243156c08", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "1c256584e982cb592f1df53243156c08");
                } else if (cVar.d != null) {
                    cVar.d.a(th);
                }
            }
        });
        this.k.a((i) new i<C, S2>() { // from class: com.dianping.nvtunnelkit.kit.c.2
            public static ChangeQuickRedirect a;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.dianping.nvtunnelkit.kit.i
            public final /* synthetic */ Object a(Object obj) {
                com.dianping.nvtunnelkit.core.b bVar = (com.dianping.nvtunnelkit.core.b) obj;
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "731e192d907a52658f2f54aa51474dee", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "731e192d907a52658f2f54aa51474dee");
                }
                Object a2 = c.this.j.a(bVar);
                if (a2 == null) {
                    String str = c.i;
                    com.dianping.nvtunnelkit.logger.b.b(str, "onSendSelectConnection(): pkg is null, clz " + c.this.a());
                    return null;
                }
                return c.this.a((c) a2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.dianping.nvtunnelkit.kit.i
            public final /* synthetic */ void a(Object obj, Object obj2) {
                com.dianping.nvtunnelkit.core.b bVar = (com.dianping.nvtunnelkit.core.b) obj;
                Object[] objArr2 = {bVar, obj2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b3d5dc95c0ca5ba48b3f2e8d5e41d409", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b3d5dc95c0ca5ba48b3f2e8d5e41d409");
                    return;
                }
                Object a2 = c.this.j.a(bVar);
                if (a2 != null) {
                    c.this.a(a2, obj2);
                    b bVar2 = (b) c.this.g.get(obj2);
                    if (bVar2 == null) {
                        String str = c.i;
                        com.dianping.nvtunnelkit.logger.b.b(str, "encode extend is null, in " + c.this.a());
                        return;
                    }
                    try {
                        bVar.a(bVar2.a(obj2, a2));
                    } catch (Exception e) {
                        String str2 = c.i;
                        com.dianping.nvtunnelkit.logger.b.a(str2, "encode err, in " + c.this.a(), e);
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.dianping.nvtunnelkit.kit.i
            public final /* synthetic */ void a_(Object obj, com.dianping.nvtunnelkit.exception.d dVar) {
                com.dianping.nvtunnelkit.core.b bVar = (com.dianping.nvtunnelkit.core.b) obj;
                Object[] objArr2 = {bVar, dVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "64e6dc8df12f957662909e71692bf5e3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "64e6dc8df12f957662909e71692bf5e3");
                } else {
                    c.this.a_(c.this.j.c(bVar), dVar);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.dianping.nvtunnelkit.kit.i
            public final /* synthetic */ void b(Object obj) {
                com.dianping.nvtunnelkit.core.b bVar = (com.dianping.nvtunnelkit.core.b) obj;
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7bf0035e52041b7d4a15b294b6e706bb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7bf0035e52041b7d4a15b294b6e706bb");
                    return;
                }
                Object a2 = c.this.j.a(bVar);
                if (a2 == null) {
                    String str = c.i;
                    com.dianping.nvtunnelkit.logger.b.b(str, "onSendReady(): pkg is null, clz " + c.this.a());
                    return;
                }
                c.this.b((c) a2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.dianping.nvtunnelkit.kit.i
            public final /* synthetic */ boolean b(Object obj, Object obj2) {
                com.dianping.nvtunnelkit.core.b bVar = (com.dianping.nvtunnelkit.core.b) obj;
                Object[] objArr2 = {bVar, obj2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "33ce12d73c6afa6b4fb6eb62edf1367e", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "33ce12d73c6afa6b4fb6eb62edf1367e")).booleanValue();
                }
                Object a2 = c.this.j.a(bVar);
                if (a2 == null) {
                    String str = c.i;
                    com.dianping.nvtunnelkit.logger.b.b(str, "onSendIntercept(): pkg is null, clz " + c.this.a());
                    return true;
                }
                return c.this.b(a2, obj2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.dianping.nvtunnelkit.kit.i
            public final /* synthetic */ void c(Object obj, Object obj2) {
                com.dianping.nvtunnelkit.core.b bVar = (com.dianping.nvtunnelkit.core.b) obj;
                Object[] objArr2 = {bVar, obj2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "603cd610b542f2511481f7b3749ed06f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "603cd610b542f2511481f7b3749ed06f");
                    return;
                }
                Object c = c.this.j.c(bVar);
                if (c == null) {
                    String str = c.i;
                    com.dianping.nvtunnelkit.logger.b.b(str, "onSendCompleted(): pkg is null, clz " + c.this.a());
                    return;
                }
                c.this.c(c, obj2);
            }

            @Override // com.dianping.nvtunnelkit.kit.i
            public final void a_(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "890dc89d7b86dbff2b1198090050b99a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "890dc89d7b86dbff2b1198090050b99a");
                    return;
                }
                com.dianping.nvtunnelkit.core.a aVar2 = c.this.j;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.dianping.nvtunnelkit.core.a.a;
                if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "8d5fb6338b3718393ca253264c25372a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "8d5fb6338b3718393ca253264c25372a");
                } else {
                    aVar2.b.clear();
                    aVar2.c.clear();
                }
                c.this.a_(th);
            }
        });
        this.k.a((j) new j<C, S2>() { // from class: com.dianping.nvtunnelkit.kit.c.3
            public static ChangeQuickRedirect a;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.dianping.nvtunnelkit.kit.j
            public final /* synthetic */ void a(Object obj, Object obj2, byte b) {
                com.dianping.nvtunnelkit.core.b bVar = (com.dianping.nvtunnelkit.core.b) obj;
                Object[] objArr2 = {bVar, obj2, Byte.valueOf(b)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3fbe4efadcaf5c77fd2fc2cefcc524d9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3fbe4efadcaf5c77fd2fc2cefcc524d9");
                } else {
                    c.this.a(c.this.j.a(bVar), obj2, b);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.dianping.nvtunnelkit.kit.j
            public final /* synthetic */ void a(Object obj, Object obj2, long j, int i2, byte b) {
                com.dianping.nvtunnelkit.core.b bVar = (com.dianping.nvtunnelkit.core.b) obj;
                Object[] objArr2 = {bVar, obj2, new Long(j), Integer.valueOf(i2), Byte.valueOf(b)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab0f7e770098dd9288bcf7a7a5dca671", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab0f7e770098dd9288bcf7a7a5dca671");
                } else {
                    c.this.a(c.this.j.a(bVar), obj2, j, i2, b);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "701e2e22793c0dc0be950638ceb5c8e9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "701e2e22793c0dc0be950638ceb5c8e9") : getClass().getCanonicalName();
    }

    @Override // com.dianping.nvtunnelkit.kit.i
    public final void b(S s) {
        Object[] objArr = {s};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "868c76a83dd12e8c5cb8c4e864f0fb0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "868c76a83dd12e8c5cb8c4e864f0fb0e");
            return;
        }
        Object[] objArr2 = {s};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "54df746c824e501c883fdf5f02c2b63f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "54df746c824e501c883fdf5f02c2b63f");
        } else if (s == null) {
            String str = i;
            com.dianping.nvtunnelkit.logger.b.b(str, "dispatchSendReady(): pkg is null, clz " + a());
        } else if (this.e != null) {
            this.e.b(s);
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.i
    public final C a(S s) {
        Object[] objArr = {s};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3af5596b08711be9c97f9ef015c33383", RobustBitConfig.DEFAULT_VALUE)) {
            return (C) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3af5596b08711be9c97f9ef015c33383");
        }
        Object[] objArr2 = {s};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "287929166e40445c0c6def85cfa09121", RobustBitConfig.DEFAULT_VALUE)) {
            return (C) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "287929166e40445c0c6def85cfa09121");
        }
        if (s == null) {
            String str = i;
            com.dianping.nvtunnelkit.logger.b.b(str, "dispatchSendSelectConnection(): pkg is null, clz " + a());
            return null;
        } else if (this.e != null) {
            return this.e.a(s);
        } else {
            return null;
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.i
    public final boolean b(S s, C c) {
        Object[] objArr = {s, c};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff4a371670d5d55d2187664c3c1ac36d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff4a371670d5d55d2187664c3c1ac36d")).booleanValue();
        }
        Object[] objArr2 = {s, c};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a58fe07bfc335be9647a93c5b8b396a2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a58fe07bfc335be9647a93c5b8b396a2")).booleanValue();
        }
        if (s != null) {
            return this.e != null && this.e.b(s, c);
        }
        String str = i;
        com.dianping.nvtunnelkit.logger.b.b(str, "dispatchInterceptSend(): pkg is null, clz " + a());
        return true;
    }

    @Override // com.dianping.nvtunnelkit.kit.i
    public final void a(S s, C c) {
        Object[] objArr = {s, c};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7942e266bda92d46356f44b130a94e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7942e266bda92d46356f44b130a94e5");
            return;
        }
        Object[] objArr2 = {s, c};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eacc2eb3e6f1a84cd057412d12a404e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eacc2eb3e6f1a84cd057412d12a404e6");
        } else if (s == null) {
            String str = i;
            com.dianping.nvtunnelkit.logger.b.b(str, "dispatchSendStart(): pkg is null, clz " + a());
        } else if (this.e != null) {
            this.e.a(s, c);
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.i
    public final void a_(S s, com.dianping.nvtunnelkit.exception.d dVar) {
        Object[] objArr = {s, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8e5b472a86effa95c1ce33434e660f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8e5b472a86effa95c1ce33434e660f7");
            return;
        }
        Object[] objArr2 = {s, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f502cc333c6a08a1faeeff2690265c57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f502cc333c6a08a1faeeff2690265c57");
        } else if (s == null) {
            String str = i;
            com.dianping.nvtunnelkit.logger.b.b(str, "dispatchSendFailed(): pkg is null, clz " + a());
        } else if (this.e != null) {
            this.e.a_(s, dVar);
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.i
    public final void c(S s, C c) {
        Object[] objArr = {s, c};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed21752b14e6e7dd2e052b20c517ebd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed21752b14e6e7dd2e052b20c517ebd4");
            return;
        }
        Object[] objArr2 = {s, c};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "90976c05db258f286d85120cad60f6ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "90976c05db258f286d85120cad60f6ee");
        } else if (s == null) {
            String str = i;
            com.dianping.nvtunnelkit.logger.b.b(str, "dispatchSendCompleted(): pkg is null, clz " + a());
        } else if (this.e != null) {
            this.e.c(s, c);
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.i
    public final void a_(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77e6ff93ce237a2aa1b7e7d9db78fe92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77e6ff93ce237a2aa1b7e7d9db78fe92");
            return;
        }
        Object[] objArr2 = {th};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9b7316ac340fbe9237c93ad2df6ce135", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9b7316ac340fbe9237c93ad2df6ce135");
            return;
        }
        String str = i;
        com.dianping.nvtunnelkit.logger.b.a(str, "dispatchSendError(), clz " + a(), th);
        if (this.e != null) {
            this.e.a_(th);
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.i.a
    public final void a(i<C, S> iVar) {
        this.e = iVar;
    }

    @Override // com.dianping.nvtunnelkit.kit.j
    public final void a(S s, C c, byte b) {
        Object[] objArr = {s, c, Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3eff88ee9c883613d2bbde7578f4092d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3eff88ee9c883613d2bbde7578f4092d");
            return;
        }
        Object[] objArr2 = {s, c, Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a04617853f4b7e8f476c3af6ceb978ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a04617853f4b7e8f476c3af6ceb978ef");
        } else if (s == null || this.f == null) {
        } else {
            this.f.a(s, c, b);
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.j
    public final void a(S s, C c, long j, int i2, byte b) {
        Object[] objArr = {s, c, new Long(j), Integer.valueOf(i2), Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "063056749b0af560fce13e6ba3bdffa8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "063056749b0af560fce13e6ba3bdffa8");
            return;
        }
        Object[] objArr2 = {s, c, new Long(j), Integer.valueOf(i2), Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "158fdf64e1a6e2d4269adf0e4f18f7b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "158fdf64e1a6e2d4269adf0e4f18f7b1");
        } else if (s == null || this.f == null) {
        } else {
            this.f.a(s, c, j, i2, b);
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.j.a
    public final void a(j<C, S> jVar) {
        this.f = jVar;
    }

    @Override // com.dianping.nvtunnelkit.kit.k
    public final void d(S s, C c) {
        Object[] objArr = {s, c};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d57075ca55944be257b40a1ebbe601a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d57075ca55944be257b40a1ebbe601a");
            return;
        }
        S2 c2 = c((c<C, S, R, S2, R2>) s);
        this.j.a(c2, s);
        this.k.d(c2, c);
    }

    @Override // com.dianping.nvtunnelkit.kit.k
    public void cancel(S s) {
        Object[] objArr = {s};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d943a681e6696412ed6b46b767363e2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d943a681e6696412ed6b46b767363e2f");
            return;
        }
        S2 b = this.j.b(s);
        if (b != null) {
            this.k.cancel(b);
        }
    }

    @Override // com.dianping.nvtunnelkit.kit.l.a
    public final void a(l<C, S, R> lVar) {
        this.d = lVar;
    }
}
