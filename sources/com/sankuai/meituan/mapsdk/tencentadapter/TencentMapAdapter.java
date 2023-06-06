package com.sankuai.meituan.mapsdk.tencentadapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.AbsMTMap;
import com.sankuai.meituan.mapsdk.maps.CameraUpdateFactory;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.MapViewOptions;
import com.tencent.tencentmap.mapsdk.maps.MapRenderLayer;
import com.tencent.tencentmap.mapsdk.maps.MapView;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.TextureMapView;
import com.tencent.tencentmap.mapsdk.maps.model.TrafficStyle;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TencentMapAdapter implements com.sankuai.meituan.mapsdk.maps.interfaces.k {
    private static final int BITMAP_CACHE_SIZE = 100;
    private static final LatLng DEFAULT_CENTER = new LatLng(39.90921d, 116.397486d);
    private static final float DEFAULT_ZOOM = 10.0f;
    public static ChangeQuickRedirect changeQuickRedirect;
    private final boolean apiTracking;
    private AbsMTMap mMTMap;
    private MapView mTencentMapView;
    private com.sankuai.meituan.mapsdk.maps.interfaces.m mapView;
    private final MapViewOptions mapViewOptions;
    private final int renderType;

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.k
    public int getCacheClearState(Context context) {
        return -1;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.k
    public int getMapType() {
        return 1;
    }

    public TencentMapAdapter(int i, boolean z, MapViewOptions mapViewOptions) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), mapViewOptions};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04e8cbe382c6ebac154c2875af2433f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04e8cbe382c6ebac154c2875af2433f8");
            return;
        }
        this.renderType = i;
        this.apiTracking = z;
        this.mapViewOptions = mapViewOptions;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.k
    public View getInnerMapView(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94ec066282c03ddcc1d2890edafcad8f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94ec066282c03ddcc1d2890edafcad8f");
        }
        switch (this.renderType) {
            case 1:
                this.mTencentMapView = new TextureMapView(context, convertToTencentMapOptions(context, this.mapViewOptions));
                break;
            case 2:
                this.mTencentMapView = new MapRenderLayer(context, convertToTencentMapOptions(context, this.mapViewOptions));
                break;
            default:
                this.mTencentMapView = new MapView(context, convertToTencentMapOptions(context, this.mapViewOptions));
                break;
        }
        this.mapView = new j(this.mTencentMapView, this.mapViewOptions);
        return this.mTencentMapView;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.k
    public com.sankuai.meituan.mapsdk.maps.interfaces.m getMapView() {
        return this.mapView;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.k
    public AbsMTMap getMap() {
        CameraPosition cameraPosition;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c8357c3c102e62371f88abb0562a231", RobustBitConfig.DEFAULT_VALUE)) {
            return (AbsMTMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c8357c3c102e62371f88abb0562a231");
        }
        if (this.mMTMap == null) {
            if (this.mTencentMapView != null) {
                this.mMTMap = new i(this.mTencentMapView.getMap(), this.mapView);
            } else {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.f("mapview_fail_tx_uninitialized");
            }
            try {
                if (this.mMTMap != null) {
                    if (this.mapViewOptions != null && (cameraPosition = this.mapViewOptions.getCameraPosition()) != null) {
                        if (cameraPosition.target == null) {
                            cameraPosition = new CameraPosition(DEFAULT_CENTER, cameraPosition.zoom, cameraPosition.tilt, cameraPosition.bearing);
                        }
                        if (Math.abs(cameraPosition.zoom) < 0.001d) {
                            cameraPosition = new CameraPosition(cameraPosition.target, DEFAULT_ZOOM, cameraPosition.tilt, cameraPosition.bearing);
                        }
                        this.mMTMap.moveCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                    } else {
                        this.mMTMap.moveCamera(CameraUpdateFactory.newLatLngZoom(DEFAULT_CENTER, DEFAULT_ZOOM));
                    }
                    if (this.mapViewOptions != null && !TextUtils.isEmpty(this.mapViewOptions.getCustomMapStylePath())) {
                        this.mMTMap.setCustomMapStylePath(this.mapViewOptions.getCustomMapStylePath());
                    }
                }
            } catch (Exception unused) {
            }
        }
        return this.mMTMap;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.k
    public boolean isApiTracking() {
        return this.apiTracking;
    }

    private static TencentMapOptions convertToTencentMapOptions(Context context, MapViewOptions mapViewOptions) {
        Object[] objArr = {context, mapViewOptions};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        TrafficStyle trafficStyle = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "86e113105fec2320fa0c4c7b517e93cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (TencentMapOptions) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "86e113105fec2320fa0c4c7b517e93cc");
        }
        if (mapViewOptions == null || context == null) {
            return null;
        }
        TencentMapOptions tencentMapOptions = new TencentMapOptions();
        tencentMapOptions.setMaxIconMemoryCacheSize(100);
        try {
            String a = com.sankuai.meituan.mapsdk.mapcore.utils.g.a(com.sankuai.meituan.mapsdk.mapcore.a.c().getBytes());
            com.sankuai.meituan.mapsdk.mapcore.utils.c.f("TENCENT_ID:" + a);
            tencentMapOptions.setCustomUserID(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (mapViewOptions.getTrafficStyle() != null) {
            com.sankuai.meituan.mapsdk.maps.model.TrafficStyle trafficStyle2 = mapViewOptions.getTrafficStyle();
            Object[] objArr2 = {trafficStyle2};
            ChangeQuickRedirect changeQuickRedirect3 = b.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "2a88ccb3039803628fc1920f44567d88", RobustBitConfig.DEFAULT_VALUE)) {
                trafficStyle = (TrafficStyle) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "2a88ccb3039803628fc1920f44567d88");
            } else if (trafficStyle2 != null) {
                trafficStyle = new TrafficStyle();
                if (trafficStyle2.getCongestedColor() != null) {
                    trafficStyle.setCongestedColor(trafficStyle2.getCongestedColor().intValue());
                }
                if (trafficStyle2.getCongestedStrokeColor() != null) {
                    trafficStyle.setCongestedStrokeColor(trafficStyle2.getCongestedStrokeColor().intValue());
                }
                if (trafficStyle2.getSeriousCongestedColor() != null) {
                    trafficStyle.setSeriousCongestedColor(trafficStyle2.getSeriousCongestedColor().intValue());
                }
                if (trafficStyle2.getSeriousCongestedStrokeColor() != null) {
                    trafficStyle.setSeriousCongestedStrokeColor(trafficStyle2.getSeriousCongestedStrokeColor().intValue());
                }
                if (trafficStyle2.getSlowColor() != null) {
                    trafficStyle.setSlowColor(trafficStyle2.getSlowColor().intValue());
                }
                if (trafficStyle2.getSlowStrokeColor() != null) {
                    trafficStyle.setSlowStrokeColor(trafficStyle2.getSlowStrokeColor().intValue());
                }
                if (trafficStyle2.getSmoothColor() != null) {
                    trafficStyle.setSmoothColor(trafficStyle2.getSmoothColor().intValue());
                }
                if (trafficStyle2.getSmoothStrokeColor() != null) {
                    trafficStyle.setSmoothStrokeColor(trafficStyle2.getSmoothStrokeColor().intValue());
                }
                if (trafficStyle2.getWidth() != null) {
                    trafficStyle.setWidth(trafficStyle2.getWidth().intValue());
                }
                if (trafficStyle2.getStrokeWidth() != null) {
                    trafficStyle.setStrokeWidth(trafficStyle2.getStrokeWidth().intValue());
                }
            }
            tencentMapOptions.setTrafficStyle(trafficStyle);
        }
        if (mapViewOptions.getExtSurface() != null) {
            tencentMapOptions.setExtSurface(mapViewOptions.getExtSurface());
            tencentMapOptions.setExtSurfaceDimension(mapViewOptions.getSurfaceWidth(), mapViewOptions.getSurfaceHeight());
        }
        return tencentMapOptions;
    }
}
