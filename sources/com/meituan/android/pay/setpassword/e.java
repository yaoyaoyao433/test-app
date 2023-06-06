package com.meituan.android.pay.setpassword;

import android.app.Dialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final SetPasswordFragment b;

    public e(SetPasswordFragment setPasswordFragment) {
        this.b = setPasswordFragment;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8881c56b47297994841563904c93005c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8881c56b47297994841563904c93005c");
        } else {
            SetPasswordFragment.a(this.b, dialog);
        }
    }
}
