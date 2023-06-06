package com.meituan.msc.modules.manager;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class l {
    public static ChangeQuickRedirect a;
    k b;
    private Map<String, k> c;
    private Map<String, Class<? extends k>> d;
    private Map<Class, Set<String>> e;
    private com.meituan.msc.modules.engine.h f;
    private volatile boolean g;

    public l(com.meituan.msc.modules.engine.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f38c922d77a0ade86514f4b01d543b3f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f38c922d77a0ade86514f4b01d543b3f");
            return;
        }
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        this.g = false;
        this.f = hVar;
    }

    public final void a(com.meituan.msc.modules.engine.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4a3e494bbd23cac9cfc4593344b8303", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4a3e494bbd23cac9cfc4593344b8303");
            return;
        }
        for (k kVar : this.c.values()) {
            kVar.b(eVar);
        }
    }

    public final void a(Class<? extends k> cls, Class... clsArr) throws RuntimeException {
        Object[] objArr = {cls, clsArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddbedc14ddf1376315226bf87845e9b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddbedc14ddf1376315226bf87845e9b7");
            return;
        }
        String a2 = r.a(cls, true);
        synchronized (this) {
            this.d.put(a2, cls);
            for (Class cls2 : clsArr) {
                Set<String> set = this.e.get(cls2);
                if (set == null) {
                    set = new HashSet<>();
                }
                set.add(a2);
                this.e.put(cls2, set);
            }
        }
    }

    public final void a(k kVar, Class... clsArr) {
        Object[] objArr = {kVar, clsArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0da21890f285ea2517849d14429578e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0da21890f285ea2517849d14429578e4");
        } else if (kVar != null) {
            com.meituan.msc.modules.reporter.g.b("MSCModuleManager", "registerModule", kVar);
            kVar.o = this.b;
            kVar.b(this.f);
            String J_ = kVar.J_();
            synchronized (this) {
                this.c.put(J_, kVar);
                if (clsArr != null) {
                    for (Class cls : clsArr) {
                        Set<String> set = this.e.get(cls);
                        if (set == null) {
                            set = new HashSet<>();
                        }
                        set.add(J_);
                        this.e.put(cls, set);
                    }
                }
            }
            kVar.a(this.f);
        }
    }

    public final synchronized void a(k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "439b12a430f49478fa08fa538717e34d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "439b12a430f49478fa08fa538717e34d");
            return;
        }
        if (kVar != null && this.c.containsValue(kVar)) {
            this.c.values().remove(kVar);
            kVar.o();
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebd87901820f1ecd0017048d91ae2659", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebd87901820f1ecd0017048d91ae2659");
        } else if (!this.g) {
            this.g = true;
            for (k kVar : this.c.values()) {
                kVar.o();
            }
            synchronized (this) {
                this.c.clear();
                this.d.clear();
                this.e.clear();
            }
        }
    }

    public final <T> T a(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8f6ab7c6e71c2887f63d92fb33baf8c", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8f6ab7c6e71c2887f63d92fb33baf8c");
        }
        Set<String> set = this.e.get(cls);
        String next = set != null ? set.iterator().next() : null;
        if (TextUtils.isEmpty(next)) {
            next = r.a(cls, false);
        }
        if (TextUtils.isEmpty(next)) {
            return null;
        }
        return (T) a(next);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.meituan.msc.modules.manager.k a(java.lang.String r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.msc.modules.manager.l.a
            java.lang.String r11 = "0bad5f5abbdf7ec7a8b796f3d92281a9"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            com.meituan.msc.modules.manager.k r13 = (com.meituan.msc.modules.manager.k) r13
            return r13
        L1e:
            boolean r1 = r12.g
            if (r1 == 0) goto L3d
            java.lang.String r0 = "MSCModuleManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "trying to get module "
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r13 = " after runtime destroyed"
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            com.meituan.msc.modules.reporter.g.a(r0, r13)
            r13 = 0
            return r13
        L3d:
            monitor-enter(r12)
            java.util.Map<java.lang.String, com.meituan.msc.modules.manager.k> r1 = r12.c     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r1 = r1.get(r13)     // Catch: java.lang.Throwable -> Lc1
            com.meituan.msc.modules.manager.k r1 = (com.meituan.msc.modules.manager.k) r1     // Catch: java.lang.Throwable -> Lc1
            if (r1 != 0) goto L95
            java.util.Map<java.lang.String, java.lang.Class<? extends com.meituan.msc.modules.manager.k>> r2 = r12.d     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r2 = r2.get(r13)     // Catch: java.lang.Throwable -> Lc1
            java.lang.Class r2 = (java.lang.Class) r2     // Catch: java.lang.Throwable -> Lc1
            if (r2 == 0) goto L95
            java.lang.Object r3 = r2.newInstance()     // Catch: java.lang.Throwable -> L80
            com.meituan.msc.modules.manager.k r3 = (com.meituan.msc.modules.manager.k) r3     // Catch: java.lang.Throwable -> L80
            com.meituan.msc.modules.manager.k r1 = r12.b     // Catch: java.lang.Throwable -> L7e
            r3.o = r1     // Catch: java.lang.Throwable -> L7e
            com.meituan.msc.modules.engine.h r1 = r12.f     // Catch: java.lang.Throwable -> L7e
            r3.b(r1)     // Catch: java.lang.Throwable -> L7e
            java.util.Map<java.lang.String, com.meituan.msc.modules.manager.k> r1 = r12.c     // Catch: java.lang.Throwable -> L7e
            r1.put(r13, r3)     // Catch: java.lang.Throwable -> L7e
            java.util.Map<java.lang.Class, java.util.Set<java.lang.String>> r1 = r12.e     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L7e
            java.util.Set r1 = (java.util.Set) r1     // Catch: java.lang.Throwable -> L7e
            if (r1 != 0) goto L75
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L7e
            r1.<init>()     // Catch: java.lang.Throwable -> L7e
        L75:
            r1.add(r13)     // Catch: java.lang.Throwable -> L7e
            java.util.Map<java.lang.Class, java.util.Set<java.lang.String>> r4 = r12.e     // Catch: java.lang.Throwable -> L7e
            r4.put(r2, r1)     // Catch: java.lang.Throwable -> L7e
            goto L97
        L7e:
            r1 = move-exception
            goto L83
        L80:
            r2 = move-exception
            r3 = r1
            r1 = r2
        L83:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r4 = "[MSCModuleManager@getModule] "
            r2.<init>(r4)     // Catch: java.lang.Throwable -> Lc1
            r2.append(r13)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lc1
            com.meituan.msc.modules.reporter.g.a(r2, r1)     // Catch: java.lang.Throwable -> Lc1
            goto L97
        L95:
            r3 = r1
            r0 = 0
        L97:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto La2
            if (r3 == 0) goto La2
            com.meituan.msc.modules.engine.h r13 = r12.f
            r3.a(r13)
            goto Lc0
        La2:
            if (r3 != 0) goto Lc0
            java.lang.String r1 = "[MSCModuleManager@getModule]"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "module "
            r2.<init>(r4)
            r2.append(r13)
            java.lang.String r13 = " null, lazyCreated: "
            r2.append(r13)
            r2.append(r0)
            java.lang.String r13 = r2.toString()
            com.meituan.msc.modules.reporter.g.a(r1, r13)
        Lc0:
            return r3
        Lc1:
            r13 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> Lc1
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.modules.manager.l.a(java.lang.String):com.meituan.msc.modules.manager.k");
    }

    public final Object a(String str, String str2, JSONArray jSONArray, a aVar) {
        Object[] objArr = {str, str2, jSONArray, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ded4e779be46ecb4560860d69e745f8", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ded4e779be46ecb4560860d69e745f8") : b(str, str2, jSONArray, aVar);
    }

    public final JSONArray b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18bcec0ac68d809bbdce6dee3b79f0cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18bcec0ac68d809bbdce6dee3b79f0cf");
        }
        String[] split = str.split("\\.", 2);
        if (split.length == 1) {
            k a2 = a(str);
            if (a2 == null) {
                a(str, (String) null);
                return null;
            }
            a2.t();
            return a2.p();
        }
        k a3 = a(split[0]);
        if (a3 == null) {
            a(split[0], (String) null);
            return null;
        }
        return a3.e(split[1]);
    }

    private Object b(String str, String str2, JSONArray jSONArray, a aVar) {
        Object[] objArr = {str, str2, jSONArray, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96c5239bdb2a2f18655db15696fbaa54", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96c5239bdb2a2f18655db15696fbaa54");
        }
        String[] split = str.split("\\.", 2);
        if (split.length == 1) {
            k a2 = a(str);
            if (a2 == null) {
                return a(str, str2);
            }
            return a(a2, str2, jSONArray, aVar);
        }
        k a3 = a(split[0]);
        if (a3 == null) {
            return a(str, str2);
        }
        if (a3 instanceof com.meituan.msc.modules.viewmanager.h) {
            com.meituan.msc.modules.viewmanager.h hVar = (com.meituan.msc.modules.viewmanager.h) a3;
            if (hVar.d()) {
                hVar.b(split[1], str2, jSONArray, aVar);
                return null;
            }
        }
        return a3.a(split[1], str2, jSONArray, aVar);
    }

    public static Object a(final k kVar, String str, JSONArray jSONArray, final a aVar) {
        final JSONArray jSONArray2;
        Object[] objArr = {kVar, str, jSONArray, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "59007b6577355c644b5611eb1f72813d", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "59007b6577355c644b5611eb1f72813d");
        }
        kVar.t();
        final Method g = kVar.g(str);
        if (g == null) {
            throw new p(String.format("Can't find method '%s' in '%s' module", str, kVar.J_()));
        }
        if (str.equals("batchDidComplete")) {
            JSONArray jSONArray3 = new JSONArray();
            jSONArray3.put(System.currentTimeMillis());
            jSONArray2 = jSONArray3;
        } else {
            jSONArray2 = jSONArray;
        }
        if (kVar.h(str)) {
            return a(kVar, g, jSONArray2, aVar);
        }
        boolean z = kVar instanceof com.meituan.msc.modules.viewmanager.h;
        if (z) {
            com.meituan.msc.modules.viewmanager.h hVar = (com.meituan.msc.modules.viewmanager.h) kVar;
            if (hVar.d()) {
                hVar.a(kVar, g, jSONArray2, aVar);
                return null;
            }
        }
        Runnable runnable = new Runnable() { // from class: com.meituan.msc.modules.manager.l.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dd95204e7b12b35c3ff1ffb0f5419516", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dd95204e7b12b35c3ff1ffb0f5419516");
                    return;
                }
                if (k.this instanceof com.meituan.msc.modules.viewmanager.h) {
                    ((com.meituan.msc.modules.viewmanager.h) k.this).e();
                }
                l.a(k.this, g, jSONArray2, aVar);
            }
        };
        if (z) {
            ((com.meituan.msc.modules.viewmanager.h) kVar).a(g.getName(), jSONArray2);
        }
        h.a(aVar, kVar).a(runnable);
        return null;
    }

    public static Object a(k kVar, Method method, JSONArray jSONArray, a aVar) {
        Object[] objArr = {kVar, method, jSONArray, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b0c1e9cb260b91fdf92ce7b21e76d21", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b0c1e9cb260b91fdf92ce7b21e76d21") : kVar.a(method, jSONArray, aVar);
    }

    private Object a(String str, String str2) {
        String str3;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d17b3fb3b8fa6ab3ead977d099e2cab", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d17b3fb3b8fa6ab3ead977d099e2cab");
        }
        if (this.b != null && this.b.a_(str, str2)) {
            com.meituan.msc.modules.reporter.g.a("MSCModuleManager", this.b.J_() + " handled subModuleNotFound with name '" + str + CommonConstant.Symbol.SINGLE_QUOTES);
            return null;
        }
        if (this.b != null) {
            str3 = this.b instanceof com.meituan.msc.modules.page.o ? "PageModule" : this.b.J_();
        } else {
            str3 = "native";
        }
        throw new m(String.format("cannot find module with name '%s' in %s for method %s", str, str3, str2));
    }
}
