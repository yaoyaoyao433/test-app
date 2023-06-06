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
public final /* synthetic */ class t implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final Activity b;
    private final PayException c;

    private t(Activity activity, PayException payException) {
        this.b = activity;
        this.c = payException;
    }

    public static BasePayDialog.c a(Activity activity, PayException payException) {
        Object[] objArr = {activity, payException};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b873dc07505bde0f768f279f8bbf256", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b873dc07505bde0f768f279f8bbf256") : new t(activity, payException);
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab1f31c7a22daa1183cf3d73feff4dff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab1f31c7a22daa1183cf3d73feff4dff");
            return;
        }
        Activity activity = this.b;
        PayException payException = this.c;
        Object[] objArr2 = {activity, payException, dialog};
        ChangeQuickRedirect changeQuickRedirect2 = s.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0bc291552c22e05e4637761d4b1277f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0bc291552c22e05e4637761d4b1277f7");
            return;
        }
        dialog.dismiss();
        s.a(activity, payException, 4);
    }
}
