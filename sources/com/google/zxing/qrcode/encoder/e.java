package com.google.zxing.qrcode.encoder;

import com.google.zxing.h;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.tencent.smtt.sdk.TbsListener;
import io.agora.rtc.Constants;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    private static final int[][] a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    private static final int[][] b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    private static final int[][] c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, MapConstant.ANIMATION_DURATION_SHORT}, new int[]{6, 24, 50, 76, 102, 128, Constants.ERR_PUBLISH_STREAM_INTERNAL_SERVER_ERROR}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, TbsListener.ErrorCode.STARTDOWNLOAD_3}, new int[]{6, 26, 54, 82, 110, 138, TbsListener.ErrorCode.STARTDOWNLOAD_7}, new int[]{6, 30, 58, 86, 114, 142, TbsListener.ErrorCode.NEEDDOWNLOAD_TRUE}};
    private static final int[][] d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    private static int a(int i) {
        int i2 = 0;
        while (i != 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    private static boolean b(int i) {
        return i == -1;
    }

    private static int a(int i, int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int a2 = a(i2);
        int i3 = i << (a2 - 1);
        while (a(i3) >= a2) {
            i3 ^= i2 << (a(i3) - a2);
        }
        return i3;
    }

    private static void a(int i, int i2, b bVar) throws h {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (!b(bVar.a(i4, i2))) {
                throw new h();
            }
            bVar.a(i4, i2, 0);
        }
    }

    private static void b(int i, int i2, b bVar) throws h {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (!b(bVar.a(i, i4))) {
                throw new h();
            }
            bVar.a(i, i4, 0);
        }
    }

    private static void c(int i, int i2, b bVar) {
        for (int i3 = 0; i3 < 7; i3++) {
            for (int i4 = 0; i4 < 7; i4++) {
                bVar.a(i + i4, i2 + i3, a[i3][i4]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(com.google.zxing.common.a aVar, com.google.zxing.qrcode.decoder.a aVar2, com.google.zxing.qrcode.decoder.c cVar, int i, b bVar) throws h {
        int i2;
        int i3 = 0;
        while (true) {
            i2 = -1;
            if (i3 >= bVar.c) {
                break;
            }
            for (int i4 = 0; i4 < bVar.b; i4++) {
                bVar.a[i3][i4] = -1;
            }
            i3++;
        }
        int length = a[0].length;
        c(0, 0, bVar);
        c(bVar.b - length, 0, bVar);
        c(0, bVar.b - length, bVar);
        a(0, 7, bVar);
        a(bVar.b - 8, 7, bVar);
        a(0, bVar.b - 8, bVar);
        b(7, 0, bVar);
        b((bVar.c - 7) - 1, 0, bVar);
        b(7, bVar.c - 7, bVar);
        if (bVar.a(8, bVar.c - 8) == 0) {
            throw new h();
        }
        bVar.a(8, bVar.c - 8, 1);
        if (cVar.a >= 2) {
            int i5 = cVar.a - 1;
            int[] iArr = c[i5];
            int length2 = c[i5].length;
            int i6 = 0;
            while (i6 < length2) {
                int i7 = 0;
                while (i7 < length2) {
                    int i8 = iArr[i6];
                    int i9 = iArr[i7];
                    if (i9 != i2 && i8 != i2 && b(bVar.a(i9, i8))) {
                        int i10 = i9 - 2;
                        int i11 = i8 - 2;
                        for (int i12 = 0; i12 < 5; i12++) {
                            for (int i13 = 0; i13 < 5; i13++) {
                                bVar.a(i10 + i13, i11 + i12, b[i12][i13]);
                            }
                        }
                    }
                    i7++;
                    i2 = -1;
                }
                i6++;
                i2 = -1;
            }
        }
        int i14 = 8;
        while (i14 < bVar.b - 8) {
            int i15 = i14 + 1;
            int i16 = i15 % 2;
            if (b(bVar.a(i14, 6))) {
                bVar.a(i14, 6, i16);
            }
            if (b(bVar.a(6, i14))) {
                bVar.a(6, i14, i16);
            }
            i14 = i15;
        }
        com.google.zxing.common.a aVar3 = new com.google.zxing.common.a();
        if (!(i >= 0 && i < 8)) {
            throw new h("Invalid mask pattern");
        }
        int i17 = (aVar2.e << 3) | i;
        aVar3.a(i17, 5);
        aVar3.a(a(i17, 1335), 10);
        com.google.zxing.common.a aVar4 = new com.google.zxing.common.a();
        aVar4.a(21522, 15);
        if (aVar3.a.length != aVar4.a.length) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        for (int i18 = 0; i18 < aVar3.a.length; i18++) {
            int[] iArr2 = aVar3.a;
            iArr2[i18] = iArr2[i18] ^ aVar4.a[i18];
        }
        if (aVar3.b != 15) {
            throw new h("should not happen but we got: " + aVar3.b);
        }
        for (int i19 = 0; i19 < aVar3.b; i19++) {
            boolean a2 = aVar3.a((aVar3.b - 1) - i19);
            bVar.a(d[i19][0], d[i19][1], a2);
            if (i19 < 8) {
                bVar.a((bVar.b - i19) - 1, 8, a2);
            } else {
                bVar.a(8, (bVar.c - 7) + (i19 - 8), a2);
            }
        }
        a(cVar, bVar);
        a(aVar, i, bVar);
    }

    private static void a(com.google.zxing.qrcode.decoder.c cVar, b bVar) throws h {
        if (cVar.a < 7) {
            return;
        }
        com.google.zxing.common.a aVar = new com.google.zxing.common.a();
        aVar.a(cVar.a, 6);
        aVar.a(a(cVar.a, 7973), 12);
        if (aVar.b != 18) {
            throw new h("should not happen but we got: " + aVar.b);
        }
        int i = 0;
        int i2 = 17;
        while (i < 6) {
            int i3 = i2;
            for (int i4 = 0; i4 < 3; i4++) {
                boolean a2 = aVar.a(i3);
                i3--;
                bVar.a(i, (bVar.c - 11) + i4, a2);
                bVar.a((bVar.c - 11) + i4, i, a2);
            }
            i++;
            i2 = i3;
        }
    }

    private static void a(com.google.zxing.common.a aVar, int i, b bVar) throws h {
        boolean z;
        int i2;
        int i3 = bVar.b - 1;
        int i4 = bVar.c - 1;
        int i5 = 0;
        int i6 = -1;
        while (i3 > 0) {
            if (i3 == 6) {
                i3--;
            }
            while (i4 >= 0 && i4 < bVar.c) {
                int i7 = i5;
                for (int i8 = 0; i8 < 2; i8++) {
                    int i9 = i3 - i8;
                    if (b(bVar.a(i9, i4))) {
                        if (i7 < aVar.b) {
                            z = aVar.a(i7);
                            i7++;
                        } else {
                            z = false;
                        }
                        if (i != -1) {
                            switch (i) {
                                case 0:
                                    i2 = (i4 + i9) & 1;
                                    break;
                                case 1:
                                    i2 = i4 & 1;
                                    break;
                                case 2:
                                    i2 = i9 % 3;
                                    break;
                                case 3:
                                    i2 = (i4 + i9) % 3;
                                    break;
                                case 4:
                                    i2 = ((i4 / 2) + (i9 / 3)) & 1;
                                    break;
                                case 5:
                                    int i10 = i4 * i9;
                                    i2 = (i10 % 3) + (i10 & 1);
                                    break;
                                case 6:
                                    int i11 = i4 * i9;
                                    i2 = ((i11 & 1) + (i11 % 3)) & 1;
                                    break;
                                case 7:
                                    i2 = (((i4 * i9) % 3) + ((i4 + i9) & 1)) & 1;
                                    break;
                                default:
                                    throw new IllegalArgumentException("Invalid mask pattern: " + i);
                            }
                            if (i2 == 0) {
                                z = !z;
                            }
                        }
                        bVar.a(i9, i4, z);
                    }
                }
                i4 += i6;
                i5 = i7;
            }
            i6 = -i6;
            i4 += i6;
            i3 -= 2;
        }
        if (i5 == aVar.b) {
            return;
        }
        throw new h("Not all bits consumed: " + i5 + '/' + aVar.b);
    }
}
