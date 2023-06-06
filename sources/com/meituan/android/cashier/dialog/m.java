package com.meituan.android.cashier.dialog;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class m implements Runnable {
    public static ChangeQuickRedirect a;
    private final CreditPayGuideDialog b;

    private m(CreditPayGuideDialog creditPayGuideDialog) {
        this.b = creditPayGuideDialog;
    }

    public static Runnable a(CreditPayGuideDialog creditPayGuideDialog) {
        Object[] objArr = {creditPayGuideDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "13655b101a3746c07f3c6486d7cd41ba", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "13655b101a3746c07f3c6486d7cd41ba") : new m(creditPayGuideDialog);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e055d1ec858300ba6793a7e512873ae6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e055d1ec858300ba6793a7e512873ae6");
        } else {
            CreditPayGuideDialog.b(this.b);
        }
    }
}
