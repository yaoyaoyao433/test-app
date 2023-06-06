package com.tencent.map.lib.models;

import android.graphics.Rect;
import android.support.annotation.NonNull;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class AccessibleTouchItem implements Comparable<AccessibleTouchItem> {
    public static final String MAP_DEFAULT_CONTENT_DESCRIPTION = "地图";
    public static final int MIN_TOUCH_RADIUS = 20;
    public static final String MY_LOCATION_PREFIX = "我的位置";

    public abstract Rect getBounds();

    public abstract String getContentDescription();

    public abstract void onClick();

    @Override // java.lang.Comparable
    public int compareTo(@NonNull AccessibleTouchItem accessibleTouchItem) {
        Rect bounds = getBounds();
        Rect bounds2 = accessibleTouchItem.getBounds();
        if (bounds.top != bounds2.top) {
            return bounds.top - bounds2.top;
        }
        return bounds.left - bounds2.left;
    }
}
