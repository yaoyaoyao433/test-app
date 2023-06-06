package com.alipay.sdk.packet.impl;

import android.content.Context;
import com.alipay.sdk.net.a;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d extends com.alipay.sdk.packet.e {
    @Override // com.alipay.sdk.packet.e
    public final String a(com.alipay.sdk.sys.a aVar, String str, JSONObject jSONObject) {
        return str;
    }

    @Override // com.alipay.sdk.packet.e
    public final Map<String, String> a(boolean z, String str) {
        return new HashMap();
    }

    @Override // com.alipay.sdk.packet.e
    public final JSONObject a() {
        return null;
    }

    @Override // com.alipay.sdk.packet.e
    public final com.alipay.sdk.packet.b a(com.alipay.sdk.sys.a aVar, Context context, String str) throws Throwable {
        com.alipay.sdk.util.d.b("mspl", "mdap post");
        byte[] a = com.alipay.sdk.encrypt.b.a(str.getBytes(Charset.forName("UTF-8")));
        HashMap hashMap = new HashMap();
        hashMap.put("utdId", com.alipay.sdk.sys.b.a().c());
        hashMap.put("logHeader", "RAW");
        hashMap.put("bizCode", "alipaysdk");
        hashMap.put("productId", "alipaysdk_android");
        hashMap.put("Content-Encoding", "Gzip");
        hashMap.put("productVersion", "15.8.02");
        a.b a2 = com.alipay.sdk.net.a.a(context, new a.C0028a("https://loggw-exsdk.alipay.com/loggw/logUpload.do", hashMap, a));
        com.alipay.sdk.util.d.b("mspl", "mdap got " + a2);
        if (a2 != null) {
            boolean a3 = com.alipay.sdk.packet.e.a(a2);
            try {
                byte[] bArr = a2.c;
                if (a3) {
                    bArr = com.alipay.sdk.encrypt.b.b(bArr);
                }
                return new com.alipay.sdk.packet.b("", new String(bArr, Charset.forName("UTF-8")));
            } catch (Exception e) {
                com.alipay.sdk.util.d.a(e);
                return null;
            }
        }
        throw new RuntimeException("Response is null");
    }
}
