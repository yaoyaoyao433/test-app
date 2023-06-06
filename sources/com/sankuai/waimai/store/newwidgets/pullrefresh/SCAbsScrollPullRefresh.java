package com.sankuai.waimai.store.newwidgets.pullrefresh;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class SCAbsScrollPullRefresh extends ViewGroup {
    public static ChangeQuickRedirect b;
    private FrameLayout a;
    protected final b c;
    protected final a d;
    boolean e;
    boolean f;
    private View g;
    private FrameLayout h;
    private View i;
    private int j;
    private boolean k;
    private int l;

    private View c(Context context, ViewGroup viewGroup) {
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c338aadcf29f07c36b6cfcdd4daacb6a", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c338aadcf29f07c36b6cfcdd4daacb6a");
        }
        return null;
    }

    public SCAbsScrollPullRefresh(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12a2968672e5ec6f59b40e50622abe22", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12a2968672e5ec6f59b40e50622abe22");
            return;
        }
        this.c = new b();
        this.d = new a();
        this.j = 0;
        this.k = true;
        this.e = false;
        this.f = false;
        this.l = 0;
        a(context);
    }

    public SCAbsScrollPullRefresh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "666a6ad638c53812167a8c01064213c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "666a6ad638c53812167a8c01064213c1");
            return;
        }
        this.c = new b();
        this.d = new a();
        this.j = 0;
        this.k = true;
        this.e = false;
        this.f = false;
        this.l = 0;
        a(context);
    }

    public SCAbsScrollPullRefresh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c6eab4aa0f1ace9d753444921d0aeb8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c6eab4aa0f1ace9d753444921d0aeb8");
            return;
        }
        this.c = new b();
        this.d = new a();
        this.j = 0;
        this.k = true;
        this.e = false;
        this.f = false;
        this.l = 0;
        a(context);
    }

    @TargetApi(21)
    public SCAbsScrollPullRefresh(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08dd5ff6b1b3993a1ef3d827432970e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08dd5ff6b1b3993a1ef3d827432970e6");
            return;
        }
        this.c = new b();
        this.d = new a();
        this.j = 0;
        this.k = true;
        this.e = false;
        this.f = false;
        this.l = 0;
        a(context);
    }

    public void setHeaderPullRefreshEnable(boolean z) {
        this.e = z;
    }

    public void setFooterPullRefreshEnable(boolean z) {
        this.f = z;
    }

    public void setScrollEnable(boolean z) {
        this.k = z;
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "209cd2a28c558d05766d9feb1c09bad1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "209cd2a28c558d05766d9feb1c09bad1");
            return;
        }
        this.a = new FrameLayout(context);
        addView(this.a, 0, new ViewGroup.LayoutParams(-1, -2));
        this.h = new FrameLayout(context);
        addView(this.h, -1, new ViewGroup.LayoutParams(-1, -2));
        setHeaderView(b(context, this));
        setFooterView(c(context, this));
        this.c.a(0);
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89be5a20689ab69004da8a7d342a0900", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89be5a20689ab69004da8a7d342a0900");
            return;
        }
        this.c.e();
        this.d.e();
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "417a27215717059849edcbe5ce133b3c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "417a27215717059849edcbe5ce133b3c")).booleanValue() : this.c.e.c() == 3;
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cca7b010512dded39bed3b9f4cb23b2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cca7b010512dded39bed3b9f4cb23b2e");
            return;
        }
        PullRefreshLogic pullRefreshLogic = this.c.e;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = PullRefreshLogic.a;
        if (PatchProxy.isSupport(objArr2, pullRefreshLogic, changeQuickRedirect2, false, "93faf63f9c8176c60b26f30c45b26346", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, pullRefreshLogic, changeQuickRedirect2, false, "93faf63f9c8176c60b26f30c45b26346");
        } else if (pullRefreshLogic.f == null || pullRefreshLogic.c == null) {
        } else {
            pullRefreshLogic.f.a(pullRefreshLogic.c, 3);
        }
    }

    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7ad585a372e3219e20fd2c26f3f6b94", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7ad585a372e3219e20fd2c26f3f6b94")).booleanValue() : this.d.e.c() == 3;
    }

    public final void a(com.sankuai.waimai.store.newwidgets.pullrefresh.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5df524416b5f343e6420bab389f3316", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5df524416b5f343e6420bab389f3316");
        } else {
            this.c.e.a(aVar);
        }
    }

    public final void b(com.sankuai.waimai.store.newwidgets.pullrefresh.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ddf76d6db501321e3482cc72fa3449e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ddf76d6db501321e3482cc72fa3449e");
        } else {
            this.d.e.a(aVar);
        }
    }

    public void setHeaderView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "642531fe1edc57e44421c33cbff6a5cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "642531fe1edc57e44421c33cbff6a5cf");
        } else if (this.g != view) {
            if (this.g != null) {
                if (this.g instanceof com.sankuai.waimai.store.newwidgets.pullrefresh.a) {
                    this.c.e.b((com.sankuai.waimai.store.newwidgets.pullrefresh.a) this.g);
                }
                this.a.removeView(this.g);
            }
            if (view != null) {
                if (view instanceof com.sankuai.waimai.store.newwidgets.pullrefresh.a) {
                    this.c.e.a((com.sankuai.waimai.store.newwidgets.pullrefresh.a) view);
                }
                a(view, 80);
                this.c.d = view.getMeasuredHeight();
                this.a.addView(view);
            }
            setHeaderPullRefreshEnable(view != null);
            this.g = view;
            this.c.a(0);
        }
    }

    public void setFooterView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0c63c5889f17379a47f87200d888ba9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0c63c5889f17379a47f87200d888ba9");
        } else if (this.i != view) {
            if (this.i != null) {
                if (this.i instanceof com.sankuai.waimai.store.newwidgets.pullrefresh.a) {
                    this.d.e.b((com.sankuai.waimai.store.newwidgets.pullrefresh.a) this.i);
                }
                this.h.removeView(this.i);
            }
            if (view != null) {
                if (view instanceof com.sankuai.waimai.store.newwidgets.pullrefresh.a) {
                    this.d.e.a((com.sankuai.waimai.store.newwidgets.pullrefresh.a) view);
                }
                a(view, 48);
                this.d.d = view.getMeasuredHeight();
                this.h.addView(view);
            }
            setFooterPullRefreshEnable(view != null);
            this.i = view;
            this.d.a(0);
        }
    }

    private View a(Context context, ViewGroup viewGroup) {
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a24eb584033ef1bc245f0d05b4ee7130", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a24eb584033ef1bc245f0d05b4ee7130");
        }
        DefaultHeaderService defaultHeaderService = (DefaultHeaderService) com.sankuai.waimai.router.a.a(DefaultHeaderService.class, DefaultHeaderService.KEY_STORE);
        if (defaultHeaderService == null) {
            defaultHeaderService = (DefaultHeaderService) com.sankuai.waimai.router.a.a(DefaultHeaderService.class, DefaultHeaderService.KEY_DRUG);
        }
        if (defaultHeaderService == null) {
            return new com.sankuai.waimai.platform.widget.pullrefresh.DefaultPullRefreshHeader(context);
        }
        try {
            return defaultHeaderService.createDefaultHeader(context);
        } catch (Exception unused) {
            return new com.sankuai.waimai.platform.widget.pullrefresh.DefaultPullRefreshHeader(context);
        }
    }

    public void setPullTarget(int i) {
        this.j = i;
    }

    public int getPullTarget() {
        return this.j;
    }

    public final boolean e() {
        return this.j == 1;
    }

    public final boolean f() {
        return this.j == 2;
    }

    private void a(View view, int i) {
        FrameLayout.LayoutParams layoutParams;
        int makeMeasureSpec;
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c218e855095340c93879c5061f2e288d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c218e855095340c93879c5061f2e288d");
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        } else if (!(layoutParams2 instanceof FrameLayout.LayoutParams)) {
            layoutParams = new FrameLayout.LayoutParams(layoutParams2);
        } else {
            layoutParams = (FrameLayout.LayoutParams) layoutParams2;
        }
        layoutParams.gravity = i | 1;
        view.setLayoutParams(layoutParams);
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i2 = layoutParams.height;
        if (i2 > 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(childMeasureSpec, makeMeasureSpec);
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        layoutParams3.height = view.getMeasuredHeight();
        view.setLayoutParams(layoutParams3);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ad278d709c9d1c6c36f35dd59418116", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ad278d709c9d1c6c36f35dd59418116");
        } else {
            super.onFinishInflate();
        }
    }

    private View b(Context context, ViewGroup viewGroup) {
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8d69f8135aba5a2a1cecac738b9a593", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8d69f8135aba5a2a1cecac738b9a593") : a(context, viewGroup);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8a767abc2a245745489eb02f881d6d6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8a767abc2a245745489eb02f881d6d6")).booleanValue();
        }
        try {
            if (this.k) {
                if (super.dispatchTouchEvent(motionEvent)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return false;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78857cbf36237beac5976630235d6e9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78857cbf36237beac5976630235d6e9c");
            return;
        }
        setMeasuredDimension(getDefaultSize(getSuggestedMinimumWidth(), i), getDefaultSize(getSuggestedMinimumHeight(), i2));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(this.c.d * 3, 1073741824);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(this.d.d * 3, 1073741824);
        this.a.measure(makeMeasureSpec, makeMeasureSpec3);
        this.h.measure(makeMeasureSpec, makeMeasureSpec4);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null && childAt != this.a && childAt != this.h) {
                childAt.measure(makeMeasureSpec, makeMeasureSpec2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f219651397b6c7405660f07cfd3a27e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f219651397b6c7405660f07cfd3a27e7");
            return;
        }
        int measuredHeight = this.a.getMeasuredHeight();
        b(this.a, 0);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt != null && childAt != this.a && childAt != this.h) {
                a(childAt, measuredHeight, childAt.getMeasuredHeight());
            }
        }
        b(this.h, (measuredHeight + getMeasuredHeight()) - this.l);
    }

    public void setFooterMarginBottom(int i) {
        this.l = i;
    }

    private static void b(@NonNull View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "55895eb5c5bfc30a46b468422ff04afd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "55895eb5c5bfc30a46b468422ff04afd");
        } else {
            a(view, i, view.getMeasuredHeight());
        }
    }

    private static void a(@NonNull View view, int i, int i2) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ac0c2b5ff1afdc7fa73f9619f2103b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ac0c2b5ff1afdc7fa73f9619f2103b1");
        } else {
            view.layout(0, i, view.getMeasuredWidth(), i2 + i);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public abstract class c implements com.sankuai.waimai.store.newwidgets.pullrefresh.b {
        public static ChangeQuickRedirect c;
        int d;
        final PullRefreshLogic e;

        public c() {
            Object[] objArr = {SCAbsScrollPullRefresh.this};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8b11ccf657cf1d2bc207be509da67d3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8b11ccf657cf1d2bc207be509da67d3");
                return;
            }
            this.d = 0;
            this.e = new PullRefreshLogic(SCAbsScrollPullRefresh.this.getContext(), this);
        }

        public final void d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9461c7e70327b0fbba66e0aeabf5e00b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9461c7e70327b0fbba66e0aeabf5e00b");
            } else {
                this.e.b();
            }
        }

        public final int b(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74a35b3c2f64abfdd6213374b1e631ef", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74a35b3c2f64abfdd6213374b1e631ef")).intValue();
            }
            PullRefreshLogic pullRefreshLogic = this.e;
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = PullRefreshLogic.a;
            if (PatchProxy.isSupport(objArr2, pullRefreshLogic, changeQuickRedirect2, false, "197e7fb9f4ed8887ea51e6eae2e573cd", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr2, pullRefreshLogic, changeQuickRedirect2, false, "197e7fb9f4ed8887ea51e6eae2e573cd")).intValue();
            }
            switch (pullRefreshLogic.c()) {
                case 0:
                case 1:
                case 2:
                    int c2 = pullRefreshLogic.c.c();
                    return pullRefreshLogic.b(pullRefreshLogic.d.a(pullRefreshLogic.c, pullRefreshLogic.d.b(pullRefreshLogic.c, c2) + i) - c2);
                default:
                    return 0;
            }
        }

        public final int c(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = c;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5773ce8320f78cbc9bc382bb9f3fba3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5773ce8320f78cbc9bc382bb9f3fba3")).intValue() : this.e.a(i);
        }

        public final void e() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d1da4bcc99049b92895c299d3283bd8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d1da4bcc99049b92895c299d3283bd8");
            } else {
                this.e.a();
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.pullrefresh.b
        public final void a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0f32db7b75c1c8e436b9fd8f9eed3e4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0f32db7b75c1c8e436b9fd8f9eed3e4");
            } else {
                SCAbsScrollPullRefresh.this.setScrollEnable(z);
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.pullrefresh.b
        public final int a() {
            return this.d;
        }

        @Override // com.sankuai.waimai.store.newwidgets.pullrefresh.b
        public final int b() {
            return this.d * 3;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class b extends c {
        public static ChangeQuickRedirect a;

        public b() {
            super();
            Object[] objArr = {SCAbsScrollPullRefresh.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e7c5618f9d00c11f1a654606cccaa12", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e7c5618f9d00c11f1a654606cccaa12");
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.pullrefresh.b
        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa2714c7b0bd3f221f0b15dbdd347272", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa2714c7b0bd3f221f0b15dbdd347272");
            } else {
                SCAbsScrollPullRefresh.this.scrollTo(0, (this.d * 3) - i);
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.pullrefresh.b
        public final int c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ce2858673f823ec0c3b092f3ce56e16", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ce2858673f823ec0c3b092f3ce56e16")).intValue() : (this.d * 3) - SCAbsScrollPullRefresh.this.getScrollY();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends c {
        public static ChangeQuickRedirect a;

        public a() {
            super();
            Object[] objArr = {SCAbsScrollPullRefresh.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2885b9768f8c5cd511611b0cb5af6c8f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2885b9768f8c5cd511611b0cb5af6c8f");
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.pullrefresh.b
        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d2bba70ec97cfa1cd7651d01b3a6007", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d2bba70ec97cfa1cd7651d01b3a6007");
            } else {
                SCAbsScrollPullRefresh.this.c.a(-i);
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.pullrefresh.b
        public final int c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54658b438dc9c6e39ed6db72c3e78dcd", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54658b438dc9c6e39ed6db72c3e78dcd")).intValue() : -SCAbsScrollPullRefresh.this.c.c();
        }
    }
}
