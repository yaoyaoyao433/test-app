package com.meituan.android.paycommon.lib.utils;

import android.app.Activity;
import android.app.Dialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final Activity b;
    private final Class c;

    private e(Activity activity, Class cls) {
        this.b = activity;
        this.c = cls;
    }

    public static BasePayDialog.c a(Activity activity, Class cls) {
        Object[] objArr = {activity, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b098af3b82535b66a4aea6d3bdf80d2", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b098af3b82535b66a4aea6d3bdf80d2") : new e(activity, cls);
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c7126f7e403ee637a6d59880c4fdf3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c7126f7e403ee637a6d59880c4fdf3e");
            return;
        }
        Activity activity = this.b;
        Class cls = this.c;
        Object[] objArr2 = {activity, cls, dialog};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c5f2577bda2b89089437cc0bf336b5ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c5f2577bda2b89089437cc0bf336b5ec");
            return;
        }
        if (dialog != null) {
            dialog.dismiss();
        }
        d.a(activity, cls);
    }
}
