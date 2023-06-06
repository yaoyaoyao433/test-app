package com.meituan.android.httpdns;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class p {
    public static ChangeQuickRedirect a;

    public static byte[] a(String str) {
        int i = 0;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "41e3777e88a58e99205f1df760a83e9e", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "41e3777e88a58e99205f1df760a83e9e");
        }
        if (str.length() == 0) {
            return null;
        }
        byte[] bArr = new byte[4];
        String[] split = str.split("\\.", -1);
        try {
            switch (split.length) {
                case 1:
                    long parseLong = Long.parseLong(split[0]);
                    if (parseLong >= 0 && parseLong <= 4294967295L) {
                        bArr[0] = (byte) ((parseLong >> 24) & 255);
                        bArr[1] = (byte) (((16777215 & parseLong) >> 16) & 255);
                        bArr[2] = (byte) (((65535 & parseLong) >> 8) & 255);
                        bArr[3] = (byte) (parseLong & 255);
                        return bArr;
                    }
                    return null;
                case 2:
                    long parseInt = Integer.parseInt(split[0]);
                    if (parseInt >= 0 && parseInt <= 255) {
                        bArr[0] = (byte) (parseInt & 255);
                        long parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt2 >= 0 && parseInt2 <= 16777215) {
                            bArr[1] = (byte) ((parseInt2 >> 16) & 255);
                            bArr[2] = (byte) (((65535 & parseInt2) >> 8) & 255);
                            bArr[3] = (byte) (parseInt2 & 255);
                            return bArr;
                        }
                        return null;
                    }
                    return null;
                case 3:
                    while (i < 2) {
                        long parseInt3 = Integer.parseInt(split[i]);
                        if (parseInt3 >= 0 && parseInt3 <= 255) {
                            bArr[i] = (byte) (parseInt3 & 255);
                            i++;
                        }
                        return null;
                    }
                    long parseInt4 = Integer.parseInt(split[2]);
                    if (parseInt4 >= 0 && parseInt4 <= 65535) {
                        bArr[2] = (byte) ((parseInt4 >> 8) & 255);
                        bArr[3] = (byte) (parseInt4 & 255);
                        return bArr;
                    }
                    return null;
                case 4:
                    while (i < 4) {
                        long parseInt5 = Integer.parseInt(split[i]);
                        if (parseInt5 >= 0 && parseInt5 <= 255) {
                            bArr[i] = (byte) (parseInt5 & 255);
                            i++;
                        }
                        return null;
                    }
                    return bArr;
                default:
                    return null;
            }
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x017b, code lost:
        if (r6[7] != 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0181, code lost:
        if (r6[8] != 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0187, code lost:
        if (r6[9] != 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x018d, code lost:
        if (r6[10] != (-1)) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0193, code lost:
        if (r6[11] != (-1)) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0195, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0197, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0198, code lost:
        if (r1 == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x019a, code lost:
        r3 = new byte[4];
        java.lang.System.arraycopy(r6, 12, r3, 0, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01a3, code lost:
        if (r3 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01a5, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01a6, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00cc, code lost:
        if (r13 == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d0, code lost:
        if ((r15 + 2) <= 16) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d2, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d3, code lost:
        r0 = r15 + 1;
        r6[r15] = (byte) ((r12 >> 8) & 255);
        r6[r0] = (byte) (r12 & 255);
        r15 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e4, code lost:
        if (r14 == (-1)) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e6, code lost:
        r0 = r15 - r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e8, code lost:
        if (r15 != 16) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ea, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00eb, code lost:
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ec, code lost:
        if (r1 > r0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ee, code lost:
        r4 = (r14 + r0) - r1;
        r6[16 - r1] = r6[r4];
        r6[r4] = 0;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00fd, code lost:
        r2 = 0;
        r15 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0101, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0102, code lost:
        if (r15 == 16) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0104, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0105, code lost:
        r1 = new java.lang.Object[1];
        r1[r2] = r6;
        r0 = com.meituan.android.httpdns.p.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x011e, code lost:
        if (com.meituan.robust.PatchProxy.isSupport(r1, null, r0, true, "506f9c81dbfb658889e8a864328e5e3a", 6917529027641081856L) == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0120, code lost:
        r3 = (byte[]) com.meituan.robust.PatchProxy.accessDispatch(r1, null, r0, true, "506f9c81dbfb658889e8a864328e5e3a");
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012a, code lost:
        r0 = new java.lang.Object[]{r6};
        r1 = com.meituan.android.httpdns.p.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0144, code lost:
        if (com.meituan.robust.PatchProxy.isSupport(r0, null, r1, true, "be52f89a8585eea893f3ce5e2320027f", 6917529027641081856L) == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0146, code lost:
        r1 = ((java.lang.Boolean) com.meituan.robust.PatchProxy.accessDispatch(r0, null, r1, true, "be52f89a8585eea893f3ce5e2320027f")).booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0154, code lost:
        if (r6.length < 16) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0159, code lost:
        if (r6[0] != 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x015d, code lost:
        if (r6[1] != 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0162, code lost:
        if (r6[2] != 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0167, code lost:
        if (r6[3] != 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016c, code lost:
        if (r6[4] != 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0171, code lost:
        if (r6[5] != 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0176, code lost:
        if (r6[6] != 0) goto L121;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] b(java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.httpdns.p.b(java.lang.String):byte[]");
    }
}
