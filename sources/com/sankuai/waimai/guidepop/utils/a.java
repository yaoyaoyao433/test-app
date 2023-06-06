package com.sankuai.waimai.guidepop.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static Animator a(View view, AnimatorListenerAdapter animatorListenerAdapter) {
        Object[] objArr = {view, animatorListenerAdapter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fed642ce89521413cb703111da1e6877", RobustBitConfig.DEFAULT_VALUE)) {
            return (Animator) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fed642ce89521413cb703111da1e6877");
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, View.SCALE_X, 1.0f, 1.1f).setDuration(200L);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, View.SCALE_Y, 1.0f, 1.1f).setDuration(200L);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(view, View.SCALE_X, 1.1f, 0.15f).setDuration(460L);
        duration3.setStartDelay(200L);
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(view, View.SCALE_Y, 1.1f, 0.15f).setDuration(460L);
        duration4.setStartDelay(200L);
        ObjectAnimator duration5 = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f, 0.0f).setDuration(30L);
        duration5.setStartDelay(630L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(animatorListenerAdapter);
        animatorSet.playTogether(duration, duration2, duration3, duration4, duration5);
        return animatorSet;
    }
}
