package com.meituan.android.ptcommonim.feedback;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements rx.functions.b {
    public static ChangeQuickRedirect a;
    private final FeedbackDialog b;

    public c(FeedbackDialog feedbackDialog) {
        this.b = feedbackDialog;
    }

    @Override // rx.functions.b
    public final void call(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "113315464ab9bb5d1db328038587c292", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "113315464ab9bb5d1db328038587c292");
        } else {
            FeedbackDialog.a(this.b, (View) obj);
        }
    }
}
