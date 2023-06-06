package com.sankuai.waimai.store.drug.newwidgets;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c5a727ef140e85138aba8f6c01660b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c5a727ef140e85138aba8f6c01660b8");
        }
    }

    public FloatingWindowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e85ccb70a10fbf9c8430608a60bf7c54", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e85ccb70a10fbf9c8430608a60bf7c54");
        }
    }

    public FloatingWindowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecb318a72ac5c7cf7fadc448fbc9cfd7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecb318a72ac5c7cf7fadc448fbc9cfd7");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ebb2ff17ae74f0b7ed777013930b326", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ebb2ff17ae74f0b7ed777013930b326");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5ae6f85d7902690cf2d51b1fa976f70a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5ae6f85d7902690cf2d51b1fa976f70a");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dc09b1a2d5a1290862e8a156fd0f4d1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dc09b1a2d5a1290862e8a156fd0f4d1")).booleanValue() : this.b != null && this.b.isShown();
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb94fba8f42eec0e978320fc880edd47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb94fba8f42eec0e978320fc880edd47");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb76b3824acafe66fe35b30023ee0f78", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb76b3824acafe66fe35b30023ee0f78")).booleanValue();
        }
        try {
            Object[] objArr2 = {motionEvent};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "551d241a771ff883b02aa28af1bce2d8", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "551d241a771ff883b02aa28af1bce2d8")).booleanValue();
            } else {
                if (this.b != null) {
                    int left = this.b.getLeft();
                    int top = this.b.getTop();
                    int right = this.b.getRight();
                    int bottom = this.b.getBottom();
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (motionEvent.getAction() != 0) {
                        if (1 != motionEvent.getAction() && 3 != motionEvent.getAction()) {
                            if (this.g) {
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
                        if (this.g) {
                            c();
                            this.g = false;
                            if (a(x, y)) {
                                a(motionEvent);
                            }
                            d();
                            z = true;
                        }
                    } else if (x > left && x < right && y > top && y < bottom) {
                        this.i = x;
                        this.j = y;
                        this.g = true;
                        this.h = System.currentTimeMillis();
                        c();
                        a(motionEvent);
                        z = true;
                    }
                }
                z = false;
            }
            if (!z) {
                if (!super.dispatchTouchEvent(motionEvent)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return true;
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c637db7dc561960748e2a7c0bf0e9213", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c637db7dc561960748e2a7c0bf0e9213");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03e49df73c1a2b8894112646ccb21d05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03e49df73c1a2b8894112646ccb21d05");
            return;
        }
        Rect rect = new Rect(this.b.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
        if (b(rect)) {
            return;
        }
        a(rect);
        requestLayout();
        this.d.postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.drug.newwidgets.FloatingWindowLayout.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "64a45bc6aaf2bd5d4e7a436d72d1a385", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "64a45bc6aaf2bd5d4e7a436d72d1a385");
                } else {
                    FloatingWindowLayout.this.d();
                }
            }
        }, 10L);
    }

    private void a(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa63ff5d6931d615b8e070d2ce937aee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa63ff5d6931d615b8e070d2ce937aee");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6203fbf4ce610e7ed84877d926e691c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6203fbf4ce610e7ed84877d926e691c")).booleanValue();
        }
        a builder = getBuilder();
        return this.e == (rect.width() / 2) + builder.b || this.e == (getMeasuredWidth() - (rect.width() / 2)) - builder.c;
    }

    private void a(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4774628e9e0fe17b70a421d74c4c21b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4774628e9e0fe17b70a421d74c4c21b6");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04ea2f231c685a231f339f133358436a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04ea2f231c685a231f339f133358436a")).booleanValue();
        }
        int scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i3 = i - this.i;
        int i4 = i2 - this.j;
        return (i3 * i3) + (i4 * i4) < scaledTouchSlop * scaledTouchSlop && System.currentTimeMillis() - this.h < 200;
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74aa0c0d63abb8052df3cc4f1fb7bd49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74aa0c0d63abb8052df3cc4f1fb7bd49");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6570e47e2c2c9ab223dc6fa3e241c4e", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6570e47e2c2c9ab223dc6fa3e241c4e");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86fb1b98e2d22a1f92f5d971b8b3a436", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86fb1b98e2d22a1f92f5d971b8b3a436");
            } else {
                this.f = -1;
            }
        }
    }
}
