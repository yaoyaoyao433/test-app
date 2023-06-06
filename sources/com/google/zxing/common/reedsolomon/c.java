package com.google.zxing.common.reedsolomon;

import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    private final a a;
    private final List<b> b = new ArrayList();

    public c(a aVar) {
        this.a = aVar;
        this.b.add(new b(aVar, new int[]{1}));
    }

    private b a(int i) {
        if (i >= this.b.size()) {
            int i2 = 1;
            b bVar = this.b.get(this.b.size() - 1);
            int size = this.b.size();
            while (size <= i) {
                a aVar = this.a;
                int[] iArr = new int[2];
                iArr[0] = i2;
                iArr[i2] = this.a.i[(size - 1) + this.a.m];
                b bVar2 = new b(aVar, iArr);
                if (!bVar.a.equals(bVar2.a)) {
                    throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                }
                if (!bVar.a() && !bVar2.a()) {
                    int[] iArr2 = bVar.b;
                    int length = iArr2.length;
                    int[] iArr3 = bVar2.b;
                    int length2 = iArr3.length;
                    int[] iArr4 = new int[(length + length2) - i2];
                    for (int i3 = 0; i3 < length; i3++) {
                        int i4 = iArr2[i3];
                        for (int i5 = 0; i5 < length2; i5++) {
                            int i6 = i3 + i5;
                            iArr4[i6] = a.a(iArr4[i6], bVar.a.b(i4, iArr3[i5]));
                        }
                    }
                    bVar = new b(bVar.a, iArr4);
                } else {
                    bVar = bVar.a.k;
                }
                this.b.add(bVar);
                size++;
                i2 = 1;
            }
        }
        return this.b.get(i);
    }

    public final void a(int[] iArr, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        b a = a(i);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] iArr3 = new b(this.a, iArr2).a(i, 1).a(a)[1].b;
        int length2 = i - iArr3.length;
        for (int i2 = 0; i2 < length2; i2++) {
            iArr[length + i2] = 0;
        }
        System.arraycopy(iArr3, 0, iArr, length + length2, iArr3.length);
    }
}
