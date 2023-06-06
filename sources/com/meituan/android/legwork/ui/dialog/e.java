package com.meituan.android.legwork.ui.dialog;

import com.meituan.android.legwork.ui.component.CommonDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements CommonDialog.a {
    public static ChangeQuickRedirect a;
    private final BalancePayFragment b;

    public e(BalancePayFragment balancePayFragment) {
        this.b = balancePayFragment;
    }

    @Override // com.meituan.android.legwork.ui.component.CommonDialog.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f37bdba39325cfb201aa6c391060a0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f37bdba39325cfb201aa6c391060a0e");
        } else {
            BalancePayFragment.c(this.b);
        }
    }
}
