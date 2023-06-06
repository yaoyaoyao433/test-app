package com.meituan.android.paybase.common.utils.anim;

import android.animation.ValueAnimator;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements ValueAnimator.AnimatorUpdateListener {
    public static ChangeQuickRedirect a;
    private final View b;
    private final int c;

    private e(View view, int i) {
        this.b = view;
        this.c = i;
    }

    public static ValueAnimator.AnimatorUpdateListener a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca9c924c244ba11cf68f2ea6f4b57e63", RobustBitConfig.DEFAULT_VALUE) ? (ValueAnimator.AnimatorUpdateListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca9c924c244ba11cf68f2ea6f4b57e63") : new e(view, i);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object[] objArr = {valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2f6c7a65612a69893763a3b31d66988", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2f6c7a65612a69893763a3b31d66988");
        } else {
            a.a(this.b, this.c, valueAnimator);
        }
    }
}
