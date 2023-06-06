package com.meituan.android.pay.desk.pack;

import android.widget.CompoundButton;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class p implements CompoundButton.OnCheckedChangeListener {
    public static ChangeQuickRedirect a;
    private final e b;
    private final MTPayment c;
    private final com.meituan.android.pay.desk.payment.view.e d;

    private p(e eVar, MTPayment mTPayment, com.meituan.android.pay.desk.payment.view.e eVar2) {
        this.b = eVar;
        this.c = mTPayment;
        this.d = eVar2;
    }

    public static CompoundButton.OnCheckedChangeListener a(e eVar, MTPayment mTPayment, com.meituan.android.pay.desk.payment.view.e eVar2) {
        Object[] objArr = {eVar, mTPayment, eVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10d8e84389597a3c12b4900206a800e4", RobustBitConfig.DEFAULT_VALUE) ? (CompoundButton.OnCheckedChangeListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10d8e84389597a3c12b4900206a800e4") : new p(eVar, mTPayment, eVar2);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Object[] objArr = {compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd7a7d4aa76ee943238efc7570463a10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd7a7d4aa76ee943238efc7570463a10");
            return;
        }
        e eVar = this.b;
        MTPayment mTPayment = this.c;
        com.meituan.android.pay.desk.payment.view.e eVar2 = this.d;
        Object[] objArr2 = {eVar, mTPayment, eVar2, compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8fc397b65bae6604f7b11266817d459e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8fc397b65bae6604f7b11266817d459e");
            return;
        }
        if (mTPayment.getUpdateAgreement() != null) {
            mTPayment.getUpdateAgreement().setIsChecked(z);
        }
        if (eVar.c != null) {
            eVar.c.a(eVar2, compoundButton, z);
        }
    }
}
