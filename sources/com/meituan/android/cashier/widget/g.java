package com.meituan.android.cashier.widget;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements ValueAnimator.AnimatorUpdateListener {
    public static ChangeQuickRedirect a;
    private final MTCashierScrollView b;
    private final ValueAnimator c;

    private g(MTCashierScrollView mTCashierScrollView, ValueAnimator valueAnimator) {
        this.b = mTCashierScrollView;
        this.c = valueAnimator;
    }

    public static ValueAnimator.AnimatorUpdateListener a(MTCashierScrollView mTCashierScrollView, ValueAnimator valueAnimator) {
        Object[] objArr = {mTCashierScrollView, valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa007be81946211fe9a3d9e1aebea56e", RobustBitConfig.DEFAULT_VALUE) ? (ValueAnimator.AnimatorUpdateListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa007be81946211fe9a3d9e1aebea56e") : new g(mTCashierScrollView, valueAnimator);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object[] objArr = {valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14038412e11ae39335a19bf49ce21ead", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14038412e11ae39335a19bf49ce21ead");
        } else {
            MTCashierScrollView.a(this.b, this.c, valueAnimator);
        }
    }
}
