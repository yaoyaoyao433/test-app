package com.sankuai.waimai.reactnative.pullrefresh;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.react.views.view.f;
import com.meituan.android.cube.components.pull2refresh.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.modular.wrapper.pull2refresh.a;
import com.sankuai.waimai.platform.widget.pullrefresh.DefaultPullRefreshHeader;
import com.sankuai.waimai.platform.widget.pullrefresh.PullRefreshLogic;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a extends f implements com.meituan.android.cube.components.pull2refresh.a, com.sankuai.waimai.modular.wrapper.pull2refresh.a {
    private static c a;
    public static ChangeQuickRedirect c;
    private FrameLayout b;
    protected final C1122a d;
    protected boolean e;
    private View f;
    private int g;
    private boolean h;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c {
        View a(Context context, ViewGroup viewGroup);
    }

    public View getView() {
        return this;
    }

    public static void setDefaultHeaderCreator(c cVar) {
        a = cVar;
    }

    public a(Context context) {
        super(context);
        View a2;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bab98cbceaf0d96c10f9029342971910", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bab98cbceaf0d96c10f9029342971910");
            return;
        }
        this.d = new C1122a();
        this.g = 0;
        this.h = true;
        this.e = false;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a38e0b0198fa5a5b9c342d7386cbdf3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a38e0b0198fa5a5b9c342d7386cbdf3e");
            return;
        }
        this.b = new FrameLayout(context);
        addView(this.b, 0, new ViewGroup.LayoutParams(-1, -2));
        Object[] objArr3 = {context, this};
        ChangeQuickRedirect changeQuickRedirect3 = c;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7713e93c0a4d0a9002a26b7f759470d6", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (View) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7713e93c0a4d0a9002a26b7f759470d6");
        } else {
            Object[] objArr4 = {context, this};
            ChangeQuickRedirect changeQuickRedirect4 = c;
            View defaultPullRefreshHeader = PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d969e9ba8c8251c200e4afe9ea226fb4", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d969e9ba8c8251c200e4afe9ea226fb4") : new DefaultPullRefreshHeader(context);
            a2 = (defaultPullRefreshHeader != null || a == null) ? defaultPullRefreshHeader : a.a(context, this);
        }
        setHeaderView(a2);
        this.d.a(0);
    }

    @NonNull
    public com.sankuai.waimai.platform.widget.pullrefresh.b getHeaderHelper() {
        return this.d;
    }

    @Deprecated
    public void setPullRefreshEnable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "805a89fcbd3c1fe01b49adf589005417", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "805a89fcbd3c1fe01b49adf589005417");
        } else {
            setHeaderPullRefreshEnable(z);
        }
    }

    public void setHeaderPullRefreshEnable(boolean z) {
        this.e = z;
    }

    public void setScrollEnable(boolean z) {
        this.h = z;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc86a36ea7a250ebe82e8938252649cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc86a36ea7a250ebe82e8938252649cd");
            return;
        }
        C1122a c1122a = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b.c;
        if (PatchProxy.isSupport(objArr2, c1122a, changeQuickRedirect2, false, "6c94b49f5780f0fddb22e84733c264fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, c1122a, changeQuickRedirect2, false, "6c94b49f5780f0fddb22e84733c264fa");
        } else {
            c1122a.e.a();
        }
    }

    private void a(com.sankuai.waimai.platform.widget.pullrefresh.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee8333369d0dfa7688ddf682fdbaf8b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee8333369d0dfa7688ddf682fdbaf8b4");
        } else {
            this.d.e.a(aVar);
        }
    }

    public void setHeaderView(View view) {
        FrameLayout.LayoutParams layoutParams;
        int makeMeasureSpec;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "feb11989bd1bb9e8dd859d1d9a92d687", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "feb11989bd1bb9e8dd859d1d9a92d687");
        } else if (this.f != view) {
            if (this.f != null) {
                if (this.f instanceof com.sankuai.waimai.platform.widget.pullrefresh.a) {
                    this.d.e.b((com.sankuai.waimai.platform.widget.pullrefresh.a) this.f);
                }
                this.b.removeView(this.f);
            }
            if (view != null) {
                if (view instanceof com.sankuai.waimai.platform.widget.pullrefresh.a) {
                    this.d.e.a((com.sankuai.waimai.platform.widget.pullrefresh.a) view);
                }
                Object[] objArr2 = {view, 80};
                ChangeQuickRedirect changeQuickRedirect2 = c;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "82ad4b08becebed57ba136df617a8274", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "82ad4b08becebed57ba136df617a8274");
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
                this.d.d = view.getMeasuredHeight();
                this.b.addView(view);
            }
            setHeaderPullRefreshEnable(view != null);
            this.f = view;
            this.d.a(0);
        }
    }

    public void setPullTarget(int i) {
        this.g = i;
    }

    public int getPullTarget() {
        return this.g;
    }

    public final boolean c() {
        return this.g == 1;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21879c5d8b7a63c9a8a98d17329b411b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21879c5d8b7a63c9a8a98d17329b411b");
        } else {
            super.onFinishInflate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53fa43b3bc596f0234f65ed0424e9a98", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53fa43b3bc596f0234f65ed0424e9a98")).booleanValue();
        }
        try {
            if (this.h) {
                if (super.dispatchTouchEvent(motionEvent)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.facebook.react.views.view.f, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "087e0f0ea443f7b39595c55135f63523", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "087e0f0ea443f7b39595c55135f63523");
            return;
        }
        super.onMeasure(i, i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        this.b.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(this.d.d * 3, 1073741824));
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3);
        }
    }

    @Override // com.facebook.react.views.view.f, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d574786a4785d07f89625ca13fff8b18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d574786a4785d07f89625ca13fff8b18");
            return;
        }
        int measuredHeight = this.b.getMeasuredHeight();
        a(this.b, 0);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt != null && childAt != this.b) {
                a(childAt, measuredHeight);
            }
        }
    }

    private static void a(@NonNull View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c658f5e33727e4d26d79eddc568dfe5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c658f5e33727e4d26d79eddc568dfe5b");
        } else {
            a(view, i, view.getMeasuredHeight());
        }
    }

    private static void a(@NonNull View view, int i, int i2) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a8f6262b7ab04a510eabacddfc51feb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a8f6262b7ab04a510eabacddfc51feb7");
        } else {
            view.layout(0, i, view.getMeasuredWidth(), i2 + i);
        }
    }

    public void setRefreshListener(final a.InterfaceC1030a interfaceC1030a) {
        Object[] objArr = {interfaceC1030a};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b078e4d09c735ea271c0376af5abf5e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b078e4d09c735ea271c0376af5abf5e2");
        } else {
            a(new com.sankuai.waimai.platform.widget.pullrefresh.c() { // from class: com.sankuai.waimai.reactnative.pullrefresh.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.pullrefresh.c
                public final void a(com.sankuai.waimai.platform.widget.pullrefresh.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "41196a5eb805574f8a8c9c408090bbec", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "41196a5eb805574f8a8c9c408090bbec");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cda69f9b095445a65a7c5e4f86f31d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cda69f9b095445a65a7c5e4f86f31d4");
        } else {
            a(new com.sankuai.waimai.platform.widget.pullrefresh.c() { // from class: com.sankuai.waimai.reactnative.pullrefresh.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.pullrefresh.c
                public final void a(com.sankuai.waimai.platform.widget.pullrefresh.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e20589dbe0f7677bd224288caa9b3362", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e20589dbe0f7677bd224288caa9b3362");
                    }
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public abstract class b implements com.sankuai.waimai.platform.widget.pullrefresh.b {
        public static ChangeQuickRedirect c;
        int d;
        public final PullRefreshLogic e;

        public b() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d98efeb1fe0bff11f78c15891429b160", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d98efeb1fe0bff11f78c15891429b160");
                return;
            }
            this.d = 0;
            this.e = new PullRefreshLogic(a.this.getContext(), this);
        }

        @Override // com.sankuai.waimai.platform.widget.pullrefresh.b
        public final void a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60fc6cf797e84aa15772076801be0503", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60fc6cf797e84aa15772076801be0503");
            } else {
                a.this.setScrollEnable(z);
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
    /* renamed from: com.sankuai.waimai.reactnative.pullrefresh.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C1122a extends b {
        public static ChangeQuickRedirect a;

        public C1122a() {
            super();
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcd1596f152677330f5d9cc3e933f199", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcd1596f152677330f5d9cc3e933f199");
            }
        }

        @Override // com.sankuai.waimai.platform.widget.pullrefresh.b
        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fd771204f2b7f5d242305ef29c1172d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fd771204f2b7f5d242305ef29c1172d");
            } else {
                a.this.scrollTo(0, (this.d * 3) - i);
            }
        }

        @Override // com.sankuai.waimai.platform.widget.pullrefresh.b
        public final int c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "697f210f49864beb352124ace8e58e68", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "697f210f49864beb352124ace8e58e68")).intValue() : (this.d * 3) - a.this.getScrollY();
        }
    }
}
