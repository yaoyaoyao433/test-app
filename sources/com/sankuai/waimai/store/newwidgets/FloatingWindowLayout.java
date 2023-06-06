package com.sankuai.waimai.store.newwidgets;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class FloatingWindowLayout extends RelativeLayout {
    public static ChangeQuickRedirect a;
    public View b;
    @Nullable
    public a c;
    private final Handler d;
    private int e;
    private int f;
    private boolean g;
    private long h;
    private int i;
    private int j;

    public FloatingWindowLayout(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7e5b054a72bf768e2847fa8c7e138b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7e5b054a72bf768e2847fa8c7e138b6");
        }
    }

    public FloatingWindowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3bf14b719df794d985cba11dd43ec71", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3bf14b719df794d985cba11dd43ec71");
        }
    }

    public FloatingWindowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71aca994aaab6a39bddc6e6775b8304b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71aca994aaab6a39bddc6e6775b8304b");
            return;
        }
        this.d = new Handler();
        this.e = 0;
        this.f = 0;
        this.g = false;
        this.h = 0L;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ce21941dffd41773e94c623e4c950cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ce21941dffd41773e94c623e4c950cf");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "937e9e22d6df42386c01f91acb425812", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "937e9e22d6df42386c01f91acb425812");
        } else {
            a builder = getBuilder();
            if (builder.f != -1) {
                int i5 = builder.f;
                if (i5 == 4) {
                    this.e = (getMeasuredWidth() - builder.g) - (this.b.getMeasuredWidth() / 2);
                    this.f = builder.h + (this.b.getMeasuredHeight() / 2);
                } else if (i5 != 8) {
                    switch (i5) {
                        case 1:
                            this.e = builder.g + (this.b.getMeasuredWidth() / 2);
                            this.f = builder.h + (this.b.getMeasuredHeight() / 2);
                            break;
                        case 2:
                            this.e = builder.g + (this.b.getMeasuredWidth() / 2);
                            this.f = (getMeasuredHeight() - builder.h) - (this.b.getMeasuredHeight() / 2);
                            break;
                    }
                } else {
                    this.e = (getMeasuredWidth() - builder.g) - (this.b.getMeasuredWidth() / 2);
                    this.f = (getMeasuredHeight() - builder.h) - (this.b.getMeasuredHeight() / 2);
                }
                e();
            }
        }
        b();
    }

    private boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "100e0736206450b1f3cece770db0a248", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "100e0736206450b1f3cece770db0a248")).booleanValue() : this.b != null && this.b.isShown();
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d758b46992c2814ec67f6c0fc9f30d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d758b46992c2814ec67f6c0fc9f30d9");
        } else if (a()) {
            int measuredWidth = this.e - (this.b.getMeasuredWidth() / 2);
            int measuredHeight = this.f - (this.b.getMeasuredHeight() / 2);
            this.b.setTop(measuredHeight);
            this.b.setLeft(measuredWidth);
            View view = this.b;
            view.setBottom(view.getMeasuredHeight() + measuredHeight);
            View view2 = this.b;
            view2.setRight(view2.getMeasuredWidth() + measuredWidth);
            this.b.setX(measuredWidth);
            this.b.setY(measuredHeight);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54a79405249f32341b3b53c9bf1f5cf9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54a79405249f32341b3b53c9bf1f5cf9")).booleanValue();
        }
        Object[] objArr2 = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9af175769a1d17b269749f707913990c", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9af175769a1d17b269749f707913990c")).booleanValue();
        } else {
            if (this.b != null) {
                int left = this.b.getLeft();
                int top = this.b.getTop();
                int right = this.b.getRight();
                int bottom = this.b.getBottom();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (motionEvent.getAction() == 0) {
                    if (x > left && x < right && y > top && y < bottom) {
                        this.i = x;
                        this.j = y;
                        this.g = true;
                        this.h = System.currentTimeMillis();
                        c();
                        a(motionEvent);
                        z = true;
                    }
                } else if (1 == motionEvent.getAction() || 3 == motionEvent.getAction()) {
                    if (this.g) {
                        c();
                        this.g = false;
                        if (a(x, y)) {
                            a(motionEvent);
                        }
                        d();
                        z = true;
                    }
                } else if (this.g) {
                    c();
                    if (!a(x, y)) {
                        this.e = x;
                        this.f = y;
                        e();
                        b();
                        getBuilder().f = -1;
                    }
                    this.i = x;
                    this.j = y;
                    z = true;
                }
            }
            z = false;
        }
        return z || super.dispatchTouchEvent(motionEvent);
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b89f203838ba93c5fcfd133e06cefe3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b89f203838ba93c5fcfd133e06cefe3c");
            return;
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f67ab57b75429ba71b1dc2018f1246b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f67ab57b75429ba71b1dc2018f1246b2");
            return;
        }
        Rect rect = new Rect(this.b.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
        if (b(rect)) {
            return;
        }
        a(rect);
        requestLayout();
        this.d.postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.newwidgets.FloatingWindowLayout.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3dbddc0a4a198761565d52dcd69cc712", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3dbddc0a4a198761565d52dcd69cc712");
                } else {
                    FloatingWindowLayout.this.d();
                }
            }
        }, 10L);
    }

    private void a(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df04aaf06f1693e991b4af8021bd4fa7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df04aaf06f1693e991b4af8021bd4fa7");
            return;
        }
        a builder = getBuilder();
        if (this.e < (getMeasuredWidth() / 2) + builder.b) {
            this.e -= 50;
            if ((this.e - (rect.width() / 2)) - builder.b < 50) {
                this.e = (rect.width() / 2) + builder.b;
                return;
            }
            return;
        }
        this.e += 50;
        if (((getMeasuredWidth() - (rect.width() / 2)) - this.e) - builder.c < 50) {
            this.e = (getMeasuredWidth() - (rect.width() / 2)) - builder.c;
        }
    }

    private boolean b(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29735bd079b76eb7c2d0e663f68f98b4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29735bd079b76eb7c2d0e663f68f98b4")).booleanValue();
        }
        a builder = getBuilder();
        return this.e == (rect.width() / 2) + builder.b || this.e == (getMeasuredWidth() - (rect.width() / 2)) - builder.c;
    }

    private void a(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07f7e9e539dd368a52de430178305a24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07f7e9e539dd368a52de430178305a24");
        } else if (this.b == null) {
        } else {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.offsetLocation(getScrollX() - this.b.getLeft(), getScrollY() - this.b.getTop());
            this.b.dispatchTouchEvent(obtain);
            obtain.recycle();
        }
    }

    private boolean a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64096fc64b4b2120af6dcb3356fe22a5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64096fc64b4b2120af6dcb3356fe22a5")).booleanValue();
        }
        int scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i3 = i - this.i;
        int i4 = i2 - this.j;
        return (i3 * i3) + (i4 * i4) < scaledTouchSlop * scaledTouchSlop && System.currentTimeMillis() - this.h < 200;
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "090571f10a632388d4e1ac7837dde181", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "090571f10a632388d4e1ac7837dde181");
        } else if (this.b == null) {
        } else {
            a builder = getBuilder();
            if (this.f + (this.b.getMeasuredHeight() / 2) > getMeasuredHeight() - builder.e) {
                this.f = (getMeasuredHeight() - builder.e) - (this.b.getMeasuredHeight() / 2);
            } else if (this.f < (this.b.getMeasuredHeight() / 2) + builder.d) {
                this.f = (this.b.getMeasuredHeight() / 2) + builder.d;
            }
            if (this.e + (this.b.getMeasuredWidth() / 2) > getMeasuredWidth() - builder.c) {
                this.e = (getMeasuredWidth() - builder.c) - (this.b.getMeasuredWidth() / 2);
            } else if (this.e < (this.b.getMeasuredWidth() / 2) + builder.b) {
                this.e = (this.b.getMeasuredWidth() / 2) + builder.b;
            }
        }
    }

    @NonNull
    private a getBuilder() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "039504668c274b2c2bc409e546110ff3", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "039504668c274b2c2bc409e546110ff3");
        }
        if (this.c == null) {
            this.c = new a();
        }
        return this.c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0176cdbdea382640bbe95277bc95df33", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0176cdbdea382640bbe95277bc95df33");
            } else {
                this.f = -1;
            }
        }
    }
}
