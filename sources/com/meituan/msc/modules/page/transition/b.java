package com.meituan.msc.modules.page.transition;

import android.animation.Animator;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.util.DisplayMetrics;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static LayoutTransition a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c79a8aa12d734d8f2a9c753b7186e665", RobustBitConfig.DEFAULT_VALUE)) {
            return (LayoutTransition) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c79a8aa12d734d8f2a9c753b7186e665");
        }
        LayoutTransition c = c();
        c.setAnimator(2, d());
        c.setAnimator(3, e());
        return c;
    }

    public static LayoutTransition b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7239d608febb4b50ba983aaa105da444", RobustBitConfig.DEFAULT_VALUE)) {
            return (LayoutTransition) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7239d608febb4b50ba983aaa105da444");
        }
        LayoutTransition c = c();
        DisplayMetrics displayMetrics = MSCEnvHelper.getContext().getResources().getDisplayMetrics();
        c.setAnimator(2, a(displayMetrics.widthPixels));
        c.setAnimator(3, b(displayMetrics.widthPixels));
        return c;
    }

    private static LayoutTransition c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a26b311efc4e15995485aa7911beb07", RobustBitConfig.DEFAULT_VALUE)) {
            return (LayoutTransition) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a26b311efc4e15995485aa7911beb07");
        }
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setStartDelay(2, 0L);
        layoutTransition.setStartDelay(3, 0L);
        layoutTransition.setStartDelay(0, 0L);
        layoutTransition.setStartDelay(1, 0L);
        layoutTransition.setDuration(2, 300L);
        layoutTransition.setDuration(3, 300L);
        layoutTransition.setDuration(0, 300L);
        layoutTransition.setDuration(1, 300L);
        return layoutTransition;
    }

    private static Animator a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5959e923684fcb2d0ed8b13b6efedb67", RobustBitConfig.DEFAULT_VALUE) ? (Animator) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5959e923684fcb2d0ed8b13b6efedb67") : ObjectAnimator.ofFloat((Object) null, RecceAnimUtils.TRANSLATION_X, i, 0.0f);
    }

    private static Animator b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0fac9f13557f2b2c01e2d2a3141f5ac2", RobustBitConfig.DEFAULT_VALUE) ? (Animator) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0fac9f13557f2b2c01e2d2a3141f5ac2") : ObjectAnimator.ofFloat((Object) null, RecceAnimUtils.TRANSLATION_X, 0.0f, i);
    }

    private static Animator d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8755515588a6416adc4dfc303f4a66e7", RobustBitConfig.DEFAULT_VALUE) ? (Animator) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8755515588a6416adc4dfc303f4a66e7") : ObjectAnimator.ofFloat((Object) null, "alpha", 0.0f, 1.0f);
    }

    private static Animator e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d3706256b34e2bb74761dc6f43e01dfd", RobustBitConfig.DEFAULT_VALUE) ? (Animator) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d3706256b34e2bb74761dc6f43e01dfd") : ObjectAnimator.ofFloat((Object) null, "alpha", 1.0f, 0.0f);
    }
}
