package com.dianping.shield.component.widgets.container;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.dianping.agentsdk.framework.ab;
import com.dianping.agentsdk.framework.aq;
import com.dianping.agentsdk.framework.e;
import com.dianping.agentsdk.pagecontainer.c;
import com.dianping.agentsdk.pagecontainer.d;
import com.dianping.agentsdk.pagecontainer.e;
import com.dianping.agentsdk.pagecontainer.f;
import com.dianping.agentsdk.pagecontainer.g;
import com.dianping.agentsdk.pagecontainer.h;
import com.dianping.agentsdk.pagecontainer.i;
import com.dianping.agentsdk.pagecontainer.j;
import com.dianping.agentsdk.pagecontainer.k;
import com.dianping.agentsdk.sectionrecycler.layoutmanager.LinearLayoutManagerWithSmoothOffset;
import com.dianping.shield.bridge.feature.LinearLayoutManagerExtraSpaceInterface;
import com.dianping.shield.bridge.feature.PageContainerCommonFunctionInterface;
import com.dianping.shield.component.entity.LayoutMode;
import com.dianping.shield.component.interfaces.OnDidInterceptTouchListener;
import com.dianping.shield.component.interfaces.OnDragRefreshStatusChangedListener;
import com.dianping.shield.component.interfaces.OnDragStatusListener;
import com.dianping.shield.component.interfaces.OnInterceptTouchListener;
import com.dianping.shield.component.interfaces.OnRefreshSuccessListener;
import com.dianping.shield.component.utils.ExtraModel;
import com.dianping.shield.component.utils.PageContainerThemeManager;
import com.dianping.shield.component.utils.PageContainerThemePackage;
import com.dianping.shield.component.widgets.PageContainerRecyclerView;
import com.dianping.shield.component.widgets.ScDampingEmptyHeaderView;
import com.dianping.shield.component.widgets.ScTitleBar;
import com.dianping.shield.component.widgets.ScTitleBarProviderInterface;
import com.dianping.shield.component.widgets.container.delegate.BgMaskFuncDelegate;
import com.dianping.shield.component.widgets.container.delegate.CustomFuncDelegate;
import com.dianping.shield.component.widgets.container.delegate.FuncDelegate;
import com.dianping.shield.component.widgets.container.delegate.LEEDelegate;
import com.dianping.shield.component.widgets.container.delegate.TopBottomViewDelegate;
import com.dianping.shield.debug.DebugSettings;
import com.dianping.shield.debug.WhiteBoardDataStoreSnapshot;
import com.dianping.shield.env.ShieldEnvironment;
import com.dianping.shield.feature.ExtraCellTopInterface;
import com.dianping.shield.feature.FloatCoverViewControlInterface;
import com.dianping.shield.feature.LoadingAndLoadingMoreCreator;
import com.dianping.shield.feature.PositionInfoInterface;
import com.dianping.shield.feature.SetTopInterface;
import com.dianping.shield.framework.PageContainerLayoutModeInterface;
import com.dianping.shield.layoutcontrol.ZFrameLayout;
import com.dianping.shield.layoutmanager.TopLinearLayoutManager;
import com.dianping.shield.node.itemcallbacks.ContentOffsetListener;
import com.dianping.shield.preload.ShieldPreloadInterface;
import com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface;
import com.dianping.shield.sectionrecycler.layoutmanager.ShieldStaggeredGridLayoutManager;
import com.dianping.shield.theme.LoadingDefaultCreator;
import com.dianping.voyager.widgets.container.LoadErrorEmptyView;
import com.dianping.voyager.widgets.container.a;
import com.dianping.voyager.widgets.container.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class CommonPageContainer implements ab, d, e, f, g, h, j, k, PageContainerCommonFunctionInterface, IPageContainerBgMaskFunc, IPageContainerCustomFunc, IPageContainerFunc, IPageContainerLayoutManagerFunc, FloatCoverViewControlInterface, LoadingAndLoadingMoreCreator, PositionInfoInterface, PageContainerLayoutModeInterface, ShieldPreloadInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    private HashMap<e.a, com.dianping.agentsdk.framework.e> anchorViewLayoutParamInfos;
    private BgMaskFuncDelegate bgMaskFuncDelegate;
    private CommonPageContainerType comonPageContainerType;
    private ContainerBaseMode containerMode;
    private CustomFuncDelegate customFuncDelegate;
    private View customRootView;
    private boolean enableFrozen;
    private ExtraModel extraModel;
    private FuncDelegate funcDelegate;
    private boolean isInit;
    private boolean isPausing;
    private LEEDelegate leeDelegate;
    protected Context mContext;
    protected RecyclerView.LayoutManager mLinearLayoutManager;
    public b mPullToRecyclerView;
    private OnRecyclerMultiClickListener multiClickListener;
    private PageContainerRecyclerView pageContainerRecyclerView;
    private PageContainerThemePackage pageContainerThemePackage;
    protected FrameLayout recyclerViewLayout;
    private FrameLayout recyclerViewParent;
    private FrameLayout recyclerViewRootLayout;
    protected FrameLayout rootView;
    private ScTitleBarProviderInterface shieldTitleBarProvider;
    private TopBottomViewDelegate topBottomViewDelegate;
    private ZFrameLayout zFrameLayout;
    private int zFrameLayoutResId;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface OnJumpListener {
        void onJump();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface OnRefreshListener {
        void onRefresh(ViewGroup viewGroup);
    }

    @Deprecated
    public boolean isTop(View view) {
        return false;
    }

    @Override // com.dianping.agentsdk.pagecontainer.g
    @Deprecated
    public boolean needMultiStickTop() {
        return false;
    }

    @Override // com.dianping.agentsdk.framework.ab
    public void onActivityCreated(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c9021f3365dd69bfb9262b3dfd41fd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c9021f3365dd69bfb9262b3dfd41fd7");
        }
    }

    @Override // com.dianping.agentsdk.framework.ab
    public void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // com.dianping.agentsdk.framework.ab
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "193896aae80cf9b6dba96acd08e27127", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "193896aae80cf9b6dba96acd08e27127");
        }
    }

    @Override // com.dianping.agentsdk.framework.ab
    public void onSaveInstanceState(Bundle bundle) {
    }

    @Override // com.dianping.agentsdk.framework.ab
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03572a49353905bfb6ff4f8fbf284a18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03572a49353905bfb6ff4f8fbf284a18");
        }
    }

    @Deprecated
    public void setBackGroundView(View view, FrameLayout.LayoutParams layoutParams) {
    }

    @Deprecated
    public void setBackGroundView(View view, FrameLayout.LayoutParams layoutParams, boolean z) {
    }

    @Deprecated
    public void setForeGroundView(View view, FrameLayout.LayoutParams layoutParams) {
    }

    @Deprecated
    public void setForeGroundView(View view, FrameLayout.LayoutParams layoutParams, boolean z) {
    }

    @Override // com.dianping.agentsdk.pagecontainer.g
    @Deprecated
    public View setMultiTopView(ExtraCellTopInterface extraCellTopInterface, int i, View view, i iVar) {
        return null;
    }

    @Override // com.dianping.agentsdk.pagecontainer.g
    @Deprecated
    public View setMultiTopView(SetTopInterface setTopInterface, int i, View view, i iVar) {
        return null;
    }

    @Deprecated
    public void setNeedMultiStickTop(boolean z) {
    }

    @Deprecated
    public void setOnRefreshListener2(a.c cVar) {
    }

    @Override // com.dianping.agentsdk.pagecontainer.h
    @Deprecated
    public View setTopView(View view, i iVar) {
        return null;
    }

    @Override // com.dianping.agentsdk.pagecontainer.h
    @Deprecated
    public void updateSetTopParams(View view, i iVar) {
    }

    public CommonPageContainer(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6939b9314722ff27249a882f9ac8c91", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6939b9314722ff27249a882f9ac8c91");
            return;
        }
        this.comonPageContainerType = CommonPageContainerType.PULL_TOREFRESH;
        this.zFrameLayoutResId = -1;
        this.isPausing = false;
        this.isInit = false;
        this.enableFrozen = false;
        this.mContext = context;
        initPageContainer();
    }

    public ExtraModel getExtraModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b77e04f84beef2f3badf4f280303d9ea", RobustBitConfig.DEFAULT_VALUE)) {
            return (ExtraModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b77e04f84beef2f3badf4f280303d9ea");
        }
        if (this.extraModel == null) {
            this.extraModel = new ExtraModel();
        }
        return this.extraModel;
    }

    private void resetLayoutManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4813534f85aaeba8fbf39f4abf590707", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4813534f85aaeba8fbf39f4abf590707");
            return;
        }
        if (this.pageContainerRecyclerView != null) {
            this.pageContainerRecyclerView.setLayoutManager(null);
        }
        if (this.mPullToRecyclerView == null || this.mPullToRecyclerView.getRefreshableView() == null) {
            return;
        }
        this.mPullToRecyclerView.getRefreshableView().setLayoutManager(null);
    }

    public CommonPageContainerType getPageContainerType() {
        return this.comonPageContainerType;
    }

    public void setPageContainerType(CommonPageContainerType commonPageContainerType) {
        Object[] objArr = {commonPageContainerType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "809cb4532a095a9398c1a3ef51c81d07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "809cb4532a095a9398c1a3ef51c81d07");
            return;
        }
        resetLayoutManager();
        this.comonPageContainerType = commonPageContainerType;
        if (commonPageContainerType == CommonPageContainerType.PULL_TO_X) {
            setPullToRefreshMode(PullToRefreshMode.PULL_DOWN_TO_REFRESH);
            if (this.pageContainerRecyclerView == null) {
                this.pageContainerRecyclerView = new PageContainerRecyclerView(this.mContext);
            }
            this.pageContainerRecyclerView.addEmptyHeaderView();
        }
    }

    public void setRecyclerViewParentView(FrameLayout frameLayout) {
        this.recyclerViewParent = frameLayout;
    }

    public ScTitleBar getShieldTitlebar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eafa3f35b760039044c96d3bfaf2aec4", RobustBitConfig.DEFAULT_VALUE)) {
            return (ScTitleBar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eafa3f35b760039044c96d3bfaf2aec4");
        }
        if (this.shieldTitleBarProvider != null) {
            return this.shieldTitleBarProvider.getScTitleBar();
        }
        return null;
    }

    public PageContainerThemePackage getThemePackage() {
        return this.pageContainerThemePackage;
    }

    private void initPageContainer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10eccd27d3e667a3bb5d68f04fb2baed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10eccd27d3e667a3bb5d68f04fb2baed");
            return;
        }
        this.pageContainerThemePackage = PageContainerThemeManager.INSTANCE.getPageContainerThemeCreator().createTheme();
        this.leeDelegate = new LEEDelegate(this.mContext);
        this.funcDelegate = new FuncDelegate(this.mContext);
        this.customFuncDelegate = new CustomFuncDelegate(this.mContext);
        this.topBottomViewDelegate = new TopBottomViewDelegate(this.mContext);
        this.bgMaskFuncDelegate = new BgMaskFuncDelegate(this.mContext);
        this.bgMaskFuncDelegate.setCommonPageContainer(this);
        this.containerMode = new ContainerPullToRefreshMode(this);
        setPullToRefreshMode(PullToRefreshMode.DISABLED);
    }

    @Override // com.dianping.shield.framework.PageContainerLayoutModeInterface
    public void setLayoutManagerMode(@NotNull LayoutMode layoutMode) {
        Object[] objArr = {layoutMode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dff05d46c533b151f2c99bfb4dfa5189", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dff05d46c533b151f2c99bfb4dfa5189");
            return;
        }
        switch (layoutMode) {
            case STAGGERED_GRID_LAYOUT_MANAGER:
                this.mLinearLayoutManager = new PcShieldStaggeredGridLayoutManager(2, 1);
                break;
            case LINEAR_LAYOUT_MANAGER:
                this.mLinearLayoutManager = new GCLinearLayoutManager(this.mContext);
                break;
        }
        if (this.comonPageContainerType == CommonPageContainerType.PULL_TO_X) {
            if (this.pageContainerRecyclerView != null) {
                this.pageContainerRecyclerView.setLayoutManager(this.mLinearLayoutManager);
            }
        } else if (this.mPullToRecyclerView == null || this.mPullToRecyclerView.getRefreshableView() == null) {
        } else {
            this.mPullToRecyclerView.getRefreshableView().setLayoutManager(this.mLinearLayoutManager);
        }
    }

    private void initPageContainerDelegate(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49589ad7550eac5e1a70d00d122d95ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49589ad7550eac5e1a70d00d122d95ca");
            return;
        }
        if (this.leeDelegate != null) {
            this.leeDelegate.setRootView(this.recyclerViewRootLayout);
            this.leeDelegate.setAgentContainerView(viewGroup);
            this.leeDelegate.setPageContainerThemePackage(this.pageContainerThemePackage);
        }
        if (this.customFuncDelegate != null) {
            this.customFuncDelegate.setRootView(this.recyclerViewRootLayout);
            this.customFuncDelegate.setAgentContainerView(viewGroup);
            this.customFuncDelegate.setLayoutManager(this.mLinearLayoutManager);
        }
        if (this.funcDelegate != null) {
            if (viewGroup instanceof b) {
                b bVar = (b) viewGroup;
                if (bVar.getRefreshableView() instanceof PageContainerRecyclerView) {
                    this.funcDelegate.setAgentContainerView((PageContainerRecyclerView) bVar.getRefreshableView());
                }
            } else if (viewGroup instanceof PageContainerRecyclerView) {
                this.funcDelegate.setAgentContainerView((PageContainerRecyclerView) viewGroup);
            }
        }
        if (this.topBottomViewDelegate != null) {
            this.topBottomViewDelegate.setRootView(this.rootView);
            this.topBottomViewDelegate.setAgentContainerView(viewGroup);
        }
        if (this.bgMaskFuncDelegate != null) {
            this.bgMaskFuncDelegate.setRootView(this.rootView);
            this.bgMaskFuncDelegate.setAgentContainerView(viewGroup);
        }
    }

    public Context getContext() {
        return this.mContext;
    }

    public void setZFrameLayoutRes(@LayoutRes int i) {
        this.zFrameLayoutResId = i;
    }

    @Override // com.dianping.agentsdk.framework.ab
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25737ae826603ff79e96462a34b46c36", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25737ae826603ff79e96462a34b46c36");
        }
        if (this.isInit) {
            return this.rootView;
        }
        this.isInit = true;
        if (this.recyclerViewRootLayout == null) {
            this.recyclerViewRootLayout = (FrameLayout) LayoutInflater.from(this.mContext).inflate(R.layout.shieldc_pullto2f_pagecontainer_layout, viewGroup, false);
        }
        this.recyclerViewLayout = (FrameLayout) this.recyclerViewRootLayout.findViewById(R.id.recycler_layout);
        this.recyclerViewLayout.removeAllViews();
        if (this.mLinearLayoutManager == null) {
            this.mLinearLayoutManager = new GCLinearLayoutManager(this.mContext);
        }
        if (this.comonPageContainerType == CommonPageContainerType.PULL_TO_X) {
            if (this.pageContainerRecyclerView == null) {
                this.pageContainerRecyclerView = new PageContainerRecyclerView(this.mContext);
            }
            this.pageContainerRecyclerView.setLayoutManager(this.mLinearLayoutManager);
            this.recyclerViewLayout.addView(this.pageContainerRecyclerView, new FrameLayout.LayoutParams(-1, -1));
        } else {
            if (this.mPullToRecyclerView == null) {
                this.mPullToRecyclerView = new b(this.mContext);
            }
            this.mPullToRecyclerView.getRefreshableView().setLayoutManager(this.mLinearLayoutManager);
            this.recyclerViewLayout.addView(this.mPullToRecyclerView, new FrameLayout.LayoutParams(-1, -1));
        }
        if (this.zFrameLayout == null) {
            this.zFrameLayout = new ZFrameLayout(this.mContext);
            this.zFrameLayout.setFocusable(true);
            this.zFrameLayout.setFocusableInTouchMode(true);
        }
        this.recyclerViewLayout.addView(this.zFrameLayout, new FrameLayout.LayoutParams(-1, -1));
        if (this.zFrameLayoutResId != -1) {
            this.zFrameLayout = (ZFrameLayout) this.zFrameLayout.inflate(this.zFrameLayoutResId, this.mContext);
        } else {
            this.zFrameLayout.removeAllViews();
        }
        if (this.customRootView != null && this.recyclerViewParent != null && this.recyclerViewRootLayout != null) {
            this.recyclerViewParent.removeAllViews();
            this.recyclerViewParent.addView(this.recyclerViewRootLayout, new FrameLayout.LayoutParams(-1, -1));
        } else {
            this.customRootView = this.recyclerViewRootLayout;
        }
        this.rootView = new FrameLayout(getContext());
        this.rootView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        relativeLayout.setId(R.id.floatcover_layout);
        relativeLayout.addView(this.customRootView, new RelativeLayout.LayoutParams(-1, -1));
        this.rootView.addView(relativeLayout, new FrameLayout.LayoutParams(-1, -1));
        if (this.comonPageContainerType == CommonPageContainerType.PULL_TO_X) {
            initPageContainerDelegate(this.pageContainerRecyclerView);
        } else {
            initPageContainerDelegate(this.mPullToRecyclerView);
        }
        if (this.pageContainerRecyclerView != null && ShieldEnvironment.INSTANCE.isDebug() && DebugSettings.IS_DEBUGPANEL_SHOW && this.multiClickListener == null) {
            setmRecyclerViewMultiClickEnable();
        }
        return this.rootView;
    }

    @Override // com.dianping.shield.preload.ShieldPreloadInterface
    public void shieldPreload() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c46590968d8f1cc99fea342a229f080d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c46590968d8f1cc99fea342a229f080d");
            return;
        }
        this.pageContainerRecyclerView = new PageContainerRecyclerView(this.mContext);
        this.mPullToRecyclerView = new b(this.mContext);
        this.recyclerViewRootLayout = (FrameLayout) LayoutInflater.from(this.mContext).inflate(R.layout.shieldc_pullto2f_pagecontainer_layout, (ViewGroup) null, false);
    }

    @Override // com.dianping.shield.preload.ShieldPreloadInterface
    public void shieldRecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1693066d5edeb250fea9569a9e13e63e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1693066d5edeb250fea9569a9e13e63e");
            return;
        }
        this.isInit = false;
        if (this.comonPageContainerType == CommonPageContainerType.PULL_TO_X) {
            if (this.pageContainerRecyclerView == null) {
                this.pageContainerRecyclerView = new PageContainerRecyclerView(this.mContext);
            } else {
                this.pageContainerRecyclerView.shieldRecycle();
            }
        } else if (this.mPullToRecyclerView == null) {
            this.mPullToRecyclerView = new b(this.mContext);
        } else {
            this.mPullToRecyclerView.shieldRecycle();
        }
        this.comonPageContainerType = CommonPageContainerType.PULL_TOREFRESH;
        this.mLinearLayoutManager = null;
        this.rootView = null;
        this.customRootView = null;
        if (this.zFrameLayout != null) {
            this.zFrameLayout.removeAllViews();
        }
        this.zFrameLayout = null;
        this.zFrameLayoutResId = -1;
        if (this.recyclerViewLayout != null) {
            this.recyclerViewLayout.removeAllViews();
        }
        this.recyclerViewLayout = null;
        if (this.recyclerViewParent != null) {
            this.recyclerViewParent.removeAllViews();
        }
        this.recyclerViewParent = null;
        this.shieldTitleBarProvider = null;
        this.extraModel = null;
        this.multiClickListener = null;
        this.isPausing = false;
        if (this.anchorViewLayoutParamInfos != null) {
            this.anchorViewLayoutParamInfos.clear();
            this.anchorViewLayoutParamInfos = null;
        }
        if (this.leeDelegate != null) {
            this.leeDelegate.shieldRecycle();
        } else {
            this.leeDelegate = new LEEDelegate(this.mContext);
        }
        if (this.funcDelegate != null) {
            this.funcDelegate.shieldRecycle();
        } else {
            this.funcDelegate = new FuncDelegate(this.mContext);
        }
        if (this.customFuncDelegate != null) {
            this.customFuncDelegate.shieldRecycle();
        } else {
            this.customFuncDelegate = new CustomFuncDelegate(this.mContext);
        }
        if (this.topBottomViewDelegate != null) {
            this.topBottomViewDelegate.shieldRecycle();
        } else {
            this.topBottomViewDelegate = new TopBottomViewDelegate(this.mContext);
        }
        if (this.bgMaskFuncDelegate != null) {
            this.bgMaskFuncDelegate.shieldRecycle();
        } else {
            this.bgMaskFuncDelegate = new BgMaskFuncDelegate(this.mContext);
            this.bgMaskFuncDelegate.setCommonPageContainer(this);
        }
        this.containerMode = new ContainerPullToRefreshMode(this);
        setPullToRefreshMode(PullToRefreshMode.DISABLED);
        if (this.pageContainerThemePackage == null) {
            this.pageContainerThemePackage = PageContainerThemeManager.INSTANCE.getPageContainerThemeCreator().createTheme();
        }
    }

    @Override // com.dianping.agentsdk.framework.ab
    public ViewGroup getAgentContainerView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce5c7b2f9c40be51353d99ac8a31c1e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce5c7b2f9c40be51353d99ac8a31c1e0");
        }
        if (this.comonPageContainerType == CommonPageContainerType.PULL_TO_X) {
            return this.pageContainerRecyclerView;
        }
        if (this.mPullToRecyclerView != null) {
            return this.mPullToRecyclerView.getRefreshableView();
        }
        return null;
    }

    public void setShouldInterceptTouchEventForTopViews(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7edc97cbe617e8b674e0aeb90fb6d93c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7edc97cbe617e8b674e0aeb90fb6d93c");
        } else if (this.mLinearLayoutManager instanceof TopLinearLayoutManager) {
            ((TopLinearLayoutManager) this.mLinearLayoutManager).setInterceptTouchEventForTopViews(z);
        }
    }

    public View getRecyclerViewRootView() {
        return this.rootView;
    }

    public void setRecyclerViewRootView(View view) {
        this.customRootView = view;
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerBgMaskFunc
    public void setRvBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3dca5a11d7bc85efdc062cdfab53e6c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3dca5a11d7bc85efdc062cdfab53e6c2");
        } else if (this.bgMaskFuncDelegate != null) {
            this.bgMaskFuncDelegate.setRvBackgroundColor(i);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerBgMaskFunc
    public void setPageBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "decdfa754c3ab34ffc01a65d81f79e88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "decdfa754c3ab34ffc01a65d81f79e88");
        } else if (this.bgMaskFuncDelegate != null) {
            this.bgMaskFuncDelegate.setPageBackgroundColor(i);
        }
    }

    @Deprecated
    public void clearAllCustomViews() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07318d4d95776afa6babeaa3e35f1c54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07318d4d95776afa6babeaa3e35f1c54");
            return;
        }
        clearPageBackgroundView();
        clearRvBackgroundView();
        clearPageMaskView();
        clearRvMaskView();
    }

    public void clearPageBackgroundView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47dfac903a509ab225df646a8c71bbbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47dfac903a509ab225df646a8c71bbbd");
        } else if (this.bgMaskFuncDelegate != null) {
            this.bgMaskFuncDelegate.clearPageBackgroundView();
        }
    }

    public void clearRvBackgroundView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dac93a47b9eeaaa70d998334eaf2d5c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dac93a47b9eeaaa70d998334eaf2d5c0");
        } else if (this.bgMaskFuncDelegate != null) {
            this.bgMaskFuncDelegate.clearRvBackgroundView();
        }
    }

    public void clearPageMaskView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d3d64a78148cb19e0e5ba05517bb3e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d3d64a78148cb19e0e5ba05517bb3e9");
        } else if (this.bgMaskFuncDelegate != null) {
            this.bgMaskFuncDelegate.clearPageMaskView();
        }
    }

    public void clearRvMaskView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc97da5b39381b68514fcbb559cb1e59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc97da5b39381b68514fcbb559cb1e59");
        } else if (this.bgMaskFuncDelegate != null) {
            this.bgMaskFuncDelegate.clearRvMaskView();
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerBgMaskFunc
    public void setPageBackgroundView(View view, FrameLayout.LayoutParams layoutParams) {
        Object[] objArr = {view, layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca88666c26aa7d13cbed9e5360760558", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca88666c26aa7d13cbed9e5360760558");
        } else if (this.bgMaskFuncDelegate != null) {
            this.bgMaskFuncDelegate.setPageBackgroundView(view, layoutParams);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerBgMaskFunc
    public void setRvBackgroundView(View view, View view2, FrameLayout.LayoutParams layoutParams) {
        Object[] objArr = {view, view2, layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "869dbdb330c1b7665b9bdb3a2cca3528", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "869dbdb330c1b7665b9bdb3a2cca3528");
        } else if (this.bgMaskFuncDelegate != null) {
            this.bgMaskFuncDelegate.setRvBackgroundView(view, view2, layoutParams);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerBgMaskFunc
    public void setRvBackgroundViews(View view, FrameLayout.LayoutParams layoutParams) {
        Object[] objArr = {view, layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5591f59905ff26cf243cda9424762eb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5591f59905ff26cf243cda9424762eb7");
        } else if (this.bgMaskFuncDelegate != null) {
            this.bgMaskFuncDelegate.setRvBackgroundViews(view, layoutParams);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerBgMaskFunc
    public void setPageMaskView(View view, FrameLayout.LayoutParams layoutParams) {
        Object[] objArr = {view, layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af5369a7bb271812914c35fdb99d2573", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af5369a7bb271812914c35fdb99d2573");
        } else if (this.bgMaskFuncDelegate != null) {
            this.bgMaskFuncDelegate.setPageMaskView(view, layoutParams);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerBgMaskFunc
    public void setRvMaskView(View view, View view2, FrameLayout.LayoutParams layoutParams) {
        Object[] objArr = {view, view2, layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e365793f1cd764c5568175dd3008b689", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e365793f1cd764c5568175dd3008b689");
        } else if (this.bgMaskFuncDelegate != null) {
            this.bgMaskFuncDelegate.setRvMaskView(view, view2, layoutParams);
        }
    }

    public FrameLayout getPageContainerRootLayout() {
        return this.recyclerViewRootLayout;
    }

    @Override // com.dianping.agentsdk.framework.ab
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e032b0129d9d1608cbb2062f6e74d495", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e032b0129d9d1608cbb2062f6e74d495");
            return;
        }
        if (this.pageContainerRecyclerView != null && DebugSettings.IS_DEBUGPANEL_SHOW && ShieldEnvironment.INSTANCE.isDebug()) {
            if (this.isPausing && this.multiClickListener != null) {
                WhiteBoardDataStoreSnapshot.getSingleton().onSynchronize(getContext());
            }
            if (this.multiClickListener == null) {
                setmRecyclerViewMultiClickEnable();
            }
        }
        this.isPausing = false;
    }

    private void setmRecyclerViewMultiClickEnable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7cd1244aa4ff66cd7fb64ed2dba84a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7cd1244aa4ff66cd7fb64ed2dba84a0");
            return;
        }
        this.multiClickListener = new OnRecyclerMultiClickListener(this.pageContainerRecyclerView) { // from class: com.dianping.shield.component.widgets.container.CommonPageContainer.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.component.widgets.container.CommonPageContainer.OnRecyclerMultiClickListener
            public void OnMutipClick() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "14465240cb4f5cfae7ccab9b39be2549", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "14465240cb4f5cfae7ccab9b39be2549");
                } else if (DebugSettings.IS_DEBUGPANEL_SHOW) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        WhiteBoardDataStoreSnapshot.getSingleton().onCreate();
                    }
                    super.OnMutipClick();
                }
            }
        };
        this.pageContainerRecyclerView.addOnItemTouchListener(this.multiClickListener);
    }

    @Override // com.dianping.agentsdk.framework.ab
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5675bcb0d2696a285df882707fd83bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5675bcb0d2696a285df882707fd83bf");
        } else {
            this.isPausing = true;
        }
    }

    @Override // com.dianping.agentsdk.framework.ab
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f37f5a6d82149519887d714dff2903a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f37f5a6d82149519887d714dff2903a1");
            return;
        }
        if (this.leeDelegate != null) {
            this.leeDelegate.onDestroy();
        }
        if (this.funcDelegate != null) {
            this.funcDelegate.onDestroy();
        }
        if (this.customFuncDelegate != null) {
            this.customFuncDelegate.onDestroy();
        }
        if (this.topBottomViewDelegate != null) {
            this.topBottomViewDelegate.onDestroy();
        }
        if (this.bgMaskFuncDelegate != null) {
            this.bgMaskFuncDelegate.onDestroy();
        }
        if (this.pageContainerRecyclerView != null) {
            this.pageContainerRecyclerView.resetPageContainerRecyclerView();
        }
        if (this.mPullToRecyclerView != null) {
            b bVar = this.mPullToRecyclerView;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect3, false, "c2ff46d162c1e04b2c86f28fce98bacd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect3, false, "c2ff46d162c1e04b2c86f28fce98bacd");
            } else if (bVar.f != null) {
                bVar.f.releaseAnim();
            }
        }
        if (this.containerMode instanceof ContainerPullToRefreshMode) {
            ((ContainerPullToRefreshMode) this.containerMode).onDestroy();
        }
        if (this.multiClickListener != null && this.pageContainerRecyclerView != null) {
            this.pageContainerRecyclerView.removeOnItemTouchListener(this.multiClickListener);
        }
        this.isPausing = false;
    }

    @Override // com.dianping.shield.bridge.feature.PageContainerCommonInterface
    public FrameLayout getRecyclerViewLayout() {
        return this.recyclerViewLayout;
    }

    public void setRecyclerViewClipChildren(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4fae11633f933835cffe48538bd284d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4fae11633f933835cffe48538bd284d");
            return;
        }
        int childCount = this.recyclerViewLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (this.recyclerViewLayout.getChildAt(i) instanceof b) {
                RecyclerView refreshableView = ((b) this.recyclerViewLayout.getChildAt(i)).getRefreshableView();
                refreshableView.setClipChildren(z);
                refreshableView.setClipToPadding(z);
            } else if (this.recyclerViewLayout.getChildAt(i) instanceof RecyclerView) {
                RecyclerView recyclerView = (RecyclerView) this.recyclerViewLayout.getChildAt(i);
                recyclerView.setClipChildren(z);
                recyclerView.setClipToPadding(z);
            }
        }
    }

    public void setMaxFlingVelocity(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85417012d49a841c1a533b4b219f1716", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85417012d49a841c1a533b4b219f1716");
        } else if (this.pageContainerRecyclerView != null) {
            PageContainerRecyclerView pageContainerRecyclerView = this.pageContainerRecyclerView;
            int a = aq.a(getContext(), f);
            Object[] objArr2 = {pageContainerRecyclerView, Integer.valueOf(a)};
            ChangeQuickRedirect changeQuickRedirect3 = aq.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "8a5ad66f4b0e380b14a412440271db03", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "8a5ad66f4b0e380b14a412440271db03");
                return;
            }
            try {
                Class a2 = aq.a(pageContainerRecyclerView.getClass());
                if (a2 != null) {
                    Field declaredField = a2.getDeclaredField("mMaxFlingVelocity");
                    declaredField.setAccessible(true);
                    declaredField.set(pageContainerRecyclerView, Integer.valueOf(a));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.dianping.agentsdk.pagecontainer.j
    public void setOnTopViewLayoutChangeListener(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31fce6665a6e3bf259cfd2333c20ce64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31fce6665a6e3bf259cfd2333c20ce64");
        } else if (this.mLinearLayoutManager instanceof TopLinearLayoutManager) {
            ((TopLinearLayoutManager) this.mLinearLayoutManager).addOnTopViewLayoutChangeListener(cVar);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerLayoutManagerFunc
    public int findFirstVisibleItemPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "218add9f1db8759a8fa223164ee58127", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "218add9f1db8759a8fa223164ee58127")).intValue() : this.funcDelegate.findFirstVisibleItemPosition();
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerLayoutManagerFunc
    public int findFirstCompletelyVisibleItemPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c5164dc16cef4ec6241c4e083958a1e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c5164dc16cef4ec6241c4e083958a1e")).intValue() : this.funcDelegate.findFirstCompletelyVisibleItemPosition();
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerLayoutManagerFunc
    public int findLastVisibleItemPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3fbd8d1f47453fbe98007dbc8cdf1332", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3fbd8d1f47453fbe98007dbc8cdf1332")).intValue() : this.funcDelegate.findLastVisibleItemPosition();
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerLayoutManagerFunc
    public int findLastCompletelyVisibleItemPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d3a37a653a15fb53233b5086e832d86", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d3a37a653a15fb53233b5086e832d86")).intValue() : this.funcDelegate.findLastCompletelyVisibleItemPosition();
    }

    @Override // com.dianping.shield.bridge.feature.LayoutPositionFuctionInterface
    public int getChildCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7559359c32fda7fc9e82dc111078f725", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7559359c32fda7fc9e82dc111078f725")).intValue() : this.funcDelegate.getChildCount();
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerLayoutManagerFunc
    public View getChildAt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7e4aa1a462652582580a6e32525b72b", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7e4aa1a462652582580a6e32525b72b") : this.funcDelegate.getChildAt(i);
    }

    @Override // com.dianping.shield.bridge.feature.LayoutPositionFuctionInterface
    @Nullable
    public View getChildAtIndex(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d945fc356bbc263caf5f7595f5ac943", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d945fc356bbc263caf5f7595f5ac943") : this.funcDelegate.getChildAtIndex(i, z);
    }

    @Override // com.dianping.shield.bridge.feature.LayoutPositionFuctionInterface
    @Nullable
    public View findViewAtPosition(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "564b5ed4aef3ca23907832889c5ef566", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "564b5ed4aef3ca23907832889c5ef566") : this.funcDelegate.findViewAtPosition(i, z);
    }

    @Override // com.dianping.shield.bridge.feature.LayoutPositionFuctionInterface
    @Nullable
    public int getChildAdapterPosition(@NotNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a153f4520b6ea50f76b4f074fbb2b3e0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a153f4520b6ea50f76b4f074fbb2b3e0")).intValue() : this.funcDelegate.getChildAdapterPosition(view);
    }

    @Override // com.dianping.shield.bridge.feature.ViewRectInterface
    @Nullable
    public Rect getViewParentRect(@Nullable View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2475767beccf392e1a17f258e9af558f", RobustBitConfig.DEFAULT_VALUE) ? (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2475767beccf392e1a17f258e9af558f") : this.funcDelegate.getViewParentRect(view);
    }

    @Override // com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
    public void scrollToPositionWithOffset(int i, int i2, boolean z, float f) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4b4b68661ca3b045b855337790cb131", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4b4b68661ca3b045b855337790cb131");
        } else {
            this.funcDelegate.scrollToPositionWithOffset(i, i2, z, f);
        }
    }

    @Override // com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
    public void scrollToPositionWithOffset(int i, int i2, boolean z, float f, @Nullable ArrayList<com.dianping.agentsdk.sectionrecycler.layoutmanager.a> arrayList) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Float.valueOf(f), arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d57f9f2dc86ae44898796bf55290481b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d57f9f2dc86ae44898796bf55290481b");
        } else {
            this.funcDelegate.scrollToPositionWithOffset(i, i2, z, f, arrayList);
        }
    }

    @Override // com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
    public void scrollToPositionWithOffset(int i, int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03aea4f978d22fe85ca8df68bdb680aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03aea4f978d22fe85ca8df68bdb680aa");
        } else {
            this.funcDelegate.scrollToPositionWithOffset(i, i2, z);
        }
    }

    @Override // com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
    public void scrollToPositionWithOffset(int i, int i2, boolean z, @Nullable ArrayList<com.dianping.agentsdk.sectionrecycler.layoutmanager.a> arrayList) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb6f04416aec744798ba00f9d648a98a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb6f04416aec744798ba00f9d648a98a");
        } else {
            this.funcDelegate.scrollToPositionWithOffset(i, i2, z, arrayList);
        }
    }

    @Override // com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
    public int findFirstVisibleItemPosition(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1671ace52bdf9b5a8f4a3b96ace36b90", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1671ace52bdf9b5a8f4a3b96ace36b90")).intValue() : this.funcDelegate.findFirstVisibleItemPosition(z);
    }

    @Override // com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
    public int findLastVisibleItemPosition(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9216a36d1021fd2d52a58cba6f71e94", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9216a36d1021fd2d52a58cba6f71e94")).intValue() : this.funcDelegate.findLastVisibleItemPosition(z);
    }

    @Override // com.dianping.shield.bridge.feature.ItemViewInterface
    public View getItemView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5af86e1beb92debbced9dd71a28e45d4", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5af86e1beb92debbced9dd71a28e45d4") : this.funcDelegate.getItemView(view);
    }

    @Override // com.dianping.shield.bridge.feature.ItemViewInterface
    public int getItemViewTop(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ec1655d22105d2329faf14e7975217c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ec1655d22105d2329faf14e7975217c")).intValue() : this.funcDelegate.getItemViewTop(view);
    }

    @Override // com.dianping.shield.bridge.feature.ItemViewInterface
    public int getItemViewBottom(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93775dd424b5efc83497bbac9748e5d9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93775dd424b5efc83497bbac9748e5d9")).intValue() : this.funcDelegate.getItemViewBottom(view);
    }

    @Override // com.dianping.shield.bridge.feature.ItemViewInterface
    public int getItemViewLeft(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca1a3ba03a3395e0ab0966491e930f60", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca1a3ba03a3395e0ab0966491e930f60")).intValue() : this.funcDelegate.getItemViewLeft(view);
    }

    @Override // com.dianping.shield.bridge.feature.ItemViewInterface
    public int getItemViewRight(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4421f06178e58af91795e75a78cc0a59", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4421f06178e58af91795e75a78cc0a59")).intValue() : this.funcDelegate.getItemViewRight(view);
    }

    @Override // com.dianping.shield.bridge.feature.ItemViewInterface
    public int getItemViewWidth(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a0050289cdcc6c5667dd8bdb3bb8da9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a0050289cdcc6c5667dd8bdb3bb8da9")).intValue() : this.funcDelegate.getItemViewWidth(view);
    }

    @Override // com.dianping.shield.bridge.feature.ItemViewInterface
    public int getItemViewHeight(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f790c597c5ffe0e7f9251c86dd559b54", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f790c597c5ffe0e7f9251c86dd559b54")).intValue() : this.funcDelegate.getItemViewHeight(view);
    }

    @Override // com.dianping.shield.feature.IFocusChildScrollWhenBack
    public void setFocusChildScrollOnScreenWhenBack(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d689837a95868b97607b6a3824d655b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d689837a95868b97607b6a3824d655b");
        } else {
            this.funcDelegate.setFocusChildScrollOnScreenWhenBack(z);
        }
    }

    @Override // com.dianping.shield.node.itemcallbacks.SectionBgViewMapCallback
    public void setSectionBgViewMap(@NotNull SparseArray<com.dianping.agentsdk.framework.g> sparseArray) {
        Object[] objArr = {sparseArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8f0cf334b281215110c08385f6e5d09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8f0cf334b281215110c08385f6e5d09");
        } else if (this.bgMaskFuncDelegate != null) {
            this.bgMaskFuncDelegate.setSectionBgViewMap(sparseArray);
        }
    }

    @Override // com.dianping.shield.node.itemcallbacks.LayoutParamCalAndContentYCallback
    public void addContentScrollOffsetListener(@NotNull ContentOffsetListener contentOffsetListener) {
        Object[] objArr = {contentOffsetListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea192a8e399333b6668ecf18afe0c6f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea192a8e399333b6668ecf18afe0c6f0");
        } else if (this.customFuncDelegate != null) {
            this.customFuncDelegate.addContentOffsetListener(contentOffsetListener);
        }
    }

    @Override // com.dianping.shield.node.itemcallbacks.LayoutParamCalAndContentYCallback
    public void addLayoutParamCalFinishCallBack(com.dianping.agentsdk.framework.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba9b0c047a7a6329bbff29d439653c73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba9b0c047a7a6329bbff29d439653c73");
        } else if (eVar == null || eVar.c == null) {
        } else {
            if (this.anchorViewLayoutParamInfos == null) {
                this.anchorViewLayoutParamInfos = new HashMap<>(2);
                if (getAgentContainerView() instanceof PageContainerRecyclerView) {
                    ((PageContainerRecyclerView) getAgentContainerView()).addOnTopParamsChangeListener(new com.dianping.agentsdk.pagecontainer.b() { // from class: com.dianping.shield.component.widgets.container.CommonPageContainer.2
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // com.dianping.agentsdk.pagecontainer.b
                        public void OnTopParamsChange(boolean z) {
                            Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "13b4ffe93db152e7068e06a86d4bc5f8", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "13b4ffe93db152e7068e06a86d4bc5f8");
                            } else if (z) {
                                for (com.dianping.agentsdk.framework.e eVar2 : CommonPageContainer.this.anchorViewLayoutParamInfos.values()) {
                                    if (eVar2 != null && eVar2.c != null && (CommonPageContainer.this.getAgentContainerView() instanceof RecyclerView)) {
                                        CommonPageContainer.this.calAnchorLayoutParam(eVar2);
                                    }
                                }
                            }
                        }
                    });
                }
            }
            com.dianping.agentsdk.framework.e eVar2 = this.anchorViewLayoutParamInfos.get(eVar.c);
            if (eVar2 == null) {
                this.anchorViewLayoutParamInfos.put(eVar.c, eVar);
            } else if (eVar2.equals(eVar)) {
            } else {
                this.anchorViewLayoutParamInfos.put(eVar.c, eVar);
                if (eVar2.e != eVar.e || aq.a(eVar2.b, eVar.b)) {
                    calAnchorLayoutParam(eVar);
                }
            }
        }
    }

    @Override // com.dianping.shield.node.itemcallbacks.LayoutParamCalAndContentYCallback
    public void removeContentScrollOffsetListener(@NotNull ContentOffsetListener contentOffsetListener) {
        Object[] objArr = {contentOffsetListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3e5dfad8593f4eff2788930c90afe59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3e5dfad8593f4eff2788930c90afe59");
        } else if (this.customFuncDelegate != null) {
            this.customFuncDelegate.removeContentOffsetListener(contentOffsetListener);
        }
    }

    @Override // com.dianping.shield.node.itemcallbacks.LayoutParamCalAndContentYCallback
    public void removeLayoutParamCalFinishCallBack(@NotNull e.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11bbf974ed2807f6b4c96ae392d8f567", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11bbf974ed2807f6b4c96ae392d8f567");
        } else if (this.anchorViewLayoutParamInfos != null) {
            this.anchorViewLayoutParamInfos.remove(aVar);
        }
    }

    @Override // com.dianping.shield.feature.LoadingAndLoadingMoreCreator
    public View loadingView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88db1852a78c2bbb17521b418f739a95", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88db1852a78c2bbb17521b418f739a95");
        }
        if (this.leeDelegate != null) {
            return this.leeDelegate.loadingView();
        }
        return LoadingDefaultCreator.INSTANCE.loadingView(this.mContext);
    }

    @Override // com.dianping.shield.feature.LoadingAndLoadingMoreCreator
    public View loadingFailedView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24bc3bac818688e21ae75503f513d7f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24bc3bac818688e21ae75503f513d7f9");
        }
        if (this.leeDelegate != null) {
            return this.leeDelegate.loadingFailedView();
        }
        return LoadingDefaultCreator.INSTANCE.loadingFailedView(this.mContext);
    }

    @Override // com.dianping.shield.feature.LoadingAndLoadingMoreCreator
    public View emptyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6a388d3b4a4695a60d1d377bfbfce62", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6a388d3b4a4695a60d1d377bfbfce62");
        }
        if (this.leeDelegate != null) {
            return this.leeDelegate.emptyView();
        }
        return LoadingDefaultCreator.INSTANCE.emptyView(this.mContext);
    }

    @Override // com.dianping.shield.feature.LoadingAndLoadingMoreCreator
    public View loadingMoreView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56607670673620b427b192c6bdd79dec", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56607670673620b427b192c6bdd79dec");
        }
        if (this.leeDelegate != null) {
            return this.leeDelegate.loadingMoreView();
        }
        return LoadingDefaultCreator.INSTANCE.loadingMoreView(this.mContext);
    }

    @Override // com.dianping.shield.feature.LoadingAndLoadingMoreCreator
    public View loadingMoreFailedView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b23ea77682613767fa6c0f470885682", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b23ea77682613767fa6c0f470885682");
        }
        if (this.leeDelegate != null) {
            return this.leeDelegate.loadingMoreFailedView();
        }
        return LoadingDefaultCreator.INSTANCE.loadingMoreFailedView(this.mContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void calAnchorLayoutParam(com.dianping.agentsdk.framework.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50833a11e3e29bd2787fd48f6fe748b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50833a11e3e29bd2787fd48f6fe748b3");
        } else if (eVar == null || eVar.c == null || eVar.e < 0) {
        } else {
            eVar.c.onLayoutParamCalFinish(eVar.d, this.bgMaskFuncDelegate.handleAnchorViewParam(eVar.e, eVar.b));
        }
    }

    public int getHeaderCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0579b40ef857dc4a6ed6842215b7eb5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0579b40ef857dc4a6ed6842215b7eb5")).intValue();
        }
        if (this.comonPageContainerType == CommonPageContainerType.PULL_TO_X && (this.pageContainerRecyclerView instanceof PageContainerRecyclerView)) {
            return this.pageContainerRecyclerView.getHeaderCounts();
        }
        return 0;
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerFunc
    public void setItemAnimationEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ffd8a13d7a218c97295f56294ea5c962", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ffd8a13d7a218c97295f56294ea5c962");
        } else if (this.funcDelegate != null) {
            this.funcDelegate.setItemAnimationEnabled(z);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerCustomFunc
    public void setOnScrollChangedListener(PageContainerRecyclerView.OnScrollChangedListener onScrollChangedListener) {
        Object[] objArr = {onScrollChangedListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3fae13ef87ce106ef53e06504a310f2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3fae13ef87ce106ef53e06504a310f2d");
        } else if (this.customFuncDelegate != null) {
            this.customFuncDelegate.setOnScrollChangedListener(onScrollChangedListener);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerCustomFunc
    public void setPageContainerBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "421e7a9a539aeecb47f34a34a8500aa4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "421e7a9a539aeecb47f34a34a8500aa4");
        } else if (this.customFuncDelegate != null) {
            this.customFuncDelegate.setPageContainerBackgroundColor(i);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerCustomFunc
    public void addContentOffsetListener(ContentOffsetListener contentOffsetListener) {
        Object[] objArr = {contentOffsetListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe30e300103288339c5344010d9ea2c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe30e300103288339c5344010d9ea2c8");
        } else if (this.customFuncDelegate == null || contentOffsetListener == null) {
        } else {
            this.customFuncDelegate.addContentOffsetListener(contentOffsetListener);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerCustomFunc
    public void removeContentOffsetListener(ContentOffsetListener contentOffsetListener) {
        Object[] objArr = {contentOffsetListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bdb67477db5a4253f817a58fd8a3a5f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bdb67477db5a4253f817a58fd8a3a5f1");
        } else if (this.customFuncDelegate == null || contentOffsetListener == null) {
        } else {
            this.customFuncDelegate.removeContentOffsetListener(contentOffsetListener);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerCustomFunc
    public void setContentInset(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "655852a14a622869335a28f917dcdb30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "655852a14a622869335a28f917dcdb30");
        } else if (this.customFuncDelegate != null) {
            this.customFuncDelegate.setContentInset(i);
        }
    }

    public void setTitlebarProviderInterface(ScTitleBarProviderInterface scTitleBarProviderInterface) {
        Object[] objArr = {scTitleBarProviderInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84e1931b57ce135cbff26adec5fb87dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84e1931b57ce135cbff26adec5fb87dd");
            return;
        }
        this.shieldTitleBarProvider = scTitleBarProviderInterface;
        if (this.customFuncDelegate == null || this.shieldTitleBarProvider == null) {
            return;
        }
        this.customFuncDelegate.setTitleBar(this.shieldTitleBarProvider.getScTitleBar());
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerCustomFunc
    public void updateHeaderView(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9bd823f86707361feca4aeb4f16aee8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9bd823f86707361feca4aeb4f16aee8");
        } else if (this.customFuncDelegate != null) {
            this.customFuncDelegate.updateHeaderView(z);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerCustomFunc
    public void setUpdateDuration(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb9a2e19463a8987e56dd09de5cdca22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb9a2e19463a8987e56dd09de5cdca22");
        } else if (this.customFuncDelegate != null) {
            this.customFuncDelegate.setUpdateDuration(i);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerCustomFunc
    public void setHeaderViewOrgHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08674be043d61a5d12f75d63393817ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08674be043d61a5d12f75d63393817ad");
        } else if (this.customFuncDelegate != null) {
            this.customFuncDelegate.setHeaderViewOrgHeight(i);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerCustomFunc
    public boolean isDraging() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "870bbd7d682d308d889e4f47cb96c143", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "870bbd7d682d308d889e4f47cb96c143")).booleanValue();
        }
        if (this.customFuncDelegate != null) {
            return this.customFuncDelegate.isDraging();
        }
        return false;
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerFunc
    public void scrollToPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3152c8b4038c31d7f7b03a96c6f7113c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3152c8b4038c31d7f7b03a96c6f7113c");
        } else if (this.funcDelegate != null) {
            this.funcDelegate.scrollToPosition(i);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerFunc
    public void smoothScrollToPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed64aa841a961fb14e307527115dd3e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed64aa841a961fb14e307527115dd3e9");
        } else if (this.funcDelegate != null) {
            this.funcDelegate.smoothScrollToPosition(i);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerFunc, com.dianping.shield.feature.PositionInfoInterface
    public int getScrollY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2fac794b3cb0c183056a6dd4f18d8dc7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2fac794b3cb0c183056a6dd4f18d8dc7")).intValue();
        }
        if (this.funcDelegate != null) {
            return this.funcDelegate.getScrollY();
        }
        return 0;
    }

    @Override // com.dianping.agentsdk.pagecontainer.d, com.dianping.shield.component.widgets.container.IPageContainerFunc
    public void addScrollListener(RecyclerView.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23f6bddc2b8892c9ac6c5050cfedbff2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23f6bddc2b8892c9ac6c5050cfedbff2");
        } else if (this.funcDelegate == null || kVar == null) {
        } else {
            this.funcDelegate.addScrollListener(kVar);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerFunc
    public void addFlingListener(RecyclerView.i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1938db2ed8930ff3087e8fb7249d4906", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1938db2ed8930ff3087e8fb7249d4906");
        } else if (this.funcDelegate == null || iVar == null) {
        } else {
            this.funcDelegate.addFlingListener(iVar);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerFunc
    public void addDragStatusListener(OnDragStatusListener onDragStatusListener) {
        Object[] objArr = {onDragStatusListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "255e75b8ae060e9c7c45ceb05d787214", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "255e75b8ae060e9c7c45ceb05d787214");
        } else if (this.funcDelegate == null || onDragStatusListener == null) {
        } else {
            this.funcDelegate.addDragStatusListener(onDragStatusListener);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerFunc
    public void setDidInterceptListener(OnDidInterceptTouchListener onDidInterceptTouchListener) {
        Object[] objArr = {onDidInterceptTouchListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0500ec73cdc2efd08ded1c047e028a5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0500ec73cdc2efd08ded1c047e028a5c");
        } else if (this.funcDelegate == null || onDidInterceptTouchListener == null) {
        } else {
            this.funcDelegate.setDidInterceptListener(onDidInterceptTouchListener);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerFunc
    public OnDidInterceptTouchListener getDidInterceptListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf2655d983d5cc872c4518dc04ec97aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (OnDidInterceptTouchListener) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf2655d983d5cc872c4518dc04ec97aa");
        }
        if (this.funcDelegate != null) {
            return this.funcDelegate.getDidInterceptListener();
        }
        return null;
    }

    @Override // com.dianping.agentsdk.pagecontainer.d, com.dianping.shield.component.widgets.container.IPageContainerFunc
    public void removeScrollListener(RecyclerView.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc4ef18f8cb7d057c54e13170dcbc1b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc4ef18f8cb7d057c54e13170dcbc1b7");
        } else if (this.funcDelegate == null || kVar == null) {
        } else {
            this.funcDelegate.removeScrollListener(kVar);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerFunc
    public void removeFlingListener(RecyclerView.i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec8cbe9003f790223c5716a3c8317b23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec8cbe9003f790223c5716a3c8317b23");
        } else if (this.funcDelegate == null || iVar == null) {
        } else {
            this.funcDelegate.removeFlingListener(iVar);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerFunc
    public void addOnTouchListener(View.OnTouchListener onTouchListener) {
        Object[] objArr = {onTouchListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8e9f30344190d2f5a993c65b8b117d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8e9f30344190d2f5a993c65b8b117d3");
        } else if (this.funcDelegate == null || onTouchListener == null) {
        } else {
            this.funcDelegate.addOnTouchListener(onTouchListener);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerFunc
    public void addOnInterceptTouchListener(OnInterceptTouchListener onInterceptTouchListener) {
        Object[] objArr = {onInterceptTouchListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34059d1feccfd6c5257b75ae99677329", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34059d1feccfd6c5257b75ae99677329");
        } else if (this.funcDelegate == null || onInterceptTouchListener == null) {
        } else {
            this.funcDelegate.addOnInterceptTouchListener(onInterceptTouchListener);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerFunc
    public void setDescendantFocusability(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0528375ab74db74f15526a40fcf354f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0528375ab74db74f15526a40fcf354f3");
        } else if (this.funcDelegate != null) {
            this.funcDelegate.setDescendantFocusability(i);
        }
    }

    public void setLoadDataErrorView(LoadErrorEmptyView.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37f8b94607bda8542ef14201c2a634ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37f8b94607bda8542ef14201c2a634ae");
        } else if (this.leeDelegate != null) {
            this.leeDelegate.setLoadDataErrorView(aVar);
        }
    }

    public void setLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e6b464296557ce4ae90b0950445d220", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e6b464296557ce4ae90b0950445d220");
        } else if (this.leeDelegate != null) {
            this.leeDelegate.setLoading();
        }
    }

    public void setLoadingView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83dad95f5fb0e169bae9304ee6d0182a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83dad95f5fb0e169bae9304ee6d0182a");
        } else if (this.leeDelegate != null) {
            this.leeDelegate.setLoadingView(view);
        }
    }

    @Override // com.dianping.shield.bridge.feature.PageContainerRefreshInterface
    public void setError() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd8c7100e7ad3d8f20bf595061c2c048", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd8c7100e7ad3d8f20bf595061c2c048");
        } else if (this.leeDelegate != null) {
            this.leeDelegate.setError();
        }
    }

    public void setErrorView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6de10f35eaf008a46bb26783bdeb235d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6de10f35eaf008a46bb26783bdeb235d");
        } else if (this.leeDelegate != null) {
            this.leeDelegate.setErrorView(view);
        }
    }

    public void setErrorText(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1aa292607237eea0f30a1f8c271878b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1aa292607237eea0f30a1f8c271878b0");
        } else if (this.leeDelegate != null) {
            this.leeDelegate.setErrorText(str);
        }
    }

    public void setEmpty() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5419a7aeb751bb246582558ed22e3e00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5419a7aeb751bb246582558ed22e3e00");
        } else if (this.leeDelegate != null) {
            this.leeDelegate.setEmpty();
        }
    }

    public void setEmptyView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e208ee59ff3cbc7ac0e08051452d6860", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e208ee59ff3cbc7ac0e08051452d6860");
        } else if (this.leeDelegate != null) {
            this.leeDelegate.setEmptyView(view);
        }
    }

    @Override // com.dianping.shield.bridge.feature.PageContainerRefreshInterface
    public void setSuccess() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dceb20fe797a042cb11fecdaf9ff72a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dceb20fe797a042cb11fecdaf9ff72a4");
            return;
        }
        if (this.leeDelegate != null) {
            this.leeDelegate.setSuccess();
        }
        if (this.containerMode instanceof ContainerPullToRefreshMode) {
            ((ContainerPullToRefreshMode) this.containerMode).setSuccess();
        }
    }

    @Override // com.dianping.shield.bridge.feature.PageContainerRefreshInterface
    public void simulateDragRefresh() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b37a1a448442c602032395841d4cb231", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b37a1a448442c602032395841d4cb231");
        } else if (this.containerMode instanceof ContainerPullToRefreshMode) {
            ((ContainerPullToRefreshMode) this.containerMode).setLoading();
        }
    }

    @Override // com.dianping.shield.bridge.feature.PageScrollEnabledInterface
    public void setScrollEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96c4a2164059d2b44adaa6aec7e08b10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96c4a2164059d2b44adaa6aec7e08b10");
        } else if (this.mLinearLayoutManager instanceof LinearLayoutManagerWithSmoothOffset) {
            ((LinearLayoutManagerWithSmoothOffset) this.mLinearLayoutManager).setScrollEnabled(z);
        } else if (this.mLinearLayoutManager instanceof ShieldStaggeredGridLayoutManager) {
            ((ShieldStaggeredGridLayoutManager) this.mLinearLayoutManager).setScrollEnabled(z);
        }
    }

    @Override // com.dianping.shield.bridge.feature.LinearLayoutManagerExtraSpaceInterface
    public void setExtraLayoutSpace(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "026bd8f6b807ce913f6d326b2e9eed6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "026bd8f6b807ce913f6d326b2e9eed6b");
        } else if (this.mLinearLayoutManager instanceof LinearLayoutManagerExtraSpaceInterface) {
            ((LinearLayoutManagerExtraSpaceInterface) this.mLinearLayoutManager).setExtraLayoutSpace(i);
        }
    }

    public void onRefreshComplete() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f701f9367e9377a5c6d0b37e51aae5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f701f9367e9377a5c6d0b37e51aae5a");
            return;
        }
        if (this.leeDelegate != null) {
            this.leeDelegate.onRefreshComplete();
        }
        if (this.containerMode instanceof ContainerPullToRefreshMode) {
            ((ContainerPullToRefreshMode) this.containerMode).onRefreshComplete();
        }
    }

    public void setLoadRetryListener(LoadErrorEmptyView.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "acfbd05d22577d276a46227c67efcd07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "acfbd05d22577d276a46227c67efcd07");
        } else if (this.leeDelegate != null) {
            this.leeDelegate.setLoadRetryListener(bVar);
        }
    }

    public void setOnRefreshListener(final OnRefreshListener onRefreshListener) {
        Object[] objArr = {onRefreshListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce1e7df7219680a63e17335b88c973e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce1e7df7219680a63e17335b88c973e2");
            return;
        }
        if (this.leeDelegate != null) {
            this.leeDelegate.setOnRefreshListener(onRefreshListener);
        }
        if (this.containerMode instanceof ContainerPullToRefreshMode) {
            ((ContainerPullToRefreshMode) this.containerMode).setOnRefreshListener(new OnRefreshListener() { // from class: com.dianping.shield.component.widgets.container.CommonPageContainer.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.shield.component.widgets.container.CommonPageContainer.OnRefreshListener
                public void onRefresh(ViewGroup viewGroup) {
                    Object[] objArr2 = {viewGroup};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b2fe6464c2926e2343d7ffcb58684b92", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b2fe6464c2926e2343d7ffcb58684b92");
                    } else if (onRefreshListener != null) {
                        onRefreshListener.onRefresh(CommonPageContainer.this.pageContainerRecyclerView);
                    }
                }
            });
        }
    }

    public View getRefreshView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47b4f20549e65783a8c35f128a7c581f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47b4f20549e65783a8c35f128a7c581f");
        }
        if (this.customFuncDelegate != null) {
            return this.customFuncDelegate.getRefreshView();
        }
        return null;
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerCustomFunc
    public void setRefreshView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85e5589a93e1559b578cbbf82a2396cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85e5589a93e1559b578cbbf82a2396cd");
        } else if (this.customFuncDelegate != null) {
            this.customFuncDelegate.setRefreshView(view);
        }
    }

    public void setRefreshCustomizedView(@Nullable View view, @Nullable FrameLayout.LayoutParams layoutParams) {
        Object[] objArr = {view, layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "426782e87ef5fd46e66511b5d52a47ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "426782e87ef5fd46e66511b5d52a47ae");
        } else if (this.containerMode instanceof ContainerPullToRefreshMode) {
            ((ContainerPullToRefreshMode) this.containerMode).setRefreshCustomizedView(view, layoutParams);
        }
    }

    public void setRefreshHeight(@Nullable Integer num) {
        Object[] objArr = {num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb956891e7f863628bdb113437986464", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb956891e7f863628bdb113437986464");
        } else if (this.containerMode instanceof ContainerPullToRefreshMode) {
            ((ContainerPullToRefreshMode) this.containerMode).setRefreshHeight(num == null ? ((ContainerPullToRefreshMode) this.containerMode).getRefreshHeight() : num.intValue());
        }
    }

    public void setRefreshStatusChangedListener(@Nullable OnDragRefreshStatusChangedListener onDragRefreshStatusChangedListener) {
        Object[] objArr = {onDragRefreshStatusChangedListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91d3cacae363d754e62da52f97daf019", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91d3cacae363d754e62da52f97daf019");
        } else if (this.containerMode instanceof ContainerPullToRefreshMode) {
            ((ContainerPullToRefreshMode) this.containerMode).setRefreshStatusChangedListener(onDragRefreshStatusChangedListener);
        }
    }

    public void setOnRefreshSuccessListener(@Nullable OnRefreshSuccessListener onRefreshSuccessListener) {
        Object[] objArr = {onRefreshSuccessListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38403efb9584fcaaca35bff395300d52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38403efb9584fcaaca35bff395300d52");
        } else if (this.containerMode instanceof ContainerPullToRefreshMode) {
            ((ContainerPullToRefreshMode) this.containerMode).setOnRefreshSuccessListener(onRefreshSuccessListener);
        }
    }

    public PullToRefreshMode getPullToRefreshMode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "acec1e6c3102cbbe6054143052e42ea7", RobustBitConfig.DEFAULT_VALUE)) {
            return (PullToRefreshMode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "acec1e6c3102cbbe6054143052e42ea7");
        }
        if (this.customFuncDelegate != null) {
            return this.customFuncDelegate.getPullToRefreshMode();
        }
        return PullToRefreshMode.PULL_DOWN_TO_REFRESH;
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerCustomFunc
    public void setPullToRefreshMode(PullToRefreshMode pullToRefreshMode) {
        Object[] objArr = {pullToRefreshMode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3aaf89d27ad486874ad5e92629591e8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3aaf89d27ad486874ad5e92629591e8e");
            return;
        }
        if (this.customFuncDelegate != null) {
            this.customFuncDelegate.setPullToRefreshMode(pullToRefreshMode);
        }
        if (this.containerMode instanceof ContainerPullToRefreshMode) {
            ((ContainerPullToRefreshMode) this.containerMode).setPullToRefreshMode(pullToRefreshMode);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerCustomFunc
    public void addPageLoadListener(PageContainerRecyclerView.PageLoadingListener pageLoadingListener) {
        Object[] objArr = {pageLoadingListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd0d66575a45b433db87aff04c1c0d9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd0d66575a45b433db87aff04c1c0d9b");
        } else if (this.customFuncDelegate == null || pageLoadingListener == null) {
        } else {
            this.customFuncDelegate.addPageLoadListener(pageLoadingListener);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerCustomFunc
    public void addPageLoadFinishListener(PageContainerRecyclerView.PageLoadFinishListener pageLoadFinishListener) {
        Object[] objArr = {pageLoadFinishListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b23e36bf0658066a1fa2ef758f0cae6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b23e36bf0658066a1fa2ef758f0cae6");
        } else if (this.customFuncDelegate == null || pageLoadFinishListener == null) {
        } else {
            this.customFuncDelegate.addPageLoadFinishListener(pageLoadFinishListener);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerCustomFunc
    @Deprecated
    public void setViewHeightChangedAnimListener(ScDampingEmptyHeaderView.ViewHeightChangedAnimListener viewHeightChangedAnimListener) {
        Object[] objArr = {viewHeightChangedAnimListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9340889b53332ee33c55ab45b00ca9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9340889b53332ee33c55ab45b00ca9b");
        } else if (this.customFuncDelegate == null || viewHeightChangedAnimListener == null) {
        } else {
            this.customFuncDelegate.setViewHeightChangedAnimListener(viewHeightChangedAnimListener);
        }
    }

    @Override // com.dianping.agentsdk.pagecontainer.k
    public void setZoomView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "528c22b00623b465d0feaa30ed5762be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "528c22b00623b465d0feaa30ed5762be");
        } else if (view == null || !(this.mLinearLayoutManager instanceof ShieldLayoutManagerInterface)) {
        } else {
            new ContainerPullToZoomMode(this).setZoomView(view);
            setMode(a.EnumC0139a.DISABLED);
        }
    }

    public void setFirstItemScrollChangeListener(com.dianping.agentsdk.pagecontainer.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe9171f7f057409d26a216d0fb9f67d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe9171f7f057409d26a216d0fb9f67d5");
        } else if (this.customFuncDelegate == null || aVar == null) {
        } else {
            this.customFuncDelegate.setFirstItemScrollChangeListener(aVar);
        }
    }

    public void removeFirstItemScrollChangeListener(com.dianping.agentsdk.pagecontainer.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eeeecb01c3d0b26240d9ab3aa887cddd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eeeecb01c3d0b26240d9ab3aa887cddd");
        } else if (this.customFuncDelegate == null || aVar == null) {
        } else {
            this.customFuncDelegate.removeFirstItemScrollChangeListener(aVar);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerFunc
    public void addItemDecoration(RecyclerView.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10296bb6bd6ad6c7ec9115698b11b413", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10296bb6bd6ad6c7ec9115698b11b413");
        } else if (this.funcDelegate != null) {
            this.funcDelegate.addItemDecoration(fVar);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerFunc
    public int getScrollState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09e47edbb206a04f0c6ebd97b7790571", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09e47edbb206a04f0c6ebd97b7790571")).intValue();
        }
        if (this.funcDelegate != null) {
            return this.funcDelegate.getScrollState();
        }
        return 0;
    }

    public void setPullToRefreshViewOffset(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33a8b4d4a130d51542e5d82470d39143", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33a8b4d4a130d51542e5d82470d39143");
        } else if (this.customFuncDelegate != null) {
            this.customFuncDelegate.setPullToRefreshViewOffset(i);
        }
    }

    @Override // com.dianping.agentsdk.pagecontainer.e
    public int getAutoOffset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd7c7d4e6d62e754ab72200a6ae240be", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd7c7d4e6d62e754ab72200a6ae240be")).intValue();
        }
        if (this.customFuncDelegate != null) {
            return this.customFuncDelegate.getAutoOffset();
        }
        return 0;
    }

    @Override // com.dianping.agentsdk.pagecontainer.e
    public void setAutoOffset(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76cb710f0b31c7637dc3e7d6fa23b539", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76cb710f0b31c7637dc3e7d6fa23b539");
        } else if (this.customFuncDelegate != null) {
            this.customFuncDelegate.setAutoOffset(i);
        }
    }

    public View getBottomViewContainer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "baa545ed44d84934b8a28a1294ec5f8f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "baa545ed44d84934b8a28a1294ec5f8f");
        }
        if (this.topBottomViewDelegate != null) {
            return this.topBottomViewDelegate.getBottomViewContainer();
        }
        return null;
    }

    @Override // com.dianping.agentsdk.pagecontainer.f
    public boolean setBottomView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f845b24e83bb6c19d288fb7792a479d5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f845b24e83bb6c19d288fb7792a479d5")).booleanValue();
        }
        if (this.topBottomViewDelegate != null) {
            return this.topBottomViewDelegate.setBottomView(view);
        }
        return false;
    }

    @Override // com.dianping.shield.feature.FloatCoverViewControlInterface
    public void addViewFloatCoverView(View view, RelativeLayout.LayoutParams layoutParams) {
        Object[] objArr = {view, layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "124f8dd8fdcef5b6dcc3f8a718430ca3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "124f8dd8fdcef5b6dcc3f8a718430ca3");
        } else if (this.topBottomViewDelegate != null) {
            this.topBottomViewDelegate.addViewFloatCoverView(view, layoutParams);
        }
    }

    @Override // com.dianping.shield.feature.FloatCoverViewControlInterface
    public void removeFloatCoverView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "363129c76a09072c81b33f8a1fdd7cd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "363129c76a09072c81b33f8a1fdd7cd6");
        } else if (this.topBottomViewDelegate != null) {
            this.topBottomViewDelegate.removeFloatCoverView(view);
        }
    }

    public boolean isPullToRefreshing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db88b967e8cd25597d53fa5f6c0ed5e4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db88b967e8cd25597d53fa5f6c0ed5e4")).booleanValue();
        }
        if (this.mPullToRecyclerView != null) {
            return this.mPullToRecyclerView.a();
        }
        if (this.containerMode instanceof ContainerPullToRefreshMode) {
            return ((ContainerPullToRefreshMode) this.containerMode).isRefreshing();
        }
        return false;
    }

    @Deprecated
    public void setOnRefreshListener(final a.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17433317a0a65fad3cf48c1bba7eab82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17433317a0a65fad3cf48c1bba7eab82");
        } else {
            setOnRefreshListener(new OnRefreshListener() { // from class: com.dianping.shield.component.widgets.container.CommonPageContainer.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.shield.component.widgets.container.CommonPageContainer.OnRefreshListener
                public void onRefresh(ViewGroup viewGroup) {
                    Object[] objArr2 = {viewGroup};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "63be3b50b221dac5f2aa5b019a09bc09", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "63be3b50b221dac5f2aa5b019a09bc09");
                    } else if (bVar != null) {
                        bVar.onRefresh(CommonPageContainer.this.mPullToRecyclerView);
                    }
                }
            });
        }
    }

    @Deprecated
    public void setOnScrollChangedListener(final b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba29e8c7b27beb05e932502677427b23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba29e8c7b27beb05e932502677427b23");
        } else {
            setOnScrollChangedListener(new PageContainerRecyclerView.OnScrollChangedListener() { // from class: com.dianping.shield.component.widgets.container.CommonPageContainer.5
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.shield.component.widgets.PageContainerRecyclerView.OnScrollChangedListener
                public void onScrollChanged(int i, int i2, int i3, int i4) {
                    Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c00c3f3802ea53ff7f22b27ce7090533", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c00c3f3802ea53ff7f22b27ce7090533");
                    } else if (aVar != null) {
                        aVar.onScrollChanged(i, i2, i3, i4);
                    }
                }
            });
        }
    }

    @Deprecated
    public void scrollToTop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b4dc29e73480d4c0239f584f31bd8ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b4dc29e73480d4c0239f584f31bd8ac");
        } else if (this.funcDelegate != null) {
            this.funcDelegate.smoothScrollToPosition(0);
        }
    }

    @Deprecated
    public void setRootPadding(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f15bc2c1839cd5b9617cf9e30dd9eb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f15bc2c1839cd5b9617cf9e30dd9eb1");
        } else if (this.rootView != null) {
            this.rootView.setPadding(0, i, 0, 0);
        }
    }

    @Deprecated
    public void setMode(a.EnumC0139a enumC0139a) {
        Object[] objArr = {enumC0139a};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5077e067fbcd6faa1b7450df3fdecb9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5077e067fbcd6faa1b7450df3fdecb9b");
            return;
        }
        if (this.leeDelegate != null) {
            this.leeDelegate.setMode(enumC0139a);
        }
        if (this.comonPageContainerType == CommonPageContainerType.PULL_TO_X) {
            if (enumC0139a == a.EnumC0139a.DISABLED) {
                setPullToRefreshMode(PullToRefreshMode.DISABLED);
            } else if (enumC0139a == a.EnumC0139a.PULL_DOWN_TO_REFRESH) {
                setPullToRefreshMode(PullToRefreshMode.PULL_DOWN_TO_REFRESH);
            } else if (enumC0139a == a.EnumC0139a.BOTH) {
                setPullToRefreshMode(PullToRefreshMode.BOTH);
            }
        }
    }

    @Override // com.dianping.shield.bridge.feature.PageContainerCommonInterface
    @Nullable
    public FrameLayout getZFrameLayout() {
        return this.zFrameLayout;
    }

    @Override // com.dianping.shield.bridge.feature.RecyclerviewPositionInterface
    @NotNull
    public Pair<Integer, Integer> getViewTopBottom(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee21ef4cc2d97ecccaef65ff7115c012", RobustBitConfig.DEFAULT_VALUE) ? (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee21ef4cc2d97ecccaef65ff7115c012") : this.funcDelegate.getViewTopBottom(i);
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerCustomFunc
    public void setFrozenEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47c7749a9e9aa31ed04ccd6110762b05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47c7749a9e9aa31ed04ccd6110762b05");
            return;
        }
        this.customFuncDelegate.setFrozenEnabled(z);
        this.enableFrozen = z;
    }

    public boolean isFrozenEnabled() {
        return this.enableFrozen;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum CommonPageContainerType {
        PULL_TOREFRESH,
        PULL_TO_X,
        PULL_TO2F;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        CommonPageContainerType() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d490ad3f9b0f101cbc0919f9e5fab4bc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d490ad3f9b0f101cbc0919f9e5fab4bc");
            }
        }

        public static CommonPageContainerType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3edd4a97c3b77df29ee1a44e37cc267e", RobustBitConfig.DEFAULT_VALUE) ? (CommonPageContainerType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3edd4a97c3b77df29ee1a44e37cc267e") : (CommonPageContainerType) Enum.valueOf(CommonPageContainerType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static CommonPageContainerType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "11ab55ec42eabd885a88ca79131260cd", RobustBitConfig.DEFAULT_VALUE) ? (CommonPageContainerType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "11ab55ec42eabd885a88ca79131260cd") : (CommonPageContainerType[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum PullToRefreshMode {
        DISABLED(0),
        PULL_DOWN(4),
        DISABLED_NUM_CHANGE(5),
        PULL_DOWN_TO_REFRESH(1),
        PULL_UP_TO_REFRESH(2),
        BOTH(3);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        private int mIntValue;

        public static PullToRefreshMode valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c0ae3c3deba62cf3470d9b2843655d9a", RobustBitConfig.DEFAULT_VALUE) ? (PullToRefreshMode) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c0ae3c3deba62cf3470d9b2843655d9a") : (PullToRefreshMode) Enum.valueOf(PullToRefreshMode.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static PullToRefreshMode[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "697648edc7916ddb9aaab16592e0a657", RobustBitConfig.DEFAULT_VALUE) ? (PullToRefreshMode[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "697648edc7916ddb9aaab16592e0a657") : (PullToRefreshMode[]) values().clone();
        }

        PullToRefreshMode(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d93fe289528e656e5ed0a7e22abbc02", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d93fe289528e656e5ed0a7e22abbc02");
            } else {
                this.mIntValue = i;
            }
        }

        public static PullToRefreshMode mapIntToMode(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3e74d617d04adcc75554d7d5fe5ca398", RobustBitConfig.DEFAULT_VALUE)) {
                return (PullToRefreshMode) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3e74d617d04adcc75554d7d5fe5ca398");
            }
            if (i == 0) {
                return DISABLED;
            }
            switch (i) {
                case 2:
                    return PULL_UP_TO_REFRESH;
                case 3:
                    return BOTH;
                case 4:
                    return PULL_DOWN;
                case 5:
                    return DISABLED_NUM_CHANGE;
                default:
                    return PULL_DOWN_TO_REFRESH;
            }
        }

        public final boolean canPullDown() {
            return this == PULL_DOWN_TO_REFRESH || this == BOTH;
        }

        public final boolean canPullUp() {
            return this == PULL_UP_TO_REFRESH || this == BOTH;
        }

        public final int getIntValue() {
            return this.mIntValue;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    final class PcShieldStaggeredGridLayoutManager extends ShieldStaggeredGridLayoutManager {
        public static ChangeQuickRedirect changeQuickRedirect;

        public PcShieldStaggeredGridLayoutManager(int i, int i2) {
            super(i, i2);
            Object[] objArr = {CommonPageContainer.this, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6faa6806b4a6d34f0f3fc57a81f2a83b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6faa6806b4a6d34f0f3fc57a81f2a83b");
            } else {
                setGapStrategy(0);
            }
        }

        @Override // com.dianping.shield.sectionrecycler.layoutmanager.ShieldStaggeredGridLayoutManager, com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
        public final void scrollToPositionWithOffset(int i, int i2, boolean z, float f) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b7690e92468627fb93e08914d7ce94e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b7690e92468627fb93e08914d7ce94e");
                return;
            }
            if (i > 0) {
                i += CommonPageContainer.this.getHeaderCount();
            }
            super.scrollToPositionWithOffset(i, i2, z, f);
        }

        @Override // com.dianping.shield.sectionrecycler.layoutmanager.ShieldStaggeredGridLayoutManager, com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
        public final void scrollToPositionWithOffset(int i, int i2, boolean z, float f, @Nullable ArrayList<com.dianping.agentsdk.sectionrecycler.layoutmanager.a> arrayList) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Float.valueOf(f), arrayList};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a82efeea9badcd9b0cdd5bdee204c3a0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a82efeea9badcd9b0cdd5bdee204c3a0");
            } else {
                super.scrollToPositionWithOffset(i > 0 ? CommonPageContainer.this.getHeaderCount() + i : i, i2, z, f, arrayList);
            }
        }

        @Override // com.dianping.shield.sectionrecycler.layoutmanager.ShieldStaggeredGridLayoutManager, com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
        public final void scrollToPositionWithOffset(int i, int i2, boolean z, ArrayList<com.dianping.agentsdk.sectionrecycler.layoutmanager.a> arrayList) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), arrayList};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4ea2768d08d272020ce4f68452669a3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4ea2768d08d272020ce4f68452669a3");
                return;
            }
            if (i > 0) {
                i += CommonPageContainer.this.getHeaderCount();
            }
            super.scrollToPositionWithOffset(i, i2, z, arrayList);
        }

        @Override // com.dianping.shield.sectionrecycler.layoutmanager.ShieldStaggeredGridLayoutManager, com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
        public final void scrollToPositionWithOffset(int i, int i2, boolean z) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7757a39db3403cf46eee0b8d67bd48c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7757a39db3403cf46eee0b8d67bd48c");
                return;
            }
            if (i > 0) {
                i += CommonPageContainer.this.getHeaderCount();
            }
            super.scrollToPositionWithOffset(i, i2, z);
        }

        @Override // com.dianping.shield.sectionrecycler.layoutmanager.ShieldStaggeredGridLayoutManager, com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
        public final int findFirstVisibleItemPosition(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f064b6cdba7d7aaa3907c755c0600ca", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f064b6cdba7d7aaa3907c755c0600ca")).intValue();
            }
            int findFirstVisibleItemPosition = super.findFirstVisibleItemPosition(z);
            return findFirstVisibleItemPosition <= 0 ? findFirstVisibleItemPosition : Math.max(0, findFirstVisibleItemPosition - CommonPageContainer.this.getHeaderCount());
        }

        @Override // com.dianping.shield.sectionrecycler.layoutmanager.ShieldStaggeredGridLayoutManager, com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
        public final int findLastVisibleItemPosition(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6633710620ea05c741d599b125a6963c", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6633710620ea05c741d599b125a6963c")).intValue();
            }
            int findLastVisibleItemPosition = super.findLastVisibleItemPosition(z);
            return findLastVisibleItemPosition <= 0 ? findLastVisibleItemPosition : Math.max(0, findLastVisibleItemPosition - CommonPageContainer.this.getHeaderCount());
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class GCLinearLayoutManager extends LinearLayoutManagerWithSmoothOffset {
        public static ChangeQuickRedirect changeQuickRedirect;

        public GCLinearLayoutManager(Context context) {
            super(context);
            Object[] objArr = {CommonPageContainer.this, context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9115e4e320608b2a0c8093b20420ae94", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9115e4e320608b2a0c8093b20420ae94");
            }
        }

        @Override // android.support.v7.widget.RecyclerView.LayoutManager
        public void onMeasure(RecyclerView.m mVar, RecyclerView.State state, int i, int i2) {
            Object[] objArr = {mVar, state, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64161fdedc0d08f9baa86430f1b031de", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64161fdedc0d08f9baa86430f1b031de");
            } else {
                super.onMeasure(mVar, state, i, i2);
            }
        }

        public int getScrollY() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc10412cc4b26fdbf89889e9248b76e0", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc10412cc4b26fdbf89889e9248b76e0")).intValue();
            }
            if (CommonPageContainer.this.funcDelegate != null) {
                return CommonPageContainer.this.funcDelegate.getScrollY();
            }
            return 0;
        }

        @Override // com.dianping.agentsdk.sectionrecycler.layoutmanager.LinearLayoutManagerWithSmoothOffset, com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
        public void scrollToPositionWithOffset(int i, int i2, boolean z, float f) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44369fd005d160c8023d84cbe211094a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44369fd005d160c8023d84cbe211094a");
                return;
            }
            if (i > 0) {
                i += CommonPageContainer.this.getHeaderCount();
            }
            super.scrollToPositionWithOffset(i, i2, z, f);
        }

        @Override // com.dianping.agentsdk.sectionrecycler.layoutmanager.LinearLayoutManagerWithSmoothOffset, com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
        public void scrollToPositionWithOffset(int i, int i2, boolean z, float f, @Nullable ArrayList<com.dianping.agentsdk.sectionrecycler.layoutmanager.a> arrayList) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Float.valueOf(f), arrayList};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "966c54f0e4068ad82a95f14c47e01aba", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "966c54f0e4068ad82a95f14c47e01aba");
            } else {
                super.scrollToPositionWithOffset(i > 0 ? CommonPageContainer.this.getHeaderCount() + i : i, i2, z, f, arrayList);
            }
        }

        @Override // com.dianping.agentsdk.sectionrecycler.layoutmanager.LinearLayoutManagerWithSmoothOffset, com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
        public void scrollToPositionWithOffset(int i, int i2, boolean z, ArrayList<com.dianping.agentsdk.sectionrecycler.layoutmanager.a> arrayList) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), arrayList};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "473ce4c1c58606e587da840c5401ef10", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "473ce4c1c58606e587da840c5401ef10");
                return;
            }
            if (i > 0) {
                i += CommonPageContainer.this.getHeaderCount();
            }
            super.scrollToPositionWithOffset(i, i2, z, arrayList);
        }

        @Override // com.dianping.agentsdk.sectionrecycler.layoutmanager.LinearLayoutManagerWithSmoothOffset, com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
        public void scrollToPositionWithOffset(int i, int i2, boolean z) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0785f133f973152553e8b75300d12e5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0785f133f973152553e8b75300d12e5");
                return;
            }
            if (i > 0) {
                i += CommonPageContainer.this.getHeaderCount();
            }
            super.scrollToPositionWithOffset(i, i2, z);
        }

        @Override // com.dianping.agentsdk.sectionrecycler.layoutmanager.LinearLayoutManagerWithSmoothOffset, com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
        public int findFirstVisibleItemPosition(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfa2a977706d3ad042a808d54979b304", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfa2a977706d3ad042a808d54979b304")).intValue();
            }
            int findFirstVisibleItemPosition = super.findFirstVisibleItemPosition(z);
            return findFirstVisibleItemPosition <= 0 ? findFirstVisibleItemPosition : Math.max(0, findFirstVisibleItemPosition - CommonPageContainer.this.getHeaderCount());
        }

        @Override // com.dianping.agentsdk.sectionrecycler.layoutmanager.LinearLayoutManagerWithSmoothOffset, com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
        public int findLastVisibleItemPosition(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16575e484483acf5253e84da1cae5cd8", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16575e484483acf5253e84da1cae5cd8")).intValue();
            }
            int findLastVisibleItemPosition = super.findLastVisibleItemPosition(z);
            return findLastVisibleItemPosition <= 0 ? findLastVisibleItemPosition : Math.max(0, findLastVisibleItemPosition - CommonPageContainer.this.getHeaderCount());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public abstract class OnRecyclerMultiClickListener implements RecyclerView.j {
        public static ChangeQuickRedirect changeQuickRedirect;
        private int maxTimeDuration;
        private int maxTimeInterval;
        private int maxTouchTimes;
        private RecyclerView recyclerView;
        private List<Long> timeMarker;

        @Override // android.support.v7.widget.RecyclerView.j
        public void onRequestDisallowInterceptTouchEvent(boolean z) {
        }

        @Override // android.support.v7.widget.RecyclerView.j
        public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        }

        public OnRecyclerMultiClickListener(RecyclerView recyclerView) {
            Object[] objArr = {CommonPageContainer.this, recyclerView};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77de38c464eb31c24c56b0ccec3d6b3d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77de38c464eb31c24c56b0ccec3d6b3d");
                return;
            }
            this.recyclerView = recyclerView;
            this.maxTouchTimes = 6;
            this.maxTimeInterval = 400;
            this.maxTimeDuration = 2000;
            this.timeMarker = new ArrayList();
        }

        @Override // android.support.v7.widget.RecyclerView.j
        public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            Object[] objArr = {recyclerView, motionEvent};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd14dde936b14735ac82c8108970a014", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd14dde936b14735ac82c8108970a014")).booleanValue();
            }
            if (motionEvent.getAction() == 0) {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.timeMarker.size() > 0 && currentTimeMillis - this.timeMarker.get(this.timeMarker.size() - 1).longValue() > this.maxTimeInterval) {
                    this.timeMarker.clear();
                }
                this.timeMarker.add(Long.valueOf(currentTimeMillis));
                if (this.timeMarker.size() == this.maxTouchTimes) {
                    long longValue = this.timeMarker.get(this.maxTouchTimes - 1).longValue() - this.timeMarker.get(0).longValue();
                    if (0 < longValue && longValue < this.maxTimeDuration) {
                        OnMutipClick();
                        this.timeMarker.clear();
                    } else {
                        this.timeMarker.remove(0);
                    }
                }
            }
            return false;
        }

        public void OnMutipClick() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8188f63ac92b444b1362f88b9b51b216", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8188f63ac92b444b1362f88b9b51b216");
                return;
            }
            Intent intent = new Intent("com.dianping.shield.debug.activity.shielddebugdialog");
            intent.setPackage(CommonPageContainer.this.getContext().getPackageName());
            this.recyclerView.getContext().startActivity(intent);
        }

        public void setMaxTouchTimes(int i) {
            this.maxTouchTimes = i;
        }

        public void setMaxTimeInterval(int i) {
            this.maxTimeInterval = i;
        }

        public void setMaxTimeDuration(int i) {
            this.maxTimeDuration = i;
        }
    }
}
