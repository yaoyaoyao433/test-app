package com.xiaomi.push;
/* loaded from: classes6.dex */
public final class iz {
    private static int a = Integer.MAX_VALUE;

    public static void a(iw iwVar, byte b) {
        a(iwVar, b, a);
    }

    private static void a(iw iwVar, byte b, int i) {
        if (i <= 0) {
            throw new iq("Maximum skip depth exceeded");
        }
        int i2 = 0;
        switch (b) {
            case 2:
                iwVar.f();
                return;
            case 3:
                iwVar.g();
                return;
            case 4:
                iwVar.k();
                return;
            case 5:
            case 7:
            case 9:
            default:
                return;
            case 6:
                iwVar.h();
                return;
            case 8:
                iwVar.i();
                return;
            case 10:
                iwVar.j();
                return;
            case 11:
                iwVar.m();
                return;
            case 12:
                break;
            case 13:
                iv c = iwVar.c();
                while (i2 < c.c) {
                    int i3 = i - 1;
                    a(iwVar, c.a, i3);
                    a(iwVar, c.b, i3);
                    i2++;
                }
                return;
            case 14:
                ja e = iwVar.e();
                while (i2 < e.b) {
                    a(iwVar, e.a, i - 1);
                    i2++;
                }
                return;
            case 15:
                iu d = iwVar.d();
                while (i2 < d.b) {
                    a(iwVar, d.a, i - 1);
                    i2++;
                }
                return;
        }
        while (true) {
            it b2 = iwVar.b();
            if (b2.b == 0) {
                return;
            }
            a(iwVar, b2.b, i - 1);
        }
    }
}
