package com.google.zxing.aztec.encoder;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    private static final int[] a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private static int a(int i, boolean z) {
        return ((z ? 88 : 112) + (i * 16)) * i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
        if (r12 == 32) goto L16;
     */
    /* JADX WARN: Type inference failed for: r4v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.zxing.aztec.encoder.a a(byte[] r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.aztec.encoder.c.a(byte[], int, int):com.google.zxing.aztec.encoder.a");
    }

    private static void a(com.google.zxing.common.b bVar, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    bVar.b(i5, i4);
                    bVar.b(i5, i6);
                    bVar.b(i4, i5);
                    bVar.b(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        bVar.b(i7, i7);
        int i8 = i7 + 1;
        bVar.b(i8, i7);
        bVar.b(i7, i8);
        int i9 = i + i2;
        bVar.b(i9, i7);
        bVar.b(i9, i8);
        bVar.b(i9, i9 - 1);
    }

    private static void a(com.google.zxing.common.b bVar, boolean z, int i, com.google.zxing.common.a aVar) {
        int i2 = i / 2;
        int i3 = 0;
        if (z) {
            while (i3 < 7) {
                int i4 = (i2 - 3) + i3;
                if (aVar.a(i3)) {
                    bVar.b(i4, i2 - 5);
                }
                if (aVar.a(i3 + 7)) {
                    bVar.b(i2 + 5, i4);
                }
                if (aVar.a(20 - i3)) {
                    bVar.b(i4, i2 + 5);
                }
                if (aVar.a(27 - i3)) {
                    bVar.b(i2 - 5, i4);
                }
                i3++;
            }
            return;
        }
        while (i3 < 10) {
            int i5 = (i2 - 5) + i3 + (i3 / 5);
            if (aVar.a(i3)) {
                bVar.b(i5, i2 - 7);
            }
            if (aVar.a(i3 + 10)) {
                bVar.b(i2 + 7, i5);
            }
            if (aVar.a(29 - i3)) {
                bVar.b(i5, i2 + 7);
            }
            if (aVar.a(39 - i3)) {
                bVar.b(i2 - 7, i5);
            }
            i3++;
        }
    }

    private static int[] b(com.google.zxing.common.a aVar, int i, int i2) {
        int[] iArr = new int[i2];
        int i3 = aVar.b / i;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                i5 |= aVar.a((i4 * i) + i6) ? 1 << ((i - i6) - 1) : 0;
            }
            iArr[i4] = i5;
        }
        return iArr;
    }

    private static com.google.zxing.common.reedsolomon.a a(int i) {
        if (i != 4) {
            if (i != 6) {
                if (i != 8) {
                    if (i != 10) {
                        if (i != 12) {
                            return null;
                        }
                        return com.google.zxing.common.reedsolomon.a.a;
                    }
                    return com.google.zxing.common.reedsolomon.a.b;
                }
                return com.google.zxing.common.reedsolomon.a.g;
            }
            return com.google.zxing.common.reedsolomon.a.c;
        }
        return com.google.zxing.common.reedsolomon.a.d;
    }

    private static com.google.zxing.common.a a(com.google.zxing.common.a aVar, int i) {
        com.google.zxing.common.a aVar2 = new com.google.zxing.common.a();
        int i2 = aVar.b;
        int i3 = (1 << i) - 2;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = i4 + i6;
                if (i7 >= i2 || aVar.a(i7)) {
                    i5 |= 1 << ((i - 1) - i6);
                }
            }
            int i8 = i5 & i3;
            if (i8 == i3) {
                aVar2.a(i8, i);
                i4--;
            } else if (i8 == 0) {
                aVar2.a(i5 | 1, i);
                i4--;
            } else {
                aVar2.a(i5, i);
            }
            i4 += i;
        }
        return aVar2;
    }

    private static com.google.zxing.common.a a(com.google.zxing.common.a aVar, int i, int i2) {
        com.google.zxing.common.reedsolomon.c cVar = new com.google.zxing.common.reedsolomon.c(a(i2));
        int i3 = i / i2;
        int[] b = b(aVar, i2, i3);
        cVar.a(b, i3 - (aVar.b / i2));
        com.google.zxing.common.a aVar2 = new com.google.zxing.common.a();
        aVar2.a(0, i % i2);
        for (int i4 : b) {
            aVar2.a(i4, i2);
        }
        return aVar2;
    }
}
