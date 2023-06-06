package com.meituan.android.pay.desk.component.view;

import com.meituan.android.pay.common.selectdialog.view.SelectBankDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class s implements Runnable {
    public static ChangeQuickRedirect a;
    private final q b;
    private final SelectBankDialogFragment c;

    private s(q qVar, SelectBankDialogFragment selectBankDialogFragment) {
        this.b = qVar;
        this.c = selectBankDialogFragment;
    }

    public static Runnable a(q qVar, SelectBankDialogFragment selectBankDialogFragment) {
        Object[] objArr = {qVar, selectBankDialogFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b983329a68d657385789ea7fd002925", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b983329a68d657385789ea7fd002925") : new s(qVar, selectBankDialogFragment);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "112ea1ab224bfbae59114357b1a40422", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "112ea1ab224bfbae59114357b1a40422");
            return;
        }
        q qVar = this.b;
        SelectBankDialogFragment selectBankDialogFragment = this.c;
        Object[] objArr2 = {qVar, selectBankDialogFragment};
        ChangeQuickRedirect changeQuickRedirect2 = q.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1c7465c975ad0426a28cfd02b1245544", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1c7465c975ad0426a28cfd02b1245544");
        } else if (qVar.b.getActivity() == null || qVar.b.getActivity().isFinishing()) {
        } else {
            selectBankDialogFragment.a(qVar.b.getChildFragmentManager());
        }
    }
}
