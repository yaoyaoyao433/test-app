package com.meituan.android.pay.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class x implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final VerifyBankInfoFragment b;

    public x(VerifyBankInfoFragment verifyBankInfoFragment) {
        this.b = verifyBankInfoFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef36cc81264d264167b8d1d2db35ad88", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef36cc81264d264167b8d1d2db35ad88");
        } else {
            VerifyBankInfoFragment.a(this.b, view);
        }
    }
}
