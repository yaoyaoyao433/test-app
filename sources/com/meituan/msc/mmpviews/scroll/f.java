package com.meituan.msc.mmpviews.scroll;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
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
import com.meituan.msc.views.scroll.VelocityHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class f extends ScrollView implements View.OnLayoutChangeListener, ViewGroup.OnHierarchyChangeListener, b, v {
    public static ChangeQuickRedirect a = null;
    @Nullable
    private static Field b = null;
    private static boolean c = false;
    private View A;
    @Nullable
    private ai B;
    private boolean C;
    private boolean D;
    private int E;
    private int F;
    private int G;
    private int H;
    private com.meituan.msc.mmpviews.shell.e I;
    private boolean J;
    private int K;
    private boolean L;
    private boolean M;
    private boolean N;
    private Context O;
    private final h d;
    @Nullable
    private final OverScroller e;
    private final VelocityHelper f;
    private final Rect g;
    private boolean h;
    @Nullable
    private Rect i;
    @Nullable
    private String j;
    private boolean k;
    private boolean l;
    @Nullable
    private Runnable m;
    private boolean n;
    private boolean o;
    private boolean p;
    @Nullable
    private a q;
    @Nullable
    private String r;
    @Nullable
    private Drawable s;
    private int t;
    private boolean u;
    private int v;
    private float w;
    @Nullable
    private List<Integer> x;
    private boolean y;
    private boolean z;

    @Override // com.meituan.msc.mmpviews.scroll.b
    public void setScrollLeft(double d) {
    }

    public static /* synthetic */ Runnable a(f fVar, Runnable runnable) {
        fVar.m = null;
        return null;
    }

    public static /* synthetic */ boolean a(f fVar, boolean z) {
        fVar.h = false;
        return false;
    }

    public static /* synthetic */ void d(f fVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "63e3628badd0d08b3c5383cd3bbf9b78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "63e3628badd0d08b3c5383cd3bbf9b78");
        } else if (fVar.c()) {
            com.facebook.infer.annotation.a.a(fVar.q);
            com.facebook.infer.annotation.a.a(fVar.r);
        }
    }

    public f(Context context, com.meituan.msc.mmpviews.shell.e eVar) {
        this(context, eVar, null);
        Object[] objArr = {context, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe4b17ddb6b8c6364bdcd6046ae00c58", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe4b17ddb6b8c6364bdcd6046ae00c58");
        }
    }

    private f(Context context, com.meituan.msc.mmpviews.shell.e eVar, @Nullable a aVar) {
        super(context);
        Object[] objArr = {context, eVar, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f952482173bef542135aa3cd523995f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f952482173bef542135aa3cd523995f");
            return;
        }
        this.d = new h();
        this.f = new VelocityHelper(getContext());
        this.g = new Rect();
        this.j = "hidden";
        this.l = false;
        this.o = true;
        this.q = null;
        this.t = 0;
        this.u = false;
        this.v = 0;
        this.w = 0.985f;
        this.y = true;
        this.z = true;
        this.C = false;
        this.D = false;
        this.E = -1;
        this.F = -1;
        this.K = -1;
        this.L = true;
        this.N = false;
        this.I = eVar;
        this.O = context;
        this.q = null;
        this.e = getOverScrollerFromParent();
        setOnHierarchyChangeListener(this);
        setScrollEnabled(true);
        setVerticalScrollBarEnabled(true);
        setScrollBarStyle(33554432);
        if (context instanceof ReactContext) {
            ((ReactContext) context).getRuntimeDelegate().addScrollVelocityHelper(this.f);
        }
    }

    @Nullable
    private OverScroller getOverScrollerFromParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03b6cd70639817aa8aa1b60b987d357c", RobustBitConfig.DEFAULT_VALUE)) {
            return (OverScroller) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03b6cd70639817aa8aa1b60b987d357c");
        }
        if (!c) {
            c = true;
            try {
                Field declaredField = ScrollView.class.getDeclaredField("mScroller");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                com.meituan.msc.modules.reporter.g.e("ReactNative", "Failed to get mScroller field for ScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        OverScroller overScroller = null;
        if (b != null) {
            try {
                Object obj = b.get(this);
                if (obj instanceof OverScroller) {
                    overScroller = (OverScroller) obj;
                } else {
                    com.meituan.msc.modules.reporter.g.e("ReactNative", "Failed to cast mScroller field in ScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Failed to get mScroller from ScrollView!", e);
            }
        }
        return overScroller;
    }

    public void setDisableIntervalMomentum(boolean z) {
        this.u = z;
    }

    public void setSendMomentumEvents(boolean z) {
        this.p = z;
    }

    public void setScrollPerfTag(@Nullable String str) {
        this.r = str;
    }

    @Override // com.meituan.msc.mmpviews.scroll.b
    public void setScrollEnabled(boolean z) {
        this.o = z;
    }

    @Override // com.meituan.msc.mmpviews.scroll.b
    public void setUpperThreshold(int i) {
        this.G = i;
    }

    @Override // com.meituan.msc.mmpviews.scroll.b
    public void setLowerThreshold(int i) {
        this.H = i;
    }

    @Override // com.meituan.msc.mmpviews.scroll.b
    public void setScrollTop(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccdc43434a98bba1e6cd76ed06d82c1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccdc43434a98bba1e6cd76ed06d82c1d");
            return;
        }
        int scrollX = getScrollX();
        int round = Math.round(s.a(d));
        if (!this.J) {
            Object[] objArr2 = {Integer.valueOf(scrollX), Integer.valueOf(round)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "42be6247598233e8a43f492739aff764", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "42be6247598233e8a43f492739aff764");
                return;
            }
            scrollTo(scrollX, round);
            boolean z = this.D;
            return;
        }
        Object[] objArr3 = {Integer.valueOf(scrollX), Integer.valueOf(round)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "aff1eb46b69498f9dbb645599d446abd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "aff1eb46b69498f9dbb645599d446abd");
            return;
        }
        smoothScrollTo(scrollX, round);
        if (this.D) {
            try {
                if (getScrollX() == scrollX && getScrollY() == round) {
                    return;
                }
                this.C = true;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.meituan.msc.mmpviews.scroll.b
    public void setScrollWithAnimation(boolean z) {
        this.J = z;
    }

    @Override // com.meituan.msc.mmpviews.scroll.b
    public void setShowScrollbar(boolean z) {
        boolean z2 = true;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83232c2f410a613e3f5748854643e468", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83232c2f410a613e3f5748854643e468");
            return;
        }
        this.L = z;
        if (this.M && !z) {
            z2 = false;
        }
        setVerticalScrollBarEnabled(z2);
    }

    @Override // com.meituan.msc.mmpviews.scroll.b
    public void setEnhanced(boolean z) {
        boolean z2 = true;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "746f3b01f139462d0472da66bb64df9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "746f3b01f139462d0472da66bb64df9a");
            return;
        }
        this.M = z;
        if (z && !this.L) {
            z2 = false;
        }
        setVerticalScrollBarEnabled(z2);
    }

    public void setPagingEnabled(boolean z) {
        this.l = z;
    }

    public void setDecelerationRate(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ef492e9440d3cda19e3a7b25f2a915f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ef492e9440d3cda19e3a7b25f2a915f");
            return;
        }
        this.w = f;
        if (this.e != null) {
            this.e.setFriction(1.0f - this.w);
        }
    }

    public void setSnapInterval(int i) {
        this.v = i;
    }

    public void setSnapOffsets(List<Integer> list) {
        this.x = list;
    }

    public void setSnapToStart(boolean z) {
        this.y = z;
    }

    public void setSnapToEnd(boolean z) {
        this.z = z;
    }

    public void setOverflow(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dd895a44dcf77284e780ee26365930e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dd895a44dcf77284e780ee26365930e");
            return;
        }
        this.j = str;
        invalidate();
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c99d3feb7431b4dc56569808c09c417c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c99d3feb7431b4dc56569808c09c417c");
            return;
        }
        l.a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed7e0e706bef3f8e53b07f635b0da68c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed7e0e706bef3f8e53b07f635b0da68c");
        } else {
            a(getScrollX(), getScrollY());
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "672d7f52c37b559aa2c84931d53a34a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "672d7f52c37b559aa2c84931d53a34a9");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.n) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5d6836e88748176b0f722cc9b0318a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5d6836e88748176b0f722cc9b0318a3");
            return;
        }
        super.onAttachedToWindow();
        if (this.n) {
            a();
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "503a57d2d0c28dd5654f847990ac0673", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "503a57d2d0c28dd5654f847990ac0673");
            return;
        }
        if (view2 != null) {
            Object[] objArr2 = {view2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5554a5f785ef5316f25fa18574cf1e50", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5554a5f785ef5316f25fa18574cf1e50");
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
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a3b606dfd097154ffe0fd9356297059", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a3b606dfd097154ffe0fd9356297059");
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        this.h = true;
        if (this.d.a(i, i2)) {
            if (this.n) {
                a();
            }
            if (getScrollY() <= this.G && i4 - i2 > 1) {
                g.a(getViewTag(), this);
            }
            if (getChildAt(0) != null && getScrollY() >= (getChildAt(0).getBottom() - getHeight()) - this.H && i2 - i4 > 1) {
                g.b(getViewTag(), this);
            }
            if (this.K == -1) {
                this.K = i4;
            }
            g.a(getViewTag(), this, 0.0f, this.K - getScrollY());
            if (!this.N) {
                if (this.O instanceof ReactContext) {
                    ((ReactContext) this.O).getUIManagerModule().c.a(8, "triggered by ScrollView scroll");
                    this.N = true;
                } else {
                    com.meituan.msc.modules.reporter.g.a("[MPScrollView@onScrollChanged]", "sentCurrentScrollEventToInteractionMonitor but scrollview context is not a ReactContext");
                }
            }
            this.K = getScrollY();
        }
    }

    private int getViewTag() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c604f1fde76404312a41d7d2d719eba7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c604f1fde76404312a41d7d2d719eba7")).intValue() : this.I.l();
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "676f492428cc0c0ba2d999b15d893632", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "676f492428cc0c0ba2d999b15d893632")).booleanValue();
        }
        if (this.o) {
            try {
                if (super.onInterceptTouchEvent(motionEvent)) {
                    if (!this.D) {
                        com.meituan.msc.uimanager.events.d.a(this, motionEvent);
                    }
                    com.meituan.msc.uimanager.events.d.a(this, motionEvent);
                    this.N = false;
                    this.k = true;
                    b();
                    return true;
                }
            } catch (IllegalArgumentException e) {
                com.meituan.msc.modules.reporter.g.e("ReactNative", "Error intercepting touch event.", e);
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3785802534921e5b44e3b3a4a1393c3f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3785802534921e5b44e3b3a4a1393c3f")).booleanValue();
        }
        if (this.o) {
            this.f.a(motionEvent);
            if ((motionEvent.getAction() & 255) == 1 && this.k) {
                d(getScrollX(), getScrollY());
                this.f.a();
                float f = this.f.b;
                float f2 = this.f.c;
                this.N = false;
                this.k = false;
                b(Math.round(f), Math.round(f2));
            }
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.ScrollView
    public boolean executeKeyEvent(KeyEvent keyEvent) {
        Object[] objArr = {keyEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6b243c8a90ee4ee7920be41473b716c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6b243c8a90ee4ee7920be41473b716c")).booleanValue();
        }
        int keyCode = keyEvent.getKeyCode();
        if (this.o || !(keyCode == 19 || keyCode == 20)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    public void setRemoveClippedSubviews(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51130eb25dd5551824bcf75fc83af788", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51130eb25dd5551824bcf75fc83af788");
            return;
        }
        if (z && this.i == null) {
            this.i = new Rect();
        }
        this.n = z;
        a();
    }

    @Override // com.meituan.msc.uimanager.v
    public boolean getRemoveClippedSubviews() {
        return this.n;
    }

    @Override // com.meituan.msc.uimanager.v
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "458924f74a459ff81fd9c9f43e9f33e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "458924f74a459ff81fd9c9f43e9f33e2");
        } else if (this.n) {
            com.facebook.infer.annotation.a.a(this.i);
            w.a(this, this.i);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91d777671926dae9c354cf5091bf80ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91d777671926dae9c354cf5091bf80ff");
        } else {
            rect.set((Rect) com.facebook.infer.annotation.a.a(this.i));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        Object[] objArr = {view, rect, point};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1a532ce762ef5dc54767d8db2526bb5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1a532ce762ef5dc54767d8db2526bb5")).booleanValue();
        }
        if (com.meituan.msc.jse.config.a.g) {
            return w.a(view, rect, point, this, this.j);
        }
        return super.getChildVisibleRect(view, rect, point);
    }

    @Override // android.widget.ScrollView
    public void fling(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37dafece3a5a4fba69043712dbd2291d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37dafece3a5a4fba69043712dbd2291d");
            return;
        }
        float signum = Math.signum(this.d.c);
        if (signum == 0.0f) {
            signum = Math.signum(i);
        }
        int abs = (int) (Math.abs(i) * signum);
        if (this.l) {
            b(abs);
        } else if (this.e != null) {
            this.e.fling(getScrollX(), getScrollY(), 0, abs, 0, 0, 0, Integer.MAX_VALUE, 0, ((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
            ViewCompat.postInvalidateOnAnimation(this);
        } else {
            super.fling(abs);
        }
        b(0, abs);
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6deb64ff62507711a773432007592219", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6deb64ff62507711a773432007592219");
        } else if (c()) {
            com.facebook.infer.annotation.a.a(this.q);
            com.facebook.infer.annotation.a.a(this.r);
        }
    }

    private boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99d249494b8e1e1bb987b8fe89460f8c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99d249494b8e1e1bb987b8fe89460f8c")).booleanValue() : (this.q == null || this.r == null || this.r.isEmpty()) ? false : true;
    }

    private int getMaxScrollY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "964ac52bae7da511cfc6f1e2bf8bba56", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "964ac52bae7da511cfc6f1e2bf8bba56")).intValue() : Math.max(0, this.A.getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
    }

    @Override // android.widget.ScrollView, android.view.View
    public void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea7e01f2eadb763f9286b70fc49813c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea7e01f2eadb763f9286b70fc49813c4");
            return;
        }
        if (this.t != 0) {
            View childAt = getChildAt(0);
            if (this.s != null && childAt != null && childAt.getBottom() < getHeight()) {
                this.s.setBounds(0, childAt.getBottom(), getWidth(), getHeight());
                this.s.draw(canvas);
            }
        }
        getDrawingRect(this.g);
        String str = this.j;
        char c2 = 65535;
        if (str.hashCode() == 466743410 && str.equals("visible")) {
            c2 = 0;
        }
        if (c2 != 0) {
            canvas.clipRect(this.g);
        }
        super.draw(canvas);
    }

    private void b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c62b460921a2513fab41fb61ab993eff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c62b460921a2513fab41fb61ab993eff");
        } else if ((this.p || this.l || c()) && this.m == null) {
            if (this.p) {
                b();
            }
            this.h = false;
            this.m = new Runnable() { // from class: com.meituan.msc.mmpviews.scroll.f.1
                public static ChangeQuickRedirect a;
                private boolean c = false;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a0cc5a5aa91b941a143596a271ec9979", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a0cc5a5aa91b941a143596a271ec9979");
                    } else if (!f.this.h) {
                        f.this.d(f.this.getScrollX(), f.this.getScrollY());
                        if (!f.this.l || this.c) {
                            boolean unused = f.this.p;
                            f.a(f.this, (Runnable) null);
                            f.d(f.this);
                            return;
                        }
                        this.c = true;
                        f.this.b(0);
                        ViewCompat.postOnAnimationDelayed(f.this, this, 20L);
                    } else {
                        f.a(f.this, false);
                        ViewCompat.postOnAnimationDelayed(f.this, this, 20L);
                    }
                }
            };
            ViewCompat.postOnAnimationDelayed(this, this.m, 20L);
        }
    }

    private int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "557dac8b54451b964fa1f3a1a7c21833", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "557dac8b54451b964fa1f3a1a7c21833")).intValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb42f02258c9fb6dbb48ad34ea75744a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb42f02258c9fb6dbb48ad34ea75744a");
        } else if (getChildCount() > 0) {
            if (this.v == 0 && this.x == null) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba13ac641d953f9d71e8259a7416375e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba13ac641d953f9d71e8259a7416375e");
                    return;
                }
                double snapInterval = getSnapInterval();
                double scrollY = getScrollY();
                double d = scrollY / snapInterval;
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
                if (d2 != scrollY) {
                    this.h = true;
                    c(getScrollX(), (int) d2);
                    return;
                }
                return;
            }
            int maxScrollY = getMaxScrollY();
            int a2 = a(i);
            if (this.u) {
                a2 = getScrollY();
            }
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
                double d3 = a2 / snapInterval2;
                floor = (int) (Math.floor(d3) * snapInterval2);
                min = Math.min((int) (Math.ceil(d3) * snapInterval2), maxScrollY);
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
            if (this.e != null) {
                this.h = true;
                OverScroller overScroller = this.e;
                int scrollX = getScrollX();
                int scrollY2 = getScrollY();
                if (i4 == 0) {
                    i4 = min2 - getScrollY();
                }
                overScroller.fling(scrollX, scrollY2, 0, i4, 0, 0, min2, min2, 0, (min2 == 0 || min2 == maxScrollY) ? height / 2 : 0);
                postInvalidateOnAnimation();
                return;
            }
            c(getScrollX(), min2);
        }
    }

    private int getSnapInterval() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ff0f5bb7ce4c8e7742f6b92968d71ed", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ff0f5bb7ce4c8e7742f6b92968d71ed")).intValue();
        }
        if (this.v != 0) {
            return this.v;
        }
        return getHeight();
    }

    public void setEndFillColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bc07c2e115661799a5ba34bf78c1318", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bc07c2e115661799a5ba34bf78c1318");
        } else if (i != this.t) {
            this.t = i;
            this.s = new ColorDrawable(this.t);
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        int maxScrollY;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "259d5d332d866a20ccd6c3ed048d164a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "259d5d332d866a20ccd6c3ed048d164a");
            return;
        }
        if (this.e != null && this.A != null && !this.e.isFinished() && this.e.getCurrY() != this.e.getFinalY() && i2 >= (maxScrollY = getMaxScrollY())) {
            this.e.abortAnimation();
            i2 = maxScrollY;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "653e1b455b0a9b0fba6bb2f6dd196b15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "653e1b455b0a9b0fba6bb2f6dd196b15");
            return;
        }
        this.A = view2;
        this.A.addOnLayoutChangeListener(this);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1645e094e571a34b1b752d443891bbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1645e094e571a34b1b752d443891bbf");
            return;
        }
        this.A.removeOnLayoutChangeListener(this);
        this.A = null;
    }

    private void c(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e2253baad175607b3f7498ddd7ec301", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e2253baad175607b3f7498ddd7ec301");
            return;
        }
        smoothScrollTo(i, i2);
        d(i, i2);
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46431abd43d86792a1ea9e225ee5ef3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46431abd43d86792a1ea9e225ee5ef3a");
            return;
        }
        scrollTo(i, i2);
        d(i, i2);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c7366734d1852c50cc21f040e01a259", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c7366734d1852c50cc21f040e01a259");
        } else if (this.A == null) {
        } else {
            int scrollY = getScrollY();
            int maxScrollY = getMaxScrollY();
            if (scrollY > maxScrollY) {
                a(getScrollX(), maxScrollY);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d6b565e2ebdc8e949a9751788cc1696", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d6b565e2ebdc8e949a9751788cc1696");
        } else if (this.B == null) {
        } else {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("contentOffsetLeft", s.c(i));
            createMap.putDouble("contentOffsetTop", s.c(i2));
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public void computeScroll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ae987ff26594986900bfddce64dff73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ae987ff26594986900bfddce64dff73");
            return;
        }
        super.computeScroll();
        if (this.D && this.e != null && this.C && this.e.isFinished()) {
            this.C = false;
        }
    }

    public void setEnableExperimentalFeature(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2822f6526d2b42a460bd5960624d2b92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2822f6526d2b42a460bd5960624d2b92");
            return;
        }
        this.D = z;
        if (this.E >= 0 || this.F >= 0) {
            int i = this.E;
            int i2 = this.F;
            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8935301ba1fbbb8c5885402fe48c4e94", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8935301ba1fbbb8c5885402fe48c4e94");
                return;
            }
            this.E = i;
            this.F = i2;
            if (this.D) {
                try {
                    com.meituan.msc.utils.c.a(View.class, this, "mScrollX", Integer.valueOf(i));
                    com.meituan.msc.utils.c.a(View.class, this, "mScrollY", Integer.valueOf(i2));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (this.n) {
                    a();
                }
                invalidate();
            }
        }
    }
}
