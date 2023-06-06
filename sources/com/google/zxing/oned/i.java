package com.google.zxing.oned;

import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class i extends p {
    @Override // com.google.zxing.oned.m, com.google.zxing.g
    public final com.google.zxing.common.b a(String str, com.google.zxing.a aVar, int i, int i2, Map<com.google.zxing.c, ?> map) throws com.google.zxing.h {
        if (aVar != com.google.zxing.a.EAN_8) {
            throw new IllegalArgumentException("Can only encode EAN_8, but got " + aVar);
        }
        return super.a(str, aVar, i, i2, map);
    }

    @Override // com.google.zxing.oned.m
    public final boolean[] a(String str) {
        if (str.length() != 8) {
            throw new IllegalArgumentException("Requested contents should be 8 digits long, but got " + str.length());
        }
        boolean[] zArr = new boolean[67];
        int a = a(zArr, 0, o.b, true) + 0;
        int i = 0;
        while (i <= 3) {
            int i2 = i + 1;
            a += a(zArr, a, o.d[Integer.parseInt(str.substring(i, i2))], false);
            i = i2;
        }
        int a2 = a + a(zArr, a, o.c, false);
        int i3 = 4;
        while (i3 <= 7) {
            int i4 = i3 + 1;
            a2 += a(zArr, a2, o.d[Integer.parseInt(str.substring(i3, i4))], true);
            i3 = i4;
        }
        a(zArr, a2, o.b, true);
        return zArr;
    }
}
