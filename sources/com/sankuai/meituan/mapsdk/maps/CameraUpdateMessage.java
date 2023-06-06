package com.sankuai.meituan.mapsdk.maps;

import android.graphics.Point;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.LatLngBounds;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CameraUpdateMessage {
    public static ChangeQuickRedirect changeQuickRedirect;
    public CameraPosition cameraPosition;
    public Point focus;
    public int height;
    public LatLng latLng;
    public LatLngBounds latLngBounds;
    public int paddingBottom;
    public int paddingLeft;
    public int paddingRight;
    public int paddingTop;
    public float tilt;
    public CameraUpdateType type;
    public int width;
    public float xPixel;
    public float yPixel;
    public float zoom;
    public float zoomAmount;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum CameraUpdateType {
        NONE,
        ZOOM_IN,
        ZOOM_OUT,
        ZOOM_TO,
        ZOOM_BY,
        CHANGE_TILT,
        SCROLL_BY,
        NEW_LATLNG,
        NEW_LATLNG_ZOOM,
        NEW_CAMERA_POSITION,
        NEW_CAMERA_POSITION_WITH_PADDING,
        NEW_LATLNG_BOUNDS,
        NEW_LATLNG_BOUNDS_RECT,
        NEW_LATLNG_BOUNDS_WITH_PIXEL;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        CameraUpdateType() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a56e4b1fe3340f632050024928cd79b2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a56e4b1fe3340f632050024928cd79b2");
            }
        }

        public static CameraUpdateType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0d2abf8103928a4a57b67c1f158d1524", RobustBitConfig.DEFAULT_VALUE) ? (CameraUpdateType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0d2abf8103928a4a57b67c1f158d1524") : (CameraUpdateType) Enum.valueOf(CameraUpdateType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static CameraUpdateType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "89dc63556deabb77c0803124438d453f", RobustBitConfig.DEFAULT_VALUE) ? (CameraUpdateType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "89dc63556deabb77c0803124438d453f") : (CameraUpdateType[]) values().clone();
        }
    }

    public CameraUpdateMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e599758c51f344190b09869647b84569", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e599758c51f344190b09869647b84569");
        } else {
            this.type = CameraUpdateType.NONE;
        }
    }

    public void zoomIn() {
        this.type = CameraUpdateType.ZOOM_IN;
    }

    public void zoomOut() {
        this.type = CameraUpdateType.ZOOM_OUT;
    }

    public void scrollBy(float f, float f2) {
        this.type = CameraUpdateType.SCROLL_BY;
        this.xPixel = f;
        this.yPixel = f2;
    }

    public void zoomTo(float f) {
        this.type = CameraUpdateType.ZOOM_TO;
        this.zoom = f;
    }

    public void zoomBy(float f) {
        this.type = CameraUpdateType.ZOOM_BY;
        this.zoomAmount = f;
    }

    public void zoomBy(float f, Point point) {
        this.type = CameraUpdateType.ZOOM_BY;
        this.zoomAmount = f;
        this.focus = point;
    }

    public void changeTilt(float f) {
        this.type = CameraUpdateType.CHANGE_TILT;
        this.tilt = f;
    }

    public void newCameraPosition(CameraPosition cameraPosition) {
        this.type = CameraUpdateType.NEW_CAMERA_POSITION;
        this.cameraPosition = cameraPosition;
    }

    public void newCameraPosition(CameraPosition cameraPosition, int i, int i2, int i3, int i4) {
        Object[] objArr = {cameraPosition, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3dedf30d3e08f648338fd3e2c4d196e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3dedf30d3e08f648338fd3e2c4d196e2");
            return;
        }
        this.type = CameraUpdateType.NEW_CAMERA_POSITION_WITH_PADDING;
        this.cameraPosition = cameraPosition;
        this.paddingLeft = i;
        this.paddingTop = i2;
        this.paddingRight = i3;
        this.paddingBottom = i4;
    }

    public void newLatLng(@NonNull LatLng latLng) {
        this.type = CameraUpdateType.NEW_LATLNG;
        this.latLng = latLng;
    }

    public void newLatLngZoom(@NonNull LatLng latLng, float f) {
        this.type = CameraUpdateType.NEW_LATLNG_ZOOM;
        this.latLng = latLng;
        this.zoom = f;
    }

    public void newLatLngBounds(@NonNull LatLngBounds latLngBounds, int i) {
        Object[] objArr = {latLngBounds, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eec02d5c8e3a5b943558b6c93a64673c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eec02d5c8e3a5b943558b6c93a64673c");
            return;
        }
        this.type = CameraUpdateType.NEW_LATLNG_BOUNDS;
        this.latLngBounds = latLngBounds;
        this.paddingLeft = i;
        this.paddingRight = i;
        this.paddingTop = i;
        this.paddingBottom = i;
    }

    public void newLatLngBounds(@NonNull LatLngBounds latLngBounds, int i, int i2, int i3) {
        Object[] objArr = {latLngBounds, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2a2fc1384ed736e8a9757c8f8fc7d09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2a2fc1384ed736e8a9757c8f8fc7d09");
            return;
        }
        this.type = CameraUpdateType.NEW_LATLNG_BOUNDS;
        this.latLngBounds = latLngBounds;
        this.paddingLeft = i3;
        this.paddingRight = i3;
        this.paddingTop = i3;
        this.paddingBottom = i3;
        this.width = i;
        this.height = i2;
    }

    public void newLatLngBoundsRect(@NonNull LatLngBounds latLngBounds, int i, int i2, int i3, int i4) {
        Object[] objArr = {latLngBounds, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7291ec856b8bd83901af12877bb85192", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7291ec856b8bd83901af12877bb85192");
            return;
        }
        this.type = CameraUpdateType.NEW_LATLNG_BOUNDS_RECT;
        this.latLngBounds = latLngBounds;
        this.paddingLeft = i;
        this.paddingRight = i2;
        this.paddingTop = i3;
        this.paddingBottom = i4;
    }

    public void newLatLngBoundsHorizontalVertical(@NonNull LatLngBounds latLngBounds, int i, int i2) {
        Object[] objArr = {latLngBounds, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37821117f94b1ca822e0af3b71f28122", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37821117f94b1ca822e0af3b71f28122");
            return;
        }
        this.type = CameraUpdateType.NEW_LATLNG_BOUNDS;
        this.latLngBounds = latLngBounds;
        this.paddingLeft = i;
        this.paddingRight = i;
        this.paddingTop = i2;
        this.paddingBottom = i2;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "551cd80b4050992fa5b92cef239def89", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "551cd80b4050992fa5b92cef239def89");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CameraUpdate[");
        sb.append("type:" + this.type);
        switch (this.type) {
            case ZOOM_TO:
                sb.append(",zoom:" + this.zoom);
                break;
            case ZOOM_BY:
                sb.append(",amount:" + this.zoomAmount);
                sb.append(",focus:" + this.focus);
                break;
            case SCROLL_BY:
                sb.append(",PixX:" + this.xPixel);
                sb.append(",PixY:" + this.yPixel);
                break;
            case NEW_CAMERA_POSITION:
                sb.append(",cameraPosition:" + this.cameraPosition);
                break;
            case NEW_LATLNG:
                sb.append(",latLng:" + this.latLng);
                break;
            case NEW_LATLNG_ZOOM:
                sb.append(",latLng:" + this.latLng);
                sb.append(",zoom:" + this.zoom);
                break;
            case NEW_LATLNG_BOUNDS:
            case NEW_LATLNG_BOUNDS_RECT:
                sb.append(",bounds:" + this.latLngBounds);
                sb.append(",paddingLeft:" + this.paddingLeft);
                sb.append(",paddingRight:" + this.paddingRight);
                sb.append(",paddingTop:" + this.paddingTop);
                sb.append(",paddingBottom:" + this.paddingBottom);
                break;
        }
        sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        return sb.toString();
    }
}
