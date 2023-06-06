package com.meituan.android.cashier.payresult;

import android.app.Dialog;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.android.paybase.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final a b;

    public b(a aVar) {
        this.b = aVar;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86e96510762ce7397d7b487fa1806b57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86e96510762ce7397d7b487fa1806b57");
            return;
        }
        a aVar = this.b;
        Object[] objArr2 = {aVar, dialog};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1b5cef0b5dce4d2e43cba3f45ac14455", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1b5cef0b5dce4d2e43cba3f45ac14455");
            return;
        }
        PayBaseActivity payBaseActivity = aVar.c;
        Object[] objArr3 = {aVar};
        ChangeQuickRedirect changeQuickRedirect3 = c.a;
        com.meituan.android.paybase.utils.f.a(payBaseActivity, PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "6d3de57ad16f8e1c55222958b811ad84", RobustBitConfig.DEFAULT_VALUE) ? (f.InterfaceC0337f) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "6d3de57ad16f8e1c55222958b811ad84") : new c(aVar));
    }
}
