package com.dianping.agentsdk.sectionrecycler.divider;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface b {
    Rect bottomDividerOffset(int i);

    Drawable getBottomDivider(int i);

    Drawable getFooterDrawable(int i);

    float getFooterHeight(int i);

    Drawable getHeaderDrawable(int i);

    float getHeaderHeight(int i);

    ShieldDisplayNode getNode(int i);

    Drawable getTopDivider(int i);

    boolean hasBottomDividerVerticalOffset(int i);

    boolean hasTopDividerVerticalOffset(int i);

    Rect topDividerOffset(int i);
}
