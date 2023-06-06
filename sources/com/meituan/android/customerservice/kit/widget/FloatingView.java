package com.meituan.android.customerservice.kit.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FloatingView extends LinearLayout {
    public static ChangeQuickRedirect d;
    private final int a;
    private boolean b;
    private WindowManager.LayoutParams c;
    private WindowManager e;
    private ValueAnimator f;
    private int g;
    private int h;
    private boolean i;
    private int j;
    private int k;
    private int l;
    private int m;

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public FloatingView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c487125dc4f7a8c6c11f225a8b7c7bc5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c487125dc4f7a8c6c11f225a8b7c7bc5");
        }
    }

    private FloatingView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "238f7950c4dd149242bb2f5bb2a48c20", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "238f7950c4dd149242bb2f5bb2a48c20");
        }
    }

    public FloatingView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4bc3be2a1880b79751f6b502ee8f609", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4bc3be2a1880b79751f6b502ee8f609");
            return;
        }
        this.e = (WindowManager) context.getSystemService("window");
        this.a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.g = context.getResources().getDisplayMetrics().widthPixels;
        this.h = context.getResources().getDisplayMetrics().heightPixels;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d5aea11027eb7045067754b3d5995ff8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d5aea11027eb7045067754b3d5995ff8");
            return;
        }
        this.f = new ValueAnimator();
        this.f.setDuration(300L);
        this.f.setTarget(this);
        this.f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.meituan.android.customerservice.kit.widget.FloatingView.1
            public static ChangeQuickRedirect a;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object[] objArr3 = {valueAnimator};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e156d14e88ae2b779204a5bd07afebec", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e156d14e88ae2b779204a5bd07afebec");
                    return;
                }
                FloatingView.this.c.x = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (ViewCompat.isAttachedToWindow(FloatingView.this)) {
                    FloatingView.this.e.updateViewLayout(FloatingView.this, FloatingView.this.c);
                }
            }
        });
    }

    public void setToEdge(boolean z) {
        this.i = z;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        int width;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90279bc566e256e87bc23fe4232edf77", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90279bc566e256e87bc23fe4232edf77")).booleanValue();
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.f.cancel();
                if (this.c == null) {
                    this.c = (WindowManager.LayoutParams) getLayoutParams();
                }
                this.k = this.c.x;
                this.m = this.c.y;
                this.j = (int) motionEvent.getRawX();
                this.l = (int) motionEvent.getRawY();
                this.b = false;
                return super.onTouchEvent(motionEvent);
            case 1:
            case 3:
                if (this.b) {
                    this.b = false;
                    if (this.i) {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = d;
                        if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e487d64d0a1cf266124c661451fd46d", RobustBitConfig.DEFAULT_VALUE)) {
                            int i2 = getContext().getResources().getConfiguration().orientation == 1 ? this.g : this.h;
                            if ((this.c.gravity & 3) == 3 || (this.c.gravity & GravityCompat.START) == 8388611) {
                                i = 2;
                                width = this.c.x + (getWidth() / 2) < i2 / 2 ? 0 : i2 - getWidth();
                            } else {
                                if ((this.c.gravity & 5) == 5 || (this.c.gravity & GravityCompat.END) == 8388613) {
                                    if (this.c.x + (getWidth() / 2) >= i2 / 2) {
                                        width = i2 - getWidth();
                                        i = 2;
                                    }
                                    width = 0;
                                    i = 2;
                                } else {
                                    if ((this.c.gravity & 1) == 1) {
                                        if (this.c.x < 0) {
                                            width = (-(i2 - getWidth())) / 2;
                                        } else {
                                            width = (i2 - getWidth()) / 2;
                                        }
                                        i = 2;
                                    }
                                    width = 0;
                                    i = 2;
                                }
                                setPressed(false);
                                return z;
                            }
                            ValueAnimator valueAnimator = this.f;
                            float[] fArr = new float[i];
                            fArr[0] = this.c.x;
                            z = true;
                            fArr[1] = width;
                            valueAnimator.setFloatValues(fArr);
                            this.f.start();
                            setPressed(false);
                            return z;
                        }
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e487d64d0a1cf266124c661451fd46d");
                    }
                    z = true;
                    setPressed(false);
                    return z;
                }
                return super.onTouchEvent(motionEvent);
            case 2:
                int rawX = ((int) motionEvent.getRawX()) - this.j;
                int rawY = ((int) motionEvent.getRawY()) - this.l;
                if (!this.b && (rawX * rawX) + (rawY * rawY) > this.a) {
                    this.b = true;
                }
                if (this.b) {
                    Object[] objArr3 = {Integer.valueOf(rawX), Integer.valueOf(rawY)};
                    ChangeQuickRedirect changeQuickRedirect3 = d;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ccd7e1ce8318b953e452349b1caf0114", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ccd7e1ce8318b953e452349b1caf0114");
                        return true;
                    }
                    if (this.c == null) {
                        this.c = (WindowManager.LayoutParams) getLayoutParams();
                    }
                    if ((this.c.gravity & 3) == 3 || (this.c.gravity & GravityCompat.START) == 8388611) {
                        this.c.x = this.k + rawX;
                    } else if ((this.c.gravity & 5) == 5 || (this.c.gravity & GravityCompat.END) == 8388613) {
                        this.c.x = this.k - rawX;
                    } else if ((this.c.gravity & 1) == 1) {
                        this.c.x = this.k + rawX;
                    }
                    if ((this.c.gravity & 48) == 48) {
                        this.c.y = this.m + rawY;
                    } else if ((this.c.gravity & 80) == 80) {
                        this.c.y = this.m - rawY;
                    } else if ((this.c.gravity & 16) == 16) {
                        this.c.y = this.m + rawY;
                    }
                    this.e.updateViewLayout(this, this.c);
                    return true;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
