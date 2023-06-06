package com.meituan.android.ptcommonim.feedback;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final FeedbackDialog b;

    private b(FeedbackDialog feedbackDialog) {
        this.b = feedbackDialog;
    }

    public static View.OnClickListener a(FeedbackDialog feedbackDialog) {
        Object[] objArr = {feedbackDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba4e5d7f26425c48d91a3ad3959060a8", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba4e5d7f26425c48d91a3ad3959060a8") : new b(feedbackDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb5a65533fde4e50fedfddfd22743b0a", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb5a65533fde4e50fedfddfd22743b0a");
        } else {
            FeedbackDialog.b(this.b, view);
        }
    }
}
