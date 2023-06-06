package com.meituan.android.cashier.dialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final CardPayRedEnvelopeGuideDialog b;

    private g(CardPayRedEnvelopeGuideDialog cardPayRedEnvelopeGuideDialog) {
        this.b = cardPayRedEnvelopeGuideDialog;
    }

    public static View.OnClickListener a(CardPayRedEnvelopeGuideDialog cardPayRedEnvelopeGuideDialog) {
        Object[] objArr = {cardPayRedEnvelopeGuideDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "00a03d0996bf6497e330e5fd284f252f", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "00a03d0996bf6497e330e5fd284f252f") : new g(cardPayRedEnvelopeGuideDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c33a1b834b13d7cebf86e164876bee51", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c33a1b834b13d7cebf86e164876bee51");
        } else {
            CardPayRedEnvelopeGuideDialog.a(this.b, view);
        }
    }
}
