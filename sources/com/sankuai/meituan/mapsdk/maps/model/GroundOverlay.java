package com.sankuai.meituan.mapsdk.maps.model;

import android.os.Bundle;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.interfaces.g;
import com.sankuai.meituan.mapsdk.maps.interfaces.l;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class GroundOverlay implements g {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final g a;

    public GroundOverlay(@NonNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cdf87b28154f7ce412f61f5474dfdff8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cdf87b28154f7ce412f61f5474dfdff8");
        } else {
            this.a = gVar;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final void setImage(BitmapDescriptor bitmapDescriptor) {
        Object[] objArr = {bitmapDescriptor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b433f6edb51635a4275c8699b7dd400", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b433f6edb51635a4275c8699b7dd400");
        } else {
            this.a.setImage(bitmapDescriptor);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final BitmapDescriptor getImage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b184d4c6cf2b08059022bc9fb54cb9f", RobustBitConfig.DEFAULT_VALUE) ? (BitmapDescriptor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b184d4c6cf2b08059022bc9fb54cb9f") : this.a.getImage();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final void setPosition(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f65652fd11f8b34728591c6a1c377f6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f65652fd11f8b34728591c6a1c377f6f");
        } else {
            this.a.setPosition(latLng);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final LatLng getPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc52b3ef9274303c8a8b3c0bd51c9c56", RobustBitConfig.DEFAULT_VALUE) ? (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc52b3ef9274303c8a8b3c0bd51c9c56") : this.a.getPosition();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final void setDimensions(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f1b7364da1374ae591405dbf40aed54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f1b7364da1374ae591405dbf40aed54");
        } else {
            this.a.setDimensions(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final void setDimensions(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db189b6cd9ff83b9329fe5aa73ac4454", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db189b6cd9ff83b9329fe5aa73ac4454");
        } else {
            this.a.setDimensions(f, f2);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final double getWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a25a36f93134fca2272785ae36c07854", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a25a36f93134fca2272785ae36c07854")).doubleValue() : this.a.getWidth();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final double getHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "424f78ebaeeab3c1944d9d77cde23aa4", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "424f78ebaeeab3c1944d9d77cde23aa4")).doubleValue() : this.a.getHeight();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final void setAnchor(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4542a2afcbebd70d5fede64b12b1ac8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4542a2afcbebd70d5fede64b12b1ac8");
        } else {
            this.a.setAnchor(f, f2);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final float getAnchorX() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae86f548f79bc00785e8a87b0c8b3896", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae86f548f79bc00785e8a87b0c8b3896")).floatValue() : this.a.getAnchorX();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final float getAnchorY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae441fe1d98755d008948b00c1584a65", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae441fe1d98755d008948b00c1584a65")).floatValue() : this.a.getAnchorY();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final void setPositionFromBounds(LatLngBounds latLngBounds) {
        Object[] objArr = {latLngBounds};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c195536fb77a6f3897da6ecbb9565b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c195536fb77a6f3897da6ecbb9565b3");
        } else {
            this.a.setPositionFromBounds(latLngBounds);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final LatLngBounds getBounds() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35b8caf39a95fda3a6614a1a3bf14510", RobustBitConfig.DEFAULT_VALUE) ? (LatLngBounds) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35b8caf39a95fda3a6614a1a3bf14510") : this.a.getBounds();
    }

    @Deprecated
    public final void setTransparency(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92e02f98e79f61d3621318895b0925c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92e02f98e79f61d3621318895b0925c9");
        } else {
            this.a.setAlpha(f);
        }
    }

    @Deprecated
    public final float getTransparency() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b55085f860eb3baa7527959c9384ace", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b55085f860eb3baa7527959c9384ace")).floatValue() : this.a.getAlpha();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final float getAlpha() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62a7b61d43db9929fb9308292c908cdd", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62a7b61d43db9929fb9308292c908cdd")).floatValue() : this.a.getAlpha();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final void setAlpha(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e69a9db0594a21b0271e09a05d97edc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e69a9db0594a21b0271e09a05d97edc");
        } else {
            this.a.setAlpha(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final boolean isVisible() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7f5e79ec3970b1f5996ed594c1e8d0e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7f5e79ec3970b1f5996ed594c1e8d0e")).booleanValue() : this.a.isVisible();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8992a8c65380a259c09028ef8125151", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8992a8c65380a259c09028ef8125151");
        } else {
            this.a.setVisible(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final float getZIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "427d012df46d04f5e6cf897a352ef1de", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "427d012df46d04f5e6cf897a352ef1de")).floatValue() : this.a.getZIndex();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2364e0d7b401e64fad8db500806fb5ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2364e0d7b401e64fad8db500806fb5ec");
        } else {
            this.a.setZIndex(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final Bundle getExtraInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb74b4efc6c7c4ad11160680f5844f06", RobustBitConfig.DEFAULT_VALUE) ? (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb74b4efc6c7c4ad11160680f5844f06") : this.a.getExtraInfo();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final void setExtraInfo(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c39342e283fe12d33cb1457b063e948", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c39342e283fe12d33cb1457b063e948");
        } else {
            this.a.setExtraInfo(bundle);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void remove() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3f116ab00aa22d6270e15b42d6ccb5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3f116ab00aa22d6270e15b42d6ccb5d");
        } else {
            this.a.remove();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final String getId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b86972aee46eb1751821f26d6242677d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b86972aee46eb1751821f26d6242677d") : this.a.getId();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final void setBearing(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "968a43d75ba14adcd58c4a00174ff57c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "968a43d75ba14adcd58c4a00174ff57c");
        } else {
            this.a.setBearing(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final float getBearing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7cfec10897fece6c483d7c225048298", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7cfec10897fece6c483d7c225048298")).floatValue() : this.a.getBearing();
    }

    public final l getMapElement() {
        return this.a;
    }
}
