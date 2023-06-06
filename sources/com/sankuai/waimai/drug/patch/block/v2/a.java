package com.sankuai.waimai.drug.patch.block.v2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    public View b;
    public View c;
    public View d;
    public final AnimationSet e;
    public final AnimationSet f;
    public final AnimationSet g;
    final com.sankuai.waimai.drug.contract.b h;

    public a(@NonNull @NotNull Context context, @NonNull com.sankuai.waimai.drug.contract.b bVar) {
        super(context);
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "451d1c175a625bb72fa1b8ec71f9f8d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "451d1c175a625bb72fa1b8ec71f9f8d5");
            return;
        }
        this.e = new AnimationSet(true);
        this.f = new AnimationSet(true);
        this.g = new AnimationSet(true);
        this.h = bVar;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void hide() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fbe2348dc7e0daca5c959d61ac42bff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fbe2348dc7e0daca5c959d61ac42bff");
            return;
        }
        this.c.clearAnimation();
        this.b.clearAnimation();
        super.hide();
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4731975d45f45c139d32d90b6ff58fa6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4731975d45f45c139d32d90b6ff58fa6");
            return;
        }
        this.b = this.mView;
        this.c = findView(R.id.anim_view);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fa118ae70c1b15d0d664398e131cea92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fa118ae70c1b15d0d664398e131cea92");
        } else {
            this.e.setFillAfter(true);
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.56f, 1.0f, 1.56f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(200L);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -com.sankuai.shangou.stone.util.h.a(this.mContext, 129.0f));
            translateAnimation.setDuration(240L);
            translateAnimation.setStartOffset(700L);
            translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.sankuai.waimai.drug.patch.block.v2.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    Object[] objArr3 = {animation};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "92d14e083879f1fef816f8e0e5000f6e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "92d14e083879f1fef816f8e0e5000f6e");
                        return;
                    }
                    a.this.b.startAnimation(a.this.f);
                    a.this.d.startAnimation(a.this.g);
                }
            });
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(240L);
            alphaAnimation.setStartOffset(700L);
            this.e.addAnimation(scaleAnimation);
            this.e.addAnimation(translateAnimation);
            this.e.addAnimation(alphaAnimation);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5e25aba6c7b8f3cab2d8eeee1175cc11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5e25aba6c7b8f3cab2d8eeee1175cc11");
        } else {
            this.f.setFillAfter(true);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setDuration(470L);
            alphaAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: com.sankuai.waimai.drug.patch.block.v2.a.2
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
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8d7010875d250f6b48765b2c27086565", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8d7010875d250f6b48765b2c27086565");
                    } else {
                        a.this.h.b();
                    }
                }
            });
            this.f.addAnimation(alphaAnimation2);
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c48bd7cb8131c12ed8049f4305fe32b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c48bd7cb8131c12ed8049f4305fe32b1");
            return;
        }
        this.g.setFillAfter(true);
        AlphaAnimation alphaAnimation3 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation3.setDuration(470L);
        this.g.addAnimation(alphaAnimation3);
    }
}
