package com.sankuai.meituan.mapsdk.api.model.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.interfaces.p;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.animation.Animation;
import com.sankuai.meituan.mapsdk.maps.model.animation.FrameAnimation;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f extends ValueAnimator {
    public static ChangeQuickRedirect a;
    public BitmapDescriptor[] b;
    private p c;
    private FrameAnimation d;

    public f(p pVar, FrameAnimation frameAnimation) {
        Object[] objArr = {pVar, frameAnimation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "218cf14690db0da76f42d20baa6aa0c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "218cf14690db0da76f42d20baa6aa0c7");
            return;
        }
        this.c = pVar;
        this.d = frameAnimation;
        this.b = this.d.getFrameIcons();
        setDuration(this.d.getDuration());
        setRepeatCount(this.d.getRepeatCount());
        setInterpolator(this.d.getInterpolator());
        setRepeatMode(this.d.getRepeatMode() == Animation.RepeatMode.RESTART ? 1 : 2);
        setObjectValues(0, Integer.valueOf(this.b.length - 1));
        addListener(new AnimatorListenerAdapter() { // from class: com.sankuai.meituan.mapsdk.api.model.animation.f.1
            public static ChangeQuickRedirect a;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2f1d55f0aef01eae6541a9260ec78d8a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2f1d55f0aef01eae6541a9260ec78d8a");
                } else if (f.this.d.getAnimationListener() != null) {
                    f.this.d.getAnimationListener().onAnimationStart();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a773518b68dd588b0ca5bfe5ec508ee8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a773518b68dd588b0ca5bfe5ec508ee8");
                } else if (f.this.d.getAnimationListener() != null) {
                    f.this.d.getAnimationListener().onAnimationEnd();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "843b25c9ee36f59442da874b418f0cb6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "843b25c9ee36f59442da874b418f0cb6");
                } else if (f.this.d.getAnimationListener() != null) {
                    f.this.d.getAnimationListener().onAnimationCancel(animator);
                }
            }
        });
        addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.meituan.mapsdk.api.model.animation.f.2
            public static ChangeQuickRedirect a;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object[] objArr2 = {valueAnimator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "294cb25d1c3a55e1e4095d4c5ea49464", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "294cb25d1c3a55e1e4095d4c5ea49464");
                    return;
                }
                f.this.c.setIcon(f.this.b[((Integer) valueAnimator.getAnimatedValue()).intValue()]);
                if (f.this.d.getAnimationListener() != null) {
                    f.this.d.getAnimationListener().onAnimationUpdate(valueAnimator);
                }
            }
        });
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56148633cd13bfbb333496c7bde3ef6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56148633cd13bfbb333496c7bde3ef6f");
        } else if (isRunning()) {
            super.cancel();
        }
    }
}
