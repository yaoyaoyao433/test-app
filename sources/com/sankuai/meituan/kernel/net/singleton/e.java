package com.sankuai.meituan.kernel.net.singleton;

import com.dianping.nvnetwork.NVDefaultNetworkService;
import com.dianping.nvnetwork.r;
import com.meituan.metrics.traffic.reflection.SharkWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.kernel.net.nvnetwork.m;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        private static c b;

        static {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            b = PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1109f5921bfbfc7076f8770a62845add", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1109f5921bfbfc7076f8770a62845add") : new c() { // from class: com.sankuai.meituan.kernel.net.singleton.e.a.1
                public static ChangeQuickRedirect a;

                /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
                    if (r13.equals("nv") == false) goto L25;
                 */
                @Override // com.sankuai.meituan.kernel.net.singleton.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final com.dianping.nvnetwork.j a(java.lang.String r13) {
                    /*
                        r12 = this;
                        r0 = 1
                        java.lang.Object[] r8 = new java.lang.Object[r0]
                        r9 = 0
                        r8[r9] = r13
                        com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.meituan.kernel.net.singleton.e.a.AnonymousClass1.a
                        java.lang.String r11 = "108baf9741e8359ffe12ceca5ef47bc1"
                        r4 = 0
                        r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                        r1 = r8
                        r2 = r12
                        r3 = r10
                        r5 = r11
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                        if (r1 == 0) goto L1e
                        java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
                        com.dianping.nvnetwork.j r13 = (com.dianping.nvnetwork.j) r13
                        return r13
                    L1e:
                        java.lang.Object[] r8 = new java.lang.Object[r0]
                        r8[r9] = r13
                        com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.meituan.kernel.net.singleton.f.a
                        java.lang.String r11 = "3b31ec926b20ea522aad4515b516ec24"
                        r2 = 0
                        r4 = 1
                        r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                        r1 = r8
                        r3 = r10
                        r5 = r11
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                        if (r1 == 0) goto L3b
                        r13 = 0
                        java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r10, r0, r11)
                        com.dianping.nvnetwork.j r13 = (com.dianping.nvnetwork.j) r13
                        return r13
                    L3b:
                        if (r13 != 0) goto L40
                        java.lang.String r13 = "nvdefault"
                    L40:
                        r1 = -1
                        int r2 = r13.hashCode()
                        r3 = -213502087(0xfffffffff3463779, float:-1.5704344E31)
                        if (r2 == r3) goto L59
                        r3 = 3528(0xdc8, float:4.944E-42)
                        if (r2 == r3) goto L4f
                        goto L64
                    L4f:
                        java.lang.String r2 = "nv"
                        boolean r2 = r13.equals(r2)
                        if (r2 == 0) goto L64
                        goto L65
                    L59:
                        java.lang.String r0 = "nvdefault"
                        boolean r0 = r13.equals(r0)
                        if (r0 == 0) goto L64
                        r0 = 0
                        goto L65
                    L64:
                        r0 = -1
                    L65:
                        switch(r0) {
                            case 0: goto L88;
                            case 1: goto L83;
                            default: goto L68;
                        }
                    L68:
                        java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        java.lang.String r2 = "key: "
                        r1.<init>(r2)
                        r1.append(r13)
                        java.lang.String r13 = "not supported"
                        r1.append(r13)
                        java.lang.String r13 = r1.toString()
                        r0.<init>(r13)
                        throw r0
                    L83:
                        com.dianping.nvnetwork.j r13 = com.sankuai.meituan.kernel.net.singleton.f.b.a()
                        return r13
                    L88:
                        com.dianping.nvnetwork.j r13 = com.sankuai.meituan.kernel.net.singleton.f.a.a()
                        return r13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.kernel.net.singleton.e.a.AnonymousClass1.a(java.lang.String):com.dianping.nvnetwork.j");
                }

                @Override // com.sankuai.meituan.kernel.net.singleton.c
                public final com.dianping.nvnetwork.j a(com.sankuai.meituan.kernel.net.d dVar) {
                    Object[] objArr2 = {dVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "584e1309390b78957cd50b23f398f895", RobustBitConfig.DEFAULT_VALUE)) {
                        return (com.dianping.nvnetwork.j) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "584e1309390b78957cd50b23f398f895");
                    }
                    Object[] objArr3 = {dVar};
                    ChangeQuickRedirect changeQuickRedirect3 = f.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "481ffbda771f59dce578cf7240ede99a", RobustBitConfig.DEFAULT_VALUE)) {
                        return (com.dianping.nvnetwork.j) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "481ffbda771f59dce578cf7240ede99a");
                    }
                    NVDefaultNetworkService.a aVar = new NVDefaultNetworkService.a(com.sankuai.meituan.kernel.net.base.c.b);
                    SharkWrapper.addInterceptorToBuilder(aVar);
                    aVar.a(new com.sankuai.meituan.kernel.net.nvnetwork.f()).a(new m("defaultnvnetwork"));
                    if (dVar != null) {
                        Object[] b2 = dVar.b();
                        if (b2 != null) {
                            for (Object obj : b2) {
                                if (obj != null && (obj instanceof r)) {
                                    aVar.a((r) obj);
                                }
                            }
                        }
                        aVar.e = false;
                        aVar.c = dVar.c();
                    }
                    return aVar.a();
                }
            };
        }
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c6c0bfb0ac131223f7c469ee3913c7d3", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c6c0bfb0ac131223f7c469ee3913c7d3") : a.b;
    }
}
