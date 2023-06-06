package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.RestrictTo;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.a;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.tencent.mapsdk.internal.jw;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.p.b, a.d {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final a mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final b mLayoutChunkResult;
    private c mLayoutState;
    int mOrientation;
    ai mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onAnchorReady(RecyclerView.m mVar, RecyclerView.State state, a aVar, int i) {
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new a();
        this.mLayoutChunkResult = new b();
        this.mInitialPrefetchItemCount = 2;
        setOrientation(i);
        setReverseLayout(z);
        setAutoMeasureEnabled(true);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new a();
        this.mLayoutChunkResult = new b();
        this.mInitialPrefetchItemCount = 2;
        RecyclerView.LayoutManager.Properties properties = getProperties(context, attributeSet, i, i2);
        setOrientation(properties.a);
        setReverseLayout(properties.c);
        setStackFromEnd(properties.d);
        setAutoMeasureEnabled(true);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public RecyclerView.g generateDefaultLayoutParams() {
        return new RecyclerView.g(-2, -2);
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.mRecycleChildrenOnDetach = z;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.m mVar) {
        super.onDetachedFromWindow(recyclerView, mVar);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(mVar);
            mVar.a();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        if (this.mPendingSavedState != null) {
            return new SavedState(this.mPendingSavedState);
        }
        SavedState savedState = new SavedState();
        if (getChildCount() > 0) {
            ensureLayoutState();
            boolean z = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
            savedState.c = z;
            if (z) {
                View childClosestToEnd = getChildClosestToEnd();
                savedState.b = this.mOrientationHelper.c() - this.mOrientationHelper.b(childClosestToEnd);
                savedState.a = getPosition(childClosestToEnd);
            } else {
                View childClosestToStart = getChildClosestToStart();
                savedState.a = getPosition(childClosestToStart);
                savedState.b = this.mOrientationHelper.a(childClosestToStart) - this.mOrientationHelper.b();
            }
        } else {
            savedState.a = -1;
        }
        return savedState;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.mPendingSavedState = (SavedState) parcelable;
            requestLayout();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    public void setStackFromEnd(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z) {
            return;
        }
        this.mStackFromEnd = z;
        requestLayout();
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        assertNotInLayoutOrScroll(null);
        if (i == this.mOrientation) {
            return;
        }
        this.mOrientation = i;
        this.mOrientationHelper = null;
        requestLayout();
    }

    private void resolveShouldLayoutReverse() {
        boolean z = true;
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            z = this.mReverseLayout;
        } else if (this.mReverseLayout) {
            z = false;
        }
        this.mShouldReverseLayout = z;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (z == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z;
        requestLayout();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i) {
                return childAt;
            }
        }
        return super.findViewByPosition(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getExtraLayoutSpace(RecyclerView.State state) {
        if (state.b()) {
            return this.mOrientationHelper.e();
        }
        return 0;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        ad adVar = new ad(recyclerView.getContext());
        adVar.setTargetPosition(i);
        startSmoothScroll(adVar);
    }

    @Override // android.support.v7.widget.RecyclerView.p.b
    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        int i2 = (i < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        if (this.mOrientation == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.m mVar, RecyclerView.State state) {
        int i;
        int i2;
        int i3;
        View findViewByPosition;
        int a2;
        int i4 = -1;
        if ((this.mPendingSavedState != null || this.mPendingScrollPosition != -1) && state.c() == 0) {
            removeAndRecycleAllViews(mVar);
            return;
        }
        if (this.mPendingSavedState != null && this.mPendingSavedState.a()) {
            this.mPendingScrollPosition = this.mPendingSavedState.a;
        }
        ensureLayoutState();
        this.mLayoutState.a = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        if (!this.mAnchorInfo.d || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            this.mAnchorInfo.a();
            this.mAnchorInfo.c = this.mShouldReverseLayout ^ this.mStackFromEnd;
            updateAnchorInfoForLayout(mVar, state, this.mAnchorInfo);
            this.mAnchorInfo.d = true;
        } else if (focusedChild != null && (this.mOrientationHelper.a(focusedChild) >= this.mOrientationHelper.c() || this.mOrientationHelper.b(focusedChild) <= this.mOrientationHelper.b())) {
            this.mAnchorInfo.a(focusedChild);
        }
        int extraLayoutSpace = getExtraLayoutSpace(state);
        if (this.mLayoutState.j >= 0) {
            i = extraLayoutSpace;
            extraLayoutSpace = 0;
        } else {
            i = 0;
        }
        int b2 = extraLayoutSpace + this.mOrientationHelper.b();
        int f = i + this.mOrientationHelper.f();
        if (state.g && this.mPendingScrollPosition != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (findViewByPosition = findViewByPosition(this.mPendingScrollPosition)) != null) {
            if (this.mShouldReverseLayout) {
                a2 = (this.mOrientationHelper.c() - this.mOrientationHelper.b(findViewByPosition)) - this.mPendingScrollPositionOffset;
            } else {
                a2 = this.mPendingScrollPositionOffset - (this.mOrientationHelper.a(findViewByPosition) - this.mOrientationHelper.b());
            }
            if (a2 > 0) {
                b2 += a2;
            } else {
                f -= a2;
            }
        }
        if (!this.mAnchorInfo.c ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i4 = 1;
        }
        onAnchorReady(mVar, state, this.mAnchorInfo, i4);
        detachAndScrapAttachedViews(mVar);
        this.mLayoutState.l = resolveIsInfinite();
        this.mLayoutState.i = state.g;
        if (this.mAnchorInfo.c) {
            updateLayoutStateToFillStart(this.mAnchorInfo);
            this.mLayoutState.h = b2;
            fill(mVar, this.mLayoutState, state, false);
            i3 = this.mLayoutState.b;
            int i5 = this.mLayoutState.d;
            if (this.mLayoutState.c > 0) {
                f += this.mLayoutState.c;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            this.mLayoutState.h = f;
            this.mLayoutState.d += this.mLayoutState.e;
            fill(mVar, this.mLayoutState, state, false);
            i2 = this.mLayoutState.b;
            if (this.mLayoutState.c > 0) {
                int i6 = this.mLayoutState.c;
                updateLayoutStateToFillStart(i5, i3);
                this.mLayoutState.h = i6;
                fill(mVar, this.mLayoutState, state, false);
                i3 = this.mLayoutState.b;
            }
        } else {
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            this.mLayoutState.h = f;
            fill(mVar, this.mLayoutState, state, false);
            i2 = this.mLayoutState.b;
            int i7 = this.mLayoutState.d;
            if (this.mLayoutState.c > 0) {
                b2 += this.mLayoutState.c;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            this.mLayoutState.h = b2;
            this.mLayoutState.d += this.mLayoutState.e;
            fill(mVar, this.mLayoutState, state, false);
            i3 = this.mLayoutState.b;
            if (this.mLayoutState.c > 0) {
                int i8 = this.mLayoutState.c;
                updateLayoutStateToFillEnd(i7, i2);
                this.mLayoutState.h = i8;
                fill(mVar, this.mLayoutState, state, false);
                i2 = this.mLayoutState.b;
            }
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int fixLayoutEndGap = fixLayoutEndGap(i2, mVar, state, true);
                int i9 = i3 + fixLayoutEndGap;
                int i10 = i2 + fixLayoutEndGap;
                int fixLayoutStartGap = fixLayoutStartGap(i9, mVar, state, false);
                i3 = i9 + fixLayoutStartGap;
                i2 = i10 + fixLayoutStartGap;
            } else {
                int fixLayoutStartGap2 = fixLayoutStartGap(i3, mVar, state, true);
                int i11 = i3 + fixLayoutStartGap2;
                int i12 = i2 + fixLayoutStartGap2;
                int fixLayoutEndGap2 = fixLayoutEndGap(i12, mVar, state, false);
                i3 = i11 + fixLayoutEndGap2;
                i2 = i12 + fixLayoutEndGap2;
            }
        }
        layoutForPredictiveAnimations(mVar, state, i3, i2);
        if (!state.g) {
            ai aiVar = this.mOrientationHelper;
            aiVar.b = aiVar.e();
        } else {
            this.mAnchorInfo.a();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.a();
    }

    private void updateAnchorInfoForLayout(RecyclerView.m mVar, RecyclerView.State state, a aVar) {
        if (updateAnchorFromPendingData(state, aVar) || updateAnchorFromChildren(mVar, state, aVar)) {
            return;
        }
        aVar.b();
        aVar.a = this.mStackFromEnd ? state.c() - 1 : 0;
    }

    private boolean updateAnchorFromChildren(RecyclerView.m mVar, RecyclerView.State state, a aVar) {
        View findReferenceChildClosestToStart;
        int b2;
        boolean z = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null) {
            RecyclerView.g gVar = (RecyclerView.g) focusedChild.getLayoutParams();
            if (!gVar.c.isRemoved() && gVar.c.getLayoutPosition() >= 0 && gVar.c.getLayoutPosition() < state.c()) {
                aVar.a(focusedChild);
                return true;
            }
        }
        if (this.mLastStackFromEnd != this.mStackFromEnd) {
            return false;
        }
        if (aVar.c) {
            findReferenceChildClosestToStart = findReferenceChildClosestToEnd(mVar, state);
        } else {
            findReferenceChildClosestToStart = findReferenceChildClosestToStart(mVar, state);
        }
        if (findReferenceChildClosestToStart != null) {
            aVar.b(findReferenceChildClosestToStart);
            if (!state.g && supportsPredictiveItemAnimations()) {
                if ((this.mOrientationHelper.a(findReferenceChildClosestToStart) >= this.mOrientationHelper.c() || this.mOrientationHelper.b(findReferenceChildClosestToStart) < this.mOrientationHelper.b()) ? true : true) {
                    if (aVar.c) {
                        b2 = this.mOrientationHelper.c();
                    } else {
                        b2 = this.mOrientationHelper.b();
                    }
                    aVar.b = b2;
                }
            }
            return true;
        }
        return false;
    }

    private int fixLayoutEndGap(int i, RecyclerView.m mVar, RecyclerView.State state, boolean z) {
        int c2;
        int c3 = this.mOrientationHelper.c() - i;
        if (c3 > 0) {
            int i2 = -scrollBy(-c3, mVar, state);
            int i3 = i + i2;
            if (!z || (c2 = this.mOrientationHelper.c() - i3) <= 0) {
                return i2;
            }
            this.mOrientationHelper.a(c2);
            return c2 + i2;
        }
        return 0;
    }

    private int fixLayoutStartGap(int i, RecyclerView.m mVar, RecyclerView.State state, boolean z) {
        int b2;
        int b3 = i - this.mOrientationHelper.b();
        if (b3 > 0) {
            int i2 = -scrollBy(b3, mVar, state);
            int i3 = i + i2;
            if (!z || (b2 = i3 - this.mOrientationHelper.b()) <= 0) {
                return i2;
            }
            this.mOrientationHelper.a(-b2);
            return i2 - b2;
        }
        return 0;
    }

    private void updateLayoutStateToFillEnd(a aVar) {
        updateLayoutStateToFillEnd(aVar.a, aVar.b);
    }

    private void updateLayoutStateToFillEnd(int i, int i2) {
        this.mLayoutState.c = this.mOrientationHelper.c() - i2;
        this.mLayoutState.e = this.mShouldReverseLayout ? -1 : 1;
        this.mLayoutState.d = i;
        this.mLayoutState.f = 1;
        this.mLayoutState.b = i2;
        this.mLayoutState.g = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStart(a aVar) {
        updateLayoutStateToFillStart(aVar.a, aVar.b);
    }

    private void updateLayoutStateToFillStart(int i, int i2) {
        this.mLayoutState.c = i2 - this.mOrientationHelper.b();
        this.mLayoutState.d = i;
        this.mLayoutState.e = this.mShouldReverseLayout ? 1 : -1;
        this.mLayoutState.f = -1;
        this.mLayoutState.b = i2;
        this.mLayoutState.g = Integer.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
        if (this.mOrientationHelper == null) {
            this.mOrientationHelper = ai.a(this, this.mOrientation);
        }
    }

    c createLayoutState() {
        return new c();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        if (this.mPendingSavedState != null) {
            this.mPendingSavedState.a = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        if (this.mPendingSavedState != null) {
            this.mPendingSavedState.a = -1;
        }
        requestLayout();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.m mVar, RecyclerView.State state) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i, mVar, state);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.m mVar, RecyclerView.State state) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i, mVar, state);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    private int computeScrollOffset(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return ao.a(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return ao.a(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollRange(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return ao.b(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public void setSmoothScrollbarEnabled(boolean z) {
        this.mSmoothScrollbarEnabled = z;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    private void updateLayoutState(int i, int i2, boolean z, RecyclerView.State state) {
        int b2;
        this.mLayoutState.l = resolveIsInfinite();
        this.mLayoutState.h = getExtraLayoutSpace(state);
        this.mLayoutState.f = i;
        if (i == 1) {
            this.mLayoutState.h += this.mOrientationHelper.f();
            View childClosestToEnd = getChildClosestToEnd();
            this.mLayoutState.e = this.mShouldReverseLayout ? -1 : 1;
            this.mLayoutState.d = getPosition(childClosestToEnd) + this.mLayoutState.e;
            this.mLayoutState.b = this.mOrientationHelper.b(childClosestToEnd);
            b2 = this.mOrientationHelper.b(childClosestToEnd) - this.mOrientationHelper.c();
        } else {
            View childClosestToStart = getChildClosestToStart();
            this.mLayoutState.h += this.mOrientationHelper.b();
            this.mLayoutState.e = this.mShouldReverseLayout ? 1 : -1;
            this.mLayoutState.d = getPosition(childClosestToStart) + this.mLayoutState.e;
            this.mLayoutState.b = this.mOrientationHelper.a(childClosestToStart);
            b2 = (-this.mOrientationHelper.a(childClosestToStart)) + this.mOrientationHelper.b();
        }
        this.mLayoutState.c = i2;
        if (z) {
            this.mLayoutState.c -= b2;
        }
        this.mLayoutState.g = b2;
    }

    boolean resolveIsInfinite() {
        return this.mOrientationHelper.g() == 0 && this.mOrientationHelper.d() == 0;
    }

    void collectPrefetchPositionsForLayoutState(RecyclerView.State state, c cVar, RecyclerView.LayoutManager.a aVar) {
        int i = cVar.d;
        if (i < 0 || i >= state.c()) {
            return;
        }
        aVar.a(i, Math.max(0, cVar.g));
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void collectInitialPrefetchPositions(int i, RecyclerView.LayoutManager.a aVar) {
        boolean z;
        int i2;
        if (this.mPendingSavedState != null && this.mPendingSavedState.a()) {
            z = this.mPendingSavedState.c;
            i2 = this.mPendingSavedState.a;
        } else {
            resolveShouldLayoutReverse();
            z = this.mShouldReverseLayout;
            if (this.mPendingScrollPosition == -1) {
                i2 = z ? i - 1 : 0;
            } else {
                i2 = this.mPendingScrollPosition;
            }
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.mInitialPrefetchItemCount && i2 >= 0 && i2 < i; i4++) {
            aVar.a(i2, 0);
            i2 += i3;
        }
    }

    public void setInitialPrefetchItemCount(int i) {
        this.mInitialPrefetchItemCount = i;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.State state, RecyclerView.LayoutManager.a aVar) {
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        ensureLayoutState();
        updateLayoutState(i > 0 ? 1 : -1, Math.abs(i), true, state);
        collectPrefetchPositionsForLayoutState(state, this.mLayoutState, aVar);
    }

    int scrollBy(int i, RecyclerView.m mVar, RecyclerView.State state) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        this.mLayoutState.a = true;
        ensureLayoutState();
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        updateLayoutState(i2, abs, true, state);
        int fill = this.mLayoutState.g + fill(mVar, this.mLayoutState, state, false);
        if (fill < 0) {
            return 0;
        }
        if (abs > fill) {
            i = i2 * fill;
        }
        this.mOrientationHelper.a(-i);
        this.mLayoutState.j = i;
        return i;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    private void recycleChildren(RecyclerView.m mVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                removeAndRecycleViewAt(i, mVar);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            removeAndRecycleViewAt(i3, mVar);
        }
    }

    private void recycleViewsFromStart(RecyclerView.m mVar, int i) {
        if (i < 0) {
            return;
        }
        int childCount = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (this.mOrientationHelper.b(childAt) > i || this.mOrientationHelper.c(childAt) > i) {
                    recycleChildren(mVar, 0, i2);
                    return;
                }
            }
            return;
        }
        int i3 = childCount - 1;
        for (int i4 = i3; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            if (this.mOrientationHelper.b(childAt2) > i || this.mOrientationHelper.c(childAt2) > i) {
                recycleChildren(mVar, i3, i4);
                return;
            }
        }
    }

    private void recycleViewsFromEnd(RecyclerView.m mVar, int i) {
        int childCount = getChildCount();
        if (i < 0) {
            return;
        }
        int d = this.mOrientationHelper.d() - i;
        if (this.mShouldReverseLayout) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (this.mOrientationHelper.a(childAt) < d || this.mOrientationHelper.d(childAt) < d) {
                    recycleChildren(mVar, 0, i2);
                    return;
                }
            }
            return;
        }
        int i3 = childCount - 1;
        for (int i4 = i3; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            if (this.mOrientationHelper.a(childAt2) < d || this.mOrientationHelper.d(childAt2) < d) {
                recycleChildren(mVar, i3, i4);
                return;
            }
        }
    }

    private void recycleByLayoutState(RecyclerView.m mVar, c cVar) {
        if (!cVar.a || cVar.l) {
            return;
        }
        if (cVar.f == -1) {
            recycleViewsFromEnd(mVar, cVar.g);
        } else {
            recycleViewsFromStart(mVar, cVar.g);
        }
    }

    int fill(RecyclerView.m mVar, c cVar, RecyclerView.State state, boolean z) {
        int i = cVar.c;
        if (cVar.g != Integer.MIN_VALUE) {
            if (cVar.c < 0) {
                cVar.g += cVar.c;
            }
            recycleByLayoutState(mVar, cVar);
        }
        int i2 = cVar.c + cVar.h;
        b bVar = this.mLayoutChunkResult;
        while (true) {
            if ((!cVar.l && i2 <= 0) || !cVar.a(state)) {
                break;
            }
            bVar.a = 0;
            bVar.b = false;
            bVar.c = false;
            bVar.d = false;
            layoutChunk(mVar, state, cVar, bVar);
            if (!bVar.b) {
                cVar.b += bVar.a * cVar.f;
                if (!bVar.c || this.mLayoutState.k != null || !state.g) {
                    cVar.c -= bVar.a;
                    i2 -= bVar.a;
                }
                if (cVar.g != Integer.MIN_VALUE) {
                    cVar.g += bVar.a;
                    if (cVar.c < 0) {
                        cVar.g += cVar.c;
                    }
                    recycleByLayoutState(mVar, cVar);
                }
                if (z && bVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.c;
    }

    void layoutChunk(RecyclerView.m mVar, RecyclerView.State state, c cVar, b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int f;
        View a2 = cVar.a(mVar);
        if (a2 == null) {
            bVar.b = true;
            return;
        }
        RecyclerView.g gVar = (RecyclerView.g) a2.getLayoutParams();
        if (cVar.k == null) {
            if (this.mShouldReverseLayout == (cVar.f == -1)) {
                addView(a2);
            } else {
                addView(a2, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (cVar.f == -1)) {
                addDisappearingView(a2);
            } else {
                addDisappearingView(a2, 0);
            }
        }
        measureChildWithMargins(a2, 0, 0);
        bVar.a = this.mOrientationHelper.e(a2);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                f = getWidth() - getPaddingRight();
                i4 = f - this.mOrientationHelper.f(a2);
            } else {
                i4 = getPaddingLeft();
                f = this.mOrientationHelper.f(a2) + i4;
            }
            if (cVar.f == -1) {
                int i5 = cVar.b;
                i2 = cVar.b - bVar.a;
                i = f;
                i3 = i5;
            } else {
                int i6 = cVar.b;
                i3 = cVar.b + bVar.a;
                i = f;
                i2 = i6;
            }
        } else {
            int paddingTop = getPaddingTop();
            int f2 = this.mOrientationHelper.f(a2) + paddingTop;
            if (cVar.f == -1) {
                i2 = paddingTop;
                i = cVar.b;
                i3 = f2;
                i4 = cVar.b - bVar.a;
            } else {
                int i7 = cVar.b;
                i = cVar.b + bVar.a;
                i2 = paddingTop;
                i3 = f2;
                i4 = i7;
            }
        }
        layoutDecoratedWithMargins(a2, i4, i2, i, i3);
        if (gVar.c.isRemoved() || gVar.c.isUpdated()) {
            bVar.c = true;
        }
        bVar.d = a2.hasFocusable();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int convertFocusDirectionToLayoutDirection(int i) {
        if (i == 17) {
            return this.mOrientation == 0 ? -1 : Integer.MIN_VALUE;
        } else if (i == 33) {
            return this.mOrientation == 1 ? -1 : Integer.MIN_VALUE;
        } else if (i == 66) {
            return this.mOrientation == 0 ? 1 : Integer.MIN_VALUE;
        } else if (i == 130) {
            return this.mOrientation == 1 ? 1 : Integer.MIN_VALUE;
        } else {
            switch (i) {
                case 1:
                    return (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
                case 2:
                    return (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1;
                default:
                    return Integer.MIN_VALUE;
            }
        }
    }

    private View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    private View findFirstVisibleChildClosestToStart(boolean z, boolean z2) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(getChildCount() - 1, -1, z, z2);
        }
        return findOneVisibleChild(0, getChildCount(), z, z2);
    }

    private View findFirstVisibleChildClosestToEnd(boolean z, boolean z2) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(0, getChildCount(), z, z2);
        }
        return findOneVisibleChild(getChildCount() - 1, -1, z, z2);
    }

    private View findReferenceChildClosestToEnd(RecyclerView.m mVar, RecyclerView.State state) {
        return this.mShouldReverseLayout ? findFirstReferenceChild(mVar, state) : findLastReferenceChild(mVar, state);
    }

    private View findReferenceChildClosestToStart(RecyclerView.m mVar, RecyclerView.State state) {
        return this.mShouldReverseLayout ? findLastReferenceChild(mVar, state) : findFirstReferenceChild(mVar, state);
    }

    private View findFirstReferenceChild(RecyclerView.m mVar, RecyclerView.State state) {
        return findReferenceChild(mVar, state, 0, getChildCount(), state.c());
    }

    private View findLastReferenceChild(RecyclerView.m mVar, RecyclerView.State state) {
        return findReferenceChild(mVar, state, getChildCount() - 1, -1, state.c());
    }

    View findReferenceChild(RecyclerView.m mVar, RecyclerView.State state, int i, int i2, int i3) {
        ensureLayoutState();
        int b2 = this.mOrientationHelper.b();
        int c2 = this.mOrientationHelper.c();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            int position = getPosition(childAt);
            if (position >= 0 && position < i3) {
                if (((RecyclerView.g) childAt.getLayoutParams()).c.isRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (this.mOrientationHelper.a(childAt) < c2 && this.mOrientationHelper.b(childAt) >= b2) {
                    return childAt;
                } else {
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd(RecyclerView.m mVar, RecyclerView.State state) {
        return this.mShouldReverseLayout ? findFirstPartiallyOrCompletelyInvisibleChild(mVar, state) : findLastPartiallyOrCompletelyInvisibleChild(mVar, state);
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart(RecyclerView.m mVar, RecyclerView.State state) {
        return this.mShouldReverseLayout ? findLastPartiallyOrCompletelyInvisibleChild(mVar, state) : findFirstPartiallyOrCompletelyInvisibleChild(mVar, state);
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild(RecyclerView.m mVar, RecyclerView.State state) {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private View findLastPartiallyOrCompletelyInvisibleChild(RecyclerView.m mVar, RecyclerView.State state) {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    public int findFirstVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    View findOneVisibleChild(int i, int i2, boolean z, boolean z2) {
        ensureLayoutState();
        int i3 = jw.e;
        int i4 = z ? 24579 : jw.e;
        if (!z2) {
            i3 = 0;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.a(i, i2, i4, i3);
        }
        return this.mVerticalBoundCheck.a(i, i2, i4, i3);
    }

    View findOnePartiallyOrCompletelyInvisibleChild(int i, int i2) {
        int i3;
        int i4;
        ensureLayoutState();
        if ((i2 > i ? (char) 1 : i2 < i ? (char) 65535 : (char) 0) == 0) {
            return getChildAt(i);
        }
        if (this.mOrientationHelper.a(getChildAt(i)) < this.mOrientationHelper.b()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.a(i, i2, i3, i4);
        }
        return this.mVerticalBoundCheck.a(i, i2, i3, i4);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public View onFocusSearchFailed(View view, int i, RecyclerView.m mVar, RecyclerView.State state) {
        int convertFocusDirectionToLayoutDirection;
        View findPartiallyOrCompletelyInvisibleChildClosestToEnd;
        View childClosestToEnd;
        resolveShouldLayoutReverse();
        if (getChildCount() == 0 || (convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        ensureLayoutState();
        updateLayoutState(convertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.e() * MAX_SCROLL_FACTOR), false, state);
        this.mLayoutState.g = Integer.MIN_VALUE;
        this.mLayoutState.a = false;
        fill(mVar, this.mLayoutState, state, true);
        if (convertFocusDirectionToLayoutDirection == -1) {
            findPartiallyOrCompletelyInvisibleChildClosestToEnd = findPartiallyOrCompletelyInvisibleChildClosestToStart(mVar, state);
        } else {
            findPartiallyOrCompletelyInvisibleChildClosestToEnd = findPartiallyOrCompletelyInvisibleChildClosestToEnd(mVar, state);
        }
        if (convertFocusDirectionToLayoutDirection == -1) {
            childClosestToEnd = getChildClosestToStart();
        } else {
            childClosestToEnd = getChildClosestToEnd();
        }
        if (childClosestToEnd.hasFocusable()) {
            if (findPartiallyOrCompletelyInvisibleChildClosestToEnd == null) {
                return null;
            }
            return childClosestToEnd;
        }
        return findPartiallyOrCompletelyInvisibleChildClosestToEnd;
    }

    private void logChildren() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            StringBuilder sb = new StringBuilder("item ");
            sb.append(getPosition(childAt));
            sb.append(", coord:");
            sb.append(this.mOrientationHelper.a(childAt));
        }
    }

    void validateChildOrder() {
        new StringBuilder("validating child count ").append(getChildCount());
        if (getChildCount() <= 0) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int a2 = this.mOrientationHelper.a(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i = 1; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                int position2 = getPosition(childAt);
                int a3 = this.mOrientationHelper.a(childAt);
                if (position2 < position) {
                    logChildren();
                    StringBuilder sb = new StringBuilder("detected invalid position. loc invalid? ");
                    sb.append(a3 < a2);
                    throw new RuntimeException(sb.toString());
                } else if (a3 > a2) {
                    logChildren();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i2 = 1; i2 < getChildCount(); i2++) {
            View childAt2 = getChildAt(i2);
            int position3 = getPosition(childAt2);
            int a4 = this.mOrientationHelper.a(childAt2);
            if (position3 < position) {
                logChildren();
                StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                sb2.append(a4 < a2);
                throw new RuntimeException(sb2.toString());
            } else if (a4 < a2) {
                logChildren();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    @Override // android.support.v7.widget.helper.a.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void prepareForDrop(View view, View view2, int i, int i2) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        char c2 = position < position2 ? (char) 1 : (char) 65535;
        if (this.mShouldReverseLayout) {
            if (c2 == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.c() - (this.mOrientationHelper.a(view2) + this.mOrientationHelper.e(view)));
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.c() - this.mOrientationHelper.b(view2));
            }
        } else if (c2 == 65535) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.a(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.b(view2) - this.mOrientationHelper.e(view));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class c {
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        int j;
        boolean l;
        boolean a = true;
        int h = 0;
        boolean i = false;
        List<RecyclerView.s> k = null;

        c() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final boolean a(RecyclerView.State state) {
            return this.d >= 0 && this.d < state.c();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final View a(RecyclerView.m mVar) {
            if (this.k != null) {
                return a();
            }
            View a = mVar.a(this.d, false);
            this.d += this.e;
            return a;
        }

        private View a() {
            int size = this.k.size();
            for (int i = 0; i < size; i++) {
                View view = this.k.get(i).itemView;
                RecyclerView.g gVar = (RecyclerView.g) view.getLayoutParams();
                if (!gVar.c.isRemoved() && this.d == gVar.c.getLayoutPosition()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }

        public final void a(View view) {
            View b = b(view);
            if (b == null) {
                this.d = -1;
            } else {
                this.d = ((RecyclerView.g) b.getLayoutParams()).c.getLayoutPosition();
            }
        }

        private View b(View view) {
            int layoutPosition;
            int size = this.k.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.k.get(i2).itemView;
                RecyclerView.g gVar = (RecyclerView.g) view3.getLayoutParams();
                if (view3 != view && !gVar.c.isRemoved() && (layoutPosition = (gVar.c.getLayoutPosition() - this.d) * this.e) >= 0 && layoutPosition < i) {
                    if (layoutPosition == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i = layoutPosition;
                }
            }
            return view2;
        }
    }

    /* compiled from: ProGuard */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: android.support.v7.widget.LinearLayoutManager.SavedState.1
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };
        int a;
        int b;
        boolean c;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        SavedState(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.a = savedState.a;
            this.b = savedState.b;
            this.c = savedState.c;
        }

        final boolean a() {
            return this.a >= 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a {
        int a;
        int b;
        boolean c;
        boolean d;

        a() {
            a();
        }

        final void a() {
            this.a = -1;
            this.b = Integer.MIN_VALUE;
            this.c = false;
            this.d = false;
        }

        final void b() {
            int b;
            if (this.c) {
                b = LinearLayoutManager.this.mOrientationHelper.c();
            } else {
                b = LinearLayoutManager.this.mOrientationHelper.b();
            }
            this.b = b;
        }

        public final String toString() {
            return "AnchorInfo{mPosition=" + this.a + ", mCoordinate=" + this.b + ", mLayoutFromEnd=" + this.c + ", mValid=" + this.d + '}';
        }

        public final void a(View view) {
            int a = LinearLayoutManager.this.mOrientationHelper.a();
            if (a >= 0) {
                b(view);
                return;
            }
            this.a = LinearLayoutManager.this.getPosition(view);
            if (this.c) {
                int c = (LinearLayoutManager.this.mOrientationHelper.c() - a) - LinearLayoutManager.this.mOrientationHelper.b(view);
                this.b = LinearLayoutManager.this.mOrientationHelper.c() - c;
                if (c > 0) {
                    int e = this.b - LinearLayoutManager.this.mOrientationHelper.e(view);
                    int b = LinearLayoutManager.this.mOrientationHelper.b();
                    int min = e - (b + Math.min(LinearLayoutManager.this.mOrientationHelper.a(view) - b, 0));
                    if (min < 0) {
                        this.b += Math.min(c, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int a2 = LinearLayoutManager.this.mOrientationHelper.a(view);
            int b2 = a2 - LinearLayoutManager.this.mOrientationHelper.b();
            this.b = a2;
            if (b2 > 0) {
                int c2 = (LinearLayoutManager.this.mOrientationHelper.c() - Math.min(0, (LinearLayoutManager.this.mOrientationHelper.c() - a) - LinearLayoutManager.this.mOrientationHelper.b(view))) - (a2 + LinearLayoutManager.this.mOrientationHelper.e(view));
                if (c2 < 0) {
                    this.b -= Math.min(b2, -c2);
                }
            }
        }

        public final void b(View view) {
            if (this.c) {
                this.b = LinearLayoutManager.this.mOrientationHelper.b(view) + LinearLayoutManager.this.mOrientationHelper.a();
            } else {
                this.b = LinearLayoutManager.this.mOrientationHelper.a(view);
            }
            this.a = LinearLayoutManager.this.getPosition(view);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;

        protected b() {
        }
    }

    private void layoutForPredictiveAnimations(RecyclerView.m mVar, RecyclerView.State state, int i, int i2) {
        if (!state.k || getChildCount() == 0 || state.g || !supportsPredictiveItemAnimations()) {
            return;
        }
        List<RecyclerView.s> list = mVar.d;
        int size = list.size();
        int position = getPosition(getChildAt(0));
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView.s sVar = list.get(i5);
            if (!sVar.isRemoved()) {
                if (((sVar.getLayoutPosition() < position) != this.mShouldReverseLayout ? (char) 65535 : (char) 1) == 65535) {
                    i3 += this.mOrientationHelper.e(sVar.itemView);
                } else {
                    i4 += this.mOrientationHelper.e(sVar.itemView);
                }
            }
        }
        this.mLayoutState.k = list;
        if (i3 > 0) {
            updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i);
            this.mLayoutState.h = i3;
            this.mLayoutState.c = 0;
            this.mLayoutState.a((View) null);
            fill(mVar, this.mLayoutState, state, false);
        }
        if (i4 > 0) {
            updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i2);
            this.mLayoutState.h = i4;
            this.mLayoutState.c = 0;
            this.mLayoutState.a((View) null);
            fill(mVar, this.mLayoutState, state, false);
        }
        this.mLayoutState.k = null;
    }

    private boolean updateAnchorFromPendingData(RecyclerView.State state, a aVar) {
        int a2;
        if (state.g || this.mPendingScrollPosition == -1) {
            return false;
        }
        if (this.mPendingScrollPosition < 0 || this.mPendingScrollPosition >= state.c()) {
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
            return false;
        }
        aVar.a = this.mPendingScrollPosition;
        if (this.mPendingSavedState != null && this.mPendingSavedState.a()) {
            aVar.c = this.mPendingSavedState.c;
            if (aVar.c) {
                aVar.b = this.mOrientationHelper.c() - this.mPendingSavedState.b;
            } else {
                aVar.b = this.mOrientationHelper.b() + this.mPendingSavedState.b;
            }
            return true;
        } else if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
            View findViewByPosition = findViewByPosition(this.mPendingScrollPosition);
            if (findViewByPosition != null) {
                if (this.mOrientationHelper.e(findViewByPosition) > this.mOrientationHelper.e()) {
                    aVar.b();
                    return true;
                } else if (this.mOrientationHelper.a(findViewByPosition) - this.mOrientationHelper.b() < 0) {
                    aVar.b = this.mOrientationHelper.b();
                    aVar.c = false;
                    return true;
                } else if (this.mOrientationHelper.c() - this.mOrientationHelper.b(findViewByPosition) < 0) {
                    aVar.b = this.mOrientationHelper.c();
                    aVar.c = true;
                    return true;
                } else {
                    if (aVar.c) {
                        a2 = this.mOrientationHelper.b(findViewByPosition) + this.mOrientationHelper.a();
                    } else {
                        a2 = this.mOrientationHelper.a(findViewByPosition);
                    }
                    aVar.b = a2;
                }
            } else {
                if (getChildCount() > 0) {
                    aVar.c = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                }
                aVar.b();
            }
            return true;
        } else {
            aVar.c = this.mShouldReverseLayout;
            if (this.mShouldReverseLayout) {
                aVar.b = this.mOrientationHelper.c() - this.mPendingScrollPositionOffset;
            } else {
                aVar.b = this.mOrientationHelper.b() + this.mPendingScrollPositionOffset;
            }
            return true;
        }
    }
}
