package com.meituan.android.cashier.dialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final CardPayRedEnvelopeGuideDialog b;

    private f(CardPayRedEnvelopeGuideDialog cardPayRedEnvelopeGuideDialog) {
        this.b = cardPayRedEnvelopeGuideDialog;
    }

    public static View.OnClickListener a(CardPayRedEnvelopeGuideDialog cardPayRedEnvelopeGuideDialog) {
        Object[] objArr = {cardPayRedEnvelopeGuideDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1009208f0039e4e912247ed201d37aca", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1009208f0039e4e912247ed201d37aca") : new f(cardPayRedEnvelopeGuideDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "133ba7213f963407196be067a3d4b49b", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "133ba7213f963407196be067a3d4b49b");
        } else {
            CardPayRedEnvelopeGuideDialog.b(this.b, view);
        }
    }
}
