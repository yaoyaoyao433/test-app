package com.meituan.android.paycommon.lib;

import android.app.Activity;
import android.app.Dialog;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.dialog.PayDialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.paycommon.lib.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0339a {
        void a();

        void b();
    }

    public final Dialog a(DetainmentDialogInfo detainmentDialogInfo, Activity activity, ViewGroup viewGroup, InterfaceC0339a interfaceC0339a) {
        Object[] objArr = {detainmentDialogInfo, activity, viewGroup, interfaceC0339a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8dc07cdd56eacad52339090dd8ea3da", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8dc07cdd56eacad52339090dd8ea3da");
        }
        if (detainmentDialogInfo == null || TextUtils.isEmpty(detainmentDialogInfo.getDialogMessage()) || !detainmentDialogInfo.isMarketingPayment() || detainmentDialogInfo.isShowDialog()) {
            return null;
        }
        Dialog a2 = new PayDialog.a(activity).c(detainmentDialogInfo.getDialogMessage()).a(activity.getString(R.string.paycommon__quit_pay), b.a(detainmentDialogInfo, interfaceC0339a)).b(activity.getString(R.string.paycommon__continue_pay), c.a(viewGroup, detainmentDialogInfo, interfaceC0339a)).a(false).b(true).a(BasePayDialog.a.DIFF).a();
        a2.setOnCancelListener(d.a(interfaceC0339a));
        com.meituan.android.paybase.common.analyse.a.a("b_pay_s0l9oo78_mv", (String) null, new a.c().a("test_group", detainmentDialogInfo.getTestGroup()).a("qdb_trade_order_id", detainmentDialogInfo.getTansId()).a("nb_version", detainmentDialogInfo.getNbVersion()).a("pay_platform", "android").b, a.EnumC0329a.CLICK, -1);
        viewGroup.setVisibility(4);
        detainmentDialogInfo.setShowDialog(true);
        return a2;
    }
}
