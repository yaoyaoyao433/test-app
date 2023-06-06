package com.dianping.picassocontroller.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewCompat;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.dianping.picasso.PicassoUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class WheelView extends View {
    public static ChangeQuickRedirect a = null;
    public static final String b = "WheelView";
    private static final int[] d = {-1, ViewCompat.MEASURED_SIZE_MASK, ViewCompat.MEASURED_SIZE_MASK};
    private final int A;
    private Handler B;
    public boolean c;
    private b e;
    private int f;
    private int g;
    private int h;
    private int i;
    private TextPaint j;
    private TextPaint k;
    private DynamicLayout l;
    private DynamicLayout m;
    private GradientDrawable n;
    private GradientDrawable o;
    private boolean p;
    private int q;
    private GestureDetector r;
    private Scroller s;
    private int t;
    private List<Object> u;
    private List<Object> v;
    private SpannableStringBuilder w;
    private SpannableStringBuilder x;
    private GestureDetector.SimpleOnGestureListener y;
    private final int z;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface b {
        int a();

        String a(int i);
    }

    public static /* synthetic */ void a(WheelView wheelView, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, wheelView, changeQuickRedirect, false, "eac9f77454253688a37fe5bdb241155e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, wheelView, changeQuickRedirect, false, "eac9f77454253688a37fe5bdb241155e");
            return;
        }
        wheelView.q += i;
        int itemHeight = wheelView.q / wheelView.getItemHeight();
        int i2 = wheelView.f - itemHeight;
        if (wheelView.c && wheelView.e.a() > 0) {
            while (i2 < 0) {
                i2 += wheelView.e.a();
            }
            i2 %= wheelView.e.a();
        } else if (!wheelView.p) {
            i2 = Math.min(Math.max(i2, 0), wheelView.e.a() - 1);
        } else if (i2 < 0) {
            itemHeight = wheelView.f;
            i2 = 0;
        } else if (i2 >= wheelView.e.a()) {
            itemHeight = (wheelView.f - wheelView.e.a()) + 1;
            i2 = wheelView.e.a() - 1;
        }
        int i3 = wheelView.q;
        if (i2 != wheelView.f) {
            wheelView.a(i2, false);
        } else {
            wheelView.invalidate();
        }
        wheelView.q = i3 - (itemHeight * wheelView.getItemHeight());
        if (wheelView.q > wheelView.getHeight()) {
            wheelView.q = (wheelView.q % wheelView.getHeight()) + wheelView.getHeight();
        }
        wheelView.q = Math.max((-((wheelView.e.a() - wheelView.f) - 1)) * wheelView.getItemHeight(), Math.min(wheelView.q, wheelView.f * wheelView.getItemHeight()));
    }

    public WheelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c55f653a8e3fffa534e60070db3cb3f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c55f653a8e3fffa534e60070db3cb3f");
            return;
        }
        this.e = null;
        this.f = -1;
        this.g = 0;
        this.h = 5;
        this.i = 0;
        this.c = false;
        this.u = new LinkedList();
        this.v = new LinkedList();
        this.y = new GestureDetector.SimpleOnGestureListener() { // from class: com.dianping.picassocontroller.widget.WheelView.1
            public static ChangeQuickRedirect a;

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9d126a01b3181f8c4522e520135545c6", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9d126a01b3181f8c4522e520135545c6")).booleanValue();
                }
                if (WheelView.this.p) {
                    WheelView.this.s.forceFinished(true);
                    WheelView.this.c();
                    return true;
                }
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                Object[] objArr2 = {motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b2dbfb20960d7d50ba737fcafafa34f8", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b2dbfb20960d7d50ba737fcafafa34f8")).booleanValue();
                }
                WheelView.this.e();
                WheelView.a(WheelView.this, (int) (-f2));
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                Object[] objArr2 = {motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d69b28cbcee098a7a31e400ff2527bff", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d69b28cbcee098a7a31e400ff2527bff")).booleanValue();
                }
                WheelView.this.t = (WheelView.this.f * WheelView.this.getItemHeight()) + WheelView.this.q;
                int a2 = WheelView.this.c ? Integer.MAX_VALUE : WheelView.this.e.a() * WheelView.this.getItemHeight();
                WheelView.this.s.fling(0, WheelView.this.t, 0, ((int) (-f2)) / 2, 0, 0, WheelView.this.c ? -a2 : 0, a2);
                WheelView.this.setNextMessage(0);
                return true;
            }
        };
        this.z = 0;
        this.A = 1;
        this.B = new a();
        a(context);
    }

    public WheelView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d1a8ab6d346b9c9453f166513a6dc3a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d1a8ab6d346b9c9453f166513a6dc3a");
            return;
        }
        this.e = null;
        this.f = -1;
        this.g = 0;
        this.h = 5;
        this.i = 0;
        this.c = false;
        this.u = new LinkedList();
        this.v = new LinkedList();
        this.y = new GestureDetector.SimpleOnGestureListener() { // from class: com.dianping.picassocontroller.widget.WheelView.1
            public static ChangeQuickRedirect a;

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9d126a01b3181f8c4522e520135545c6", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9d126a01b3181f8c4522e520135545c6")).booleanValue();
                }
                if (WheelView.this.p) {
                    WheelView.this.s.forceFinished(true);
                    WheelView.this.c();
                    return true;
                }
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                Object[] objArr2 = {motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b2dbfb20960d7d50ba737fcafafa34f8", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b2dbfb20960d7d50ba737fcafafa34f8")).booleanValue();
                }
                WheelView.this.e();
                WheelView.a(WheelView.this, (int) (-f2));
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                Object[] objArr2 = {motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d69b28cbcee098a7a31e400ff2527bff", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d69b28cbcee098a7a31e400ff2527bff")).booleanValue();
                }
                WheelView.this.t = (WheelView.this.f * WheelView.this.getItemHeight()) + WheelView.this.q;
                int a2 = WheelView.this.c ? Integer.MAX_VALUE : WheelView.this.e.a() * WheelView.this.getItemHeight();
                WheelView.this.s.fling(0, WheelView.this.t, 0, ((int) (-f2)) / 2, 0, 0, WheelView.this.c ? -a2 : 0, a2);
                WheelView.this.setNextMessage(0);
                return true;
            }
        };
        this.z = 0;
        this.A = 1;
        this.B = new a();
        a(context);
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7a451b9d75b126a2f62e6f052c44156", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7a451b9d75b126a2f62e6f052c44156");
            return;
        }
        this.r = new GestureDetector(context, this.y);
        this.r.setIsLongpressEnabled(false);
        this.s = new Scroller(context);
    }

    public b getAdapter() {
        return this.e;
    }

    public void setAdapter(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d671447e938d2209c9d8b54c88e7fde3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d671447e938d2209c9d8b54c88e7fde3");
            return;
        }
        this.e = bVar;
        this.q = 0;
        this.g = 0;
        invalidate();
    }

    public void setInterpolator(Interpolator interpolator) {
        Object[] objArr = {interpolator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98fc5f7d27637800088000a46f0246f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98fc5f7d27637800088000a46f0246f0");
            return;
        }
        this.s.forceFinished(true);
        this.s = new Scroller(getContext(), interpolator);
    }

    public int getVisibleItems() {
        return this.h;
    }

    public void setVisibleItems(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8c86782705de0f131e53b1b2987a52a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8c86782705de0f131e53b1b2987a52a");
            return;
        }
        this.h = i;
        invalidate();
    }

    private void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76e761ce8566ad965db5731e5c5e638e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76e761ce8566ad965db5731e5c5e638e");
            return;
        }
        Iterator<Object> it = this.u.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "487be3b30a76792e454eae2b24d61787", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "487be3b30a76792e454eae2b24d61787");
            return;
        }
        Iterator<Object> it = this.v.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public int getCurrentItem() {
        return this.f;
    }

    @Override // android.view.View
    public void computeScroll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a418bded8e8de01aae233d16d27efe5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a418bded8e8de01aae233d16d27efe5");
        } else {
            super.computeScroll();
        }
    }

    private void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a27fcf535e2609ee996b1feb8450af50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a27fcf535e2609ee996b1feb8450af50");
        } else if (this.e == null || this.e.a() == 0) {
        } else {
            if (i < 0 || i >= this.e.a()) {
                if (!this.c) {
                    return;
                }
                while (i < 0) {
                    i += this.e.a();
                }
                i %= this.e.a();
            }
            if (i != this.f) {
                this.q = 0;
                int i2 = this.f;
                this.f = i;
                a(i2, this.f);
                invalidate();
            }
        }
    }

    public void setCurrentItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "850536e961f0abc6fccd431b6c6c91d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "850536e961f0abc6fccd431b6c6c91d5");
        } else {
            a(i, false);
        }
    }

    public void setCyclic(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1278b4d3d635ef719e624f03c32e2d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1278b4d3d635ef719e624f03c32e2d9");
            return;
        }
        this.c = z;
        invalidate();
        this.q = 0;
    }

    private String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c06c97ca7b9c7e3bc4769c1a6f015829", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c06c97ca7b9c7e3bc4769c1a6f015829");
        }
        if (this.e == null || this.e.a() == 0) {
            return null;
        }
        int a2 = this.e.a();
        if ((i < 0 || i >= a2) && !this.c) {
            return null;
        }
        while (i < 0) {
            i += a2;
        }
        String a3 = this.e.a(i % a2);
        if (getWidth() > 0) {
            int length = a3.length();
            while (length > 0 && Layout.getDesiredWidth(a3, 0, length, this.j) > getWidth()) {
                length--;
            }
            if (length != a3.length()) {
                return a3.substring(0, length - 1) + "...";
            }
            return a3;
        }
        return a3;
    }

    private String a(boolean z) {
        String a2;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "392f0c7c4cb20b6fe2c7e02178627f38", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "392f0c7c4cb20b6fe2c7e02178627f38");
        }
        if (this.f < 0) {
            this.f = 0;
        }
        StringBuilder sb = new StringBuilder();
        int i = (this.h / 2) + 1;
        for (int i2 = this.f - i; i2 <= this.f + i; i2++) {
            if ((z || i2 != this.f) && (a2 = a(i2)) != null) {
                sb.append(a2);
            }
            if (i2 < this.f + i) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    private float getMaxTextWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f73286d3cef13471a93fd011f956ab58", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f73286d3cef13471a93fd011f956ab58")).floatValue();
        }
        b adapter = getAdapter();
        float f = 0.0f;
        if (adapter == null) {
            return 0.0f;
        }
        for (int i = 0; i < adapter.a(); i++) {
            String a2 = adapter.a(i);
            if (!TextUtils.isEmpty(a2)) {
                f = Math.max(f, Layout.getDesiredWidth(a2, this.j));
            }
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getItemHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd771c5c31b6ec361d31c97f0499062c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd771c5c31b6ec361d31c97f0499062c")).intValue();
        }
        if (this.i != 0) {
            return this.i;
        }
        if (this.l != null && this.l.getLineCount() > 2) {
            this.i = this.l.getLineTop(2) - this.l.getLineTop(1);
            return this.i;
        }
        return getHeight() / this.h;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3 = 0;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee05c566a06577d70f2c6b787e0f39b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee05c566a06577d70f2c6b787e0f39b7");
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        Object[] objArr2 = {Integer.valueOf(size), Integer.valueOf(mode)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cb1305b35171d97de8722b9f176288b3", RobustBitConfig.DEFAULT_VALUE)) {
            size = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cb1305b35171d97de8722b9f176288b3")).intValue();
        } else {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9d1695e3c830f49506551f9d83d36f90", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9d1695e3c830f49506551f9d83d36f90");
            } else {
                if (this.j == null) {
                    this.j = new TextPaint(1);
                    this.j.density = getResources().getDisplayMetrics().density;
                    this.j.setTextSize(PicassoUtils.dp2px(getContext(), 18.0f));
                }
                if (this.k == null) {
                    this.k = new TextPaint(37);
                    this.k.density = getResources().getDisplayMetrics().density;
                    this.k.setTextSize(PicassoUtils.dp2px(getContext(), 18.0f));
                    this.k.setShadowLayer(0.1f, 0.0f, 0.1f, -4144960);
                }
                if (this.n == null) {
                    this.n = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, d);
                }
                if (this.o == null) {
                    this.o = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, d);
                }
                setBackgroundColor(0);
            }
            this.g = (int) getMaxTextWidth();
            this.g += 10;
            if (mode == 1073741824) {
                z = true;
            } else {
                int max = Math.max(this.g + 30, getSuggestedMinimumWidth());
                if (mode != Integer.MIN_VALUE || size >= max) {
                    size = max;
                    z = false;
                } else {
                    z = true;
                }
            }
            if (z) {
                int i4 = size - 30;
                if (i4 <= 0) {
                    this.g = 0;
                }
                this.g = i4;
            }
            if (this.g > 0) {
                int i5 = this.g;
                Object[] objArr4 = {Integer.valueOf(i5)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0d8472420f81ef7e5f15c98119d14eed", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0d8472420f81ef7e5f15c98119d14eed");
                } else {
                    this.w = new SpannableStringBuilder(a(this.p));
                    this.l = new DynamicLayout(this.w, this.j, i5, Layout.Alignment.ALIGN_CENTER, 1.0f, 45.0f, false);
                }
                int i6 = this.g;
                Object[] objArr5 = {Integer.valueOf(i6)};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "caeafdf32ec7495f38cec090a8a2c1f3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "caeafdf32ec7495f38cec090a8a2c1f3");
                } else {
                    this.x = new SpannableStringBuilder();
                    this.m = new DynamicLayout(this.x, this.k, i6, Layout.Alignment.ALIGN_CENTER, 1.0f, 45.0f, false);
                }
            }
        }
        if (mode2 != 1073741824) {
            DynamicLayout dynamicLayout = this.l;
            Object[] objArr6 = {dynamicLayout};
            ChangeQuickRedirect changeQuickRedirect6 = a;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "588f19f8953e2941280656f4c80b8ec1", RobustBitConfig.DEFAULT_VALUE)) {
                i3 = ((Integer) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "588f19f8953e2941280656f4c80b8ec1")).intValue();
            } else if (dynamicLayout != null) {
                i3 = Math.max(((getItemHeight() * this.h) - 6) - 45, getSuggestedMinimumHeight());
            }
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(i3, size2) : i3;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dca745467c5f9e0a949456a718c9c545", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dca745467c5f9e0a949456a718c9c545");
            return;
        }
        super.onDraw(canvas);
        if (this.g <= 0) {
            return;
        }
        this.w.replace(0, this.w.length(), (CharSequence) a(this.p));
        String a2 = a(this.f);
        SpannableStringBuilder spannableStringBuilder = this.x;
        int length = this.x.length();
        if (a2 == null) {
            a2 = "";
        }
        spannableStringBuilder.replace(0, length, (CharSequence) a2);
        if (this.g > 0) {
            canvas.save();
            canvas.translate(15.0f, -3.0f);
            Object[] objArr2 = {canvas};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a6a4f2055b7be3f17acf2860d3af66f4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a6a4f2055b7be3f17acf2860d3af66f4");
            } else {
                canvas.save();
                canvas.translate(0.0f, (-this.l.getLineTop(1)) + this.q);
                this.j.setColor(-7829368);
                this.j.drawableState = getDrawableState();
                this.l.draw(canvas);
                canvas.restore();
            }
            Object[] objArr3 = {canvas};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "adc30b852be480ac2625751442f395a9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "adc30b852be480ac2625751442f395a9");
            } else {
                this.k.setColor(-16777216);
                this.k.drawableState = getDrawableState();
                Rect rect = new Rect();
                this.l.getLineBounds(this.h / 2, rect);
                if (this.m != null) {
                    canvas.save();
                    canvas.translate(0.0f, rect.top + this.q);
                    this.m.draw(canvas);
                    canvas.restore();
                }
            }
            canvas.restore();
        }
        Object[] objArr4 = {canvas};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1f6cda3a81af4d0aaa4ec8ff6e11a39d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1f6cda3a81af4d0aaa4ec8ff6e11a39d");
        } else {
            int height = getHeight() / 2;
            int itemHeight = getItemHeight() / 2;
            Paint paint = new Paint();
            paint.setColor(-1973791);
            int i = height - itemHeight;
            canvas.drawRect(0.0f, i, getWidth(), i + 2, paint);
            int i2 = height + itemHeight;
            canvas.drawRect(0.0f, i2 - 2, getWidth(), i2, paint);
        }
        Object[] objArr5 = {canvas};
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "674b6344e10cf82aded04e5ecdd8787a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "674b6344e10cf82aded04e5ecdd8787a");
            return;
        }
        this.n.setBounds(0, 0, getWidth(), getHeight() / this.h);
        this.n.draw(canvas);
        this.o.setBounds(0, getHeight() - (getHeight() / this.h), getWidth(), getHeight());
        this.o.draw(canvas);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00a0095bdcfdfa9a7d6bf5b7c5d08a19", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00a0095bdcfdfa9a7d6bf5b7c5d08a19")).booleanValue();
        }
        if (getAdapter() != null && !this.r.onTouchEvent(motionEvent) && motionEvent.getAction() == 1) {
            d();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextMessage(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ccabf87796859d8f75fb46e9a5d8b31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ccabf87796859d8f75fb46e9a5d8b31");
            return;
        }
        c();
        this.B.sendEmptyMessage(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "000567e088b74c4478e3e3035add2f4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "000567e088b74c4478e3e3035add2f4e");
            return;
        }
        this.B.removeMessages(0);
        this.B.removeMessages(1);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a extends Handler {
        public static ChangeQuickRedirect a;
        private WeakReference<WheelView> b;

        private a(WheelView wheelView) {
            Object[] objArr = {wheelView};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6751c70ca0149dd42de5afd6dc635e0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6751c70ca0149dd42de5afd6dc635e0");
            } else {
                this.b = new WeakReference<>(wheelView);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75efbdecb03c94bec9ab0f69765bb1d5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75efbdecb03c94bec9ab0f69765bb1d5");
                return;
            }
            WheelView wheelView = this.b.get();
            if (wheelView == null) {
                return;
            }
            wheelView.s.computeScrollOffset();
            int currY = wheelView.s.getCurrY();
            int i = wheelView.t - currY;
            wheelView.t = currY;
            if (i != 0) {
                WheelView.a(wheelView, i);
            }
            if (Math.abs(currY - wheelView.s.getFinalY()) <= 0) {
                wheelView.s.getFinalY();
                wheelView.s.forceFinished(true);
            }
            if (!wheelView.s.isFinished()) {
                wheelView.B.sendEmptyMessage(message.what);
            } else if (message.what == 0) {
                wheelView.d();
            } else {
                wheelView.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e451d40fefc8cba4c6b983115dc8bfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e451d40fefc8cba4c6b983115dc8bfd");
        } else if (this.e == null) {
        } else {
            this.t = 0;
            int i = this.q;
            int itemHeight = getItemHeight();
            if (i <= 0 ? this.f > 0 : this.f < this.e.a()) {
                z = true;
            }
            if ((this.c || z) && Math.abs(i) > itemHeight / 2.0f) {
                i = i < 0 ? i + itemHeight + 1 : i - (itemHeight + 1);
            }
            int i2 = i;
            if (Math.abs(i2) > 1) {
                this.s.startScroll(0, 0, 0, i2, 400);
                setNextMessage(1);
                return;
            }
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0731206c0e1642cd8a30a95efa3dd5c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0731206c0e1642cd8a30a95efa3dd5c5");
        } else if (this.p) {
        } else {
            this.p = true;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4d233f50c06215e8bbd0374956673b4a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4d233f50c06215e8bbd0374956673b4a");
                return;
            }
            Iterator<Object> it = this.v.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d57412c01fcf51eba750d87785ddf060", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d57412c01fcf51eba750d87785ddf060");
            return;
        }
        if (this.p) {
            b();
            this.p = false;
        }
        this.q = 0;
        invalidate();
    }
}
