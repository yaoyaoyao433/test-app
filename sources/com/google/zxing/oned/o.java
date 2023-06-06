package com.google.zxing.oned;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class o extends l {
    static final int[] b = {1, 1, 1};
    static final int[] c = {1, 1, 1, 1, 1};
    static final int[][] d = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
    static final int[][] e = new int[20];

    static {
        System.arraycopy(d, 0, e, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr = d[i - 10];
            int[] iArr2 = new int[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                iArr2[i2] = iArr[(iArr.length - i2) - 1];
            }
            e[i] = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(CharSequence charSequence) throws com.google.zxing.d {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt < 0 || charAt > 9) {
                throw com.google.zxing.d.a();
            }
            i += charAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw com.google.zxing.d.a();
            }
            i3 += charAt2;
        }
        return i3 % 10 == 0;
    }
}
