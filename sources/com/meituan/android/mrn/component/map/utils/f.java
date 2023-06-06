package com.meituan.android.mrn.component.map.utils;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.text.TextUtils;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.Projection;
/* loaded from: classes2.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public static final LatLng b = new LatLng(40.080525d, 116.603039d);
    public static final LatLng c = new LatLng(39.908705d, 116.397459d);
    public static final LatLng d = new LatLng(39.839653d, 116.276195d);

    public static Bitmap a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8d0beb548e0de5d1b073eea43362b9ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8d0beb548e0de5d1b073eea43362b9ce");
        }
        Bitmap createBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(0);
        return createBitmap;
    }

    public static WritableMap a(MTMap mTMap, LatLng latLng) {
        Object[] objArr = {mTMap, latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f910702ac292d5fce13c3bd142838e0a", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f910702ac292d5fce13c3bd142838e0a");
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putDouble(Constants.PRIVACY.KEY_LATITUDE, latLng != null ? latLng.latitude : 0.0d);
        writableNativeMap2.putDouble(Constants.PRIVACY.KEY_LONGITUDE, latLng != null ? latLng.longitude : 0.0d);
        writableNativeMap.putMap("coordinate", (WritableMap) writableNativeMap2);
        Projection projection = mTMap.getProjection();
        if (latLng != null) {
            Point screenLocation = projection.toScreenLocation(latLng);
            WritableNativeMap writableNativeMap3 = new WritableNativeMap();
            writableNativeMap3.putDouble(Constants.GestureMoveEvent.KEY_X, screenLocation.x);
            writableNativeMap3.putDouble(Constants.GestureMoveEvent.KEY_Y, screenLocation.y);
            writableNativeMap.putMap("position", (WritableMap) writableNativeMap3);
        }
        return writableNativeMap;
    }

    public static String a(String str, com.meituan.android.mrn.component.map.b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "084890381f4bd88153d3179b21267649", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "084890381f4bd88153d3179b21267649");
        }
        if (TextUtils.isEmpty(str) && bVar != null) {
            str = bVar instanceof com.meituan.android.mrn.component.map.c ? ((com.meituan.android.mrn.component.map.c) bVar).a() : "";
        }
        return !TextUtils.isEmpty(str) ? str : "";
    }
}
