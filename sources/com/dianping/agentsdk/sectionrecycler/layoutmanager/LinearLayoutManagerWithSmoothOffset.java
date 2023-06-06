package com.dianping.agentsdk.sectionrecycler.layoutmanager;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.dianping.shield.bridge.feature.LinearLayoutManagerExtraSpaceInterface;
import com.dianping.shield.feature.IFocusChildScrollWhenBack;
import com.dianping.shield.layoutmanager.TopLinearLayoutManager;
import com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface;
import com.dianping.shield.sectionrecycler.WrapContentLinearLayoutManager;
import com.dianping.shield.sectionrecycler.layoutmanager.SmoothScrollEventHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class LinearLayoutManagerWithSmoothOffset extends WrapContentLinearLayoutManager implements LinearLayoutManagerExtraSpaceInterface, IFocusChildScrollWhenBack, ShieldLayoutManagerInterface {
    public static final int EXTRA_LAYOUT_SPACE = 800;
    public static ChangeQuickRedirect changeQuickRedirect;
    protected Context context;
    private int extraLayoutSpace;
    private boolean isScrollEnabled;
    protected RecyclerView mRecyclerView;
    protected SmoothScrollEventHelper scrollEventHelper;
    protected boolean setAllowFocusedChildRecOnScreen;

    public LinearLayoutManagerWithSmoothOffset(Context context) {
        super(context, 1, false);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "299b0bf2446145e8afe56c691eb17eea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "299b0bf2446145e8afe56c691eb17eea");
            return;
        }
        this.extraLayoutSpace = 800;
        this.isScrollEnabled = true;
        this.scrollEventHelper = new SmoothScrollEventHelper();
        this.setAllowFocusedChildRecOnScreen = true;
        init(context);
    }

    public LinearLayoutManagerWithSmoothOffset(Context context, int i, boolean z) {
        super(context, i, z);
        Object[] objArr = {context, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8fccade63e5ea88266b79640bcb4dad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8fccade63e5ea88266b79640bcb4dad");
            return;
        }
        this.extraLayoutSpace = 800;
        this.isScrollEnabled = true;
        this.scrollEventHelper = new SmoothScrollEventHelper();
        this.setAllowFocusedChildRecOnScreen = true;
        init(context);
    }

    public void init(Context context) {
        this.context = context;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public int getExtraLayoutSpace(RecyclerView.State state) {
        return this.extraLayoutSpace;
    }

    @Override // com.dianping.shield.bridge.feature.LinearLayoutManagerExtraSpaceInterface
    public void setExtraLayoutSpace(int i) {
        this.extraLayoutSpace = i;
    }

    @Override // com.dianping.shield.layoutmanager.TopLinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02fa771d39ee1147ee91b7254aad4b6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02fa771d39ee1147ee91b7254aad4b6d");
            return;
        }
        super.onAttachedToWindow(recyclerView);
        this.mRecyclerView = recyclerView;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.m mVar) {
        Object[] objArr = {recyclerView, mVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "55e90d95e281974f47b6b578a167836e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "55e90d95e281974f47b6b578a167836e");
            return;
        }
        this.mRecyclerView = null;
        super.onDetachedFromWindow(recyclerView, mVar);
    }

    public Context getContext() {
        return this.context;
    }

    public void setScrollEnabled(boolean z) {
        this.isScrollEnabled = z;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80c388f8bb48d6ba6e2c51122753750f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80c388f8bb48d6ba6e2c51122753750f")).booleanValue() : this.isScrollEnabled && super.canScrollVertically();
    }

    public void smoothScrollToPosition(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d397eaa8237ae257421583795c6bdbc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d397eaa8237ae257421583795c6bdbc4");
        } else {
            smoothScrollToPosition(i, i2, 0.0f, null);
        }
    }

    public void smoothScrollToPosition(int i, int i2, float f, ArrayList<com.dianping.agentsdk.sectionrecycler.layoutmanager.a> arrayList) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9fb8299c4ace7ff1fa87f0456d94537a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9fb8299c4ace7ff1fa87f0456d94537a");
            return;
        }
        if (this.mRecyclerView != null) {
            this.mRecyclerView.addOnScrollListener(this.scrollEventHelper);
        }
        this.scrollEventHelper.setRecyclerView(this.mRecyclerView);
        this.scrollEventHelper.setListeners(arrayList);
        a aVar = new a(getContext(), this, i2, this.scrollEventHelper, this.mRecyclerView);
        aVar.setScrollSpeed(f);
        aVar.setTargetPosition(i);
        startSmoothScroll(aVar);
    }

    @Override // com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
    public void scrollToPositionWithOffset(int i, int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99f9f5bbdd109b42ec3d339a61a2581b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99f9f5bbdd109b42ec3d339a61a2581b");
        } else {
            scrollToPositionWithOffset(i, i2, z, -1.0f);
        }
    }

    @Override // com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
    public void scrollToPositionWithOffset(int i, int i2, boolean z, float f) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69864229a9fe604ff6b198a74a43ff93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69864229a9fe604ff6b198a74a43ff93");
        } else {
            scrollToPositionWithOffset(i, i2, z, f, null);
        }
    }

    @Override // com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
    public void scrollToPositionWithOffset(int i, int i2, boolean z, ArrayList<com.dianping.agentsdk.sectionrecycler.layoutmanager.a> arrayList) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4651a3c8eeb6851f98540f053739c877", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4651a3c8eeb6851f98540f053739c877");
        } else {
            scrollToPositionWithOffset(i, i2, z, -1.0f, arrayList);
        }
    }

    @Override // com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
    public void scrollToPositionWithOffset(int i, int i2, boolean z, float f, ArrayList<com.dianping.agentsdk.sectionrecycler.layoutmanager.a> arrayList) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Float.valueOf(f), arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c725be1f18d1f14bde047798d0943f56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c725be1f18d1f14bde047798d0943f56");
        } else if (z) {
            smoothScrollToPosition(i, i2, f, arrayList);
        } else {
            scrollToPositionWithOffset(i, i2);
        }
    }

    @Override // com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface
    public int findFirstVisibleItemPosition(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4fd6be45cd347ec0bdd477708d93e4f9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4fd6be45cd347ec0bdd477708d93e4f9")).intValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15470ceb226c04980a7166fa951cd471", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15470ceb226c04980a7166fa951cd471")).intValue();
        }
        if (z) {
            return findLastCompletelyVisibleItemPosition();
        }
        return findLastVisibleItemPosition();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        Object[] objArr = {recyclerView, view, rect, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a67f913d7434ba997ff1dd9fc7f6a1b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a67f913d7434ba997ff1dd9fc7f6a1b")).booleanValue();
        }
        if (this.setAllowFocusedChildRecOnScreen) {
            return super.requestChildRectangleOnScreen(recyclerView, view, rect, z, z2);
        }
        return false;
    }

    @Override // com.dianping.shield.feature.IFocusChildScrollWhenBack
    public void setFocusChildScrollOnScreenWhenBack(boolean z) {
        this.setAllowFocusedChildRecOnScreen = z;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a extends TopLinearLayoutManager.TopLinearSmoothScroller {
        public static ChangeQuickRedirect a;
        protected int b;
        protected SmoothScrollEventHelper c;
        private RecyclerView d;
        private final int e;

        @Override // android.support.v7.widget.ad
        public final int getHorizontalSnapPreference() {
            return -1;
        }

        @Override // android.support.v7.widget.ad
        public final int getVerticalSnapPreference() {
            return -1;
        }

        public a(Context context, @NonNull LinearLayoutManager linearLayoutManager, int i, SmoothScrollEventHelper smoothScrollEventHelper, RecyclerView recyclerView) {
            super(context, linearLayoutManager);
            Object[] objArr = {context, linearLayoutManager, Integer.valueOf(i), smoothScrollEventHelper, recyclerView};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a2040241779861a9b25c77f3635c66d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a2040241779861a9b25c77f3635c66d");
                return;
            }
            this.e = 500;
            this.b = i;
            this.c = smoothScrollEventHelper;
            this.d = recyclerView;
        }

        @Override // com.dianping.shield.layoutmanager.TopLinearLayoutManager.TopLinearSmoothScroller, android.support.v7.widget.ad, android.support.v7.widget.RecyclerView.p
        public final void onTargetFound(View view, RecyclerView.State state, RecyclerView.p.a aVar) {
            int i;
            Object[] objArr = {view, state, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "489603bc14b5503cffa697a82b79a20d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "489603bc14b5503cffa697a82b79a20d");
                return;
            }
            if (this.llm.getOrientation() == 1) {
                i = this.b;
            } else {
                r8 = this.llm.getOrientation() == 0 ? this.b : 0;
                i = 0;
            }
            int calculateDxToMakeVisible = calculateDxToMakeVisible(view, getHorizontalSnapPreference()) + r8;
            int calculateDyToMakeVisible = calculateDyToMakeVisible(view, getVerticalSnapPreference()) + i + getTopOffset();
            int calculateTimeForDeceleration = calculateTimeForDeceleration((int) Math.sqrt((calculateDxToMakeVisible * calculateDxToMakeVisible) + (calculateDyToMakeVisible * calculateDyToMakeVisible)));
            if (calculateTimeForDeceleration > 0) {
                aVar.a(-calculateDxToMakeVisible, -calculateDyToMakeVisible, calculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }

        @Override // android.support.v7.widget.ad
        public final int calculateDyToMakeVisible(View view, int i) {
            Object[] objArr = {view, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c0b8ae993c4b2f5cc9cd8c6e5cef26c", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c0b8ae993c4b2f5cc9cd8c6e5cef26c")).intValue();
            }
            RecyclerView.LayoutManager layoutManager = getLayoutManager();
            if (layoutManager == null || !layoutManager.canScrollVertically()) {
                return 0;
            }
            RecyclerView.g gVar = (RecyclerView.g) view.getLayoutParams();
            return calculateDtToFit(view.getTop() - gVar.topMargin, view.getBottom() + gVar.bottomMargin, layoutManager.getPaddingTop(), layoutManager.getHeight() - layoutManager.getPaddingBottom(), i);
        }

        @Override // android.support.v7.widget.ad, android.support.v7.widget.RecyclerView.p
        public final void onStart() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63cdb66a87d71e65d5d59caf6181a580", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63cdb66a87d71e65d5d59caf6181a580");
                return;
            }
            super.onStart();
            if (this.c != null) {
                this.c.onStart();
            }
        }

        @Override // android.support.v7.widget.ad, android.support.v7.widget.RecyclerView.p
        public final void onSeekTargetStep(int i, int i2, RecyclerView.State state, RecyclerView.p.a aVar) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), state, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f78094310106d30bdf63f2e69d4cba7a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f78094310106d30bdf63f2e69d4cba7a");
                return;
            }
            super.onSeekTargetStep(i, i2, state, aVar);
            if (this.c != null) {
                this.c.onScrolling();
            }
        }

        @Override // android.support.v7.widget.ad
        public final void updateActionForInterimTarget(RecyclerView.p.a aVar) {
            int i;
            int i2;
            int i3 = 0;
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4f3b478be9386730d4edb0571f54299", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4f3b478be9386730d4edb0571f54299");
                return;
            }
            super.updateActionForInterimTarget(aVar);
            PointF computeScrollVectorForPosition = computeScrollVectorForPosition(getTargetPosition());
            if (computeScrollVectorForPosition != null) {
                if (computeScrollVectorForPosition.x == 0.0f && computeScrollVectorForPosition.y == 0.0f) {
                    return;
                }
                normalize(computeScrollVectorForPosition);
                int abs = Math.abs(aVar.b);
                int abs2 = Math.abs(aVar.a);
                if (this.llm.getOrientation() == 1) {
                    if (computeScrollVectorForPosition.y >= 0.0f || (i2 = this.d.computeVerticalScrollOffset()) > 500) {
                        i2 = abs;
                    }
                    i3 = i2 <= 0 ? abs : i2;
                    aVar.f = true;
                    aVar.b = ((int) computeScrollVectorForPosition.y) * i3;
                } else if (this.llm.getOrientation() == 0) {
                    if (computeScrollVectorForPosition.x >= 0.0f || (i = this.d.computeHorizontalScrollOffset()) > 500) {
                        i = abs2;
                    }
                    i3 = i <= 0 ? abs2 : i;
                    aVar.f = true;
                    aVar.a = ((int) computeScrollVectorForPosition.x) * i3;
                }
                int max = Math.max(1, calculateTimeForScrolling(i3));
                aVar.f = true;
                aVar.c = max;
                LinearInterpolator linearInterpolator = this.mLinearInterpolator;
                aVar.f = true;
                aVar.e = linearInterpolator;
            }
        }

        @Override // android.support.v7.widget.ad, android.support.v7.widget.RecyclerView.p
        public final void onStop() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ddcde82c8813434e61cc510f5e46062", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ddcde82c8813434e61cc510f5e46062");
                return;
            }
            super.onStop();
            if (this.c != null) {
                this.c.onStop();
            }
        }

        @Override // android.support.v7.widget.ad
        public final PointF computeScrollVectorForPosition(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f044d3489429379c09b28c8f96043d9", RobustBitConfig.DEFAULT_VALUE) ? (PointF) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f044d3489429379c09b28c8f96043d9") : this.llm.computeScrollVectorForPosition(i);
        }
    }
}
