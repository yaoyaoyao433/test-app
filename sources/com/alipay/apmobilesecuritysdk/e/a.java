package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static b a(String str) {
        try {
            if (com.alipay.security.mobile.module.a.a.a(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new b(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString(DeviceInfo.TM));
        } catch (Exception e) {
            com.alipay.apmobilesecuritysdk.c.a.a(e);
            return null;
        }
    }

    public static synchronized void a() {
        synchronized (a.class) {
        }
    }

    public static synchronized void a(Context context) {
        synchronized (a.class) {
            com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", AppUtil.CacheKey.DEVICEID, "");
            com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx", "");
        }
    }

    public static synchronized void a(Context context, b bVar) {
        synchronized (a.class) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("apdid", bVar.a);
                jSONObject.put("deviceInfoHash", bVar.b);
                jSONObject.put(DeviceInfo.TM, bVar.c);
                String jSONObject2 = jSONObject.toString();
                com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", AppUtil.CacheKey.DEVICEID, jSONObject2);
                com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx", jSONObject2);
            } catch (Exception e) {
                com.alipay.apmobilesecuritysdk.c.a.a(e);
            }
        }
    }

    public static synchronized b b() {
        synchronized (a.class) {
            String a = com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx");
            if (com.alipay.security.mobile.module.a.a.a(a)) {
                return null;
            }
            return a(a);
        }
    }

    public static synchronized b b(Context context) {
        b a;
        synchronized (a.class) {
            String a2 = com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", AppUtil.CacheKey.DEVICEID);
            if (com.alipay.security.mobile.module.a.a.a(a2)) {
                a2 = com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx");
            }
            a = a(a2);
        }
        return a;
    }

    public static synchronized b c(Context context) {
        synchronized (a.class) {
            String a = com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", AppUtil.CacheKey.DEVICEID);
            if (com.alipay.security.mobile.module.a.a.a(a)) {
                return null;
            }
            return a(a);
        }
    }
}
