package com.unionpay.mobile.android.nocard.utils;

import android.text.TextUtils;
import com.meituan.android.cashier.bridge.icashier.ICashierJSHandler;
import com.unionpay.mobile.android.utils.j;
import com.unionpay.tsmservice.data.Constant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class f {
    public static int a(com.unionpay.mobile.android.model.b bVar, JSONObject jSONObject) {
        bVar.bt = j.a(jSONObject, "promotion_change_info");
        bVar.z = j.d(jSONObject, "rules");
        bVar.ad = j.d(jSONObject, "available_area_codes");
        bVar.D = j.d(jSONObject, "entrust_rules");
        bVar.E = j.a(jSONObject, "pre_cmd");
        bVar.A = j.a(jSONObject, "title");
        bVar.C = j.c(jSONObject, "rules_button");
        bVar.al = j.c(jSONObject, "service_checkbox");
        bVar.am = j.c(jSONObject, "bind_card_checkbox");
        String a = j.a(jSONObject, "timeout_msg");
        if (a != null && !TextUtils.isEmpty(a)) {
            bVar.ak = a;
        }
        bVar.p = new HashMap<>();
        JSONObject c = j.c(jSONObject, "f55");
        String a2 = j.a(c, "order_amount");
        HashMap<String, String> hashMap = bVar.p;
        if (a2 == null || a2.length() <= 0) {
            a2 = Constant.DEFAULT_BALANCE;
        }
        hashMap.put("trans_amt", a2);
        String a3 = j.a(c, "order_currency");
        bVar.p.put("trans currcy code", (a3 == null || a3.length() <= 0) ? "0156" : "0156");
        String a4 = j.a(c, "trans_type");
        bVar.p.put("trans_type", (a4 == null || a4.length() <= 0) ? "00" : "00");
        String a5 = j.a(c, "mer_name");
        bVar.p.put("mer_name", (a5 == null || a5.length() <= 0) ? "" : "");
        bVar.aq = j.a(jSONObject, "pan");
        bVar.bf = j.a(jSONObject, "encrypt_key");
        bVar.bg = j.a(jSONObject, "auth_id");
        String a6 = j.a(jSONObject, "fail_continue");
        if (a6 != null && a6.equalsIgnoreCase("0")) {
            bVar.F = true;
        }
        return ((bVar.z == null || bVar.z.length() <= 0) && (bVar.D == null || bVar.D.length() <= 0)) ? 2 : 0;
    }

    public static int a(com.unionpay.mobile.android.model.b bVar, JSONObject jSONObject, boolean z) {
        if (!z) {
            bVar.G = jSONObject;
        }
        return a(bVar, jSONObject);
    }

    public static com.unionpay.mobile.android.model.e a(JSONObject jSONObject) {
        com.unionpay.mobile.android.model.f fVar = new com.unionpay.mobile.android.model.f();
        fVar.a(ICashierJSHandler.KEY_PROMOTION, j.c(jSONObject, ICashierJSHandler.KEY_PROMOTION));
        fVar.a("instalment", j.c(jSONObject, "instalment"));
        fVar.a("promotion_instalment_msgbox", j.c(jSONObject, "promotion_instalment_msgbox"));
        return fVar;
    }

    public static boolean a(JSONArray jSONArray) {
        String a;
        String a2;
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    a = j.a(jSONObject, "type");
                    a2 = j.a(jSONObject, "readonly");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                if ("pan".equalsIgnoreCase(a)) {
                    return "true".equalsIgnoreCase(a2);
                }
                continue;
            }
            return false;
        }
        return false;
    }

    public static int b(com.unionpay.mobile.android.model.b bVar, JSONObject jSONObject) {
        int i = jSONObject == null ? 2 : 0;
        if (bVar.ab == null) {
            bVar.ab = new ArrayList();
        }
        bVar.ab.clear();
        List<JSONArray> e = j.e(jSONObject, "user_cards");
        if (e.size() > 0) {
            for (int i2 = 0; i2 < e.size(); i2++) {
                bVar.ab.add(new com.unionpay.mobile.android.model.a(j.a(e.get(i2), 0), j.a(e.get(i2), 1), j.a(e.get(i2), 2), (byte) 0));
            }
        }
        bVar.ad = j.d(jSONObject, "available_area_codes");
        bVar.bt = j.a(jSONObject, "promotion_change_info");
        bVar.ac = j.d(jSONObject, "user_info");
        bVar.z = j.d(jSONObject, "rules");
        bVar.Z = j.c(jSONObject, "service_url");
        bVar.aa = j.c(jSONObject, "bind_url");
        bVar.ae = j.a(jSONObject, "empty_info");
        bVar.aY = j.a(jSONObject, "add_card_tip");
        bVar.aq = j.a(jSONObject, "pan");
        return i;
    }

    public static boolean c(com.unionpay.mobile.android.model.b bVar, JSONObject jSONObject) {
        bVar.aF = null;
        bVar.aF = j.c(jSONObject, "cardExpireMsgBox");
        if (bVar.aF == null) {
            bVar.aF = j.c(jSONObject, "openByCounterMsgBox");
        }
        if (bVar.aF == null) {
            bVar.aF = j.c(jSONObject, "restrictPayMsgBox");
        }
        if (bVar.aF != null) {
            bVar.aG = j.a(bVar.aF, "title");
            bVar.aH = j.a(bVar.aF, "text");
            JSONObject c = j.c(bVar.aF, "func");
            JSONObject c2 = j.c(bVar.aF, "cancel");
            bVar.aK = j.a(c, "label");
            bVar.aL = j.a(c, "action");
            bVar.aI = j.a(c2, "label");
            bVar.aJ = j.a(c2, "action");
            return true;
        }
        return false;
    }
}
