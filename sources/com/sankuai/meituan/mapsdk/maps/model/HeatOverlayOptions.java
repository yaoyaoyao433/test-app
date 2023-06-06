package com.sankuai.meituan.mapsdk.maps.model;

import android.support.v4.internal.view.SupportMenu;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class HeatOverlayOptions {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<WeightedLatLng> a;
    private List<LatLng> b;
    private int c;
    private int[] d;
    private float[] e;
    private float f;
    private HeatMapType g;
    private HeatMapMode h;
    private boolean i;
    private float j;
    private int k;
    private int l;
    private int m;

    public HeatOverlayOptions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da986b666a1393f51b3a09eac4cb050a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da986b666a1393f51b3a09eac4cb050a");
            return;
        }
        this.c = 30;
        this.d = new int[]{-16776961, -16711936, SupportMenu.CATEGORY_MASK};
        this.e = new float[]{0.3f, 0.5f, 0.8f};
        this.f = 0.6f;
        this.g = HeatMapType.Circle;
        this.h = HeatMapMode.Vector;
        this.i = true;
        this.j = 0.0f;
        this.k = 3;
        this.l = 22;
        this.m = 0;
    }

    public final int getMinZoom() {
        return this.k;
    }

    public final int getMaxZoom() {
        return this.l;
    }

    public final int getRadius() {
        return this.c;
    }

    public final List<WeightedLatLng> getWeightedData() {
        return this.a;
    }

    public final HeatOverlayOptions setWeightedData(List<WeightedLatLng> list) {
        this.a = list;
        return this;
    }

    public final HeatOverlayOptions setRadius(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b16031cf7e44929a48a9e52e55ce312", RobustBitConfig.DEFAULT_VALUE)) {
            return (HeatOverlayOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b16031cf7e44929a48a9e52e55ce312");
        }
        if (i < 18 || i > 150) {
            return this;
        }
        this.c = i;
        return this;
    }

    public final int[] getColors() {
        return this.d;
    }

    public final HeatOverlayOptions setColors(int[] iArr) {
        this.d = iArr;
        return this;
    }

    public final float[] getStartPoints() {
        return this.e;
    }

    public final HeatOverlayOptions setStartPoints(float[] fArr) {
        this.e = fArr;
        return this;
    }

    public final HeatMapType getHeatMapType() {
        return this.g;
    }

    public final void setHeatMapType(HeatMapType heatMapType) {
        this.g = heatMapType;
    }

    public final HeatMapMode getHeatMapMode() {
        return this.h;
    }

    public final void setHeatMapMode(HeatMapMode heatMapMode) {
        this.h = heatMapMode;
    }

    public final List<LatLng> getData() {
        return this.b;
    }

    public final void setData(List<LatLng> list) {
        this.b = list;
    }

    public final HeatOverlayOptions setAlpha(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9274d1677967397359a0bb681ea193fe", RobustBitConfig.DEFAULT_VALUE)) {
            return (HeatOverlayOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9274d1677967397359a0bb681ea193fe");
        }
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        this.f = f;
        return this;
    }

    public final float getAlpha() {
        return this.f;
    }

    public final HeatOverlayOptions visible(boolean z) {
        this.i = z;
        return this;
    }

    public final boolean isVisible() {
        return this.i;
    }

    public final HeatOverlayOptions zIndex(float f) {
        this.j = f;
        return this;
    }

    public final float getZIndex() {
        return this.j;
    }

    public final HeatOverlayOptions level(int i) {
        this.m = i;
        return this;
    }

    public final int getLevel() {
        return this.m;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum HeatMapType {
        Circle,
        Square;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        HeatMapType() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b84789eaee5a6b8450192f8aee647b59", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b84789eaee5a6b8450192f8aee647b59");
            }
        }

        public static HeatMapType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c3ade0cca88f77de7f0614d9927a574a", RobustBitConfig.DEFAULT_VALUE) ? (HeatMapType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c3ade0cca88f77de7f0614d9927a574a") : (HeatMapType) Enum.valueOf(HeatMapType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static HeatMapType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "13ad91f49c9d89c378c7378b1dcda23e", RobustBitConfig.DEFAULT_VALUE) ? (HeatMapType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "13ad91f49c9d89c378c7378b1dcda23e") : (HeatMapType[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum HeatMapMode {
        Vector,
        Tile;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        HeatMapMode() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dffe5f41b74a118bf7e4f0ff6d6b8d8e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dffe5f41b74a118bf7e4f0ff6d6b8d8e");
            }
        }

        public static HeatMapMode valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4fbe55187baf63720786d73a481e2a55", RobustBitConfig.DEFAULT_VALUE) ? (HeatMapMode) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4fbe55187baf63720786d73a481e2a55") : (HeatMapMode) Enum.valueOf(HeatMapMode.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static HeatMapMode[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b5c72bd5d6662eb709fbddb45a80eca7", RobustBitConfig.DEFAULT_VALUE) ? (HeatMapMode[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b5c72bd5d6662eb709fbddb45a80eca7") : (HeatMapMode[]) values().clone();
        }
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd7255e7ea909e16e2d81f833af6b335", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd7255e7ea909e16e2d81f833af6b335");
        }
        return "HeatOverlayOptions{weightedData=" + this.a + ", data=" + this.b + ", radius=" + this.c + ", colors=" + Arrays.toString(this.d) + ", startPoints=" + Arrays.toString(this.e) + ", alpha=" + this.f + ", heatMapType=" + this.g + ", heatMapMode=" + this.h + ", isVisible=" + this.i + ", zIndex=" + this.j + '}';
    }
}
