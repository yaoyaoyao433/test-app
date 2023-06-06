package com.meituan.android.pay.fragment;

import android.app.Dialog;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class ad implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final VerifyPasswordFragment b;
    private final BankInfo c;
    private final HashMap d;

    public ad(VerifyPasswordFragment verifyPasswordFragment, BankInfo bankInfo, HashMap hashMap) {
        this.b = verifyPasswordFragment;
        this.c = bankInfo;
        this.d = hashMap;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fef9ec21289eb2b04c7cdf27828da826", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fef9ec21289eb2b04c7cdf27828da826");
        } else {
            VerifyPasswordFragment.b(this.b, this.c, this.d, dialog);
        }
    }
}
