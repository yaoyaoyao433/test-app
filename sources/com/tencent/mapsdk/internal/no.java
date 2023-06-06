package com.tencent.mapsdk.internal;

import com.tencent.map.sdk.utilities.visualization.trails.TrailOverlay;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class no extends mp<nq> implements TrailOverlay {
    /* JADX INFO: Access modifiers changed from: package-private */
    public no(np npVar, nq nqVar) {
        super(npVar, nqVar);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay, com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlay
    public void setOpacity(float f) {
        if (((nq) this.d).a != null) {
            ((nq) this.d).a.opacity(f);
        }
        ((nq) this.d).setOpacity(f);
        a((no) this.d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay, com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlay
    public void setVisibility(boolean z) {
        if (((nq) this.d).a != null) {
            ((nq) this.d).a.visibility(z);
        }
        ((nq) this.d).setVisibility(z);
        a((no) this.d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay
    public void setZIndex(int i) {
        if (((nq) this.d).a != null) {
            ((nq) this.d).a.zIndex(i);
        }
        ((nq) this.d).setzIndex(i);
        a((no) this.d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay
    public void setLevel(int i) {
        if (((nq) this.d).a != null) {
            ((nq) this.d).a.displayLevel(i);
        }
        ((nq) this.d).setDisplayLevel(i);
        a((no) this.d);
    }
}
