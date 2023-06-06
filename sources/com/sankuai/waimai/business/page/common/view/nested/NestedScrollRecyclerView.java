package com.sankuai.waimai.business.page.common.view.nested;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.NestedScrollingChild2;
import android.support.v4.view.NestedScrollingParent;
import android.support.v4.view.NestedScrollingParentHelper;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.o;
import com.sankuai.waimai.platform.widget.pullrefresh.AbsScrollPullRefresh;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class NestedScrollRecyclerView extends RecyclerView implements NestedScrollingChild2, NestedScrollingParent, com.sankuai.waimai.platform.widget.smoothnestedscroll.core.e {
    public static ChangeQuickRedirect a;
    protected boolean b;
    protected final com.sankuai.waimai.platform.widget.smoothnestedscroll.core.d c;
    protected int d;
    protected d e;
    public boolean f;
    public int g;
    public int h;
    private NestedScrollingParentHelper i;
    private VelocityTracker j;
    private boolean k;
    private int l;
    private int m;
    private int n;

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i) {
        return (i & 2) != 0;
    }

    public NestedScrollRecyclerView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56cf599990ea76d61e137961ebe7060f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56cf599990ea76d61e137961ebe7060f");
        }
    }

    public NestedScrollRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a20fc5d301be023a2b4489ea7989c66a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a20fc5d301be023a2b4489ea7989c66a");
        }
    }

    public NestedScrollRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d97dc2231685b08366a9f7caaefdda8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d97dc2231685b08366a9f7caaefdda8");
            return;
        }
        this.b = true;
        this.c = new com.sankuai.waimai.platform.widget.smoothnestedscroll.core.d(this);
        this.j = VelocityTracker.obtain();
        this.k = false;
        this.d = 0;
        this.f = true;
        this.g = 0;
        this.h = 0;
        this.i = new NestedScrollingParentHelper(this);
        a(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
        if (r1.a.a() != false) goto L11;
     */
    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.business.page.common.view.nested.NestedScrollRecyclerView.a
            java.lang.String r11 = "8613fbff8a00f95c7cfd21394f396791"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L22
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            return r13
        L22:
            boolean r1 = r12.canScrollVertically(r0)
            if (r1 == 0) goto L74
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.business.page.common.view.nested.NestedScrollRecyclerView.a
            java.lang.String r11 = "af74fdfc85bb9cc8e3bd02ae575c3d5e"
            r5 = 0
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            r2 = r1
            r3 = r12
            r4 = r10
            r6 = r11
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L48
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r12, r10, r9, r11)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L6c
        L48:
            com.sankuai.waimai.business.page.common.view.nested.NestedScrollRecyclerView$a r1 = r12.getNestedScrollChildInfo()
            if (r1 == 0) goto L6b
            com.sankuai.waimai.business.page.common.view.nested.c r2 = r1.a
            if (r2 == 0) goto L6b
            int r2 = r1.b
            float r3 = r13.getY()
            float r2 = (float) r2
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 <= 0) goto L5f
            r2 = 1
            goto L60
        L5f:
            r2 = 0
        L60:
            if (r2 == 0) goto L6b
            com.sankuai.waimai.business.page.common.view.nested.c r1 = r1.a
            boolean r1 = r1.a()
            if (r1 == 0) goto L6b
            goto L6c
        L6b:
            r0 = 0
        L6c:
            if (r0 == 0) goto L6f
            return r9
        L6f:
            boolean r13 = super.onInterceptTouchEvent(r13)
            return r13
        L74:
            com.sankuai.waimai.business.page.common.view.nested.NestedScrollRecyclerView$a r0 = r12.getNestedScrollChildInfo()
            if (r0 == 0) goto L87
            com.sankuai.waimai.business.page.common.view.nested.c r1 = r0.a
            if (r1 == 0) goto L87
            com.sankuai.waimai.business.page.common.view.nested.c r0 = r0.a
            boolean r0 = r0.a()
            if (r0 == 0) goto L87
            return r9
        L87:
            boolean r13 = super.onInterceptTouchEvent(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.common.view.nested.NestedScrollRecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a {
        public c a;
        public int b;

        public a(c cVar, int i) {
            this.a = cVar;
            this.b = i;
        }
    }

    private a getNestedScrollChildInfo() {
        c cVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83a9743f9f031dcce706ec6d47e2c48d", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83a9743f9f031dcce706ec6d47e2c48d");
        }
        int itemCount = getAdapter().getItemCount();
        if (itemCount <= 0) {
            return null;
        }
        View findViewByPosition = getLayoutManager().findViewByPosition(itemCount - 1);
        if (findViewByPosition instanceof c) {
            c cVar2 = (c) findViewByPosition;
            return new a(cVar2, findViewByPosition.getTop() + cVar2.b());
        } else if (!(findViewByPosition instanceof ViewGroup) || (cVar = (c) a((ViewGroup) findViewByPosition)) == null) {
            return null;
        } else {
            return new a(cVar, findViewByPosition.getTop() + cVar.b());
        }
    }

    private View a(ViewGroup viewGroup) {
        View a2;
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb8a1636f11320ebb1bca405e2bea9ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb8a1636f11320ebb1bca405e2bea9ca");
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof c) {
                return childAt;
            }
            if ((childAt instanceof ViewGroup) && (a2 = a((ViewGroup) childAt)) != null) {
                return a2;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i) {
        Object[] objArr = {view, view2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1aab78f1b8b15338a773bc9b6479ce37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1aab78f1b8b15338a773bc9b6479ce37");
            return;
        }
        this.i.onNestedScrollAccepted(view, view2, i);
        startNestedScroll(2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onStopNestedScroll(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e45882541b2128bba1264f48c235528", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e45882541b2128bba1264f48c235528");
            return;
        }
        this.i.onStopNestedScroll(view);
        stopNestedScroll();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b90b2740090147d31248256c582e200", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b90b2740090147d31248256c582e200");
        } else {
            dispatchNestedScroll(0, i2, 0, i3, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onNestedPreScroll(@NonNull View view, int i, int i2, @NonNull int[] iArr) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b36c7286fbf9be6d0fbc6b6ebb4a1c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b36c7286fbf9be6d0fbc6b6ebb4a1c9");
        } else if (i2 < 0) {
            if (!(view instanceof RecyclerView)) {
                dispatchNestedPreScroll(i, i2, iArr, null);
            } else if (view.canScrollVertically(-1)) {
                dispatchNestedPreScroll(i, i2, iArr, null);
            } else {
                scrollBy(i, i2);
                iArr[0] = i;
                iArr[1] = i2;
            }
        } else if (canScrollVertically(1)) {
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if ((parent instanceof AbsScrollPullRefresh) && ((AbsScrollPullRefresh) parent).getHeaderHelper().c() > 0) {
                    dispatchNestedPreScroll(i, i2, iArr, null);
                    return;
                }
            }
            scrollBy(i, i2);
            iArr[0] = i;
            iArr[1] = i2;
        } else {
            dispatchNestedPreScroll(i, i2, iArr, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onNestedFling(@NonNull View view, float f, float f2, boolean z) {
        Object[] objArr = {view, Float.valueOf(f), Float.valueOf(f2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a0d6b66f9556eeab9c8a3ed5fdb95cb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a0d6b66f9556eeab9c8a3ed5fdb95cb")).booleanValue() : dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onNestedPreFling(@NonNull View view, float f, float f2) {
        Object[] objArr = {view, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8939ebdce89d67187c4ce4a22a8b9d68", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8939ebdce89d67187c4ce4a22a8b9d68")).booleanValue() : dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.support.v4.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db4dd3cc8073506d906511ab1f8b946d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db4dd3cc8073506d906511ab1f8b946d")).intValue() : this.i.getNestedScrollAxes();
    }

    public void setOnNestedScrollListener(d dVar) {
        this.e = dVar;
    }

    public void setSmoothNestedScrollState(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c873b50956a61e1dfc1cd98a7eb26b87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c873b50956a61e1dfc1cd98a7eb26b87");
            return;
        }
        boolean z = this.d != i;
        this.d = i;
        if (this.d == 3 || !z || this.e == null) {
            return;
        }
        this.e.a(this, this.d);
    }

    public void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd95ec557f7552c3144880703259fd36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd95ec557f7552c3144880703259fd36");
            return;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.l = viewConfiguration.getScaledMinimumFlingVelocity();
        this.m = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "804e539f55a8e6679239a4a95ba15b4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "804e539f55a8e6679239a4a95ba15b4c");
            return;
        }
        this.c.a();
        setSmoothNestedScrollState(0);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4217c6228c824c8619dbf030215a6980", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4217c6228c824c8619dbf030215a6980");
            return;
        }
        this.c.a();
        setSmoothNestedScrollState(0);
        super.onStartTemporaryDetach();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36fdc1311f76f05544ccf403f6634589", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36fdc1311f76f05544ccf403f6634589")).booleanValue();
        }
        this.c.a();
        if (this.d == 2) {
            setSmoothNestedScrollState(0);
        }
        if (motionEvent.getAction() == 0) {
            this.j.clear();
            this.n = (int) motionEvent.getRawY();
        }
        this.j.addMovement(motionEvent);
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if ((action == 1 || action == 3) && this.d != 3 && this.d != 2) {
            setSmoothNestedScrollState(0);
        }
        return dispatchTouchEvent;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac4921aa0acf53fc0cb2aaf77bec9169", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac4921aa0acf53fc0cb2aaf77bec9169")).booleanValue();
        }
        this.k = false;
        switch (motionEvent.getAction()) {
            case 1:
                this.j.computeCurrentVelocity(1000, this.m);
                i = -((int) this.j.getYVelocity());
                if (Math.abs(i) > this.l) {
                    if (o.a(this.n - ((int) motionEvent.getRawY())) == o.a(i)) {
                        this.k = true;
                    } else {
                        com.sankuai.waimai.foundation.utils.log.a.e("LinkedFlingScroll", "error vy ignored", new Object[0]);
                    }
                }
                com.sankuai.waimai.foundation.utils.log.a.b("LinkedFlingScroll", "vy = %d", Integer.valueOf(i));
                this.j.clear();
                break;
            case 2:
            default:
                i = 0;
                break;
            case 3:
                i = 0;
                this.j.clear();
                break;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.k) {
            this.k = false;
            float f = i;
            if (!dispatchNestedPreFling(0.0f, f)) {
                dispatchNestedFling(0.0f, f, false);
            }
        }
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 1 || actionMasked == 3) && this.d != 3 && this.d != 2) {
            setSmoothNestedScrollState(0);
        }
        return onTouchEvent;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a225d3a663b0223f0a2ee0f1079d5926", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a225d3a663b0223f0a2ee0f1079d5926")).booleanValue();
        }
        if (this.f) {
            setSmoothNestedScrollState(3);
            this.k = false;
            b(this, 0, (int) f, 0, (int) f2, new com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c() { // from class: com.sankuai.waimai.business.page.common.view.nested.NestedScrollRecyclerView.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c
                public final void a(View view, int i, int i2, int i3, int i4) {
                    Object[] objArr2 = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "11b043c8b9639cd5c4e39ea234ccb9d3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "11b043c8b9639cd5c4e39ea234ccb9d3");
                        return;
                    }
                    if (i3 == 0 && i4 == 0) {
                        NestedScrollRecyclerView.this.setSmoothNestedScrollState(0);
                    } else {
                        NestedScrollRecyclerView.this.setSmoothNestedScrollState(2);
                    }
                    NestedScrollRecyclerView.this.c.a(i, i2, i3, i4, new com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c() { // from class: com.sankuai.waimai.business.page.common.view.nested.NestedScrollRecyclerView.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c
                        public final void a(View view2, int i5, int i6, int i7, int i8) {
                            Object[] objArr3 = {view2, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ddcb88809fe1741317755d206239173d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ddcb88809fe1741317755d206239173d");
                                return;
                            }
                            NestedScrollRecyclerView.this.a(view2, i5, i6, i7, i8);
                            NestedScrollRecyclerView.this.setSmoothNestedScrollState(0);
                        }
                    });
                }
            });
            return true;
        }
        return true;
    }

    private void b(View view, int i, int i2, int i3, int i4, com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c cVar) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "909d622bfb2d8f335f155ed51b9c2eb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "909d622bfb2d8f335f155ed51b9c2eb2");
        } else {
            this.c.a(view, i, i2, i3, i4, cVar);
        }
    }

    public final void a(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0122a8fbf5a4ebcf53a4debef66aa50e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0122a8fbf5a4ebcf53a4debef66aa50e");
        } else {
            this.c.a(view, i, i2, i3, i4);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.e
    public final void a(View view, int i, int i2, int i3, int i4, final com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c cVar) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2e83d5968266311ed8dee970b322d39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2e83d5968266311ed8dee970b322d39");
            return;
        }
        if (i4 > 0) {
            b(view, i, i2, i3, i4, new com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c() { // from class: com.sankuai.waimai.business.page.common.view.nested.NestedScrollRecyclerView.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c
                public final void a(View view2, int i5, int i6, int i7, int i8) {
                    Object[] objArr2 = {view2, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "54a7ea2beb928c8b7cd5438d636e632a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "54a7ea2beb928c8b7cd5438d636e632a");
                    } else {
                        NestedScrollRecyclerView.this.c.a(i5, i6, i7, i8, cVar);
                    }
                }
            });
        } else {
            b(view, i, i2, i3, i4, cVar);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.e
    public final void b(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59e40b60570d3f5169cd9b53132b8140", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59e40b60570d3f5169cd9b53132b8140");
            return;
        }
        if (i4 < 0) {
            if (i3 == 0 && i4 == 0) {
                setSmoothNestedScrollState(0);
            } else {
                setSmoothNestedScrollState(2);
            }
            this.c.a(i, i2, i3, i4, new com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c() { // from class: com.sankuai.waimai.business.page.common.view.nested.NestedScrollRecyclerView.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c
                public final void a(View view2, int i5, int i6, int i7, int i8) {
                    Object[] objArr2 = {view2, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7db713329dba2997b12316a5167bf419", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7db713329dba2997b12316a5167bf419");
                        return;
                    }
                    NestedScrollRecyclerView.this.a(NestedScrollRecyclerView.this, i5, i6, i7, i8);
                    NestedScrollRecyclerView.this.setSmoothNestedScrollState(0);
                }
            });
            return;
        }
        a(view, i, i2, i3, i4);
        setSmoothNestedScrollState(0);
    }

    public void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7842f2c5d75addb177293333ed6b69c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7842f2c5d75addb177293333ed6b69c1");
            return;
        }
        if (Math.abs(i - i2) >= 8 && this.d != 2) {
            setSmoothNestedScrollState(1);
        }
        if (this.e != null) {
            this.e.b(this, i);
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public void onScrolled(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c09fc2d5f133b1901e33eac4944235bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c09fc2d5f133b1901e33eac4944235bf");
        } else if (this.b) {
            this.g += i2;
            if (this.g < 0) {
                this.g = 0;
                this.h = 0;
            }
            a(this.g, this.h);
            this.h = this.g;
        }
    }

    public void setNotifyScrollChange(boolean z) {
        this.b = z;
    }
}
