package com.meituan.android.pay.fragment;

import android.app.Dialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class aj implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final VerifyPasswordFragment b;

    public aj(VerifyPasswordFragment verifyPasswordFragment) {
        this.b = verifyPasswordFragment;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b434da1aa4b5fa6a0d68d9bfd140f832", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b434da1aa4b5fa6a0d68d9bfd140f832");
        } else {
            VerifyPasswordFragment.a(this.b, dialog);
        }
    }
}
