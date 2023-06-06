package com.sankuai.meituan.mapsdk.maps.model;

import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.interfaces.ac;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class MapViewOptions implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ac a;
    private TrafficStyle b;
    private CameraPosition c;
    private CameraPosition.Builder d;
    private Object e;
    private int f;
    private int g;
    private String h;
    private String i;
    private boolean j;
    private EngineMode k;
    private String l;
    private BasemapSourceType m;

    public MapViewOptions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19a62e01a938d0b99014ff934f4d12c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19a62e01a938d0b99014ff934f4d12c9");
            return;
        }
        this.j = false;
        this.k = EngineMode.DEFAULT;
        this.l = "";
        this.m = BasemapSourceType.VECTOR;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum BasemapSourceType {
        VECTOR(1),
        RASTER(2);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        private final int a;

        public static BasemapSourceType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e42d9a6a1fa422d085d2727b17076436", RobustBitConfig.DEFAULT_VALUE) ? (BasemapSourceType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e42d9a6a1fa422d085d2727b17076436") : (BasemapSourceType) Enum.valueOf(BasemapSourceType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static BasemapSourceType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7ca44d2f9b7381a41cfa5ae05d594516", RobustBitConfig.DEFAULT_VALUE) ? (BasemapSourceType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7ca44d2f9b7381a41cfa5ae05d594516") : (BasemapSourceType[]) values().clone();
        }

        BasemapSourceType(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7284cbf7095e8d854b93e192347a3102", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7284cbf7095e8d854b93e192347a3102");
            } else {
                this.a = i;
            }
        }

        public final int getValue() {
            return this.a;
        }
    }

    public final BasemapSourceType getBasemapSourceType() {
        return this.m;
    }

    public final void setBasemapSourceType(BasemapSourceType basemapSourceType) {
        this.m = basemapSourceType;
    }

    public final String getLocalMapStyleRes() {
        return this.i;
    }

    public final void setLocalMapStyleRes(String str) {
        this.i = str;
    }

    public final String getCustomMapStylePath() {
        return this.h;
    }

    public final void setCustomMapStylePath(String str) {
        this.h = str;
    }

    public final TrafficStyle getTrafficStyle() {
        return this.b;
    }

    public final void setTrafficStyle(TrafficStyle trafficStyle) {
        this.b = trafficStyle;
    }

    public final ac getZoomMode() {
        return this.a;
    }

    public final void setZoomMode(ac acVar) {
        this.a = acVar;
    }

    public final CameraPosition getCameraPosition() {
        return this.c;
    }

    public final void setCameraPosition(CameraPosition cameraPosition) {
        this.c = cameraPosition;
    }

    public final MapViewOptions useOverseasMap(boolean z) {
        this.j = z;
        return this;
    }

    public final boolean isOverseasMapEnabled() {
        return this.j;
    }

    public final Object getExtSurface() {
        return this.e;
    }

    public final void setExtSurface(Object obj, int i, int i2) {
        Object[] objArr = {obj, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a01f13b6041e8fab0903d79df294b8d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a01f13b6041e8fab0903d79df294b8d2");
        } else if (obj instanceof Surface) {
            this.e = obj;
            this.f = i;
            this.g = i2;
        }
    }

    public final int getSurfaceWidth() {
        return this.f;
    }

    public final int getSurfaceHeight() {
        return this.g;
    }

    public final EngineMode getEngineMode() {
        return this.k;
    }

    public final void setEngineMode(EngineMode engineMode) {
        this.k = engineMode;
    }

    public final String getReuseEngineTag() {
        return this.l;
    }

    public final void setReuseEngineTag(String str) {
        this.l = str;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be7118e396391a902e8709489a19e90b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be7118e396391a902e8709489a19e90b");
        }
        return "MapViewOptions{zoomMode=" + this.a + ", trafficStyle=" + this.b + ", mCameraPosition=" + this.c + ", mCameraPositionBuilder=" + this.d + ", overseasMapEnabled=" + this.j + '}';
    }

    @Deprecated
    public final LatLng getMapCenter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e69bfe163dc8c2c3bcad41665646185", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e69bfe163dc8c2c3bcad41665646185");
        }
        if (this.d == null) {
            return null;
        }
        return this.d.build().target;
    }

    @Deprecated
    public final void setMapCenter(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38478081becfd871b14d0e152aa52556", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38478081becfd871b14d0e152aa52556");
            return;
        }
        if (this.d == null) {
            this.d = new CameraPosition.Builder();
        }
        this.d.target(latLng);
    }

    @Deprecated
    public final int getZoomLevel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb6ba859acca0d0b45eb85099a36837a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb6ba859acca0d0b45eb85099a36837a")).intValue();
        }
        if (this.d == null) {
            return 0;
        }
        return (int) this.d.build().zoom;
    }

    @Deprecated
    public final void setZoomLevel(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff102117d0c962b1f0a8bef4afb901ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff102117d0c962b1f0a8bef4afb901ba");
            return;
        }
        if (this.d == null) {
            this.d = new CameraPosition.Builder();
        }
        this.d.zoom(i);
    }
}
