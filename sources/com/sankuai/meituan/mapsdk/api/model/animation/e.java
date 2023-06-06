package com.sankuai.meituan.mapsdk.api.model.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.core.annotations.v;
import com.sankuai.meituan.mapsdk.maps.interfaces.r;
import com.sankuai.meituan.mapsdk.maps.model.animation.Animation;
import com.sankuai.meituan.mapsdk.maps.model.animation.EmergeAnimation;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends ValueAnimator {
    public static ChangeQuickRedirect a;
    public r b;
    public EmergeAnimation c;
    public float d;

    public e(final r rVar, final EmergeAnimation emergeAnimation) {
        Object[] objArr = {rVar, emergeAnimation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acc1acd70cdfab0ad781756bcda2fe46", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acc1acd70cdfab0ad781756bcda2fe46");
            return;
        }
        this.d = 0.0f;
        this.b = rVar;
        this.c = emergeAnimation;
        setDuration(emergeAnimation.getDuration());
        setRepeatCount(emergeAnimation.getRepeatCount());
        setInterpolator(emergeAnimation.getInterpolator());
        setRepeatMode(emergeAnimation.getRepeatMode() == Animation.RepeatMode.RESTART ? 1 : 2);
        addListener(new AnimatorListenerAdapter() { // from class: com.sankuai.meituan.mapsdk.api.model.animation.e.1
            public static ChangeQuickRedirect a;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c765193ab4d19091a30d22d72c6c4247", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c765193ab4d19091a30d22d72c6c4247");
                } else if (emergeAnimation.getAnimationListener() != null) {
                    emergeAnimation.getAnimationListener().onAnimationStart();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e6e4573049665f73cb59e6a19162ecfa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e6e4573049665f73cb59e6a19162ecfa");
                } else if (emergeAnimation.getAnimationListener() != null) {
                    emergeAnimation.getAnimationListener().onAnimationEnd();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6470881f7dec2d119702122754dd5c0b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6470881f7dec2d119702122754dd5c0b");
                } else if (emergeAnimation.getAnimationListener() != null) {
                    emergeAnimation.getAnimationListener().onAnimationCancel(animator);
                }
            }
        });
        addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.meituan.mapsdk.api.model.animation.e.2
            public static ChangeQuickRedirect a;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object[] objArr2 = {valueAnimator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "194e5f3c644ba724154a8db327c7bb49", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "194e5f3c644ba724154a8db327c7bb49");
                    return;
                }
                if (e.this.d != 0.0f && rVar != null) {
                    ((v) rVar).a(((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                }
                if (emergeAnimation.getAnimationListener() != null) {
                    emergeAnimation.getAnimationListener().onAnimationUpdate(valueAnimator);
                }
            }
        });
        if (rVar.getPoints() != null && !rVar.getPoints().isEmpty() && this.c.getTarget() != null) {
            if (rVar.getPoints().get(0).equals(this.c.getTarget())) {
                this.d = 1.0f;
            } else if (rVar.getPoints().get(rVar.getPoints().size() - 1).equals(this.c.getTarget())) {
                this.d = -1.0f;
            }
        }
        setObjectValues(Float.valueOf(0.0f), Float.valueOf(this.d));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void start() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9174c8f4e2e8371d0ba1c552c1ab7e6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9174c8f4e2e8371d0ba1c552c1ab7e6e");
        } else {
            super.start();
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fb4b7cef9c72bff76a26395841f1376", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fb4b7cef9c72bff76a26395841f1376");
        } else if (isRunning()) {
            super.cancel();
            super.removeAllUpdateListeners();
        }
    }
}
