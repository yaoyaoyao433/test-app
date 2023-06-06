package com.sankuai.meituan.mapsdk.api.model.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.animation.Animation;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class d extends ValueAnimator {
    public static ChangeQuickRedirect b;
    public com.sankuai.meituan.mapsdk.core.interfaces.e c;
    public Animation d;

    public abstract void a(ValueAnimator valueAnimator);

    public d(com.sankuai.meituan.mapsdk.core.interfaces.e eVar, final Animation animation) {
        Object[] objArr = {eVar, animation};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6f2d7ceb8b1d0cdf1ccd1278e009605", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6f2d7ceb8b1d0cdf1ccd1278e009605");
            return;
        }
        this.c = eVar;
        this.d = animation;
        setDuration(animation.getDuration());
        setRepeatCount(animation.getRepeatCount());
        setInterpolator(animation.getInterpolator());
        setRepeatMode(animation.getRepeatMode() == Animation.RepeatMode.RESTART ? 1 : 2);
        addListener(new AnimatorListenerAdapter() { // from class: com.sankuai.meituan.mapsdk.api.model.animation.d.1
            public static ChangeQuickRedirect a;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2692b7fd82d7f0ef39c0547686d73732", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2692b7fd82d7f0ef39c0547686d73732");
                } else if (animation.getAnimationListener() != null) {
                    animation.getAnimationListener().onAnimationStart();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2c813913b41095773217bd0cb7d842cd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2c813913b41095773217bd0cb7d842cd");
                } else if (animation.getAnimationListener() != null) {
                    animation.getAnimationListener().onAnimationEnd();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "65330908ac81addb17cd83c0dc235c20", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "65330908ac81addb17cd83c0dc235c20");
                } else if (animation.getAnimationListener() != null) {
                    animation.getAnimationListener().onAnimationCancel(animator);
                }
            }
        });
        addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.meituan.mapsdk.api.model.animation.d.2
            public static ChangeQuickRedirect a;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object[] objArr2 = {valueAnimator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e689ac1e5edbdbd53f92be3314d56ad1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e689ac1e5edbdbd53f92be3314d56ad1");
                    return;
                }
                d.this.a(valueAnimator);
                if (animation.getAnimationListener() != null) {
                    animation.getAnimationListener().onAnimationUpdate(valueAnimator);
                }
            }
        });
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void start() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f53ff746c1fbaad91a7c71b6f8898309", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f53ff746c1fbaad91a7c71b6f8898309");
        } else {
            super.start();
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6d53bc874cde0da2027c9728d7cef85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6d53bc874cde0da2027c9728d7cef85");
        } else if (isRunning()) {
            super.cancel();
            super.removeAllUpdateListeners();
        }
    }
}
