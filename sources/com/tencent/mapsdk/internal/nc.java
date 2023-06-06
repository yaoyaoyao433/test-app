package com.tencent.mapsdk.internal;

import com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlay;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class nc extends mp<ne> implements GradientVectorOverlay {
    /* JADX INFO: Access modifiers changed from: package-private */
    public nc(nd ndVar, ne neVar) {
        super(ndVar, neVar);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay, com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlay
    public void setOpacity(float f) {
        if (((ne) this.d).a != null) {
            ((ne) this.d).a.opacity(f);
        }
        ((ne) this.d).setOpacity(f);
        a((nc) this.d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay, com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlay
    public void setVisibility(boolean z) {
        if (((ne) this.d).a != null) {
            ((ne) this.d).a.visibility(z);
        }
        ((ne) this.d).setVisible(z);
        a((nc) this.d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay
    public void setZIndex(int i) {
        if (((ne) this.d).a != null) {
            ((ne) this.d).a.zIndex(i);
        }
        ((ne) this.d).setzIndex(i);
        a((nc) this.d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay
    public void setLevel(int i) {
        if (((ne) this.d).a != null) {
            ((ne) this.d).a.displayLevel(i);
        }
        ((ne) this.d).setLevel(i);
        a((nc) this.d);
    }
}
