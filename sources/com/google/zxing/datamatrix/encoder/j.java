package com.google.zxing.datamatrix.encoder;

import com.tencent.smtt.sdk.TbsListener;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class j {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(char c) {
        return c >= '0' && c <= '9';
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(char c) {
        return c >= 128 && c <= 255;
    }

    private static boolean e(char c) {
        return c == '\r' || c == '*' || c == '>';
    }

    public static String a(String str, l lVar, com.google.zxing.b bVar, com.google.zxing.b bVar2) {
        int i = 0;
        g[] gVarArr = {new a(), new c(), new m(), new n(), new f(), new b()};
        h hVar = new h(str);
        hVar.b = lVar;
        hVar.c = bVar;
        hVar.d = bVar2;
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            hVar.a((char) 236);
            hVar.i = 2;
            hVar.f += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            hVar.a((char) 237);
            hVar.i = 2;
            hVar.f += 7;
        }
        while (hVar.b()) {
            gVarArr[i].a(hVar);
            if (hVar.g >= 0) {
                i = hVar.g;
                hVar.g = -1;
            }
        }
        int length = hVar.e.length();
        hVar.d();
        int i2 = hVar.h.b;
        if (length < i2 && i != 0 && i != 5) {
            hVar.a((char) 254);
        }
        StringBuilder sb = hVar.e;
        if (sb.length() < i2) {
            sb.append((char) 129);
        }
        while (sb.length() < i2) {
            int length2 = (((sb.length() + 1) * TbsListener.ErrorCode.NEEDDOWNLOAD_10) % 253) + 1 + 129;
            if (length2 > 254) {
                length2 -= 254;
            }
            sb.append((char) length2);
        }
        return hVar.e.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(CharSequence charSequence, int i, int i2) {
        float[] fArr;
        if (i >= charSequence.length()) {
            return i2;
        }
        if (i2 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            float[] fArr2 = {1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr2[i2] = 0.0f;
            fArr = fArr2;
        }
        int i3 = 0;
        while (true) {
            int i4 = i + i3;
            if (i4 == charSequence.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int a = a(fArr, iArr, Integer.MAX_VALUE, bArr);
                int a2 = a(bArr);
                if (iArr[0] == a) {
                    return 0;
                }
                if (a2 != 1 || bArr[5] <= 0) {
                    if (a2 != 1 || bArr[4] <= 0) {
                        if (a2 != 1 || bArr[2] <= 0) {
                            return (a2 != 1 || bArr[3] <= 0) ? 1 : 3;
                        }
                        return 2;
                    }
                    return 4;
                }
                return 5;
            }
            char charAt = charSequence.charAt(i4);
            i3++;
            if (a(charAt)) {
                fArr[0] = (float) (fArr[0] + 0.5d);
            } else if (b(charAt)) {
                fArr[0] = (int) Math.ceil(fArr[0]);
                fArr[0] = fArr[0] + 2.0f;
            } else {
                fArr[0] = (int) Math.ceil(fArr[0]);
                fArr[0] = fArr[0] + 1.0f;
            }
            if (charAt == ' ' || (charAt >= '0' && charAt <= '9') || (charAt >= 'A' && charAt <= 'Z')) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (b(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (charAt == ' ' || (charAt >= '0' && charAt <= '9') || (charAt >= 'a' && charAt <= 'z')) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (b(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (d(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (b(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (charAt >= ' ' && charAt <= '^') {
                fArr[4] = fArr[4] + 0.75f;
            } else if (b(charAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            fArr[5] = fArr[5] + 1.0f;
            if (i3 >= 4) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                a(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int a3 = a(bArr2);
                if (iArr2[0] < iArr2[5] && iArr2[0] < iArr2[1] && iArr2[0] < iArr2[2] && iArr2[0] < iArr2[3] && iArr2[0] < iArr2[4]) {
                    return 0;
                }
                if (iArr2[5] < iArr2[0] || bArr2[1] + bArr2[2] + bArr2[3] + bArr2[4] == 0) {
                    return 5;
                }
                if (a3 == 1 && bArr2[4] > 0) {
                    return 4;
                }
                if (a3 == 1 && bArr2[2] > 0) {
                    return 2;
                }
                if (a3 == 1 && bArr2[3] > 0) {
                    return 3;
                }
                if (iArr2[1] + 1 < iArr2[0] && iArr2[1] + 1 < iArr2[5] && iArr2[1] + 1 < iArr2[4] && iArr2[1] + 1 < iArr2[2]) {
                    if (iArr2[1] < iArr2[3]) {
                        return 1;
                    }
                    if (iArr2[1] == iArr2[3]) {
                        for (int i5 = i + i3 + 1; i5 < charSequence.length(); i5++) {
                            char charAt2 = charSequence.charAt(i5);
                            if (e(charAt2)) {
                                return 3;
                            }
                            if (!d(charAt2)) {
                                break;
                            }
                        }
                        return 1;
                    }
                }
            }
        }
    }

    private static int a(float[] fArr, int[] iArr, int i, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        int i2 = i;
        for (int i3 = 0; i3 < 6; i3++) {
            iArr[i3] = (int) Math.ceil(fArr[i3]);
            int i4 = iArr[i3];
            if (i2 > i4) {
                Arrays.fill(bArr, (byte) 0);
                i2 = i4;
            }
            if (i2 == i4) {
                bArr[i3] = (byte) (bArr[i3] + 1);
            }
        }
        return i2;
    }

    private static int a(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            i += bArr[i2];
        }
        return i;
    }

    private static boolean d(char c) {
        if (e(c) || c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(char c) {
        String hexString;
        throw new IllegalArgumentException("Illegal character: " + c + " (0x" + ("0000".substring(0, 4 - hexString.length()) + Integer.toHexString(c)) + ')');
    }
}
