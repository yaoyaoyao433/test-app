package com.meituan.android.pay.fragment;

import android.app.Dialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class n implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final VerifyBankInfoFragment b;

    public n(VerifyBankInfoFragment verifyBankInfoFragment) {
        this.b = verifyBankInfoFragment;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1e5b8fff1938b3740479e2441ae7e3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1e5b8fff1938b3740479e2441ae7e3b");
        } else {
            VerifyBankInfoFragment.b(this.b, dialog);
        }
    }
}
