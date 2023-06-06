package com.sankuai.meituan.mapsdk.core;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.interfaces.w;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.LatLngBounds;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class k implements w {
    public static ChangeQuickRedirect a;
    public LatLng b;
    public LatLng c;
    public LatLng d;
    public LatLng e;
    public LatLngBounds f;

    public k(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        Object[] objArr = {latLng, latLng2, latLng3, latLng4, latLngBounds};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41eb1a836ae06cbec76f3b0163031033", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41eb1a836ae06cbec76f3b0163031033");
            return;
        }
        this.b = latLng;
        this.c = latLng2;
        this.d = latLng3;
        this.e = latLng4;
        this.f = latLngBounds;
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "096d061498c0852dbba7bbc19acd672a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "096d061498c0852dbba7bbc19acd672a")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.b.equals(kVar.b) && this.c.equals(kVar.c) && this.d.equals(kVar.d) && this.e.equals(kVar.e)) {
            return this.f.equals(kVar.f);
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e79191391e3830e85ccd0a7cfda31445", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e79191391e3830e85ccd0a7cfda31445")).intValue() : (((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04ecbbf9950b45ab86ff48165ab8f0a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04ecbbf9950b45ab86ff48165ab8f0a7");
        }
        return "VisibleRegion{farLeft=" + this.b + ", farRight=" + this.c + ", nearLeft=" + this.d + ", nearRight=" + this.e + ", latLngBounds=" + this.f + '}';
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.w
    public final LatLngBounds getLatLngBounds() {
        return this.f;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.w
    public final LatLng getNearLeft() {
        return this.d;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.w
    public final LatLng getNearRight() {
        return this.e;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.w
    public final LatLng getFarLeft() {
        return this.b;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.w
    public final LatLng getFarRight() {
        return this.c;
    }
}
