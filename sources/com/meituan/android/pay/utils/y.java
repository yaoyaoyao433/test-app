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
public final /* synthetic */ class y implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final Activity b;
    private final PayException c;

    private y(Activity activity, PayException payException) {
        this.b = activity;
        this.c = payException;
    }

    public static BasePayDialog.c a(Activity activity, PayException payException) {
        Object[] objArr = {activity, payException};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f0a75792f416b71daa48942ae0c025fc", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f0a75792f416b71daa48942ae0c025fc") : new y(activity, payException);
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "846689e8cf6aab7746feec3d5a7686bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "846689e8cf6aab7746feec3d5a7686bf");
            return;
        }
        Activity activity = this.b;
        PayException payException = this.c;
        Object[] objArr2 = {activity, payException, dialog};
        ChangeQuickRedirect changeQuickRedirect2 = s.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a81697280f04b639e862c1e38c29b0b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a81697280f04b639e862c1e38c29b0b7");
            return;
        }
        dialog.dismiss();
        s.a(activity, payException, 4);
    }
}
