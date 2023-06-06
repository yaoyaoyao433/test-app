package com.meituan.android.customerservice.floating.base;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.view.GravityCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import com.meituan.android.customerservice.kit.utils.c;
import com.meituan.android.customerservice.utils.d;
import com.meituan.android.customerservice.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class BaseFloatingView extends RelativeLayout implements View.OnTouchListener {
    public static ChangeQuickRedirect b;
    private int a;
    protected WindowManager c;
    protected ValueAnimator d;
    public a e;
    protected View.OnClickListener f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private int k;
    private int l;

    public abstract void a();

    public abstract int getCustomSize();

    public BaseFloatingView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fa71449820c893defebe68629dfe984", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fa71449820c893defebe68629dfe984");
        }
    }

    private BaseFloatingView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79ee5ad5f1c34cf1e3b53a6bebe6f9a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79ee5ad5f1c34cf1e3b53a6bebe6f9a1");
        }
    }

    public BaseFloatingView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebb6ddf822b40a4bd688990633170502", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebb6ddf822b40a4bd688990633170502");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fc6bb30e9572c09bc51eac31c6071a78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fc6bb30e9572c09bc51eac31c6071a78");
            return;
        }
        this.c = (WindowManager) getContext().getSystemService("window");
        this.a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "39262ba791d363bbf8b2b111c1c4c33c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "39262ba791d363bbf8b2b111c1c4c33c");
        } else {
            this.d = new ValueAnimator();
            this.d.setDuration(300L);
            this.d.setTarget(this);
            this.d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.meituan.android.customerservice.floating.base.BaseFloatingView.3
                public static ChangeQuickRedirect a;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Object[] objArr4 = {valueAnimator};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2728cca4a5b111b40992932dde1bea40", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2728cca4a5b111b40992932dde1bea40");
                    } else if (!BaseFloatingView.this.d() || valueAnimator.getAnimatedValue() == null) {
                    } else {
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        WindowManager.LayoutParams layoutParams = BaseFloatingView.this.e.c;
                        layoutParams.x = (int) floatValue;
                        BaseFloatingView.this.c.updateViewLayout(BaseFloatingView.this, layoutParams);
                    }
                }
            });
        }
        this.e = new a(getContext());
        a aVar = this.e;
        Object[] objArr4 = {this, -2, -2};
        ChangeQuickRedirect changeQuickRedirect4 = a.a;
        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "6d8ea35fc7ca54446ff526d28021e11f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "6d8ea35fc7ca54446ff526d28021e11f");
            return;
        }
        aVar.b = this;
        aVar.c.flags = 40;
        aVar.c.format = -2;
        aVar.c.width = -2;
        aVar.c.height = -2;
        a.a(aVar.c);
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e45277f6faab00fe795ab6b2b861701c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e45277f6faab00fe795ab6b2b861701c");
        } else {
            f.b(new Runnable() { // from class: com.meituan.android.customerservice.floating.base.BaseFloatingView.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2cea8caf1c252790cc9c21ed8f67a458", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2cea8caf1c252790cc9c21ed8f67a458");
                    } else {
                        BaseFloatingView.this.e.a();
                    }
                }
            });
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "489e8e61b6154a355abf7041e65f5e28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "489e8e61b6154a355abf7041e65f5e28");
        } else {
            f.b(new Runnable() { // from class: com.meituan.android.customerservice.floating.base.BaseFloatingView.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d77dfaddb56c77b5cf832da18b440337", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d77dfaddb56c77b5cf832da18b440337");
                    } else {
                        BaseFloatingView.this.e.b();
                    }
                }
            });
        }
    }

    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01f186e0a23e02fdad0f693786ddb2ff", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01f186e0a23e02fdad0f693786ddb2ff")).booleanValue() : a.a(this.c, this);
    }

    public void setToEdge(boolean z) {
        this.h = z;
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbde4ca7e1bdaa67a60c2cb6548fb09d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbde4ca7e1bdaa67a60c2cb6548fb09d");
            return;
        }
        this.d.setFloatValues(this.e.c.x, 0.0f);
        this.d.start();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50d40fba0dce35129d344b5b8737b86e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50d40fba0dce35129d344b5b8737b86e")).booleanValue();
        }
        WindowManager.LayoutParams layoutParams = this.e.c;
        switch (motionEvent.getAction()) {
            case 0:
                this.d.cancel();
                this.j = layoutParams.x;
                this.l = layoutParams.y;
                this.i = (int) motionEvent.getRawX();
                this.k = (int) motionEvent.getRawY();
                this.g = false;
                return false;
            case 1:
                if (this.g) {
                    this.g = false;
                    f();
                    if (this.h) {
                        e();
                    }
                    return true;
                }
                return false;
            case 2:
                a();
                int rawX = ((int) motionEvent.getRawX()) - this.i;
                int rawY = ((int) motionEvent.getRawY()) - this.k;
                if (!this.g && (rawX * rawX) + (rawY * rawY) > this.a) {
                    this.g = true;
                }
                if (this.g) {
                    Object[] objArr2 = {Integer.valueOf(rawX), Integer.valueOf(rawY)};
                    ChangeQuickRedirect changeQuickRedirect2 = b;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a46053dffd3a9a6f1e508540747ad8dc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a46053dffd3a9a6f1e508540747ad8dc");
                    } else {
                        WindowManager.LayoutParams layoutParams2 = this.e.c;
                        if ((layoutParams2.gravity & 3) == 3 || (layoutParams2.gravity & GravityCompat.START) == 8388611) {
                            layoutParams2.x = this.j + rawX;
                        } else if ((layoutParams2.gravity & 5) == 5 || (layoutParams2.gravity & GravityCompat.END) == 8388613) {
                            layoutParams2.x = this.j - rawX;
                        } else if ((layoutParams2.gravity & 1) == 1) {
                            layoutParams2.x = this.j + rawX;
                        }
                        if ((layoutParams2.gravity & 48) == 48) {
                            layoutParams2.y = this.l + rawY;
                        } else if ((layoutParams2.gravity & 80) == 80) {
                            layoutParams2.y = this.l - rawY;
                        } else if ((layoutParams2.gravity & 16) == 16) {
                            layoutParams2.y = this.l + rawY;
                        }
                        this.c.updateViewLayout(this, layoutParams2);
                    }
                    return true;
                }
                return false;
            case 3:
                if (this.g) {
                    this.g = false;
                    f();
                    if (this.h) {
                        e();
                    }
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "124b2000a2a09e024f5096b8d57d8e6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "124b2000a2a09e024f5096b8d57d8e6c");
            return;
        }
        int a = c.a(getContext());
        int b2 = c.b(getContext());
        WindowManager.LayoutParams layoutParams = this.e.c;
        int i = layoutParams.gravity;
        layoutParams.x = Math.max(0, layoutParams.x);
        layoutParams.y = Math.max(0, layoutParams.y);
        if (layoutParams.x + (getCustomSize() / 2) >= a / 2) {
            layoutParams.x = a - Math.min(layoutParams.x + getCustomSize(), a);
            layoutParams.gravity = d.c(i) ? 5 : 3;
        } else {
            layoutParams.gravity = d.c(i) ? 3 : 5;
        }
        if (layoutParams.y + (getCustomSize() / 2) >= b2 / 2) {
            layoutParams.y = b2 - Math.min(layoutParams.y + getCustomSize(), b2);
            layoutParams.gravity |= d.a(i) ? 80 : 48;
        } else {
            layoutParams.gravity |= d.a(i) ? 48 : 80;
        }
        this.c.updateViewLayout(this, layoutParams);
    }

    public final BaseFloatingView a(final int i, final int i2, final int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7c524702003efe4e38a806c6dec1704", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseFloatingView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7c524702003efe4e38a806c6dec1704");
        }
        f.b(new Runnable() { // from class: com.meituan.android.customerservice.floating.base.BaseFloatingView.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ffc6d53753becad0276d14afab86e877", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ffc6d53753becad0276d14afab86e877");
                    return;
                }
                a aVar = BaseFloatingView.this.e;
                int i4 = i;
                int i5 = i2;
                int i6 = i3;
                Object[] objArr3 = {Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "f406737397ccc4059462d7847ce32e45", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "f406737397ccc4059462d7847ce32e45");
                    return;
                }
                aVar.c.gravity = i4;
                aVar.c.x = i5;
                aVar.c.y = i6;
            }
        });
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "562728d2c097842296e8c0545e00b652", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "562728d2c097842296e8c0545e00b652");
            return;
        }
        clearAnimation();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f = onClickListener;
    }
}
