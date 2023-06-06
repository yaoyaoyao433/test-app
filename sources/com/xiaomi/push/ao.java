package com.xiaomi.push;
/* loaded from: classes6.dex */
public final class ao {
    private static final String a = System.getProperty("line.separator");
    private static char[] b = new char[64];
    private static byte[] c;

    static {
        char c2 = 'A';
        int i = 0;
        while (c2 <= 'Z') {
            b[i] = c2;
            c2 = (char) (c2 + 1);
            i++;
        }
        char c3 = 'a';
        while (c3 <= 'z') {
            b[i] = c3;
            c3 = (char) (c3 + 1);
            i++;
        }
        char c4 = '0';
        while (c4 <= '9') {
            b[i] = c4;
            c4 = (char) (c4 + 1);
            i++;
        }
        b[i] = '+';
        b[i + 1] = '/';
        c = new byte[128];
        for (int i2 = 0; i2 < c.length; i2++) {
            c[i2] = -1;
        }
        for (int i3 = 0; i3 < 64; i3++) {
            c[b[i3]] = (byte) i3;
        }
    }

    public static String a(String str) {
        return new String(a(str.getBytes()));
    }

    public static char[] a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    private static char[] a(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = ((i2 * 4) + 2) / 3;
        char[] cArr = new char[((i2 + 2) / 3) * 4];
        int i8 = i2 + 0;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i8) {
            int i11 = i9 + 1;
            int i12 = bArr[i9] & 255;
            if (i11 < i8) {
                i3 = i11 + 1;
                i4 = bArr[i11] & 255;
            } else {
                i3 = i11;
                i4 = 0;
            }
            if (i3 < i8) {
                i5 = i3 + 1;
                i6 = bArr[i3] & 255;
            } else {
                i5 = i3;
                i6 = 0;
            }
            int i13 = i12 >>> 2;
            int i14 = ((i12 & 3) << 4) | (i4 >>> 4);
            int i15 = ((i4 & 15) << 2) | (i6 >>> 6);
            int i16 = i6 & 63;
            int i17 = i10 + 1;
            cArr[i10] = b[i13];
            int i18 = i17 + 1;
            cArr[i17] = b[i14];
            char c2 = '=';
            cArr[i18] = i18 < i7 ? b[i15] : '=';
            int i19 = i18 + 1;
            if (i19 < i7) {
                c2 = b[i16];
            }
            cArr[i19] = c2;
            i10 = i19 + 1;
            i9 = i5;
        }
        return cArr;
    }

    public static byte[] b(String str) {
        int i;
        char c2;
        int i2;
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        if (length % 4 == 0) {
            while (length > 0 && charArray[(length + 0) - 1] == '=') {
                length--;
            }
            int i3 = (length * 3) / 4;
            byte[] bArr = new byte[i3];
            int i4 = length + 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6 = i) {
                int i7 = i6 + 1;
                char c3 = charArray[i6];
                int i8 = i7 + 1;
                char c4 = charArray[i7];
                char c5 = 'A';
                if (i8 < i4) {
                    i = i8 + 1;
                    c2 = charArray[i8];
                } else {
                    i = i8;
                    c2 = 'A';
                }
                if (i < i4) {
                    int i9 = i + 1;
                    char c6 = charArray[i];
                    i = i9;
                    c5 = c6;
                }
                if (c3 > 127 || c4 > 127 || c2 > 127 || c5 > 127) {
                    throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
                }
                byte b2 = c[c3];
                byte b3 = c[c4];
                byte b4 = c[c2];
                byte b5 = c[c5];
                if (b2 < 0 || b3 < 0 || b4 < 0 || b5 < 0) {
                    throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
                }
                int i10 = (b2 << 2) | (b3 >>> 4);
                int i11 = ((b3 & 15) << 4) | (b4 >>> 2);
                int i12 = ((b4 & 3) << 6) | b5;
                int i13 = i5 + 1;
                bArr[i5] = (byte) i10;
                if (i13 < i3) {
                    i2 = i13 + 1;
                    bArr[i13] = (byte) i11;
                } else {
                    i2 = i13;
                }
                if (i2 < i3) {
                    i5 = i2 + 1;
                    bArr[i2] = (byte) i12;
                } else {
                    i5 = i2;
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
    }
}
