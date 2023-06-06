package com.meituan.android.finthirdpayadapter.utils;

import android.content.Intent;
import com.meituan.android.finthirdpayadapter.payer.UPPayHandle;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.moduleinterface.payment.OnGotUPPayResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class UPPayResultMgeUtils implements OnGotUPPayResult {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.paybase.moduleinterface.payment.OnGotUPPayResult
    public final void a(int i, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbba08f0ad4e30e4837b016f7fe2e3ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbba08f0ad4e30e4837b016f7fe2e3ae");
        } else if (i == -1) {
            if (intent == null) {
                if (UPPayHandle.a() == UPPayHandle.b.UPSEPAY) {
                    com.meituan.android.paybase.common.analyse.a.a("b_unh7S", new a.c().a("message", "data_null").b);
                    com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_pay_upmppay", -9753);
                    return;
                } else if (UPPayHandle.a() == UPPayHandle.b.UNIONPAY) {
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_nvlh2tkz_mv", new a.c().a("message", "data_null").b);
                    com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_pay_unionpay", -9753);
                    return;
                } else {
                    return;
                }
            }
            String a2 = f.a(intent, "pay_result");
            if ("success".equalsIgnoreCase(a2)) {
                if (UPPayHandle.a() == UPPayHandle.b.UPSEPAY) {
                    com.meituan.android.paybase.common.analyse.a.b("b_CdTwp", new a.b().a().b);
                    com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_pay_upmppay", 200);
                } else if (UPPayHandle.a() == UPPayHandle.b.UNIONPAY) {
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_9gr8ty28_mv", (Map<String, Object>) null);
                    com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_pay_unionpay", 200);
                }
            } else if ("fail".equalsIgnoreCase(a2)) {
                if (UPPayHandle.a() == UPPayHandle.b.UPSEPAY) {
                    com.meituan.android.paybase.common.analyse.a.a("b_unh7S", new a.c().a("message", "pay_result_fail").b);
                    com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_pay_upmppay", -9753);
                } else if (UPPayHandle.a() == UPPayHandle.b.UNIONPAY) {
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_nvlh2tkz_mv", new a.c().a("message", "pay_result_fail").b);
                    com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_pay_unionpay", -9753);
                }
            } else if ("cancel".equalsIgnoreCase(a2)) {
                if (UPPayHandle.a() == UPPayHandle.b.UPSEPAY) {
                    com.meituan.android.paybase.common.analyse.a.a("b_qQP3f", new a.c().a("message", "pay_result_cancel").b);
                    com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_pay_upmppay", -9854);
                } else if (UPPayHandle.a() == UPPayHandle.b.UNIONPAY) {
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_x0bp5i2r_mv", new a.c().a("message", "pay_result_cancel").b);
                    com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_pay_unionpay", -9854);
                }
            }
        }
    }
}
