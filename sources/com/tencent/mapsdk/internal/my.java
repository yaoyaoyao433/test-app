package com.tencent.mapsdk.internal;

import com.tencent.map.lib.models.ArcLineOverlayInfo;
import com.tencent.map.sdk.utilities.visualization.od.ArcLineOverlayProvider;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class my extends ArcLineOverlayInfo implements mr {
    ArcLineOverlayProvider a;

    public my(ArcLineOverlayProvider arcLineOverlayProvider) {
        this.a = arcLineOverlayProvider;
        ArrayList arrayList = new ArrayList();
        arrayList.add(arcLineOverlayProvider.getData());
        setDataList(arrayList);
        this.mType = 0;
        this.mOpacity = arcLineOverlayProvider.getOpacity();
        this.mVisibility = arcLineOverlayProvider.isVisibility();
        this.mMinZoom = arcLineOverlayProvider.getMinZoom();
        this.mMaxZoom = arcLineOverlayProvider.getMaxZoom();
        this.mWidth = arcLineOverlayProvider.getWidth();
        this.mZIndex = arcLineOverlayProvider.getZIndex();
        this.mDraw3D = arcLineOverlayProvider.isEnable3D();
        this.mAnimate = arcLineOverlayProvider.isAnimate();
        this.mAnimateDuration = arcLineOverlayProvider.getAnimateDuration();
        this.mHighLightDuration = arcLineOverlayProvider.getHighLightDuration();
        this.mAnimateColor = arcLineOverlayProvider.getAnimateColor();
        this.mColors = arcLineOverlayProvider.getColors();
        this.mColorPoints = arcLineOverlayProvider.getColorPoints();
        this.mColorMapSize = arcLineOverlayProvider.getColorMapSize();
        this.mDisplayLevel = arcLineOverlayProvider.getDisplayLevel();
    }

    private ArcLineOverlayProvider a() {
        return this.a;
    }
}
