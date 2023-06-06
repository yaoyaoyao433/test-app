package com.meituan.android.finthirdpayadapter.payer;

import android.app.Activity;
import android.text.TextUtils;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.dialog.e;
import com.meituan.android.paybase.moduleinterface.payment.Payer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class UPFlashPayer implements Payer {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.paybase.moduleinterface.payment.Payer
    public final void a(Activity activity, String str, String str2) {
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43f5ab31fd23800f0a5c09f8932dfd95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43f5ab31fd23800f0a5c09f8932dfd95");
        } else if (activity == null || TextUtils.isEmpty(str)) {
            e.a(activity, (Object) "支付失败，请更换其他支付方式", true);
            com.meituan.android.paybase.common.analyse.a.a("b_pay_u6xvaahg_mv", new a.c().a("message", "调用参数错误").b);
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_unionpay", 1140059);
            com.meituan.android.finthirdpayadapter.utils.a.a(activity, "param error", "unionflashpay");
        } else if (!com.meituan.android.paybase.utils.a.a(activity, "com.unionpay")) {
            e.a(activity, (Object) "支付失败，请更换其他支付方式", true);
            com.meituan.android.paybase.common.analyse.a.a("b_pay_u6xvaahg_mv", new a.c().a("message", "云闪付未安装").b);
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_unionpay", 1140060);
            com.meituan.android.finthirdpayadapter.utils.a.a(activity, "not install", "unionflashpay");
        } else {
            UPPayHandle.b(activity, null, null, str, "00");
        }
    }
}
