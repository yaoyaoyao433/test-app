package com.meituan.android.elderly.view;

import android.view.View;
import com.meituan.android.elderly.bean.CashierPayment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final ElderlyCashierPaymentAreaView b;
    private final CashierPayment c;

    private a(ElderlyCashierPaymentAreaView elderlyCashierPaymentAreaView, CashierPayment cashierPayment) {
        this.b = elderlyCashierPaymentAreaView;
        this.c = cashierPayment;
    }

    public static View.OnClickListener a(ElderlyCashierPaymentAreaView elderlyCashierPaymentAreaView, CashierPayment cashierPayment) {
        Object[] objArr = {elderlyCashierPaymentAreaView, cashierPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a893e480c1bd101ad78eb44a479e9a93", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a893e480c1bd101ad78eb44a479e9a93") : new a(elderlyCashierPaymentAreaView, cashierPayment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcc30ac5d3a693045672843abea99de1", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcc30ac5d3a693045672843abea99de1");
        } else {
            ElderlyCashierPaymentAreaView.a(this.b, this.c, view);
        }
    }
}
