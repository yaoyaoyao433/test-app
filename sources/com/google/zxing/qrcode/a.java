package com.google.zxing.qrcode;

import com.google.zxing.c;
import com.google.zxing.common.b;
import com.google.zxing.g;
import com.google.zxing.h;
import com.google.zxing.qrcode.encoder.f;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements g {
    @Override // com.google.zxing.g
    public final b a(String str, com.google.zxing.a aVar, int i, int i2, Map<c, ?> map) throws h {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (aVar != com.google.zxing.a.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got " + aVar);
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        } else {
            com.google.zxing.qrcode.decoder.a aVar2 = com.google.zxing.qrcode.decoder.a.L;
            int i3 = 4;
            if (map != null) {
                com.google.zxing.qrcode.decoder.a aVar3 = (com.google.zxing.qrcode.decoder.a) map.get(c.ERROR_CORRECTION);
                if (aVar3 != null) {
                    aVar2 = aVar3;
                }
                Integer num = (Integer) map.get(c.MARGIN);
                if (num != null) {
                    i3 = num.intValue();
                }
            }
            return a(com.google.zxing.qrcode.encoder.c.a(str, aVar2, map), i, i2, i3);
        }
    }

    private static b a(f fVar, int i, int i2, int i3) {
        com.google.zxing.qrcode.encoder.b bVar = fVar.e;
        if (bVar == null) {
            throw new IllegalStateException();
        }
        int i4 = bVar.b;
        int i5 = bVar.c;
        int i6 = i3 * 2;
        int i7 = i4 + i6;
        int i8 = i6 + i5;
        int max = Math.max(i, i7);
        int max2 = Math.max(i2, i8);
        int min = Math.min(max / i7, max2 / i8);
        int i9 = (max - (i4 * min)) / 2;
        int i10 = (max2 - (i5 * min)) / 2;
        b bVar2 = new b(max, max2);
        int i11 = 0;
        while (i11 < i5) {
            int i12 = i9;
            int i13 = 0;
            while (i13 < i4) {
                if (bVar.a(i13, i11) == 1) {
                    bVar2.a(i12, i10, min, min);
                }
                i13++;
                i12 += min;
            }
            i11++;
            i10 += min;
        }
        return bVar2;
    }
}
