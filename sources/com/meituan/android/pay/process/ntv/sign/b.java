package com.meituan.android.pay.process.ntv.sign;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b22d7b83c7c4d54816f8b602fc9ecd9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b22d7b83c7c4d54816f8b602fc9ecd9f");
            return;
        }
        a aVar = this.b;
        Object[] objArr2 = {aVar, dialog};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "431f040db29e01122e4c1c7e96adef71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "431f040db29e01122e4c1c7e96adef71");
            return;
        }
        PayActivity.b(aVar.b, aVar.b.getString(R.string.mpay__cancel_msg12), PayErrorCode.CARD_UPDATE_INFO_CANCEL);
        dialog.dismiss();
    }
}
