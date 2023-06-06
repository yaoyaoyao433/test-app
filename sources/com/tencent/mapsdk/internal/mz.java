package com.tencent.mapsdk.internal;

import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor;
import com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class mz extends mp<nb> implements GroundOverlay {
    /* JADX INFO: Access modifiers changed from: package-private */
    public mz(na naVar, nb nbVar) {
        super(naVar, nbVar);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay
    public final void setBitmap(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor == null) {
            return;
        }
        if (((nb) this.d).a != null) {
            ((nb) this.d).a.bitmap(bitmapDescriptor);
        }
        if (this.c != null) {
            ((nb) this.d).setBitmap(bitmapDescriptor.getBitmap(this.c.a()));
        }
        a((mz) this.d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay
    public final void setLatLongBounds(LatLngBounds latLngBounds) {
        if (((nb) this.d).a != null) {
            ((nb) this.d).a.latLngBounds(latLngBounds);
        }
        ((nb) this.d).setLatLngBounds(latLngBounds);
        a((mz) this.d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay
    public final void setPosition(LatLng latLng) {
        if (((nb) this.d).a != null) {
            ((nb) this.d).a.position(latLng);
        }
        ((nb) this.d).a();
        a((mz) this.d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay
    public final void setZoom(float f) {
        if (((nb) this.d).a != null) {
            ((nb) this.d).a.zoom(f);
        }
        ((nb) this.d).a();
        a((mz) this.d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay
    public final void setAnchor(float f, float f2) {
        if (((nb) this.d).a != null) {
            ((nb) this.d).a.anchor(f, f2);
        }
        ((nb) this.d).a();
        a((mz) this.d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay
    public final void setAlpha(float f) {
        if (((nb) this.d).a != null) {
            ((nb) this.d).a.alpha(f);
        }
        ((nb) this.d).setAlpha(f);
        a((mz) this.d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay
    public final void setVisibility(boolean z) {
        if (((nb) this.d).a != null) {
            ((nb) this.d).a.visible(z);
        }
        ((nb) this.d).setVisibility(z);
        a((mz) this.d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay
    public final void setZindex(int i) {
        if (((nb) this.d).a != null) {
            ((nb) this.d).a.zIndex(i);
        }
        ((nb) this.d).setZIndex(i);
        a((mz) this.d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay
    public final void setLevel(int i) {
        if (((nb) this.d).a != null) {
            ((nb) this.d).a.level(i);
        }
        ((nb) this.d).setLevel(i);
        a((mz) this.d);
    }
}
