package com.meituan.msc.views.scroll;

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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends HorizontalScrollView implements v {
    public static ChangeQuickRedirect a = null;
    @Nullable
    private static Field f = null;
    private static boolean g = false;
    private float A;
    @Nullable
    private List<Integer> B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private int H;
    private int I;
    private final Rect J;
    com.meituan.msc.views.view.e b;
    @Nullable
    ai c;
    float d;
    float e;
    private final b h;
    @Nullable
    private final OverScroller i;
    private final VelocityHelper j;
    private final Rect k;
    private boolean l;
    @Nullable
    private Rect m;
    @Nullable
    private String n;
    private boolean o;
    private boolean p;
    @Nullable
    private Runnable q;
    private boolean r;
    private boolean s;
    private boolean t;
    @Nullable
    private a u;
    @Nullable
    private String v;
    @Nullable
    private Drawable w;
    private int x;
    private boolean y;
    private int z;

    public static /* synthetic */ Runnable a(d dVar, Runnable runnable) {
        dVar.q = null;
        return null;
    }

    public static /* synthetic */ boolean a(d dVar, boolean z) {
        dVar.l = false;
        return false;
    }

    public static /* synthetic */ void d(d dVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "87056adc1f81c8e53ae57e4cfa8d9344", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "87056adc1f81c8e53ae57e4cfa8d9344");
        } else if (dVar.c()) {
            com.facebook.infer.annotation.a.a(dVar.u);
            com.facebook.infer.annotation.a.a(dVar.v);
        }
    }

    public d(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94e700f7fe922d60c95d40d3b2661bc1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94e700f7fe922d60c95d40d3b2661bc1");
        }
    }

    public d(Context context, @Nullable a aVar) {
        super(context);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bdcae2547c01cf7f85eec57b13bb1ac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bdcae2547c01cf7f85eec57b13bb1ac");
            return;
        }
        this.h = new b();
        this.j = new VelocityHelper(getContext());
        this.k = new Rect();
        this.n = "hidden";
        this.p = false;
        this.s = true;
        this.u = null;
        this.x = 0;
        this.y = false;
        this.z = 0;
        this.A = 0.985f;
        this.C = true;
        this.D = true;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = -1;
        this.I = -1;
        this.d = 0.0f;
        this.e = 0.0f;
        this.J = new Rect();
        if (context instanceof ReactContext) {
            ((ReactContext) context).getRuntimeDelegate().addScrollVelocityHelper(this.j);
        }
        this.b = new com.meituan.msc.views.view.e(this);
        this.u = aVar;
        this.i = getOverScrollerFromParent();
    }

    @Nullable
    private OverScroller getOverScrollerFromParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcf533a8c842a358e71a0c092490e100", RobustBitConfig.DEFAULT_VALUE)) {
            return (OverScroller) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcf533a8c842a358e71a0c092490e100");
        }
        if (!g) {
            g = true;
            try {
                Field declaredField = HorizontalScrollView.class.getDeclaredField("mScroller");
                f = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                com.meituan.msc.modules.reporter.g.e("ReactNative", "Failed to get mScroller field for HorizontalScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        OverScroller overScroller = null;
        if (f != null) {
            try {
                Object obj = f.get(this);
                if (obj instanceof OverScroller) {
                    overScroller = (OverScroller) obj;
                } else {
                    com.meituan.msc.modules.reporter.g.e("ReactNative", "Failed to cast mScroller field in HorizontalScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Failed to get mScroller from HorizontalScrollView!", e);
            }
        }
        return overScroller;
    }

    public final void setScrollPerfTag(@Nullable String str) {
        this.v = str;
    }

    public final void setRemoveClippedSubviews(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c890c85721b5a7dc9d3b31426334401", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c890c85721b5a7dc9d3b31426334401");
            return;
        }
        if (z && this.m == null) {
            this.m = new Rect();
        }
        this.r = z;
        a();
    }

    @Override // com.meituan.msc.uimanager.v
    public final boolean getRemoveClippedSubviews() {
        return this.r;
    }

    public final void setDisableIntervalMomentum(boolean z) {
        this.y = z;
    }

    public final void setSendMomentumEvents(boolean z) {
        this.t = z;
    }

    public final void setScrollEnabled(boolean z) {
        this.s = z;
    }

    public final void setPagingEnabled(boolean z) {
        this.p = z;
    }

    public final void setDecelerationRate(float f2) {
        Object[] objArr = {Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d0226c9663143f728049df1ab484d79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d0226c9663143f728049df1ab484d79");
            return;
        }
        this.A = f2;
        if (this.i != null) {
            this.i.setFriction(1.0f - this.A);
        }
    }

    public final void setSnapInterval(int i) {
        this.z = i;
    }

    public final void setSnapOffsets(List<Integer> list) {
        this.B = list;
    }

    public final void setSnapToStart(boolean z) {
        this.C = z;
    }

    public final void setSnapToEnd(boolean z) {
        this.D = z;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b2a9ea02a8d5f6f6eba0fa294f23375", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b2a9ea02a8d5f6f6eba0fa294f23375");
        } else {
            awakenScrollBars();
        }
    }

    public final void setOverflow(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bd968b3daadcde533bb7930e0076a57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bd968b3daadcde533bb7930e0076a57");
            return;
        }
        this.n = str;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d024c7e35fa4888597a5c25b6d2b3684", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d024c7e35fa4888597a5c25b6d2b3684");
            return;
        }
        getDrawingRect(this.k);
        if (this.d > 0.0f) {
            this.k.left += Math.round(this.d);
        }
        if (this.e > 0.0f) {
            this.k.right -= Math.round(this.e);
        }
        String str = this.n;
        char c = 65535;
        if (str.hashCode() == 466743410 && str.equals("visible")) {
            c = 0;
        }
        if (c != 0) {
            canvas.clipRect(this.k);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b58ed48bf09b2189b0675c8fd4b9333", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b58ed48bf09b2189b0675c8fd4b9333");
            return;
        }
        l.a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1105dd75626638ad7fe1e3cd74751a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1105dd75626638ad7fe1e3cd74751a8");
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        Object[] objArr2 = {Integer.valueOf(scrollX), Integer.valueOf(scrollY)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ce1137b68cb08395b8564b63664baa7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ce1137b68cb08395b8564b63664baa7a");
            return;
        }
        scrollTo(scrollX, scrollY);
        f(scrollX, scrollY);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fadda9fa6cc25321f885e494daed8ea9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fadda9fa6cc25321f885e494daed8ea9");
            return;
        }
        if (view2 != null && !this.p) {
            Object[] objArr2 = {view2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fedc45cbee718fdd96543cbc6e690879", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fedc45cbee718fdd96543cbc6e690879");
            } else {
                int a2 = a(view2);
                if (a2 != 0) {
                    scrollBy(a2, 0);
                }
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        boolean z;
        Object[] objArr = {arrayList, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43ea3c2be8f30eabcb096f4bc0aa8089", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43ea3c2be8f30eabcb096f4bc0aa8089");
        } else if (this.p && !this.E) {
            ArrayList arrayList2 = new ArrayList();
            super.addFocusables(arrayList2, i, i2);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                if (!b(view)) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d62af9ee52f0af66a156bef1599f54b1", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d62af9ee52f0af66a156bef1599f54b1")).booleanValue();
                    } else {
                        int a2 = a(view);
                        view.getDrawingRect(this.J);
                        z = a2 != 0 && Math.abs(a2) < this.J.width();
                    }
                    if (!z && !view.isFocused()) {
                    }
                }
                arrayList.add(view);
            }
        } else {
            super.addFocusables(arrayList, i, i2);
        }
    }

    private int a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37b07f4bdef9fa2318a215a192076bba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37b07f4bdef9fa2318a215a192076bba")).intValue();
        }
        view.getDrawingRect(this.J);
        offsetDescendantRectToMyCoords(view, this.J);
        return computeScrollDeltaToGetChildRectOnScreen(this.J);
    }

    private boolean b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cb928cc1ad618286ae04ed84dc0fe54", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cb928cc1ad618286ae04ed84dc0fe54")).booleanValue() : a(view) == 0;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c42fce87043dc2b8d962ce88a7afe353", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c42fce87043dc2b8d962ce88a7afe353");
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        this.l = true;
        if (this.h.a(i, i2)) {
            if (this.r) {
                a();
            }
            g.a(this, this.h.b, this.h.c);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9926f8188002ab4b36146e0240f103b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9926f8188002ab4b36146e0240f103b")).booleanValue();
        }
        if (this.s) {
            try {
                if (super.onInterceptTouchEvent(motionEvent)) {
                    if (!this.G) {
                        com.meituan.msc.uimanager.events.d.a(this, motionEvent);
                    }
                    com.meituan.msc.uimanager.events.d.a(this, motionEvent);
                    g.a(this);
                    this.o = true;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "57495f0245ca84e9c02baa7bc6e76779", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "57495f0245ca84e9c02baa7bc6e76779");
                    } else if (c()) {
                        com.facebook.infer.annotation.a.a(this.u);
                        com.facebook.infer.annotation.a.a(this.v);
                    }
                    return true;
                }
            } catch (IllegalArgumentException e) {
                com.meituan.msc.modules.reporter.g.e("ReactNative", "Error intercepting touch event.", e);
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView
    public final boolean pageScroll(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd3cfe8fd1e758e5680f4177774d78a7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd3cfe8fd1e758e5680f4177774d78a7")).booleanValue();
        }
        boolean pageScroll = super.pageScroll(i);
        if (this.p && pageScroll) {
            d(0, 0);
        }
        return pageScroll;
    }

    @Override // android.widget.HorizontalScrollView
    public final boolean arrowScroll(int i) {
        boolean z;
        boolean z2 = true;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00b310333888d3bcb38640bfeabaf88c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00b310333888d3bcb38640bfeabaf88c")).booleanValue();
        }
        if (this.p) {
            this.E = true;
            if (getChildCount() > 0) {
                View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus(), i);
                View childAt = getChildAt(0);
                if (childAt != null && findNextFocus != null && findNextFocus.getParent() == childAt) {
                    if (!b(findNextFocus)) {
                        Object[] objArr2 = {findNextFocus};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6367b1c007ad05f70531ac7be493fda7", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6367b1c007ad05f70531ac7be493fda7")).booleanValue();
                        } else {
                            int a2 = a(findNextFocus);
                            findNextFocus.getDrawingRect(this.J);
                            z = a2 != 0 && Math.abs(a2) < this.J.width() / 2;
                        }
                        if (!z) {
                            c(i);
                        }
                    }
                    findNextFocus.requestFocus();
                } else {
                    c(i);
                }
            } else {
                z2 = false;
            }
            this.E = false;
            return z2;
        }
        return super.arrowScroll(i);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35e8e67da49728f8aeab7d6d225b7085", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35e8e67da49728f8aeab7d6d225b7085")).booleanValue();
        }
        if (this.s) {
            this.j.a(motionEvent);
            if ((motionEvent.getAction() & 255) == 1 && this.o) {
                f(getScrollX(), getScrollY());
                this.j.b();
                float f2 = this.j.b;
                float f3 = this.j.c;
                g.b(this, f2, f3);
                this.o = false;
                d(Math.round(f2), Math.round(f3));
            }
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView
    public final boolean executeKeyEvent(KeyEvent keyEvent) {
        Object[] objArr = {keyEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cde5fa2e39cfd55e81d98494fff732fc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cde5fa2e39cfd55e81d98494fff732fc")).booleanValue();
        }
        int keyCode = keyEvent.getKeyCode();
        if (this.s || !(keyCode == 21 || keyCode == 22)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView
    public final void fling(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ca98841f476aedb9614f3566999d294", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ca98841f476aedb9614f3566999d294");
            return;
        }
        int abs = (int) (Math.abs(i) * Math.signum(this.h.b));
        if (this.p) {
            b(abs);
        } else if (this.i != null) {
            this.i.fling(getScrollX(), getScrollY(), abs, 0, 0, Integer.MAX_VALUE, 0, 0, ((getWidth() - ViewCompat.getPaddingStart(this)) - ViewCompat.getPaddingEnd(this)) / 2, 0);
            ViewCompat.postInvalidateOnAnimation(this);
        } else {
            super.fling(abs);
        }
        d(abs, 0);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28f33df8c1c64ad5f2fea7cedec77314", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28f33df8c1c64ad5f2fea7cedec77314");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.r) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59bbdbff327a2ad1517cf83e220506c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59bbdbff327a2ad1517cf83e220506c7");
            return;
        }
        super.onAttachedToWindow();
        if (this.r) {
            a();
        }
    }

    @Override // com.meituan.msc.uimanager.v
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfc392340a01f1a94bbdbbf14d597b9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfc392340a01f1a94bbdbbf14d597b9e");
        } else if (this.r) {
            com.facebook.infer.annotation.a.a(this.m);
            w.a(this, this.m);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c30b9e7593ab2780801d2764c120037", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c30b9e7593ab2780801d2764c120037");
        } else {
            rect.set((Rect) com.facebook.infer.annotation.a.a(this.m));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean getChildVisibleRect(View view, Rect rect, Point point) {
        Object[] objArr = {view, rect, point};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09af9220d5d36a9beefb26761884f1c0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09af9220d5d36a9beefb26761884f1c0")).booleanValue();
        }
        if (com.meituan.msc.jse.config.a.g) {
            return w.a(view, rect, point, this, this.n);
        }
        return super.getChildVisibleRect(view, rect, point);
    }

    private int getSnapInterval() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4386106e9018292b2f39e3b37d12654", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4386106e9018292b2f39e3b37d12654")).intValue();
        }
        if (this.z != 0) {
            return this.z;
        }
        return getWidth();
    }

    public final void setEndFillColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "892fbf9d9dd594aa233ab10b574413ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "892fbf9d9dd594aa233ab10b574413ce");
        } else if (i != this.x) {
            this.x = i;
            this.w = new ColorDrawable(this.x);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        int computeHorizontalScrollRange;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7c05061689c2c5db5da998f493af319", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7c05061689c2c5db5da998f493af319");
            return;
        }
        if (this.i != null && !this.i.isFinished() && this.i.getCurrX() != this.i.getFinalX() && i >= (computeHorizontalScrollRange = computeHorizontalScrollRange() - getWidth())) {
            this.i.abortAnimation();
            i = computeHorizontalScrollRange;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    private boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de8ee42066e03ab789e08237f2453ff1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de8ee42066e03ab789e08237f2453ff1")).booleanValue() : (this.u == null || this.v == null || this.v.isEmpty()) ? false : true;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1fc9fcd8fd5e6c1560da5d55c6d0dab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1fc9fcd8fd5e6c1560da5d55c6d0dab");
            return;
        }
        if (this.x != 0) {
            View childAt = getChildAt(0);
            if (this.w != null && childAt != null && childAt.getRight() < getWidth()) {
                this.w.setBounds(childAt.getRight(), 0, getWidth(), getHeight());
                this.w.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    private void d(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cf341f471c3c940719130541d14837d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cf341f471c3c940719130541d14837d");
        } else if ((this.t || this.p || c()) && this.q == null) {
            if (this.t) {
                g.a((ViewGroup) this, i, i2);
            }
            this.l = false;
            this.q = new Runnable() { // from class: com.meituan.msc.views.scroll.d.1
                public static ChangeQuickRedirect a;
                private boolean c = false;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f0ba59e58e1ec6f88aa1c610f2ec7a80", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f0ba59e58e1ec6f88aa1c610f2ec7a80");
                    } else if (!d.this.l) {
                        d.this.f(d.this.getScrollX(), d.this.getScrollY());
                        if (!d.this.p || this.c) {
                            if (d.this.t) {
                                g.b(d.this);
                            }
                            d.a(d.this, (Runnable) null);
                            d.d(d.this);
                            return;
                        }
                        this.c = true;
                        d.this.b(0);
                        ViewCompat.postOnAnimationDelayed(d.this, this, 20L);
                    } else {
                        d.a(d.this, false);
                        ViewCompat.postOnAnimationDelayed(d.this, this, 20L);
                    }
                }
            };
            ViewCompat.postOnAnimationDelayed(this, this.q, 20L);
        }
    }

    private int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9bb5bd601fee4c9b241bb9ac4f3ca8a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9bb5bd601fee4c9b241bb9ac4f3ca8a")).intValue();
        }
        OverScroller overScroller = new OverScroller(getContext());
        overScroller.setFriction(1.0f - this.A);
        overScroller.fling(getScrollX(), getScrollY(), i, 0, 0, Math.max(0, computeHorizontalScrollRange() - getWidth()), 0, 0, ((getWidth() - ViewCompat.getPaddingStart(this)) - ViewCompat.getPaddingEnd(this)) / 2, 0);
        return overScroller.getFinalX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        int i2;
        int floor;
        int min;
        int i3;
        int i4;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dbb5daf2f462099756b903161320aed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dbb5daf2f462099756b903161320aed");
        } else if (getChildCount() > 0) {
            if (this.z == 0 && this.B == null) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e70b775aed7bd7f54c9f948c079d8c09", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e70b775aed7bd7f54c9f948c079d8c09");
                    return;
                }
                double snapInterval = getSnapInterval();
                double scrollX = getScrollX();
                double d = scrollX / snapInterval;
                int floor2 = (int) Math.floor(d);
                int ceil = (int) Math.ceil(d);
                int round = (int) Math.round(d);
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
                double d2 = floor2 * snapInterval;
                if (d2 != scrollX) {
                    this.l = true;
                    e((int) d2, getScrollY());
                    return;
                }
                return;
            }
            int max = Math.max(0, computeHorizontalScrollRange() - getWidth());
            int a2 = a(i);
            if (this.y) {
                a2 = getScrollX();
            }
            int width = (getWidth() - ViewCompat.getPaddingStart(this)) - ViewCompat.getPaddingEnd(this);
            boolean z = TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
            if (z) {
                a2 = max - a2;
                i2 = -i;
            } else {
                i2 = i;
            }
            if (this.B != null) {
                int intValue = this.B.get(0).intValue();
                i3 = this.B.get(this.B.size() - 1).intValue();
                int i5 = max;
                int i6 = 0;
                for (int i7 = 0; i7 < this.B.size(); i7++) {
                    int intValue2 = this.B.get(i7).intValue();
                    if (intValue2 <= a2 && a2 - intValue2 < a2 - i6) {
                        i6 = intValue2;
                    }
                    if (intValue2 >= a2 && intValue2 - a2 < i5 - a2) {
                        i5 = intValue2;
                    }
                }
                floor = i6;
                int i8 = i5;
                i4 = intValue;
                min = i8;
            } else {
                double snapInterval2 = getSnapInterval();
                double d3 = a2 / snapInterval2;
                floor = (int) (Math.floor(d3) * snapInterval2);
                min = Math.min((int) (Math.ceil(d3) * snapInterval2), max);
                i3 = max;
                i4 = 0;
            }
            int i9 = a2 - floor;
            int i10 = min - a2;
            int i11 = i9 < i10 ? floor : min;
            int scrollX2 = getScrollX();
            if (z) {
                scrollX2 = max - scrollX2;
            }
            if (!this.D && a2 >= i3) {
                if (scrollX2 < i3) {
                    i11 = i3;
                }
                i11 = a2;
            } else if (!this.C && a2 <= i4) {
                if (scrollX2 > i4) {
                    i11 = i4;
                }
                i11 = a2;
            } else if (i2 > 0) {
                i2 += (int) (i10 * 10.0d);
                i11 = min;
            } else if (i2 < 0) {
                i2 -= (int) (i9 * 10.0d);
                i11 = floor;
            }
            int min2 = Math.min(Math.max(0, i11), max);
            if (z) {
                min2 = max - min2;
                i2 = -i2;
            }
            if (this.i != null) {
                this.l = true;
                OverScroller overScroller = this.i;
                int scrollX3 = getScrollX();
                int scrollY = getScrollY();
                if (i2 == 0) {
                    i2 = min2 - getScrollX();
                }
                overScroller.fling(scrollX3, scrollY, i2, 0, min2, min2, 0, 0, (min2 == 0 || min2 == max) ? width / 2 : 0, 0);
                postInvalidateOnAnimation();
                return;
            }
            e(min2, getScrollY());
        }
    }

    private void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9211e710ca81470e967d5107e6bcdefe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9211e710ca81470e967d5107e6bcdefe");
            return;
        }
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
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5e2f0c75ee6752784914f6fc6187c35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5e2f0c75ee6752784914f6fc6187c35");
        } else {
            this.b.a(i);
        }
    }

    public final void setBorderRadius(float f2) {
        Object[] objArr = {Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9347b3e9614e8fc14677136d6d2f27d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9347b3e9614e8fc14677136d6d2f27d2");
        } else {
            this.b.a(f2);
        }
    }

    public final void setBorderStyle(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0d4ba7edaddc930cb438341e55fffae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0d4ba7edaddc930cb438341e55fffae");
        } else {
            this.b.a(str);
        }
    }

    private void e(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4839d9df961f38ec6007f1c20d5eee34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4839d9df961f38ec6007f1c20d5eee34");
            return;
        }
        smoothScrollTo(i, i2);
        f(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce2cbddda792432dd690e639695b6e58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce2cbddda792432dd690e639695b6e58");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86e8520276f72b841b068f14e24735d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86e8520276f72b841b068f14e24735d6");
            return;
        }
        this.H = i;
        this.I = i2;
        if (this.G) {
            try {
                com.meituan.msc.utils.c.a(View.class, this, "mScrollX", Integer.valueOf(i));
                com.meituan.msc.utils.c.a(View.class, this, "mScrollY", Integer.valueOf(i2));
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (this.r) {
                a();
            }
            invalidate();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void computeScroll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffe739011bbd3b8e83753692c1d38814", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffe739011bbd3b8e83753692c1d38814");
            return;
        }
        super.computeScroll();
        if (this.G && this.i != null && this.F && this.i.isFinished()) {
            if (this.t) {
                g.b(this);
            }
            this.F = false;
        }
    }

    public final void b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97d3814473f73391103c97f3c2e1a731", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97d3814473f73391103c97f3c2e1a731");
            return;
        }
        smoothScrollTo(i, i2);
        if (this.G) {
            if (getScrollX() == i && getScrollY() == i2) {
                return;
            }
            this.F = true;
        }
    }

    public final void c(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f81350f0d6eb24a96837be129b3e0cae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f81350f0d6eb24a96837be129b3e0cae");
            return;
        }
        scrollTo(i, i2);
        if (this.G && this.t) {
            g.b(this);
        }
    }

    public final void setEnableExperimentalFeature(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eab2c3754600a59d179fb8197e233df8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eab2c3754600a59d179fb8197e233df8");
            return;
        }
        this.G = z;
        if (this.H >= 0 || this.I >= 0) {
            a(this.H, this.I);
        }
    }
}
