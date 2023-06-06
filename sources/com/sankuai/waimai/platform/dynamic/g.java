package com.sankuai.waimai.platform.dynamic;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.manager.load.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends com.meituan.android.cube.pga.block.a<com.meituan.android.cube.pga.view.a, j, com.meituan.android.cube.pga.type.a> {
    public static ChangeQuickRedirect r;
    private List<h> A;
    private Map<String, com.sankuai.waimai.mach.manager.cache.e> B;
    private boolean C;
    private com.sankuai.waimai.mach.container.d D;
    private boolean E;
    public a s;
    public View t;
    public int u;
    public boolean v;
    public int w;
    public int x;
    public boolean y;
    private int z;

    @Override // com.meituan.android.cube.pga.block.a
    public final com.meituan.android.cube.pga.view.a z() {
        return null;
    }

    public static /* synthetic */ void b(g gVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "1677c124b1b9526225d4cfd134799707", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "1677c124b1b9526225d4cfd134799707");
            return;
        }
        gVar.z = 0;
        gVar.u = 0;
        for (h hVar : gVar.A) {
            if (hVar != null) {
                hVar.a();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [com.meituan.android.cube.pga.type.a] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.meituan.android.cube.pga.type.a] */
    public static /* synthetic */ void c(g gVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "6cb7264f9c2d10a6f0f23da4b481ffa5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "6cb7264f9c2d10a6f0f23da4b481ffa5");
            return;
        }
        com.meituan.android.cube.pga.common.c j = ((j) gVar.G()).j();
        int i = j == null ? 0 : j.a;
        int i2 = j != null ? j.b : 0;
        ViewGroup.LayoutParams layoutParams = gVar.t.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = com.sankuai.waimai.foundation.utils.g.a(gVar.F().a(), i);
            marginLayoutParams.bottomMargin = com.sankuai.waimai.foundation.utils.g.a(gVar.F().a(), i2);
            gVar.t.setLayoutParams(layoutParams);
        }
    }

    public g(com.meituan.android.cube.pga.type.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bc91f33ab8669f4e0188f6f01cb2094", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bc91f33ab8669f4e0188f6f01cb2094");
            return;
        }
        this.z = -1;
        this.u = -1;
        this.A = new CopyOnWriteArrayList();
        this.y = true;
        this.C = false;
        this.D = new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.platform.dynamic.g.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void a(com.sankuai.waimai.mach.node.a aVar2) {
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c10c3c4f2f4a4d4d5eab1cb5199c9fd6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c10c3c4f2f4a4d4d5eab1cb5199c9fd6");
                    return;
                }
                super.a(aVar2);
                if (g.this.t == null || aVar2 == null || aVar2.h() == null || aVar2.h().get("is-visible-changed-listen-on") == null) {
                    return;
                }
                if (aVar2.h().get("is-visible-changed-listen-on").equals("true")) {
                    g.this.C = true;
                } else {
                    g.this.C = false;
                }
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9c6704b1ca08431efa6add23af061543", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9c6704b1ca08431efa6add23af061543");
                } else {
                    g.b(g.this);
                }
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ebc64fbe7357b1d581602647481a2c7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ebc64fbe7357b1d581602647481a2c7");
                } else {
                    g.b(g.this);
                }
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "030bc9314c9b1414a15d57138ef731d9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "030bc9314c9b1414a15d57138ef731d9");
                } else {
                    g.b(g.this);
                }
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "28864890edd9a7c538a9034d91f54323", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "28864890edd9a7c538a9034d91f54323");
                    return;
                }
                g.c(g.this);
                g.this.t.measure(0, 0);
                g.this.z = g.this.t.getMeasuredWidth();
                g.this.u = g.this.t.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) g.this.t.getLayoutParams();
                if (marginLayoutParams != null) {
                    g.this.u += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                }
                for (h hVar : g.this.A) {
                    if (hVar != null) {
                        hVar.a(g.this.z, g.this.u);
                    }
                }
            }
        };
        this.E = false;
        a((ViewGroup) null);
    }

    public g(com.meituan.android.cube.pga.type.a aVar, boolean z) {
        this(aVar);
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34a3419eb04fdd2dfc83fb8ce639a863", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34a3419eb04fdd2dfc83fb8ce639a863");
        } else {
            this.E = z;
        }
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [com.meituan.android.cube.pga.type.a] */
    @Override // com.meituan.android.cube.pga.block.a
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cb522c9917ea97d1ee233bdfcdf8f19", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cb522c9917ea97d1ee233bdfcdf8f19");
        }
        if (this.t != null) {
            return this.t;
        }
        this.t = LayoutInflater.from(F().a()).inflate(R.layout.wm_mach_container, (ViewGroup) null);
        this.t.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return this.t;
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void a(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "978d61c52ddca47c0fa498b4bc1512d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "978d61c52ddca47c0fa498b4bc1512d9");
            return;
        }
        super.a((g) jVar);
        N();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final void B() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "695fed2f25a28762f6c7b23ae35fdc8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "695fed2f25a28762f6c7b23ae35fdc8b");
            return;
        }
        super.B();
        N();
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [com.meituan.android.cube.pga.type.a] */
    private void N() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45eba0af4d75f47d9b7db17c707cd5ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45eba0af4d75f47d9b7db17c707cd5ca");
        } else if (this.i.booleanValue()) {
            Q();
            this.i = Boolean.FALSE;
            if (this.s == null) {
                this.s = new a(l(), a((Activity) l()), ((j) this.n).i(), P());
                this.s.a(this.D);
                this.s.a((ViewGroup) this.t, ((j) this.n).k(), "waimai");
            }
            if (((j) this.n).c().booleanValue()) {
                this.t.setVisibility(0);
                this.s.d = this.E;
                this.s.c = ((j) this.n).k();
                this.s.a(((j) this.n).g(), ((j) this.n).h(), ((j) this.n).k());
                int i = com.sankuai.waimai.platform.mach.config.b.a().b;
                if (i <= 0) {
                    i = 5000;
                }
                a.C1015a c1015a = new a.C1015a();
                c1015a.b = ((j) this.n).p;
                c1015a.c = ((j) this.n).q;
                c1015a.d = ((j) this.n).k();
                c1015a.e = "waimai";
                com.sankuai.waimai.mach.manager.load.a a = c1015a.a(i).a();
                final String b = b((j) this.n);
                if (!this.y && !TextUtils.isEmpty(b) && O().containsKey(b) && O().get(b) != null) {
                    this.s.a(O().get(b), ((j) this.n).r, this.w > 0 ? this.w : com.sankuai.waimai.foundation.utils.g.a(F().a()), Math.max(this.x, 0));
                    return;
                } else {
                    this.s.a(a, new com.sankuai.waimai.mach.container.c() { // from class: com.sankuai.waimai.platform.dynamic.g.2
                        public static ChangeQuickRedirect a;

                        /* JADX WARN: Type inference failed for: r2v4, types: [com.meituan.android.cube.pga.type.a] */
                        @Override // com.sankuai.waimai.mach.container.c
                        public final void a(@NonNull com.sankuai.waimai.mach.manager.cache.e eVar) {
                            Object[] objArr2 = {eVar};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "acb8db960d505b2a8d8ab741248679e7", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "acb8db960d505b2a8d8ab741248679e7");
                                return;
                            }
                            g.this.s.a(eVar, ((j) g.this.n).r, g.this.w > 0 ? g.this.w : com.sankuai.waimai.foundation.utils.g.a(g.this.F().a()), Math.max(g.this.x, 0));
                            g.this.O().put(b, eVar);
                        }

                        @Override // com.sankuai.waimai.mach.container.c
                        public final void a(@NonNull com.sankuai.waimai.mach.manager.load.b bVar) {
                            Object[] objArr2 = {bVar};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5883c4b54fc7ce47aed6644d0151af78", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5883c4b54fc7ce47aed6644d0151af78");
                                return;
                            }
                            g.this.z = 0;
                            g.this.u = 0;
                            g.this.t.setVisibility(8);
                        }
                    });
                    return;
                }
            }
            this.z = 0;
            this.u = 0;
            this.t.setVisibility(8);
        }
    }

    private String b(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "200dd594e3cea408551e907efe364170", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "200dd594e3cea408551e907efe364170");
        }
        if (jVar == null) {
            return "";
        }
        return jVar.p + jVar.q + jVar.k() + "waimai";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, com.sankuai.waimai.mach.manager.cache.e> O() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5468480adf620bb0d65a69377d80831b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5468480adf620bb0d65a69377d80831b");
        }
        if (this.B == null) {
            this.B = new HashMap();
        }
        return this.B;
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db7fbc309d9c07629991a04afe9d6cec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db7fbc309d9c07629991a04afe9d6cec");
        } else if (this.C) {
            HashMap hashMap = new HashMap();
            hashMap.put("visible", Boolean.valueOf(z));
            a("visible_state_change", (Map<String, Object>) hashMap);
            com.sankuai.waimai.foundation.utils.log.a.b("onContainerVisibilityChanged", "onContainerVisibilityChanged: " + z, new Object[0]);
            if (this.s != null) {
                this.s.b(z);
            }
        }
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db173fb516b2b3e692518e54e489d17f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db173fb516b2b3e692518e54e489d17f");
        } else if (this.s.w) {
            this.s.b();
            this.s.e = true;
        } else {
            this.s.e = false;
        }
    }

    private String a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d08eaa4f60cfc133b06a48e010fa8d7e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d08eaa4f60cfc133b06a48e010fa8d7e");
        }
        if (activity instanceof BaseActivity) {
            return ((BaseActivity) activity).w();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.meituan.android.cube.pga.type.a] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.meituan.android.cube.pga.type.a] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.meituan.android.cube.pga.type.a] */
    private String P() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2b067f1ee6613fed7333ea1278daa0e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2b067f1ee6613fed7333ea1278daa0e");
        }
        if (F() == 0) {
            return "";
        }
        return AppUtil.generatePageInfoKey(F().h() != null ? F().h() : F().b());
    }

    public final String M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd98efe4545c243cde4f48a96165911f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd98efe4545c243cde4f48a96165911f") : ((j) this.n).k();
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.core.f
    public final View i() {
        return this.t;
    }

    private void Q() {
        this.z = -1;
        this.u = -1;
    }

    public final void a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1afb4ae52e0f5867f0e4a1f820c219ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1afb4ae52e0f5867f0e4a1f820c219ae");
        } else if (this.A.contains(hVar)) {
        } else {
            this.A.add(hVar);
        }
    }

    public final void b(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39ebb376a78ddce4b6a0146b8a49d0ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39ebb376a78ddce4b6a0146b8a49d0ed");
        } else if (this.A.contains(hVar)) {
            this.A.remove(hVar);
        }
    }

    public final void a(Mach.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20c469697b1ae23d60fefee483eef6ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20c469697b1ae23d60fefee483eef6ae");
        } else {
            this.s.f = dVar;
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c974a3ff56802aa15b4f3abac445d9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c974a3ff56802aa15b4f3abac445d9f");
            return;
        }
        super.bE_();
        this.A.clear();
    }

    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddcd2b4ecc62e7bbf742f5e54f5706a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddcd2b4ecc62e7bbf742f5e54f5706a8");
        } else {
            this.s.b(str, map);
        }
    }
}
