package com.facebook.react.views.scroll;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v4.text.TextUtilsCompat;
import android.support.v4.view.ViewCompat;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.an;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.w;
import com.facebook.react.uimanager.y;
import com.facebook.react.uimanager.z;
import com.meituan.android.mrn.utils.ad;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d extends HorizontalScrollView implements y {
    @Nullable
    private static Field e = null;
    private static boolean f = false;
    @Nullable
    private List<Integer> A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private int G;
    private int H;
    private final Rect I;
    com.facebook.react.views.view.e a;
    @Nullable
    an b;
    float c;
    float d;
    private final b g;
    @Nullable
    private final OverScroller h;
    private final j i;
    private final Rect j;
    private boolean k;
    @Nullable
    private Rect l;
    @Nullable
    private String m;
    private boolean n;
    private boolean o;
    @Nullable
    private Runnable p;
    private boolean q;
    private boolean r;
    private boolean s;
    @Nullable
    private a t;
    @Nullable
    private String u;
    @Nullable
    private Drawable v;
    private int w;
    private boolean x;
    private int y;
    private float z;

    static /* synthetic */ Runnable a(d dVar, Runnable runnable) {
        dVar.p = null;
        return null;
    }

    static /* synthetic */ boolean a(d dVar, boolean z) {
        dVar.k = false;
        return false;
    }

    public d(Context context) {
        this(context, null);
    }

    public d(Context context, @Nullable a aVar) {
        super(context);
        this.g = new b();
        this.i = new j();
        this.j = new Rect();
        this.m = "hidden";
        this.o = false;
        this.r = true;
        this.t = null;
        this.w = 0;
        this.x = false;
        this.y = 0;
        this.z = 0.985f;
        this.B = true;
        this.C = true;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = -1;
        this.H = -1;
        this.c = 0.0f;
        this.d = 0.0f;
        this.I = new Rect();
        this.a = new com.facebook.react.views.view.e(this);
        this.t = aVar;
        this.h = getOverScrollerFromParent();
    }

    @Nullable
    private OverScroller getOverScrollerFromParent() {
        if (!f) {
            f = true;
            try {
                Field declaredField = HorizontalScrollView.class.getDeclaredField("mScroller");
                e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                com.facebook.common.logging.a.c("ReactNative", "Failed to get mScroller field for HorizontalScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        OverScroller overScroller = null;
        if (e != null) {
            try {
                Object obj = e.get(this);
                if (obj instanceof OverScroller) {
                    overScroller = (OverScroller) obj;
                } else {
                    com.facebook.common.logging.a.c("ReactNative", "Failed to cast mScroller field in HorizontalScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
                }
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Failed to get mScroller from HorizontalScrollView!", e2);
            }
        }
        return overScroller;
    }

    public final void setScrollPerfTag(@Nullable String str) {
        this.u = str;
    }

    public final void setRemoveClippedSubviews(boolean z) {
        if (z && this.l == null) {
            this.l = new Rect();
        }
        this.q = z;
        updateClippingRect();
    }

    @Override // com.facebook.react.uimanager.y
    public final boolean getRemoveClippedSubviews() {
        return this.q;
    }

    public final void setDisableIntervalMomentum(boolean z) {
        this.x = z;
    }

    public final void setSendMomentumEvents(boolean z) {
        this.s = z;
    }

    public final void setScrollEnabled(boolean z) {
        this.r = z;
    }

    public final void setPagingEnabled(boolean z) {
        this.o = z;
    }

    public final void setDecelerationRate(float f2) {
        this.z = f2;
        if (this.h != null) {
            this.h.setFriction(1.0f - this.z);
        }
    }

    public final void setSnapInterval(int i) {
        this.y = i;
    }

    public final void setSnapOffsets(List<Integer> list) {
        this.A = list;
    }

    public final void setSnapToStart(boolean z) {
        this.B = z;
    }

    public final void setSnapToEnd(boolean z) {
        this.C = z;
    }

    public final void a() {
        awakenScrollBars();
    }

    public final void setOverflow(String str) {
        this.m = str;
        invalidate();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        getDrawingRect(this.j);
        if (this.c > 0.0f) {
            this.j.left += Math.round(this.c);
        }
        if (this.d > 0.0f) {
            this.j.right -= Math.round(this.d);
        }
        String str = this.m;
        char c = 65535;
        if (str.hashCode() == 466743410 && str.equals("visible")) {
            c = 0;
        }
        if (c != 0) {
            canvas.clipRect(this.j);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        q.a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        scrollTo(scrollX, scrollY);
        f(scrollX, scrollY);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        int a;
        if (view2 != null && !this.o && (a = a(view2)) != 0) {
            scrollBy(a, 0);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (this.o && !this.D) {
            ArrayList arrayList2 = new ArrayList();
            super.addFocusables(arrayList2, i, i2);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                if (!b(view)) {
                    int a = a(view);
                    view.getDrawingRect(this.I);
                    if (!(a != 0 && Math.abs(a) < this.I.width()) && !view.isFocused()) {
                    }
                }
                arrayList.add(view);
            }
            return;
        }
        super.addFocusables(arrayList, i, i2);
    }

    private int a(View view) {
        view.getDrawingRect(this.I);
        offsetDescendantRectToMyCoords(view, this.I);
        return computeScrollDeltaToGetChildRectOnScreen(this.I);
    }

    private boolean b(View view) {
        return a(view) == 0;
    }

    @Override // android.view.View
    protected final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.k = true;
        if (this.g.a(i, i2)) {
            if (this.q) {
                updateClippingRect();
            }
            g.a(this, this.g.a, this.g.b);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.r) {
            try {
                if (super.onInterceptTouchEvent(motionEvent)) {
                    if (!this.F) {
                        com.facebook.react.uimanager.events.e.a(this, motionEvent);
                    }
                    com.facebook.react.uimanager.events.e.a(this, motionEvent);
                    g.a(this, i.BEGIN_DRAG, 0.0f, 0.0f);
                    this.n = true;
                    if (b()) {
                        com.facebook.infer.annotation.a.a(this.t);
                        com.facebook.infer.annotation.a.a(this.u);
                    }
                    return true;
                }
            } catch (IllegalArgumentException e2) {
                com.facebook.common.logging.a.c("ReactNative", "Error intercepting touch event.", e2);
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView
    public final boolean pageScroll(int i) {
        boolean pageScroll = super.pageScroll(i);
        if (this.o && pageScroll) {
            d(0, 0);
        }
        return pageScroll;
    }

    @Override // android.widget.HorizontalScrollView
    public final boolean arrowScroll(int i) {
        if (this.o) {
            boolean z = true;
            this.D = true;
            if (getChildCount() > 0) {
                View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus(), i);
                View childAt = getChildAt(0);
                if (childAt != null && findNextFocus != null && findNextFocus.getParent() == childAt) {
                    if (!b(findNextFocus)) {
                        int a = a(findNextFocus);
                        findNextFocus.getDrawingRect(this.I);
                        if (!(a != 0 && Math.abs(a) < this.I.width() / 2)) {
                            d(i);
                        }
                    }
                    findNextFocus.requestFocus();
                } else {
                    d(i);
                }
            } else {
                z = false;
            }
            this.D = false;
            return z;
        }
        return super.arrowScroll(i);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.r) {
            this.i.a(motionEvent);
            if ((motionEvent.getAction() & 255) == 1 && this.n) {
                f(getScrollX(), getScrollY());
                float f2 = this.i.a;
                float f3 = this.i.b;
                g.b(this, f2, f3);
                this.n = false;
                d(Math.round(f2), Math.round(f3));
            }
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView
    public final boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.r || !(keyCode == 21 || keyCode == 22)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView
    public final void fling(int i) {
        int abs = (int) (Math.abs(i) * Math.signum(this.g.a));
        if (this.o) {
            c(abs);
        } else if (this.h != null) {
            this.h.fling(getScrollX(), getScrollY(), abs, 0, 0, Integer.MAX_VALUE, 0, 0, ((getWidth() - ViewCompat.getPaddingStart(this)) - ViewCompat.getPaddingEnd(this)) / 2, 0);
            ViewCompat.postInvalidateOnAnimation(this);
        } else {
            super.fling(abs);
        }
        d(abs, 0);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.q) {
            updateClippingRect();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.q) {
            updateClippingRect();
        }
    }

    @Override // com.facebook.react.uimanager.y
    public final void updateClippingRect() {
        if (this.q) {
            com.facebook.infer.annotation.a.a(this.l);
            z.a(this, this.l);
            View childAt = getChildAt(0);
            if (childAt instanceof y) {
                ((y) childAt).updateClippingRect();
            }
        }
    }

    @Override // com.facebook.react.uimanager.y
    public final void getClippingRect(Rect rect) {
        rect.set((Rect) com.facebook.infer.annotation.a.a(this.l));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean getChildVisibleRect(View view, Rect rect, Point point) {
        if (com.facebook.react.config.a.g) {
            return z.a(view, rect, point, this, this.m);
        }
        return super.getChildVisibleRect(view, rect, point);
    }

    private int getSnapInterval() {
        if (this.y != 0) {
            return this.y;
        }
        return getWidth();
    }

    public final void setEndFillColor(int i) {
        if (i != this.w) {
            this.w = i;
            this.v = new ColorDrawable(this.w);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        int computeHorizontalScrollRange;
        if (this.h != null && !this.h.isFinished() && this.h.getCurrX() != this.h.getFinalX() && i >= (computeHorizontalScrollRange = computeHorizontalScrollRange() - getWidth())) {
            this.h.abortAnimation();
            i = computeHorizontalScrollRange;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    private boolean b() {
        return (this.t == null || this.u == null || this.u.isEmpty()) ? false : true;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void draw(Canvas canvas) {
        if (this.w != 0) {
            View childAt = getChildAt(0);
            if (this.v != null && childAt != null && childAt.getRight() < getWidth()) {
                this.v.setBounds(childAt.getRight(), 0, getWidth(), getHeight());
                this.v.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    private void d(int i, int i2) {
        if ((this.s || this.o || b()) && this.p == null) {
            if (this.s) {
                g.a((ViewGroup) this, i, i2);
            }
            this.k = false;
            this.p = new Runnable() { // from class: com.facebook.react.views.scroll.d.1
                private boolean b = false;

                @Override // java.lang.Runnable
                public final void run() {
                    if (!d.this.k) {
                        d.this.f(d.this.getScrollX(), d.this.getScrollY());
                        if (!d.this.o || this.b) {
                            if (d.this.s) {
                                g.a(d.this, i.MOMENTUM_END, 0.0f, 0.0f);
                            }
                            d.a(d.this, (Runnable) null);
                            d.d(d.this);
                            return;
                        }
                        this.b = true;
                        d.this.c(0);
                        ViewCompat.postOnAnimationDelayed(d.this, this, 20L);
                        return;
                    }
                    d.a(d.this, false);
                    ViewCompat.postOnAnimationDelayed(d.this, this, 20L);
                }
            };
            ViewCompat.postOnAnimationDelayed(this, this.p, 20L);
        }
    }

    private int a(int i) {
        OverScroller overScroller = new OverScroller(getContext());
        overScroller.setFriction(1.0f - this.z);
        overScroller.fling(getScrollX(), getScrollY(), i, 0, 0, Math.max(0, computeHorizontalScrollRange() - getWidth()), 0, 0, ((getWidth() - ViewCompat.getPaddingStart(this)) - ViewCompat.getPaddingEnd(this)) / 2, 0);
        return overScroller.getFinalX();
    }

    private void b(int i) {
        double snapInterval = getSnapInterval();
        double scrollX = getScrollX();
        double d = scrollX / snapInterval;
        int floor = (int) Math.floor(d);
        int ceil = (int) Math.ceil(d);
        int round = (int) Math.round(d);
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
        double d2 = round * snapInterval;
        if (d2 != scrollX) {
            this.k = true;
            e((int) d2, getScrollY());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        int i2;
        int min;
        int i3;
        int floor;
        int i4;
        if (getChildCount() <= 0) {
            return;
        }
        if (this.y == 0 && this.A == null) {
            b(i);
            return;
        }
        int max = Math.max(0, computeHorizontalScrollRange() - getWidth());
        int a = a(i);
        if (this.x) {
            a = getScrollX();
        }
        int width = (getWidth() - ViewCompat.getPaddingStart(this)) - ViewCompat.getPaddingEnd(this);
        boolean z = TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        if (z) {
            a = max - a;
            i2 = -i;
        } else {
            i2 = i;
        }
        if (this.A != null) {
            int intValue = this.A.get(0).intValue();
            i3 = this.A.get(this.A.size() - 1).intValue();
            int i5 = max;
            floor = 0;
            for (int i6 = 0; i6 < this.A.size(); i6++) {
                int intValue2 = this.A.get(i6).intValue();
                if (intValue2 <= a && a - intValue2 < a - floor) {
                    floor = intValue2;
                }
                if (intValue2 >= a && intValue2 - a < i5 - a) {
                    i5 = intValue2;
                }
            }
            i4 = intValue;
            min = i5;
        } else {
            double snapInterval = getSnapInterval();
            double d = a / snapInterval;
            min = Math.min((int) (Math.ceil(d) * snapInterval), max);
            i3 = max;
            floor = (int) (Math.floor(d) * snapInterval);
            i4 = 0;
        }
        int i7 = a - floor;
        int i8 = min - a;
        int i9 = i7 < i8 ? floor : min;
        int scrollX = getScrollX();
        if (z) {
            scrollX = max - scrollX;
        }
        if (!this.C && a >= i3) {
            if (scrollX < i3) {
                i9 = i3;
            }
            i9 = a;
        } else if (!this.B && a <= i4) {
            if (scrollX > i4) {
                i9 = i4;
            }
            i9 = a;
        } else if (i2 > 0) {
            i2 += (int) (i8 * 10.0d);
            i9 = min;
        } else if (i2 < 0) {
            i2 -= (int) (i7 * 10.0d);
            i9 = floor;
        }
        int min2 = Math.min(Math.max(0, i9), max);
        if (z) {
            min2 = max - min2;
            i2 = -i2;
        }
        if (this.h != null) {
            this.k = true;
            OverScroller overScroller = this.h;
            int scrollX2 = getScrollX();
            int scrollY = getScrollY();
            if (i2 == 0) {
                i2 = min2 - getScrollX();
            }
            overScroller.fling(scrollX2, scrollY, i2, 0, min2, min2, 0, 0, (min2 == 0 || min2 == max) ? width / 2 : 0, 0);
            postInvalidateOnAnimation();
            return;
        }
        e(min2, getScrollY());
    }

    private void d(int i) {
        int width = getWidth();
        int scrollX = getScrollX();
        int i2 = scrollX / width;
        if (scrollX % width != 0) {
            i2++;
        }
        int i3 = i == 17 ? i2 - 1 : i2 + 1;
        if (i3 < 0) {
            i3 = 0;
        }
        e(i3 * width, getScrollY());
        d(0, 0);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.a.a(i);
    }

    public final void setBorderRadius(float f2) {
        this.a.a(f2);
    }

    public final void setBorderStyle(@Nullable String str) {
        this.a.a(str);
    }

    private void e(int i, int i2) {
        smoothScrollTo(i, i2);
        f(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(int i, int i2) {
        if (this.b == null) {
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putDouble("contentOffsetLeft", w.c(i));
        writableNativeMap.putDouble("contentOffsetTop", w.c(i2));
    }

    public final void a(int i, int i2) {
        this.G = i;
        this.H = i2;
        if (this.F) {
            try {
                ad.a(View.class, this, "mScrollX", Integer.valueOf(i));
                ad.a(View.class, this, "mScrollY", Integer.valueOf(i2));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (this.q) {
                updateClippingRect();
            }
            invalidate();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void computeScroll() {
        super.computeScroll();
        if (this.F && this.h != null && this.E && this.h.isFinished()) {
            if (this.s) {
                g.a(this, i.MOMENTUM_END, 0.0f, 0.0f);
            }
            this.E = false;
        }
    }

    public final void b(int i, int i2) {
        smoothScrollTo(i, i2);
        if (this.F) {
            if (getScrollX() == i && getScrollY() == i2) {
                return;
            }
            this.E = true;
        }
    }

    public final void c(int i, int i2) {
        scrollTo(i, i2);
        if (this.F && this.s) {
            g.a(this, i.MOMENTUM_END, 0.0f, 0.0f);
        }
    }

    public final void setEnableExperimentalFeature(boolean z) {
        this.F = z;
        if (this.G >= 0 || this.H >= 0) {
            a(this.G, this.H);
        }
    }

    static /* synthetic */ void d(d dVar) {
        if (dVar.b()) {
            com.facebook.infer.annotation.a.a(dVar.t);
            com.facebook.infer.annotation.a.a(dVar.u);
        }
    }
}
