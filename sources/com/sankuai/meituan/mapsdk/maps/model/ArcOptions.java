package com.sankuai.meituan.mapsdk.maps.model;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class ArcOptions {
    public static ChangeQuickRedirect changeQuickRedirect;
    private LatLng a;
    private LatLng b;
    private LatLng c;
    private float d;
    private int e;
    private float f;
    private boolean g;
    private int h;
    private float[] i;
    private int[] j;
    private LatLng k;
    private double l;
    private float m;
    private float n;

    @Deprecated
    public ArcOptions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c008d56dcb2ad9ada7395f0ef535b1b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c008d56dcb2ad9ada7395f0ef535b1b");
            return;
        }
        this.d = 10.0f;
        this.e = -16777216;
        this.f = 0.0f;
        this.g = true;
        this.h = 1;
    }

    public ArcOptions(@NonNull LatLng latLng, @NonNull LatLng latLng2, @NonNull LatLng latLng3) {
        Object[] objArr = {latLng, latLng2, latLng3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1c09e40b04abd01900f8fbf47a3bbf5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1c09e40b04abd01900f8fbf47a3bbf5");
            return;
        }
        this.d = 10.0f;
        this.e = -16777216;
        this.f = 0.0f;
        this.g = true;
        this.h = 1;
        this.a = latLng;
        this.b = latLng2;
        this.c = latLng3;
    }

    public ArcOptions(@NonNull LatLng latLng, double d, float f, float f2) {
        Object[] objArr = {latLng, Double.valueOf(d), Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "739d64311a8d8d98d7b4303600432aea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "739d64311a8d8d98d7b4303600432aea");
            return;
        }
        this.d = 10.0f;
        this.e = -16777216;
        this.f = 0.0f;
        this.g = true;
        this.h = 1;
        this.k = latLng;
        this.l = d;
        this.m = f;
        this.n = f2;
    }

    @Deprecated
    public final ArcOptions point(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        this.a = latLng;
        this.b = latLng2;
        this.c = latLng3;
        return this;
    }

    public final LatLng getCenter() {
        return this.k;
    }

    public final double getRadius() {
        return this.l;
    }

    public final float getStartAngle() {
        return this.m;
    }

    public final float getEndAngle() {
        return this.n;
    }

    public final LatLng getStartPoint() {
        return this.a;
    }

    public final LatLng getPassedPoint() {
        return this.b;
    }

    public final LatLng getEndPoint() {
        return this.c;
    }

    public final float getStrokeWidth() {
        return this.d;
    }

    public final ArcOptions strokeWidth(float f) {
        this.d = f;
        return this;
    }

    public final int getStrokeColor() {
        return this.e;
    }

    public final ArcOptions strokeColor(int i) {
        this.e = i;
        return this;
    }

    public final int getLevel() {
        return this.h;
    }

    public final ArcOptions level(int i) {
        this.h = i;
        return this;
    }

    public final float getZIndex() {
        return this.f;
    }

    public final ArcOptions zIndex(float f) {
        this.f = f;
        return this;
    }

    public final boolean isVisible() {
        return this.g;
    }

    public final ArcOptions visible(boolean z) {
        this.g = z;
        return this;
    }

    public final float[] getGradientColorPercentage() {
        return this.i;
    }

    public final int[] getGradientColors() {
        return this.j;
    }

    public final ArcOptions gradientColors(float[] fArr, int[] iArr) {
        this.i = fArr;
        this.j = iArr;
        return this;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48a9ee781a4ec713c59852ae1af65b5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48a9ee781a4ec713c59852ae1af65b5a");
        }
        return "ArcOptions{startpoint=" + this.a + ", passedpoint=" + this.b + ", endpoint=" + this.c + ", strokeWidth=" + this.d + ", strokeColor=" + this.e + ", level=" + this.h + ", zIndex=" + this.f + ", isVisible=" + this.g + '}';
    }

    @Deprecated
    public final LatLng getStartpoint() {
        return this.a;
    }

    @Deprecated
    public final LatLng getPassedpoint() {
        return this.b;
    }

    @Deprecated
    public final LatLng getEndpoint() {
        return this.c;
    }

    @Deprecated
    public final float getzIndex() {
        return this.f;
    }
}
