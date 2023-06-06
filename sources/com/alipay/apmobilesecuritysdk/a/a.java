package com.alipay.apmobilesecuritysdk.a;

import android.content.Context;
import android.os.Environment;
import com.alipay.apmobilesecuritysdk.d.e;
import com.alipay.apmobilesecuritysdk.e.b;
import com.alipay.apmobilesecuritysdk.e.g;
import com.alipay.apmobilesecuritysdk.e.h;
import com.alipay.apmobilesecuritysdk.e.i;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import com.alipay.security.mobile.module.http.model.c;
import com.alipay.security.mobile.module.http.model.d;
import com.meituan.robust.common.StringUtil;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public Context a;
    public com.alipay.apmobilesecuritysdk.b.a b = com.alipay.apmobilesecuritysdk.b.a.a();
    public int c = 4;

    public a(Context context) {
        this.a = context;
    }

    public static String a(Context context) {
        String b = b(context);
        return com.alipay.security.mobile.module.a.a.a(b) ? h.f(context) : b;
    }

    public static String a(Context context, String str) {
        try {
            b();
            String a = i.a(str);
            if (com.alipay.security.mobile.module.a.a.a(a)) {
                String a2 = g.a(context, str);
                i.a(str, a2);
                return !com.alipay.security.mobile.module.a.a.a(a2) ? a2 : "";
            }
            return a;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String[] strArr = {"2017-01-27 2017-01-28", "2017-11-10 2017-11-11", "2017-12-11 2017-12-12"};
        int random = ((int) (Math.random() * 24.0d * 60.0d * 60.0d)) * 1;
        for (int i = 0; i < 3; i++) {
            try {
                String[] split = strArr[i].split(StringUtil.SPACE);
                if (split != null && split.length == 2) {
                    Date date = new Date();
                    Date parse = simpleDateFormat.parse(split[0] + " 00:00:00");
                    Date parse2 = simpleDateFormat.parse(split[1] + " 23:59:59");
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(parse2);
                    calendar.add(13, random);
                    Date time = calendar.getTime();
                    if (date.after(parse) && date.before(time)) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private c b(Map<String, String> map) {
        b b;
        b c;
        try {
            Context context = this.a;
            d dVar = new d();
            String a = com.alipay.security.mobile.module.a.a.a(map, "appName", "");
            String a2 = com.alipay.security.mobile.module.a.a.a(map, "sessionId", "");
            String a3 = com.alipay.security.mobile.module.a.a.a(map, "rpcVersion", "");
            String a4 = a(context, a);
            String securityToken = UmidSdkWrapper.getSecurityToken(context);
            String d = h.d(context);
            if (com.alipay.security.mobile.module.a.a.b(a2)) {
                dVar.c = a2;
            } else {
                dVar.c = a4;
            }
            dVar.d = securityToken;
            dVar.e = d;
            dVar.a = "android";
            String str = "";
            String str2 = "";
            String str3 = "";
            String str4 = "";
            com.alipay.apmobilesecuritysdk.e.c c2 = com.alipay.apmobilesecuritysdk.e.d.c(context);
            if (c2 != null) {
                str2 = c2.a;
                str3 = c2.c;
            }
            if (com.alipay.security.mobile.module.a.a.a(str2) && (c = com.alipay.apmobilesecuritysdk.e.a.c(context)) != null) {
                str2 = c.a;
                str3 = c.c;
            }
            com.alipay.apmobilesecuritysdk.e.c b2 = com.alipay.apmobilesecuritysdk.e.d.b();
            if (b2 != null) {
                str = b2.a;
                str4 = b2.c;
            }
            if (com.alipay.security.mobile.module.a.a.a(str) && (b = com.alipay.apmobilesecuritysdk.e.a.b()) != null) {
                str = b.a;
                str4 = b.c;
            }
            dVar.h = str2;
            dVar.g = str;
            dVar.j = a3;
            if (com.alipay.security.mobile.module.a.a.a(str2)) {
                dVar.b = str;
                str3 = str4;
            } else {
                dVar.b = str2;
            }
            dVar.i = str3;
            dVar.f = e.a(context, map);
            return com.alipay.security.mobile.module.http.d.b(this.a, this.b.c()).a(dVar);
        } catch (Throwable th) {
            th.printStackTrace();
            com.alipay.apmobilesecuritysdk.c.a.a(th);
            return null;
        }
    }

    public static String b(Context context) {
        try {
            String b = i.b();
            if (com.alipay.security.mobile.module.a.a.a(b)) {
                com.alipay.apmobilesecuritysdk.e.c b2 = com.alipay.apmobilesecuritysdk.e.d.b(context);
                if (b2 != null) {
                    i.a(b2);
                    String str = b2.a;
                    if (com.alipay.security.mobile.module.a.a.b(str)) {
                        return str;
                    }
                }
                b b3 = com.alipay.apmobilesecuritysdk.e.a.b(context);
                if (b3 != null) {
                    i.a(b3);
                    String str2 = b3.a;
                    return com.alipay.security.mobile.module.a.a.b(str2) ? str2 : "";
                }
                return "";
            }
            return b;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void b() {
        try {
            String[] strArr = {"device_feature_file_name", "wallet_times", "wxcasxx_v3", "wxcasxx_v4", "wxxzyy_v1"};
            for (int i = 0; i < 5; i++) {
                String str = strArr[i];
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                File file = new File(externalStorageDirectory, ".SystemConfig/" + str);
                if (file.exists() && file.canWrite()) {
                    file.delete();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0077, code lost:
        if (com.alipay.security.mobile.module.a.a.a(r1, com.alipay.apmobilesecuritysdk.e.i.d()) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0087, code lost:
        if (com.alipay.security.mobile.module.a.a.a(r4, com.alipay.apmobilesecuritysdk.e.i.e()) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c1, code lost:
        if (com.alipay.security.mobile.module.a.a.a(b(r8.a)) != false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0229 A[Catch: Exception -> 0x0270, TryCatch #0 {Exception -> 0x0270, blocks: (B:2:0x0000, B:4:0x003c, B:6:0x0044, B:8:0x0058, B:10:0x006f, B:12:0x0079, B:14:0x007f, B:16:0x0089, B:18:0x0091, B:20:0x009d, B:30:0x00c6, B:71:0x020e, B:73:0x0229, B:75:0x022f, B:77:0x0235, B:81:0x023e, B:83:0x0244, B:33:0x00da, B:35:0x00f4, B:37:0x00f8, B:41:0x0103, B:47:0x0114, B:48:0x0124, B:50:0x012b, B:54:0x013d, B:57:0x0152, B:59:0x0197, B:61:0x01a1, B:63:0x01a9, B:65:0x01bb, B:67:0x01c5, B:69:0x01cd, B:68:0x01c9, B:62:0x01a5, B:23:0x00aa, B:26:0x00b7), top: B:89:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.apmobilesecuritysdk.a.a.a(java.util.Map):int");
    }
}
