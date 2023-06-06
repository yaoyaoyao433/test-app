package com.tencent.map.lib.models;

import android.graphics.Rect;
import android.support.annotation.Keep;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes6.dex */
public class IntersectionOverlayInfo {
    protected Rect mBounds;
    protected byte[] mData;
    protected int mDistance;
    protected boolean mIsDarkMode;
    protected boolean mVisibility = true;
    protected boolean mRoundedCorner = false;

    public void setBounds(Rect rect) {
        this.mBounds = rect;
    }

    public void setData(byte[] bArr) {
        this.mData = bArr;
    }

    public void setVisibility(boolean z) {
        this.mVisibility = z;
    }

    public void setDistance(int i) {
        this.mDistance = i;
    }

    public void enableRoundedCorner(boolean z) {
        this.mRoundedCorner = z;
    }

    public void enableDarkMode(boolean z) {
        this.mIsDarkMode = z;
    }
}
