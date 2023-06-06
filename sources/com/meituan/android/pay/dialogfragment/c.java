package com.meituan.android.pay.dialogfragment;

import android.view.View;
import com.meituan.android.pay.common.payment.bean.RepayHelp;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final BalanceInsufficientGuideFragment b;
    private final RepayHelp c;

    private c(BalanceInsufficientGuideFragment balanceInsufficientGuideFragment, RepayHelp repayHelp) {
        this.b = balanceInsufficientGuideFragment;
        this.c = repayHelp;
    }

    public static View.OnClickListener a(BalanceInsufficientGuideFragment balanceInsufficientGuideFragment, RepayHelp repayHelp) {
        Object[] objArr = {balanceInsufficientGuideFragment, repayHelp};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "956e09dc1bc53f217365db6ef6053506", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "956e09dc1bc53f217365db6ef6053506") : new c(balanceInsufficientGuideFragment, repayHelp);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34f213bcb3913f8760a3aadac06e92a7", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34f213bcb3913f8760a3aadac06e92a7");
        } else {
            BalanceInsufficientGuideFragment.a(this.b, this.c, view);
        }
    }
}
