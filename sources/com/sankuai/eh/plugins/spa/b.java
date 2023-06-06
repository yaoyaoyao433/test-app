package com.sankuai.eh.plugins.spa;

import android.support.v4.view.animation.PathInterpolatorCompat;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21965e3cef4883a094c7c23bd2955a95", RobustBitConfig.DEFAULT_VALUE)) {
            return (Animation) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21965e3cef4883a094c7c23bd2955a95");
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
        translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.sankuai.eh.plugins.spa.b.1
            public static ChangeQuickRedirect a;

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                Object[] objArr2 = {animation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f882661eefed046d21a2670f057b2642", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f882661eefed046d21a2670f057b2642");
                } else if (a.this != null) {
                    a.this.a(animation);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                Object[] objArr2 = {animation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2fd8b298fd789bb4a0dc81db9f11c785", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2fd8b298fd789bb4a0dc81db9f11c785");
                } else if (a.this != null) {
                    a.this.b(animation);
                }
            }
        });
        return translateAnimation;
    }
}
