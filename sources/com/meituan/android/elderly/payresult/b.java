package com.meituan.android.elderly.payresult;

import android.app.Dialog;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.android.paybase.utils.f;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8715dcaecad936ec05e8cf2da95fc55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8715dcaecad936ec05e8cf2da95fc55");
            return;
        }
        a aVar = this.b;
        Object[] objArr2 = {aVar, dialog};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "607eb01737ce075b20305c0e9b3985fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "607eb01737ce075b20305c0e9b3985fc");
            return;
        }
        PayBaseActivity payBaseActivity = aVar.c;
        Object[] objArr3 = {aVar};
        ChangeQuickRedirect changeQuickRedirect3 = c.a;
        com.meituan.android.paybase.utils.f.a(payBaseActivity, PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "6a6cc56d5de6b4b2c5607b46173da778", RobustBitConfig.DEFAULT_VALUE) ? (f.InterfaceC0337f) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "6a6cc56d5de6b4b2c5607b46173da778") : new c(aVar));
    }
}
