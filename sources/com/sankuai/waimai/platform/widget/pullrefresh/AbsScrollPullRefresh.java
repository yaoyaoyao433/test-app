package com.sankuai.waimai.platform.widget.pullrefresh;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.android.cube.components.pull2refresh.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.modular.wrapper.pull2refresh.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class AbsScrollPullRefresh extends ViewGroup implements com.meituan.android.cube.components.pull2refresh.a, com.sankuai.waimai.modular.wrapper.pull2refresh.a {
    private static d a;
    private static d b;
    public static ChangeQuickRedirect c;
    protected final b d;
    protected final a e;
    protected boolean f;
    protected boolean g;
    private FrameLayout h;
    private View i;
    private FrameLayout j;
    private View k;
    private int l;
    private boolean m;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface d {
        View a(Context context, ViewGroup viewGroup);
    }

    public View getView() {
        return this;
    }

    public static void setDefaultHeaderCreator(d dVar) {
        a = dVar;
    }

    public static void setDefaultFooterCreator(d dVar) {
        b = dVar;
    }

    public AbsScrollPullRefresh(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8058b0584494192a38ac34d964dde6b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8058b0584494192a38ac34d964dde6b8");
            return;
        }
        this.d = new b();
        this.e = new a();
        this.l = 0;
        this.m = true;
        this.f = false;
        this.g = false;
        a(context);
    }

    public AbsScrollPullRefresh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "749a4c75715fc21dcd2b2f044e6dfb14", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "749a4c75715fc21dcd2b2f044e6dfb14");
            return;
        }
        this.d = new b();
        this.e = new a();
        this.l = 0;
        this.m = true;
        this.f = false;
        this.g = false;
        a(context);
    }

    public AbsScrollPullRefresh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67e1bed714b630f7002f92c1c0e2139e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67e1bed714b630f7002f92c1c0e2139e");
            return;
        }
        this.d = new b();
        this.e = new a();
        this.l = 0;
        this.m = true;
        this.f = false;
        this.g = false;
        a(context);
    }

    @TargetApi(21)
    public AbsScrollPullRefresh(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb68a0883c93b50b3f208392d72face5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb68a0883c93b50b3f208392d72face5");
            return;
        }
        this.d = new b();
        this.e = new a();
        this.l = 0;
        this.m = true;
        this.f = false;
        this.g = false;
        a(context);
    }

    @NonNull
    public com.sankuai.waimai.platform.widget.pullrefresh.b getHeaderHelper() {
        return this.d;
    }

    @NonNull
    public com.sankuai.waimai.platform.widget.pullrefresh.b getFooterHelper() {
        return this.e;
    }

    @Deprecated
    public void setPullRefreshEnable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9890e9a743295d8832679a1a961c331f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9890e9a743295d8832679a1a961c331f");
        } else {
            setHeaderPullRefreshEnable(z);
        }
    }

    public void setHeaderPullRefreshEnable(boolean z) {
        this.f = z;
    }

    public void setFooterPullRefreshEnable(boolean z) {
        this.g = z;
    }

    public void setScrollEnable(boolean z) {
        this.m = z;
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4675818b47f9536fee51bee2ac6c41cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4675818b47f9536fee51bee2ac6c41cd");
            return;
        }
        this.h = new FrameLayout(context);
        addView(this.h, 0, new ViewGroup.LayoutParams(-1, -2));
        this.j = new FrameLayout(context);
        addView(this.j, -1, new ViewGroup.LayoutParams(-1, -2));
        setHeaderView(b(context, this));
        setFooterView(c(context, this));
        this.d.a(0);
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b782bd5a87ab7c523d39005bf7cfdefb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b782bd5a87ab7c523d39005bf7cfdefb");
            return;
        }
        this.d.e();
        this.e.e();
    }

    public final void a(com.sankuai.waimai.platform.widget.pullrefresh.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32f996bc53b90c0721bb7e7bedfa6721", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32f996bc53b90c0721bb7e7bedfa6721");
        } else {
            this.d.e.a(aVar);
        }
    }

    public void setHeaderView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "caee4940730fb5e38699e5e350310952", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "caee4940730fb5e38699e5e350310952");
        } else if (this.i != view) {
            if (this.i != null) {
                if (this.i instanceof com.sankuai.waimai.platform.widget.pullrefresh.a) {
                    this.d.e.b((com.sankuai.waimai.platform.widget.pullrefresh.a) this.i);
                }
                this.h.removeView(this.i);
            }
            if (view != null) {
                if (view instanceof com.sankuai.waimai.platform.widget.pullrefresh.a) {
                    this.d.e.a((com.sankuai.waimai.platform.widget.pullrefresh.a) view);
                }
                a(view, 80);
                this.d.d = view.getMeasuredHeight();
                this.h.addView(view);
            }
            setHeaderPullRefreshEnable(view != null);
            this.i = view;
            this.d.a(0);
        }
    }

    public void setFooterView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f62b0f408a2c88413bf37174cc104bf2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f62b0f408a2c88413bf37174cc104bf2");
        } else if (this.k != view) {
            if (this.k != null) {
                if (this.k instanceof com.sankuai.waimai.platform.widget.pullrefresh.a) {
                    this.e.e.b((com.sankuai.waimai.platform.widget.pullrefresh.a) this.k);
                }
                this.j.removeView(this.k);
            }
            if (view != null) {
                if (view instanceof com.sankuai.waimai.platform.widget.pullrefresh.a) {
                    this.e.e.a((com.sankuai.waimai.platform.widget.pullrefresh.a) view);
                }
                a(view, 48);
                this.e.d = view.getMeasuredHeight();
                this.j.addView(view);
            }
            setFooterPullRefreshEnable(view != null);
            this.k = view;
            this.e.a(0);
        }
    }

    public View a(Context context, ViewGroup viewGroup) {
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0e1177ef95c93d4bb458c7de5b74ad3", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0e1177ef95c93d4bb458c7de5b74ad3") : new DefaultPullRefreshHeader(context);
    }

    public void setPullTarget(int i) {
        this.l = i;
    }

    public int getPullTarget() {
        return this.l;
    }

    public final boolean b() {
        return this.l == 1;
    }

    public final boolean c() {
        return this.l == 2;
    }

    private void a(View view, int i) {
        FrameLayout.LayoutParams layoutParams;
        int makeMeasureSpec;
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b75326678647b014588575646654c83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b75326678647b014588575646654c83");
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
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cd2631f0d267db987a5521b2a23c857", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cd2631f0d267db987a5521b2a23c857");
        } else {
            super.onFinishInflate();
        }
    }

    private View b(Context context, ViewGroup viewGroup) {
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "188e9d135acd3ace2a97ea00e10c95db", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "188e9d135acd3ace2a97ea00e10c95db");
        }
        View a2 = a(context, viewGroup);
        return (a2 != null || a == null) ? a2 : a.a(context, viewGroup);
    }

    private View c(Context context, ViewGroup viewGroup) {
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3337fa6345c52f2a1278580ea44aa64b", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3337fa6345c52f2a1278580ea44aa64b");
        }
        if (b != null) {
            return b.a(context, viewGroup);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6971d6e427ca4c548984e5b95c07c488", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6971d6e427ca4c548984e5b95c07c488")).booleanValue();
        }
        try {
            if (this.m) {
                if (super.dispatchTouchEvent(motionEvent)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b(e);
            return false;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9595b341f86a08e6bbc14a6b97558ea3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9595b341f86a08e6bbc14a6b97558ea3");
            return;
        }
        setMeasuredDimension(getDefaultSize(getSuggestedMinimumWidth(), i), getDefaultSize(getSuggestedMinimumHeight(), i2));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(this.d.d * 3, 1073741824);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(this.e.d * 3, 1073741824);
        this.h.measure(makeMeasureSpec, makeMeasureSpec3);
        this.j.measure(makeMeasureSpec, makeMeasureSpec4);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null && childAt != this.h && childAt != this.j) {
                childAt.measure(makeMeasureSpec, makeMeasureSpec2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c58522582d541f03795bda7adcd706c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c58522582d541f03795bda7adcd706c");
            return;
        }
        int measuredHeight = this.h.getMeasuredHeight();
        b(this.h, 0);
        b(this.j, getMeasuredHeight() + measuredHeight);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt != null && childAt != this.h && childAt != this.j) {
                b(childAt, measuredHeight);
            }
        }
    }

    private static void b(@NonNull View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3ce2a756a2e5ab03f5dbf76f7509b038", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3ce2a756a2e5ab03f5dbf76f7509b038");
        } else {
            a(view, i, view.getMeasuredHeight());
        }
    }

    private static void a(@NonNull View view, int i, int i2) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a0b376718d9909f145db3ce3d7f4a1cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a0b376718d9909f145db3ce3d7f4a1cd");
        } else {
            view.layout(0, i, view.getMeasuredWidth(), i2 + i);
        }
    }

    public void setRefreshListener(final a.InterfaceC1030a interfaceC1030a) {
        Object[] objArr = {interfaceC1030a};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee80e50ecb4eda662da15cae67d582fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee80e50ecb4eda662da15cae67d582fb");
        } else {
            a(new com.sankuai.waimai.platform.widget.pullrefresh.c() { // from class: com.sankuai.waimai.platform.widget.pullrefresh.AbsScrollPullRefresh.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.pullrefresh.c
                public final void a(com.sankuai.waimai.platform.widget.pullrefresh.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "426a0bddc2ee7fab1acbb40fd4b3badb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "426a0bddc2ee7fab1acbb40fd4b3badb");
                    } else if (interfaceC1030a != null) {
                        interfaceC1030a.a();
                    }
                }
            });
        }
    }

    public void setRefreshListener(final a.InterfaceC0234a interfaceC0234a) {
        Object[] objArr = {interfaceC0234a};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90d0b8a1ca1c1eb371261b72984ea301", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90d0b8a1ca1c1eb371261b72984ea301");
        } else {
            a(new com.sankuai.waimai.platform.widget.pullrefresh.c() { // from class: com.sankuai.waimai.platform.widget.pullrefresh.AbsScrollPullRefresh.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.pullrefresh.c
                public final void a(com.sankuai.waimai.platform.widget.pullrefresh.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f4b753e10e64db09375712e5dcbe13e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f4b753e10e64db09375712e5dcbe13e");
                    }
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public abstract class c implements com.sankuai.waimai.platform.widget.pullrefresh.b {
        public static ChangeQuickRedirect c;
        int d;
        final PullRefreshLogic e;

        public c() {
            Object[] objArr = {AbsScrollPullRefresh.this};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc333966f766bf7a92c308e0b4f67acd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc333966f766bf7a92c308e0b4f67acd");
                return;
            }
            this.d = 0;
            this.e = new PullRefreshLogic(AbsScrollPullRefresh.this.getContext(), this);
        }

        public final void d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dc8b7a1cda51622d87eb905c9b14774", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dc8b7a1cda51622d87eb905c9b14774");
            } else {
                this.e.b();
            }
        }

        public final int b(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b671fca1f25ac104aa6b41083ea9a30", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b671fca1f25ac104aa6b41083ea9a30")).intValue();
            }
            PullRefreshLogic pullRefreshLogic = this.e;
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = PullRefreshLogic.a;
            if (PatchProxy.isSupport(objArr2, pullRefreshLogic, changeQuickRedirect2, false, "fcf430a5ff01ad458384834cb7acf2de", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr2, pullRefreshLogic, changeQuickRedirect2, false, "fcf430a5ff01ad458384834cb7acf2de")).intValue();
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
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10b4783ec9674da432f06fcd3e4876fc", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10b4783ec9674da432f06fcd3e4876fc")).intValue() : this.e.a(i);
        }

        public final void e() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0593f87722c913a026bef190a080bcf9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0593f87722c913a026bef190a080bcf9");
            } else {
                this.e.a();
            }
        }

        @Override // com.sankuai.waimai.platform.widget.pullrefresh.b
        public final void a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7593a13297f70c2a28608581c66eba46", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7593a13297f70c2a28608581c66eba46");
            } else {
                AbsScrollPullRefresh.this.setScrollEnable(z);
            }
        }

        @Override // com.sankuai.waimai.platform.widget.pullrefresh.b
        public final int a() {
            return this.d;
        }

        @Override // com.sankuai.waimai.platform.widget.pullrefresh.b
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
            Object[] objArr = {AbsScrollPullRefresh.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3859543dd52a7f6cd7a8c677aed53acc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3859543dd52a7f6cd7a8c677aed53acc");
            }
        }

        @Override // com.sankuai.waimai.platform.widget.pullrefresh.b
        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd1bff7aa1aed6256d6e6dc2d930a854", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd1bff7aa1aed6256d6e6dc2d930a854");
            } else {
                AbsScrollPullRefresh.this.scrollTo(0, (this.d * 3) - i);
            }
        }

        @Override // com.sankuai.waimai.platform.widget.pullrefresh.b
        public final int c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36e2301cc2db6d84d5f7c63afc2a8e7e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36e2301cc2db6d84d5f7c63afc2a8e7e")).intValue() : (this.d * 3) - AbsScrollPullRefresh.this.getScrollY();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends c {
        public static ChangeQuickRedirect a;

        public a() {
            super();
            Object[] objArr = {AbsScrollPullRefresh.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec5c4b9ffea6963f7706de4cf25aea38", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec5c4b9ffea6963f7706de4cf25aea38");
            }
        }

        @Override // com.sankuai.waimai.platform.widget.pullrefresh.b
        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79a2208c38e0f9b6bdf16612582c7737", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79a2208c38e0f9b6bdf16612582c7737");
            } else {
                AbsScrollPullRefresh.this.d.a(-i);
            }
        }

        @Override // com.sankuai.waimai.platform.widget.pullrefresh.b
        public final int c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33019c07c9af3fd3a1f37f6ee87b7811", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33019c07c9af3fd3a1f37f6ee87b7811")).intValue() : -AbsScrollPullRefresh.this.d.c();
        }
    }
}
