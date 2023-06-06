package com.tencent.mapsdk.internal;

import android.graphics.Rect;
import com.tencent.map.lib.models.AccessibleTouchItem;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.MapPoi;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class oz extends AccessibleTouchItem {
    private MapPoi a;
    private so b;

    public oz(so soVar, MapPoi mapPoi) {
        this.a = mapPoi;
        this.b = soVar;
    }

    @Override // com.tencent.map.lib.models.AccessibleTouchItem
    public final Rect getBounds() {
        fm a = ((VectorMap) this.b.e_).getProjection().a(GeoPoint.from(new LatLng(this.a.getLatitude(), this.a.getLongitude())));
        return new Rect((int) (a.a - (gy.n() * 20.0f)), (int) (a.b - (gy.n() * 20.0f)), (int) (a.a + (gy.n() * 20.0f)), (int) (a.b + (gy.n() * 20.0f)));
    }

    @Override // com.tencent.map.lib.models.AccessibleTouchItem
    public final String getContentDescription() {
        return this.a.getName();
    }

    @Override // com.tencent.map.lib.models.AccessibleTouchItem
    public final void onClick() {
        TencentMap.OnMapPoiClickListener onMapPoiClickListener;
        if (this.b == null || (onMapPoiClickListener = this.b.A) == null) {
            return;
        }
        MapPoi mapPoi = new MapPoi();
        mapPoi.position = new LatLng(this.a.getLatitude(), this.a.getLongitude());
        mapPoi.name = this.a.getName();
        onMapPoiClickListener.onClicked(mapPoi);
    }
}
