package com.sankuai.waimai.business.search.common.util;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static Animation a(int i, float f, float f2) {
        Object[] objArr = {500, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df6d078447297a0341d677631470d242", RobustBitConfig.DEFAULT_VALUE)) {
            return (Animation) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df6d078447297a0341d677631470d242");
        }
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(500L);
        animationSet.addAnimation(new AlphaAnimation(1.0f, f));
        animationSet.addAnimation(new TranslateAnimation(0.0f, f2, 0.0f, 0.0f));
        animationSet.setFillAfter(true);
        return animationSet;
    }

    public static Animation b(int i, float f, float f2) {
        Object[] objArr = {500, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9d15825fd378583241658c34de74e35f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Animation) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9d15825fd378583241658c34de74e35f");
        }
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(500L);
        animationSet.addAnimation(new AlphaAnimation(f, 1.0f));
        animationSet.addAnimation(new TranslateAnimation(f2, 0.0f, 0.0f, 0.0f));
        animationSet.setFillAfter(true);
        return animationSet;
    }
}
