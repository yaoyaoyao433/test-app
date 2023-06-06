package com.meituan.android.legwork.mrn.view;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements ValueAnimator.AnimatorUpdateListener {
    public static ChangeQuickRedirect a;
    private final PtNestedScrollContainer b;

    private e(PtNestedScrollContainer ptNestedScrollContainer) {
        this.b = ptNestedScrollContainer;
    }

    public static ValueAnimator.AnimatorUpdateListener a(PtNestedScrollContainer ptNestedScrollContainer) {
        Object[] objArr = {ptNestedScrollContainer};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "656b7b564aaec757fa73752c765ca632", RobustBitConfig.DEFAULT_VALUE) ? (ValueAnimator.AnimatorUpdateListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "656b7b564aaec757fa73752c765ca632") : new e(ptNestedScrollContainer);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object[] objArr = {valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8d02d7bc90ab6b46a8a029f0f331f7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8d02d7bc90ab6b46a8a029f0f331f7b");
        } else {
            PtNestedScrollContainer.c(this.b, valueAnimator);
        }
    }
}
