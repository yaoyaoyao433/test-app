package com.google.zxing.oned;

import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f extends m {
    @Override // com.google.zxing.oned.m, com.google.zxing.g
    public final com.google.zxing.common.b a(String str, com.google.zxing.a aVar, int i, int i2, Map<com.google.zxing.c, ?> map) throws com.google.zxing.h {
        if (aVar != com.google.zxing.a.CODE_39) {
            throw new IllegalArgumentException("Can only encode CODE_39, but got " + aVar);
        }
        return super.a(str, aVar, i, i2, map);
    }

    @Override // com.google.zxing.oned.m
    public final boolean[] a(String str) {
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length);
        }
        int[] iArr = new int[9];
        int i = length + 25;
        int i2 = 0;
        while (i2 < length) {
            int indexOf = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".indexOf(str.charAt(i2));
            if (indexOf < 0) {
                throw new IllegalArgumentException("Bad contents: " + str);
            }
            a(e.a[indexOf], iArr);
            int i3 = i;
            for (int i4 = 0; i4 < 9; i4++) {
                i3 += iArr[i4];
            }
            i2++;
            i = i3;
        }
        boolean[] zArr = new boolean[i];
        a(e.a[39], iArr);
        int a = a(zArr, 0, iArr, true);
        int[] iArr2 = {1};
        int a2 = a + a(zArr, a, iArr2, false);
        for (int i5 = 0; i5 < length; i5++) {
            a(e.a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".indexOf(str.charAt(i5))], iArr);
            int a3 = a2 + a(zArr, a2, iArr, true);
            a2 = a3 + a(zArr, a3, iArr2, false);
        }
        a(e.a[39], iArr);
        a(zArr, a2, iArr, true);
        return zArr;
    }

    private static void a(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }
}
