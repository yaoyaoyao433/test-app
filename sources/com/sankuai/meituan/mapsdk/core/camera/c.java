package com.sankuai.meituan.mapsdk.core.camera;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.CameraUpdateMessage;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private CameraUpdateMessage b;

    public c(CameraUpdateMessage cameraUpdateMessage) {
        Object[] objArr = {cameraUpdateMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "928b3648f2b7a199ba0b102c21baf9a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "928b3648f2b7a199ba0b102c21baf9a5");
        } else {
            this.b = cameraUpdateMessage;
        }
    }

    public final CameraPosition a(@NonNull com.sankuai.meituan.mapsdk.core.render.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47689f01f8b506d9c989f39c808ce39d", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraPosition) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47689f01f8b506d9c989f39c808ce39d");
        }
        CameraUpdateMessage.CameraUpdateType cameraUpdateType = this.b.type;
        if (cameraUpdateType != CameraUpdateMessage.CameraUpdateType.NEW_CAMERA_POSITION && cameraUpdateType != CameraUpdateMessage.CameraUpdateType.NEW_CAMERA_POSITION_WITH_PADDING) {
            if (cameraUpdateType == CameraUpdateMessage.CameraUpdateType.NEW_LATLNG || cameraUpdateType == CameraUpdateMessage.CameraUpdateType.NEW_LATLNG_ZOOM) {
                return b(aVar);
            }
            return null;
        }
        return this.b.cameraPosition;
    }

    private CameraPosition b(com.sankuai.meituan.mapsdk.core.render.a aVar) {
        float f;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ac53eb60e94a508ab50c4a293dbcd77", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraPosition) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ac53eb60e94a508ab50c4a293dbcd77");
        }
        LatLng latLng = this.b.latLng;
        if (latLng == null) {
            return null;
        }
        float f2 = this.b.zoom;
        CameraPosition h = aVar.h();
        float f3 = 0.0f;
        if (h != null) {
            if (f2 <= 0.0f) {
                f2 = h.zoom;
            }
            f3 = h.bearing;
            f = h.tilt;
        } else {
            f2 = 10.0f;
            com.sankuai.meituan.mapsdk.mapcore.utils.c.e("cameraPosition is null in changeLatLng");
            f = 0.0f;
        }
        return new CameraPosition.Builder().target(latLng).zoom(f2).bearing(f3).tilt(f).build();
    }
}
