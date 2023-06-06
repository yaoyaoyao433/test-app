package com.alipay.apmobilesecuritysdk.f;

import android.content.Context;
import android.os.Environment;
import com.alipay.security.mobile.module.c.e;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class a {
    public static String a(Context context, String str, String str2) {
        if (context == null || com.alipay.security.mobile.module.a.a.a(str) || com.alipay.security.mobile.module.a.a.a(str2)) {
            return null;
        }
        try {
            String a = e.a(context, str, str2, "");
            if (com.alipay.security.mobile.module.a.a.a(a)) {
                return null;
            }
            return com.alipay.security.mobile.module.a.a.c.b(com.alipay.security.mobile.module.a.a.c.a(), a);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String a(String str, String str2) {
        synchronized (a.class) {
            if (com.alipay.security.mobile.module.a.a.a(str) || com.alipay.security.mobile.module.a.a.a(str2)) {
                return null;
            }
            String a = com.alipay.security.mobile.module.c.b.a(str);
            if (com.alipay.security.mobile.module.a.a.a(a)) {
                return null;
            }
            String string = new JSONObject(a).getString(str2);
            if (com.alipay.security.mobile.module.a.a.a(string)) {
                return null;
            }
            return com.alipay.security.mobile.module.a.a.c.b(com.alipay.security.mobile.module.a.a.c.a(), string);
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        if (com.alipay.security.mobile.module.a.a.a(str) || com.alipay.security.mobile.module.a.a.a(str2) || context == null) {
            return;
        }
        try {
            String a = com.alipay.security.mobile.module.a.a.c.a(com.alipay.security.mobile.module.a.a.c.a(), str3);
            HashMap hashMap = new HashMap();
            hashMap.put(str2, a);
            e.a(context, str, hashMap);
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, String str2, String str3) {
        synchronized (a.class) {
            if (com.alipay.security.mobile.module.a.a.a(str) || com.alipay.security.mobile.module.a.a.a(str2)) {
                return;
            }
            try {
                String a = com.alipay.security.mobile.module.c.b.a(str);
                JSONObject jSONObject = new JSONObject();
                if (com.alipay.security.mobile.module.a.a.b(a)) {
                    try {
                        jSONObject = new JSONObject(a);
                    } catch (Exception unused) {
                        jSONObject = new JSONObject();
                    }
                }
                jSONObject.put(str2, com.alipay.security.mobile.module.a.a.c.a(com.alipay.security.mobile.module.a.a.c.a(), str3));
                try {
                    System.clearProperty(str);
                } catch (Throwable unused2) {
                }
                if (com.alipay.security.mobile.module.c.c.a()) {
                    String str4 = ".SystemConfig" + File.separator + str;
                    if (com.alipay.security.mobile.module.c.c.a()) {
                        File file = new File(Environment.getExternalStorageDirectory(), str4);
                        if (file.exists() && file.isFile()) {
                            file.delete();
                        }
                    }
                }
            } catch (Throwable unused3) {
            }
        }
    }
}
