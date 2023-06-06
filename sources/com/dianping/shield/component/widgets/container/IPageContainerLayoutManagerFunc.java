package com.dianping.shield.component.widgets.container;

import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface IPageContainerLayoutManagerFunc {
    int findFirstCompletelyVisibleItemPosition();

    int findFirstVisibleItemPosition();

    int findLastCompletelyVisibleItemPosition();

    int findLastVisibleItemPosition();

    View getChildAt(int i);

    int getChildCount();
}
