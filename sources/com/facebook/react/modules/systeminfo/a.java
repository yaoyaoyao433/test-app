package com.facebook.react.modules.systeminfo;

import android.os.Build;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class a {
    private static final String a = "a";
    private static String b;

    private static boolean b() {
        return Build.FINGERPRINT.contains("vbox");
    }

    public static String a(Integer num) {
        int intValue = num.intValue();
        String c = c();
        if (c.equals("")) {
            if (b()) {
                c = "10.0.3.2";
            } else {
                c = Build.FINGERPRINT.contains("generic") ? "10.0.2.2" : "localhost";
            }
        }
        return String.format(Locale.US, "%s:%d", c, Integer.valueOf(intValue));
    }

    public static String a() {
        if (b()) {
            return Build.MODEL;
        }
        return Build.MODEL + " - " + Build.VERSION.RELEASE + " - API " + Build.VERSION.SDK_INT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (r2 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        r2.destroy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
        if (r2 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006b, code lost:
        r1 = com.facebook.react.modules.systeminfo.a.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006e, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static synchronized java.lang.String c() {
        /*
            java.lang.Class<com.facebook.react.modules.systeminfo.a> r0 = com.facebook.react.modules.systeminfo.a.class
            monitor-enter(r0)
            java.lang.String r1 = com.facebook.react.modules.systeminfo.a.b     // Catch: java.lang.Throwable -> L7b
            if (r1 == 0) goto Lb
            java.lang.String r1 = com.facebook.react.modules.systeminfo.a.b     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r0)
            return r1
        Lb:
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L55
            java.lang.String r3 = "/system/bin/getprop"
            java.lang.String r4 = "metro.host"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L55
            java.lang.Process r2 = r2.exec(r3)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L55
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L4f java.lang.Throwable -> L6f
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L4f java.lang.Throwable -> L6f
            java.io.InputStream r5 = r2.getInputStream()     // Catch: java.lang.Exception -> L4f java.lang.Throwable -> L6f
            java.lang.String r6 = "UTF-8"
            java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r6)     // Catch: java.lang.Exception -> L4f java.lang.Throwable -> L6f
            r4.<init>(r5, r6)     // Catch: java.lang.Exception -> L4f java.lang.Throwable -> L6f
            r3.<init>(r4)     // Catch: java.lang.Exception -> L4f java.lang.Throwable -> L6f
            java.lang.String r1 = ""
        L32:
            java.lang.String r4 = r3.readLine()     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L4a
            if (r4 == 0) goto L3a
            r1 = r4
            goto L32
        L3a:
            com.facebook.react.modules.systeminfo.a.b = r1     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L4a
            r3.close()     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L7b
        L3f:
            if (r2 == 0) goto L6b
        L41:
            r2.destroy()     // Catch: java.lang.Throwable -> L7b
            goto L6b
        L45:
            r1 = move-exception
            r7 = r3
            r3 = r1
            r1 = r7
            goto L70
        L4a:
            r1 = move-exception
            r7 = r3
            r3 = r1
            r1 = r7
            goto L58
        L4f:
            r3 = move-exception
            goto L58
        L51:
            r2 = move-exception
            r3 = r2
            r2 = r1
            goto L70
        L55:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L58:
            java.lang.String r4 = com.facebook.react.modules.systeminfo.a.a     // Catch: java.lang.Throwable -> L6f
            java.lang.String r5 = "Failed to query for metro.host prop:"
            com.facebook.common.logging.a.c(r4, r5, r3)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r3 = ""
            com.facebook.react.modules.systeminfo.a.b = r3     // Catch: java.lang.Throwable -> L6f
            if (r1 == 0) goto L68
            r1.close()     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> L7b
        L68:
            if (r2 == 0) goto L6b
            goto L41
        L6b:
            java.lang.String r1 = com.facebook.react.modules.systeminfo.a.b     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r0)
            return r1
        L6f:
            r3 = move-exception
        L70:
            if (r1 == 0) goto L75
            r1.close()     // Catch: java.lang.Exception -> L75 java.lang.Throwable -> L7b
        L75:
            if (r2 == 0) goto L7a
            r2.destroy()     // Catch: java.lang.Throwable -> L7b
        L7a:
            throw r3     // Catch: java.lang.Throwable -> L7b
        L7b:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.systeminfo.a.c():java.lang.String");
    }
}
