package com.meituan.android.pay.fragment;

import com.meituan.android.pay.model.bean.BankFactor;
import com.meituan.android.pay.utils.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class aa implements a.InterfaceC0327a {
    public static ChangeQuickRedirect a;
    private final VerifyBankInfoFragment b;

    public aa(VerifyBankInfoFragment verifyBankInfoFragment) {
        this.b = verifyBankInfoFragment;
    }

    @Override // com.meituan.android.pay.utils.a.InterfaceC0327a
    public final com.meituan.android.pay.widget.bankinfoitem.j a(BankFactor bankFactor) {
        Object[] objArr = {bankFactor};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80bbb8c37519eafb75e3b2d80b9e94b9", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.pay.widget.bankinfoitem.j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80bbb8c37519eafb75e3b2d80b9e94b9") : VerifyBankInfoFragment.a(this.b, bankFactor);
    }
}
