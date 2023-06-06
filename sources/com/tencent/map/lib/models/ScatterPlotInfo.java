package com.tencent.map.lib.models;

import android.graphics.Bitmap;
import android.support.annotation.Keep;
import com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes6.dex */
public class ScatterPlotInfo {
    protected double[] circleStartPoints;
    protected int[] colors;
    protected float[] colorsPoints;
    protected int mBitmapHeight;
    protected int mBitmapWidth;
    protected float maxIntensity;
    protected int maxZoom;
    protected float minIntensity;
    protected int minZoom;
    protected float opacity;
    protected int radius;
    protected boolean visible;
    protected int activeIndex = 0;
    protected int mType = 0;
    protected int level = 1;
    protected int zIndex = 0;
    protected boolean draw3D = false;
    protected int colorMapSize = 200;
    protected boolean mAnimate = false;
    protected boolean intensityFlag = false;
    protected int mMinRadius = 0;
    protected int mMaxRadius = 30;
    protected int mStrokeColor = -1;
    protected int mStrokeWidth = 4;
    protected ScatterLatLng[] notes = new ScatterLatLng[0];
    protected int[] nodeIndexes = new int[0];
    protected Bitmap[] mBitmaps = new Bitmap[0];

    public void setDataList(List<Collection<ScatterLatLng>> list) {
        if (list == null) {
            this.notes = new ScatterLatLng[0];
            this.nodeIndexes = new int[0];
            return;
        }
        this.nodeIndexes = new int[list.size()];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Collection<ScatterLatLng> collection = list.get(i);
            this.nodeIndexes[i] = collection.size();
            arrayList.addAll(collection);
        }
        this.notes = (ScatterLatLng[]) arrayList.toArray(new ScatterLatLng[0]);
    }

    public void setActiveIndex(int i) {
        this.activeIndex = i;
    }

    public void setRadius(int i) {
        this.radius = i;
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
        this.opacity = f;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public void setzIndex(int i) {
        this.zIndex = i;
    }

    public void setDraw3D(boolean z) {
        this.draw3D = z;
    }

    public void setColors(int[] iArr) {
        this.colors = iArr;
    }

    public void setColorsPoints(float[] fArr) {
        this.colorsPoints = fArr;
    }

    public void setColorsPoints(double[] dArr) {
        this.circleStartPoints = dArr;
    }

    public void setAnimate(boolean z) {
        this.mAnimate = z;
    }

    public boolean isAnimate() {
        return this.mAnimate;
    }
}
