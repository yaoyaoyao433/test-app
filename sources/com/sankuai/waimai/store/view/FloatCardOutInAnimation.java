package com.sankuai.waimai.store.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class FloatCardOutInAnimation {
    public static ChangeQuickRedirect a;
    public Activity b;
    public int c;
    public View d;
    public int e;
    public int f;
    public AnimatorSet g;
    public AnimatorSet h;
    public Handler i;
    public Runnable j;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public @interface AnimMarginDirection {
        public static final int LEFT = 1;
        public static final int RIGHT = 2;
    }

    public FloatCardOutInAnimation(@NonNull View view, Activity activity, int i) {
        Object[] objArr = {view, activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4196bba928fbce4476e7e16be874bbcc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4196bba928fbce4476e7e16be874bbcc");
            return;
        }
        this.c = 1;
        this.i = new Handler();
        this.j = new Runnable() { // from class: com.sankuai.waimai.store.view.FloatCardOutInAnimation.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5a466d2a19132c0fb920692b4b176424", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5a466d2a19132c0fb920692b4b176424");
                } else if (com.sankuai.waimai.store.util.b.a(FloatCardOutInAnimation.this.b) || FloatCardOutInAnimation.this.b.isFinishing()) {
                } else {
                    if (FloatCardOutInAnimation.this.g != null && FloatCardOutInAnimation.this.g.isRunning()) {
                        FloatCardOutInAnimation.this.g.cancel();
                        if (FloatCardOutInAnimation.this.c == 1) {
                            FloatCardOutInAnimation.this.d.setTranslationX(FloatCardOutInAnimation.this.e);
                        } else {
                            FloatCardOutInAnimation.this.d.setTranslationX(-FloatCardOutInAnimation.this.e);
                        }
                    }
                    if (FloatCardOutInAnimation.this.h == null) {
                        FloatCardOutInAnimation.this.h = FloatCardOutInAnimation.this.a(FloatCardOutInAnimation.this.d, FloatCardOutInAnimation.this.e, 0, 0.5f, 1.0f);
                    }
                    FloatCardOutInAnimation.this.h.start();
                }
            }
        };
        this.d = view;
        this.e = i;
        this.b = activity;
    }

    public AnimatorSet a(@NonNull final View view, int i, int i2, float f, float f2) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bfb58eef1b32804ce640a1f92e2b7c8", RobustBitConfig.DEFAULT_VALUE)) {
            return (AnimatorSet) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bfb58eef1b32804ce640a1f92e2b7c8");
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", f, f2);
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.store.view.FloatCardOutInAnimation.2
            public static ChangeQuickRedirect a;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object[] objArr2 = {valueAnimator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b1d92e21a17123a5cde261df160135c5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b1d92e21a17123a5cde261df160135c5");
                    return;
                }
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (FloatCardOutInAnimation.this.c == 1) {
                    view.setTranslationX(intValue);
                } else {
                    view.setTranslationX(-intValue);
                }
            }
        });
        animatorSet.play(ofInt).with(ofFloat);
        return animatorSet;
    }
}
