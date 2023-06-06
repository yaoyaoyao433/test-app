package com.google.zxing.pdf417;

import com.google.zxing.c;
import com.google.zxing.common.b;
import com.google.zxing.g;
import com.google.zxing.h;
import com.google.zxing.pdf417.encoder.d;
import com.google.zxing.pdf417.encoder.e;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements g {
    @Override // com.google.zxing.g
    public final b a(String str, com.google.zxing.a aVar, int i, int i2, Map<c, ?> map) throws h {
        boolean z;
        if (aVar != com.google.zxing.a.PDF_417) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got " + aVar);
        }
        e eVar = new e();
        if (map != null) {
            if (map.containsKey(c.PDF417_COMPACT)) {
                eVar.b = ((Boolean) map.get(c.PDF417_COMPACT)).booleanValue();
            }
            if (map.containsKey(c.PDF417_COMPACTION)) {
                eVar.c = (com.google.zxing.pdf417.encoder.c) map.get(c.PDF417_COMPACTION);
            }
            if (map.containsKey(c.PDF417_DIMENSIONS)) {
                d dVar = (d) map.get(c.PDF417_DIMENSIONS);
                int i3 = dVar.b;
                int i4 = dVar.a;
                int i5 = dVar.d;
                int i6 = dVar.c;
                eVar.f = i3;
                eVar.e = i4;
                eVar.g = i5;
                eVar.h = i6;
            }
            r0 = map.containsKey(c.MARGIN) ? ((Number) map.get(c.MARGIN)).intValue() : 30;
            if (map.containsKey(c.CHARACTER_SET)) {
                eVar.d = Charset.forName((String) map.get(c.CHARACTER_SET));
            }
        }
        eVar.a(str, 2);
        byte[][] a = eVar.a.a(2, 8);
        if ((i2 > i) ^ (a[0].length < a.length)) {
            a = a(a);
            z = true;
        } else {
            z = false;
        }
        int length = i / a[0].length;
        int length2 = i2 / a.length;
        if (length >= length2) {
            length = length2;
        }
        if (length > 1) {
            byte[][] a2 = eVar.a.a(length * 2, length * 4 * 2);
            if (z) {
                a2 = a(a2);
            }
            return a(a2, r0);
        }
        return a(a, r0);
    }

    private static b a(byte[][] bArr, int i) {
        int i2 = i * 2;
        b bVar = new b(bArr[0].length + i2, bArr.length + i2);
        bVar.a();
        int i3 = (bVar.b - i) - 1;
        int i4 = 0;
        while (i4 < bArr.length) {
            for (int i5 = 0; i5 < bArr[0].length; i5++) {
                if (bArr[i4][i5] == 1) {
                    bVar.b(i5 + i, i3);
                }
            }
            i4++;
            i3--;
        }
        return bVar;
    }

    private static byte[][] a(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance(byte.class, bArr[0].length, bArr.length);
        for (int i = 0; i < bArr.length; i++) {
            int length = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length] = bArr[i][i2];
            }
        }
        return bArr2;
    }
}
