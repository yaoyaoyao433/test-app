package com.meituan.android.uptodate.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.security.MessageDigest;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static final String a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7cd8c79e805b843bdb49a657a32679c8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7cd8c79e805b843bdb49a657a32679c8");
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            char[] cArr2 = new char[digest.length * 2];
            int i = 0;
            for (byte b : digest) {
                int i2 = i + 1;
                cArr2[i] = cArr[(b >>> 4) & 15];
                i = i2 + 1;
                cArr2[i2] = cArr[b & 15];
            }
            return new String(cArr2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String a(java.io.File r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.uptodate.util.a.a
            java.lang.String r11 = "a9a4e97b047c91d709eb7814fb5b2c7f"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r10, r0, r11)
            java.lang.String r12 = (java.lang.String) r12
            return r12
        L1e:
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x0086: FILL_ARRAY_DATA  , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73
            r1.<init>(r12)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73
            java.lang.String r12 = "MD5"
            java.security.MessageDigest r12 = java.security.MessageDigest.getInstance(r12)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L7e
            r3 = 8192(0x2000, float:1.14794E-41)
            byte[] r4 = new byte[r3]     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L7e
            int r5 = r1.read(r4, r9, r3)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L7e
        L38:
            if (r5 < 0) goto L42
            r12.update(r4, r9, r5)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L7e
            int r5 = r1.read(r4, r9, r3)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L7e
            goto L38
        L42:
            byte[] r12 = r12.digest()     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L7e
            int r3 = r12.length     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L7e
            int r4 = r3 * 2
            char[] r4 = new char[r4]     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L7e
            r5 = 0
        L4c:
            if (r9 >= r3) goto L65
            r6 = r12[r9]     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L7e
            int r7 = r5 + 1
            int r8 = r6 >>> 4
            r8 = r8 & 15
            char r8 = r0[r8]     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L7e
            r4[r5] = r8     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L7e
            int r5 = r7 + 1
            r6 = r6 & 15
            char r6 = r0[r6]     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L7e
            r4[r7] = r6     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L7e
            int r9 = r9 + 1
            goto L4c
        L65:
            java.lang.String r12 = new java.lang.String     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L7e
            r12.<init>(r4)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L7e
            r1.close()     // Catch: java.io.IOException -> L6d
        L6d:
            return r12
        L6e:
            r12 = move-exception
            goto L75
        L70:
            r12 = move-exception
            r1 = r2
            goto L7f
        L73:
            r12 = move-exception
            r1 = r2
        L75:
            r12.printStackTrace()     // Catch: java.lang.Throwable -> L7e
            if (r1 == 0) goto L7d
            r1.close()     // Catch: java.io.IOException -> L7d
        L7d:
            return r2
        L7e:
            r12 = move-exception
        L7f:
            if (r1 == 0) goto L84
            r1.close()     // Catch: java.io.IOException -> L84
        L84:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.uptodate.util.a.a(java.io.File):java.lang.String");
    }
}
