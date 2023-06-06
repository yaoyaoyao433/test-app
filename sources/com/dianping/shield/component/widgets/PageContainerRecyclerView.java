package com.dianping.shield.component.widgets;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.view.NestedScrollingParent2;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.HorizontalScrollView;
import com.dianping.agentsdk.pagecontainer.a;
import com.dianping.agentsdk.pagecontainer.b;
import com.dianping.agentsdk.sectionrecycler.layoutmanager.LinearLayoutManagerWithSmoothOffset;
import com.dianping.shield.bridge.ShieldLogger;
import com.dianping.shield.component.interfaces.OnDidInterceptTouchListener;
import com.dianping.shield.component.interfaces.OnDragStatusListener;
import com.dianping.shield.component.interfaces.OnInterceptTouchListener;
import com.dianping.shield.component.widgets.ScDampingEmptyHeaderView;
import com.dianping.shield.env.ShieldEnvironment;
import com.dianping.shield.node.itemcallbacks.ContentOffsetListener;
import com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface;
import com.dianping.voyager.widgets.container.secondfloor.WrapRecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PageContainerRecyclerView extends WrapRecyclerView implements NestedScrollingParent2 {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean canOffsetChangeWithDisableScroll;
    private boolean canScrollExtra;
    private SparseIntArray childHeightArray;
    private SparseIntArray childTopBetweenHeightArray;
    private ContentOffsetListener contentOffsetListener;
    public boolean disableIntercept;
    protected a firstItemScrollListener;
    private boolean hasHorizontalScrollViewParent;
    public boolean hasInterceptTouchEvent;
    private boolean hasRequestedParentDisallowIntercept;
    private RecyclerView.h innerChildAttachStateChangeListner;
    private View.OnLayoutChangeListener innerLayoutChangeListener;
    private RecyclerView.k innerScrollListener;
    public boolean isScrollToTop;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private OnScrollChangedListener mOnScrollChangedListener;
    private int mScrollPointerId;
    private final VelocityHelper mVelocityHelper;
    private OnDidInterceptTouchListener onDidInterceptTouchListener;
    private List<OnDragStatusListener> onDragStatusListeners;
    private OnInterceptTouchListener onInterceptTouchListener;
    private List<b> onTopParamsChangeListenerList;
    private List<View.OnTouchListener> onTouchListenerList;
    private boolean rvDragging;
    private ScDampingEmptyHeaderView scDampingEmptyHeaderView;
    private NestedScrollingParent2 simpleNestedScrollingParent;
    private int yDiff;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface OnScrollChangedListener {
        void onScrollChanged(int i, int i2, int i3, int i4);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface PageLoadFinishListener {
        void onCountFinish();

        void onViewHeightFinish();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface PageLoadingListener {
        void onPageLoadingFinish();
    }

    public PageContainerRecyclerView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94380489b8c9c20df05297e4af7cb5a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94380489b8c9c20df05297e4af7cb5a8");
        }
    }

    public PageContainerRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82b058094663b3b575eb26aac82548d4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82b058094663b3b575eb26aac82548d4");
            return;
        }
        this.mVelocityHelper = new VelocityHelper();
        this.onDragStatusListeners = new ArrayList();
        this.childTopBetweenHeightArray = new SparseIntArray();
        this.childHeightArray = new SparseIntArray();
        this.innerScrollListener = new RecyclerView.k() { // from class: com.dianping.shield.component.widgets.PageContainerRecyclerView.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.support.v7.widget.RecyclerView.k
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "69aac08d9a1522bb964e294c0382ee33", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "69aac08d9a1522bb964e294c0382ee33");
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                if (PageContainerRecyclerView.this.scDampingEmptyHeaderView.emptyViewHeight == PageContainerRecyclerView.this.scDampingEmptyHeaderView.orgViewHeight) {
                    PageContainerRecyclerView.this.scDampingEmptyHeaderView.contentOffsetCallBack(PageContainerRecyclerView.this.calScrollY());
                }
            }
        };
        this.innerChildAttachStateChangeListner = new RecyclerView.h() { // from class: com.dianping.shield.component.widgets.PageContainerRecyclerView.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.support.v7.widget.RecyclerView.h
            public void onChildViewDetachedFromWindow(View view) {
            }

            @Override // android.support.v7.widget.RecyclerView.h
            public void onChildViewAttachedToWindow(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2fb9f68316e427f5c89b564a74ac56f3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2fb9f68316e427f5c89b564a74ac56f3");
                } else if (view == PageContainerRecyclerView.this.scDampingEmptyHeaderView) {
                    PageContainerRecyclerView.this.scDampingEmptyHeaderView.onAttachToRecyclerView();
                }
            }
        };
        this.innerLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.dianping.shield.component.widgets.PageContainerRecyclerView.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                Object[] objArr2 = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "18eb052e2ffbe7d83701481c55cc833f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "18eb052e2ffbe7d83701481c55cc833f");
                } else if (PageContainerRecyclerView.this.scDampingEmptyHeaderView.emptyViewHeight == PageContainerRecyclerView.this.scDampingEmptyHeaderView.orgViewHeight) {
                    PageContainerRecyclerView.this.calChildTopBetweenHeight();
                }
            }
        };
        this.yDiff = 0;
        this.isScrollToTop = false;
        this.hasInterceptTouchEvent = false;
        this.hasRequestedParentDisallowIntercept = false;
        this.hasHorizontalScrollViewParent = false;
        init();
    }

    private void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca63f43f8899815079852c9d32c4c713", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca63f43f8899815079852c9d32c4c713");
            return;
        }
        setId(R.id.pagecontainer_recyclerview);
        setOverScrollMode(2);
        this.scDampingEmptyHeaderView = new ScDampingEmptyHeaderView(getContext());
        if (this.contentOffsetListener != null) {
            this.scDampingEmptyHeaderView.setContentOffsetListener(this.contentOffsetListener);
        }
        this.scDampingEmptyHeaderView.setPullExtraEnable(this.canScrollExtra);
        this.scDampingEmptyHeaderView.setOffsetChangeWithDisableScrollEnable(this.canOffsetChangeWithDisableScroll);
        setClipChildren(false);
        setClipToPadding(false);
        addOnScrollListener(this.innerScrollListener);
        addOnChildAttachStateChangeListener(this.innerChildAttachStateChangeListner);
        addOnLayoutChangeListener(this.innerLayoutChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int calScrollY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b67140b45a1c82c3a5dcd0078830753e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b67140b45a1c82c3a5dcd0078830753e")).intValue();
        }
        calChildTopBetweenHeight();
        return getContentY();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SparseIntArray calChildTopBetweenHeight() {
        int indexOfKey;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c122e65de562a2b01b11b51005dea1f", RobustBitConfig.DEFAULT_VALUE)) {
            return (SparseIntArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c122e65de562a2b01b11b51005dea1f");
        }
        boolean z = false;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            int childLayoutPosition = getChildLayoutPosition(childAt) - getHeaderCounts();
            int i2 = this.childTopBetweenHeightArray.get(childLayoutPosition);
            int i3 = this.childHeightArray.get(childLayoutPosition);
            RecyclerView.s findViewHolderForLayoutPosition = findViewHolderForLayoutPosition((getHeaderCounts() + childLayoutPosition) - 1);
            if (childLayoutPosition == 0) {
                int topDecorationHeight = getLayoutManager().getTopDecorationHeight(childAt);
                this.childTopBetweenHeightArray.put(childLayoutPosition, topDecorationHeight);
                this.childHeightArray.put(childLayoutPosition, childAt.getBottom() - topDecorationHeight);
            } else if (findViewHolderForLayoutPosition != null) {
                this.childTopBetweenHeightArray.put(childLayoutPosition, childAt.getTop() - findViewHolderForLayoutPosition.itemView.getTop());
                this.childHeightArray.put(childLayoutPosition, childAt.getBottom() - childAt.getTop());
            }
            int i4 = this.childTopBetweenHeightArray.get(childLayoutPosition);
            int i5 = this.childHeightArray.get(childLayoutPosition);
            if (i2 != i4 || i3 != i5) {
                if (i == getChildCount() - 1 && this.childTopBetweenHeightArray.size() > getChildCount() && (indexOfKey = this.childTopBetweenHeightArray.indexOfKey(childLayoutPosition) + 1) < this.childTopBetweenHeightArray.size() && this.childTopBetweenHeightArray.valueAt(indexOfKey) > 0) {
                    this.childTopBetweenHeightArray.put(this.childTopBetweenHeightArray.keyAt(indexOfKey), i5);
                }
                z = true;
            }
        }
        if (z && this.onTopParamsChangeListenerList != null && this.onTopParamsChangeListenerList.size() > 0) {
            for (b bVar : this.onTopParamsChangeListenerList) {
                bVar.OnTopParamsChange(true);
            }
        }
        return this.childTopBetweenHeightArray;
    }

    public void addOnTopParamsChangeListener(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e385e78e175144e4e15124718abe42d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e385e78e175144e4e15124718abe42d6");
            return;
        }
        if (this.onTopParamsChangeListenerList == null) {
            this.onTopParamsChangeListenerList = new ArrayList();
        }
        this.onTopParamsChangeListenerList.add(bVar);
    }

    public void removeOnTopParamsChangeListener(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9dcaacbae47dbc89881d01fc29cf4f27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9dcaacbae47dbc89881d01fc29cf4f27");
        } else if (this.onTopParamsChangeListenerList != null) {
            this.onTopParamsChangeListenerList.remove(bVar);
        }
    }

    public Pair<Integer, Integer> getViewTopBottom(int i) {
        int i2 = 0;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8e06b718faf90ff55fa0b2f6f43efb1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8e06b718faf90ff55fa0b2f6f43efb1");
        }
        if (i < 0 || this.childTopBetweenHeightArray == null || this.childTopBetweenHeightArray.size() == 0) {
            return null;
        }
        int valueAt = this.childTopBetweenHeightArray.valueAt(0);
        boolean z = i >= this.childTopBetweenHeightArray.size();
        if (z) {
            i = this.childTopBetweenHeightArray.size() - 1;
        }
        for (int i3 = 1; i3 <= i; i3++) {
            valueAt += this.childTopBetweenHeightArray.valueAt(i3);
        }
        if (this.childHeightArray.size() > i) {
            i2 = valueAt + this.childHeightArray.valueAt(i);
            if (z) {
                valueAt = i2;
            }
        }
        return new Pair<>(Integer.valueOf(valueAt), Integer.valueOf(i2));
    }

    private int getContentY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79ca5547847d05c6a1c86e52af34e6d9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79ca5547847d05c6a1c86e52af34e6d9")).intValue();
        }
        View childAt = getChildAt(0);
        if (childAt instanceof ScDampingEmptyHeaderView) {
            childAt = getChildAt(1);
        }
        int childLayoutPosition = getChildLayoutPosition(childAt) - getHeaderCounts();
        if (this.childTopBetweenHeightArray == null || this.childTopBetweenHeightArray.size() == 0 || childAt == null || childLayoutPosition >= this.childTopBetweenHeightArray.size() || childLayoutPosition < 0) {
            return -1;
        }
        int valueAt = this.childTopBetweenHeightArray.valueAt(0);
        for (int i = 1; i <= childLayoutPosition; i++) {
            valueAt += this.childTopBetweenHeightArray.valueAt(i);
        }
        return valueAt - childAt.getTop();
    }

    public void addEmptyHeaderView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2e6ab5b9a506746ca01e197a60ecb63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2e6ab5b9a506746ca01e197a60ecb63");
            return;
        }
        removeAllHeaderView();
        if (this.scDampingEmptyHeaderView != null) {
            addHeaderView(this.scDampingEmptyHeaderView);
        }
    }

    public void setEmptyHeaderViewHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57605d84ed736d1861bb6f839f8042e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57605d84ed736d1861bb6f839f8042e0");
        } else if (this.scDampingEmptyHeaderView != null) {
            this.scDampingEmptyHeaderView.resetHeaderView();
            this.scDampingEmptyHeaderView.setEmptyHeaderViewHeight(i);
        }
    }

    public void setHeaderViewOrgHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43dd6f50dbaad92479a8db23e31d909a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43dd6f50dbaad92479a8db23e31d909a");
        } else if (this.scDampingEmptyHeaderView != null) {
            this.scDampingEmptyHeaderView.setHeaderViewOrgHeight(i);
        }
    }

    public void resetPageContainerRecyclerView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f4e8cc0fa664534cca3834e5f456d42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f4e8cc0fa664534cca3834e5f456d42");
        } else if (this.scDampingEmptyHeaderView != null) {
            this.scDampingEmptyHeaderView.resetHeaderView();
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "564b52a2aa3638e36f149872dfc8fcd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "564b52a2aa3638e36f149872dfc8fcd0");
            return;
        }
        try {
            super.onDetachedFromWindow();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a26ecc4855669a69f3b1a0653fa19c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a26ecc4855669a69f3b1a0653fa19c6");
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        if (this.mOnScrollChangedListener != null) {
            this.mOnScrollChangedListener.onScrollChanged(i, i2, i3, i4);
        }
    }

    public void setFirstItemScrollListener(a aVar) {
        this.firstItemScrollListener = aVar;
    }

    public void setOnInterceptTouchListener(OnInterceptTouchListener onInterceptTouchListener) {
        this.onInterceptTouchListener = onInterceptTouchListener;
    }

    public void setDidInterceptTouchListener(OnDidInterceptTouchListener onDidInterceptTouchListener) {
        this.onDidInterceptTouchListener = onDidInterceptTouchListener;
    }

    public void addOnBeginDragListener(OnDragStatusListener onDragStatusListener) {
        Object[] objArr = {onDragStatusListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8dc870e98972238bca7a08921e24ad34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8dc870e98972238bca7a08921e24ad34");
        } else {
            this.onDragStatusListeners.add(onDragStatusListener);
        }
    }

    public void addOnTouchListener(View.OnTouchListener onTouchListener) {
        Object[] objArr = {onTouchListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f493a6bbadd787aa8798a70494124833", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f493a6bbadd787aa8798a70494124833");
            return;
        }
        if (this.onTouchListenerList == null) {
            this.onTouchListenerList = new ArrayList();
        }
        this.onTouchListenerList.add(onTouchListener);
    }

    public void removeOnTouchListener(View.OnTouchListener onTouchListener) {
        Object[] objArr = {onTouchListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36b5b8447038fad8af6adad53dd6c9f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36b5b8447038fad8af6adad53dd6c9f5");
        } else if (this.onTouchListenerList == null || onTouchListener == null || !this.onTouchListenerList.contains(onTouchListener)) {
        } else {
            this.onTouchListenerList.remove(onTouchListener);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fdf7676c482de07128856387a387e559", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fdf7676c482de07128856387a387e559")).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            this.hasRequestedParentDisallowIntercept = false;
            this.hasHorizontalScrollViewParent = checkParentIsHorizontalScrollViewParent();
            if (this.hasHorizontalScrollViewParent) {
                this.mScrollPointerId = motionEvent.getPointerId(0);
                this.mInitialTouchX = (int) (motionEvent.getX() + 0.5f);
                this.mInitialTouchY = (int) (motionEvent.getY() + 0.5f);
            }
        }
        this.hasInterceptTouchEvent = false;
        if (this.onInterceptTouchListener == null || !this.onInterceptTouchListener.onInterceptTouchEvent(motionEvent)) {
            if (super.onInterceptTouchEvent(motionEvent)) {
                if (!this.disableIntercept) {
                    this.hasInterceptTouchEvent = true;
                    if (this.onDidInterceptTouchListener != null) {
                        this.onDidInterceptTouchListener.onViewDidIntercept(this, motionEvent);
                    }
                }
                return !this.disableIntercept;
            }
            return false;
        }
        return true;
    }

    @Override // android.support.v7.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a64bd2d4abebdf9afd049ad89221582f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a64bd2d4abebdf9afd049ad89221582f");
        } else if (i == 1) {
            for (OnDragStatusListener onDragStatusListener : this.onDragStatusListeners) {
                onDragStatusListener.onBeginDrag(this);
            }
            this.rvDragging = true;
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aee60f5828d32f68ee8e63ac150e0305", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aee60f5828d32f68ee8e63ac150e0305")).booleanValue();
        }
        this.mVelocityHelper.calculateVelocity(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 1 && this.rvDragging) {
            for (OnDragStatusListener onDragStatusListener : this.onDragStatusListeners) {
                onDragStatusListener.onEndDrag(this, this.mVelocityHelper.getXVelocity(), this.mVelocityHelper.getYVelocity());
            }
            this.rvDragging = false;
        }
        if (this.onTouchListenerList != null && this.onTouchListenerList.size() > 0) {
            for (View.OnTouchListener onTouchListener : this.onTouchListenerList) {
                if (onTouchListener != null && onTouchListener.onTouch(this, motionEvent)) {
                    return true;
                }
            }
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (action == 2 && getScrollState() == 1 && !this.hasInterceptTouchEvent && this.onDidInterceptTouchListener != null) {
            this.onDidInterceptTouchListener.onViewDidIntercept(this, motionEvent);
            this.hasInterceptTouchEvent = true;
            ShieldEnvironment.INSTANCE.getShieldLogger().codeLogInfo(PageContainerRecyclerView.class, "onTouchEvent::onViewDidIntercept", "onTouchEvent::onViewDidIntercept");
        }
        if (action != 2 || !this.hasHorizontalScrollViewParent || this.hasRequestedParentDisallowIntercept || (findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId)) < 0) {
            return onTouchEvent;
        }
        int abs = Math.abs(this.mInitialTouchX - ((int) (motionEvent.getX(findPointerIndex) + 0.5f)));
        int abs2 = Math.abs(this.mInitialTouchY - ((int) (motionEvent.getY(findPointerIndex) + 0.5f)));
        if ((abs2 > abs / 2 && getLayoutManager() != null && getLayoutManager().canScrollVertically()) || getScrollState() == 1) {
            this.hasRequestedParentDisallowIntercept = true;
            getParent().requestDisallowInterceptTouchEvent(true);
            ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
            shieldLogger.codeLogInfo(PageContainerRecyclerView.class, "dy: " + abs2 + ", dx: " + abs, "onTouchEvent::requestDisallowInterceptTouchEvent");
        }
        return onTouchEvent;
    }

    private boolean checkParentIsHorizontalScrollViewParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "190184ef774290a0d94dc2bca4495889", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "190184ef774290a0d94dc2bca4495889")).booleanValue();
        }
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof HorizontalScrollView) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void computeScroll() {
        View findViewByPosition;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "220670991f5e81385a38d858022d848e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "220670991f5e81385a38d858022d848e");
        } else if ((getLayoutManager() instanceof ShieldLayoutManagerInterface) && getChildCount() != 0) {
            ShieldLayoutManagerInterface shieldLayoutManagerInterface = (ShieldLayoutManagerInterface) getLayoutManager();
            if (shieldLayoutManagerInterface.findFirstVisibleItemPosition(false) > 0) {
                if (this.firstItemScrollListener != null) {
                    this.firstItemScrollListener.onScrollChanged(0, 0, false);
                    return;
                }
                return;
            }
            if (shieldLayoutManagerInterface instanceof LinearLayoutManagerWithSmoothOffset) {
                findViewByPosition = ((LinearLayoutManagerWithSmoothOffset) shieldLayoutManagerInterface).findViewByPositionWithTop(getHeaderCounts());
            } else {
                findViewByPosition = getLayoutManager().findViewByPosition(getHeaderCounts());
            }
            if (findViewByPosition != null && shieldLayoutManagerInterface.findFirstVisibleItemPosition(false) >= 0) {
                if (shieldLayoutManagerInterface.findFirstVisibleItemPosition(false) == getHeaderCounts() || shieldLayoutManagerInterface.findFirstVisibleItemPosition(false) == 0) {
                    int top = findViewByPosition.getTop();
                    if (this.firstItemScrollListener != null) {
                        this.firstItemScrollListener.onScrollChanged(top, findViewByPosition.getMeasuredHeight(), true);
                    }
                }
            }
        }
    }

    public void setContentOffsetListener(ContentOffsetListener contentOffsetListener) {
        Object[] objArr = {contentOffsetListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de7a4b6ddcf00a77388f1d1efca65021", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de7a4b6ddcf00a77388f1d1efca65021");
            return;
        }
        this.contentOffsetListener = contentOffsetListener;
        if (this.scDampingEmptyHeaderView != null) {
            this.scDampingEmptyHeaderView.setContentOffsetListener(contentOffsetListener);
        }
    }

    public void setOffsetChangeWithDisableScrollEnable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "480911a9e03cccb1604d19a14ae792a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "480911a9e03cccb1604d19a14ae792a0");
            return;
        }
        this.canOffsetChangeWithDisableScroll = z;
        if (this.scDampingEmptyHeaderView != null) {
            this.scDampingEmptyHeaderView.setOffsetChangeWithDisableScrollEnable(z);
        }
    }

    public boolean isDraging() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23cf5f724542722039bc208ac3c6f2db", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23cf5f724542722039bc208ac3c6f2db")).booleanValue();
        }
        if (this.scDampingEmptyHeaderView != null) {
            return this.scDampingEmptyHeaderView.isDraging();
        }
        return false;
    }

    public void setContentInset(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ccf99cae9a25798a9707e99bdf3c5588", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ccf99cae9a25798a9707e99bdf3c5588");
        } else if (this.scDampingEmptyHeaderView != null) {
            this.scDampingEmptyHeaderView.setContentInset(i);
        }
    }

    public void updateHeaderView(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12a64d2cbd2ff890d6ca7c7f15d453ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12a64d2cbd2ff890d6ca7c7f15d453ce");
        } else if (this.scDampingEmptyHeaderView != null) {
            this.scDampingEmptyHeaderView.updateHeaderView(z);
        }
    }

    public void setUpdateDuration(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56830e13484605c8e09b359246ca98fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56830e13484605c8e09b359246ca98fc");
        } else if (this.scDampingEmptyHeaderView != null) {
            this.scDampingEmptyHeaderView.setUpdateDuration(i);
        }
    }

    @Deprecated
    public void setViewHeightChangedAnimListener(ScDampingEmptyHeaderView.ViewHeightChangedAnimListener viewHeightChangedAnimListener) {
        Object[] objArr = {viewHeightChangedAnimListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ce91dfe73030753fc1e0c2b2d31b582", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ce91dfe73030753fc1e0c2b2d31b582");
        } else if (this.scDampingEmptyHeaderView != null) {
            this.scDampingEmptyHeaderView.setViewHeightChangedAnimListener(viewHeightChangedAnimListener);
        }
    }

    public void setOnScrollChangedListener(OnScrollChangedListener onScrollChangedListener) {
        this.mOnScrollChangedListener = onScrollChangedListener;
    }

    public void setNestedScrollingParent(NestedScrollingParent2 nestedScrollingParent2) {
        this.simpleNestedScrollingParent = nestedScrollingParent2;
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i, int i2) {
        Object[] objArr = {view, view2, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22357f08808024936d1d2d39e793f14c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22357f08808024936d1d2d39e793f14c")).booleanValue() : this.simpleNestedScrollingParent != null && this.simpleNestedScrollingParent.onStartNestedScroll(view, view2, i, i2);
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i, int i2) {
        Object[] objArr = {view, view2, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b45dee1c8cf16b0525a2f298f4a42da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b45dee1c8cf16b0525a2f298f4a42da");
            return;
        }
        if ((view2 instanceof PageContainerRecyclerView) && this != view2) {
            this.disableIntercept = true;
        }
        if (this.simpleNestedScrollingParent != null) {
            this.simpleNestedScrollingParent.onNestedScrollAccepted(view, view2, i, i2);
        }
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onStopNestedScroll(@NonNull View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05009bf8dddfbb0cda8af63470245dcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05009bf8dddfbb0cda8af63470245dcd");
            return;
        }
        if ((view instanceof PageContainerRecyclerView) && this != view && !this.isScrollToTop) {
            this.disableIntercept = false;
        }
        if (this.simpleNestedScrollingParent != null) {
            this.simpleNestedScrollingParent.onStopNestedScroll(view, i);
        }
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4, int i5) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab0daa97732b9f93083648caad3e49f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab0daa97732b9f93083648caad3e49f1");
            return;
        }
        if ((view instanceof PageContainerRecyclerView) && this != view) {
            if (i2 != this.yDiff) {
                this.disableIntercept = false;
            }
        }
        if (this.simpleNestedScrollingParent != null) {
            this.simpleNestedScrollingParent.onNestedScroll(view, i, i2, i3, i4, i5);
        }
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedPreScroll(@NonNull View view, int i, int i2, @Nullable int[] iArr, int i3) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), iArr, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9314b61fa0a7a2481e07f1b68fbad12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9314b61fa0a7a2481e07f1b68fbad12");
            return;
        }
        this.yDiff = i2;
        if (this.simpleNestedScrollingParent != null) {
            this.simpleNestedScrollingParent.onNestedPreScroll(view, i, i2, iArr, i3);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onNestedPreFling(@NonNull View view, float f, float f2) {
        Object[] objArr = {view, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd89b43739b315c09a3a1c28e091c40a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd89b43739b315c09a3a1c28e091c40a")).booleanValue() : this.simpleNestedScrollingParent != null && this.simpleNestedScrollingParent.onNestedPreFling(view, f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onNestedFling(@NonNull View view, float f, float f2, boolean z) {
        Object[] objArr = {view, Float.valueOf(f), Float.valueOf(f2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89758a5466861c5dd657273e4d31091e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89758a5466861c5dd657273e4d31091e")).booleanValue() : this.simpleNestedScrollingParent != null && this.simpleNestedScrollingParent.onNestedFling(view, f, f2, z);
    }

    public void setPullExtraEnable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "284c4d6bcaac113ae2fcfcf849b3a4a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "284c4d6bcaac113ae2fcfcf849b3a4a5");
            return;
        }
        this.canScrollExtra = z;
        if (this.scDampingEmptyHeaderView != null) {
            this.scDampingEmptyHeaderView.setPullExtraEnable(z);
        }
    }

    public void setFrozenEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc4df1ae87b5928b3949c6a2762c7d0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc4df1ae87b5928b3949c6a2762c7d0b");
        } else if (this.scDampingEmptyHeaderView != null) {
            this.scDampingEmptyHeaderView.setFrozenEnabled(z);
        }
    }

    @Override // com.dianping.voyager.widgets.container.secondfloor.WrapRecyclerView, com.dianping.shield.preload.ShieldPreloadInterface
    public void shieldRecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32c4578ffdde81a2424b927927225dfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32c4578ffdde81a2424b927927225dfc");
            return;
        }
        super.shieldRecycle();
        this.firstItemScrollListener = null;
        this.onInterceptTouchListener = null;
        if (this.onDragStatusListeners != null) {
            this.onDragStatusListeners.clear();
        } else {
            this.onDragStatusListeners = new ArrayList();
        }
        if (this.onTouchListenerList != null) {
            this.onTouchListenerList.clear();
            this.onTouchListenerList = null;
        }
        this.onDidInterceptTouchListener = null;
        if (this.onTopParamsChangeListenerList != null) {
            this.onTopParamsChangeListenerList.clear();
            this.onTopParamsChangeListenerList = null;
        }
        this.mOnScrollChangedListener = null;
        this.contentOffsetListener = null;
        this.canScrollExtra = false;
        this.rvDragging = false;
        this.canOffsetChangeWithDisableScroll = false;
        this.simpleNestedScrollingParent = null;
        if (this.childTopBetweenHeightArray != null) {
            this.childTopBetweenHeightArray.clear();
        } else {
            this.childTopBetweenHeightArray = new SparseIntArray();
        }
        if (this.childHeightArray != null) {
            this.childHeightArray.clear();
        } else {
            this.childHeightArray = new SparseIntArray();
        }
        this.scDampingEmptyHeaderView.shieldRecycle();
        setOverScrollMode(2);
        setClipChildren(false);
        setClipToPadding(false);
        addOnLayoutChangeListener(this.innerLayoutChangeListener);
        addOnScrollListener(this.innerScrollListener);
        addOnChildAttachStateChangeListener(this.innerChildAttachStateChangeListner);
        setLayoutManager(null);
    }

    @Deprecated
    public int firstItemHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c856cb0bb77c1b414bf164ace6ddaeb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c856cb0bb77c1b414bf164ace6ddaeb")).intValue();
        }
        View findViewByPosition = getLayoutManager().findViewByPosition(0);
        if (findViewByPosition != null) {
            return findViewByPosition.getMeasuredHeight();
        }
        return 0;
    }
}
