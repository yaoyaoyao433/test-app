package com.meituan.android.identifycardrecognizer.fragment;

import android.app.Dialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private static final k b = new k();

    public static BasePayDialog.c a() {
        return b;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e1ddb121c84eca816c74a9a831e9289", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e1ddb121c84eca816c74a9a831e9289");
        } else {
            dialog.dismiss();
        }
    }
}
