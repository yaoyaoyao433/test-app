package com.meituan.android.ptcommonim.widget;

import com.meituan.android.ptcommonim.feedback.model.PTQuestionData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements rx.functions.c {
    public static ChangeQuickRedirect a;
    private final PTFeedbackTagLayoutV2 b;

    public e(PTFeedbackTagLayoutV2 pTFeedbackTagLayoutV2) {
        this.b = pTFeedbackTagLayoutV2;
    }

    @Override // rx.functions.c
    public final void a(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "464bba133086590db5b33d8a3b031693", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "464bba133086590db5b33d8a3b031693");
        } else {
            PTFeedbackTagLayoutV2.a(this.b, (Boolean) obj, (PTQuestionData.QuestionTag) obj2);
        }
    }
}
