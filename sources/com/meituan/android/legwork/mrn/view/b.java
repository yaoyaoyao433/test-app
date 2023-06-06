package com.meituan.android.legwork.mrn.view;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {
    public static ChangeQuickRedirect a;
    private final a b;

    private b(a aVar) {
        this.b = aVar;
    }

    public static ValueAnimator.AnimatorUpdateListener a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "62d7e90fa8dbaae37f1a27cdbc1de020", RobustBitConfig.DEFAULT_VALUE) ? (ValueAnimator.AnimatorUpdateListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "62d7e90fa8dbaae37f1a27cdbc1de020") : new b(aVar);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object[] objArr = {valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4d42499e2c8927358398615b63e2661", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4d42499e2c8927358398615b63e2661");
        } else {
            a.b(this.b, valueAnimator);
        }
    }
}
