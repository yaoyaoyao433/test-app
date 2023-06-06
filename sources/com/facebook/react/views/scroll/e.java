package com.facebook.react.views.scroll;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.an;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.w;
import com.facebook.react.uimanager.y;
import com.facebook.react.uimanager.z;
import com.meituan.android.mrn.utils.ad;
import java.lang.reflect.Field;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e extends ScrollView implements View.OnLayoutChangeListener, ViewGroup.OnHierarchyChangeListener, com.facebook.react.touch.c, y {
    @Nullable
    private static Field c = null;
    private static boolean d = false;
    private boolean A;
    private View B;
    private boolean C;
    private boolean D;
    private int E;
    private int F;
    private Handler G;
    private Rect H;
    private boolean I;
    private Rect J;
    com.facebook.react.views.view.e a;
    @Nullable
    an b;
    private final b e;
    @Nullable
    private final OverScroller f;
    private final j g;
    private final Rect h;
    private boolean i;
    @Nullable
    private Rect j;
    @Nullable
    private String k;
    private boolean l;
    private boolean m;
    @Nullable
    private Runnable n;
    private boolean o;
    private boolean p;
    private boolean q;
    @Nullable
    private a r;
    @Nullable
    private String s;
    @Nullable
    private Drawable t;
    private int u;
    private boolean v;
    private int w;
    private float x;
    @Nullable
    private List<Integer> y;
    private boolean z;

    static /* synthetic */ Runnable a(e eVar, Runnable runnable) {
        eVar.n = null;
        return null;
    }

    static /* synthetic */ boolean a(e eVar, boolean z) {
        eVar.i = false;
        return false;
    }

    public e(ReactContext reactContext) {
        this(reactContext, null);
    }

    public e(ReactContext reactContext, @Nullable a aVar) {
        super(reactContext);
        this.e = new b();
        this.g = new j();
        this.h = new Rect();
        this.k = "hidden";
        this.m = false;
        this.p = true;
        this.r = null;
        this.u = 0;
        this.v = false;
        this.w = 0;
        this.x = 0.985f;
        this.z = true;
        this.A = true;
        this.C = false;
        this.D = false;
        this.E = -1;
        this.F = -1;
        this.I = false;
        this.r = aVar;
        this.a = new com.facebook.react.views.view.e(this);
        this.f = getOverScrollerFromParent();
        setOnHierarchyChangeListener(this);
        setScrollBarStyle(33554432);
    }

    @Nullable
    private OverScroller getOverScrollerFromParent() {
        if (!d) {
            d = true;
            try {
                Field declaredField = ScrollView.class.getDeclaredField("mScroller");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                com.facebook.common.logging.a.c("ReactNative", "Failed to get mScroller field for ScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        OverScroller overScroller = null;
        if (c != null) {
            try {
                Object obj = c.get(this);
                if (obj instanceof OverScroller) {
                    overScroller = (OverScroller) obj;
                } else {
                    com.facebook.common.logging.a.c("ReactNative", "Failed to cast mScroller field in ScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Failed to get mScroller from ScrollView!", e);
            }
        }
        return overScroller;
    }

    public final void setDisableIntervalMomentum(boolean z) {
        this.v = z;
    }

    public final void setSendMomentumEvents(boolean z) {
        this.q = z;
    }

    public final void setScrollPerfTag(@Nullable String str) {
        this.s = str;
    }

    public final void setScrollEnabled(boolean z) {
        this.p = z;
    }

    public final void setPagingEnabled(boolean z) {
        this.m = z;
    }

    public final void setDecelerationRate(float f) {
        this.x = f;
        if (this.f != null) {
            this.f.setFriction(1.0f - this.x);
        }
    }

    public final void setSnapInterval(int i) {
        this.w = i;
    }

    public final void setSnapOffsets(List<Integer> list) {
        this.y = list;
    }

    public final void setSnapToStart(boolean z) {
        this.z = z;
    }

    public final void setSnapToEnd(boolean z) {
        this.A = z;
    }

    public final void a() {
        awakenScrollBars();
    }

    public final void setOverflow(String str) {
        this.k = str;
        invalidate();
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        q.a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        f(getScrollX(), getScrollY());
    }

    @Override // android.widget.ScrollView, android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.o) {
            updateClippingRect();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.o) {
            updateClippingRect();
        }
    }

    @Override // android.view.View
    protected final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.i = true;
        if (this.e.a(i, i2)) {
            if (this.o) {
                updateClippingRect();
            }
            g.a(this, this.e.a, this.e.b);
        }
        if (this.H == null || this.G == null) {
            return;
        }
        this.G.removeMessages(1);
        Message obtain = Message.obtain(this.G, 1);
        obtain.arg1 = i;
        obtain.arg2 = i2;
        this.G.sendMessageDelayed(obtain, 30L);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.p) {
            if (this.H != null && motionEvent.getAction() == 0) {
                Rect rect = this.J;
                this.I = rect != null && (motionEvent.getX() < ((float) (-rect.left)) || motionEvent.getX() >= ((float) ((getRight() - getLeft()) + rect.right)) || motionEvent.getY() < ((float) (-rect.top)) || motionEvent.getY() >= ((float) ((getBottom() - getTop()) + rect.bottom)));
            }
            try {
                if (super.onInterceptTouchEvent(motionEvent)) {
                    if (!this.D) {
                        com.facebook.react.uimanager.events.e.a(this, motionEvent);
                    }
                    com.facebook.react.uimanager.events.e.a(this, motionEvent);
                    g.a(this, i.BEGIN_DRAG, 0.0f, 0.0f);
                    this.l = true;
                    b();
                    return true;
                }
            } catch (IllegalArgumentException e) {
                com.facebook.common.logging.a.c("ReactNative", "Error intercepting touch event.", e);
            }
            return this.H != null && this.I;
        }
        return false;
    }

    @Override // android.widget.ScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.p) {
            if (this.H == null || !this.I) {
                this.g.a(motionEvent);
                if ((motionEvent.getAction() & 255) == 1 && this.l) {
                    g(getScrollX(), getScrollY());
                    float f = this.g.a;
                    float f2 = this.g.b;
                    g.b(this, f, f2);
                    this.l = false;
                    d(Math.round(f), Math.round(f2));
                }
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.ScrollView
    public final boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.p || !(keyCode == 19 || keyCode == 20)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    public final void setRemoveClippedSubviews(boolean z) {
        if (z && this.j == null) {
            this.j = new Rect();
        }
        this.o = z;
        updateClippingRect();
    }

    @Override // com.facebook.react.uimanager.y
    public final boolean getRemoveClippedSubviews() {
        return this.o;
    }

    @Override // com.facebook.react.uimanager.y
    public final void updateClippingRect() {
        if (this.o) {
            com.facebook.infer.annotation.a.a(this.j);
            z.a(this, this.j);
            View childAt = getChildAt(0);
            if (childAt instanceof y) {
                ((y) childAt).updateClippingRect();
            }
        }
    }

    @Override // com.facebook.react.uimanager.y
    public final void getClippingRect(Rect rect) {
        rect.set((Rect) com.facebook.infer.annotation.a.a(this.j));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean getChildVisibleRect(View view, Rect rect, Point point) {
        if (com.facebook.react.config.a.g) {
            return z.a(view, rect, point, this, this.k);
        }
        return super.getChildVisibleRect(view, rect, point);
    }

    @Override // android.widget.ScrollView
    public final void fling(int i) {
        float signum = Math.signum(this.e.b);
        if (signum == 0.0f) {
            signum = Math.signum(i);
        }
        int abs = (int) (Math.abs(i) * signum);
        if (this.m) {
            c(abs);
        } else if (this.f != null) {
            this.f.fling(getScrollX(), getScrollY(), 0, abs, 0, 0, 0, Integer.MAX_VALUE, 0, ((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
            ViewCompat.postInvalidateOnAnimation(this);
        } else {
            super.fling(abs);
        }
        d(0, abs);
    }

    private void b() {
        if (c()) {
            com.facebook.infer.annotation.a.a(this.r);
            com.facebook.infer.annotation.a.a(this.s);
        }
    }

    private boolean c() {
        return (this.r == null || this.s == null || this.s.isEmpty()) ? false : true;
    }

    private int getMaxScrollY() {
        return Math.max(0, this.B.getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void draw(Canvas canvas) {
        char c2 = 0;
        if (this.u != 0) {
            View childAt = getChildAt(0);
            if (this.t != null && childAt != null && childAt.getBottom() < getHeight()) {
                this.t.setBounds(0, childAt.getBottom(), getWidth(), getHeight());
                this.t.draw(canvas);
            }
        }
        getDrawingRect(this.h);
        String str = this.k;
        if (((str.hashCode() == 466743410 && str.equals("visible")) ? (char) 65535 : (char) 65535) != 0) {
            canvas.clipRect(this.h);
        }
        super.draw(canvas);
    }

    private void d(int i, int i2) {
        if ((this.q || this.m || c()) && this.n == null) {
            if (this.q) {
                b();
                g.a((ViewGroup) this, i, i2);
            }
            this.i = false;
            this.n = new Runnable() { // from class: com.facebook.react.views.scroll.e.1
                private boolean b = false;

                @Override // java.lang.Runnable
                public final void run() {
                    if (!e.this.i) {
                        e.this.g(e.this.getScrollX(), e.this.getScrollY());
                        if (!e.this.m || this.b) {
                            if (e.this.q) {
                                g.a(e.this, i.MOMENTUM_END, 0.0f, 0.0f);
                            }
                            e.a(e.this, (Runnable) null);
                            e.d(e.this);
                            return;
                        }
                        this.b = true;
                        e.this.c(0);
                        ViewCompat.postOnAnimationDelayed(e.this, this, 20L);
                        return;
                    }
                    e.a(e.this, false);
                    ViewCompat.postOnAnimationDelayed(e.this, this, 20L);
                }
            };
            ViewCompat.postOnAnimationDelayed(this, this.n, 20L);
        }
    }

    private int a(int i) {
        OverScroller overScroller = new OverScroller(getContext());
        overScroller.setFriction(1.0f - this.x);
        overScroller.fling(getScrollX(), getScrollY(), 0, i, 0, 0, 0, getMaxScrollY(), 0, ((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
        return overScroller.getFinalY();
    }

    private void b(int i) {
        double snapInterval = getSnapInterval();
        double scrollY = getScrollY();
        double d2 = scrollY / snapInterval;
        int floor = (int) Math.floor(d2);
        int ceil = (int) Math.ceil(d2);
        int round = (int) Math.round(d2);
        int round2 = (int) Math.round(a(i) / snapInterval);
        if (i > 0 && ceil == floor) {
            ceil++;
        } else if (i < 0 && floor == ceil) {
            floor--;
        }
        if (i > 0 && round < ceil && round2 > floor) {
            round = ceil;
        } else if (i < 0 && round > floor && round2 < ceil) {
            round = floor;
        }
        double d3 = round * snapInterval;
        if (d3 != scrollY) {
            this.i = true;
            e(getScrollX(), (int) d3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        int floor;
        int min;
        int i2;
        int i3;
        int i4;
        if (getChildCount() <= 0) {
            return;
        }
        if (this.w == 0 && this.y == null) {
            b(i);
            return;
        }
        int maxScrollY = getMaxScrollY();
        int a = a(i);
        if (this.v) {
            a = getScrollY();
        }
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (this.y != null) {
            int intValue = this.y.get(0).intValue();
            int intValue2 = this.y.get(this.y.size() - 1).intValue();
            int i5 = maxScrollY;
            int i6 = 0;
            for (int i7 = 0; i7 < this.y.size(); i7++) {
                int intValue3 = this.y.get(i7).intValue();
                if (intValue3 <= a && a - intValue3 < a - i6) {
                    i6 = intValue3;
                }
                if (intValue3 >= a && intValue3 - a < i5 - a) {
                    i5 = intValue3;
                }
            }
            i2 = intValue2;
            min = i5;
            int i8 = i6;
            i3 = intValue;
            floor = i8;
        } else {
            double snapInterval = getSnapInterval();
            double d2 = a / snapInterval;
            floor = (int) (Math.floor(d2) * snapInterval);
            min = Math.min((int) (Math.ceil(d2) * snapInterval), maxScrollY);
            i2 = maxScrollY;
            i3 = 0;
        }
        int i9 = a - floor;
        int i10 = min - a;
        int i11 = i9 < i10 ? floor : min;
        if (!this.A && a >= i2) {
            if (getScrollY() < i2) {
                i4 = i;
                a = i2;
            }
            i4 = i;
        } else if (!this.z && a <= i3) {
            if (getScrollY() > i3) {
                i4 = i;
                a = i3;
            }
            i4 = i;
        } else if (i > 0) {
            i4 = i + ((int) (i10 * 10.0d));
            a = min;
        } else if (i < 0) {
            i4 = i - ((int) (i9 * 10.0d));
            a = floor;
        } else {
            i4 = i;
            a = i11;
        }
        int min2 = Math.min(Math.max(0, a), maxScrollY);
        if (this.f != null) {
            this.i = true;
            OverScroller overScroller = this.f;
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            if (i4 == 0) {
                i4 = min2 - getScrollY();
            }
            overScroller.fling(scrollX, scrollY, 0, i4, 0, 0, min2, min2, 0, (min2 == 0 || min2 == maxScrollY) ? height / 2 : 0);
            postInvalidateOnAnimation();
            return;
        }
        e(getScrollX(), min2);
    }

    private int getSnapInterval() {
        if (this.w != 0) {
            return this.w;
        }
        return getHeight();
    }

    public final void setEndFillColor(int i) {
        if (i != this.u) {
            this.u = i;
            this.t = new ColorDrawable(this.u);
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    protected final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        int maxScrollY;
        if (this.f != null && this.B != null && !this.f.isFinished() && this.f.getCurrY() != this.f.getFinalY() && i2 >= (maxScrollY = getMaxScrollY())) {
            this.f.abortAnimation();
            i2 = maxScrollY;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        this.B = view2;
        this.B.addOnLayoutChangeListener(this);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        this.B.removeOnLayoutChangeListener(this);
        this.B = null;
    }

    private void e(int i, int i2) {
        smoothScrollTo(i, i2);
        g(i, i2);
    }

    private void f(int i, int i2) {
        scrollTo(i, i2);
        g(i, i2);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.B == null) {
            return;
        }
        int scrollY = getScrollY();
        int maxScrollY = getMaxScrollY();
        if (scrollY > maxScrollY) {
            f(getScrollX(), maxScrollY);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.a.a(i);
    }

    public final void setBorderRadius(float f) {
        this.a.a(f);
    }

    public final void setBorderStyle(@Nullable String str) {
        this.a.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i, int i2) {
        if (this.b == null) {
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putDouble("contentOffsetLeft", w.c(i));
        writableNativeMap.putDouble("contentOffsetTop", w.c(i2));
    }

    public final void a(int i, int i2) {
        this.E = i;
        this.F = i2;
        if (this.D) {
            try {
                ad.a(View.class, this, "mScrollX", Integer.valueOf(i));
                ad.a(View.class, this, "mScrollY", Integer.valueOf(i2));
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (this.o) {
                updateClippingRect();
            }
            invalidate();
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void computeScroll() {
        super.computeScroll();
        if (this.D && this.f != null && this.C && this.f.isFinished()) {
            if (this.q) {
                g.a(this, i.MOMENTUM_END, 0.0f, 0.0f);
            }
            this.C = false;
        }
    }

    public final void b(int i, int i2) {
        smoothScrollTo(i, i2);
        if (this.D) {
            try {
                if (getScrollX() == i && getScrollY() == i2) {
                    return;
                }
                this.C = true;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void c(int i, int i2) {
        scrollTo(i, i2);
        if (this.D && this.q) {
            g.a(this, i.MOMENTUM_END, 0.0f, 0.0f);
        }
    }

    public final void setEnableExperimentalFeature(boolean z) {
        this.D = z;
        if (this.E >= 0 || this.F >= 0) {
            a(this.E, this.F);
        }
    }

    public final void setScrollHitSlopRect(@Nullable Rect rect) {
        if (rect != null) {
            this.G = new Handler(Looper.getMainLooper()) { // from class: com.facebook.react.views.scroll.e.2
                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    if (message.what == 1) {
                        try {
                            e.b(e.this, message.arg1, message.arg2);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                }
            };
        } else {
            this.G = null;
        }
        this.H = rect;
        this.J = new Rect(this.H);
    }

    @Override // com.facebook.react.touch.c
    public final Rect getHitSlopRect() {
        return this.J;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (view2 != null) {
            Rect rect = new Rect();
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
            if (computeScrollDeltaToGetChildRectOnScreen != 0) {
                scrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
            }
        }
        super.requestChildFocus(view, view2);
    }

    static /* synthetic */ void d(e eVar) {
        if (eVar.c()) {
            com.facebook.infer.annotation.a.a(eVar.r);
            com.facebook.infer.annotation.a.a(eVar.s);
        }
    }

    static /* synthetic */ void b(e eVar, int i, int i2) {
        if (eVar.H == null || eVar.J == null) {
            return;
        }
        eVar.J.top = eVar.H.top + i2;
    }
}
