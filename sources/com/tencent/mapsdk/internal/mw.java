package com.tencent.mapsdk.internal;

import com.tencent.map.sdk.utilities.visualization.od.ArcLineOverlay;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class mw extends mp<my> implements ArcLineOverlay {
    /* JADX INFO: Access modifiers changed from: package-private */
    public mw(mx mxVar, my myVar) {
        super(mxVar, myVar);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay, com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlay
    public void setOpacity(float f) {
        if (((my) this.d).a != null) {
            ((my) this.d).a.opacity(f);
        }
        ((my) this.d).setOpacity(f);
        a((mw) this.d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay, com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlay
    public void setVisibility(boolean z) {
        if (((my) this.d).a != null) {
            ((my) this.d).a.visibility(z);
        }
        ((my) this.d).setVisibility(z);
        a((mw) this.d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay
    public void setZIndex(int i) {
        if (((my) this.d).a != null) {
            ((my) this.d).a.zIndex(i);
        }
        ((my) this.d).setzIndex(i);
        a((mw) this.d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay
    public void setLevel(int i) {
        if (((my) this.d).a != null) {
            ((my) this.d).a.displayLevel(i);
        }
        ((my) this.d).setDisplayLevel(i);
        a((mw) this.d);
    }
}
