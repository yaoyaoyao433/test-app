package com.meituan.android.pay.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class m implements Runnable {
    public static ChangeQuickRedirect a;
    private final VerifyBankInfoFragment b;
    private final View c;

    private m(VerifyBankInfoFragment verifyBankInfoFragment, View view) {
        this.b = verifyBankInfoFragment;
        this.c = view;
    }

    public static Runnable a(VerifyBankInfoFragment verifyBankInfoFragment, View view) {
        Object[] objArr = {verifyBankInfoFragment, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "63fb1bb54f10e0cf47c41d1134de3d87", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "63fb1bb54f10e0cf47c41d1134de3d87") : new m(verifyBankInfoFragment, view);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53627a89c52ecc53fa013abffc7944c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53627a89c52ecc53fa013abffc7944c9");
        } else {
            VerifyBankInfoFragment.c(this.b, this.c);
        }
    }
}
