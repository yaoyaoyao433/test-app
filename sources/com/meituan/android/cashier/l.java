package com.meituan.android.cashier;

import android.app.Dialog;
import com.meituan.android.cashier.model.bean.RetainWindow;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final NativeStandardCashierAdapter b;
    private final String c;
    private final RetainWindow d;

    private l(NativeStandardCashierAdapter nativeStandardCashierAdapter, String str, RetainWindow retainWindow) {
        this.b = nativeStandardCashierAdapter;
        this.c = str;
        this.d = retainWindow;
    }

    public static BasePayDialog.c a(NativeStandardCashierAdapter nativeStandardCashierAdapter, String str, RetainWindow retainWindow) {
        Object[] objArr = {nativeStandardCashierAdapter, str, retainWindow};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "303461a5d6751b20bfbe1ffea8eac3e3", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "303461a5d6751b20bfbe1ffea8eac3e3") : new l(nativeStandardCashierAdapter, str, retainWindow);
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9363a581a45bbb5514676f03a958e10d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9363a581a45bbb5514676f03a958e10d");
        } else {
            NativeStandardCashierAdapter.a(this.b, this.c, this.d, dialog);
        }
    }
}
