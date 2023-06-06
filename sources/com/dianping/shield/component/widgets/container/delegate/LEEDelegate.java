package com.dianping.shield.component.widgets.container.delegate;

import android.content.Context;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.shield.component.utils.PageContainerThemePackage;
import com.dianping.shield.component.widgets.container.CommonPageContainer;
import com.dianping.shield.feature.LoadingAndLoadingMoreCreator;
import com.dianping.shield.theme.LoadingDefaultCreator;
import com.dianping.voyager.widgets.container.LoadErrorEmptyView;
import com.dianping.voyager.widgets.container.a;
import com.dianping.voyager.widgets.container.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class LEEDelegate extends PageContainerBaseDelegate<ViewGroup> implements LoadingAndLoadingMoreCreator {
    public static ChangeQuickRedirect changeQuickRedirect;
    private View contentLayout;
    private Context context;
    private View emptyView;
    private View errorView;
    private LoadErrorEmptyView loadDataErrorView;
    private View loadingView;
    private LoadErrorEmptyView.a mLoadErrorEmptyModel;
    private LoadErrorEmptyView.b mLoadRetryListener;
    private a.EnumC0139a mMode;
    private CommonPageContainer.OnRefreshListener onRefreshListener;
    private PageContainerThemePackage pageContainerThemePackage;

    @Override // com.dianping.shield.component.widgets.container.delegate.PageContainerBaseDelegate
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c5f3e2fec719a25c98e91bca003b207", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c5f3e2fec719a25c98e91bca003b207");
        }
    }

    public LEEDelegate(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f5bc9cd3f792568f7d17c8b8a6de74d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f5bc9cd3f792568f7d17c8b8a6de74d");
            return;
        }
        this.mMode = a.EnumC0139a.PULL_DOWN_TO_REFRESH;
        this.context = context;
    }

    @Override // com.dianping.shield.component.widgets.container.delegate.PageContainerBaseDelegate
    public void onCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a54f4cbbb7febf4fd90382d70f803d22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a54f4cbbb7febf4fd90382d70f803d22");
            return;
        }
        if (getAgentContainerView() instanceof b) {
            ((b) getAgentContainerView()).setMode(this.mMode);
            ((b) getAgentContainerView()).setOnRefreshListener(new a.b<RecyclerView>() { // from class: com.dianping.shield.component.widgets.container.delegate.LEEDelegate.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.voyager.widgets.container.a.b
                public void onRefresh(a<RecyclerView> aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2e09fef0c10117c9119bdd9b10dd9380", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2e09fef0c10117c9119bdd9b10dd9380");
                    } else if (LEEDelegate.this.onRefreshListener != null) {
                        LEEDelegate.this.onRefreshListener.onRefresh(aVar);
                    }
                }
            });
        }
        this.loadDataErrorView = (LoadErrorEmptyView) getRootView().findViewById(R.id.load_data_view);
        this.contentLayout = getRootView().findViewById(R.id.content_layout);
        this.loadDataErrorView.setVisibility(8);
        this.loadDataErrorView.setModel(new LoadErrorEmptyView.a(LoadErrorEmptyView.a.c, LoadErrorEmptyView.c.SUCCESS));
        this.loadDataErrorView.setRetryListener(new LoadErrorEmptyView.b() { // from class: com.dianping.shield.component.widgets.container.delegate.LEEDelegate.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.voyager.widgets.container.LoadErrorEmptyView.b
            public void loadRetry(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0546ed3a38b1496c2af3c4654b14e23f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0546ed3a38b1496c2af3c4654b14e23f");
                } else if (LEEDelegate.this.mLoadRetryListener != null) {
                    LEEDelegate.this.mLoadRetryListener.loadRetry(view);
                }
            }
        });
        if (this.loadingView != null) {
            this.loadDataErrorView.setLoadingView(this.loadingView);
        }
        if (this.errorView != null) {
            this.loadDataErrorView.setErrorView(this.errorView);
        }
        if (this.emptyView != null) {
            this.loadDataErrorView.setEmptyView(this.emptyView);
        }
        if (this.mLoadErrorEmptyModel != null) {
            this.loadDataErrorView.setModel(this.mLoadErrorEmptyModel);
            if (this.mLoadErrorEmptyModel.f == LoadErrorEmptyView.c.SUCCESS) {
                this.loadDataErrorView.setVisibility(8);
                this.contentLayout.setVisibility(0);
                return;
            }
            this.loadDataErrorView.setVisibility(0);
            this.contentLayout.setVisibility(8);
        }
    }

    public void setMode(a.EnumC0139a enumC0139a) {
        Object[] objArr = {enumC0139a};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "018c8a19b7de8e0dc118d6122eaa8572", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "018c8a19b7de8e0dc118d6122eaa8572");
            return;
        }
        this.mMode = enumC0139a;
        if (enumC0139a == null || !(getAgentContainerView() instanceof b)) {
            return;
        }
        ((b) getAgentContainerView()).setMode(enumC0139a);
    }

    public void setOnRefreshListener(final CommonPageContainer.OnRefreshListener onRefreshListener) {
        Object[] objArr = {onRefreshListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5809c7448c5acd23fcdbabaa60e3cbde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5809c7448c5acd23fcdbabaa60e3cbde");
            return;
        }
        this.onRefreshListener = onRefreshListener;
        if (!(getAgentContainerView() instanceof b) || onRefreshListener == null) {
            return;
        }
        ((b) getAgentContainerView()).setOnRefreshListener(new a.b<RecyclerView>() { // from class: com.dianping.shield.component.widgets.container.delegate.LEEDelegate.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.voyager.widgets.container.a.b
            public void onRefresh(a<RecyclerView> aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "161567d2831bdb23ab32e427ba9bdf65", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "161567d2831bdb23ab32e427ba9bdf65");
                } else {
                    onRefreshListener.onRefresh(aVar);
                }
            }
        });
    }

    public void setLoadRetryListener(LoadErrorEmptyView.b bVar) {
        this.mLoadRetryListener = bVar;
    }

    public void setLoadDataErrorView(LoadErrorEmptyView.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed83938ba29f0bf80ed61127ca14d81c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed83938ba29f0bf80ed61127ca14d81c");
            return;
        }
        onRefreshComplete();
        this.mLoadErrorEmptyModel = aVar;
        if (this.loadDataErrorView == null || this.contentLayout == null) {
            return;
        }
        if (aVar == null) {
            if (this.loadDataErrorView.getVisibility() != 8) {
                this.contentLayout.setVisibility(0);
                this.loadDataErrorView.setVisibility(8);
                this.loadDataErrorView.setModel(new LoadErrorEmptyView.a("", LoadErrorEmptyView.c.SUCCESS));
                return;
            }
            return;
        }
        if (aVar.f == LoadErrorEmptyView.c.SUCCESS) {
            this.contentLayout.setVisibility(0);
            this.loadDataErrorView.setVisibility(8);
        } else {
            this.contentLayout.setVisibility(8);
            this.loadDataErrorView.setVisibility(0);
        }
        this.loadDataErrorView.setModel(aVar);
    }

    public void setLoadingView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bac88b034596cbb5517d09f7a2a273af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bac88b034596cbb5517d09f7a2a273af");
            return;
        }
        this.loadingView = view;
        if (this.loadDataErrorView != null) {
            this.loadDataErrorView.setLoadingView(view);
        }
    }

    public void setErrorView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "784ac0a3c85563c37b3d624faf5c50e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "784ac0a3c85563c37b3d624faf5c50e0");
            return;
        }
        this.errorView = view;
        if (this.loadDataErrorView != null) {
            this.loadDataErrorView.setErrorView(view);
        }
    }

    public void setErrorText(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "623c66d5d723fc2353a8aebf07dce31f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "623c66d5d723fc2353a8aebf07dce31f");
        } else if (this.loadDataErrorView != null) {
            this.loadDataErrorView.setErrorText(str);
        }
    }

    public void setEmptyView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4b2127124ef698ee1a9c293bfbf1e6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4b2127124ef698ee1a9c293bfbf1e6b");
            return;
        }
        this.emptyView = view;
        if (this.loadDataErrorView != null) {
            this.loadDataErrorView.setEmptyView(view);
        }
    }

    public void setLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e41455b4f901628fc2b5b9da17df801c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e41455b4f901628fc2b5b9da17df801c");
            return;
        }
        onRefreshComplete();
        setLoadDataErrorView(new LoadErrorEmptyView.a(LoadErrorEmptyView.a.d, LoadErrorEmptyView.c.LOADING));
    }

    public void setError() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d435947ebe339c46b1fbdd2f9d4dbf5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d435947ebe339c46b1fbdd2f9d4dbf5f");
            return;
        }
        onRefreshComplete();
        setLoadDataErrorView(new LoadErrorEmptyView.a(LoadErrorEmptyView.a.b, LoadErrorEmptyView.c.ERROR));
    }

    public void setEmpty() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13d7c5906ab4ceaa6502a6040f7b99ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13d7c5906ab4ceaa6502a6040f7b99ae");
            return;
        }
        onRefreshComplete();
        setLoadDataErrorView(new LoadErrorEmptyView.a(LoadErrorEmptyView.a.c, LoadErrorEmptyView.c.EMPTY));
    }

    public void setSuccess() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0834d486239a5757be065fd06b693c1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0834d486239a5757be065fd06b693c1e");
            return;
        }
        onRefreshComplete();
        setLoadDataErrorView(new LoadErrorEmptyView.a("", LoadErrorEmptyView.c.SUCCESS));
    }

    public void onRefreshComplete() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c3a0702e66ed27d3a0f783dc1e70f6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c3a0702e66ed27d3a0f783dc1e70f6c");
        } else if ((getAgentContainerView() instanceof b) && ((b) getAgentContainerView()).a()) {
            b bVar = (b) getAgentContainerView();
            Object[] objArr2 = {(byte) 1};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect3, false, "1c57e2bf11258d7cb4345210577211fc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect3, false, "1c57e2bf11258d7cb4345210577211fc");
            } else if (bVar.c != 0) {
                Object[] objArr3 = {(byte) 1};
                ChangeQuickRedirect changeQuickRedirect4 = a.a;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect4, false, "f39b47b95a349b2fb4c6217b8a3ee164", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect4, false, "f39b47b95a349b2fb4c6217b8a3ee164");
                    return;
                }
                if (bVar.d.a()) {
                    bVar.f.refreshComplete(true);
                }
                if (bVar.d.b()) {
                    bVar.g.refreshComplete(true);
                }
            }
        }
    }

    @Override // com.dianping.shield.component.widgets.container.delegate.PageContainerBaseDelegate, com.dianping.shield.preload.ShieldPreloadInterface
    public void shieldRecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8de0bdbba79e774e44c66d5a58b87cb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8de0bdbba79e774e44c66d5a58b87cb4");
            return;
        }
        if (this.loadDataErrorView != null) {
            this.loadDataErrorView.shieldRecycle();
            this.loadDataErrorView = null;
        }
        this.mLoadRetryListener = null;
        this.mLoadErrorEmptyModel = null;
        this.contentLayout = null;
        setMode(a.EnumC0139a.PULL_DOWN_TO_REFRESH);
        this.onRefreshListener = null;
        this.errorView = null;
        this.emptyView = null;
        this.loadingView = null;
        super.shieldRecycle();
    }

    public void setPageContainerThemePackage(PageContainerThemePackage pageContainerThemePackage) {
        this.pageContainerThemePackage = pageContainerThemePackage;
    }

    @Override // com.dianping.shield.feature.LoadingAndLoadingMoreCreator
    public View loadingView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1aa48892fc9ecaf90683f9f9ff4b95b", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1aa48892fc9ecaf90683f9f9ff4b95b");
        }
        if (this.pageContainerThemePackage != null) {
            if (this.pageContainerThemePackage.getLoadingCreatorNeedContext() != null) {
                return this.pageContainerThemePackage.getLoadingCreatorNeedContext().loadingView(this.context);
            }
            if (this.pageContainerThemePackage.getLoadingCreator() != null) {
                return this.pageContainerThemePackage.getLoadingCreator().loadingView();
            }
        }
        return LoadingDefaultCreator.INSTANCE.loadingView(this.context);
    }

    @Override // com.dianping.shield.feature.LoadingAndLoadingMoreCreator
    public View loadingFailedView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7035dfe7e0d9e4b3292570c609f8a408", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7035dfe7e0d9e4b3292570c609f8a408");
        }
        if (this.pageContainerThemePackage != null) {
            if (this.pageContainerThemePackage.getLoadingCreatorNeedContext() != null) {
                return this.pageContainerThemePackage.getLoadingCreatorNeedContext().loadingFailedView(this.context);
            }
            if (this.pageContainerThemePackage.getLoadingCreator() != null) {
                return this.pageContainerThemePackage.getLoadingCreator().loadingFailedView();
            }
        }
        return LoadingDefaultCreator.INSTANCE.loadingFailedView(this.context);
    }

    @Override // com.dianping.shield.feature.LoadingAndLoadingMoreCreator
    public View emptyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96e222ce1ca9a51fe599f7f7e2c3744a", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96e222ce1ca9a51fe599f7f7e2c3744a");
        }
        if (this.pageContainerThemePackage != null) {
            if (this.pageContainerThemePackage.getLoadingCreatorNeedContext() != null) {
                return this.pageContainerThemePackage.getLoadingCreatorNeedContext().emptyView(this.context);
            }
            if (this.pageContainerThemePackage.getLoadingCreator() != null) {
                return this.pageContainerThemePackage.getLoadingCreator().emptyView();
            }
        }
        return LoadingDefaultCreator.INSTANCE.emptyView(this.context);
    }

    @Override // com.dianping.shield.feature.LoadingAndLoadingMoreCreator
    public View loadingMoreView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66fb1cb9c025bcce1105588f2ba9c403", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66fb1cb9c025bcce1105588f2ba9c403");
        }
        if (this.pageContainerThemePackage != null) {
            if (this.pageContainerThemePackage.getLoadingCreatorNeedContext() != null) {
                return this.pageContainerThemePackage.getLoadingCreatorNeedContext().loadingMoreView(this.context);
            }
            if (this.pageContainerThemePackage.getLoadingCreator() != null) {
                return this.pageContainerThemePackage.getLoadingCreator().loadingMoreView();
            }
        }
        return LoadingDefaultCreator.INSTANCE.loadingMoreView(this.context);
    }

    @Override // com.dianping.shield.feature.LoadingAndLoadingMoreCreator
    public View loadingMoreFailedView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0997742831e0cbc769264437288f567", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0997742831e0cbc769264437288f567");
        }
        if (this.pageContainerThemePackage != null) {
            if (this.pageContainerThemePackage.getLoadingCreatorNeedContext() != null) {
                return this.pageContainerThemePackage.getLoadingCreatorNeedContext().loadingMoreFailedView(this.context);
            }
            if (this.pageContainerThemePackage.getLoadingCreator() != null) {
                return this.pageContainerThemePackage.getLoadingCreator().loadingMoreFailedView();
            }
        }
        return LoadingDefaultCreator.INSTANCE.loadingFailedView(this.context);
    }
}
