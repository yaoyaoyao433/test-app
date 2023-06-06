package com.sankuai.xm.login.manager.lvs;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.ac;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b {
    public static ChangeQuickRedirect a;
    f b;
    public C1411b c;
    public volatile boolean d;
    List<c> e;
    private d f;
    private final int g;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(Object obj, List<com.sankuai.xm.login.manager.lvs.a> list);
    }

    public b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "335e253993064fa16d1b78d04f5e0643", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "335e253993064fa16d1b78d04f5e0643");
            return;
        }
        this.g = i;
        this.d = false;
        com.sankuai.xm.login.manager.lvs.c cVar = new com.sankuai.xm.login.manager.lvs.c(i);
        this.f = new d(cVar);
        this.b = new f(cVar);
        this.c = new C1411b();
        this.e = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0295  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.sankuai.xm.login.manager.lvs.a> a() {
        /*
            Method dump skipped, instructions count: 1077
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.login.manager.lvs.b.a():java.util.List");
    }

    public final List<com.sankuai.xm.base.proto.protosingal.a> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9b446a4cafc279fde645c6a28bfc04d", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9b446a4cafc279fde645c6a28bfc04d");
        }
        String a2 = com.sankuai.xm.network.setting.f.a().b().a(this.g);
        List<com.sankuai.xm.base.proto.protosingal.a> a3 = this.f.a(a2);
        this.b.a(a3, a2);
        return a3;
    }

    public final void a(Object obj, a aVar) {
        Object[] objArr = {obj, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "933ad5bc16be8ffa88d6b8ced3543172", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "933ad5bc16be8ffa88d6b8ced3543172");
            return;
        }
        synchronized (c.class) {
            if (this.e.isEmpty()) {
                com.sankuai.xm.login.d.a("IPSelector::loadRemoteAddressCandidates:: lvs req is empty");
                m.e().b(j.a(new Runnable() { // from class: com.sankuai.xm.login.manager.lvs.b.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f131350e5cd2f539177f96c8c8b66f4f", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f131350e5cd2f539177f96c8c8b66f4f");
                            return;
                        }
                        List<com.sankuai.xm.login.manager.lvs.a> a2 = b.this.a();
                        ArrayList<c> arrayList = new ArrayList();
                        synchronized (c.class) {
                            arrayList.addAll(b.this.e);
                            b.this.e.clear();
                        }
                        for (c cVar : arrayList) {
                            cVar.b.a(cVar.a, a2);
                        }
                    }
                }));
            }
            this.e.add(new c(obj, aVar));
        }
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d387a4e19dbe015d8d1bbc1ed685ab2", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d387a4e19dbe015d8d1bbc1ed685ab2")).booleanValue();
        }
        List<com.sankuai.xm.base.proto.protosingal.a> b = this.b.b();
        if (!com.sankuai.xm.base.util.b.a(b)) {
            com.sankuai.xm.network.setting.f.a().b().a(b);
        }
        List<com.sankuai.xm.login.manager.lvs.a> a2 = this.b.a();
        if (a2 == null || a2.isEmpty()) {
            return false;
        }
        a(a2);
        return true;
    }

    private void a(List<com.sankuai.xm.login.manager.lvs.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d87b6722a7a20e2ee71cb08a224346e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d87b6722a7a20e2ee71cb08a224346e");
        } else {
            this.c.a(list);
        }
    }

    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7701444680b56a9795c807ebfcd1334", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7701444680b56a9795c807ebfcd1334")).booleanValue() : this.c.a() > 0;
    }

    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62cc61ab03e679fb54b5b17a6dfc0450", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62cc61ab03e679fb54b5b17a6dfc0450")).intValue() : this.c.a();
    }

    public final boolean a(com.sankuai.xm.login.manager.lvs.a aVar, boolean z, boolean z2) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc6eb248236cee305966b189f4c480fd", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc6eb248236cee305966b189f4c480fd")).booleanValue() : this.c.a(aVar, z, z2);
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a978526e81dd49810137ab8b480d1554", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a978526e81dd49810137ab8b480d1554");
            return;
        }
        C1411b c1411b = this.c;
        c1411b.d();
        List<com.sankuai.xm.login.manager.lvs.a> c2 = c1411b.c();
        if (!this.d) {
            Object[] objArr2 = {c2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d413e6986bbbe4ba2e666a7fbdd8f89c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d413e6986bbbe4ba2e666a7fbdd8f89c");
            } else {
                f fVar = this.b;
                Object[] objArr3 = {c2};
                ChangeQuickRedirect changeQuickRedirect3 = f.a;
                if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "c1b980ee2af97088cb16e48144fbc60a", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "c1b980ee2af97088cb16e48144fbc60a");
                } else if (fVar.c != null) {
                    fVar.c.a(false, fVar.b, c2);
                }
            }
        }
        com.sankuai.xm.login.d.a("IPSelector::saveAddressCandidates:: lvs current list: " + c2 + ",fallback:" + this.d);
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6e016d800bf12267945028add712247", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6e016d800bf12267945028add712247");
            return;
        }
        List<com.sankuai.xm.login.manager.lvs.a> c2 = this.c.c();
        if (!com.sankuai.xm.base.util.b.a(c2)) {
            this.b.d(c2);
        }
        a(c2);
    }

    public final void a(com.sankuai.xm.login.manager.lvs.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbfd542e4615d5ffda29a57844dad112", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbfd542e4615d5ffda29a57844dad112");
            return;
        }
        a(aVar, z, true);
        f();
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a2b5d7a9bbb15435bc1742460e4ddf3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a2b5d7a9bbb15435bc1742460e4ddf3");
            return;
        }
        g();
        h();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.login.manager.lvs.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public class C1411b {
        public static ChangeQuickRedirect a;
        private List<com.sankuai.xm.login.manager.lvs.a> c;

        private C1411b() {
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "988a58b928ea227f0b74bf3df2b2a46a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "988a58b928ea227f0b74bf3df2b2a46a");
            } else {
                this.c = new ArrayList();
            }
        }

        synchronized int a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dec1e6795ff63e7ea73a9ea862f6a9bb", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dec1e6795ff63e7ea73a9ea862f6a9bb")).intValue();
            }
            return this.c.size();
        }

        public synchronized void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1078b13a19882f9d28089d72e8119c7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1078b13a19882f9d28089d72e8119c7");
            } else {
                this.c.clear();
            }
        }

        synchronized void a(List<com.sankuai.xm.login.manager.lvs.a> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03ececffad4d6c88d379b063f848b55b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03ececffad4d6c88d379b063f848b55b");
                return;
            }
            this.c.clear();
            if (list != null) {
                this.c.addAll(list);
            }
        }

        public synchronized List<com.sankuai.xm.login.manager.lvs.a> c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4c3bbd8becdfde6d5dd78df3ce0779f", 6917529027641081856L)) {
                return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4c3bbd8becdfde6d5dd78df3ce0779f");
            }
            return new ArrayList(this.c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
            if (r4.f <= (-3)) goto L25;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final synchronized void d() {
            /*
                r17 = this;
                r8 = r17
                monitor-enter(r17)
                r0 = 0
                java.lang.Object[] r9 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L7f
                com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.xm.login.manager.lvs.b.C1411b.a     // Catch: java.lang.Throwable -> L7f
                java.lang.String r11 = "54c82a893214da4e2553ce48a1e38a10"
                r4 = 0
                r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
                r1 = r9
                r2 = r17
                r3 = r10
                r5 = r11
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L7f
                if (r1 == 0) goto L1d
                com.meituan.robust.PatchProxy.accessDispatch(r9, r8, r10, r0, r11)     // Catch: java.lang.Throwable -> L7f
                monitor-exit(r17)
                return
            L1d:
                java.util.List<com.sankuai.xm.login.manager.lvs.a> r1 = r8.c     // Catch: java.lang.Throwable -> L7f
                int r1 = r1.size()     // Catch: java.lang.Throwable -> L7f
                r2 = 1
                int r1 = r1 - r2
                r3 = 0
            L26:
                if (r1 < 0) goto L70
                java.util.List<com.sankuai.xm.login.manager.lvs.a> r4 = r8.c     // Catch: java.lang.Throwable -> L7f
                java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L7f
                com.sankuai.xm.login.manager.lvs.a r4 = (com.sankuai.xm.login.manager.lvs.a) r4     // Catch: java.lang.Throwable -> L7f
                com.sankuai.xm.login.manager.lvs.b r5 = com.sankuai.xm.login.manager.lvs.b.this     // Catch: java.lang.Throwable -> L7f
                com.sankuai.xm.login.manager.lvs.f r5 = r5.b     // Catch: java.lang.Throwable -> L7f
                java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L7f
                r6[r0] = r4     // Catch: java.lang.Throwable -> L7f
                com.meituan.robust.ChangeQuickRedirect r7 = com.sankuai.xm.login.manager.lvs.f.a     // Catch: java.lang.Throwable -> L7f
                java.lang.String r14 = "5648000ffe18360dbb0771d9304eefe4"
                r12 = 0
                r15 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
                r9 = r6
                r10 = r5
                r11 = r7
                r13 = r14
                r2 = r14
                r14 = r15
                boolean r9 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L7f
                if (r9 == 0) goto L56
                java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r6, r5, r7, r0, r2)     // Catch: java.lang.Throwable -> L7f
                java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L7f
                boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L7f
                goto L68
            L56:
                boolean r2 = r4.g     // Catch: java.lang.Throwable -> L7f
                if (r2 == 0) goto L63
                int r2 = r4.f     // Catch: java.lang.Throwable -> L7f
                r4 = -3
                if (r2 > r4) goto L61
            L5f:
                r2 = 1
                goto L68
            L61:
                r2 = 0
                goto L68
            L63:
                int r2 = r4.f     // Catch: java.lang.Throwable -> L7f
                if (r2 > 0) goto L61
                goto L5f
            L68:
                if (r2 == 0) goto L6c
                int r3 = r3 + 1
            L6c:
                int r1 = r1 + (-1)
                r2 = 1
                goto L26
            L70:
                java.util.List<com.sankuai.xm.login.manager.lvs.a> r0 = r8.c     // Catch: java.lang.Throwable -> L7f
                int r0 = r0.size()     // Catch: java.lang.Throwable -> L7f
                if (r3 < r0) goto L7d
                java.util.List<com.sankuai.xm.login.manager.lvs.a> r0 = r8.c     // Catch: java.lang.Throwable -> L7f
                r0.clear()     // Catch: java.lang.Throwable -> L7f
            L7d:
                monitor-exit(r17)
                return
            L7f:
                r0 = move-exception
                monitor-exit(r17)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.login.manager.lvs.b.C1411b.d():void");
        }

        public final synchronized boolean a(com.sankuai.xm.login.manager.lvs.a aVar, boolean z, boolean z2) {
            Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "339d53c12164ad1f81a98d1bc43ab1bf", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "339d53c12164ad1f81a98d1bc43ab1bf")).booleanValue();
            } else if (aVar == null) {
                return false;
            } else {
                for (int size = this.c.size() - 1; size >= 0; size--) {
                    com.sankuai.xm.login.manager.lvs.a aVar2 = this.c.get(size);
                    if (aVar2.equals(aVar)) {
                        if (z) {
                            b.this.b.a(aVar2);
                        } else {
                            f fVar = b.this.b;
                            Object[] objArr2 = {aVar2, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                            ChangeQuickRedirect changeQuickRedirect2 = f.a;
                            if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "a3e63c4a335fb0f74c9d3805453a1b19", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "a3e63c4a335fb0f74c9d3805453a1b19");
                            } else if (aVar2 != null) {
                                if (!z2 && aVar2.h > 0 && System.currentTimeMillis() - aVar2.h < 10000) {
                                    com.sankuai.xm.login.d.a("IPSelector::decreaseRank:: lvs rank failed");
                                } else {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    Object[] objArr3 = {new Long(currentTimeMillis)};
                                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.login.manager.lvs.a.a;
                                    if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "26240e3caafff5496b886bedda1123c4", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "26240e3caafff5496b886bedda1123c4");
                                    } else {
                                        aVar2.h = currentTimeMillis;
                                    }
                                    aVar2.f--;
                                }
                            }
                        }
                        com.sankuai.xm.login.d.b("IPSelector::updateAddress, addr:" + aVar2 + CommonConstant.Symbol.COMMA + z);
                        return true;
                    }
                }
                return false;
            }
        }

        public final synchronized void e() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1910a4aeb980728fda2202156a7332f1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1910a4aeb980728fda2202156a7332f1");
                return;
            }
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                b.this.b.a(this.c.get(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class c {
        public final Object a;
        public final a b;

        public c(Object obj, a aVar) {
            this.a = obj;
            this.b = aVar;
        }
    }

    public static String a(com.sankuai.xm.login.manager.lvs.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "111b32d72ed91886ad832eda59c63f08", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "111b32d72ed91886ad832eda59c63f08");
        }
        if (aVar == null) {
            return "";
        }
        if (!ac.a(aVar.e) && m.a().n()) {
            return aVar.e;
        }
        return aVar.d;
    }

    public static boolean b(com.sankuai.xm.login.manager.lvs.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "55b6c94fdf8a3d9d29833a9ee5ae1e53", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "55b6c94fdf8a3d9d29833a9ee5ae1e53")).booleanValue() : (aVar == null || ac.a(aVar.e) || !m.a().n()) ? false : true;
    }
}
