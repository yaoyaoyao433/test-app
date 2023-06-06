package com.tencent.mapsdk.internal;

import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.Polygon;
import com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ax extends av<aq> implements Polygon {
    aq a;

    public ax(aq aqVar) {
        this.a = aqVar;
    }

    private aq b() {
        return this.a;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polygon
    public final void setPoints(List<LatLng> list) {
        if (this.a == null) {
            return;
        }
        this.a.setPoints(list);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polygon
    public final List<LatLng> getPoints() {
        return this.a.getPoints();
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

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Fillable
    public final void setFillColor(int i) {
        this.a.setFillColor(i);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Fillable
    public final int getFillColor() {
        return this.a.getFillColor();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polygon
    public final void setOptions(PolygonOptions polygonOptions) {
        this.a.setOptions(polygonOptions);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Tagable
    public final void setTag(Object obj) {
        this.a.setTag(obj);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Tagable
    public final Object getTag() {
        return this.a.getTag();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Clickable
    public final void setClickable(boolean z) {
        this.a.setClickable(z);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Clickable
    public final boolean isClickable() {
        if (this.a != null) {
            return this.a.isClickable();
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polygon
    public final boolean contains(LatLng latLng) {
        return this.a.contains(latLng);
    }

    @Override // com.tencent.mapsdk.internal.av
    public final /* bridge */ /* synthetic */ aq f_() {
        return this.a;
    }
}
