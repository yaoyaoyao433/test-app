package com.meituan.android.paycommon.lib.widgets;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements ValueAnimator.AnimatorUpdateListener {
    public static ChangeQuickRedirect a;
    private final ExtendableVerticalLinearLayout b;
    private final ViewGroup.LayoutParams c;

    private d(ExtendableVerticalLinearLayout extendableVerticalLinearLayout, ViewGroup.LayoutParams layoutParams) {
        this.b = extendableVerticalLinearLayout;
        this.c = layoutParams;
    }

    public static ValueAnimator.AnimatorUpdateListener a(ExtendableVerticalLinearLayout extendableVerticalLinearLayout, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {extendableVerticalLinearLayout, layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ee33aef0d4cb309fe89fa23f34e4d089", RobustBitConfig.DEFAULT_VALUE) ? (ValueAnimator.AnimatorUpdateListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ee33aef0d4cb309fe89fa23f34e4d089") : new d(extendableVerticalLinearLayout, layoutParams);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object[] objArr = {valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75a6530aa797fa24501f66c3191cd181", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75a6530aa797fa24501f66c3191cd181");
        } else {
            ExtendableVerticalLinearLayout.a(this.b, this.c, valueAnimator);
        }
    }
}
