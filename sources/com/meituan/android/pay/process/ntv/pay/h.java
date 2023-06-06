package com.meituan.android.pay.process.ntv.pay;

import android.app.Dialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final e b;

    public h(e eVar) {
        this.b = eVar;
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d8938822c95da9dee22cb0262bcd606", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d8938822c95da9dee22cb0262bcd606");
            return;
        }
        e eVar = this.b;
        Object[] objArr2 = {eVar, dialog};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0ef21fcd027f8658d5d6dd5c0f4429cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0ef21fcd027f8658d5d6dd5c0f4429cd");
        } else {
            eVar.d.q();
        }
    }
}
