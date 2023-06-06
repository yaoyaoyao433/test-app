package com.meituan.msc.views.scroll;

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
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.ReactContext;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.msc.uimanager.ai;
import com.meituan.msc.uimanager.l;
import com.meituan.msc.uimanager.s;
import com.meituan.msc.uimanager.v;
import com.meituan.msc.uimanager.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e extends ScrollView implements View.OnLayoutChangeListener, ViewGroup.OnHierarchyChangeListener, com.meituan.msc.touch.c, v {
    public static ChangeQuickRedirect a = null;
    @Nullable
    private static Field d = null;
    private static boolean e = false;
    private boolean A;
    private boolean B;
    private View C;
    private boolean D;
    private boolean E;
    private int F;
    private int G;
    private Handler H;
    private Rect I;
    private boolean J;
    private Rect K;
    com.meituan.msc.views.view.e b;
    @Nullable
    ai c;
    private final b f;
    @Nullable
    private final OverScroller g;
    private final VelocityHelper h;
    private final Rect i;
    private boolean j;
    @Nullable
    private Rect k;
    @Nullable
    private String l;
    private boolean m;
    private boolean n;
    @Nullable
    private Runnable o;
    private boolean p;
    private boolean q;
    private boolean r;
    @Nullable
    private a s;
    @Nullable
    private String t;
    @Nullable
    private Drawable u;
    private int v;
    private boolean w;
    private int x;
    private float y;
    @Nullable
    private List<Integer> z;

    public static /* synthetic */ Runnable a(e eVar, Runnable runnable) {
        eVar.o = null;
        return null;
    }

    public static /* synthetic */ boolean a(e eVar, boolean z) {
        eVar.j = false;
        return false;
    }

    public static /* synthetic */ void b(e eVar, int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "8aaf95fb5fafdf76df0cc87c0e5ca875", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "8aaf95fb5fafdf76df0cc87c0e5ca875");
        } else if (eVar.I == null || eVar.K == null) {
        } else {
            eVar.K.top = eVar.I.top + i2;
        }
    }

    public static /* synthetic */ void d(e eVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "b11c1eabed0b459b6377448e58623403", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "b11c1eabed0b459b6377448e58623403");
        } else if (eVar.d()) {
            com.facebook.infer.annotation.a.a(eVar.s);
            com.facebook.infer.annotation.a.a(eVar.t);
        }
    }

    public e(ReactContext reactContext) {
        this(reactContext, null);
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c6640a6cec2b2fecbe32ee5b3ec52a2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c6640a6cec2b2fecbe32ee5b3ec52a2");
        }
    }

    public e(ReactContext reactContext, @Nullable a aVar) {
        super(reactContext);
        Object[] objArr = {reactContext, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcc418a0f517707f990a7dfc646eb4b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcc418a0f517707f990a7dfc646eb4b5");
            return;
        }
        this.f = new b();
        this.h = new VelocityHelper(getContext());
        this.i = new Rect();
        this.l = "hidden";
        this.n = false;
        this.q = true;
        this.s = null;
        this.v = 0;
        this.w = false;
        this.x = 0;
        this.y = 0.985f;
        this.A = true;
        this.B = true;
        this.D = false;
        this.E = false;
        this.F = -1;
        this.G = -1;
        this.J = false;
        this.s = aVar;
        this.b = new com.meituan.msc.views.view.e(this);
        this.g = getOverScrollerFromParent();
        setOnHierarchyChangeListener(this);
        setScrollBarStyle(33554432);
        reactContext.getRuntimeDelegate().addScrollVelocityHelper(this.h);
    }

    @Nullable
    private OverScroller getOverScrollerFromParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4551e7008bc1303c4c01ea4bb0a31d20", RobustBitConfig.DEFAULT_VALUE)) {
            return (OverScroller) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4551e7008bc1303c4c01ea4bb0a31d20");
        }
        if (!e) {
            e = true;
            try {
                Field declaredField = ScrollView.class.getDeclaredField("mScroller");
                d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                com.meituan.msc.modules.reporter.g.e("ReactNative", "Failed to get mScroller field for ScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        OverScroller overScroller = null;
        if (d != null) {
            try {
                Object obj = d.get(this);
                if (obj instanceof OverScroller) {
                    overScroller = (OverScroller) obj;
                } else {
                    com.meituan.msc.modules.reporter.g.e("ReactNative", "Failed to cast mScroller field in ScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
                }
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Failed to get mScroller from ScrollView!", e2);
            }
        }
        return overScroller;
    }

    public final void setDisableIntervalMomentum(boolean z) {
        this.w = z;
    }

    public final void setSendMomentumEvents(boolean z) {
        this.r = z;
    }

    public final void setScrollPerfTag(@Nullable String str) {
        this.t = str;
    }

    public final void setScrollEnabled(boolean z) {
        this.q = z;
    }

    public final void setPagingEnabled(boolean z) {
        this.n = z;
    }

    public final void setDecelerationRate(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cdb9740c8aaaae7af165a6c7e191629", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cdb9740c8aaaae7af165a6c7e191629");
            return;
        }
        this.y = f;
        if (this.g != null) {
            this.g.setFriction(1.0f - this.y);
        }
    }

    public final void setSnapInterval(int i) {
        this.x = i;
    }

    public final void setSnapOffsets(List<Integer> list) {
        this.z = list;
    }

    public final void setSnapToStart(boolean z) {
        this.A = z;
    }

    public final void setSnapToEnd(boolean z) {
        this.B = z;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a75bca18ecae842fe9fc9905b5bfee1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a75bca18ecae842fe9fc9905b5bfee1");
        } else {
            awakenScrollBars();
        }
    }

    public final void setOverflow(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed36966380579b0561b0abd598ee9d36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed36966380579b0561b0abd598ee9d36");
            return;
        }
        this.l = str;
        invalidate();
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc793238428639f55c96f6e22a87f774", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc793238428639f55c96f6e22a87f774");
            return;
        }
        l.a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55071de34c212130eb76d0d56ae041d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55071de34c212130eb76d0d56ae041d3");
        } else {
            f(getScrollX(), getScrollY());
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55e71b41724d50186283e22f0427a050", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55e71b41724d50186283e22f0427a050");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.p) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ee7f86de660b66e264ef29a865c41d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ee7f86de660b66e264ef29a865c41d2");
            return;
        }
        super.onAttachedToWindow();
        if (this.p) {
            a();
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00bf1a5b1721a24a9b4cc45c272b7c25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00bf1a5b1721a24a9b4cc45c272b7c25");
            return;
        }
        if (view2 != null) {
            Object[] objArr2 = {view2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2bea9a809c9f7393d3c79b7ad984ccdd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2bea9a809c9f7393d3c79b7ad984ccdd");
            } else {
                Rect rect = new Rect();
                view2.getDrawingRect(rect);
                offsetDescendantRectToMyCoords(view2, rect);
                int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
                if (computeScrollDeltaToGetChildRectOnScreen != 0) {
                    scrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
                }
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccde43c8ae96f130673f58ad36f3bbb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccde43c8ae96f130673f58ad36f3bbb5");
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        this.j = true;
        if (this.f.a(i, i2)) {
            if (this.p) {
                a();
            }
            g.a(this, this.f.b, this.f.c);
        }
        if (this.I == null || this.H == null) {
            return;
        }
        this.H.removeMessages(1);
        Message obtain = Message.obtain(this.H, 1);
        obtain.arg1 = i;
        obtain.arg2 = i2;
        this.H.sendMessageDelayed(obtain, 30L);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0bb9f959356ccc3a4b1c4901a97c65d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0bb9f959356ccc3a4b1c4901a97c65d")).booleanValue();
        }
        if (this.q) {
            if (this.I != null && motionEvent.getAction() == 0) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "19aa409b401da544b491397690f2b551", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "19aa409b401da544b491397690f2b551");
                } else {
                    Rect rect = this.K;
                    Object[] objArr3 = {motionEvent, rect};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "aeea7aad7dbb76e1466c1a10c6bf171d", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "aeea7aad7dbb76e1466c1a10c6bf171d")).booleanValue();
                    } else {
                        z = rect != null && (motionEvent.getX() < ((float) (-rect.left)) || motionEvent.getX() >= ((float) ((getRight() - getLeft()) + rect.right)) || motionEvent.getY() < ((float) (-rect.top)) || motionEvent.getY() >= ((float) ((getBottom() - getTop()) + rect.bottom)));
                    }
                    this.J = z;
                }
            }
            try {
                if (super.onInterceptTouchEvent(motionEvent)) {
                    if (!this.E) {
                        com.meituan.msc.uimanager.events.d.a(this, motionEvent);
                    }
                    com.meituan.msc.uimanager.events.d.a(this, motionEvent);
                    g.a(this);
                    this.m = true;
                    c();
                    return true;
                }
            } catch (IllegalArgumentException e2) {
                com.meituan.msc.modules.reporter.g.e("ReactNative", "Error intercepting touch event.", e2);
            }
            return this.I != null && this.J;
        }
        return false;
    }

    @Override // android.widget.ScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2a3c16fc3bb32bfe2d08c126910b9ef", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2a3c16fc3bb32bfe2d08c126910b9ef")).booleanValue();
        }
        if (this.q) {
            if (this.I == null || !this.J) {
                this.h.a(motionEvent);
                if ((motionEvent.getAction() & 255) == 1 && this.m) {
                    g(getScrollX(), getScrollY());
                    this.h.a();
                    float f = this.h.b;
                    float f2 = this.h.c;
                    g.b(this, f, f2);
                    this.m = false;
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
        Object[] objArr = {keyEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c2a80de4d995c5b4851a16be9d4273d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c2a80de4d995c5b4851a16be9d4273d")).booleanValue();
        }
        int keyCode = keyEvent.getKeyCode();
        if (this.q || !(keyCode == 19 || keyCode == 20)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    public final void setRemoveClippedSubviews(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ee2a7dd6730534d23039844dda38a95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ee2a7dd6730534d23039844dda38a95");
            return;
        }
        if (z && this.k == null) {
            this.k = new Rect();
        }
        this.p = z;
        a();
    }

    @Override // com.meituan.msc.uimanager.v
    public final boolean getRemoveClippedSubviews() {
        return this.p;
    }

    @Override // com.meituan.msc.uimanager.v
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d10803b4aa3a9fa11c204cc0a11ac7d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d10803b4aa3a9fa11c204cc0a11ac7d0");
        } else if (this.p) {
            com.facebook.infer.annotation.a.a(this.k);
            w.a(this, this.k);
            View childAt = getChildAt(0);
            if (childAt instanceof v) {
                ((v) childAt).a();
            }
        }
    }

    @Override // com.meituan.msc.uimanager.v
    public final void a(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18891b6edfc8b4d95451f3fc5b414038", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18891b6edfc8b4d95451f3fc5b414038");
        } else {
            rect.set((Rect) com.facebook.infer.annotation.a.a(this.k));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean getChildVisibleRect(View view, Rect rect, Point point) {
        Object[] objArr = {view, rect, point};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97df63d3339fbc5f15e9c3ac72c9faa4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97df63d3339fbc5f15e9c3ac72c9faa4")).booleanValue();
        }
        if (com.meituan.msc.jse.config.a.g) {
            return w.a(view, rect, point, this, this.l);
        }
        return super.getChildVisibleRect(view, rect, point);
    }

    @Override // android.widget.ScrollView
    public final void fling(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a74f8a7d18f91fbf44162400128a1b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a74f8a7d18f91fbf44162400128a1b9");
            return;
        }
        float signum = Math.signum(this.f.c);
        if (signum == 0.0f) {
            signum = Math.signum(i);
        }
        int abs = (int) (Math.abs(i) * signum);
        if (this.n) {
            b(abs);
        } else if (this.g != null) {
            this.g.fling(getScrollX(), getScrollY(), 0, abs, 0, 0, 0, Integer.MAX_VALUE, 0, ((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
            ViewCompat.postInvalidateOnAnimation(this);
        } else {
            super.fling(abs);
        }
        d(0, abs);
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7f1861c26a6221195f1dd4f322db8a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7f1861c26a6221195f1dd4f322db8a5");
        } else if (d()) {
            com.facebook.infer.annotation.a.a(this.s);
            com.facebook.infer.annotation.a.a(this.t);
        }
    }

    private boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcc1f072f29c9f2eaec546e92bac33ca", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcc1f072f29c9f2eaec546e92bac33ca")).booleanValue() : (this.s == null || this.t == null || this.t.isEmpty()) ? false : true;
    }

    private int getMaxScrollY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "944c2d8f80f700dda79705d3c234c6e7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "944c2d8f80f700dda79705d3c234c6e7")).intValue() : Math.max(0, this.C.getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b029fd568ef93df93c487f2dd4b7af7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b029fd568ef93df93c487f2dd4b7af7");
            return;
        }
        if (this.v != 0) {
            View childAt = getChildAt(0);
            if (this.u != null && childAt != null && childAt.getBottom() < getHeight()) {
                this.u.setBounds(0, childAt.getBottom(), getWidth(), getHeight());
                this.u.draw(canvas);
            }
        }
        getDrawingRect(this.i);
        String str = this.l;
        char c = 65535;
        if (str.hashCode() == 466743410 && str.equals("visible")) {
            c = 0;
        }
        if (c != 0) {
            canvas.clipRect(this.i);
        }
        super.draw(canvas);
    }

    private void d(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a645e38763d33504b38bdcb8d9d94517", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a645e38763d33504b38bdcb8d9d94517");
        } else if ((this.r || this.n || d()) && this.o == null) {
            if (this.r) {
                c();
                g.a((ViewGroup) this, i, i2);
            }
            this.j = false;
            this.o = new Runnable() { // from class: com.meituan.msc.views.scroll.e.1
                public static ChangeQuickRedirect a;
                private boolean c = false;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8d68ca71e24d61c8783beb5dc515c01a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8d68ca71e24d61c8783beb5dc515c01a");
                    } else if (!e.this.j) {
                        e.this.g(e.this.getScrollX(), e.this.getScrollY());
                        if (!e.this.n || this.c) {
                            if (e.this.r) {
                                g.b(e.this);
                            }
                            e.a(e.this, (Runnable) null);
                            e.d(e.this);
                            return;
                        }
                        this.c = true;
                        e.this.b(0);
                        ViewCompat.postOnAnimationDelayed(e.this, this, 20L);
                    } else {
                        e.a(e.this, false);
                        ViewCompat.postOnAnimationDelayed(e.this, this, 20L);
                    }
                }
            };
            ViewCompat.postOnAnimationDelayed(this, this.o, 20L);
        }
    }

    private int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6ac60fc9dac746f9228a05713963179", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6ac60fc9dac746f9228a05713963179")).intValue();
        }
        OverScroller overScroller = new OverScroller(getContext());
        overScroller.setFriction(1.0f - this.y);
        overScroller.fling(getScrollX(), getScrollY(), 0, i, 0, 0, 0, getMaxScrollY(), 0, ((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
        return overScroller.getFinalY();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        int floor;
        int min;
        int i2;
        int i3;
        int i4;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "970b63479b7a9550b9d08141a89a7705", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "970b63479b7a9550b9d08141a89a7705");
        } else if (getChildCount() > 0) {
            if (this.x == 0 && this.z == null) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d6f98a86655739ced5e870794210b2f3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d6f98a86655739ced5e870794210b2f3");
                    return;
                }
                double snapInterval = getSnapInterval();
                double scrollY = getScrollY();
                double d2 = scrollY / snapInterval;
                int floor2 = (int) Math.floor(d2);
                int ceil = (int) Math.ceil(d2);
                int round = (int) Math.round(d2);
                int round2 = (int) Math.round(a(i) / snapInterval);
                if (i > 0 && ceil == floor2) {
                    ceil++;
                } else if (i < 0 && floor2 == ceil) {
                    floor2--;
                }
                if (i > 0 && round < ceil && round2 > floor2) {
                    floor2 = ceil;
                } else if (i >= 0 || round <= floor2 || round2 >= ceil) {
                    floor2 = round;
                }
                double d3 = floor2 * snapInterval;
                if (d3 != scrollY) {
                    this.j = true;
                    e(getScrollX(), (int) d3);
                    return;
                }
                return;
            }
            int maxScrollY = getMaxScrollY();
            int a2 = a(i);
            if (this.w) {
                a2 = getScrollY();
            }
            int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (this.z != null) {
                int intValue = this.z.get(0).intValue();
                i2 = this.z.get(this.z.size() - 1).intValue();
                int i5 = maxScrollY;
                floor = 0;
                for (int i6 = 0; i6 < this.z.size(); i6++) {
                    int intValue2 = this.z.get(i6).intValue();
                    if (intValue2 <= a2 && a2 - intValue2 < a2 - floor) {
                        floor = intValue2;
                    }
                    if (intValue2 >= a2 && intValue2 - a2 < i5 - a2) {
                        i5 = intValue2;
                    }
                }
                i3 = intValue;
                min = i5;
            } else {
                double snapInterval2 = getSnapInterval();
                double d4 = a2 / snapInterval2;
                floor = (int) (Math.floor(d4) * snapInterval2);
                min = Math.min((int) (Math.ceil(d4) * snapInterval2), maxScrollY);
                i2 = maxScrollY;
                i3 = 0;
            }
            int i7 = a2 - floor;
            int i8 = min - a2;
            int i9 = i7 < i8 ? floor : min;
            if (!this.B && a2 >= i2) {
                if (getScrollY() < i2) {
                    i4 = i;
                    a2 = i2;
                }
                i4 = i;
            } else if (!this.A && a2 <= i3) {
                if (getScrollY() > i3) {
                    i4 = i;
                    a2 = i3;
                }
                i4 = i;
            } else if (i > 0) {
                i4 = i + ((int) (i8 * 10.0d));
                a2 = min;
            } else if (i < 0) {
                i4 = i - ((int) (i7 * 10.0d));
                a2 = floor;
            } else {
                i4 = i;
                a2 = i9;
            }
            int min2 = Math.min(Math.max(0, a2), maxScrollY);
            if (this.g != null) {
                this.j = true;
                OverScroller overScroller = this.g;
                int scrollX = getScrollX();
                int scrollY2 = getScrollY();
                if (i4 == 0) {
                    i4 = min2 - getScrollY();
                }
                overScroller.fling(scrollX, scrollY2, 0, i4, 0, 0, min2, min2, 0, (min2 == 0 || min2 == maxScrollY) ? height / 2 : 0);
                postInvalidateOnAnimation();
                return;
            }
            e(getScrollX(), min2);
        }
    }

    private int getSnapInterval() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f905f0a9172230192c9dd98908429fa3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f905f0a9172230192c9dd98908429fa3")).intValue();
        }
        if (this.x != 0) {
            return this.x;
        }
        return getHeight();
    }

    public final void setEndFillColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc92b735476d776f7864fcebe218b105", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc92b735476d776f7864fcebe218b105");
        } else if (i != this.v) {
            this.v = i;
            this.u = new ColorDrawable(this.v);
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        int maxScrollY;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fa3760dee4cb73424957798519bee07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fa3760dee4cb73424957798519bee07");
            return;
        }
        if (this.g != null && this.C != null && !this.g.isFinished() && this.g.getCurrY() != this.g.getFinalY() && i2 >= (maxScrollY = getMaxScrollY())) {
            this.g.abortAnimation();
            i2 = maxScrollY;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71eb6b7db8474482beec5e49b6781b28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71eb6b7db8474482beec5e49b6781b28");
            return;
        }
        this.C = view2;
        this.C.addOnLayoutChangeListener(this);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4853d26b368f315e380ad64353243a7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4853d26b368f315e380ad64353243a7e");
            return;
        }
        this.C.removeOnLayoutChangeListener(this);
        this.C = null;
    }

    private void e(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3772e521dccd397f4553cfb5411b5943", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3772e521dccd397f4553cfb5411b5943");
            return;
        }
        smoothScrollTo(i, i2);
        g(i, i2);
    }

    private void f(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0131b76c0f79fafdf1aef232a69e7f21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0131b76c0f79fafdf1aef232a69e7f21");
            return;
        }
        scrollTo(i, i2);
        g(i, i2);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4744badbb2483ad9bb7d8bb14d476030", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4744badbb2483ad9bb7d8bb14d476030");
        } else if (this.C == null) {
        } else {
            int scrollY = getScrollY();
            int maxScrollY = getMaxScrollY();
            if (scrollY > maxScrollY) {
                f(getScrollX(), maxScrollY);
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8ebaad1a64037eef452b0ead05be225", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8ebaad1a64037eef452b0ead05be225");
        } else {
            this.b.a(i);
        }
    }

    public final void setBorderRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bfcb05e8ec1cad33d0f3951aa50003f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bfcb05e8ec1cad33d0f3951aa50003f");
        } else {
            this.b.a(f);
        }
    }

    public final void setBorderStyle(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55b2b8ea6bf135db7acfc220f2b69f95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55b2b8ea6bf135db7acfc220f2b69f95");
        } else {
            this.b.a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8df54c42d9fdd9a2e9df352e3d37f82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8df54c42d9fdd9a2e9df352e3d37f82");
        } else if (this.c == null) {
        } else {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("contentOffsetLeft", s.c(i));
            createMap.putDouble("contentOffsetTop", s.c(i2));
        }
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "083627a2ec7bf0103b6e10dca2d02800", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "083627a2ec7bf0103b6e10dca2d02800");
            return;
        }
        this.F = i;
        this.G = i2;
        if (this.E) {
            try {
                com.meituan.msc.utils.c.a(View.class, this, "mScrollX", Integer.valueOf(i));
                com.meituan.msc.utils.c.a(View.class, this, "mScrollY", Integer.valueOf(i2));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (this.p) {
                a();
            }
            invalidate();
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void computeScroll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f0b5c62db846162900ea9a8bedd6775", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f0b5c62db846162900ea9a8bedd6775");
            return;
        }
        super.computeScroll();
        if (this.E && this.g != null && this.D && this.g.isFinished()) {
            if (this.r) {
                g.b(this);
            }
            this.D = false;
        }
    }

    public final void b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ee662836cc5dc3a6fc4b7c63de226b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ee662836cc5dc3a6fc4b7c63de226b2");
            return;
        }
        smoothScrollTo(i, i2);
        if (this.E) {
            try {
                if (getScrollX() == i && getScrollY() == i2) {
                    return;
                }
                this.D = true;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void c(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98fc877a7bb02f8d0a6a4033666c9e6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98fc877a7bb02f8d0a6a4033666c9e6d");
            return;
        }
        scrollTo(i, i2);
        if (this.E && this.r) {
            g.b(this);
        }
    }

    public final void setEnableExperimentalFeature(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "165d34b61229d8f54a8f0dec53eb20ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "165d34b61229d8f54a8f0dec53eb20ff");
            return;
        }
        this.E = z;
        if (this.F >= 0 || this.G >= 0) {
            a(this.F, this.G);
        }
    }

    public final void setScrollHitSlopRect(@Nullable Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b0c084e76981dbfa6896b1f6370c753", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b0c084e76981dbfa6896b1f6370c753");
            return;
        }
        if (rect != null) {
            this.H = new Handler(Looper.getMainLooper()) { // from class: com.meituan.msc.views.scroll.e.2
                public static ChangeQuickRedirect a;

                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    Object[] objArr2 = {message};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b50ef87a3faec864988c1a6d39c10850", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b50ef87a3faec864988c1a6d39c10850");
                    } else if (message.what == 1) {
                        try {
                            e.b(e.this, message.arg1, message.arg2);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                }
            };
        } else {
            this.H = null;
        }
        this.I = rect;
        this.K = new Rect(this.I);
    }

    @Override // com.meituan.msc.touch.c
    public final Rect getHitSlopRect() {
        return this.K;
    }
}
