package com.dianping.shield.layoutmanager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ad;
import android.support.v7.widget.ai;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.agentsdk.pagecontainer.c;
import com.dianping.agentsdk.pagecontainer.e;
import com.dianping.shield.env.ShieldEnvironment;
import com.dianping.shield.logger.SCLogger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class TopLinearLayoutManager extends LinearLayoutManager implements e, CoveredYInterface {
    protected static final int BOTTOM = 1;
    protected static final boolean DEBUG = ShieldEnvironment.INSTANCE.isDebug();
    public static final int STATUS_FOLLOW = 1;
    public static final int STATUS_TOP = 0;
    protected static final int TOP = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    protected int autoOffset;
    private int coveredY;
    protected SparseArray<TBHolder> currentTopHolderList;
    protected SparseArray<View> currentTopViewList;
    protected boolean enableTop;
    private boolean interceptTouchEventForTopViews;
    private RecyclerView.j itemTouchListener;
    private HashMap<TBHolder, TopState> lastStateMap;
    protected SparseArray<TBHolder> lastTopViewHolderList;
    protected SCLogger logger;
    protected ai mOrientationHelper;
    private RecyclerView mRecyclerView;
    protected RecyclerView.m tmpRecycler;
    protected Mode topMode;
    protected SparseArray<TBHolder> topPositionList;
    protected ArrayList<OnViewTopStateChangeListener> topStateChangedListenerArrayList;
    protected ArrayList<c> topViewLayoutChangeListenerArrayList;
    protected ArrayList<Integer> topViewsInScreen;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class DiffResult {
        public static ChangeQuickRedirect changeQuickRedirect;
        public SparseArray<TBHolder> changedArr;
        public SparseArray<TBHolder> deleteArr;
        public SparseArray<TBHolder> endingArr;
        public SparseArray<TBHolder> topArr;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface OnViewTopStateChangeListener {
        void onViewTopStateChanged(TopState topState, int i, View view);
    }

    public TopLinearLayoutManager(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e44c8ea42dfb041508ae6884160e935", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e44c8ea42dfb041508ae6884160e935");
            return;
        }
        this.autoOffset = 0;
        this.topMode = Mode.OVERLAY;
        this.topStateChangedListenerArrayList = new ArrayList<>();
        this.topViewLayoutChangeListenerArrayList = new ArrayList<>();
        this.topPositionList = new SparseArray<>();
        this.currentTopHolderList = new SparseArray<>();
        this.topViewsInScreen = new ArrayList<>();
        this.currentTopViewList = new SparseArray<>();
        this.lastTopViewHolderList = new SparseArray<>();
        this.coveredY = 0;
        this.enableTop = true;
        this.lastStateMap = new HashMap<>();
        init();
    }

    public TopLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
        Object[] objArr = {context, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aeb880b12ac24fe2460b6a9041282b8c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aeb880b12ac24fe2460b6a9041282b8c");
            return;
        }
        this.autoOffset = 0;
        this.topMode = Mode.OVERLAY;
        this.topStateChangedListenerArrayList = new ArrayList<>();
        this.topViewLayoutChangeListenerArrayList = new ArrayList<>();
        this.topPositionList = new SparseArray<>();
        this.currentTopHolderList = new SparseArray<>();
        this.topViewsInScreen = new ArrayList<>();
        this.currentTopViewList = new SparseArray<>();
        this.lastTopViewHolderList = new SparseArray<>();
        this.coveredY = 0;
        this.enableTop = true;
        this.lastStateMap = new HashMap<>();
        init();
    }

    public TopLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1dadd9bb1ca5d0fe7ecb2f56d25d6e3e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1dadd9bb1ca5d0fe7ecb2f56d25d6e3e");
            return;
        }
        this.autoOffset = 0;
        this.topMode = Mode.OVERLAY;
        this.topStateChangedListenerArrayList = new ArrayList<>();
        this.topViewLayoutChangeListenerArrayList = new ArrayList<>();
        this.topPositionList = new SparseArray<>();
        this.currentTopHolderList = new SparseArray<>();
        this.topViewsInScreen = new ArrayList<>();
        this.currentTopViewList = new SparseArray<>();
        this.lastTopViewHolderList = new SparseArray<>();
        this.coveredY = 0;
        this.enableTop = true;
        this.lastStateMap = new HashMap<>();
        init();
    }

    public void setInterceptTouchEventForTopViews(boolean z) {
        this.interceptTouchEventForTopViews = z;
    }

    public void setEnableTop(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6544e72a13f89a91a6d5a84129c3cd96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6544e72a13f89a91a6d5a84129c3cd96");
            return;
        }
        this.enableTop = z;
        if (z || this.itemTouchListener == null || this.mRecyclerView == null) {
            return;
        }
        this.mRecyclerView.removeOnItemTouchListener(this.itemTouchListener);
        this.itemTouchListener = null;
    }

    @Override // com.dianping.shield.layoutmanager.CoveredYInterface
    public int getCoveredY() {
        return this.coveredY;
    }

    public void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b076c57fed9a82de9b2eae38951a1e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b076c57fed9a82de9b2eae38951a1e7");
            return;
        }
        this.interceptTouchEventForTopViews = true;
        this.logger = new SCLogger().setTag("TopLinearLayoutManager");
        this.mOrientationHelper = ai.a(this, getOrientation());
        setItemPrefetchEnabled(false);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d49878b26ef316232084761269d9538b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d49878b26ef316232084761269d9538b");
            return;
        }
        super.onAttachedToWindow(recyclerView);
        if (this.enableTop) {
            this.itemTouchListener = new RecyclerView.j() { // from class: com.dianping.shield.layoutmanager.TopLinearLayoutManager.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.support.v7.widget.RecyclerView.j
                public void onRequestDisallowInterceptTouchEvent(boolean z) {
                }

                @Override // android.support.v7.widget.RecyclerView.j
                public void onTouchEvent(RecyclerView recyclerView2, MotionEvent motionEvent) {
                }

                @Override // android.support.v7.widget.RecyclerView.j
                public boolean onInterceptTouchEvent(RecyclerView recyclerView2, MotionEvent motionEvent) {
                    Object[] objArr2 = {recyclerView2, motionEvent};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f30b928ea1b3a75d5064c9ab415a6b64", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f30b928ea1b3a75d5064c9ab415a6b64")).booleanValue();
                    }
                    if (!TopLinearLayoutManager.this.interceptTouchEventForTopViews) {
                        if (recyclerView2.getScrollState() == 2) {
                            recyclerView2.stopScroll();
                        }
                        View findChildViewUnder = recyclerView2.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
                        if (findChildViewUnder != null && TopLinearLayoutManager.this.currentTopViewList.indexOfValue(findChildViewUnder) >= 0) {
                            return findChildViewUnder.dispatchTouchEvent(motionEvent);
                        }
                    } else if (recyclerView2.getScrollState() == 2) {
                        recyclerView2.stopScroll();
                        View findChildViewUnder2 = recyclerView2.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
                        if (findChildViewUnder2 != null && TopLinearLayoutManager.this.currentTopViewList.indexOfValue(findChildViewUnder2) >= 0) {
                            findChildViewUnder2.dispatchTouchEvent(motionEvent);
                        }
                    }
                    return false;
                }
            };
            this.mRecyclerView = recyclerView;
            recyclerView.addOnItemTouchListener(this.itemTouchListener);
        }
    }

    public void setTopViewMode(Mode mode) {
        this.topMode = mode;
    }

    @Override // com.dianping.agentsdk.pagecontainer.e
    public int getAutoOffset() {
        return this.autoOffset;
    }

    @Override // com.dianping.agentsdk.pagecontainer.e
    public void setAutoOffset(int i) {
        this.autoOffset = i;
    }

    public void addTopPosition(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af58f86966dafea6ae2f264daddbc4df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af58f86966dafea6ae2f264daddbc4df");
        } else {
            addTopPosition(i, i2, i3, 0, 0);
        }
    }

    public void addTopPosition(int i, int i2, int i3, int i4, int i5) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c41f5272bc06e8a47059ce32c66bb07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c41f5272bc06e8a47059ce32c66bb07");
        } else if (i < 0 || i2 > i3) {
        } else {
            this.topPositionList.put(i, new TBHolder(i2, i3, i4, i5));
        }
    }

    public void removeTopPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a92a99da1a5fbfd9e0f9e2fa4832349a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a92a99da1a5fbfd9e0f9e2fa4832349a");
        } else {
            this.topPositionList.remove(i);
        }
    }

    public void clearTopPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d891baa9b23536f8d52cd6a5a684f77b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d891baa9b23536f8d52cd6a5a684f77b");
        } else {
            this.topPositionList.clear();
        }
    }

    public void addOnViewTopStateChangeListener(OnViewTopStateChangeListener onViewTopStateChangeListener) {
        Object[] objArr = {onViewTopStateChangeListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fba75413715550aa8b4e93c3567fd109", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fba75413715550aa8b4e93c3567fd109");
        } else if (onViewTopStateChangeListener == null || this.topStateChangedListenerArrayList.contains(onViewTopStateChangeListener)) {
        } else {
            this.topStateChangedListenerArrayList.add(onViewTopStateChangeListener);
        }
    }

    public void removeOnViewTopStateChangeListener(OnViewTopStateChangeListener onViewTopStateChangeListener) {
        Object[] objArr = {onViewTopStateChangeListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c48f07fda960a7ca686c5378f376077", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c48f07fda960a7ca686c5378f376077");
        } else {
            this.topStateChangedListenerArrayList.remove(onViewTopStateChangeListener);
        }
    }

    public void removeAllOnViewTopStateChangeListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e69dcc1a22b8d03b83e8c683500bb79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e69dcc1a22b8d03b83e8c683500bb79");
        } else {
            this.topStateChangedListenerArrayList.clear();
        }
    }

    public void addOnTopViewLayoutChangeListener(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7a6800bfa8f9230b20332e80966a719", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7a6800bfa8f9230b20332e80966a719");
        } else if (cVar == null || this.topViewLayoutChangeListenerArrayList.contains(cVar)) {
        } else {
            this.topViewLayoutChangeListenerArrayList.add(cVar);
        }
    }

    public void removeOnTopViewLayoutChangeListener(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5aabbb2202497de9dc0477b69f2daba6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5aabbb2202497de9dc0477b69f2daba6");
        } else {
            this.topViewLayoutChangeListenerArrayList.remove(cVar);
        }
    }

    public void clearOnTopViewLayoutChangeListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f482dfc432c582d805c9a8ed53cf160", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f482dfc432c582d805c9a8ed53cf160");
        } else {
            this.topViewLayoutChangeListenerArrayList.clear();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public int getChildCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53969b6a7a4ba680ab37e92fddbf46ea", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53969b6a7a4ba680ab37e92fddbf46ea")).intValue() : super.getChildCount();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public View getChildAt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "040e4bcc994ab0aa294327acb16a91d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "040e4bcc994ab0aa294327acb16a91d7");
        }
        if (i >= super.getChildCount()) {
            this.logger.d("getChildAt: %d, this is a TOP VIEW index", Integer.valueOf(i));
        }
        return super.getChildAt(i);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public int findFirstVisibleItemPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24f4be33c5c03e4934426976ceadc5a4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24f4be33c5c03e4934426976ceadc5a4")).intValue();
        }
        if (this.enableTop && this.currentTopViewList != null && this.currentTopViewList.size() > 0) {
            SparseArray<View> findItemPositionArray = findItemPositionArray();
            for (int i = 0; i < findItemPositionArray.size(); i++) {
                View valueAt = findItemPositionArray.valueAt(i);
                if (this.mOrientationHelper.e(valueAt) > 0) {
                    int keyAt = findItemPositionArray.keyAt(i);
                    if (this.currentTopViewList.indexOfKey(keyAt) >= 0) {
                        continue;
                    } else if (keyAt < this.currentTopViewList.keyAt(0)) {
                        if (this.mOrientationHelper.b(valueAt) > 0) {
                            return keyAt;
                        }
                    } else {
                        return fixFirstVisibleItem(keyAt, false);
                    }
                }
            }
        }
        return super.findFirstVisibleItemPosition();
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public int findFirstCompletelyVisibleItemPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "020ec506bb52457a27f1e649bb462513", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "020ec506bb52457a27f1e649bb462513")).intValue();
        }
        if (this.enableTop && this.currentTopViewList != null && this.currentTopViewList.size() > 0) {
            SparseArray<View> findItemPositionArray = findItemPositionArray();
            for (int i = 0; i < findItemPositionArray.size(); i++) {
                View valueAt = findItemPositionArray.valueAt(i);
                if (this.mOrientationHelper.e(valueAt) > 0) {
                    int keyAt = findItemPositionArray.keyAt(i);
                    if (this.currentTopViewList.indexOfKey(keyAt) >= 0) {
                        continue;
                    } else if (keyAt < this.currentTopViewList.keyAt(0)) {
                        if (this.mOrientationHelper.a(valueAt) >= 0 && this.mOrientationHelper.b(valueAt) <= getHeight()) {
                            return keyAt;
                        }
                    } else {
                        return fixFirstVisibleItem(keyAt, true);
                    }
                }
            }
        }
        return super.findFirstCompletelyVisibleItemPosition();
    }

    public int fixFirstVisibleItem(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4686b2e2bef27190125e413ee4e64cf5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4686b2e2bef27190125e413ee4e64cf5")).intValue();
        }
        int i2 = i - 1;
        if (this.currentTopViewList.indexOfKey(i2) < 0) {
            if (z) {
                View findViewByPositionTraversal = findViewByPositionTraversal(i);
                int c = this.mOrientationHelper.c();
                if (findViewByPositionTraversal.getTop() >= 0) {
                    if (findViewByPositionTraversal.getTop() + findViewByPositionTraversal.getMeasuredHeight() <= c) {
                        return i;
                    }
                    return -1;
                }
                int i3 = i + 1;
                View findViewByPositionTraversal2 = findViewByPositionTraversal(i3);
                if (findViewByPositionTraversal2 == null || findViewByPositionTraversal2.getTop() + findViewByPositionTraversal2.getMeasuredHeight() > c) {
                    return -1;
                }
                return i3;
            }
            return i;
        }
        View findViewByPositionTraversal3 = findViewByPositionTraversal(i);
        int a = this.mOrientationHelper.a(findViewByPositionTraversal3);
        for (int indexOfKey = this.currentTopViewList.indexOfKey(i2); indexOfKey >= 0 && a > 0 && this.currentTopViewList.keyAt(indexOfKey) == i - 1; indexOfKey--) {
            findViewByPositionTraversal3 = this.currentTopViewList.valueAt(indexOfKey);
            a -= this.mOrientationHelper.e(findViewByPositionTraversal3);
            i--;
        }
        int c2 = this.mOrientationHelper.c();
        if (a >= 0) {
            if (!z || a + findViewByPositionTraversal3.getMeasuredHeight() <= c2) {
                return i;
            }
            return -1;
        } else if (z) {
            int measuredHeight = a + findViewByPositionTraversal3.getMeasuredHeight();
            int i4 = i + 1;
            View findViewByPositionTraversal4 = findViewByPositionTraversal(i4);
            if (findViewByPositionTraversal4 != null && measuredHeight + findViewByPositionTraversal4.getMeasuredHeight() <= c2) {
                return i4;
            }
            return -1;
        } else {
            return i;
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public int findLastVisibleItemPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ce968142a0b1563afc6ccefebc81eaa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ce968142a0b1563afc6ccefebc81eaa")).intValue();
        }
        if (this.enableTop && this.currentTopViewList != null && this.currentTopViewList.size() > 0) {
            SparseArray<View> findItemPositionArray = findItemPositionArray();
            for (int size = findItemPositionArray.size() - 1; size >= 0; size--) {
                View valueAt = findItemPositionArray.valueAt(size);
                if (this.mOrientationHelper.e(valueAt) > 0) {
                    int keyAt = findItemPositionArray.keyAt(size);
                    if (this.currentTopViewList.indexOfKey(keyAt) < 0 && this.mOrientationHelper.a(valueAt) < getHeight()) {
                        return keyAt;
                    }
                }
            }
        }
        return super.findLastVisibleItemPosition();
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public int findLastCompletelyVisibleItemPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86e71a066b24576802052d98ade12c26", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86e71a066b24576802052d98ade12c26")).intValue();
        }
        if (this.enableTop && this.currentTopViewList != null && this.currentTopViewList.size() > 0) {
            SparseArray<View> findItemPositionArray = findItemPositionArray();
            for (int size = findItemPositionArray.size() - 1; size >= 0; size--) {
                View valueAt = findItemPositionArray.valueAt(size);
                if (this.mOrientationHelper.e(valueAt) > 0) {
                    int keyAt = findItemPositionArray.keyAt(size);
                    if (this.currentTopViewList.indexOfKey(keyAt) < 0 && this.mOrientationHelper.a(valueAt) >= 0 && this.mOrientationHelper.b(valueAt) <= getHeight()) {
                        return keyAt;
                    }
                }
            }
            return -1;
        }
        return super.findLastCompletelyVisibleItemPosition();
    }

    public View findViewByPositionWithTop(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7990ab748da10fea450df01fef969620", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7990ab748da10fea450df01fef969620") : findViewByPositionTraversal(i);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public View findViewByPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c123039e06f46ee5f29f63277052b22", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c123039e06f46ee5f29f63277052b22");
        }
        if (!this.enableTop) {
            return super.findViewByPosition(i);
        }
        View findViewByPositionTraversal = findViewByPositionTraversal(i);
        if (this.currentTopViewList.indexOfValue(findViewByPositionTraversal) >= 0) {
            return null;
        }
        return findViewByPositionTraversal;
    }

    public View findViewByPositionTraversal(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "128325060268887c7fc80a52afbca60e", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "128325060268887c7fc80a52afbca60e");
        }
        int childCount = super.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (getPosition(childAt) == i) {
                return childAt;
            }
        }
        return null;
    }

    public SparseArray<View> findItemPositionArray() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6af3128cc9b19cd941b00079fa733282", RobustBitConfig.DEFAULT_VALUE)) {
            return (SparseArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6af3128cc9b19cd941b00079fa733282");
        }
        SparseArray<View> sparseArray = new SparseArray<>();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            sparseArray.put(getPosition(childAt), childAt);
        }
        return sparseArray;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public void setOrientation(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "756b4283b17643082feb563a21e0e317", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "756b4283b17643082feb563a21e0e317");
            return;
        }
        super.setOrientation(i);
        this.mOrientationHelper = ai.a(this, i);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        Object[] objArr = {recyclerView, state, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e81a8f5bad03f13f6cc19a3002812ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e81a8f5bad03f13f6cc19a3002812ee");
        } else if (!this.enableTop) {
            super.smoothScrollToPosition(recyclerView, state, i);
        } else {
            TopLinearSmoothScroller topLinearSmoothScroller = new TopLinearSmoothScroller(recyclerView.getContext(), this);
            topLinearSmoothScroller.setTargetPosition(i);
            startSmoothScroll(topLinearSmoothScroller);
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.m mVar, RecyclerView.State state) {
        Object[] objArr = {mVar, state};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8dbc4c28389a3111c7e6a9ac0f8b1a5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8dbc4c28389a3111c7e6a9ac0f8b1a5c");
        } else if (!this.enableTop) {
            super.onLayoutChildren(mVar, state);
        } else {
            if (DEBUG) {
                this.logger.d("onLayoutChildren", new Object[0]);
            }
            putTopViewsBack();
            detachAndScrapCurrentTopViewList(mVar);
            super.onLayoutChildren(mVar, state);
            processTopViews(mVar, state, false);
        }
    }

    private void putTopViewsBack() {
        View childAt;
        int a;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7104ff17b8699aabede53c51dca8b73b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7104ff17b8699aabede53c51dca8b73b");
        } else if (this.currentTopHolderList != null && this.currentTopHolderList.size() != 0 && (childAt = getChildAt(0)) != null && (a = this.mOrientationHelper.a(childAt)) > 0) {
            int i = a;
            for (int position = getPosition(childAt) - 1; position >= 0 && i > 0 && this.currentTopHolderList.indexOfKey(position) >= 0; position--) {
                TBHolder tBHolder = this.currentTopHolderList.get(position);
                if (tBHolder.view != null) {
                    removeView(tBHolder.view);
                    addView(tBHolder.view, 0);
                    layoutDecoratedWithMargins(tBHolder.view, 0, i - tBHolder.height, tBHolder.view.getMeasuredWidth(), i);
                    i -= tBHolder.height;
                    this.currentTopViewList.remove(position);
                }
            }
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.m mVar, RecyclerView.State state) {
        Object[] objArr = {Integer.valueOf(i), mVar, state};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe9fb4e111af830cf4d63eb2c87c2cf2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe9fb4e111af830cf4d63eb2c87c2cf2")).intValue();
        }
        if (!this.enableTop) {
            return super.scrollHorizontallyBy(i, mVar, state);
        }
        if (DEBUG) {
            this.logger.d("scrollHorizontallyBy %d", Integer.valueOf(i));
        }
        detachAndScrapCurrentTopViewList(mVar);
        int scrollHorizontallyBy = super.scrollHorizontallyBy(i, mVar, state);
        processTopViews(mVar, state, true);
        return scrollHorizontallyBy;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.m mVar, RecyclerView.State state) {
        Object[] objArr = {Integer.valueOf(i), mVar, state};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76d4a296d735db9628707c019c14bc04", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76d4a296d735db9628707c019c14bc04")).intValue();
        }
        if (!this.enableTop) {
            return super.scrollVerticallyBy(i, mVar, state);
        }
        if (DEBUG) {
            this.logger.d("scrollVerticallyBy %d", Integer.valueOf(i));
        }
        detachAndScrapCurrentTopViewList(mVar);
        int scrollVerticallyBy = super.scrollVerticallyBy(i, mVar, state);
        processTopViews(mVar, state, true);
        return scrollVerticallyBy;
    }

    public ArrayList<Integer> getCurrentTopPositionList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "591c8e49339a6c10ecc6cb1d7c64efe9", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "591c8e49339a6c10ecc6cb1d7c64efe9");
        }
        ArrayList<Integer> arrayList = new ArrayList<>(this.currentTopHolderList.size());
        for (int i = 0; i < this.currentTopHolderList.size(); i++) {
            arrayList.add(Integer.valueOf(this.currentTopHolderList.keyAt(i)));
        }
        return arrayList;
    }

    public boolean isCurrentAtTop(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7932caded2a492e3cb8112abf7484d67", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7932caded2a492e3cb8112abf7484d67")).booleanValue() : this.currentTopViewList.indexOfKey(i) >= 0;
    }

    public boolean isTopPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54ec870213bbed523a8ac07570c44c15", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54ec870213bbed523a8ac07570c44c15")).booleanValue() : this.topPositionList.indexOfKey(i) >= 0;
    }

    public void processTopViews(RecyclerView.m mVar, RecyclerView.State state, boolean z) {
        int i;
        Object[] objArr = {mVar, state, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "338cd44b7fe080b53b59eb5ae5f1607b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "338cd44b7fe080b53b59eb5ae5f1607b");
            return;
        }
        this.tmpRecycler = mVar;
        if (DEBUG) {
            this.logger.d("Start processTopViews =======================", new Object[0]);
        }
        this.lastTopViewHolderList.clear();
        this.lastStateMap.clear();
        for (int i2 = 0; i2 < this.currentTopHolderList.size(); i2++) {
            TBHolder valueAt = this.currentTopHolderList.valueAt(i2);
            this.lastTopViewHolderList.put(this.currentTopHolderList.keyAt(i2), valueAt);
            this.lastStateMap.put(valueAt, valueAt.state);
        }
        this.topViewsInScreen.clear();
        this.currentTopHolderList.clear();
        int i3 = this.autoOffset;
        int findFirstVisibleItemPosition = findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = findLastVisibleItemPosition();
        int i4 = (findLastVisibleItemPosition - findFirstVisibleItemPosition) + 1;
        if (DEBUG) {
            this.logger.d("processTopViews %s", this.topPositionList);
        }
        int i5 = i3;
        int i6 = 0;
        while (true) {
            if (i6 >= this.topPositionList.size()) {
                break;
            }
            int keyAt = this.topPositionList.keyAt(i6);
            if (DEBUG) {
                this.logger.d("handleData top view %d", Integer.valueOf(keyAt));
            }
            TBHolder valueAt2 = this.topPositionList.valueAt(i6);
            int i7 = valueAt2.startPos;
            int i8 = valueAt2.endPos;
            View findViewByPosition = findViewByPosition(findFirstVisibleItemPosition);
            if (i8 >= findFirstVisibleItemPosition || findViewByPosition == null || findViewByPosition.getTop() > 0) {
                View findViewByPosition2 = findViewByPosition(findLastVisibleItemPosition);
                if (i7 <= findLastVisibleItemPosition || findViewByPosition2 == null || findViewByPosition2.getBottom() < getHeight()) {
                    valueAt2.view = getViewByPosition(keyAt, mVar);
                    if (valueAt2.view != null) {
                        if (valueAt2.view.getHeight() == 0) {
                            valueAt2.view.requestLayout();
                        }
                        measureChildWithMargins(valueAt2.view, 0, 0);
                        valueAt2.height = this.mOrientationHelper.e(valueAt2.view);
                        i = i6;
                        int findInlineViewTopOrBottom = findInlineViewTopOrBottom(0, valueAt2.startPos, keyAt, valueAt2, findFirstVisibleItemPosition, findLastVisibleItemPosition, mVar);
                        if (DEBUG) {
                            this.logger.d("find startTopPos %d for top view %d", Integer.valueOf(findInlineViewTopOrBottom), Integer.valueOf(keyAt));
                        }
                        int findInlineViewTopOrBottom2 = findInlineViewTopOrBottom(1, valueAt2.endPos, keyAt, valueAt2, findFirstVisibleItemPosition, findLastVisibleItemPosition, mVar);
                        if (DEBUG) {
                            this.logger.d("find endBottomPos %d for top view %d", Integer.valueOf(findInlineViewTopOrBottom2), Integer.valueOf(keyAt));
                        }
                        if (this.topMode == Mode.OVERLAY) {
                            i5 = this.autoOffset;
                        }
                        int i9 = i5 + valueAt2.offset;
                        if (DEBUG) {
                            this.logger.d("Calculate whether to set top : startTopPos = %d, topLine = %d and endBottomPos = %d ", Integer.valueOf(findInlineViewTopOrBottom), Integer.valueOf(i9), Integer.valueOf(findInlineViewTopOrBottom2));
                        }
                        valueAt2.state = TopState.NORMAL;
                        if (findInlineViewTopOrBottom <= i9 && findInlineViewTopOrBottom2 > 0) {
                            if (keyAt >= findFirstVisibleItemPosition && keyAt <= findLastVisibleItemPosition) {
                                if (this.topViewsInScreen.size() >= i4 - 1) {
                                    if (DEBUG) {
                                        this.logger.d("NOT Add position %d to TOP with startTopPosition = %d, topLine = %d, endBottomPos = %d \n \t\t with holder %s", Integer.valueOf(keyAt), Integer.valueOf(findInlineViewTopOrBottom), Integer.valueOf(i9), Integer.valueOf(findInlineViewTopOrBottom2), valueAt2);
                                    }
                                } else {
                                    this.topViewsInScreen.add(Integer.valueOf(keyAt));
                                }
                            }
                            valueAt2.layoutPosition = i9;
                            valueAt2.state = TopState.TOP;
                            if (valueAt2.layoutPosition > findInlineViewTopOrBottom2 - valueAt2.height) {
                                valueAt2.layoutPosition = findInlineViewTopOrBottom2 - valueAt2.height;
                                valueAt2.state = TopState.ENDING_TOP;
                            }
                            i9 = valueAt2.layoutPosition + valueAt2.height;
                            this.currentTopHolderList.put(keyAt, valueAt2);
                            if (DEBUG) {
                                this.logger.d("Add position %d to TOP with startTopPosition = %d, topLine = %d, endBottomPos = %d \n \t\t with holder %s", Integer.valueOf(keyAt), Integer.valueOf(findInlineViewTopOrBottom), Integer.valueOf(i9), Integer.valueOf(findInlineViewTopOrBottom2), valueAt2);
                                i5 = i9;
                                i6 = i + 1;
                            }
                        }
                        i5 = i9;
                        i6 = i + 1;
                    }
                }
            }
            i = i6;
            i6 = i + 1;
        }
        this.currentTopViewList.clear();
        for (int i10 = 0; i10 < this.currentTopHolderList.size(); i10++) {
            this.currentTopViewList.put(this.currentTopHolderList.keyAt(i10), this.currentTopHolderList.valueAt(i10).view);
        }
        DiffResult diffViews = diffViews(this.lastTopViewHolderList, this.currentTopHolderList);
        if (diffViews != null) {
            dispatchTopStateChangeEvent(diffViews);
            if (z) {
                putViewsBack(diffViews.deleteArr, findFirstVisibleItemPosition, findLastVisibleItemPosition, mVar);
            }
        }
        layoutTopViews(this.currentTopHolderList);
    }

    public int findInlineViewTopOrBottom(int i, int i2, int i3, TBHolder tBHolder, int i4, int i5, RecyclerView.m mVar) {
        int b;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), tBHolder, Integer.valueOf(i4), Integer.valueOf(i5), mVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72ec4626a4a883ffc0bac944896abbe0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72ec4626a4a883ffc0bac944896abbe0")).intValue();
        }
        if (i2 >= getItemCount()) {
            return Integer.MAX_VALUE;
        }
        if (i2 < 0) {
            return 0;
        }
        int i6 = this.autoOffset;
        int c = this.mOrientationHelper.c();
        if (i2 < i4) {
            View findViewByPositionWithTop = findViewByPositionWithTop(i4);
            if (findViewByPositionWithTop == null) {
                return 0;
            }
            b = this.mOrientationHelper.a(findViewByPositionWithTop);
            for (int i7 = i4 - 1; i7 >= i2 && b > i6; i7--) {
                if (i7 != i2 || i == 0) {
                    if (this.currentTopHolderList.indexOfKey(i7) >= 0) {
                        b -= this.currentTopHolderList.get(i7).height;
                    } else if (i7 == i3) {
                        b -= tBHolder.height;
                    } else {
                        b -= this.mOrientationHelper.e(getViewByPosition(i7, mVar));
                    }
                }
            }
        } else if (i2 > i5) {
            View findViewByPositionWithTop2 = findViewByPositionWithTop(i5);
            if (findViewByPositionWithTop2 == null) {
                return 0;
            }
            b = this.mOrientationHelper.b(findViewByPositionWithTop2);
            for (int i8 = i5 + 1; i8 <= i2 && b < c; i8++) {
                if (i8 != i2 || i == 1) {
                    if (this.currentTopHolderList.indexOfKey(i8) >= 0) {
                        b += this.currentTopHolderList.get(i8).height;
                    } else if (i8 == i3) {
                        b += tBHolder.height;
                    } else {
                        b += this.mOrientationHelper.e(getViewByPosition(i8, mVar));
                    }
                }
            }
        } else if (i2 != i3 && this.currentTopHolderList.indexOfKey(i2) < 0) {
            if (i == 0) {
                return this.mOrientationHelper.a(getViewByPosition(i2, mVar));
            }
            return this.mOrientationHelper.b(getViewByPosition(i2, mVar));
        } else {
            int i9 = i2;
            while (i9 >= i4 && (this.currentTopHolderList.indexOfKey(i9) >= 0 || i9 == i3)) {
                i9--;
            }
            if (i9 >= i4) {
                int b2 = this.mOrientationHelper.b(getViewByPosition(i9, mVar));
                for (int i10 = i9 + 1; i10 < i2; i10++) {
                    if (i9 == i3) {
                        b2 += tBHolder.height;
                    } else if (this.currentTopHolderList.indexOfKey(i10) >= 0) {
                        b2 += this.currentTopHolderList.get(i10).height;
                    }
                }
                if (i == 1) {
                    if (i2 == i3) {
                        return b2 + tBHolder.height;
                    }
                    return this.currentTopHolderList.indexOfKey(i2) >= 0 ? b2 + this.currentTopHolderList.get(i2).height : b2;
                }
                return b2;
            }
            int i11 = i2;
            while (i11 <= i5 && (this.currentTopHolderList.indexOfKey(i11) >= 0 || i11 == i3)) {
                i11++;
            }
            if (i11 >= getItemCount()) {
                return 0;
            }
            int a = this.mOrientationHelper.a(getViewByPosition(i11, mVar));
            for (int i12 = i11 - 1; i12 > i2; i12--) {
                if (i12 == i3) {
                    a -= tBHolder.height;
                } else if (this.currentTopViewList.indexOfKey(i12) >= 0) {
                    a -= this.currentTopHolderList.get(i12).height;
                }
            }
            if (i == 0) {
                if (i2 == i3) {
                    return a - tBHolder.height;
                }
                return this.currentTopViewList.indexOfKey(i2) >= 0 ? a - this.currentTopHolderList.get(i2).height : a;
            }
            return a;
        }
        return b;
    }

    public void layoutTopViews(SparseArray<TBHolder> sparseArray) {
        Object[] objArr = {sparseArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d9ecd2a555a393ffb3ea6381783b023", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d9ecd2a555a393ffb3ea6381783b023");
            return;
        }
        this.coveredY = 0;
        if (sparseArray != null) {
            SparseArray sparseArray2 = new SparseArray();
            for (int i = 0; i < sparseArray.size(); i++) {
                int keyAt = sparseArray.keyAt(i);
                TBHolder valueAt = sparseArray.valueAt(i);
                SparseArray sparseArray3 = (SparseArray) sparseArray2.get(valueAt.zPosition);
                if (sparseArray3 == null) {
                    sparseArray3 = new SparseArray();
                    sparseArray2.put(valueAt.zPosition, sparseArray3);
                }
                sparseArray3.put(keyAt, valueAt);
            }
            if (sparseArray2.size() > 0) {
                for (int i2 = 0; i2 < sparseArray2.size(); i2++) {
                    SparseArray sparseArray4 = (SparseArray) sparseArray2.valueAt(i2);
                    for (int size = sparseArray4.size() - 1; size >= 0; size--) {
                        int keyAt2 = sparseArray4.keyAt(size);
                        TBHolder tBHolder = (TBHolder) sparseArray4.valueAt(size);
                        layoutTopView(keyAt2, tBHolder);
                        if (tBHolder.layoutPosition + tBHolder.height > this.coveredY) {
                            this.coveredY = tBHolder.layoutPosition + tBHolder.height;
                        }
                    }
                }
            }
        }
    }

    public void dispatchTopStateChangeEvent(DiffResult diffResult) {
        Object[] objArr = {diffResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1217d4371b2ffdf3fe8e4dd54839eebb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1217d4371b2ffdf3fe8e4dd54839eebb");
        } else if (diffResult == null) {
        } else {
            dispatchTopStageChangeEvent(diffResult.changedArr);
        }
    }

    public void dispatchTopStageChangeEvent(SparseArray<TBHolder> sparseArray) {
        Object[] objArr = {sparseArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8e416c28bbe51696c4f05f8dc844275", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8e416c28bbe51696c4f05f8dc844275");
        } else if (sparseArray != null && sparseArray.size() != 0) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                TBHolder valueAt = sparseArray.valueAt(i);
                this.logger.i("Dispatch top state change event for position %d with top stage = %s", Integer.valueOf(keyAt), valueAt.state);
                callOnViewTopStateChanged(valueAt.state, keyAt, valueAt.view);
            }
        }
    }

    public void putViewsBack(SparseArray<TBHolder> sparseArray, int i, int i2, RecyclerView.m mVar) {
        int e;
        View view;
        boolean z;
        int e2;
        View view2;
        boolean z2;
        int i3;
        int i4;
        Object[] objArr = {sparseArray, Integer.valueOf(i), Integer.valueOf(i2), mVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35c2fef4f311b0e70f6483041f98ef90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35c2fef4f311b0e70f6483041f98ef90");
        } else if (sparseArray != null && sparseArray.size() != 0) {
            int i5 = i;
            int i6 = 0;
            while (true) {
                if ((sparseArray.indexOfKey(i5) >= 0 || this.currentTopViewList.indexOfKey(i5) >= 0) && i5 <= i2) {
                    i5++;
                    i6++;
                }
            }
            View findViewByPositionWithTop = findViewByPositionWithTop(i5);
            int i7 = i5 + 1;
            int b = findViewByPositionWithTop != null ? this.mOrientationHelper.b(findViewByPositionWithTop) : 0;
            int c = this.mOrientationHelper.c();
            int i8 = i6;
            int i9 = i7;
            int i10 = b;
            while (i10 < c && i9 < getItemCount() && sparseArray.size() > 0) {
                if (sparseArray.indexOfKey(i9) >= 0) {
                    TBHolder tBHolder = sparseArray.get(i9);
                    e2 = tBHolder.height;
                    view2 = tBHolder.view;
                    z2 = true;
                } else {
                    View viewByPosition = getViewByPosition(i9, mVar);
                    e2 = this.mOrientationHelper.e(viewByPosition);
                    view2 = viewByPosition;
                    z2 = false;
                }
                if (this.currentTopViewList.indexOfKey(i9) >= 0 || (!z2 && i9 <= i2)) {
                    i3 = i8;
                    i4 = i9;
                } else {
                    addView(view2, i8);
                    i3 = i8;
                    i4 = i9;
                    layoutDecoratedWithMargins(view2, 0, i10, view2.getMeasuredWidth(), i10 + e2);
                }
                sparseArray.remove(i4);
                i10 += e2;
                i9 = i4 + 1;
                i8 = i3 + 1;
            }
            int i11 = i5 - 1;
            int c2 = this.mOrientationHelper.c();
            if (findViewByPositionWithTop != null) {
                c2 = this.mOrientationHelper.a(findViewByPositionWithTop);
            }
            int b2 = this.mOrientationHelper.b();
            int i12 = c2;
            for (int i13 = i11; i12 > b2 && i13 >= 0 && sparseArray.size() > 0; i13--) {
                if (sparseArray.indexOfKey(i13) >= 0) {
                    TBHolder tBHolder2 = sparseArray.get(i13);
                    e = tBHolder2.height;
                    view = tBHolder2.view;
                    z = true;
                } else {
                    View viewByPosition2 = getViewByPosition(i13, mVar);
                    e = this.mOrientationHelper.e(viewByPosition2);
                    view = viewByPosition2;
                    z = false;
                }
                if (this.currentTopViewList.indexOfKey(i13) < 0 && (z || i13 > i2)) {
                    addView(view, 0);
                    layoutDecoratedWithMargins(view, 0, i12 - e, view.getMeasuredWidth(), i12);
                }
                sparseArray.remove(i13);
                i12 -= e;
            }
        }
    }

    public void callOnViewTopStateChanged(TopState topState, int i, View view) {
        Object[] objArr = {topState, Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e345e84f312f1bf577c77d9e029165b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e345e84f312f1bf577c77d9e029165b9");
            return;
        }
        if (this.topStateChangedListenerArrayList != null && !this.topStateChangedListenerArrayList.isEmpty()) {
            Iterator<OnViewTopStateChangeListener> it = this.topStateChangedListenerArrayList.iterator();
            while (it.hasNext()) {
                it.next().onViewTopStateChanged(topState, i, view);
            }
        }
        if (this.topViewLayoutChangeListenerArrayList == null || this.topViewLayoutChangeListenerArrayList.isEmpty()) {
            return;
        }
        Iterator<c> it2 = this.topViewLayoutChangeListenerArrayList.iterator();
        while (it2.hasNext()) {
            it2.next();
            TopState topState2 = TopState.NORMAL;
            if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                view.getLayoutParams();
            }
        }
    }

    public DiffResult diffViews(SparseArray<TBHolder> sparseArray, SparseArray<TBHolder> sparseArray2) {
        int i = 0;
        Object[] objArr = {sparseArray, sparseArray2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9412323242d2bf156378e1308e23266", RobustBitConfig.DEFAULT_VALUE)) {
            return (DiffResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9412323242d2bf156378e1308e23266");
        }
        DiffResult diffResult = new DiffResult();
        if (sparseArray == null || sparseArray.size() == 0) {
            diffResult.topArr = sparseArray2;
            diffResult.changedArr = sparseArray2;
            int size = sparseArray2.size();
            while (i < size) {
                diffResult.topArr.valueAt(i).state = TopState.TOP;
                i++;
            }
            return diffResult;
        } else if (sparseArray2 == null || sparseArray2.size() == 0) {
            diffResult.deleteArr = sparseArray;
            diffResult.changedArr = sparseArray;
            int size2 = sparseArray.size();
            while (i < size2) {
                diffResult.deleteArr.valueAt(i).state = TopState.NORMAL;
                i++;
            }
            return diffResult;
        } else {
            diffResult.changedArr = new SparseArray<>();
            diffResult.topArr = new SparseArray<>();
            diffResult.deleteArr = new SparseArray<>();
            diffResult.endingArr = new SparseArray<>();
            int size3 = sparseArray.size();
            int size4 = sparseArray2.size();
            int i2 = 0;
            while (i < size3 && i2 < size4) {
                int keyAt = sparseArray.keyAt(i);
                int keyAt2 = sparseArray2.keyAt(i2);
                if (keyAt < keyAt2) {
                    TBHolder valueAt = sparseArray.valueAt(i);
                    valueAt.state = TopState.NORMAL;
                    diffResult.changedArr.put(keyAt, valueAt);
                    diffResult.deleteArr.put(keyAt, valueAt);
                    i++;
                } else if (keyAt > keyAt2) {
                    TBHolder valueAt2 = sparseArray2.valueAt(i2);
                    if (valueAt2.state == TopState.TOP) {
                        diffResult.topArr.put(keyAt2, valueAt2);
                    } else if (valueAt2.state == TopState.ENDING_TOP) {
                        diffResult.endingArr.put(keyAt2, valueAt2);
                    }
                    diffResult.changedArr.put(keyAt2, valueAt2);
                    i2++;
                } else {
                    TopState topState = this.lastStateMap.get(sparseArray.valueAt(i));
                    TBHolder valueAt3 = sparseArray2.valueAt(i2);
                    if (valueAt3.state != topState) {
                        if (valueAt3.state == TopState.TOP) {
                            diffResult.topArr.put(keyAt2, valueAt3);
                        } else if (valueAt3.state == TopState.ENDING_TOP) {
                            diffResult.endingArr.put(keyAt2, valueAt3);
                        }
                        diffResult.changedArr.put(keyAt2, valueAt3);
                    }
                    i++;
                    i2++;
                }
            }
            while (i < size3) {
                int keyAt3 = sparseArray.keyAt(i);
                TBHolder valueAt4 = sparseArray.valueAt(i);
                diffResult.deleteArr.put(keyAt3, valueAt4);
                diffResult.changedArr.put(keyAt3, valueAt4);
                i++;
            }
            while (i2 < size4) {
                int keyAt4 = sparseArray2.keyAt(i2);
                TBHolder valueAt5 = sparseArray2.valueAt(i2);
                diffResult.topArr.put(keyAt4, valueAt5);
                diffResult.changedArr.put(keyAt4, valueAt5);
                i2++;
            }
            return diffResult;
        }
    }

    public void layoutTopView(int i, TBHolder tBHolder) {
        Object[] objArr = {Integer.valueOf(i), tBHolder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5df1e8c4b5484b947c0081ba11a0a133", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5df1e8c4b5484b947c0081ba11a0a133");
            return;
        }
        addView(tBHolder.view);
        if (DEBUG) {
            this.logger.d("layout %d top view at [%d, %d - %d, %d]", Integer.valueOf(i), 0, Integer.valueOf(tBHolder.layoutPosition), Integer.valueOf(getWidth()), Integer.valueOf(tBHolder.layoutPosition + tBHolder.height));
        }
        layoutDecoratedWithMargins(tBHolder.view, 0, tBHolder.layoutPosition, getWidth(), tBHolder.layoutPosition + tBHolder.height);
    }

    public View getViewByPosition(int i, RecyclerView.m mVar) {
        Object[] objArr = {Integer.valueOf(i), mVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ec58bcab3aed7fa786af68bffd5613a", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ec58bcab3aed7fa786af68bffd5613a");
        }
        View findViewByPositionWithTop = findViewByPositionWithTop(i);
        return findViewByPositionWithTop == null ? getViewFromRecycler(i, mVar) : findViewByPositionWithTop;
    }

    public View getViewFromRecycler(int i, RecyclerView.m mVar) {
        Object[] objArr = {Integer.valueOf(i), mVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a3f25520f4c1ab79c5c0cbe26374149", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a3f25520f4c1ab79c5c0cbe26374149");
        }
        if (mVar == null) {
            return null;
        }
        View viewFromScrapList = getViewFromScrapList(i, mVar);
        return (viewFromScrapList != null || i >= getItemCount()) ? viewFromScrapList : mVar.b(i);
    }

    public void detachAndScrapCurrentTopViewList(RecyclerView.m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a18a7285c45f61f9141c786a35e0ee9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a18a7285c45f61f9141c786a35e0ee9");
        } else if (this.currentTopViewList != null && this.currentTopViewList.size() > 0) {
            for (int i = 0; i < this.currentTopViewList.size(); i++) {
                detachAndScrapView(this.currentTopViewList.valueAt(i), mVar);
            }
            this.currentTopViewList.clear();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum Mode {
        SINGLY,
        OVERLAY;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        Mode() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ecf492d864865c5516afabda20b7d0e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ecf492d864865c5516afabda20b7d0e");
            }
        }

        public static Mode valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "facdf014e6ae5f6703e19c9994a8fc64", RobustBitConfig.DEFAULT_VALUE) ? (Mode) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "facdf014e6ae5f6703e19c9994a8fc64") : (Mode) Enum.valueOf(Mode.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Mode[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0b6bcd387002e668c30cd102c6e57d39", RobustBitConfig.DEFAULT_VALUE) ? (Mode[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0b6bcd387002e668c30cd102c6e57d39") : (Mode[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum TopState {
        NORMAL,
        TOP,
        ENDING_TOP;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        TopState() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b23f2342db1a9104e99b45c7aa06443d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b23f2342db1a9104e99b45c7aa06443d");
            }
        }

        public static TopState valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4fd96a5c5adb5649df9e7ea55ac2687f", RobustBitConfig.DEFAULT_VALUE) ? (TopState) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4fd96a5c5adb5649df9e7ea55ac2687f") : (TopState) Enum.valueOf(TopState.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static TopState[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "66dc95df36489ed734d3bc12d2376538", RobustBitConfig.DEFAULT_VALUE) ? (TopState[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "66dc95df36489ed734d3bc12d2376538") : (TopState[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class TBHolder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int endPos;
        public int height;
        public int layoutPosition;
        public int offset;
        public int startPos;
        public TopState state;
        public View view;
        public int zPosition;

        public TBHolder(int i, int i2, int i3, int i4) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "535771b9d3ac6c4f991eca391a014b98", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "535771b9d3ac6c4f991eca391a014b98");
                return;
            }
            this.offset = 0;
            this.zPosition = 0;
            this.startPos = 0;
            this.endPos = Integer.MAX_VALUE;
            this.layoutPosition = 0;
            this.offset = i3;
            this.zPosition = i4;
            this.startPos = i;
            this.endPos = i2;
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "707e7f55174a7c649d3b185e35b90ea5", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "707e7f55174a7c649d3b185e35b90ea5");
            }
            return "TBHolder{offset=" + this.offset + ", zPosition=" + this.zPosition + ", startPos=" + this.startPos + ", endPos=" + this.endPos + ", view=" + this.view + ", layoutPosition=" + this.layoutPosition + ", height=" + this.height + '}';
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class TopLinearSmoothScroller extends ad {
        public static ChangeQuickRedirect changeQuickRedirect;
        protected int actualPosition;
        protected Context context;
        protected int densityDpi;
        protected LinearLayoutManager llm;
        protected RecyclerView.m recycler;
        protected float scrollSpeed;
        protected int targetPos;
        protected TopLinearLayoutManager tllm;
        protected int topOffset;

        public TopLinearSmoothScroller(Context context, @NonNull LinearLayoutManager linearLayoutManager) {
            super(context);
            Object[] objArr = {context, linearLayoutManager};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ba2de430520347efe964446b8c56e29", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ba2de430520347efe964446b8c56e29");
                return;
            }
            this.scrollSpeed = -1.0f;
            this.context = context;
            this.llm = linearLayoutManager;
            if (this.llm instanceof TopLinearLayoutManager) {
                this.tllm = (TopLinearLayoutManager) this.llm;
                this.recycler = this.tllm.tmpRecycler;
            }
        }

        @Override // android.support.v7.widget.RecyclerView.p
        public void setTargetPosition(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4da50a45f4f263e80b19f0a50e52143e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4da50a45f4f263e80b19f0a50e52143e");
                return;
            }
            this.targetPos = i;
            this.actualPosition = i;
            if (this.tllm != null && this.tllm.getOrientation() == 1) {
                while (this.tllm.topPositionList.indexOfKey(this.actualPosition) >= 0 && this.actualPosition < this.tllm.getItemCount()) {
                    View findViewByPositionWithTop = this.tllm.findViewByPositionWithTop(this.actualPosition);
                    if (findViewByPositionWithTop == null) {
                        findViewByPositionWithTop = this.tllm.getViewFromRecycler(this.actualPosition, this.recycler);
                        this.tllm.measureChild(findViewByPositionWithTop, 0, 0);
                    }
                    this.topOffset += this.tllm.mOrientationHelper.e(findViewByPositionWithTop);
                    this.actualPosition++;
                }
                if (this.tllm.topPositionList.indexOfKey(this.actualPosition) >= 0) {
                    this.actualPosition = i;
                    while (this.tllm.currentTopViewList.indexOfKey(this.actualPosition) >= 0 && this.actualPosition >= 0) {
                        View findViewByPositionWithTop2 = this.tllm.findViewByPositionWithTop(this.actualPosition);
                        if (findViewByPositionWithTop2 == null) {
                            findViewByPositionWithTop2 = this.tllm.getViewFromRecycler(this.actualPosition, this.recycler);
                            this.tllm.measureChild(findViewByPositionWithTop2, 0, 0);
                        }
                        this.topOffset -= this.tllm.mOrientationHelper.e(findViewByPositionWithTop2);
                        this.actualPosition--;
                    }
                }
            }
            super.setTargetPosition(this.actualPosition);
        }

        public int getTopOffset() {
            return this.topOffset;
        }

        public void setScrollSpeed(float f) {
            this.scrollSpeed = f;
        }

        @Override // android.support.v7.widget.ad
        public int calculateTimeForScrolling(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ecc35dbe539a8c1e559866a8d395ccf6", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ecc35dbe539a8c1e559866a8d395ccf6")).intValue();
            }
            if (this.scrollSpeed != -1.0f && this.scrollSpeed > 0.0f) {
                if (this.densityDpi == 0) {
                    this.densityDpi = this.context.getResources().getDisplayMetrics().densityDpi;
                }
                return (int) Math.ceil(Math.abs(i) * ((1000.0f / this.scrollSpeed) / this.densityDpi));
            }
            return super.calculateTimeForScrolling(i);
        }

        @Override // android.support.v7.widget.ad, android.support.v7.widget.RecyclerView.p
        public void onTargetFound(View view, RecyclerView.State state, RecyclerView.p.a aVar) {
            Object[] objArr = {view, state, aVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c78f5bceeeb362e054ebaa16949d0b41", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c78f5bceeeb362e054ebaa16949d0b41");
                return;
            }
            int calculateDxToMakeVisible = calculateDxToMakeVisible(view, getHorizontalSnapPreference());
            int calculateDyToMakeVisible = calculateDyToMakeVisible(view, getVerticalSnapPreference()) + getTopOffset();
            int calculateTimeForDeceleration = calculateTimeForDeceleration((int) Math.sqrt((calculateDxToMakeVisible * calculateDxToMakeVisible) + (calculateDyToMakeVisible * calculateDyToMakeVisible)));
            if (calculateTimeForDeceleration > 0) {
                aVar.a(-calculateDxToMakeVisible, -calculateDyToMakeVisible, calculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    public View getViewFromScrapList(int i, RecyclerView.m mVar) {
        Object[] objArr = {Integer.valueOf(i), mVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f51479d2bef043f389cdc07a669db4b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f51479d2bef043f389cdc07a669db4b8");
        }
        if (mVar == null) {
            return null;
        }
        List<RecyclerView.s> list = mVar.d;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2) != null) {
                View view = list.get(i2).itemView;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof RecyclerView.g) {
                    RecyclerView.g gVar = (RecyclerView.g) layoutParams;
                    if (!gVar.c.isRemoved() && i == gVar.c.getLayoutPosition()) {
                        return view;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }
}
