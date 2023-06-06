package com.sankuai.meituan.mapsdk.core.camera;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.CameraUpdateMessage;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private CameraUpdateMessage b;

    public a(CameraUpdateMessage cameraUpdateMessage) {
        Object[] objArr = {cameraUpdateMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44d4bb944e1830ba0aa2c3b349c29b2e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44d4bb944e1830ba0aa2c3b349c29b2e");
        } else {
            this.b = cameraUpdateMessage;
        }
    }

    public final CameraPosition a(com.sankuai.meituan.mapsdk.core.render.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0602c36bd1d53aba0ceb522f60fc3b35", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraPosition) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0602c36bd1d53aba0ceb522f60fc3b35");
        }
        CameraPosition cameraPosition = null;
        CameraUpdateMessage.CameraUpdateType cameraUpdateType = this.b.type;
        if (cameraUpdateType == CameraUpdateMessage.CameraUpdateType.NEW_LATLNG_BOUNDS || cameraUpdateType == CameraUpdateMessage.CameraUpdateType.NEW_LATLNG_BOUNDS_RECT) {
            cameraPosition = a(aVar, true);
        } else if (cameraUpdateType == CameraUpdateMessage.CameraUpdateType.NEW_LATLNG_BOUNDS_WITH_PIXEL) {
            cameraPosition = b(aVar);
        }
        return cameraPosition == null ? aVar.h() : cameraPosition;
    }

    private CameraPosition a(com.sankuai.meituan.mapsdk.core.render.a aVar, boolean z) {
        Object[] objArr = {aVar, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8722f194ab495acef96af86082ee3b08", RobustBitConfig.DEFAULT_VALUE) ? (CameraPosition) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8722f194ab495acef96af86082ee3b08") : aVar.cameraForLatLngBounds(this.b.latLngBounds, new int[]{this.b.paddingLeft, this.b.paddingTop, this.b.paddingRight, this.b.paddingBottom}, true);
    }

    private CameraPosition b(com.sankuai.meituan.mapsdk.core.render.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50ce2a9d9eb9e907a7bbf248e705c23a", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraPosition) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50ce2a9d9eb9e907a7bbf248e705c23a");
        }
        int i = this.b.width;
        int i2 = this.b.height;
        int b = aVar.b();
        int c = aVar.c();
        if (i <= 0 || i2 <= 0 || i >= b || i2 >= c) {
            return aVar.cameraForLatLngBounds(this.b.latLngBounds, new int[]{this.b.paddingLeft, this.b.paddingTop, this.b.paddingRight, this.b.paddingBottom}, false);
        }
        int i3 = (b - i) / 2;
        int i4 = (c - i2) / 2;
        return aVar.cameraForLatLngBounds(this.b.latLngBounds, new int[]{this.b.paddingLeft + i3, this.b.paddingTop + i4, this.b.paddingRight + i3, this.b.paddingBottom + i4}, false);
    }
}
