package com.handmark.pulltorefresh.library;

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
import com.handmark.pulltorefresh.library.internal.LoadingView;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class c<T extends View> extends LinearLayout {
    static final a a = a.PULL_DOWN_TO_REFRESH;
    T b;
    private int c;
    private float d;
    private float e;
    private float f;
    private boolean g;
    private int h;
    private int i;
    private a j;
    private a k;
    private boolean l;
    private boolean m;
    private boolean n;
    private LoadingView o;
    private LoadingView p;
    private int q;
    private InterfaceC0157c<T> r;
    private d<T> s;
    private c<T>.e t;
    private boolean u;
    private com.handmark.pulltorefresh.library.a v;
    private boolean w;
    private int x;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface b {
    }

    /* compiled from: ProGuard */
    /* renamed from: com.handmark.pulltorefresh.library.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0157c<V extends View> {
        void a(c<V> cVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface d<V extends View> {
    }

    protected abstract T a(Context context, AttributeSet attributeSet);

    protected void a(TypedArray typedArray) {
    }

    protected abstract boolean a();

    protected abstract boolean b();

    public c(Context context) {
        super(context);
        Drawable drawable;
        Drawable drawable2;
        this.g = false;
        this.h = 0;
        this.i = -1;
        this.j = a;
        this.l = true;
        this.m = true;
        this.n = true;
        this.u = false;
        this.x = -1;
        setOrientation(1);
        this.c = ViewConfiguration.get(context).getScaledTouchSlop();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{R.attr.ptrAdapterViewBackground, R.attr.ptrHeaderBackground, R.attr.ptrHeaderTextColor, R.attr.ptrHeaderSubTextColor, R.attr.ptrMode, R.attr.ptrShowIndicator, R.attr.ptrDrawable});
        a(obtainStyledAttributes);
        if (obtainStyledAttributes.hasValue(4)) {
            this.j = a.a(obtainStyledAttributes.getInteger(4, 0));
        }
        this.b = a(context, (AttributeSet) null);
        a(context, (Context) this.b);
        this.o = a(context, a.PULL_DOWN_TO_REFRESH, obtainStyledAttributes);
        this.p = a(context, a.PULL_UP_TO_REFRESH, obtainStyledAttributes);
        f();
        if (obtainStyledAttributes.hasValue(1) && (drawable2 = obtainStyledAttributes.getDrawable(1)) != null) {
            setBackgroundDrawable(drawable2);
        }
        if (obtainStyledAttributes.hasValue(0) && (drawable = obtainStyledAttributes.getDrawable(0)) != null) {
            this.b.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        T refreshableView = getRefreshableView();
        if (refreshableView instanceof ViewGroup) {
            ((ViewGroup) refreshableView).addView(view, i, layoutParams);
            return;
        }
        throw new UnsupportedOperationException("Refreshable View is not a ViewGroup so can't addView");
    }

    public final a getCurrentMode() {
        return this.k;
    }

    public final boolean getFilterTouchEvents() {
        return this.n;
    }

    public final a getMode() {
        return this.j;
    }

    public final T getRefreshableView() {
        return this.b;
    }

    public final boolean getShowViewWhileRefreshing() {
        return this.l;
    }

    public final boolean g() {
        return this.j != a.DISABLED;
    }

    public final boolean h() {
        return this.h == 2 || this.h == 3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            this.u = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.w = z;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (g()) {
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.g = false;
                this.u = false;
                return false;
            } else if (action == 0 || !this.g) {
                if (action != 0) {
                    if (action == 2) {
                        if (this.m && h()) {
                            return true;
                        }
                        if (k()) {
                            if (!this.u) {
                                float y = motionEvent.getY();
                                this.f = y;
                                this.e = y;
                                this.d = motionEvent.getX();
                                this.g = false;
                                this.u = true;
                            }
                            float y2 = motionEvent.getY();
                            float f = y2 - this.e;
                            float abs = Math.abs(f);
                            float abs2 = Math.abs(motionEvent.getX() - this.d);
                            if (!this.w || (abs > this.c && (!this.n || abs > abs2))) {
                                if (this.j.a() && f >= 1.0f && a()) {
                                    this.e = y2;
                                    this.g = true;
                                    if (this.j == a.BOTH) {
                                        this.k = a.PULL_DOWN_TO_REFRESH;
                                    }
                                } else if (this.j.b() && f <= -1.0f && b()) {
                                    this.e = y2;
                                    this.g = true;
                                    if (this.j == a.BOTH) {
                                        this.k = a.PULL_UP_TO_REFRESH;
                                    }
                                }
                            }
                        }
                    }
                } else if (k()) {
                    float y3 = motionEvent.getY();
                    this.f = y3;
                    this.e = y3;
                    this.d = motionEvent.getX();
                    this.g = false;
                    this.u = true;
                }
                return this.g;
            } else {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        if (this.h != 0) {
            this.h = 4;
            b(this.h);
            e();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int round;
        if (g()) {
            if (this.m && h()) {
                return true;
            }
            if (motionEvent.getAction() != 0 || motionEvent.getEdgeFlags() == 0) {
                switch (motionEvent.getAction()) {
                    case 0:
                        if (k()) {
                            float y = motionEvent.getY();
                            this.f = y;
                            this.e = y;
                            return true;
                        }
                        break;
                    case 1:
                    case 3:
                        this.u = false;
                        if (this.g) {
                            this.g = false;
                            if (this.h == 1) {
                                if (this.r != null) {
                                    setRefreshingInternal(true);
                                    this.r.a(this);
                                    return true;
                                } else if (this.s != null) {
                                    setRefreshingInternal(true);
                                    if (this.k != a.PULL_DOWN_TO_REFRESH) {
                                        a aVar = a.PULL_UP_TO_REFRESH;
                                    }
                                    return true;
                                } else {
                                    e();
                                    this.h = 4;
                                    b(this.h);
                                    return true;
                                }
                            }
                            this.i = -1;
                            a(0);
                            return true;
                        }
                        break;
                    case 2:
                        if (this.g) {
                            this.e = motionEvent.getY();
                            getScrollY();
                            if (AnonymousClass1.a[this.k.ordinal()] == 1) {
                                round = Math.round(Math.max(this.f - this.e, 0.0f) / 2.0f);
                                if (this.x > 0) {
                                    round = Math.min(round, this.x + this.q);
                                }
                            } else {
                                round = Math.round(Math.min(this.f - this.e, 0.0f) / 2.0f);
                                if (this.x > 0) {
                                    round = Math.max(round, -(this.x + this.q));
                                }
                            }
                            b(this.h);
                            setHeaderScroll(round);
                            if (round != 0) {
                                float abs = Math.abs(round) / this.q;
                                switch (this.k) {
                                    case PULL_UP_TO_REFRESH:
                                        this.p.a(abs);
                                        break;
                                    case PULL_DOWN_TO_REFRESH:
                                        this.o.a(abs);
                                        break;
                                }
                                if (this.h == 0 && this.q < Math.abs(round)) {
                                    this.h = 1;
                                    b(this.h);
                                    d();
                                } else if (this.h == 1 && this.q >= Math.abs(round)) {
                                    this.h = 0;
                                    b(this.h);
                                    c();
                                }
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
        this.m = z;
    }

    public final void setFilterTouchEvents(boolean z) {
        this.n = z;
    }

    public void setLastUpdatedLabel(CharSequence charSequence) {
        if (this.o != null) {
            this.o.setSubHeaderText(charSequence);
        }
        if (this.p != null) {
            this.p.setSubHeaderText(charSequence);
        }
        j();
    }

    public void setLoadingDrawable(Drawable drawable) {
        a aVar = a.BOTH;
        if (this.o != null && aVar.a()) {
            this.o.setLoadingDrawable(drawable);
        }
        if (this.p != null && aVar.b()) {
            this.p.setLoadingDrawable(drawable);
        }
        j();
    }

    @Override // android.view.View
    public void setLongClickable(boolean z) {
        getRefreshableView().setLongClickable(z);
    }

    public final void setMode(a aVar) {
        if (aVar != this.j) {
            this.j = aVar;
            f();
        }
    }

    public final void setOnRefreshListener(InterfaceC0157c<T> interfaceC0157c) {
        this.r = interfaceC0157c;
    }

    public final void setOnRefreshListener(d<T> dVar) {
        this.s = dVar;
    }

    public void setPullLabel(String str) {
        a(str, a.BOTH);
    }

    public void a(String str, a aVar) {
        if (this.o != null && aVar.a()) {
            this.o.setPullLabel(str);
        }
        if (this.p == null || !aVar.b()) {
            return;
        }
        this.p.setPullLabel(str);
    }

    public final void setPullToRefreshEnabled(boolean z) {
        setMode(z ? a : a.DISABLED);
    }

    public final void setPrStateChangedListener(com.handmark.pulltorefresh.library.a aVar) {
        this.v = aVar;
    }

    public final void setRefreshing(boolean z) {
        if (h()) {
            return;
        }
        setRefreshingInternal(z);
        this.h = 3;
        b(this.h);
    }

    public void setRefreshingLabel(String str) {
        b(str, a.BOTH);
    }

    public void b(String str, a aVar) {
        if (this.o != null && aVar.a()) {
            this.o.setRefreshingLabel(str);
        }
        if (this.p == null || !aVar.b()) {
            return;
        }
        this.p.setRefreshingLabel(str);
    }

    public void setReleaseLabel(String str) {
        c(str, a.BOTH);
    }

    public void c(String str, a aVar) {
        if (this.o != null && aVar.a()) {
            this.o.setReleaseLabel(str);
        }
        if (this.p == null || !aVar.b()) {
            return;
        }
        this.p.setReleaseLabel(str);
    }

    public final void setShowViewWhileRefreshing(boolean z) {
        this.l = z;
    }

    protected void a(Context context, T t) {
        super.addView(t, -1, new LinearLayout.LayoutParams(-1, 0, 1.0f));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, -1, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final LoadingView getFooterLayout() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getHeaderHeight() {
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final LoadingView getHeaderLayout() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getState() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
        int[] iArr = AnonymousClass1.a;
        this.k.ordinal();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d() {
        int[] iArr = AnonymousClass1.a;
        this.k.ordinal();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.j = a.a(bundle.getInt("ptr_mode", 0));
            this.k = a.a(bundle.getInt("ptr_current_mode", 0));
            this.m = bundle.getBoolean("ptr_disable_scrolling", true);
            this.l = bundle.getBoolean("ptr_show_refreshing_view", true);
            Parcelable parcelable2 = bundle.getParcelable("ptr_super");
            if (parcelable2 == null || (parcelable2 instanceof AbsSavedState)) {
                super.onRestoreInstanceState(parcelable2);
            } else {
                super.onRestoreInstanceState(null);
            }
            int i = bundle.getInt("ptr_state", 0);
            if (i == 2) {
                setRefreshingInternal(true);
                this.h = i;
                b(this.h);
            }
        } else if (parcelable == null || (parcelable instanceof AbsSavedState)) {
            super.onRestoreInstanceState(parcelable);
        } else {
            super.onRestoreInstanceState(null);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putInt("ptr_state", this.h);
        bundle.putInt("ptr_mode", this.j.e);
        bundle.putInt("ptr_current_mode", this.k.e);
        bundle.putBoolean("ptr_disable_scrolling", this.m);
        bundle.putBoolean("ptr_show_refreshing_view", this.l);
        bundle.putParcelable("ptr_super", super.onSaveInstanceState());
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        this.h = 0;
        this.g = false;
        if (this.j.a()) {
            this.o.a();
        }
        if (this.j.b()) {
            this.p.a();
        }
        a(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setHeaderScroll(int i) {
        scrollTo(0, i);
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setRefreshingInternal(boolean z) {
        this.h = 2;
        b(this.h);
        if (this.j.a()) {
            this.o.b();
        }
        if (this.j.b()) {
            this.p.b();
        }
        if (z) {
            if (this.l) {
                a(this.k == a.PULL_DOWN_TO_REFRESH ? -this.q : this.q);
            } else {
                a(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(int i) {
        if (this.t != null) {
            this.t.a();
        }
        if (getScrollY() != i) {
            this.t = new e(getScrollY(), i);
            post(this.t);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f() {
        if (this == this.o.getParent()) {
            removeView(this.o);
        }
        if (this.j.a()) {
            super.addView(this.o, 0, new LinearLayout.LayoutParams(-1, -2));
        }
        if (this == this.p.getParent()) {
            removeView(this.p);
        }
        if (this.j.b()) {
            super.addView(this.p, -1, new LinearLayout.LayoutParams(-1, -2));
        }
        j();
        this.k = this.j != a.BOTH ? this.j : a.PULL_DOWN_TO_REFRESH;
    }

    private boolean k() {
        switch (this.j) {
            case PULL_UP_TO_REFRESH:
                return b();
            case PULL_DOWN_TO_REFRESH:
                return a();
            case BOTH:
                return b() || a();
            default:
                return false;
        }
    }

    private static void a(View view) {
        int makeMeasureSpec;
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

    private void b(int i) {
        if (i != this.i) {
            this.i = i;
        }
    }

    private void l() {
        if (this.j.a()) {
            a((View) this.o);
            this.q = this.o.getMeasuredHeight();
        } else if (this.j.b()) {
            a((View) this.p);
            this.q = this.p.getMeasuredHeight();
        } else {
            this.q = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j() {
        l();
        int i = AnonymousClass1.a[this.j.ordinal()];
        if (i == 1) {
            setPadding(0, 0, 0, -this.q);
            return;
        }
        switch (i) {
            case 3:
                break;
            default:
                setPadding(0, -this.q, 0, 0);
                return;
            case 4:
                setPadding(0, 0, 0, 0);
                break;
        }
        setPadding(0, -this.q, 0, -this.q);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum a {
        DISABLED(0),
        PULL_DOWN_TO_REFRESH(1),
        PULL_UP_TO_REFRESH(2),
        BOTH(3);
        
        int e;

        public static a a(int i) {
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

        a(int i) {
            this.e = i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final boolean a() {
            return this == PULL_DOWN_TO_REFRESH || this == BOTH;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final boolean b() {
            return this == PULL_UP_TO_REFRESH || this == BOTH;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public final class e implements Runnable {
        private final int c;
        private final int d;
        private boolean e = true;
        private long f = -1;
        private int g = -1;
        private final Interpolator b = new OvershootInterpolator(2.0f);

        public e(int i, int i2) {
            this.d = i;
            this.c = i2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f == -1) {
                this.f = System.currentTimeMillis();
            } else {
                this.g = this.d - Math.round((this.d - this.c) * this.b.getInterpolation(((float) Math.max(Math.min(((System.currentTimeMillis() - this.f) * 1000) / 300, 1000L), 0L)) / 1000.0f));
                c.this.setHeaderScroll(this.g);
            }
            if (!this.e || this.c == this.g) {
                return;
            }
            c.this.postDelayed(this, 10L);
        }

        public final void a() {
            this.e = false;
            c.this.removeCallbacks(this);
        }
    }

    protected LoadingView a(Context context, a aVar, TypedArray typedArray) {
        return new com.handmark.pulltorefresh.library.internal.a(context, aVar, typedArray);
    }

    public final void a(LoadingView loadingView) {
        if (loadingView != null) {
            if (this == this.o.getParent()) {
                removeView(this.o);
            }
            this.o = loadingView;
            f();
        }
    }

    public void setMaxExternalMoveDistance(int i) {
        this.x = i;
    }
}
