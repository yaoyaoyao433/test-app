package com.meituan.android.paycommon.lib;

import android.app.Dialog;
import android.view.ViewGroup;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.android.paycommon.lib.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements BasePayDialog.c {
    public static ChangeQuickRedirect a;
    private final ViewGroup b;
    private final DetainmentDialogInfo c;
    private final a.InterfaceC0339a d;

    private c(ViewGroup viewGroup, DetainmentDialogInfo detainmentDialogInfo, a.InterfaceC0339a interfaceC0339a) {
        this.b = viewGroup;
        this.c = detainmentDialogInfo;
        this.d = interfaceC0339a;
    }

    public static BasePayDialog.c a(ViewGroup viewGroup, DetainmentDialogInfo detainmentDialogInfo, a.InterfaceC0339a interfaceC0339a) {
        Object[] objArr = {viewGroup, detainmentDialogInfo, interfaceC0339a};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fae5831bf312b318a2d3b306960fd627", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fae5831bf312b318a2d3b306960fd627") : new c(viewGroup, detainmentDialogInfo, interfaceC0339a);
    }

    @Override // com.meituan.android.paybase.dialog.BasePayDialog.c
    public final void a(Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaf4d15ed2fcdcc0e04453df4868a620", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaf4d15ed2fcdcc0e04453df4868a620");
            return;
        }
        ViewGroup viewGroup = this.b;
        DetainmentDialogInfo detainmentDialogInfo = this.c;
        a.InterfaceC0339a interfaceC0339a = this.d;
        Object[] objArr2 = {viewGroup, detainmentDialogInfo, interfaceC0339a, dialog};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c690ea97513d64dea1adc312284a2d9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c690ea97513d64dea1adc312284a2d9f");
            return;
        }
        if (dialog != null) {
            viewGroup.setVisibility(0);
            dialog.dismiss();
        }
        com.meituan.android.paybase.common.analyse.a.a("b_pay_8r289ouz_mc", "挽留弹窗_点击 继续支付 ", new a.c().a("test_group", detainmentDialogInfo.getTestGroup()).a("qdb_trade_order_id", detainmentDialogInfo.getTansId()).a("nb_version", detainmentDialogInfo.getNbVersion()).a("pay_platform", "android").b, a.EnumC0329a.CLICK, -1);
        interfaceC0339a.b();
    }
}
