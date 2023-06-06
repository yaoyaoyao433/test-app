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
public final /* synthetic */ class v implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final Exception b;
    private final Activity c;
    private final int d;
    private final String e;

    private v(Exception exc, Activity activity, int i, String str) {
        this.b = exc;
        this.c = activity;
        this.d = i;
        this.e = str;
    }

    public static BasePayDialog.c a(Exception exc, Activity activity, int i, String str) {
        Object[] objArr = {exc, activity, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba602c8b58241a0f45c20365d8068f1c", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba602c8b58241a0f45c20365d8068f1c") : new v(exc, activity, i, str);
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49405ec71b15d1ed24b03de181b02ada", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49405ec71b15d1ed24b03de181b02ada");
            return;
        }
        Exception exc = this.b;
        Activity activity = this.c;
        int i = this.d;
        String str = this.e;
        Object[] objArr2 = {exc, activity, Integer.valueOf(i), str, dialog};
        ChangeQuickRedirect changeQuickRedirect2 = s.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a3797215e8efec7173c869cfd425db0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a3797215e8efec7173c869cfd425db0c");
            return;
        }
        if (dialog != null) {
            dialog.dismiss();
        }
        if (exc instanceof PayException) {
            s.a(activity, (PayException) exc, i);
        } else {
            s.a(activity, str, -9753, i);
        }
    }
}
