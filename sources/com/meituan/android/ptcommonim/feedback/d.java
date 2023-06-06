package com.meituan.android.ptcommonim.feedback;

import android.app.Activity;
import com.meituan.android.ptcommonim.feedback.FeedbackDialog;
import com.meituan.android.ptcommonim.feedback.model.PTQuestionSubmitData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public static ChangeQuickRedirect a;
    private final PTQuestionSubmitData b;
    private final Activity c;

    private d(PTQuestionSubmitData pTQuestionSubmitData, Activity activity) {
        this.b = pTQuestionSubmitData;
        this.c = activity;
    }

    public static Runnable a(PTQuestionSubmitData pTQuestionSubmitData, Activity activity) {
        Object[] objArr = {pTQuestionSubmitData, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ae0658ce78ed430bec50eb36e387a69", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ae0658ce78ed430bec50eb36e387a69") : new d(pTQuestionSubmitData, activity);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a7589195ac1f7ed8ee45f2bc2d6a27a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a7589195ac1f7ed8ee45f2bc2d6a27a");
            return;
        }
        PTQuestionSubmitData pTQuestionSubmitData = this.b;
        Activity activity = this.c;
        Object[] objArr2 = {pTQuestionSubmitData, activity};
        ChangeQuickRedirect changeQuickRedirect2 = FeedbackDialog.AnonymousClass2.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8a20f34a65e4fe360e15946c56511012", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8a20f34a65e4fe360e15946c56511012");
        } else if (pTQuestionSubmitData != null) {
            com.meituan.android.ptcommonim.base.util.b.a(activity, pTQuestionSubmitData.userTips);
        }
    }
}
