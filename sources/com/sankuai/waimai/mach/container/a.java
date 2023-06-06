package com.sankuai.waimai.mach.container;

import android.app.Activity;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.common.i;
import com.sankuai.waimai.mach.g;
import com.sankuai.waimai.mach.lifecycle.c;
import com.sankuai.waimai.mach.manager.a;
import com.sankuai.waimai.mach.manager.cache.CacheException;
import com.sankuai.waimai.mach.manager.cache.e;
import com.sankuai.waimai.mach.manager.load.c;
import com.sankuai.waimai.mach.manager.monitor.MonitorManager;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a extends com.sankuai.waimai.mach.lifecycle.d implements b {
    public static ChangeQuickRedirect h;
    private String a;
    private g b;
    private Mach.d c;
    public final String i;
    public Activity j;
    public Mach k;
    public ViewGroup l;
    String m;
    String n;
    public String o;
    public Map<String, Object> p;
    List<d> q;
    final MonitorManager r;
    long s;

    public abstract void a(Mach.a aVar);

    public void a(Mach mach) {
    }

    public void a(@NonNull String str, @Nullable Map<String, Object> map) {
    }

    public a(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0de6acff98ca323bfd5ca0d0d2813ee4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0de6acff98ca323bfd5ca0d0d2813ee4");
            return;
        }
        this.q = new CopyOnWriteArrayList();
        this.b = new g() { // from class: com.sankuai.waimai.mach.container.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.g
            public final void a(com.sankuai.waimai.mach.node.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1bc74c11b95bc39849b332d1e8028d77", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1bc74c11b95bc39849b332d1e8028d77");
                    return;
                }
                for (d dVar : a.this.q) {
                    dVar.a(aVar);
                }
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bbdeda64f28937a2b7b5e8cab3f9aa48", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bbdeda64f28937a2b7b5e8cab3f9aa48");
                    return;
                }
                a.this.r.renderSuccess(a.this.n, a.this.m, a.this.o, a.this.a(), a.this.p, (int) (SystemClock.elapsedRealtime() - a.this.s));
                for (d dVar : a.this.q) {
                    dVar.e();
                }
            }

            @Override // com.sankuai.waimai.mach.g
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "700eb7364ad3a240e8788d0205327bfc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "700eb7364ad3a240e8788d0205327bfc");
                    return;
                }
                for (d dVar : a.this.q) {
                    dVar.d();
                }
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ecc772e53b3b3367857b147d1f41c66d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ecc772e53b3b3367857b147d1f41c66d");
                    return;
                }
                for (d dVar : a.this.q) {
                    dVar.a(i);
                }
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a(int i, Throwable th) {
                Object[] objArr2 = {Integer.valueOf(i), th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "60262a4b3e697850944dba0caddfd038", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "60262a4b3e697850944dba0caddfd038");
                    return;
                }
                a.this.r.renderFailure(a.this.n, a.this.m, a.this.o, a.this.a(), a.this.p, th, (int) (SystemClock.elapsedRealtime() - a.this.s));
                for (d dVar : a.this.q) {
                    dVar.a();
                }
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a(String str2, String str3) {
                Object[] objArr2 = {str2, str3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "01f4fca81ca0a71dd1bcdab2e7b26f72", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "01f4fca81ca0a71dd1bcdab2e7b26f72");
                } else {
                    a.this.r.exprError(a.this.m, a.this.a(), a.this.n, a.this.o, a.this.p, str2, str3);
                }
            }

            @Override // com.sankuai.waimai.mach.g
            public final void a(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "775588f1aeab08afba4aab1940bdf05b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "775588f1aeab08afba4aab1940bdf05b");
                } else {
                    a.this.r.jsError(a.this.m, a.this.a(), a.this.n, a.this.o, a.this.p, th);
                }
            }
        };
        this.c = new Mach.d() { // from class: com.sankuai.waimai.mach.container.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.Mach.d
            public final void a(@NonNull String str2, @Nullable Map<String, Object> map) {
                Object[] objArr2 = {str2, map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a5b281e43858ad5a1410e104e0456f2c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a5b281e43858ad5a1410e104e0456f2c");
                    return;
                }
                com.sankuai.waimai.mach.log.b.a("MachJS", "js receive event eventName:" + str2, "params:" + com.sankuai.waimai.mach.log.b.a(map));
                a.this.a(str2, map);
            }
        };
        this.j = activity;
        this.i = str;
        this.r = com.sankuai.waimai.mach.manager.a.a().b();
    }

    public final void a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb70106eb0255f7381df25a86b696bb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb70106eb0255f7381df25a86b696bb9");
        } else if (this.q.contains(dVar)) {
        } else {
            this.q.add(dVar);
        }
    }

    public void a(@NonNull ViewGroup viewGroup, String str, String str2) {
        Object[] objArr = {viewGroup, str, str2};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a23e600a7b09a22f4783db708bc02177", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a23e600a7b09a22f4783db708bc02177");
            return;
        }
        this.l = viewGroup;
        this.n = str;
        this.m = str2;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "54bd9c4e189a3ccfd9d1fb64a1f036b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "54bd9c4e189a3ccfd9d1fb64a1f036b6");
        } else {
            Mach.a aVar = new Mach.a();
            aVar.b = this.j;
            aVar.f = this.b;
            a(aVar);
            this.k = aVar.a();
            this.k.registerJsEventCallback(this.c);
        }
        this.k.setBiz(this.m);
        this.k.setModuleId(this.n);
        a(this.k);
    }

    @Deprecated
    public void a(String str) {
        this.n = str;
    }

    public final void a(String str, String str2, Map<String, Object> map, int i, int i2) {
        Object[] objArr = {str, str2, map, Integer.valueOf(i), 0};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d3024e6d84e467fbb38d66860c28f49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d3024e6d84e467fbb38d66860c28f49");
        } else if (!d(str, map) && !d(str2, map)) {
            for (d dVar : this.q) {
                dVar.c();
            }
        } else {
            this.o = str;
            this.a = str2;
            this.p = map;
            for (d dVar2 : this.q) {
                dVar2.g();
            }
            com.sankuai.waimai.mach.log.b.a("MachTemplate", "template load start  templateId: " + str + " presetMachId: " + this.a);
            this.s = SystemClock.elapsedRealtime();
            com.sankuai.waimai.mach.manager.cache.e a = com.sankuai.waimai.mach.manager.a.a().a(this.o, this.a, this.n, this.m);
            if (a != null) {
                a(str, str2, map, a, i, 0, "0");
            } else {
                p();
            }
        }
    }

    public final void c(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3427b71345a54a687dbca4ba9302c1fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3427b71345a54a687dbca4ba9302c1fc");
        } else {
            b(str, null, map);
        }
    }

    public final void b(final String str, String str2, final Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae098b53ba82a6ef86cc8a6318719eb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae098b53ba82a6ef86cc8a6318719eb3");
        } else if (!d(str, map)) {
            for (d dVar : this.q) {
                dVar.c();
            }
        } else {
            this.o = str;
            this.p = map;
            for (d dVar2 : this.q) {
                dVar2.g();
            }
            com.sankuai.waimai.mach.log.b.a("MachTemplate", "template load start " + str);
            this.s = SystemClock.elapsedRealtime();
            com.sankuai.waimai.mach.manager.a.a().b(str, this.n, this.m, str2, new a.InterfaceC1013a() { // from class: com.sankuai.waimai.mach.container.a.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.manager.a.InterfaceC1013a
                public final void a(@NonNull com.sankuai.waimai.mach.manager.cache.e eVar) {
                    Object[] objArr2 = {eVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b208d5d3e060549461789a1c86b8c295", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b208d5d3e060549461789a1c86b8c295");
                    } else {
                        a.this.a(str, null, map, eVar, 0, 0, "1");
                    }
                }

                @Override // com.sankuai.waimai.mach.manager.a.InterfaceC1013a
                public final void a(@NonNull CacheException cacheException) {
                    Object[] objArr2 = {cacheException};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f19dd97e30da5ca2d165f4b79a409cbe", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f19dd97e30da5ca2d165f4b79a409cbe");
                    } else {
                        a.this.p();
                    }
                }
            });
        }
    }

    public void a(com.sankuai.waimai.mach.manager.load.a aVar, final c cVar) {
        boolean z;
        Object[] objArr = {aVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7d56ed8eb5078080dcd21521dfe6627", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7d56ed8eb5078080dcd21521dfe6627");
            return;
        }
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f76696166ef8cd66fddd4132a88b294a", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f76696166ef8cd66fddd4132a88b294a")).booleanValue();
        } else {
            z = (com.sankuai.waimai.mach.utils.e.c(this.j) || TextUtils.isEmpty(aVar.b) || TextUtils.isEmpty(aVar.d)) ? false : true;
        }
        if (!z) {
            for (d dVar : this.q) {
                dVar.c();
            }
            return;
        }
        this.o = aVar.b;
        for (d dVar2 : this.q) {
            dVar2.g();
        }
        com.sankuai.waimai.mach.log.b.a("MachTemplate", "template load start " + this.o);
        this.s = SystemClock.elapsedRealtime();
        String str = this.m;
        final c.a aVar2 = new c.a() { // from class: com.sankuai.waimai.mach.container.a.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.manager.load.c.a
            public final void a(com.sankuai.waimai.mach.manager.cache.e eVar) {
                Object[] objArr3 = {eVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b16a039b92129092097d30fdd4ad3466", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b16a039b92129092097d30fdd4ad3466");
                    return;
                }
                if (cVar != null) {
                    cVar.a(eVar);
                }
                a.this.r.loadBundleSuccess(a.this.n, a.this.o, a.this.m, a.this.a(), "1", a.this.s);
                for (d dVar3 : a.this.q) {
                    dVar3.f();
                }
            }

            @Override // com.sankuai.waimai.mach.manager.load.c.a
            public final void a(com.sankuai.waimai.mach.manager.load.b bVar) {
                Object[] objArr3 = {bVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cc4f7101b5174f4615350fcaa278da24", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cc4f7101b5174f4615350fcaa278da24");
                    return;
                }
                if (cVar != null) {
                    cVar.a(bVar);
                }
                for (d dVar3 : a.this.q) {
                    dVar3.b();
                }
            }
        };
        Object[] objArr3 = {str, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.mach.manager.load.c.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "f9f4f5e5b30602c466a44e2e78ba6b7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "f9f4f5e5b30602c466a44e2e78ba6b7f");
        } else {
            com.sankuai.waimai.mach.manager.a.a().a(aVar.b, aVar.c, aVar.d, aVar.e, new a.InterfaceC1013a() { // from class: com.sankuai.waimai.mach.manager.load.c.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.manager.a.InterfaceC1013a
                public final void a(@NonNull e eVar) {
                    Object[] objArr4 = {eVar};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "09c952a9e5b16f84a8a70f90409f84f6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "09c952a9e5b16f84a8a70f90409f84f6");
                    } else if (aVar2 != null) {
                        aVar2.a(eVar);
                    }
                }

                @Override // com.sankuai.waimai.mach.manager.a.InterfaceC1013a
                public final void a(@NonNull CacheException cacheException) {
                    Object[] objArr4 = {cacheException};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9f55988d1bab6483b399832a6a7f7543", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9f55988d1bab6483b399832a6a7f7543");
                    } else if (aVar2 != null) {
                        aVar2.a(new b(cacheException));
                    }
                }
            });
        }
    }

    public final void a(com.sankuai.waimai.mach.manager.cache.e eVar, Map<String, Object> map) {
        Object[] objArr = {eVar, map};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56642ab3ceff69874a9d3b616bf25896", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56642ab3ceff69874a9d3b616bf25896");
        } else {
            a(eVar, map, 0, 0);
        }
    }

    public final void a(com.sankuai.waimai.mach.manager.cache.e eVar, Map<String, Object> map, int i, int i2) {
        Object[] objArr = {eVar, map, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7abc7b338502c69e9b66a0c4ec7ba89a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7abc7b338502c69e9b66a0c4ec7ba89a");
        } else if (this.l != null || i.a().f.b) {
            this.l.setVisibility(0);
            this.o = eVar.j;
            this.k.initWithBundle(this.j, this.l, eVar);
            this.p = map;
            this.k.registerLifecycleObserver(this);
            if (i == 0) {
                this.k.render(map);
            } else {
                this.k.render(map, i, i2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, Map<String, Object> map, com.sankuai.waimai.mach.manager.cache.e eVar, int i, int i2, String str3) {
        Object[] objArr = {str, str2, map, eVar, Integer.valueOf(i), Integer.valueOf(i2), str3};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bde44447522e3c52408c345577b97ac1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bde44447522e3c52408c345577b97ac1");
        } else if (this.l != null || i.a().f.b) {
            this.l.setVisibility(0);
            this.k.initWithBundle(this.j, this.l, eVar);
            this.k.registerLifecycleObserver(this);
            this.r.loadBundleSuccess(this.n, str, this.m, a(), str3, this.s);
            for (d dVar : this.q) {
                dVar.f();
            }
            if (i == 0) {
                this.k.render(map);
            } else {
                this.k.render(map, i, i2, null);
            }
        }
    }

    void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "448e3acf3d1e0e94f7f64146f5c2ac71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "448e3acf3d1e0e94f7f64146f5c2ac71");
            return;
        }
        for (d dVar : this.q) {
            dVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a() {
        com.sankuai.waimai.mach.manager.cache.e machBundle;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da66743002bc9ad70267c61d251f00da", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da66743002bc9ad70267c61d251f00da") : (this.k == null || (machBundle = this.k.getMachBundle()) == null || machBundle.q == null) ? "" : machBundle.q.c;
    }

    private boolean d(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2769eedeaf13ccd09b163ca9130a35b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2769eedeaf13ccd09b163ca9130a35b")).booleanValue() : (com.sankuai.waimai.mach.utils.e.c(this.j) || this.l == null || TextUtils.isEmpty(str) || com.sankuai.waimai.mach.utils.e.a(map)) ? false : true;
    }

    public void b(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1eb75330f47654ab8380a72487ca9837", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1eb75330f47654ab8380a72487ca9837");
        } else if (this.k != null) {
            this.k.sendJsEvent(str, map);
        }
    }

    public final boolean q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "833036b1d1b7965bfe47cba1bce32e46", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "833036b1d1b7965bfe47cba1bce32e46")).booleanValue() : this.l != null && this.l.getVisibility() == 0;
    }

    public void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0201bc317ed42033f211cf0ce48334e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0201bc317ed42033f211cf0ce48334e9");
            return;
        }
        this.q.clear();
        if (this.k != null) {
            this.k.unregisterLifecycleObserver(this);
            this.k.onDestroy();
        }
    }

    @Override // com.sankuai.waimai.mach.lifecycle.d, com.sankuai.waimai.mach.lifecycle.b
    public void onActivityDestroyed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6cf93b7663d0bf0903fd402aa648cba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6cf93b7663d0bf0903fd402aa648cba");
            return;
        }
        super.onActivityDestroyed();
        this.q.clear();
        if (this.k != null) {
            this.k.unregisterJsEventCallback();
            this.k.unregisterLifecycleObserver(this);
        }
    }

    public final ViewGroup r() {
        return this.l;
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c3446158791d7aa0a9de3f9961e74be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c3446158791d7aa0a9de3f9961e74be");
        } else if (this.k != null) {
            if (z) {
                this.k.onPageAppear();
            } else {
                this.k.onPageDisappear();
            }
            a(this.k.getRootNode(), z, c.a.PAGE);
        }
    }

    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a8c42261bbb1f77ff3a93b38de425d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a8c42261bbb1f77ff3a93b38de425d7");
        } else if (this.k != null) {
            a(this.k.getRootNode(), z, c.a.CONTAINER);
        }
    }

    private void a(com.sankuai.waimai.mach.node.a aVar, boolean z, c.a aVar2) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar2};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad1848005c4895f3dfdf6ab94143ea69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad1848005c4895f3dfdf6ab94143ea69");
        } else if (aVar != null) {
            com.sankuai.waimai.mach.component.base.a<HostViewType> aVar3 = aVar.h;
            if (aVar3 instanceof com.sankuai.waimai.mach.lifecycle.c) {
                com.sankuai.waimai.mach.lifecycle.c cVar = (com.sankuai.waimai.mach.lifecycle.c) aVar3;
                if (aVar2 == c.a.CONTAINER) {
                    cVar.b(z);
                } else if (aVar2 == c.a.PAGE) {
                    cVar.a(z);
                }
            } else if (aVar.j()) {
                for (com.sankuai.waimai.mach.node.a aVar4 : aVar.b()) {
                    a(aVar4, z, aVar2);
                }
            }
        }
    }
}
