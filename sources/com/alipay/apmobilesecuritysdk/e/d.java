package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    public static c a(String str) {
        try {
            if (com.alipay.security.mobile.module.a.a.a(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new c(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString(DeviceInfo.TM), jSONObject.optString("tid"), jSONObject.optString("utdid"));
        } catch (Exception e) {
            com.alipay.apmobilesecuritysdk.c.a.a(e);
            return null;
        }
    }

    public static synchronized void a() {
        synchronized (d.class) {
        }
    }

    public static synchronized void a(Context context) {
        synchronized (d.class) {
            com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v4", "key_deviceid_v4", "");
            com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v4", "key_wxcasxx_v4", "");
        }
    }

    public static synchronized void a(Context context, c cVar) {
        synchronized (d.class) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("apdid", cVar.a);
                jSONObject.put("deviceInfoHash", cVar.b);
                jSONObject.put(DeviceInfo.TM, cVar.c);
                jSONObject.put("tid", cVar.d);
                jSONObject.put("utdid", cVar.e);
                String jSONObject2 = jSONObject.toString();
                com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v4", "key_deviceid_v4", jSONObject2);
                com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v4", "key_wxcasxx_v4", jSONObject2);
            } catch (Exception e) {
                com.alipay.apmobilesecuritysdk.c.a.a(e);
            }
        }
    }

    public static synchronized c b() {
        synchronized (d.class) {
            String a = com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v4", "key_wxcasxx_v4");
            if (com.alipay.security.mobile.module.a.a.a(a)) {
                return null;
            }
            return a(a);
        }
    }

    public static synchronized c b(Context context) {
        c a;
        synchronized (d.class) {
            String a2 = com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v4", "key_deviceid_v4");
            if (com.alipay.security.mobile.module.a.a.a(a2)) {
                a2 = com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v4", "key_wxcasxx_v4");
            }
            a = a(a2);
        }
        return a;
    }

    public static synchronized c c(Context context) {
        synchronized (d.class) {
            String a = com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v4", "key_deviceid_v4");
            if (com.alipay.security.mobile.module.a.a.a(a)) {
                return null;
            }
            return a(a);
        }
    }
}
