package com.alipay.sdk.tid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alipay.sdk.encrypt.e;
import com.alipay.sdk.util.d;
import com.huawei.hms.api.ConnectionResult;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import java.util.Random;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static Context a;
    public static a b;
    public String c;
    public String d;
    public long e;
    public String f;
    public String g;
    public boolean h = false;

    public static synchronized a a(Context context) {
        a aVar;
        synchronized (a.class) {
            if (b == null) {
                b = new a();
            }
            if (a == null) {
                a aVar2 = b;
                if (context != null) {
                    a = context.getApplicationContext();
                }
                if (!aVar2.h) {
                    aVar2.h = true;
                    aVar2.a();
                }
            }
            aVar = b;
        }
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a() {
        /*
            r9 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 0
            java.lang.String r2 = "alipay_tid_storage"
            java.lang.String r3 = "tidinfo"
            r4 = 1
            java.lang.String r2 = com.alipay.sdk.tid.a.C0030a.a(r2, r3, r4)     // Catch: java.lang.Exception -> L62
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L62
            if (r3 != 0) goto L5d
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L62
            r3.<init>(r2)     // Catch: java.lang.Exception -> L62
            java.lang.String r2 = "tid"
            java.lang.String r4 = ""
            java.lang.String r2 = r3.optString(r2, r4)     // Catch: java.lang.Exception -> L62
            java.lang.String r4 = "client_key"
            java.lang.String r5 = ""
            java.lang.String r4 = r3.optString(r4, r5)     // Catch: java.lang.Exception -> L5a
            java.lang.String r5 = "timestamp"
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L57
            long r5 = r3.optLong(r5, r6)     // Catch: java.lang.Exception -> L57
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Exception -> L57
            java.lang.String r0 = "vimei"
            java.lang.String r6 = ""
            java.lang.String r0 = r3.optString(r0, r6)     // Catch: java.lang.Exception -> L54
            java.lang.String r6 = "vimsi"
            java.lang.String r7 = ""
            java.lang.String r3 = r3.optString(r6, r7)     // Catch: java.lang.Exception -> L4f
            r1 = r3
            goto L6c
        L4f:
            r3 = move-exception
            r8 = r5
            r5 = r0
            r0 = r8
            goto L66
        L54:
            r3 = move-exception
            r0 = r5
            goto L58
        L57:
            r3 = move-exception
        L58:
            r5 = r1
            goto L66
        L5a:
            r3 = move-exception
            r4 = r1
            goto L65
        L5d:
            r5 = r0
            r0 = r1
            r2 = r0
            r4 = r2
            goto L6c
        L62:
            r3 = move-exception
            r2 = r1
            r4 = r2
        L65:
            r5 = r4
        L66:
            com.alipay.sdk.util.d.a(r3)
            r8 = r5
            r5 = r0
            r0 = r8
        L6c:
            java.lang.String r3 = "mspl"
            java.lang.String r6 = "tid_str: load"
            com.alipay.sdk.util.d.a(r3, r6)
            boolean r3 = a(r2, r4, r0, r1)
            if (r3 == 0) goto L7d
            r9.b()
            return
        L7d:
            r9.c = r2
            r9.d = r4
            long r2 = r5.longValue()
            r9.e = r2
            r9.f = r0
            r9.g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.tid.a.a():void");
    }

    private void b() {
        this.c = "";
        this.d = e();
        this.e = System.currentTimeMillis();
        this.f = c();
        this.g = c();
        C0030a.a("alipay_tid_storage", "tidinfo");
    }

    private static String c() {
        String hexString = Long.toHexString(System.currentTimeMillis());
        Random random = new Random();
        return hexString + (random.nextInt(ConnectionResult.NETWORK_ERROR) + 1000);
    }

    private void d() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tid", this.c);
            jSONObject.put("client_key", this.d);
            jSONObject.put(DeviceInfo.TM, this.e);
            jSONObject.put("vimei", this.f);
            jSONObject.put("vimsi", this.g);
            String jSONObject2 = jSONObject.toString();
            if (a != null) {
                SharedPreferences sharedPreferences = a.getSharedPreferences("alipay_tid_storage", 0);
                String a2 = C0030a.a();
                String a3 = e.a(a2, jSONObject2, jSONObject2);
                if (TextUtils.isEmpty(a3)) {
                    String.format("LocalPreference::putLocalPreferences failed %s，%s", jSONObject2, a2);
                }
                sharedPreferences.edit().putString("tidinfo", a3).apply();
            }
        } catch (Exception e) {
            d.a(e);
        }
    }

    private static boolean a(String str, String str2, String str3, String str4) {
        return TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4);
    }

    private static String e() {
        String hexString = Long.toHexString(System.currentTimeMillis());
        return hexString.length() > 10 ? hexString.substring(hexString.length() - 10) : hexString;
    }

    public final void a(String str, String str2) {
        d.a("mspl", "tid_str: save");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.c = str;
        this.d = str2;
        this.e = System.currentTimeMillis();
        d();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.alipay.sdk.tid.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0030a {
        public static void a(String str, String str2) {
            if (a.a == null) {
                return;
            }
            a.a.getSharedPreferences(str, 0).edit().remove(str2).apply();
        }

        public static String a(String str, String str2, boolean z) {
            if (a.a == null) {
                return null;
            }
            String string = a.a.getSharedPreferences(str, 0).getString(str2, null);
            if (!TextUtils.isEmpty(string)) {
                string = e.b(a(), string, string);
                if (TextUtils.isEmpty(string)) {
                    d.a("mspl", "tid_str: pref failed");
                }
            }
            d.a("mspl", "tid_str: from local");
            return string;
        }

        public static String a() {
            String str = "";
            try {
                str = a.a.getApplicationContext().getPackageName();
            } catch (Throwable th) {
                d.a(th);
            }
            return (str + "0000000000000000000000000000").substring(0, 24);
        }
    }
}
