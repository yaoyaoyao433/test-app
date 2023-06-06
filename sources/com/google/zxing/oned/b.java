package com.google.zxing.oned;

import com.meituan.robust.common.CommonConstant;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends m {
    private static final char[] a = {'A', 'B', 'C', 'D'};
    private static final char[] b = {'T', 'N', '*', 'E'};
    private static final char[] c = {'/', ':', '+', CommonConstant.Symbol.DOT_CHAR};

    @Override // com.google.zxing.oned.m
    public final boolean[] a(String str) {
        int i;
        if (str.length() < 2) {
            throw new IllegalArgumentException("Codabar should start/end with start/stop symbols");
        }
        char upperCase = Character.toUpperCase(str.charAt(0));
        char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
        boolean z = a.a(a, upperCase) && a.a(a, upperCase2);
        boolean z2 = a.a(b, upperCase) && a.a(b, upperCase2);
        if (!z && !z2) {
            throw new IllegalArgumentException("Codabar should start/end with " + Arrays.toString(a) + ", or start/end with " + Arrays.toString(b));
        }
        int i2 = 20;
        for (int i3 = 1; i3 < str.length() - 1; i3++) {
            if (Character.isDigit(str.charAt(i3)) || str.charAt(i3) == '-' || str.charAt(i3) == '$') {
                i2 += 9;
            } else if (!a.a(c, str.charAt(i3))) {
                throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i3) + '\'');
            } else {
                i2 += 10;
            }
        }
        boolean[] zArr = new boolean[i2 + (str.length() - 1)];
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i5));
            if (i5 == 0 || i5 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i6 = 0;
            while (true) {
                if (i6 >= a.a.length) {
                    i = 0;
                    break;
                } else if (upperCase3 == a.a[i6]) {
                    i = a.b[i6];
                    break;
                } else {
                    i6++;
                }
            }
            int i7 = i4;
            int i8 = 0;
            boolean z3 = true;
            while (true) {
                int i9 = 0;
                while (i8 < 7) {
                    zArr[i7] = z3;
                    i7++;
                    if (((i >> (6 - i8)) & 1) == 0 || i9 == 1) {
                        z3 = !z3;
                        i8++;
                    } else {
                        i9++;
                    }
                }
                break;
            }
            if (i5 < str.length() - 1) {
                zArr[i7] = false;
                i7++;
            }
            i4 = i7;
        }
        return zArr;
    }
}
