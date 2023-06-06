package com.meituan.android.paycommon.lib.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class m {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        HashMap<String, String> getExtendTransmissionParams();

        String getExtraData();

        String getExtraStatics();

        String getMerchantNo();

        String getTradeNo();
    }

    public static void a(a aVar, HashMap<String, ? super String> hashMap) {
        Object[] objArr = {aVar, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4da51ea22f155eddb28bc3b011fcc395", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4da51ea22f155eddb28bc3b011fcc395");
        } else if (aVar == null || hashMap == null) {
        } else {
            c(aVar, hashMap);
            b(aVar, hashMap);
        }
    }

    private static void c(a aVar, HashMap<String, ? super String> hashMap) {
        Object[] objArr = {aVar, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e12371fd01938a4ff802bf67906c9b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e12371fd01938a4ff802bf67906c9b8");
        } else {
            hashMap.put("payExtendParams", a(hashMap.get("payExtendParams") != null ? hashMap.get("payExtendParams") : "", "outer_business_params", a(aVar)));
        }
    }

    private static String a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "718ce362ab15fe98c9389fa89f9bdfbd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "718ce362ab15fe98c9389fa89f9bdfbd");
        }
        if (aVar == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tradeno", aVar.getTradeNo());
            jSONObject.put("extra_data", aVar.getExtraData());
            jSONObject.put("merchant_no", aVar.getMerchantNo());
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "OuterBusinessParamUtils_getTunnelExtraData", (Map<String, Object>) null);
        }
        return jSONObject.toString();
    }

    private static String a(String str, String str2, String str3) {
        JSONObject jSONObject;
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8271a6352f4d25dd29e655065a4f53b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8271a6352f4d25dd29e655065a4f53b8");
        }
        if (TextUtils.isEmpty(str)) {
            jSONObject = new JSONObject();
        } else {
            try {
                jSONObject = new JSONObject(str);
            } catch (Exception e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "OuterBusinessParamUtils_appendTransmissionParams", (Map<String, Object>) null);
                jSONObject = null;
            }
        }
        if (jSONObject == null) {
            return str;
        }
        JSONObject jSONObject2 = new JSONObject();
        String optString = jSONObject.optString("transmission_param");
        if (!TextUtils.isEmpty(optString)) {
            try {
                jSONObject2 = new JSONObject(optString);
            } catch (Exception e2) {
                com.meituan.android.paybase.common.analyse.a.a(e2, "OuterBusinessParamUtils_appendTransmissionParams", (Map<String, Object>) null);
            }
        }
        try {
            jSONObject2.put(str2, str3);
            jSONObject.put("transmission_param", jSONObject2.toString());
        } catch (Exception e3) {
            com.meituan.android.paybase.common.analyse.a.a(e3, "OuterBusinessParamUtils_appendTransmissionParams", (Map<String, Object>) null);
        }
        return jSONObject.toString();
    }

    public static void b(a aVar, HashMap<String, ? super String> hashMap) {
        JSONObject jSONObject;
        Object[] objArr = {aVar, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c307737d828ad3c09956bda8f600687", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c307737d828ad3c09956bda8f600687");
        } else if (aVar == null || hashMap == null) {
        } else {
            if (!hashMap.containsKey("outer_business_data") && !TextUtils.isEmpty(aVar.getExtraData())) {
                hashMap.put("outer_business_data", aVar.getExtraData());
            }
            if (TextUtils.isEmpty(aVar.getExtraStatics())) {
                return;
            }
            HashMap<String, String> extendTransmissionParams = aVar.getExtendTransmissionParams();
            if (!com.meituan.android.paybase.utils.i.a(extendTransmissionParams)) {
                hashMap.putAll(extendTransmissionParams);
            }
            if (hashMap.containsKey("ext_dim_stat")) {
                try {
                    jSONObject = new JSONObject(hashMap.get("ext_dim_stat"));
                } catch (Exception e) {
                    com.meituan.android.paybase.common.analyse.a.a(e, "OuterBusinessParamUtils_appendExtraParams", (Map<String, Object>) null);
                    jSONObject = new JSONObject();
                }
            } else {
                jSONObject = new JSONObject();
            }
            try {
                jSONObject.put("outer_business_statics", aVar.getExtraStatics());
                hashMap.put("ext_dim_stat", jSONObject.toString());
            } catch (Exception e2) {
                com.meituan.android.paybase.common.analyse.a.a(e2, "OuterBusinessParamUtils_appendExtraParams", (Map<String, Object>) null);
            }
        }
    }
}
