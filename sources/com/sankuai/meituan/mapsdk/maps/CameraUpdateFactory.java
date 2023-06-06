package com.sankuai.meituan.mapsdk.maps;

import android.graphics.Point;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.LatLngBounds;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class CameraUpdateFactory {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static CameraUpdate zoomIn() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c13bfc274eeb18cb92494f860f46ffbc", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraUpdate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c13bfc274eeb18cb92494f860f46ffbc");
        }
        CameraUpdateMessage cameraUpdateMessage = new CameraUpdateMessage();
        cameraUpdateMessage.zoomIn();
        return new CameraUpdate(cameraUpdateMessage);
    }

    public static CameraUpdate zoomOut() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9484eb74cdc674044f52eb3362a59102", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraUpdate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9484eb74cdc674044f52eb3362a59102");
        }
        CameraUpdateMessage cameraUpdateMessage = new CameraUpdateMessage();
        cameraUpdateMessage.zoomOut();
        return new CameraUpdate(cameraUpdateMessage);
    }

    public static CameraUpdate scrollBy(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "aa7668876051d6535e2483184fe794d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraUpdate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "aa7668876051d6535e2483184fe794d9");
        }
        CameraUpdateMessage cameraUpdateMessage = new CameraUpdateMessage();
        cameraUpdateMessage.scrollBy(f, f2);
        return new CameraUpdate(cameraUpdateMessage);
    }

    public static CameraUpdate zoomTo(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f292bc4f67c730c5f35a52da17ffe8f5", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraUpdate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f292bc4f67c730c5f35a52da17ffe8f5");
        }
        CameraUpdateMessage cameraUpdateMessage = new CameraUpdateMessage();
        cameraUpdateMessage.zoomTo(f);
        return new CameraUpdate(cameraUpdateMessage);
    }

    public static CameraUpdate zoomBy(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c82180089ae587d0215469fa0d7a9181", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraUpdate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c82180089ae587d0215469fa0d7a9181");
        }
        CameraUpdateMessage cameraUpdateMessage = new CameraUpdateMessage();
        cameraUpdateMessage.zoomBy(f);
        return new CameraUpdate(cameraUpdateMessage);
    }

    public static CameraUpdate zoomBy(float f, @NonNull Point point) {
        Object[] objArr = {Float.valueOf(f), point};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ccbc0f421f523880d3a96a186833152b", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraUpdate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ccbc0f421f523880d3a96a186833152b");
        }
        CameraUpdateMessage cameraUpdateMessage = new CameraUpdateMessage();
        cameraUpdateMessage.zoomBy(f, point);
        return new CameraUpdate(cameraUpdateMessage);
    }

    public static CameraUpdate changeTilt(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b1a0ede4956bf30a1467a87dd43d4377", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraUpdate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b1a0ede4956bf30a1467a87dd43d4377");
        }
        CameraUpdateMessage cameraUpdateMessage = new CameraUpdateMessage();
        cameraUpdateMessage.changeTilt(f);
        return new CameraUpdate(cameraUpdateMessage);
    }

    public static CameraUpdate newCameraPosition(@NonNull CameraPosition cameraPosition) {
        Object[] objArr = {cameraPosition};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "57a0de13f18917f8998b53758277c01d", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraUpdate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "57a0de13f18917f8998b53758277c01d");
        }
        CameraUpdateMessage cameraUpdateMessage = new CameraUpdateMessage();
        cameraUpdateMessage.newCameraPosition(cameraPosition);
        return new CameraUpdate(cameraUpdateMessage);
    }

    public static CameraUpdate newCameraPosition(@NonNull CameraPosition cameraPosition, int i, int i2, int i3, int i4) {
        Object[] objArr = {cameraPosition, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a79df8c0690d9ce2712605548a95fbf7", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraUpdate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a79df8c0690d9ce2712605548a95fbf7");
        }
        CameraUpdateMessage cameraUpdateMessage = new CameraUpdateMessage();
        cameraUpdateMessage.newCameraPosition(cameraPosition, i, i2, i3, i4);
        return new CameraUpdate(cameraUpdateMessage);
    }

    public static CameraUpdate newLatLng(@NonNull LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1294480cc81e90dca7004582f5850d0d", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraUpdate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1294480cc81e90dca7004582f5850d0d");
        }
        CameraUpdateMessage cameraUpdateMessage = new CameraUpdateMessage();
        cameraUpdateMessage.newLatLng(latLng);
        return new CameraUpdate(cameraUpdateMessage);
    }

    public static CameraUpdate newLatLngZoom(@NonNull LatLng latLng, float f) {
        Object[] objArr = {latLng, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2bdd8939f170bfc3a03f25afbc35eabb", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraUpdate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2bdd8939f170bfc3a03f25afbc35eabb");
        }
        CameraUpdateMessage cameraUpdateMessage = new CameraUpdateMessage();
        cameraUpdateMessage.newLatLngZoom(latLng, f);
        return new CameraUpdate(cameraUpdateMessage);
    }

    public static CameraUpdate newLatLngBounds(@NonNull LatLngBounds latLngBounds, int i) {
        Object[] objArr = {latLngBounds, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b8dc9796f81d1179fab0df98cd51a704", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraUpdate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b8dc9796f81d1179fab0df98cd51a704");
        }
        CameraUpdateMessage cameraUpdateMessage = new CameraUpdateMessage();
        cameraUpdateMessage.newLatLngBounds(latLngBounds, i);
        return new CameraUpdate(cameraUpdateMessage);
    }

    @Deprecated
    public static CameraUpdate newLatLngBounds(@NonNull LatLngBounds latLngBounds, int i, int i2, int i3) {
        Object[] objArr = {latLngBounds, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5a0300837c59b5e9ec9b953e1c47e535", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraUpdate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5a0300837c59b5e9ec9b953e1c47e535");
        }
        CameraUpdateMessage cameraUpdateMessage = new CameraUpdateMessage();
        cameraUpdateMessage.newLatLngBounds(latLngBounds, i, i2, i3);
        return new CameraUpdate(cameraUpdateMessage);
    }

    public static CameraUpdate newLatLngBoundsRect(@NonNull LatLngBounds latLngBounds, int i, int i2, int i3, int i4) {
        Object[] objArr = {latLngBounds, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c406f20dda02fbe1ece4c41c77d70c7a", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraUpdate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c406f20dda02fbe1ece4c41c77d70c7a");
        }
        CameraUpdateMessage cameraUpdateMessage = new CameraUpdateMessage();
        cameraUpdateMessage.newLatLngBoundsRect(latLngBounds, i, i2, i3, i4);
        return new CameraUpdate(cameraUpdateMessage);
    }

    public static CameraUpdate newLatLngBoundsHorizontalVertical(@NonNull LatLngBounds latLngBounds, int i, int i2) {
        Object[] objArr = {latLngBounds, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2df6c1cb0b37c502e27b97e7a099288e", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraUpdate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2df6c1cb0b37c502e27b97e7a099288e");
        }
        CameraUpdateMessage cameraUpdateMessage = new CameraUpdateMessage();
        cameraUpdateMessage.newLatLngBoundsHorizontalVertical(latLngBounds, i, i2);
        return new CameraUpdate(cameraUpdateMessage);
    }

    @Deprecated
    public static CameraUpdate scrollBy2(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "58a4f09133503a94f70da66fda74a318", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraUpdate) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "58a4f09133503a94f70da66fda74a318");
        }
        CameraUpdateMessage cameraUpdateMessage = new CameraUpdateMessage();
        cameraUpdateMessage.scrollBy(f, f2);
        return new CameraUpdate(cameraUpdateMessage);
    }
}
