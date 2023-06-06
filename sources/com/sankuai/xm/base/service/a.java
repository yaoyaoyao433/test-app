package com.sankuai.xm.base.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class a implements j {
    public static ChangeQuickRedirect g = null;
    public static int h = 0;
    public static int i = 1;
    private Map<Class<?>, Object> a;
    private volatile int b;

    public int a() {
        return 0;
    }

    public void a(long j) {
    }

    public void k() {
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a08deb8dcacbf511735b3cc12fc1fb6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a08deb8dcacbf511735b3cc12fc1fb6");
            return;
        }
        this.a = new ConcurrentHashMap();
        this.b = h;
    }

    @Override // com.sankuai.xm.base.service.j
    public final int j() {
        com.sankuai.xm.threadpool.a aVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02085d06d89fcae74584eb51ecbd9db4", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02085d06d89fcae74584eb51ecbd9db4")).intValue();
        }
        if (this.b == h) {
            this.b = i;
            if (this instanceof com.sankuai.xm.base.component.a) {
                ((com.sankuai.xm.base.component.a) this).a(null);
            }
            int a = a();
            if (this instanceof com.sankuai.xm.threadpool.a) {
                aVar = (com.sankuai.xm.threadpool.a) this;
            } else {
                aVar = (com.sankuai.xm.threadpool.a) m.a(com.sankuai.xm.threadpool.a.class);
            }
            aVar.b(new Runnable() { // from class: com.sankuai.xm.base.service.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9cebdce1aad5d6b4629ff2de1b741c61", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9cebdce1aad5d6b4629ff2de1b741c61");
                    } else {
                        a.this.k();
                    }
                }
            });
            return a;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> T b_(java.lang.Class<T> r12) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.xm.base.service.a.g
            java.lang.String r10 = "5775be93e514182e5e77696df3ca850b"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            java.lang.Object r12 = (java.lang.Object) r12
            return r12
        L1e:
            java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r11.a
            boolean r0 = r0.containsKey(r12)
            if (r0 == 0) goto L31
            java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r11.a
            java.lang.Object r0 = r0.get(r12)
            java.lang.Object r12 = r12.cast(r0)
            return r12
        L31:
            r0 = 0
            java.lang.Object r1 = com.sankuai.xm.base.service.m.d(r12)     // Catch: java.lang.Exception -> L57
            boolean r2 = r1 instanceof com.sankuai.xm.base.service.j     // Catch: java.lang.Exception -> L55
            if (r2 == 0) goto L42
            r2 = r1
            com.sankuai.xm.base.service.j r2 = (com.sankuai.xm.base.service.j) r2     // Catch: java.lang.Exception -> L55
            int r2 = r2.j()     // Catch: java.lang.Exception -> L55
            r8 = r2
        L42:
            if (r8 != 0) goto L64
            boolean r2 = r1 instanceof com.sankuai.xm.base.service.a     // Catch: java.lang.Exception -> L55
            if (r2 == 0) goto L64
            r2 = r1
            com.sankuai.xm.base.service.a r2 = (com.sankuai.xm.base.service.a) r2     // Catch: java.lang.Exception -> L55
            com.sankuai.xm.base.f r3 = com.sankuai.xm.base.f.m()     // Catch: java.lang.Exception -> L55
            long r3 = r3.b     // Catch: java.lang.Exception -> L55
            r2.a(r3)     // Catch: java.lang.Exception -> L55
            goto L64
        L55:
            r2 = move-exception
            goto L59
        L57:
            r2 = move-exception
            r1 = r0
        L59:
            com.sankuai.xm.log.a.a(r2)
            com.sankuai.xm.base.f r3 = com.sankuai.xm.base.f.m()
            boolean r3 = r3.e
            if (r3 != 0) goto L90
        L64:
            if (r1 == 0) goto L8f
            if (r8 == 0) goto L8a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r2 = "Service ["
            r12.<init>(r2)
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r12.append(r1)
            java.lang.String r1 = "] init failed, code: "
            r12.append(r1)
            r12.append(r8)
            java.lang.String r12 = r12.toString()
            com.sankuai.xm.log.a.b(r12)
            return r0
        L8a:
            java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r11.a
            r0.put(r12, r1)
        L8f:
            return r1
        L90:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            r12.<init>(r2)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.base.service.a.b_(java.lang.Class):java.lang.Object");
    }
}
