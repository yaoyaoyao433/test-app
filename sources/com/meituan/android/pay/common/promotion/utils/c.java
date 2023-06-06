package com.meituan.android.pay.common.promotion.utils;

import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.payment.data.d;
import com.meituan.android.pay.common.promotion.bean.CardInfo;
import com.meituan.android.pay.common.promotion.bean.CombineLabel;
import com.meituan.android.pay.common.promotion.bean.LabelSwitch;
import com.meituan.android.pay.common.promotion.bean.PayLabel;
import com.meituan.android.pay.common.promotion.bean.PayLabelConstants;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static volatile c c;
    private Map<String, Integer> b;

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "44ec2dc7f5b1c0b97df9fe58fa12426c", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "44ec2dc7f5b1c0b97df9fe58fa12426c");
        }
        if (c == null) {
            synchronized (c.class) {
                if (c == null) {
                    c = new c();
                }
            }
        }
        return c;
    }

    public final void a(d dVar, Map<String, String> map) {
        Map map2;
        Iterator<CombineLabel> it;
        int check;
        char c2 = 0;
        Object[] objArr = {dVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6d839ed2d46741bade7ebde88b18944", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6d839ed2d46741bade7ebde88b18944");
            return;
        }
        List<CombineLabel> b = b(dVar);
        a(b, map);
        b(b, map);
        Object[] objArr2 = {dVar, map};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af2855bc9b0b617f54a135b502307ef5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af2855bc9b0b617f54a135b502307ef5");
        } else {
            JSONArray jSONArray = new JSONArray();
            List<CombineLabel> b2 = b(dVar);
            JSONObject a2 = a(map);
            JSONObject b3 = b(map);
            if (!i.a((Collection) b2)) {
                try {
                    Iterator<CombineLabel> it2 = b2.iterator();
                    while (it2.hasNext()) {
                        CombineLabel next = it2.next();
                        if (next != null && !i.a((Collection) next.getChildrenLabel())) {
                            Iterator<PayLabel> it3 = next.getChildrenLabel().iterator();
                            while (it3.hasNext()) {
                                PayLabel next2 = it3.next();
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("code", next2.getLabelCode());
                                Object[] objArr3 = new Object[1];
                                objArr3[c2] = next2;
                                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "45e2d6f48302b96999337e5c5181db61", RobustBitConfig.DEFAULT_VALUE)) {
                                    it = it2;
                                    check = ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "45e2d6f48302b96999337e5c5181db61")).intValue();
                                } else {
                                    it = it2;
                                    check = (next2 == null || next2.getLabelSwitch() == null) ? 0 : next2.getLabelSwitch().getCheck();
                                }
                                jSONObject.put(PayLabelConstants.KEY_LABEL_CHECK, check);
                                jSONArray.put(jSONObject);
                                it2 = it;
                                c2 = 0;
                            }
                        }
                    }
                    b3.put(PayLabelConstants.KEY_LABEL_STATUS, jSONArray);
                    b3.put("pay_type", dVar.getPayType());
                    if (dVar instanceof com.meituan.android.pay.common.payment.data.a) {
                        com.meituan.android.pay.common.payment.data.a aVar = (com.meituan.android.pay.common.payment.data.a) dVar;
                        if (aVar.getCardInfo() != null) {
                            b3.put("bank_card", aVar.getCardInfo().getBankCard());
                        }
                    }
                    if (a2 != null) {
                        a2.put("transmission_param", b3.toString());
                        map.put("payExtendParams", a2.toString());
                    }
                } catch (JSONException e) {
                    map2 = null;
                    com.meituan.android.paybase.common.analyse.a.a(e, "DiscountManager_putCombineLabelCheckStatus", (Map<String, Object>) null);
                }
            } else if (a2 != null) {
                a2.remove("transmission_param");
                map.put("payExtendParams", a2.toString());
            }
        }
        map2 = null;
        c(b, map);
        a(b, dVar, map);
        Object[] objArr4 = {b, map};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        Map map3 = map2;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "05f43c1690a24571fa3d810a6ed5a2dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "05f43c1690a24571fa3d810a6ed5a2dd");
            return;
        }
        JSONObject a3 = a(map);
        if (a3 == null) {
            a3 = new JSONObject();
        }
        JSONObject jSONObject2 = a3;
        if (i.a((Collection) b)) {
            jSONObject2.remove("tuan_coin_switchs");
            map.put("payExtendParams", jSONObject2.toString());
            return;
        }
        PayLabel a4 = a(b);
        if (a4 == null) {
            jSONObject2.remove("tuan_coin_switchs");
            map.put("payExtendParams", jSONObject2.toString());
            return;
        }
        try {
            if (a.a(a4)) {
                jSONObject2.put("tuan_coin_switchs", "1");
            } else {
                jSONObject2.put("tuan_coin_switchs", "0");
            }
        } catch (JSONException e2) {
            com.meituan.android.paybase.common.analyse.a.a(e2, "DiscountManager_putMTCoinSwitchesParams", map3);
        }
        map.put("payExtendParams", jSONObject2.toString());
    }

    public final void a(List<CombineLabel> list, Map<String, String> map) {
        Object[] objArr = {list, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c690fee090932ec87ba8f5504a996639", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c690fee090932ec87ba8f5504a996639");
        } else if (i.a((Collection) list)) {
            map.remove("campaign_id");
        } else {
            JsonArray jsonArray = new JsonArray();
            for (CombineLabel combineLabel : list) {
                if (combineLabel != null) {
                    List<PayLabel> childrenLabel = combineLabel.getChildrenLabel();
                    if (!i.a((Collection) childrenLabel)) {
                        for (PayLabel payLabel : childrenLabel) {
                            if (a.d(payLabel) && (a.a(payLabel) || a(payLabel))) {
                                if (!TextUtils.isEmpty(payLabel.getCampaignId())) {
                                    jsonArray.add(payLabel.getCampaignId());
                                }
                            }
                        }
                    } else if (!TextUtils.isEmpty(combineLabel.getCampaignId())) {
                        jsonArray.add(combineLabel.getCampaignId());
                    }
                }
            }
            if (!TextUtils.isEmpty(jsonArray.toString())) {
                map.put("campaign_id", jsonArray.toString());
            } else {
                map.remove("campaign_id");
            }
        }
    }

    public final void b(List<CombineLabel> list, Map<String, String> map) {
        Object[] objArr = {list, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b1e9c5cae58ccee937a9c53f912c8ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b1e9c5cae58ccee937a9c53f912c8ee");
        } else if (i.a((Collection) list)) {
            map.remove("cashticket_code");
        } else {
            for (CombineLabel combineLabel : list) {
                if (combineLabel != null) {
                    List<PayLabel> childrenLabel = combineLabel.getChildrenLabel();
                    if (!i.a((Collection) childrenLabel)) {
                        for (PayLabel payLabel : childrenLabel) {
                            if (a.d(payLabel) && a.a(payLabel) && !TextUtils.isEmpty(payLabel.getCashTicketCode())) {
                                map.put("cashticket_code", payLabel.getCashTicketCode());
                                return;
                            }
                        }
                        continue;
                    } else if (!TextUtils.isEmpty(combineLabel.getCashTicketCode())) {
                        map.put("cashticket_code", combineLabel.getCashTicketCode());
                        return;
                    }
                }
            }
            map.remove("cashticket_code");
        }
    }

    public final JSONObject a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a1a959803f337312bc7290e35110854", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a1a959803f337312bc7290e35110854");
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        List<CombineLabel> b = b(dVar);
        if (i.a((Collection) b)) {
            return null;
        }
        try {
            for (CombineLabel combineLabel : b) {
                if (combineLabel != null && !i.a((Collection) combineLabel.getChildrenLabel())) {
                    for (PayLabel payLabel : combineLabel.getChildrenLabel()) {
                        if (payLabel != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("code", payLabel.getLabelCode());
                            if (payLabel.getLabelSwitch() != null) {
                                jSONObject2.put(PayLabelConstants.KEY_LABEL_CHECK, payLabel.getLabelSwitch().getCheck());
                            }
                            jSONArray.put(jSONObject2);
                        }
                    }
                }
            }
            jSONObject.put(PayLabelConstants.KEY_LABEL_STATUS, jSONArray);
        } catch (JSONException e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "DiscountManager_putCombineLabelCheckStatus", (Map<String, Object>) null);
        }
        return jSONObject;
    }

    public static PayLabel a(List<CombineLabel> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb79cd624dcc2378597ca7426d8aa976", RobustBitConfig.DEFAULT_VALUE)) {
            return (PayLabel) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb79cd624dcc2378597ca7426d8aa976");
        }
        if (i.a((Collection) list)) {
            return null;
        }
        for (CombineLabel combineLabel : list) {
            if (combineLabel != null) {
                List<PayLabel> childrenLabel = combineLabel.getChildrenLabel();
                if (i.a((Collection) childrenLabel)) {
                    continue;
                } else {
                    for (PayLabel payLabel : childrenLabel) {
                        if (a.d(payLabel) && TextUtils.equals(PayLabelConstants.TYPE_TUANCOIN, payLabel.getLabelType())) {
                            return payLabel;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    private void c(List<CombineLabel> list, Map<String, String> map) {
        Object[] objArr = {list, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "013e0355d322b21aef5cb49d43afdb4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "013e0355d322b21aef5cb49d43afdb4e");
            return;
        }
        JSONObject a2 = a(map);
        if (i.a((Collection) list)) {
            if (a2 != null) {
                a2.remove("bonus_reduce_switchs");
                a2.remove("bonus_support");
                map.put("payExtendParams", a2.toString());
                return;
            }
            return;
        }
        for (CombineLabel combineLabel : list) {
            if (combineLabel != null) {
                List<PayLabel> childrenLabel = combineLabel.getChildrenLabel();
                if (i.a((Collection) childrenLabel)) {
                    continue;
                } else {
                    for (PayLabel payLabel : childrenLabel) {
                        if (a.d(payLabel) && TextUtils.equals(PayLabelConstants.TYPE_BONUS, payLabel.getLabelType())) {
                            if (a2 != null) {
                                try {
                                    if (a.a(payLabel)) {
                                        a2.put("bonus_reduce_switchs", "1");
                                    } else {
                                        a2.put("bonus_reduce_switchs", "0");
                                    }
                                    a2.put("bonus_support", "1");
                                } catch (JSONException e) {
                                    com.meituan.android.paybase.common.analyse.a.a(e, "DiscountManager_putCombineSpeedBonusSpecialParams", (Map<String, Object>) null);
                                }
                                map.put("payExtendParams", a2.toString());
                                return;
                            }
                            return;
                        }
                    }
                    continue;
                }
            }
        }
    }

    public final ArrayList<PayLabel> a(d dVar, boolean z) {
        List<CombineLabel> bottomLabels;
        PayLabel payLabel;
        Object[] objArr = {dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39bcfdde4bdf1e9ace41bd1f45d5b3a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39bcfdde4bdf1e9ace41bd1f45d5b3a8");
        }
        if (dVar instanceof MTPayment) {
            MTPayment mTPayment = (MTPayment) dVar;
            if (z) {
                bottomLabels = mTPayment.getLabels();
            } else {
                bottomLabels = mTPayment.getBottomLabels();
            }
            ArrayList<PayLabel> arrayList = new ArrayList<>();
            if (i.a((Collection) bottomLabels)) {
                return arrayList;
            }
            for (CombineLabel combineLabel : bottomLabels) {
                if (!i.a((Collection) combineLabel.getChildrenLabel())) {
                    arrayList.addAll((ArrayList) combineLabel.getChildrenLabel());
                } else {
                    Object[] objArr2 = {combineLabel};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ae003328325ca75bea5d2b15d9b7821b", RobustBitConfig.DEFAULT_VALUE)) {
                        payLabel = (PayLabel) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ae003328325ca75bea5d2b15d9b7821b");
                    } else {
                        PayLabel payLabel2 = new PayLabel();
                        if (combineLabel != null) {
                            payLabel2.setPromoId(combineLabel.getPromoId());
                            payLabel2.setCashTicketCode(combineLabel.getCashTicketCode());
                            payLabel2.setRealDiscount(combineLabel.getRealDiscount());
                            payLabel2.setPromoType(combineLabel.getPromoType());
                            payLabel2.setDiscount(combineLabel.getDiscount());
                            if (combineLabel.getLabelSwitch() == null) {
                                LabelSwitch labelSwitch = new LabelSwitch();
                                labelSwitch.setCheck(1);
                                payLabel2.setLabelSwitch(labelSwitch);
                            } else {
                                payLabel2.setLabelSwitch(combineLabel.getLabelSwitch());
                            }
                        }
                        payLabel = payLabel2;
                    }
                    arrayList.add(payLabel);
                }
            }
            Iterator<PayLabel> it = arrayList.iterator();
            while (it.hasNext()) {
                if (a.b(it.next())) {
                    it.remove();
                }
            }
            return arrayList;
        }
        return null;
    }

    public JSONArray a(ArrayList<PayLabel> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7148629aac388ff8ea7ea0e931cc8bb", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7148629aac388ff8ea7ea0e931cc8bb");
        }
        JSONArray jSONArray = new JSONArray();
        if (!i.a((Collection) arrayList)) {
            try {
                Iterator<PayLabel> it = arrayList.iterator();
                while (it.hasNext()) {
                    PayLabel next = it.next();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(Constants.Business.KEY_PROMOT_ID, next.getPromoId());
                    jSONObject.put("cashticket_code", next.getCashTicketCode());
                    jSONObject.put("real_discount", com.meituan.android.paybase.utils.d.a(Float.valueOf(next.getRealDiscount())));
                    jSONObject.put("promo_type", next.getPromoType());
                    jSONObject.put(PayLabel.ITEM_TYPE_DISCOUNT, com.meituan.android.paybase.utils.d.a(Float.valueOf(next.getDiscount())));
                    if (next.getLabelSwitch() != null) {
                        jSONObject.put(PayLabelConstants.KEY_LABEL_CHECK, next.getLabelSwitch().getCheck());
                    }
                    jSONArray.put(jSONObject);
                }
            } catch (Exception e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "DiscountManager_getRequestPromoList", (Map<String, Object>) null);
            }
        }
        return jSONArray;
    }

    public final void a(List<CombineLabel> list, d dVar, Map<String, String> map) {
        PayLabel payLabel;
        char c2 = 0;
        int i = 2;
        Object[] objArr = {list, dVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81eb2ffadb5d71dfd425caa1c39194b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81eb2ffadb5d71dfd425caa1c39194b3");
            return;
        }
        PayLabel payLabel2 = null;
        if (i.a((Collection) list)) {
            return;
        }
        boolean z = false;
        for (CombineLabel combineLabel : list) {
            if (combineLabel != null) {
                List<PayLabel> childrenLabel = combineLabel.getChildrenLabel();
                if (!i.a((Collection) childrenLabel)) {
                    PayLabel payLabel3 = payLabel2;
                    boolean z2 = z;
                    for (PayLabel payLabel4 : childrenLabel) {
                        if (a.d(payLabel4)) {
                            if (a(payLabel4)) {
                                if (dVar instanceof MTPayment) {
                                    MTPayment mTPayment = (MTPayment) dVar;
                                    boolean a2 = a.a(payLabel4);
                                    Object[] objArr2 = new Object[i];
                                    objArr2[c2] = mTPayment;
                                    objArr2[1] = Byte.valueOf(a2 ? (byte) 1 : (byte) 0);
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    payLabel = payLabel4;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bb3dd4d8fe6661483b847d4301797fca", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bb3dd4d8fe6661483b847d4301797fca");
                                    } else {
                                        CardInfo cardInfo = mTPayment.getCardInfo();
                                        if (cardInfo != null && !TextUtils.isEmpty(cardInfo.getBankCard())) {
                                            if (this.b == null) {
                                                this.b = new HashMap();
                                            }
                                            this.b.put(cardInfo.getBankCard(), Integer.valueOf(a2 ? 1 : 0));
                                        }
                                    }
                                } else {
                                    payLabel = payLabel4;
                                }
                                if (!z2) {
                                    payLabel3 = payLabel;
                                    z2 = true;
                                }
                            }
                            c2 = 0;
                            i = 2;
                        }
                    }
                    payLabel2 = payLabel3;
                    z = z2;
                }
                c2 = 0;
                i = 2;
            }
        }
        if (!i.a(this.b)) {
            c(map);
        }
        if (payLabel2 != null) {
            map.put("bonus_points_switch", a.a(payLabel2) ? "1" : "0");
        } else {
            map.remove("bonus_points_switch");
        }
    }

    public final JSONObject a(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68cb00e2ed8b1f2c008e06dd99dc32d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68cb00e2ed8b1f2c008e06dd99dc32d9");
        }
        String str = map.get("payExtendParams");
        if (TextUtils.isEmpty(str)) {
            return new JSONObject();
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "DiscountManager_getExtendParams", (Map<String, Object>) null);
            return null;
        }
    }

    private JSONObject b(Map<String, String> map) {
        JSONObject jSONObject;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "298ab9f20651f4e1e38570c017e31c00", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "298ab9f20651f4e1e38570c017e31c00");
        }
        JSONObject a2 = a(map);
        if (a2 != null && a2.has("transmission_param")) {
            try {
                String string = a2.getString("transmission_param");
                if (!TextUtils.isEmpty(string)) {
                    jSONObject = new JSONObject(string);
                } else {
                    jSONObject = new JSONObject();
                }
                return jSONObject;
            } catch (JSONException e) {
                JSONObject jSONObject2 = new JSONObject();
                com.meituan.android.paybase.common.analyse.a.a(e, "WalletPayManager_getTransmissionParams", (Map<String, Object>) null);
                return jSONObject2;
            }
        }
        return new JSONObject();
    }

    private List<CombineLabel> b(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89c6edb938206eb18af78e8b2ad51278", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89c6edb938206eb18af78e8b2ad51278");
        }
        if (!i.a((Collection) dVar.getBottomLabels())) {
            return dVar.getBottomLabels();
        }
        if (dVar instanceof MTPayment) {
            return ((MTPayment) dVar).getLabels();
        }
        return null;
    }

    private boolean a(PayLabel payLabel) {
        Object[] objArr = {payLabel};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bd3bca09b2386d5f92bd821ef34a27e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bd3bca09b2386d5f92bd821ef34a27e")).booleanValue() : payLabel != null && TextUtils.equals(PayLabelConstants.TYPE_POINT, payLabel.getLabelType());
    }

    private void c(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a9861ac74dbb9f64526e1c09a5954d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a9861ac74dbb9f64526e1c09a5954d6");
        } else if (!i.a(this.b)) {
            JsonObject jsonObject = new JsonObject();
            for (Map.Entry<String, Integer> entry : this.b.entrySet()) {
                jsonObject.addProperty(entry.getKey(), entry.getValue());
            }
            map.put("bonus_points_switchs", jsonObject.toString());
        }
    }

    @MTPaySuppressFBWarnings({"ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD"})
    public final void b() {
        this.b = null;
        c = null;
    }
}
