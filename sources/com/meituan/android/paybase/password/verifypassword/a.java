package com.meituan.android.paybase.password.verifypassword;

import android.app.Dialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final PasswordConfirmDialogFragment b;

    public a(PasswordConfirmDialogFragment passwordConfirmDialogFragment) {
        this.b = passwordConfirmDialogFragment;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6106947e00e0a21b8944e89191e7bea8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6106947e00e0a21b8944e89191e7bea8");
        } else {
            PasswordConfirmDialogFragment.a(this.b, dialog);
        }
    }
}
