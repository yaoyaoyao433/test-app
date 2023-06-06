package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.p.b {
    static final boolean DEBUG = false;
    @Deprecated
    public static final int GAP_HANDLING_LAZY = 1;
    public static final int GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS = 2;
    public static final int GAP_HANDLING_NONE = 0;
    public static final int HORIZONTAL = 0;
    static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "StaggeredGridLManager";
    public static final int VERTICAL = 1;
    private int mFullSizeSpec;
    private boolean mLastLayoutFromEnd;
    private boolean mLastLayoutRTL;
    @NonNull
    private final ac mLayoutState;
    private int mOrientation;
    private SavedState mPendingSavedState;
    private int[] mPrefetchDistances;
    @NonNull
    ai mPrimaryOrientation;
    private BitSet mRemainingSpans;
    @NonNull
    ai mSecondaryOrientation;
    private int mSizePerSpan;
    c[] mSpans;
    private int mSpanCount = -1;
    boolean mReverseLayout = false;
    boolean mShouldReverseLayout = false;
    int mPendingScrollPosition = -1;
    int mPendingScrollPositionOffset = Integer.MIN_VALUE;
    LazySpanLookup mLazySpanLookup = new LazySpanLookup();
    private int mGapStrategy = 2;
    private final Rect mTmpRect = new Rect();
    private final a mAnchorInfo = new a();
    private boolean mLaidOutInvalidFullSpan = false;
    private boolean mSmoothScrollbarEnabled = true;
    private final Runnable mCheckForGapsRunnable = new Runnable() { // from class: android.support.v7.widget.StaggeredGridLayoutManager.1
        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.checkForGaps();
        }
    };

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.LayoutManager.Properties properties = getProperties(context, attributeSet, i, i2);
        setOrientation(properties.a);
        setSpanCount(properties.b);
        setReverseLayout(properties.c);
        setAutoMeasureEnabled(this.mGapStrategy != 0);
        this.mLayoutState = new ac();
        createOrientationHelpers();
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.mOrientation = i2;
        setSpanCount(i);
        setAutoMeasureEnabled(this.mGapStrategy != 0);
        this.mLayoutState = new ac();
        createOrientationHelpers();
    }

    private void createOrientationHelpers() {
        this.mPrimaryOrientation = ai.a(this, this.mOrientation);
        this.mSecondaryOrientation = ai.a(this, 1 - this.mOrientation);
    }

    boolean checkForGaps() {
        int firstChildPosition;
        int lastChildPosition;
        if (getChildCount() == 0 || this.mGapStrategy == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.mShouldReverseLayout) {
            firstChildPosition = getLastChildPosition();
            lastChildPosition = getFirstChildPosition();
        } else {
            firstChildPosition = getFirstChildPosition();
            lastChildPosition = getLastChildPosition();
        }
        if (firstChildPosition == 0 && hasGapsToFix() != null) {
            this.mLazySpanLookup.a();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        } else if (this.mLaidOutInvalidFullSpan) {
            int i = this.mShouldReverseLayout ? -1 : 1;
            int i2 = lastChildPosition + 1;
            LazySpanLookup.FullSpanItem a2 = this.mLazySpanLookup.a(firstChildPosition, i2, i, true);
            if (a2 == null) {
                this.mLaidOutInvalidFullSpan = false;
                this.mLazySpanLookup.a(i2);
                return false;
            }
            LazySpanLookup.FullSpanItem a3 = this.mLazySpanLookup.a(firstChildPosition, a2.a, i * (-1), true);
            if (a3 == null) {
                this.mLazySpanLookup.a(a2.a);
            } else {
                this.mLazySpanLookup.a(a3.a + 1);
            }
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        } else {
            return false;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i) {
        if (i == 0) {
            checkForGaps();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.m mVar) {
        removeCallbacks(this.mCheckForGapsRunnable);
        for (int i = 0; i < this.mSpanCount; i++) {
            this.mSpans[i].c();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
        if (r10 == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
        if (r10 == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0087, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
        r10 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    android.view.View hasGapsToFix() {
        /*
            r12 = this;
            int r0 = r12.getChildCount()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.mSpanCount
            r2.<init>(r3)
            int r3 = r12.mSpanCount
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.mOrientation
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.isLayoutRTL()
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = -1
        L21:
            boolean r6 = r12.mShouldReverseLayout
            if (r6 == 0) goto L27
            r6 = -1
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L2b:
            if (r0 >= r6) goto L2e
            r5 = 1
        L2e:
            if (r0 == r6) goto Laa
            android.view.View r7 = r12.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            android.support.v7.widget.StaggeredGridLayoutManager$b r8 = (android.support.v7.widget.StaggeredGridLayoutManager.b) r8
            android.support.v7.widget.StaggeredGridLayoutManager$c r9 = r8.a
            int r9 = r9.e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            android.support.v7.widget.StaggeredGridLayoutManager$c r9 = r8.a
            boolean r9 = r12.checkSpanForGap(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            android.support.v7.widget.StaggeredGridLayoutManager$c r9 = r8.a
            int r9 = r9.e
            r2.clear(r9)
        L54:
            boolean r9 = r8.b
            if (r9 != 0) goto La8
            int r9 = r0 + r5
            if (r9 == r6) goto La8
            android.view.View r9 = r12.getChildAt(r9)
            boolean r10 = r12.mShouldReverseLayout
            if (r10 == 0) goto L76
            android.support.v7.widget.ai r10 = r12.mPrimaryOrientation
            int r10 = r10.b(r7)
            android.support.v7.widget.ai r11 = r12.mPrimaryOrientation
            int r11 = r11.b(r9)
            if (r10 >= r11) goto L73
            return r7
        L73:
            if (r10 != r11) goto L89
            goto L87
        L76:
            android.support.v7.widget.ai r10 = r12.mPrimaryOrientation
            int r10 = r10.a(r7)
            android.support.v7.widget.ai r11 = r12.mPrimaryOrientation
            int r11 = r11.a(r9)
            if (r10 <= r11) goto L85
            return r7
        L85:
            if (r10 != r11) goto L89
        L87:
            r10 = 1
            goto L8a
        L89:
            r10 = 0
        L8a:
            if (r10 == 0) goto La8
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            android.support.v7.widget.StaggeredGridLayoutManager$b r9 = (android.support.v7.widget.StaggeredGridLayoutManager.b) r9
            android.support.v7.widget.StaggeredGridLayoutManager$c r8 = r8.a
            int r8 = r8.e
            android.support.v7.widget.StaggeredGridLayoutManager$c r9 = r9.a
            int r9 = r9.e
            int r8 = r8 - r9
            if (r8 >= 0) goto L9f
            r8 = 1
            goto La0
        L9f:
            r8 = 0
        La0:
            if (r3 >= 0) goto La4
            r9 = 1
            goto La5
        La4:
            r9 = 0
        La5:
            if (r8 == r9) goto La8
            return r7
        La8:
            int r0 = r0 + r5
            goto L2e
        Laa:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.hasGapsToFix():android.view.View");
    }

    private boolean checkSpanForGap(c cVar) {
        return this.mShouldReverseLayout ? cVar.b() < this.mPrimaryOrientation.c() && !((b) cVar.a.get(cVar.a.size() - 1).getLayoutParams()).b : cVar.a() > this.mPrimaryOrientation.b() && !((b) cVar.a.get(0).getLayoutParams()).b;
        return false;
    }

    public void setSpanCount(int i) {
        assertNotInLayoutOrScroll(null);
        if (i != this.mSpanCount) {
            invalidateSpanAssignments();
            this.mSpanCount = i;
            this.mRemainingSpans = new BitSet(this.mSpanCount);
            this.mSpans = new c[this.mSpanCount];
            for (int i2 = 0; i2 < this.mSpanCount; i2++) {
                this.mSpans[i2] = new c(i2);
            }
            requestLayout();
        }
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i == this.mOrientation) {
            return;
        }
        this.mOrientation = i;
        ai aiVar = this.mPrimaryOrientation;
        this.mPrimaryOrientation = this.mSecondaryOrientation;
        this.mSecondaryOrientation = aiVar;
        requestLayout();
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (this.mPendingSavedState != null && this.mPendingSavedState.h != z) {
            this.mPendingSavedState.h = z;
        }
        this.mReverseLayout = z;
        requestLayout();
    }

    public int getGapStrategy() {
        return this.mGapStrategy;
    }

    public void setGapStrategy(int i) {
        assertNotInLayoutOrScroll(null);
        if (i == this.mGapStrategy) {
            return;
        }
        if (i != 0 && i != 2) {
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
        this.mGapStrategy = i;
        setAutoMeasureEnabled(this.mGapStrategy != 0);
        requestLayout();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public int getSpanCount() {
        return this.mSpanCount;
    }

    public void invalidateSpanAssignments() {
        this.mLazySpanLookup.a();
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

    boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int chooseSize;
        int chooseSize2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            chooseSize2 = chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            chooseSize = chooseSize(i, (this.mSizePerSpan * this.mSpanCount) + paddingLeft, getMinimumWidth());
        } else {
            chooseSize = chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            chooseSize2 = chooseSize(i2, (this.mSizePerSpan * this.mSpanCount) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.m mVar, RecyclerView.State state) {
        onLayoutChildren(mVar, state, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01ae, code lost:
        if (checkForGaps() != false) goto L111;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void onLayoutChildren(android.support.v7.widget.RecyclerView.m r12, android.support.v7.widget.RecyclerView.State r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.onLayoutChildren(android.support.v7.widget.RecyclerView$m, android.support.v7.widget.RecyclerView$State, boolean):void");
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo.a();
    }

    private void repositionToWrapContentIfNecessary() {
        if (this.mSecondaryOrientation.g() == 1073741824) {
            return;
        }
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            float e = this.mSecondaryOrientation.e(childAt);
            if (e >= f) {
                if (((b) childAt.getLayoutParams()).b) {
                    e = (e * 1.0f) / this.mSpanCount;
                }
                f = Math.max(f, e);
            }
        }
        int i2 = this.mSizePerSpan;
        int round = Math.round(f * this.mSpanCount);
        if (this.mSecondaryOrientation.g() == Integer.MIN_VALUE) {
            round = Math.min(round, this.mSecondaryOrientation.e());
        }
        updateMeasureSpecs(round);
        if (this.mSizePerSpan == i2) {
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            b bVar = (b) childAt2.getLayoutParams();
            if (!bVar.b) {
                if (isLayoutRTL() && this.mOrientation == 1) {
                    childAt2.offsetLeftAndRight(((-((this.mSpanCount - 1) - bVar.a.e)) * this.mSizePerSpan) - ((-((this.mSpanCount - 1) - bVar.a.e)) * i2));
                } else {
                    int i4 = bVar.a.e * this.mSizePerSpan;
                    int i5 = bVar.a.e * i2;
                    if (this.mOrientation == 1) {
                        childAt2.offsetLeftAndRight(i4 - i5);
                    } else {
                        childAt2.offsetTopAndBottom(i4 - i5);
                    }
                }
            }
        }
    }

    private void applyPendingSavedState(a aVar) {
        if (this.mPendingSavedState.c > 0) {
            if (this.mPendingSavedState.c == this.mSpanCount) {
                for (int i = 0; i < this.mSpanCount; i++) {
                    this.mSpans[i].c();
                    int i2 = this.mPendingSavedState.d[i];
                    if (i2 != Integer.MIN_VALUE) {
                        if (this.mPendingSavedState.i) {
                            i2 += this.mPrimaryOrientation.c();
                        } else {
                            i2 += this.mPrimaryOrientation.b();
                        }
                    }
                    this.mSpans[i].c(i2);
                }
            } else {
                SavedState savedState = this.mPendingSavedState;
                savedState.d = null;
                savedState.c = 0;
                savedState.e = 0;
                savedState.f = null;
                savedState.g = null;
                this.mPendingSavedState.a = this.mPendingSavedState.b;
            }
        }
        this.mLastLayoutRTL = this.mPendingSavedState.j;
        setReverseLayout(this.mPendingSavedState.h);
        resolveShouldLayoutReverse();
        if (this.mPendingSavedState.a != -1) {
            this.mPendingScrollPosition = this.mPendingSavedState.a;
            aVar.c = this.mPendingSavedState.i;
        } else {
            aVar.c = this.mShouldReverseLayout;
        }
        if (this.mPendingSavedState.e > 1) {
            this.mLazySpanLookup.a = this.mPendingSavedState.f;
            this.mLazySpanLookup.b = this.mPendingSavedState.g;
        }
    }

    void updateAnchorInfoForLayout(RecyclerView.State state, a aVar) {
        if (updateAnchorFromPendingData(state, aVar) || updateAnchorFromChildren(state, aVar)) {
            return;
        }
        aVar.b();
        aVar.a = 0;
    }

    private boolean updateAnchorFromChildren(RecyclerView.State state, a aVar) {
        int findFirstReferenceChildPosition;
        if (this.mLastLayoutFromEnd) {
            findFirstReferenceChildPosition = findLastReferenceChildPosition(state.c());
        } else {
            findFirstReferenceChildPosition = findFirstReferenceChildPosition(state.c());
        }
        aVar.a = findFirstReferenceChildPosition;
        aVar.b = Integer.MIN_VALUE;
        return true;
    }

    void updateMeasureSpecs(int i) {
        this.mSizePerSpan = i / this.mSpanCount;
        this.mFullSizeSpec = View.MeasureSpec.makeMeasureSpec(i, this.mSecondaryOrientation.g());
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null;
    }

    public int[] findFirstVisibleItemPositions(int[] iArr) {
        int a2;
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.mSpanCount; i++) {
            c cVar = this.mSpans[i];
            if (StaggeredGridLayoutManager.this.mReverseLayout) {
                a2 = cVar.a(cVar.a.size() - 1, -1, false);
            } else {
                a2 = cVar.a(0, cVar.a.size(), false);
            }
            iArr[i] = a2;
        }
        return iArr;
    }

    public int[] findFirstCompletelyVisibleItemPositions(int[] iArr) {
        int a2;
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.mSpanCount; i++) {
            c cVar = this.mSpans[i];
            if (StaggeredGridLayoutManager.this.mReverseLayout) {
                a2 = cVar.a(cVar.a.size() - 1, -1, true);
            } else {
                a2 = cVar.a(0, cVar.a.size(), true);
            }
            iArr[i] = a2;
        }
        return iArr;
    }

    public int[] findLastVisibleItemPositions(int[] iArr) {
        int a2;
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.mSpanCount; i++) {
            c cVar = this.mSpans[i];
            if (StaggeredGridLayoutManager.this.mReverseLayout) {
                a2 = cVar.a(0, cVar.a.size(), false);
            } else {
                a2 = cVar.a(cVar.a.size() - 1, -1, false);
            }
            iArr[i] = a2;
        }
        return iArr;
    }

    public int[] findLastCompletelyVisibleItemPositions(int[] iArr) {
        int a2;
        if (iArr == null) {
            iArr = new int[this.mSpanCount];
        } else if (iArr.length < this.mSpanCount) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.mSpanCount + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.mSpanCount; i++) {
            c cVar = this.mSpans[i];
            if (StaggeredGridLayoutManager.this.mReverseLayout) {
                a2 = cVar.a(0, cVar.a.size(), true);
            } else {
                a2 = cVar.a(cVar.a.size() - 1, -1, true);
            }
            iArr[i] = a2;
        }
        return iArr;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    private int computeScrollOffset(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return ao.a(state, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(!this.mSmoothScrollbarEnabled), findFirstVisibleItemClosestToEnd(!this.mSmoothScrollbarEnabled), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    private int computeScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return ao.a(state, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(!this.mSmoothScrollbarEnabled), findFirstVisibleItemClosestToEnd(!this.mSmoothScrollbarEnabled), this, this.mSmoothScrollbarEnabled);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    private int computeScrollRange(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return ao.b(state, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(!this.mSmoothScrollbarEnabled), findFirstVisibleItemClosestToEnd(!this.mSmoothScrollbarEnabled), this, this.mSmoothScrollbarEnabled);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    private void measureChildWithDecorationsAndMargin(View view, b bVar, boolean z) {
        if (bVar.b) {
            if (this.mOrientation == 1) {
                measureChildWithDecorationsAndMargin(view, this.mFullSizeSpec, getChildMeasureSpec(getHeight(), getHeightMode(), 0, bVar.height, true), z);
            } else {
                measureChildWithDecorationsAndMargin(view, getChildMeasureSpec(getWidth(), getWidthMode(), 0, bVar.width, true), this.mFullSizeSpec, z);
            }
        } else if (this.mOrientation == 1) {
            measureChildWithDecorationsAndMargin(view, getChildMeasureSpec(this.mSizePerSpan, getWidthMode(), 0, bVar.width, false), getChildMeasureSpec(getHeight(), getHeightMode(), 0, bVar.height, true), z);
        } else {
            measureChildWithDecorationsAndMargin(view, getChildMeasureSpec(getWidth(), getWidthMode(), 0, bVar.width, true), getChildMeasureSpec(this.mSizePerSpan, getHeightMode(), 0, bVar.height, false), z);
        }
    }

    private void measureChildWithDecorationsAndMargin(View view, int i, int i2, boolean z) {
        boolean shouldMeasureChild;
        calculateItemDecorationsForChild(view, this.mTmpRect);
        b bVar = (b) view.getLayoutParams();
        int updateSpecWithExtra = updateSpecWithExtra(i, bVar.leftMargin + this.mTmpRect.left, bVar.rightMargin + this.mTmpRect.right);
        int updateSpecWithExtra2 = updateSpecWithExtra(i2, bVar.topMargin + this.mTmpRect.top, bVar.bottomMargin + this.mTmpRect.bottom);
        if (z) {
            shouldMeasureChild = shouldReMeasureChild(view, updateSpecWithExtra, updateSpecWithExtra2, bVar);
        } else {
            shouldMeasureChild = shouldMeasureChild(view, updateSpecWithExtra, updateSpecWithExtra2, bVar);
        }
        if (shouldMeasureChild) {
            view.measure(updateSpecWithExtra, updateSpecWithExtra2);
        }
    }

    private int updateSpecWithExtra(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.mPendingSavedState = (SavedState) parcelable;
            requestLayout();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        int a2;
        if (this.mPendingSavedState != null) {
            return new SavedState(this.mPendingSavedState);
        }
        SavedState savedState = new SavedState();
        savedState.h = this.mReverseLayout;
        savedState.i = this.mLastLayoutFromEnd;
        savedState.j = this.mLastLayoutRTL;
        if (this.mLazySpanLookup != null && this.mLazySpanLookup.a != null) {
            savedState.f = this.mLazySpanLookup.a;
            savedState.e = savedState.f.length;
            savedState.g = this.mLazySpanLookup.b;
        } else {
            savedState.e = 0;
        }
        if (getChildCount() > 0) {
            savedState.a = this.mLastLayoutFromEnd ? getLastChildPosition() : getFirstChildPosition();
            savedState.b = findFirstVisibleItemPositionInt();
            savedState.c = this.mSpanCount;
            savedState.d = new int[this.mSpanCount];
            for (int i = 0; i < this.mSpanCount; i++) {
                if (this.mLastLayoutFromEnd) {
                    a2 = this.mSpans[i].b(Integer.MIN_VALUE);
                    if (a2 != Integer.MIN_VALUE) {
                        a2 -= this.mPrimaryOrientation.c();
                    }
                } else {
                    a2 = this.mSpans[i].a(Integer.MIN_VALUE);
                    if (a2 != Integer.MIN_VALUE) {
                        a2 -= this.mPrimaryOrientation.b();
                    }
                }
                savedState.d[i] = a2;
            }
        } else {
            savedState.a = -1;
            savedState.b = -1;
            savedState.c = 0;
        }
        return savedState;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.m mVar, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, accessibilityNodeInfoCompat);
            return;
        }
        b bVar = (b) layoutParams;
        if (this.mOrientation == 0) {
            i2 = bVar.b();
            i3 = bVar.b ? this.mSpanCount : 1;
            i = -1;
            i4 = -1;
        } else {
            int b2 = bVar.b();
            if (bVar.b) {
                i = b2;
                i4 = this.mSpanCount;
                i2 = -1;
                i3 = -1;
            } else {
                i = b2;
                i2 = -1;
                i3 = -1;
                i4 = 1;
            }
        }
        accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(i2, i3, i, i4, bVar.b, false));
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View findFirstVisibleItemClosestToStart = findFirstVisibleItemClosestToStart(false);
            View findFirstVisibleItemClosestToEnd = findFirstVisibleItemClosestToEnd(false);
            if (findFirstVisibleItemClosestToStart == null || findFirstVisibleItemClosestToEnd == null) {
                return;
            }
            int position = getPosition(findFirstVisibleItemClosestToStart);
            int position2 = getPosition(findFirstVisibleItemClosestToEnd);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
                return;
            }
            accessibilityEvent.setFromIndex(position2);
            accessibilityEvent.setToIndex(position);
        }
    }

    int findFirstVisibleItemPositionInt() {
        View findFirstVisibleItemClosestToEnd = this.mShouldReverseLayout ? findFirstVisibleItemClosestToEnd(true) : findFirstVisibleItemClosestToStart(true);
        if (findFirstVisibleItemClosestToEnd == null) {
            return -1;
        }
        return getPosition(findFirstVisibleItemClosestToEnd);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public int getRowCountForAccessibility(RecyclerView.m mVar, RecyclerView.State state) {
        if (this.mOrientation == 0) {
            return this.mSpanCount;
        }
        return super.getRowCountForAccessibility(mVar, state);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public int getColumnCountForAccessibility(RecyclerView.m mVar, RecyclerView.State state) {
        if (this.mOrientation == 1) {
            return this.mSpanCount;
        }
        return super.getColumnCountForAccessibility(mVar, state);
    }

    View findFirstVisibleItemClosestToStart(boolean z) {
        int b2 = this.mPrimaryOrientation.b();
        int c2 = this.mPrimaryOrientation.c();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int a2 = this.mPrimaryOrientation.a(childAt);
            if (this.mPrimaryOrientation.b(childAt) > b2 && a2 < c2) {
                if (a2 >= b2 || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    View findFirstVisibleItemClosestToEnd(boolean z) {
        int b2 = this.mPrimaryOrientation.b();
        int c2 = this.mPrimaryOrientation.c();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int a2 = this.mPrimaryOrientation.a(childAt);
            int b3 = this.mPrimaryOrientation.b(childAt);
            if (b3 > b2 && a2 < c2) {
                if (b3 <= c2 || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    private void fixEndGap(RecyclerView.m mVar, RecyclerView.State state, boolean z) {
        int c2;
        int maxEnd = getMaxEnd(Integer.MIN_VALUE);
        if (maxEnd != Integer.MIN_VALUE && (c2 = this.mPrimaryOrientation.c() - maxEnd) > 0) {
            int i = c2 - (-scrollBy(-c2, mVar, state));
            if (!z || i <= 0) {
                return;
            }
            this.mPrimaryOrientation.a(i);
        }
    }

    private void fixStartGap(RecyclerView.m mVar, RecyclerView.State state, boolean z) {
        int b2;
        int minStart = getMinStart(Integer.MAX_VALUE);
        if (minStart != Integer.MAX_VALUE && (b2 = minStart - this.mPrimaryOrientation.b()) > 0) {
            int scrollBy = b2 - scrollBy(b2, mVar, state);
            if (!z || scrollBy <= 0) {
                return;
            }
            this.mPrimaryOrientation.a(-scrollBy);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void updateLayoutState(int r5, android.support.v7.widget.RecyclerView.State r6) {
        /*
            r4 = this;
            android.support.v7.widget.ac r0 = r4.mLayoutState
            r1 = 0
            r0.b = r1
            android.support.v7.widget.ac r0 = r4.mLayoutState
            r0.c = r5
            boolean r0 = r4.isSmoothScrolling()
            r2 = 1
            if (r0 == 0) goto L2e
            int r6 = r6.a
            r0 = -1
            if (r6 == r0) goto L2e
            boolean r0 = r4.mShouldReverseLayout
            if (r6 >= r5) goto L1b
            r5 = 1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            if (r0 != r5) goto L27
            android.support.v7.widget.ai r5 = r4.mPrimaryOrientation
            int r5 = r5.e()
            r6 = r5
            r5 = 0
            goto L30
        L27:
            android.support.v7.widget.ai r5 = r4.mPrimaryOrientation
            int r5 = r5.e()
            goto L2f
        L2e:
            r5 = 0
        L2f:
            r6 = 0
        L30:
            boolean r0 = r4.getClipToPadding()
            if (r0 == 0) goto L4d
            android.support.v7.widget.ac r0 = r4.mLayoutState
            android.support.v7.widget.ai r3 = r4.mPrimaryOrientation
            int r3 = r3.b()
            int r3 = r3 - r5
            r0.f = r3
            android.support.v7.widget.ac r5 = r4.mLayoutState
            android.support.v7.widget.ai r0 = r4.mPrimaryOrientation
            int r0 = r0.c()
            int r0 = r0 + r6
            r5.g = r0
            goto L5d
        L4d:
            android.support.v7.widget.ac r0 = r4.mLayoutState
            android.support.v7.widget.ai r3 = r4.mPrimaryOrientation
            int r3 = r3.d()
            int r3 = r3 + r6
            r0.g = r3
            android.support.v7.widget.ac r6 = r4.mLayoutState
            int r5 = -r5
            r6.f = r5
        L5d:
            android.support.v7.widget.ac r5 = r4.mLayoutState
            r5.h = r1
            android.support.v7.widget.ac r5 = r4.mLayoutState
            r5.a = r2
            android.support.v7.widget.ac r5 = r4.mLayoutState
            android.support.v7.widget.ai r6 = r4.mPrimaryOrientation
            int r6 = r6.g()
            if (r6 != 0) goto L78
            android.support.v7.widget.ai r6 = r4.mPrimaryOrientation
            int r6 = r6.d()
            if (r6 != 0) goto L78
            r1 = 1
        L78:
            r5.i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.updateLayoutState(int, android.support.v7.widget.RecyclerView$State):void");
    }

    private void setLayoutStateDirection(int i) {
        this.mLayoutState.e = i;
        this.mLayoutState.d = this.mShouldReverseLayout != (i == -1) ? -1 : 1;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.mSpanCount; i2++) {
            this.mSpans[i2].d(i);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.mSpanCount; i2++) {
            this.mSpans[i2].d(i);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        handleUpdate(i, i2, 2);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        handleUpdate(i, i2, 1);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        this.mLazySpanLookup.a();
        requestLayout();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        handleUpdate(i, i2, 8);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        handleUpdate(i, i2, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void handleUpdate(int r6, int r7, int r8) {
        /*
            r5 = this;
            boolean r0 = r5.mShouldReverseLayout
            if (r0 == 0) goto L9
            int r0 = r5.getLastChildPosition()
            goto Ld
        L9:
            int r0 = r5.getFirstChildPosition()
        Ld:
            r1 = 8
            if (r8 != r1) goto L1b
            if (r6 >= r7) goto L16
            int r2 = r7 + 1
            goto L1d
        L16:
            int r2 = r6 + 1
            r3 = r2
            r2 = r7
            goto L1f
        L1b:
            int r2 = r6 + r7
        L1d:
            r3 = r2
            r2 = r6
        L1f:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r5.mLazySpanLookup
            r4.b(r2)
            if (r8 == r1) goto L36
            switch(r8) {
                case 1: goto L30;
                case 2: goto L2a;
                default: goto L29;
            }
        L29:
            goto L41
        L2a:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r8 = r5.mLazySpanLookup
            r8.a(r6, r7)
            goto L41
        L30:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r8 = r5.mLazySpanLookup
            r8.b(r6, r7)
            goto L41
        L36:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r8 = r5.mLazySpanLookup
            r1 = 1
            r8.a(r6, r1)
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r6 = r5.mLazySpanLookup
            r6.b(r7, r1)
        L41:
            if (r3 > r0) goto L44
            return
        L44:
            boolean r6 = r5.mShouldReverseLayout
            if (r6 == 0) goto L4d
            int r6 = r5.getFirstChildPosition()
            goto L51
        L4d:
            int r6 = r5.getLastChildPosition()
        L51:
            if (r2 > r6) goto L56
            r5.requestLayout()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.handleUpdate(int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r9v5 */
    private int fill(RecyclerView.m mVar, ac acVar, RecyclerView.State state) {
        int i;
        int i2;
        int b2;
        int maxEnd;
        c cVar;
        int e;
        int i3;
        int i4;
        int e2;
        boolean areAllStartsEqual;
        ?? r9 = 0;
        this.mRemainingSpans.set(0, this.mSpanCount, true);
        if (this.mLayoutState.i) {
            i2 = acVar.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            if (acVar.e == 1) {
                i = acVar.g + acVar.b;
            } else {
                i = acVar.f - acVar.b;
            }
            i2 = i;
        }
        updateAllRemainingSpans(acVar.e, i2);
        if (this.mShouldReverseLayout) {
            b2 = this.mPrimaryOrientation.c();
        } else {
            b2 = this.mPrimaryOrientation.b();
        }
        int i5 = b2;
        boolean z = false;
        while (acVar.a(state) && (this.mLayoutState.i || !this.mRemainingSpans.isEmpty())) {
            View b3 = mVar.b(acVar.c);
            acVar.c += acVar.d;
            b bVar = (b) b3.getLayoutParams();
            int layoutPosition = bVar.c.getLayoutPosition();
            LazySpanLookup lazySpanLookup = this.mLazySpanLookup;
            int i6 = (lazySpanLookup.a == null || layoutPosition >= lazySpanLookup.a.length) ? -1 : lazySpanLookup.a[layoutPosition];
            boolean z2 = i6 == -1;
            if (z2) {
                cVar = bVar.b ? this.mSpans[r9] : getNextSpan(acVar);
                LazySpanLookup lazySpanLookup2 = this.mLazySpanLookup;
                lazySpanLookup2.c(layoutPosition);
                lazySpanLookup2.a[layoutPosition] = cVar.e;
            } else {
                cVar = this.mSpans[i6];
            }
            c cVar2 = cVar;
            bVar.a = cVar2;
            if (acVar.e == 1) {
                addView(b3);
            } else {
                addView(b3, r9);
            }
            measureChildWithDecorationsAndMargin(b3, bVar, r9);
            if (acVar.e == 1) {
                int maxEnd2 = bVar.b ? getMaxEnd(i5) : cVar2.b(i5);
                int e3 = this.mPrimaryOrientation.e(b3) + maxEnd2;
                if (z2 && bVar.b) {
                    LazySpanLookup.FullSpanItem createFullSpanItemFromEnd = createFullSpanItemFromEnd(maxEnd2);
                    createFullSpanItemFromEnd.b = -1;
                    createFullSpanItemFromEnd.a = layoutPosition;
                    this.mLazySpanLookup.a(createFullSpanItemFromEnd);
                }
                i3 = e3;
                e = maxEnd2;
            } else {
                int minStart = bVar.b ? getMinStart(i5) : cVar2.a(i5);
                e = minStart - this.mPrimaryOrientation.e(b3);
                if (z2 && bVar.b) {
                    LazySpanLookup.FullSpanItem createFullSpanItemFromStart = createFullSpanItemFromStart(minStart);
                    createFullSpanItemFromStart.b = 1;
                    createFullSpanItemFromStart.a = layoutPosition;
                    this.mLazySpanLookup.a(createFullSpanItemFromStart);
                }
                i3 = minStart;
            }
            if (bVar.b && acVar.d == -1) {
                if (!z2) {
                    if (acVar.e == 1) {
                        areAllStartsEqual = areAllEndsEqual();
                    } else {
                        areAllStartsEqual = areAllStartsEqual();
                    }
                    if (!areAllStartsEqual) {
                        LazySpanLookup.FullSpanItem d = this.mLazySpanLookup.d(layoutPosition);
                        if (d != null) {
                            d.d = true;
                        }
                    }
                }
                this.mLaidOutInvalidFullSpan = true;
            }
            attachViewToSpans(b3, bVar, acVar);
            if (isLayoutRTL() && this.mOrientation == 1) {
                int c2 = bVar.b ? this.mSecondaryOrientation.c() : this.mSecondaryOrientation.c() - (((this.mSpanCount - 1) - cVar2.e) * this.mSizePerSpan);
                e2 = c2;
                i4 = c2 - this.mSecondaryOrientation.e(b3);
            } else {
                int b4 = bVar.b ? this.mSecondaryOrientation.b() : (cVar2.e * this.mSizePerSpan) + this.mSecondaryOrientation.b();
                i4 = b4;
                e2 = this.mSecondaryOrientation.e(b3) + b4;
            }
            if (this.mOrientation == 1) {
                layoutDecoratedWithMargins(b3, i4, e, e2, i3);
            } else {
                layoutDecoratedWithMargins(b3, e, i4, i3, e2);
            }
            if (bVar.b) {
                updateAllRemainingSpans(this.mLayoutState.e, i2);
            } else {
                updateRemainingSpans(cVar2, this.mLayoutState.e, i2);
            }
            recycle(mVar, this.mLayoutState);
            if (this.mLayoutState.h && b3.hasFocusable()) {
                if (bVar.b) {
                    this.mRemainingSpans.clear();
                } else {
                    this.mRemainingSpans.set(cVar2.e, false);
                }
            }
            z = true;
            r9 = 0;
        }
        if (!z) {
            recycle(mVar, this.mLayoutState);
        }
        if (this.mLayoutState.e == -1) {
            maxEnd = this.mPrimaryOrientation.b() - getMinStart(this.mPrimaryOrientation.b());
        } else {
            maxEnd = getMaxEnd(this.mPrimaryOrientation.c()) - this.mPrimaryOrientation.c();
        }
        if (maxEnd > 0) {
            return Math.min(acVar.b, maxEnd);
        }
        return 0;
    }

    private LazySpanLookup.FullSpanItem createFullSpanItemFromEnd(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.c = new int[this.mSpanCount];
        for (int i2 = 0; i2 < this.mSpanCount; i2++) {
            fullSpanItem.c[i2] = i - this.mSpans[i2].b(i);
        }
        return fullSpanItem;
    }

    private LazySpanLookup.FullSpanItem createFullSpanItemFromStart(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.c = new int[this.mSpanCount];
        for (int i2 = 0; i2 < this.mSpanCount; i2++) {
            fullSpanItem.c[i2] = this.mSpans[i2].a(i) - i;
        }
        return fullSpanItem;
    }

    private void attachViewToSpans(View view, b bVar, ac acVar) {
        if (acVar.e == 1) {
            if (bVar.b) {
                appendViewToAllSpans(view);
            } else {
                bVar.a.b(view);
            }
        } else if (bVar.b) {
            prependViewToAllSpans(view);
        } else {
            bVar.a.a(view);
        }
    }

    private void recycle(RecyclerView.m mVar, ac acVar) {
        int min;
        int min2;
        if (!acVar.a || acVar.i) {
            return;
        }
        if (acVar.b == 0) {
            if (acVar.e == -1) {
                recycleFromEnd(mVar, acVar.g);
            } else {
                recycleFromStart(mVar, acVar.f);
            }
        } else if (acVar.e == -1) {
            int maxStart = acVar.f - getMaxStart(acVar.f);
            if (maxStart < 0) {
                min2 = acVar.g;
            } else {
                min2 = acVar.g - Math.min(maxStart, acVar.b);
            }
            recycleFromEnd(mVar, min2);
        } else {
            int minEnd = getMinEnd(acVar.g) - acVar.g;
            if (minEnd < 0) {
                min = acVar.f;
            } else {
                min = Math.min(minEnd, acVar.b) + acVar.f;
            }
            recycleFromStart(mVar, min);
        }
    }

    private void appendViewToAllSpans(View view) {
        for (int i = this.mSpanCount - 1; i >= 0; i--) {
            this.mSpans[i].b(view);
        }
    }

    private void prependViewToAllSpans(View view) {
        for (int i = this.mSpanCount - 1; i >= 0; i--) {
            this.mSpans[i].a(view);
        }
    }

    private void updateAllRemainingSpans(int i, int i2) {
        for (int i3 = 0; i3 < this.mSpanCount; i3++) {
            if (!this.mSpans[i3].a.isEmpty()) {
                updateRemainingSpans(this.mSpans[i3], i, i2);
            }
        }
    }

    private int getMaxStart(int i) {
        int a2 = this.mSpans[0].a(i);
        for (int i2 = 1; i2 < this.mSpanCount; i2++) {
            int a3 = this.mSpans[i2].a(i);
            if (a3 > a2) {
                a2 = a3;
            }
        }
        return a2;
    }

    private int getMinStart(int i) {
        int a2 = this.mSpans[0].a(i);
        for (int i2 = 1; i2 < this.mSpanCount; i2++) {
            int a3 = this.mSpans[i2].a(i);
            if (a3 < a2) {
                a2 = a3;
            }
        }
        return a2;
    }

    boolean areAllEndsEqual() {
        int b2 = this.mSpans[0].b(Integer.MIN_VALUE);
        for (int i = 1; i < this.mSpanCount; i++) {
            if (this.mSpans[i].b(Integer.MIN_VALUE) != b2) {
                return false;
            }
        }
        return true;
    }

    boolean areAllStartsEqual() {
        int a2 = this.mSpans[0].a(Integer.MIN_VALUE);
        for (int i = 1; i < this.mSpanCount; i++) {
            if (this.mSpans[i].a(Integer.MIN_VALUE) != a2) {
                return false;
            }
        }
        return true;
    }

    private int getMaxEnd(int i) {
        int b2 = this.mSpans[0].b(i);
        for (int i2 = 1; i2 < this.mSpanCount; i2++) {
            int b3 = this.mSpans[i2].b(i);
            if (b3 > b2) {
                b2 = b3;
            }
        }
        return b2;
    }

    private int getMinEnd(int i) {
        int b2 = this.mSpans[0].b(i);
        for (int i2 = 1; i2 < this.mSpanCount; i2++) {
            int b3 = this.mSpans[i2].b(i);
            if (b3 < b2) {
                b2 = b3;
            }
        }
        return b2;
    }

    private void recycleFromStart(RecyclerView.m mVar, int i) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.mPrimaryOrientation.b(childAt) > i || this.mPrimaryOrientation.c(childAt) > i) {
                return;
            }
            b bVar = (b) childAt.getLayoutParams();
            if (bVar.b) {
                for (int i2 = 0; i2 < this.mSpanCount; i2++) {
                    if (this.mSpans[i2].a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.mSpanCount; i3++) {
                    this.mSpans[i3].e();
                }
            } else if (bVar.a.a.size() == 1) {
                return;
            } else {
                bVar.a.e();
            }
            removeAndRecycleView(childAt, mVar);
        }
    }

    private void recycleFromEnd(RecyclerView.m mVar, int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.mPrimaryOrientation.a(childAt) < i || this.mPrimaryOrientation.d(childAt) < i) {
                return;
            }
            b bVar = (b) childAt.getLayoutParams();
            if (bVar.b) {
                for (int i2 = 0; i2 < this.mSpanCount; i2++) {
                    if (this.mSpans[i2].a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.mSpanCount; i3++) {
                    this.mSpans[i3].d();
                }
            } else if (bVar.a.a.size() == 1) {
                return;
            } else {
                bVar.a.d();
            }
            removeAndRecycleView(childAt, mVar);
        }
    }

    private boolean preferLastSpan(int i) {
        if (this.mOrientation == 0) {
            return (i == -1) != this.mShouldReverseLayout;
        }
        return ((i == -1) == this.mShouldReverseLayout) == isLayoutRTL();
    }

    private c getNextSpan(ac acVar) {
        int i;
        int i2;
        int i3 = -1;
        if (preferLastSpan(acVar.e)) {
            i = this.mSpanCount - 1;
            i2 = -1;
        } else {
            i = 0;
            i3 = this.mSpanCount;
            i2 = 1;
        }
        c cVar = null;
        if (acVar.e == 1) {
            int i4 = Integer.MAX_VALUE;
            int b2 = this.mPrimaryOrientation.b();
            while (i != i3) {
                c cVar2 = this.mSpans[i];
                int b3 = cVar2.b(b2);
                if (b3 < i4) {
                    cVar = cVar2;
                    i4 = b3;
                }
                i += i2;
            }
            return cVar;
        }
        int i5 = Integer.MIN_VALUE;
        int c2 = this.mPrimaryOrientation.c();
        while (i != i3) {
            c cVar3 = this.mSpans[i];
            int a2 = cVar3.a(c2);
            if (a2 > i5) {
                cVar = cVar3;
                i5 = a2;
            }
            i += i2;
        }
        return cVar;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.m mVar, RecyclerView.State state) {
        return scrollBy(i, mVar, state);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.m mVar, RecyclerView.State state) {
        return scrollBy(i, mVar, state);
    }

    private int calculateScrollDirectionForPosition(int i) {
        if (getChildCount() == 0) {
            return this.mShouldReverseLayout ? 1 : -1;
        }
        return (i < getFirstChildPosition()) != this.mShouldReverseLayout ? -1 : 1;
    }

    @Override // android.support.v7.widget.RecyclerView.p.b
    public PointF computeScrollVectorForPosition(int i) {
        int calculateScrollDirectionForPosition = calculateScrollDirectionForPosition(i);
        PointF pointF = new PointF();
        if (calculateScrollDirectionForPosition == 0) {
            return null;
        }
        if (this.mOrientation == 0) {
            pointF.x = calculateScrollDirectionForPosition;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = calculateScrollDirectionForPosition;
        }
        return pointF;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        ad adVar = new ad(recyclerView.getContext());
        adVar.setTargetPosition(i);
        startSmoothScroll(adVar);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        if (this.mPendingSavedState != null && this.mPendingSavedState.a != i) {
            this.mPendingSavedState.a();
        }
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        if (this.mPendingSavedState != null) {
            this.mPendingSavedState.a();
        }
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        requestLayout();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.State state, RecyclerView.LayoutManager.a aVar) {
        int b2;
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        prepareLayoutStateForDelta(i, state);
        if (this.mPrefetchDistances == null || this.mPrefetchDistances.length < this.mSpanCount) {
            this.mPrefetchDistances = new int[this.mSpanCount];
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.mSpanCount; i4++) {
            if (this.mLayoutState.d == -1) {
                b2 = this.mLayoutState.f - this.mSpans[i4].a(this.mLayoutState.f);
            } else {
                b2 = this.mSpans[i4].b(this.mLayoutState.g) - this.mLayoutState.g;
            }
            if (b2 >= 0) {
                this.mPrefetchDistances[i3] = b2;
                i3++;
            }
        }
        Arrays.sort(this.mPrefetchDistances, 0, i3);
        for (int i5 = 0; i5 < i3 && this.mLayoutState.a(state); i5++) {
            aVar.a(this.mLayoutState.c, this.mPrefetchDistances[i5]);
            this.mLayoutState.c += this.mLayoutState.d;
        }
    }

    void prepareLayoutStateForDelta(int i, RecyclerView.State state) {
        int firstChildPosition;
        int i2;
        if (i > 0) {
            firstChildPosition = getLastChildPosition();
            i2 = 1;
        } else {
            firstChildPosition = getFirstChildPosition();
            i2 = -1;
        }
        this.mLayoutState.a = true;
        updateLayoutState(firstChildPosition, state);
        setLayoutStateDirection(i2);
        ac acVar = this.mLayoutState;
        acVar.c = firstChildPosition + acVar.d;
        this.mLayoutState.b = Math.abs(i);
    }

    int scrollBy(int i, RecyclerView.m mVar, RecyclerView.State state) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        prepareLayoutStateForDelta(i, state);
        int fill = fill(mVar, this.mLayoutState, state);
        if (this.mLayoutState.b >= fill) {
            i = i < 0 ? -fill : fill;
        }
        this.mPrimaryOrientation.a(-i);
        this.mLastLayoutFromEnd = this.mShouldReverseLayout;
        this.mLayoutState.b = 0;
        recycle(mVar, this.mLayoutState);
        return i;
    }

    int getLastChildPosition() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    int getFirstChildPosition() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    private int findFirstReferenceChildPosition(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            int position = getPosition(getChildAt(i2));
            if (position >= 0 && position < i) {
                return position;
            }
        }
        return 0;
    }

    private int findLastReferenceChildPosition(int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i) {
                return position;
            }
        }
        return 0;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public RecyclerView.g generateDefaultLayoutParams() {
        if (this.mOrientation == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public RecyclerView.g generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public RecyclerView.g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.g gVar) {
        return gVar instanceof b;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    @Nullable
    public View onFocusSearchFailed(View view, int i, RecyclerView.m mVar, RecyclerView.State state) {
        View findContainingItemView;
        int firstChildPosition;
        int g;
        int g2;
        int g3;
        View a2;
        if (getChildCount() == 0 || (findContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        resolveShouldLayoutReverse();
        int convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i);
        if (convertFocusDirectionToLayoutDirection == Integer.MIN_VALUE) {
            return null;
        }
        b bVar = (b) findContainingItemView.getLayoutParams();
        boolean z = bVar.b;
        c cVar = bVar.a;
        if (convertFocusDirectionToLayoutDirection == 1) {
            firstChildPosition = getLastChildPosition();
        } else {
            firstChildPosition = getFirstChildPosition();
        }
        updateLayoutState(firstChildPosition, state);
        setLayoutStateDirection(convertFocusDirectionToLayoutDirection);
        ac acVar = this.mLayoutState;
        acVar.c = acVar.d + firstChildPosition;
        this.mLayoutState.b = (int) (this.mPrimaryOrientation.e() * MAX_SCROLL_FACTOR);
        this.mLayoutState.h = true;
        this.mLayoutState.a = false;
        fill(mVar, this.mLayoutState, state);
        this.mLastLayoutFromEnd = this.mShouldReverseLayout;
        if (z || (a2 = cVar.a(firstChildPosition, convertFocusDirectionToLayoutDirection)) == null || a2 == findContainingItemView) {
            if (preferLastSpan(convertFocusDirectionToLayoutDirection)) {
                for (int i2 = this.mSpanCount - 1; i2 >= 0; i2--) {
                    View a3 = this.mSpans[i2].a(firstChildPosition, convertFocusDirectionToLayoutDirection);
                    if (a3 != null && a3 != findContainingItemView) {
                        return a3;
                    }
                }
            } else {
                for (int i3 = 0; i3 < this.mSpanCount; i3++) {
                    View a4 = this.mSpans[i3].a(firstChildPosition, convertFocusDirectionToLayoutDirection);
                    if (a4 != null && a4 != findContainingItemView) {
                        return a4;
                    }
                }
            }
            boolean z2 = (this.mReverseLayout ^ true) == (convertFocusDirectionToLayoutDirection == -1);
            if (!z) {
                if (z2) {
                    g3 = cVar.f();
                } else {
                    g3 = cVar.g();
                }
                View findViewByPosition = findViewByPosition(g3);
                if (findViewByPosition != null && findViewByPosition != findContainingItemView) {
                    return findViewByPosition;
                }
            }
            if (preferLastSpan(convertFocusDirectionToLayoutDirection)) {
                for (int i4 = this.mSpanCount - 1; i4 >= 0; i4--) {
                    if (i4 != cVar.e) {
                        if (z2) {
                            g2 = this.mSpans[i4].f();
                        } else {
                            g2 = this.mSpans[i4].g();
                        }
                        View findViewByPosition2 = findViewByPosition(g2);
                        if (findViewByPosition2 != null && findViewByPosition2 != findContainingItemView) {
                            return findViewByPosition2;
                        }
                    }
                }
            } else {
                for (int i5 = 0; i5 < this.mSpanCount; i5++) {
                    if (z2) {
                        g = this.mSpans[i5].f();
                    } else {
                        g = this.mSpans[i5].g();
                    }
                    View findViewByPosition3 = findViewByPosition(g);
                    if (findViewByPosition3 != null && findViewByPosition3 != findContainingItemView) {
                        return findViewByPosition3;
                    }
                }
            }
            return null;
        }
        return a2;
    }

    private int convertFocusDirectionToLayoutDirection(int i) {
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

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b extends RecyclerView.g {
        c a;
        public boolean b;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(int i, int i2) {
            super(i, i2);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public final void a(boolean z) {
            this.b = z;
        }

        public final boolean a() {
            return this.b;
        }

        public final int b() {
            if (this.a == null) {
                return -1;
            }
            return this.a.e;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class c {
        ArrayList<View> a = new ArrayList<>();
        int b = Integer.MIN_VALUE;
        int c = Integer.MIN_VALUE;
        int d = 0;
        final int e;

        c(int i) {
            this.e = i;
        }

        final int a(int i) {
            if (this.b != Integer.MIN_VALUE) {
                return this.b;
            }
            if (this.a.size() == 0) {
                return i;
            }
            h();
            return this.b;
        }

        private void h() {
            LazySpanLookup.FullSpanItem d;
            View view = this.a.get(0);
            b bVar = (b) view.getLayoutParams();
            this.b = StaggeredGridLayoutManager.this.mPrimaryOrientation.a(view);
            if (bVar.b && (d = StaggeredGridLayoutManager.this.mLazySpanLookup.d(bVar.c.getLayoutPosition())) != null && d.b == -1) {
                this.b -= d.a(this.e);
            }
        }

        final int a() {
            if (this.b != Integer.MIN_VALUE) {
                return this.b;
            }
            h();
            return this.b;
        }

        final int b(int i) {
            if (this.c != Integer.MIN_VALUE) {
                return this.c;
            }
            if (this.a.size() == 0) {
                return i;
            }
            i();
            return this.c;
        }

        private void i() {
            LazySpanLookup.FullSpanItem d;
            View view = this.a.get(this.a.size() - 1);
            b bVar = (b) view.getLayoutParams();
            this.c = StaggeredGridLayoutManager.this.mPrimaryOrientation.b(view);
            if (bVar.b && (d = StaggeredGridLayoutManager.this.mLazySpanLookup.d(bVar.c.getLayoutPosition())) != null && d.b == 1) {
                this.c += d.a(this.e);
            }
        }

        final int b() {
            if (this.c != Integer.MIN_VALUE) {
                return this.c;
            }
            i();
            return this.c;
        }

        final void c() {
            this.a.clear();
            j();
            this.d = 0;
        }

        private void j() {
            this.b = Integer.MIN_VALUE;
            this.c = Integer.MIN_VALUE;
        }

        final void c(int i) {
            this.b = i;
            this.c = i;
        }

        final void d() {
            int size = this.a.size();
            View remove = this.a.remove(size - 1);
            b bVar = (b) remove.getLayoutParams();
            bVar.a = null;
            if (bVar.c.isRemoved() || bVar.c.isUpdated()) {
                this.d -= StaggeredGridLayoutManager.this.mPrimaryOrientation.e(remove);
            }
            if (size == 1) {
                this.b = Integer.MIN_VALUE;
            }
            this.c = Integer.MIN_VALUE;
        }

        final void e() {
            View remove = this.a.remove(0);
            b bVar = (b) remove.getLayoutParams();
            bVar.a = null;
            if (this.a.size() == 0) {
                this.c = Integer.MIN_VALUE;
            }
            if (bVar.c.isRemoved() || bVar.c.isUpdated()) {
                this.d -= StaggeredGridLayoutManager.this.mPrimaryOrientation.e(remove);
            }
            this.b = Integer.MIN_VALUE;
        }

        final void d(int i) {
            if (this.b != Integer.MIN_VALUE) {
                this.b += i;
            }
            if (this.c != Integer.MIN_VALUE) {
                this.c += i;
            }
        }

        public final int f() {
            if (StaggeredGridLayoutManager.this.mReverseLayout) {
                return b(this.a.size() - 1, -1, true);
            }
            return b(0, this.a.size(), true);
        }

        public final int g() {
            if (StaggeredGridLayoutManager.this.mReverseLayout) {
                return b(0, this.a.size(), true);
            }
            return b(this.a.size() - 1, -1, true);
        }

        private int a(int i, int i2, boolean z, boolean z2, boolean z3) {
            int b = StaggeredGridLayoutManager.this.mPrimaryOrientation.b();
            int c = StaggeredGridLayoutManager.this.mPrimaryOrientation.c();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.a.get(i);
                int a = StaggeredGridLayoutManager.this.mPrimaryOrientation.a(view);
                int b2 = StaggeredGridLayoutManager.this.mPrimaryOrientation.b(view);
                boolean z4 = false;
                boolean z5 = !z3 ? a >= c : a > c;
                if (!z3 ? b2 > b : b2 >= b) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (z && z2) {
                        if (a >= b && b2 <= c) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    } else if (z2) {
                        return StaggeredGridLayoutManager.this.getPosition(view);
                    } else {
                        if (a < b || b2 > c) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    }
                }
                i += i3;
            }
            return -1;
        }

        final int a(int i, int i2, boolean z) {
            return a(i, i2, z, true, false);
        }

        private int b(int i, int i2, boolean z) {
            return a(i, i2, false, false, true);
        }

        public final View a(int i, int i2) {
            View view = null;
            if (i2 == -1) {
                int size = this.a.size();
                int i3 = 0;
                while (i3 < size) {
                    View view2 = this.a.get(i3);
                    if ((StaggeredGridLayoutManager.this.mReverseLayout && StaggeredGridLayoutManager.this.getPosition(view2) <= i) || ((!StaggeredGridLayoutManager.this.mReverseLayout && StaggeredGridLayoutManager.this.getPosition(view2) >= i) || !view2.hasFocusable())) {
                        break;
                    }
                    i3++;
                    view = view2;
                }
            } else {
                int size2 = this.a.size() - 1;
                while (size2 >= 0) {
                    View view3 = this.a.get(size2);
                    if ((StaggeredGridLayoutManager.this.mReverseLayout && StaggeredGridLayoutManager.this.getPosition(view3) >= i) || ((!StaggeredGridLayoutManager.this.mReverseLayout && StaggeredGridLayoutManager.this.getPosition(view3) <= i) || !view3.hasFocusable())) {
                        break;
                    }
                    size2--;
                    view = view3;
                }
            }
            return view;
        }

        final void a(View view) {
            b bVar = (b) view.getLayoutParams();
            bVar.a = this;
            this.a.add(0, view);
            this.b = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.c = Integer.MIN_VALUE;
            }
            if (bVar.c.isRemoved() || bVar.c.isUpdated()) {
                this.d += StaggeredGridLayoutManager.this.mPrimaryOrientation.e(view);
            }
        }

        final void b(View view) {
            b bVar = (b) view.getLayoutParams();
            bVar.a = this;
            this.a.add(view);
            this.c = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.b = Integer.MIN_VALUE;
            }
            if (bVar.c.isRemoved() || bVar.c.isUpdated()) {
                this.d += StaggeredGridLayoutManager.this.mPrimaryOrientation.e(view);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class LazySpanLookup {
        int[] a;
        List<FullSpanItem> b;

        LazySpanLookup() {
        }

        final int a(int i) {
            if (this.b != null) {
                for (int size = this.b.size() - 1; size >= 0; size--) {
                    if (this.b.get(size).a >= i) {
                        this.b.remove(size);
                    }
                }
            }
            return b(i);
        }

        final int b(int i) {
            if (this.a != null && i < this.a.length) {
                int f = f(i);
                if (f == -1) {
                    int[] iArr = this.a;
                    Arrays.fill(iArr, i, iArr.length, -1);
                    return this.a.length;
                }
                int i2 = f + 1;
                Arrays.fill(this.a, i, i2, -1);
                return i2;
            }
            return -1;
        }

        private int e(int i) {
            int length = this.a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        final void c(int i) {
            if (this.a == null) {
                this.a = new int[Math.max(i, 10) + 1];
                Arrays.fill(this.a, -1);
            } else if (i >= this.a.length) {
                int[] iArr = this.a;
                this.a = new int[e(i)];
                System.arraycopy(iArr, 0, this.a, 0, iArr.length);
                Arrays.fill(this.a, iArr.length, this.a.length, -1);
            }
        }

        final void a() {
            if (this.a != null) {
                Arrays.fill(this.a, -1);
            }
            this.b = null;
        }

        final void a(int i, int i2) {
            if (this.a == null || i >= this.a.length) {
                return;
            }
            int i3 = i + i2;
            c(i3);
            int[] iArr = this.a;
            int[] iArr2 = this.a;
            System.arraycopy(iArr, i3, iArr2, i, (iArr2.length - i) - i2);
            Arrays.fill(this.a, this.a.length - i2, this.a.length, -1);
            c(i, i2);
        }

        private void c(int i, int i2) {
            if (this.b == null) {
                return;
            }
            int i3 = i + i2;
            for (int size = this.b.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.b.get(size);
                if (fullSpanItem.a >= i) {
                    if (fullSpanItem.a < i3) {
                        this.b.remove(size);
                    } else {
                        fullSpanItem.a -= i2;
                    }
                }
            }
        }

        final void b(int i, int i2) {
            if (this.a == null || i >= this.a.length) {
                return;
            }
            int i3 = i + i2;
            c(i3);
            int[] iArr = this.a;
            System.arraycopy(iArr, i, iArr, i3, (this.a.length - i) - i2);
            Arrays.fill(this.a, i, i3, -1);
            d(i, i2);
        }

        private void d(int i, int i2) {
            if (this.b == null) {
                return;
            }
            for (int size = this.b.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.b.get(size);
                if (fullSpanItem.a >= i) {
                    fullSpanItem.a += i2;
                }
            }
        }

        private int f(int i) {
            if (this.b == null) {
                return -1;
            }
            FullSpanItem d = d(i);
            if (d != null) {
                this.b.remove(d);
            }
            int size = this.b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.b.get(i2).a >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                this.b.remove(i2);
                return this.b.get(i2).a;
            }
            return -1;
        }

        public final void a(FullSpanItem fullSpanItem) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = this.b.get(i);
                if (fullSpanItem2.a == fullSpanItem.a) {
                    this.b.remove(i);
                }
                if (fullSpanItem2.a >= fullSpanItem.a) {
                    this.b.add(i, fullSpanItem);
                    return;
                }
            }
            this.b.add(fullSpanItem);
        }

        public final FullSpanItem d(int i) {
            if (this.b == null) {
                return null;
            }
            for (int size = this.b.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.b.get(size);
                if (fullSpanItem.a == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public final FullSpanItem a(int i, int i2, int i3, boolean z) {
            if (this.b == null) {
                return null;
            }
            int size = this.b.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = this.b.get(i4);
                if (fullSpanItem.a >= i2) {
                    return null;
                }
                if (fullSpanItem.a >= i && (i3 == 0 || fullSpanItem.b == i3 || fullSpanItem.d)) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProGuard */
        /* loaded from: classes.dex */
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new Parcelable.Creator<FullSpanItem>() { // from class: android.support.v7.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem.1
                @Override // android.os.Parcelable.Creator
                public final /* bridge */ /* synthetic */ FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }
            };
            int a;
            int b;
            int[] c;
            boolean d;

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            FullSpanItem(Parcel parcel) {
                this.a = parcel.readInt();
                this.b = parcel.readInt();
                this.d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    this.c = new int[readInt];
                    parcel.readIntArray(this.c);
                }
            }

            FullSpanItem() {
            }

            final int a(int i) {
                if (this.c == null) {
                    return 0;
                }
                return this.c[i];
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.a);
                parcel.writeInt(this.b);
                parcel.writeInt(this.d ? 1 : 0);
                if (this.c != null && this.c.length > 0) {
                    parcel.writeInt(this.c.length);
                    parcel.writeIntArray(this.c);
                    return;
                }
                parcel.writeInt(0);
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.a + ", mGapDir=" + this.b + ", mHasUnwantedGapAfter=" + this.d + ", mGapPerSpan=" + Arrays.toString(this.c) + '}';
            }
        }
    }

    /* compiled from: ProGuard */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: android.support.v7.widget.StaggeredGridLayoutManager.SavedState.1
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
        int c;
        int[] d;
        int e;
        int[] f;
        List<LazySpanLookup.FullSpanItem> g;
        boolean h;
        boolean i;
        boolean j;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        SavedState(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readInt();
            if (this.c > 0) {
                this.d = new int[this.c];
                parcel.readIntArray(this.d);
            }
            this.e = parcel.readInt();
            if (this.e > 0) {
                this.f = new int[this.e];
                parcel.readIntArray(this.f);
            }
            this.h = parcel.readInt() == 1;
            this.i = parcel.readInt() == 1;
            this.j = parcel.readInt() == 1;
            this.g = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.c = savedState.c;
            this.a = savedState.a;
            this.b = savedState.b;
            this.d = savedState.d;
            this.e = savedState.e;
            this.f = savedState.f;
            this.h = savedState.h;
            this.i = savedState.i;
            this.j = savedState.j;
            this.g = savedState.g;
        }

        final void a() {
            this.d = null;
            this.c = 0;
            this.a = -1;
            this.b = -1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            if (this.c > 0) {
                parcel.writeIntArray(this.d);
            }
            parcel.writeInt(this.e);
            if (this.e > 0) {
                parcel.writeIntArray(this.f);
            }
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeList(this.g);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a {
        int a;
        int b;
        boolean c;
        boolean d;
        boolean e;
        int[] f;

        a() {
            a();
        }

        final void a() {
            this.a = -1;
            this.b = Integer.MIN_VALUE;
            this.c = false;
            this.d = false;
            this.e = false;
            if (this.f != null) {
                Arrays.fill(this.f, -1);
            }
        }

        final void b() {
            this.b = this.c ? StaggeredGridLayoutManager.this.mPrimaryOrientation.c() : StaggeredGridLayoutManager.this.mPrimaryOrientation.b();
        }
    }

    boolean updateAnchorFromPendingData(RecyclerView.State state, a aVar) {
        int b2;
        if (state.g || this.mPendingScrollPosition == -1) {
            return false;
        }
        if (this.mPendingScrollPosition < 0 || this.mPendingScrollPosition >= state.c()) {
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
            return false;
        }
        if (this.mPendingSavedState == null || this.mPendingSavedState.a == -1 || this.mPendingSavedState.c <= 0) {
            View findViewByPosition = findViewByPosition(this.mPendingScrollPosition);
            if (findViewByPosition != null) {
                aVar.a = this.mShouldReverseLayout ? getLastChildPosition() : getFirstChildPosition();
                if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                    if (aVar.c) {
                        aVar.b = (this.mPrimaryOrientation.c() - this.mPendingScrollPositionOffset) - this.mPrimaryOrientation.b(findViewByPosition);
                    } else {
                        aVar.b = (this.mPrimaryOrientation.b() + this.mPendingScrollPositionOffset) - this.mPrimaryOrientation.a(findViewByPosition);
                    }
                    return true;
                } else if (this.mPrimaryOrientation.e(findViewByPosition) > this.mPrimaryOrientation.e()) {
                    if (aVar.c) {
                        b2 = this.mPrimaryOrientation.c();
                    } else {
                        b2 = this.mPrimaryOrientation.b();
                    }
                    aVar.b = b2;
                    return true;
                } else {
                    int a2 = this.mPrimaryOrientation.a(findViewByPosition) - this.mPrimaryOrientation.b();
                    if (a2 < 0) {
                        aVar.b = -a2;
                        return true;
                    }
                    int c2 = this.mPrimaryOrientation.c() - this.mPrimaryOrientation.b(findViewByPosition);
                    if (c2 < 0) {
                        aVar.b = c2;
                        return true;
                    }
                    aVar.b = Integer.MIN_VALUE;
                }
            } else {
                aVar.a = this.mPendingScrollPosition;
                if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                    aVar.c = calculateScrollDirectionForPosition(aVar.a) == 1;
                    aVar.b();
                } else {
                    int i = this.mPendingScrollPositionOffset;
                    if (aVar.c) {
                        aVar.b = StaggeredGridLayoutManager.this.mPrimaryOrientation.c() - i;
                    } else {
                        aVar.b = StaggeredGridLayoutManager.this.mPrimaryOrientation.b() + i;
                    }
                }
                aVar.d = true;
            }
        } else {
            aVar.b = Integer.MIN_VALUE;
            aVar.a = this.mPendingScrollPosition;
        }
        return true;
    }

    private void updateRemainingSpans(c cVar, int i, int i2) {
        int i3 = cVar.d;
        if (i == -1) {
            if (cVar.a() + i3 <= i2) {
                this.mRemainingSpans.set(cVar.e, false);
            }
        } else if (cVar.b() - i3 >= i2) {
            this.mRemainingSpans.set(cVar.e, false);
        }
    }
}
