package com.google.zxing.datamatrix.encoder;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements g {
    @Override // com.google.zxing.datamatrix.encoder.g
    public final void a(h hVar) {
        int i;
        String str = hVar.a;
        int i2 = hVar.f;
        int length = str.length();
        if (i2 < length) {
            char charAt = str.charAt(i2);
            i = 0;
            while (j.a(charAt) && i2 < length) {
                i++;
                i2++;
                if (i2 < length) {
                    charAt = str.charAt(i2);
                }
            }
        } else {
            i = 0;
        }
        if (i >= 2) {
            char charAt2 = hVar.a.charAt(hVar.f);
            char charAt3 = hVar.a.charAt(hVar.f + 1);
            if (j.a(charAt2) && j.a(charAt3)) {
                hVar.a((char) (((charAt2 - '0') * 10) + (charAt3 - '0') + 130));
                hVar.f += 2;
                return;
            }
            throw new IllegalArgumentException("not digits: " + charAt2 + charAt3);
        }
        char a = hVar.a();
        int a2 = j.a(hVar.a, hVar.f, 0);
        if (a2 != 0) {
            switch (a2) {
                case 1:
                    hVar.a((char) 230);
                    hVar.g = 1;
                    return;
                case 2:
                    hVar.a((char) 239);
                    hVar.g = 2;
                    return;
                case 3:
                    hVar.a((char) 238);
                    hVar.g = 3;
                    return;
                case 4:
                    hVar.a((char) 240);
                    hVar.g = 4;
                    return;
                case 5:
                    hVar.a((char) 231);
                    hVar.g = 5;
                    return;
                default:
                    throw new IllegalStateException("Illegal mode: " + a2);
            }
        } else if (j.b(a)) {
            hVar.a((char) 235);
            hVar.a((char) ((a - 128) + 1));
            hVar.f++;
        } else {
            hVar.a((char) (a + 1));
            hVar.f++;
        }
    }
}
