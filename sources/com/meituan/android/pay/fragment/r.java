package com.meituan.android.pay.fragment;

import android.app.Dialog;
import android.view.View;
import com.meituan.android.pay.common.promotion.bean.Agreement;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class r implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final VerifyBankInfoFragment b;
    private final Dialog c;
    private final String d;
    private final a.c e;
    private final Agreement f;

    public r(VerifyBankInfoFragment verifyBankInfoFragment, Dialog dialog, String str, a.c cVar, Agreement agreement) {
        this.b = verifyBankInfoFragment;
        this.c = dialog;
        this.d = str;
        this.e = cVar;
        this.f = agreement;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c0a78bf37fce790c4a28b252191fa57", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c0a78bf37fce790c4a28b252191fa57");
        } else {
            VerifyBankInfoFragment.a(this.b, this.c, this.d, this.e, this.f, view);
        }
    }
}
