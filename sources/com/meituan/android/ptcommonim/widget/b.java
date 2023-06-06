package com.meituan.android.ptcommonim.widget;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PTFeedbackQuestionView b;

    private b(PTFeedbackQuestionView pTFeedbackQuestionView) {
        this.b = pTFeedbackQuestionView;
    }

    public static View.OnClickListener a(PTFeedbackQuestionView pTFeedbackQuestionView) {
        Object[] objArr = {pTFeedbackQuestionView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "54a7b5d48f4e471af65519224627fcdc", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "54a7b5d48f4e471af65519224627fcdc") : new b(pTFeedbackQuestionView);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf9b662e0c0c46bd98febed885734c58", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf9b662e0c0c46bd98febed885734c58");
        } else {
            PTFeedbackQuestionView.a(this.b, view);
        }
    }
}
