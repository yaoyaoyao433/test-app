package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import com.xiaomi.push.hd;
import com.xiaomi.push.he;
import com.xiaomi.push.hl;
import com.xiaomi.push.ia;
import com.xiaomi.push.ik;
import com.xiaomi.push.jr;
import java.text.SimpleDateFormat;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes6.dex */
public final class az {
    private static AtomicLong a = new AtomicLong(0);
    private static SimpleDateFormat b;
    private static String c;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        b = simpleDateFormat;
        c = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
    }

    public static synchronized String a() {
        String str;
        synchronized (az.class) {
            String format = b.format(Long.valueOf(System.currentTimeMillis()));
            if (!TextUtils.equals(c, format)) {
                a.set(0L);
                c = format;
            }
            str = format + CommonConstant.Symbol.MINUS + a.incrementAndGet();
        }
        return str;
    }

    public static boolean a(he heVar, boolean z) {
        String str;
        if (heVar == null) {
            str = "item is null, verfiy ClientUploadDataItem failed.";
        } else if (!z && TextUtils.isEmpty(heVar.a)) {
            str = "item.channel is null or empty, verfiy ClientUploadDataItem failed.";
        } else if (TextUtils.isEmpty(heVar.g)) {
            str = "item.category is null or empty, verfiy ClientUploadDataItem failed.";
        } else if (TextUtils.isEmpty(heVar.c)) {
            str = "item.name is null or empty, verfiy ClientUploadDataItem failed.";
        } else if (!com.xiaomi.push.ar.d(heVar.g)) {
            str = "item.category can only contain ascii char, verfiy ClientUploadDataItem failed.";
        } else if (!com.xiaomi.push.ar.d(heVar.c)) {
            str = "item.name can only contain ascii char, verfiy ClientUploadDataItem failed.";
        } else if (heVar.b == null || heVar.b.length() <= 10240) {
            return false;
        } else {
            str = "item.data is too large(" + heVar.b.length() + "), max size for data is 10240 , verfiy ClientUploadDataItem failed.";
        }
        com.xiaomi.channel.commonutils.logger.c.a(str);
        return true;
    }

    public static boolean a(String str) {
        return !jr.d() || "com.miui.hybrid".equals(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList<com.xiaomi.push.ia> a(java.util.List<com.xiaomi.push.he> r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            r0 = 0
            if (r10 != 0) goto L9
            java.lang.String r10 = "requests can not be null in TinyDataHelper.transToThriftObj()."
        L5:
            com.xiaomi.channel.commonutils.logger.c.d(r10)
            return r0
        L9:
            int r1 = r10.size()
            if (r1 != 0) goto L12
            java.lang.String r10 = "requests.length is 0 in TinyDataHelper.transToThriftObj()."
            goto L5
        L12:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.xiaomi.push.hd r2 = new com.xiaomi.push.hd
            r2.<init>()
            r3 = 0
            r4 = r2
            r2 = 0
            r5 = 0
        L20:
            int r6 = r10.size()
            if (r2 >= r6) goto Laa
            java.lang.Object r6 = r10.get(r2)
            com.xiaomi.push.he r6 = (com.xiaomi.push.he) r6
            if (r6 == 0) goto La6
            java.util.Map<java.lang.String, java.lang.String> r7 = r6.j
            if (r7 == 0) goto L66
            java.util.Map<java.lang.String, java.lang.String> r7 = r6.j
            java.lang.String r8 = "item_size"
            boolean r7 = r7.containsKey(r8)
            if (r7 == 0) goto L66
            java.util.Map<java.lang.String, java.lang.String> r7 = r6.j
            java.lang.String r8 = "item_size"
            java.lang.Object r7 = r7.get(r8)
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L51
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.Exception -> L51
            goto L52
        L51:
            r7 = 0
        L52:
            java.util.Map<java.lang.String, java.lang.String> r8 = r6.j
            int r8 = r8.size()
            r9 = 1
            if (r8 != r9) goto L5e
            r6.j = r0
            goto L67
        L5e:
            java.util.Map<java.lang.String, java.lang.String> r8 = r6.j
            java.lang.String r9 = "item_size"
            r8.remove(r9)
            goto L67
        L66:
            r7 = 0
        L67:
            if (r7 > 0) goto L6e
            byte[] r7 = com.xiaomi.push.ik.a(r6)
            int r7 = r7.length
        L6e:
            if (r7 <= r13) goto L84
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "TinyData is too big, ignore upload request item:"
            r7.<init>(r8)
            java.lang.String r6 = r6.i
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.xiaomi.channel.commonutils.logger.c.d(r6)
            goto La6
        L84:
            int r8 = r5 + r7
            if (r8 <= r13) goto L95
            com.xiaomi.push.ia r4 = a(r11, r12, r4)
            r1.add(r4)
            com.xiaomi.push.hd r4 = new com.xiaomi.push.hd
            r4.<init>()
            r5 = 0
        L95:
            java.util.List<com.xiaomi.push.he> r8 = r4.a
            if (r8 != 0) goto La0
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r4.a = r8
        La0:
            java.util.List<com.xiaomi.push.he> r8 = r4.a
            r8.add(r6)
            int r5 = r5 + r7
        La6:
            int r2 = r2 + 1
            goto L20
        Laa:
            java.util.List<com.xiaomi.push.he> r10 = r4.a
            if (r10 != 0) goto Laf
            goto Lb5
        Laf:
            java.util.List<com.xiaomi.push.he> r10 = r4.a
            int r3 = r10.size()
        Lb5:
            if (r3 == 0) goto Lbe
            com.xiaomi.push.ia r10 = a(r11, r12, r4)
            r1.add(r10)
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.az.a(java.util.List, java.lang.String, java.lang.String, int):java.util.ArrayList");
    }

    private static ia a(String str, String str2, hd hdVar) {
        ia iaVar = new ia("-1", false);
        iaVar.i = str;
        iaVar.d = str2;
        ia a2 = iaVar.a(com.xiaomi.push.b.a(ik.a(hdVar)));
        a2.e = hl.UploadTinyData.ah;
        return a2;
    }

    public static void a(Context context, String str, String str2, long j, String str3) {
        he heVar = new he();
        heVar.g = str;
        heVar.c = str2;
        heVar.a(j);
        heVar.b = str3;
        heVar.a = "push_sdk_channel";
        heVar.k = context.getPackageName();
        heVar.h = context.getPackageName();
        heVar.a(true);
        heVar.b(System.currentTimeMillis());
        heVar.i = a();
        ba.a(context, heVar);
    }
}
