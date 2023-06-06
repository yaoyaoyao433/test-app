package com.google.zxing.pdf417.encoder;

import com.google.zxing.h;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g {
    private static final byte[] a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};
    private static final byte[] b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};
    private static final byte[] c = new byte[128];
    private static final byte[] d = new byte[128];
    private static final List<String> e = Arrays.asList("Cp437", "IBM437");

    private static boolean a(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    private static boolean b(char c2) {
        if (c2 != ' ') {
            return c2 >= 'A' && c2 <= 'Z';
        }
        return true;
    }

    private static boolean c(char c2) {
        if (c2 != ' ') {
            return c2 >= 'a' && c2 <= 'z';
        }
        return true;
    }

    private static boolean f(char c2) {
        if (c2 == '\t' || c2 == '\n' || c2 == '\r') {
            return true;
        }
        return c2 >= ' ' && c2 <= '~';
    }

    static {
        Arrays.fill(c, (byte) -1);
        for (byte b2 = 0; b2 < a.length; b2 = (byte) (b2 + 1)) {
            byte b3 = a[b2];
            if (b3 > 0) {
                c[b3] = b2;
            }
        }
        Arrays.fill(d, (byte) -1);
        for (byte b4 = 0; b4 < b.length; b4 = (byte) (b4 + 1)) {
            byte b5 = b[b4];
            if (b5 > 0) {
                d[b5] = b4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str, c cVar, Charset charset) throws h {
        int a2;
        com.google.zxing.common.c a3;
        StringBuilder sb = new StringBuilder(str.length());
        if (charset != null && !e.contains(charset.name()) && (a3 = com.google.zxing.common.c.a(charset.name())) != null) {
            int i = a3.B[0];
            if (i >= 0 && i < 900) {
                sb.append((char) 927);
                sb.append((char) i);
            } else if (i < 810900) {
                sb.append((char) 926);
                sb.append((char) ((i / 900) - 1));
                sb.append((char) (i % 900));
            } else if (i < 811800) {
                sb.append((char) 925);
                sb.append((char) (810900 - i));
            } else {
                throw new h("ECI number not in valid range from 0..811799, but was " + i);
            }
        }
        int length = str.length();
        if (cVar == c.TEXT) {
            a(str, 0, length, sb, 0);
        } else if (cVar == c.BYTE) {
            byte[] a4 = a(str, charset);
            a(a4, 0, a4.length, 1, sb);
        } else if (cVar == c.NUMERIC) {
            sb.append((char) 902);
            a(str, 0, length, sb);
        } else {
            byte[] bArr = null;
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                int i4 = 0;
                while (i2 < length) {
                    a2 = a(str, i2);
                    if (a2 >= 13) {
                        break;
                    }
                    int b2 = b(str, i2);
                    if (b2 >= 5 || a2 == length) {
                        if (i3 != 0) {
                            sb.append((char) 900);
                            i3 = 0;
                            i4 = 0;
                        }
                        i4 = a(str, i2, b2, sb, i4);
                        i2 += b2;
                    } else {
                        if (bArr == null) {
                            bArr = a(str, charset);
                        }
                        int a5 = a(str, bArr, i2);
                        if (a5 == 0) {
                            a5 = 1;
                        }
                        if (a5 == 1 && i3 == 0) {
                            a(bArr, i2, 1, 0, sb);
                        } else {
                            a(bArr, i2, a5, i3, sb);
                            i3 = 1;
                            i4 = 0;
                        }
                        i2 += a5;
                    }
                }
                sb.append((char) 902);
                i3 = 2;
                a(str, i2, a2, sb);
                i2 += a2;
            }
        }
        return sb.toString();
    }

    private static byte[] a(String str, Charset charset) throws h {
        if (charset == null) {
            for (String str2 : e) {
                try {
                    charset = Charset.forName(str2);
                } catch (UnsupportedCharsetException unused) {
                }
            }
            if (charset == null) {
                throw new h("No support for any encoding: " + e);
            }
        }
        return str.getBytes(charset);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0010 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int a(java.lang.CharSequence r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.encoder.g.a(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    private static void a(byte[] bArr, int i, int i2, int i3, StringBuilder sb) {
        int i4;
        if (i2 == 1 && i3 == 0) {
            sb.append((char) 913);
        } else if (i2 % 6 == 0) {
            sb.append((char) 924);
        } else {
            sb.append((char) 901);
        }
        if (i2 >= 6) {
            char[] cArr = new char[5];
            i4 = i;
            while ((i + i2) - i4 >= 6) {
                long j = 0;
                for (int i5 = 0; i5 < 6; i5++) {
                    j = (j << 8) + (bArr[i4 + i5] & 255);
                }
                for (int i6 = 0; i6 < 5; i6++) {
                    cArr[i6] = (char) (j % 900);
                    j /= 900;
                }
                for (int i7 = 4; i7 >= 0; i7--) {
                    sb.append(cArr[i7]);
                }
                i4 += 6;
            }
        } else {
            i4 = i;
        }
        while (i4 < i + i2) {
            sb.append((char) (bArr[i4] & 255));
            i4++;
        }
    }

    private static void a(String str, int i, int i2, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i2 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900L);
        BigInteger valueOf2 = BigInteger.valueOf(0L);
        int i3 = 0;
        while (i3 < i2 - 1) {
            sb2.setLength(0);
            int min = Math.min(44, i2 - i3);
            StringBuilder sb3 = new StringBuilder("1");
            int i4 = i + i3;
            sb3.append(str.substring(i4, i4 + min));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i3 += min;
        }
    }

    private static boolean d(char c2) {
        return c[c2] != -1;
    }

    private static boolean e(char c2) {
        return d[c2] != -1;
    }

    private static int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            char charAt = charSequence.charAt(i);
            while (a(charAt) && i < length) {
                i2++;
                i++;
                if (i < length) {
                    charAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        return (r1 - r7) - r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int b(java.lang.CharSequence r6, int r7) {
        /*
            int r0 = r6.length()
            r1 = r7
        L5:
            if (r1 >= r0) goto L37
            char r2 = r6.charAt(r1)
            r3 = 0
        Lc:
            r4 = 13
            if (r3 >= r4) goto L23
            boolean r5 = a(r2)
            if (r5 == 0) goto L23
            if (r1 >= r0) goto L23
            int r3 = r3 + 1
            int r1 = r1 + 1
            if (r1 >= r0) goto Lc
            char r2 = r6.charAt(r1)
            goto Lc
        L23:
            if (r3 < r4) goto L28
            int r1 = r1 - r7
            int r1 = r1 - r3
            return r1
        L28:
            if (r3 > 0) goto L5
            char r2 = r6.charAt(r1)
            boolean r2 = f(r2)
            if (r2 == 0) goto L37
            int r1 = r1 + 1
            goto L5
        L37:
            int r1 = r1 - r7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.encoder.g.b(java.lang.CharSequence, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
        return r1 - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
        return r1 - r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int a(java.lang.CharSequence r7, byte[] r8, int r9) throws com.google.zxing.h {
        /*
            int r0 = r7.length()
            r1 = r9
        L5:
            if (r1 >= r0) goto L70
            char r2 = r7.charAt(r1)
            r3 = 0
            r4 = r2
            r2 = 0
        Le:
            r5 = 13
            if (r2 >= r5) goto L23
            boolean r6 = a(r4)
            if (r6 == 0) goto L23
            int r2 = r2 + 1
            int r6 = r1 + r2
            if (r6 >= r0) goto L23
            char r4 = r7.charAt(r6)
            goto Le
        L23:
            if (r2 < r5) goto L27
            int r1 = r1 - r9
            return r1
        L27:
            r2 = 5
            if (r3 >= r2) goto L3b
            boolean r4 = f(r4)
            if (r4 == 0) goto L3b
            int r3 = r3 + 1
            int r4 = r1 + r3
            if (r4 >= r0) goto L3b
            char r4 = r7.charAt(r4)
            goto L27
        L3b:
            if (r3 < r2) goto L3f
            int r1 = r1 - r9
            return r1
        L3f:
            char r2 = r7.charAt(r1)
            r3 = r8[r1]
            r4 = 63
            if (r3 != r4) goto L6d
            if (r2 != r4) goto L4c
            goto L6d
        L4c:
            com.google.zxing.h r7 = new com.google.zxing.h
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Non-encodable character detected: "
            r8.<init>(r9)
            r8.append(r2)
            java.lang.String r9 = " (Unicode: "
            r8.append(r9)
            r8.append(r2)
            r9 = 41
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L6d:
            int r1 = r1 + 1
            goto L5
        L70:
            int r1 = r1 - r9
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.encoder.g.a(java.lang.CharSequence, byte[], int):int");
    }
}
