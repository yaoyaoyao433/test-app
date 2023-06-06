package com.meituan.android.pay.desk.pack;

import android.view.View;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class o implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final e b;
    private final MTPayment c;

    private o(e eVar, MTPayment mTPayment) {
        this.b = eVar;
        this.c = mTPayment;
    }

    public static View.OnClickListener a(e eVar, MTPayment mTPayment) {
        Object[] objArr = {eVar, mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc3b88ce67f7bf6d2117ecc65cce7101", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc3b88ce67f7bf6d2117ecc65cce7101") : new o(eVar, mTPayment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc9a7b92fa76d647453eab56134f55e8", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc9a7b92fa76d647453eab56134f55e8");
            return;
        }
        e eVar = this.b;
        MTPayment mTPayment = this.c;
        Object[] objArr2 = {eVar, mTPayment, view};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "dbf43a038f9dae7c117e4219c8f9336d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "dbf43a038f9dae7c117e4219c8f9336d");
        } else if (eVar.d != null) {
            eVar.d.a(mTPayment);
        }
    }
}
