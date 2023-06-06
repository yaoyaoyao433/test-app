package com.meituan.android.recce.views.progressdialog;

import android.animation.ValueAnimator;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class RecceProgressDialog$$Lambda$1 implements ValueAnimator.AnimatorUpdateListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final View arg$1;

    public RecceProgressDialog$$Lambda$1(View view) {
        this.arg$1 = view;
    }

    public static ValueAnimator.AnimatorUpdateListener lambdaFactory$(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dffb6b964d54446d74c51a256f898d43", RobustBitConfig.DEFAULT_VALUE) ? (ValueAnimator.AnimatorUpdateListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dffb6b964d54446d74c51a256f898d43") : new RecceProgressDialog$$Lambda$1(view);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object[] objArr = {valueAnimator};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56c5b9162e6d273807d76117faa507eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56c5b9162e6d273807d76117faa507eb");
        } else {
            RecceProgressDialog.lambda$init$0(this.arg$1, valueAnimator);
        }
    }
}
