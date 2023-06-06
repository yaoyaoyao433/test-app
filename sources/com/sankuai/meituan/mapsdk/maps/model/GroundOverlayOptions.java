package com.sankuai.meituan.mapsdk.maps.model;

import android.os.Bundle;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class GroundOverlayOptions {
    public static final int UNDEFINED_HEIGHT = -1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private BitmapDescriptor a;
    private LatLng b;
    private int c;
    private int d;
    private float e;
    private float f;
    private LatLngBounds g;
    private float h;
    private float i;
    private int j;
    private Bundle k;
    private float l;
    private boolean m;
    public boolean visible;

    public GroundOverlayOptions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b88d8ff305fee18cc19ac1d44de92e14", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b88d8ff305fee18cc19ac1d44de92e14");
            return;
        }
        this.d = -1;
        this.e = 0.5f;
        this.f = 0.5f;
        this.h = 0.0f;
        this.j = 1;
        this.visible = true;
        this.m = false;
    }

    public final GroundOverlayOptions image(@NonNull BitmapDescriptor bitmapDescriptor) {
        this.a = bitmapDescriptor;
        return this;
    }

    public final BitmapDescriptor getImage() {
        return this.a;
    }

    @Deprecated
    public final LatLng getPosition() {
        return this.b;
    }

    @Deprecated
    public final GroundOverlayOptions position(@NonNull LatLng latLng, int i) {
        Object[] objArr = {latLng, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fef7691d263a5e8a6bef40e2155e6a7f", RobustBitConfig.DEFAULT_VALUE) ? (GroundOverlayOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fef7691d263a5e8a6bef40e2155e6a7f") : position(latLng, i, -1);
    }

    @Deprecated
    public final GroundOverlayOptions position(@NonNull LatLng latLng, int i, int i2) {
        this.b = latLng;
        this.c = i;
        this.d = i2;
        return this;
    }

    @Deprecated
    public final GroundOverlayOptions width(int i) {
        this.c = i;
        return this;
    }

    @Deprecated
    public final GroundOverlayOptions height(int i) {
        this.d = i;
        return this;
    }

    @Deprecated
    public final int getWidth() {
        return this.c;
    }

    @Deprecated
    public final int getHeight() {
        return this.d;
    }

    public final GroundOverlayOptions anchor(float f, float f2) {
        this.e = f;
        this.f = f2;
        return this;
    }

    public final float getAnchorX() {
        return this.e;
    }

    public final float getAnchorY() {
        return this.f;
    }

    public final GroundOverlayOptions positionFromBounds(@NonNull LatLngBounds latLngBounds) {
        this.g = latLngBounds;
        return this;
    }

    public final LatLngBounds getBounds() {
        return this.g;
    }

    public final GroundOverlayOptions transparency(float f) {
        this.h = f;
        return this;
    }

    public final float getTransparency() {
        return this.h;
    }

    public final GroundOverlayOptions visible(boolean z) {
        this.visible = z;
        return this;
    }

    public final boolean isVisible() {
        return this.visible;
    }

    public final GroundOverlayOptions zIndex(float f) {
        this.i = f;
        this.m = true;
        return this;
    }

    public final float getZIndex() {
        return this.i;
    }

    public final GroundOverlayOptions level(int i) {
        if (i >= 0 && i <= 2) {
            this.j = i;
        }
        return this;
    }

    public final int getLevel() {
        return this.j;
    }

    public final GroundOverlayOptions extraInfo(Bundle bundle) {
        this.k = bundle;
        return this;
    }

    public final Bundle getExtraInfo() {
        return this.k;
    }

    @Deprecated
    public final GroundOverlayOptions bearing(float f) {
        this.l = f;
        return this;
    }

    @Deprecated
    public final float getBearing() {
        return this.l;
    }

    public final boolean iszIndexDefined() {
        return this.m;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e1039418f4a6193cfa413e93e174a50", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e1039418f4a6193cfa413e93e174a50");
        }
        return "GroundOverlayOptions{image=" + this.a + ", latLng=" + this.b + ", width=" + this.c + ", height=" + this.d + ", anchorX=" + this.e + ", anchorY=" + this.f + ", bounds=" + this.g + ", transparency=" + this.h + ", zIndex=" + this.i + ", visible=" + this.visible + ", extraInfo=" + this.k + ", bearing=" + this.l + ", zIndexDefined=" + this.m + '}';
    }
}
