package com.google.zxing.datamatrix.encoder;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f implements g {
    @Override // com.google.zxing.datamatrix.encoder.g
    public final void a(h hVar) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        while (true) {
            z = true;
            if (!hVar.b()) {
                break;
            }
            char a = hVar.a();
            if (a >= ' ' && a <= '?') {
                sb.append(a);
            } else if (a >= '@' && a <= '^') {
                sb.append((char) (a - '@'));
            } else {
                j.c(a);
            }
            hVar.f++;
            if (sb.length() >= 4) {
                hVar.a(a(sb, 0));
                sb.delete(0, 4);
                if (j.a(hVar.a, hVar.f, 4) != 4) {
                    hVar.g = 0;
                    break;
                }
            }
        }
        sb.append((char) 31);
        try {
            int length = sb.length();
            if (length == 0) {
                return;
            }
            if (length == 1) {
                hVar.d();
                int length2 = hVar.h.b - hVar.e.length();
                if (hVar.c() - hVar.f == 0 && length2 <= 2) {
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i = length - 1;
            String a2 = a(sb, 0);
            if (!(!hVar.b()) || i > 2) {
                z = false;
            }
            if (i <= 2) {
                hVar.a(hVar.e.length() + i);
                if (hVar.h.b - hVar.e.length() >= 3) {
                    hVar.a(hVar.e.length() + a2.length());
                    z = false;
                }
            }
            if (!z) {
                hVar.a(a2);
            } else {
                hVar.h = null;
                hVar.f -= i;
            }
        } finally {
            hVar.g = 0;
        }
    }

    private static String a(CharSequence charSequence, int i) {
        int length = charSequence.length() - 0;
        if (length == 0) {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        int charAt = (charSequence.charAt(0) << 18) + ((length >= 2 ? charSequence.charAt(1) : (char) 0) << '\f') + ((length >= 3 ? charSequence.charAt(2) : (char) 0) << 6) + (length >= 4 ? charSequence.charAt(3) : (char) 0);
        char c = (char) ((charAt >> 8) & 255);
        char c2 = (char) (charAt & 255);
        StringBuilder sb = new StringBuilder(3);
        sb.append((char) ((charAt >> 16) & 255));
        if (length >= 2) {
            sb.append(c);
        }
        if (length >= 3) {
            sb.append(c2);
        }
        return sb.toString();
    }
}
