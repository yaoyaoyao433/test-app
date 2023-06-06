package com.sankuai.meituan.mapsdk.maps.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WeightedLatLng {
    public static ChangeQuickRedirect changeQuickRedirect;
    private float a;
    public double intensity;
    public LatLng latLng;

    public WeightedLatLng(LatLng latLng, double d) {
        this(latLng, d, 0.0f);
        Object[] objArr = {latLng, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3345e9e03832dbad0799dbc8371cff9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3345e9e03832dbad0799dbc8371cff9");
        }
    }

    public WeightedLatLng(LatLng latLng, double d, float f) {
        Object[] objArr = {latLng, Double.valueOf(d), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "562ec5b1e34c7a50475588f4fcdd6d34", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "562ec5b1e34c7a50475588f4fcdd6d34");
        } else if (latLng == null) {
            throw new IllegalArgumentException("latLng can not null");
        } else {
            this.latLng = latLng;
            if (d >= 0.0d) {
                this.intensity = d;
            } else {
                this.intensity = 1.0d;
            }
            this.a = f;
        }
    }

    public WeightedLatLng(LatLng latLng) {
        this(latLng, 1.0d);
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3b22744b1aaba1716b0954518fae4e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3b22744b1aaba1716b0954518fae4e6");
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89c480cc3adbc34e50b9957f04f4b056", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89c480cc3adbc34e50b9957f04f4b056");
        }
        return "WeightedLatLng{intensity=" + this.intensity + ", latLng=" + this.latLng + '}';
    }

    public LatLng getLatLng() {
        return this.latLng;
    }

    public float getRadius() {
        return this.a;
    }

    public void setRadius(float f) {
        this.a = f;
    }

    public double getWeight() {
        return this.intensity;
    }

    public void setWeight(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fafe76fe66a710de2c9e3844fd2a67eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fafe76fe66a710de2c9e3844fd2a67eb");
        } else {
            this.intensity = d;
        }
    }
}
