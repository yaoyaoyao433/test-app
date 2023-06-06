package com.sankuai.waimai.machpro.component.swiper_v2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.aj;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.component.swiper.MPSwiperRecyclerView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class MPViewPager extends ViewGroup {
    public static ChangeQuickRedirect a = null;
    public static boolean b = true;
    public int c;
    public boolean d;
    public g e;
    boolean f;
    public int g;
    private final Rect h;
    private final Rect i;
    private com.sankuai.waimai.machpro.component.swiper_v2.a j;
    private RecyclerView.c k;
    private LinearLayoutManager l;
    private int m;
    private MPSwiperRecyclerView n;
    private aj o;
    private com.sankuai.waimai.machpro.component.swiper_v2.a p;
    private com.sankuai.waimai.machpro.component.swiper_v2.e q;
    private RecyclerView.ItemAnimator r;
    private boolean s;
    private int t;
    private int u;
    private boolean v;

    /* compiled from: ProGuard */
    @IntRange(from = 1)
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface OffscreenPageLimit {
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface Orientation {
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface ScrollState {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class c {
        public void a(int i) {
        }

        public void a(int i, float f, int i2) {
        }

        public void b(int i) {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface d {
        void a(@NonNull View view, float f);
    }

    public MPViewPager(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64c9700471bf67ed99657818926d07eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64c9700471bf67ed99657818926d07eb");
            return;
        }
        this.h = new Rect();
        this.i = new Rect();
        this.j = new com.sankuai.waimai.machpro.component.swiper_v2.a(3);
        this.d = false;
        this.k = new a() { // from class: com.sankuai.waimai.machpro.component.swiper_v2.MPViewPager.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.machpro.component.swiper_v2.MPViewPager.a, android.support.v7.widget.RecyclerView.c
            public final void onChanged() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "efd8ed3d1462629399ba9c39b64f4a23", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "efd8ed3d1462629399ba9c39b64f4a23");
                    return;
                }
                MPViewPager.this.d = true;
                MPViewPager.this.e.d = true;
            }
        };
        this.m = -1;
        this.r = null;
        this.s = false;
        this.f = true;
        this.t = -1;
        this.u = 1;
        this.g = 0;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a250e076dcf8845ec4aa29ad890fa042", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a250e076dcf8845ec4aa29ad890fa042");
            return;
        }
        this.n = new e(context, this);
        this.n.setDescendantFocusability(131072);
        this.l = new b(context);
        this.n.setLayoutManager(this.l);
        this.n.setScrollingTouchSlop(1);
        this.n.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.e = new g(this);
        this.o = new com.sankuai.waimai.machpro.component.swiper_v2.d(this);
        this.o.a(this.n);
        this.n.addOnScrollListener(this.e);
        this.p = new com.sankuai.waimai.machpro.component.swiper_v2.a(3);
        this.e.b = this.p;
        c cVar = new c() { // from class: com.sankuai.waimai.machpro.component.swiper_v2.MPViewPager.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.machpro.component.swiper_v2.MPViewPager.c
            public final void a(int i) {
                if (MPViewPager.this.c != i) {
                    MPViewPager.this.c = i;
                }
            }

            @Override // com.sankuai.waimai.machpro.component.swiper_v2.MPViewPager.c
            public final void b(int i) {
                Object[] objArr3 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b8531594ed76fb814b3310d007557ad5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b8531594ed76fb814b3310d007557ad5");
                } else if (i == 0) {
                    MPViewPager.this.a();
                }
            }
        };
        c cVar2 = new c() { // from class: com.sankuai.waimai.machpro.component.swiper_v2.MPViewPager.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.machpro.component.swiper_v2.MPViewPager.c
            public final void a(int i) {
                Object[] objArr3 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bf33402a994d1dcae542520d5958f0d8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bf33402a994d1dcae542520d5958f0d8");
                    return;
                }
                MPViewPager.this.clearFocus();
                if (MPViewPager.this.hasFocus()) {
                    MPViewPager.this.n.requestFocus(2);
                }
            }
        };
        this.n.addItemDecoration(new RecyclerView.f() { // from class: com.sankuai.waimai.machpro.component.swiper_v2.MPViewPager.4
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.f
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                Object[] objArr3 = {rect, view, recyclerView, state};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fd460970e9d3e77129930bc36d878d77", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fd460970e9d3e77129930bc36d878d77");
                    return;
                }
                super.getItemOffsets(rect, view, recyclerView, state);
                if (MPViewPager.this.u == 1) {
                    int childAdapterPosition = MPViewPager.this.n.getChildAdapterPosition(view);
                    if (childAdapterPosition == 0) {
                        if (MPViewPager.this.l.getOrientation() == 0) {
                            if (view.getMeasuredWidth() <= 0) {
                                MPViewPager.this.measureChild(view, 0, 0);
                            }
                            MPViewPager.this.g = (MPViewPager.this.n.getWidth() - MPViewPager.this.l.getDecoratedMeasuredWidth(view)) / 2;
                            rect.left = MPViewPager.this.g;
                            return;
                        }
                        if (view.getMeasuredHeight() <= 0) {
                            MPViewPager.this.measureChild(view, 0, 0);
                        }
                        MPViewPager.this.g = (MPViewPager.this.n.getHeight() - MPViewPager.this.l.getDecoratedMeasuredHeight(view)) / 2;
                        rect.top = MPViewPager.this.g;
                    } else if (childAdapterPosition == MPViewPager.this.n.getAdapter().getItemCount() - 1) {
                        if (MPViewPager.this.l.getOrientation() == 0) {
                            if (view.getMeasuredWidth() <= 0) {
                                MPViewPager.this.measureChild(view, 0, 0);
                            }
                            rect.right = (MPViewPager.this.n.getWidth() - MPViewPager.this.l.getDecoratedMeasuredWidth(view)) / 2;
                            return;
                        }
                        if (view.getMeasuredHeight() <= 0) {
                            MPViewPager.this.measureChild(view, 0, 0);
                        }
                        rect.bottom = (MPViewPager.this.n.getHeight() - MPViewPager.this.l.getDecoratedMeasuredHeight(view)) / 2;
                    }
                }
            }
        });
        this.p.a(cVar);
        this.p.a(cVar2);
        this.p.a(this.j);
        this.q = new com.sankuai.waimai.machpro.component.swiper_v2.e(this.l);
        this.p.a(this.q);
        attachViewToParent(this.n, 0, this.n.getLayoutParams());
    }

    public final MPSwiperRecyclerView getRecyclerView() {
        return this.n;
    }

    public final void setAlignmentType(int i) {
        this.u = i;
    }

    public final int getAlignmentType() {
        return this.u;
    }

    public final void setInfinite(boolean z) {
        this.v = z;
    }

    public final void setAdapter(@Nullable RecyclerView.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8022d0bacf9d626e591b9bc7a2182920", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8022d0bacf9d626e591b9bc7a2182920");
            return;
        }
        RecyclerView.a adapter = this.n.getAdapter();
        Object[] objArr2 = {adapter};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "80a7e0b89c9094d93b031eb3c76e0bb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "80a7e0b89c9094d93b031eb3c76e0bb3");
        } else if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.k);
        }
        this.n.setAdapter(aVar);
        this.c = 0;
        Object[] objArr3 = {aVar};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1619e2a3fbf90516386104409493e4cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1619e2a3fbf90516386104409493e4cf");
        } else if (aVar != null) {
            aVar.registerAdapterDataObserver(this.k);
        }
    }

    @Nullable
    public final RecyclerView.a getAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cc4b70e80f8aa0e8d0d79b83513a265", RobustBitConfig.DEFAULT_VALUE) ? (RecyclerView.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cc4b70e80f8aa0e8d0d79b83513a265") : this.n.getAdapter();
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4165569eed50e8c8b306c0a7065a1d72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4165569eed50e8c8b306c0a7065a1d72");
            return;
        }
        com.sankuai.waimai.machpro.util.a.a(getClass().getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fb2a3091a6b812329e87ebb6c62be16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fb2a3091a6b812329e87ebb6c62be16");
            return;
        }
        measureChild(this.n, i, i2);
        int measuredWidth = this.n.getMeasuredWidth();
        int measuredHeight = this.n.getMeasuredHeight();
        int measuredState = this.n.getMeasuredState();
        setMeasuredDimension(resolveSizeAndState(Math.max(measuredWidth + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, measuredState), resolveSizeAndState(Math.max(measuredHeight + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07cacc871358f73808ce8f85c89d1969", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07cacc871358f73808ce8f85c89d1969");
            return;
        }
        int measuredWidth = this.n.getMeasuredWidth();
        int measuredHeight = this.n.getMeasuredHeight();
        this.h.left = getPaddingLeft();
        this.h.right = (i3 - i) - getPaddingRight();
        this.h.top = getPaddingTop();
        this.h.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.h, this.i);
        this.n.layout(this.i.left, this.i.top, this.i.right, this.i.bottom);
        if (this.d) {
            a();
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f58035b5886b6bb61063d5b5435e7c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f58035b5886b6bb61063d5b5435e7c7");
        } else if (this.o == null) {
            throw new IllegalStateException("Design assumption violated.");
        } else {
            View a2 = this.o.a(this.l);
            if (a2 == null) {
                return;
            }
            int position = this.l.getPosition(a2);
            if (position != this.c && getScrollState() == 0) {
                this.p.a(position);
            }
            this.d = false;
        }
    }

    public final int getPageSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc7afbbbdff9a86e4dca37033bf8655d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc7afbbbdff9a86e4dca37033bf8655d")).intValue();
        }
        MPSwiperRecyclerView mPSwiperRecyclerView = this.n;
        if (getOrientation() == 0) {
            return (mPSwiperRecyclerView.getWidth() - mPSwiperRecyclerView.getPaddingLeft()) - mPSwiperRecyclerView.getPaddingRight();
        }
        return (mPSwiperRecyclerView.getHeight() - mPSwiperRecyclerView.getPaddingTop()) - mPSwiperRecyclerView.getPaddingBottom();
    }

    public final void setOrientation(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9938fffc3bff53b30b6ed966dddd03c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9938fffc3bff53b30b6ed966dddd03c");
        } else {
            this.l.setOrientation(i);
        }
    }

    public final int getOrientation() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "432c9240168241b3bdcf912ef6a60a9e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "432c9240168241b3bdcf912ef6a60a9e")).intValue() : this.l.getOrientation();
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f21f2bd157ff581f9de687612aec1d2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f21f2bd157ff581f9de687612aec1d2")).booleanValue() : this.l.getLayoutDirection() == 1;
    }

    public final void setCurrentItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df838b0678133e392b8f3aec58d20f51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df838b0678133e392b8f3aec58d20f51");
        } else {
            a(i, true);
        }
    }

    public final void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9501fd7f8b9e68ca17c20d7dc3562ffe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9501fd7f8b9e68ca17c20d7dc3562ffe");
        } else {
            b(i, z);
        }
    }

    private void b(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1490745222b4cedc7e50a3d971f85b3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1490745222b4cedc7e50a3d971f85b3e");
            return;
        }
        RecyclerView.a adapter = getAdapter();
        if (adapter == null) {
            if (this.m != -1) {
                this.m = Math.max(i, 0);
            }
        } else if (adapter.getItemCount() <= 0) {
        } else {
            int min = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
            if (min == this.c && this.e.a()) {
                return;
            }
            if (min == this.c && z) {
                return;
            }
            double d2 = this.c;
            this.c = min;
            if (!this.e.a()) {
                d2 = this.e.b();
            }
            this.e.a(min, z);
            if (!z) {
                this.n.scrollToPosition(min);
                if (this.v) {
                    com.sankuai.waimai.machpro.util.b.b().post(new Runnable() { // from class: com.sankuai.waimai.machpro.component.swiper_v2.MPViewPager.5
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab9fd042ef690ac82dc78ece14164ad5", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab9fd042ef690ac82dc78ece14164ad5");
                            } else if (MPViewPager.this.getAlignmentType() == 1) {
                                if (MPViewPager.this.l.getOrientation() == 0) {
                                    MPViewPager.this.n.scrollBy(MPViewPager.this.g, 0);
                                } else {
                                    MPViewPager.this.n.scrollBy(0, MPViewPager.this.g);
                                }
                            } else if (MPViewPager.this.l.getOrientation() == 0) {
                                MPViewPager.this.n.smoothScrollBy(1, 0);
                            } else {
                                MPViewPager.this.n.smoothScrollBy(0, 1);
                            }
                        }
                    });
                    return;
                }
                return;
            }
            double d3 = min;
            if (Math.abs(d3 - d2) > 3.0d) {
                this.n.scrollToPosition(d3 > d2 ? min - 3 : min + 3);
                this.n.post(new f(min, this.n));
                return;
            }
            this.n.smoothScrollToPosition(min);
        }
    }

    public final int getCurrentItem() {
        return this.c;
    }

    public final int getScrollState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "226aba9eaacae1fbfa1515980927ba3b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "226aba9eaacae1fbfa1515980927ba3b")).intValue() : this.e.c;
    }

    public final void setUserInputEnabled(boolean z) {
        this.f = z;
    }

    public final void setOffscreenPageLimit(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb3b58c8d6366de7780764fc73996ca1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb3b58c8d6366de7780764fc73996ca1");
        } else if (i <= 0 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        } else {
            this.t = i;
            this.n.requestLayout();
        }
    }

    public final int getOffscreenPageLimit() {
        return this.t;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd766491af49db1c1baa47fbcba2d348", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd766491af49db1c1baa47fbcba2d348")).booleanValue() : this.n.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8e283f37cbec6873404b5f3864f81f1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8e283f37cbec6873404b5f3864f81f1")).booleanValue() : this.n.canScrollVertically(i);
    }

    public final void setPageTransformer(@Nullable d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9d44270b13a2f3901da0822b0f8256a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9d44270b13a2f3901da0822b0f8256a");
            return;
        }
        if (dVar != null) {
            if (!this.s) {
                this.r = this.n.getItemAnimator();
                this.s = true;
            }
            this.n.setItemAnimator(null);
        } else if (this.s) {
            this.n.setItemAnimator(this.r);
            this.r = null;
            this.s = false;
        }
        if (dVar == this.q.b) {
            return;
        }
        this.q.b = dVar;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b68065802c078b8fd53e3e1f76483215", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b68065802c078b8fd53e3e1f76483215");
        } else if (this.q.b != null) {
            double b2 = this.e.b();
            int i = (int) b2;
            float f2 = (float) (b2 - i);
            this.q.a(i, f2, Math.round(getPageSize() * f2));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class e extends MPSwiperRecyclerView {
        public static ChangeQuickRedirect b;

        public e(@NonNull Context context, MPViewPager mPViewPager) {
            super(context, mPViewPager);
            Object[] objArr = {MPViewPager.this, context, mPViewPager};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab35010d99dfc2e246ea9113badc08a4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab35010d99dfc2e246ea9113badc08a4");
            }
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            Object[] objArr = {accessibilityEvent};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d77b1be69e7da2f0c00d2646883927e1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d77b1be69e7da2f0c00d2646883927e1");
                return;
            }
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(MPViewPager.this.c);
            accessibilityEvent.setToIndex(MPViewPager.this.c);
        }

        @Override // com.sankuai.waimai.machpro.component.swiper.MPSwiperRecyclerView, android.support.v7.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            Object[] objArr = {motionEvent};
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d0756750b191676eca1af1c963a396b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d0756750b191676eca1af1c963a396b")).booleanValue() : MPViewPager.this.f && super.onTouchEvent(motionEvent);
        }

        @Override // com.sankuai.waimai.machpro.component.swiper.MPSwiperRecyclerView, android.support.v7.widget.RecyclerView, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            Object[] objArr = {motionEvent};
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bba7da4291ba2922c05299d3271278f4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bba7da4291ba2922c05299d3271278f4")).booleanValue() : MPViewPager.this.f && super.onInterceptTouchEvent(motionEvent);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class b extends LinearLayoutManager {
        public static ChangeQuickRedirect a;

        @Override // android.support.v7.widget.RecyclerView.LayoutManager
        public final boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z, boolean z2) {
            return false;
        }

        public b(Context context) {
            super(context);
            Object[] objArr = {MPViewPager.this, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42d5cb03c6820d00d9cb940c466f80e5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42d5cb03c6820d00d9cb940c466f80e5");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class f implements Runnable {
        public static ChangeQuickRedirect a;
        private final int b;
        private final RecyclerView c;

        public f(int i, RecyclerView recyclerView) {
            Object[] objArr = {Integer.valueOf(i), recyclerView};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a477923bb4d3fa3d96ef86bd5e7a1b2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a477923bb4d3fa3d96ef86bd5e7a1b2");
                return;
            }
            this.b = i;
            this.c = recyclerView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ac83e161f77b683bab2c5064e41953d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ac83e161f77b683bab2c5064e41953d");
            } else {
                this.c.smoothScrollToPosition(this.b);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static abstract class a extends RecyclerView.c {
        public static ChangeQuickRedirect c;

        @Override // android.support.v7.widget.RecyclerView.c
        public abstract void onChanged();

        public a() {
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeChanged(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b61534e92117127d60f116623d969211", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b61534e92117127d60f116623d969211");
            } else {
                onChanged();
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), obj};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4ced6e14485bbca0c35d36990a50db9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4ced6e14485bbca0c35d36990a50db9");
            } else {
                onChanged();
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeInserted(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4207527932792d29de7f2f336c9f1b1d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4207527932792d29de7f2f336c9f1b1d");
            } else {
                onChanged();
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeRemoved(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d801efa95bc23870dea3d7c20ec4134", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d801efa95bc23870dea3d7c20ec4134");
            } else {
                onChanged();
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeMoved(int i, int i2, int i3) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43c9a9d2be91aae29b61b0f1e62b12e0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43c9a9d2be91aae29b61b0f1e62b12e0");
            } else {
                onChanged();
            }
        }
    }
}
