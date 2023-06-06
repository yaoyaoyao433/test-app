package com.tencent.mapsdk.internal;

import com.tencent.tencentmap.mapsdk.maps.model.Circle;
import com.tencent.tencentmap.mapsdk.maps.model.CircleOptions;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class at extends av<ah> implements Circle {
    private ah a;

    public at(ah ahVar) {
        this.a = ahVar;
    }

    private ah b() {
        return this.a;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Circle
    public final boolean contains(LatLng latLng) {
        return this.a.contains(latLng);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Circle
    public final void setCenter(LatLng latLng) {
        this.a.setCenter(latLng);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Circle
    public final LatLng getCenter() {
        return this.a.getCenter();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Circle
    public final void setRadius(double d) {
        this.a.setRadius(d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Circle
    public final double getRadius() {
        return this.a.getRadius();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Circle
    @Deprecated
    public final void setOptions(CircleOptions circleOptions) {
        this.a.setOptions(circleOptions);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Clickable
    public final void setClickable(boolean z) {
        this.a.setClickable(z);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Clickable
    public final boolean isClickable() {
        return this.a.isClickable();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Fillable
    public final void setFillColor(int i) {
        this.a.setFillColor(i);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Fillable
    public final int getFillColor() {
        return this.a.getFillColor();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Strokeable
    public final void setStrokeWidth(float f) {
        this.a.setStrokeWidth(f);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Strokeable
    public final float getStrokeWidth() {
        return this.a.getStrokeWidth();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Strokeable
    public final void setStrokeColor(int i) {
        this.a.setStrokeColor(i);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Strokeable
    public final int getStrokeColor() {
        return this.a.getStrokeColor();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Tagable
    public final void setTag(Object obj) {
        this.a.setTag(obj);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Tagable
    public final Object getTag() {
        return this.a.getTag();
    }

    @Override // com.tencent.mapsdk.internal.av
    public final /* bridge */ /* synthetic */ ah f_() {
        return this.a;
    }
}
