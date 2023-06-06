package com.sankuai.meituan.mapsdk.maps.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class HoneyCombOverlayOptions {
    public static ChangeQuickRedirect changeQuickRedirect;
    private WeightedLatLng[] a;
    private float b;
    private float c;
    private float d;
    private boolean e;
    private int[] f;
    private double[] g;
    private int h;
    private int i;
    private int j;
    private int k;
    private double l;
    private double m;
    private boolean n;

    public HoneyCombOverlayOptions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d3aabb0ec40d44d4c118d7b110155e9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d3aabb0ec40d44d4c118d7b110155e9");
            return;
        }
        this.b = 2000.0f;
        this.c = 0.0f;
        this.d = 1.0f;
        this.e = true;
        this.f = new int[]{-6702081, -10842894, -14261799, -14137206, -14734265};
        this.g = new double[]{0.0d, 0.1d, 0.15d, 0.3d, 0.5d};
        this.h = 0;
        this.i = 1;
        this.j = 2;
        this.k = 20;
        this.l = 0.0d;
        this.m = 2000.0d;
        this.n = false;
    }

    public HoneyCombOverlayOptions alpha(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fe481da42695ca19f35369e1cab3284", RobustBitConfig.DEFAULT_VALUE)) {
            return (HoneyCombOverlayOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fe481da42695ca19f35369e1cab3284");
        }
        if (f > 1.0f) {
            this.d = 1.0f;
        } else if (f < 0.0f) {
            this.d = 0.0f;
        } else {
            this.d = f;
        }
        return this;
    }

    public float getAlpha() {
        return this.d;
    }

    public HoneyCombOverlayOptions nodes(WeightedLatLng[] weightedLatLngArr) {
        if (weightedLatLngArr != null) {
            this.a = weightedLatLngArr;
        }
        return this;
    }

    public WeightedLatLng[] getNodes() {
        return this.a;
    }

    public HoneyCombOverlayOptions size(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a19f3b0a1647ae332f317f127c9a1e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (HoneyCombOverlayOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a19f3b0a1647ae332f317f127c9a1e7");
        }
        if (f < 10.0f) {
            this.b = 10.0f;
        } else {
            this.b = f;
        }
        return this;
    }

    public float getSize() {
        return this.b;
    }

    public HoneyCombOverlayOptions gap(float f) {
        if (f >= 0.0f) {
            this.c = f;
        }
        return this;
    }

    public float getGap() {
        return this.c;
    }

    public HoneyCombOverlayOptions visibility(boolean z) {
        this.e = z;
        return this;
    }

    public boolean isVisibility() {
        return this.e;
    }

    public HoneyCombOverlayOptions displayLevel(int i) {
        if (i == 1 || i == 2) {
            this.i = i;
        }
        return this;
    }

    public int getDisplayLevel() {
        return this.i;
    }

    public HoneyCombOverlayOptions zIndex(int i) {
        this.h = i;
        return this;
    }

    public int getZIndex() {
        return this.h;
    }

    public HoneyCombOverlayOptions colors(int[] iArr, double[] dArr) {
        boolean z;
        Object[] objArr = {iArr, dArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb885f307ea32df1af2e4226fe949e95", RobustBitConfig.DEFAULT_VALUE)) {
            return (HoneyCombOverlayOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb885f307ea32df1af2e4226fe949e95");
        }
        if (iArr.length > 0 && dArr.length > 0 && iArr.length == dArr.length) {
            int i = 1;
            while (true) {
                if (i >= dArr.length) {
                    z = true;
                    break;
                } else if (dArr[i - 1] > dArr[i]) {
                    z = false;
                    break;
                } else {
                    i++;
                }
            }
            if (z && dArr[0] >= 0.0d && dArr[dArr.length - 1] <= 1.0d) {
                this.f = iArr;
                this.g = dArr;
            }
        }
        return this;
    }

    public int[] getColors() {
        return this.f;
    }

    public double[] getStartPoints() {
        return this.g;
    }

    public HoneyCombOverlayOptions zoomRange(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "743599ae2da6e2eb408bc327c15ceab6", RobustBitConfig.DEFAULT_VALUE)) {
            return (HoneyCombOverlayOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "743599ae2da6e2eb408bc327c15ceab6");
        }
        if (i <= i2) {
            minZoom(i);
            maxZoom(i2);
        }
        return this;
    }

    @Deprecated
    public HoneyCombOverlayOptions minZoom(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "273106bb3530bc81d94a482c8f70e101", RobustBitConfig.DEFAULT_VALUE)) {
            return (HoneyCombOverlayOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "273106bb3530bc81d94a482c8f70e101");
        }
        if (i >= 2) {
            this.j = i;
        } else {
            this.j = 2;
        }
        return this;
    }

    @Deprecated
    public HoneyCombOverlayOptions maxZoom(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8fe891f3d2419796893d796cb35f679f", RobustBitConfig.DEFAULT_VALUE)) {
            return (HoneyCombOverlayOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8fe891f3d2419796893d796cb35f679f");
        }
        if (i <= 20) {
            this.k = i;
        } else {
            this.k = 20;
        }
        return this;
    }

    public int getMinZoom() {
        return this.j;
    }

    public int getMaxZoom() {
        return this.k;
    }

    public HoneyCombOverlayOptions setIntensityRange(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0278c3091ad4543201841a256b432e63", RobustBitConfig.DEFAULT_VALUE)) {
            return (HoneyCombOverlayOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0278c3091ad4543201841a256b432e63");
        }
        if (d < d2 && d >= 0.0d) {
            this.m = d2;
            this.l = d;
            this.n = true;
        }
        return this;
    }

    public double getMaxIntensity() {
        return this.m;
    }

    public double getMinIntensity() {
        return this.l;
    }

    public boolean getRangeFlag() {
        return this.n;
    }
}
