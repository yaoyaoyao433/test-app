package com.meituan.android.pay.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class p implements Runnable {
    public static ChangeQuickRedirect a;
    private final VerifyBankInfoFragment b;

    private p(VerifyBankInfoFragment verifyBankInfoFragment) {
        this.b = verifyBankInfoFragment;
    }

    public static Runnable a(VerifyBankInfoFragment verifyBankInfoFragment) {
        Object[] objArr = {verifyBankInfoFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ea14915f513b4af8abfeba1edac3ba5", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ea14915f513b4af8abfeba1edac3ba5") : new p(verifyBankInfoFragment);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92b10c7a6f3194be2cdcb2822789c5c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92b10c7a6f3194be2cdcb2822789c5c6");
        } else {
            VerifyBankInfoFragment.a(this.b);
        }
    }
}
