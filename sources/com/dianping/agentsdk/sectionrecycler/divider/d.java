package com.dianping.agentsdk.sectionrecycler.divider;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface d {
    Rect bottomDividerOffset(int i, int i2);

    Drawable getBottomDivider(int i, int i2);

    Drawable getSectionFooterDrawable(int i);

    float getSectionFooterHeight(int i);

    Drawable getSectionHeaderDrawable(int i);

    float getSectionHeaderHeight(int i);

    Drawable getTopDivider(int i, int i2);

    boolean hasBottomDividerVerticalOffset(int i, int i2);

    boolean hasTopDividerVerticalOffset(int i, int i2);

    Rect topDividerOffset(int i, int i2);
}
