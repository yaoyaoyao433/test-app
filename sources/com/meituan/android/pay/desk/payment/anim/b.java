package com.meituan.android.pay.desk.payment.anim;

import android.animation.Animator;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static Animator a(View view, Animator animator, int i, int i2) {
        Object[] objArr = {view, animator, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a80c91bc0780a6f4cda4ecb4984568a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Animator) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a80c91bc0780a6f4cda4ecb4984568a");
        }
        if (animator != null && animator.isRunning()) {
            animator.end();
        }
        if (i == 1) {
            view.setVisibility(0);
            return com.meituan.android.paybase.common.utils.anim.a.a(view, i2, (Animator.AnimatorListener) null, 0.0f, 1.0f);
        } else if (i == 2) {
            return com.meituan.android.paybase.common.utils.anim.a.a(view, i2, new a(view), 1.0f, 0.0f);
        } else {
            return null;
        }
    }
}
