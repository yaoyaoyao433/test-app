package com.tencent.map.lib.models;

import android.support.annotation.Keep;
import com.tencent.map.sdk.utilities.visualization.datamodels.TrailLatLng;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes6.dex */
public class TrailOverlayInfo {
    protected float[] colorPoints;
    protected int[] colors;
    protected int mType = 0;
    protected int mZIndex = 0;
    protected int activeIndex = 0;
    protected float mOpacity = 1.0f;
    protected boolean mVisibility = true;
    protected int mMinZoom = 3;
    protected int mMaxZoom = 22;
    protected int mDisplayLevel = 1;
    protected float mWidth = 4.0f;
    protected boolean mAnimate = true;
    protected int mHighLightDuration = 5000;
    protected int mAnimateStartTime = 0;
    protected int mAnimateEndTime = 2000;
    protected int mAnimateColor = -16776961;
    protected int colorMapSize = 200;
    protected float mPlayRatio = 1.0f;
    protected int mPulseInterval = 200;
    protected TrailLatLng[] notes = new TrailLatLng[0];
    protected int[] nodeIndexes = new int[0];

    public void setDataList(List<Collection<TrailLatLng>> list) {
        if (list == null || list.size() == 0) {
            this.notes = new TrailLatLng[0];
            this.nodeIndexes = new int[0];
            return;
        }
        this.nodeIndexes = new int[list.size()];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Collection<TrailLatLng> collection = list.get(i);
            this.nodeIndexes[i] = collection.size();
            arrayList.addAll(collection);
        }
        this.notes = (TrailLatLng[]) arrayList.toArray(new TrailLatLng[0]);
    }

    public void setzIndex(int i) {
        this.mZIndex = i;
    }

    public void setDisplayLevel(int i) {
        this.mDisplayLevel = i;
    }

    public void setType(int i) {
        this.mType = i;
    }

    public void setNodes(TrailLatLng[] trailLatLngArr) {
        this.notes = trailLatLngArr;
    }

    public void setOpacity(float f) {
        this.mOpacity = f;
    }

    public void setVisibility(boolean z) {
        this.mVisibility = z;
    }

    public void setActiveDataIndex(int i) {
        this.activeIndex = i;
    }

    public void setMinZoom(int i) {
        this.mMinZoom = i;
    }

    public void setMaxZoom(int i) {
        this.mMaxZoom = i;
    }

    public void setWidth(float f) {
        this.mWidth = f;
    }

    public void setAnimate(boolean z) {
        this.mAnimate = z;
    }

    public void setHighLightDuration(int i) {
        this.mHighLightDuration = i;
    }

    public void setAnimateStartTime(int i) {
        this.mAnimateStartTime = i;
    }

    public void setAnimateEndTime(int i) {
        this.mAnimateEndTime = i;
    }

    public boolean getIsAnimate() {
        return this.mAnimate;
    }

    public void setAnimateColor(int i) {
        this.mAnimateColor = i;
    }

    public int getAnimateColor() {
        return this.mAnimateColor;
    }

    public void setPlayRatio(float f) {
        this.mPlayRatio = f;
    }
}
