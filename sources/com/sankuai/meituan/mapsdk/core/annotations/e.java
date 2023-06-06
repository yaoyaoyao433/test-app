package com.sankuai.meituan.mapsdk.core.annotations;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class e extends f implements com.sankuai.meituan.mapsdk.core.interfaces.i {
    public static ChangeQuickRedirect a;

    public e(g gVar) {
        super(gVar);
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1982cdfb4685bdb0f961f84b7892ad6c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1982cdfb4685bdb0f961f84b7892ad6c");
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ff42b3a881756b9b00195d131d8b430", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ff42b3a881756b9b00195d131d8b430");
            return;
        }
        com.sankuai.meituan.mapsdk.core.c cVar = this.j.d;
        this.t = new com.sankuai.meituan.mapsdk.core.render.model.e(this.j.c, null, null);
        this.s = cVar.a(null, this.t);
        this.u = this.t.c();
        this.u.a("id", this.s.d);
    }
}
