package com.meituan.android.paycommon.lib.utils;

import android.app.Activity;
import android.app.Dialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final Activity b;
    private final Class c;

    private f(Activity activity, Class cls) {
        this.b = activity;
        this.c = cls;
    }

    public static BasePayDialog.c a(Activity activity, Class cls) {
        Object[] objArr = {activity, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0a52812f17c2ec7398c2097f3c181ae", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0a52812f17c2ec7398c2097f3c181ae") : new f(activity, cls);
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef30e7c65e340f22c36cdb540cdc3dd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef30e7c65e340f22c36cdb540cdc3dd0");
            return;
        }
        Activity activity = this.b;
        Class cls = this.c;
        Object[] objArr2 = {activity, cls, dialog};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "42cd66680706f01a81a909c25e830d37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "42cd66680706f01a81a909c25e830d37");
            return;
        }
        if (dialog != null) {
            dialog.dismiss();
        }
        d.a(activity, cls);
    }
}
