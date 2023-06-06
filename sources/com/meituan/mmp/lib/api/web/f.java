package com.meituan.mmp.lib.api.web;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.constraint.R;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import com.meituan.mmp.lib.utils.au;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f extends View {
    public static ChangeQuickRedirect a;
    private Context b;
    private int c;
    private int d;
    private int e;
    private Paint f;
    private int g;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a();
    }

    public static /* synthetic */ int a(f fVar, int i) {
        fVar.c = 0;
        return 0;
    }

    public f(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a2b0139b29911fa4e4cd25dc170e141", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a2b0139b29911fa4e4cd25dc170e141");
            return;
        }
        this.b = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.WebViewProgress, R.attr.WebViewProgressHeight, R.attr.WebViewProgressColor});
        this.c = obtainStyledAttributes.getInt(0, 0);
        this.e = obtainStyledAttributes.getInt(1, au.a(4.0f));
        this.g = obtainStyledAttributes.getColor(2, getResources().getColor(R.color.mmp_yellow));
        obtainStyledAttributes.recycle();
        this.f = new Paint();
        this.f.setColor(this.g);
        setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ec733e7163eb639ba7203582bca1792", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ec733e7163eb639ba7203582bca1792");
            return;
        }
        super.onMeasure(i, i2);
        this.d = View.MeasureSpec.getSize(i);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d0f9d603657939594dec79da43c8d72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d0f9d603657939594dec79da43c8d72");
            return;
        }
        super.onDraw(canvas);
        canvas.drawRect(0.0f, 0.0f, this.d * (this.c / 100.0f), this.e, this.f);
    }

    public final void a(int i, final a aVar) {
        Object[] objArr = {Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36909dcf1573045d5034fd63ec8c0aaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36909dcf1573045d5034fd63ec8c0aaf");
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(this.c, i);
        ofInt.setDuration((i - this.c) * 10);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.meituan.mmp.lib.api.web.f.1
            public static ChangeQuickRedirect a;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object[] objArr2 = {valueAnimator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7062d06c78fd0d63c39098677a867412", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7062d06c78fd0d63c39098677a867412");
                } else {
                    f.this.setNormalProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            }
        });
        ofInt.addListener(new Animator.AnimatorListener() { // from class: com.meituan.mmp.lib.api.web.f.2
            public static ChangeQuickRedirect a;

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "954697c4e85c9291f0699c7f9bfa257d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "954697c4e85c9291f0699c7f9bfa257d");
                } else if (aVar != null) {
                    aVar.a();
                }
            }
        });
        ofInt.start();
    }

    public final void setNormalProgress(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84a7f607df28d18bc21bb150e6e4896d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84a7f607df28d18bc21bb150e6e4896d");
            return;
        }
        this.c = i;
        postInvalidate();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3694c322b86de3a50c17682102543725", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3694c322b86de3a50c17682102543725");
            return;
        }
        AnimationSet dismissAnim = getDismissAnim();
        dismissAnim.setAnimationListener(new Animation.AnimationListener() { // from class: com.meituan.mmp.lib.api.web.f.3
            public static ChangeQuickRedirect a;

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                Object[] objArr2 = {animation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a7e8ef6f021b71f63a5a988731ad24c1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a7e8ef6f021b71f63a5a988731ad24c1");
                    return;
                }
                f.a(f.this, 0);
                f.this.setVisibility(8);
            }
        });
        startAnimation(dismissAnim);
    }

    private AnimationSet getDismissAnim() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32ff068acc5d1ad63fa14a237d4be583", RobustBitConfig.DEFAULT_VALUE)) {
            return (AnimationSet) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32ff068acc5d1ad63fa14a237d4be583");
        }
        AnimationSet animationSet = new AnimationSet(this.b, null);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(1000L);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    public final int getCurProgress() {
        return this.c;
    }
}
