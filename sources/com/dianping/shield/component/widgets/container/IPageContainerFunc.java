package com.dianping.shield.component.widgets.container;

import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.dianping.shield.component.interfaces.OnDidInterceptTouchListener;
import com.dianping.shield.component.interfaces.OnDragStatusListener;
import com.dianping.shield.component.interfaces.OnInterceptTouchListener;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface IPageContainerFunc {
    void addDragStatusListener(OnDragStatusListener onDragStatusListener);

    void addFlingListener(RecyclerView.i iVar);

    void addItemDecoration(RecyclerView.f fVar);

    void addOnInterceptTouchListener(OnInterceptTouchListener onInterceptTouchListener);

    void addOnTouchListener(View.OnTouchListener onTouchListener);

    void addScrollListener(RecyclerView.k kVar);

    @Nullable
    OnDidInterceptTouchListener getDidInterceptListener();

    int getScrollState();

    int getScrollY();

    void removeFlingListener(RecyclerView.i iVar);

    void removeScrollListener(RecyclerView.k kVar);

    void scrollToPosition(int i);

    void setDescendantFocusability(int i);

    void setDidInterceptListener(OnDidInterceptTouchListener onDidInterceptTouchListener);

    void setItemAnimationEnabled(boolean z);

    void smoothScrollToPosition(int i);
}
