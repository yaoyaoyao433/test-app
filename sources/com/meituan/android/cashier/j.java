package com.meituan.android.cashier;

import android.app.Dialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final NativeStandardCashierAdapter b;

    public j(NativeStandardCashierAdapter nativeStandardCashierAdapter) {
        this.b = nativeStandardCashierAdapter;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c01e65149141c4e1b4c35a0d603055ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c01e65149141c4e1b4c35a0d603055ab");
        } else {
            NativeStandardCashierAdapter.a(this.b, dialog);
        }
    }
}
