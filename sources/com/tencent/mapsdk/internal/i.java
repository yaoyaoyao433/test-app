package com.tencent.mapsdk.internal;

import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class i {
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final byte[] a = new byte[0];

    private static byte a(char c) {
        if (c < '0' || c > '9') {
            if (c < 'a' || c > 'f') {
                if (c < 'A' || c > 'F') {
                    return (byte) 0;
                }
                return (byte) ((c - 'A') + 10);
            }
            return (byte) ((c - 'a') + 10);
        }
        return (byte) (c - '0');
    }

    private static String a(byte b2) {
        return new String(new char[]{b[((byte) (b2 >>> 4)) & 15], b[b2 & 15]});
    }

    private static String a(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.flip();
        byte[] bArr = new byte[duplicate.limit()];
        duplicate.get(bArr);
        return a(bArr);
    }

    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            int i2 = i * 2;
            cArr[i2 + 1] = b[b2 & 15];
            cArr[i2 + 0] = b[((byte) (b2 >>> 4)) & 15];
        }
        return new String(cArr);
    }

    private static byte b(String str) {
        if (str == null || str.length() != 1) {
            return (byte) 0;
        }
        return a(str.charAt(0));
    }

    public static byte[] a(String str) {
        if (str == null || str.equals("")) {
            return a;
        }
        byte[] bArr = new byte[str.length() / 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((a(str.charAt(i2)) * 16) + a(str.charAt(i2 + 1)));
        }
        return bArr;
    }
}
