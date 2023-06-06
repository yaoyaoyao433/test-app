package com.meituan.android.paybase.dialog.progressdialog;

import android.animation.ValueAnimator;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public static ChangeQuickRedirect a;
    private final View b;

    private a(View view) {
        this.b = view;
    }

    public static ValueAnimator.AnimatorUpdateListener a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "847b3dc852215d2850895f6cc6562cf2", RobustBitConfig.DEFAULT_VALUE) ? (ValueAnimator.AnimatorUpdateListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "847b3dc852215d2850895f6cc6562cf2") : new a(view);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object[] objArr = {valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e85cf699b8258f6205f5717e7ba3ab4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e85cf699b8258f6205f5717e7ba3ab4a");
        } else {
            MTProgressDialog.a(this.b, valueAnimator);
        }
    }
}
