package com.meituan.android.pay.process.ntv.pay;

import android.app.Dialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.android.paybase.password.retrievepassword.RetrievePasswordActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final e b;

    public g(e eVar) {
        this.b = eVar;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84cc18c038a67a809f2b893fb59e473c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84cc18c038a67a809f2b893fb59e473c");
            return;
        }
        e eVar = this.b;
        Object[] objArr2 = {eVar, dialog};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5372ef195a4c20d8938eb748d90a3c77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5372ef195a4c20d8938eb748d90a3c77");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_dcvsldi3", (Map<String, Object>) null);
        RetrievePasswordActivity.a(eVar.b, 303);
        eVar.d.o();
    }
}
