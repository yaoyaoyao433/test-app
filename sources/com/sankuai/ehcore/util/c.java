package com.sankuai.ehcore.util;

import android.support.v4.view.animation.PathInterpolatorCompat;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(Animation animation);

        void b(Animation animation);
    }

    public static Animation a(int i, final a aVar) {
        TranslateAnimation translateAnimation;
        Object[] objArr = {Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a5e9456f5c4c69bee6d5cab6d63e1857", RobustBitConfig.DEFAULT_VALUE)) {
            return (Animation) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a5e9456f5c4c69bee6d5cab6d63e1857");
        }
        if (i == 10) {
            translateAnimation = new TranslateAnimation(2, 1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
        } else if (i == 11) {
            translateAnimation = new TranslateAnimation(2, 0.0f, 2, 1.0f, 2, 0.0f, 2, 0.0f);
        } else {
            translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f);
        }
        translateAnimation.setDuration(300L);
        translateAnimation.setInterpolator(PathInterpolatorCompat.create(0.15f, 0.0f, 0.08f, 1.0f));
        translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.sankuai.ehcore.util.c.1
            public static ChangeQuickRedirect a;

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                Object[] objArr2 = {animation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "289950c05f638bb75f8290b2604475ea", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "289950c05f638bb75f8290b2604475ea");
                } else if (a.this != null) {
                    a.this.a(animation);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                Object[] objArr2 = {animation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "181a52df7315c4ed9ce32ec52bb53f88", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "181a52df7315c4ed9ce32ec52bb53f88");
                } else if (a.this != null) {
                    a.this.b(animation);
                }
            }
        });
        return translateAnimation;
    }
}
