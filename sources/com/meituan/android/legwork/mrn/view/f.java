package com.meituan.android.legwork.mrn.view;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements ValueAnimator.AnimatorUpdateListener {
    public static ChangeQuickRedirect a;
    private final PtNestedScrollContainer b;

    private f(PtNestedScrollContainer ptNestedScrollContainer) {
        this.b = ptNestedScrollContainer;
    }

    public static ValueAnimator.AnimatorUpdateListener a(PtNestedScrollContainer ptNestedScrollContainer) {
        Object[] objArr = {ptNestedScrollContainer};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b4b9fc143abcd5d12c8f910563f4b5a", RobustBitConfig.DEFAULT_VALUE) ? (ValueAnimator.AnimatorUpdateListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b4b9fc143abcd5d12c8f910563f4b5a") : new f(ptNestedScrollContainer);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object[] objArr = {valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d832ee4944e515c9448809d7c2dece6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d832ee4944e515c9448809d7c2dece6");
        } else {
            PtNestedScrollContainer.b(this.b, valueAnimator);
        }
    }
}
