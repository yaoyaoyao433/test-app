package com.google.zxing.datamatrix;

import com.google.zxing.c;
import com.google.zxing.common.b;
import com.google.zxing.datamatrix.encoder.e;
import com.google.zxing.datamatrix.encoder.i;
import com.google.zxing.datamatrix.encoder.j;
import com.google.zxing.datamatrix.encoder.k;
import com.google.zxing.datamatrix.encoder.l;
import com.google.zxing.g;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements g {
    @Override // com.google.zxing.g
    public final b a(String str, com.google.zxing.a aVar, int i, int i2, Map<c, ?> map) {
        com.google.zxing.b bVar;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (aVar != com.google.zxing.a.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got " + aVar);
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        } else {
            l lVar = l.FORCE_NONE;
            com.google.zxing.b bVar2 = null;
            if (map != null) {
                l lVar2 = (l) map.get(c.DATA_MATRIX_SHAPE);
                if (lVar2 != null) {
                    lVar = lVar2;
                }
                bVar = (com.google.zxing.b) map.get(c.MIN_SIZE);
                if (bVar == null) {
                    bVar = null;
                }
                com.google.zxing.b bVar3 = (com.google.zxing.b) map.get(c.MAX_SIZE);
                if (bVar3 != null) {
                    bVar2 = bVar3;
                }
            } else {
                bVar = null;
            }
            String a = j.a(str, lVar, bVar, bVar2);
            k a2 = k.a(a.length(), lVar, bVar, bVar2, true);
            e eVar = new e(i.a(a, a2), a2.b(), a2.c());
            eVar.a();
            return a(eVar, a2);
        }
    }

    private static b a(e eVar, k kVar) {
        int b = kVar.b();
        int c = kVar.c();
        com.google.zxing.qrcode.encoder.b bVar = new com.google.zxing.qrcode.encoder.b(kVar.d(), kVar.e());
        int i = 0;
        for (int i2 = 0; i2 < c; i2++) {
            if (i2 % kVar.e == 0) {
                int i3 = 0;
                for (int i4 = 0; i4 < kVar.d(); i4++) {
                    bVar.a(i3, i, i4 % 2 == 0);
                    i3++;
                }
                i++;
            }
            int i5 = 0;
            for (int i6 = 0; i6 < b; i6++) {
                if (i6 % kVar.d == 0) {
                    bVar.a(i5, i, true);
                    i5++;
                }
                bVar.a(i5, i, eVar.b[(eVar.a * i2) + i6] == 1);
                i5++;
                if (i6 % kVar.d == kVar.d - 1) {
                    bVar.a(i5, i, i2 % 2 == 0);
                    i5++;
                }
            }
            i++;
            if (i2 % kVar.e == kVar.e - 1) {
                int i7 = 0;
                for (int i8 = 0; i8 < kVar.d(); i8++) {
                    bVar.a(i7, i, true);
                    i7++;
                }
                i++;
            }
        }
        int i9 = bVar.b;
        int i10 = bVar.c;
        b bVar2 = new b(i9, i10);
        bVar2.a();
        for (int i11 = 0; i11 < i9; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                if (bVar.a(i11, i12) == 1) {
                    bVar2.b(i11, i12);
                }
            }
        }
        return bVar2;
    }
}
