package com.meituan.android.pay.utils;

import android.app.Activity;
import android.app.Dialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class z implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final Activity b;
    private final PayException c;

    private z(Activity activity, PayException payException) {
        this.b = activity;
        this.c = payException;
    }

    public static BasePayDialog.c a(Activity activity, PayException payException) {
        Object[] objArr = {activity, payException};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84a680605710f8af951f6b36da1a7723", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84a680605710f8af951f6b36da1a7723") : new z(activity, payException);
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1e794a23e554fe81f02e914bed2ba1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1e794a23e554fe81f02e914bed2ba1c");
            return;
        }
        Activity activity = this.b;
        PayException payException = this.c;
        Object[] objArr2 = {activity, payException, dialog};
        ChangeQuickRedirect changeQuickRedirect2 = s.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "062bf77d556f27250f6e980fcb540756", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "062bf77d556f27250f6e980fcb540756");
            return;
        }
        dialog.dismiss();
        s.a(activity, payException, 5);
    }
}
