package com.tencent.map.sdk.utilities.visualization.scatterplot;

import com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng;
import com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class BitmapScatterPlotOverlayProvider extends ScatterPlotOverlayProvider {
    private static final BitmapDescriptor[] DEFAULT_BITMAP_ICONS = new BitmapDescriptor[0];
    private int DEFAULT_WIDTH = 30;
    private int DEFAULT_HEIGHT = 30;
    private int mWidth = this.DEFAULT_WIDTH;
    private int mHeight = this.DEFAULT_HEIGHT;
    private BitmapDescriptor[] mBitmaps = DEFAULT_BITMAP_ICONS;

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider
    public final /* bridge */ /* synthetic */ ScatterPlotOverlayProvider data(List list) {
        return data((List<ScatterLatLng>) list);
    }

    public BitmapScatterPlotOverlayProvider() {
        type(ScatterPlotOverlayProvider.ScatterPlotType.Bitmap);
    }

    public final int getWidth() {
        return this.mWidth;
    }

    public final int getHeight() {
        return this.mHeight;
    }

    public final BitmapScatterPlotOverlayProvider scale(int i, int i2) {
        if (i > 0 && i2 > 0) {
            this.mWidth = i;
            this.mHeight = i2;
        }
        return this;
    }

    public final BitmapScatterPlotOverlayProvider bitmaps(BitmapDescriptor[] bitmapDescriptorArr) {
        if (this.mBitmaps.length <= 0 && this.mBitmaps.length == 0 && bitmapDescriptorArr != null) {
            this.mBitmaps = bitmapDescriptorArr;
        }
        return this;
    }

    public final BitmapDescriptor[] getBitmaps() {
        return this.mBitmaps;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider
    public final BitmapScatterPlotOverlayProvider data(List<ScatterLatLng> list) {
        super.data(list);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider
    public final List<ScatterLatLng> getData() {
        return super.getData();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider, com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final float getOpacity() {
        return super.getOpacity();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider, com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final BitmapScatterPlotOverlayProvider opacity(float f) {
        super.opacity(f);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider
    public final boolean isEnable3D() {
        return super.isEnable3D();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider
    public final BitmapScatterPlotOverlayProvider enable3D(boolean z) {
        super.enable3D(z);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider
    public final BitmapScatterPlotOverlayProvider zoomRange(int i, int i2) {
        super.zoomRange(i, i2);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider, com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final int getMinZoom() {
        return super.getMinZoom();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider, com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final int getMaxZoom() {
        return super.getMaxZoom();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider, com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final boolean isVisibility() {
        return super.isVisibility();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider, com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final BitmapScatterPlotOverlayProvider visibility(boolean z) {
        super.visibility(z);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider, com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final int getZIndex() {
        return super.getZIndex();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider, com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final BitmapScatterPlotOverlayProvider zIndex(int i) {
        super.zIndex(i);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider, com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final int getDisplayLevel() {
        return super.getDisplayLevel();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider, com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final BitmapScatterPlotOverlayProvider displayLevel(int i) {
        super.displayLevel(i);
        return this;
    }
}
