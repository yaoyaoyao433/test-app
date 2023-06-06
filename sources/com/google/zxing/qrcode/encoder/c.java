package com.google.zxing.qrcode.encoder;

import com.google.zxing.h;
import com.google.zxing.qrcode.decoder.c;
import com.meituan.robust.common.CommonConstant;
import com.tencent.smtt.sdk.TbsListener;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    private static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    public static f a(String str, com.google.zxing.qrcode.decoder.a aVar, Map<com.google.zxing.c, ?> map) throws h {
        com.google.zxing.qrcode.decoder.b bVar;
        com.google.zxing.common.c a2;
        String str2 = map == null ? null : (String) map.get(com.google.zxing.c.CHARACTER_SET);
        if (str2 == null) {
            str2 = CommonConstant.Encoding.ISO88591;
        }
        int i = 0;
        if ("Shift_JIS".equals(str2)) {
            bVar = a(str) ? com.google.zxing.qrcode.decoder.b.KANJI : com.google.zxing.qrcode.decoder.b.BYTE;
        } else {
            int i2 = 0;
            boolean z = false;
            boolean z2 = false;
            while (true) {
                if (i2 < str.length()) {
                    char charAt = str.charAt(i2);
                    if (charAt >= '0' && charAt <= '9') {
                        z2 = true;
                    } else if (a(charAt) == -1) {
                        bVar = com.google.zxing.qrcode.decoder.b.BYTE;
                        break;
                    } else {
                        z = true;
                    }
                    i2++;
                } else if (z) {
                    bVar = com.google.zxing.qrcode.decoder.b.ALPHANUMERIC;
                } else if (z2) {
                    bVar = com.google.zxing.qrcode.decoder.b.NUMERIC;
                } else {
                    bVar = com.google.zxing.qrcode.decoder.b.BYTE;
                }
            }
        }
        com.google.zxing.common.a aVar2 = new com.google.zxing.common.a();
        if (bVar == com.google.zxing.qrcode.decoder.b.BYTE && !CommonConstant.Encoding.ISO88591.equals(str2) && (a2 = com.google.zxing.common.c.a(str2)) != null) {
            aVar2.a(com.google.zxing.qrcode.decoder.b.ECI.k, 4);
            aVar2.a(a2.B[0], 8);
        }
        aVar2.a(bVar.k, 4);
        com.google.zxing.common.a aVar3 = new com.google.zxing.common.a();
        switch (bVar) {
            case NUMERIC:
                int length = str.length();
                while (i < length) {
                    int charAt2 = str.charAt(i) - '0';
                    int i3 = i + 2;
                    if (i3 < length) {
                        aVar3.a((charAt2 * 100) + ((str.charAt(i + 1) - '0') * 10) + (str.charAt(i3) - '0'), 10);
                        i += 3;
                    } else {
                        i++;
                        if (i < length) {
                            aVar3.a((charAt2 * 10) + (str.charAt(i) - '0'), 7);
                            i = i3;
                        } else {
                            aVar3.a(charAt2, 4);
                        }
                    }
                }
                break;
            case ALPHANUMERIC:
                int length2 = str.length();
                while (i < length2) {
                    int a3 = a(str.charAt(i));
                    if (a3 == -1) {
                        throw new h();
                    }
                    int i4 = i + 1;
                    if (i4 < length2) {
                        int a4 = a(str.charAt(i4));
                        if (a4 == -1) {
                            throw new h();
                        }
                        aVar3.a((a3 * 45) + a4, 11);
                        i += 2;
                    } else {
                        aVar3.a(a3, 6);
                        i = i4;
                    }
                }
                break;
            case BYTE:
                a(str, aVar3, str2);
                break;
            case KANJI:
                a(str, aVar3);
                break;
            default:
                throw new h("Invalid mode: " + bVar);
        }
        com.google.zxing.qrcode.decoder.c a5 = a(aVar2.b + bVar.a(a(aVar2.b + bVar.a(com.google.zxing.qrcode.decoder.c.a(1)) + aVar3.b, aVar)) + aVar3.b, aVar);
        com.google.zxing.common.a aVar4 = new com.google.zxing.common.a();
        aVar4.a(aVar2);
        int a6 = bVar == com.google.zxing.qrcode.decoder.b.BYTE ? aVar3.a() : str.length();
        int a7 = bVar.a(a5);
        int i5 = 1 << a7;
        if (a6 >= i5) {
            throw new h(a6 + " is bigger than " + (i5 - 1));
        }
        aVar4.a(a6, a7);
        aVar4.a(aVar3);
        c.b a8 = a5.a(aVar);
        int b = a5.b - a8.b();
        a(b, aVar4);
        com.google.zxing.common.a a9 = a(aVar4, a5.b, b, a8.a());
        f fVar = new f();
        fVar.b = aVar;
        fVar.a = bVar;
        fVar.c = a5;
        int i6 = (a5.a * 4) + 17;
        b bVar2 = new b(i6, i6);
        int a10 = a(a9, aVar, a5, bVar2);
        fVar.d = a10;
        e.a(a9, aVar, a5, a10, bVar2);
        fVar.e = bVar2;
        return fVar;
    }

    private static int a(int i) {
        if (i < a.length) {
            return a[i];
        }
        return -1;
    }

    private static boolean a(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                int i2 = bytes[i] & 255;
                if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    private static int a(com.google.zxing.common.a aVar, com.google.zxing.qrcode.decoder.a aVar2, com.google.zxing.qrcode.decoder.c cVar, b bVar) throws h {
        boolean z = false;
        int i = -1;
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        while (i2 < 8) {
            e.a(aVar, aVar2, cVar, i2, bVar);
            int a2 = d.a(bVar, true) + d.a(bVar, z);
            byte[][] bArr = bVar.a;
            int i4 = bVar.b;
            int i5 = bVar.c;
            int i6 = 0;
            int i7 = 0;
            while (i6 < i5 - 1) {
                int i8 = i7;
                int i9 = 0;
                while (i9 < i4 - 1) {
                    byte b = bArr[i6][i9];
                    int i10 = i9 + 1;
                    if (b == bArr[i6][i10]) {
                        int i11 = i6 + 1;
                        if (b == bArr[i11][i9] && b == bArr[i11][i10]) {
                            i8++;
                        }
                    }
                    i9 = i10;
                }
                i6++;
                i7 = i8;
            }
            int i12 = a2 + (i7 * 3);
            byte[][] bArr2 = bVar.a;
            int i13 = bVar.b;
            int i14 = bVar.c;
            int i15 = 0;
            int i16 = 0;
            while (i15 < i14) {
                int i17 = i16;
                for (int i18 = 0; i18 < i13; i18++) {
                    byte[] bArr3 = bArr2[i15];
                    int i19 = i18 + 6;
                    if (i19 < i13 && bArr3[i18] == 1 && bArr3[i18 + 1] == 0 && bArr3[i18 + 2] == 1 && bArr3[i18 + 3] == 1 && bArr3[i18 + 4] == 1 && bArr3[i18 + 5] == 0 && bArr3[i19] == 1 && (d.a(bArr3, i18 - 4, i18) || d.a(bArr3, i18 + 7, i18 + 11))) {
                        i17++;
                    }
                    int i20 = i15 + 6;
                    if (i20 < i14 && bArr2[i15][i18] == 1 && bArr2[i15 + 1][i18] == 0 && bArr2[i15 + 2][i18] == 1 && bArr2[i15 + 3][i18] == 1 && bArr2[i15 + 4][i18] == 1 && bArr2[i15 + 5][i18] == 0 && bArr2[i20][i18] == 1 && (d.a(bArr2, i18, i15 - 4, i15) || d.a(bArr2, i18, i15 + 7, i15 + 11))) {
                        i17++;
                    }
                }
                i15++;
                i16 = i17;
            }
            int i21 = i12 + (i16 * 40);
            byte[][] bArr4 = bVar.a;
            int i22 = bVar.b;
            int i23 = bVar.c;
            int i24 = 0;
            int i25 = 0;
            while (i24 < i23) {
                byte[] bArr5 = bArr4[i24];
                int i26 = i25;
                for (int i27 = 0; i27 < i22; i27++) {
                    if (bArr5[i27] == 1) {
                        i26++;
                    }
                }
                i24++;
                i25 = i26;
            }
            int i28 = bVar.c * bVar.b;
            int abs = i21 + (((Math.abs((i25 * 2) - i28) * 10) / i28) * 10);
            if (abs < i3) {
                i = i2;
                i3 = abs;
            }
            i2++;
            z = false;
        }
        return i;
    }

    private static com.google.zxing.qrcode.decoder.c a(int i, com.google.zxing.qrcode.decoder.a aVar) throws h {
        for (int i2 = 1; i2 <= 40; i2++) {
            com.google.zxing.qrcode.decoder.c a2 = com.google.zxing.qrcode.decoder.c.a(i2);
            if (a2.b - a2.a(aVar).b() >= (i + 7) / 8) {
                return a2;
            }
        }
        throw new h("Data too big");
    }

    private static com.google.zxing.common.a a(com.google.zxing.common.a aVar, int i, int i2, int i3) throws h {
        int i4;
        if (aVar.a() != i2) {
            throw new h("Number of bits and data bytes does not match");
        }
        ArrayList<a> arrayList = new ArrayList(i3);
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i3; i8++) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            if (i8 >= i3) {
                throw new h("Block ID too large");
            }
            int i9 = i % i3;
            int i10 = i3 - i9;
            int i11 = i / i3;
            int i12 = i11 + 1;
            int i13 = i2 / i3;
            int i14 = i13 + 1;
            int i15 = i11 - i13;
            int i16 = i12 - i14;
            if (i15 != i16) {
                throw new h("EC bytes mismatch");
            }
            if (i3 != i10 + i9) {
                throw new h("RS blocks mismatch");
            }
            if (i == ((i13 + i15) * i10) + ((i14 + i16) * i9)) {
                if (i8 < i10) {
                    i4 = 0;
                    iArr[0] = i13;
                    iArr2[0] = i15;
                } else {
                    i4 = 0;
                    iArr[0] = i14;
                    iArr2[0] = i16;
                }
                int i17 = iArr[i4];
                byte[] bArr = new byte[i17];
                aVar.a(i5 * 8, bArr, i4, i17);
                byte[] a2 = a(bArr, iArr2[i4]);
                arrayList.add(new a(bArr, a2));
                i6 = Math.max(i6, i17);
                i7 = Math.max(i7, a2.length);
                i5 += iArr[i4];
            } else {
                throw new h("Total bytes mismatch");
            }
        }
        if (i2 != i5) {
            throw new h("Data bytes does not match offset");
        }
        com.google.zxing.common.a aVar2 = new com.google.zxing.common.a();
        for (int i18 = 0; i18 < i6; i18++) {
            for (a aVar3 : arrayList) {
                byte[] bArr2 = aVar3.a;
                if (i18 < bArr2.length) {
                    aVar2.a(bArr2[i18], 8);
                }
            }
        }
        for (int i19 = 0; i19 < i7; i19++) {
            for (a aVar4 : arrayList) {
                byte[] bArr3 = aVar4.b;
                if (i19 < bArr3.length) {
                    aVar2.a(bArr3[i19], 8);
                }
            }
        }
        if (i == aVar2.a()) {
            return aVar2;
        }
        throw new h("Interleaving error: " + i + " and " + aVar2.a() + " differ.");
    }

    private static byte[] a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length + i];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new com.google.zxing.common.reedsolomon.c(com.google.zxing.common.reedsolomon.a.e).a(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    private static void a(String str, com.google.zxing.common.a aVar, String str2) throws h {
        try {
            for (byte b : str.getBytes(str2)) {
                aVar.a(b, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new h(e);
        }
    }

    private static void a(String str, com.google.zxing.common.a aVar) throws h {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            for (int i = 0; i < length; i += 2) {
                int i2 = ((bytes[i] & 255) << 8) | (bytes[i + 1] & 255);
                int i3 = (i2 < 33088 || i2 > 40956) ? (i2 < 57408 || i2 > 60351) ? -1 : i2 - 49472 : i2 - 33088;
                if (i3 == -1) {
                    throw new h("Invalid byte sequence");
                }
                aVar.a(((i3 >> 8) * 192) + (i3 & 255), 13);
            }
        } catch (UnsupportedEncodingException e) {
            throw new h(e);
        }
    }

    private static void a(int i, com.google.zxing.common.a aVar) throws h {
        int i2 = i * 8;
        if (aVar.b > i2) {
            throw new h("data bits cannot fit in the QR Code" + aVar.b + " > " + i2);
        }
        for (int i3 = 0; i3 < 4 && aVar.b < i2; i3++) {
            aVar.a(false);
        }
        int i4 = aVar.b & 7;
        if (i4 > 0) {
            while (i4 < 8) {
                aVar.a(false);
                i4++;
            }
        }
        int a2 = i - aVar.a();
        for (int i5 = 0; i5 < a2; i5++) {
            aVar.a((i5 & 1) == 0 ? TbsListener.ErrorCode.TPATCH_INSTALL_SUCCESS : 17, 8);
        }
        if (aVar.b != i2) {
            throw new h("Bits size does not equal capacity");
        }
    }
}
