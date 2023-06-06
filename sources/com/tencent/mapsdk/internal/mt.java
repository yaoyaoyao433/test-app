package com.tencent.mapsdk.internal;

import com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.VectorHeatAggregationUnit;
import com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlay;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class mt extends mp<mu> implements AggregationOverlay, VectorHeatOverlay {
    /* JADX INFO: Access modifiers changed from: package-private */
    public mt(mv mvVar, mu muVar) {
        super(mvVar, muVar);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay, com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlay
    public void setOpacity(float f) {
        if (((mu) this.d).a != null) {
            ((mu) this.d).a.opacity(f);
        }
        ((mu) this.d).setOpacity(f);
        a((mt) this.d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay, com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlay
    public void setVisibility(boolean z) {
        if (((mu) this.d).a != null) {
            ((mu) this.d).a.visibility(z);
        }
        ((mu) this.d).setVisibility(z);
        a((mt) this.d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay
    public void setZIndex(int i) {
        if (((mu) this.d).a != null) {
            ((mu) this.d).a.zIndex(i);
        }
        ((mu) this.d).setZIndex(i);
        a((mt) this.d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay
    public void setLevel(int i) {
        if (((mu) this.d).a != null) {
            ((mu) this.d).a.displayLevel(i);
        }
        ((mu) this.d).setDisplayLevel(i);
        a((mt) this.d);
    }

    @Override // com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlay, com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlay
    public VectorHeatAggregationUnit getUnit(LatLng latLng) {
        if (this.c == null || this.b == 0) {
            return null;
        }
        return ((mv) this.c).a(this.b, latLng);
    }
}
