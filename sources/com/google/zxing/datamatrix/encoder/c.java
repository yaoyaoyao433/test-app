package com.google.zxing.datamatrix.encoder;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class c implements g {
    public int a() {
        return 1;
    }

    @Override // com.google.zxing.datamatrix.encoder.g
    public void a(h hVar) {
        int a;
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.b()) {
                break;
            }
            char a2 = hVar.a();
            hVar.f++;
            int a3 = a(a2, sb);
            int length = hVar.e.length() + ((sb.length() / 3) * 2);
            hVar.a(length);
            int i = hVar.h.b - length;
            if (!hVar.b()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (i < 2 || i > 2)) {
                    a3 = a(hVar, sb, sb2, a3);
                }
                while (sb.length() % 3 == 1 && ((a3 <= 3 && i != 1) || a3 > 3)) {
                    a3 = a(hVar, sb, sb2, a3);
                }
            } else if (sb.length() % 3 == 0 && (a = j.a(hVar.a, hVar.f, a())) != a()) {
                hVar.g = a;
                break;
            }
        }
        b(hVar, sb);
    }

    private int a(h hVar, StringBuilder sb, StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        hVar.f--;
        int a = a(hVar.a(), sb2);
        hVar.h = null;
        return a;
    }

    void b(h hVar, StringBuilder sb) {
        int length = sb.length() % 3;
        int length2 = hVar.e.length() + ((sb.length() / 3) * 2);
        hVar.a(length2);
        int i = hVar.h.b - length2;
        if (length == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                a(hVar, sb);
            }
            if (hVar.b()) {
                hVar.a((char) 254);
            }
        } else if (i == 1 && length == 1) {
            while (sb.length() >= 3) {
                a(hVar, sb);
            }
            if (hVar.b()) {
                hVar.a((char) 254);
            }
            hVar.f--;
        } else if (length == 0) {
            while (sb.length() >= 3) {
                a(hVar, sb);
            }
            if (i > 0 || hVar.b()) {
                hVar.a((char) 254);
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        hVar.g = 0;
    }

    int a(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
            return 1;
        } else if (c >= 'A' && c <= 'Z') {
            sb.append((char) ((c - 'A') + 14));
            return 1;
        } else if (c >= 0 && c <= 31) {
            sb.append((char) 0);
            sb.append(c);
            return 2;
        } else if (c >= '!' && c <= '/') {
            sb.append((char) 1);
            sb.append((char) (c - '!'));
            return 2;
        } else if (c >= ':' && c <= '@') {
            sb.append((char) 1);
            sb.append((char) ((c - ':') + 15));
            return 2;
        } else if (c >= '[' && c <= '_') {
            sb.append((char) 1);
            sb.append((char) ((c - '[') + 22));
            return 2;
        } else if (c >= '`' && c <= 127) {
            sb.append((char) 2);
            sb.append((char) (c - '`'));
            return 2;
        } else if (c >= 128) {
            sb.append("\u0001\u001e");
            return a((char) (c - 128), sb) + 2;
        } else {
            throw new IllegalArgumentException("Illegal character: " + c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(h hVar, StringBuilder sb) {
        int charAt = (sb.charAt(0) * 1600) + (sb.charAt(1) * '(') + sb.charAt(2) + 1;
        hVar.a(new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)}));
        sb.delete(0, 3);
    }
}
