package com.dianping.shield.component.widgets.container.delegate;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.dianping.agentsdk.framework.aq;
import com.dianping.agentsdk.pagecontainer.a;
import com.dianping.agentsdk.pagecontainer.e;
import com.dianping.shield.component.widgets.PageContainerRecyclerView;
import com.dianping.shield.component.widgets.ScDampingEmptyHeaderView;
import com.dianping.shield.component.widgets.ScTitleBar;
import com.dianping.shield.component.widgets.container.CommonPageContainer;
import com.dianping.shield.component.widgets.container.IPageContainerCustomFunc;
import com.dianping.shield.layoutmanager.TopLinearLayoutManager;
import com.dianping.shield.node.itemcallbacks.ContentOffsetListener;
import com.dianping.voyager.widgets.container.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class CustomFuncDelegate extends PageContainerBaseDelegate<ViewGroup> implements e, IPageContainerCustomFunc {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int autoOffset;
    private List<ContentOffsetListener> contentOffsetListeners;
    private List<a> firstItemScrollListeners;
    private RecyclerView.LayoutManager layoutManager;
    private PageContainerRecyclerView.OnScrollChangedListener mOnScrollChangedListener;
    private CommonPageContainer.PullToRefreshMode mode;
    private int pageBgColor;
    private PageContainerRecyclerView.PageLoadFinishListener pageLoadFinishListener;
    private PageContainerRecyclerView.PageLoadingListener pageLoadingTime;
    private View refreshView;
    private ScTitleBar scTitleBar;
    private int top;
    private ScDampingEmptyHeaderView.ViewHeightChangedAnimListener viewHeightChangedAnimListener;

    public CustomFuncDelegate(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b1fb945cfc2630b0c13dc47d1ca35e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b1fb945cfc2630b0c13dc47d1ca35e4");
        } else {
            this.mode = CommonPageContainer.PullToRefreshMode.PULL_UP_TO_REFRESH;
        }
    }

    @Override // com.dianping.shield.component.widgets.container.delegate.PageContainerBaseDelegate
    public void onCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce49bff7b69e90bce9fbc52402b8b985", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce49bff7b69e90bce9fbc52402b8b985");
            return;
        }
        if (getAgentContainerView() instanceof b) {
            ((b) getAgentContainerView()).setOnScrollChangedListener(new b.a() { // from class: com.dianping.shield.component.widgets.container.delegate.CustomFuncDelegate.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.voyager.widgets.container.b.a
                public void onScrollChanged(int i, int i2, int i3, int i4) {
                    Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0e018d11a0e3379e13e32d0fc48ceaea", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0e018d11a0e3379e13e32d0fc48ceaea");
                    } else if (CustomFuncDelegate.this.mOnScrollChangedListener != null) {
                        CustomFuncDelegate.this.mOnScrollChangedListener.onScrollChanged(i, i2, i3, i4);
                    }
                }
            });
            PageContainerRecyclerView pageContainerRecyclerView = null;
            ViewGroup agentContainerView = getAgentContainerView();
            if (agentContainerView instanceof b) {
                RecyclerView refreshableView = ((b) agentContainerView).getRefreshableView();
                if (refreshableView instanceof PageContainerRecyclerView) {
                    pageContainerRecyclerView = (PageContainerRecyclerView) refreshableView;
                }
            } else if (agentContainerView instanceof PageContainerRecyclerView) {
                pageContainerRecyclerView = (PageContainerRecyclerView) agentContainerView;
            }
            if (pageContainerRecyclerView != null) {
                if (this.pageLoadFinishListener != null) {
                    pageContainerRecyclerView.addPageLoadFinishListener(this.pageLoadFinishListener);
                }
                pageContainerRecyclerView.setFirstItemScrollListener(new a() { // from class: com.dianping.shield.component.widgets.container.delegate.CustomFuncDelegate.2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.agentsdk.pagecontainer.a
                    public void onScrollChanged(int i, int i2, boolean z) {
                        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "830a75c6765be207cae37384f29221bd", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "830a75c6765be207cae37384f29221bd");
                            return;
                        }
                        if (CustomFuncDelegate.this.firstItemScrollListeners != null) {
                            for (a aVar : CustomFuncDelegate.this.firstItemScrollListeners) {
                                if (aVar != null) {
                                    aVar.onScrollChanged(i, i2, z);
                                }
                            }
                        }
                        if (CustomFuncDelegate.this.scTitleBar != null) {
                            CustomFuncDelegate.this.scTitleBar.setFirstItemScrollY(-i, i2, z);
                        }
                    }
                });
                pageContainerRecyclerView.setContentOffsetListener(new ContentOffsetListener() { // from class: com.dianping.shield.component.widgets.container.delegate.CustomFuncDelegate.3
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.shield.node.itemcallbacks.ContentOffsetListener
                    public void offsetChanged(int i, int i2) {
                        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8f93c7ec6edf9c911a9354c5ce526727", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8f93c7ec6edf9c911a9354c5ce526727");
                        } else if (CustomFuncDelegate.this.contentOffsetListeners != null) {
                            for (ContentOffsetListener contentOffsetListener : CustomFuncDelegate.this.contentOffsetListeners) {
                                if (contentOffsetListener != null) {
                                    contentOffsetListener.offsetChanged(i, i2);
                                }
                            }
                        }
                    }
                });
            }
        } else if (getAgentContainerView() instanceof PageContainerRecyclerView) {
            if (this.mode == CommonPageContainer.PullToRefreshMode.DISABLED) {
                ((PageContainerRecyclerView) getAgentContainerView()).setPullExtraEnable(false);
                ((PageContainerRecyclerView) getAgentContainerView()).removeAllHeaderView();
            } else {
                ((PageContainerRecyclerView) getAgentContainerView()).setPullExtraEnable(true);
                ((PageContainerRecyclerView) getAgentContainerView()).addEmptyHeaderView();
            }
            if (this.mode == CommonPageContainer.PullToRefreshMode.DISABLED_NUM_CHANGE) {
                ((PageContainerRecyclerView) getAgentContainerView()).setPullExtraEnable(false);
                ((PageContainerRecyclerView) getAgentContainerView()).setOffsetChangeWithDisableScrollEnable(true);
            } else {
                ((PageContainerRecyclerView) getAgentContainerView()).setOffsetChangeWithDisableScrollEnable(false);
            }
            ((PageContainerRecyclerView) getAgentContainerView()).setFirstItemScrollListener(new a() { // from class: com.dianping.shield.component.widgets.container.delegate.CustomFuncDelegate.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.agentsdk.pagecontainer.a
                public void onScrollChanged(int i, int i2, boolean z) {
                    Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a00713b60cfb1cd43ac45ef3426cfbf2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a00713b60cfb1cd43ac45ef3426cfbf2");
                    } else if (CustomFuncDelegate.this.firstItemScrollListeners != null) {
                        for (a aVar : CustomFuncDelegate.this.firstItemScrollListeners) {
                            if (aVar != null) {
                                aVar.onScrollChanged(i, i2, z);
                            }
                        }
                    }
                }
            });
            ((PageContainerRecyclerView) getAgentContainerView()).setOnScrollChangedListener(this.mOnScrollChangedListener);
            ((PageContainerRecyclerView) getAgentContainerView()).setContentOffsetListener(new ContentOffsetListener() { // from class: com.dianping.shield.component.widgets.container.delegate.CustomFuncDelegate.5
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.shield.node.itemcallbacks.ContentOffsetListener
                public void offsetChanged(int i, int i2) {
                    Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f6faa0e65b2fb2b08132046f4bb1505f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f6faa0e65b2fb2b08132046f4bb1505f");
                        return;
                    }
                    if (CustomFuncDelegate.this.contentOffsetListeners != null) {
                        for (ContentOffsetListener contentOffsetListener : CustomFuncDelegate.this.contentOffsetListeners) {
                            if (contentOffsetListener != null) {
                                contentOffsetListener.offsetChanged(i, i2);
                            }
                        }
                    }
                    if (CustomFuncDelegate.this.scTitleBar != null) {
                        CustomFuncDelegate.this.scTitleBar.setScrollY(i2, aq.a(CustomFuncDelegate.this.getContext(), 80.0f));
                    }
                }
            });
            if (this.top != 0) {
                ((PageContainerRecyclerView) getAgentContainerView()).setContentInset(this.top);
            }
            setRefreshViewInner(this.refreshView);
            if (this.pageLoadingTime != null) {
                ((PageContainerRecyclerView) getAgentContainerView()).addPageLoadListener(this.pageLoadingTime);
            }
            if (this.pageLoadFinishListener != null) {
                ((PageContainerRecyclerView) getAgentContainerView()).addPageLoadFinishListener(this.pageLoadFinishListener);
            }
            if (this.viewHeightChangedAnimListener != null) {
                ((PageContainerRecyclerView) getAgentContainerView()).setViewHeightChangedAnimListener(this.viewHeightChangedAnimListener);
            }
        }
        setUpAutoOffset(this.autoOffset);
        if (this.pageBgColor != 0) {
            getRootView().setBackgroundColor(this.pageBgColor);
        }
    }

    public void setFirstItemScrollChangeListener(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63002db5ef639fb22d161fd1eed48cf3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63002db5ef639fb22d161fd1eed48cf3");
            return;
        }
        if (this.firstItemScrollListeners == null) {
            this.firstItemScrollListeners = new ArrayList();
        }
        this.firstItemScrollListeners.add(aVar);
    }

    public void removeFirstItemScrollChangeListener(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74306364c9edf770649f82d83bfd2da4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74306364c9edf770649f82d83bfd2da4");
        } else if (this.firstItemScrollListeners != null) {
            this.firstItemScrollListeners.remove(aVar);
        }
    }

    public RecyclerView.LayoutManager getLayoutManager() {
        return this.layoutManager;
    }

    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        this.layoutManager = layoutManager;
    }

    @Override // com.dianping.shield.component.widgets.container.delegate.PageContainerBaseDelegate
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9450805f8da7360017b76244d5d43946", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9450805f8da7360017b76244d5d43946");
        } else if (this.firstItemScrollListeners != null) {
            this.firstItemScrollListeners.clear();
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerCustomFunc
    public void setOnScrollChangedListener(PageContainerRecyclerView.OnScrollChangedListener onScrollChangedListener) {
        this.mOnScrollChangedListener = onScrollChangedListener;
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerCustomFunc
    public void setPageContainerBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d67afbcec095f8ed1f6c2604ec3c642", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d67afbcec095f8ed1f6c2604ec3c642");
            return;
        }
        this.pageBgColor = i;
        if (getRootView() != null) {
            getRootView().setBackgroundColor(i);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerCustomFunc
    public void addContentOffsetListener(ContentOffsetListener contentOffsetListener) {
        Object[] objArr = {contentOffsetListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "848e570a760e1ce959149f338a88ffdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "848e570a760e1ce959149f338a88ffdc");
            return;
        }
        if (this.contentOffsetListeners == null) {
            this.contentOffsetListeners = new ArrayList();
        }
        this.contentOffsetListeners.add(contentOffsetListener);
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerCustomFunc
    public void removeContentOffsetListener(ContentOffsetListener contentOffsetListener) {
        Object[] objArr = {contentOffsetListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09f7b1a16d2159f1af1001706f207d66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09f7b1a16d2159f1af1001706f207d66");
        } else if (this.contentOffsetListeners != null) {
            this.contentOffsetListeners.remove(contentOffsetListener);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerCustomFunc
    public void setContentInset(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8254436c70caa278cf7b134305199ba7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8254436c70caa278cf7b134305199ba7");
            return;
        }
        this.top = i;
        if (getAgentContainerView() instanceof PageContainerRecyclerView) {
            ((PageContainerRecyclerView) getAgentContainerView()).setContentInset(i);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerCustomFunc
    public void updateHeaderView(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d73d120f7789ca69f4f319e290d9f24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d73d120f7789ca69f4f319e290d9f24");
        } else if (getAgentContainerView() instanceof PageContainerRecyclerView) {
            ((PageContainerRecyclerView) getAgentContainerView()).updateHeaderView(z);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerCustomFunc
    public void setUpdateDuration(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ad47f5a0a2918a24b913092781d1c76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ad47f5a0a2918a24b913092781d1c76");
        } else if (getAgentContainerView() instanceof PageContainerRecyclerView) {
            ((PageContainerRecyclerView) getAgentContainerView()).setUpdateDuration(i);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerCustomFunc
    public void setRefreshView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fd4f1a7e478f37b244c1ed672725327", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fd4f1a7e478f37b244c1ed672725327");
            return;
        }
        removeRefreshViewInner();
        this.refreshView = view;
        setRefreshViewInner(this.refreshView);
    }

    private void setRefreshViewInner(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "995f754d1fdafa4575737b95228c4ab8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "995f754d1fdafa4575737b95228c4ab8");
        } else if (!(getRootView() instanceof FrameLayout) || view == null) {
        } else {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            ((FrameLayout) getRootView()).addView(view, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    private void removeRefreshViewInner() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52bb8233cdf51f3467c4532c26ac7c2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52bb8233cdf51f3467c4532c26ac7c2c");
        } else if ((getRootView() instanceof FrameLayout) && this.refreshView != null && this.refreshView.getParent() == getRootView()) {
            ((FrameLayout) getRootView()).removeView(this.refreshView);
        }
    }

    public View getRefreshView() {
        return this.refreshView;
    }

    public void setTitleBar(ScTitleBar scTitleBar) {
        this.scTitleBar = scTitleBar;
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerCustomFunc
    public void setHeaderViewOrgHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57da8b688ca7c9b78f7d1fc50d9f9a58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57da8b688ca7c9b78f7d1fc50d9f9a58");
        } else if (getAgentContainerView() instanceof PageContainerRecyclerView) {
            ((PageContainerRecyclerView) getAgentContainerView()).setHeaderViewOrgHeight(i);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerCustomFunc
    public boolean isDraging() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c13e2eb8ddb8db6138e747a37917e3c6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c13e2eb8ddb8db6138e747a37917e3c6")).booleanValue();
        }
        if (getAgentContainerView() instanceof PageContainerRecyclerView) {
            return ((PageContainerRecyclerView) getAgentContainerView()).isDraging();
        }
        return false;
    }

    public CommonPageContainer.PullToRefreshMode getPullToRefreshMode() {
        return this.mode;
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerCustomFunc
    public void setPullToRefreshMode(CommonPageContainer.PullToRefreshMode pullToRefreshMode) {
        Object[] objArr = {pullToRefreshMode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce64dd8f01f70caeaa7dfdfe064523be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce64dd8f01f70caeaa7dfdfe064523be");
            return;
        }
        this.mode = pullToRefreshMode;
        if (getAgentContainerView() instanceof PageContainerRecyclerView) {
            if (pullToRefreshMode == CommonPageContainer.PullToRefreshMode.DISABLED) {
                ((PageContainerRecyclerView) getAgentContainerView()).setPullExtraEnable(false);
                ((PageContainerRecyclerView) getAgentContainerView()).removeAllHeaderView();
            } else {
                ((PageContainerRecyclerView) getAgentContainerView()).setPullExtraEnable(true);
                ((PageContainerRecyclerView) getAgentContainerView()).addEmptyHeaderView();
            }
            if (pullToRefreshMode == CommonPageContainer.PullToRefreshMode.DISABLED_NUM_CHANGE) {
                ((PageContainerRecyclerView) getAgentContainerView()).setPullExtraEnable(false);
                ((PageContainerRecyclerView) getAgentContainerView()).setOffsetChangeWithDisableScrollEnable(true);
                return;
            }
            ((PageContainerRecyclerView) getAgentContainerView()).setOffsetChangeWithDisableScrollEnable(false);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerCustomFunc
    public void addPageLoadListener(PageContainerRecyclerView.PageLoadingListener pageLoadingListener) {
        Object[] objArr = {pageLoadingListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33d2021f2e52cc5ea36d555ea0e3cff7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33d2021f2e52cc5ea36d555ea0e3cff7");
            return;
        }
        this.pageLoadingTime = pageLoadingListener;
        if (getAgentContainerView() instanceof PageContainerRecyclerView) {
            ((PageContainerRecyclerView) getAgentContainerView()).addPageLoadListener(pageLoadingListener);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerCustomFunc
    public void addPageLoadFinishListener(PageContainerRecyclerView.PageLoadFinishListener pageLoadFinishListener) {
        Object[] objArr = {pageLoadFinishListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de8b6591d1bb6725efd1cf95972caa5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de8b6591d1bb6725efd1cf95972caa5f");
            return;
        }
        this.pageLoadFinishListener = pageLoadFinishListener;
        if (getAgentContainerView() instanceof PageContainerRecyclerView) {
            ((PageContainerRecyclerView) getAgentContainerView()).addPageLoadFinishListener(pageLoadFinishListener);
        }
        if (getAgentContainerView() instanceof b) {
            RecyclerView refreshableView = ((b) getAgentContainerView()).getRefreshableView();
            if (refreshableView instanceof PageContainerRecyclerView) {
                ((PageContainerRecyclerView) refreshableView).addPageLoadFinishListener(pageLoadFinishListener);
            }
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerCustomFunc
    @Deprecated
    public void setViewHeightChangedAnimListener(ScDampingEmptyHeaderView.ViewHeightChangedAnimListener viewHeightChangedAnimListener) {
        Object[] objArr = {viewHeightChangedAnimListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eefb623040e9c7d7690f142fca7629cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eefb623040e9c7d7690f142fca7629cb");
            return;
        }
        this.viewHeightChangedAnimListener = viewHeightChangedAnimListener;
        if (getAgentContainerView() instanceof PageContainerRecyclerView) {
            ((PageContainerRecyclerView) getAgentContainerView()).setViewHeightChangedAnimListener(viewHeightChangedAnimListener);
        }
    }

    private void setUpAutoOffset(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea599b5717d8d5c54697d1f36579cc76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea599b5717d8d5c54697d1f36579cc76");
            return;
        }
        if (getLayoutManager() instanceof TopLinearLayoutManager) {
            ((TopLinearLayoutManager) getLayoutManager()).setAutoOffset(i);
        }
        if (getAgentContainerView() instanceof PageContainerRecyclerView) {
            ((PageContainerRecyclerView) getAgentContainerView()).setAutoOffset(i);
        } else if (getAgentContainerView() instanceof b) {
            RecyclerView refreshableView = ((b) getAgentContainerView()).getRefreshableView();
            if (refreshableView instanceof PageContainerRecyclerView) {
                ((PageContainerRecyclerView) refreshableView).setAutoOffset(i);
            }
        }
    }

    public void setPullToRefreshViewOffset(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ebae0dda142b8152e32039cc51d588c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ebae0dda142b8152e32039cc51d588c");
        } else if (this.refreshView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.refreshView.getLayoutParams();
            layoutParams.topMargin = i;
            this.refreshView.setLayoutParams(layoutParams);
        }
    }

    @Override // com.dianping.agentsdk.pagecontainer.e
    public void setAutoOffset(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ca1605af5cb5ba1842b707879a16f88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ca1605af5cb5ba1842b707879a16f88");
            return;
        }
        this.autoOffset = i;
        setUpAutoOffset(i);
    }

    @Override // com.dianping.agentsdk.pagecontainer.e
    public int getAutoOffset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab7ec0b11724d4ede7449a692fcb1f99", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab7ec0b11724d4ede7449a692fcb1f99")).intValue();
        }
        if (getAgentContainerView() instanceof PageContainerRecyclerView) {
            return ((PageContainerRecyclerView) getAgentContainerView()).getAutoOffset();
        }
        if (getAgentContainerView() instanceof b) {
            RecyclerView refreshableView = ((b) getAgentContainerView()).getRefreshableView();
            if (refreshableView instanceof PageContainerRecyclerView) {
                return ((PageContainerRecyclerView) refreshableView).getAutoOffset();
            }
        }
        return 0;
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerCustomFunc
    public void setFrozenEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d81dbc9a00f7f901092e37ae6e6982a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d81dbc9a00f7f901092e37ae6e6982a5");
        } else if (getAgentContainerView() instanceof PageContainerRecyclerView) {
            ((PageContainerRecyclerView) getAgentContainerView()).setFrozenEnabled(z);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.delegate.PageContainerBaseDelegate, com.dianping.shield.preload.ShieldPreloadInterface
    public void shieldRecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "021bda37f7ec24aafaef57ba598b054c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "021bda37f7ec24aafaef57ba598b054c");
            return;
        }
        removeRefreshViewInner();
        this.refreshView = null;
        this.mOnScrollChangedListener = null;
        this.autoOffset = 0;
        this.layoutManager = null;
        this.pageBgColor = 0;
        this.top = 0;
        if (this.contentOffsetListeners != null) {
            this.contentOffsetListeners.clear();
            this.contentOffsetListeners = null;
        }
        this.scTitleBar = null;
        this.mode = CommonPageContainer.PullToRefreshMode.PULL_UP_TO_REFRESH;
        setPullToRefreshMode(this.mode);
        this.pageLoadingTime = null;
        this.pageLoadFinishListener = null;
        this.viewHeightChangedAnimListener = null;
        super.shieldRecycle();
    }
}
