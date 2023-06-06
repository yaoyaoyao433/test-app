package com.dianping.shield.component.widgets.container;

import android.view.View;
import com.dianping.shield.component.widgets.PageContainerRecyclerView;
import com.dianping.shield.component.widgets.ScDampingEmptyHeaderView;
import com.dianping.shield.component.widgets.container.CommonPageContainer;
import com.dianping.shield.node.itemcallbacks.ContentOffsetListener;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface IPageContainerCustomFunc {
    void addContentOffsetListener(ContentOffsetListener contentOffsetListener);

    void addPageLoadFinishListener(PageContainerRecyclerView.PageLoadFinishListener pageLoadFinishListener);

    @Deprecated
    void addPageLoadListener(PageContainerRecyclerView.PageLoadingListener pageLoadingListener);

    boolean isDraging();

    void removeContentOffsetListener(ContentOffsetListener contentOffsetListener);

    void setContentInset(int i);

    void setFrozenEnabled(boolean z);

    void setHeaderViewOrgHeight(int i);

    void setOnScrollChangedListener(PageContainerRecyclerView.OnScrollChangedListener onScrollChangedListener);

    void setPageContainerBackgroundColor(int i);

    void setPullToRefreshMode(CommonPageContainer.PullToRefreshMode pullToRefreshMode);

    void setRefreshView(View view);

    void setUpdateDuration(int i);

    @Deprecated
    void setViewHeightChangedAnimListener(ScDampingEmptyHeaderView.ViewHeightChangedAnimListener viewHeightChangedAnimListener);

    void updateHeaderView(boolean z);
}
