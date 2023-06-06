package com.tencent.mapsdk.internal;

import com.tencent.map.lib.models.TrailOverlayInfo;
import com.tencent.map.sdk.utilities.visualization.trails.TrailOverlayProvider;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class nq extends TrailOverlayInfo implements mr {
    TrailOverlayProvider a;

    public nq(TrailOverlayProvider trailOverlayProvider) {
        this.a = trailOverlayProvider;
        ArrayList arrayList = new ArrayList();
        arrayList.add(trailOverlayProvider.getData());
        setDataList(arrayList);
        this.mType = trailOverlayProvider.getType();
        this.mOpacity = trailOverlayProvider.getOpacity();
        this.mVisibility = trailOverlayProvider.isVisibility();
        this.mMinZoom = trailOverlayProvider.getMinZoom();
        this.mMaxZoom = trailOverlayProvider.getMaxZoom();
        this.mWidth = trailOverlayProvider.getWidth();
        this.mZIndex = trailOverlayProvider.getZIndex();
        this.mAnimateStartTime = trailOverlayProvider.getAnimateStartTime();
        this.mAnimateEndTime = trailOverlayProvider.getAnimateEndTime();
        this.mHighLightDuration = trailOverlayProvider.getHighLightDuration();
        this.mPlayRatio = trailOverlayProvider.getPlayRatio();
        this.mDisplayLevel = trailOverlayProvider.getDisplayLevel();
        this.colorMapSize = trailOverlayProvider.getColorMapSize();
        this.colorPoints = trailOverlayProvider.getColorPoints();
        this.colors = trailOverlayProvider.getColors();
    }

    private TrailOverlayProvider a() {
        return this.a;
    }
}
