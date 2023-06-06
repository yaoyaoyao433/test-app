package com.meituan.android.cashier.exception;

import android.app.Dialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final a b;

    public b(a aVar) {
        this.b = aVar;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0fad97be3888bc79aa2ebd14fade320", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0fad97be3888bc79aa2ebd14fade320");
            return;
        }
        a aVar = this.b;
        Object[] objArr2 = {aVar, dialog};
        ChangeQuickRedirect changeQuickRedirect2 = a.c;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3af19fa1a0f1219639f062c71e79447f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3af19fa1a0f1219639f062c71e79447f");
        } else {
            aVar.d.a(1);
        }
    }
}
