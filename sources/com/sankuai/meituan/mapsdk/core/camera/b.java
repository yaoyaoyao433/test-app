package com.sankuai.meituan.mapsdk.core.camera;

import android.graphics.Point;
import android.graphics.PointF;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.CameraUpdateMessage;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private CameraUpdateMessage b;

    public b(CameraUpdateMessage cameraUpdateMessage) {
        Object[] objArr = {cameraUpdateMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53abe49c5fa6070123aa90116ca2a691", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53abe49c5fa6070123aa90116ca2a691");
        } else {
            this.b = cameraUpdateMessage;
        }
    }

    public final CameraPosition a(com.sankuai.meituan.mapsdk.core.render.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f900ba5189605b1386ec5c5f86477da", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraPosition) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f900ba5189605b1386ec5c5f86477da");
        }
        if (this.b.type == CameraUpdateMessage.CameraUpdateType.SCROLL_BY) {
            return b(aVar);
        }
        return null;
    }

    private CameraPosition b(com.sankuai.meituan.mapsdk.core.render.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2165b2b2aab188e44e96d8113ab095ba", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraPosition) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2165b2b2aab188e44e96d8113ab095ba");
        }
        Point screenCoordinateByLatLng = aVar.getScreenCoordinateByLatLng(aVar.h().target);
        screenCoordinateByLatLng.x = (int) (screenCoordinateByLatLng.x + this.b.xPixel);
        screenCoordinateByLatLng.y = (int) (screenCoordinateByLatLng.y + this.b.yPixel);
        LatLng latLngByScreenCoordinate = aVar.getLatLngByScreenCoordinate(new PointF(screenCoordinateByLatLng.x, screenCoordinateByLatLng.y));
        if (latLngByScreenCoordinate == null) {
            latLngByScreenCoordinate = aVar.getCenter();
        }
        return new CameraPosition.Builder().target(latLngByScreenCoordinate).bearing((float) aVar.getBearing()).tilt((float) aVar.getPitch()).zoom((float) aVar.getZoom()).build();
    }
}
