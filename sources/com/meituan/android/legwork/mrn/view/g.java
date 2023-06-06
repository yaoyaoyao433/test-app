package com.meituan.android.legwork.mrn.view;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements ValueAnimator.AnimatorUpdateListener {
    public static ChangeQuickRedirect a;
    private final PtNestedScrollContainer b;

    private g(PtNestedScrollContainer ptNestedScrollContainer) {
        this.b = ptNestedScrollContainer;
    }

    public static ValueAnimator.AnimatorUpdateListener a(PtNestedScrollContainer ptNestedScrollContainer) {
        Object[] objArr = {ptNestedScrollContainer};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f7cbb0d2ed137e4107ba1b4fa872a246", RobustBitConfig.DEFAULT_VALUE) ? (ValueAnimator.AnimatorUpdateListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f7cbb0d2ed137e4107ba1b4fa872a246") : new g(ptNestedScrollContainer);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object[] objArr = {valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f20a25f1e6a5d1e72f5af4d7fbd1430", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f20a25f1e6a5d1e72f5af4d7fbd1430");
        } else {
            PtNestedScrollContainer.a(this.b, valueAnimator);
        }
    }
}
