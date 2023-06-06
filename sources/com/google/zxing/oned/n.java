package com.google.zxing.oned;

import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class n implements com.google.zxing.g {
    private final h a = new h();

    @Override // com.google.zxing.g
    public final com.google.zxing.common.b a(String str, com.google.zxing.a aVar, int i, int i2, Map<com.google.zxing.c, ?> map) throws com.google.zxing.h {
        if (aVar != com.google.zxing.a.UPC_A) {
            throw new IllegalArgumentException("Can only encode UPC-A, but got " + aVar);
        }
        return this.a.a(a(str), com.google.zxing.a.EAN_13, i, i2, map);
    }

    private static String a(String str) {
        int length = str.length();
        if (length == 11) {
            int i = 0;
            for (int i2 = 0; i2 < 11; i2++) {
                i += (str.charAt(i2) - '0') * (i2 % 2 == 0 ? 3 : 1);
            }
            str = str + ((1000 - i) % 10);
        } else if (length != 12) {
            throw new IllegalArgumentException("Requested contents should be 11 or 12 digits long, but got " + str.length());
        }
        return "0" + str;
    }
}
