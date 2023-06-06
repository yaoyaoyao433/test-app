package com.dianping.voyager.widgets.container;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.LinearLayout;
import com.dianping.shield.component.utils.PageContainerThemeManager;
import com.dianping.shield.component.utils.PageContainerThemePackage;
import com.dianping.shield.component.widgets.internal.GCLoadingView;
import com.dianping.shield.preload.ShieldPreloadInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class a<T extends View> extends LinearLayout implements ShieldPreloadInterface {
    public static ChangeQuickRedirect a;
    public static final EnumC0139a b = EnumC0139a.PULL_DOWN_TO_REFRESH;
    public int c;
    public EnumC0139a d;
    public T e;
    public GCLoadingView f;
    public GCLoadingView g;
    private int h;
    private float i;
    private float j;
    private float k;
    private boolean l;
    private EnumC0139a m;
    private boolean n;
    private boolean o;
    private boolean p;
    private int q;
    private b<T> r;
    private c<T> s;
    private a<T>.d t;
    private PageContainerThemePackage u;
    private GCLoadingView.OnRefreshCompleteListener v;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface b<V extends View> {
        void onRefresh(a<V> aVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface c<V extends View> {
    }

    public abstract T a(Context context, AttributeSet attributeSet);

    public abstract boolean b();

    public abstract boolean c();

    @Override // com.dianping.shield.preload.ShieldPreloadInterface
    public void shieldPreload() {
    }

    public static /* synthetic */ int a(a aVar, int i) {
        aVar.c = 0;
        return 0;
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        aVar.l = false;
        return false;
    }

    public a(Context context) {
        super(context);
        Drawable drawable;
        Drawable drawable2;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "229473677e77983466360d585c14cdab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "229473677e77983466360d585c14cdab");
            return;
        }
        this.l = false;
        this.c = 0;
        this.d = b;
        this.n = true;
        this.o = true;
        this.p = true;
        this.v = new GCLoadingView.OnRefreshCompleteListener() { // from class: com.dianping.voyager.widgets.container.a.1
            public static ChangeQuickRedirect a;

            @Override // com.dianping.shield.component.widgets.internal.GCLoadingView.OnRefreshCompleteListener
            public final void onRefreshComplete() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "14fd22b2fdd8de09cb9ad0d28fa25efc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "14fd22b2fdd8de09cb9ad0d28fa25efc");
                    return;
                }
                a.a(a.this, 0);
                a.a(a.this, false);
                a.this.a(0);
            }
        };
        Object[] objArr2 = {context, null};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b97ee67049b97b079c0469c8c1ffd0e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b97ee67049b97b079c0469c8c1ffd0e8");
            return;
        }
        this.u = PageContainerThemeManager.INSTANCE.getPageContainerThemeCreator().createTheme();
        setOrientation(1);
        this.h = ViewConfiguration.get(context).getScaledTouchSlop();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{R.attr.refreshAdapterViewBackground, R.attr.refreshHeaderBackground, R.attr.refreshHeaderTextColor, R.attr.refreshHeaderSubTextColor, R.attr.refreshMode, R.attr.refreshShowIndicator, R.attr.refreshDrawable});
        if (obtainStyledAttributes.hasValue(4)) {
            this.d = EnumC0139a.a(obtainStyledAttributes.getInteger(4, 0));
        }
        this.e = a(context, (AttributeSet) null);
        T t = this.e;
        Object[] objArr3 = {context, t};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "deb0d04120e0dfed92ba84df3e9b049b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "deb0d04120e0dfed92ba84df3e9b049b");
        } else {
            a(t, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
        this.f = this.u.getPageContainerViewResCreate().createHeaderView(context, null);
        this.f.setRefreshCompleteListener(this.v);
        this.g = this.u.getPageContainerViewResCreate().createHeaderView(context, null);
        e();
        if (obtainStyledAttributes.hasValue(1) && (drawable2 = obtainStyledAttributes.getDrawable(1)) != null) {
            setBackgroundDrawable(drawable2);
        }
        if (obtainStyledAttributes.hasValue(0) && (drawable = obtainStyledAttributes.getDrawable(0)) != null) {
            this.e.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, Integer.valueOf(i), layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74fabf33a48e595d9d74a98366937a32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74fabf33a48e595d9d74a98366937a32");
            return;
        }
        T refreshableView = getRefreshableView();
        if (refreshableView instanceof ViewGroup) {
            ((ViewGroup) refreshableView).addView(view, i, layoutParams);
            return;
        }
        throw new UnsupportedOperationException("Refreshable View is not a ViewGroup so can't addView");
    }

    public final EnumC0139a getCurrentMode() {
        return this.m;
    }

    public final boolean getFilterTouchEvents() {
        return this.p;
    }

    public final EnumC0139a getMode() {
        return this.d;
    }

    public final T getRefreshableView() {
        return this.e;
    }

    public final boolean getShowViewWhileRefreshing() {
        return this.n;
    }

    private boolean d() {
        return this.d != EnumC0139a.DISABLED;
    }

    public final boolean a() {
        return this.c == 2 || this.c == 3;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bc7a4c02c0b27bf9a00f66de95a33bc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bc7a4c02c0b27bf9a00f66de95a33bc")).booleanValue();
        }
        if (d()) {
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.l = false;
                return false;
            } else if (action == 0 || !this.l) {
                if (action != 0) {
                    if (action == 2) {
                        if (this.o && a()) {
                            return true;
                        }
                        if (f()) {
                            float y = motionEvent.getY();
                            float f = y - this.j;
                            float abs = Math.abs(f);
                            float abs2 = Math.abs(motionEvent.getX() - this.i);
                            if (abs > this.h && (!this.p || abs > abs2)) {
                                if (this.d.a() && f >= 1.0f && b()) {
                                    this.j = y;
                                    this.l = true;
                                    if (this.d == EnumC0139a.BOTH) {
                                        this.m = EnumC0139a.PULL_DOWN_TO_REFRESH;
                                    }
                                } else if (this.d.b() && f <= -1.0f && c()) {
                                    this.j = y;
                                    this.l = true;
                                    if (this.d == EnumC0139a.BOTH) {
                                        this.m = EnumC0139a.PULL_UP_TO_REFRESH;
                                    }
                                }
                            }
                        }
                    }
                } else if (f()) {
                    float y2 = motionEvent.getY();
                    this.k = y2;
                    this.j = y2;
                    this.i = motionEvent.getX();
                    this.l = false;
                }
                return this.l;
            } else {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int round;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a0b3f2da3498f0643991900573d0486", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a0b3f2da3498f0643991900573d0486")).booleanValue();
        }
        if (d()) {
            if (this.o && a()) {
                return true;
            }
            if (motionEvent.getAction() != 0 || motionEvent.getEdgeFlags() == 0) {
                switch (motionEvent.getAction()) {
                    case 0:
                        if (f()) {
                            float y = motionEvent.getY();
                            this.k = y;
                            this.j = y;
                            return true;
                        }
                        break;
                    case 1:
                    case 3:
                        if (this.l) {
                            this.l = false;
                            if (this.c == 1) {
                                if (this.r != null) {
                                    setRefreshingInternal(true);
                                    this.r.onRefresh(this);
                                }
                                if (this.s != null) {
                                    setRefreshingInternal(true);
                                    if (this.m != EnumC0139a.PULL_DOWN_TO_REFRESH) {
                                        EnumC0139a enumC0139a = EnumC0139a.PULL_UP_TO_REFRESH;
                                    }
                                }
                                if (this.r == null && this.s == null) {
                                    Object[] objArr2 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "18645c9644e2e1a1ec7d2e751d7b45b0", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "18645c9644e2e1a1ec7d2e751d7b45b0");
                                    } else {
                                        this.c = 0;
                                        this.l = false;
                                        if (this.d.a()) {
                                            this.f.reset();
                                        }
                                        if (this.d.b()) {
                                            this.g.reset();
                                        }
                                    }
                                }
                                return true;
                            }
                            a(0);
                            return true;
                        }
                        break;
                    case 2:
                        if (this.l) {
                            this.j = motionEvent.getY();
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (!PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "31273f90445f4e15fcf3612c7c79379f", RobustBitConfig.DEFAULT_VALUE)) {
                                getScrollY();
                                if (AnonymousClass2.a[this.m.ordinal()] == 1) {
                                    round = Math.round(Math.max(this.k - this.j, 0.0f) / 2.0f);
                                } else {
                                    round = Math.round(Math.min(this.k - this.j, 0.0f) / 2.0f);
                                }
                                setHeaderScroll(round);
                                if (round != 0) {
                                    float abs = Math.abs(round) / this.q;
                                    switch (this.m) {
                                        case PULL_UP_TO_REFRESH:
                                            this.g.onPullY(abs);
                                            break;
                                        case PULL_DOWN_TO_REFRESH:
                                            this.f.onPullY(abs);
                                            break;
                                    }
                                    if (this.c == 0 && this.q < Math.abs(round)) {
                                        this.c = 1;
                                        Object[] objArr4 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (!PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "dd15605e21db8e4aa95bfb024f10bc9c", RobustBitConfig.DEFAULT_VALUE)) {
                                            switch (this.m) {
                                                case PULL_UP_TO_REFRESH:
                                                    this.g.releaseToRefresh();
                                                    break;
                                                case PULL_DOWN_TO_REFRESH:
                                                    this.f.releaseToRefresh();
                                                    break;
                                            }
                                        } else {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "dd15605e21db8e4aa95bfb024f10bc9c");
                                        }
                                    } else if (this.c == 1 && this.q >= Math.abs(round)) {
                                        this.c = 0;
                                        Object[] objArr5 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                        if (!PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "41aed21347ee156a40bd31e2c696e42e", RobustBitConfig.DEFAULT_VALUE)) {
                                            switch (this.m) {
                                                case PULL_UP_TO_REFRESH:
                                                    this.g.pullToRefresh();
                                                    break;
                                                case PULL_DOWN_TO_REFRESH:
                                                    this.f.pullToRefresh();
                                                    break;
                                            }
                                        } else {
                                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "41aed21347ee156a40bd31e2c696e42e");
                                        }
                                    }
                                }
                            } else {
                                ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "31273f90445f4e15fcf3612c7c79379f")).booleanValue();
                            }
                            return true;
                        }
                        break;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void setDisableScrollingWhileRefreshing(boolean z) {
        this.o = z;
    }

    public final void setFilterTouchEvents(boolean z) {
        this.p = z;
    }

    public void setLastUpdatedLabel(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ce0a8a82812433bfff26d59e4bf288c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ce0a8a82812433bfff26d59e4bf288c");
            return;
        }
        if (this.f != null) {
            this.f.setSubHeaderText(charSequence);
        }
        if (this.g != null) {
            this.g.setSubHeaderText(charSequence);
        }
        h();
    }

    public void setLoadingDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7052e6a8cdd8852fa50e4ea4a1a1e941", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7052e6a8cdd8852fa50e4ea4a1a1e941");
            return;
        }
        EnumC0139a enumC0139a = EnumC0139a.BOTH;
        Object[] objArr2 = {drawable, enumC0139a};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c2fde3061ff6dba14f1ab39032cc9331", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c2fde3061ff6dba14f1ab39032cc9331");
            return;
        }
        if (this.f != null && enumC0139a.a()) {
            this.f.setLoadingDrawable(drawable);
        }
        if (this.g != null && enumC0139a.b()) {
            this.g.setLoadingDrawable(drawable);
        }
        h();
    }

    @Override // android.view.View
    public void setLongClickable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c37d5d3ff658c9d4fbec8ebcc23a156", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c37d5d3ff658c9d4fbec8ebcc23a156");
        } else {
            getRefreshableView().setLongClickable(z);
        }
    }

    public final void setMode(EnumC0139a enumC0139a) {
        Object[] objArr = {enumC0139a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4055638ded440eab845262620df5730d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4055638ded440eab845262620df5730d");
        } else if (enumC0139a != this.d) {
            this.d = enumC0139a;
            e();
        }
    }

    public final void setOnRefreshListener(b<T> bVar) {
        this.r = bVar;
    }

    public final void setOnRefreshListener(c<T> cVar) {
        this.s = cVar;
    }

    public void setPullLabel(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a21f4098f039c8486c6d79ad24b6312", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a21f4098f039c8486c6d79ad24b6312");
            return;
        }
        EnumC0139a enumC0139a = EnumC0139a.BOTH;
        Object[] objArr2 = {str, enumC0139a};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "84a3060115b2ca220c9e009c3695d3f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "84a3060115b2ca220c9e009c3695d3f7");
            return;
        }
        if (this.f != null && enumC0139a.a()) {
            this.f.setPullLabel(str);
        }
        if (this.g == null || !enumC0139a.b()) {
            return;
        }
        this.g.setPullLabel(str);
    }

    public final void setPullToRefreshEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b13ef1d419228be68a5ee1a2ebf844bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b13ef1d419228be68a5ee1a2ebf844bd");
        } else {
            setMode(z ? b : EnumC0139a.DISABLED);
        }
    }

    public final void setRefreshing(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33bb7d435410ea37525902163f8b249e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33bb7d435410ea37525902163f8b249e");
        } else if (a()) {
        } else {
            setRefreshingInternal(z);
            this.c = 3;
        }
    }

    public void setRefreshingLabel(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbab8007bc67e27da2142fbdaefebace", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbab8007bc67e27da2142fbdaefebace");
            return;
        }
        EnumC0139a enumC0139a = EnumC0139a.BOTH;
        Object[] objArr2 = {str, enumC0139a};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "47588a612eb95ac5633fb6b606314c27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "47588a612eb95ac5633fb6b606314c27");
            return;
        }
        if (this.f != null && enumC0139a.a()) {
            this.f.setRefreshingLabel(str);
        }
        if (this.g == null || !enumC0139a.b()) {
            return;
        }
        this.g.setRefreshingLabel(str);
    }

    public void setReleaseLabel(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f266c420b285e4c706f5a05a7eca681", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f266c420b285e4c706f5a05a7eca681");
            return;
        }
        EnumC0139a enumC0139a = EnumC0139a.BOTH;
        Object[] objArr2 = {str, enumC0139a};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4477ed9fa835a4a21ae875427a537d4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4477ed9fa835a4a21ae875427a537d4b");
            return;
        }
        if (this.f != null && enumC0139a.a()) {
            this.f.setReleaseLabel(str);
        }
        if (this.g == null || !enumC0139a.b()) {
            return;
        }
        this.g.setReleaseLabel(str);
    }

    public final void setShowViewWhileRefreshing(boolean z) {
        this.n = z;
    }

    private void a(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, 0, layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb250962441f02f2b6ad6ded2d9f62db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb250962441f02f2b6ad6ded2d9f62db");
        } else {
            super.addView(view, 0, layoutParams);
        }
    }

    private void a(View view, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4aef420f1e810793d6289b3edd2a061c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4aef420f1e810793d6289b3edd2a061c");
        } else {
            super.addView(view, -1, layoutParams);
        }
    }

    public final GCLoadingView getFooterLayout() {
        return this.g;
    }

    public final int getHeaderHeight() {
        return this.q;
    }

    public final GCLoadingView getHeaderLayout() {
        return this.f;
    }

    public final int getState() {
        return this.c;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Object[] objArr = {parcelable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86c188b133eb4f43707e19f93c4309c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86c188b133eb4f43707e19f93c4309c6");
        } else if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.d = EnumC0139a.a(bundle.getInt("ptr_mode", 0));
            this.m = EnumC0139a.a(bundle.getInt("ptr_current_mode", 0));
            this.o = bundle.getBoolean("ptr_disable_scrolling", true);
            this.n = bundle.getBoolean("ptr_show_refreshing_view", true);
            Parcelable parcelable2 = bundle.getParcelable("ptr_super");
            if (parcelable2 == null || (parcelable2 instanceof AbsSavedState)) {
                super.onRestoreInstanceState(parcelable2);
            } else {
                super.onRestoreInstanceState(null);
            }
            int i = bundle.getInt("ptr_state", 0);
            if (i == 2) {
                setRefreshingInternal(true);
                this.c = i;
            }
        } else if (parcelable == null || (parcelable instanceof AbsSavedState)) {
            super.onRestoreInstanceState(parcelable);
        } else {
            super.onRestoreInstanceState(null);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf00bd658dac13f423a6230500499208", RobustBitConfig.DEFAULT_VALUE)) {
            return (Parcelable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf00bd658dac13f423a6230500499208");
        }
        Bundle bundle = new Bundle();
        bundle.putInt("ptr_state", this.c);
        bundle.putInt("ptr_mode", this.d.g);
        bundle.putInt("ptr_current_mode", this.m.g);
        bundle.putBoolean("ptr_disable_scrolling", this.o);
        bundle.putBoolean("ptr_show_refreshing_view", this.n);
        bundle.putParcelable("ptr_super", super.onSaveInstanceState());
        return bundle;
    }

    public final void setHeaderScroll(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dd793c71ef4789984b20454dbeaadb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dd793c71ef4789984b20454dbeaadb6");
        } else {
            scrollTo(0, i);
        }
    }

    public void setRefreshingInternal(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "079523bf96e00151c1909d76670564af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "079523bf96e00151c1909d76670564af");
            return;
        }
        this.c = 2;
        if (this.d.a()) {
            this.f.refreshing();
        }
        if (this.d.b()) {
            this.g.refreshing();
        }
        if (z) {
            if (this.n) {
                a(this.m == EnumC0139a.PULL_DOWN_TO_REFRESH ? -this.q : this.q);
            } else {
                a(0);
            }
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "429c232b92ffd9c6232469344ce2efe7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "429c232b92ffd9c6232469344ce2efe7");
            return;
        }
        if (this.t != null) {
            this.t.a();
        }
        if (getScrollY() != i) {
            this.t = new d(getScrollY(), i);
            post(this.t);
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c64a3c0f7dcf6f400f6bfcc596132b54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c64a3c0f7dcf6f400f6bfcc596132b54");
            return;
        }
        if (this == this.f.getParent()) {
            removeView(this.f);
        }
        if (this.d.a()) {
            a(this.f, 0, new LinearLayout.LayoutParams(-1, -2));
        }
        if (this == this.g.getParent()) {
            removeView(this.g);
        }
        if (this.d.b()) {
            a(this.g, new LinearLayout.LayoutParams(-1, -2));
        }
        h();
        this.m = this.d != EnumC0139a.BOTH ? this.d : EnumC0139a.PULL_DOWN_TO_REFRESH;
    }

    private boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36f22c07c60baa6e23d9a5663c6ee34e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36f22c07c60baa6e23d9a5663c6ee34e")).booleanValue();
        }
        switch (this.d) {
            case PULL_UP_TO_REFRESH:
                return c();
            case PULL_DOWN_TO_REFRESH:
                return b();
            case BOTH:
                return c() || b();
            default:
                return false;
        }
    }

    private void a(View view) {
        int makeMeasureSpec;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a90c71b42c8ed47b594d94cb01632e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a90c71b42c8ed47b594d94cb01632e3");
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i = layoutParams.height;
        if (i > 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(childMeasureSpec, makeMeasureSpec);
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c037bef8dc24a65a76e7d5ca0960ffbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c037bef8dc24a65a76e7d5ca0960ffbc");
        } else if (this.d.a()) {
            a(this.f);
            this.q = this.f.getMeasuredHeight();
        } else if (this.d.b()) {
            a(this.g);
            this.q = this.g.getMeasuredHeight();
        } else {
            this.q = 0;
        }
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4085d3ee4a2acefb27f9f823cd75fdcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4085d3ee4a2acefb27f9f823cd75fdcc");
            return;
        }
        g();
        int i = AnonymousClass2.a[this.d.ordinal()];
        if (i != 1) {
            switch (i) {
                case 3:
                    setPadding(0, -this.q, 0, -this.q);
                    return;
                case 4:
                    setPadding(0, 0, 0, 0);
                    return;
                default:
                    setPadding(0, -this.q, 0, 0);
                    return;
            }
        }
        setPadding(0, 0, 0, -this.q);
    }

    public void setHeaderLoadingView(GCLoadingView gCLoadingView) {
        Object[] objArr = {gCLoadingView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4815a597403ead4ea98e3da14d033092", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4815a597403ead4ea98e3da14d033092");
            return;
        }
        if (this.f != null && this.f.getParent() == this) {
            removeView(this.f);
        }
        this.f = gCLoadingView;
        this.f.setRefreshCompleteListener(this.v);
        e();
    }

    public void setFooterLoadingView(GCLoadingView gCLoadingView) {
        Object[] objArr = {gCLoadingView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "142bdeb47905e6b232da2dce6baea172", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "142bdeb47905e6b232da2dce6baea172");
            return;
        }
        if (this.g != null && this.g.getParent() == this) {
            removeView(this.g);
        }
        this.g = gCLoadingView;
        e();
    }

    @Override // com.dianping.shield.preload.ShieldPreloadInterface
    public void shieldRecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c84bfc8e833ef79346e2380945579493", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c84bfc8e833ef79346e2380945579493");
            return;
        }
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = false;
        this.c = 0;
        this.n = true;
        this.o = true;
        this.p = true;
        this.q = 0;
        this.r = null;
        this.s = null;
        if (this.t != null) {
            this.t.a();
        }
        setOrientation(1);
        if (this.f != null) {
            this.f.shieldRecycle();
        }
        if (this.g != null) {
            this.g.shieldRecycle();
        }
        this.d = b;
        e();
        setBackgroundDrawable(null);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.voyager.widgets.container.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0139a {
        DISABLED(0),
        PULL_FROM_START(1),
        PULL_DOWN_TO_REFRESH(1),
        PULL_UP_TO_REFRESH(2),
        BOTH(3);
        
        public static ChangeQuickRedirect a;
        int g;

        public static EnumC0139a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5e10fbf9d883428aecca81414c4df976", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0139a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5e10fbf9d883428aecca81414c4df976") : (EnumC0139a) Enum.valueOf(EnumC0139a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0139a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b51a8a00e1c05aa10a76815da751395b", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0139a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b51a8a00e1c05aa10a76815da751395b") : (EnumC0139a[]) values().clone();
        }

        public static EnumC0139a a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90020343c776c4a2c32259f893829b8d", RobustBitConfig.DEFAULT_VALUE)) {
                return (EnumC0139a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90020343c776c4a2c32259f893829b8d");
            }
            if (i == 0) {
                return DISABLED;
            }
            switch (i) {
                case 2:
                    return PULL_UP_TO_REFRESH;
                case 3:
                    return BOTH;
                default:
                    return PULL_DOWN_TO_REFRESH;
            }
        }

        EnumC0139a(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dab2e97a51bb82f238741c5c746b197", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dab2e97a51bb82f238741c5c746b197");
            } else {
                this.g = i;
            }
        }

        public final boolean a() {
            return this == PULL_DOWN_TO_REFRESH || this == BOTH;
        }

        public final boolean b() {
            return this == PULL_UP_TO_REFRESH || this == BOTH;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public final class d implements Runnable {
        public static ChangeQuickRedirect a;
        private final Interpolator c;
        private final int d;
        private final int e;
        private boolean f;
        private long g;
        private int h;

        public d(int i, int i2) {
            Object[] objArr = {a.this, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90d8ef3c1bc47332f90c5624e7c1ec95", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90d8ef3c1bc47332f90c5624e7c1ec95");
                return;
            }
            this.f = true;
            this.g = -1L;
            this.h = -1;
            this.e = i;
            this.d = i2;
            this.c = new OvershootInterpolator(2.0f);
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fd658afd9d3eba3f3bba4a81e488c4c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fd658afd9d3eba3f3bba4a81e488c4c");
                return;
            }
            if (this.g == -1) {
                this.g = System.currentTimeMillis();
            } else {
                this.h = this.e - Math.round((this.e - this.d) * this.c.getInterpolation(((float) Math.max(Math.min(((System.currentTimeMillis() - this.g) * 1000) / 300, 1000L), 0L)) / 1000.0f));
                a.this.setHeaderScroll(this.h);
            }
            if (!this.f || this.d == this.h) {
                return;
            }
            a.this.postDelayed(this, 10L);
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d1ea5923d969d897bdddfd80b83bb3c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d1ea5923d969d897bdddfd80b83bb3c");
                return;
            }
            this.f = false;
            a.this.removeCallbacks(this);
        }
    }
}
