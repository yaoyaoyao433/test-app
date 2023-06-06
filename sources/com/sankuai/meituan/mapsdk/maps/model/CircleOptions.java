package com.sankuai.meituan.mapsdk.maps.model;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class CircleOptions {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int a;
    private float b;
    private boolean c;
    private double d;
    private int e;
    private float f;
    private boolean g;
    private LatLng h;
    private int i;
    private boolean j;
    private float k;
    private float l;
    private List<CircleHoleOptions> m;

    public CircleOptions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "714b887d6cd4f54c90595a19e64a28a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "714b887d6cd4f54c90595a19e64a28a8");
            return;
        }
        this.a = -7829368;
        this.b = 10.0f;
        this.c = true;
        this.d = 0.0d;
        this.e = 1;
        this.f = 0.0f;
        this.g = false;
        this.h = null;
        this.i = -16711936;
        this.j = false;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new ArrayList();
    }

    public final CircleOptions circleAlpha(float f) {
        this.k = f;
        return this;
    }

    public final CircleOptions circleStrokeAlpha(float f) {
        this.l = f;
        return this;
    }

    public final float getCircleAlpha() {
        return this.k;
    }

    public final float getCircleStrokeAlpha() {
        return this.l;
    }

    public final boolean isDottedLine() {
        return this.j;
    }

    public final CircleOptions dottedLine(boolean z) {
        this.j = z;
        return this;
    }

    public final CircleOptions addHoles(CircleHoleOptions... circleHoleOptionsArr) {
        Object[] objArr = {circleHoleOptionsArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9cc7d8715968e4b9f71a81203fb161bc", RobustBitConfig.DEFAULT_VALUE)) {
            return (CircleOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9cc7d8715968e4b9f71a81203fb161bc");
        }
        if (circleHoleOptionsArr == null || circleHoleOptionsArr.length == 0) {
            return this;
        }
        this.m.addAll(Arrays.asList(circleHoleOptionsArr));
        return this;
    }

    public final CircleOptions addHoles(Iterable<CircleHoleOptions> iterable) {
        Object[] objArr = {iterable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1048a344138a3c94a8779088db75f926", RobustBitConfig.DEFAULT_VALUE)) {
            return (CircleOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1048a344138a3c94a8779088db75f926");
        }
        if (iterable == null) {
            return this;
        }
        for (CircleHoleOptions circleHoleOptions : iterable) {
            this.m.add(circleHoleOptions);
        }
        return this;
    }

    public final List<CircleHoleOptions> getHoles() {
        return this.m;
    }

    public final CircleOptions center(@NonNull LatLng latLng) {
        this.h = latLng;
        return this;
    }

    public final CircleOptions radius(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26ea1cc3ee9802780969c8ff685177c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (CircleOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26ea1cc3ee9802780969c8ff685177c6");
        }
        this.d = d;
        return this;
    }

    public final CircleOptions strokeWidth(float f) {
        this.b = f;
        return this;
    }

    public final CircleOptions strokeColor(int i) {
        this.a = i;
        return this;
    }

    public final CircleOptions fillColor(int i) {
        this.i = i;
        return this;
    }

    public final int getLevel() {
        return this.e;
    }

    @Deprecated
    public final void setLevel(int i) {
        this.e = i;
    }

    public final CircleOptions level(int i) {
        this.e = i;
        return this;
    }

    public final CircleOptions zIndex(float f) {
        this.f = f;
        return this;
    }

    public final CircleOptions mask(boolean z) {
        this.g = z;
        return this;
    }

    public final CircleOptions visible(boolean z) {
        this.c = z;
        return this;
    }

    public final LatLng getCenter() {
        return this.h;
    }

    public final double getRadius() {
        return this.d;
    }

    public final float getStrokeWidth() {
        return this.b;
    }

    public final int getStrokeColor() {
        return this.a;
    }

    public final int getFillColor() {
        return this.i;
    }

    public final float getZIndex() {
        return this.f;
    }

    public final boolean isMask() {
        return this.g;
    }

    public final boolean isVisible() {
        return this.c;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e3dcceb9cec10ad1850051247e0ffa4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e3dcceb9cec10ad1850051247e0ffa4");
        }
        return "CircleOptions{strokeColor=" + this.a + ", strokeWidth=" + this.b + ", isVisible=" + this.c + ", radius=" + this.d + ", level=" + this.e + ", zIndex=" + this.f + ", point=" + this.h + ", fillColor=" + this.i + '}';
    }
}
