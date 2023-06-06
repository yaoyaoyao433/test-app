package com.tencent.tencentmap.mapsdk.maps.model;

import android.graphics.Rect;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class IntersectionOverlayOptions {
    private Rect mBounds;
    private byte[] mData;
    private int mDistance;
    private boolean mVisibility = true;
    private boolean mDarkMode = false;
    private boolean mRoundedCorner = false;

    public final Rect getBounds() {
        return this.mBounds;
    }

    public final IntersectionOverlayOptions bounds(Rect rect) {
        this.mBounds = rect;
        return this;
    }

    public final byte[] getData() {
        return this.mData;
    }

    public final IntersectionOverlayOptions data(byte[] bArr) {
        this.mData = bArr;
        return this;
    }

    public final boolean isVisibility() {
        return this.mVisibility;
    }

    public final IntersectionOverlayOptions visibility(boolean z) {
        this.mVisibility = z;
        return this;
    }

    public final int getDistance() {
        return this.mDistance;
    }

    public final IntersectionOverlayOptions distance(int i) {
        this.mDistance = i;
        return this;
    }

    public final boolean isDarkMode() {
        return this.mDarkMode;
    }

    public final IntersectionOverlayOptions darkMode(boolean z) {
        this.mDarkMode = z;
        return this;
    }

    public final boolean isRoundedCorner() {
        return this.mRoundedCorner;
    }

    public final IntersectionOverlayOptions roundedCorner(boolean z) {
        this.mRoundedCorner = z;
        return this;
    }
}
