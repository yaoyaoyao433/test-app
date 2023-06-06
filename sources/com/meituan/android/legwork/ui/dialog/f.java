package com.meituan.android.legwork.ui.dialog;

import com.meituan.android.legwork.ui.component.CommonDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements CommonDialog.b {
    public static ChangeQuickRedirect a;
    private final BalancePayFragment b;

    public f(BalancePayFragment balancePayFragment) {
        this.b = balancePayFragment;
    }

    @Override // com.meituan.android.legwork.ui.component.CommonDialog.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aada91d7eb3b9244f743ba766dbbca77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aada91d7eb3b9244f743ba766dbbca77");
        } else {
            BalancePayFragment.b(this.b);
        }
    }
}
