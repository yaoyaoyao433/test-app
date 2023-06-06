package com.alipay.sdk.packet.impl;

import android.content.Context;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c extends com.alipay.sdk.packet.e {
    @Override // com.alipay.sdk.packet.e
    public final String a(com.alipay.sdk.sys.a aVar, String str, JSONObject jSONObject) {
        return str;
    }

    @Override // com.alipay.sdk.packet.e
    public final Map<String, String> a(boolean z, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("msp-gzip", String.valueOf(z));
        hashMap.put("content-type", "application/octet-stream");
        hashMap.put("des-mode", "CBC");
        return hashMap;
    }

    @Override // com.alipay.sdk.packet.e
    public final JSONObject a() throws JSONException {
        return null;
    }

    @Override // com.alipay.sdk.packet.e
    public final String c() throws JSONException {
        HashMap hashMap = new HashMap();
        hashMap.put("api_name", "/sdk/log");
        hashMap.put(KnbConstants.PARAMS_API_VERSION, "1.0.0");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("log_v", "1.0");
        return com.alipay.sdk.packet.e.a(hashMap, hashMap2);
    }

    @Override // com.alipay.sdk.packet.e
    public final com.alipay.sdk.packet.b a(com.alipay.sdk.sys.a aVar, Context context, String str) throws Throwable {
        return a(aVar, context, str, "https://mcgw.alipay.com/sdklog.do", true);
    }
}
