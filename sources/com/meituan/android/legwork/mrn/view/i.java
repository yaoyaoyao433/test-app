package com.meituan.android.legwork.mrn.view;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.y;
import com.facebook.react.uimanager.z;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.util.List;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class i extends ScrollView implements View.OnLayoutChangeListener, ViewGroup.OnHierarchyChangeListener, y {
    public static ChangeQuickRedirect a = null;
    @Nullable
    private static Field c = null;
    private static boolean d = false;
    private View A;
    private boolean B;
    private boolean C;
    private int D;
    private int E;
    private int F;
    private a G;
    private String H;
    private View I;
    private View J;
    com.facebook.react.views.view.e b;
    private final com.facebook.react.views.scroll.b e;
    @Nullable
    private final OverScroller f;
    private final com.facebook.react.views.scroll.j g;
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
    private com.facebook.react.views.scroll.a r;
    @Nullable
    private String s;
    @Nullable
    private Drawable t;
    private int u;
    private int v;
    private float w;
    @Nullable
    private List<Integer> x;
    private boolean y;
    private boolean z;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
    }

    public static /* synthetic */ Runnable a(i iVar, Runnable runnable) {
        iVar.n = null;
        return null;
    }

    public static /* synthetic */ boolean a(i iVar, boolean z) {
        iVar.i = false;
        return false;
    }

    public static /* synthetic */ void d(i iVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, iVar, changeQuickRedirect, false, "7f900dfb704d1e23217cf80703fb4f07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, iVar, changeQuickRedirect, false, "7f900dfb704d1e23217cf80703fb4f07");
        } else if (iVar.c()) {
            com.facebook.infer.annotation.a.a(iVar.r);
            com.facebook.infer.annotation.a.a(iVar.s);
        }
    }

    public i(ReactContext reactContext) {
        this(reactContext, null);
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "940c59b6eb823f178d758b33f23b84d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "940c59b6eb823f178d758b33f23b84d0");
        }
    }

    public i(ReactContext reactContext, @Nullable com.facebook.react.views.scroll.a aVar) {
        super(reactContext);
        Object[] objArr = {reactContext, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "667c3a761a599a8b08b1b77d5f3c74a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "667c3a761a599a8b08b1b77d5f3c74a4");
            return;
        }
        this.e = new com.facebook.react.views.scroll.b();
        this.g = new com.facebook.react.views.scroll.j();
        this.h = new Rect();
        this.k = "hidden";
        this.m = false;
        this.p = true;
        this.r = null;
        this.u = 0;
        this.v = 0;
        this.w = 0.985f;
        this.y = true;
        this.z = true;
        this.B = false;
        this.C = false;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.H = "INTERCEPT_SCROLL_VIEW_TOUCH";
        this.r = aVar;
        this.b = new com.facebook.react.views.view.e(this);
        this.f = getOverScrollerFromParent();
        setOnHierarchyChangeListener(this);
        setScrollBarStyle(33554432);
    }

    @Nullable
    private OverScroller getOverScrollerFromParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ec19545ebe1a55c21cef9e62c2631f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (OverScroller) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ec19545ebe1a55c21cef9e62c2631f2");
        }
        if (!d) {
            d = true;
            try {
                Field declaredField = ScrollView.class.getDeclaredField("mScroller");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
        }
        if (c != null) {
            try {
                Object obj = c.get(this);
                if (obj instanceof OverScroller) {
                    return (OverScroller) obj;
                }
                return null;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Failed to get mScroller from ScrollView!", e);
            }
        }
        return null;
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

    public final void setTopIntercept(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7bf063e91f35471b8c7002277e5f654", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7bf063e91f35471b8c7002277e5f654");
            return;
        }
        this.F = (int) (i * com.facebook.react.uimanager.d.b().density);
        x.b("ReactTopScrollView.setTopIntercept()", "设置topIntercept: " + i);
    }

    public final void setPagingEnabled(boolean z) {
        this.m = z;
    }

    public final void setDecelerationRate(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b7b0960f088ff850243ae4082b608c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b7b0960f088ff850243ae4082b608c0");
            return;
        }
        this.w = f;
        if (this.f != null) {
            this.f.setFriction(1.0f - this.w);
        }
    }

    public final void setSnapInterval(int i) {
        this.v = i;
    }

    public final void setSnapOffsets(List<Integer> list) {
        this.x = list;
    }

    public final void setSnapToStart(boolean z) {
        this.y = z;
    }

    public final void setSnapToEnd(boolean z) {
        this.z = z;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6cb4ae9c685da7640f5b801501fea68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6cb4ae9c685da7640f5b801501fea68");
        } else {
            awakenScrollBars();
        }
    }

    public final void setOverflow(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03cc0c6b10c52dadc70857667fa3d86a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03cc0c6b10c52dadc70857667fa3d86a");
            return;
        }
        this.k = str;
        invalidate();
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b27181ac589ba13eaea0c012d7bb6be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b27181ac589ba13eaea0c012d7bb6be");
            return;
        }
        q.a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaadedb02cf7f80239e5fcde349c0580", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaadedb02cf7f80239e5fcde349c0580");
        } else {
            scrollTo(getScrollX(), getScrollY());
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d481237b0b18c3e3578048e2efcc9614", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d481237b0b18c3e3578048e2efcc9614");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.o) {
            updateClippingRect();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e38f93039511375e4a745bab96d9ca73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e38f93039511375e4a745bab96d9ca73");
            return;
        }
        super.onAttachedToWindow();
        if (this.o) {
            updateClippingRect();
        }
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2a43f45b7349f1342880e2d67fd04fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2a43f45b7349f1342880e2d67fd04fd");
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        this.i = true;
        if (this.e.a(i, i2)) {
            if (this.o) {
                updateClippingRect();
            }
            com.facebook.react.views.scroll.g.a(this, this.e.a(), this.e.b());
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c9cfab9e36514588a975b4bc6533b79", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c9cfab9e36514588a975b4bc6533b79")).booleanValue();
        }
        if (this.p) {
            try {
                if (super.onInterceptTouchEvent(motionEvent)) {
                    if (!this.C) {
                        com.facebook.react.uimanager.events.e.a(this, motionEvent);
                    }
                    com.facebook.react.views.scroll.g.a(this);
                    this.l = true;
                    b();
                    return true;
                }
            } catch (IllegalArgumentException e) {
                Log.w("ReactNative", "Error intercepting touch event.", e);
            }
            return false;
        }
        return false;
    }

    public final View getFirstChild() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f70a67b0d51d18ba7b1ffc6f7a284e36", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f70a67b0d51d18ba7b1ffc6f7a284e36");
        }
        if (this.I != null) {
            return this.I;
        }
        if (getChildCount() <= 0 || getChildAt(0) == null || !(getChildAt(0) instanceof ViewGroup) || ((ViewGroup) getChildAt(0)).getChildCount() <= 0 || ((ViewGroup) getChildAt(0)).getChildAt(0) == null) {
            this.I = null;
        } else {
            this.I = ((ViewGroup) getChildAt(0)).getChildAt(0);
        }
        return this.I;
    }

    @Override // android.widget.ScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5bcbb895da0dc85b4ae8d9731b46ef6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5bcbb895da0dc85b4ae8d9731b46ef6")).booleanValue();
        }
        if (this.p) {
            int scrollY = getScrollY();
            float rawY = motionEvent.getRawY();
            if (this.F > 0 && motionEvent.getAction() == 0 && rawY <= this.F - scrollY) {
                x.b("ReactTopScrollView.onTouchEvent()", String.format("topIntercept: %d scrollY: %d, touchY: %f", Integer.valueOf(this.F), Integer.valueOf(scrollY), Float.valueOf(rawY)));
                return false;
            }
            this.g.a(motionEvent);
            if ((motionEvent.getAction() & 255) == 1 && this.l) {
                float a2 = this.g.a();
                float b = this.g.b();
                com.facebook.react.views.scroll.g.b(this, a2, b);
                this.l = false;
                d(Math.round(a2), Math.round(b));
            }
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setRemoveClippedSubviews(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0303358b5528f548ab0826205422f50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0303358b5528f548ab0826205422f50");
            return;
        }
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
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a410126286efb91421ee1fca69d2f1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a410126286efb91421ee1fca69d2f1a");
        } else if (this.o) {
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
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edf8d761a497f894c089e6bc4d2c44a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edf8d761a497f894c089e6bc4d2c44a3");
        } else {
            rect.set((Rect) com.facebook.infer.annotation.a.a(this.j));
        }
    }

    @Override // android.widget.ScrollView
    public final void fling(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a99cd4e0d581318674769021e54641e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a99cd4e0d581318674769021e54641e");
            return;
        }
        float signum = Math.signum(this.e.b());
        if (signum == 0.0f) {
            signum = Math.signum(i);
        }
        int abs = (int) (Math.abs(i) * signum);
        if (this.m) {
            b(abs);
        } else if (this.f != null) {
            this.f.fling(getScrollX(), getScrollY(), 0, abs, 0, 0, 0, Integer.MAX_VALUE, 0, ((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
            ViewCompat.postInvalidateOnAnimation(this);
        } else {
            super.fling(abs);
        }
        d(0, abs);
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "958054f106fe92fd04cadc4cacfd6e08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "958054f106fe92fd04cadc4cacfd6e08");
        } else if (c()) {
            com.facebook.infer.annotation.a.a(this.r);
            com.facebook.infer.annotation.a.a(this.s);
        }
    }

    private boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2e310fcd338ee4cde98a4a51a37cdc5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2e310fcd338ee4cde98a4a51a37cdc5")).booleanValue() : (this.r == null || this.s == null || this.s.isEmpty()) ? false : true;
    }

    private int getMaxScrollY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3a297d4c3397d5d119f9919deeb1fa5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3a297d4c3397d5d119f9919deeb1fa5")).intValue() : Math.max(0, this.A.getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c09eb6d835751fbd3a0ab5bb2b8effc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c09eb6d835751fbd3a0ab5bb2b8effc4");
            return;
        }
        if (this.u != 0) {
            View childAt = getChildAt(0);
            if (this.t != null && childAt != null && childAt.getBottom() < getHeight()) {
                this.t.setBounds(0, childAt.getBottom(), getWidth(), getHeight());
                this.t.draw(canvas);
            }
        }
        getDrawingRect(this.h);
        String str = this.k;
        char c2 = 65535;
        if (str.hashCode() == 466743410 && str.equals("visible")) {
            c2 = 0;
        }
        if (c2 != 0) {
            canvas.clipRect(this.h);
        }
        super.draw(canvas);
    }

    private void d(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54d2100a6fd0ce7a3ba64e3a160ab454", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54d2100a6fd0ce7a3ba64e3a160ab454");
        } else if ((this.q || this.m || c()) && this.n == null) {
            if (this.q) {
                b();
                com.facebook.react.views.scroll.g.a((ViewGroup) this, i, i2);
            }
            this.i = false;
            this.n = new Runnable() { // from class: com.meituan.android.legwork.mrn.view.i.2
                public static ChangeQuickRedirect a;
                private boolean c = false;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "747896558aabfc18aa459cdb3c15e24e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "747896558aabfc18aa459cdb3c15e24e");
                    } else if (!i.this.i) {
                        if (!i.this.m || this.c) {
                            if (i.this.q) {
                                com.facebook.react.views.scroll.g.b(i.this);
                            }
                            i.a(i.this, (Runnable) null);
                            i.d(i.this);
                            return;
                        }
                        this.c = true;
                        i.this.b(0);
                        ViewCompat.postOnAnimationDelayed(i.this, this, 20L);
                    } else {
                        i.a(i.this, false);
                        ViewCompat.postOnAnimationDelayed(i.this, this, 20L);
                    }
                }
            };
            ViewCompat.postOnAnimationDelayed(this, this.n, 20L);
        }
    }

    private int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a249946283d3f7791fe57b24d85612c6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a249946283d3f7791fe57b24d85612c6")).intValue();
        }
        OverScroller overScroller = new OverScroller(getContext());
        overScroller.setFriction(1.0f - this.w);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "609fb779a018d08c518d539cc90464b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "609fb779a018d08c518d539cc90464b3");
        } else if (getChildCount() > 0) {
            if (this.v == 0 && this.x == null) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "87e94836c679eb0ba364a2230f7918f3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "87e94836c679eb0ba364a2230f7918f3");
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
                    this.i = true;
                    smoothScrollTo(getScrollX(), (int) d3);
                    return;
                }
                return;
            }
            int maxScrollY = getMaxScrollY();
            int a2 = a(i);
            int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (this.x != null) {
                int intValue = this.x.get(0).intValue();
                i2 = this.x.get(this.x.size() - 1).intValue();
                int i5 = maxScrollY;
                floor = 0;
                for (int i6 = 0; i6 < this.x.size(); i6++) {
                    int intValue2 = this.x.get(i6).intValue();
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
            if (!this.z && a2 >= i2) {
                if (getScrollY() < i2) {
                    i4 = i;
                    a2 = i2;
                }
                i4 = i;
            } else if (!this.y && a2 <= i3) {
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
            if (this.f != null) {
                this.i = true;
                OverScroller overScroller = this.f;
                int scrollX = getScrollX();
                int scrollY2 = getScrollY();
                if (i4 == 0) {
                    i4 = min2 - getScrollY();
                }
                overScroller.fling(scrollX, scrollY2, 0, i4, 0, 0, min2, min2, 0, (min2 == 0 || min2 == maxScrollY) ? height / 2 : 0);
                postInvalidateOnAnimation();
                return;
            }
            smoothScrollTo(getScrollX(), min2);
        }
    }

    private int getSnapInterval() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "262c3d907b8a02f1206cc54c3991492a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "262c3d907b8a02f1206cc54c3991492a")).intValue();
        }
        if (this.v != 0) {
            return this.v;
        }
        return getHeight();
    }

    public final void setEndFillColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed25e7013fcc410984d6fade7bb6193b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed25e7013fcc410984d6fade7bb6193b");
        } else if (i != this.u) {
            this.u = i;
            this.t = new ColorDrawable(this.u);
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        int maxScrollY;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2317529acb040fab3e8db9b198c2a09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2317529acb040fab3e8db9b198c2a09");
            return;
        }
        if (this.f != null && this.A != null && !this.f.isFinished() && this.f.getCurrY() != this.f.getFinalY() && i2 >= (maxScrollY = getMaxScrollY())) {
            this.f.abortAnimation();
            i2 = maxScrollY;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d2847bc0807eeab3cc05fadac9322aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d2847bc0807eeab3cc05fadac9322aa");
            return;
        }
        super.addView(view, i);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6778058d8123e86a237b5eeb024d1fcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6778058d8123e86a237b5eeb024d1fcd");
        } else {
            this.J = com.facebook.react.uimanager.util.a.a(this, this.H);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4d9699ce8e1b14bf72d10df88467ae76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4d9699ce8e1b14bf72d10df88467ae76");
        } else if (this.J instanceof com.facebook.react.views.view.f) {
            ((com.facebook.react.views.view.f) this.J).setOnInterceptTouchEventListener(new com.facebook.react.touch.b() { // from class: com.meituan.android.legwork.mrn.view.i.1
                public static ChangeQuickRedirect a;

                @Override // com.facebook.react.touch.b
                public final boolean a(ViewGroup viewGroup, MotionEvent motionEvent) {
                    Object[] objArr4 = {viewGroup, motionEvent};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2e1613df89d40c41e73a4ec745e50709", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2e1613df89d40c41e73a4ec745e50709")).booleanValue();
                    }
                    if (motionEvent.getAction() == 1) {
                        i.this.requestDisallowInterceptTouchEvent(false);
                    } else {
                        i.this.requestDisallowInterceptTouchEvent(true);
                    }
                    return false;
                }
            });
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00bdbbf4033a37d2215966a9b5dda6ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00bdbbf4033a37d2215966a9b5dda6ed");
            return;
        }
        this.A = view2;
        this.A.addOnLayoutChangeListener(this);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f8ce1898b3f970f411251ebc3433d23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f8ce1898b3f970f411251ebc3433d23");
            return;
        }
        this.A.removeOnLayoutChangeListener(this);
        this.A = null;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76092b921d23eede86569f3e6d2e15c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76092b921d23eede86569f3e6d2e15c0");
        } else if (this.A == null) {
        } else {
            int scrollY = getScrollY();
            int maxScrollY = getMaxScrollY();
            if (scrollY > maxScrollY) {
                scrollTo(getScrollX(), maxScrollY);
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e40a80791e5dcb3369d4486eddec93e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e40a80791e5dcb3369d4486eddec93e");
        } else {
            this.b.a(i);
        }
    }

    public final void setBorderRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5275509100fea6f6a78d989a0fa49172", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5275509100fea6f6a78d989a0fa49172");
        } else {
            this.b.a(f);
        }
    }

    public final void setBorderStyle(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1371864f0f7fe4e50dfb0dbf5e2f71f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1371864f0f7fe4e50dfb0dbf5e2f71f1");
        } else {
            this.b.a(str);
        }
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b822793705a1231ab4d14787eb4eaf38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b822793705a1231ab4d14787eb4eaf38");
            return;
        }
        this.D = i;
        this.E = i2;
        if (this.C) {
            try {
                a(View.class, this, "mScrollX", Integer.valueOf(i));
                a(View.class, this, "mScrollY", Integer.valueOf(i2));
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
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea6af1f22a65791cca06ee929cdddf65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea6af1f22a65791cca06ee929cdddf65");
            return;
        }
        super.computeScroll();
        if (this.C && this.f != null && this.B && this.f.isFinished()) {
            if (this.q) {
                com.facebook.react.views.scroll.g.b(this);
            }
            this.B = false;
        }
    }

    public final void b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a757bdb5c7140ef09ff4b0071f1a62e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a757bdb5c7140ef09ff4b0071f1a62e");
            return;
        }
        smoothScrollTo(i, i2);
        if (this.C) {
            try {
                if (getScrollX() == i && getScrollY() == i2) {
                    return;
                }
                this.B = true;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void c(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46816835ff93296254b5a459ed9902b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46816835ff93296254b5a459ed9902b4");
            return;
        }
        scrollTo(i, i2);
        if (this.C && this.q) {
            com.facebook.react.views.scroll.g.b(this);
        }
    }

    public final void setEnableExperimentalFeature(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32b0fe7736dbfa6e243b54c7688dbbe1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32b0fe7736dbfa6e243b54c7688dbbe1");
            return;
        }
        this.C = z;
        if (this.D >= 0 || this.E >= 0) {
            a(this.D, this.E);
        }
    }

    private static void a(Class<?> cls, Object obj, String str, Object obj2) throws Exception {
        Object[] objArr = {cls, obj, str, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "43034656bc6b00b71e74c8eab588f383", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "43034656bc6b00b71e74c8eab588f383");
            return;
        }
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        declaredField.set(obj, obj2);
    }

    public final void setReactTopScrollListener(a aVar) {
        this.G = aVar;
    }

    public final int getTopIntercept() {
        return this.F;
    }
}
