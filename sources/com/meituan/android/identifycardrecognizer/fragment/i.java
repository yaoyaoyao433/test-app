package com.meituan.android.identifycardrecognizer.fragment;

import android.app.Dialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private static final i b = new i();

    public static BasePayDialog.c a() {
        return b;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fae582069f384605abe8484a6efa6962", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fae582069f384605abe8484a6efa6962");
        } else {
            dialog.dismiss();
        }
    }
}
