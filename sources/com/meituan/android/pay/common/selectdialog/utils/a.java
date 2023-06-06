package com.meituan.android.pay.common.selectdialog.utils;

import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.payment.data.g;
import com.meituan.android.pay.common.payment.utils.c;
import com.meituan.android.pay.common.payment.utils.d;
import com.meituan.android.pay.common.payment.utils.e;
import com.meituan.android.pay.common.selectdialog.b;
import com.meituan.android.pay.common.selectdialog.bean.InsertMTPayments;
import com.meituan.android.pay.common.selectdialog.bean.WalletPaymentListPage;
import com.meituan.android.pay.common.selectdialog.view.a;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    private static final String b = "binding";
    private static final String c = "unbinding";
    private static String d = null;
    private static boolean e = false;
    private static Map<String, String> f = new HashMap();
    private static String g = "0";
    private static String h = "1";

    public static void a(String str) {
        d = str;
    }

    public static int a(b bVar) {
        int i = 0;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ea7c7b6a71acb4021d41043b02e1ebc9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ea7c7b6a71acb4021d41043b02e1ebc9")).intValue();
        }
        if (bVar != null) {
            List<com.meituan.android.pay.common.payment.data.a> mtPaymentList = bVar.getMtPaymentList();
            if (!i.a((Collection) mtPaymentList)) {
                for (com.meituan.android.pay.common.payment.data.a aVar : mtPaymentList) {
                    if (g.b.contains(aVar.getPayType()) && aVar.getStatus() == 0) {
                        i++;
                    }
                }
            }
        }
        return i;
    }

    public static int b(b bVar) {
        int i = 0;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "519d0bd0112319eb8dfa53dba519eb58", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "519d0bd0112319eb8dfa53dba519eb58")).intValue();
        }
        if (bVar != null) {
            List<com.meituan.android.pay.common.payment.data.a> mtPaymentList = bVar.getMtPaymentList();
            if (!i.a((Collection) mtPaymentList)) {
                for (com.meituan.android.pay.common.payment.data.a aVar : mtPaymentList) {
                    if (g.b.contains(aVar.getPayType())) {
                        i++;
                    }
                }
            }
        }
        return i;
    }

    public static HashMap<String, Object> c(b bVar) {
        JsonObject jsonObject;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bc97830250ad65449bc09c3e62725415", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bc97830250ad65449bc09c3e62725415");
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("nb_version", com.meituan.android.paybase.config.a.d().q());
        hashMap.put("entry_page", !TextUtils.isEmpty(d) ? d : "-999");
        hashMap.put("tradeNo", !TextUtils.isEmpty(com.meituan.android.paybase.common.analyse.a.b) ? com.meituan.android.paybase.common.analyse.a.b : "-999");
        hashMap.put("trans_id", com.meituan.android.paybase.common.analyse.b.b);
        hashMap.put("bindedcard_num", Integer.valueOf(b(bVar)));
        JsonArray jsonArray = new JsonArray();
        for (com.meituan.android.pay.common.payment.data.a aVar : bVar.getMtPaymentList()) {
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7cea2b098bfcb63b2c60303ef080291e", RobustBitConfig.DEFAULT_VALUE)) {
                jsonObject = (JsonObject) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7cea2b098bfcb63b2c60303ef080291e");
            } else if (aVar == null || TextUtils.isEmpty(aVar.getName())) {
                jsonObject = null;
            } else {
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("bank_name", aVar.getName());
                jsonObject2.addProperty("status", Integer.valueOf(aVar.getStatus()));
                jsonObject2.addProperty("pay_type", aVar.getPayType());
                jsonObject2.addProperty("bank_type_id", aVar.getBankTypeId());
                jsonObject = jsonObject2;
            }
            if (jsonObject != null) {
                jsonArray.add(jsonObject);
            }
        }
        hashMap.put("bank_info", !TextUtils.isEmpty(jsonArray.toString()) ? jsonArray.toString() : "-999");
        com.meituan.android.paybase.common.analyse.b.a(hashMap);
        a(hashMap, bVar);
        hashMap.put("merchant_no", "-999");
        hashMap.put("open_source", "standardPayCashierSwitchCard");
        return hashMap;
    }

    private static void a(HashMap<String, Object> hashMap, b bVar) {
        boolean z;
        boolean z2 = false;
        Object[] objArr = {hashMap, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "85c419f246d4095363d8382b96df81d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "85c419f246d4095363d8382b96df81d1");
            return;
        }
        MTPayment mTPayment = null;
        for (com.meituan.android.pay.common.payment.data.a aVar : bVar.getMtPaymentList()) {
            if ((aVar instanceof MTPayment) && TextUtils.equals(aVar.getPayType(), "creditpay")) {
                mTPayment = (MTPayment) aVar;
            }
        }
        if (mTPayment != null) {
            Object[] objArr2 = {mTPayment};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "26c78a58bdc6a9d813b9d1d2e7dc30a6", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "26c78a58bdc6a9d813b9d1d2e7dc30a6")).booleanValue();
            } else {
                z = (mTPayment == null || mTPayment.getCreditPayOpenInfo() == null || TextUtils.isEmpty(mTPayment.getCreditPayOpenInfo().getUrl())) ? false : true;
            }
            hashMap.put("credit_style", z ? "1" : "0");
            Object[] objArr3 = {mTPayment};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "794a22c54b9611532616956ae6a21699", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "794a22c54b9611532616956ae6a21699")).booleanValue();
            } else if (mTPayment != null && mTPayment.isOpenCreditPay()) {
                z2 = true;
            }
            hashMap.put("mtcreditpay_status", z2 ? "1" : "0");
            return;
        }
        hashMap.put("credit_style", "-999");
        hashMap.put("mtcreditpay_status", "-999");
    }

    public static HashMap<String, Object> d(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1309345459297981fed2ad9e7e3c4095", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1309345459297981fed2ad9e7e3c4095");
        }
        if (bVar == null) {
            return new HashMap<>();
        }
        return new a.c().a("nb_version", com.meituan.android.paybase.config.a.d().q()).a("tradeNo", com.meituan.android.paybase.common.analyse.a.b).a("bindStatus", d.a(bVar) ? b : c).b;
    }

    private static HashMap<String, Object> b(ArrayList<Object> arrayList) {
        boolean z = true;
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "073376a3c04bce4830697b9656a59317", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "073376a3c04bce4830697b9656a59317");
        }
        if (!i.a((Collection) arrayList)) {
            a.c a2 = new a.c().a("nb_version", com.meituan.android.paybase.config.a.d().q()).a("tradeNo", com.meituan.android.paybase.common.analyse.a.b);
            Object[] objArr2 = {arrayList};
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "32556d66423276164acc8860dd25841d", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "32556d66423276164acc8860dd25841d")).booleanValue();
            } else {
                if (!i.a((Collection) arrayList)) {
                    for (Object obj : arrayList) {
                        if (obj instanceof com.meituan.android.pay.common.payment.data.a) {
                            com.meituan.android.pay.common.payment.data.a aVar = (com.meituan.android.pay.common.payment.data.a) obj;
                            if (TextUtils.equals(aVar.getPayType(), "quickbank") || TextUtils.equals(aVar.getPayType(), "foreigncardpay")) {
                                break;
                            }
                        }
                    }
                }
                z = false;
            }
            return a2.a("bindStatus", z ? b : c).b;
        }
        return new HashMap<>();
    }

    public static HashMap<String, Object> a(b bVar, com.meituan.android.pay.common.payment.data.a aVar) {
        Object[] objArr = {bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "99318e55950f4f88be53b33613f11d46", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "99318e55950f4f88be53b33613f11d46");
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("nb_version", com.meituan.android.paybase.config.a.d().q());
        hashMap.put("entry_page", d);
        hashMap.put("tradeNo", com.meituan.android.paybase.common.analyse.a.b);
        hashMap.put("trans_id", com.meituan.android.paybase.common.analyse.b.b);
        hashMap.put("bindedcard_num", Integer.valueOf(b(bVar)));
        hashMap.put("bank_name", aVar.getName());
        hashMap.put("status", Integer.valueOf(aVar.getStatus()));
        hashMap.put("pay_type", aVar.getPayType());
        return hashMap;
    }

    public static void e(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df43d70c00aebfb99266259e9b2b11b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df43d70c00aebfb99266259e9b2b11b1");
        } else if (bVar instanceof WalletPaymentListPage) {
            List<com.meituan.android.pay.common.payment.data.a> mtPaymentList = ((WalletPaymentListPage) bVar).getMtPaymentList();
            if (i.a((Collection) mtPaymentList)) {
                return;
            }
            for (com.meituan.android.pay.common.payment.data.a aVar : mtPaymentList) {
                if (aVar instanceof MTPayment) {
                    MTPayment mTPayment = (MTPayment) aVar;
                    if (c.e(mTPayment.getPayType())) {
                        com.meituan.android.paybase.common.analyse.a.a("b_pay_5ltxgih8_mv", new a.c().a("show_periods", mTPayment.getInstallment() != null ? mTPayment.getInstallment().getAllPeriods() : "不支持分期").a("is_support_period", Integer.valueOf(mTPayment.getIsSupportInstallment())).b);
                    }
                }
            }
        }
    }

    public static void a(com.meituan.android.pay.common.payment.data.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7329c0b5a629a971f22b978cad516f9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7329c0b5a629a971f22b978cad516f9e");
        } else if (aVar instanceof MTPayment) {
            MTPayment mTPayment = (MTPayment) aVar;
            if (c.e(mTPayment.getPayType())) {
                com.meituan.android.paybase.common.analyse.a.a("b_pay_2kk9tnet_mc", new a.c().a("choose_period", Integer.valueOf(e.c(mTPayment))).b);
            }
        }
    }

    public static void a(int i, com.meituan.android.pay.common.selectdialog.view.a aVar) {
        String str;
        Object[] objArr = {Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "582f8f9be066b61dd23fbd807b886d95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "582f8f9be066b61dd23fbd807b886d95");
            return;
        }
        Object item = aVar.getItem(i);
        if (item instanceof com.meituan.android.pay.common.payment.data.a) {
            com.meituan.android.pay.common.payment.data.a aVar2 = (com.meituan.android.pay.common.payment.data.a) item;
            String bankTypeId = aVar2.getBankTypeId();
            if (c.i(aVar2.getPayType()) && TextUtils.equals(g, f.get(bankTypeId))) {
                f.put(bankTypeId, h);
                a.c a2 = new a.c().a("tradeNo", !TextUtils.isEmpty(com.meituan.android.paybase.common.analyse.a.b) ? com.meituan.android.paybase.common.analyse.a.b : "-999").a("nb_version", com.meituan.android.paybase.config.a.d().q());
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6d33e0ac0637083d3dd0ed6022dcebba", RobustBitConfig.DEFAULT_VALUE)) {
                    str = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6d33e0ac0637083d3dd0ed6022dcebba");
                } else if (aVar2 == null || TextUtils.isEmpty(aVar2.getName())) {
                    str = null;
                } else {
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.addProperty("pay_type", !TextUtils.isEmpty(aVar2.getPayType()) ? aVar2.getPayType() : "-999");
                    jsonObject.addProperty("bank_type_id", !TextUtils.isEmpty(aVar2.getBankTypeId()) ? aVar2.getBankTypeId() : "-999");
                    str = jsonObject.toString();
                }
                com.meituan.android.paybase.common.analyse.a.a("b_pay_0z6bsyv2_mv", (String) null, a2.a("bank_info", str).b, a.EnumC0329a.VIEW, -1);
            }
        }
    }

    public static void a(int i, com.meituan.android.pay.common.selectdialog.view.a aVar, ArrayList<Object> arrayList) {
        Object[] objArr = {Integer.valueOf(i), aVar, arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ba636a92862bc5783bf41d8a736d785", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ba636a92862bc5783bf41d8a736d785");
        } else if (a.c.INSERT_MORE.ordinal() != aVar.getItemViewType(i) || e) {
        } else {
            com.meituan.android.paybase.common.analyse.a.a("b_pay_bg4v0a35_mv", (String) null, b(arrayList), a.EnumC0329a.VIEW, -1);
            e = true;
        }
    }

    public static void a(ArrayList<Object> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "304f76ccfcdf43db8ebf1448c66edfef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "304f76ccfcdf43db8ebf1448c66edfef");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6357273b1f872a83c9f908fe0c850fad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6357273b1f872a83c9f908fe0c850fad");
        } else {
            if (f != null) {
                f.clear();
            }
            e = false;
        }
        if (i.a((Collection) arrayList)) {
            return;
        }
        Iterator<Object> it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof InsertMTPayments) {
                List<com.meituan.android.pay.common.payment.data.a> mtMorePaymentList = ((InsertMTPayments) next).getMtMorePaymentList();
                if (!i.a((Collection) mtMorePaymentList)) {
                    for (com.meituan.android.pay.common.payment.data.a aVar : mtMorePaymentList) {
                        if (f != null) {
                            f.put(aVar.getBankTypeId(), g);
                        }
                    }
                }
            }
        }
    }
}
