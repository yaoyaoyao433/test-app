package com.meituan.android.ptcommonim.feedback;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements rx.functions.b {
    public static ChangeQuickRedirect a;
    private final FeedbackCard b;

    private a(FeedbackCard feedbackCard) {
        this.b = feedbackCard;
    }

    public static rx.functions.b a(FeedbackCard feedbackCard) {
        Object[] objArr = {feedbackCard};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "45f9f3a8eae0332bd4b4991338130ea4", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "45f9f3a8eae0332bd4b4991338130ea4") : new a(feedbackCard);
    }

    @Override // rx.functions.b
    public final void call(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01c1c0c28e67a4eac25b6a3799d528d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01c1c0c28e67a4eac25b6a3799d528d7");
        } else {
            FeedbackCard.a(this.b, (View) obj);
        }
    }
}
