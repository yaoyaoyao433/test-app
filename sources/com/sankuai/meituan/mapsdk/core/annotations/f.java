package com.sankuai.meituan.mapsdk.core.annotations;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class f implements com.sankuai.meituan.mapsdk.core.interfaces.a {
    public static ChangeQuickRedirect i;
    protected final g j;
    protected com.sankuai.meituan.mapsdk.core.c k;
    protected volatile boolean l;
    protected boolean m;
    protected boolean n;
    protected com.sankuai.meituan.mapsdk.core.render.model.g o;
    protected float p;
    protected Object q;
    protected Object r;
    protected com.sankuai.meituan.mapsdk.core.render.model.f s;
    protected com.sankuai.meituan.mapsdk.core.render.model.h t;
    protected com.sankuai.meituan.mapsdk.core.render.model.b u;
    protected float v;
    protected float w;
    protected float x;

    public abstract void a();

    public void e() {
    }

    public f(g gVar) {
        this(gVar, null, null);
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bccf85df4edae09c6bc88c2d26660c62", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bccf85df4edae09c6bc88c2d26660c62");
        }
    }

    public f(g gVar, com.sankuai.meituan.mapsdk.core.render.model.f fVar, com.sankuai.meituan.mapsdk.core.render.model.h hVar) {
        Object[] objArr = {gVar, fVar, hVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2da7bbfaafa78d5bd18263c0fa9821f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2da7bbfaafa78d5bd18263c0fa9821f9");
            return;
        }
        this.l = false;
        this.m = true;
        this.n = false;
        this.o = com.sankuai.meituan.mapsdk.core.render.model.g.Auto;
        this.v = 1.0f;
        this.j = gVar;
        this.k = gVar.d;
        this.w = gVar.b.getMaxZoomLevel();
        this.x = gVar.b.getMinZoomLevel();
        if (fVar != null && hVar != null) {
            this.s = fVar;
            this.t = hVar;
            this.u = hVar.c();
            this.u.a("id", fVar.d);
            return;
        }
        a();
        gVar.a(this.s.d, this);
    }

    public String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9426552eaf6a225b090cfaab01803583", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9426552eaf6a225b090cfaab01803583");
        }
        return CommonConstant.Symbol.BIG_BRACKET_LEFT + str + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
    }

    public Object b() {
        return this.r;
    }

    public void a(Object obj) {
        this.r = obj;
    }

    public static String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "317ea7d57864bdf502589524d29b4f92", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "317ea7d57864bdf502589524d29b4f92");
        }
        return "Typeface_" + System.currentTimeMillis();
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6904ac28723152d2f58284d7dabbcf03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6904ac28723152d2f58284d7dabbcf03");
        } else if (f()) {
        } else {
            g gVar = this.j;
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect2 = g.a;
            if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "2c27f3b4a925b2015bfce34c67319b69", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "2c27f3b4a925b2015bfce34c67319b69");
            } else {
                gVar.i.add(this);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public String getId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cf666afcc139833647ab576355a2153", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cf666afcc139833647ab576355a2153") : f() ? "" : this.s.d;
    }

    public boolean isClickable() {
        return this.n;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.e
    public void setClickable(boolean z) {
        this.n = z;
    }

    public void remove() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a02cc9a542a3c928409c32f8b307b218", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a02cc9a542a3c928409c32f8b307b218");
        } else if (f()) {
        } else {
            this.j.b.a((com.sankuai.meituan.mapsdk.maps.interfaces.l) this);
            com.sankuai.meituan.mapsdk.core.c cVar = this.j.d;
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "6f4ff4a593bd736f037384d547424cdb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "6f4ff4a593bd736f037384d547424cdb");
            } else if (!cVar.f.i) {
                cVar.f.getOverlayKeeper().b(this);
            }
            this.l = true;
            this.j.d.a(this.s);
            this.j.d.a(this.t);
            this.j.a(this.s.d);
            this.s = null;
            this.t = null;
            Class<?>[] interfaces = getClass().getInterfaces();
            HashMap hashMap = new HashMap();
            hashMap.put("name", interfaces[0].getName());
            com.sankuai.meituan.mapsdk.mapcore.utils.c.a("mtmapsdk_remove_one_annotation", hashMap);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public boolean isVisible() {
        return this.m;
    }

    public void setVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bc1022161049c4315650fd4bf57a145", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bc1022161049c4315650fd4bf57a145");
        } else if (f()) {
        } else {
            this.s.b(z);
            this.m = z;
        }
    }

    public final boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "348fe15b9d093e153cdb5b2cb8bbcb25", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "348fe15b9d093e153cdb5b2cb8bbcb25")).booleanValue();
        }
        if (this.l) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.d("layer was removed");
        }
        return this.l;
    }

    public void setLevel(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e7c7ab8054c9d0b172267565212e9fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e7c7ab8054c9d0b172267565212e9fa");
            return;
        }
        switch (i2) {
            case 0:
                this.o = com.sankuai.meituan.mapsdk.core.render.model.g.Order2D;
                break;
            case 1:
                this.o = com.sankuai.meituan.mapsdk.core.render.model.g.Order3D;
                break;
            default:
                this.o = com.sankuai.meituan.mapsdk.core.render.model.g.OrderSymbol;
                break;
        }
        setZIndex(this.p);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public float getZIndex() {
        return this.p;
    }

    public void setZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "247e833e7cc38df55d4e296682486e29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "247e833e7cc38df55d4e296682486e29");
            return;
        }
        this.p = f;
        float d = com.sankuai.meituan.mapsdk.core.utils.a.d(f);
        if (f()) {
            return;
        }
        this.s.a(d, this.o);
    }

    public Object getObject() {
        return this.q;
    }

    public void setObject(Object obj) {
        this.q = obj;
    }

    public float getAlpha() {
        return this.v;
    }

    @Override // com.sankuai.meituan.mapsdk.core.interfaces.a
    public void setAlpha(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77717606441fd6b46d9a92157e829705", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77717606441fd6b46d9a92157e829705");
        } else if (f()) {
        } else {
            this.v = com.sankuai.meituan.mapsdk.core.utils.a.a(f);
        }
    }

    public float getMaxZoomLevel() {
        return this.w;
    }

    public void setMaxZoomLevel(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1153c8e75226f0b62ed6f1994c69f82c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1153c8e75226f0b62ed6f1994c69f82c");
        } else if (f()) {
        } else {
            this.w = f;
            this.s.a((float) this.j.c.a(this.w));
        }
    }

    public float getMinZoomLevel() {
        return this.x;
    }

    public void setMinZoomLevel(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5969d5d57bb834776b95a1148aa9192c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5969d5d57bb834776b95a1148aa9192c");
        } else if (f()) {
        } else {
            this.x = f;
            this.s.b((float) this.j.c.a(this.x));
        }
    }

    public final com.sankuai.meituan.mapsdk.core.f g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "224d6e1e6011ae47277cc9cc3e93026c", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.mapsdk.core.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "224d6e1e6011ae47277cc9cc3e93026c");
        }
        com.sankuai.meituan.mapsdk.core.d dVar = this.j.b;
        if (dVar == null) {
            return null;
        }
        return (com.sankuai.meituan.mapsdk.core.f) dVar.getProjection().getIProjection();
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be1bf9f8c4300d1386db446595314bfd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be1bf9f8c4300d1386db446595314bfd")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || f()) {
            return false;
        }
        f fVar = (f) obj;
        if (this.s == null || fVar.s == null || this.t == null || fVar.t == null || !TextUtils.equals(this.s.d, fVar.s.d)) {
            return false;
        }
        return TextUtils.equals(this.t.f, fVar.getId());
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cf91a0711ebe963f6576428e8df29a2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cf91a0711ebe963f6576428e8df29a2")).intValue();
        }
        if (f()) {
            return super.hashCode();
        }
        return (this.s.d.hashCode() * 31) + this.t.f.hashCode();
    }
}
