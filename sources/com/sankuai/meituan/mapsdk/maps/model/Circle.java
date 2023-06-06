package com.sankuai.meituan.mapsdk.maps.model;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.interfaces.d;
import com.sankuai.meituan.mapsdk.maps.interfaces.l;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class Circle implements d {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final d a;

    public Circle(@NonNull d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6004e91aba8f47763bf974ab73af4e8f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6004e91aba8f47763bf974ab73af4e8f");
        } else {
            this.a = dVar;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void remove() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b507b6ea8e8918753745cca3c4bd980", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b507b6ea8e8918753745cca3c4bd980");
        } else {
            this.a.remove();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final String getId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08800b5b6ceb03afb4fd0e5cd1e87fbd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08800b5b6ceb03afb4fd0e5cd1e87fbd") : this.a.getId();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d
    public final LatLng getCenter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd7884e873b32ac702806c00081a5eae", RobustBitConfig.DEFAULT_VALUE) ? (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd7884e873b32ac702806c00081a5eae") : this.a.getCenter();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d
    public final void setCenter(@NonNull LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fc25f392730585e71237c565ad03c24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fc25f392730585e71237c565ad03c24");
        } else {
            this.a.setCenter(latLng);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d
    public final double getRadius() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2cc586956433bee22fe2667c170b9673", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2cc586956433bee22fe2667c170b9673")).doubleValue() : this.a.getRadius();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d
    public final void setRadius(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40f15327d7506b9c8353a54d4d991b5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40f15327d7506b9c8353a54d4d991b5a");
        } else {
            this.a.setRadius(d);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d
    public final float getStrokeWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1e31e615badbda81400300d2de85550", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1e31e615badbda81400300d2de85550")).floatValue() : this.a.getStrokeWidth();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d
    public final void setStrokeWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de68f2ff195d4c1b99e42192a1cc1f76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de68f2ff195d4c1b99e42192a1cc1f76");
        } else {
            this.a.setStrokeWidth(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d
    public final int getStrokeColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f85c026f115d62e61fd0ec1233d22496", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f85c026f115d62e61fd0ec1233d22496")).intValue() : this.a.getStrokeColor();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d
    public final void setStrokeColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "334828084810800a29a3aaf1449992f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "334828084810800a29a3aaf1449992f9");
        } else {
            this.a.setStrokeColor(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d
    public final int getFillColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b1e44ec800f445d5cbc50666f6d2ad0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b1e44ec800f445d5cbc50666f6d2ad0")).intValue() : this.a.getFillColor();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d
    public final void setFillColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bd35e53129341b8ff680bed2f71fb39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bd35e53129341b8ff680bed2f71fb39");
        } else {
            this.a.setFillColor(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final float getZIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d61a7362954321d054ae5a004de544c2", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d61a7362954321d054ae5a004de544c2")).floatValue() : this.a.getZIndex();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e793d684b643bc7a4d3a2cf8526f0d47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e793d684b643bc7a4d3a2cf8526f0d47");
        } else {
            this.a.setZIndex(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d
    public final void setMask(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b7f87abde538f4cee20772868bbe6a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b7f87abde538f4cee20772868bbe6a2");
        } else {
            this.a.setMask(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d
    public final boolean isMask() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a981d51808df3ac87e73f5a57d51cf41", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a981d51808df3ac87e73f5a57d51cf41")).booleanValue() : this.a.isMask();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final boolean isVisible() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d36b9e7668c65492061edcf8a9332c4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d36b9e7668c65492061edcf8a9332c4")).booleanValue() : this.a.isVisible();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59fc5674f631de6b1eb6a5fce3c37e2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59fc5674f631de6b1eb6a5fce3c37e2c");
        } else {
            this.a.setVisible(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.d
    @Deprecated
    public final boolean contains(@NonNull LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fda089063b406a5b35803f30cf57b40e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fda089063b406a5b35803f30cf57b40e")).booleanValue() : this.a.contains(latLng);
    }

    public final l getMapElement() {
        return this.a;
    }
}
