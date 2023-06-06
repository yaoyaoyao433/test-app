package com.meituan.android.paycommon.lib;

import android.app.Dialog;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.android.paycommon.lib.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final DetainmentDialogInfo b;
    private final a.InterfaceC0339a c;

    private b(DetainmentDialogInfo detainmentDialogInfo, a.InterfaceC0339a interfaceC0339a) {
        this.b = detainmentDialogInfo;
        this.c = interfaceC0339a;
    }

    public static BasePayDialog.c a(DetainmentDialogInfo detainmentDialogInfo, a.InterfaceC0339a interfaceC0339a) {
        Object[] objArr = {detainmentDialogInfo, interfaceC0339a};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74d2c8081fd3f080ae1d89000f5fdb41", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74d2c8081fd3f080ae1d89000f5fdb41") : new b(detainmentDialogInfo, interfaceC0339a);
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "004a40621a26be75aa8e12c85da621d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "004a40621a26be75aa8e12c85da621d2");
            return;
        }
        DetainmentDialogInfo detainmentDialogInfo = this.b;
        a.InterfaceC0339a interfaceC0339a = this.c;
        Object[] objArr2 = {detainmentDialogInfo, interfaceC0339a, dialog};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b22f302ed8f56d26c2832bc8d7e14509", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b22f302ed8f56d26c2832bc8d7e14509");
            return;
        }
        if (dialog != null) {
            dialog.dismiss();
        }
        com.meituan.android.paybase.common.analyse.a.a("b_pay_natt1q0s_mc", "挽留弹窗_点击 确认放弃 ", new a.c().a("test_group", detainmentDialogInfo.getTestGroup()).a("qdb_trade_order_id", detainmentDialogInfo.getTansId()).a("nb_version", detainmentDialogInfo.getNbVersion()).a("pay_platform", "android").b, a.EnumC0329a.CLICK, -1);
        interfaceC0339a.a();
    }
}
