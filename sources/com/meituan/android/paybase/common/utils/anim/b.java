package com.meituan.android.paybase.common.utils.anim;

import android.animation.ValueAnimator;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {
    public static ChangeQuickRedirect a;
    private final View b;
    private final int c;

    private b(View view, int i) {
        this.b = view;
        this.c = i;
    }

    public static ValueAnimator.AnimatorUpdateListener a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f1eb9a3d3c6e893f1e24a60d556391e6", RobustBitConfig.DEFAULT_VALUE) ? (ValueAnimator.AnimatorUpdateListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f1eb9a3d3c6e893f1e24a60d556391e6") : new b(view, i);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object[] objArr = {valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd07dedc95fbff620cdda169687f85a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd07dedc95fbff620cdda169687f85a3");
        } else {
            a.c(this.b, this.c, valueAnimator);
        }
    }
}
