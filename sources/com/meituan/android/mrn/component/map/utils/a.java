package com.meituan.android.mrn.component.map.utils;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PointF;
import android.location.Location;
import android.net.Uri;
import android.text.TextUtils;
import com.dianping.titans.js.JsBridgeResult;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.ao;
import com.google.gson.Gson;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.mrn.component.map.view.childview.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.resource.APKStructure;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.CameraMapGestureType;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.LatLngBounds;
import com.sankuai.meituan.mapsdk.maps.model.MapLocation;
import com.sankuai.meituan.mapsdk.maps.model.Marker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* renamed from: com.meituan.android.mrn.component.map.utils.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0279a {
        public String a = "";
        public String b = "";
        public String c = "";
    }

    public static int a(CameraMapGestureType cameraMapGestureType) {
        Object[] objArr = {cameraMapGestureType};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8b7b63e6d7f54154552fc3f2117650e9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8b7b63e6d7f54154552fc3f2117650e9")).intValue();
        }
        if (cameraMapGestureType == null || cameraMapGestureType == CameraMapGestureType.NONE) {
            return 0;
        }
        if (cameraMapGestureType == CameraMapGestureType.PAN) {
            return 1;
        }
        if (cameraMapGestureType == CameraMapGestureType.PINCH) {
            return 2;
        }
        return cameraMapGestureType == CameraMapGestureType.DOUBLE_TAP ? 3 : 0;
    }

    public static PointF a(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "42b3e2151dcfb265d94e4d54ed4c7bab", RobustBitConfig.DEFAULT_VALUE)) {
            return (PointF) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "42b3e2151dcfb265d94e4d54ed4c7bab");
        }
        if (readableMap != null && a(readableMap, Constants.GestureMoveEvent.KEY_X) && a(readableMap, Constants.GestureMoveEvent.KEY_Y)) {
            return new PointF((float) readableMap.getDouble(Constants.GestureMoveEvent.KEY_X), (float) readableMap.getDouble(Constants.GestureMoveEvent.KEY_Y));
        }
        return null;
    }

    public static WritableMap a(Location location) {
        Object[] objArr = {location};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e9d84c723d23d57f0714f54b5c96654d", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e9d84c723d23d57f0714f54b5c96654d");
        }
        WritableMap createMap = Arguments.createMap();
        if (location == null) {
            return createMap;
        }
        createMap.putDouble(DeviceInfo.TM, location.getTime());
        createMap.putDouble(Constants.PRIVACY.KEY_LATITUDE, location.getLatitude());
        createMap.putDouble(Constants.PRIVACY.KEY_LONGITUDE, location.getLongitude());
        createMap.putDouble("bearing", location.getBearing());
        createMap.putDouble(JsBridgeResult.PROPERTY_LOCATION_ALTITUDE, location.getAltitude());
        createMap.putDouble("horizontalAccuracy", location.getAccuracy());
        return createMap;
    }

    public static WritableMap a(CameraPosition cameraPosition) {
        Object[] objArr = {cameraPosition};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f11c8d64cee5ad1c6ddc1979e5779813", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f11c8d64cee5ad1c6ddc1979e5779813");
        }
        if (cameraPosition == null) {
            return null;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("center", a(cameraPosition.target));
        writableNativeMap.putDouble("zoom", cameraPosition.zoom);
        writableNativeMap.putDouble("tilt", cameraPosition.tilt);
        writableNativeMap.putDouble("bearing", cameraPosition.bearing);
        return writableNativeMap;
    }

    public static WritableMap a(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "70b3f1cd76c6b804ce6f45baa4c03042", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "70b3f1cd76c6b804ce6f45baa4c03042");
        }
        if (latLng == null) {
            return null;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putDouble(Constants.PRIVACY.KEY_LATITUDE, latLng.latitude);
        writableNativeMap.putDouble(Constants.PRIVACY.KEY_LONGITUDE, latLng.longitude);
        return writableNativeMap;
    }

    public static WritableMap a(LatLngBounds latLngBounds) {
        Object[] objArr = {latLngBounds};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7141aa65dca1fb8fb9146cd0037fe84c", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7141aa65dca1fb8fb9146cd0037fe84c");
        }
        WritableMap createMap = Arguments.createMap();
        if (latLngBounds == null) {
            return createMap;
        }
        createMap.putMap("northEast", a(latLngBounds.northeast));
        createMap.putMap("southWest", a(latLngBounds.southwest));
        return createMap;
    }

    public static WritableMap a(MapLocation mapLocation) {
        Object[] objArr = {mapLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e08eee65942e4fb9fcf0e2f10992dc1", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e08eee65942e4fb9fcf0e2f10992dc1");
        }
        WritableMap createMap = Arguments.createMap();
        if (mapLocation == null) {
            return createMap;
        }
        createMap.putDouble(Constants.PRIVACY.KEY_LATITUDE, mapLocation.getLatitude());
        createMap.putDouble(Constants.PRIVACY.KEY_LONGITUDE, mapLocation.getLongitude());
        createMap.putDouble("bearing", mapLocation.getBearing());
        createMap.putDouble(JsBridgeResult.PROPERTY_LOCATION_ALTITUDE, mapLocation.getAltitude());
        createMap.putDouble("horizontalAccuracy", mapLocation.getAccuracy());
        return createMap;
    }

    public static WritableMap a(List<Marker> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d69766020e4a58772bad6945d69ee89b", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d69766020e4a58772bad6945d69ee89b");
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (Marker marker : list) {
            writableNativeArray.pushString(marker.getId());
        }
        writableNativeMap.putArray("markerIds", (WritableArray) writableNativeArray);
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putMap(APKStructure.Res_Type, (WritableMap) writableNativeMap);
        return writableNativeMap2;
    }

    public static C0279a a(ao aoVar) {
        Activity currentActivity;
        Intent intent;
        Uri data;
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6dc7bdd81fd735c8cdc2e4e276d877fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (C0279a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6dc7bdd81fd735c8cdc2e4e276d877fa");
        }
        C0279a c0279a = new C0279a();
        if (aoVar == null) {
            return c0279a;
        }
        try {
            currentActivity = aoVar.getCurrentActivity();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (currentActivity == null || (intent = currentActivity.getIntent()) == null || (data = intent.getData()) == null) {
            return c0279a;
        }
        c0279a.a = data.getQueryParameter("mrn_biz");
        c0279a.b = data.getQueryParameter("mrn_entry");
        c0279a.c = data.getQueryParameter("ss");
        return c0279a;
    }

    public static List<String> a(ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c72baf3af7b54908327c37ff70f73c3e", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c72baf3af7b54908327c37ff70f73c3e");
        }
        if (readableArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            arrayList.add(readableArray.getString(i));
        }
        return arrayList;
    }

    public static <K, V> Map<K, V> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return (Map) (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b5e376df48078295c14f52f395919ffb", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b5e376df48078295c14f52f395919ffb") : new Gson().fromJson(str, (Class<Object>) new HashMap().getClass()));
    }

    public static boolean a(ReadableMap readableMap, String str) {
        Object[] objArr = {readableMap, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2aaae3cae2ac4dfc4345607da5d67530", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2aaae3cae2ac4dfc4345607da5d67530")).booleanValue() : (readableMap == null || TextUtils.isEmpty(str) || !readableMap.hasKey(str) || readableMap.isNull(str)) ? false : true;
    }

    public static LatLng b(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b8998adb3badf3944dff8dda0b1db07c", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLng) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b8998adb3badf3944dff8dda0b1db07c");
        }
        if (readableMap != null && a(readableMap, Constants.PRIVACY.KEY_LATITUDE) && a(readableMap, Constants.PRIVACY.KEY_LONGITUDE)) {
            return new LatLng(readableMap.getDouble(Constants.PRIVACY.KEY_LATITUDE), readableMap.getDouble(Constants.PRIVACY.KEY_LONGITUDE));
        }
        return null;
    }

    public static LatLngBounds c(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d45136ce87d8f10b37d9b9452e586bb5", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLngBounds) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d45136ce87d8f10b37d9b9452e586bb5");
        }
        if (readableMap != null && a(readableMap, "southWest") && a(readableMap, "northEast")) {
            ReadableMap map = readableMap.getMap("southWest");
            ReadableMap map2 = readableMap.getMap("northEast");
            if (map != null && map2 != null) {
                LatLng b = b(map);
                LatLng b2 = b(map2);
                if (b != null && b2 != null) {
                    return new LatLngBounds(b, b2);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0196  */
    @android.annotation.SuppressLint({"nammu_check_error"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<com.meituan.android.mrn.component.map.view.childview.l> a(android.content.Context r25, com.sankuai.meituan.mapsdk.maps.MTMap r26, com.facebook.react.bridge.ReadableArray r27) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mrn.component.map.utils.a.a(android.content.Context, com.sankuai.meituan.mapsdk.maps.MTMap, com.facebook.react.bridge.ReadableArray):java.util.List");
    }

    public static WritableMap b(List<l> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba6b4f06de938e3f080f8fc430e77388", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba6b4f06de938e3f080f8fc430e77388");
        }
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        if (list != null || list.size() > 0) {
            for (l lVar : list) {
                writableNativeArray.pushString(lVar.p);
            }
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putArray("rippleIds", (WritableArray) writableNativeArray);
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putMap(APKStructure.Res_Type, (WritableMap) writableNativeMap);
        return writableNativeMap2;
    }
}
