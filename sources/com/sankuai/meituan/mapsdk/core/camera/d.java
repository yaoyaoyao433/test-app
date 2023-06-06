package com.sankuai.meituan.mapsdk.core.camera;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.CameraUpdateMessage;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private CameraUpdateMessage b;

    public d(CameraUpdateMessage cameraUpdateMessage) {
        Object[] objArr = {cameraUpdateMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41c8d11e5d88a72b5eed0e7ade534ada", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41c8d11e5d88a72b5eed0e7ade534ada");
        } else {
            this.b = cameraUpdateMessage;
        }
    }

    public final CameraPosition a(com.sankuai.meituan.mapsdk.core.render.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f4be59cdffd119adab76626e77cdaa8", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraPosition) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f4be59cdffd119adab76626e77cdaa8");
        }
        if (this.b.type == CameraUpdateMessage.CameraUpdateType.CHANGE_TILT) {
            return b(aVar);
        }
        return null;
    }

    private CameraPosition b(com.sankuai.meituan.mapsdk.core.render.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e27deae9a650ad5b1a7d9414597c942", RobustBitConfig.DEFAULT_VALUE) ? (CameraPosition) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e27deae9a650ad5b1a7d9414597c942") : new CameraPosition.Builder().bearing(Float.NaN).tilt(this.b.tilt).zoom(Float.NaN).build();
    }
}
