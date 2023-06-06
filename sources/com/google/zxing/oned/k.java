package com.google.zxing.oned;

import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class k extends m {
    private static final int[] a = {1, 1, 1, 1};
    private static final int[] b = {3, 1, 1};

    @Override // com.google.zxing.oned.m, com.google.zxing.g
    public final com.google.zxing.common.b a(String str, com.google.zxing.a aVar, int i, int i2, Map<com.google.zxing.c, ?> map) throws com.google.zxing.h {
        if (aVar != com.google.zxing.a.ITF) {
            throw new IllegalArgumentException("Can only encode ITF, but got " + aVar);
        }
        return super.a(str, aVar, i, i2, map);
    }

    @Override // com.google.zxing.oned.m
    public final boolean[] a(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            if (length > 80) {
                throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length);
            }
            boolean[] zArr = new boolean[(length * 9) + 9];
            int a2 = a(zArr, 0, a, true);
            for (int i = 0; i < length; i += 2) {
                int digit = Character.digit(str.charAt(i), 10);
                int digit2 = Character.digit(str.charAt(i + 1), 10);
                int[] iArr = new int[18];
                for (int i2 = 0; i2 < 5; i2++) {
                    int i3 = i2 * 2;
                    iArr[i3] = j.a[digit][i2];
                    iArr[i3 + 1] = j.a[digit2][i2];
                }
                a2 += a(zArr, a2, iArr, true);
            }
            a(zArr, a2, b, true);
            return zArr;
        }
        throw new IllegalArgumentException("The lenght of the input should be even");
    }
}
