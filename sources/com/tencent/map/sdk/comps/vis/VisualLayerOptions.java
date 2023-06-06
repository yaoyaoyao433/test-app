package com.tencent.map.sdk.comps.vis;

import com.tencent.tencentmap.mapsdk.maps.interfaces.Options;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class VisualLayerOptions implements Options<VisualLayerOptions, VisualLayerOptionsBuilder> {
    String mLayerId;
    int mZIndex;
    int mLevel = 1;
    int mTimeInternal = 0;
    float mAlpha = 1.0f;
    boolean mIsVisible = true;

    public VisualLayerOptions(String str) {
        this.mLayerId = str;
    }

    public String getLayerId() {
        return this.mLayerId;
    }

    public int getLevel() {
        return this.mLevel;
    }

    public int getZIndex() {
        return this.mZIndex;
    }

    public int getTimeInterval() {
        return this.mTimeInternal;
    }

    public float getAlpha() {
        return this.mAlpha;
    }

    public boolean isVisible() {
        return this.mIsVisible;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Options
    public VisualLayerOptionsBuilder newBuilder() {
        return new VisualLayerOptionsBuilder(this);
    }
}
