package com.huawei.hms.hatool;

import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class v {
    public static c1 a(String str, String str2) {
        c1 c1Var = new c1();
        c1Var.a(x0.a().a(str, str2));
        return c1Var;
    }

    public static d1 a(String str, String str2, String str3, String str4) {
        d1 d1Var = new d1();
        d1Var.a(str);
        d1Var.b(b.c());
        d1Var.e(str2);
        d1Var.c(str4);
        StringBuffer stringBuffer = new StringBuffer("hmshi");
        stringBuffer.append(str3);
        stringBuffer.append("qrt");
        d1Var.d(stringBuffer.toString());
        return d1Var;
    }

    public static e1 a(String str, String str2, String str3) {
        e1 e1Var = new e1();
        e1Var.c(b.g());
        e1Var.e(b.i());
        e1Var.a(str3);
        e1Var.b(x0.a().b(str2, str));
        return e1Var;
    }

    public static r a() {
        y.c("hmsSdk", "generate UploadData EventModelHandlerBase");
        x.f().d();
        if (TextUtils.isEmpty(x.f().a())) {
            y.f("hmsSdk", "event chifer is empty");
            return null;
        }
        return new r(x.f().c());
    }

    public static Map<String, String> b(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("App-Id", b.c());
        hashMap.put("App-Ver", b.d());
        hashMap.put("Sdk-Name", "hianalytics");
        hashMap.put("Sdk-Ver", "2.2.0.308");
        hashMap.put("Device-Type", Build.MODEL);
        hashMap.put("servicetag", str);
        y.a("hmsSdk", "sendData RequestId : %s", str2);
        hashMap.put("Request-Id", str2);
        return hashMap;
    }
}
