package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    boolean a;
    public int b;
    int[] c;
    View[] d;
    final SparseIntArray e;
    final SparseIntArray f;
    public c g;
    final Rect h;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new a();
        this.h = new Rect();
        a(getProperties(context, attributeSet, i, i2).b);
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new a();
        this.h = new Rect();
        a(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new a();
        this.h = new Rect();
        a(i);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public int getRowCountForAccessibility(RecyclerView.m mVar, RecyclerView.State state) {
        if (this.mOrientation == 0) {
            return this.b;
        }
        if (state.c() <= 0) {
            return 0;
        }
        return a(mVar, state, state.c() - 1) + 1;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public int getColumnCountForAccessibility(RecyclerView.m mVar, RecyclerView.State state) {
        if (this.mOrientation == 1) {
            return this.b;
        }
        if (state.c() <= 0) {
            return 0;
        }
        return a(mVar, state, state.c() - 1) + 1;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.m mVar, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, accessibilityNodeInfoCompat);
            return;
        }
        b bVar = (b) layoutParams;
        int a2 = a(mVar, state, bVar.c.getLayoutPosition());
        if (this.mOrientation == 0) {
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(bVar.a, bVar.b, a2, 1, this.b > 1 && bVar.b == this.b, false));
        } else {
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(a2, 1, bVar.a, bVar.b, this.b > 1 && bVar.b == this.b, false));
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.a = false;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        this.g.a.clear();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        this.g.a.clear();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        this.g.a.clear();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.g.a.clear();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        this.g.a.clear();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
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

    public final void a(c cVar) {
        this.g = cVar;
    }

    private void b() {
        int height;
        if (getOrientation() == 1) {
            height = (getWidth() - getPaddingRight()) - getPaddingLeft();
        } else {
            height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        }
        b(height);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int chooseSize;
        int chooseSize2;
        if (this.c == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            chooseSize2 = chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            chooseSize = chooseSize(i, this.c[this.c.length - 1] + paddingLeft, getMinimumWidth());
        } else {
            chooseSize = chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            chooseSize2 = chooseSize(i2, this.c[this.c.length - 1] + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    private void b(int i) {
        this.c = a(this.c, this.b, i);
    }

    private static int[] a(int[] iArr, int i, int i2) {
        int i3;
        if (iArr == null || iArr.length != i + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    private int a(int i, int i2) {
        if (this.mOrientation == 1 && isLayoutRTL()) {
            return this.c[this.b - i] - this.c[(this.b - i) - i2];
        }
        return this.c[i2 + i] - this.c[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.v7.widget.LinearLayoutManager
    public void onAnchorReady(RecyclerView.m mVar, RecyclerView.State state, LinearLayoutManager.a aVar, int i) {
        super.onAnchorReady(mVar, state, aVar, i);
        b();
        if (state.c() > 0 && !state.g) {
            boolean z = i == 1;
            int b2 = b(mVar, state, aVar.a);
            if (z) {
                while (b2 > 0 && aVar.a > 0) {
                    aVar.a--;
                    b2 = b(mVar, state, aVar.a);
                }
            } else {
                int c2 = state.c() - 1;
                int i2 = aVar.a;
                while (i2 < c2) {
                    int i3 = i2 + 1;
                    int b3 = b(mVar, state, i3);
                    if (b3 <= b2) {
                        break;
                    }
                    i2 = i3;
                    b2 = b3;
                }
                aVar.a = i2;
            }
        }
        c();
    }

    private void c() {
        if (this.d == null || this.d.length != this.b) {
            this.d = new View[this.b];
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.m mVar, RecyclerView.State state) {
        b();
        c();
        return super.scrollHorizontallyBy(i, mVar, state);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.m mVar, RecyclerView.State state) {
        b();
        c();
        return super.scrollVerticallyBy(i, mVar, state);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
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
            if (position >= 0 && position < i3 && b(mVar, state, position) == 0) {
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

    @Override // android.support.v7.widget.LinearLayoutManager
    void collectPrefetchPositionsForLayoutState(RecyclerView.State state, LinearLayoutManager.c cVar, RecyclerView.LayoutManager.a aVar) {
        int i = this.b;
        for (int i2 = 0; i2 < this.b && cVar.a(state) && i > 0; i2++) {
            int i3 = cVar.d;
            aVar.a(i3, Math.max(0, cVar.g));
            i -= this.g.a(i3);
            cVar.d += cVar.e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009c, code lost:
        r21.b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009e, code lost:
        return;
     */
    @Override // android.support.v7.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void layoutChunk(android.support.v7.widget.RecyclerView.m r18, android.support.v7.widget.RecyclerView.State r19, android.support.v7.widget.LinearLayoutManager.c r20, android.support.v7.widget.LinearLayoutManager.b r21) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.layoutChunk(android.support.v7.widget.RecyclerView$m, android.support.v7.widget.RecyclerView$State, android.support.v7.widget.LinearLayoutManager$c, android.support.v7.widget.LinearLayoutManager$b):void");
    }

    private void a(View view, int i, boolean z) {
        int i2;
        int i3;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.d;
        int i4 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i5 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int a2 = a(bVar.a, bVar.b);
        if (this.mOrientation == 1) {
            i3 = getChildMeasureSpec(a2, i, i5, bVar.width, false);
            i2 = getChildMeasureSpec(this.mOrientationHelper.e(), getHeightMode(), i4, bVar.height, true);
        } else {
            int childMeasureSpec = getChildMeasureSpec(a2, i, i4, bVar.height, false);
            int childMeasureSpec2 = getChildMeasureSpec(this.mOrientationHelper.e(), getWidthMode(), i5, bVar.width, true);
            i2 = childMeasureSpec;
            i3 = childMeasureSpec2;
        }
        a(view, i3, i2, z);
    }

    private void a(View view, int i, int i2, boolean z) {
        boolean shouldMeasureChild;
        RecyclerView.g gVar = (RecyclerView.g) view.getLayoutParams();
        if (z) {
            shouldMeasureChild = shouldReMeasureChild(view, i, i2, gVar);
        } else {
            shouldMeasureChild = shouldMeasureChild(view, i, i2, gVar);
        }
        if (shouldMeasureChild) {
            view.measure(i, i2);
        }
    }

    private void a(RecyclerView.m mVar, RecyclerView.State state, int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5 = -1;
        int i6 = 0;
        if (z) {
            i5 = i;
            i3 = 0;
            i4 = 1;
        } else {
            i3 = i - 1;
            i4 = -1;
        }
        while (i3 != i5) {
            View view = this.d[i3];
            b bVar = (b) view.getLayoutParams();
            bVar.b = c(mVar, state, getPosition(view));
            bVar.a = i6;
            i6 += bVar.b;
            i3 += i4;
        }
    }

    public final int a() {
        return this.b;
    }

    public final void a(int i) {
        if (i == this.b) {
            return;
        }
        this.a = true;
        if (i <= 0) {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
        this.b = i;
        this.g.a.clear();
        requestLayout();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static abstract class c {
        final SparseIntArray a = new SparseIntArray();
        private boolean b = false;

        public abstract int a(int i);

        final int b(int i, int i2) {
            if (!this.b) {
                return a(i, i2);
            }
            int i3 = this.a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int a = a(i, i2);
            this.a.put(i, a);
            return a;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x006c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x006d A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int a(int r7, int r8) {
            /*
                r6 = this;
                int r0 = r6.a(r7)
                r1 = 0
                if (r0 != r8) goto L8
                return r1
            L8:
                boolean r2 = r6.b
                if (r2 == 0) goto L56
                android.util.SparseIntArray r2 = r6.a
                int r2 = r2.size()
                if (r2 <= 0) goto L56
                android.util.SparseIntArray r2 = r6.a
                int r2 = r2.size()
                int r2 = r2 + (-1)
                r3 = r2
                r2 = 0
            L1e:
                if (r2 > r3) goto L32
                int r4 = r2 + r3
                int r4 = r4 >>> 1
                android.util.SparseIntArray r5 = r6.a
                int r5 = r5.keyAt(r4)
                if (r5 >= r7) goto L2f
                int r2 = r4 + 1
                goto L1e
            L2f:
                int r3 = r4 + (-1)
                goto L1e
            L32:
                int r2 = r2 + (-1)
                if (r2 < 0) goto L45
                android.util.SparseIntArray r3 = r6.a
                int r3 = r3.size()
                if (r2 >= r3) goto L45
                android.util.SparseIntArray r3 = r6.a
                int r2 = r3.keyAt(r2)
                goto L46
            L45:
                r2 = -1
            L46:
                if (r2 < 0) goto L56
                android.util.SparseIntArray r3 = r6.a
                int r3 = r3.get(r2)
                int r4 = r6.a(r2)
                int r3 = r3 + r4
                int r2 = r2 + 1
                goto L58
            L56:
                r2 = 0
                r3 = 0
            L58:
                if (r2 >= r7) goto L69
                int r4 = r6.a(r2)
                int r3 = r3 + r4
                if (r3 != r8) goto L63
                r3 = 0
                goto L66
            L63:
                if (r3 <= r8) goto L66
                r3 = r4
            L66:
                int r2 = r2 + 1
                goto L58
            L69:
                int r0 = r0 + r3
                if (r0 > r8) goto L6d
                return r3
            L6d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.c.a(int, int):int");
        }

        public final int c(int i, int i2) {
            int a = a(i);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int a2 = a(i5);
                i3 += a2;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = a2;
                }
            }
            return i3 + a > i2 ? i4 + 1 : i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d6, code lost:
        if (r13 == (r2 > r8)) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f3, code lost:
        if (r13 == (r2 > r11)) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0102  */
    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onFocusSearchFailed(android.view.View r26, int r27, android.support.v7.widget.RecyclerView.m r28, android.support.v7.widget.RecyclerView.State r29) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, android.support.v7.widget.RecyclerView$m, android.support.v7.widget.RecyclerView$State):android.view.View");
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class a extends c {
        @Override // android.support.v7.widget.GridLayoutManager.c
        public final int a(int i) {
            return 1;
        }

        @Override // android.support.v7.widget.GridLayoutManager.c
        public final int a(int i, int i2) {
            return i % i2;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b extends RecyclerView.g {
        public int a;
        int b;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = -1;
            this.b = 0;
        }

        public b(int i, int i2) {
            super(i, i2);
            this.a = -1;
            this.b = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = -1;
            this.b = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = -1;
            this.b = 0;
        }

        public final int a() {
            return this.a;
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.m mVar, RecyclerView.State state) {
        if (state.g) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                b bVar = (b) getChildAt(i).getLayoutParams();
                int layoutPosition = bVar.c.getLayoutPosition();
                this.e.put(layoutPosition, bVar.b);
                this.f.put(layoutPosition, bVar.a);
            }
        }
        super.onLayoutChildren(mVar, state);
        this.e.clear();
        this.f.clear();
    }

    private int a(RecyclerView.m mVar, RecyclerView.State state, int i) {
        if (!state.g) {
            return this.g.c(i, this.b);
        }
        int a2 = mVar.a(i);
        if (a2 == -1) {
            new StringBuilder("Cannot find span size for pre layout position. ").append(i);
            return 0;
        }
        return this.g.c(a2, this.b);
    }

    private int b(RecyclerView.m mVar, RecyclerView.State state, int i) {
        if (!state.g) {
            return this.g.b(i, this.b);
        }
        int i2 = this.f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a2 = mVar.a(i);
        if (a2 == -1) {
            new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:").append(i);
            return 0;
        }
        return this.g.b(a2, this.b);
    }

    private int c(RecyclerView.m mVar, RecyclerView.State state, int i) {
        if (!state.g) {
            return this.g.a(i);
        }
        int i2 = this.e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a2 = mVar.a(i);
        if (a2 == -1) {
            new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:").append(i);
            return 1;
        }
        return this.g.a(a2);
    }
}
