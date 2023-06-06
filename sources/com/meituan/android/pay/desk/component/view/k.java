package com.meituan.android.pay.desk.component.view;

import android.support.constraint.R;
import android.view.View;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paycommon.lib.webview.specialcontainer.dialogclose.WebViewDialogCloseActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final j b;
    private final String c;

    private k(j jVar, String str) {
        this.b = jVar;
        this.c = str;
    }

    public static View.OnClickListener a(j jVar, String str) {
        Object[] objArr = {jVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed926255e00ad567e34c25f842383712", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed926255e00ad567e34c25f842383712") : new k(jVar, str);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed46fb4ad0d090af47c49879a5cef2c9", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed46fb4ad0d090af47c49879a5cef2c9");
            return;
        }
        j jVar = this.b;
        String str = this.c;
        Object[] objArr2 = {jVar, str, view};
        ChangeQuickRedirect changeQuickRedirect2 = j.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "89f8bb94e55bbb0e633e45050d82e284", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "89f8bb94e55bbb0e633e45050d82e284");
            return;
        }
        WebViewDialogCloseActivity.b(jVar.b.getContext(), str);
        com.meituan.android.paybase.common.analyse.a.a("b_b3c68uu4", jVar.b.getContext().getString(R.string.mpay__mge_act_click_user_contract), new a.c().a("meituan_type", com.meituan.android.pay.common.payment.utils.b.b(jVar.c, "pay_type")).b, a.EnumC0329a.CLICK, -1);
        com.meituan.android.paybase.common.analyse.a.a("b_pay_b2sav7h1_mc", new a.c().a("pay_type", com.meituan.android.pay.common.payment.utils.b.b(jVar.c, "pay_type")).b);
    }
}
