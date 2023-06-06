package com.sankuai.meituan.mapsdk.api.model.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.animation.Animation;
import com.sankuai.meituan.mapsdk.maps.model.animation.AnimationSet;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends d {
    public static ChangeQuickRedirect a;
    private AnimatorSet e;

    @Override // com.sankuai.meituan.mapsdk.api.model.animation.d
    public final void a(ValueAnimator valueAnimator) {
    }

    public c(com.sankuai.meituan.mapsdk.core.interfaces.e eVar, final Animation animation) {
        super(eVar, animation);
        Object[] objArr = {eVar, animation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dda8545c30632b9e0ae00c103e9b189c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dda8545c30632b9e0ae00c103e9b189c");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Animation animation2 : ((AnimationSet) animation).getAnimationList()) {
            arrayList.add(b.a(eVar, animation2));
        }
        this.e = new AnimatorSet();
        this.e.setDuration(animation.getDuration());
        this.e.playTogether(arrayList);
        this.e.addListener(new AnimatorListenerAdapter() { // from class: com.sankuai.meituan.mapsdk.api.model.animation.c.1
            public static ChangeQuickRedirect a;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "20bd30e74dcd49b64b3fad50774edf1a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "20bd30e74dcd49b64b3fad50774edf1a");
                } else if (animation.getAnimationListener() != null) {
                    animation.getAnimationListener().onAnimationStart();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c129de697f3eab4fb96890854e2a039e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c129de697f3eab4fb96890854e2a039e");
                } else if (animation.getAnimationListener() != null) {
                    animation.getAnimationListener().onAnimationEnd();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7f5f0e4b84153ae9410e0403d56ace7c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7f5f0e4b84153ae9410e0403d56ace7c");
                } else if (animation.getAnimationListener() != null) {
                    animation.getAnimationListener().onAnimationCancel(animator);
                }
            }
        });
    }

    @Override // com.sankuai.meituan.mapsdk.api.model.animation.d, android.animation.ValueAnimator, android.animation.Animator
    public final void start() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c9602bd3dff7436bf363fec1320d737", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c9602bd3dff7436bf363fec1320d737");
        } else {
            this.e.start();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.api.model.animation.d, android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22b0795af6f3a563afa7005015c0f083", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22b0795af6f3a563afa7005015c0f083");
        } else {
            this.e.cancel();
        }
    }
}
