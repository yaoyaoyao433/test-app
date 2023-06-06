package com.meituan.android.pay.utils;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.android.pay.activity.PayActivity;
import com.meituan.android.pay.hellodialog.DiscountDowngradeDialog;
import com.meituan.android.pay.model.bean.DiscountDowngrade;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.tencent.smtt.sdk.TbsListener;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class h {
    public static ChangeQuickRedirect a;

    public static boolean a(Activity activity, PayException payException) {
        Object[] objArr = {activity, payException};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a9c3c249eaef66bf17938657ac3ebd6c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a9c3c249eaef66bf17938657ac3ebd6c")).booleanValue() : a(activity) && b(payException);
    }

    private static boolean b(PayException payException) {
        Object[] objArr = {payException};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0293c864e6014c2337b659a6efc2f011", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0293c864e6014c2337b659a6efc2f011")).booleanValue();
        }
        DiscountDowngrade a2 = a(payException);
        return a2 != null && a2.isDegradePay();
    }

    private static boolean a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3802a41bcddb4cc260d25c69c7f8b2f0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3802a41bcddb4cc260d25c69c7f8b2f0")).booleanValue() : !TextUtils.isEmpty(com.meituan.android.pay.common.payment.utils.b.b(activity, "current_url"));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.meituan.android.pay.model.bean.DiscountDowngrade a(com.meituan.android.paybase.retrofit.PayException r11) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r1 = 0
            r8[r1] = r11
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.pay.utils.h.a
            java.lang.String r10 = "b9c548d1c7ccf839726d30f412f5d445"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r9, r0, r10)
            com.meituan.android.pay.model.bean.DiscountDowngrade r11 = (com.meituan.android.pay.model.bean.DiscountDowngrade) r11
            return r11
        L1e:
            if (r11 == 0) goto L53
            java.lang.String r0 = r11.getExtra()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L53
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L4e
            java.lang.String r1 = r11.getExtra()     // Catch: org.json.JSONException -> L4e
            r0.<init>(r1)     // Catch: org.json.JSONException -> L4e
            java.lang.String r1 = "promo_degrade_data"
            java.lang.String r0 = r0.getString(r1)     // Catch: org.json.JSONException -> L4e
            com.google.gson.Gson r1 = com.meituan.android.paybase.utils.n.a()     // Catch: org.json.JSONException -> L4e
            com.meituan.android.pay.utils.h$1 r3 = new com.meituan.android.pay.utils.h$1     // Catch: org.json.JSONException -> L4e
            r3.<init>()     // Catch: org.json.JSONException -> L4e
            java.lang.reflect.Type r3 = r3.getType()     // Catch: org.json.JSONException -> L4e
            java.lang.Object r0 = r1.fromJson(r0, r3)     // Catch: org.json.JSONException -> L4e
            com.meituan.android.pay.model.bean.DiscountDowngrade r0 = (com.meituan.android.pay.model.bean.DiscountDowngrade) r0     // Catch: org.json.JSONException -> L4e
            goto L54
        L4e:
            java.lang.String r0 = "DiscountDowngradeUtils_hasOrderPrice"
            com.meituan.android.paybase.common.analyse.a.a(r11, r0, r2)
        L53:
            r0 = r2
        L54:
            if (r0 == 0) goto L5d
            java.lang.String r11 = r11.getMessage()
            r0.setMessage(r11)
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.pay.utils.h.a(com.meituan.android.paybase.retrofit.PayException):com.meituan.android.pay.model.bean.DiscountDowngrade");
    }

    public static boolean a(final FragmentActivity fragmentActivity, Exception exc, final HashMap<String, String> hashMap, final com.meituan.android.paybase.retrofit.b bVar) {
        Object[] objArr = {fragmentActivity, exc, hashMap, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21e5dbf768bcc09e5faca57f773d8b53", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21e5dbf768bcc09e5faca57f773d8b53")).booleanValue();
        }
        if (exc instanceof PayException) {
            final PayException payException = (PayException) exc;
            if (a(fragmentActivity, payException)) {
                DiscountDowngradeDialog.a aVar = new DiscountDowngradeDialog.a() { // from class: com.meituan.android.pay.utils.h.2
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.pay.hellodialog.DiscountDowngradeDialog.a
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "15ff09e15eb4ea71db83b7b37708e579", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "15ff09e15eb4ea71db83b7b37708e579");
                            return;
                        }
                        e.c(FragmentActivity.this);
                        String b = com.meituan.android.pay.common.payment.utils.b.b(FragmentActivity.this, "current_url");
                        if (!TextUtils.isEmpty(b)) {
                            PayActivity.a(FragmentActivity.this, b, hashMap, (HashMap<String, String>) null, (int) TbsListener.ErrorCode.INCR_ERROR_DETAIL, bVar);
                        }
                        com.meituan.android.paybase.common.analyse.a.a("b_pay_ovwlfccy_mc", new a.c().a("trans_id", com.meituan.android.paybase.common.analyse.b.b).a(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, Integer.valueOf(payException.getCode())).b);
                    }

                    @Override // com.meituan.android.pay.hellodialog.DiscountDowngradeDialog.a
                    public final void b() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bdf65d3819dff77c1f641d8bb915e186", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bdf65d3819dff77c1f641d8bb915e186");
                            return;
                        }
                        s.a((Activity) FragmentActivity.this, payException, 3);
                        com.meituan.android.paybase.common.analyse.a.a("b_pay_t3anxiv9_mc", new a.c().a("trans_id", com.meituan.android.paybase.common.analyse.b.b).a(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, Integer.valueOf(payException.getCode())).b);
                    }
                };
                DiscountDowngrade a2 = a(payException);
                if (com.meituan.android.paycommon.lib.utils.a.a(fragmentActivity)) {
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_qgyd9nnt_mc", (Map<String, Object>) null);
                } else {
                    new DiscountDowngradeDialog(fragmentActivity, a2, aVar).show();
                }
                com.meituan.android.paybase.common.analyse.a.a("b_pay_f2sw3e84_mv", new a.c().a("trans_id", com.meituan.android.paybase.common.analyse.b.b).a(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, Integer.valueOf(payException.getCode())).b);
                return true;
            }
        }
        return false;
    }
}
