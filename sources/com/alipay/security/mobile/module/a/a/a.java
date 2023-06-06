package com.alipay.security.mobile.module.a.a;

import com.meituan.robust.Constants;
import com.tencent.mapsdk.internal.p;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Constants.OBJECT_TYPE, 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    public static byte[] b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, p.ZERO_TAG, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
        if (r2 == (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
        r0.append((char) (r2 | ((r5 & 3) << 6)));
        r2 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(java.lang.String r8) {
        /*
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "US-ASCII"
            byte[] r8 = r8.getBytes(r1)
            int r1 = r8.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L43
        Lf:
            byte[] r3 = com.alipay.security.mobile.module.a.a.a.b
            int r4 = r2 + 1
            r2 = r8[r2]
            r2 = r3[r2]
            r3 = -1
            if (r4 >= r1) goto L1e
            if (r2 != r3) goto L1e
            r2 = r4
            goto Lf
        L1e:
            if (r2 == r3) goto L43
        L20:
            byte[] r5 = com.alipay.security.mobile.module.a.a.a.b
            int r6 = r4 + 1
            r4 = r8[r4]
            r4 = r5[r4]
            if (r6 >= r1) goto L2e
            if (r4 != r3) goto L2e
            r4 = r6
            goto L20
        L2e:
            if (r4 == r3) goto L43
            int r2 = r2 << 2
            r5 = r4 & 48
            int r5 = r5 >>> 4
            r2 = r2 | r5
            char r2 = (char) r2
            r0.append(r2)
        L3b:
            int r2 = r6 + 1
            r5 = r8[r6]
            r6 = 61
            if (r5 != r6) goto L4e
        L43:
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "iso8859-1"
            byte[] r8 = r8.getBytes(r0)
            return r8
        L4e:
            byte[] r7 = com.alipay.security.mobile.module.a.a.a.b
            r5 = r7[r5]
            if (r2 >= r1) goto L58
            if (r5 != r3) goto L58
            r6 = r2
            goto L3b
        L58:
            if (r5 == r3) goto L43
            r4 = r4 & 15
            int r4 = r4 << 4
            r7 = r5 & 60
            int r7 = r7 >>> 2
            r4 = r4 | r7
            char r4 = (char) r4
            r0.append(r4)
        L67:
            int r4 = r2 + 1
            r2 = r8[r2]
            if (r2 != r6) goto L6e
            goto L43
        L6e:
            byte[] r7 = com.alipay.security.mobile.module.a.a.a.b
            r2 = r7[r2]
            if (r4 >= r1) goto L78
            if (r2 != r3) goto L78
            r2 = r4
            goto L67
        L78:
            if (r2 == r3) goto L43
            r3 = r5 & 3
            int r3 = r3 << 6
            r2 = r2 | r3
            char r2 = (char) r2
            r0.append(r2)
            r2 = r4
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.security.mobile.module.a.a.a.a(java.lang.String):byte[]");
    }
}
