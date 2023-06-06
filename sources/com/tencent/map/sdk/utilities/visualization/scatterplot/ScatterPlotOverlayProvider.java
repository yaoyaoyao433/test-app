package com.tencent.map.sdk.utilities.visualization.scatterplot;

import com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class ScatterPlotOverlayProvider extends BaseOverlayProvider {
    private List<ScatterLatLng> dataList = new ArrayList();
    private int mType = 0;
    private boolean mDraw3D = false;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public enum ScatterPlotType {
        Dot,
        Bitmap
    }

    public List<ScatterLatLng> getData() {
        return this.dataList;
    }

    public ScatterPlotOverlayProvider data(List<ScatterLatLng> list) {
        if (list != null) {
            this.dataList = list;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ScatterPlotOverlayProvider type(ScatterPlotType scatterPlotType) {
        this.mType = scatterPlotType.ordinal();
        return this;
    }

    public int getType() {
        return ScatterPlotType.values()[this.mType].ordinal();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public float getOpacity() {
        return super.getOpacity();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public ScatterPlotOverlayProvider opacity(float f) {
        super.opacity(f);
        return this;
    }

    public boolean isEnable3D() {
        return this.mDraw3D;
    }

    public ScatterPlotOverlayProvider enable3D(boolean z) {
        this.mDraw3D = z;
        return this;
    }

    public ScatterPlotOverlayProvider zoomRange(int i, int i2) {
        if (i <= i2) {
            super.minZoom(i);
            super.maxZoom(i2);
        }
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public int getMinZoom() {
        return super.getMinZoom();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public int getMaxZoom() {
        return super.getMaxZoom();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public boolean isVisibility() {
        return super.isVisibility();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public ScatterPlotOverlayProvider visibility(boolean z) {
        super.visibility(z);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public int getZIndex() {
        return super.getZIndex();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public ScatterPlotOverlayProvider zIndex(int i) {
        super.zIndex(i);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public int getDisplayLevel() {
        return super.getDisplayLevel();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public ScatterPlotOverlayProvider displayLevel(int i) {
        super.displayLevel(i);
        return this;
    }
}
