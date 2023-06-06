package com.meituan.android.pay.desk.payment.report;

import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.payment.data.d;
import com.meituan.android.pay.common.payment.utils.c;
import com.meituan.android.pay.desk.payment.bean.standarddesk.WalletPayment;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.i;
import com.meituan.android.paybase.widgets.label.Label;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "82a8b192654087aa36a8e7224c514e67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "82a8b192654087aa36a8e7224c514e67");
        } else if (dVar instanceof MTPayment) {
            com.meituan.android.paybase.common.analyse.a.a("c_PJmoK", "b_pay_7oqkgkxk_mc", "大美团支付区域-二级支付方式曝光", a((MTPayment) dVar), a.EnumC0329a.CLICK, -1);
        }
    }

    public static void a(WalletPayment walletPayment) {
        Object[] objArr = {walletPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb37687213d89ad7dfcb4d6a4d687c38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb37687213d89ad7dfcb4d6a4d687c38");
            return;
        }
        List<MTPayment> recommendPayment = walletPayment.getRecommendPayment();
        if (i.a((Collection) recommendPayment)) {
            return;
        }
        for (MTPayment mTPayment : recommendPayment) {
            com.meituan.android.paybase.common.analyse.a.a("c_PJmoK", "b_pay_7oqkgkxk_mv", "大美团支付区域-二级支付方式曝光", a(mTPayment), a.EnumC0329a.VIEW, -1);
        }
    }

    private static HashMap<String, Object> a(MTPayment mTPayment) {
        Object[] objArr = {mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "55432145b11881ebe4ac944d8e1fa81c", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "55432145b11881ebe4ac944d8e1fa81c");
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("pay_type", !TextUtils.isEmpty(mTPayment.getPayType()) ? mTPayment.getPayType() : "-999");
        hashMap.put("is_select", mTPayment.isSelected() ? "1" : "0");
        hashMap.put("tradeNo", !TextUtils.isEmpty(com.meituan.android.paybase.common.analyse.a.b) ? com.meituan.android.paybase.common.analyse.a.b : "-999");
        if (mTPayment.getCardInfo() != null && !TextUtils.isEmpty(mTPayment.getCardInfo().getBankCard())) {
            hashMap.put("bankcard_id", mTPayment.getCardInfo().getBankCard());
        } else {
            hashMap.put("bankcard_id", "-999");
        }
        if (c.e(mTPayment.getPayType())) {
            hashMap.put("real_name_auth_type", Integer.valueOf(mTPayment.getRealNameAuthType()));
        } else {
            hashMap.put("real_name_auth_type", "-999");
        }
        JsonArray jsonArray = new JsonArray();
        JsonObject a2 = a(mTPayment.getRightLabels(), 0);
        JsonObject a3 = a(mTPayment.getBottomLabels(), 1);
        if (a2 != null && !a2.isJsonNull()) {
            jsonArray.add(a2);
        }
        if (a3 != null && !a3.isJsonNull()) {
            jsonArray.add(a3);
        }
        hashMap.put(PushConstants.INTENT_ACTIVITY_NAME, jsonArray.size() > 0 ? jsonArray.toString() : "-999");
        hashMap.put("fly_text", a(mTPayment.getRightLabels()));
        hashMap.put("nb_version", com.meituan.android.paybase.config.a.d().q());
        hashMap.put("bank_type_id", !TextUtils.isEmpty(mTPayment.getBankTypeId()) ? mTPayment.getBankTypeId() : "-999");
        return hashMap;
    }

    private static String a(List<? extends Label> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "52347431a6d862db31e1ba0bb7eb783f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "52347431a6d862db31e1ba0bb7eb783f");
        }
        if (i.a((Collection) list)) {
            return "";
        }
        for (Label label : list) {
            if (3 == label.getStyle()) {
                return label.getContent();
            }
        }
        return "";
    }

    private static JsonObject a(List<? extends Label> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        JsonObject jsonObject = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "451bc0f9902def746c4c50b45409e31a", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "451bc0f9902def746c4c50b45409e31a");
        }
        if (!i.a((Collection) list)) {
            jsonObject = new JsonObject();
            for (Label label : list) {
                jsonObject.addProperty("activity_id", label.getLabelId());
                jsonObject.addProperty("activity_tip", label.getContent());
                jsonObject.addProperty("activity_type", Integer.valueOf(label.getType()));
                jsonObject.addProperty("position", Integer.valueOf(i));
            }
        }
        return jsonObject;
    }
}
