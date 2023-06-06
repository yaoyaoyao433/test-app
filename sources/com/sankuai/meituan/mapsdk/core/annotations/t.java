package com.sankuai.meituan.mapsdk.core.annotations;

import android.text.TextUtils;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.MarkerOptions;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class t extends c implements com.sankuai.meituan.mapsdk.core.interfaces.f {
    public static ChangeQuickRedirect b;
    private boolean A;
    private boolean B;
    private float C;
    private String D;
    private g E;
    protected volatile boolean c;
    public String d;
    public LatLng e;
    public BitmapDescriptor f;
    public int g;
    public int h;
    private boolean y;
    private boolean z;

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ String a(String str) {
        return super.a(str);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ Object b() {
        return super.b();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final /* bridge */ /* synthetic */ float getAlpha() {
        return super.getAlpha();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ float getMaxZoomLevel() {
        return super.getMaxZoomLevel();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ float getMinZoomLevel() {
        return super.getMinZoomLevel();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ Object getObject() {
        return super.getObject();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final /* bridge */ /* synthetic */ float getZIndex() {
        return super.getZIndex();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ boolean isClickable() {
        return super.isClickable();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final /* bridge */ /* synthetic */ boolean isVisible() {
        return super.isVisible();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ void setMaxZoomLevel(float f) {
        super.setMaxZoomLevel(f);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ void setMinZoomLevel(float f) {
        super.setMinZoomLevel(f);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ void setObject(Object obj) {
        super.setObject(obj);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final String getId() {
        return this.D;
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.e
    public final void setClickable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc75eadc2a1c543f25a46feb0f4a6c74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc75eadc2a1c543f25a46feb0f4a6c74");
            return;
        }
        super.setClickable(z);
        this.u.a("mmr.query", z);
    }

    private void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ff7a46c19106fcf717fe33687777f86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ff7a46c19106fcf717fe33687777f86");
        } else {
            super.setZIndex(f);
        }
    }

    public final Object h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88b4ab26fdd69e093388792cf37e4f45", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88b4ab26fdd69e093388792cf37e4f45") : getObject();
    }

    public final void b(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f54607b22d26e079e76276a10c3c994e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f54607b22d26e079e76276a10c3c994e");
        } else {
            setObject(obj);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d875ea72c68a4a20e25e145a63c6e3d1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d875ea72c68a4a20e25e145a63c6e3d1")).intValue() : System.identityHashCode(this);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fda4ed417d6c093a1480016bc9fc3e6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fda4ed417d6c093a1480016bc9fc3e6")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            return hashCode() == tVar.hashCode() && super.b().equals(super.b());
        }
        return false;
    }

    public t(g gVar, MarkerOptions markerOptions) {
        super(gVar, gVar.d.d, gVar.d.e);
        Object[] objArr = {gVar, markerOptions};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96f8942bc843eea033b85a7b72e746b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96f8942bc843eea033b85a7b72e746b9");
            return;
        }
        this.c = false;
        this.y = true;
        this.d = null;
        this.z = true;
        this.A = true;
        this.C = 1.0f;
        this.E = gVar;
        this.D = com.sankuai.meituan.mapsdk.core.render.model.b.a(20);
        this.u.a("id", this.D);
        this.u.a("sort-key", 0.0f);
        this.u.a("MapConstant.LayerPropertyFlag_IconImage", "");
        this.u.a("MapConstant.LayerPropertyFlag_IconRotate", 0.0f);
        this.u.a("MapConstant.LayerPropertyFlag_IconOpacity", 1.0f);
        this.u.a("MapConstant.LayerPropertyFlag_IconSize", 1.0f);
        this.u.a("MapConstant.LayerPropertyFlag_IconAnchorXY", new double[]{0.5d, 1.0d});
        this.u.a("MapConstant.LayerPropertyFlag_IconAllowOverlap", true);
        this.u.a("MapConstant.LayerPropertyFlag_TextAllowOverlap", true);
        this.u.a("MapConstant.LayerPropertyFlag_IconIgnorePlacement", false);
        this.u.a("MapConstant.LayerPropertyFlag_TextIgnorePlacement", false);
        this.u.a("MapConstant.LayerPropertyFlag_TextField", "");
        this.u.a("MapConstant.LayerPropertyFlag_TextSize", 16.0f);
        this.u.a("MapConstant.LayerPropertyFlag_TextColor", x.c);
        this.u.a("MapConstant.LayerPropertyFlag_TextOpacity", 1.0f);
        this.u.a("MapConstant.LayerPropertyFlag_TextOptional", true);
        this.s.a(MapConstant.LayerPropertyFlag_TextMaxWidth, 10000.0f);
        gVar.k.add(this);
        if (this.k.d == null || this.k.e == null) {
            this.k.d = this.s;
            this.k.e = this.t;
            this.s.a(MapConstant.LayerPropertyFlag_MarkSortKey, "sort-key");
            this.s.a(4000, 0);
            this.s.b(MapConstant.LayerPropertyFlag_IconImage, super.a("MapConstant.LayerPropertyFlag_IconImage"));
            this.s.b(MapConstant.LayerPropertyFlag_IconRotate, super.a("MapConstant.LayerPropertyFlag_IconRotate"));
            this.s.b(MapConstant.LayerPropertyFlag_IconOpacity, super.a("MapConstant.LayerPropertyFlag_IconOpacity"));
            this.s.b(MapConstant.LayerPropertyFlag_IconAnchorXY, super.a("MapConstant.LayerPropertyFlag_IconAnchorXY"));
            this.s.b(MapConstant.LayerPropertyFlag_IconOffset, super.a("MapConstant.LayerPropertyFlag_IconOffset"));
            this.s.b(MapConstant.LayerPropertyFlag_IconSize, super.a("MapConstant.LayerPropertyFlag_IconSize"));
            this.s.b(MapConstant.LayerPropertyFlag_IconAllowOverlap, super.a("MapConstant.LayerPropertyFlag_IconAllowOverlap"));
            this.s.b(MapConstant.LayerPropertyFlag_TextAllowOverlap, super.a("MapConstant.LayerPropertyFlag_TextAllowOverlap"));
            this.s.b(MapConstant.LayerPropertyFlag_IconIgnorePlacement, super.a("MapConstant.LayerPropertyFlag_IconIgnorePlacement"));
            this.s.b(MapConstant.LayerPropertyFlag_TextIgnorePlacement, super.a("MapConstant.LayerPropertyFlag_TextIgnorePlacement"));
            this.s.a(MapConstant.LayerPropertyFlag_IconAnchor, 9);
            this.s.b(MapConstant.LayerPropertyFlag_TextField, super.a("MapConstant.LayerPropertyFlag_TextField"));
            this.s.a(MapConstant.LayerPropertyFlag_TextUnique, false);
            this.s.b(MapConstant.LayerPropertyFlag_TextAnchor, super.a("MapConstant.LayerPropertyFlag_TextAnchor"));
            this.s.b(MapConstant.LayerPropertyFlag_TextSize, super.a("MapConstant.LayerPropertyFlag_TextSize"));
            this.s.b(MapConstant.LayerPropertyFlag_TextColor, super.a("MapConstant.LayerPropertyFlag_TextColor"));
            this.s.b(MapConstant.LayerPropertyFlag_TextOpacity, super.a("MapConstant.LayerPropertyFlag_TextOpacity"));
            this.s.b(MapConstant.LayerPropertyFlag_TextHaloColor, super.a("MapConstant.LayerPropertyFlag_TextHaloColor"));
            this.s.b(MapConstant.LayerPropertyFlag_TextHaloWidth, super.a("MapConstant.LayerPropertyFlag_TextHaloWidth"));
            this.s.b(MapConstant.LayerPropertyFlag_TextHaloBlur, super.a("MapConstant.LayerPropertyFlag_TextHaloBlur"));
            this.s.b(MapConstant.LayerPropertyFlag_TextOffset, super.a("MapConstant.LayerPropertyFlag_TextOffset"));
            this.s.b(MapConstant.LayerPropertyFlag_TextOptional, super.a("MapConstant.LayerPropertyFlag_TextOptional"));
            a(Float.MAX_VALUE);
        }
        String str = markerOptions == null ? "MarkerOptions is null" : "";
        if (!TextUtils.isEmpty(str)) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.f(str);
        } else {
            a(markerOptions);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01eb990c7c75d47cad5f838de03e136e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01eb990c7c75d47cad5f838de03e136e");
        } else if (obj == null || this.c) {
        } else {
            super.a(obj);
            i();
        }
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d42c3270f77bd63d6ee291badb87ea61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d42c3270f77bd63d6ee291badb87ea61");
            return;
        }
        MarkerOptions markerOptions = (MarkerOptions) super.b();
        if (markerOptions != null) {
            if (!TextUtils.isEmpty(markerOptions.getID())) {
                this.D = markerOptions.getID();
            }
            if (markerOptions.getIcon() == null) {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.d("InfoWindowAnnotation get null icon");
            }
            a(markerOptions.getIcon());
            if (markerOptions.getPosition() != null) {
                a(markerOptions.getPosition());
            }
            a(markerOptions.getOffsetX(), markerOptions.getOffsetY());
            setZIndex(markerOptions.getZIndex());
            setLevel(markerOptions.getLevel());
            setClickable(markerOptions.isClickable());
            c(markerOptions.isFlat());
            setAlpha(markerOptions.getAlpha());
            setVisible(markerOptions.isVisible());
            a(markerOptions.isAllowOverlap());
            b(markerOptions.isIgnorePlacement());
            b(markerOptions.getTag());
        }
    }

    public final void a(BitmapDescriptor bitmapDescriptor) {
        Object[] objArr = {bitmapDescriptor};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47b8db2fb783f00600d22f8813d1824f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47b8db2fb783f00600d22f8813d1824f");
        } else if (this.c || bitmapDescriptor == null || bitmapDescriptor.equals(this.f)) {
        } else {
            this.u.a("MapConstant.LayerPropertyFlag_IconImage", bitmapDescriptor.getId());
            this.j.e.a(this.t, bitmapDescriptor, this.f);
            this.f = bitmapDescriptor;
        }
    }

    public final void a(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26a5a69768e3ac42ba53e688641bda35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26a5a69768e3ac42ba53e688641bda35");
        } else if (this.c || latLng == null) {
        } else {
            this.e = latLng;
            this.u.a(com.sankuai.meituan.mapsdk.core.render.model.c.Point, this.e);
        }
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31fcc91f0083f759987765941dce9efa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31fcc91f0083f759987765941dce9efa");
        } else if (this.c) {
        } else {
            this.g = i;
            this.h = i2;
            this.u.a("MapConstant.LayerPropertyFlag_IconOffset", new double[]{com.sankuai.meituan.mapsdk.core.utils.d.a(this.g), com.sankuai.meituan.mapsdk.core.utils.d.a(this.h)});
            if (this.r != null) {
                ((MarkerOptions) this.r).offset(i, i2);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final void setLevel(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32f44dff23319462fc1e30302daf0361", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32f44dff23319462fc1e30302daf0361");
        } else if (this.c) {
        } else {
            super.setLevel(i);
            a(this.p);
            if (this.r != null) {
                ((MarkerOptions) this.r).level(i);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58acad5374b57c8f7e9966ca9f7029e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58acad5374b57c8f7e9966ca9f7029e8");
        } else if (this.c) {
        } else {
            this.p = f;
            this.u.a("rank", this.p + 100000.0f);
            if (this.y) {
                this.u.a("sort-key", this.p);
            } else {
                a(this.p);
            }
            if (this.r != null) {
                ((MarkerOptions) this.r).zIndex(f);
            }
        }
    }

    private void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfc22b91edbc7f50fa0799f5c026a558", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfc22b91edbc7f50fa0799f5c026a558");
        } else if (this.c) {
        } else {
            this.B = z;
            this.s.a(MapConstant.LayerPropertyFlag_IconPitchAlignment, 1 ^ (this.B ? 1 : 0));
            if (this.r != null) {
                ((MarkerOptions) this.r).setFlat(z);
            }
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63f2456d14805714caa12d0799987038", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63f2456d14805714caa12d0799987038");
        } else if (this.c) {
        } else {
            this.z = z;
            this.u.a("MapConstant.LayerPropertyFlag_IconAllowOverlap", z);
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "918a9e72fc7fa1a3404d587954ca0c50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "918a9e72fc7fa1a3404d587954ca0c50");
        } else if (this.c) {
        } else {
            this.A = z;
            this.u.a("MapConstant.LayerPropertyFlag_IconIgnorePlacement", z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff2eb5f9d8cc31a928434a141dca3f52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff2eb5f9d8cc31a928434a141dca3f52");
        } else if (this.c) {
        } else {
            if (this.r != null) {
                ((MarkerOptions) this.r).visible(z);
            }
            this.m = z;
            if (!z) {
                float f = this.C;
                setAlpha(0.0f);
                this.C = f;
                if (this.r != null) {
                    ((MarkerOptions) this.r).alpha(this.C);
                    return;
                }
                return;
            }
            setAlpha(this.C);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.core.interfaces.a
    public final void setAlpha(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "950cbf7d54a1573770c617191d1a7800", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "950cbf7d54a1573770c617191d1a7800");
        } else if (this.c) {
        } else {
            if (f <= 0.0f || this.m) {
                super.setAlpha(f);
                this.C = f;
                this.u.a("MapConstant.LayerPropertyFlag_IconOpacity", this.v);
                this.u.a("MapConstant.LayerPropertyFlag_TextOpacity", this.v);
                if (this.r != null) {
                    ((MarkerOptions) this.r).alpha(f);
                }
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void remove() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "802f0e9ab959761a629a8ac3d1625d22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "802f0e9ab959761a629a8ac3d1625d22");
        } else if (this.c) {
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0b3a09f0f84fb3fc1ae93637cfa8ac0d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0b3a09f0f84fb3fc1ae93637cfa8ac0d");
            } else if (!this.c) {
                this.c = true;
                this.E.k.remove(this);
                if (this.f != null) {
                    this.j.e.b(this.t, this.f);
                    this.f = null;
                }
            }
            this.t.a(this.u);
        }
    }
}
