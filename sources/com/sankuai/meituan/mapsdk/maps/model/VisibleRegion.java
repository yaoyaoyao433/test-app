package com.sankuai.meituan.mapsdk.maps.model;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.interfaces.w;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class VisibleRegion implements w {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final w a;

    public VisibleRegion(@NonNull w wVar) {
        Object[] objArr = {wVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1f5f8950656338fd38a7d79c7053266", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1f5f8950656338fd38a7d79c7053266");
        } else {
            this.a = wVar;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.w
    public LatLngBounds getLatLngBounds() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce37ce306f9f98e22bc63c70a6bbc231", RobustBitConfig.DEFAULT_VALUE) ? (LatLngBounds) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce37ce306f9f98e22bc63c70a6bbc231") : this.a.getLatLngBounds();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.w
    public LatLng getNearLeft() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e374dd520c832141e34ac60f1118950f", RobustBitConfig.DEFAULT_VALUE) ? (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e374dd520c832141e34ac60f1118950f") : this.a.getNearLeft();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.w
    public LatLng getNearRight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "467d2de91f28410cb7612b68aa5f8dd9", RobustBitConfig.DEFAULT_VALUE) ? (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "467d2de91f28410cb7612b68aa5f8dd9") : this.a.getNearRight();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.w
    public LatLng getFarLeft() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05fe4e9b563afd70dd13c3693c18fe26", RobustBitConfig.DEFAULT_VALUE) ? (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05fe4e9b563afd70dd13c3693c18fe26") : this.a.getFarLeft();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.w
    public LatLng getFarRight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc0fd2330ece4fbb4e96a7a9b1975f93", RobustBitConfig.DEFAULT_VALUE) ? (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc0fd2330ece4fbb4e96a7a9b1975f93") : this.a.getFarRight();
    }
}
