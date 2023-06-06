package com.meituan.android.pay.desk.pack;

import android.view.View;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class r implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final e b;
    private final MTPayment c;

    private r(e eVar, MTPayment mTPayment) {
        this.b = eVar;
        this.c = mTPayment;
    }

    public static View.OnClickListener a(e eVar, MTPayment mTPayment) {
        Object[] objArr = {eVar, mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "519c12dc0bf3b6f16a3ca16bace9162c", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "519c12dc0bf3b6f16a3ca16bace9162c") : new r(eVar, mTPayment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fac78688c78fc56e45738f558eeba22", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fac78688c78fc56e45738f558eeba22");
            return;
        }
        e eVar = this.b;
        MTPayment mTPayment = this.c;
        Object[] objArr2 = {eVar, mTPayment, view};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "cf6ae57cf63745b53bca589a62af1766", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "cf6ae57cf63745b53bca589a62af1766");
        } else if (eVar.d != null) {
            eVar.d.a(mTPayment);
        }
    }
}
