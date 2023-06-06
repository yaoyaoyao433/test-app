package com.meituan.android.ptcommonim.widget;

import com.meituan.android.ptcommonim.feedback.model.PTQuestionData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements rx.functions.d {
    public static ChangeQuickRedirect a;
    private final PTFeedbackScoreLayout b;

    public c(PTFeedbackScoreLayout pTFeedbackScoreLayout) {
        this.b = pTFeedbackScoreLayout;
    }

    @Override // rx.functions.d
    public final void a(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64bede11ddaf0df50a68ab60109d7023", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64bede11ddaf0df50a68ab60109d7023");
        } else {
            PTFeedbackScoreLayout.a(this.b, (PTFeedbackScoreView) obj, (Integer) obj2, (PTQuestionData.QuestionInfo) obj3);
        }
    }
}
