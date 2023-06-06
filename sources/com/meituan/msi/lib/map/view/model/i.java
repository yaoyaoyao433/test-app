package com.meituan.msi.lib.map.view.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.GroundOverlay;
import com.sankuai.meituan.mapsdk.maps.model.LatLngBounds;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i {
    public static ChangeQuickRedirect a;
    final MTMap b;
    boolean c;
    LatLngBounds d;
    float e;
    float f;
    GroundOverlay g;
    BitmapDescriptor h;

    public i(MTMap mTMap) {
        Object[] objArr = {mTMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea69d37223f07331d22b68fdb1201cb6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea69d37223f07331d22b68fdb1201cb6");
            return;
        }
        this.c = true;
        this.e = 1.0f;
        this.f = 1.0f;
        this.b = mTMap;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c2fa2f2fe26fe1c8d00b20e62739aeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c2fa2f2fe26fe1c8d00b20e62739aeb");
        } else if (this.g != null) {
            this.g.remove();
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee8000c69163bec58567ce141041cbf7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee8000c69163bec58567ce141041cbf7");
            return;
        }
        this.c = z;
        if (this.g != null) {
            this.g.setVisible(z);
        }
    }

    public final void a(LatLngBounds latLngBounds) {
        Object[] objArr = {latLngBounds};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83184e742ee239d1df24ef1fac7c63a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83184e742ee239d1df24ef1fac7c63a3");
            return;
        }
        this.d = latLngBounds;
        if (this.g != null) {
            this.g.setPositionFromBounds(latLngBounds);
        }
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b95785c4ea753dacf413adebd48559a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b95785c4ea753dacf413adebd48559a5");
            return;
        }
        this.e = f;
        if (this.g != null) {
            this.g.setZIndex(f);
        }
    }

    public final void b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cce33ef1c6bd620ade73e594175875b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cce33ef1c6bd620ade73e594175875b");
            return;
        }
        this.f = f;
        if (this.g != null) {
            this.g.setAlpha(1.0f - f);
        }
    }
}
