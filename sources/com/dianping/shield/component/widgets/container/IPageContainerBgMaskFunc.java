package com.dianping.shield.component.widgets.container;

import android.view.View;
import android.widget.FrameLayout;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface IPageContainerBgMaskFunc {
    void setPageBackgroundColor(int i);

    void setPageBackgroundView(View view, FrameLayout.LayoutParams layoutParams);

    void setPageMaskView(View view, FrameLayout.LayoutParams layoutParams);

    void setRvBackgroundColor(int i);

    void setRvBackgroundView(View view, View view2, FrameLayout.LayoutParams layoutParams);

    void setRvBackgroundViews(View view, FrameLayout.LayoutParams layoutParams);

    void setRvMaskView(View view, View view2, FrameLayout.LayoutParams layoutParams);
}
