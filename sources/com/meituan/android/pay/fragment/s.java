package com.meituan.android.pay.fragment;

import android.app.Dialog;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class s implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final Dialog b;

    public s(Dialog dialog) {
        this.b = dialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaef8448c9e52ba4dfff329a182ca4c3", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaef8448c9e52ba4dfff329a182ca4c3");
        } else {
            VerifyBankInfoFragment.a(this.b, view);
        }
    }
}
