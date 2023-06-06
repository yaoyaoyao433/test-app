package com.meituan.android.pay.process.ntv.pay;

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
public final /* synthetic */ class f implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final e b;

    public f(e eVar) {
        this.b = eVar;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc7769b7d2d4329b740493608065a5d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc7769b7d2d4329b740493608065a5d1");
            return;
        }
        e eVar = this.b;
        Object[] objArr2 = {eVar, dialog};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "00133727cf56002b980a7072c6ff3772", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "00133727cf56002b980a7072c6ff3772");
        } else {
            PayActivity.b(eVar.b, eVar.b.getString(R.string.mpay__cancel_msg8), PayErrorCode.PASSWORD_ERROR_TOO_MUCH_CANCEL);
        }
    }
}
