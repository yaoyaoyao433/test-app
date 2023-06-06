package com.sankuai.meituan.mapsdk.tencentadapter;

import android.os.Bundle;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.GroundOverlayOptions;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.LatLngBounds;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory;
import com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f implements com.sankuai.meituan.mapsdk.maps.interfaces.g {
    public static ChangeQuickRedirect a;
    private boolean b;
    private GroundOverlay c;
    private GroundOverlayOptions d;

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final float getAlpha() {
        return 0.0f;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final void setAlpha(float f) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final void setDimensions(float f) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final void setDimensions(float f, float f2) {
    }

    public f(@NonNull GroundOverlay groundOverlay, GroundOverlayOptions groundOverlayOptions) {
        Object[] objArr = {groundOverlay, groundOverlayOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d15d6b10685e4493ebcd55f98212b11", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d15d6b10685e4493ebcd55f98212b11");
            return;
        }
        this.b = false;
        this.c = groundOverlay;
        this.d = groundOverlayOptions;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final void setImage(BitmapDescriptor bitmapDescriptor) {
        Object[] objArr = {bitmapDescriptor};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4533edf48fcfeba94873b7cc559bfacf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4533edf48fcfeba94873b7cc559bfacf");
        } else if (this.b) {
        } else {
            this.d.image(bitmapDescriptor);
            this.c.setBitmap(BitmapDescriptorFactory.fromBitmap(bitmapDescriptor.getBitmap()));
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final BitmapDescriptor getImage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "725ea7e3d74c1eb8859ccbedf3cd57a5", RobustBitConfig.DEFAULT_VALUE) ? (BitmapDescriptor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "725ea7e3d74c1eb8859ccbedf3cd57a5") : this.d.getImage();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final void setPosition(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8944ec36fba566a9db8c8bdb3c241724", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8944ec36fba566a9db8c8bdb3c241724");
        } else if (this.b) {
        } else {
            this.d.position(latLng, this.d.getWidth(), this.d.getHeight());
            this.c.setPosition(b.a(latLng));
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final LatLng getPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c71411184a2924f371d69680f9a35bb", RobustBitConfig.DEFAULT_VALUE) ? (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c71411184a2924f371d69680f9a35bb") : this.d.getPosition();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final double getWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c6c52404bf3753fda25eddc05fc4895", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c6c52404bf3753fda25eddc05fc4895")).doubleValue() : this.d.getWidth();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final double getHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cbff2326249d03df73c92959bd550d8", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cbff2326249d03df73c92959bd550d8")).doubleValue() : this.d.getHeight();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final void setAnchor(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1c447d65f9f9fab8eace190553e2f5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1c447d65f9f9fab8eace190553e2f5e");
        } else if (this.b) {
        } else {
            this.d.anchor(f, f2);
            this.c.setAnchor(f, f2);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final float getAnchorX() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7da5a45ac939fbf4c6a48567f5f03d6", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7da5a45ac939fbf4c6a48567f5f03d6")).floatValue() : this.d.getAnchorX();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final float getAnchorY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07587f9562e1eec5d119629054e44e57", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07587f9562e1eec5d119629054e44e57")).floatValue() : this.d.getAnchorY();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final void setPositionFromBounds(LatLngBounds latLngBounds) {
        Object[] objArr = {latLngBounds};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97896f549ee5cfe2b7d01ff06847e209", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97896f549ee5cfe2b7d01ff06847e209");
        } else if (this.b) {
        } else {
            this.d.positionFromBounds(latLngBounds);
            this.c.setLatLongBounds(b.a(latLngBounds));
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final LatLngBounds getBounds() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30b31a66380218bb704acc6c196d2169", RobustBitConfig.DEFAULT_VALUE) ? (LatLngBounds) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30b31a66380218bb704acc6c196d2169") : this.d.getBounds();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final boolean isVisible() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52bbfc60cb546ad6f157c2232f0e00da", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52bbfc60cb546ad6f157c2232f0e00da")).booleanValue() : this.d.isVisible();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03a3e578a06a20d403d3ee301784ebe1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03a3e578a06a20d403d3ee301784ebe1");
        } else if (this.b) {
        } else {
            this.d.visible(z);
            this.c.setVisibility(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final float getZIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "305a753508f54b5d3051f061046370c2", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "305a753508f54b5d3051f061046370c2")).floatValue() : this.d.getZIndex();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b43b301a9ea76b4477c3809dbd147c56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b43b301a9ea76b4477c3809dbd147c56");
        } else if (this.b) {
        } else {
            int i = (int) (f + 0.5d);
            this.d.zIndex(i);
            this.c.setZindex(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final Bundle getExtraInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2798c78cbe06a89690701e34a4c73d94", RobustBitConfig.DEFAULT_VALUE) ? (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2798c78cbe06a89690701e34a4c73d94") : this.d.getExtraInfo();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final void setExtraInfo(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b4fed551071fe206e25c55814a00812", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b4fed551071fe206e25c55814a00812");
        } else {
            this.d.extraInfo(bundle);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void remove() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb74191575d96c85fefe6227c53e0536", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb74191575d96c85fefe6227c53e0536");
        } else if (this.b) {
        } else {
            this.b = true;
            this.c.remove();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final String getId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b01a336e9955d3708a6f09b9fe722cd5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b01a336e9955d3708a6f09b9fe722cd5") : String.valueOf(this.c.hashCode());
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final void setBearing(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81a580e9fcab66f2a9e82a59c14b0c23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81a580e9fcab66f2a9e82a59c14b0c23");
        } else {
            this.d.bearing(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final float getBearing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ba24e75186e0ece5132b42d072fe182", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ba24e75186e0ece5132b42d072fe182")).floatValue() : this.d.getBearing();
    }
}
