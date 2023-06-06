package com.meituan.android.pay.desk.pack;

import android.view.View;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final e b;
    private final MTPayment c;

    private k(e eVar, MTPayment mTPayment) {
        this.b = eVar;
        this.c = mTPayment;
    }

    public static View.OnClickListener a(e eVar, MTPayment mTPayment) {
        Object[] objArr = {eVar, mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5276dec5cbb6108a4bb8fa4cf0bc9ec9", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5276dec5cbb6108a4bb8fa4cf0bc9ec9") : new k(eVar, mTPayment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e30ee57c8b160f2f917f9d1e35812401", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e30ee57c8b160f2f917f9d1e35812401");
            return;
        }
        e eVar = this.b;
        MTPayment mTPayment = this.c;
        Object[] objArr2 = {eVar, mTPayment, view};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a8ca7251869a9546efcfc8c9e20c1691", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a8ca7251869a9546efcfc8c9e20c1691");
        } else if (eVar.d != null) {
            eVar.d.a(mTPayment);
        }
    }
}
