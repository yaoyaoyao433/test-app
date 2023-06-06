package com.meituan.android.pay.setpassword;

import android.app.Dialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private static final d b = new d();

    public static BasePayDialog.c a() {
        return b;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36167dd2fba308f5fa03def18f4125e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36167dd2fba308f5fa03def18f4125e2");
        } else {
            SetPasswordFragment.a(dialog);
        }
    }
}
