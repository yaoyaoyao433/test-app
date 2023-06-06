package com.sankuai.meituan.mapsdk.tencentadapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.animation.AlphaAnimation;
import com.sankuai.meituan.mapsdk.maps.model.animation.Animation;
import com.sankuai.meituan.mapsdk.maps.model.animation.AnimationSet;
import com.sankuai.meituan.mapsdk.maps.model.animation.EmergeAnimation;
import com.sankuai.meituan.mapsdk.maps.model.animation.RotateAnimation;
import com.sankuai.meituan.mapsdk.maps.model.animation.ScaleAnimation;
import com.sankuai.meituan.mapsdk.maps.model.animation.TranslateAnimation;
import com.tencent.tencentmap.mapsdk.maps.model.Animation;
import com.tencent.tencentmap.mapsdk.maps.model.AnimationListener;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static Animation a(com.sankuai.meituan.mapsdk.maps.model.animation.Animation animation) {
        Animation animation2;
        Object[] objArr = {animation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c6982dcd3c268e8c0040d2c06d69828", RobustBitConfig.DEFAULT_VALUE)) {
            return (Animation) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c6982dcd3c268e8c0040d2c06d69828");
        }
        if (animation != null) {
            switch (animation.getType()) {
                case SET:
                    AnimationSet animationSet = (AnimationSet) animation;
                    Object[] objArr2 = {animationSet};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ffa15fd9da187727eaf983f8488dc471", RobustBitConfig.DEFAULT_VALUE)) {
                        if (animationSet != null) {
                            com.tencent.tencentmap.mapsdk.maps.model.AnimationSet animationSet2 = new com.tencent.tencentmap.mapsdk.maps.model.AnimationSet(animationSet.isShareInterpolator());
                            long j = 0;
                            int flag = animationSet.getFlag();
                            List<com.sankuai.meituan.mapsdk.maps.model.animation.Animation> animationList = animationSet.getAnimationList();
                            if (animationList != null) {
                                for (com.sankuai.meituan.mapsdk.maps.model.animation.Animation animation3 : animationList) {
                                    Animation a2 = a(animation3);
                                    if ((flag & 1) == 1) {
                                        a2.setInterpolator(animationSet.getInterpolator());
                                    }
                                    animationSet2.addAnimation(a2);
                                    if (animation3.getDuration() > j) {
                                        j = animation3.getDuration();
                                    }
                                }
                            }
                            animationSet2.setInterpolator(animationSet.getInterpolator());
                            if ((flag & 2) == 2) {
                                animationSet2.setDuration(animationSet.getDuration());
                            } else {
                                animationSet2.setDuration(j);
                            }
                            final Animation.AnimationListener animationListener = animationSet.getAnimationListener();
                            if (animationListener != null) {
                                animationSet2.setAnimationListener(new AnimationListener() { // from class: com.sankuai.meituan.mapsdk.tencentadapter.a.1
                                    public static ChangeQuickRedirect a;

                                    @Override // com.tencent.tencentmap.mapsdk.maps.model.AnimationListener
                                    public final void onAnimationStart() {
                                        Object[] objArr3 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect3 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7a7066b9df4a4261cc03c2b942e7ad10", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7a7066b9df4a4261cc03c2b942e7ad10");
                                        } else {
                                            Animation.AnimationListener.this.onAnimationStart();
                                        }
                                    }

                                    @Override // com.tencent.tencentmap.mapsdk.maps.model.AnimationListener
                                    public final void onAnimationEnd() {
                                        Object[] objArr3 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect3 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c3b1fb22f751d84c17b5d7542ed2b7f6", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c3b1fb22f751d84c17b5d7542ed2b7f6");
                                        } else {
                                            Animation.AnimationListener.this.onAnimationEnd();
                                        }
                                    }
                                });
                                return animationSet2;
                            }
                            return animationSet2;
                        }
                        return null;
                    }
                    animation2 = (com.tencent.tencentmap.mapsdk.maps.model.AnimationSet) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ffa15fd9da187727eaf983f8488dc471");
                    break;
                case ALPHA:
                    AlphaAnimation alphaAnimation = (AlphaAnimation) animation;
                    Object[] objArr3 = {alphaAnimation};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (!PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "bf84b01598dbdddb4207e3ba64ad00a1", RobustBitConfig.DEFAULT_VALUE)) {
                        if (alphaAnimation != null) {
                            com.tencent.tencentmap.mapsdk.maps.model.AlphaAnimation alphaAnimation2 = new com.tencent.tencentmap.mapsdk.maps.model.AlphaAnimation(alphaAnimation.getFromAlpha(), alphaAnimation.getToAlpha());
                            a(alphaAnimation, alphaAnimation2);
                            return alphaAnimation2;
                        }
                        return null;
                    }
                    animation2 = (com.tencent.tencentmap.mapsdk.maps.model.AlphaAnimation) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "bf84b01598dbdddb4207e3ba64ad00a1");
                    break;
                case ROTATE:
                    RotateAnimation rotateAnimation = (RotateAnimation) animation;
                    Object[] objArr4 = {rotateAnimation};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (!PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "27944bc6a2d51a9c652aa122aa08ee44", RobustBitConfig.DEFAULT_VALUE)) {
                        if (rotateAnimation != null) {
                            com.tencent.tencentmap.mapsdk.maps.model.RotateAnimation rotateAnimation2 = new com.tencent.tencentmap.mapsdk.maps.model.RotateAnimation(rotateAnimation.getFromdegree(), rotateAnimation.getTodegree(), rotateAnimation.getPivotx(), rotateAnimation.getPivoty(), rotateAnimation.getPivotz());
                            a(rotateAnimation, rotateAnimation2);
                            return rotateAnimation2;
                        }
                        return null;
                    }
                    animation2 = (com.tencent.tencentmap.mapsdk.maps.model.RotateAnimation) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "27944bc6a2d51a9c652aa122aa08ee44");
                    break;
                case SCALE:
                    ScaleAnimation scaleAnimation = (ScaleAnimation) animation;
                    Object[] objArr5 = {scaleAnimation};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (!PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "eb34df6f5afbf2e816ba495aa29440f1", RobustBitConfig.DEFAULT_VALUE)) {
                        if (scaleAnimation != null) {
                            com.tencent.tencentmap.mapsdk.maps.model.ScaleAnimation scaleAnimation2 = new com.tencent.tencentmap.mapsdk.maps.model.ScaleAnimation(scaleAnimation.getFromX(), scaleAnimation.getToX(), scaleAnimation.getFromY(), scaleAnimation.getToY());
                            a(scaleAnimation, scaleAnimation2);
                            return scaleAnimation2;
                        }
                        return null;
                    }
                    animation2 = (com.tencent.tencentmap.mapsdk.maps.model.ScaleAnimation) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "eb34df6f5afbf2e816ba495aa29440f1");
                    break;
                case TRANSLATE:
                    TranslateAnimation translateAnimation = (TranslateAnimation) animation;
                    Object[] objArr6 = {translateAnimation};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (!PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "ea0ecb402567dc9891d6bf92160acccf", RobustBitConfig.DEFAULT_VALUE)) {
                        if (translateAnimation != null) {
                            com.tencent.tencentmap.mapsdk.maps.model.TranslateAnimation translateAnimation2 = new com.tencent.tencentmap.mapsdk.maps.model.TranslateAnimation(b.a(translateAnimation.getTarget()));
                            a(translateAnimation, translateAnimation2);
                            return translateAnimation2;
                        }
                        return null;
                    }
                    animation2 = (com.tencent.tencentmap.mapsdk.maps.model.TranslateAnimation) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "ea0ecb402567dc9891d6bf92160acccf");
                    break;
                case EMERGE:
                    EmergeAnimation emergeAnimation = (EmergeAnimation) animation;
                    Object[] objArr7 = {emergeAnimation};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (!PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "472bd7d352d12a2af8d21990aeefadf2", RobustBitConfig.DEFAULT_VALUE)) {
                        if (emergeAnimation != null) {
                            com.tencent.tencentmap.mapsdk.maps.model.EmergeAnimation emergeAnimation2 = new com.tencent.tencentmap.mapsdk.maps.model.EmergeAnimation(b.a(emergeAnimation.getTarget()));
                            a(emergeAnimation, emergeAnimation2);
                            return emergeAnimation2;
                        }
                        return null;
                    }
                    animation2 = (com.tencent.tencentmap.mapsdk.maps.model.EmergeAnimation) PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "472bd7d352d12a2af8d21990aeefadf2");
                    break;
                default:
                    return null;
            }
            return animation2;
        }
        return null;
    }

    private static void a(com.sankuai.meituan.mapsdk.maps.model.animation.Animation animation, com.tencent.tencentmap.mapsdk.maps.model.Animation animation2) {
        Object[] objArr = {animation, animation2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d5bae8cbb36cd72ab5193e4271e69dd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d5bae8cbb36cd72ab5193e4271e69dd0");
            return;
        }
        animation2.setDuration(animation.getDuration());
        animation2.setInterpolator(animation.getInterpolator());
        final Animation.AnimationListener animationListener = animation.getAnimationListener();
        if (animationListener != null) {
            animation2.setAnimationListener(new AnimationListener() { // from class: com.sankuai.meituan.mapsdk.tencentadapter.a.2
                public static ChangeQuickRedirect a;

                @Override // com.tencent.tencentmap.mapsdk.maps.model.AnimationListener
                public final void onAnimationStart() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e6cb32ccc9b178cf8f3360edfa74e818", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e6cb32ccc9b178cf8f3360edfa74e818");
                    } else {
                        Animation.AnimationListener.this.onAnimationStart();
                    }
                }

                @Override // com.tencent.tencentmap.mapsdk.maps.model.AnimationListener
                public final void onAnimationEnd() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "69a5398667e6940cc211c7556babb9b2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "69a5398667e6940cc211c7556babb9b2");
                    } else {
                        Animation.AnimationListener.this.onAnimationEnd();
                    }
                }
            });
        }
    }
}
