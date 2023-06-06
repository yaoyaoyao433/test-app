package com.meituan.android.legwork.mrn.scroll;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v4.view.NestedScrollingChild2;
import android.support.v4.view.NestedScrollingChildHelper;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.w;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SpringScrollView extends com.facebook.react.views.view.f implements NestedScrollingChild2, View.OnLayoutChangeListener, View.OnTouchListener {
    public static ChangeQuickRedirect a;
    public static final /* synthetic */ boolean j = !SpringScrollView.class.desiredAssertionStatus();
    a b;
    String c;
    String d;
    c e;
    c f;
    f g;
    f h;
    b i;
    private float k;
    private float l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private VelocityTracker s;
    private String t;
    private d u;
    private d v;
    private final NestedScrollingChildHelper w;
    private final int[] x;
    private final int[] y;
    private float z;

    public static /* synthetic */ boolean a(SpringScrollView springScrollView, boolean z) {
        springScrollView.m = false;
        return false;
    }

    public static /* synthetic */ void b(SpringScrollView springScrollView, float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, springScrollView, changeQuickRedirect, false, "d9c3c219ffcc7cb306c315505b12140d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, springScrollView, changeQuickRedirect, false, "d9c3c219ffcc7cb306c315505b12140d");
            return;
        }
        float f2 = f - springScrollView.z;
        springScrollView.z = f;
        if (springScrollView.dispatchNestedPreScroll(0, (int) f2, springScrollView.y, springScrollView.x, 1)) {
            f2 -= springScrollView.y[1];
        }
        float f3 = springScrollView.e.b;
        if (f2 != 0.0f) {
            float f4 = springScrollView.e.b + f2;
            if (f4 >= springScrollView.h.b - springScrollView.g.b) {
                f4 = springScrollView.h.b - springScrollView.g.b;
            }
            springScrollView.b(springScrollView.e.a, f4 > 0.0f ? f4 : 0.0f);
        }
        int i = (int) (springScrollView.e.b - f3);
        int i2 = (int) (f2 - i);
        if (i2 != 0) {
            springScrollView.dispatchNestedScroll(0, i, 0, i2, springScrollView.x, 1);
        }
    }

    public SpringScrollView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bd5a7badd4a1c12951991d2b2c9c61a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bd5a7badd4a1c12951991d2b2c9c61a");
            return;
        }
        this.x = new int[2];
        this.y = new int[2];
        this.z = 0.0f;
        this.d = "waiting";
        this.c = "waiting";
        this.f = new c();
        this.e = new c();
        this.i = new b();
        this.g = new f();
        this.h = new f();
        this.u = new d();
        this.v = new d();
        setClipChildren(false);
        this.w = new NestedScrollingChildHelper(this);
        this.w.setNestedScrollingEnabled(true);
    }

    @Override // com.facebook.react.views.view.f, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ca5e81a320c1f539c30276bba62edd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ca5e81a320c1f539c30276bba62edd6");
            return;
        }
        setOnTouchListener(this);
        addOnLayoutChangeListener(this);
        ViewGroup viewGroup = (ViewGroup) getChildAt(0);
        if (viewGroup != null) {
            if (this.f.b != 0.0f || this.f.a != 0.0f) {
                b(this.f.a, this.f.b);
            }
            viewGroup.addOnLayoutChangeListener(this);
            viewGroup.setClipChildren(false);
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b0c333861f90e97cd10fdc0db2636dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b0c333861f90e97cd10fdc0db2636dd");
            return;
        }
        setOnTouchListener(null);
        removeOnLayoutChangeListener(this);
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.removeOnLayoutChangeListener(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e3a73aca38ee70078025875ebb78e7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e3a73aca38ee70078025875ebb78e7e");
        } else if (this == view) {
            this.g.a = i3 - i;
            this.g.b = i4 - i2;
        } else {
            c(i3 - i, i4 - i2);
        }
    }

    @Override // com.facebook.react.views.view.f, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a4deed12358f39c8a69292a60cc3717", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a4deed12358f39c8a69292a60cc3717")).booleanValue();
        }
        switch (motionEvent.getAction() & 255) {
            case 0:
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf443720f796fa73cf8161492ea88c65", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf443720f796fa73cf8161492ea88c65");
                } else {
                    d dVar = this.v;
                    d dVar2 = this.u;
                    float y = motionEvent.getY();
                    dVar2.a = y;
                    dVar.a = y;
                    if (a()) {
                        this.p = true;
                    }
                    if (this.m) {
                        this.m = false;
                        a(DMKeys.KEY_ON_MOMENTUM_SCROLL_END, (WritableMap) null);
                    }
                    a("onTouchBegin", (WritableMap) null);
                    this.s = VelocityTracker.obtain();
                }
                startNestedScroll(2, 0);
                return false;
            case 1:
            case 3:
                stopNestedScroll(0);
                break;
            case 2:
                Object[] objArr3 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0075b53cd9efab88d1d76831dd21eea7", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0075b53cd9efab88d1d76831dd21eea7")).booleanValue();
                } else {
                    z = this.p || (this.o && Math.abs(motionEvent.getY() - this.v.a) > w.a(5.0f));
                }
                if (z) {
                    this.p = true;
                    requestDisallowInterceptTouchEvent(true);
                    com.facebook.react.uimanager.events.e.a(this, motionEvent);
                    com.facebook.react.views.scroll.g.a(this);
                    return true;
                }
                break;
        }
        return this.p;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        float f;
        boolean z;
        boolean z2;
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98706063e5943e378d5265364cda3eb1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98706063e5943e378d5265364cda3eb1")).booleanValue();
        }
        switch (motionEvent.getAction() & 255) {
            case 0:
                startNestedScroll(2, 0);
                return true;
            case 1:
            case 3:
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7264de1df1ac959ad74ee1639da4b9cc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7264de1df1ac959ad74ee1639da4b9cc");
                } else {
                    this.p = false;
                    this.s.computeCurrentVelocity(1);
                    float yVelocity = this.s.getYVelocity();
                    float xVelocity = this.s.getXVelocity();
                    if (this.q && Build.VERSION.SDK_INT >= 28) {
                        xVelocity = -xVelocity;
                        yVelocity = -yVelocity;
                    }
                    float f2 = xVelocity;
                    if (this.t != null && this.t.equals("h")) {
                        f = 0.0f;
                    } else if (this.t == null || !this.t.equals("v")) {
                        f = yVelocity;
                    } else {
                        f = yVelocity;
                        f2 = 0.0f;
                    }
                    this.t = null;
                    this.s.clear();
                    WritableMap createMap = Arguments.createMap();
                    createMap.putArray("touches", Arguments.createArray());
                    a("onTouchEnd", createMap);
                    if (!this.m) {
                        this.m = true;
                        a(DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN, (WritableMap) null);
                    }
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "aa51ecc85a2fc3469f040e9185378bb7", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "aa51ecc85a2fc3469f040e9185378bb7")).booleanValue();
                    } else {
                        z = this.k > 0.0f && e() && this.c.equals("pullingEnough");
                    }
                    if (z) {
                        this.c = "refreshing";
                        this.i.a = this.k;
                    }
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8f7e6fd2ec0265ea5f0eda7bbb0f622c", RobustBitConfig.DEFAULT_VALUE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8f7e6fd2ec0265ea5f0eda7bbb0f622c")).booleanValue();
                    } else {
                        z2 = this.l > 0.0f && g() && this.d.equals("draggingEnough");
                    }
                    if (z2) {
                        this.d = "loading";
                        this.i.b = this.l;
                    }
                    requestDisallowInterceptTouchEvent(false);
                    if (this.o && !dispatchNestedPreFling(f2, f)) {
                        boolean z3 = canScrollVertically(-1) || canScrollVertically(1);
                        dispatchNestedFling(f2, f, z3);
                        if (z3) {
                            if (c()) {
                                a(f);
                            } else {
                                Object[] objArr5 = {Float.valueOf(f)};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "72d6f91e6af0328a6163110f519cd237", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "72d6f91e6af0328a6163110f519cd237");
                                } else if (Math.abs(f) < 0.1f) {
                                    if (this.m) {
                                        this.m = false;
                                        a(DMKeys.KEY_ON_MOMENTUM_SCROLL_END, (WritableMap) null);
                                    }
                                } else {
                                    this.b = new a(this.e.b, f, 0.997f, System.currentTimeMillis(), f) { // from class: com.meituan.android.legwork.mrn.scroll.SpringScrollView.1
                                        public static ChangeQuickRedirect c;
                                        public final /* synthetic */ long d;
                                        public final /* synthetic */ float e;

                                        {
                                            this.d = r5;
                                            this.e = f;
                                        }

                                        @Override // com.meituan.android.legwork.mrn.scroll.a
                                        public final void c() {
                                            Object[] objArr6 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect6 = c;
                                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "70413e4d8572f0a0b1bfd084a6114b8c", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "70413e4d8572f0a0b1bfd084a6114b8c");
                                                return;
                                            }
                                            super.c();
                                            SpringScrollView.this.startNestedScroll(2, 1);
                                            SpringScrollView.this.z = SpringScrollView.this.e.b;
                                        }

                                        @Override // com.meituan.android.legwork.mrn.scroll.a
                                        public final void b() {
                                            Object[] objArr6 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect6 = c;
                                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "de9b581a1ac5674f3635b6f6f64b9c78", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "de9b581a1ac5674f3635b6f6f64b9c78");
                                                return;
                                            }
                                            SpringScrollView.this.stopNestedScroll(1);
                                            if (SpringScrollView.this.m) {
                                                SpringScrollView.a(SpringScrollView.this, false);
                                                SpringScrollView.this.a(DMKeys.KEY_ON_MOMENTUM_SCROLL_END, (WritableMap) null);
                                            }
                                        }

                                        @Override // com.meituan.android.legwork.mrn.scroll.a
                                        public final void a(float f3) {
                                            Object[] objArr6 = {Float.valueOf(f3)};
                                            ChangeQuickRedirect changeQuickRedirect6 = c;
                                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "0a23cc4679d3b49434ece23bf0ddc01b", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "0a23cc4679d3b49434ece23bf0ddc01b");
                                                return;
                                            }
                                            SpringScrollView.b(SpringScrollView.this, f3);
                                            if (!SpringScrollView.this.d() && !SpringScrollView.this.f()) {
                                                return;
                                            }
                                            long currentTimeMillis = System.currentTimeMillis() - this.d;
                                            float f4 = this.e;
                                            while (true) {
                                                long j2 = currentTimeMillis - 1;
                                                if (currentTimeMillis <= 0) {
                                                    cancel();
                                                    SpringScrollView.this.a(f4);
                                                    return;
                                                }
                                                f4 *= 0.997f;
                                                currentTimeMillis = j2;
                                            }
                                        }
                                    };
                                    this.b.a();
                                }
                            }
                        }
                    }
                }
                stopNestedScroll(0);
                return true;
            case 2:
                Object[] objArr6 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "e19a8d9efc07ca484603cef04205c401", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "e19a8d9efc07ca484603cef04205c401");
                    return true;
                } else if (this.o) {
                    int y = (int) (this.u.a - motionEvent.getY());
                    if (dispatchNestedPreScroll(0, y, this.y, this.x, 0)) {
                        y -= this.y[1];
                    }
                    int i = y;
                    float f3 = this.e.b;
                    if (i != 0) {
                        float f4 = i;
                        Object[] objArr7 = {Float.valueOf(0.0f), Float.valueOf(f4)};
                        ChangeQuickRedirect changeQuickRedirect7 = a;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "0b43d4c1a021bff85971128921d24b5a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "0b43d4c1a021bff85971128921d24b5a");
                        } else {
                            float yDampingCoefficient = f4 * getYDampingCoefficient();
                            if (this.r) {
                                if (this.t == null) {
                                    if (Math.abs(0.0f) > Math.abs(yDampingCoefficient)) {
                                        this.t = "h";
                                    } else {
                                        this.t = "v";
                                    }
                                }
                                if (this.t.equals("h")) {
                                    yDampingCoefficient = 0.0f;
                                }
                                this.t.equals("v");
                            }
                            a(this.e.a + 0.0f, this.e.b + yDampingCoefficient);
                        }
                        this.u.a = motionEvent.getY();
                    }
                    this.s.addMovement(motionEvent);
                    float f5 = this.e.b - f3;
                    float f6 = i - f5;
                    if (f6 != 0.0f) {
                        dispatchNestedScroll(0, (int) f5, 0, (int) f6, this.x, 0);
                        return true;
                    }
                    return true;
                } else {
                    return true;
                }
            default:
                return true;
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        if (this.e != null) {
            return (int) this.e.b;
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        if (this.g != null) {
            return (int) this.g.b;
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        if (this.h != null) {
            return (int) this.h.b;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20c52588eb9a79c5d176b1b1cb9e6628", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20c52588eb9a79c5d176b1b1cb9e6628");
        } else if (Math.abs(f) < 0.1f) {
            b();
        } else {
            if (f > 15.0f) {
                f = 15.0f;
            }
            if (f < -15.0f) {
                f = -15.0f;
            }
            this.b = new a(this.e.b, f, 0.9f) { // from class: com.meituan.android.legwork.mrn.scroll.SpringScrollView.2
                public static ChangeQuickRedirect c;

                @Override // com.meituan.android.legwork.mrn.scroll.a
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = c;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4f7c2822e4f3b672f2ce1ad2a828a1c2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4f7c2822e4f3b672f2ce1ad2a828a1c2");
                    } else {
                        SpringScrollView.this.b();
                    }
                }

                @Override // com.meituan.android.legwork.mrn.scroll.a
                public final void a(float f2) {
                    Object[] objArr2 = {Float.valueOf(f2)};
                    ChangeQuickRedirect changeQuickRedirect2 = c;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "70e3f9da15c1e4ddc10dafceeca5aac7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "70e3f9da15c1e4ddc10dafceeca5aac7");
                        return;
                    }
                    if (!SpringScrollView.this.n) {
                        SpringScrollView.this.e.b = f2;
                        if (SpringScrollView.this.d()) {
                            f2 = -SpringScrollView.this.i.a;
                            SpringScrollView.this.b.cancel();
                        } else if (SpringScrollView.this.f()) {
                            f2 = (SpringScrollView.this.h.b - SpringScrollView.this.g.b) + SpringScrollView.this.i.b;
                            SpringScrollView.this.b.cancel();
                        }
                    }
                    SpringScrollView.this.b(SpringScrollView.this.e.a, f2);
                }
            };
            this.b.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        float f;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddabb2f2c71240c8fe4ed8e495b82734", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddabb2f2c71240c8fe4ed8e495b82734");
        } else if (c() && this.n) {
            if (d()) {
                f = -this.i.a;
            } else {
                f = (this.h.b - this.g.b) + this.i.b;
            }
            this.b = new a(this.e.b, f, 500L) { // from class: com.meituan.android.legwork.mrn.scroll.SpringScrollView.3
                public static ChangeQuickRedirect c;

                @Override // com.meituan.android.legwork.mrn.scroll.a
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = c;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b0a04b6a4d27243efe051b8b8f1d08bd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b0a04b6a4d27243efe051b8b8f1d08bd");
                    } else if (SpringScrollView.this.m) {
                        SpringScrollView.a(SpringScrollView.this, false);
                        SpringScrollView.this.a(DMKeys.KEY_ON_MOMENTUM_SCROLL_END, (WritableMap) null);
                    }
                }

                @Override // com.meituan.android.legwork.mrn.scroll.a
                public final void a(float f2) {
                    Object[] objArr2 = {Float.valueOf(f2)};
                    ChangeQuickRedirect changeQuickRedirect2 = c;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3add4d77222711de0d7c2da795647bfc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3add4d77222711de0d7c2da795647bfc");
                    } else {
                        SpringScrollView.this.b(SpringScrollView.this.e.a, f2);
                    }
                }
            };
            this.b.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77fd2d6ee69174af7de68cbffca3cd74", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77fd2d6ee69174af7de68cbffca3cd74")).booleanValue();
        }
        if (this.b != null) {
            boolean cancel = this.b.cancel();
            this.b = null;
            return cancel;
        }
        return false;
    }

    private float getYDampingCoefficient() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6cdbb07187b494f9268bc1c0203b4a2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6cdbb07187b494f9268bc1c0203b4a2")).floatValue();
        }
        if (c()) {
            float f = d() ? -this.e.b : (this.e.b - this.h.b) + this.g.b;
            return (((0.8f / (this.g.b * this.g.b)) * (f * f)) - ((1.6f / this.g.b) * f)) + 0.8f;
        }
        return 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88313293743d472c152c4a927c1b1800", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88313293743d472c152c4a927c1b1800");
        } else if (this.o) {
            if (!this.n) {
                if (f2 < (-this.i.a)) {
                    f2 = -this.i.a;
                }
                if (f2 > (this.h.b - this.g.b) + this.i.b) {
                    f2 = (this.h.b - this.g.b) + this.i.b;
                }
            }
            if (this.h.a <= this.g.a || !this.n) {
                if (f < (-this.i.c)) {
                    f = -this.i.c;
                }
                if (f > (this.h.a - this.g.a) + this.i.d) {
                    f = (this.h.a - this.g.a) + this.i.d;
                }
            }
            if (this.e.b == f2 && this.e.a == f) {
                return;
            }
            if (h()) {
                this.c = "pulling";
            } else if (i()) {
                this.c = "pullingEnough";
            } else if (j()) {
                this.c = "pullingCancel";
            } else if (k()) {
                this.c = "waiting";
            }
            if (l()) {
                this.d = "dragging";
            } else if (m()) {
                this.d = "draggingEnough";
            } else if (n()) {
                this.d = "draggingCancel";
            } else if (o()) {
                this.d = "waiting";
            }
            b(f, f2);
        }
    }

    public final void b(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef7bc0db34ab15a67dd82e2a15172794", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef7bc0db34ab15a67dd82e2a15172794");
            return;
        }
        this.e.a = f;
        this.e.b = f2;
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setTranslationX(-this.e.a);
            childAt.setTranslationY(-this.e.b);
        }
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble(Constants.GestureMoveEvent.KEY_X, w.c(this.e.a));
        createMap2.putDouble(Constants.GestureMoveEvent.KEY_Y, w.c(this.e.b));
        createMap.putMap("contentOffset", createMap2);
        createMap.putString("refreshStatus", this.c);
        createMap.putString("loadingStatus", this.d);
        a(createMap);
    }

    private boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03f52d6d420a6a21085071cd276d576b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03f52d6d420a6a21085071cd276d576b")).booleanValue() : d() || f();
    }

    @Override // com.facebook.react.views.view.f, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e77bb4aea4a94e7efb35af6db3814e4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e77bb4aea4a94e7efb35af6db3814e4c");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (!j && childAt == null) {
            throw new AssertionError();
        }
        this.g.a = getWidth();
        this.g.b = getHeight();
        c(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    private void c(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97087667957d90cfeeb60919a5bd8487", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97087667957d90cfeeb60919a5bd8487");
            return;
        }
        if (f2 < this.g.b) {
            f2 = this.g.b;
        }
        if (f < this.g.a) {
            f = this.g.a;
        }
        this.h.a = f;
        this.h.b = f2;
    }

    public void setRefreshHeaderHeight(float f) {
        this.k = f;
    }

    public void setLoadingFooterHeight(float f) {
        this.l = f;
    }

    private void a(WritableMap writableMap) {
        Object[] objArr = {writableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "276be00d9494e24275ae5bbc15fe43f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "276be00d9494e24275ae5bbc15fe43f0");
            return;
        }
        if (writableMap == null) {
            writableMap = Arguments.createMap();
        }
        ((UIManagerModule) ((ReactContext) getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(e.a(getId(), "onScroll", writableMap));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, WritableMap writableMap) {
        Object[] objArr = {str, writableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68c59007576d18dd15888b8ab3c49b03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68c59007576d18dd15888b8ab3c49b03");
            return;
        }
        if (writableMap == null) {
            writableMap = Arguments.createMap();
        }
        ((RCTEventEmitter) ((ReactContext) getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), str, writableMap);
    }

    public void setAllLoaded(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e34df049a57346ec07234fda5709be8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e34df049a57346ec07234fda5709be8");
            return;
        }
        this.d = z ? "allLoaded" : "waiting";
        if (z) {
            this.i.b = 0.0f;
        }
    }

    public void setBounces(boolean z) {
        this.n = z;
    }

    public void setScrollEnabled(boolean z) {
        this.o = z;
    }

    public void setInverted(boolean z) {
        this.q = z;
    }

    public void setDirectionalLockEnabled(boolean z) {
        this.r = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d() {
        return this.e.b < (-this.i.a);
    }

    private boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a382dc9756793eedccb0634d2da53219", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a382dc9756793eedccb0634d2da53219")).booleanValue() : this.e.b < (-this.i.a) - this.k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb8e955a11d648c68a71f0aeb38ffec7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb8e955a11d648c68a71f0aeb38ffec7")).booleanValue() : this.e.b > this.h.b - this.g.b;
    }

    private boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3525b4ff22245be5b32e28377fe3d25", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3525b4ff22245be5b32e28377fe3d25")).booleanValue() : this.e.b > ((-this.g.b) + this.h.b) + this.l;
    }

    private boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ad6332cf50776e02a8fd37d536067b3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ad6332cf50776e02a8fd37d536067b3")).booleanValue();
        }
        if (this.k <= 0.0f || !d()) {
            return false;
        }
        return this.c.equals("waiting") || this.c.equals("pullingCancel");
    }

    private boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccbc8d493538e8fc3d68b6fd44b28094", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccbc8d493538e8fc3d68b6fd44b28094")).booleanValue() : this.k > 0.0f && e() && this.c.equals("pulling");
    }

    private boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bb432a16552ee1f6647d38c1bbf6aad", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bb432a16552ee1f6647d38c1bbf6aad")).booleanValue() : this.k > 0.0f && this.c.equals("pullingEnough") && d() && !e();
    }

    private boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e652eb89615a08ab455b3263ff68e3f2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e652eb89615a08ab455b3263ff68e3f2")).booleanValue();
        }
        if (this.k <= 0.0f || d()) {
            return false;
        }
        return this.c.equals("rebound") || this.c.equals("pullingCancel");
    }

    private boolean l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0852cc3b27baf21c70cc71a3d17fe63", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0852cc3b27baf21c70cc71a3d17fe63")).booleanValue();
        }
        if (this.l <= 0.0f || !f()) {
            return false;
        }
        return this.d.equals("waiting") || this.d.equals("draggingCancel");
    }

    private boolean m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a6b05694626506570152d755380f72f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a6b05694626506570152d755380f72f")).booleanValue() : this.l > 0.0f && g() && this.d.equals("dragging");
    }

    private boolean n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83d2e154e783ea89876a91cca3477a8f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83d2e154e783ea89876a91cca3477a8f")).booleanValue() : this.l > 0.0f && this.d.equals("draggingEnough") && f() && !g();
    }

    private boolean o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8766ff6432348e69d9072ef14e3fefcb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8766ff6432348e69d9072ef14e3fefcb")).booleanValue();
        }
        if (this.l <= 0.0f || f()) {
            return false;
        }
        return this.d.equals("rebound") || this.d.equals("draggingCancel");
    }

    @Override // android.support.v4.view.NestedScrollingChild2
    public boolean startNestedScroll(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5665045a76b0741536470740b5c09423", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5665045a76b0741536470740b5c09423")).booleanValue() : this.w.startNestedScroll(i, i2);
    }

    @Override // android.support.v4.view.NestedScrollingChild2
    public void stopNestedScroll(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e186828f8e0f167b7acb92a6e114e0e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e186828f8e0f167b7acb92a6e114e0e0");
        } else {
            this.w.stopNestedScroll(i);
        }
    }

    @Override // android.support.v4.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a86d8c6cbe4de979fb461ff4d7f0e5d2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a86d8c6cbe4de979fb461ff4d7f0e5d2")).booleanValue() : this.w.hasNestedScrollingParent(i);
    }

    @Override // android.support.v4.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, @Nullable int[] iArr, int i5) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), iArr, Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e40581dc4fa2c729de1afa16de650307", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e40581dc4fa2c729de1afa16de650307")).booleanValue() : this.w.dispatchNestedScroll(i, i2, i3, i4, iArr, i5);
    }

    @Override // android.support.v4.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), iArr, iArr2, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aef16e7abd2c963b6cdf1d2e3bcf15aa", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aef16e7abd2c963b6cdf1d2e3bcf15aa")).booleanValue() : this.w.dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "709e9766f2cf788957000f1cab1b0556", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "709e9766f2cf788957000f1cab1b0556")).booleanValue() : this.w.dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a302774b108fdd1f9fb306a4a4ba3fd8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a302774b108fdd1f9fb306a4a4ba3fd8")).booleanValue() : this.w.dispatchNestedFling(f, f2, z);
    }
}
