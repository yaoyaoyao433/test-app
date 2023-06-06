package com.meituan.android.pay.analyse;

import android.app.Activity;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.common.unionid.oneid.monitor.LogMonitor;
import com.meituan.android.pay.common.payment.bean.HybridInfo;
import com.meituan.android.pay.model.MeituanPayCatConstants;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.android.pay.process.g;
import com.meituan.android.pay.utils.d;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.analyse.b;
import com.meituan.android.paybase.common.analyse.cat.CatCustomInfo;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.ak;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    @MTPaySuppressFBWarnings({"MS_CANNOT_BE_FINAL"})
    public static int b = 0;
    @MTPaySuppressFBWarnings({"MS_CANNOT_BE_FINAL"})
    public static int c = 0;
    private static boolean d = true;
    private static boolean e = true;

    public static void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c7a7cd0d343e69053413a0be9c378f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c7a7cd0d343e69053413a0be9c378f6");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_5U3W1", new a.c().a("trans_id", b.b).b);
        com.meituan.android.paybase.common.analyse.cat.a.a(MeituanPayCatConstants.ACTION_PAY_WALLETPAY, 200);
        MeituanPayCatConstants.logRateByPayType(activity, 200);
        e(activity, "paybiz_mtpay_success_callback", 200);
        a(activity, "b_pay_standard_cashier_mt_pay_succ_callback_sc", ak.a(activity));
    }

    public static void a(Activity activity, BankInfo bankInfo) {
        Object[] objArr = {activity, bankInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a553d343ec70da3e9c1481533acef4fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a553d343ec70da3e9c1481533acef4fe");
        } else if (d && bankInfo != null && bankInfo.isPayed()) {
            e(activity, "paybiz_mtpay_success", 200);
            d = false;
            a(activity, "b_pay_standard_cashier_mt_pay_succ_sc", ak.a(activity));
        }
    }

    public static void a(Activity activity, String str, int i) {
        Object[] objArr = {activity, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "40724a7bfdfa8cd6d01546e43361e369", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "40724a7bfdfa8cd6d01546e43361e369");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_f3gT6", new a.c().a("code", Integer.valueOf(i)).a("message", str).a(KnbConstants.PARAMS_SCENE, "默认").a("trans_id", b.b).b);
        com.meituan.android.paybase.common.analyse.cat.a.a(MeituanPayCatConstants.ACTION_PAY_WALLETPAY, i);
        MeituanPayCatConstants.logRateByPayType(activity, i);
        e(activity, "paybiz_mtpay_fail", i);
    }

    public static void a(Activity activity, PayException payException) {
        Object[] objArr = {activity, payException};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "469fbfb2010a63d740cba17b3a3c5086", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "469fbfb2010a63d740cba17b3a3c5086");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_f3gT6", new a.c().a("code", Integer.valueOf(payException.getCode())).a("message", payException.getMessage()).a(KnbConstants.PARAMS_SCENE, "默认").a("trans_id", b.b).b);
        com.meituan.android.paybase.common.analyse.cat.a.a(MeituanPayCatConstants.ACTION_PAY_WALLETPAY, payException.getCode());
        MeituanPayCatConstants.logRateByPayType(activity, payException.getCode());
        e(activity, "paybiz_mtpay_fail", payException.getCode());
    }

    public static void b(Activity activity, String str, int i) {
        Object[] objArr = {activity, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "454d832dcd5e86100e5209d99457958f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "454d832dcd5e86100e5209d99457958f");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_z2ig3", new a.c().a("message", str).a("trans_id", b.b).b);
        com.meituan.android.paybase.common.analyse.cat.a.a(MeituanPayCatConstants.ACTION_PAY_WALLETPAY, i);
        MeituanPayCatConstants.logRateByPayType(activity, i);
        e(activity, "paybiz_mtpay_cancel", i);
        a(activity, "b_pay_standard_cashier_mt_pay_cancel_sc", ak.a(activity));
    }

    public static void c(Activity activity, String str, int i) {
        Object[] objArr = {activity, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50f333f161d0b86c237e738eb04bf070", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50f333f161d0b86c237e738eb04bf070");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_f3gT6", new a.c().a("code", Integer.valueOf(i)).a("message", str).a(KnbConstants.PARAMS_SCENE, "超时").a("trans_id", b.b).b);
        com.meituan.android.paybase.common.analyse.cat.a.a(MeituanPayCatConstants.ACTION_PAY_WALLETPAY, i);
        MeituanPayCatConstants.logRateByPayType(activity, i);
        e(activity, "paybiz_mtpay_fail", i);
    }

    public static void d(Activity activity, String str, int i) {
        Object[] objArr = {activity, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a9ec5c8bc7785f8e65ca1db25531aacf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a9ec5c8bc7785f8e65ca1db25531aacf");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_f3gT6", new a.c().a("code", Integer.valueOf(i)).a("message", str).a(KnbConstants.PARAMS_SCENE, "重大错误").a("trans_id", b.b).b);
        com.meituan.android.paybase.common.analyse.cat.a.a(MeituanPayCatConstants.ACTION_PAY_WALLETPAY, i);
        MeituanPayCatConstants.logRateByPayType(activity, i);
        e(activity, "paybiz_mtpay_fail", i);
    }

    private static void e(Activity activity, String str, int i) {
        Object[] objArr = {activity, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "56cf7e65e62bee6655d9a5208ade5152", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "56cf7e65e62bee6655d9a5208ade5152");
            return;
        }
        CatCustomInfo catCustomInfo = new CatCustomInfo();
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(1.0f));
        HashMap hashMap = new HashMap();
        String b2 = com.meituan.android.pay.common.payment.utils.b.b(activity, "pay_type");
        String b3 = com.meituan.android.pay.common.payment.utils.b.b(activity, "verify_type");
        hashMap.put("pay_type", b2);
        hashMap.put("verify_type", b3);
        hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, String.valueOf(i));
        hashMap.put("mtpay_scene", com.meituan.android.pay.common.analyse.a.b);
        catCustomInfo.setCustomCommandTagDic(hashMap);
        catCustomInfo.setCustomCommand(str);
        catCustomInfo.setCustomCommandDurationArray(arrayList);
        com.meituan.android.paybase.common.analyse.cat.a.b(catCustomInfo);
    }

    public static void a() {
        d = true;
        e = true;
        b = 0;
        c = 0;
    }

    public static void a(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "431276b07ed087bd76787998e0affdf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "431276b07ed087bd76787998e0affdf0");
        } else if (TextUtils.isEmpty(com.meituan.android.pay.common.payment.utils.b.b(activity, "trans_id")) || TextUtils.isEmpty(com.meituan.android.pay.common.payment.utils.b.b(activity, "pay_token"))) {
            com.meituan.android.paybase.common.analyse.a.a("b_pay_5ijm6qk8_mv", new a.c().a("message", "transId或payToken为空").a(LogMonitor.EXCEPTION_TAG, str).a("trans_id", com.meituan.android.pay.common.payment.utils.b.b(activity, "trans_id")).b);
        }
    }

    public static void a(String str, int i, Exception exc, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), exc, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a1fa2932b099ebd81f325af1095fd6d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a1fa2932b099ebd81f325af1095fd6d9");
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (str.contains("/qdbpay/bindpay")) {
                com.meituan.android.pay.common.analyse.b.a("bindpay_fail", exc, str2);
                com.meituan.android.pay.common.analyse.b.a(str, "b_pay_bindpay_fail_sc", exc, str2);
            } else if (str.contains("/qdbpay/installmentpay")) {
                com.meituan.android.pay.common.analyse.b.a("installmentpay_fail", exc, str2);
                com.meituan.android.pay.common.analyse.b.a(str, "b_pay_installmentpay_fail_sc", exc, str2);
            } else if (str.contains("/qdbpay/privilegepay")) {
                com.meituan.android.pay.common.analyse.b.a("privilegepay_fail", exc, str2);
                com.meituan.android.pay.common.analyse.b.a(str, "b_pay_privilegepay_fail_sc", exc, str2);
            } else if (str.contains("/qdbpay/valuecardpay")) {
                com.meituan.android.pay.common.analyse.b.a("valuecardpay_fail", exc, str2);
                com.meituan.android.pay.common.analyse.b.a(str, "b_pay_valuecardpay_fail_sc", exc, str2);
            } else if (str.contains("/qdbpay/balancepay")) {
                com.meituan.android.pay.common.analyse.b.a("balancepay_fail", exc, str2);
                com.meituan.android.pay.common.analyse.b.a(str, "b_pay_balancepay_fail_sc", exc, str2);
            } else if (str.contains("/qdbdisplay/cashdesk")) {
                com.meituan.android.pay.common.analyse.b.a("cashdesk_fail", exc, str2);
                com.meituan.android.pay.common.analyse.b.a(str, "b_pay_cashdesk_fail_sc", exc, str2);
            } else if (str.contains("/qdbdisplay/mtpaycashier")) {
                com.meituan.android.pay.common.analyse.b.a("qdbdisplay_mtpaycashier_fail", exc, str2);
                com.meituan.android.pay.common.analyse.b.a(str, "b_pay_qdbdisplay_mtpaycashier_fail_sc", exc, str2);
            } else if (str.contains("/qdbpay/directpay")) {
                com.meituan.android.pay.common.analyse.b.a("directpay_fail", exc, str2);
                com.meituan.android.pay.common.analyse.b.a(str, "b_pay_directpay_fail_sc", exc, str2);
            }
        } catch (Exception e2) {
            com.meituan.android.paybase.common.analyse.a.a(e2, "PayActivityAnalyseUtils_reportException", (Map<String, Object>) null);
        }
    }

    public static void a(String str, int i, Object obj, Map<String, Object> map, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), obj, null, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2236442c54e131823fe0adc70f78114d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2236442c54e131823fe0adc70f78114d");
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (str.contains("/qdbpay/bindpay")) {
                com.meituan.android.pay.common.analyse.b.c("bindpay_succ", hashMap, str2);
                com.meituan.android.pay.common.analyse.b.c(str, "b_pay_bindpay_succ_sc", hashMap, str2);
            } else if (str.contains("/qdbpay/installmentpay")) {
                com.meituan.android.pay.common.analyse.b.c("installmentpay_succ", hashMap, str2);
                com.meituan.android.pay.common.analyse.b.c(str, "b_pay_installmentpay_succ_sc", hashMap, str2);
            } else if (str.contains("/qdbpay/privilegepay")) {
                com.meituan.android.pay.common.analyse.b.c("privilegepay_succ", hashMap, str2);
                com.meituan.android.pay.common.analyse.b.c(str, "b_pay_privilegepay_succ_sc", hashMap, str2);
            } else if (str.contains("/qdbpay/valuecardpay")) {
                com.meituan.android.pay.common.analyse.b.c("valuecardpay_succ", hashMap, str2);
                com.meituan.android.pay.common.analyse.b.c(str, "b_pay_valuecardpay_succ_sc", hashMap, str2);
            } else if (str.contains("/qdbpay/balancepay")) {
                com.meituan.android.pay.common.analyse.b.c("balancepay_succ", hashMap, str2);
                com.meituan.android.pay.common.analyse.b.c(str, "b_pay_balancepay_succ_sc", hashMap, str2);
            } else if (str.contains("/qdbdisplay/cashdesk")) {
                com.meituan.android.pay.common.analyse.b.c("cashdesk_succ", hashMap, str2);
                com.meituan.android.pay.common.analyse.b.c(str, "b_pay_cashdesk_succ_sc", hashMap, str2);
            } else if (str.contains("/qdbdisplay/mtpaycashier")) {
                com.meituan.android.pay.common.analyse.b.c("qdbdisplay_mtpaycashier_succ", hashMap, str2);
                com.meituan.android.pay.common.analyse.b.c(str, "b_pay_qdbdisplay_mtpaycashier_succ_sc", hashMap, str2);
            } else if (str.contains("/qdbpay/directpay")) {
                com.meituan.android.pay.common.analyse.b.c("directpay_succ", hashMap, str2);
                com.meituan.android.pay.common.analyse.b.c(str, "b_pay_directpay_succ_sc", hashMap, str2);
            }
        } catch (Exception e2) {
            com.meituan.android.paybase.common.analyse.a.a(e2, "PayActivityAnalyseUtils_reportSucc", (Map<String, Object>) null);
        }
    }

    public static void a(String str, Map<String, Object> map, String str2) {
        Object[] objArr = {str, null, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e5dddfc0eb9aa37ee0f09173b257fed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e5dddfc0eb9aa37ee0f09173b257fed");
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (str.contains("/qdbpay/bindpay")) {
                com.meituan.android.pay.common.analyse.b.a("bindpay_start", str2);
                com.meituan.android.pay.common.analyse.b.b(str, "b_pay_bindpay_start_sc", hashMap, str2);
            } else if (str.contains("/qdbpay/installmentpay")) {
                com.meituan.android.pay.common.analyse.b.a("installmentpay_start", str2);
                com.meituan.android.pay.common.analyse.b.b(str, "b_pay_installmentpay_start_sc", hashMap, str2);
            } else if (str.contains("/qdbpay/privilegepay")) {
                com.meituan.android.pay.common.analyse.b.a("privilegepay_start", str2);
                com.meituan.android.pay.common.analyse.b.b(str, "b_pay_privilegepay_start_sc", hashMap, str2);
            } else if (str.contains("/qdbpay/valuecardpay")) {
                com.meituan.android.pay.common.analyse.b.a("valuecardpay_start", str2);
                com.meituan.android.pay.common.analyse.b.b(str, "b_pay_valuecardpay_start_sc", hashMap, str2);
            } else if (str.contains("/qdbpay/balancepay")) {
                com.meituan.android.pay.common.analyse.b.a("balancepay_start", str2);
                com.meituan.android.pay.common.analyse.b.b(str, "b_pay_balancepay_start_sc", hashMap, str2);
            } else if (str.contains("/qdbdisplay/cashdesk")) {
                com.meituan.android.pay.common.analyse.b.a("cashdesk_start", str2);
                com.meituan.android.pay.common.analyse.b.b(str, "b_pay_cashdesk_start_sc", hashMap, str2);
            } else if (str.contains("/qdbdisplay/mtpaycashier")) {
                com.meituan.android.pay.common.analyse.b.a("qdbdisplay_mtpaycashier_start", str2);
                com.meituan.android.pay.common.analyse.b.b(str, "b_pay_qdbdisplay_mtpaycashier_start_sc", hashMap, str2);
            } else if (str.contains("/qdbpay/directpay")) {
                com.meituan.android.pay.common.analyse.b.a("directpay_start", str2);
                com.meituan.android.pay.common.analyse.b.b(str, "b_pay_directpay_start_sc", hashMap, str2);
            }
        } catch (Exception e2) {
            com.meituan.android.paybase.common.analyse.a.a(e2, "PayActivityAnalyseUtils_reportStart", (Map<String, Object>) null);
        }
    }

    private static void a(Activity activity, String str, String str2) {
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a00ba40cac596edc2b605777ccfe9a21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a00ba40cac596edc2b605777ccfe9a21");
            return;
        }
        HashMap hashMap = new HashMap();
        String b2 = com.meituan.android.pay.common.payment.utils.b.b(activity, "pay_type");
        String b3 = com.meituan.android.pay.common.payment.utils.b.b(activity, "verify_type");
        hashMap.put("pay_type", b2);
        hashMap.put("verify_type", b3);
        hashMap.put("mtpay_scene", com.meituan.android.pay.common.analyse.a.b);
        com.meituan.android.pay.common.analyse.b.b(str, hashMap, str2);
    }

    public static void b(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7d11f400935d1b1fe1a8a2dd43c0494a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7d11f400935d1b1fe1a8a2dd43c0494a");
        } else if (e) {
            e = false;
            String b2 = com.meituan.android.pay.common.payment.utils.b.b(activity, "cashier_type");
            String b3 = com.meituan.android.pay.common.payment.utils.b.b(activity, "nb_container");
            com.meituan.android.pay.common.analyse.b.c("standard_cashier_mt_pay_start_succ", new a.c().a(CommonConstant.File.CLASS, str).b, ak.a(activity));
            a.c a2 = new a.c().a(CommonConstant.File.CLASS, str);
            if (TextUtils.isEmpty(b2)) {
                b2 = "wallet";
            }
            a.c a3 = a2.a("cashier_type", b2);
            if (TextUtils.isEmpty(b3)) {
                b3 = "native";
            }
            com.meituan.android.pay.common.analyse.b.c("standard_cashier_mt_pay", "b_pay_standard_cashier_mt_pay_start_succ_sc", a3.a("nb_container", b3).b, ak.a(activity));
        }
    }

    public static void a(Activity activity, String str, JSONObject jSONObject) {
        Object[] objArr = {activity, str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0379c6bc181ee3beb9bc34575032a3b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0379c6bc181ee3beb9bc34575032a3b7");
        } else if (e) {
            e = false;
            String b2 = com.meituan.android.pay.common.payment.utils.b.b(activity, "cashier_type");
            String b3 = com.meituan.android.pay.common.payment.utils.b.b(activity, "nb_container");
            int optInt = jSONObject != null ? jSONObject.optInt("is_sla_action") : 0;
            int optInt2 = optInt == 1 ? jSONObject.optInt("dispatch_scene") : -999;
            long currentTimeMillis = optInt == 1 ? System.currentTimeMillis() - jSONObject.optLong("sla_start_time") : -999L;
            com.meituan.android.pay.common.analyse.b.c("standard_cashier_mt_pay_start_succ", new a.c().a(CommonConstant.File.CLASS, str).b, ak.a(activity));
            a.c a2 = new a.c().a(CommonConstant.File.CLASS, str).a("dispatch_scene", Integer.valueOf(optInt2)).a("duration", Long.valueOf(currentTimeMillis));
            if (TextUtils.isEmpty(b2)) {
                b2 = "wallet";
            }
            a.c a3 = a2.a("cashier_type", b2);
            if (TextUtils.isEmpty(b3)) {
                b3 = "native";
            }
            com.meituan.android.pay.common.analyse.b.c("standard_cashier_mt_pay", "b_pay_standard_cashier_mt_pay_start_succ_sc", a3.a("nb_container", b3).b, ak.a(activity));
        }
    }

    public static void b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7aa89235aeabc281371b87518fa125a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7aa89235aeabc281371b87518fa125a3");
            return;
        }
        String str = com.meituan.android.pay.common.analyse.a.b;
        String b2 = com.meituan.android.pay.common.payment.utils.b.b(activity, "launch_url");
        com.meituan.android.paybase.common.analyse.a.a("b_pay_q2r6i4y9_mc", new a.c().a("mtpay_scene", str).b);
        if (TextUtils.equals(b2, "/qdbsign/sign")) {
            com.meituan.android.paybase.common.analyse.a.a("b_pay_e903g932_mc", new a.c().a("mtpay_scene", str).b);
        } else if (TextUtils.equals(b2, "/qdbpay/directpay")) {
            com.meituan.android.paybase.common.analyse.a.a("b_pay_wd5g5ets_mc", new a.c().a("mtpay_scene", str).b);
        }
    }

    public static void c(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "66a49448494d54bf207e3c99699958b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "66a49448494d54bf207e3c99699958b8");
            return;
        }
        String str = com.meituan.android.pay.common.analyse.a.b;
        String b2 = com.meituan.android.pay.common.payment.utils.b.b(activity, "launch_url");
        if (TextUtils.equals("/qdbsign/sign", b2)) {
            HybridInfo e2 = g.e(activity);
            d.a(1180100, str, e2);
            if (d.a(e2)) {
                com.meituan.android.paybase.metrics.a.b("tti_contract_pay_hybrid_view", "start");
            } else {
                com.meituan.android.paybase.metrics.a.b("tti_contract_pay_native_view", "start");
            }
        }
        com.meituan.android.paybase.common.analyse.a.a("b_pay_0tv9vx6w_mc", new a.c().a("launchUrl", b2).a("mtpay_scene", str).b);
    }
}
