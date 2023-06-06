package com.sankuai.waimai.mach.component.swiper.recyclerview;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Interpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class ViewPagerLayoutManager extends LinearLayoutManager {
    public static ChangeQuickRedirect b;
    private View A;
    private SparseArray<View> a;
    protected int c;
    protected int d;
    public int e;
    protected int f;
    protected int g;
    protected int h;
    protected float i;
    protected int j;
    protected b k;
    protected float l;
    public a m;
    boolean n;
    int o;
    int p;
    private boolean q;
    private boolean r;
    private boolean s;
    private int t;
    private SavedState u;
    private boolean v;
    private boolean w;
    private int x;
    private int y;
    private Interpolator z;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(int i);
    }

    public abstract float a();

    public abstract void a(View view, float f);

    public float b() {
        return 1.0f;
    }

    public void c() {
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public View onFocusSearchFailed(View view, int i, RecyclerView.m mVar, RecyclerView.State state) {
        return null;
    }

    public ViewPagerLayoutManager(Context context) {
        this(context, 0, false);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71fa2f21332f3b787c2219d02efdcb3b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71fa2f21332f3b787c2219d02efdcb3b");
        }
    }

    public ViewPagerLayoutManager(Context context, int i, boolean z) {
        super(context);
        Object[] objArr = {context, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1408bb8bf7fbaa80283efea4d91d60ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1408bb8bf7fbaa80283efea4d91d60ae");
            return;
        }
        this.a = new SparseArray<>();
        this.q = false;
        this.r = false;
        this.s = true;
        this.t = -1;
        this.u = null;
        this.n = false;
        this.o = -1;
        this.p = Integer.MAX_VALUE;
        setOrientation(i);
        setReverseLayout(z);
        setAutoMeasureEnabled(true);
        setItemPrefetchEnabled(false);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public RecyclerView.g generateDefaultLayoutParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aee4c35a24c0d1554d37edb7648b895c", RobustBitConfig.DEFAULT_VALUE) ? (RecyclerView.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aee4c35a24c0d1554d37edb7648b895c") : new RecyclerView.g(-2, -2);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public boolean getRecycleChildrenOnDetach() {
        return this.v;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public void setRecycleChildrenOnDetach(boolean z) {
        this.v = z;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.m mVar) {
        Object[] objArr = {recyclerView, mVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c4af9c6b4d27b6fc4748354baef28fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c4af9c6b4d27b6fc4748354baef28fb");
            return;
        }
        super.onDetachedFromWindow(recyclerView, mVar);
        if (this.v) {
            removeAndRecycleAllViews(mVar);
            mVar.a();
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3e4aec3e533438eddcd7c604a654d7c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Parcelable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3e4aec3e533438eddcd7c604a654d7c");
        }
        if (this.u != null) {
            return new SavedState(this.u);
        }
        SavedState savedState = new SavedState();
        savedState.b = this.t;
        savedState.c = this.i;
        savedState.d = this.r;
        return savedState;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        Object[] objArr = {parcelable};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b1f6ad9660aeccfdf3e6d9a26ffc062", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b1f6ad9660aeccfdf3e6d9a26ffc062");
        } else if (parcelable instanceof SavedState) {
            this.u = new SavedState((SavedState) parcelable);
            requestLayout();
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.e == 0;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.e == 1;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public int getOrientation() {
        return this.e;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public void setOrientation(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5147810d46f3c1d414691a29d6fff3d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5147810d46f3c1d414691a29d6fff3d2");
        } else if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        } else {
            assertNotInLayoutOrScroll(null);
            if (i == this.e) {
                return;
            }
            this.e = i;
            this.k = null;
            this.p = Integer.MAX_VALUE;
            removeAllViews();
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public boolean getReverseLayout() {
        return this.q;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public void setReverseLayout(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f09a385e3138bd1d2f13d6fed9590185", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f09a385e3138bd1d2f13d6fed9590185");
            return;
        }
        assertNotInLayoutOrScroll(null);
        if (z == this.q) {
            return;
        }
        this.q = z;
        removeAllViews();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        int a2;
        int i2;
        Object[] objArr = {recyclerView, state, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60a18ad9d9abb0bdea24ceac0e422a4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60a18ad9d9abb0bdea24ceac0e422a4a");
            return;
        }
        if (this.n) {
            int f = f();
            int itemCount = getItemCount();
            if (i < f) {
                int i3 = f - i;
                int i4 = (itemCount - f) + i;
                i2 = i3 < i4 ? f - i3 : f + i4;
            } else {
                int i5 = i - f;
                int i6 = (itemCount + f) - i;
                i2 = i5 < i6 ? f + i5 : f - i6;
            }
            a2 = a(i2);
        } else {
            a2 = a(i);
        }
        if (this.e == 1) {
            recyclerView.smoothScrollBy(0, a2, this.z);
        } else {
            recyclerView.smoothScrollBy(a2, 0, this.z);
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.m mVar, RecyclerView.State state) {
        boolean z;
        float f;
        float f2;
        Object[] objArr = {mVar, state};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64f2ea3fa3463e8b9fbfc6a89a89bcc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64f2ea3fa3463e8b9fbfc6a89a89bcc7");
        } else if (state.c() == 0) {
            removeAndRecycleAllViews(mVar);
            this.i = 0.0f;
        } else {
            ensureLayoutState();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "be2dfbbe9225b70e9ee84b459698a794", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "be2dfbbe9225b70e9ee84b459698a794");
            } else {
                if (this.e == 1 || !isLayoutRTL()) {
                    z = this.q;
                } else {
                    z = !this.q;
                }
                this.r = z;
            }
            View a2 = a(mVar, state, 0);
            if (a2 == null) {
                removeAndRecycleAllViews(mVar);
                this.i = 0.0f;
                return;
            }
            measureChildWithMargins(a2, 0, 0);
            this.c = this.k.a(a2);
            this.d = this.k.b(a2);
            this.f = (this.k.b() - this.c) / 2;
            if (this.p == Integer.MAX_VALUE) {
                this.h = (this.k.c() - this.d) / 2;
            } else {
                this.h = (this.k.c() - this.d) - this.p;
            }
            this.l = a();
            c();
            if (this.l == 0.0f) {
                this.x = 1;
                this.y = 1;
            } else {
                this.x = ((int) Math.abs(o() / this.l)) + 1;
                this.y = ((int) Math.abs(n() / this.l)) + 1;
            }
            if (this.u != null) {
                this.r = this.u.d;
                this.t = this.u.b;
                this.i = this.u.c;
            }
            if (this.t != -1) {
                if (this.r) {
                    f = this.t;
                    f2 = -this.l;
                } else {
                    f = this.t;
                    f2 = this.l;
                }
                this.i = f * f2;
            }
            a(mVar);
        }
    }

    private View a(RecyclerView.m mVar, RecyclerView.State state, int i) {
        while (true) {
            Object[] objArr = {mVar, state, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b47b5abbcc7f090c8d943999df3488c9", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b47b5abbcc7f090c8d943999df3488c9");
            }
            if (i >= state.c() || i < 0) {
                return null;
            }
            try {
                return mVar.b(i);
            } catch (Exception unused) {
                i++;
            }
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        Object[] objArr = {state};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce7235d43826eb6030edf173ab3f256c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce7235d43826eb6030edf173ab3f256c");
            return;
        }
        super.onLayoutCompleted(state);
        this.u = null;
        this.t = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
        if (r16.r != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
        r12 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
        if (r16.r != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:
        if (r16.r != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009c, code lost:
        if (r16.r != false) goto L26;
     */
    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onAddFocusables(android.support.v7.widget.RecyclerView r17, java.util.ArrayList<android.view.View> r18, int r19, int r20) {
        /*
            r16 = this;
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r0 = 4
            java.lang.Object[] r11 = new java.lang.Object[r0]
            r12 = 0
            r11[r12] = r8
            r13 = 1
            r11[r13] = r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
            r1 = 2
            r11[r1] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            r1 = 3
            r11[r1] = r0
            com.meituan.robust.ChangeQuickRedirect r14 = com.sankuai.waimai.mach.component.swiper.recyclerview.ViewPagerLayoutManager.b
            java.lang.String r15 = "a229128582699d67522610abbea8d078"
            r3 = 0
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0 = r11
            r1 = r16
            r2 = r14
            r4 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L3c
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r7, r14, r12, r15)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L3c:
            int r11 = r16.f()
            android.view.View r0 = r7.findViewByPosition(r11)
            if (r0 != 0) goto L47
            return r13
        L47:
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto Laa
            java.lang.Object[] r9 = new java.lang.Object[r13]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
            r9[r12] = r0
            com.meituan.robust.ChangeQuickRedirect r14 = com.sankuai.waimai.mach.component.swiper.recyclerview.ViewPagerLayoutManager.b
            java.lang.String r15 = "e19d8356d9a17cf19a70a31b8d528909"
            r3 = 0
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0 = r9
            r1 = r16
            r2 = r14
            r4 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            r1 = -1
            if (r0 == 0) goto L73
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r9, r7, r14, r12, r15)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r12 = r0.intValue()
            goto L9f
        L73:
            int r0 = r7.e
            if (r0 != r13) goto L8d
            r0 = 33
            if (r10 != r0) goto L82
            boolean r0 = r7.r
            if (r0 == 0) goto L80
            goto L9f
        L80:
            r12 = 1
            goto L9f
        L82:
            r0 = 130(0x82, float:1.82E-43)
            if (r10 != r0) goto L8b
            boolean r0 = r7.r
            if (r0 == 0) goto L9f
            goto L80
        L8b:
            r12 = -1
            goto L9f
        L8d:
            r0 = 17
            if (r10 != r0) goto L96
            boolean r0 = r7.r
            if (r0 == 0) goto L80
            goto L9f
        L96:
            r0 = 66
            if (r10 != r0) goto L8b
            boolean r0 = r7.r
            if (r0 == 0) goto L9f
            goto L80
        L9f:
            if (r12 == r1) goto Laf
            if (r12 != r13) goto La5
            int r11 = r11 - r13
            goto La6
        La5:
            int r11 = r11 + r13
        La6:
            com.sankuai.waimai.mach.component.swiper.recyclerview.e.a(r8, r7, r11)
            goto Laf
        Laa:
            r1 = r20
            r0.addFocusables(r9, r10, r1)
        Laf:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.component.swiper.recyclerview.ViewPagerLayoutManager.onAddFocusables(android.support.v7.widget.RecyclerView, java.util.ArrayList, int, int):boolean");
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public void ensureLayoutState() {
        b bVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2422285bc67840f9653f02e1ccbc7d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2422285bc67840f9653f02e1ccbc7d1");
        } else if (this.k == null) {
            int i = this.e;
            Object[] objArr2 = {this, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5a105785e1191ea087b3b1f3d997cf16", RobustBitConfig.DEFAULT_VALUE)) {
                bVar = (b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5a105785e1191ea087b3b1f3d997cf16");
            } else {
                switch (i) {
                    case 0:
                        Object[] objArr3 = {this};
                        ChangeQuickRedirect changeQuickRedirect3 = b.a;
                        if (!PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "5ac2923fba0c369661d247a8c34630f2", RobustBitConfig.DEFAULT_VALUE)) {
                            bVar = new b(this) { // from class: com.sankuai.waimai.mach.component.swiper.recyclerview.b.1
                                public static ChangeQuickRedirect d;

                                @Override // com.sankuai.waimai.mach.component.swiper.recyclerview.b
                                public final int a() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = d;
                                    return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ae52247b08a459c09c5574218b93fcf1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ae52247b08a459c09c5574218b93fcf1")).intValue() : this.b.getPaddingLeft();
                                }

                                @Override // com.sankuai.waimai.mach.component.swiper.recyclerview.b
                                public final int a(View view) {
                                    Object[] objArr4 = {view};
                                    ChangeQuickRedirect changeQuickRedirect4 = d;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "101723f322410d27c599c6318c7b0db6", RobustBitConfig.DEFAULT_VALUE)) {
                                        return ((Integer) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "101723f322410d27c599c6318c7b0db6")).intValue();
                                    }
                                    RecyclerView.g gVar = (RecyclerView.g) view.getLayoutParams();
                                    return this.b.getDecoratedMeasuredWidth(view) + gVar.leftMargin + gVar.rightMargin;
                                }

                                @Override // com.sankuai.waimai.mach.component.swiper.recyclerview.b
                                public final int b(View view) {
                                    Object[] objArr4 = {view};
                                    ChangeQuickRedirect changeQuickRedirect4 = d;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "453ddd0ddadbeb4f1454ce70af20610f", RobustBitConfig.DEFAULT_VALUE)) {
                                        return ((Integer) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "453ddd0ddadbeb4f1454ce70af20610f")).intValue();
                                    }
                                    RecyclerView.g gVar = (RecyclerView.g) view.getLayoutParams();
                                    return this.b.getDecoratedMeasuredHeight(view) + gVar.topMargin + gVar.bottomMargin;
                                }

                                @Override // com.sankuai.waimai.mach.component.swiper.recyclerview.b
                                public final int b() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = d;
                                    return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f975a48b5cb2abbe498fd3206243acb8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f975a48b5cb2abbe498fd3206243acb8")).intValue() : (this.b.getWidth() - this.b.getPaddingLeft()) - this.b.getPaddingRight();
                                }

                                @Override // com.sankuai.waimai.mach.component.swiper.recyclerview.b
                                public final int c() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = d;
                                    return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "91fa730230eb8a19022c0b7e71aaec4f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "91fa730230eb8a19022c0b7e71aaec4f")).intValue() : (this.b.getHeight() - this.b.getPaddingTop()) - this.b.getPaddingBottom();
                                }
                            };
                            break;
                        } else {
                            bVar = (b) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "5ac2923fba0c369661d247a8c34630f2");
                            break;
                        }
                    case 1:
                        Object[] objArr4 = {this};
                        ChangeQuickRedirect changeQuickRedirect4 = b.a;
                        if (!PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "632adddf5d9d9735caeafcc0bdd09c55", RobustBitConfig.DEFAULT_VALUE)) {
                            bVar = new b(this) { // from class: com.sankuai.waimai.mach.component.swiper.recyclerview.b.2
                                public static ChangeQuickRedirect d;

                                @Override // com.sankuai.waimai.mach.component.swiper.recyclerview.b
                                public final int a() {
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = d;
                                    return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "e477eec7b2b618e8d8ff2da403692be0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "e477eec7b2b618e8d8ff2da403692be0")).intValue() : this.b.getPaddingTop();
                                }

                                @Override // com.sankuai.waimai.mach.component.swiper.recyclerview.b
                                public final int a(View view) {
                                    Object[] objArr5 = {view};
                                    ChangeQuickRedirect changeQuickRedirect5 = d;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "c19b068dbbfcc58d7cc3677166a0134b", RobustBitConfig.DEFAULT_VALUE)) {
                                        return ((Integer) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "c19b068dbbfcc58d7cc3677166a0134b")).intValue();
                                    }
                                    RecyclerView.g gVar = (RecyclerView.g) view.getLayoutParams();
                                    return this.b.getDecoratedMeasuredHeight(view) + gVar.topMargin + gVar.bottomMargin;
                                }

                                @Override // com.sankuai.waimai.mach.component.swiper.recyclerview.b
                                public final int b(View view) {
                                    Object[] objArr5 = {view};
                                    ChangeQuickRedirect changeQuickRedirect5 = d;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "c93801237774c39c592e8d3da3990f26", RobustBitConfig.DEFAULT_VALUE)) {
                                        return ((Integer) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "c93801237774c39c592e8d3da3990f26")).intValue();
                                    }
                                    RecyclerView.g gVar = (RecyclerView.g) view.getLayoutParams();
                                    return this.b.getDecoratedMeasuredWidth(view) + gVar.leftMargin + gVar.rightMargin;
                                }

                                @Override // com.sankuai.waimai.mach.component.swiper.recyclerview.b
                                public final int b() {
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = d;
                                    return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "5093eb7d94fe5aeb90a4775082405d17", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "5093eb7d94fe5aeb90a4775082405d17")).intValue() : (this.b.getHeight() - this.b.getPaddingTop()) - this.b.getPaddingBottom();
                                }

                                @Override // com.sankuai.waimai.mach.component.swiper.recyclerview.b
                                public final int c() {
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = d;
                                    return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "7dc9b2c0ba26805110a38690622e37f2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "7dc9b2c0ba26805110a38690622e37f2")).intValue() : (this.b.getWidth() - this.b.getPaddingLeft()) - this.b.getPaddingRight();
                                }
                            };
                            break;
                        } else {
                            bVar = (b) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "632adddf5d9d9735caeafcc0bdd09c55");
                            break;
                        }
                    default:
                        throw new IllegalArgumentException("invalid orientation");
                }
            }
            this.k = bVar;
        }
    }

    private float b(int i) {
        float f;
        float f2;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3337d306581d5aea16e197190fbd405", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3337d306581d5aea16e197190fbd405")).floatValue();
        }
        if (this.r) {
            f = i;
            f2 = -this.l;
        } else {
            f = i;
            f2 = this.l;
        }
        return f * f2;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.a aVar, RecyclerView.a aVar2) {
        Object[] objArr = {aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f242755419d45cd225d5b64a13ece63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f242755419d45cd225d5b64a13ece63");
            return;
        }
        removeAllViews();
        this.i = 0.0f;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        float f;
        float f2;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ce3fd73da19ef54f561e368000ffbe8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ce3fd73da19ef54f561e368000ffbe8");
        } else if (this.n || (i >= 0 && i < getItemCount())) {
            this.t = i;
            if (this.r) {
                f = i;
                f2 = -this.l;
            } else {
                f = i;
                f2 = this.l;
            }
            this.i = f * f2;
            requestLayout();
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        Object[] objArr = {state};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a13fbd3bf0bd81feb519cdb582f83ff", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a13fbd3bf0bd81feb519cdb582f83ff")).intValue() : j();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        Object[] objArr = {state};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d406cedd05c0b4e1f586f0ca30de2a4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d406cedd05c0b4e1f586f0ca30de2a4")).intValue() : j();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        Object[] objArr = {state};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4c2df2a8ebe213b7428c8d850ff1cc9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4c2df2a8ebe213b7428c8d850ff1cc9")).intValue() : k();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        Object[] objArr = {state};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a9022096ac02b3f4dc2c9211b68260b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a9022096ac02b3f4dc2c9211b68260b")).intValue() : k();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        Object[] objArr = {state};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee610fae06c97500f3bc7f0ec16d68c7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee610fae06c97500f3bc7f0ec16d68c7")).intValue() : l();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        Object[] objArr = {state};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f36acbf75acf0a1d3af7d55797a50449", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f36acbf75acf0a1d3af7d55797a50449")).intValue() : l();
    }

    private int j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57e062059dd1ff364469a32d0fdcdc6f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57e062059dd1ff364469a32d0fdcdc6f")).intValue();
        }
        if (getChildCount() == 0) {
            return 0;
        }
        if (!this.s) {
            return !this.r ? f() : (getItemCount() - f()) - 1;
        }
        float p = p();
        return !this.r ? (int) p : (int) (((getItemCount() - 1) * this.l) + p);
    }

    private int k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd442305e266ad86fadbe50bc5c0301e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd442305e266ad86fadbe50bc5c0301e")).intValue();
        }
        if (getChildCount() == 0) {
            return 0;
        }
        if (this.s) {
            return (int) this.l;
        }
        return 1;
    }

    private int l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0fb7760350c08e41dac344637ea49fe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0fb7760350c08e41dac344637ea49fe")).intValue();
        }
        if (getChildCount() == 0) {
            return 0;
        }
        if (!this.s) {
            return getItemCount();
        }
        return (int) (getItemCount() * this.l);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.m mVar, RecyclerView.State state) {
        Object[] objArr = {Integer.valueOf(i), mVar, state};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c95d0315575d5d28e421c230d54a6d3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c95d0315575d5d28e421c230d54a6d3")).intValue();
        }
        if (this.e == 1) {
            return 0;
        }
        return a(i, mVar, state);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.m mVar, RecyclerView.State state) {
        Object[] objArr = {Integer.valueOf(i), mVar, state};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4267ac33652f44a2abbfc357c534cd1e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4267ac33652f44a2abbfc357c534cd1e")).intValue();
        }
        if (this.e == 0) {
            return 0;
        }
        return a(i, mVar, state);
    }

    private int a(int i, RecyclerView.m mVar, RecyclerView.State state) {
        Object[] objArr = {Integer.valueOf(i), mVar, state};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e113b3a928c063d0b776f781b614ac65", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e113b3a928c063d0b776f781b614ac65")).intValue();
        }
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        ensureLayoutState();
        float f = i;
        float b2 = f / b();
        if (Math.abs(b2) < 1.0E-8f) {
            return 0;
        }
        float f2 = this.i + b2;
        if (!this.n && f2 < e()) {
            i = (int) (f - ((f2 - e()) * b()));
        } else if (!this.n && f2 > d()) {
            i = (int) ((d() - this.i) * b());
        }
        this.i += i / b();
        a(mVar);
        return i;
    }

    private void a(RecyclerView.m mVar) {
        int i;
        int i2;
        int i3;
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00adadcf3086f0b84750ef11cb7ab0ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00adadcf3086f0b84750ef11cb7ab0ca");
            return;
        }
        detachAndScrapAttachedViews(mVar);
        this.a.clear();
        int itemCount = getItemCount();
        if (itemCount == 0) {
            return;
        }
        int g = this.r ? -g() : g();
        int i4 = g - this.x;
        int i5 = this.y + g;
        if (m()) {
            if (this.o % 2 == 0) {
                int i6 = this.o / 2;
                i = (g - i6) + 1;
                i2 = i6 + g + 1;
            } else {
                int i7 = (this.o - 1) / 2;
                i = g - i7;
                i2 = i7 + g + 1;
            }
        } else {
            i = i4;
            i2 = i5;
        }
        if (!this.n) {
            if (i < 0) {
                if (m()) {
                    i2 = this.o;
                }
                i = 0;
            }
            if (i2 > itemCount) {
                i2 = itemCount;
            }
        }
        float f = Float.MIN_VALUE;
        while (i < i2) {
            if (m() || !a(b(i) - this.i)) {
                if (i >= itemCount) {
                    i3 = i % itemCount;
                } else if (i < 0) {
                    int i8 = (-i) % itemCount;
                    if (i8 == 0) {
                        i8 = itemCount;
                    }
                    i3 = itemCount - i8;
                } else {
                    i3 = i;
                }
                View b2 = mVar.b(i3);
                measureChildWithMargins(b2, 0, 0);
                a(b2);
                b(b2, b(i) - this.i);
                float f2 = this.w ? 0.0f : i3;
                if (f2 > f) {
                    addView(b2);
                } else {
                    addView(b2, 0);
                }
                if (i == g) {
                    this.A = b2;
                }
                this.a.put(i, b2);
                f = f2;
            }
            i++;
        }
        this.A.requestFocus();
    }

    private boolean m() {
        return this.o != -1;
    }

    private boolean a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22be1d9aaa48a4fb5bb94c929525ad93", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22be1d9aaa48a4fb5bb94c929525ad93")).booleanValue() : f > n() || f < o();
    }

    private void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1959a0b234448dea0bea5c898cf3f7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1959a0b234448dea0bea5c898cf3f7e");
            return;
        }
        view.setPivotX(view.getWidth() * 0.5f);
        view.setPivotY(view.getHeight() * 0.5f);
        view.setRotation(0.0f);
        view.setRotationY(0.0f);
        view.setRotationX(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setAlpha(1.0f);
    }

    public final float d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "488066e08a5c8e46aa27cb5a94e0fcb9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "488066e08a5c8e46aa27cb5a94e0fcb9")).floatValue();
        }
        if (this.r) {
            return 0.0f;
        }
        return (getItemCount() * this.l) - ((((getOrientation() == 0 ? getWidth() : getHeight()) - this.f) - this.g) + this.j);
    }

    public final float e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af5cb4361b619b2b3cbbc5949bf3f910", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af5cb4361b619b2b3cbbc5949bf3f910")).floatValue();
        }
        if (this.r) {
            return -((getItemCount() * this.l) - ((((getOrientation() == 0 ? getWidth() : getHeight()) - this.f) - this.g) + this.j));
        }
        return 0.0f;
    }

    private void b(View view, float f) {
        Object[] objArr = {view, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6676ab875cd3a2235e073ac44c62c5b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6676ab875cd3a2235e073ac44c62c5b7");
            return;
        }
        int c = c(view, f);
        int d = d(view, f);
        if (this.e == 1) {
            layoutDecorated(view, this.h + c, this.f + d, this.h + c + this.d, this.f + d + this.c);
        } else {
            layoutDecorated(view, this.f + c, this.h + d, this.f + c + this.c, this.h + d + this.d);
        }
        a(view, f);
    }

    private int c(View view, float f) {
        if (this.e == 1) {
            return 0;
        }
        return (int) f;
    }

    private int d(View view, float f) {
        if (this.e == 1) {
            return (int) f;
        }
        return 0;
    }

    private float n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d589ba013a0d8bb58bb738a40714aba", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d589ba013a0d8bb58bb738a40714aba")).floatValue() : this.k.b() - this.f;
    }

    private float o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45d7e3b7ac7c54fa2f559fc0e1944833", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45d7e3b7ac7c54fa2f559fc0e1944833")).floatValue() : ((-this.c) - this.k.a()) - this.f;
    }

    public final int f() {
        int itemCount;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e828282d682044aa983bea6ca27fdc61", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e828282d682044aa983bea6ca27fdc61")).intValue();
        }
        if (getItemCount() == 0) {
            return 0;
        }
        int g = g();
        if (this.n) {
            if (this.r) {
                if (g > 0) {
                    itemCount = getItemCount() - (g % getItemCount());
                } else {
                    itemCount = (-g) % getItemCount();
                }
            } else if (g >= 0) {
                itemCount = g % getItemCount();
            } else {
                itemCount = (g % getItemCount()) + getItemCount();
            }
            if (itemCount == getItemCount()) {
                return 0;
            }
            return itemCount;
        }
        return Math.abs(g);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public View findViewByPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80dfc43ecdf1b227d5f7ad05018dd02b", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80dfc43ecdf1b227d5f7ad05018dd02b");
        }
        int itemCount = getItemCount();
        if (itemCount == 0) {
            return null;
        }
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            int keyAt = this.a.keyAt(i2);
            if (keyAt >= 0) {
                if (i == keyAt % itemCount) {
                    return this.a.valueAt(i2);
                }
            } else {
                int i3 = keyAt % itemCount;
                if (i3 == 0) {
                    i3 = -itemCount;
                }
                if (i3 + itemCount == i) {
                    return this.a.valueAt(i2);
                }
            }
        }
        return null;
    }

    public final int g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f40d2f67fae9e9a9abec4b49921a3bff", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f40d2f67fae9e9a9abec4b49921a3bff")).intValue();
        }
        if (this.l == 0.0f) {
            return 0;
        }
        return Math.round(this.i / this.l);
    }

    public final float h() {
        return this.i;
    }

    private float p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d47f47e1c2aacdb6e7b67e181d612955", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d47f47e1c2aacdb6e7b67e181d612955")).floatValue();
        }
        if (this.r) {
            if (this.n) {
                if (this.i <= 0.0f) {
                    return this.i % (this.l * getItemCount());
                }
                return (getItemCount() * (-this.l)) + (this.i % (this.l * getItemCount()));
            }
            return this.i;
        } else if (this.n) {
            if (this.i >= 0.0f) {
                return this.i % (this.l * getItemCount());
            }
            return (getItemCount() * this.l) + (this.i % (this.l * getItemCount()));
        } else {
            return this.i;
        }
    }

    public final int i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95940174582c15fee3cb92f05524b6c9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95940174582c15fee3cb92f05524b6c9")).intValue();
        }
        if (this.n) {
            return (int) (((g() * this.l) - this.i) * b());
        }
        return (int) (((f() * (!this.r ? this.l : -this.l)) - this.i) * b());
    }

    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e707df8d6a400b6d2c8e42fec2b35146", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e707df8d6a400b6d2c8e42fec2b35146")).intValue();
        }
        if (this.n) {
            return (int) ((((g() + (!this.r ? i - g() : (-g()) - i)) * this.l) - this.i) * b());
        }
        return (int) (((i * (!this.r ? this.l : -this.l)) - this.i) * b());
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "052b3ced662a0c0f0cc818adf5fe21c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "052b3ced662a0c0f0cc818adf5fe21c4");
            return;
        }
        assertNotInLayoutOrScroll(null);
        if (z == this.n) {
            return;
        }
        this.n = z;
        requestLayout();
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public void setSmoothScrollbarEnabled(boolean z) {
        this.s = z;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.sankuai.waimai.mach.component.swiper.recyclerview.ViewPagerLayoutManager.SavedState.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                Object[] objArr = {parcel};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69402e5a6405c16caf65bda763f66c2d", RobustBitConfig.DEFAULT_VALUE) ? (SavedState) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69402e5a6405c16caf65bda763f66c2d") : new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public static ChangeQuickRedirect a;
        public int b;
        public float c;
        public boolean d;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7265d51e7c59ede5297820a49782fafb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7265d51e7c59ede5297820a49782fafb");
                return;
            }
            this.b = parcel.readInt();
            this.c = parcel.readFloat();
            this.d = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            Object[] objArr = {savedState};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f58aff7ec59b8c86b0d7dd9d34c8bc49", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f58aff7ec59b8c86b0d7dd9d34c8bc49");
                return;
            }
            this.b = savedState.b;
            this.c = savedState.c;
            this.d = savedState.d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Object[] objArr = {parcel, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f33d342e069b1b24984145ad456b66f1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f33d342e069b1b24984145ad456b66f1");
                return;
            }
            parcel.writeInt(this.b);
            parcel.writeFloat(this.c);
            parcel.writeInt(this.d ? 1 : 0);
        }
    }
}
