package com.meituan.android.pay.process.ntv.pay;

import android.app.Dialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.android.paybase.password.retrievepassword.RetrievePasswordActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final e b;

    public i(e eVar) {
        this.b = eVar;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc3b8c3a7148501baf7be8f72d546e8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc3b8c3a7148501baf7be8f72d546e8e");
            return;
        }
        e eVar = this.b;
        Object[] objArr2 = {eVar, dialog};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f71dfcd86bf5f462c4fd7cd4c917acc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f71dfcd86bf5f462c4fd7cd4c917acc9");
            return;
        }
        RetrievePasswordActivity.a(eVar.b, 303);
        eVar.d.o();
    }
}
