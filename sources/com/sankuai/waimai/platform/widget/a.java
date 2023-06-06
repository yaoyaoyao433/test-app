package com.sankuai.waimai.platform.widget;

import android.animation.Animator;
import com.meituan.metrics.Metrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements Animator.AnimatorListener {
    public static ChangeQuickRedirect a;
    private final String b;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    public a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eff42444936a8a671a1e6012e9a79463", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eff42444936a8a671a1e6012e9a79463");
        } else {
            this.b = str;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Object[] objArr = {animator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f32a99d6db9d5ecdecc8948d4c731951", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f32a99d6db9d5ecdecc8948d4c731951");
        } else {
            Metrics.getInstance().startCustomFPS(this.b);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = {animator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a427ccad5aaa781135502f3105e21d7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a427ccad5aaa781135502f3105e21d7b");
        } else {
            Metrics.getInstance().stopCustomFPS(this.b);
        }
    }
}
