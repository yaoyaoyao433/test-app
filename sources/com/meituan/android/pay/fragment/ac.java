package com.meituan.android.pay.fragment;

import android.app.Dialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class ac implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final VerifyPasswordFragment b;

    public ac(VerifyPasswordFragment verifyPasswordFragment) {
        this.b = verifyPasswordFragment;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49a105f783ac132aa62db110bd835dea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49a105f783ac132aa62db110bd835dea");
        } else {
            VerifyPasswordFragment.f(this.b, dialog);
        }
    }
}
