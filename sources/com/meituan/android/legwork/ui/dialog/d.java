package com.meituan.android.legwork.ui.dialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final BalancePayFragment b;

    private d(BalancePayFragment balancePayFragment) {
        this.b = balancePayFragment;
    }

    public static View.OnClickListener a(BalancePayFragment balancePayFragment) {
        Object[] objArr = {balancePayFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "30626fd55c7959d27aca23be8945a805", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "30626fd55c7959d27aca23be8945a805") : new d(balancePayFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8e5daf76773b35afb7aa5220a636bb7", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8e5daf76773b35afb7aa5220a636bb7");
        } else {
            BalancePayFragment.a(this.b, view);
        }
    }
}
