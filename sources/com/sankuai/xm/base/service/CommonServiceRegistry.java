package com.sankuai.xm.base.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.AbstractServiceRegistry;
import com.sankuai.xm.monitor.cat.c;
import com.sankuai.xm.monitor.statistics.b;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class CommonServiceRegistry extends AbstractServiceRegistry {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.xm.base.service.AbstractServiceRegistry
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cc94f83955410040359315aef358200", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cc94f83955410040359315aef358200");
            return;
        }
        a(g.class, new AbstractServiceRegistry.b<com.sankuai.xm.log.d>() { // from class: com.sankuai.xm.base.service.CommonServiceRegistry.1
            public static ChangeQuickRedirect c;

            @Override // com.sankuai.xm.base.service.k
            public final /* synthetic */ Object d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c4a90fd4cab290f157238df83b54343", 6917529027641081856L) ? (com.sankuai.xm.log.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c4a90fd4cab290f157238df83b54343") : com.sankuai.xm.log.d.a();
            }
        });
        a(com.sankuai.xm.threadpool.a.class, new AbstractServiceRegistry.b<com.sankuai.xm.threadpool.scheduler.a>() { // from class: com.sankuai.xm.base.service.CommonServiceRegistry.4
            public static ChangeQuickRedirect c;

            @Override // com.sankuai.xm.base.service.k
            public final /* synthetic */ Object d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c043cddfdd1a8a715afc7d60ea7ba5e", 6917529027641081856L) ? (com.sankuai.xm.threadpool.scheduler.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c043cddfdd1a8a715afc7d60ea7ba5e") : com.sankuai.xm.threadpool.scheduler.a.b();
            }
        });
        a(i.class, new AbstractServiceRegistry.b<com.sankuai.xm.base.extendimpl.a>() { // from class: com.sankuai.xm.base.service.CommonServiceRegistry.5
            public static ChangeQuickRedirect c;

            @Override // com.sankuai.xm.base.service.k
            public final /* synthetic */ Object d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ce102cad1074835fcebbbd5e9dae4d28", 6917529027641081856L) ? (com.sankuai.xm.base.extendimpl.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ce102cad1074835fcebbbd5e9dae4d28") : com.sankuai.xm.base.extendimpl.a.a();
            }
        });
        a(l.class, new AbstractServiceRegistry.b<com.sankuai.xm.base.service.impl.c>() { // from class: com.sankuai.xm.base.service.CommonServiceRegistry.6
            public static ChangeQuickRedirect c;

            @Override // com.sankuai.xm.base.service.k
            public final /* synthetic */ Object d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8fc8c3705470ede53a848d80d0d7e5fe", 6917529027641081856L) ? (com.sankuai.xm.base.service.impl.c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8fc8c3705470ede53a848d80d0d7e5fe") : new com.sankuai.xm.base.service.impl.c();
            }
        });
        a(c.class, new AbstractServiceRegistry.b<com.sankuai.xm.base.service.impl.a>() { // from class: com.sankuai.xm.base.service.CommonServiceRegistry.7
            public static ChangeQuickRedirect c;

            @Override // com.sankuai.xm.base.service.k
            public final /* synthetic */ Object d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fc662dcad32332a449ff97a0cfee086d", 6917529027641081856L) ? (com.sankuai.xm.base.service.impl.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fc662dcad32332a449ff97a0cfee086d") : new com.sankuai.xm.base.service.impl.a();
            }
        });
        a(d.class, new AbstractServiceRegistry.b<com.sankuai.xm.base.service.impl.b>() { // from class: com.sankuai.xm.base.service.CommonServiceRegistry.8
            public static ChangeQuickRedirect c;

            @Override // com.sankuai.xm.base.service.k
            public final /* synthetic */ Object d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9d4a4db90a1ce8e21e749b17c7ae7e4", 6917529027641081856L) ? (com.sankuai.xm.base.service.impl.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9d4a4db90a1ce8e21e749b17c7ae7e4") : new com.sankuai.xm.base.service.impl.b();
            }
        });
        a(com.sankuai.xm.network.f.class, new AbstractServiceRegistry.b<com.sankuai.xm.network.httpurlconnection.g>() { // from class: com.sankuai.xm.base.service.CommonServiceRegistry.9
            public static ChangeQuickRedirect c;

            @Override // com.sankuai.xm.base.service.k
            public final /* synthetic */ Object d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7329f460994dc79da97b0d7998e4d903", 6917529027641081856L) ? (com.sankuai.xm.network.httpurlconnection.g) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7329f460994dc79da97b0d7998e4d903") : com.sankuai.xm.network.httpurlconnection.g.a();
            }
        });
        a(h.class, new AbstractServiceRegistry.b<com.sankuai.xm.base.hornconfig.a>() { // from class: com.sankuai.xm.base.service.CommonServiceRegistry.10
            public static ChangeQuickRedirect c;

            @Override // com.sankuai.xm.base.service.k
            public final /* synthetic */ Object d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "911ac9880b5cc017b25b30fec4d4c04b", 6917529027641081856L) ? (com.sankuai.xm.base.hornconfig.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "911ac9880b5cc017b25b30fec4d4c04b") : com.sankuai.xm.base.hornconfig.a.a();
            }
        });
        a(f.class, new AbstractServiceRegistry.b<com.sankuai.xm.base.e>() { // from class: com.sankuai.xm.base.service.CommonServiceRegistry.11
            public static ChangeQuickRedirect c;

            @Override // com.sankuai.xm.base.service.k
            public final /* synthetic */ Object d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2da807602e10bad2113272dc7e2423bf", 6917529027641081856L) ? (com.sankuai.xm.base.e) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2da807602e10bad2113272dc7e2423bf") : com.sankuai.xm.base.e.a();
            }
        });
        a(e.class, new AbstractServiceRegistry.b<e>() { // from class: com.sankuai.xm.base.service.CommonServiceRegistry.2
            public static ChangeQuickRedirect c;

            @Override // com.sankuai.xm.base.service.k
            public final /* synthetic */ Object d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e41daa5e467a65df6b60faf90c789031", 6917529027641081856L) ? (e) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e41daa5e467a65df6b60faf90c789031") : new AnonymousClass1();
            }

            /* compiled from: ProGuard */
            /* renamed from: com.sankuai.xm.base.service.CommonServiceRegistry$2$1  reason: invalid class name */
            /* loaded from: classes6.dex */
            public class AnonymousClass1 implements e {
                public static ChangeQuickRedirect a;

                public AnonymousClass1() {
                }

                @Override // com.sankuai.xm.base.service.e
                public final void a(String str, Map<String, Object> map) {
                    Object[] objArr = {str, map};
                    ChangeQuickRedirect changeQuickRedirect = a;
                    if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3696c5738e9af1b4ceaeaf726ab6aa0", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3696c5738e9af1b4ceaeaf726ab6aa0");
                    } else {
                        com.sankuai.xm.monitor.c.a(str, map);
                    }
                }

                @Override // com.sankuai.xm.base.service.e
                public final void a(String str) {
                    Object[] objArr = {str};
                    ChangeQuickRedirect changeQuickRedirect = a;
                    if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3481ca93fa70e4cb0bb6b506e51361a4", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3481ca93fa70e4cb0bb6b506e51361a4");
                    } else {
                        com.sankuai.xm.monitor.c.a(str);
                    }
                }

                @Override // com.sankuai.xm.base.service.e
                public final void b(final String str, final Map<String, Object> map) {
                    Object[] objArr = {str, map};
                    ChangeQuickRedirect changeQuickRedirect = a;
                    if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "292830a48570ed55ebcac9607f18692e", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "292830a48570ed55ebcac9607f18692e");
                        return;
                    }
                    map.put("ts_preset", Long.valueOf(System.currentTimeMillis()));
                    com.sankuai.xm.threadpool.scheduler.a.b().a(22, new Runnable() { // from class: com.sankuai.xm.base.service.CommonServiceRegistry.2.1.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1203a4a42d58e7a97def6f813e86a47a", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1203a4a42d58e7a97def6f813e86a47a");
                            } else {
                                AnonymousClass1.this.a(str, map);
                            }
                        }
                    });
                }

                @Override // com.sankuai.xm.base.service.e
                public final void a() {
                    Object[] objArr = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect = a;
                    if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "151e0a883333ab6574a3ce78b3ab7f39", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "151e0a883333ab6574a3ce78b3ab7f39");
                    } else {
                        com.sankuai.xm.monitor.report.c.b().c();
                    }
                }

                @Override // com.sankuai.xm.base.service.e
                public final void a(com.sankuai.xm.monitor.cat.b bVar) {
                    Object[] objArr = {bVar};
                    ChangeQuickRedirect changeQuickRedirect = a;
                    if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21ac7dafb5759df9dcf1a873ba90a258", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21ac7dafb5759df9dcf1a873ba90a258");
                    } else {
                        c.a.a.a(bVar);
                    }
                }

                @Override // com.sankuai.xm.base.service.e
                public final void a(long j, long j2) {
                    Object[] objArr = {new Long(j), new Long(j2)};
                    ChangeQuickRedirect changeQuickRedirect = a;
                    if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91b9ec5d93b34cb5f8c711c211c0110f", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91b9ec5d93b34cb5f8c711c211c0110f");
                        return;
                    }
                    com.sankuai.xm.monitor.statistics.b bVar = b.C1415b.a;
                    Object[] objArr2 = {new Long(j), new Long(j2)};
                    ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.monitor.statistics.b.a;
                    if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "6dd315b70a223539c098bd89b4f9447c", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "6dd315b70a223539c098bd89b4f9447c");
                        return;
                    }
                    com.sankuai.xm.base.entity.c cVar = new com.sankuai.xm.base.entity.c();
                    cVar.a = j;
                    cVar.b = j2;
                    bVar.b.a((c) cVar);
                }
            }
        });
        a(com.sankuai.xm.base.feedback.a.class, new AbstractServiceRegistry.b<com.sankuai.xm.base.feedback.b>() { // from class: com.sankuai.xm.base.service.CommonServiceRegistry.3
            public static ChangeQuickRedirect c;

            @Override // com.sankuai.xm.base.service.k
            public final /* synthetic */ Object d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "80f3d62cf7cb4f3bd0b75a5c05b5d279", 6917529027641081856L) ? (com.sankuai.xm.base.feedback.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "80f3d62cf7cb4f3bd0b75a5c05b5d279") : new com.sankuai.xm.base.feedback.b();
            }
        });
        com.sankuai.xm.log.c.b("CommonServiceRegistry", "doRegister", new Object[0]);
    }
}
