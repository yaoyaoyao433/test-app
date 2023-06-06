package com.meituan.android.ptcommonim.widget;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PTFeedbackScoreView b;

    private d(PTFeedbackScoreView pTFeedbackScoreView) {
        this.b = pTFeedbackScoreView;
    }

    public static View.OnClickListener a(PTFeedbackScoreView pTFeedbackScoreView) {
        Object[] objArr = {pTFeedbackScoreView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c19a23185f29dfacdfe720d1ce647ec2", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c19a23185f29dfacdfe720d1ce647ec2") : new d(pTFeedbackScoreView);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d66299318f8cf2bf01629da5e141be6", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d66299318f8cf2bf01629da5e141be6");
        } else {
            PTFeedbackScoreView.a(this.b, view);
        }
    }
}
