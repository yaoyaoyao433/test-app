package com.meituan.android.paybase.password.verifypassword;

import android.app.Dialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class m implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final PasswordVerifyActivity b;

    public m(PasswordVerifyActivity passwordVerifyActivity) {
        this.b = passwordVerifyActivity;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3072454692e04d8cb48c28ac68e0b19b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3072454692e04d8cb48c28ac68e0b19b");
        } else {
            PasswordVerifyActivity.a(this.b, dialog);
        }
    }
}
