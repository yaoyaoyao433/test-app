package com.dianping.voyager.widgets.container.secondfloor;

import android.content.Context;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.agentsdk.pagecontainer.e;
import com.dianping.shield.component.adapter.PageContainerAdapter;
import com.dianping.shield.component.widgets.PageContainerRecyclerView;
import com.dianping.shield.preload.ShieldPreloadInterface;
import com.dianping.shield.sectionrecycler.ShieldRecyclerViewInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class WrapRecyclerView extends RecyclerView implements e, ShieldPreloadInterface, ShieldRecyclerViewInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<View.OnAttachStateChangeListener> attachStateChangeListeners;
    private View.OnLayoutChangeListener innerLayoutListener;
    private boolean isAddGlobalLayoutListener;
    private boolean isPageViewHeightFinish;
    private List<RecyclerView.f> itemDecorations;
    private List<RecyclerView.j> itemTouchListeners;
    private List<View.OnLayoutChangeListener> layoutChangeListeners;
    private ArrayList<View> mHeaderViews;
    private int offset;
    private PageContainerAdapter pageContainerAdapter;
    protected List<PageContainerRecyclerView.PageLoadFinishListener> pageLoadFinishListeners;
    private List<PageContainerRecyclerView.PageLoadingListener> pageLoadListeners;

    @Override // com.dianping.shield.preload.ShieldPreloadInterface
    public void shieldPreload() {
    }

    public WrapRecyclerView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a2c69f2f13a9e2ae2ba2d2a5fedf58d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a2c69f2f13a9e2ae2ba2d2a5fedf58d");
        }
    }

    public WrapRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "deef842e59016a89c9ce45efdde10bb3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "deef842e59016a89c9ce45efdde10bb3");
            return;
        }
        this.mHeaderViews = new ArrayList<>();
        this.innerLayoutListener = new View.OnLayoutChangeListener() { // from class: com.dianping.voyager.widgets.container.secondfloor.WrapRecyclerView.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                Object[] objArr2 = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1a540b12ed4ca5a423a86995f4f21378", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1a540b12ed4ca5a423a86995f4f21378");
                } else if (!WrapRecyclerView.this.isPageViewHeightFinish) {
                    for (int childCount = WrapRecyclerView.this.getChildCount() - 1; childCount >= 0; childCount--) {
                        View childAt = WrapRecyclerView.this.getChildAt(childCount);
                        if (childAt != null) {
                            int[] iArr = new int[2];
                            childAt.getLocationOnScreen(iArr);
                            int height = iArr[1] + childAt.getHeight() + WrapRecyclerView.this.offset;
                            int[] iArr2 = new int[2];
                            WrapRecyclerView.this.getLocationOnScreen(iArr2);
                            if (height > iArr2[1] + WrapRecyclerView.this.getHeight()) {
                                for (PageContainerRecyclerView.PageLoadFinishListener pageLoadFinishListener : WrapRecyclerView.this.pageLoadFinishListeners) {
                                    if (pageLoadFinishListener != null) {
                                        pageLoadFinishListener.onViewHeightFinish();
                                    }
                                }
                                WrapRecyclerView.this.isPageViewHeightFinish = true;
                                WrapRecyclerView.this.removeOnLayoutChangeListener(this);
                                return;
                            }
                        }
                    }
                }
            }
        };
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae7ab5d29043fb57ab18cfa9e59db1fc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae7ab5d29043fb57ab18cfa9e59db1fc")).booleanValue() : super.canScrollVertically(i);
    }

    @Override // android.support.v7.widget.RecyclerView
    public void onChildAttachedToWindow(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a05447e761e3448cbac1bd4901a071c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a05447e761e3448cbac1bd4901a071c5");
        } else {
            super.onChildAttachedToWindow(view);
        }
    }

    @Override // android.view.ViewGroup
    public void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, Integer.valueOf(i), layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "860e5244030adc1e5d914a5e22d8e0b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "860e5244030adc1e5d914a5e22d8e0b8");
        } else {
            super.attachViewToParent(view, i, layoutParams);
        }
    }

    public void addPageLoadListener(PageContainerRecyclerView.PageLoadingListener pageLoadingListener) {
        Object[] objArr = {pageLoadingListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62f13db06bfc1ffc2038708921522d4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62f13db06bfc1ffc2038708921522d4b");
            return;
        }
        if (this.pageLoadListeners == null) {
            this.pageLoadListeners = new ArrayList();
        }
        this.pageLoadListeners.add(pageLoadingListener);
    }

    public void addPageLoadFinishListener(PageContainerRecyclerView.PageLoadFinishListener pageLoadFinishListener) {
        Object[] objArr = {pageLoadFinishListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4afd1b5924052920f73d61691655db2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4afd1b5924052920f73d61691655db2b");
            return;
        }
        if (this.pageLoadFinishListeners == null) {
            this.pageLoadFinishListeners = new ArrayList();
        }
        this.pageLoadFinishListeners.add(pageLoadFinishListener);
        if (this.isAddGlobalLayoutListener) {
            return;
        }
        addOnLayoutChangeListener(this.innerLayoutListener);
        this.isAddGlobalLayoutListener = true;
    }

    public void addHeaderView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e52c05089f53f51671dda5b7d751afc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e52c05089f53f51671dda5b7d751afc");
            return;
        }
        this.mHeaderViews.add(view);
        if (this.pageContainerAdapter != null) {
            this.pageContainerAdapter.addHeader(view);
        }
    }

    public void removeAllHeaderView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "753e5263909000b5cfd600d24da860a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "753e5263909000b5cfd600d24da860a5");
            return;
        }
        this.mHeaderViews.clear();
        if (this.pageContainerAdapter != null) {
            this.pageContainerAdapter.removeAllHeader();
        }
    }

    public void removeHeaderView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9fe7df942922f63f4ff435ed1e5fb744", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9fe7df942922f63f4ff435ed1e5fb744");
            return;
        }
        this.mHeaderViews.remove(view);
        if (this.pageContainerAdapter != null) {
            this.pageContainerAdapter.removeHeader(view);
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public void setAdapter(RecyclerView.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b62b26ea4ebcc6487dbbc808c4e6f5fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b62b26ea4ebcc6487dbbc808c4e6f5fe");
            return;
        }
        PageContainerAdapter pageContainerAdapter = new PageContainerAdapter(this.mHeaderViews, aVar, this);
        PageContainerAdapter pageContainerAdapter2 = pageContainerAdapter;
        pageContainerAdapter2.setPageLoadListeners(this.pageLoadListeners);
        pageContainerAdapter2.setPageLoadFinishListeners(this.pageLoadFinishListeners);
        pageContainerAdapter2.setAutoOffset(this.offset);
        this.pageContainerAdapter = pageContainerAdapter2;
        super.setAdapter(pageContainerAdapter);
    }

    public int getHeaderCounts() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb296007d14791eb7045b74f35be4090", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb296007d14791eb7045b74f35be4090")).intValue() : this.mHeaderViews.size();
    }

    @Override // com.dianping.shield.sectionrecycler.ShieldRecyclerViewInterface
    public View getShieldChildAt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b61a8f86ac71232711f4cb10f7d0ee7", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b61a8f86ac71232711f4cb10f7d0ee7") : getChildAt(i - getHeaderCounts());
    }

    @Override // com.dianping.shield.sectionrecycler.ShieldRecyclerViewInterface
    public int getShieldChildCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "152bf924df78eafac36c4ff9685fb8ab", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "152bf924df78eafac36c4ff9685fb8ab")).intValue() : getChildCount() - getHeaderCounts();
    }

    @Override // com.dianping.shield.sectionrecycler.ShieldRecyclerViewInterface
    public int getShieldChildAdapterPosition(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6db63795c005a990b908eddc243f8518", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6db63795c005a990b908eddc243f8518")).intValue() : getChildAdapterPosition(view) - getHeaderCounts();
    }

    @Override // com.dianping.shield.sectionrecycler.ShieldRecyclerViewInterface
    public int getShieldAdapterItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6163e527ea2b5940932489a85ee1db5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6163e527ea2b5940932489a85ee1db5")).intValue() : getAdapter().getItemCount() - getHeaderCounts();
    }

    @Override // com.dianping.shield.sectionrecycler.ShieldRecyclerViewInterface
    public int getHeaderCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "878f98f27262e53a6ea0e96844667adc", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "878f98f27262e53a6ea0e96844667adc")).intValue() : this.mHeaderViews.size();
    }

    public void setAutoOffset(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a3fc82d0b037c900743a960c83be81b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a3fc82d0b037c900743a960c83be81b");
            return;
        }
        this.offset = i;
        if (this.pageContainerAdapter != null) {
            this.pageContainerAdapter.setAutoOffset(i);
        }
    }

    public int getAutoOffset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1dda88f2b7e8e9391a3f8459bb1b7ede", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1dda88f2b7e8e9391a3f8459bb1b7ede")).intValue();
        }
        if (this.pageContainerAdapter != null) {
            return this.pageContainerAdapter.getAutoOffset();
        }
        return 0;
    }

    @Override // android.view.View
    public void addOnLayoutChangeListener(View.OnLayoutChangeListener onLayoutChangeListener) {
        Object[] objArr = {onLayoutChangeListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63966d9a98558c1210105a7fa8b96008", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63966d9a98558c1210105a7fa8b96008");
            return;
        }
        if (this.layoutChangeListeners == null) {
            this.layoutChangeListeners = new ArrayList();
        }
        this.layoutChangeListeners.add(onLayoutChangeListener);
        super.addOnLayoutChangeListener(onLayoutChangeListener);
    }

    @Override // android.view.View
    public void addOnAttachStateChangeListener(View.OnAttachStateChangeListener onAttachStateChangeListener) {
        Object[] objArr = {onAttachStateChangeListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05cb8c345750655c66a70b0a87b325c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05cb8c345750655c66a70b0a87b325c8");
            return;
        }
        if (this.attachStateChangeListeners == null) {
            this.attachStateChangeListeners = new ArrayList();
        }
        this.attachStateChangeListeners.add(onAttachStateChangeListener);
        super.addOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    @Override // android.support.v7.widget.RecyclerView
    public void addOnItemTouchListener(RecyclerView.j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6618662cf520e3d6c452a2ba5f9cc14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6618662cf520e3d6c452a2ba5f9cc14");
            return;
        }
        if (this.itemTouchListeners == null) {
            this.itemTouchListeners = new ArrayList();
        }
        this.itemTouchListeners.add(jVar);
        super.addOnItemTouchListener(jVar);
    }

    @Override // android.support.v7.widget.RecyclerView
    public void addItemDecoration(RecyclerView.f fVar, int i) {
        Object[] objArr = {fVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e082b9f30a975fe3921e79cfafec583", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e082b9f30a975fe3921e79cfafec583");
            return;
        }
        if (this.itemDecorations == null) {
            this.itemDecorations = new ArrayList();
        }
        this.itemDecorations.add(fVar);
        super.addItemDecoration(fVar, i);
    }

    public void shieldRecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8191d90d9ef293ecba92ea4bfb744678", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8191d90d9ef293ecba92ea4bfb744678");
            return;
        }
        this.pageContainerAdapter = null;
        setLayoutManager(null);
        super.setAdapter(null);
        this.mHeaderViews.clear();
        this.isPageViewHeightFinish = false;
        this.isAddGlobalLayoutListener = false;
        this.offset = 0;
        if (this.pageLoadListeners != null) {
            this.pageLoadListeners.clear();
        }
        if (this.pageLoadFinishListeners != null) {
            this.pageLoadFinishListeners.clear();
        }
        clearOnScrollListeners();
        clearOnChildAttachStateChangeListeners();
        if (this.layoutChangeListeners != null) {
            for (View.OnLayoutChangeListener onLayoutChangeListener : this.layoutChangeListeners) {
                removeOnLayoutChangeListener(onLayoutChangeListener);
            }
            this.layoutChangeListeners.clear();
        }
        if (this.attachStateChangeListeners != null) {
            for (View.OnAttachStateChangeListener onAttachStateChangeListener : this.attachStateChangeListeners) {
                removeOnAttachStateChangeListener(onAttachStateChangeListener);
            }
            this.attachStateChangeListeners.clear();
        }
        if (this.itemTouchListeners != null) {
            for (RecyclerView.j jVar : this.itemTouchListeners) {
                removeOnItemTouchListener(jVar);
            }
            this.itemTouchListeners.clear();
        }
        if (this.itemDecorations != null) {
            for (RecyclerView.f fVar : this.itemDecorations) {
                removeItemDecoration(fVar);
            }
            this.itemDecorations.clear();
        }
        setOnClickListener(null);
        setOnDragListener(null);
        setOnFocusChangeListener(null);
        setOnHierarchyChangeListener(null);
        setOnHoverListener(null);
        setOnKeyListener(null);
        setOnLongClickListener(null);
        setOnTouchListener(null);
        setOnGenericMotionListener(null);
        setOnSystemUiVisibilityChangeListener(null);
        setOnCreateContextMenuListener(null);
        if (Build.VERSION.SDK_INT >= 23) {
            setOnContextClickListener(null);
            setOnScrollChangeListener(null);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            setOnCapturedPointerListener(null);
        }
        if (Build.VERSION.SDK_INT >= 20) {
            setOnApplyWindowInsetsListener(null);
        }
        setItemAnimator(null);
        setOnFlingListener(null);
        setClickable(false);
        setLongClickable(false);
    }
}
