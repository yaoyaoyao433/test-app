package com.tencent.map.sdk.utilities.visualization.scatterplot;

import android.graphics.Color;
import com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng;
import com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider;
import com.tencent.smtt.sdk.TbsListener;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class DotScatterPlotOverlayProvider extends ScatterPlotOverlayProvider {
    private static final int[] DEFAULT_SCATTER_COLORS = {Color.argb(255, 255, 202, 31), Color.argb((int) TbsListener.ErrorCode.INSTALL_FROM_UNZIP, (int) TbsListener.ErrorCode.APK_INVALID, 24, 93), Color.argb(127, (int) TbsListener.ErrorCode.NEEDDOWNLOAD_9, 28, (int) TbsListener.ErrorCode.RENAME_SUCCESS)};
    private final int DEFAULT_RADIUS = 6;
    private int mRadius = 6;
    private int[] mColors = DEFAULT_SCATTER_COLORS;
    private boolean mAnimate = false;

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider
    public final /* bridge */ /* synthetic */ ScatterPlotOverlayProvider data(List list) {
        return data((List<ScatterLatLng>) list);
    }

    public DotScatterPlotOverlayProvider() {
        type(ScatterPlotOverlayProvider.ScatterPlotType.Dot);
    }

    public final int getRadius() {
        return this.mRadius;
    }

    public final DotScatterPlotOverlayProvider radius(int i) {
        if (i > 0) {
            this.mRadius = i;
        }
        return this;
    }

    public final DotScatterPlotOverlayProvider colors(int[] iArr) {
        if (iArr != null) {
            this.mColors = iArr;
        }
        return this;
    }

    public final int[] getColors() {
        return this.mColors;
    }

    public final DotScatterPlotOverlayProvider animate(boolean z) {
        this.mAnimate = z;
        return this;
    }

    public final boolean isAnimate() {
        return this.mAnimate;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider
    public final DotScatterPlotOverlayProvider data(List<ScatterLatLng> list) {
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
    public final DotScatterPlotOverlayProvider opacity(float f) {
        super.opacity(f);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider
    public final boolean isEnable3D() {
        return super.isEnable3D();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider
    public final DotScatterPlotOverlayProvider enable3D(boolean z) {
        super.enable3D(z);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider
    public final DotScatterPlotOverlayProvider zoomRange(int i, int i2) {
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
    public final DotScatterPlotOverlayProvider visibility(boolean z) {
        super.visibility(z);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider, com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final int getZIndex() {
        return super.getZIndex();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider, com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final DotScatterPlotOverlayProvider zIndex(int i) {
        super.zIndex(i);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider, com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final int getDisplayLevel() {
        return super.getDisplayLevel();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider, com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final DotScatterPlotOverlayProvider displayLevel(int i) {
        super.displayLevel(i);
        return this;
    }
}
