package com.meituan.android.cashier;

import android.app.Dialog;
import com.meituan.android.cashier.model.bean.RetainWindow;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final NativeStandardCashierAdapter b;
    private final RetainWindow c;

    private d(NativeStandardCashierAdapter nativeStandardCashierAdapter, RetainWindow retainWindow) {
        this.b = nativeStandardCashierAdapter;
        this.c = retainWindow;
    }

    public static BasePayDialog.c a(NativeStandardCashierAdapter nativeStandardCashierAdapter, RetainWindow retainWindow) {
        Object[] objArr = {nativeStandardCashierAdapter, retainWindow};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b72b8240c7111b2ea01be210632446b", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b72b8240c7111b2ea01be210632446b") : new d(nativeStandardCashierAdapter, retainWindow);
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27834fa3b83c8d94a290d86b3707d8e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27834fa3b83c8d94a290d86b3707d8e3");
        } else {
            NativeStandardCashierAdapter.a(this.b, this.c, dialog);
        }
    }
}
