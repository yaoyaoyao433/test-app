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
public final class e {
    public static ChangeQuickRedirect a;
    private CameraUpdateMessage b;

    public e(CameraUpdateMessage cameraUpdateMessage) {
        Object[] objArr = {cameraUpdateMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b628ceeb1cab2506d50eb900d6b12e2b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b628ceeb1cab2506d50eb900d6b12e2b");
        } else {
            this.b = cameraUpdateMessage;
        }
    }

    public final CameraPosition a(com.sankuai.meituan.mapsdk.core.render.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06967b944ecad0808595d393f73099be", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraPosition) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06967b944ecad0808595d393f73099be");
        }
        CameraUpdateMessage.CameraUpdateType cameraUpdateType = this.b.type;
        if (cameraUpdateType == CameraUpdateMessage.CameraUpdateType.ZOOM_IN) {
            return b(aVar);
        }
        if (cameraUpdateType == CameraUpdateMessage.CameraUpdateType.ZOOM_OUT) {
            return c(aVar);
        }
        if (cameraUpdateType == CameraUpdateMessage.CameraUpdateType.ZOOM_BY) {
            return d(aVar);
        }
        if (cameraUpdateType == CameraUpdateMessage.CameraUpdateType.ZOOM_TO) {
            return e(aVar);
        }
        return null;
    }

    private CameraPosition b(com.sankuai.meituan.mapsdk.core.render.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8eb06d77825631901743caf721f61daa", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraPosition) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8eb06d77825631901743caf721f61daa");
        }
        CameraPosition h = aVar.h();
        return h != null ? new CameraPosition.Builder().bearing(Float.NaN).tilt(Float.NaN).zoom(h.zoom + 1.0f).build() : h;
    }

    private CameraPosition c(com.sankuai.meituan.mapsdk.core.render.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5988555b88241bc0b1516428de88376", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraPosition) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5988555b88241bc0b1516428de88376");
        }
        CameraPosition h = aVar.h();
        return h != null ? new CameraPosition.Builder().bearing(Float.NaN).tilt(Float.NaN).zoom(h.zoom - 1.0f).build() : h;
    }

    private CameraPosition d(com.sankuai.meituan.mapsdk.core.render.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79bcfe8fab1a7d5091deaca934ddff47", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraPosition) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79bcfe8fab1a7d5091deaca934ddff47");
        }
        CameraPosition h = aVar.h();
        if (h != null) {
            Point point = this.b.focus;
            LatLng latLng = h.target;
            if (point != null) {
                latLng = aVar.getLatLngByScreenCoordinate(new PointF(point.x, point.y));
            }
            CameraPosition.Builder builder = new CameraPosition.Builder();
            if (point == null) {
                latLng = null;
            }
            return builder.target(latLng).bearing(Float.NaN).tilt(Float.NaN).zoom(h.zoom + this.b.zoomAmount).build();
        }
        return h;
    }

    private CameraPosition e(com.sankuai.meituan.mapsdk.core.render.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "162348d6fb8c020495a4ea1a95a5971e", RobustBitConfig.DEFAULT_VALUE) ? (CameraPosition) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "162348d6fb8c020495a4ea1a95a5971e") : new CameraPosition.Builder().bearing(Float.NaN).tilt(Float.NaN).zoom(this.b.zoom).build();
    }
}
