package com.meituan.android.pay.desk.pack;

import android.view.View;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final e b;
    private final MTPayment c;

    private j(e eVar, MTPayment mTPayment) {
        this.b = eVar;
        this.c = mTPayment;
    }

    public static View.OnClickListener a(e eVar, MTPayment mTPayment) {
        Object[] objArr = {eVar, mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "845ee1373ae908c272640dce61adfea8", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "845ee1373ae908c272640dce61adfea8") : new j(eVar, mTPayment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81aa4a547ab25d33d38c19708e81b00a", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81aa4a547ab25d33d38c19708e81b00a");
            return;
        }
        e eVar = this.b;
        MTPayment mTPayment = this.c;
        Object[] objArr2 = {eVar, mTPayment, view};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2015db037a94c0774f9e74c5b0dc5f8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2015db037a94c0774f9e74c5b0dc5f8d");
        } else if (eVar.d != null) {
            eVar.d.a(mTPayment);
        }
    }
}
