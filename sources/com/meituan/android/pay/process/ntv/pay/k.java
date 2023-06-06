package com.meituan.android.pay.process.ntv.pay;

import android.app.Dialog;
import com.meituan.android.pay.activity.PayActivity;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final j b;
    private final String c;

    public k(j jVar, String str) {
        this.b = jVar;
        this.c = str;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59fd5bec344969cc98bbe9a855eb98ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59fd5bec344969cc98bbe9a855eb98ed");
            return;
        }
        j jVar = this.b;
        String str = this.c;
        Object[] objArr2 = {jVar, str, dialog};
        ChangeQuickRedirect changeQuickRedirect2 = j.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b047f0e6cd65c1d8c4f31f517e592cac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b047f0e6cd65c1d8c4f31f517e592cac");
        } else {
            PayActivity.a(jVar.b, str, -9753);
        }
    }
}
