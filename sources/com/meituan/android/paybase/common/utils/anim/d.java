package com.meituan.android.paybase.common.utils.anim;

import android.animation.ValueAnimator;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements ValueAnimator.AnimatorUpdateListener {
    public static ChangeQuickRedirect a;
    private final View b;

    private d(View view) {
        this.b = view;
    }

    public static ValueAnimator.AnimatorUpdateListener a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "363a16441e96831f6c5acd7892cdc272", RobustBitConfig.DEFAULT_VALUE) ? (ValueAnimator.AnimatorUpdateListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "363a16441e96831f6c5acd7892cdc272") : new d(view);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object[] objArr = {valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4de320d15f7caec53ed13930edc27cfa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4de320d15f7caec53ed13930edc27cfa");
        } else {
            a.a(this.b, valueAnimator);
        }
    }
}
