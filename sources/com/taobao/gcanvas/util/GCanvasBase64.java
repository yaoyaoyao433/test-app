package com.taobao.gcanvas.util;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class GCanvasBase64 {
    public static byte[] decode(byte[] bArr) {
        return decode(bArr, bArr.length);
    }

    public static byte[] decode(byte[] bArr, int i) {
        int i2;
        int i3 = (i / 4) * 3;
        if (i3 == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[i3];
        int i4 = 0;
        while (true) {
            byte b = bArr[i - 1];
            if (b != 10 && b != 13 && b != 32 && b != 9) {
                if (b != 61) {
                    break;
                }
                i4++;
            }
            i--;
        }
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i; i8++) {
            byte b2 = bArr[i8];
            if (b2 != 10 && b2 != 13 && b2 != 32 && b2 != 9) {
                if (b2 >= 65 && b2 <= 90) {
                    i2 = b2 - 65;
                } else if (b2 >= 97 && b2 <= 122) {
                    i2 = b2 - 71;
                } else if (b2 >= 48 && b2 <= 57) {
                    i2 = b2 + 4;
                } else if (b2 == 43) {
                    i2 = 62;
                } else if (b2 != 47) {
                    return null;
                } else {
                    i2 = 63;
                }
                i5 = (i5 << 6) | ((byte) i2);
                if (i7 % 4 == 3) {
                    int i9 = i6 + 1;
                    bArr2[i6] = (byte) (i5 >> 16);
                    int i10 = i9 + 1;
                    bArr2[i9] = (byte) (i5 >> 8);
                    bArr2[i10] = (byte) i5;
                    i6 = i10 + 1;
                }
                i7++;
            }
        }
        if (i4 > 0) {
            int i11 = i5 << (i4 * 6);
            int i12 = i6 + 1;
            bArr2[i6] = (byte) (i11 >> 16);
            if (i4 == 1) {
                i6 = i12 + 1;
                bArr2[i12] = (byte) (i11 >> 8);
            } else {
                i6 = i12;
            }
        }
        byte[] bArr3 = new byte[i6];
        System.arraycopy(bArr2, 0, bArr3, 0, i6);
        return bArr3;
    }
}
