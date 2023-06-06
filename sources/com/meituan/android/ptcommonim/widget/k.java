package com.meituan.android.ptcommonim.widget;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PTFeedbackView b;

    private k(PTFeedbackView pTFeedbackView) {
        this.b = pTFeedbackView;
    }

    public static View.OnClickListener a(PTFeedbackView pTFeedbackView) {
        Object[] objArr = {pTFeedbackView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1fad74b4c99e0094406ae8e1b2f4df30", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1fad74b4c99e0094406ae8e1b2f4df30") : new k(pTFeedbackView);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "395d47176c083d8f3886ce348bf1f025", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "395d47176c083d8f3886ce348bf1f025");
        } else {
            PTFeedbackView.a(this.b, view);
        }
    }
}
