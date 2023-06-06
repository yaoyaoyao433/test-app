package com.meituan.android.cashier.dialog;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class n implements Runnable {
    public static ChangeQuickRedirect a;
    private final CreditPayGuideDialog b;

    private n(CreditPayGuideDialog creditPayGuideDialog) {
        this.b = creditPayGuideDialog;
    }

    public static Runnable a(CreditPayGuideDialog creditPayGuideDialog) {
        Object[] objArr = {creditPayGuideDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "05c415eb627422be0de1a6b07ccb4fbd", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "05c415eb627422be0de1a6b07ccb4fbd") : new n(creditPayGuideDialog);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f43e3007f5fab61929c364d02b06aa47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f43e3007f5fab61929c364d02b06aa47");
        } else {
            CreditPayGuideDialog.a(this.b);
        }
    }
}
