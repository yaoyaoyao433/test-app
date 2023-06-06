package com.meituan.android.pay.process.ntv.sign;

import android.app.Dialog;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final a b;
    private final BankInfo c;

    public c(a aVar, BankInfo bankInfo) {
        this.b = aVar;
        this.c = bankInfo;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66efe7e52d9b11d1303bc844d64e1cf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66efe7e52d9b11d1303bc844d64e1cf8");
            return;
        }
        a aVar = this.b;
        BankInfo bankInfo = this.c;
        Object[] objArr2 = {aVar, bankInfo, dialog};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5af9e7f4c12c36dd880e01060cdf30d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5af9e7f4c12c36dd880e01060cdf30d4");
        } else if (i.a((Collection) bankInfo.getFactors())) {
        } else {
            aVar.a(bankInfo);
            dialog.dismiss();
        }
    }
}
