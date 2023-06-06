package com.meituan.android.legwork.mrn.view;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.NestedScrollView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.OverScroller;
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
@TargetApi(11)
/* loaded from: classes2.dex */
public class ReactNestedScrollView extends NestedScrollView implements View.OnLayoutChangeListener, ViewGroup.OnHierarchyChangeListener, y {
    public static ChangeQuickRedirect a = null;
    @Nullable
    private static Field c = null;
    private static boolean d = false;
    private View A;
    private Field B;
    private Field C;
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

    public static /* synthetic */ Runnable a(ReactNestedScrollView reactNestedScrollView, Runnable runnable) {
        reactNestedScrollView.n = null;
        return null;
    }

    public static /* synthetic */ boolean a(ReactNestedScrollView reactNestedScrollView, boolean z) {
        reactNestedScrollView.i = false;
        return false;
    }

    public static /* synthetic */ void d(ReactNestedScrollView reactNestedScrollView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, reactNestedScrollView, changeQuickRedirect, false, "eda416e1240190e2b717bd52bb6e4c9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, reactNestedScrollView, changeQuickRedirect, false, "eda416e1240190e2b717bd52bb6e4c9d");
        } else if (reactNestedScrollView.d()) {
            com.facebook.infer.annotation.a.a(reactNestedScrollView.r);
            com.facebook.infer.annotation.a.a(reactNestedScrollView.s);
        }
    }

    public ReactNestedScrollView(ReactContext reactContext) {
        this(reactContext, null);
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "717d8342776dff66250efdbf9d750e63", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "717d8342776dff66250efdbf9d750e63");
        }
    }

    public ReactNestedScrollView(ReactContext reactContext, @Nullable com.facebook.react.views.scroll.a aVar) {
        super(reactContext);
        Object[] objArr = {reactContext, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed88b913f1d11b2bb927516841d4d10a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed88b913f1d11b2bb927516841d4d10a");
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
        this.r = aVar;
        this.b = new com.facebook.react.views.view.e(this);
        this.f = getOverScrollerFromParent();
        setOnHierarchyChangeListener(this);
        setScrollBarStyle(33554432);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "48882118767c82b86697adc5c92effa1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "48882118767c82b86697adc5c92effa1");
            return;
        }
        try {
            this.B = NestedScrollView.class.getDeclaredField("mLastScroll");
            this.B.setAccessible(true);
            this.C = NestedScrollView.class.getDeclaredField("mLastScrollerY");
            this.C.setAccessible(true);
        } catch (Exception e) {
            x.e("ReactNestedScrollView.initReflect()", "exception msg:", e);
        }
    }

    private long getLastScrollField() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ef5a77444b1a88b3a894245271f5d3e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ef5a77444b1a88b3a894245271f5d3e")).longValue();
        }
        try {
            return this.B.getLong(this);
        } catch (IllegalAccessException e) {
            x.e("ReactNestedScrollView.getLastScrollField()", "exception msg:", e);
            return 0L;
        }
    }

    private void setLastScrollField(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b9f256caa89c362e518eaa4d5712b97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b9f256caa89c362e518eaa4d5712b97");
            return;
        }
        try {
            this.B.setLong(this, j);
        } catch (IllegalAccessException e) {
            x.e("ReactNestedScrollView.setLastScrollField()", "exception msg:", e);
        }
    }

    private void setLastScrollerYField(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07bfdac1b9278e25f42ee3835a77bc6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07bfdac1b9278e25f42ee3835a77bc6a");
            return;
        }
        try {
            this.C.setInt(this, i);
        } catch (IllegalAccessException e) {
            x.e("ReactNestedScrollView.setLastScrollerYField()", "exception msg:", e);
        }
    }

    @Nullable
    private OverScroller getOverScrollerFromParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b65792540238a37da66c1edfe8bd809a", RobustBitConfig.DEFAULT_VALUE)) {
            return (OverScroller) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b65792540238a37da66c1edfe8bd809a");
        }
        if (!d) {
            d = true;
            try {
                Field declaredField = NestedScrollView.class.getDeclaredField("mScroller");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                x.e("ReactNestedScrollView.getOverScrollerFromParent()", "exception msg:", e);
            }
        }
        OverScroller overScroller = null;
        if (c != null) {
            try {
                Object obj = c.get(this);
                if (obj instanceof OverScroller) {
                    overScroller = (OverScroller) obj;
                } else {
                    x.e("ReactNestedScrollView.getOverScrollerFromParent()", "Failed to cast mScroller field in ScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
                }
            } catch (IllegalAccessException e2) {
                x.e("ReactNestedScrollView.getOverScrollerFromParent()", "exception2 msg:", e2);
            }
        }
        return overScroller;
    }

    public void setSendMomentumEvents(boolean z) {
        this.q = z;
    }

    public void setScrollPerfTag(@Nullable String str) {
        this.s = str;
    }

    public void setScrollEnabled(boolean z) {
        this.p = z;
    }

    public void setPagingEnabled(boolean z) {
        this.m = z;
    }

    public void setDecelerationRate(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50a5aaf5e68d6511065fb10c3cb3fe4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50a5aaf5e68d6511065fb10c3cb3fe4a");
            return;
        }
        this.w = f;
        if (this.f != null) {
            this.f.setFriction(1.0f - this.w);
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

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba32ba1ca1f94b1cf666aa3bd26629fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba32ba1ca1f94b1cf666aa3bd26629fd");
        } else {
            awakenScrollBars();
        }
    }

    public void setOverflow(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71f960cf06ec4d7d64a0010850f9c7a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71f960cf06ec4d7d64a0010850f9c7a5");
            return;
        }
        this.k = str;
        invalidate();
    }

    @Override // android.support.v4.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4780a4375fff2740f54fe17210141aaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4780a4375fff2740f54fe17210141aaf");
            return;
        }
        q.a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.support.v4.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e535e18a0faca8edad37333aa53727d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e535e18a0faca8edad37333aa53727d4");
        } else {
            scrollTo(getScrollX(), getScrollY());
        }
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94d10357d7d856346c659878fdf818f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94d10357d7d856346c659878fdf818f6");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.o) {
            updateClippingRect();
        }
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21338ae8b27daf71182e4ecb587bc7aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21338ae8b27daf71182e4ecb587bc7aa");
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

    @Override // android.support.v4.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68c332095e84d10c640389c8fb08d192", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68c332095e84d10c640389c8fb08d192")).booleanValue();
        }
        if (this.p) {
            try {
                if (super.onInterceptTouchEvent(motionEvent)) {
                    com.facebook.react.uimanager.events.e.a(this, motionEvent);
                    com.facebook.react.views.scroll.g.a(this);
                    this.l = true;
                    c();
                    return true;
                }
            } catch (IllegalArgumentException e) {
                x.e("ReactNestedScrollView.onInterceptTouchEvent()", "exception msg:", e);
            }
            return false;
        }
        return false;
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "855c5935d0009042e0dd1c8435ab18e6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "855c5935d0009042e0dd1c8435ab18e6")).booleanValue();
        }
        if (this.p) {
            this.g.a(motionEvent);
            if ((motionEvent.getAction() & 255) == 1 && this.l) {
                float a2 = this.g.a();
                float b = this.g.b();
                com.facebook.react.views.scroll.g.b(this, a2, b);
                this.l = false;
                b(Math.round(a2), Math.round(b));
            }
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setRemoveClippedSubviews(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f261351d9b4d28b86889e6fde81c2c0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f261351d9b4d28b86889e6fde81c2c0f");
            return;
        }
        if (z && this.j == null) {
            this.j = new Rect();
        }
        this.o = z;
        updateClippingRect();
    }

    @Override // com.facebook.react.uimanager.y
    public boolean getRemoveClippedSubviews() {
        return this.o;
    }

    @Override // com.facebook.react.uimanager.y
    public void updateClippingRect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b760095ea700f7d238a56d73a0a9c88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b760095ea700f7d238a56d73a0a9c88");
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
    public void getClippingRect(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "742f295e2b3168eeb66b49ea0470e156", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "742f295e2b3168eeb66b49ea0470e156");
        } else {
            rect.set((Rect) com.facebook.infer.annotation.a.a(this.j));
        }
    }

    @Override // android.support.v4.widget.NestedScrollView
    public void fling(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e5dac0e47c0b632c18519aa6b53f190", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e5dac0e47c0b632c18519aa6b53f190");
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
            super.fling(i);
        } else {
            super.fling(abs);
        }
        b(0, abs);
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a200c9b1276a7d92e3c75719c04f79d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a200c9b1276a7d92e3c75719c04f79d");
        } else if (d()) {
            com.facebook.infer.annotation.a.a(this.r);
            com.facebook.infer.annotation.a.a(this.s);
        }
    }

    private boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "631a0699df8468cf03d824224d1312d9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "631a0699df8468cf03d824224d1312d9")).booleanValue() : (this.r == null || this.s == null || this.s.isEmpty()) ? false : true;
    }

    private int getMaxScrollY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e407ba98200ac4cf6d58d8aeb03c4ef", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e407ba98200ac4cf6d58d8aeb03c4ef")).intValue() : Math.max(0, this.A.getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bac32dbfe1c54d5bc61f7513095e68d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bac32dbfe1c54d5bc61f7513095e68d");
            return;
        }
        if (this.f != null) {
            this.f.abortAnimation();
        }
        stopNestedScroll(1);
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.View
    public void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90356950adc5aaa3b42b29a92805c094", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90356950adc5aaa3b42b29a92805c094");
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

    public final void a(int i, int i2) {
        boolean z = true;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1d456332aeb7f4407988231ca3a66b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1d456332aeb7f4407988231ca3a66b2");
            return;
        }
        int scrollX = i - getScrollX();
        int scrollY = i2 - getScrollY();
        Object[] objArr2 = {Integer.valueOf(scrollX), Integer.valueOf(scrollY)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e672f39254ff347d045ca402be4a04ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e672f39254ff347d045ca402be4a04ac");
            return;
        }
        if (!((this.B == null || this.C == null) ? false : false)) {
            smoothScrollBy(scrollX, scrollY);
        } else if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - getLastScrollField() > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int scrollY2 = getScrollY();
                setLastScrollerYField(getScrollY());
                this.f.startScroll(getScrollX(), scrollY2, 0, Math.max(0, Math.min(scrollY + scrollY2, Math.max(0, height - height2))) - scrollY2);
                ViewCompat.postInvalidateOnAnimation(this);
            } else {
                if (!this.f.isFinished()) {
                    this.f.abortAnimation();
                }
                scrollBy(scrollX, scrollY);
            }
            setLastScrollField(AnimationUtils.currentAnimationTimeMillis());
        }
    }

    private void b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "067ae7faf10b4a756f072c3ae278ac03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "067ae7faf10b4a756f072c3ae278ac03");
        } else if ((this.q || this.m || d()) && this.n == null) {
            if (this.q) {
                c();
                com.facebook.react.views.scroll.g.a((ViewGroup) this, i, i2);
            }
            this.i = false;
            this.n = new Runnable() { // from class: com.meituan.android.legwork.mrn.view.ReactNestedScrollView.1
                public static ChangeQuickRedirect a;
                private boolean c = false;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7c1a20adf527a686b98e12fda5418c76", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7c1a20adf527a686b98e12fda5418c76");
                    } else if (!ReactNestedScrollView.this.i) {
                        if (!ReactNestedScrollView.this.m || this.c) {
                            if (ReactNestedScrollView.this.q) {
                                com.facebook.react.views.scroll.g.b(ReactNestedScrollView.this);
                            }
                            ReactNestedScrollView.a(ReactNestedScrollView.this, (Runnable) null);
                            ReactNestedScrollView.d(ReactNestedScrollView.this);
                            return;
                        }
                        this.c = true;
                        ReactNestedScrollView.this.b(0);
                        ViewCompat.postOnAnimationDelayed(ReactNestedScrollView.this, this, 20L);
                    } else {
                        ReactNestedScrollView.a(ReactNestedScrollView.this, false);
                        ViewCompat.postOnAnimationDelayed(ReactNestedScrollView.this, this, 20L);
                    }
                }
            };
            ViewCompat.postOnAnimationDelayed(this, this.n, 20L);
        }
    }

    private int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b5ad18629a03e25c2abe2c2458806ca", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b5ad18629a03e25c2abe2c2458806ca")).intValue();
        }
        OverScroller overScroller = new OverScroller(getContext());
        overScroller.setFriction(1.0f - this.w);
        overScroller.fling(getScrollX(), getScrollY(), 0, i, 0, 0, 0, getMaxScrollY(), 0, ((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
        return overScroller.getFinalY();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        int min;
        int floor;
        int i2;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61a529c1a55f03b3370005482e615a99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61a529c1a55f03b3370005482e615a99");
        } else if (getChildCount() > 0) {
            if (this.v == 0 && this.x == null) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75a91b6a8736e49de6deab72de78cdfe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75a91b6a8736e49de6deab72de78cdfe");
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
                int i3 = maxScrollY;
                floor = 0;
                for (int i4 = 0; i4 < this.x.size(); i4++) {
                    int intValue = this.x.get(i4).intValue();
                    if (intValue <= a2 && a2 - intValue < a2 - floor) {
                        floor = intValue;
                    }
                    if (intValue >= a2 && intValue - a2 < i3 - a2) {
                        i3 = intValue;
                    }
                }
                min = i3;
            } else {
                double snapInterval2 = getSnapInterval();
                double d4 = a2 / snapInterval2;
                min = Math.min((int) (Math.ceil(d4) * snapInterval2), maxScrollY);
                floor = (int) (Math.floor(d4) * snapInterval2);
            }
            int i5 = a2 - floor;
            int i6 = min - a2;
            int i7 = i5 < i6 ? floor : min;
            if (!this.z && a2 >= maxScrollY) {
                if (getScrollY() < maxScrollY) {
                    i2 = i;
                    a2 = maxScrollY;
                }
                i2 = i;
            } else if (!this.y && a2 <= 0) {
                if (getScrollY() > 0) {
                    i2 = i;
                    a2 = 0;
                }
                i2 = i;
            } else if (i > 0) {
                i2 = i + ((int) (i6 * 10.0d));
                a2 = min;
            } else if (i < 0) {
                i2 = i - ((int) (i5 * 10.0d));
                a2 = floor;
            } else {
                i2 = i;
                a2 = i7;
            }
            int min2 = Math.min(Math.max(0, a2), maxScrollY);
            if (this.f != null) {
                this.i = true;
                OverScroller overScroller = this.f;
                int scrollX = getScrollX();
                int scrollY2 = getScrollY();
                if (i2 == 0) {
                    i2 = min2 - getScrollY();
                }
                overScroller.fling(scrollX, scrollY2, 0, i2, 0, 0, min2, min2, 0, (min2 == 0 || min2 == maxScrollY) ? height / 2 : 0);
                postInvalidateOnAnimation();
                return;
            }
            smoothScrollTo(getScrollX(), min2);
        }
    }

    private int getSnapInterval() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "506032b3fa8729c1afa9dc2cdb053217", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "506032b3fa8729c1afa9dc2cdb053217")).intValue();
        }
        if (this.v != 0) {
            return this.v;
        }
        return getHeight();
    }

    public void setEndFillColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ee02136b115959594d2c32b5e2c0ac6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ee02136b115959594d2c32b5e2c0ac6");
        } else if (i != this.u) {
            this.u = i;
            this.t = new ColorDrawable(this.u);
        }
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        int maxScrollY;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c88bba5773e6a9176bb30b52fb81512", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c88bba5773e6a9176bb30b52fb81512");
            return;
        }
        if (this.f != null && this.A != null && !this.f.isFinished() && this.f.getCurrY() != this.f.getFinalY() && i2 >= (maxScrollY = getMaxScrollY())) {
            this.f.abortAnimation();
            i2 = maxScrollY;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37816dde9e8fb37b4d3970807a224dae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37816dde9e8fb37b4d3970807a224dae");
            return;
        }
        this.A = view2;
        this.A.addOnLayoutChangeListener(this);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0445643e7df5e3dd6a94d590a5bcb8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0445643e7df5e3dd6a94d590a5bcb8c");
            return;
        }
        this.A.removeOnLayoutChangeListener(this);
        this.A = null;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ed01d2b3eb28a707184abfc4f7bdea8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ed01d2b3eb28a707184abfc4f7bdea8");
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
    public void setBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4a4b8e3b2252a85cb6a4d2525a7c0d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4a4b8e3b2252a85cb6a4d2525a7c0d7");
        } else {
            this.b.a(i);
        }
    }

    public void setBorderRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b21209965eaa5a88006719e8c98e051b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b21209965eaa5a88006719e8c98e051b");
        } else {
            this.b.a(f);
        }
    }

    public void setBorderStyle(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3e0d1bd8e89b76428cd20bd20475d60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3e0d1bd8e89b76428cd20bd20475d60");
        } else {
            this.b.a(str);
        }
    }
}
