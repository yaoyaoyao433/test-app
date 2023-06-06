package com.sankuai.waimai.store.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class FloatContainer extends FrameLayout {
    public static ChangeQuickRedirect a;
    public ValueAnimator b;
    public ValueAnimator c;
    private final int d;
    private final int e;
    private final int f;
    private int g;
    private int h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;

    public FloatContainer(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "954689b96ea774a8ec7a559c7071fe15", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "954689b96ea774a8ec7a559c7071fe15");
        }
    }

    private FloatContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e43ff57b237af199078f740eef1535b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e43ff57b237af199078f740eef1535b");
        }
    }

    public FloatContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "599a56a4f9767caa80c38759a2ab727a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "599a56a4f9767caa80c38759a2ab727a");
        }
    }

    private FloatContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, 0);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93e6f29673908f0cd7e4175877b02722", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93e6f29673908f0cd7e4175877b02722");
            return;
        }
        this.d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.e = h.a(context);
        this.f = h.b(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 85;
        layoutParams.rightMargin = h.a(context, 20.0f);
        layoutParams.bottomMargin = h.a(context, 100.0f);
        setLayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f94c49b175d70730344340a48f26e560", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f94c49b175d70730344340a48f26e560");
            return;
        }
        super.onMeasure(i, i2);
        this.g = getMeasuredWidth();
        this.h = getMeasuredHeight();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cfe24fe49eaddb81655ad00416e6d41", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cfe24fe49eaddb81655ad00416e6d41")).booleanValue();
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.i = motionEvent.getRawX();
                this.j = motionEvent.getRawY();
                this.k = motionEvent.getRawX();
                this.l = motionEvent.getRawY();
                return false;
            case 1:
            case 2:
                return Math.abs(motionEvent.getRawX() - this.i) > ((float) this.d) || Math.abs(motionEvent.getRawY() - this.j) > ((float) this.d);
            default:
                return false;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb1ddf5cb8dd510f19d4198a2e712a58", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb1ddf5cb8dd510f19d4198a2e712a58")).booleanValue();
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        switch (motionEvent.getActionMasked()) {
            case 1:
                if ((getX() * 2.0f) + this.g < this.e) {
                    float x = getX();
                    Object[] objArr2 = {Float.valueOf(x)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c03d7839e7c54367c9baefc86fa0e4b", RobustBitConfig.DEFAULT_VALUE)) {
                        if (x != 0.0f) {
                            this.b = ValueAnimator.ofFloat(x, 0.0f);
                            this.b.setDuration(100L);
                            this.b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.store.view.FloatContainer.1
                                public static ChangeQuickRedirect a;

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    Object[] objArr3 = {valueAnimator};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3c57dc0ec65d7d38cbac72e78e016e60", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3c57dc0ec65d7d38cbac72e78e016e60");
                                    } else {
                                        FloatContainer.this.setX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                    }
                                }
                            });
                            this.b.start();
                            break;
                        }
                    } else {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c03d7839e7c54367c9baefc86fa0e4b");
                        break;
                    }
                } else {
                    float x2 = getX();
                    Object[] objArr3 = {Float.valueOf(x2)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (!PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "252fab8838f8b1dba36cd3bfa22a9649", RobustBitConfig.DEFAULT_VALUE)) {
                        if (x2 != this.e - this.g) {
                            this.c = ValueAnimator.ofFloat(x2, this.e - this.g);
                            this.c.setDuration(100L);
                            this.c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.store.view.FloatContainer.2
                                public static ChangeQuickRedirect a;

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    Object[] objArr4 = {valueAnimator};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ef79f958e0475abad825425031faf740", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ef79f958e0475abad825425031faf740");
                                    } else {
                                        FloatContainer.this.setX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                    }
                                }
                            });
                            this.c.start();
                            break;
                        }
                    } else {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "252fab8838f8b1dba36cd3bfa22a9649");
                        break;
                    }
                }
                break;
            case 2:
                float f = rawX - this.k;
                this.k = rawX;
                this.l = rawY;
                this.m = getX() + f;
                this.n = getY() + (rawY - this.l);
                if (this.m < 0.0f) {
                    this.m = 0.0f;
                }
                if (this.n < 0.0f) {
                    this.n = 0.0f;
                }
                if (this.m > this.e - this.g) {
                    this.m = this.e - this.g;
                }
                if (this.n > this.f - this.h) {
                    this.n = this.f - this.h;
                }
                setX(this.m);
                setY(this.n);
                break;
        }
        return true;
    }
}
