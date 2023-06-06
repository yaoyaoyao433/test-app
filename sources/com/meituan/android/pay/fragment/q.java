package com.meituan.android.pay.fragment;

import android.view.View;
import com.meituan.android.pay.model.bean.CardBinTip;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class q implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final VerifyBankInfoFragment b;
    private final CardBinTip c;

    public q(VerifyBankInfoFragment verifyBankInfoFragment, CardBinTip cardBinTip) {
        this.b = verifyBankInfoFragment;
        this.c = cardBinTip;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fde636cec3da21a9a99994810aad7d6", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fde636cec3da21a9a99994810aad7d6");
        } else {
            VerifyBankInfoFragment.a(this.b, this.c, view);
        }
    }
}
