package com.meituan.mmp.lib.map;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.dianping.picasso.view.command.AnimationViewCommandModel;
import com.google.gson.Gson;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.mmp.lib.api.AbsApi;
import com.meituan.mmp.lib.map.i;
import com.meituan.mmp.lib.page.view.CoverViewWrapper;
import com.meituan.mmp.lib.utils.p;
import com.meituan.mmp.lib.utils.s;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.annotation.NeedDependency;
import com.meituan.mmp.main.annotation.SupportApiNames;
import com.meituan.msi.privacy.permission.a;
import com.meituan.msi.provider.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import com.sankuai.meituan.mapsdk.maps.CameraUpdateFactory;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptorFactory;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.meituan.mapsdk.maps.model.Circle;
import com.sankuai.meituan.mapsdk.maps.model.CircleOptions;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.LatLngBounds;
import com.sankuai.meituan.mapsdk.maps.model.Polygon;
import com.sankuai.meituan.mapsdk.maps.model.PolygonOptions;
import com.sankuai.meituan.mapsdk.maps.model.Polyline;
import com.sankuai.meituan.mapsdk.maps.model.PolylineOptions;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.Target;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@NeedDependency({MTMap.class})
/* loaded from: classes3.dex */
public class MapApi extends BaseMapApi {
    public static ChangeQuickRedirect i;
    private static int j;
    private static final String[] k = {"getMapCenterLocation", "includeMapPoints", "addMapLines", "addMapPolygons", "getMapScale", "getMapRegion", "addMapMarkers", "addMapCircles", "removeMapMarkers", "addMapControls", "moveToMapLocation", "translateMapMarker", "getMapRotate", "setMapCenterOffset", "setMapLocMarkerIcon"};
    @SupportApiNames
    public static final String[] API_NAMES = {"insertMap", "addMapControls", "addMapLines", "addMapPolygons", "removeMap", "addMapCircles", "updateMap", "getMapCenterLocation.getCenterLocation", "includeMapPoints.includePoints", "getMapScale.getScale", "getMapRegion.getRegion", "addMapMarkers.addMarkers", "removeMapMarkers.removeMarkers", "moveToMapLocation.moveToLocation", "translateMapMarker.translateMarker", "getMapRotate.getRotate", "setMapCenterOffset.setCenterOffset", "setMapLocMarkerIcon.setLocMarkerIcon", "map", "mapContext"};

    public static /* synthetic */ LatLng a(MapApi mapApi, e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, mapApi, changeQuickRedirect, false, "88fee799f9098f8e6c379cf9899399c1", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLng) PatchProxy.accessDispatch(objArr, mapApi, changeQuickRedirect, false, "88fee799f9098f8e6c379cf9899399c1");
        }
        Object tag = eVar.getTag();
        if (tag instanceof LatLng) {
            return (LatLng) tag;
        }
        return null;
    }

    public static /* synthetic */ void a(MapApi mapApi, final e eVar, final MTMap mTMap, final IApiCallback iApiCallback) {
        Object[] objArr = {eVar, mTMap, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, mapApi, changeQuickRedirect, false, "b6dadc42d321b0fa49c80692a6cee473", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mapApi, changeQuickRedirect, false, "b6dadc42d321b0fa49c80692a6cee473");
        } else {
            eVar.a(eVar.getToken(), "Locate.once", new a.InterfaceC0498a() { // from class: com.meituan.mmp.lib.map.MapApi.5
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.privacy.permission.a.InterfaceC0498a
                public final void onResult(String str, String[] strArr, int[] iArr, String str2) {
                    Object[] objArr2 = {str, strArr, iArr, str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2781e0595a2733b91a247ba116dd391a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2781e0595a2733b91a247ba116dd391a");
                    } else if (com.meituan.msi.privacy.permission.a.a(iArr)) {
                        MapApi.a(MapApi.this, eVar, mTMap, iApiCallback, c.a.normal);
                    } else {
                        iApiCallback.onFail(AbsApi.codeJson(-1, "LatLng is invalid"));
                    }
                }
            });
        }
    }

    public static /* synthetic */ void a(MapApi mapApi, final e eVar, final MTMap mTMap, final IApiCallback iApiCallback, c.a aVar) {
        Object[] objArr = {eVar, mTMap, iApiCallback, aVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, mapApi, changeQuickRedirect, false, "6421c24a85edd4da10287759e5448327", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mapApi, changeQuickRedirect, false, "6421c24a85edd4da10287759e5448327");
        } else {
            eVar.a(aVar, new b() { // from class: com.meituan.mmp.lib.map.MapApi.6
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.lib.map.b
                public final void a(int i2, com.meituan.msi.api.location.a aVar2, String str) {
                    Object[] objArr2 = {Integer.valueOf(i2), aVar2, str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7a8592cc74d6afb7326a4004c841bff5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7a8592cc74d6afb7326a4004c841bff5");
                    } else if (i2 != 0 || aVar2 == null) {
                        IApiCallback iApiCallback2 = iApiCallback;
                        iApiCallback2.onFail(AbsApi.codeJson(-1, "single or continuous locate failed," + str));
                    } else {
                        eVar.j.a(i2, aVar2, str);
                        mTMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(aVar2.h, aVar2.g)));
                        iApiCallback.onSuccess(null);
                    }
                }
            });
        }
    }

    public static /* synthetic */ int g() {
        int i2 = j;
        j = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int h() {
        int i2 = j - 1;
        j = i2;
        return i2;
    }

    @Override // com.meituan.mmp.lib.map.BaseMapApi, com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3b469694b6b6eaec3e2d421b33f7899", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3b469694b6b6eaec3e2d421b33f7899") : com.meituan.mmp.lib.utils.d.a(k, super.b());
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] c() {
        return API_NAMES;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.meituan.mmp.lib.map.BaseMapApi, com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, final IApiCallback iApiCallback) throws com.meituan.mmp.lib.api.d {
        char c;
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cce7f18db4de9f3b6868ee37fc5576f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cce7f18db4de9f3b6868ee37fc5576f4");
            return;
        }
        switch (str.hashCode()) {
            case -2049594684:
                if (str.equals("getMapScale")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1917749496:
                if (str.equals("translateMapMarker")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1497226311:
                if (str.equals("setMapLocMarkerIcon")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -813080892:
                if (str.equals("addMapLines")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -803602025:
                if (str.equals("includeMapPoints")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -633707311:
                if (str.equals("addMapControls")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -218936475:
                if (str.equals("moveToMapLocation")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 495022228:
                if (str.equals("addMapPolygons")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 860468410:
                if (str.equals("getMapRegion")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 870083361:
                if (str.equals("getMapRotate")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 919343144:
                if (str.equals("addMapCircles")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 975644158:
                if (str.equals("addMapMarkers")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1262748674:
                if (str.equals("setMapCenterOffset")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1293685488:
                if (str.equals("getMapCenterLocation")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1990747681:
                if (str.equals("removeMapMarkers")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                Object[] objArr2 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect2 = i;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "40c10edafb662c7c6f6ea6e5b814ca9a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "40c10edafb662c7c6f6ea6e5b814ca9a");
                    return;
                }
                e b = b(jSONObject, iApiCallback);
                if (b != null) {
                    MTMap map = b.getMap();
                    if (map == null) {
                        iApiCallback.onFail();
                        return;
                    }
                    JSONArray optJSONArray = jSONObject.optJSONArray("circles");
                    if (optJSONArray == null) {
                        iApiCallback.onFail();
                        return;
                    }
                    SparseArray<Circle> circles = b.getCircles();
                    if (circles.size() > 0) {
                        a(circles);
                    }
                    CircleOptions[] circleOptionsArr = new CircleOptions[optJSONArray.length()];
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        CircleOptions circleOptions = new CircleOptions();
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                        double optDouble = optJSONObject.optDouble(Constants.PRIVACY.KEY_LATITUDE, 0.0d);
                        double optDouble2 = optJSONObject.optDouble(Constants.PRIVACY.KEY_LONGITUDE, 0.0d);
                        if (g.a(optDouble, optDouble2)) {
                            circleOptions.center(new LatLng(optDouble, optDouble2));
                            String optString = optJSONObject.optString("color");
                            if (!TextUtils.isEmpty(optString)) {
                                circleOptions.strokeColor(com.meituan.mmp.lib.utils.i.b(optString));
                            }
                            String optString2 = optJSONObject.optString("fillColor");
                            if (!TextUtils.isEmpty(optString2)) {
                                circleOptions.fillColor(com.meituan.mmp.lib.utils.i.b(optString2));
                            }
                            circleOptions.strokeWidth(p.a(optJSONObject.optInt("strokeWidth")));
                            circleOptions.radius(optJSONObject.optDouble("radius", 0.0d));
                            circleOptionsArr[i2] = circleOptions;
                        }
                    }
                    synchronized (circles) {
                        for (int i3 = 0; i3 < circleOptionsArr.length; i3++) {
                            Circle addCircle = map.addCircle(circleOptionsArr[i3]);
                            circleOptionsArr[i3] = null;
                            circles.put(circles.size(), addCircle);
                        }
                    }
                    iApiCallback.onSuccess(null);
                    return;
                }
                return;
            case 1:
                Object[] objArr3 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect3 = i;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5b93ae124824f3816f9c2518a4c00d7b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5b93ae124824f3816f9c2518a4c00d7b");
                    return;
                }
                e b2 = b(jSONObject, iApiCallback);
                if (b2 != null) {
                    MTMap map2 = b2.getMap();
                    if (map2 == null) {
                        iApiCallback.onFail();
                        return;
                    }
                    CameraPosition cameraPosition = map2.getCameraPosition();
                    if (cameraPosition != null) {
                        LatLng latLng = cameraPosition.target;
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put(Constants.PRIVACY.KEY_LATITUDE, latLng.latitude);
                            jSONObject2.put(Constants.PRIVACY.KEY_LONGITUDE, latLng.longitude);
                        } catch (JSONException unused) {
                        }
                        iApiCallback.onSuccess(jSONObject2);
                        return;
                    }
                    iApiCallback.onFail(codeJson(-1, "cameraPosition is null"));
                    return;
                }
                return;
            case 2:
                h(jSONObject, iApiCallback);
                return;
            case 3:
                i(jSONObject, iApiCallback);
                return;
            case 4:
                e(jSONObject, iApiCallback);
                return;
            case 5:
                Object[] objArr4 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect4 = i;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "de2a8404a74ffdeb6b112cbce46a82aa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "de2a8404a74ffdeb6b112cbce46a82aa");
                    return;
                }
                e b3 = b(jSONObject, iApiCallback);
                if (b3 != null) {
                    MTMap map3 = b3.getMap();
                    if (map3 == null) {
                        iApiCallback.onFail();
                        return;
                    }
                    CameraPosition cameraPosition2 = map3.getCameraPosition();
                    if (cameraPosition2 == null) {
                        iApiCallback.onFail(codeJson(-1, "CameraPosition is null"));
                        return;
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    try {
                        jSONObject3.put("scale", (int) cameraPosition2.zoom);
                        iApiCallback.onSuccess(jSONObject3);
                        return;
                    } catch (JSONException unused2) {
                        iApiCallback.onFail();
                        return;
                    }
                }
                return;
            case 6:
                Object[] objArr5 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect5 = i;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a2c8f6b89c143ed4c196329783b013c4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a2c8f6b89c143ed4c196329783b013c4");
                    return;
                }
                e b4 = b(jSONObject, iApiCallback);
                if (b4 != null) {
                    MTMap map4 = b4.getMap();
                    if (map4 == null) {
                        iApiCallback.onFail();
                        return;
                    }
                    LatLngBounds latLngBounds = map4.getProjection().getVisibleRegion().getLatLngBounds();
                    HashMap hashMap = new HashMap();
                    hashMap.put(Constants.PRIVACY.KEY_LATITUDE, Double.valueOf(latLngBounds.southwest.latitude));
                    hashMap.put(Constants.PRIVACY.KEY_LONGITUDE, Double.valueOf(latLngBounds.southwest.longitude));
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(Constants.PRIVACY.KEY_LATITUDE, Double.valueOf(latLngBounds.northeast.latitude));
                    hashMap2.put(Constants.PRIVACY.KEY_LONGITUDE, Double.valueOf(latLngBounds.northeast.longitude));
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("southwest", hashMap);
                    hashMap3.put("northeast", hashMap2);
                    try {
                        iApiCallback.onSuccess(new JSONObject(new Gson().toJson(hashMap3)));
                        return;
                    } catch (JSONException unused3) {
                        iApiCallback.onFail();
                        return;
                    }
                }
                return;
            case 7:
                j(jSONObject, iApiCallback);
                return;
            case '\b':
                g(jSONObject, iApiCallback);
                return;
            case '\t':
                Object[] objArr6 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect6 = i;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "4bbc078b2ae05e75ba212904d90ed0b4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "4bbc078b2ae05e75ba212904d90ed0b4");
                    return;
                }
                CoverViewWrapper c2 = c(jSONObject, iApiCallback);
                if (c2 == null) {
                    iApiCallback.onFail(a("coverViewContainer is null", new Object[0]));
                    return;
                }
                final e eVar = (e) c2.b(e.class);
                if (eVar == null) {
                    iApiCallback.onFail(a("view not found!", new Object[0]));
                    return;
                }
                final MTMap map5 = eVar.getMap();
                if (map5 == null) {
                    iApiCallback.onFail();
                    return;
                }
                double optDouble3 = jSONObject.optDouble(Constants.PRIVACY.KEY_LATITUDE, 0.0d);
                double optDouble4 = jSONObject.optDouble(Constants.PRIVACY.KEY_LONGITUDE, 0.0d);
                if (optDouble3 != 0.0d || optDouble4 != 0.0d) {
                    map5.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(optDouble3, optDouble4)));
                    iApiCallback.onSuccess(null);
                    return;
                }
                a.InterfaceC0498a interfaceC0498a = new a.InterfaceC0498a() { // from class: com.meituan.mmp.lib.map.MapApi.4
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.msi.privacy.permission.a.InterfaceC0498a
                    public final void onResult(String str2, String[] strArr, int[] iArr, String str3) {
                        Object[] objArr7 = {str2, strArr, iArr, str3};
                        ChangeQuickRedirect changeQuickRedirect7 = a;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "2b5a92c05acc145956e9e2d776dbb7ee", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "2b5a92c05acc145956e9e2d776dbb7ee");
                        } else if (com.meituan.msi.privacy.permission.a.a(iArr)) {
                            LatLng a2 = MapApi.a(MapApi.this, eVar);
                            if (a2 != null) {
                                map5.moveCamera(CameraUpdateFactory.newLatLng(a2));
                                iApiCallback.onSuccess(null);
                                return;
                            }
                            MapApi.a(MapApi.this, eVar, map5, iApiCallback, c.a.instant_forground);
                        } else {
                            MapApi.a(MapApi.this, eVar, map5, iApiCallback);
                        }
                    }
                };
                if (eVar.g) {
                    eVar.a(eVar.getToken(), PermissionGuard.PERMISSION_LOCATION_CONTINUOUS, interfaceC0498a);
                    return;
                } else {
                    iApiCallback.onFail(codeJson(-1, "no latlng and show-location is false"));
                    return;
                }
            case '\n':
                f(jSONObject, iApiCallback);
                return;
            case 11:
                Object[] objArr7 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect7 = i;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "ccb459a77531f39116f7c7b96084dc19", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "ccb459a77531f39116f7c7b96084dc19");
                    return;
                }
                e b5 = b(jSONObject, iApiCallback);
                if (b5 != null) {
                    if (b5.getMap() == null) {
                        iApiCallback.onFail();
                        return;
                    } else if (jSONObject.has("markers")) {
                        a(jSONObject, (FrameLayout) b5, false);
                        iApiCallback.onSuccess(null);
                        return;
                    } else {
                        iApiCallback.onFail();
                        return;
                    }
                }
                return;
            case '\f':
                Object[] objArr8 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect8 = i;
                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "0166336fc406513cfc6e9a671c1caeb3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "0166336fc406513cfc6e9a671c1caeb3");
                    return;
                }
                e b6 = b(jSONObject, iApiCallback);
                if (b6 != null) {
                    MTMap map6 = b6.getMap();
                    if (map6 == null) {
                        iApiCallback.onFail(a("map is null", new Object[0]));
                        return;
                    }
                    CameraPosition cameraPosition3 = map6.getCameraPosition();
                    if (cameraPosition3 != null) {
                        JSONObject jSONObject4 = new JSONObject();
                        try {
                            jSONObject4.put(AnimationViewCommandModel.Rotation, cameraPosition3.bearing > 0.0f ? 360.0f - cameraPosition3.bearing : 0.0f);
                            iApiCallback.onSuccess(jSONObject4);
                            return;
                        } catch (JSONException e) {
                            iApiCallback.onFail(a(e.toString(), new Object[0]));
                            return;
                        }
                    }
                    iApiCallback.onFail(a("map CameraPosition is null", new Object[0]));
                    return;
                }
                return;
            case '\r':
                Object[] objArr9 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect9 = i;
                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "ff7d128f6720a99cb8e45181e8ff5cd5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "ff7d128f6720a99cb8e45181e8ff5cd5");
                    return;
                }
                e b7 = b(jSONObject, iApiCallback);
                if (b7 != null) {
                    if (b7.getMap() == null) {
                        iApiCallback.onFail(a("map is null", new Object[0]));
                        return;
                    }
                    Object opt = jSONObject.opt("offset");
                    if (a(opt, iApiCallback)) {
                        float[] fArr = new float[2];
                        if (a(opt, fArr, iApiCallback)) {
                            float f = fArr[0];
                            float f2 = fArr[1];
                            Object[] objArr10 = {Float.valueOf(f), Float.valueOf(f2)};
                            ChangeQuickRedirect changeQuickRedirect10 = e.a;
                            if (PatchProxy.isSupport(objArr10, b7, changeQuickRedirect10, false, "9bd6cf0577411b014e22e47e0d0cdca6", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr10, b7, changeQuickRedirect10, false, "9bd6cf0577411b014e22e47e0d0cdca6");
                            } else {
                                int width = b7.getWidth();
                                int height = b7.getHeight();
                                if (width == 0 || height == 0) {
                                    width = b7.e;
                                    height = b7.f;
                                }
                                float f3 = width * f;
                                float f4 = height * f2;
                                if (b7.d != null) {
                                    b7.d.setCameraCenterProportion(f3, f4);
                                }
                            }
                            iApiCallback.onSuccess(null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 14:
                Object[] objArr11 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect11 = i;
                if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "b282a8d2a1307909edbfd106cd545ed5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "b282a8d2a1307909edbfd106cd545ed5");
                    return;
                }
                String optString3 = jSONObject.optString("iconPath");
                if (TextUtils.isEmpty(optString3)) {
                    iApiCallback.onFail(codeJson(-1, "iconPath is null"));
                    return;
                }
                final e b8 = b(jSONObject, iApiCallback);
                if (b8 != null) {
                    final MTMap map7 = b8.getMap();
                    if (map7 == null) {
                        iApiCallback.onFail(a("map is null", new Object[0]));
                        return;
                    }
                    RequestCreator c3 = s.c(getContext(), optString3, getAppConfig());
                    if (c3 == null) {
                        iApiCallback.onFail(a("requestCreator is null", new Object[0]));
                        return;
                    }
                    int a = p.a(jSONObject.optInt("width"));
                    int a2 = p.a(jSONObject.optInt("height"));
                    if (a > 0 && a2 > 0) {
                        c3.a(a, a2);
                    }
                    c3.a(new Target() { // from class: com.meituan.mmp.lib.map.MapApi.1
                        public static ChangeQuickRedirect a;

                        @Override // com.squareup.picasso.Target
                        public final void onPrepareLoad(Drawable drawable) {
                        }

                        @Override // com.squareup.picasso.Target
                        public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                            Object[] objArr12 = {bitmap, loadedFrom};
                            ChangeQuickRedirect changeQuickRedirect12 = a;
                            if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "9491a44eaefba35c14be6cfc02ef8d90", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "9491a44eaefba35c14be6cfc02ef8d90");
                                return;
                            }
                            BitmapDescriptor fromBitmap = BitmapDescriptorFactory.fromBitmap(bitmap);
                            if (fromBitmap != null) {
                                map7.setMyLocationStyle(b8.getLocationStyle().circleShow(false).myLocationIcon(fromBitmap));
                                iApiCallback.onSuccess(null);
                                return;
                            }
                            iApiCallback.onFail(AbsApi.codeJson(-1, "icon descriptor is null"));
                        }

                        @Override // com.squareup.picasso.Target
                        public final void onBitmapFailed(Drawable drawable) {
                            Object[] objArr12 = {drawable};
                            ChangeQuickRedirect changeQuickRedirect12 = a;
                            if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "6deb7d14edbe8a6850e0f190ac444df6", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "6deb7d14edbe8a6850e0f190ac444df6");
                            } else if (iApiCallback != null) {
                                iApiCallback.onFail(AbsApi.codeJson(-1, "icon load error"));
                            }
                        }
                    });
                    return;
                }
                return;
            default:
                super.invoke(str, jSONObject, iApiCallback);
                return;
        }
    }

    private boolean a(Object obj, IApiCallback iApiCallback) {
        Object[] objArr = {obj, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e392092661171d34ad80ff4af5dd7925", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e392092661171d34ad80ff4af5dd7925")).booleanValue();
        }
        if (!(obj instanceof JSONArray)) {
            iApiCallback.onFail(a("invalid data", new Object[0]));
            return false;
        }
        JSONArray jSONArray = (JSONArray) obj;
        if (jSONArray.length() == 0) {
            iApiCallback.onSuccess(null);
            return false;
        }
        try {
            Float.parseFloat(jSONArray.optString(0));
            return true;
        } catch (NullPointerException | NumberFormatException unused) {
            iApiCallback.onFail(a("invalid data", new Object[0]));
            return false;
        }
    }

    private boolean a(Object obj, float[] fArr, IApiCallback iApiCallback) {
        float f;
        Object[] objArr = {obj, fArr, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae4fcf37d52a51898b4bc197c372775d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae4fcf37d52a51898b4bc197c372775d")).booleanValue();
        }
        if (!(obj instanceof JSONArray)) {
            iApiCallback.onFail(a("invalid data", new Object[0]));
            return false;
        }
        JSONArray jSONArray = (JSONArray) obj;
        try {
            float parseFloat = Float.parseFloat(jSONArray.optString(0));
            try {
                f = Float.parseFloat(jSONArray.optString(1));
            } catch (NullPointerException | NumberFormatException unused) {
                f = 0.5f;
            }
            if (parseFloat > 1.0f) {
                parseFloat = 1.0f;
            }
            if (parseFloat < 0.0f) {
                parseFloat = 0.0f;
            }
            if (f > 1.0f) {
                f = 1.0f;
            }
            if (f < 0.0f) {
                f = 0.0f;
            }
            fArr[0] = parseFloat;
            fArr[1] = f;
            return true;
        } catch (NullPointerException | NumberFormatException unused2) {
            iApiCallback.onFail(a("invalid data", new Object[0]));
            return false;
        }
    }

    private void e(JSONObject jSONObject, IApiCallback iApiCallback) {
        Object[] objArr = {jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31cb76e2d9dbc8ef37e551aa7d517bbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31cb76e2d9dbc8ef37e551aa7d517bbc");
            return;
        }
        d(jSONObject);
        a(jSONObject);
        CoverViewWrapper c = c(jSONObject, iApiCallback);
        if (c == null) {
            iApiCallback.onFail(a("coverViewContainer is null", new Object[0]));
            return;
        }
        e eVar = (e) c.b(e.class);
        if (eVar == null || eVar.getMap() == null) {
            iApiCallback.onFail(a("view not found!", new Object[0]));
            return;
        }
        MTMap map = eVar.getMap();
        if (jSONObject.has("polygons")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("polygons");
            PolygonOptions[] polygonOptionsArr = new PolygonOptions[optJSONArray.length()];
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("points");
                if (optJSONArray2 != null) {
                    ArrayList arrayList = new ArrayList(optJSONArray2.length());
                    for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                        JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i3);
                        double optDouble = optJSONObject2.optDouble(Constants.PRIVACY.KEY_LATITUDE, 0.0d);
                        double optDouble2 = optJSONObject2.optDouble(Constants.PRIVACY.KEY_LONGITUDE, 0.0d);
                        if (g.a(optDouble, optDouble2)) {
                            arrayList.add(new LatLng(optDouble, optDouble2));
                        }
                    }
                    int b = !TextUtils.isEmpty(optJSONObject.optString("fillColor")) ? com.meituan.mmp.lib.utils.i.b(optJSONObject.optString("fillColor", "#00000000")) : 0;
                    int b2 = !TextUtils.isEmpty(optJSONObject.optString("strokeColor")) ? com.meituan.mmp.lib.utils.i.b(optJSONObject.optString("strokeColor", DiagnoseLog.COLOR_ERROR)) : 0;
                    int optInt = optJSONObject.optInt("zIndex", 0);
                    PolygonOptions polygonOptions = new PolygonOptions();
                    polygonOptions.addAll(arrayList);
                    polygonOptions.fillColor(b);
                    polygonOptions.strokeColor(b2);
                    polygonOptions.strokeWidth(p.a((float) optJSONObject.optDouble("strokeWidth", 0.0d)));
                    polygonOptions.zIndex(optInt);
                    polygonOptionsArr[i2] = polygonOptions;
                }
            }
            SparseArray<Polygon> polygons = eVar.getPolygons();
            synchronized (polygons) {
                for (int i4 = 0; i4 < polygons.size(); i4++) {
                    Polygon polygon = polygons.get(i4);
                    if (polygon != null) {
                        polygon.remove();
                    }
                }
                polygons.clear();
                for (int i5 = 0; i5 < polygonOptionsArr.length; i5++) {
                    Polygon addPolygon = map.addPolygon(polygonOptionsArr[i5]);
                    polygonOptionsArr[i5] = null;
                    polygons.put(i5, addPolygon);
                }
            }
        }
    }

    private void a(@Nullable JSONObject jSONObject, FrameLayout frameLayout, boolean z) {
        int i2 = 0;
        Object[] objArr = {jSONObject, frameLayout, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d858f3d24880967472347c4f04306b18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d858f3d24880967472347c4f04306b18");
            return;
        }
        SparseArray<f> markers = ((e) frameLayout).getMarkers();
        synchronized (markers) {
            if (z) {
                while (i2 < markers.size()) {
                    markers.get(markers.keyAt(i2)).b();
                    i2++;
                }
                markers.clear();
            } else {
                JSONArray optJSONArray = jSONObject.optJSONArray("markers");
                if (optJSONArray != null) {
                    while (i2 < optJSONArray.length()) {
                        int optInt = optJSONArray.optInt(i2);
                        f fVar = markers.get(optInt);
                        if (fVar != null) {
                            fVar.b();
                            markers.remove(optInt);
                        }
                        i2++;
                    }
                }
            }
            if (TextUtils.equals(getAppId(), "bike_mmp")) {
                com.meituan.mmp.lib.trace.b.b("mmp-marker", "removeMarkers marker count:" + markers.size());
            }
        }
    }

    private void f(JSONObject jSONObject, IApiCallback iApiCallback) {
        f fVar;
        int i2 = 0;
        Object[] objArr = {jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcb56c77b1db4a7461aeb5aebcf26fdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcb56c77b1db4a7461aeb5aebcf26fdf");
            return;
        }
        final String d = d(jSONObject);
        final int a = a(jSONObject);
        e b = b(jSONObject, iApiCallback);
        if (b == null) {
            return;
        }
        if (b.getMap() == null) {
            iApiCallback.onFail();
        } else if (!jSONObject.has("markerId")) {
            iApiCallback.onFail();
        } else {
            final int optInt = jSONObject.optInt("markerId");
            SparseArray<f> markers = b.getMarkers();
            synchronized (markers) {
                fVar = markers.get(optInt, null);
            }
            if (fVar == null) {
                iApiCallback.onFail();
                return;
            }
            jSONObject.optBoolean("autoRotate", false);
            JSONArray optJSONArray = jSONObject.optJSONArray("keyFrames");
            if (optJSONArray != null) {
                LinkedList linkedList = new LinkedList();
                int i3 = 0;
                while (i3 < optJSONArray.length()) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i3);
                    i.a aVar = new i.a();
                    aVar.a = optJSONObject.optInt("duration", i2);
                    f fVar2 = fVar;
                    if (aVar.a == 0 || aVar.a < 0) {
                        aVar.a = i2;
                        com.meituan.mmp.lib.trace.b.e("duration is zero, err continue");
                    } else {
                        aVar.f = (float) jSONObject.optDouble(AnimationViewCommandModel.Rotation, 0.0d);
                    }
                    aVar.d = optJSONObject.optDouble(Constants.PRIVACY.KEY_LATITUDE, 0.0d);
                    aVar.e = optJSONObject.optDouble(Constants.PRIVACY.KEY_LONGITUDE, 0.0d);
                    if (g.a(aVar.d, aVar.e)) {
                        linkedList.add(aVar);
                    }
                    i3++;
                    fVar = fVar2;
                    i2 = 0;
                }
                f fVar3 = fVar;
                i.a aVar2 = new i.a();
                if (linkedList.size() != 0) {
                    aVar2 = (i.a) linkedList.get(0);
                }
                aVar2.b = fVar3.a().latitude;
                aVar2.c = fVar3.a().longitude;
                int size = linkedList.size();
                for (int i4 = 1; i4 < size; i4++) {
                    i.a aVar3 = (i.a) linkedList.get(i4 - 1);
                    i.a aVar4 = (i.a) linkedList.get(i4);
                    if (aVar3.f == 0.0f) {
                        aVar4.b = aVar3.d;
                        aVar4.c = aVar3.e;
                    } else {
                        aVar4.b = fVar3.a().latitude;
                        aVar4.c = fVar3.a().longitude;
                    }
                }
                final i iVar = new i(linkedList, fVar3.d, b);
                iVar.c.addListener(new Animator.AnimatorListener() { // from class: com.meituan.mmp.lib.map.MapApi.2
                    public static ChangeQuickRedirect a;

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        Object[] objArr2 = {animator};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "307a7cfd94bc78f08deb1d3ad4880d2d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "307a7cfd94bc78f08deb1d3ad4880d2d");
                        } else {
                            MapApi.g();
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        Object[] objArr2 = {animator};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "92c710b5620fde5d7227f70c9d9435ab", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "92c710b5620fde5d7227f70c9d9435ab");
                        } else if (MapApi.h() == 0) {
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject2.put("markerId", optInt);
                                jSONObject2.put("mapId", d);
                            } catch (JSONException unused) {
                            }
                            MapApi.this.d.a("mapMarkerTransAnimEnd", jSONObject2.toString(), a);
                        }
                    }
                });
                getActivity().runOnUiThread(new Runnable() { // from class: com.meituan.mmp.lib.map.MapApi.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "27e4a3a1188110b24e01c9c5bc005983", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "27e4a3a1188110b24e01c9c5bc005983");
                            return;
                        }
                        try {
                            iVar.c.start();
                        } catch (Exception e) {
                            com.meituan.mmp.lib.trace.b.d("translateMarker", e.toString());
                        }
                    }
                });
            } else {
                iApiCallback.onFail(codeJson(-1, "keyFrames is null"));
            }
            iApiCallback.onSuccess(null);
        }
    }

    private void g(JSONObject jSONObject, IApiCallback iApiCallback) {
        char c = 2;
        Object[] objArr = {jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0c9c91f323a8dbeb9893748e9c64ac9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0c9c91f323a8dbeb9893748e9c64ac9");
            return;
        }
        final int a = a(jSONObject);
        final String d = d(jSONObject);
        e b = b(jSONObject, iApiCallback);
        if (b == null) {
            return;
        }
        if (b.getMap() == null) {
            iApiCallback.onFail();
            return;
        }
        if (jSONObject.has("controls")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("controls");
            int i2 = 0;
            while (i2 < optJSONArray.length()) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                float[] a2 = p.a(optJSONObject);
                optJSONObject.optInt("id");
                boolean optBoolean = optJSONObject.optBoolean("clickable");
                final String optString = optJSONObject.optString("data");
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) a2[c], (int) a2[3]);
                layoutParams.setMargins((int) a2[0], (int) a2[1], 0, 0);
                ImageView imageView = new ImageView(getContext());
                RequestCreator c2 = s.c(getContext(), optJSONObject.optString("iconPath"), getAppConfig());
                if (c2 == null) {
                    iApiCallback.onFail();
                    return;
                }
                c2.d().g().a(imageView);
                b.addView(imageView, layoutParams);
                if (optBoolean) {
                    imageView.setClickable(true);
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.mmp.lib.map.MapApi.7
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            JSONObject jSONObject2;
                            JSONException e;
                            Object[] objArr2 = {view};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf39ddd361c94f4dd9ba809704ece929", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf39ddd361c94f4dd9ba809704ece929");
                                return;
                            }
                            try {
                                jSONObject2 = new JSONObject(optString);
                            } catch (JSONException e2) {
                                jSONObject2 = null;
                                e = e2;
                            }
                            try {
                                jSONObject2.put("mapId", d);
                            } catch (JSONException e3) {
                                e = e3;
                                e.printStackTrace();
                                MapApi.this.d.a("onMapControlClick", jSONObject2, a);
                            }
                            MapApi.this.d.a("onMapControlClick", jSONObject2, a);
                        }
                    });
                }
                i2++;
                c = 2;
            }
        }
        iApiCallback.onSuccess(null);
    }

    private void h(JSONObject jSONObject, IApiCallback iApiCallback) {
        MTMap map;
        int i2;
        int i3;
        int i4;
        int i5;
        Object[] objArr = {jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe80474ec3f91dd048e4d9b114bc40c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe80474ec3f91dd048e4d9b114bc40c8");
            return;
        }
        CoverViewWrapper c = c(jSONObject, iApiCallback);
        if (c == null) {
            iApiCallback.onFail(a("coverViewContainer is null", new Object[0]));
            return;
        }
        e eVar = (e) c.b(e.class);
        if (eVar == null || (map = eVar.getMap()) == null) {
            iApiCallback.onFail(a("view not found!", new Object[0]));
            return;
        }
        if (jSONObject.has("points")) {
            LatLngBounds.Builder builder = new LatLngBounds.Builder();
            JSONArray optJSONArray = jSONObject.optJSONArray("points");
            int i6 = 0;
            for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i7);
                double optDouble = optJSONObject.optDouble(Constants.PRIVACY.KEY_LATITUDE, 0.0d);
                double optDouble2 = optJSONObject.optDouble(Constants.PRIVACY.KEY_LONGITUDE, 0.0d);
                if (g.a(optDouble, optDouble2)) {
                    builder.include(new LatLng(optDouble, optDouble2));
                    i6++;
                }
            }
            if (i6 < 2) {
                iApiCallback.onFail(codeJson(-1, "legal points need more than 2"));
                return;
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("padding");
            if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
            } else {
                i5 = p.a(optJSONArray2.optInt(0));
                i4 = p.a(optJSONArray2.optInt(1));
                i3 = p.a(optJSONArray2.optInt(2));
                i2 = p.a(optJSONArray2.optInt(3));
            }
            map.animateCamera(CameraUpdateFactory.newLatLngBoundsRect(builder.build(), i2, i4, i5, i3));
        }
        iApiCallback.onSuccess(null);
    }

    private void i(JSONObject jSONObject, IApiCallback iApiCallback) {
        int i2;
        PolylineOptions.PatternItem color;
        boolean z = false;
        Object[] objArr = {jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e544fba073635c0a291859cbc81aab8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e544fba073635c0a291859cbc81aab8");
            return;
        }
        e b = b(jSONObject, iApiCallback);
        if (b == null) {
            return;
        }
        MTMap map = b.getMap();
        if (map == null) {
            iApiCallback.onFail();
            return;
        }
        if (jSONObject.has("lines")) {
            SparseArray<Polyline> polylines = b.getPolylines();
            JSONArray optJSONArray = jSONObject.optJSONArray("lines");
            PolylineOptions[] polylineOptionsArr = new PolylineOptions[optJSONArray.length()];
            int i3 = 0;
            while (i3 < optJSONArray.length()) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i3);
                PolylineOptions polylineOptions = new PolylineOptions();
                if (optJSONObject.has("points")) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("points");
                    int i4 = PolylineOptions.DEFAULT_BODY_COLOR;
                    if (!TextUtils.isEmpty(optJSONObject.optString("color"))) {
                        i4 = com.meituan.mmp.lib.utils.i.b(optJSONObject.optString("color"));
                    }
                    if (optJSONObject.optBoolean("dottedLine", z)) {
                        color = new PolylineOptions.DotColorLinePattern().color(i4);
                    } else {
                        color = new PolylineOptions.SingleColorPattern().color(i4);
                    }
                    polylineOptions.pattern(color);
                    polylineOptions.width(p.a(optJSONObject.optInt("width")));
                    for (int i5 = 0; i5 < optJSONArray2.length(); i5++) {
                        JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i5);
                        double optDouble = optJSONObject2.optDouble(Constants.PRIVACY.KEY_LATITUDE, 0.0d);
                        double optDouble2 = optJSONObject2.optDouble(Constants.PRIVACY.KEY_LONGITUDE, 0.0d);
                        if (g.a(optDouble, optDouble2)) {
                            polylineOptions.add(new LatLng(optDouble, optDouble2));
                        }
                    }
                }
                polylineOptionsArr[i3] = polylineOptions;
                i3++;
                z = false;
            }
            synchronized (polylines) {
                Object[] objArr2 = {polylines};
                ChangeQuickRedirect changeQuickRedirect2 = i;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b31fda0ce42095dea0472aa1a2cd75e1", RobustBitConfig.DEFAULT_VALUE)) {
                    i2 = 0;
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b31fda0ce42095dea0472aa1a2cd75e1");
                } else {
                    i2 = 0;
                    SparseArray<Polyline> sparseArray = polylines;
                    if (sparseArray.size() > 0) {
                        for (int i6 = 0; i6 < sparseArray.size(); i6++) {
                            Polyline polyline = sparseArray.get(i6);
                            if (polyline != null) {
                                polyline.remove();
                            }
                        }
                        sparseArray.clear();
                    }
                }
                while (i2 < polylineOptionsArr.length) {
                    Polyline addPolyline = map.addPolyline(polylineOptionsArr[i2]);
                    polylineOptionsArr[i2] = null;
                    polylines.put(i2, addPolyline);
                    i2++;
                }
            }
        }
        iApiCallback.onSuccess(null);
    }

    private void j(JSONObject jSONObject, IApiCallback iApiCallback) {
        Object[] objArr = {jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ac2f91c82998cf1000ff4e080add4ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ac2f91c82998cf1000ff4e080add4ff");
            return;
        }
        e b = b(jSONObject, iApiCallback);
        if (b == null) {
            return;
        }
        if (b.getMap() == null) {
            iApiCallback.onFail();
            return;
        }
        if (jSONObject.optBoolean(KNBConfig.CONFIG_CLEAR_CACHE, false)) {
            if (TextUtils.equals(getAppId(), "bike_mmp")) {
                com.meituan.mmp.lib.trace.b.b("mmp-marker", "addMarkerApi clear marker");
            }
            a((JSONObject) null, (FrameLayout) b, true);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("markers");
        if (optJSONArray != null) {
            SparseArray<f> markers = b.getMarkers();
            synchronized (markers) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    b.a(b, optJSONArray.optJSONObject(i2), markers, iApiCallback);
                }
            }
            if (TextUtils.equals(getAppId(), "bike_mmp")) {
                com.meituan.mmp.lib.trace.b.b("mmp-marker", "addMarkers marker count:" + markers.size());
            }
            iApiCallback.onSuccess(null);
            return;
        }
        iApiCallback.onFail(a("invalid data", new Object[0]));
    }

    private void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e601d871855ca04d30d740076991a56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e601d871855ca04d30d740076991a56");
            return;
        }
        SparseArray sparseArray = (SparseArray) obj;
        synchronized (sparseArray) {
            if (sparseArray.size() > 0) {
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    Circle circle = (Circle) sparseArray.get(i2);
                    if (circle != null) {
                        circle.remove();
                    }
                }
                sparseArray.clear();
            }
        }
    }
}
