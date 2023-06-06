package com.meituan.android.paybase.common.utils.anim;

import android.animation.ValueAnimator;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {
    public static ChangeQuickRedirect a;
    private final View b;
    private final int c;

    private c(View view, int i) {
        this.b = view;
        this.c = i;
    }

    public static ValueAnimator.AnimatorUpdateListener a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d242228f2b164b6d91670ea7121ddc8", RobustBitConfig.DEFAULT_VALUE) ? (ValueAnimator.AnimatorUpdateListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d242228f2b164b6d91670ea7121ddc8") : new c(view, i);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object[] objArr = {valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "905acf447c258d26c91372b308770434", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "905acf447c258d26c91372b308770434");
        } else {
            a.b(this.b, this.c, valueAnimator);
        }
    }
}
