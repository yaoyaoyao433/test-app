package com.meituan.android.cashier.dialogfragment;

import com.meituan.android.cashier.dialogfragment.RiskDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {
    public static ChangeQuickRedirect a;
    private final RiskDialogFragment.RiskDialog b;

    private g(RiskDialogFragment.RiskDialog riskDialog) {
        this.b = riskDialog;
    }

    public static Runnable a(RiskDialogFragment.RiskDialog riskDialog) {
        Object[] objArr = {riskDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "108bfa54d21e0b52ed29f50e25397e59", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "108bfa54d21e0b52ed29f50e25397e59") : new g(riskDialog);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03ff967bd64fe0b67cb53255fcc8ac1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03ff967bd64fe0b67cb53255fcc8ac1b");
        } else {
            RiskDialogFragment.RiskDialog.a(this.b);
        }
    }
}
