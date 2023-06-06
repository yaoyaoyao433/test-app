package com.google.zxing.oned;

import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class h extends p {
    @Override // com.google.zxing.oned.m, com.google.zxing.g
    public final com.google.zxing.common.b a(String str, com.google.zxing.a aVar, int i, int i2, Map<com.google.zxing.c, ?> map) throws com.google.zxing.h {
        if (aVar != com.google.zxing.a.EAN_13) {
            throw new IllegalArgumentException("Can only encode EAN_13, but got " + aVar);
        }
        return super.a(str, aVar, i, i2, map);
    }

    @Override // com.google.zxing.oned.m
    public final boolean[] a(String str) {
        if (str.length() != 13) {
            throw new IllegalArgumentException("Requested contents should be 13 digits long, but got " + str.length());
        }
        try {
            if (!o.a(str)) {
                throw new IllegalArgumentException("Contents do not pass checksum");
            }
            int i = g.a[Integer.parseInt(str.substring(0, 1))];
            boolean[] zArr = new boolean[95];
            int a = a(zArr, 0, o.b, true) + 0;
            int i2 = 1;
            while (i2 <= 6) {
                int i3 = i2 + 1;
                int parseInt = Integer.parseInt(str.substring(i2, i3));
                if (((i >> (6 - i2)) & 1) == 1) {
                    parseInt += 10;
                }
                a += a(zArr, a, o.e[parseInt], false);
                i2 = i3;
            }
            int a2 = a + a(zArr, a, o.c, false);
            int i4 = 7;
            while (i4 <= 12) {
                int i5 = i4 + 1;
                a2 += a(zArr, a2, o.d[Integer.parseInt(str.substring(i4, i5))], true);
                i4 = i5;
            }
            a(zArr, a2, o.b, true);
            return zArr;
        } catch (com.google.zxing.d unused) {
            throw new IllegalArgumentException("Illegal contents");
        }
    }
}
