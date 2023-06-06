package com.tencent.map.lib.models;

import android.support.annotation.Keep;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes6.dex */
public class SubMarkerInfo {
    private int mIconHeight;
    private String mIconName;
    private int mIconWidth;
    private boolean mInteractive = false;
    private boolean mIsAvoidAnnotation = false;
    private boolean mAvoidOtherMarker = false;

    public SubMarkerInfo iconName(String str) {
        this.mIconName = str;
        return this;
    }

    public SubMarkerInfo iconWidth(int i) {
        this.mIconWidth = i;
        return this;
    }

    public SubMarkerInfo iconHeight(int i) {
        this.mIconHeight = i;
        return this;
    }

    public SubMarkerInfo interactive(boolean z) {
        this.mInteractive = z;
        return this;
    }

    public SubMarkerInfo avoidAnnotation(boolean z) {
        this.mIsAvoidAnnotation = z;
        return this;
    }

    public SubMarkerInfo avoidOtherMarker(boolean z) {
        this.mAvoidOtherMarker = z;
        return this;
    }

    public String toString() {
        return "SubMarkerInfo{mIconName='" + this.mIconName + "', mIconWidth=" + this.mIconWidth + ", mIconHeight=" + this.mIconHeight + ", mInteractive=" + this.mInteractive + ", mIsAvoidAnnotation=" + this.mIsAvoidAnnotation + ", mAvoidOtherMarker=" + this.mAvoidOtherMarker + '}';
    }
}
