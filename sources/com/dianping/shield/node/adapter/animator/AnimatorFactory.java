package com.dianping.shield.node.adapter.animator;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AnimatorFactory {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static BaseAnimator createAnimator(AnimationType animationType) {
        Object[] objArr = {animationType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f8b545ce648f6a76e88f6afa34c25768", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseAnimator) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f8b545ce648f6a76e88f6afa34c25768");
        }
        if (animationType == null) {
            return new NoneAnimator();
        }
        switch (animationType) {
            case FADE:
                return new FadeAnimator();
            case LEFT:
                return new LeftAnimator();
            case RIGHT:
                return new RightAnimator();
            case TOP:
                return new TopAnimator();
            case BOTTOM:
                return new BottomAnimator();
            default:
                return new NoneAnimator();
        }
    }
}
