package com.meituan.android.pay.fragment;

import android.view.View;
import com.meituan.android.pay.model.bean.BankLimit;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class v implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final VerifyBankInfoFragment b;
    private final BankLimit c;

    public v(VerifyBankInfoFragment verifyBankInfoFragment, BankLimit bankLimit) {
        this.b = verifyBankInfoFragment;
        this.c = bankLimit;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d08d09692df267aef7770f48f56c5cc", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d08d09692df267aef7770f48f56c5cc");
        } else {
            VerifyBankInfoFragment.a(this.b, this.c, view);
        }
    }
}
