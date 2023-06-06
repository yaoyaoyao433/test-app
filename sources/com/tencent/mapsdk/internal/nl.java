package com.tencent.mapsdk.internal;

import com.tencent.map.sdk.utilities.visualization.scatterplot.BitmapScatterPlotOverlay;
import com.tencent.map.sdk.utilities.visualization.scatterplot.DotScatterPlotOverlay;
import com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlay;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class nl extends mp<nn> implements BitmapScatterPlotOverlay, DotScatterPlotOverlay, ScatterPlotOverlay {
    /* JADX INFO: Access modifiers changed from: package-private */
    public nl(mq mqVar, nn nnVar) {
        super(mqVar, nnVar);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay, com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlay
    public void setOpacity(float f) {
        if (((nn) this.d).a != null) {
            ((nn) this.d).a.opacity(f);
        }
        ((nn) this.d).setOpacity(f);
        a((nl) this.d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay, com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlay
    public void setVisibility(boolean z) {
        if (((nn) this.d).a != null) {
            ((nn) this.d).a.visibility(z);
        }
        ((nn) this.d).setVisible(z);
        a((nl) this.d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay
    public void setZIndex(int i) {
        if (((nn) this.d).a != null) {
            ((nn) this.d).a.zIndex(i);
        }
        ((nn) this.d).setzIndex(i);
        a((nl) this.d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay
    public void setLevel(int i) {
        if (((nn) this.d).a != null) {
            ((nn) this.d).a.displayLevel(i);
        }
        ((nn) this.d).setLevel(i);
        a((nl) this.d);
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlay
    public void setActiveDataIndex(int i) {
        ((nn) this.d).setActiveIndex(i);
        a((nl) this.d);
    }
}
