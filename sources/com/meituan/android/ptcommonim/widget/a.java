package com.meituan.android.ptcommonim.widget;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PTFeedbackQuestionView b;

    private a(PTFeedbackQuestionView pTFeedbackQuestionView) {
        this.b = pTFeedbackQuestionView;
    }

    public static View.OnClickListener a(PTFeedbackQuestionView pTFeedbackQuestionView) {
        Object[] objArr = {pTFeedbackQuestionView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "faaa50b0efed961154084da986948b34", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "faaa50b0efed961154084da986948b34") : new a(pTFeedbackQuestionView);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30e1d9d3e9588146cf17e8726a209c0c", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30e1d9d3e9588146cf17e8726a209c0c");
        } else {
            PTFeedbackQuestionView.b(this.b, view);
        }
    }
}
