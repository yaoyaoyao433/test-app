package com.meituan.android.cashier;

import android.app.Dialog;
import com.meituan.android.cashier.model.bean.RetainWindow;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final NativeStandardCashierAdapter b;
    private final RetainWindow c;
    private final String d;

    private c(NativeStandardCashierAdapter nativeStandardCashierAdapter, RetainWindow retainWindow, String str) {
        this.b = nativeStandardCashierAdapter;
        this.c = retainWindow;
        this.d = str;
    }

    public static BasePayDialog.c a(NativeStandardCashierAdapter nativeStandardCashierAdapter, RetainWindow retainWindow, String str) {
        Object[] objArr = {nativeStandardCashierAdapter, retainWindow, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e0fbbcdfa277da9e66e1ae2d093934b1", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e0fbbcdfa277da9e66e1ae2d093934b1") : new c(nativeStandardCashierAdapter, retainWindow, str);
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75489ee0a5fca8530dc08b0b2e2dc0bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75489ee0a5fca8530dc08b0b2e2dc0bf");
        } else {
            NativeStandardCashierAdapter.a(this.b, this.c, this.d, dialog);
        }
    }
}
