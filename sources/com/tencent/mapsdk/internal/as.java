package com.tencent.mapsdk.internal;

import com.tencent.tencentmap.mapsdk.maps.model.Arc;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class as extends av<ag> implements Arc {
    private ag a;

    public as(ag agVar) {
        this.a = agVar;
    }

    private ag b() {
        return this.a;
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

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Colorable
    public final void setColor(int i) {
        this.a.setColor(i);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Colorable
    public final int getColor() {
        return this.a.getColor();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Arc
    public final LatLng getCenter() {
        return this.a.getCenter();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Arc
    public final double getLength() {
        return this.a.getLength();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Arc
    public final double getRadius() {
        return this.a.getRadius();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Widthable
    public final void setWidth(float f) {
        this.a.setWidth(f);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Widthable
    public final float getWidth() {
        return this.a.getWidth();
    }

    @Override // com.tencent.mapsdk.internal.av
    public final /* bridge */ /* synthetic */ ag f_() {
        return this.a;
    }
}
