package com.tencent.map.lib.models;

import android.support.annotation.Keep;
import com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes6.dex */
public class HeatmapInfo {
    private static final float DEFAULT_MAX_OPACITY = 1.0f;
    private static final float DEFAULT_MIN_OPACITY = 0.0f;
    protected int colorMapSize;
    protected float[] colorPoints;
    protected int[] colors;
    protected int maxZoom;
    protected int minZoom;
    protected float opacity;
    protected int radius;
    protected boolean visible;
    protected int activeIndex = 0;
    protected int level = 1;
    protected int zIndex = 0;
    protected int sample = 4;
    protected float maxHeight = 1000.0f;
    protected boolean draw3D = false;
    protected boolean intensityFlag = false;
    protected float maxIntensity = 0.0f;
    protected float minIntensity = 0.0f;
    protected boolean mAnimate = false;
    protected int mAnimateDuration = 5000;
    protected WeightedLatLng[] notes = new WeightedLatLng[0];
    protected int[] nodeIndexes = new int[0];

    public void setDataList(List<Collection<WeightedLatLng>> list) {
        if (list == null) {
            this.notes = new WeightedLatLng[0];
            this.nodeIndexes = new int[0];
            return;
        }
        this.nodeIndexes = new int[list.size()];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Collection<WeightedLatLng> collection = list.get(i);
            this.nodeIndexes[i] = collection.size();
            arrayList.addAll(collection);
        }
        this.notes = (WeightedLatLng[]) arrayList.toArray(new WeightedLatLng[0]);
    }

    public void setActiveIndex(int i) {
        this.activeIndex = i;
    }

    public void setRadius(int i) {
        this.radius = i;
    }

    public void setColors(int[] iArr) {
        this.colors = iArr;
    }

    public void setColorPoints(float[] fArr) {
        this.colorPoints = fArr;
    }

    public void setVisible(boolean z) {
        this.visible = z;
    }

    public void setMinZoom(int i) {
        this.minZoom = i;
    }

    public void setMaxZoom(int i) {
        this.maxZoom = i;
    }

    public void setOpacity(float f) {
        if (f > 1.0f) {
            this.opacity = 1.0f;
        } else if (f < 0.0f) {
            this.opacity = 0.0f;
        } else {
            this.opacity = f;
        }
    }

    public void setLevel(int i) {
        if (i == 1 || i == 2) {
            this.level = i;
        }
    }

    public void setzIndex(int i) {
        this.zIndex = i;
    }

    public void setSample(int i) {
        this.sample = i;
    }

    public void setMaxHeight(float f) {
        this.maxHeight = f;
    }

    public void setDraw3D(boolean z) {
        this.draw3D = z;
    }

    public void setAnimate(boolean z) {
        this.mAnimate = z;
    }

    public void setAnimateTime(int i) {
        this.mAnimateDuration = i;
    }

    public boolean isAnimate() {
        return this.mAnimate;
    }
}
