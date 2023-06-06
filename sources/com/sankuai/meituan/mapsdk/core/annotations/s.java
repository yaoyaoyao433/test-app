package com.sankuai.meituan.mapsdk.core.annotations;

import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.GroundOverlayOptions;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.LatLngBounds;
import com.sankuai.meituan.mapsdk.maps.model.PointD;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class s extends e implements com.sankuai.meituan.mapsdk.maps.interfaces.g {
    public static ChangeQuickRedirect b;
    private Bundle A;
    private boolean B;
    private final List<PointD> C;
    private LatLngBounds c;
    private BitmapDescriptor d;
    private float e;
    private float f;
    private float g;
    private LatLng h;
    private float y;
    private float z;

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ String a(String str) {
        return super.a(str);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        super.a(obj);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ Object b() {
        return super.b();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final /* bridge */ /* synthetic */ float getAlpha() {
        return super.getAlpha();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final /* bridge */ /* synthetic */ String getId() {
        return super.getId();
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
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ boolean isClickable() {
        return super.isClickable();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final /* bridge */ /* synthetic */ boolean isVisible() {
        return super.isVisible();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final /* bridge */ /* synthetic */ void remove() {
        super.remove();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.e
    public final /* bridge */ /* synthetic */ void setClickable(boolean z) {
        super.setClickable(z);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ void setLevel(int i) {
        super.setLevel(i);
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
    public final /* bridge */ /* synthetic */ void setVisible(boolean z) {
        super.setVisible(z);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final /* bridge */ /* synthetic */ void setZIndex(float f) {
        super.setZIndex(f);
    }

    public s(g gVar, GroundOverlayOptions groundOverlayOptions) {
        super(gVar);
        float height;
        Object[] objArr = {gVar, groundOverlayOptions};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73113780f77ace0a564bddb2156e591e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73113780f77ace0a564bddb2156e591e");
            return;
        }
        this.B = true;
        this.C = new ArrayList();
        String str = "";
        if (groundOverlayOptions == null) {
            str = "options == null";
        } else if (groundOverlayOptions.getWidth() < 0) {
            str = "image's width < 0";
        }
        if (!TextUtils.isEmpty(str)) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.f(str);
            return;
        }
        this.s.a(false);
        this.d = groundOverlayOptions.getImage();
        this.f = groundOverlayOptions.getWidth();
        this.g = groundOverlayOptions.getHeight();
        if (this.g < 0.0f) {
            BitmapDescriptor bitmapDescriptor = this.d;
            float f = this.f;
            Object[] objArr2 = {bitmapDescriptor, Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d034f68d709ec24c2bc10b9839cb4f23", RobustBitConfig.DEFAULT_VALUE)) {
                height = ((Float) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d034f68d709ec24c2bc10b9839cb4f23")).floatValue();
            } else {
                height = bitmapDescriptor != null ? (bitmapDescriptor.getHeight() / bitmapDescriptor.getWidth()) * f : 0.0f;
            }
            this.g = height;
        }
        this.e = com.sankuai.meituan.mapsdk.core.utils.a.b(groundOverlayOptions.getBearing());
        this.y = com.sankuai.meituan.mapsdk.core.utils.a.c(groundOverlayOptions.getAnchorX());
        this.z = com.sankuai.meituan.mapsdk.core.utils.a.c(groundOverlayOptions.getAnchorY());
        if (groundOverlayOptions.getImage() != null) {
            ((com.sankuai.meituan.mapsdk.core.render.model.e) this.t).a(this.d.getBitmap());
        }
        if (groundOverlayOptions.getPosition() != null) {
            setPosition(groundOverlayOptions.getPosition());
            this.B = false;
        } else if (groundOverlayOptions.getBounds() != null) {
            setPositionFromBounds(groundOverlayOptions.getBounds());
            this.B = true;
        }
        setLevel(groundOverlayOptions.getLevel());
        setZIndex(groundOverlayOptions.getZIndex());
        setAlpha(groundOverlayOptions.getTransparency());
        setVisible(groundOverlayOptions.isVisible());
        setExtraInfo(groundOverlayOptions.getExtraInfo());
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final float getBearing() {
        return this.e;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final void setBearing(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "781e4a495e60b41d04afa92977b73561", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "781e4a495e60b41d04afa92977b73561");
        } else if (f()) {
        } else {
            this.e = com.sankuai.meituan.mapsdk.core.utils.a.b(f);
            i();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final LatLngBounds getBounds() {
        return this.c;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final double getHeight() {
        return this.g;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final LatLng getPosition() {
        return this.h;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final void setPosition(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04f272fd744161735ae0bda4f3840f2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04f272fd744161735ae0bda4f3840f2e");
        } else if (f() || latLng == null) {
        } else {
            this.h = latLng;
            h();
            i();
        }
    }

    private void h() {
        com.sankuai.meituan.mapsdk.core.f g;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fb7d6f94b0efa3560bbc7bd792c8e88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fb7d6f94b0efa3560bbc7bd792c8e88");
        } else if (this.h == null || (g = g()) == null) {
        } else {
            PointD projectedMetersForLatLng = g.toProjectedMetersForLatLng(this.h);
            PointD pointD = new PointD(projectedMetersForLatLng.x - (this.f * this.y), projectedMetersForLatLng.y - (this.g * this.z));
            PointD pointD2 = new PointD(projectedMetersForLatLng.x + (this.f * (1.0f - this.y)), projectedMetersForLatLng.y - (this.g * this.z));
            PointD pointD3 = new PointD(projectedMetersForLatLng.x - (this.f * this.y), projectedMetersForLatLng.y + (this.g * (1.0f - this.z)));
            PointD pointD4 = new PointD(projectedMetersForLatLng.x + (this.f * (1.0f - this.y)), projectedMetersForLatLng.y + (this.g * (1.0f - this.z)));
            this.C.clear();
            this.C.add(pointD);
            this.C.add(pointD2);
            this.C.add(pointD4);
            this.C.add(pointD3);
            this.C.add(projectedMetersForLatLng);
            a(g);
        }
    }

    private void a(com.sankuai.meituan.mapsdk.core.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8350fec64b650f7b64f3ee56d44de51f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8350fec64b650f7b64f3ee56d44de51f");
            return;
        }
        LatLng fromProjectedMeters = fVar.fromProjectedMeters(this.C.get(3));
        LatLng fromProjectedMeters2 = fVar.fromProjectedMeters(this.C.get(1));
        if (fromProjectedMeters == null || fromProjectedMeters2 == null) {
            return;
        }
        this.c = new LatLngBounds(fromProjectedMeters, fromProjectedMeters2);
    }

    private void i() {
        com.sankuai.meituan.mapsdk.core.f g;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77a6714188c97d01b1dc47c69e4bd898", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77a6714188c97d01b1dc47c69e4bd898");
        } else if (this.C == null || this.C.size() < 5 || (g = g()) == null) {
        } else {
            PointD pointD = this.C.get(0);
            PointD pointD2 = this.C.get(1);
            PointD pointD3 = this.C.get(2);
            PointD pointD4 = this.C.get(3);
            PointD pointD5 = this.C.get(4);
            if (pointD == null || pointD2 == null || pointD3 == null || pointD4 == null || pointD5 == null) {
                return;
            }
            if (this.e / 360.0f != 0.0f) {
                pointD = a(pointD5, pointD, this.e);
                pointD2 = a(pointD5, pointD2, this.e);
                pointD3 = a(pointD5, pointD3, this.e);
                pointD4 = a(pointD5, pointD4, this.e);
            }
            ((com.sankuai.meituan.mapsdk.core.render.model.e) this.t).a(new LatLng[]{g.fromProjectedMeters(pointD), g.fromProjectedMeters(pointD2), g.fromProjectedMeters(pointD3), g.fromProjectedMeters(pointD4)});
            this.j.c.e();
        }
    }

    private PointD a(PointD pointD, PointD pointD2, float f) {
        Object[] objArr = {pointD, pointD2, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7209fcec147b614bc857d46a51c84a7f", RobustBitConfig.DEFAULT_VALUE)) {
            return (PointD) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7209fcec147b614bc857d46a51c84a7f");
        }
        double d = pointD2.x - pointD.x;
        double d2 = pointD2.y - pointD.y;
        double d3 = (f * 3.141592653589793d) / 180.0d;
        return new PointD(((Math.cos(d3) * d) - (Math.sin(d3) * d2)) + pointD.x, (d2 * Math.cos(d3)) + (d * Math.sin(d3)) + pointD.y);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final double getWidth() {
        return this.f;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final void setDimensions(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a6509f40d71163a4dd0ff54f6b6ff68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a6509f40d71163a4dd0ff54f6b6ff68");
        } else if (f()) {
        } else {
            this.f = Math.abs(f);
            if (this.d != null) {
                this.g = (this.d.getHeight() / this.d.getWidth()) * f;
            } else {
                this.g = f;
            }
            h();
            i();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final void setDimensions(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8dc7010e0ffc0d85337410dffd85337", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8dc7010e0ffc0d85337410dffd85337");
        } else if (f()) {
        } else {
            this.f = Math.abs(f);
            this.g = Math.abs(f2);
            this.B = false;
            h();
            i();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final void setPositionFromBounds(LatLngBounds latLngBounds) {
        com.sankuai.meituan.mapsdk.core.f g;
        Object[] objArr = {latLngBounds};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "447b890950263acfaa3bf7fa7fcd761d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "447b890950263acfaa3bf7fa7fcd761d");
        } else if (f() || latLngBounds == null) {
        } else {
            this.c = latLngBounds;
            this.B = true;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4b45882dbefdccec0fc2cf73286a23e4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4b45882dbefdccec0fc2cf73286a23e4");
            } else if (this.c != null && this.c.southwest != null && this.c.northeast != null && (g = g()) != null) {
                LatLng latLng = this.c.southwest;
                LatLng latLng2 = this.c.northeast;
                LatLng latLng3 = new LatLng(latLng2.latitude, latLng.longitude);
                LatLng latLng4 = new LatLng(latLng.latitude, latLng2.longitude);
                this.C.clear();
                this.C.add(g.toProjectedMetersForLatLng(latLng3));
                this.C.add(g.toProjectedMetersForLatLng(latLng2));
                this.C.add(g.toProjectedMetersForLatLng(latLng4));
                this.C.add(g.toProjectedMetersForLatLng(latLng));
                PointD pointD = this.C.get(0);
                PointD pointD2 = this.C.get(2);
                this.C.add(new PointD(pointD.x + (this.y * (pointD2.x - pointD.x)), pointD.y + (this.z * (pointD2.y - pointD.y))));
                Object[] objArr3 = {g};
                ChangeQuickRedirect changeQuickRedirect3 = b;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c1bcf681334f9bbf756539a013347286", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c1bcf681334f9bbf756539a013347286");
                } else {
                    PointD pointD3 = this.C.get(0);
                    PointD pointD4 = this.C.get(2);
                    this.h = g.fromProjectedMeters(this.C.get(4));
                    this.f = Math.abs((float) (pointD4.x - pointD3.x));
                    this.g = Math.abs((float) (pointD4.y - pointD3.y));
                }
            }
            i();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final void setAnchor(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54a212ee92e6215fe5353416080e85ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54a212ee92e6215fe5353416080e85ad");
        } else if (f()) {
        } else {
            this.y = com.sankuai.meituan.mapsdk.core.utils.a.c(f);
            this.z = com.sankuai.meituan.mapsdk.core.utils.a.c(f2);
            if (!this.B) {
                h();
                i();
            } else if (this.e / 360.0f != 0.0f) {
                i();
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final float getAnchorX() {
        return this.y;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final float getAnchorY() {
        return this.z;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final BitmapDescriptor getImage() {
        return this.d;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final void setImage(BitmapDescriptor bitmapDescriptor) {
        Object[] objArr = {bitmapDescriptor};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d08caede1cbd26d42250b3732145c07d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d08caede1cbd26d42250b3732145c07d");
        } else if (f() || bitmapDescriptor == null || bitmapDescriptor.equals(this.d)) {
        } else {
            this.d = bitmapDescriptor;
            ((com.sankuai.meituan.mapsdk.core.render.model.e) this.t).a(bitmapDescriptor.getBitmap());
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final Bundle getExtraInfo() {
        return this.A;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final void setExtraInfo(Bundle bundle) {
        this.A = bundle;
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.core.interfaces.a
    public final void setAlpha(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50a29b011cee7dab10809b692c20079b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50a29b011cee7dab10809b692c20079b");
            return;
        }
        Object[] objArr2 = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "84be2c0f3dcbd6e3a0729c41ed0b6ba2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "84be2c0f3dcbd6e3a0729c41ed0b6ba2");
        } else if (f()) {
        } else {
            super.setAlpha(f);
            this.s.a(MapConstant.LayerPropertyFlag_RasterOpacity, 1.0f - this.v);
        }
    }
}
