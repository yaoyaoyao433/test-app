package com.google.zxing.aztec;

import com.google.zxing.c;
import com.google.zxing.common.b;
import com.google.zxing.g;
import com.meituan.robust.common.CommonConstant;
import java.nio.charset.Charset;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements g {
    private static final Charset a = Charset.forName(CommonConstant.Encoding.ISO88591);

    @Override // com.google.zxing.g
    public final b a(String str, com.google.zxing.a aVar, int i, int i2, Map<c, ?> map) {
        String str2 = map == null ? null : (String) map.get(c.CHARACTER_SET);
        Number number = map == null ? null : (Number) map.get(c.ERROR_CORRECTION);
        Number number2 = map != null ? (Number) map.get(c.AZTEC_LAYERS) : null;
        Charset forName = str2 == null ? a : Charset.forName(str2);
        int intValue = number == null ? 33 : number.intValue();
        int intValue2 = number2 == null ? 0 : number2.intValue();
        if (aVar != com.google.zxing.a.AZTEC) {
            throw new IllegalArgumentException("Can only encode AZTEC, but got " + aVar);
        }
        return a(com.google.zxing.aztec.encoder.c.a(str.getBytes(forName), intValue, intValue2), i, i2);
    }

    private static b a(com.google.zxing.aztec.encoder.a aVar, int i, int i2) {
        b bVar = aVar.e;
        if (bVar == null) {
            throw new IllegalStateException();
        }
        int i3 = bVar.a;
        int i4 = bVar.b;
        int max = Math.max(i, i3);
        int max2 = Math.max(i2, i4);
        int min = Math.min(max / i3, max2 / i4);
        int i5 = (max - (i3 * min)) / 2;
        int i6 = (max2 - (i4 * min)) / 2;
        b bVar2 = new b(max, max2);
        int i7 = 0;
        while (i7 < i4) {
            int i8 = i5;
            int i9 = 0;
            while (i9 < i3) {
                if (bVar.a(i9, i7)) {
                    bVar2.a(i8, i6, min, min);
                }
                i9++;
                i8 += min;
            }
            i7++;
            i6 += min;
        }
        return bVar2;
    }
}
