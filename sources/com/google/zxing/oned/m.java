package com.google.zxing.oned;

import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class m implements com.google.zxing.g {
    public int a() {
        return 10;
    }

    public abstract boolean[] a(String str);

    @Override // com.google.zxing.g
    public com.google.zxing.common.b a(String str, com.google.zxing.a aVar, int i, int i2, Map<com.google.zxing.c, ?> map) throws com.google.zxing.h {
        Integer num;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i + 'x' + i2);
        }
        int a = a();
        if (map != null && (num = (Integer) map.get(com.google.zxing.c.MARGIN)) != null) {
            a = num.intValue();
        }
        return a(a(str), i, i2, a);
    }

    private static com.google.zxing.common.b a(boolean[] zArr, int i, int i2, int i3) {
        int length = zArr.length;
        int i4 = i3 + length;
        int max = Math.max(i, i4);
        int max2 = Math.max(1, i2);
        int i5 = max / i4;
        com.google.zxing.common.b bVar = new com.google.zxing.common.b(max, max2);
        int i6 = (max - (length * i5)) / 2;
        int i7 = 0;
        while (i7 < length) {
            if (zArr[i7]) {
                bVar.a(i6, 0, i5, max2);
            }
            i7++;
            i6 += i5;
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int a(boolean[] zArr, int i, int[] iArr, boolean z) {
        int length = iArr.length;
        int i2 = i;
        boolean z2 = z;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            int i6 = i2;
            int i7 = 0;
            while (i7 < i5) {
                zArr[i6] = z2;
                i7++;
                i6++;
            }
            i4 += i5;
            z2 = !z2;
            i3++;
            i2 = i6;
        }
        return i4;
    }
}
