package com.meituan.android.cashier.dialog;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class w implements Runnable {
    public static ChangeQuickRedirect a;
    private final PayLaterGuideDialog b;

    private w(PayLaterGuideDialog payLaterGuideDialog) {
        this.b = payLaterGuideDialog;
    }

    public static Runnable a(PayLaterGuideDialog payLaterGuideDialog) {
        Object[] objArr = {payLaterGuideDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "07e73fdec3a8bcf52bb99d86c4d93328", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "07e73fdec3a8bcf52bb99d86c4d93328") : new w(payLaterGuideDialog);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a3d4de2473564959ed575204f444868", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a3d4de2473564959ed575204f444868");
        } else {
            PayLaterGuideDialog.a(this.b);
        }
    }
}
