package com.meituan.android.legwork.ui.dialog;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements rx.functions.b {
    public static ChangeQuickRedirect a;
    private final BalancePayFragment b;

    public c(BalancePayFragment balancePayFragment) {
        this.b = balancePayFragment;
    }

    @Override // rx.functions.b
    public final void call(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac76a424de4c4866b3e4909dcb86bea0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac76a424de4c4866b3e4909dcb86bea0");
        } else {
            BalancePayFragment.a(this.b, (Long) obj);
        }
    }
}
