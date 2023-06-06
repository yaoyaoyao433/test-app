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
public final /* synthetic */ class x implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final Activity b;
    private final PayException c;

    public x(Activity activity, PayException payException) {
        this.b = activity;
        this.c = payException;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14dc2da2510907b3fb9726856dec80cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14dc2da2510907b3fb9726856dec80cf");
            return;
        }
        Activity activity = this.b;
        PayException payException = this.c;
        Object[] objArr2 = {activity, payException, dialog};
        ChangeQuickRedirect changeQuickRedirect2 = s.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a3fa5c41b4647e18bc8231535829ee60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a3fa5c41b4647e18bc8231535829ee60");
            return;
        }
        dialog.dismiss();
        s.a(activity, payException, 5);
    }
}
