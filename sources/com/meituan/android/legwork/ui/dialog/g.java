package com.meituan.android.legwork.ui.dialog;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {
    public static ChangeQuickRedirect a;
    private final BalancePayFragment b;

    private g(BalancePayFragment balancePayFragment) {
        this.b = balancePayFragment;
    }

    public static Runnable a(BalancePayFragment balancePayFragment) {
        Object[] objArr = {balancePayFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ae97eb2d1f31cfc41dba30ffdc72dab", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ae97eb2d1f31cfc41dba30ffdc72dab") : new g(balancePayFragment);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eed35faf469a06b804079a36010e9880", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eed35faf469a06b804079a36010e9880");
        } else {
            BalancePayFragment.a(this.b);
        }
    }
}
