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
public final /* synthetic */ class w implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final Activity b;
    private final PayException c;

    public w(Activity activity, PayException payException) {
        this.b = activity;
        this.c = payException;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "992dd55f2ce4374099cd1c829a73abb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "992dd55f2ce4374099cd1c829a73abb5");
            return;
        }
        Activity activity = this.b;
        PayException payException = this.c;
        Object[] objArr2 = {activity, payException, dialog};
        ChangeQuickRedirect changeQuickRedirect2 = s.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2fd9842aac95639648c9249942ef8bbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2fd9842aac95639648c9249942ef8bbb");
            return;
        }
        dialog.dismiss();
        s.a(activity, payException, 4);
    }
}
