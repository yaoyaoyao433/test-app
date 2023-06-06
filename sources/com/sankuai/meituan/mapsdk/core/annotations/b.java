package com.sankuai.meituan.mapsdk.core.annotations;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class b extends f {
    public static ChangeQuickRedirect a;
    public com.sankuai.meituan.mapsdk.core.render.model.h b;
    public com.sankuai.meituan.mapsdk.core.render.model.f c;

    public b(g gVar) {
        super(gVar);
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e808afd4f4cc06235f6ef38e5cafa9d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e808afd4f4cc06235f6ef38e5cafa9d");
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67cd081bb95c441526d5730a45efba2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67cd081bb95c441526d5730a45efba2e");
            return;
        }
        com.sankuai.meituan.mapsdk.core.c cVar = this.j.d;
        if (this.t == null) {
            this.t = new com.sankuai.meituan.mapsdk.core.render.model.d(this.j.c, null, true);
        }
        this.s = cVar.a(null, this.t);
        this.s.a(false);
        this.u = this.t.c();
        this.u.a("id", this.s.d);
        this.b = new com.sankuai.meituan.mapsdk.core.render.model.d(this.j.c, null, true);
        this.c = cVar.a(null, this.b);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public void setZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b44c892f0bf0c69f33945a1a00eaf6f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b44c892f0bf0c69f33945a1a00eaf6f3");
            return;
        }
        this.p = f;
        float d = com.sankuai.meituan.mapsdk.core.utils.a.d(f);
        if (f()) {
            return;
        }
        this.s.a(d, this.o);
        this.c.a(d, this.o);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public void setVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee2f9ea35b99f167ab679e5a9b29a826", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee2f9ea35b99f167ab679e5a9b29a826");
            return;
        }
        super.setVisible(z);
        if (f()) {
            return;
        }
        this.c.b(z);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public void setMaxZoomLevel(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92424ca83f0989b709ac418a46cfdb40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92424ca83f0989b709ac418a46cfdb40");
            return;
        }
        super.setMaxZoomLevel(f);
        this.c.a((float) this.j.c.a(this.w));
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public void setMinZoomLevel(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4885b258a5d806713b943f45c8d2346", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4885b258a5d806713b943f45c8d2346");
            return;
        }
        super.setMinZoomLevel(f);
        this.c.b((float) this.j.c.a(this.x));
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public void remove() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "236456ba22a6512db7eed992842b8e42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "236456ba22a6512db7eed992842b8e42");
        } else if (f()) {
        } else {
            this.k.a(this.c);
            this.j.a(this.c.d);
            this.c = null;
            this.k.a(this.b);
            this.b = null;
            super.remove();
        }
    }
}
