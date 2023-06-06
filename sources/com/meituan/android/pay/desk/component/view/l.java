package com.meituan.android.pay.desk.component.view;

import android.app.Activity;
import android.support.constraint.R;
import android.view.View;
import com.meituan.android.pay.common.payment.bean.RepayHelp;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.dialog.PayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final j b;
    private final RepayHelp c;

    private l(j jVar, RepayHelp repayHelp) {
        this.b = jVar;
        this.c = repayHelp;
    }

    public static View.OnClickListener a(j jVar, RepayHelp repayHelp) {
        Object[] objArr = {jVar, repayHelp};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0bfc8e6ae20124d5620a9080fe03dc8c", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0bfc8e6ae20124d5620a9080fe03dc8c") : new l(jVar, repayHelp);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecdf7a9ccb640a0cd7752fb5e768bd92", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecdf7a9ccb640a0cd7752fb5e768bd92");
            return;
        }
        j jVar = this.b;
        RepayHelp repayHelp = this.c;
        Object[] objArr2 = {jVar, repayHelp, view};
        ChangeQuickRedirect changeQuickRedirect2 = j.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3697ec402e89e63520b297d112c728df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3697ec402e89e63520b297d112c728df");
            return;
        }
        new PayDialog.a((Activity) jVar.b.getContext()).b(repayHelp.getHelpAlert().getTitle()).c(repayHelp.getHelpAlert().getContent()).b("知道了", null).a().show();
        com.meituan.android.paybase.common.analyse.a.a("b_2cjj8kmp", jVar.b.getContext().getString(R.string.mpay__mge_act_click_credit_pay), new a.c().a("meituan_type", com.meituan.android.pay.common.payment.utils.b.b(jVar.c, "pay_type")).b, a.EnumC0329a.CLICK, -1);
        com.meituan.android.paybase.common.analyse.a.a("b_pay_ydukcds9_mc", new a.c().a("pay_type", com.meituan.android.pay.common.payment.utils.b.b(jVar.c, "pay_type")).b);
    }
}
