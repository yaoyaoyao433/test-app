package com.tencent.tencentmap.mapsdk.maps.model;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class AoiLayerOptions {
    private int mMinLevel = -1;
    private int mMaxLevel = -1;

    public AoiLayerOptions setDisplayLevel(int i, int i2) {
        if (i < 0 || i2 < 0 || i > i2) {
            return this;
        }
        if (i < 3) {
            i = 3;
        }
        if (i2 > 20) {
            i2 = 20;
        }
        this.mMinLevel = i;
        this.mMaxLevel = i2;
        return this;
    }

    public int getMinLevel() {
        return this.mMinLevel;
    }

    public int getMaxLevel() {
        return this.mMaxLevel;
    }
}
