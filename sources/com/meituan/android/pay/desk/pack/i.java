package com.meituan.android.pay.desk.pack;

import android.view.View;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final e b;
    private final MTPayment c;

    private i(e eVar, MTPayment mTPayment) {
        this.b = eVar;
        this.c = mTPayment;
    }

    public static View.OnClickListener a(e eVar, MTPayment mTPayment) {
        Object[] objArr = {eVar, mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fba6ffa850a97dd39b9cb6a89003cc58", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fba6ffa850a97dd39b9cb6a89003cc58") : new i(eVar, mTPayment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d8b2f4dd75c8066fff337d951133b4d", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d8b2f4dd75c8066fff337d951133b4d");
            return;
        }
        e eVar = this.b;
        MTPayment mTPayment = this.c;
        Object[] objArr2 = {eVar, mTPayment, view};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e5c6f6de443f0d39cd3396de5d2b460a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e5c6f6de443f0d39cd3396de5d2b460a");
        } else if (eVar.d != null) {
            eVar.d.a(mTPayment);
        }
    }
}
