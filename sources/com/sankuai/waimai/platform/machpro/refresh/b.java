package com.sankuai.waimai.platform.machpro.refresh;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.platform.widget.pullrefresh.DefaultPullRefreshHeader;
import com.sankuai.waimai.platform.widget.pullrefresh.PullRefreshLogic;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.machpro.component.view.c {
    public static ChangeQuickRedirect a;
    protected final a b;
    private FrameLayout f;
    private View g;
    private int h;
    private boolean i;
    private boolean j;
    private int k;
    private RecyclerView l;
    private int m;

    public b(@NonNull Context context, d dVar) {
        super(context, dVar);
        Object[] objArr = {context, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88d6bebdd81058f93dade0eba9bed361", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88d6bebdd81058f93dade0eba9bed361");
            return;
        }
        this.b = new a();
        this.h = 0;
        this.i = true;
        this.j = false;
    }

    public final void setScrollEnable(boolean z) {
        this.i = z;
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "062e0b4652f0d8a69e78035b8b18e1d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "062e0b4652f0d8a69e78035b8b18e1d8");
        } else if (this.f != null) {
        } else {
            this.k = ViewConfiguration.get(getContext()).getScaledTouchSlop();
            this.f = new FrameLayout(getContext());
            Context context = getContext();
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            setHeaderView(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dfc6b02a375cdf7276a5d999ef86457a", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dfc6b02a375cdf7276a5d999ef86457a") : new DefaultPullRefreshHeader(context));
            this.f.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
            d a2 = d.a();
            a2.c(1.0f);
            a2.b(0.0f);
            a2.a(YogaDisplay.NONE);
            a2.h(0.0f);
            a(this.f, a2, (MPComponent) null, 0);
            this.b.a(0);
        }
    }

    public final void setRecyclerView(RecyclerView recyclerView) {
        this.l = recyclerView;
    }

    public final void setHeaderView(View view) {
        FrameLayout.LayoutParams layoutParams;
        int makeMeasureSpec;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fd4009ae5446906c922a2ab36fb930b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fd4009ae5446906c922a2ab36fb930b");
        } else if (this.g == view) {
        } else {
            if (this.g != null) {
                if (this.g instanceof com.sankuai.waimai.platform.widget.pullrefresh.a) {
                    this.b.c.b((com.sankuai.waimai.platform.widget.pullrefresh.a) this.g);
                }
                this.f.removeView(this.g);
            }
            if (view != null) {
                if (view instanceof com.sankuai.waimai.platform.widget.pullrefresh.a) {
                    this.b.c.a((com.sankuai.waimai.platform.widget.pullrefresh.a) view);
                }
                Object[] objArr2 = {view, 80};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "87dcc9026e8b5f7dce70bb2469379f0f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "87dcc9026e8b5f7dce70bb2469379f0f");
                } else {
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 == null) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    } else if (!(layoutParams2 instanceof FrameLayout.LayoutParams)) {
                        layoutParams = new FrameLayout.LayoutParams(layoutParams2);
                    } else {
                        layoutParams = (FrameLayout.LayoutParams) layoutParams2;
                    }
                    layoutParams.gravity = 81;
                    view.setLayoutParams(layoutParams);
                    int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
                    int i = layoutParams.height;
                    if (i > 0) {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
                    } else {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                    }
                    view.measure(childMeasureSpec, makeMeasureSpec);
                    ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                    layoutParams3.height = view.getMeasuredHeight();
                    view.setLayoutParams(layoutParams3);
                }
                this.b.b = view.getMeasuredHeight();
                this.f.addView(view);
            }
            setHeaderPullRefreshEnable(view != null);
            this.g = view;
            this.b.a(0);
        }
    }

    public final void setHeaderPullRefreshEnable(boolean z) {
        this.j = z;
    }

    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a502d6ace3a28a334e5b48bbdb4c908f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a502d6ace3a28a334e5b48bbdb4c908f")).booleanValue() : this.b != null && this.b.c.c() == 3;
    }

    public final void setRefreshListener(com.sankuai.waimai.platform.widget.pullrefresh.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c79b24ccba0636a952d13ad81d4e347", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c79b24ccba0636a952d13ad81d4e347");
        } else if (cVar != null) {
            this.b.c.a(cVar);
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e6a19d2d8b1362445353f8ef6d6237b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e6a19d2d8b1362445353f8ef6d6237b");
            return;
        }
        a aVar = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "ed010950f672e16b8a851c054c050067", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "ed010950f672e16b8a851c054c050067");
        } else {
            aVar.c.a();
        }
    }

    public final void setPullTarget(int i) {
        this.h = i;
    }

    private boolean f() {
        return this.h == 1;
    }

    @Override // com.sankuai.waimai.machpro.component.view.c, android.view.View
    public final void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "737756cfab6a1d890370d87eb63caa2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "737756cfab6a1d890370d87eb63caa2a");
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.sankuai.waimai.machpro.component.view.c, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = 0;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01514419b445029b69b95024bb9fec43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01514419b445029b69b95024bb9fec43");
            return;
        }
        if (this.f != null) {
            this.f.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.b.b * 3, 1073741824));
            this.f.layout(i, 0, i3, this.f.getMeasuredHeight());
            i5 = this.f.getMeasuredHeight();
            i6 = 1;
        } else {
            i5 = 0;
        }
        while (i6 < getChildCount()) {
            View childAt = getChildAt(i6);
            d a2 = this.d.a(i6);
            int round = Math.round(a2.q());
            int round2 = i5 + Math.round(a2.r());
            childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.round(a2.s()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(a2.t()), 1073741824));
            childAt.layout(i, round2, round + childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + round2);
            i5 = round2 + childAt.getMeasuredHeight();
            i6++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edc87078558fbd8968f5b666cf1f6871", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edc87078558fbd8968f5b666cf1f6871")).booleanValue();
        }
        try {
            if (this.i) {
                if (super.dispatchTouchEvent(motionEvent)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc4594db721789df838c732a742e6a1f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc4594db721789df838c732a742e6a1f")).booleanValue();
        }
        int rawY = (int) motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.m = rawY;
        } else if (action == 2) {
            int i = rawY - this.m;
            if (this.j && i >= this.k) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "340c4180a6ed70754ade97a33a7bfed3", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "340c4180a6ed70754ade97a33a7bfed3")).booleanValue();
                } else {
                    z = this.l.computeVerticalScrollOffset() == 0;
                }
                if (z) {
                    setPullTarget(1);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac7cb03e07d8b326c1ee4cb5f4250a85", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac7cb03e07d8b326c1ee4cb5f4250a85")).booleanValue();
        }
        int rawY = (int) motionEvent.getRawY();
        switch (motionEvent.getAction()) {
            case 1:
            case 3:
                if (f()) {
                    a aVar = this.b;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a.a;
                    if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "d8a00c8ecadbc4a7ff2995c4ff596c7c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "d8a00c8ecadbc4a7ff2995c4ff596c7c");
                    } else {
                        aVar.c.b();
                    }
                }
                setPullTarget(0);
                break;
            case 2:
                int i = rawY - this.m;
                if (f()) {
                    a aVar2 = this.b;
                    Object[] objArr3 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (!PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "c72df05aac07b6b7bf931b78ea8805f8", RobustBitConfig.DEFAULT_VALUE)) {
                        aVar2.c.a(i);
                        break;
                    } else {
                        ((Integer) PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "c72df05aac07b6b7bf931b78ea8805f8")).intValue();
                        break;
                    }
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a implements com.sankuai.waimai.platform.widget.pullrefresh.b {
        public static ChangeQuickRedirect a;
        int b;
        final PullRefreshLogic c;

        public a() {
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef2a975dd85da2f17a14e84b9721565a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef2a975dd85da2f17a14e84b9721565a");
                return;
            }
            this.b = 0;
            this.c = new PullRefreshLogic(b.this.getContext(), this);
        }

        @Override // com.sankuai.waimai.platform.widget.pullrefresh.b
        public final void a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fa50a4278c4f357e9dc6e3ceeaed101", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fa50a4278c4f357e9dc6e3ceeaed101");
            } else {
                b.this.setScrollEnable(z);
            }
        }

        @Override // com.sankuai.waimai.platform.widget.pullrefresh.b
        public final int a() {
            return this.b;
        }

        @Override // com.sankuai.waimai.platform.widget.pullrefresh.b
        public final int b() {
            return this.b * 3;
        }

        @Override // com.sankuai.waimai.platform.widget.pullrefresh.b
        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77cde6dd72f184cdbe9215461b6a1962", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77cde6dd72f184cdbe9215461b6a1962");
            } else {
                b.this.scrollTo(0, (this.b * 3) - i);
            }
        }

        @Override // com.sankuai.waimai.platform.widget.pullrefresh.b
        public final int c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a6d29f1f0b9fd60ac3a3ce1f98e77a9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a6d29f1f0b9fd60ac3a3ce1f98e77a9")).intValue() : (this.b * 3) - b.this.getScrollY();
        }
    }
}
