package com.meituan.android.pay.dialogfragment;

import android.view.View;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final BalanceInsufficientGuideFragment b;
    private final MTPayment c;

    private b(BalanceInsufficientGuideFragment balanceInsufficientGuideFragment, MTPayment mTPayment) {
        this.b = balanceInsufficientGuideFragment;
        this.c = mTPayment;
    }

    public static View.OnClickListener a(BalanceInsufficientGuideFragment balanceInsufficientGuideFragment, MTPayment mTPayment) {
        Object[] objArr = {balanceInsufficientGuideFragment, mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df3ff74dba5351e3602c009d92be4095", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df3ff74dba5351e3602c009d92be4095") : new b(balanceInsufficientGuideFragment, mTPayment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b8dea5bfac93471c8e2ce1fbe5cc188", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b8dea5bfac93471c8e2ce1fbe5cc188");
        } else {
            BalanceInsufficientGuideFragment.a(this.b, this.c, view);
        }
    }
}
