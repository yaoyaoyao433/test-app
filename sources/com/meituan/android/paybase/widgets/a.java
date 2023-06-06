package com.meituan.android.paybase.widgets;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public static ChangeQuickRedirect a;
    private final ProgressButton b;

    private a(ProgressButton progressButton) {
        this.b = progressButton;
    }

    public static ValueAnimator.AnimatorUpdateListener a(ProgressButton progressButton) {
        Object[] objArr = {progressButton};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d8e633cc5041de364021d1e23f742630", RobustBitConfig.DEFAULT_VALUE) ? (ValueAnimator.AnimatorUpdateListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d8e633cc5041de364021d1e23f742630") : new a(progressButton);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object[] objArr = {valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6617ee36bb9300ab5ff704e919573c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6617ee36bb9300ab5ff704e919573c3");
        } else {
            ProgressButton.a(this.b, valueAnimator);
        }
    }
}
