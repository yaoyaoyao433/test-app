package com.sankuai.waimai.irmo.canvas.mach;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.irmo.canvas.bridge.jscallbak.CanvasMap;
import com.sankuai.waimai.irmo.canvas.container.c;
import com.sankuai.waimai.irmo.utils.d;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends com.sankuai.waimai.mach.component.base.a<a> {
    public static ChangeQuickRedirect a;
    String b;
    String c;
    Map<String, Object> d;
    private com.sankuai.waimai.irmo.canvas.container.b e;
    private Map f;

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ void a(a aVar) {
        a aVar2 = aVar;
        Object[] objArr = {aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca60a07478bcfeae7e963796cf5098dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca60a07478bcfeae7e963796cf5098dc");
            return;
        }
        super.a((b) aVar2);
        d.a("Java inf_canvas_log: MachCanvasComponent onViewCreated() ", new Object[0]);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aee672fb3f798225596e857defeac5eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aee672fb3f798225596e857defeac5eb");
        } else if (this.e == null) {
            this.e = new com.sankuai.waimai.irmo.canvas.container.b() { // from class: com.sankuai.waimai.irmo.canvas.mach.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.irmo.canvas.container.b
                public final Context a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5e3c3aee178eb6926d98ee965f614fe6", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Context) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5e3c3aee178eb6926d98ee965f614fe6");
                    }
                    if (b.this.o != 0) {
                        return ((a) b.this.o).getContext();
                    }
                    return null;
                }

                @Override // com.sankuai.waimai.irmo.canvas.container.b
                public final String b() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5abbf00ffa4b701f6a8727550fed5adb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5abbf00ffa4b701f6a8727550fed5adb") : b.this.c;
                }

                @Override // com.sankuai.waimai.irmo.canvas.container.b
                public final CanvasMap c() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3ef6f9c574882ddfb53c3e9b77cc1d98", RobustBitConfig.DEFAULT_VALUE) ? (CanvasMap) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3ef6f9c574882ddfb53c3e9b77cc1d98") : com.sankuai.waimai.irmo.canvas.util.b.a(b.this.d);
                }

                @Override // com.sankuai.waimai.irmo.canvas.container.b
                public final String d() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f617feb4c335e4129cf4ac168591f02c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f617feb4c335e4129cf4ac168591f02c") : b.this.b;
                }
            };
        }
        com.sankuai.waimai.irmo.canvas.container.b bVar = this.e;
        Object[] objArr3 = {bVar};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "05111794c8fffb054eba7f0dda58ac1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "05111794c8fffb054eba7f0dda58ac1a");
            return;
        }
        aVar2.b = new c(bVar, aVar2);
        aVar2.b.a();
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ a b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db93f360ef4b0f66444cad7af9c1eec8", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db93f360ef4b0f66444cad7af9c1eec8");
        }
        d.a("Java inf_canvas_log: MachCanvasComponent  getHostView()  CanvasContainerView == null  create New ", new Object[0]);
        return new a(context);
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7e9ede9d0a413b076e5651246e263c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7e9ede9d0a413b076e5651246e263c4");
            return;
        }
        d.a("Java inf_canvas_log: MachCanvasComponent  onBind()  ", new Object[0]);
        if (k() == null) {
            return;
        }
        try {
            this.b = a("id");
            this.c = a("bundle-id");
            this.f = (Map) k.a().fromJson(a("extra-info"), (Class<Object>) Map.class);
            this.d = (Map) k().get("config-params");
        } catch (Exception unused) {
        }
        d.a("Java inf_canvas_log: MachCanvasComponent  onBind() , id: " + this.b + " mBundleId: " + this.c + " extraInfo: " + this.f + " data: " + this.d, new Object[0]);
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d257e97cc01733e1c058c64d1efa1ff2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d257e97cc01733e1c058c64d1efa1ff2");
            return;
        }
        super.b();
        d.a("Java inf_canvas_log: MachCanvasComponent onUnbind() ", new Object[0]);
        if (this.o != 0) {
            ((a) this.o).a();
        }
    }

    public final Map i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1694565fcb7dfa7b1d6a49094e927e30", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1694565fcb7dfa7b1d6a49094e927e30");
        }
        d.a("Java inf_canvas_log: MachCanvasComponent getExtraInfo()  " + this.f, new Object[0]);
        return this.f;
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca3852db81d5148256253d3e6f40f331", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca3852db81d5148256253d3e6f40f331");
        } else if (this.o != 0) {
            ((a) this.o).b();
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e106fda6c9d274edaf1fb8aad82b4db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e106fda6c9d274edaf1fb8aad82b4db");
        } else if (this.o != 0) {
            ((a) this.o).c();
        }
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0c98e5c51a78e5a2fe7bb407c6520dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0c98e5c51a78e5a2fe7bb407c6520dd");
        } else if (this.o != 0) {
            ((a) this.o).d();
        }
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "477a6a09af4854e5363e6d151def3656", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "477a6a09af4854e5363e6d151def3656");
        } else if (this.o != 0) {
            ((a) this.o).e();
        }
    }
}
