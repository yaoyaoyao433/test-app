package com.meituan.android.legwork.ui.dialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final BalancePayFragment b;

    private b(BalancePayFragment balancePayFragment) {
        this.b = balancePayFragment;
    }

    public static View.OnClickListener a(BalancePayFragment balancePayFragment) {
        Object[] objArr = {balancePayFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c64b3d5f4b534071442890ea24f4c13c", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c64b3d5f4b534071442890ea24f4c13c") : new b(balancePayFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f0d98397ffbff9c494a0ef339ab72c9", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f0d98397ffbff9c494a0ef339ab72c9");
        } else {
            BalancePayFragment.b(this.b, view);
        }
    }
}
