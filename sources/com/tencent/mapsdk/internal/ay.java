package com.tencent.mapsdk.internal;

import android.graphics.Rect;
import com.tencent.tencentmap.mapsdk.maps.model.Animation;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.Polyline;
import com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ay extends av<ar> implements Polyline {
    @Deprecated
    public static final int a = 4;
    @Deprecated
    public static final int b = 3;
    @Deprecated
    public static final int c = 2;
    @Deprecated
    public static final int d = 1;
    @Deprecated
    public static final int e = 6;
    @Deprecated
    public static final int f = 0;
    @Deprecated
    public static final int g = 33;
    @Deprecated
    public static final int h = 19;
    public final ar i;

    public ay(ar arVar) {
        this.i = arVar;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setPolylineOptions(PolylineOptions polylineOptions) {
        if (polylineOptions == null) {
            return;
        }
        this.i.setPolylineOptions(polylineOptions);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final PolylineOptions getPolylineOptions() {
        return this.i.getPolylineOptions();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setPoints(List<LatLng> list) {
        this.i.setPoints(list);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void appendPoint(LatLng... latLngArr) {
        this.i.appendPoint(latLngArr);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void appendPoints(List<LatLng> list) {
        this.i.appendPoints(list);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void addTurnArrow(int i, int i2) {
        this.i.addTurnArrow(i, i2);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void cleanTurnArrow() {
        this.i.cleanTurnArrow();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void arrowSpacing(int i) {
        this.i.arrowSpacing(i);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final List<LatLng> getPoints() {
        return this.i.getPoints();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setWidth(float f2) {
        this.i.setWidth(f2);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final float getWidth() {
        return this.i.getWidth();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setBorderColors(int[] iArr) {
        this.i.setBorderColors(iArr);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setColor(int i) {
        this.i.setColor(i);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setColors(int[] iArr, int[] iArr2) {
        this.i.setColors(iArr, iArr2);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final int[][] getColors() {
        return this.i.getColors();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setArrow(boolean z) {
        this.i.setArrow(z);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setColorTexture(String str) {
        this.i.setColorTexture(BitmapDescriptorFactory.fromAsset(str));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setColorTexture(BitmapDescriptor bitmapDescriptor) {
        this.i.setColorTexture(bitmapDescriptor);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final int getColor() {
        return this.i.getColor();
    }

    private void a(boolean z) {
        this.i.a(z);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setAboveMaskLayer(boolean z) {
        this.i.setAboveMaskLayer(z);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final boolean isAboveMaskLayer() {
        return this.i.isAboveMaskLayer();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final List<Integer> getPattern() {
        return this.i.getPattern();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void pattern(List<Integer> list) {
        this.i.pattern(list);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void eraseTo(int i, LatLng latLng) {
        this.i.a(i, latLng);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void eraseColor(int i) {
        this.i.eraseColor(i);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setEraseable(boolean z) {
        this.i.setEraseable(z);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final Rect getVisibleRect() {
        return this.i.getVisibleRect();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Animationable
    public final void setAnimation(Animation animation) {
        this.i.setAnimation(animation);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Animationable
    public final boolean startAnimation() {
        if (this.i != null) {
            return this.i.startAnimation();
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline, com.tencent.tencentmap.mapsdk.maps.interfaces.Animationable
    public final void startAnimation(Animation animation) {
        this.i.startAnimation(animation);
    }

    private ar b() {
        return this.i;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Clickable
    public final void setClickable(boolean z) {
        this.i.setClickable(z);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Clickable
    public final boolean isClickable() {
        if (this.i != null) {
            return this.i.isClickable();
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Tagable
    public final void setTag(Object obj) {
        this.i.setTag(obj);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Tagable
    public final Object getTag() {
        return this.i.getTag();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final PolylineOptions.Text getText() {
        if (this.i == null) {
            return null;
        }
        return this.i.getText();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setText(PolylineOptions.Text text) {
        if (this.i == null) {
            return;
        }
        this.i.setText(text);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setGradientEnable(boolean z) {
        if (this.i == null) {
            return;
        }
        this.i.setGradientEnable(z);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final boolean isGradientEnable() {
        return this.i.isGradientEnable();
    }

    @Override // com.tencent.mapsdk.internal.av
    public final /* bridge */ /* synthetic */ ar f_() {
        return this.i;
    }
}
