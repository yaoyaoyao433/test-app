package com.sankuai.meituan.mapsdk.core.annotations;

import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class c extends f implements com.sankuai.meituan.mapsdk.core.interfaces.f {
    public static ChangeQuickRedirect a;

    public c(g gVar) {
        super(gVar);
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7665bf3b4d79ed1ff960a7536568cb3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7665bf3b4d79ed1ff960a7536568cb3");
        }
    }

    public c(g gVar, com.sankuai.meituan.mapsdk.core.render.model.f fVar, com.sankuai.meituan.mapsdk.core.render.model.h hVar) {
        super(gVar, fVar, hVar);
        Object[] objArr = {gVar, fVar, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "489dfb7b61dfe03a97886f757357d849", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "489dfb7b61dfe03a97886f757357d849");
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f09445fddbd2c560e077e5e80ba27884", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f09445fddbd2c560e077e5e80ba27884");
            return;
        }
        com.sankuai.meituan.mapsdk.core.c cVar = this.j.d;
        this.t = new com.sankuai.meituan.mapsdk.core.render.model.d(this.j.c, null, false, com.sankuai.meituan.mapsdk.core.render.model.i.RenderThread);
        this.s = cVar.a(null, this.t);
        this.s.a(MapConstant.LayerPropertyFlag_MarkerAvoidScreen, false);
        this.u = this.t.c();
        this.u.a("id", this.s.d);
    }
}
