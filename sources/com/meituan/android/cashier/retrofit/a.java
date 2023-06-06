package com.meituan.android.cashier.retrofit;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.android.cashier.model.bean.Cashier;
import com.meituan.android.cashier.model.bean.CashierPayment;
import com.meituan.android.cashier.model.params.PayParams;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.neohybrid.util.k;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.payment.data.d;
import com.meituan.android.pay.common.payment.utils.c;
import com.meituan.android.pay.common.selectdialog.bean.WalletPaymentListPage;
import com.meituan.android.pay.desk.payment.bean.standarddesk.WalletPayment;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    @MTPaySuppressFBWarnings({"UWF_UNWRITTEN_PUBLIC_OR_PROTECTED_FIELD"})
    public static HashMap<String, String> a(PayParams payParams) {
        Object[] objArr = {payParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bfddedfddf23815cdf7ceac1dffe6bc5", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bfddedfddf23815cdf7ceac1dffe6bc5");
        }
        if (payParams == null) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("tradeno", payParams.tradeNo);
        hashMap.put("pay_token", payParams.payToken);
        hashMap.put("from_mt_cashier", "1");
        hashMap.put("cashier_type", payParams.cashierType);
        hashMap.put("money_changed", String.valueOf(payParams.moneyChanged));
        hashMap.put("from_select_bankcard", String.valueOf(payParams.fromSelectBankCard));
        if (!TextUtils.isEmpty(payParams.openWithholdInfoBefore)) {
            hashMap.put("openWithholdInfoBefore", payParams.openWithholdInfoBefore);
        }
        if (!i.a(payParams.walletPayParams)) {
            hashMap.putAll(payParams.walletPayParams);
        }
        a(hashMap);
        return hashMap;
    }

    @MTPaySuppressFBWarnings({"UWF_UNWRITTEN_PUBLIC_OR_PROTECTED_FIELD"})
    public static HashMap<String, String> a(PayParams payParams, String str) {
        Object[] objArr = {payParams, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "46ed79cdffa9f9caa608b4e0c044612a", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "46ed79cdffa9f9caa608b4e0c044612a");
        }
        if (payParams == null) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("tradeno", payParams.tradeNo);
        hashMap.put("pay_token", payParams.payToken);
        hashMap.put("pay_type", payParams.payType);
        if (!TextUtils.isEmpty(payParams.campaignId)) {
            hashMap.put("campaign_id", payParams.campaignId);
        }
        if (!TextUtils.isEmpty(payParams.couponCode)) {
            hashMap.put("cashticket_code", payParams.couponCode);
        }
        if (!TextUtils.isEmpty(payParams.upsepayType)) {
            hashMap.put("upsepay_type", payParams.upsepayType);
        }
        if (!TextUtils.isEmpty(payParams.tokenId)) {
            hashMap.put("token_id", payParams.tokenId);
        }
        if (!TextUtils.isEmpty(payParams.verifyPayType)) {
            hashMap.put("verify_pay_type", payParams.verifyPayType);
        }
        if (!TextUtils.isEmpty(payParams.verifyPayOrderId)) {
            hashMap.put("verify_pay_order_id", payParams.verifyPayOrderId);
        }
        if (!TextUtils.isEmpty(payParams.verifyType)) {
            hashMap.put("verify_type", payParams.verifyType);
        }
        if (!TextUtils.isEmpty(payParams.verifyResult)) {
            hashMap.put("verify_result", payParams.verifyResult);
        }
        if (!TextUtils.isEmpty(payParams.verifyToken)) {
            hashMap.put("verify_token", payParams.verifyToken);
        }
        return hashMap;
    }

    @MTPaySuppressFBWarnings({"UWF_UNWRITTEN_PUBLIC_OR_PROTECTED_FIELD"})
    public static PayParams a(Cashier cashier, String str, String str2) {
        Object[] objArr = {cashier, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5d1a48a914b1193d7f4a2a5dc5ad07e6", RobustBitConfig.DEFAULT_VALUE)) {
            return (PayParams) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5d1a48a914b1193d7f4a2a5dc5ad07e6");
        }
        PayParams payParams = new PayParams();
        payParams.tradeNo = str;
        payParams.payToken = str2;
        payParams.cashierType = b(cashier);
        return payParams;
    }

    public static WalletPayment a(Cashier cashier) {
        Object[] objArr = {cashier};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f2d67943452a1d7ca939e1e58025bc3c", RobustBitConfig.DEFAULT_VALUE)) {
            return (WalletPayment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f2d67943452a1d7ca939e1e58025bc3c");
        }
        if (cashier == null) {
            return null;
        }
        List<CashierPayment> paymentDataList = cashier.getPaymentDataList();
        if (i.a((Collection) paymentDataList)) {
            return null;
        }
        for (int i = 0; i < paymentDataList.size(); i++) {
            CashierPayment cashierPayment = paymentDataList.get(i);
            if (cashierPayment != null && c.b(cashierPayment.getPayType())) {
                return cashierPayment;
            }
        }
        return null;
    }

    public static boolean a(WalletPayment walletPayment, d dVar) {
        Object[] objArr = {walletPayment, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "277c94a43de636f837184e96679e6c21", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "277c94a43de636f837184e96679e6c21")).booleanValue();
        }
        if (dVar == null) {
            return false;
        }
        if (TextUtils.equals("creditpay", dVar.getPayType())) {
            return true;
        }
        if (walletPayment != null) {
            String payType = dVar.getPayType();
            if (a(walletPayment.getRecommendPayment(), payType)) {
                return true;
            }
            WalletPaymentListPage walletPaymentListPage = walletPayment.getWalletPaymentListPage();
            if (walletPaymentListPage != null) {
                if (a(walletPaymentListPage.getMtPaymentList(), payType)) {
                    return true;
                }
                for (com.meituan.android.pay.common.selectdialog.a aVar : walletPaymentListPage.getInsertPaymentsList()) {
                    if (a(aVar.getMtMorePaymentList(), payType)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean a(List list, String str) {
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3c6b442bd5992a6628d61e066de6c756", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3c6b442bd5992a6628d61e066de6c756")).booleanValue();
        }
        if (i.a((Collection) list) || TextUtils.isEmpty(str)) {
            return false;
        }
        for (Object obj : list) {
            if (obj instanceof MTPayment) {
                if (TextUtils.equals(((MTPayment) obj).getPayType(), str)) {
                    return true;
                }
            } else if ((obj instanceof com.meituan.android.pay.common.payment.data.a) && TextUtils.equals(((com.meituan.android.pay.common.payment.data.a) obj).getPayType(), str)) {
                return true;
            }
        }
        return false;
    }

    public static String b(Cashier cashier) {
        Object[] objArr = {cashier};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a3ec62db5b030c4f710784f925898c97", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a3ec62db5b030c4f710784f925898c97");
        }
        List<CashierPayment> paymentDataList = cashier.getPaymentDataList();
        if (i.a((Collection) paymentDataList)) {
            return "common";
        }
        for (int i = 0; i < paymentDataList.size(); i++) {
            if (c.b(paymentDataList.get(i).getPayType())) {
                return "wallet";
            }
        }
        return "common";
    }

    public static MTPayment c(Cashier cashier) {
        Object[] objArr = {cashier};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d140f8888465d4c86c0af184d6f67c40", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTPayment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d140f8888465d4c86c0af184d6f67c40");
        }
        WalletPayment a2 = a(cashier);
        if (a2 == null) {
            return null;
        }
        List<MTPayment> recommendPayment = a2.getRecommendPayment();
        if (i.a((Collection) recommendPayment)) {
            return null;
        }
        for (MTPayment mTPayment : recommendPayment) {
            if (mTPayment.isSelected()) {
                return mTPayment;
            }
        }
        return null;
    }

    public static void b(PayParams payParams, String str) {
        Object[] objArr = {payParams, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e0da4a49cebf39c565cee19028a1006d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e0da4a49cebf39c565cee19028a1006d");
        } else {
            payParams.walletPayParams = a(payParams.walletPayParams, str);
        }
    }

    public static String a(String str, String str2, String str3) {
        JSONObject jSONObject;
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1586911d637b47ab4ecc785b0136941f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1586911d637b47ab4ecc785b0136941f");
        }
        if (TextUtils.isEmpty(str)) {
            jSONObject = new JSONObject();
        } else {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException e) {
                jSONObject = new JSONObject();
                com.meituan.android.paybase.common.analyse.cat.a.a(a("extendPayExtendParams"), "payExtendParamStr 解析错误");
                com.meituan.android.paybase.common.analyse.a.a(e, a("extendPayExtendParams"), (Map<String, Object>) null);
            }
        }
        try {
            jSONObject.put(str2, str3);
        } catch (JSONException e2) {
            com.meituan.android.paybase.common.analyse.a.a(e2, a("extendPayExtendParams"), (Map<String, Object>) null);
            com.meituan.android.paybase.common.analyse.cat.a.a(a("extendPayExtendParams"), "put 错误");
        }
        return jSONObject.toString();
    }

    public static Map<String, String> a(Map<String, String> map, String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "31f56d54357856520ea5054b993bb456", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "31f56d54357856520ea5054b993bb456");
        }
        if (map == null) {
            map = new HashMap<>();
        }
        if (i.a(map)) {
            jSONObject2 = new JSONObject();
        } else {
            String str2 = map.get("payExtendParams");
            if (TextUtils.isEmpty(str2)) {
                jSONObject2 = new JSONObject();
            } else {
                try {
                    jSONObject = new JSONObject(str2);
                } catch (JSONException e) {
                    jSONObject = new JSONObject();
                    com.meituan.android.paybase.common.analyse.cat.a.a(a("appendGuidePlans"), "payExtendParamStr 解析错误");
                    com.meituan.android.paybase.common.analyse.a.a(e, a("appendGuidePlans"), (Map<String, Object>) null);
                }
                jSONObject2 = jSONObject;
            }
        }
        try {
            jSONObject2.put("guide_plan_infos", str);
        } catch (JSONException e2) {
            com.meituan.android.paybase.common.analyse.a.a(e2, a("appendGuidePlans"), (Map<String, Object>) null);
            com.meituan.android.paybase.common.analyse.cat.a.a(a("appendGuidePlans"), "put 错误");
        }
        map.put("payExtendParams", jSONObject2.toString());
        return map;
    }

    private static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c779ab183341a4cbbeb4f576b8fc393", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c779ab183341a4cbbeb4f576b8fc393");
        }
        return "CashierRequestUtils_" + str;
    }

    public static void a(Map<String, String> map, String str, String str2) {
        Object[] objArr = {map, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ee9169ff4155f3bf858812e27e86082d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ee9169ff4155f3bf858812e27e86082d");
        } else if (map == null) {
        } else {
            b(map, str2);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("guideRequestNo", str);
                b(map, jSONObject.toString());
            } catch (JSONException e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "CashierRequestUtils_setGoHelloPayExtParamToParams", (Map<String, Object>) null);
            }
        }
    }

    private static void b(Map<String, String> map, String str) {
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e8d4d61bdf31d6c221499820844a090", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e8d4d61bdf31d6c221499820844a090");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            String str2 = map.get("ext_param");
            if (TextUtils.isEmpty(str2)) {
                map.put("ext_param", str);
                return;
            }
            try {
                map.put("ext_param", a(new JSONObject(str2), new JSONObject(str)));
            } catch (JSONException e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "CashierRequestUtils_appendToExtParams", (Map<String, Object>) null);
            }
        }
    }

    private static String a(JSONObject jSONObject, JSONObject jSONObject2) {
        Object[] objArr = {jSONObject, jSONObject2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf07ddce627d29e6cfe48db76dd7ae0d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf07ddce627d29e6cfe48db76dd7ae0d");
        }
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                jSONObject.put(next, jSONObject2.get(next));
            } catch (JSONException e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "CashierRequestUtils_mergeJSONObject", (Map<String, Object>) null);
            }
        }
        return jSONObject.toString();
    }

    private static void a(HashMap<String, String> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "998f64f9c1d50cf0da4af93e4d550e77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "998f64f9c1d50cf0da4af93e4d550e77");
        } else if (hashMap.containsKey("ext_dim_stat")) {
            try {
                hashMap.put("ext_dim_stat", a(new JSONObject(hashMap.get("ext_dim_stat"))));
            } catch (JSONException e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "putExtDimStat", (Map<String, Object>) null);
            }
        } else {
            hashMap.put("ext_dim_stat", a(new JSONObject()));
        }
    }

    private static String a(JSONObject jSONObject) {
        boolean contains;
        boolean z = true;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90ed58c6a2f4c3e443ede9ce5a2f41d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90ed58c6a2f4c3e443ede9ce5a2f41d5");
        }
        try {
            Context context = com.meituan.android.paycommon.lib.config.a.a().a;
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = k.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fde993fb199e5b02dcb44e17c846bf2c", RobustBitConfig.DEFAULT_VALUE)) {
                contains = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fde993fb199e5b02dcb44e17c846bf2c")).booleanValue();
            } else {
                if (context != null) {
                    HashSet hashSet = new HashSet();
                    hashSet.add("4G");
                    hashSet.add("5G");
                    hashSet.add("WIFI");
                    Object[] objArr3 = {context, hashSet};
                    ChangeQuickRedirect changeQuickRedirect3 = k.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "3185b387291b00795c5d7ad92dc897fe", RobustBitConfig.DEFAULT_VALUE)) {
                        contains = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "3185b387291b00795c5d7ad92dc897fe")).booleanValue();
                    } else if (context != null && !hashSet.isEmpty()) {
                        contains = hashSet.contains(AppUtil.getNetWorkType(context));
                    }
                }
                contains = false;
            }
            jSONObject.put("good_network", contains);
            int i = Build.VERSION.SDK_INT;
            if (i == 24 || i == 25) {
                z = false;
            }
            jSONObject.put("sys_version_available", z);
        } catch (JSONException e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "getEnvData", (Map<String, Object>) null);
        }
        return jSONObject.toString();
    }
}
