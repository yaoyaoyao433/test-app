package com.dianping.picasso.view.list;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.SectionIndexer;
import com.dianping.picasso.PicassoBounceOnTouchListener;
import com.dianping.picasso.PicassoUtils;
import com.dianping.picasso.model.PicassoModel;
import com.dianping.picasso.view.PicassoGroupView;
import com.dianping.picasso.view.nest.PCSNestedRecyclerView;
import com.dianping.picassocontroller.widget.PCSSwipeLayout;
import com.dianping.picassocontroller.widget.a;
import com.dianping.picassocontroller.widget.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PicassoListView extends a<PCSNestedRecyclerView> implements ListComponentView, d.a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private PCSListAdapter adapter;
    private SparseArray<PicassoModel> cachedItems;
    private boolean isScrollEnabled;
    private d mIndexBar;
    private FrameLayout mStickyLayout;
    private OnLoadMoreListener onLoadMoreListener;
    public List<RecyclerView.k> onScrollListeners;
    private PicassoStickyLayout picassoStickyLayout;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface OnLoadMoreListener {
        void onLoadMore();
    }

    @Override // com.dianping.picassocontroller.widget.d.a
    public void onUnselected() {
    }

    @Override // com.dianping.picassocontroller.widget.a, com.dianping.picasso.view.list.ListComponentView
    public /* bridge */ /* synthetic */ RecyclerView getInnerView() {
        return (RecyclerView) super.getInnerView();
    }

    public PicassoListView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6f290bc66d77043e50919623e19e57e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6f290bc66d77043e50919623e19e57e");
        }
    }

    public PicassoListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "839346051255087430aaf41babe9d8a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "839346051255087430aaf41babe9d8a8");
            return;
        }
        this.adapter = null;
        this.cachedItems = new SparseArray<>();
        this.isScrollEnabled = true;
        this.onScrollListeners = new ArrayList();
        createStickyLayout(context);
    }

    private void createStickyLayout(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96f7c1a5af4ab369c4a59fc4dda2a755", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96f7c1a5af4ab369c4a59fc4dda2a755");
            return;
        }
        this.mStickyLayout = new PicassoGroupView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        addView(this.mStickyLayout, layoutParams);
        this.picassoStickyLayout = new PicassoStickyLayout(this);
        addView(this.picassoStickyLayout, layoutParams);
    }

    public FrameLayout getStickyLayout() {
        return this.mStickyLayout;
    }

    public PicassoStickyLayout getPicassoStickyLayout() {
        return this.picassoStickyLayout;
    }

    public void setScrollEnabled(boolean z) {
        this.isScrollEnabled = z;
    }

    public void setNestScrollType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c1d35eadb9aa5a8e4408e40d4febbc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c1d35eadb9aa5a8e4408e40d4febbc8");
        } else {
            ((PCSNestedRecyclerView) getInnerView()).setNestScrollType(i);
        }
    }

    public void setCaptureResponderOffset(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42ae4cdb0b5ff8c34963484168d0f879", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42ae4cdb0b5ff8c34963484168d0f879");
        } else {
            ((PCSNestedRecyclerView) getInnerView()).setCaptureResponderOffset(i);
        }
    }

    public void setSectionIndicator(SectionIndexer sectionIndexer) {
        int i = 0;
        Object[] objArr = {sectionIndexer};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8442120857d3c806eb31ec9fa3e74ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8442120857d3c806eb31ec9fa3e74ef");
            return;
        }
        if (this.mIndexBar == null) {
            this.mIndexBar = new d(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(PicassoUtils.dp2px(getContext(), 20.0f), 0);
            layoutParams.gravity = 21;
            addView(this.mIndexBar, layoutParams);
        }
        if (this.mIndexBar.getLayoutParams() != null) {
            ViewGroup.LayoutParams layoutParams2 = this.mIndexBar.getLayoutParams();
            if (sectionIndexer != null && sectionIndexer.getSections() != null) {
                i = (sectionIndexer.getSections().length * this.mIndexBar.getItemHeight()) + 20;
            }
            layoutParams2.height = i;
        }
        this.mIndexBar.setSectionIndicator(sectionIndexer);
        this.mIndexBar.setOnSelectedListener(this);
    }

    public void setIndicatorColor(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e5133ccc6378554b66d902aa8cb6727", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e5133ccc6378554b66d902aa8cb6727");
        } else if (this.mIndexBar == null) {
        } else {
            this.mIndexBar.setIndexColor(str);
        }
    }

    public SparseArray<PicassoModel> getCachedItems() {
        return this.cachedItems;
    }

    @Override // com.dianping.picasso.view.list.ListComponentView
    public void setAdapter(RecyclerView.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a4db97b1b70d1118a5c11b29aba1b55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a4db97b1b70d1118a5c11b29aba1b55");
            return;
        }
        this.adapter = (PCSListAdapter) aVar;
        if (getInnerView() != null) {
            ((PCSNestedRecyclerView) getInnerView()).setAdapter(aVar);
        }
    }

    @Override // com.dianping.picasso.view.list.ListComponentView
    public PCSListAdapter getAdapter() {
        return this.adapter;
    }

    @Override // com.dianping.picassocontroller.widget.a
    public PCSNestedRecyclerView setInnerView(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1e5e7cbeb65b4e8267bb94003ae12ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (PCSNestedRecyclerView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1e5e7cbeb65b4e8267bb94003ae12ad");
        }
        PCSNestedRecyclerView pCSNestedRecyclerView = new PCSNestedRecyclerView(context) { // from class: com.dianping.picasso.view.list.PicassoListView.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.picasso.view.nest.PCSNestedRecyclerView, android.support.v7.widget.RecyclerView, android.view.ViewGroup
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ecf55b943df9df7449a59773a77627f7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ecf55b943df9df7449a59773a77627f7")).booleanValue() : PicassoListView.this.isScrollEnabled && super.onInterceptTouchEvent(motionEvent);
            }

            @Override // com.dianping.picasso.view.nest.PCSNestedRecyclerView
            public boolean isPullRefreshing() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9a78a77a5826d4971602b9407e652222", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9a78a77a5826d4971602b9407e652222")).booleanValue();
                }
                PCSSwipeLayout pCSSwipeLayout = PicassoListView.this.swipeLayout;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = PCSSwipeLayout.a;
                return PatchProxy.isSupport(objArr3, pCSSwipeLayout, changeQuickRedirect4, false, "cb3e5f8c3860bfd113f5e844a372ec89", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, pCSSwipeLayout, changeQuickRedirect4, false, "cb3e5f8c3860bfd113f5e844a372ec89")).booleanValue() : pCSSwipeLayout.g == 0 || pCSSwipeLayout.e;
            }

            @Override // android.support.v7.widget.RecyclerView
            public boolean fling(int i, int i2) {
                RecyclerView.LayoutManager layoutManager;
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7082c35f4dbeb3f1179f33b50f8bd910", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7082c35f4dbeb3f1179f33b50f8bd910")).booleanValue();
                }
                boolean fling = super.fling(i, i2);
                if (getOnFlingListener() != null && (layoutManager = getLayoutManager()) != null && !fling && layoutManager.canScrollVertically() && Math.abs(i2) < getMinFlingVelocity()) {
                    getOnFlingListener().onFling(0, 0);
                }
                return fling;
            }
        };
        pCSNestedRecyclerView.setLayoutManager(new PicassoListViewLinearlyLayoutManage(context));
        pCSNestedRecyclerView.setNestedScrollingEnabled(true);
        pCSNestedRecyclerView.setOverScrollMode(2);
        return pCSNestedRecyclerView;
    }

    public JSONObject getIndexPathInfo(int i) {
        int[] realPosition2IndexPath;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be7bf61c239af509de0583e3c15dc3f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be7bf61c239af509de0583e3c15dc3f8");
        }
        RecyclerView recyclerView = (RecyclerView) getInnerView();
        if (((PCSListAdapter) recyclerView.getAdapter()).checkIsPicassoItem(i) && (realPosition2IndexPath = ((PCSListAdapter) recyclerView.getAdapter()).realPosition2IndexPath(i)) != null && realPosition2IndexPath[0] >= 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("itemIndex", realPosition2IndexPath[0]);
                jSONObject.put("sectionIndex", realPosition2IndexPath[1]);
                return jSONObject;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public void moveToPosition(final int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "015ccd5999d097b6d27df0ebb346a0d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "015ccd5999d097b6d27df0ebb346a0d2");
        } else if (((PCSNestedRecyclerView) getInnerView()).getLayoutManager() == null) {
        } else {
            if (!(((PCSNestedRecyclerView) getInnerView()).getLayoutManager() instanceof LinearLayoutManager)) {
                defaultScrollTo(i, z);
                return;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((PCSNestedRecyclerView) getInnerView()).getLayoutManager();
            int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (i == findFirstVisibleItemPosition) {
                if (z) {
                    ((PCSNestedRecyclerView) getInnerView()).smoothScrollToPosition(i);
                    return;
                } else {
                    ((PCSNestedRecyclerView) getInnerView()).scrollToPosition(i);
                    return;
                }
            }
            if (i < findFirstVisibleItemPosition) {
                if (z) {
                    int i2 = i + (findLastVisibleItemPosition - findFirstVisibleItemPosition) + 1;
                    if (i2 <= findFirstVisibleItemPosition) {
                        ((PCSNestedRecyclerView) getInnerView()).scrollToPosition(i2);
                    } else {
                        ((PCSNestedRecyclerView) getInnerView()).scrollToPosition(findFirstVisibleItemPosition);
                        i2 = findFirstVisibleItemPosition;
                    }
                    final int distanceFromTwoPos = this.adapter.getDistanceFromTwoPos(i, i2);
                    post(new Runnable() { // from class: com.dianping.picasso.view.list.PicassoListView.2
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // java.lang.Runnable
                        public void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b90e87ad40aa02f37322c9e8b6e765ac", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b90e87ad40aa02f37322c9e8b6e765ac");
                            } else {
                                ((PCSNestedRecyclerView) PicassoListView.this.getInnerView()).smoothScrollBy(0, -(PicassoListView.this.getScrollStickyOffset(i) + distanceFromTwoPos));
                            }
                        }
                    });
                    return;
                }
            } else if (i <= findLastVisibleItemPosition) {
                if (linearLayoutManager.findLastCompletelyVisibleItemPosition() >= linearLayoutManager.getItemCount() - 1) {
                    return;
                }
                int top = ((PCSNestedRecyclerView) getInnerView()).getChildAt(i - findFirstVisibleItemPosition).getTop() - getScrollStickyOffset(i);
                if (z) {
                    ((PCSNestedRecyclerView) getInnerView()).smoothScrollBy(0, top);
                    return;
                } else {
                    ((PCSNestedRecyclerView) getInnerView()).scrollBy(0, top);
                    return;
                }
            } else if (z) {
                final int measuredHeight = getMeasuredHeight();
                linearLayoutManager.scrollToPositionWithOffset(i, measuredHeight);
                post(new Runnable() { // from class: com.dianping.picasso.view.list.PicassoListView.3
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7652a4170b7539e54ce4c4ff6aa92f1a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7652a4170b7539e54ce4c4ff6aa92f1a");
                        } else {
                            ((PCSNestedRecyclerView) PicassoListView.this.getInnerView()).smoothScrollBy(0, measuredHeight - PicassoListView.this.getScrollStickyOffset(i));
                        }
                    }
                });
                return;
            }
            defaultScrollTo(i, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getScrollStickyOffset(int i) {
        PicassoModel picassoModel;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "186c1d15fb48513526ce5a4f2a03eb72", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "186c1d15fb48513526ce5a4f2a03eb72")).intValue();
        }
        if (this.adapter.hasStickyItem()) {
            int[] position2IndexPath = this.adapter.position2IndexPath(i);
            int i2 = position2IndexPath[0];
            int i3 = position2IndexPath[1];
            if (i2 != 0 || (picassoModel = getCachedItems().get(this.adapter.indexPath2Position(i3, -1))) == null) {
                return 0;
            }
            return picassoModel.getViewParams().height;
        }
        return this.mStickyLayout.getHeight();
    }

    private void defaultScrollTo(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e320c0c3b91fd21c42f0b1d2672bd656", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e320c0c3b91fd21c42f0b1d2672bd656");
        } else if (z) {
            ((PCSNestedRecyclerView) getInnerView()).smoothScrollToPosition(i);
        } else {
            ((LinearLayoutManager) ((PCSNestedRecyclerView) getInnerView()).getLayoutManager()).scrollToPositionWithOffset(i, this.mStickyLayout.getHeight());
        }
    }

    @Override // com.dianping.picassocontroller.widget.d.a
    public void onSelected(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9f51aa40e3fc7c9aed33750fee9de4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9f51aa40e3fc7c9aed33750fee9de4a");
        } else {
            moveToPosition(i2, false);
        }
    }

    public void setOnLoadMoreListener(OnLoadMoreListener onLoadMoreListener) {
        this.onLoadMoreListener = onLoadMoreListener;
    }

    public OnLoadMoreListener getOnLoadMoreListener() {
        return this.onLoadMoreListener;
    }

    public void smoothScrollTo(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a32590e6d454698f5bbb34ac794bbe0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a32590e6d454698f5bbb34ac794bbe0b");
        } else {
            ((PCSNestedRecyclerView) getInnerView()).smoothScrollBy(i - ((PCSNestedRecyclerView) getInnerView()).computeHorizontalScrollOffset(), i2 - ((PCSNestedRecyclerView) getInnerView()).computeVerticalScrollOffset());
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e2e0b40d36b48fecfb7e123d64b5645", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e2e0b40d36b48fecfb7e123d64b5645");
        } else {
            ((PCSNestedRecyclerView) getInnerView()).scrollBy(i - ((PCSNestedRecyclerView) getInnerView()).computeHorizontalScrollOffset(), i2 - ((PCSNestedRecyclerView) getInnerView()).computeVerticalScrollOffset());
        }
    }

    public void scrollTo(int i, int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de9e419ad995909e19587cad7831c759", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de9e419ad995909e19587cad7831c759");
        } else if (z) {
            smoothScrollTo(i, i2);
        } else {
            scrollTo(i, i2);
        }
    }

    public void setScrollBounce(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de912d681e532d28bf168afbb95b190f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de912d681e532d28bf168afbb95b190f");
        } else if (getInnerView() == null) {
        } else {
            ((PCSNestedRecyclerView) getInnerView()).setOnTouchListener(new PicassoBounceOnTouchListener(this, str) { // from class: com.dianping.picasso.view.list.PicassoListView.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.picasso.PicassoBounceOnTouchListener
                public View findFirstVisibleView() {
                    int findFirstVisibleItemPosition;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a1561d978d69b7daae66df1c4b420155", RobustBitConfig.DEFAULT_VALUE)) {
                        return (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a1561d978d69b7daae66df1c4b420155");
                    }
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((PCSNestedRecyclerView) PicassoListView.this.getInnerView()).getLayoutManager();
                    if (linearLayoutManager != null && (findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()) == 0) {
                        return linearLayoutManager.findViewByPosition(findFirstVisibleItemPosition);
                    }
                    return null;
                }

                @Override // com.dianping.picasso.PicassoBounceOnTouchListener
                public View findLastVisibleView() {
                    int findLastVisibleItemPosition;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b486ff4a7e3808cb3631077597454e69", RobustBitConfig.DEFAULT_VALUE)) {
                        return (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b486ff4a7e3808cb3631077597454e69");
                    }
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((PCSNestedRecyclerView) PicassoListView.this.getInnerView()).getLayoutManager();
                    if (linearLayoutManager != null && (findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition()) == PicassoListView.this.adapter.getItemCount() - 1) {
                        return linearLayoutManager.findViewByPosition(findLastVisibleItemPosition);
                    }
                    return null;
                }
            });
        }
    }

    public void setPullOutDistance(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34b57aff9aafd7876fc68244234e3282", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34b57aff9aafd7876fc68244234e3282");
        } else if (this.picassoStickyLayout != null) {
            this.picassoStickyLayout.setTranslationY(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class PicassoListViewLinearlyLayoutManage extends LinearLayoutManager {
        public static ChangeQuickRedirect changeQuickRedirect;

        public PicassoListViewLinearlyLayoutManage(Context context) {
            super(context);
            Object[] objArr = {PicassoListView.this, context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24a96b7ad65871a685c82033436b0d68", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24a96b7ad65871a685c82033436b0d68");
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
        @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int computeVerticalScrollOffset(android.support.v7.widget.RecyclerView.State r13) {
            /*
                r12 = this;
                r0 = 1
                java.lang.Object[] r8 = new java.lang.Object[r0]
                r9 = 0
                r8[r9] = r13
                com.meituan.robust.ChangeQuickRedirect r10 = com.dianping.picasso.view.list.PicassoListView.PicassoListViewLinearlyLayoutManage.changeQuickRedirect
                java.lang.String r11 = "3d167ea47c6006ab31e12441a299ee2a"
                r4 = 0
                r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                r1 = r8
                r2 = r12
                r3 = r10
                r5 = r11
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                if (r1 == 0) goto L22
                java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
                java.lang.Integer r13 = (java.lang.Integer) r13
                int r13 = r13.intValue()
                return r13
            L22:
                int r1 = r12.findFirstVisibleItemPosition()
                r2 = -1
                if (r1 == r2) goto L7e
                com.dianping.picasso.view.list.PicassoListView r13 = com.dianping.picasso.view.list.PicassoListView.this
                com.dianping.picasso.view.list.PCSListAdapter r13 = com.dianping.picasso.view.list.PicassoListView.access$300(r13)
                if (r13 == 0) goto L4f
                com.dianping.picasso.view.list.PicassoListView r13 = com.dianping.picasso.view.list.PicassoListView.this
                com.dianping.picasso.view.list.PCSListAdapter r13 = com.dianping.picasso.view.list.PicassoListView.access$300(r13)
                com.dianping.picasso.model.ListModel r13 = r13.getListModel()
                com.dianping.picasso.model.PicassoModel r2 = r13.listHeaderView
                if (r2 == 0) goto L4f
                if (r1 <= 0) goto L4b
                com.dianping.picasso.model.PicassoModel r13 = r13.listHeaderView
                com.dianping.picasso.model.params.PicassoModelParams r13 = r13.getViewParams()
                int r13 = r13.height
                int r13 = r13 + r9
                goto L4c
            L4b:
                r13 = 0
            L4c:
                int r2 = r1 + (-1)
                goto L51
            L4f:
                r2 = r1
                r13 = 0
            L51:
                int r2 = r2 - r0
            L52:
                if (r2 < 0) goto L72
                com.dianping.picasso.view.list.PicassoListView r0 = com.dianping.picasso.view.list.PicassoListView.this
                android.util.SparseArray r0 = r0.getCachedItems()
                java.lang.Object r0 = r0.get(r2)
                com.dianping.picasso.model.PicassoModel r0 = (com.dianping.picasso.model.PicassoModel) r0
                if (r0 == 0) goto L6f
                boolean r3 = r0.isNull()
                if (r3 != 0) goto L6f
                com.dianping.picasso.model.params.PicassoModelParams r0 = r0.getViewParams()
                int r0 = r0.height
                int r13 = r13 + r0
            L6f:
                int r2 = r2 + (-1)
                goto L52
            L72:
                android.view.View r0 = r12.findViewByPosition(r1)
                if (r0 == 0) goto L7c
                int r9 = r0.getTop()
            L7c:
                int r13 = r13 - r9
                return r13
            L7e:
                int r13 = super.computeVerticalScrollOffset(r13)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dianping.picasso.view.list.PicassoListView.PicassoListViewLinearlyLayoutManage.computeVerticalScrollOffset(android.support.v7.widget.RecyclerView$State):int");
        }
    }
}
