package com.meituan.android.pay.utils;

import android.app.Activity;
import android.text.TextUtils;
import com.meituan.android.pay.common.payment.bean.installment.Period;
import com.meituan.android.pay.common.payment.bean.installment.PeriodCoupon;
import com.meituan.android.pay.common.promotion.bean.CombineLabel;
import com.meituan.android.pay.common.promotion.bean.PayLabel;
import com.meituan.android.pay.common.promotion.bean.PayLabelConstants;
import com.meituan.android.pay.desk.component.bean.standardcomponent.CashDesk;
import com.meituan.android.pay.desk.component.bean.standardcomponent.HelloPayTransInfo;
import com.meituan.android.pay.desk.component.bean.standardcomponent.SelectedInstallment;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a;

    @MTPaySuppressFBWarnings({"BC_UNCONFIRMED_CAST_OF_RETURN_VALUE"})
    public static void a(Activity activity, com.meituan.android.pay.common.payment.data.f fVar, com.meituan.android.pay.common.payment.data.d dVar, String str) {
        Object[] objArr = {activity, fVar, dVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f262daba0df6a357680c8265cc11d1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f262daba0df6a357680c8265cc11d1a");
            return;
        }
        Map<String, String> a2 = com.meituan.android.pay.desk.pack.u.a().a(activity, fVar, dVar, str);
        a(activity);
        com.meituan.android.pay.common.payment.utils.b.a(activity, a2);
        if ((fVar instanceof com.meituan.android.pay.common.payment.data.c) && (dVar instanceof com.meituan.android.pay.common.payment.data.a)) {
            c(activity, (com.meituan.android.pay.common.payment.data.c) fVar, (com.meituan.android.pay.common.payment.data.a) dVar);
        }
        if ("mt_balance_insufficient_params".equals(str)) {
            com.meituan.android.pay.common.payment.utils.b.c(activity, "combine_type");
            com.meituan.android.pay.common.payment.utils.b.c(activity, "installment_available_flag");
            com.meituan.android.pay.common.payment.utils.b.c(activity, "installment_info");
            com.meituan.android.pay.common.payment.utils.b.c(activity, "selected_promo_info");
        }
        if (dVar instanceof com.meituan.android.pay.common.payment.data.a) {
            a(activity, (com.meituan.android.pay.common.payment.data.a) dVar);
        } else {
            a(activity, (com.meituan.android.pay.common.payment.data.a) null);
        }
    }

    private static void e(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "094e61b67e8b7c7f49af1019b21c347a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "094e61b67e8b7c7f49af1019b21c347a");
            return;
        }
        String b = com.meituan.android.pay.common.payment.utils.b.b(activity, "ext_dim_stat");
        if (TextUtils.isEmpty(b)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(b);
            com.meituan.android.pay.common.payment.utils.b.c(activity, "ext_dim_stat");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("outer_business_statics", jSONObject.optString("outer_business_statics"));
            com.meituan.android.pay.common.payment.utils.b.a(activity, "ext_dim_stat", jSONObject2.toString());
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "BindPayUtils_removeExtDimStatExceptOuterBusinessStatics", (Map<String, Object>) null);
            com.meituan.android.pay.common.payment.utils.b.c(activity, "ext_dim_stat");
        }
    }

    public static void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74701628ef33d03c432c50c48139e3a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74701628ef33d03c432c50c48139e3a7");
            return;
        }
        com.meituan.android.pay.common.payment.utils.b.c(activity, "pay_type");
        com.meituan.android.pay.common.payment.utils.b.c(activity, "bank_type");
        com.meituan.android.pay.common.payment.utils.b.c(activity, "card_type");
        com.meituan.android.pay.common.payment.utils.b.c(activity, "paytype_id");
        com.meituan.android.pay.common.payment.utils.b.c(activity, "bank_type_id");
        com.meituan.android.pay.common.payment.utils.b.c(activity, "bank_card");
        com.meituan.android.pay.common.payment.utils.b.c(activity, "submit_url");
        e(activity);
        com.meituan.android.pay.common.payment.utils.b.c(activity, "pay_transparent_attributes");
        com.meituan.android.pay.common.payment.utils.b.c(activity, "pay_type_unique_key");
        b(activity);
        f(activity);
    }

    private static void f(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b41d0fed18665225fb63d9e2a0b0856", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b41d0fed18665225fb63d9e2a0b0856");
            return;
        }
        String b = com.meituan.android.pay.common.payment.utils.b.b(activity, "ext_param");
        if (TextUtils.isEmpty(b)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(b);
            if (jSONObject.has("onclick_bindcard_type")) {
                jSONObject.remove("onclick_bindcard_type");
            }
            if (jSONObject.has("recommend_bank_type_id")) {
                jSONObject.remove("recommend_bank_type_id");
            }
            com.meituan.android.pay.common.payment.utils.b.a(activity, "ext_param", jSONObject.toString());
        } catch (JSONException e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "BindPayUtils_removeExtParam", (Map<String, Object>) null);
        }
    }

    public static void a(Activity activity, com.meituan.android.pay.common.payment.data.c cVar, com.meituan.android.pay.common.payment.data.a aVar) {
        Object[] objArr = {activity, cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f4da813901b63a21122fe512e90856b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f4da813901b63a21122fe512e90856b");
        } else if (!(cVar == null && aVar == null) && (cVar instanceof CashDesk)) {
            b(activity, aVar);
            b(activity, cVar);
            c(activity, cVar, aVar);
            b(activity, cVar, aVar);
        }
    }

    private static void b(Activity activity, com.meituan.android.pay.common.payment.data.c cVar, com.meituan.android.pay.common.payment.data.a aVar) {
        Object[] objArr = {activity, cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b8cf7eae84268d5116ee831612f6cfc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b8cf7eae84268d5116ee831612f6cfc4");
            return;
        }
        HelloPayTransInfo transInfo = ((CashDesk) cVar).getTransInfo();
        if (transInfo != null && !TextUtils.isEmpty(transInfo.getTransparentAttributes()) && !TextUtils.isEmpty(transInfo.getPayTypeUniqueKey())) {
            com.meituan.android.pay.common.payment.utils.b.a(activity, "pay_transparent_attributes", transInfo.getTransparentAttributes());
            com.meituan.android.pay.common.payment.utils.b.a(activity, "pay_type_unique_key", transInfo.getPayTypeUniqueKey());
            return;
        }
        if (aVar != null && !TextUtils.isEmpty(aVar.getTransparentAttributes())) {
            com.meituan.android.pay.common.payment.utils.b.a(activity, "pay_transparent_attributes", aVar.getTransparentAttributes());
        } else {
            com.meituan.android.pay.common.payment.utils.b.c(activity, "pay_transparent_attributes");
        }
        if (aVar != null && !TextUtils.isEmpty(aVar.getPayTypeUniqueKey())) {
            com.meituan.android.pay.common.payment.utils.b.a(activity, "pay_type_unique_key", aVar.getPayTypeUniqueKey());
        } else {
            com.meituan.android.pay.common.payment.utils.b.c(activity, "pay_type_unique_key");
        }
    }

    public static void a(Activity activity, com.meituan.android.pay.common.payment.data.c cVar) {
        Object[] objArr = {activity, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b284c256671560c61bdc8518170f7e20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b284c256671560c61bdc8518170f7e20");
            return;
        }
        String valueOf = String.valueOf(com.meituan.android.pay.desk.component.data.a.i(cVar));
        if (!TextUtils.isEmpty(valueOf)) {
            com.meituan.android.pay.common.payment.utils.b.a(activity, "verify_type", valueOf);
        } else {
            com.meituan.android.pay.common.payment.utils.b.c(activity, "verify_type");
        }
    }

    private static void b(Activity activity, com.meituan.android.pay.common.payment.data.a aVar) {
        Object[] objArr = {activity, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6528f79bfa74c5904500923960f5ed82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6528f79bfa74c5904500923960f5ed82");
        } else if (aVar != null) {
            if (!TextUtils.isEmpty(aVar.getPayType())) {
                com.meituan.android.pay.common.payment.utils.b.a(activity, "pay_type", aVar.getPayType());
            } else {
                com.meituan.android.pay.common.payment.utils.b.c(activity, "pay_type");
            }
            if (!TextUtils.isEmpty(aVar.getBankType())) {
                com.meituan.android.pay.common.payment.utils.b.a(activity, "bank_type", aVar.getBankType());
            } else {
                com.meituan.android.pay.common.payment.utils.b.c(activity, "bank_type");
            }
            if (!TextUtils.isEmpty(aVar.getCardType())) {
                com.meituan.android.pay.common.payment.utils.b.a(activity, "card_type", aVar.getCardType());
            } else {
                com.meituan.android.pay.common.payment.utils.b.c(activity, "card_type");
            }
            if (!TextUtils.isEmpty(aVar.getBankTypeId())) {
                com.meituan.android.pay.common.payment.utils.b.a(activity, "bank_type_id", aVar.getBankTypeId());
            } else {
                com.meituan.android.pay.common.payment.utils.b.c(activity, "bank_type_id");
            }
            if (!TextUtils.isEmpty(aVar.getPayTypeId())) {
                com.meituan.android.pay.common.payment.utils.b.a(activity, "paytype_id", aVar.getPayTypeId());
            } else {
                com.meituan.android.pay.common.payment.utils.b.c(activity, "paytype_id");
            }
            if (aVar.getCardInfo() != null && !TextUtils.isEmpty(aVar.getCardInfo().getBankCard())) {
                com.meituan.android.pay.common.payment.utils.b.a(activity, "bank_card", aVar.getCardInfo().getBankCard());
            } else {
                com.meituan.android.pay.common.payment.utils.b.c(activity, "bank_card");
            }
            if (!TextUtils.isEmpty(aVar.getSubmitUrl())) {
                com.meituan.android.pay.common.payment.utils.b.a(activity, "submit_url", aVar.getSubmitUrl());
            } else {
                com.meituan.android.pay.common.payment.utils.b.c(activity, "submit_url");
            }
            a(activity, aVar);
            f(activity);
        }
    }

    public static void a(Activity activity, com.meituan.android.pay.common.payment.data.a aVar) {
        JSONObject jSONObject;
        Object[] objArr = {activity, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2cd9d096b37d8ff7cf7e014c6f911865", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2cd9d096b37d8ff7cf7e014c6f911865");
            return;
        }
        if (TextUtils.isEmpty(com.meituan.android.pay.common.payment.utils.b.b(activity, "ext_dim_stat"))) {
            jSONObject = new JSONObject();
        } else {
            try {
                jSONObject = new JSONObject(com.meituan.android.pay.common.payment.utils.b.b(activity, "ext_dim_stat"));
            } catch (Exception e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "BindPayUtils_setExtDimStat", (Map<String, Object>) null);
                jSONObject = new JSONObject();
            }
        }
        try {
            jSONObject.put("business_entry", "meituanPay");
            jSONObject.put("entry", "meituanPay");
            jSONObject.put("id_bindcard", UUID.randomUUID().toString());
            if (aVar != null && !TextUtils.isEmpty(aVar.getBankTypeId())) {
                jSONObject.put("bankTypeId", aVar.getBankTypeId());
            }
        } catch (JSONException e2) {
            com.meituan.android.paybase.common.analyse.a.a(e2, "BindPayUtils_putEntry", (Map<String, Object>) null);
        }
        com.meituan.android.pay.common.payment.utils.b.a(activity, "ext_dim_stat", jSONObject.toString());
    }

    private static void c(Activity activity, com.meituan.android.pay.common.payment.data.c cVar, com.meituan.android.pay.common.payment.data.a aVar) {
        Object[] objArr = {activity, cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf91c6081bee8e664808a6e37d827671", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf91c6081bee8e664808a6e37d827671");
        } else if (cVar != null) {
            List<CombineLabel> a2 = com.meituan.android.pay.desk.component.discount.a.a(cVar, aVar);
            com.meituan.android.pay.common.promotion.utils.c.a().a(a2, com.meituan.android.pay.common.payment.utils.b.c(activity));
            com.meituan.android.pay.common.promotion.utils.c.a().b(a2, com.meituan.android.pay.common.payment.utils.b.c(activity));
            b(a2, com.meituan.android.pay.common.payment.utils.b.c(activity));
            com.meituan.android.pay.common.promotion.utils.c.a().a(a2, null, com.meituan.android.pay.common.payment.utils.b.c(activity));
            a(a2, com.meituan.android.pay.common.payment.utils.b.c(activity));
        }
    }

    private static void a(List<CombineLabel> list, Map<String, String> map) {
        Object[] objArr = {list, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "684ead0ce985043214ce0113716b44df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "684ead0ce985043214ce0113716b44df");
        } else if (com.meituan.android.paybase.utils.i.a((Collection) list)) {
            map.remove("tuan_coin_switchs");
        } else {
            PayLabel a2 = com.meituan.android.pay.common.promotion.utils.c.a(list);
            if (a2 == null) {
                map.remove("tuan_coin_switchs");
            } else if (com.meituan.android.pay.common.promotion.utils.a.a(a2)) {
                map.put("tuan_coin_switchs", "1");
            } else {
                map.put("tuan_coin_switchs", "0");
            }
        }
    }

    private static void b(List<CombineLabel> list, Map<String, String> map) {
        Object[] objArr = {list, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ea787e0bba87aabdcf30016482cf2646", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ea787e0bba87aabdcf30016482cf2646");
        } else if (com.meituan.android.paybase.utils.i.a((Collection) list)) {
            map.remove("bonus_support");
        } else {
            for (CombineLabel combineLabel : list) {
                if (combineLabel != null) {
                    List<PayLabel> childrenLabel = combineLabel.getChildrenLabel();
                    if (com.meituan.android.paybase.utils.i.a((Collection) childrenLabel)) {
                        continue;
                    } else {
                        for (PayLabel payLabel : childrenLabel) {
                            if (payLabel != null && TextUtils.equals(PayLabelConstants.TYPE_BONUS, payLabel.getLabelType())) {
                                if (com.meituan.android.pay.common.promotion.utils.a.a(payLabel)) {
                                    map.put("bonus_reduce_switchs", "1");
                                } else {
                                    map.put("bonus_reduce_switchs", "0");
                                }
                                map.put("bonus_support", "1");
                                return;
                            }
                        }
                        continue;
                    }
                }
            }
            map.remove("bonus_support");
        }
    }

    public static void b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a8a72b9f6ba7818ac64394827496dd34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a8a72b9f6ba7818ac64394827496dd34");
            return;
        }
        com.meituan.android.pay.common.payment.utils.b.c(activity, "campaign_id");
        com.meituan.android.pay.common.payment.utils.b.c(activity, "cashticket_code");
    }

    private static void b(Activity activity, com.meituan.android.pay.common.payment.data.c cVar) {
        Object[] objArr = {activity, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "777474ac59d5ec5213be72b7d1c1e75f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "777474ac59d5ec5213be72b7d1c1e75f");
        } else if (cVar instanceof CashDesk) {
            CashDesk cashDesk = (CashDesk) cVar;
            if (cashDesk.getTransInfo() == null) {
                return;
            }
            int isSupportInstallment = cashDesk.getTransInfo().getIsSupportInstallment();
            if (com.meituan.android.pay.common.payment.utils.e.a(isSupportInstallment)) {
                com.meituan.android.pay.common.payment.utils.b.a(activity, "installment_available_flag", String.valueOf(isSupportInstallment));
                SelectedInstallment selectedInstallment = cashDesk.getTransInfo().getSelectedInstallment();
                if (selectedInstallment != null && selectedInstallment.getPeriod() != null) {
                    Period period = selectedInstallment.getPeriod();
                    try {
                        if (period != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("installment_selected_period", period.getPeriod());
                            jSONObject.put("repay_amount", com.meituan.android.paybase.utils.d.a(Float.valueOf(period.getRepayAmount())));
                            jSONObject.put("service_fee", com.meituan.android.paybase.utils.d.a(Float.valueOf(period.getServiceFee())));
                            jSONObject.put("principal_amount", com.meituan.android.paybase.utils.d.a(Float.valueOf(period.getPrincipalAmount())));
                            jSONObject.put("discount_amount", com.meituan.android.paybase.utils.d.a(Float.valueOf(period.getDiscountAmount())));
                            List<PeriodCoupon> coupons = period.getCoupons();
                            StringBuilder sb = new StringBuilder();
                            if (!com.meituan.android.paybase.utils.i.a((Collection) coupons)) {
                                for (PeriodCoupon periodCoupon : coupons) {
                                    if (periodCoupon.isSelected()) {
                                        sb.append(periodCoupon.getCode());
                                        sb.append(CommonConstant.Symbol.COMMA);
                                    }
                                }
                            }
                            String sb2 = sb.toString();
                            if (sb2.endsWith(CommonConstant.Symbol.COMMA)) {
                                sb2 = sb2.substring(0, sb2.length() - 1);
                            }
                            jSONObject.put("coupon_ids", sb2);
                            jSONObject.put("installment_periods", selectedInstallment.getAllPeriods());
                            if (com.meituan.android.paybase.utils.d.a(String.valueOf(period.getTotalRepayAmount()), "0.0") > 0) {
                                jSONObject.put("total_repay_amount", com.meituan.android.paybase.utils.d.a(Float.valueOf(period.getTotalRepayAmount())));
                            }
                            if (!TextUtils.isEmpty(period.getPriceId())) {
                                jSONObject.put("price_id", period.getPriceId());
                            }
                            com.meituan.android.pay.common.payment.utils.b.a(activity, "installment_info", jSONObject.toString());
                            return;
                        }
                        g(activity);
                        return;
                    } catch (JSONException e) {
                        com.meituan.android.paybase.common.analyse.a.a(e, "BindPayUtils-refreshInstallmentInfo", (Map<String, Object>) null);
                        return;
                    }
                }
                g(activity);
                return;
            }
            g(activity);
        }
    }

    private static void g(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2546f9aa38c7692576baeeee27b63e8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2546f9aa38c7692576baeeee27b63e8f");
            return;
        }
        com.meituan.android.pay.common.payment.utils.b.c(activity, "installment_info");
        com.meituan.android.pay.common.payment.utils.b.c(activity, "installment_available_flag");
    }

    public static void c(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a831c988b2e5968d61be1fb4dd4efa32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a831c988b2e5968d61be1fb4dd4efa32");
            return;
        }
        com.meituan.android.pay.common.payment.utils.b.c(activity, "cashticket_code");
        com.meituan.android.pay.common.payment.utils.b.c(activity, "campaign_id");
        com.meituan.android.pay.common.payment.utils.b.c(activity, "bonus_points_switch");
        com.meituan.android.pay.common.payment.utils.b.c(activity, "bonus_points_switchs");
        com.meituan.android.pay.common.payment.utils.b.c(activity, "bonus_support");
        com.meituan.android.pay.common.payment.utils.b.c(activity, "bonus_reduce_switchs");
        com.meituan.android.pay.common.payment.utils.b.c(activity, "tuan_coin_switchs");
    }

    public static String d(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c2323794fc6df7cd95712f19096a7f8c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c2323794fc6df7cd95712f19096a7f8c");
        }
        String b = com.meituan.android.pay.common.payment.utils.b.b(activity, "transmission_param");
        String b2 = com.meituan.android.pay.common.payment.utils.b.b(activity, "cif");
        try {
            if (TextUtils.isEmpty(b)) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(new JSONObject(b).optString("outer_business_params"));
            jSONObject.put("extra_statics", new JSONObject(com.meituan.android.pay.common.payment.utils.b.b(activity, "ext_dim_stat")).optString("outer_business_statics"));
            if (!TextUtils.isEmpty(com.meituan.android.pay.common.payment.utils.b.b(activity, "biz_category_code"))) {
                jSONObject.put("biz_category_code", com.meituan.android.pay.common.payment.utils.b.b(activity, "biz_category_code"));
            }
            if (!TextUtils.isEmpty(b2)) {
                jSONObject.put("cif", b2);
            }
            return jSONObject.toString();
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "BindPayUtils_getOuterBusinessParams", (Map<String, Object>) null);
            return "";
        }
    }

    public static void a(HashMap<String, String> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df555fa2fbdb10cefd76854b98bb31ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df555fa2fbdb10cefd76854b98bb31ab");
            return;
        }
        String str = hashMap.get("transmission_param");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).optString("outer_business_params"));
            hashMap.put("outer_business_data", jSONObject.optString("extra_data"));
            if (TextUtils.isEmpty(hashMap.get("tradeno"))) {
                hashMap.put("tradeno", jSONObject.optString("tradeno"));
            }
            if (TextUtils.isEmpty(hashMap.get("merchant_no"))) {
                hashMap.put("merchant_no", jSONObject.optString("merchant_no"));
            }
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "BindPayUtils_appendOuterBusinessParams", (Map<String, Object>) null);
        }
    }
}
