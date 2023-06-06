package com.sankuai.waimai.store.drug.util;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Handler;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class PoiListIconAnim {
    public static ChangeQuickRedirect a;
    Activity b;
    int c;
    View d;
    public int e;
    AnimatorSet f;
    AnimatorSet g;
    private int h;
    private Handler i;
    private Runnable j;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public @interface AnimMarginDirection {
        public static final int LEFT = 1;
        public static final int RIGHT = 2;
    }

    public PoiListIconAnim(View view, Activity activity, int i) {
        Object[] objArr = {view, activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a98619ed67c6677f0f44a96449b3d69", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a98619ed67c6677f0f44a96449b3d69");
            return;
        }
        this.c = 1;
        this.i = new Handler();
        this.j = new Runnable() { // from class: com.sankuai.waimai.store.drug.util.PoiListIconAnim.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f4406e9e987958d36944ffb68501f643", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f4406e9e987958d36944ffb68501f643");
                } else if (PoiListIconAnim.this.b == null || PoiListIconAnim.this.d == null || PoiListIconAnim.this.b.isFinishing()) {
                } else {
                    if (PoiListIconAnim.this.f != null && PoiListIconAnim.this.f.isRunning()) {
                        PoiListIconAnim.this.f.cancel();
                        if (PoiListIconAnim.this.c == 1) {
                            PoiListIconAnim.this.d.setTranslationX(PoiListIconAnim.this.e);
                        } else {
                            PoiListIconAnim.this.d.setTranslationX(-PoiListIconAnim.this.e);
                        }
                    }
                    if (PoiListIconAnim.this.g == null) {
                        PoiListIconAnim.this.g = PoiListIconAnim.this.a(PoiListIconAnim.this.d, PoiListIconAnim.this.e, 0, 0.5f, 1.0f);
                    }
                    PoiListIconAnim.this.g.start();
                }
            }
        };
        this.d = view;
        this.e = i;
        this.b = activity;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16e5276d337a7178c882441a6c1837b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16e5276d337a7178c882441a6c1837b9");
        } else if (this.b == null || this.d == null || this.b.isFinishing()) {
        } else {
            if (this.i != null) {
                this.i.removeCallbacks(this.j);
            }
            if (this.g != null && this.g.isRunning()) {
                this.g.cancel();
                this.d.setAlpha(0.5f);
                if (this.c == 1) {
                    this.d.setTranslationX(this.e);
                } else {
                    this.d.setTranslationX(-this.e);
                }
            } else if (this.f == null || !this.f.isRunning()) {
                this.h = (int) Math.abs(this.d.getTranslationX());
                if (this.h == this.e) {
                    return;
                }
                if (this.f == null) {
                    this.f = a(this.d, 0, this.e, 1.0f, 0.5f);
                }
                this.f.start();
            }
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6bc6545898f790d4410d53bfe442e49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6bc6545898f790d4410d53bfe442e49");
        } else if (this.i != null) {
            this.i.postDelayed(this.j, 750L);
        }
    }

    AnimatorSet a(final View view, int i, int i2, float f, float f2) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3864ae2e89cd91a9fa9af52e2de20ed9", RobustBitConfig.DEFAULT_VALUE)) {
            return (AnimatorSet) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3864ae2e89cd91a9fa9af52e2de20ed9");
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", f, f2);
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.store.drug.util.PoiListIconAnim.2
            public static ChangeQuickRedirect a;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object[] objArr2 = {valueAnimator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bfcd7e79f898413be4a820453cfcb44c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bfcd7e79f898413be4a820453cfcb44c");
                    return;
                }
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (PoiListIconAnim.this.c == 1) {
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
