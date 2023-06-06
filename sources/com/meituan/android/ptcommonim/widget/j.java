package com.meituan.android.ptcommonim.widget;

import com.meituan.android.ptcommonim.feedback.model.PTQuestionData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements rx.functions.c {
    public static ChangeQuickRedirect a;
    private final PTFeedbackView b;

    private j(PTFeedbackView pTFeedbackView) {
        this.b = pTFeedbackView;
    }

    public static rx.functions.c a(PTFeedbackView pTFeedbackView) {
        Object[] objArr = {pTFeedbackView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b01ad28f7fd3fe5e0ee2c733bb0942f5", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b01ad28f7fd3fe5e0ee2c733bb0942f5") : new j(pTFeedbackView);
    }

    @Override // rx.functions.c
    public final void a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cf3a4a5a28cf898353ab39c6352e7aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cf3a4a5a28cf898353ab39c6352e7aa");
        } else {
            PTFeedbackView.a(this.b, (Integer) obj, (PTQuestionData.QuestionInfo) obj2);
        }
    }
}
