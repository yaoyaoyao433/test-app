package com.meituan.msc.mmpviews.scroll;

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
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import com.meituan.msc.jse.bridge.Arguments;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class c extends HorizontalScrollView implements b, v {
    public static ChangeQuickRedirect a = null;
    @Nullable
    private static Field b = null;
    private static boolean c = false;
    private boolean A;
    @Nullable
    private ai B;
    private boolean C;
    private boolean D;
    private int E;
    private int F;
    private int G;
    private int H;
    private boolean I;
    private int J;
    private boolean K;
    private boolean L;
    private com.meituan.msc.mmpviews.list.msclist.c M;
    private final Rect N;
    private com.meituan.msc.mmpviews.shell.e O;
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
    public void setScrollTop(double d) {
    }

    public static /* synthetic */ Runnable a(c cVar, Runnable runnable) {
        cVar.m = null;
        return null;
    }

    public static /* synthetic */ boolean a(c cVar, boolean z) {
        cVar.h = false;
        return false;
    }

    public static /* synthetic */ void d(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "b7ee84c640e7aa452c7df27264942470", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "b7ee84c640e7aa452c7df27264942470");
        } else if (cVar.b()) {
            com.facebook.infer.annotation.a.a(cVar.q);
            com.facebook.infer.annotation.a.a(cVar.r);
        }
    }

    public c(Context context, com.meituan.msc.mmpviews.shell.e eVar) {
        this(context, eVar, null);
        Object[] objArr = {context, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "845630784b80a8c9383313984b82247c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "845630784b80a8c9383313984b82247c");
        }
    }

    private c(Context context, com.meituan.msc.mmpviews.shell.e eVar, @Nullable a aVar) {
        super(context);
        Object[] objArr = {context, eVar, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a89d702ddc8b705a869aeb22bca1a2a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a89d702ddc8b705a869aeb22bca1a2a8");
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
        this.A = false;
        this.C = false;
        this.D = false;
        this.E = -1;
        this.F = -1;
        this.J = -1;
        this.K = true;
        this.N = new Rect();
        this.O = eVar;
        this.q = null;
        this.e = getOverScrollerFromParent();
    }

    @Nullable
    private OverScroller getOverScrollerFromParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18d0df4ab61ced22c3fb581ffc641067", RobustBitConfig.DEFAULT_VALUE)) {
            return (OverScroller) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18d0df4ab61ced22c3fb581ffc641067");
        }
        if (!c) {
            c = true;
            try {
                Field declaredField = HorizontalScrollView.class.getDeclaredField("mScroller");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                com.meituan.msc.modules.reporter.g.e("ReactNative", "Failed to get mScroller field for HorizontalScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        OverScroller overScroller = null;
        if (b != null) {
            try {
                Object obj = b.get(this);
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

    public void setScrollPerfTag(@Nullable String str) {
        this.r = str;
    }

    public void setRemoveClippedSubviews(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ebee25c22fa1ad6697fd5cf877509d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ebee25c22fa1ad6697fd5cf877509d7");
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

    public void setDisableIntervalMomentum(boolean z) {
        this.u = z;
    }

    public void setSendMomentumEvents(boolean z) {
        this.p = z;
    }

    @Override // com.meituan.msc.mmpviews.scroll.b
    public void setScrollEnabled(boolean z) {
        this.o = z;
    }

    public void setPagingEnabled(boolean z) {
        this.l = z;
    }

    public void setDecelerationRate(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77af6b1d689de2ae1d0276ce43a970d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77af6b1d689de2ae1d0276ce43a970d4");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecec1b5b7d670804e58f57123325cdac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecec1b5b7d670804e58f57123325cdac");
            return;
        }
        this.j = str;
        invalidate();
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
    public void setScrollLeft(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13afb410f597d1a83e59cb802ca1313d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13afb410f597d1a83e59cb802ca1313d");
            return;
        }
        int round = Math.round(s.a(d));
        int scrollY = getScrollY();
        if (!this.I) {
            Object[] objArr2 = {Integer.valueOf(round), Integer.valueOf(scrollY)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "62de97106e78224f04318a9ff0c30c9a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "62de97106e78224f04318a9ff0c30c9a");
                return;
            }
            scrollTo(round, scrollY);
            boolean z = this.D;
            return;
        }
        Object[] objArr3 = {Integer.valueOf(round), Integer.valueOf(scrollY)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8870b1a9e8e99ebe7e5fddf5d7c35abf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8870b1a9e8e99ebe7e5fddf5d7c35abf");
            return;
        }
        smoothScrollTo(round, scrollY);
        if (this.D) {
            if (getScrollX() == round && getScrollY() == scrollY) {
                return;
            }
            this.C = true;
        }
    }

    @Override // com.meituan.msc.mmpviews.scroll.b
    public void setScrollWithAnimation(boolean z) {
        this.I = z;
    }

    @Override // com.meituan.msc.mmpviews.scroll.b
    public void setShowScrollbar(boolean z) {
        boolean z2 = true;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3999ef79cd1eee11706f5be587b70e95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3999ef79cd1eee11706f5be587b70e95");
            return;
        }
        this.K = z;
        if (this.L && !z) {
            z2 = false;
        }
        setHorizontalScrollBarEnabled(z2);
    }

    public void setCacheStateListener(com.meituan.msc.mmpviews.list.msclist.c cVar) {
        this.M = cVar;
    }

    @Override // com.meituan.msc.mmpviews.scroll.b
    public void setEnhanced(boolean z) {
        boolean z2 = true;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed32530d389542ef05d9da18a9217508", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed32530d389542ef05d9da18a9217508");
            return;
        }
        this.L = z;
        if (z && !this.K) {
            z2 = false;
        }
        setHorizontalScrollBarEnabled(z2);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27fcf563e4a8afb9757d377a30b447cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27fcf563e4a8afb9757d377a30b447cc");
            return;
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
        super.onDraw(canvas);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a881cd7666b6f63e7e8a67b481eb88db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a881cd7666b6f63e7e8a67b481eb88db");
            return;
        }
        l.a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34ef4c0dd205db5f1b615f71138fa998", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34ef4c0dd205db5f1b615f71138fa998");
        } else {
            a(getScrollX(), getScrollY());
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afd4c8948ceebc6aa451080e5736628b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afd4c8948ceebc6aa451080e5736628b");
            return;
        }
        if (view2 != null && !this.l) {
            Object[] objArr2 = {view2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3eeb447c93dc7c44967734b455d69e29", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3eeb447c93dc7c44967734b455d69e29");
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
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        boolean z;
        Object[] objArr = {arrayList, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc3a91860d277e527a1e530bf365f3f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc3a91860d277e527a1e530bf365f3f7");
        } else if (this.l && !this.A) {
            ArrayList arrayList2 = new ArrayList();
            super.addFocusables(arrayList2, i, i2);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                if (!b(view)) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "650d7a541b8c3a7add92628a0c070379", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "650d7a541b8c3a7add92628a0c070379")).booleanValue();
                    } else {
                        int a2 = a(view);
                        view.getDrawingRect(this.N);
                        z = a2 != 0 && Math.abs(a2) < this.N.width();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a4616be8812aa386b817e0e8354df86", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a4616be8812aa386b817e0e8354df86")).intValue();
        }
        view.getDrawingRect(this.N);
        offsetDescendantRectToMyCoords(view, this.N);
        return computeScrollDeltaToGetChildRectOnScreen(this.N);
    }

    private boolean b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7a1f7ebb854752695e148ddf47ac4d6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7a1f7ebb854752695e148ddf47ac4d6")).booleanValue() : a(view) == 0;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "988753e5b8a37396c0668503c20972b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "988753e5b8a37396c0668503c20972b0");
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        this.h = true;
        if (this.d.a(i, i2)) {
            if (this.n) {
                a();
            }
            if (getScrollX() <= this.G && i3 - i > 1) {
                g.a(getViewTag(), this);
            }
            if (getChildAt(0) != null && getScrollX() >= (getChildAt(0).getRight() - getWidth()) - this.H && i - i3 > 1) {
                g.b(getViewTag(), this);
            }
            if (this.J == -1) {
                this.J = i4;
            }
            g.a(getViewTag(), this, this.J - getScrollX(), 0.0f);
            this.J = getScrollX();
            if (this.M != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("scrollLeft", s.c(getScrollX()));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                this.M.a(jSONObject);
            }
        }
    }

    private int getViewTag() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cc474a321dfd186297cf1756d4dec76", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cc474a321dfd186297cf1756d4dec76")).intValue() : this.O.l();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "812252bbc791315050687a25da0f50c3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "812252bbc791315050687a25da0f50c3")).booleanValue();
        }
        if (this.o) {
            try {
                if (super.onInterceptTouchEvent(motionEvent)) {
                    if (!this.D) {
                        com.meituan.msc.uimanager.events.d.a(this, motionEvent);
                    }
                    com.meituan.msc.uimanager.events.d.a(this, motionEvent);
                    this.k = true;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "efc870d8389762afb069c0e8b3c19ecf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "efc870d8389762afb069c0e8b3c19ecf");
                    } else if (b()) {
                        com.facebook.infer.annotation.a.a(this.q);
                        com.facebook.infer.annotation.a.a(this.r);
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
    public boolean pageScroll(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c284be50745a734624ce45fedbf0625b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c284be50745a734624ce45fedbf0625b")).booleanValue();
        }
        boolean pageScroll = super.pageScroll(i);
        if (this.l && pageScroll) {
            b(0, 0);
        }
        return pageScroll;
    }

    @Override // android.widget.HorizontalScrollView
    public boolean arrowScroll(int i) {
        boolean z;
        boolean z2 = true;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f7859fd9cc9c3c8002cabb29dccf4fd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f7859fd9cc9c3c8002cabb29dccf4fd")).booleanValue();
        }
        if (this.l) {
            this.A = true;
            if (getChildCount() > 0) {
                View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus(), i);
                View childAt = getChildAt(0);
                if (childAt != null && findNextFocus != null && findNextFocus.getParent() == childAt) {
                    if (!b(findNextFocus)) {
                        Object[] objArr2 = {findNextFocus};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9d33710c430ad1d8f4defd43059b7b5", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9d33710c430ad1d8f4defd43059b7b5")).booleanValue();
                        } else {
                            int a2 = a(findNextFocus);
                            findNextFocus.getDrawingRect(this.N);
                            z = a2 != 0 && Math.abs(a2) < this.N.width() / 2;
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
            this.A = false;
            return z2;
        }
        return super.arrowScroll(i);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6062311840f353316adcb4ccb5373262", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6062311840f353316adcb4ccb5373262")).booleanValue();
        }
        if (this.o) {
            this.f.a(motionEvent);
            if ((motionEvent.getAction() & 255) == 1 && this.k) {
                d(getScrollX(), getScrollY());
                this.f.b();
                float f = this.f.b;
                float f2 = this.f.c;
                this.k = false;
                b(Math.round(f), Math.round(f2));
            }
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView
    public boolean executeKeyEvent(KeyEvent keyEvent) {
        Object[] objArr = {keyEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a978c629e24fd862601751b869e63b03", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a978c629e24fd862601751b869e63b03")).booleanValue();
        }
        int keyCode = keyEvent.getKeyCode();
        if (this.o || !(keyCode == 21 || keyCode == 22)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView
    public void fling(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f0e1d825f60c41b0e0297ede3895634", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f0e1d825f60c41b0e0297ede3895634");
            return;
        }
        int abs = (int) (Math.abs(i) * Math.signum(this.d.b));
        if (this.l) {
            b(abs);
        } else if (this.e != null) {
            this.e.fling(getScrollX(), getScrollY(), abs, 0, 0, Integer.MAX_VALUE, 0, 0, ((getWidth() - ViewCompat.getPaddingStart(this)) - ViewCompat.getPaddingEnd(this)) / 2, 0);
            ViewCompat.postInvalidateOnAnimation(this);
        } else {
            super.fling(abs);
        }
        b(abs, 0);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1935a281ebfb4a4d01f42fc7c8d946c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1935a281ebfb4a4d01f42fc7c8d946c");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7816191a73a415af087dc091f72e39a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7816191a73a415af087dc091f72e39a0");
            return;
        }
        super.onAttachedToWindow();
        if (this.n) {
            a();
        }
    }

    @Override // com.meituan.msc.uimanager.v
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adb701897fa801ef5dbe355d0ac113ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adb701897fa801ef5dbe355d0ac113ab");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71e4e546f21808caab94c7fc807fd4c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71e4e546f21808caab94c7fc807fd4c6");
        } else {
            rect.set((Rect) com.facebook.infer.annotation.a.a(this.i));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        Object[] objArr = {view, rect, point};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d512a17e322a26c23cf483ae94d6b2cc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d512a17e322a26c23cf483ae94d6b2cc")).booleanValue();
        }
        if (com.meituan.msc.jse.config.a.g) {
            return w.a(view, rect, point, this, this.j);
        }
        return super.getChildVisibleRect(view, rect, point);
    }

    private int getSnapInterval() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0e922bbadc72311a31aadad696b5429", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0e922bbadc72311a31aadad696b5429")).intValue();
        }
        if (this.v != 0) {
            return this.v;
        }
        return getWidth();
    }

    public void setEndFillColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70ecc2561dee81385d07bd3bedbaacc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70ecc2561dee81385d07bd3bedbaacc7");
        } else if (i != this.t) {
            this.t = i;
            this.s = new ColorDrawable(this.t);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        int computeHorizontalScrollRange;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36026e3d10749697450bbf71ecd0af96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36026e3d10749697450bbf71ecd0af96");
            return;
        }
        if (this.e != null && !this.e.isFinished() && this.e.getCurrX() != this.e.getFinalX() && i >= (computeHorizontalScrollRange = computeHorizontalScrollRange() - getWidth())) {
            this.e.abortAnimation();
            i = computeHorizontalScrollRange;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    private boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2d57c14ec6105df50b183fa9e2ac175", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2d57c14ec6105df50b183fa9e2ac175")).booleanValue() : (this.q == null || this.r == null || this.r.isEmpty()) ? false : true;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f338ba397b42a14e79faf063f751d75d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f338ba397b42a14e79faf063f751d75d");
            return;
        }
        if (this.t != 0) {
            View childAt = getChildAt(0);
            if (this.s != null && childAt != null && childAt.getRight() < getWidth()) {
                this.s.setBounds(childAt.getRight(), 0, getWidth(), getHeight());
                this.s.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    private void b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c42872868c5454df7fbf2933ac07c5d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c42872868c5454df7fbf2933ac07c5d5");
        } else if ((this.p || this.l || b()) && this.m == null) {
            this.h = false;
            this.m = new Runnable() { // from class: com.meituan.msc.mmpviews.scroll.c.1
                public static ChangeQuickRedirect a;
                private boolean c = false;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2df12ed71ae1d183b0573086a25c8402", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2df12ed71ae1d183b0573086a25c8402");
                    } else if (!c.this.h) {
                        c.this.d(c.this.getScrollX(), c.this.getScrollY());
                        if (!c.this.l || this.c) {
                            boolean unused = c.this.p;
                            c.a(c.this, (Runnable) null);
                            c.d(c.this);
                            return;
                        }
                        this.c = true;
                        c.this.b(0);
                        ViewCompat.postOnAnimationDelayed(c.this, this, 20L);
                    } else {
                        c.a(c.this, false);
                        ViewCompat.postOnAnimationDelayed(c.this, this, 20L);
                    }
                }
            };
            ViewCompat.postOnAnimationDelayed(this, this.m, 20L);
        }
    }

    private int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db0f45cd2a343f646e87946563770a9a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db0f45cd2a343f646e87946563770a9a")).intValue();
        }
        OverScroller overScroller = new OverScroller(getContext());
        overScroller.setFriction(1.0f - this.w);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "331f001a3c0ee3f3a80c451f144da6f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "331f001a3c0ee3f3a80c451f144da6f7");
        } else if (getChildCount() > 0) {
            if (this.v == 0 && this.x == null) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "569c5ceb858f2c66b61b6287ee33920a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "569c5ceb858f2c66b61b6287ee33920a");
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
                    this.h = true;
                    c((int) d2, getScrollY());
                    return;
                }
                return;
            }
            int max = Math.max(0, computeHorizontalScrollRange() - getWidth());
            int a2 = a(i);
            if (this.u) {
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
            if (this.x != null) {
                int intValue = this.x.get(0).intValue();
                i3 = this.x.get(this.x.size() - 1).intValue();
                int i5 = max;
                int i6 = 0;
                for (int i7 = 0; i7 < this.x.size(); i7++) {
                    int intValue2 = this.x.get(i7).intValue();
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
            if (!this.z && a2 >= i3) {
                if (scrollX2 < i3) {
                    i11 = i3;
                }
                i11 = a2;
            } else if (!this.y && a2 <= i4) {
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
            if (this.e != null) {
                this.h = true;
                OverScroller overScroller = this.e;
                int scrollX3 = getScrollX();
                int scrollY = getScrollY();
                if (i2 == 0) {
                    i2 = min2 - getScrollX();
                }
                overScroller.fling(scrollX3, scrollY, i2, 0, min2, min2, 0, 0, (min2 == 0 || min2 == max) ? width / 2 : 0, 0);
                postInvalidateOnAnimation();
                return;
            }
            c(min2, getScrollY());
        }
    }

    private void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df25f81d43ae0420fc95c4e5a3c889f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df25f81d43ae0420fc95c4e5a3c889f3");
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
        c(i3 * width, getScrollY());
        b(0, 0);
    }

    private void c(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02da4413b3d5aac33862fc5c0a2bbc38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02da4413b3d5aac33862fc5c0a2bbc38");
            return;
        }
        smoothScrollTo(i, i2);
        d(i, i2);
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9408c17a407ce87a33cb59e42377861d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9408c17a407ce87a33cb59e42377861d");
            return;
        }
        scrollTo(i, i2);
        d(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e81482174c6d060b0329cbe21485c34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e81482174c6d060b0329cbe21485c34");
        } else if (this.B == null) {
        } else {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("contentOffsetLeft", s.c(i));
            createMap.putDouble("contentOffsetTop", s.c(i2));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void computeScroll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "972799328372f27a488f29dba7dddd5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "972799328372f27a488f29dba7dddd5a");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcb30946c43ca33cc30ec32a88071b93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcb30946c43ca33cc30ec32a88071b93");
            return;
        }
        this.D = z;
        if (this.E >= 0 || this.F >= 0) {
            int i = this.E;
            int i2 = this.F;
            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a8a0033e8f6cbfb4ba2cd96095759c9b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a8a0033e8f6cbfb4ba2cd96095759c9b");
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
