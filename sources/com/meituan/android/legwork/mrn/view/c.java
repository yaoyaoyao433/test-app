package com.meituan.android.legwork.mrn.view;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {
    public static ChangeQuickRedirect a;
    private final a b;

    private c(a aVar) {
        this.b = aVar;
    }

    public static ValueAnimator.AnimatorUpdateListener a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7127fcb60396d45f56712950f4a797c7", RobustBitConfig.DEFAULT_VALUE) ? (ValueAnimator.AnimatorUpdateListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7127fcb60396d45f56712950f4a797c7") : new c(aVar);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object[] objArr = {valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a57d1501e1f7b4fee22d816ab3ab8d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a57d1501e1f7b4fee22d816ab3ab8d8");
        } else {
            a.a(this.b, valueAnimator);
        }
    }
}
