package com.tencent.map.lib.models;

import android.graphics.Color;
import android.support.annotation.Keep;
import com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng;
import com.tencent.smtt.sdk.TbsListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes6.dex */
public class ArcLineOverlayInfo {
    private static final float DEFAULT_MAX_OPACITY = 1.0f;
    private static final float DEFAULT_MIN_OPACITY = 0.0f;
    protected int mType = 0;
    protected int mZIndex = 0;
    protected int activeIndex = 0;
    protected float mOpacity = 1.0f;
    protected boolean mVisibility = true;
    protected int mMinZoom = 3;
    protected int mMaxZoom = 22;
    protected int mDisplayLevel = 1;
    protected float mWidth = 4.0f;
    protected int[] mColors = {Color.argb(255, 0, 255, (int) TbsListener.ErrorCode.NEEDDOWNLOAD_TRUE), Color.argb(255, 0, 255, (int) TbsListener.ErrorCode.NEEDDOWNLOAD_TRUE), Color.argb(255, 0, 255, (int) TbsListener.ErrorCode.NEEDDOWNLOAD_TRUE)};
    protected float[] mColorPoints = {0.0f, 0.5f, 1.0f};
    protected int mColorMapSize = 200;
    protected boolean mDraw3D = false;
    protected boolean mAnimate = false;
    protected int mHighLightDuration = 5000;
    protected int mAnimateDuration = 5000;
    protected int mAnimateColor = -16776961;
    protected FromToLatLng[] notes = new FromToLatLng[0];
    protected int[] nodeIndexes = new int[0];

    public void setDataList(List<Collection<FromToLatLng>> list) {
        if (list == null || list.size() == 0) {
            this.notes = new FromToLatLng[0];
            this.nodeIndexes = new int[0];
            return;
        }
        this.nodeIndexes = new int[list.size()];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Collection<FromToLatLng> collection = list.get(i);
            this.nodeIndexes[i] = collection.size();
            arrayList.addAll(collection);
        }
        this.notes = (FromToLatLng[]) arrayList.toArray(new FromToLatLng[0]);
    }

    public void setzIndex(int i) {
        this.mZIndex = i;
    }

    public void setDisplayLevel(int i) {
        if (i == 1 || i == 2) {
            this.mDisplayLevel = i;
        }
    }

    public void setType(int i) {
        this.mType = i;
    }

    public void setNodes(FromToLatLng[] fromToLatLngArr) {
        this.notes = fromToLatLngArr;
    }

    public void setOpacity(float f) {
        if (f > 1.0f) {
            this.mOpacity = 1.0f;
        } else if (f < 0.0f) {
            this.mOpacity = 0.0f;
        } else {
            this.mOpacity = f;
        }
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

    public void setDraw3D(boolean z) {
        this.mDraw3D = z;
    }

    public void setAnimate(boolean z) {
        this.mAnimate = z;
    }

    public void setHighLightDuration(int i) {
        this.mHighLightDuration = i;
    }

    public void setAnimateDuration(int i) {
        this.mAnimateDuration = i;
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
}
