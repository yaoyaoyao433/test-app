package com.google.zxing.datamatrix.encoder;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class n extends c {
    @Override // com.google.zxing.datamatrix.encoder.c
    public final int a() {
        return 3;
    }

    @Override // com.google.zxing.datamatrix.encoder.c, com.google.zxing.datamatrix.encoder.g
    public final void a(h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.b()) {
                break;
            }
            char a = hVar.a();
            hVar.f++;
            a(a, sb);
            if (sb.length() % 3 == 0) {
                a(hVar, sb);
                int a2 = j.a(hVar.a, hVar.f, 3);
                if (a2 != 3) {
                    hVar.g = a2;
                    break;
                }
            }
        }
        b(hVar, sb);
    }

    @Override // com.google.zxing.datamatrix.encoder.c
    final int a(char c, StringBuilder sb) {
        if (c == '\r') {
            sb.append((char) 0);
        } else if (c == '*') {
            sb.append((char) 1);
        } else if (c == '>') {
            sb.append((char) 2);
        } else if (c == ' ') {
            sb.append((char) 3);
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
        } else if (c >= 'A' && c <= 'Z') {
            sb.append((char) ((c - 'A') + 14));
        } else {
            j.c(c);
        }
        return 1;
    }

    @Override // com.google.zxing.datamatrix.encoder.c
    final void b(h hVar, StringBuilder sb) {
        hVar.d();
        int length = hVar.h.b - hVar.e.length();
        int length2 = sb.length();
        if (length2 == 2) {
            hVar.a((char) 254);
            hVar.f -= 2;
        } else if (length2 != 1) {
            return;
        } else {
            hVar.f--;
            if (length > 1) {
                hVar.a((char) 254);
            }
        }
        hVar.g = 0;
    }
}
