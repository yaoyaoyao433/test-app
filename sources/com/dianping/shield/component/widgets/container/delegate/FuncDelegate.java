package com.dianping.shield.component.widgets.container.delegate;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.v;
import android.util.Pair;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.dianping.agentsdk.framework.e;
import com.dianping.agentsdk.framework.g;
import com.dianping.agentsdk.sectionrecycler.layoutmanager.LinearLayoutManagerWithSmoothOffset;
import com.dianping.agentsdk.sectionrecycler.layoutmanager.a;
import com.dianping.shield.bridge.feature.PageContainerRecyclerViewInterface;
import com.dianping.shield.component.interfaces.OnDidInterceptTouchListener;
import com.dianping.shield.component.interfaces.OnDragStatusListener;
import com.dianping.shield.component.interfaces.OnInterceptTouchListener;
import com.dianping.shield.component.widgets.PageContainerRecyclerView;
import com.dianping.shield.component.widgets.container.IPageContainerFunc;
import com.dianping.shield.component.widgets.container.IPageContainerLayoutManagerFunc;
import com.dianping.shield.feature.IFocusChildScrollWhenBack;
import com.dianping.shield.node.adapter.DisplayNodeContainer;
import com.dianping.shield.node.itemcallbacks.ContentOffsetListener;
import com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class FuncDelegate extends PageContainerBaseDelegate<PageContainerRecyclerView> implements PageContainerRecyclerViewInterface, IPageContainerFunc, IPageContainerLayoutManagerFunc {
    public static ChangeQuickRedirect changeQuickRedirect;
    private OnDidInterceptTouchListener didInterceptTouchListener;
    private List<OnDragStatusListener> dragStatusListeners;
    private List<RecyclerView.i> flingListeners;
    private OnDragStatusListener innerBeginDragListener;
    private RecyclerView.i innerFlingListener;
    private boolean itemAnimationEnabled;
    private List<RecyclerView.k> mScrollListeners;
    private int mScrollY;
    private RecyclerView.k mSelfOnScrollListener;
    private OnInterceptTouchListener onInterceptTouchListener;
    private List<OnInterceptTouchListener> onInterceptTouchListenerList;
    private View.OnTouchListener onTouchListener;

    @Override // com.dianping.shield.node.itemcallbacks.LayoutParamCalAndContentYCallback
    public void addContentScrollOffsetListener(@NotNull ContentOffsetListener contentOffsetListener) {
    }

    @Override // com.dianping.shield.node.itemcallbacks.LayoutParamCalAndContentYCallback
    public void addLayoutParamCalFinishCallBack(@NotNull e eVar) {
    }

    @Override // com.dianping.shield.node.itemcallbacks.LayoutParamCalAndContentYCallback
    public void removeContentScrollOffsetListener(@NotNull ContentOffsetListener contentOffsetListener) {
    }

    @Override // com.dianping.shield.node.itemcallbacks.LayoutParamCalAndContentYCallback
    public void removeLayoutParamCalFinishCallBack(@NotNull e.a aVar) {
    }

    @Override // com.dianping.shield.node.itemcallbacks.SectionBgViewMapCallback
    public void setSectionBgViewMap(@NotNull SparseArray<g> sparseArray) {
    }

    public FuncDelegate(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fb629efb7b5f713af4f414424c9bd75", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fb629efb7b5f713af4f414424c9bd75");
            return;
        }
        this.mScrollY = 0;
        this.dragStatusListeners = new ArrayList();
        this.mSelfOnScrollListener = new RecyclerView.k() { // from class: com.dianping.shield.component.widgets.container.delegate.FuncDelegate.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.support.v7.widget.RecyclerView.k
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "53a264aef822ace25e7056274b8059b1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "53a264aef822ace25e7056274b8059b1");
                } else if (FuncDelegate.this.mScrollListeners != null) {
                    for (RecyclerView.k kVar : FuncDelegate.this.mScrollListeners) {
                        if (kVar != null) {
                            kVar.onScrollStateChanged(recyclerView, i);
                        }
                    }
                }
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "22519ece7d3044f6f8fc1eb09a445b00", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "22519ece7d3044f6f8fc1eb09a445b00");
                    return;
                }
                if (FuncDelegate.this.getAgentContainerView().getChildLayoutPosition(FuncDelegate.this.getAgentContainerView().getChildAt(0)) >= FuncDelegate.this.getAgentContainerView().getHeaderCounts()) {
                    FuncDelegate.this.mScrollY += i2;
                } else {
                    FuncDelegate.this.mScrollY = 0;
                }
                if (FuncDelegate.this.mScrollListeners != null) {
                    for (RecyclerView.k kVar : FuncDelegate.this.mScrollListeners) {
                        if (kVar != null) {
                            kVar.onScrolled(recyclerView, i, i2);
                        }
                    }
                }
            }
        };
        this.innerFlingListener = new RecyclerView.i() { // from class: com.dianping.shield.component.widgets.container.delegate.FuncDelegate.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.support.v7.widget.RecyclerView.i
            public boolean onFling(int i, int i2) {
                boolean z = false;
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9bcd426b6f0bdc792839473ec0f92c68", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9bcd426b6f0bdc792839473ec0f92c68")).booleanValue();
                }
                if (FuncDelegate.this.flingListeners != null) {
                    for (RecyclerView.i iVar : FuncDelegate.this.flingListeners) {
                        if (iVar != null && iVar.onFling(i, i2)) {
                            z = true;
                        }
                    }
                }
                return z;
            }
        };
        this.innerBeginDragListener = new OnDragStatusListener() { // from class: com.dianping.shield.component.widgets.container.delegate.FuncDelegate.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.component.interfaces.OnDragStatusListener
            public void onBeginDrag(@NotNull PageContainerRecyclerView pageContainerRecyclerView) {
                Object[] objArr2 = {pageContainerRecyclerView};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f787f0dad95193860616127e3e7297d7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f787f0dad95193860616127e3e7297d7");
                    return;
                }
                for (OnDragStatusListener onDragStatusListener : FuncDelegate.this.dragStatusListeners) {
                    onDragStatusListener.onBeginDrag(pageContainerRecyclerView);
                }
            }

            @Override // com.dianping.shield.component.interfaces.OnDragStatusListener
            public void onEndDrag(@NotNull PageContainerRecyclerView pageContainerRecyclerView, float f, float f2) {
                Object[] objArr2 = {pageContainerRecyclerView, Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "21cb711e34d07d5d47834932d3d96da9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "21cb711e34d07d5d47834932d3d96da9");
                    return;
                }
                for (OnDragStatusListener onDragStatusListener : FuncDelegate.this.dragStatusListeners) {
                    onDragStatusListener.onEndDrag(pageContainerRecyclerView, f, f2);
                }
            }
        };
        this.onInterceptTouchListener = new OnInterceptTouchListener() { // from class: com.dianping.shield.component.widgets.container.delegate.FuncDelegate.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.component.interfaces.OnInterceptTouchListener
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bc7ad52ae9d46d1d24e66f45b2afc9bf", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bc7ad52ae9d46d1d24e66f45b2afc9bf")).booleanValue();
                }
                if (FuncDelegate.this.onInterceptTouchListenerList == null) {
                    return false;
                }
                for (OnInterceptTouchListener onInterceptTouchListener : FuncDelegate.this.onInterceptTouchListenerList) {
                    if (onInterceptTouchListener.onInterceptTouchEvent(motionEvent)) {
                        return true;
                    }
                }
                return false;
            }
        };
    }

    @Override // com.dianping.shield.component.widgets.container.delegate.PageContainerBaseDelegate
    public void onCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a19b6ffd34404d6083745d76b3ac788", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a19b6ffd34404d6083745d76b3ac788");
        } else if (getAgentContainerView() != null) {
            getAgentContainerView().setOnInterceptTouchListener(this.onInterceptTouchListener);
            getAgentContainerView().addOnScrollListener(this.mSelfOnScrollListener);
            getAgentContainerView().setOnFlingListener(this.innerFlingListener);
            getAgentContainerView().addOnBeginDragListener(this.innerBeginDragListener);
            if (this.onTouchListener != null) {
                getAgentContainerView().addOnTouchListener(this.onTouchListener);
            }
            if (this.didInterceptTouchListener != null) {
                getAgentContainerView().setDidInterceptTouchListener(this.didInterceptTouchListener);
            }
            if (this.itemAnimationEnabled) {
                return;
            }
            getAgentContainerView().setItemAnimator(null);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.delegate.PageContainerBaseDelegate
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b4fce072c1e4b547c70f87f9b41e065", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b4fce072c1e4b547c70f87f9b41e065");
            return;
        }
        if (this.mSelfOnScrollListener != null && getAgentContainerView() != null) {
            getAgentContainerView().removeOnScrollListener(this.mSelfOnScrollListener);
        }
        if (this.mScrollListeners != null) {
            this.mScrollListeners.clear();
        }
        if (this.flingListeners != null) {
            this.flingListeners.clear();
        }
        if (this.onInterceptTouchListenerList != null) {
            this.onInterceptTouchListenerList.clear();
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerFunc
    public void addScrollListener(RecyclerView.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b95698fdd93e957df79accef06cba77a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b95698fdd93e957df79accef06cba77a");
            return;
        }
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        if (this.mScrollListeners.contains(kVar)) {
            return;
        }
        this.mScrollListeners.add(kVar);
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerFunc
    public void addFlingListener(RecyclerView.i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18fd8209ca0b045f8342cd5a58184974", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18fd8209ca0b045f8342cd5a58184974");
            return;
        }
        if (this.flingListeners == null) {
            this.flingListeners = new ArrayList();
        }
        if (this.flingListeners.contains(iVar)) {
            return;
        }
        this.flingListeners.add(iVar);
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerFunc
    public void addDragStatusListener(OnDragStatusListener onDragStatusListener) {
        Object[] objArr = {onDragStatusListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16d7d719d229234a6722e43aee2e3537", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16d7d719d229234a6722e43aee2e3537");
        } else if (this.dragStatusListeners.contains(onDragStatusListener)) {
        } else {
            this.dragStatusListeners.add(onDragStatusListener);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerFunc
    public void setDidInterceptListener(OnDidInterceptTouchListener onDidInterceptTouchListener) {
        Object[] objArr = {onDidInterceptTouchListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1763fd6542263d88a1b1f13a9ecb22cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1763fd6542263d88a1b1f13a9ecb22cd");
            return;
        }
        this.didInterceptTouchListener = onDidInterceptTouchListener;
        if (getAgentContainerView() != null) {
            getAgentContainerView().setDidInterceptTouchListener(this.didInterceptTouchListener);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerFunc
    public OnDidInterceptTouchListener getDidInterceptListener() {
        return this.didInterceptTouchListener;
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerFunc
    public void removeScrollListener(RecyclerView.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c50c96422c7983c1f562aee66d4bf3a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c50c96422c7983c1f562aee66d4bf3a5");
        } else if (this.mScrollListeners == null) {
        } else {
            this.mScrollListeners.remove(kVar);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerFunc
    public void removeFlingListener(RecyclerView.i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e12255234fbf56837676d3a910b44347", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e12255234fbf56837676d3a910b44347");
        } else if (this.flingListeners == null) {
        } else {
            this.flingListeners.remove(iVar);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerFunc, com.dianping.shield.feature.PositionInfoInterface
    public int getScrollY() {
        return this.mScrollY;
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerFunc
    public void scrollToPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7aea2221eaee1b37a0378f6a3e0c9d42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7aea2221eaee1b37a0378f6a3e0c9d42");
        } else if (getAgentContainerView() != null) {
            getAgentContainerView().scrollToPosition(i);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerFunc
    public void smoothScrollToPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8156cea7314e2966c14dc6bd6b8affd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8156cea7314e2966c14dc6bd6b8affd1");
        } else if (getAgentContainerView() != null) {
            getAgentContainerView().smoothScrollToPosition(i);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerFunc
    public void setDescendantFocusability(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ac9163afaac209922f05b605540f696", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ac9163afaac209922f05b605540f696");
        } else if (getAgentContainerView() != null) {
            getAgentContainerView().setDescendantFocusability(i);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerFunc
    public void setItemAnimationEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b309a511519d455122e4fb24e60dd25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b309a511519d455122e4fb24e60dd25");
            return;
        }
        this.itemAnimationEnabled = z;
        if (getAgentContainerView() != null) {
            getAgentContainerView().setItemAnimator(new v());
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerFunc
    public void addItemDecoration(RecyclerView.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ed679ecea514350e0a678316731a636", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ed679ecea514350e0a678316731a636");
        } else if (getAgentContainerView() != null) {
            getAgentContainerView().addItemDecoration(fVar);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerFunc
    public int getScrollState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a8691ebf5ca52f1a7bcbb5cfa491f7c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a8691ebf5ca52f1a7bcbb5cfa491f7c")).intValue();
        }
        if (getAgentContainerView() != null) {
            return getAgentContainerView().getScrollState();
        }
        return 0;
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerFunc
    public void addOnTouchListener(View.OnTouchListener onTouchListener) {
        Object[] objArr = {onTouchListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b45a9c050400b5330e932438d76a10da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b45a9c050400b5330e932438d76a10da");
            return;
        }
        this.onTouchListener = onTouchListener;
        if (getAgentContainerView() != null) {
            getAgentContainerView().addOnTouchListener(onTouchListener);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerFunc
    public void addOnInterceptTouchListener(OnInterceptTouchListener onInterceptTouchListener) {
        Object[] objArr = {onInterceptTouchListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6481af9ea7eb458c65d5c0d7a04b031", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6481af9ea7eb458c65d5c0d7a04b031");
            return;
        }
        if (this.onInterceptTouchListenerList == null) {
            this.onInterceptTouchListenerList = new ArrayList();
        }
        this.onInterceptTouchListenerList.add(onInterceptTouchListener);
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerLayoutManagerFunc
    public int findFirstVisibleItemPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3d39caa9be8eee3fa6b259d0178fecd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3d39caa9be8eee3fa6b259d0178fecd")).intValue();
        }
        int headerCounts = getAgentContainerView() != null ? getAgentContainerView().getHeaderCounts() : 0;
        if (getAgentContainerView().getLayoutManager() instanceof LinearLayoutManagerWithSmoothOffset) {
            int findFirstVisibleItemPosition = ((LinearLayoutManagerWithSmoothOffset) getAgentContainerView().getLayoutManager()).findFirstVisibleItemPosition();
            return findFirstVisibleItemPosition <= 0 ? findFirstVisibleItemPosition : findFirstVisibleItemPosition - headerCounts;
        } else if (getAgentContainerView().getLayoutManager() instanceof LinearLayoutManager) {
            int findFirstVisibleItemPosition2 = ((LinearLayoutManager) getAgentContainerView().getLayoutManager()).findFirstVisibleItemPosition();
            return findFirstVisibleItemPosition2 <= 0 ? findFirstVisibleItemPosition2 : findFirstVisibleItemPosition2 - headerCounts;
        } else if (getAgentContainerView().getLayoutManager() instanceof ShieldLayoutManagerInterface) {
            return ((ShieldLayoutManagerInterface) getAgentContainerView().getLayoutManager()).findFirstVisibleItemPosition(false);
        } else {
            return 0;
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerLayoutManagerFunc
    public int findFirstCompletelyVisibleItemPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd3275b3a4a6594817345e4c1aef9080", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd3275b3a4a6594817345e4c1aef9080")).intValue();
        }
        int headerCounts = getAgentContainerView() != null ? getAgentContainerView().getHeaderCounts() : 0;
        if (getAgentContainerView().getLayoutManager() instanceof LinearLayoutManagerWithSmoothOffset) {
            int findFirstCompletelyVisibleItemPosition = ((LinearLayoutManagerWithSmoothOffset) getAgentContainerView().getLayoutManager()).findFirstCompletelyVisibleItemPosition();
            return findFirstCompletelyVisibleItemPosition <= 0 ? findFirstCompletelyVisibleItemPosition : findFirstCompletelyVisibleItemPosition - headerCounts;
        } else if (getAgentContainerView().getLayoutManager() instanceof LinearLayoutManager) {
            int findFirstCompletelyVisibleItemPosition2 = ((LinearLayoutManager) getAgentContainerView().getLayoutManager()).findFirstCompletelyVisibleItemPosition();
            return findFirstCompletelyVisibleItemPosition2 <= 0 ? findFirstCompletelyVisibleItemPosition2 : findFirstCompletelyVisibleItemPosition2 - headerCounts;
        } else if (getAgentContainerView().getLayoutManager() instanceof ShieldLayoutManagerInterface) {
            return ((ShieldLayoutManagerInterface) getAgentContainerView().getLayoutManager()).findFirstVisibleItemPosition(true);
        } else {
            return 0;
        }
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerLayoutManagerFunc
    public int findLastVisibleItemPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c18baaf4f706924f0a61896a2ff29a28", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c18baaf4f706924f0a61896a2ff29a28")).intValue();
        }
        int headerCounts = getAgentContainerView() != null ? getAgentContainerView().getHeaderCounts() : 0;
        if (getAgentContainerView().getLayoutManager() instanceof LinearLayoutManagerWithSmoothOffset) {
            return ((LinearLayoutManagerWithSmoothOffset) getAgentContainerView().getLayoutManager()).findLastVisibleItemPosition() - headerCounts;
        }
        if (getAgentContainerView().getLayoutManager() instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) getAgentContainerView().getLayoutManager()).findLastVisibleItemPosition() - headerCounts;
        }
        if (getAgentContainerView().getLayoutManager() instanceof ShieldLayoutManagerInterface) {
            return ((ShieldLayoutManagerInterface) getAgentContainerView().getLayoutManager()).findLastVisibleItemPosition(false);
        }
        return 0;
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerLayoutManagerFunc
    public int findLastCompletelyVisibleItemPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7b534a3f2f50ef7a5a536bf52c3e066", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7b534a3f2f50ef7a5a536bf52c3e066")).intValue();
        }
        int headerCounts = getAgentContainerView() != null ? getAgentContainerView().getHeaderCounts() : 0;
        if (getAgentContainerView().getLayoutManager() instanceof LinearLayoutManagerWithSmoothOffset) {
            return ((LinearLayoutManagerWithSmoothOffset) getAgentContainerView().getLayoutManager()).findLastCompletelyVisibleItemPosition() - headerCounts;
        }
        if (getAgentContainerView().getLayoutManager() instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) getAgentContainerView().getLayoutManager()).findLastCompletelyVisibleItemPosition() - headerCounts;
        }
        if (getAgentContainerView().getLayoutManager() instanceof ShieldLayoutManagerInterface) {
            return ((ShieldLayoutManagerInterface) getAgentContainerView().getLayoutManager()).findLastVisibleItemPosition(true);
        }
        return 0;
    }

    @Override // com.dianping.shield.bridge.feature.LayoutPositionFuctionInterface
    public int getChildCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b1dc7b79f8f1758b442c74d329a5ca8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b1dc7b79f8f1758b442c74d329a5ca8")).intValue();
        }
        if (getAgentContainerView().getLayoutManager() == null) {
            return 0;
        }
        int headerCounts = getAgentContainerView() != null ? getAgentContainerView().getHeaderCounts() : 0;
        if (getAgentContainerView().getLayoutManager() instanceof ShieldLayoutManagerInterface) {
            if (((ShieldLayoutManagerInterface) getAgentContainerView().getLayoutManager()).findFirstVisibleItemPosition(false) == 0) {
                int childCount = getAgentContainerView().getLayoutManager().getChildCount() - headerCounts;
                if (childCount < 0) {
                    return 0;
                }
                return childCount;
            }
            return getAgentContainerView().getLayoutManager().getChildCount();
        }
        return 0;
    }

    @Override // com.dianping.shield.component.widgets.container.IPageContainerLayoutManagerFunc
    public View getChildAt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b07e1f6eedb5fa3cbca18057954c5c0f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b07e1f6eedb5fa3cbca18057954c5c0f");
        }
        if (getAgentContainerView().getLayoutManager() == null) {
            return null;
        }
        return getAgentContainerView().getLayoutManager().getChildAt(i + (getAgentContainerView() != null ? getAgentContainerView().getHeaderCounts() : 0));
    }

    @Override // com.dianping.shield.bridge.feature.LayoutPositionFuctionInterface
    @Nullable
    public View getChildAtIndex(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3d7353e689deb7bd32675d396f3efe2", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3d7353e689deb7bd32675d396f3efe2");
        }
        View shieldChildAt = getAgentContainerView().getShieldChildAt(i);
        return (z && (shieldChildAt instanceof DisplayNodeContainer)) ? ((DisplayNodeContainer) shieldChildAt).getViewHolder().itemView : shieldChildAt;
    }

    @Override // com.dianping.shield.bridge.feature.LayoutPositionFuctionInterface
    @Nullable
    public View findViewAtPosition(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78106b8248844a89c06becb5f30f6145", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78106b8248844a89c06becb5f30f6145");
        }
        View findViewByPosition = getAgentContainerView().getLayoutManager().findViewByPosition(i + getAgentContainerView().getHeaderCount());
        return (z && (findViewByPosition instanceof DisplayNodeContainer)) ? ((DisplayNodeContainer) findViewByPosition).getViewHolder().itemView : findViewByPosition;
    }

    @Override // com.dianping.shield.bridge.feature.LayoutPositionFuctionInterface
    @Nullable
    public int getChildAdapterPosition(@NotNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "900df90fb0cac5cd403ea7099b262bdb", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "900df90fb0cac5cd403ea7099b262bdb")).intValue() : getAgentContainerView().getShieldChildAdapterPosition(getItemView(view));
    }

    @Override // com.dianping.shield.bridge.feature.ViewRectInterface
    @Nullable
    public Rect getViewParentRect(@Nullable View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aaac4348adb75a8364c31f328fa9206f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aaac4348adb75a8364c31f328fa9206f");
        }
        View itemView = getItemView(view);
        Rect rect = new Rect();
        if (itemView != null) {
            rect.top = itemView.getTop();
            rect.bottom = itemView.getBottom();
            rect.left = itemView.getLeft();
            rect.right = itemView.getRight();
        }
        return rect;
    }

    @Override // com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
    public void scrollToPositionWithOffset(int i, int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21e626aa6715c7bece65204232f4b5f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21e626aa6715c7bece65204232f4b5f3");
        } else if (getAgentContainerView().getLayoutManager() instanceof ShieldLayoutManagerInterface) {
            ((ShieldLayoutManagerInterface) getAgentContainerView().getLayoutManager()).scrollToPositionWithOffset(i, i2, z);
        }
    }

    @Override // com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
    public void scrollToPositionWithOffset(int i, int i2, boolean z, @Nullable ArrayList<a> arrayList) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e21a60957881203e258cca66fd520216", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e21a60957881203e258cca66fd520216");
        } else if (getAgentContainerView().getLayoutManager() instanceof ShieldLayoutManagerInterface) {
            ((ShieldLayoutManagerInterface) getAgentContainerView().getLayoutManager()).scrollToPositionWithOffset(i, i2, z, arrayList);
        }
    }

    @Override // com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
    public void scrollToPositionWithOffset(int i, int i2, boolean z, float f) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62077416d74459cb9d2fc02884871975", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62077416d74459cb9d2fc02884871975");
        } else if (getAgentContainerView().getLayoutManager() instanceof ShieldLayoutManagerInterface) {
            ((ShieldLayoutManagerInterface) getAgentContainerView().getLayoutManager()).scrollToPositionWithOffset(i, i2, z, f);
        }
    }

    @Override // com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
    public void scrollToPositionWithOffset(int i, int i2, boolean z, float f, @Nullable ArrayList<a> arrayList) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Float.valueOf(f), arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b24cf8a1b3412bfba012905f308c8547", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b24cf8a1b3412bfba012905f308c8547");
        } else if (getAgentContainerView().getLayoutManager() instanceof ShieldLayoutManagerInterface) {
            ((ShieldLayoutManagerInterface) getAgentContainerView().getLayoutManager()).scrollToPositionWithOffset(i, i2, z, f, arrayList);
        }
    }

    @Override // com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
    public int findFirstVisibleItemPosition(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9cd338529365506f6601afcb8f79aac", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9cd338529365506f6601afcb8f79aac")).intValue();
        }
        if (z) {
            return findFirstCompletelyVisibleItemPosition();
        }
        return findFirstVisibleItemPosition();
    }

    @Override // com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
    public int findLastVisibleItemPosition(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7790e323919223fe8dcf9cb8764bb4bf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7790e323919223fe8dcf9cb8764bb4bf")).intValue();
        }
        if (z) {
            return findLastCompletelyVisibleItemPosition();
        }
        return findLastVisibleItemPosition();
    }

    @Override // com.dianping.shield.bridge.feature.ItemViewInterface
    public View getItemView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c502d72b93a948ef79ab62dd92df768", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c502d72b93a948ef79ab62dd92df768");
        }
        if (view == null) {
            return null;
        }
        if (view.getParent() == getAgentContainerView()) {
            return view;
        }
        if (view.getParent() instanceof View) {
            return getItemView((View) view.getParent());
        }
        return null;
    }

    @Override // com.dianping.shield.bridge.feature.ItemViewInterface
    public int getItemViewTop(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bce0c32037dccc038b5f7e3a8c3023fd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bce0c32037dccc038b5f7e3a8c3023fd")).intValue();
        }
        View itemView = getItemView(view);
        if (itemView != null) {
            return itemView.getTop();
        }
        return 0;
    }

    @Override // com.dianping.shield.bridge.feature.ItemViewInterface
    public int getItemViewBottom(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f1ca2b7c7ae9f56aa7d6784fdcd0753", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f1ca2b7c7ae9f56aa7d6784fdcd0753")).intValue();
        }
        View itemView = getItemView(view);
        if (itemView != null) {
            return itemView.getBottom();
        }
        return 0;
    }

    @Override // com.dianping.shield.bridge.feature.ItemViewInterface
    public int getItemViewLeft(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c2205d81a19fa2dedc989ecee478029", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c2205d81a19fa2dedc989ecee478029")).intValue();
        }
        View itemView = getItemView(view);
        if (itemView != null) {
            return itemView.getLeft();
        }
        return 0;
    }

    @Override // com.dianping.shield.bridge.feature.ItemViewInterface
    public int getItemViewRight(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b981f1b19582510c7ea7b9758c27417d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b981f1b19582510c7ea7b9758c27417d")).intValue();
        }
        View itemView = getItemView(view);
        if (itemView != null) {
            return itemView.getRight();
        }
        return 0;
    }

    @Override // com.dianping.shield.bridge.feature.ItemViewInterface
    public int getItemViewWidth(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2faf508cfa3716c08fae254fb1a2e0e3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2faf508cfa3716c08fae254fb1a2e0e3")).intValue();
        }
        View itemView = getItemView(view);
        if (itemView != null) {
            return itemView.getWidth();
        }
        return 0;
    }

    @Override // com.dianping.shield.bridge.feature.ItemViewInterface
    public int getItemViewHeight(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f38c6fa832f505f305db72001d2132a4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f38c6fa832f505f305db72001d2132a4")).intValue();
        }
        View itemView = getItemView(view);
        if (itemView != null) {
            return itemView.getHeight();
        }
        return 0;
    }

    @Override // com.dianping.shield.feature.IFocusChildScrollWhenBack
    public void setFocusChildScrollOnScreenWhenBack(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa214172aa639700a916d2638468edc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa214172aa639700a916d2638468edc1");
        } else if (getAgentContainerView().getLayoutManager() instanceof IFocusChildScrollWhenBack) {
            ((IFocusChildScrollWhenBack) getAgentContainerView().getLayoutManager()).setFocusChildScrollOnScreenWhenBack(z);
        }
    }

    @Override // com.dianping.shield.component.widgets.container.delegate.PageContainerBaseDelegate, com.dianping.shield.preload.ShieldPreloadInterface
    public void shieldRecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7718505751a41e89e0820fd59e2a224b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7718505751a41e89e0820fd59e2a224b");
            return;
        }
        this.onTouchListener = null;
        this.itemAnimationEnabled = false;
        if (this.dragStatusListeners != null) {
            this.dragStatusListeners.clear();
        } else {
            this.dragStatusListeners = new ArrayList();
        }
        this.didInterceptTouchListener = null;
        this.mScrollY = 0;
        super.shieldRecycle();
    }

    @Override // com.dianping.shield.bridge.feature.RecyclerviewPositionInterface
    @NotNull
    public Pair<Integer, Integer> getViewTopBottom(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7048c774ba27a4a5dee292bb56fc8233", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7048c774ba27a4a5dee292bb56fc8233");
        }
        if (getAgentContainerView() instanceof PageContainerRecyclerView) {
            return getAgentContainerView().getViewTopBottom(i);
        }
        return new Pair<>(-1, -1);
    }
}
