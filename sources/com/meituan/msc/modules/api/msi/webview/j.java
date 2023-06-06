package com.meituan.msc.modules.api.msi.webview;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import com.meituan.msc.modules.api.msi.webview.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j {
    public static ChangeQuickRedirect a;
    protected i b;

    public final j a(i iVar) {
        this.b = iVar;
        return this;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c13e06233e9ea0712492efe5bc1e74f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c13e06233e9ea0712492efe5bc1e74f");
        } else if (this.b == null || i <= this.b.getCurProgress()) {
        } else {
            if (8 == this.b.getVisibility()) {
                this.b.setVisibility(0);
            }
            final i iVar = this.b;
            final i.a aVar = new i.a() { // from class: com.meituan.msc.modules.api.msi.webview.j.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.modules.api.msi.webview.i.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1ab48373f48988ace4c98a8e27bc0e7e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1ab48373f48988ace4c98a8e27bc0e7e");
                    } else if (j.this.b.getVisibility() == 0 && j.this.b.getCurProgress() == 100) {
                        final i iVar2 = j.this.b;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = i.a;
                        if (PatchProxy.isSupport(objArr3, iVar2, changeQuickRedirect3, false, "b474d5ade4791c78faea656c4c6e723c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, iVar2, changeQuickRedirect3, false, "b474d5ade4791c78faea656c4c6e723c");
                            return;
                        }
                        AnimationSet dismissAnim = iVar2.getDismissAnim();
                        dismissAnim.setAnimationListener(new Animation.AnimationListener() { // from class: com.meituan.msc.modules.api.msi.webview.i.3
                            public static ChangeQuickRedirect a;

                            @Override // android.view.animation.Animation.AnimationListener
                            public final void onAnimationRepeat(Animation animation) {
                            }

                            @Override // android.view.animation.Animation.AnimationListener
                            public final void onAnimationStart(Animation animation) {
                            }

                            @Override // android.view.animation.Animation.AnimationListener
                            public final void onAnimationEnd(Animation animation) {
                                Object[] objArr4 = {animation};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "01d72e4b2f34ae95e30c13c6454928ba", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "01d72e4b2f34ae95e30c13c6454928ba");
                                    return;
                                }
                                i.a(iVar2, 0);
                                iVar2.setVisibility(8);
                            }
                        });
                        iVar2.startAnimation(dismissAnim);
                    }
                }
            };
            Object[] objArr2 = {Integer.valueOf(i), aVar};
            ChangeQuickRedirect changeQuickRedirect2 = i.a;
            if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "6db367154f7d85a0cb20d839d4ca2399", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "6db367154f7d85a0cb20d839d4ca2399");
                return;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(iVar.b, i);
            ofInt.setDuration((i - iVar.b) * 10);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.meituan.msc.modules.api.msi.webview.i.1
                public static ChangeQuickRedirect a;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Object[] objArr3 = {valueAnimator};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2267f1f3cfeb4ec98d26466001b45fdf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2267f1f3cfeb4ec98d26466001b45fdf");
                    } else {
                        iVar.setNormalProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                }
            });
            ofInt.addListener(new Animator.AnimatorListener() { // from class: com.meituan.msc.modules.api.msi.webview.i.2
                public static ChangeQuickRedirect a;

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    Object[] objArr3 = {animator};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dc97116f1539a7ebb94021553ebfc814", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dc97116f1539a7ebb94021553ebfc814");
                    } else if (aVar != null) {
                        aVar.a();
                    }
                }
            });
            ofInt.start();
        }
    }
}
