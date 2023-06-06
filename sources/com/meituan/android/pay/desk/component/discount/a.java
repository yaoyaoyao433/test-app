package com.meituan.android.pay.desk.component.discount;

import android.app.Activity;
import android.text.TextUtils;
import com.meituan.android.pay.common.payment.data.c;
import com.meituan.android.pay.common.payment.utils.b;
import com.meituan.android.pay.common.promotion.bean.CombineLabel;
import com.meituan.android.pay.common.promotion.bean.LabelAbTest;
import com.meituan.android.pay.common.promotion.bean.LabelSwitch;
import com.meituan.android.pay.common.promotion.bean.PayLabel;
import com.meituan.android.pay.common.promotion.bean.PayLabelConstants;
import com.meituan.android.pay.common.selectdialog.bean.MtPaymentListPage;
import com.meituan.android.pay.desk.component.bean.standardcomponent.BalanceCombinePayment;
import com.meituan.android.pay.desk.component.bean.standardcomponent.CashDesk;
import com.meituan.android.pay.desk.component.bean.standardcomponent.HelloPayTransInfo;
import com.meituan.android.pay.desk.component.data.DeskData;
import com.meituan.android.paybase.utils.d;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static List<CombineLabel> a(c cVar, com.meituan.android.pay.common.payment.data.a aVar) {
        Object[] objArr = {cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "86f376cd2ddcc781424248a9f0a7531f", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "86f376cd2ddcc781424248a9f0a7531f");
        }
        if (aVar != null) {
            return aVar.getLabels();
        }
        if (cVar instanceof CashDesk) {
            CashDesk cashDesk = (CashDesk) cVar;
            if (!i.a((Collection) cashDesk.getBalanceCombineDetailList())) {
                BalanceCombinePayment a2 = a(cashDesk);
                if (a2 != null) {
                    return a2.getLabels();
                }
                return null;
            } else if (cashDesk.getTransInfo() != null) {
                return cashDesk.getTransInfo().getLabels();
            } else {
                return null;
            }
        }
        return null;
    }

    public static boolean a(DeskData deskData) {
        LabelAbTest labelAbTest;
        Object[] objArr = {deskData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d581c9480064a2de680fd446a3cfe2f0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d581c9480064a2de680fd446a3cfe2f0")).booleanValue();
        }
        if (deskData == null || !(deskData.getDesk() instanceof CashDesk) || (labelAbTest = ((CashDesk) deskData.getDesk()).getLabelAbTest()) == null) {
            return false;
        }
        return labelAbTest.isSaveMoneyStyle();
    }

    public static boolean b(DeskData deskData) {
        Object[] objArr = {deskData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6df0772a52813f82068d1bb66aed6e9e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6df0772a52813f82068d1bb66aed6e9e")).booleanValue();
        }
        int g = com.meituan.android.pay.common.promotion.utils.a.g(a(deskData.getDesk(), deskData.getSelectPayment()));
        return g == 1 || g == 3;
    }

    public static float a(c cVar, float f, com.meituan.android.pay.common.payment.data.a aVar) {
        Object[] objArr = {cVar, Float.valueOf(f), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "20723c88ca2b66891f80952d7047b203", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "20723c88ca2b66891f80952d7047b203")).floatValue();
        }
        if (cVar != null) {
            f = d.b(Float.valueOf(f), b(cVar, aVar)).floatValue();
        }
        if (d.c(Float.valueOf(f), Double.valueOf(0.01d)) < 0) {
            return 0.01f;
        }
        return f;
    }

    private static BigDecimal b(c cVar, com.meituan.android.pay.common.payment.data.a aVar) {
        Object[] objArr = {cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "54fe7b79feec15384c831a9bb3d2e246", RobustBitConfig.DEFAULT_VALUE)) {
            return (BigDecimal) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "54fe7b79feec15384c831a9bb3d2e246");
        }
        BigDecimal a2 = d.a("0.00");
        if (aVar != null) {
            return com.meituan.android.pay.common.promotion.utils.a.d(aVar.getLabels());
        }
        if (cVar instanceof CashDesk) {
            CashDesk cashDesk = (CashDesk) cVar;
            return cashDesk.getTransInfo() != null ? com.meituan.android.pay.common.promotion.utils.a.d(cashDesk.getTransInfo().getLabels()) : a2;
        }
        return a2;
    }

    public static BigDecimal a(c cVar, com.meituan.android.pay.common.payment.data.a aVar, boolean z) {
        Object[] objArr = {cVar, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a0bc1e3afa9aaa59de725b94ee0babfb", RobustBitConfig.DEFAULT_VALUE)) {
            return (BigDecimal) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a0bc1e3afa9aaa59de725b94ee0babfb");
        }
        BigDecimal a2 = d.a("0.00");
        if (aVar != null) {
            return com.meituan.android.pay.common.promotion.utils.a.a(aVar.getLabels(), z);
        }
        if (cVar instanceof CashDesk) {
            CashDesk cashDesk = (CashDesk) cVar;
            return cashDesk.getTransInfo() != null ? com.meituan.android.pay.common.promotion.utils.a.a(cashDesk.getTransInfo().getLabels(), z) : a2;
        }
        return a2;
    }

    private static ArrayList<CombineLabel> a(c cVar, String str) {
        Object[] objArr = {cVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b9ac081ba7debd23a060fb11d5f7c86", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b9ac081ba7debd23a060fb11d5f7c86");
        }
        if (cVar instanceof CashDesk) {
            CashDesk cashDesk = (CashDesk) cVar;
            if (!i.a((Collection) cashDesk.getBalanceCombineDetailList())) {
                for (BalanceCombinePayment balanceCombinePayment : cashDesk.getBalanceCombineDetailList()) {
                    if (balanceCombinePayment != null && TextUtils.equals(str, balanceCombinePayment.getPayType())) {
                        return com.meituan.android.pay.common.promotion.utils.a.b(balanceCombinePayment.getLabels());
                    }
                }
            } else if (cashDesk.getMtPaymentListPage() != null) {
                List<com.meituan.android.pay.common.payment.data.a> mtPaymentList = cashDesk.getMtPaymentListPage().getMtPaymentList();
                Object[] objArr2 = {mtPaymentList, str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "10c3ec08a27c4bb8f6f5f27b242c1049", RobustBitConfig.DEFAULT_VALUE)) {
                    return (ArrayList) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "10c3ec08a27c4bb8f6f5f27b242c1049");
                }
                if (!i.a((Collection) mtPaymentList)) {
                    for (com.meituan.android.pay.common.payment.data.a aVar : mtPaymentList) {
                        if (aVar != null && TextUtils.equals(str, aVar.getPayType())) {
                            return com.meituan.android.pay.common.promotion.utils.a.b(aVar.getLabels());
                        }
                    }
                }
                return null;
            } else {
                HelloPayTransInfo transInfo = cashDesk.getTransInfo();
                if (transInfo != null) {
                    return com.meituan.android.pay.common.promotion.utils.a.b(transInfo.getLabels());
                }
            }
        }
        return null;
    }

    private static ArrayList<CombineLabel> b(c cVar, String str) {
        Object[] objArr = {cVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c4928ca0ad27f0e522dc954d3eee43af", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c4928ca0ad27f0e522dc954d3eee43af");
        }
        if (cVar instanceof CashDesk) {
            CashDesk cashDesk = (CashDesk) cVar;
            List<BalanceCombinePayment> balanceCombineDetailList = cashDesk.getBalanceCombineDetailList();
            if (!i.a((Collection) balanceCombineDetailList)) {
                for (BalanceCombinePayment balanceCombinePayment : balanceCombineDetailList) {
                    if (balanceCombinePayment != null && balanceCombinePayment.getCardInfo() != null && TextUtils.equals(balanceCombinePayment.getCardInfo().getBankCard(), str)) {
                        return com.meituan.android.pay.common.promotion.utils.a.b(balanceCombinePayment.getLabels());
                    }
                }
            } else {
                MtPaymentListPage mtPaymentListPage = cashDesk.getMtPaymentListPage();
                if (mtPaymentListPage != null) {
                    List<com.meituan.android.pay.common.payment.data.a> mtPaymentList = mtPaymentListPage.getMtPaymentList();
                    Object[] objArr2 = {mtPaymentList, str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "148942c2c83ce99cf18cb62faa5ef57f", RobustBitConfig.DEFAULT_VALUE)) {
                        return (ArrayList) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "148942c2c83ce99cf18cb62faa5ef57f");
                    }
                    if (!i.a((Collection) mtPaymentList)) {
                        for (com.meituan.android.pay.common.payment.data.a aVar : mtPaymentList) {
                            if (aVar != null && aVar.getCardInfo() != null && TextUtils.equals(aVar.getCardInfo().getBankCard(), str)) {
                                return com.meituan.android.pay.common.promotion.utils.a.b(aVar.getLabels());
                            }
                        }
                    }
                    return null;
                }
            }
        }
        return null;
    }

    public static BigDecimal a(float f, c cVar, com.meituan.android.pay.common.payment.data.a aVar) {
        BigDecimal a2;
        Object[] objArr = {Float.valueOf(f), cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d71b64dc0a82aa065979953ac3ad76e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (BigDecimal) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d71b64dc0a82aa065979953ac3ad76e7");
        }
        BigDecimal a3 = d.a((Number) 0);
        Object[] objArr2 = {cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "cf686760e93eee61b71e6949307ef9d1", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (BigDecimal) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "cf686760e93eee61b71e6949307ef9d1");
        } else {
            a2 = d.a("0.00");
            if (cVar != null) {
                a2 = b(cVar, aVar);
            }
        }
        return ((aVar instanceof BalanceCombinePayment) && (cVar instanceof CashDesk)) ? com.meituan.android.pay.desk.payment.discount.a.a(((CashDesk) cVar).getPrice(), f, a2) : a3;
    }

    public static BalanceCombinePayment a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        BalanceCombinePayment balanceCombinePayment = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9028d7db13e5c47fbfb591ac48728d25", RobustBitConfig.DEFAULT_VALUE)) {
            return (BalanceCombinePayment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9028d7db13e5c47fbfb591ac48728d25");
        }
        if (cVar instanceof CashDesk) {
            CashDesk cashDesk = (CashDesk) cVar;
            if (!i.a((Collection) cashDesk.getBalanceCombineDetailList()) && cashDesk.getBalanceCombineDetailList().size() == 2) {
                for (BalanceCombinePayment balanceCombinePayment2 : cashDesk.getBalanceCombineDetailList()) {
                    if (!com.meituan.android.pay.common.payment.utils.c.a(balanceCombinePayment2.getPayType())) {
                        balanceCombinePayment = balanceCombinePayment2;
                    }
                }
            }
        }
        return balanceCombinePayment;
    }

    public static void a(Activity activity, c cVar) {
        JSONArray jSONArray;
        ArrayList<CombineLabel> arrayList;
        Object[] objArr = {activity, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2747f053c43b9bd7ab711a3dd41de743", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2747f053c43b9bd7ab711a3dd41de743");
        } else if (cVar != null) {
            String b = b.b(activity, "transmission_param");
            if (TextUtils.isEmpty(b)) {
                arrayList = null;
                jSONArray = null;
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(b);
                    String string = jSONObject.getString("pay_type");
                    jSONArray = jSONObject.getJSONArray(PayLabelConstants.KEY_LABEL_STATUS);
                    try {
                        Object[] objArr2 = {string};
                        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.pay.common.payment.utils.c.a;
                        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "939d959c5fca572e90b7be369f9f5922", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "939d959c5fca572e90b7be369f9f5922")).booleanValue() : TextUtils.equals("quickbank", string)) {
                            arrayList = b(cVar, jSONObject.getString("bank_card"));
                        } else {
                            arrayList = a(cVar, string);
                        }
                    } catch (JSONException e) {
                        e = e;
                        com.meituan.android.paybase.common.analyse.a.a(e, "DiscountMtUtils_initCombineLabelCheckStatus", (Map<String, Object>) null);
                        arrayList = null;
                        a(arrayList, jSONArray);
                    }
                } catch (JSONException e2) {
                    e = e2;
                    jSONArray = null;
                }
            }
            a(arrayList, jSONArray);
        }
    }

    private static void a(ArrayList<CombineLabel> arrayList, JSONArray jSONArray) {
        CombineLabel next;
        Object[] objArr = {arrayList, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4136aaa4fba9e922f342bf807305e604", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4136aaa4fba9e922f342bf807305e604");
        } else if (!i.a((Collection) arrayList)) {
            Iterator<CombineLabel> it = arrayList.iterator();
            while (it.hasNext() && (next = it.next()) != null && jSONArray != null) {
                List<PayLabel> childrenLabel = next.getChildrenLabel();
                if (!i.a((Collection) childrenLabel)) {
                    for (PayLabel payLabel : childrenLabel) {
                        if (payLabel != null && payLabel.getLabelSwitch() != null) {
                            LabelSwitch labelSwitch = payLabel.getLabelSwitch();
                            int i = 0;
                            while (true) {
                                if (i >= jSONArray.length()) {
                                    break;
                                }
                                try {
                                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                                    if (labelSwitch != null && TextUtils.equals(payLabel.getLabelCode(), jSONObject.getString("code"))) {
                                        labelSwitch.setCheck(jSONObject.getInt(PayLabelConstants.KEY_LABEL_CHECK));
                                        break;
                                    }
                                } catch (JSONException e) {
                                    com.meituan.android.paybase.common.analyse.a.a(e, "DiscountMtUtils_updateCombineLabelCheckStatus", (Map<String, Object>) null);
                                }
                                i++;
                            }
                            payLabel.setLabelSwitch(labelSwitch);
                        }
                    }
                }
            }
        }
    }
}
