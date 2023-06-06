package com.sankuai.meituan.mapsdk.tencentadapter;

import android.graphics.Point;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.meituan.mapsdk.maps.model.LatLngBounds;
import com.tencent.tencentmap.mapsdk.maps.CameraUpdate;
import com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TencentCameraUpdateFactory {
    public static ChangeQuickRedirect changeQuickRedirect;

    private static boolean nullCheck(Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "766ea0aeac1bf4c332fc6ecd755695cc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "766ea0aeac1bf4c332fc6ecd755695cc")).booleanValue();
        }
        if (objArr == null) {
            return true;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    public static CameraUpdate zoomIn() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9b7a269e780f9aef6aa395f1757ae9ab", RobustBitConfig.DEFAULT_VALUE) ? (CameraUpdate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9b7a269e780f9aef6aa395f1757ae9ab") : CameraUpdateFactory.zoomIn();
    }

    public static CameraUpdate zoomOut() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "76c8b898535c64e46e4b8dcdd0c6931c", RobustBitConfig.DEFAULT_VALUE) ? (CameraUpdate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "76c8b898535c64e46e4b8dcdd0c6931c") : CameraUpdateFactory.zoomOut();
    }

    public static CameraUpdate scrollBy(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "06e4c5dd7b8239936ce4e2e28fba7901", RobustBitConfig.DEFAULT_VALUE) ? (CameraUpdate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "06e4c5dd7b8239936ce4e2e28fba7901") : CameraUpdateFactory.scrollBy(f, f2);
    }

    public static CameraUpdate scrollBy2(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "240b0eb0a1aba9575da6e0f4d0fc8a59", RobustBitConfig.DEFAULT_VALUE) ? (CameraUpdate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "240b0eb0a1aba9575da6e0f4d0fc8a59") : CameraUpdateFactory.scrollBy(-f, -f2);
    }

    public static CameraUpdate zoomTo(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "984ff9992a52118259c16f4e8971e3ea", RobustBitConfig.DEFAULT_VALUE) ? (CameraUpdate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "984ff9992a52118259c16f4e8971e3ea") : CameraUpdateFactory.zoomTo(f);
    }

    public static CameraUpdate zoomBy(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6adcaa8cceba6cc3923aa84e4cca83ef", RobustBitConfig.DEFAULT_VALUE) ? (CameraUpdate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6adcaa8cceba6cc3923aa84e4cca83ef") : CameraUpdateFactory.zoomBy(f);
    }

    public static CameraUpdate zoomBy(float f, @NonNull Point point) {
        Object[] objArr = {Float.valueOf(f), point};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d3be2d91c62a1ea3a3cee6f0b78a5031", RobustBitConfig.DEFAULT_VALUE) ? (CameraUpdate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d3be2d91c62a1ea3a3cee6f0b78a5031") : CameraUpdateFactory.zoomBy(f, point);
    }

    public static CameraUpdate newCameraPosition(@NonNull CameraPosition cameraPosition) {
        Object[] objArr = {cameraPosition};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c4e9facc5c43e55a7d1a11bfd6e33f17", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraUpdate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c4e9facc5c43e55a7d1a11bfd6e33f17");
        }
        if (cameraPosition == null || cameraPosition.target == null) {
            return null;
        }
        Object[] objArr2 = {cameraPosition};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "4c784c16f65c83724322ad73bc297efb", RobustBitConfig.DEFAULT_VALUE)) {
            cameraPosition2 = (com.tencent.tencentmap.mapsdk.maps.model.CameraPosition) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "4c784c16f65c83724322ad73bc297efb");
        } else if (!b.a(cameraPosition)) {
            cameraPosition2 = new com.tencent.tencentmap.mapsdk.maps.model.CameraPosition(new LatLng(cameraPosition.target.latitude, cameraPosition.target.longitude), cameraPosition.zoom, cameraPosition.tilt, b.a(cameraPosition.bearing));
        }
        return CameraUpdateFactory.newCameraPosition(cameraPosition2);
    }

    public static CameraUpdate newLatLng(@NonNull com.sankuai.meituan.mapsdk.maps.model.LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8eeb8bb577f7bf072eb8b4c6c5e4b9cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraUpdate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8eeb8bb577f7bf072eb8b4c6c5e4b9cf");
        }
        if (nullCheck(latLng)) {
            return null;
        }
        return CameraUpdateFactory.newLatLng(b.a(latLng));
    }

    public static CameraUpdate newLatLngZoom(@NonNull com.sankuai.meituan.mapsdk.maps.model.LatLng latLng, float f) {
        Object[] objArr = {latLng, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "696c33c04e006a40ed41199e833d3485", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraUpdate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "696c33c04e006a40ed41199e833d3485");
        }
        if (nullCheck(latLng)) {
            return null;
        }
        return CameraUpdateFactory.newLatLngZoom(new LatLng(latLng.latitude, latLng.longitude), f);
    }

    public static CameraUpdate newLatLngBounds(@NonNull LatLngBounds latLngBounds, int i) {
        Object[] objArr = {latLngBounds, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cb326550a3cb35627f77edd88a4bd655", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraUpdate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cb326550a3cb35627f77edd88a4bd655");
        }
        if (nullCheck(latLngBounds)) {
            return null;
        }
        return CameraUpdateFactory.newLatLngBoundsRect(b.a(latLngBounds), i, i, i, i);
    }

    public static CameraUpdate newLatLngBounds(@NonNull LatLngBounds latLngBounds, int i, int i2, int i3) {
        Object[] objArr = {latLngBounds, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d96c0dab3f38e4724b7e7dda6058d90e", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraUpdate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d96c0dab3f38e4724b7e7dda6058d90e");
        }
        if (nullCheck(latLngBounds)) {
            return null;
        }
        return CameraUpdateFactory.newLatLngBounds(b.a(latLngBounds), i3);
    }

    public static CameraUpdate newLatLngBoundsRect(@NonNull LatLngBounds latLngBounds, int i, int i2, int i3, int i4) {
        Object[] objArr = {latLngBounds, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3177818e801777da4b238fdea8f8b3a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraUpdate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3177818e801777da4b238fdea8f8b3a3");
        }
        if (nullCheck(latLngBounds)) {
            return null;
        }
        return CameraUpdateFactory.newLatLngBoundsRect(b.a(latLngBounds), i, i2, i3, i4);
    }
}
