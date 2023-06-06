package com.ta.utdid2.a.a;

import android.content.Context;
import android.text.TextUtils;
import com.sankuai.meituan.takeoutnew.util.aop.l;
import java.util.Random;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class e {
    public static String a() {
        int nextInt = new Random().nextInt();
        int nextInt2 = new Random().nextInt();
        byte[] bytes = d.getBytes((int) (System.currentTimeMillis() / 1000));
        byte[] bytes2 = d.getBytes((int) System.nanoTime());
        byte[] bytes3 = d.getBytes(nextInt);
        byte[] bytes4 = d.getBytes(nextInt2);
        byte[] bArr = new byte[16];
        System.arraycopy(bytes, 0, bArr, 0, 4);
        System.arraycopy(bytes2, 0, bArr, 4, 4);
        System.arraycopy(bytes3, 0, bArr, 8, 4);
        System.arraycopy(bytes4, 0, bArr, 12, 4);
        return b.encodeToString(bArr, 2);
    }

    public static String b(Context context) {
        try {
            String a = l.a(context.getContentResolver(), "android_id");
            try {
                return (TextUtils.isEmpty(a) || a.equalsIgnoreCase("a5f5faddde9e9f02") || a.equalsIgnoreCase("8e17f7422b35fbea")) ? "" : a.equalsIgnoreCase("0000000000000000") ? "" : a;
            } catch (Throwable unused) {
                return a;
            }
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static String c() {
        try {
            return (String) Class.forName("com.yunos.baseservice.clouduuid.CloudUUID").getMethod("getCloudUUID", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c(android.content.Context r1) {
        /*
            if (r1 == 0) goto L11
            java.lang.String r0 = "phone"
            java.lang.Object r1 = r1.getSystemService(r0)     // Catch: java.lang.Exception -> L11
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch: java.lang.Exception -> L11
            if (r1 == 0) goto L11
            java.lang.String r1 = com.meituan.android.privacy.aop.d.e(r1)     // Catch: java.lang.Exception -> L11
            goto L12
        L11:
            r1 = 0
        L12:
            boolean r0 = com.ta.utdid2.a.a.g.m29a(r1)
            if (r0 == 0) goto L1c
            java.lang.String r1 = a()
        L1c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.utdid2.a.a.e.c(android.content.Context):java.lang.String");
    }

    public static String b() {
        String str = h.get("ro.aliyun.clouduuid", "");
        if (TextUtils.isEmpty(str)) {
            str = h.get("ro.sys.aliyun.clouduuid", "");
        }
        return TextUtils.isEmpty(str) ? c() : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r2) {
        /*
            boolean r0 = com.ta.utdid2.a.a.c.a()
            if (r0 != 0) goto L17
            if (r2 == 0) goto L17
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r2.getSystemService(r0)     // Catch: java.lang.Exception -> L17
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: java.lang.Exception -> L17
            if (r0 == 0) goto L17
            java.lang.String r0 = com.meituan.android.privacy.aop.d.a(r0)     // Catch: java.lang.Exception -> L17
            goto L18
        L17:
            r0 = 0
        L18:
            boolean r1 = com.ta.utdid2.a.a.g.m29a(r0)
            if (r1 == 0) goto L22
            java.lang.String r0 = b()
        L22:
            boolean r1 = com.ta.utdid2.a.a.g.m29a(r0)
            if (r1 == 0) goto L2c
            java.lang.String r0 = b(r2)
        L2c:
            boolean r2 = com.ta.utdid2.a.a.g.m29a(r0)
            if (r2 == 0) goto L36
            java.lang.String r0 = a()
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.utdid2.a.a.e.a(android.content.Context):java.lang.String");
    }
}
