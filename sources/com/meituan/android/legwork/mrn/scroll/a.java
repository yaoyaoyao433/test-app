package com.meituan.android.legwork.mrn.scroll;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class a {
    public static ChangeQuickRedirect a;
    boolean b;
    private ValueAnimator c;

    public abstract void a(float f);

    public void b() {
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29e011ca25b478aae6d3a5e353a39294", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29e011ca25b478aae6d3a5e353a39294");
        }
    }

    public a(float f, float f2, float f3) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c6d48fd2f1b1632d85f153b734494fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c6d48fd2f1b1632d85f153b734494fb");
            return;
        }
        float f4 = f2;
        float f5 = 0.0f;
        int i = 0;
        while (Math.abs(f4) > 0.1f) {
            f5 += f4;
            f4 *= f3;
            i++;
        }
        this.c = ValueAnimator.ofFloat(f, f - f5);
        this.c.setDuration(i);
    }

    public a(float f, float f2, long j) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0d6fbd1711b6b0202effbc1bd888f75", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0d6fbd1711b6b0202effbc1bd888f75");
            return;
        }
        this.c = ValueAnimator.ofFloat(f, f2);
        this.c.setDuration(j);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e43a886ba87b3f0eb71567e1ab04f77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e43a886ba87b3f0eb71567e1ab04f77");
            return;
        }
        this.c.setInterpolator(new DecelerateInterpolator(1.5f));
        this.c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.meituan.android.legwork.mrn.scroll.a.1
            public static ChangeQuickRedirect a;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object[] objArr2 = {valueAnimator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ee0ea105331738865dceae7836236a0f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ee0ea105331738865dceae7836236a0f");
                } else {
                    a.this.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            }
        });
        this.b = true;
        this.c.addListener(new Animator.AnimatorListener() { // from class: com.meituan.android.legwork.mrn.scroll.a.2
            public static ChangeQuickRedirect a;

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "05ffd832ed30cb02a12b7401ec218e0a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "05ffd832ed30cb02a12b7401ec218e0a");
                } else {
                    a.this.c();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0b4d0340d8396c80c5016616a9520ffe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0b4d0340d8396c80c5016616a9520ffe");
                    return;
                }
                a.this.b = false;
                a.this.b();
            }
        });
        this.c.start();
    }

    public boolean cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bbd4d2ae80585571531753391255bcc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bbd4d2ae80585571531753391255bcc")).booleanValue();
        }
        this.c.cancel();
        return this.b;
    }
}
