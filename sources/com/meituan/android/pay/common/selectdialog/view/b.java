package com.meituan.android.pay.common.selectdialog.view;

import android.view.View;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final a b;
    private final MTPayment c;

    private b(a aVar, MTPayment mTPayment) {
        this.b = aVar;
        this.c = mTPayment;
    }

    public static View.OnClickListener a(a aVar, MTPayment mTPayment) {
        Object[] objArr = {aVar, mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c9a8d57b21be5b4d05e2ae4aad59ced6", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c9a8d57b21be5b4d05e2ae4aad59ced6") : new b(aVar, mTPayment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64288793e6fca0e008fc25387eb686ba", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64288793e6fca0e008fc25387eb686ba");
        } else {
            a.a(this.b, this.c, view);
        }
    }
}
