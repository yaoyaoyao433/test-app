package com.sankuai.waimai.business.search.transition;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.RequiresApi;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RequiresApi(api = 21)
/* loaded from: classes4.dex */
public final class a extends Transition {
    public static ChangeQuickRedirect a;
    private static final String[] b = {"recolor:background"};

    @Override // android.transition.Transition
    public final String[] getTransitionProperties() {
        return b;
    }

    private void a(TransitionValues transitionValues) {
        Object[] objArr = {transitionValues};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7aeb82aa03577d3d4a4e2193b0bd0d3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7aeb82aa03577d3d4a4e2193b0bd0d3a");
            return;
        }
        Drawable background = transitionValues.view.getBackground();
        if (background instanceof ColorDrawable) {
            transitionValues.values.put("recolor:background", Integer.valueOf(((ColorDrawable) background).getColor()));
        }
    }

    @Override // android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        Object[] objArr = {transitionValues};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c3cf6ca87193fba852ca4cb4645f2ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c3cf6ca87193fba852ca4cb4645f2ad");
        } else {
            a(transitionValues);
        }
    }

    @Override // android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        Object[] objArr = {transitionValues};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c17d2e1e0385227e18f3633abad2f1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c17d2e1e0385227e18f3633abad2f1d");
        } else {
            a(transitionValues);
        }
    }

    @Override // android.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        Object[] objArr = {viewGroup, transitionValues, transitionValues2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "beeb27ae32b8c8b1d3d1c9e28b97e37a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Animator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "beeb27ae32b8c8b1d3d1c9e28b97e37a");
        }
        if (transitionValues == null || transitionValues2 == null || transitionValues.values.get("recolor:background") == null || !(transitionValues.values.get("recolor:background") instanceof Integer) || transitionValues2.values.get("recolor:background") == null || !(transitionValues2.values.get("recolor:background") instanceof Integer)) {
            return null;
        }
        int intValue = ((Integer) transitionValues.values.get("recolor:background")).intValue();
        int intValue2 = ((Integer) transitionValues2.values.get("recolor:background")).intValue();
        Drawable background = transitionValues2.view.getBackground();
        if (background instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) background;
            colorDrawable.setColor(intValue);
            return ObjectAnimator.ofObject(colorDrawable, "color", new ArgbEvaluator(), Integer.valueOf(intValue), Integer.valueOf(intValue2));
        }
        return null;
    }
}
