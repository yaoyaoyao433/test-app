package com.meituan.android.pay.process.ntv.around;

import android.app.Dialog;
import android.support.constraint.R;
import com.meituan.android.pay.activity.PayActivity;
import com.meituan.android.pay.model.PayErrorCode;
import com.meituan.android.paybase.dialog.BasePayDialog;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d07997f1f04d2830f5b34d6ae8f4f98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d07997f1f04d2830f5b34d6ae8f4f98");
            return;
        }
        a aVar = this.b;
        Object[] objArr2 = {aVar, dialog};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "734e9bef54488a8b15762701e83df96d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "734e9bef54488a8b15762701e83df96d");
        } else {
            PayActivity.b(aVar.b, aVar.b.getString(R.string.mpay__cancel_msg7), PayErrorCode.BANK_ERROR_GUIDE_CANCEL);
        }
    }
}
