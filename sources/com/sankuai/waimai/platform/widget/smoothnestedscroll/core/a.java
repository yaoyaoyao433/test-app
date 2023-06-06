package com.sankuai.waimai.platform.widget.smoothnestedscroll.core;

import android.support.design.widget.CoordinatorLayout;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface a {
    void cancelSmoothFling();

    void onSmoothFling(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4);

    void onSmoothPreFling(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4, c cVar);
}
