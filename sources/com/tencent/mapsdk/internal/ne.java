package com.tencent.mapsdk.internal;

import com.tencent.map.lib.models.HeatmapInfo;
import com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlayProvider;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ne extends HeatmapInfo implements mr {
    GradientVectorOverlayProvider a;

    public ne(GradientVectorOverlayProvider gradientVectorOverlayProvider) {
        this.a = gradientVectorOverlayProvider;
        ArrayList arrayList = new ArrayList();
        arrayList.add(gradientVectorOverlayProvider.getData());
        setDataList(arrayList);
        this.radius = gradientVectorOverlayProvider.getRadius();
        this.colors = gradientVectorOverlayProvider.getColors();
        this.colorPoints = gradientVectorOverlayProvider.getColorPoints();
        this.colorMapSize = gradientVectorOverlayProvider.getColorMapSize();
        this.visible = gradientVectorOverlayProvider.isVisibility();
        this.opacity = gradientVectorOverlayProvider.getOpacity();
        this.maxZoom = gradientVectorOverlayProvider.getMaxZoom();
        this.minZoom = gradientVectorOverlayProvider.getMinZoom();
        this.maxHeight = gradientVectorOverlayProvider.getMaxHeight();
        this.draw3D = gradientVectorOverlayProvider.isEnable3D();
        this.maxIntensity = gradientVectorOverlayProvider.getMaxIntensity();
        this.minIntensity = gradientVectorOverlayProvider.getMinIntensity();
        this.intensityFlag = gradientVectorOverlayProvider.isIntensityFlag();
        this.mAnimate = gradientVectorOverlayProvider.isAnimate();
        this.mAnimateDuration = gradientVectorOverlayProvider.getAnimateDuration();
        this.level = gradientVectorOverlayProvider.getDisplayLevel();
        this.zIndex = gradientVectorOverlayProvider.getZIndex();
        new StringBuilder("java colors : ").append(this.colors.length);
        for (int i = 0; i < this.colors.length; i++) {
            new StringBuilder("java colors: ").append(this.colors[i]);
        }
        new StringBuilder("java opacity : ").append(this.opacity);
        new StringBuilder("java colorPoints : ").append(this.colorPoints.length);
        new StringBuilder("java colorMapSize : ").append(this.colorMapSize);
        new StringBuilder("java notes : ").append(this.notes.length);
        new StringBuilder("java nodeIndexes : ").append(this.nodeIndexes.length);
    }

    private GradientVectorOverlayProvider a() {
        return this.a;
    }
}
