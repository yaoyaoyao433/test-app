package com.xiaomi.push;
/* loaded from: classes6.dex */
public final class cs {
    private static void a(byte[] bArr) {
        if (bArr.length >= 2) {
            bArr[0] = 99;
            bArr[1] = 100;
        }
    }

    public static byte[] a(String str, byte[] bArr) {
        byte[] b = ao.b(str);
        try {
            a(b);
            return ge.a(b, bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] b(String str, byte[] bArr) {
        byte[] b = ao.b(str);
        try {
            a(b);
            return ge.b(b, bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
