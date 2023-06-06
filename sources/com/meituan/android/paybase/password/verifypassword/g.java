package com.meituan.android.paybase.password.verifypassword;

import android.app.Dialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final PasswordConfirmPageFragment b;

    public g(PasswordConfirmPageFragment passwordConfirmPageFragment) {
        this.b = passwordConfirmPageFragment;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2938195c662cfad2ab322e37b069c3c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2938195c662cfad2ab322e37b069c3c4");
        } else {
            PasswordConfirmPageFragment.b(this.b, dialog);
        }
    }
}
