package com.sankuai.waimai.business.page.home.list.future.mach.transitionanimation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    AnimatorSet b;

    public final ObjectAnimator a(View view, float f, float f2, long j) {
        Object[] objArr = {view, Float.valueOf(f), Float.valueOf(f2), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc6d7f6307ac5a641749d09b8eb4b377", RobustBitConfig.DEFAULT_VALUE)) {
            return (ObjectAnimator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc6d7f6307ac5a641749d09b8eb4b377");
        }
        if (view == null || j < 0) {
            return null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", f, f2);
        ofFloat.setDuration(j);
        return ofFloat;
    }

    public final ObjectAnimator b(View view, float f, float f2, long j) {
        Object[] objArr = {view, Float.valueOf(f), Float.valueOf(f2), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba3eb1d2463502902369a400a2c7f571", RobustBitConfig.DEFAULT_VALUE)) {
            return (ObjectAnimator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba3eb1d2463502902369a400a2c7f571");
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, RecceAnimUtils.SCALE_X, f, f2);
        ofFloat.setDuration(j);
        return ofFloat;
    }

    public final ObjectAnimator c(View view, float f, float f2, long j) {
        Object[] objArr = {view, Float.valueOf(f), Float.valueOf(f2), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c938ae1a085769282e7e3b70ca202720", RobustBitConfig.DEFAULT_VALUE)) {
            return (ObjectAnimator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c938ae1a085769282e7e3b70ca202720");
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, RecceAnimUtils.SCALE_Y, f, f2);
        ofFloat.setDuration(j);
        return ofFloat;
    }

    public final AnimatorSet a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebd75a1f24ac15b3fad13cc85bbe9a34", RobustBitConfig.DEFAULT_VALUE)) {
            return (AnimatorSet) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebd75a1f24ac15b3fad13cc85bbe9a34");
        }
        if (this.b == null) {
            this.b = new AnimatorSet();
        }
        if (z) {
            this.b.cancel();
        }
        return this.b;
    }
}
