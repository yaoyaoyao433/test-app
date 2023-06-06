package com.meizu.cloud.pushsdk.c.c;

import java.io.Closeable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
import java.util.regex.Pattern;
/* loaded from: classes3.dex */
public final class m {
    public static final byte[] a = new byte[0];
    public static final String[] b = new String[0];
    public static final Charset c = Charset.forName("UTF-8");
    public static final TimeZone d = TimeZone.getTimeZone("GMT");
    private static final Pattern e = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static int a(String str, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            switch (str.charAt(i3)) {
                case '\t':
                case '\n':
                case '\f':
                case '\r':
                case ' ':
                default:
                    return i3;
            }
        }
        return i2;
    }

    public static int a(String str, int i, int i2, char c2) {
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int a(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static <T> List<T> a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static void a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static int b(String str, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            switch (str.charAt(i3)) {
                case '\t':
                case '\n':
                case '\f':
                case '\r':
                case ' ':
                default:
                    return i3 + 1;
            }
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r6) {
        /*
            r0 = 0
            java.lang.String r6 = java.net.IDN.toASCII(r6)     // Catch: java.lang.IllegalArgumentException -> L3a
            java.util.Locale r1 = java.util.Locale.US     // Catch: java.lang.IllegalArgumentException -> L3a
            java.lang.String r6 = r6.toLowerCase(r1)     // Catch: java.lang.IllegalArgumentException -> L3a
            boolean r1 = r6.isEmpty()     // Catch: java.lang.IllegalArgumentException -> L3a
            if (r1 == 0) goto L12
            return r0
        L12:
            r1 = 0
            r2 = 0
        L14:
            int r3 = r6.length()     // Catch: java.lang.IllegalArgumentException -> L3a
            r4 = 1
            if (r2 >= r3) goto L35
            char r3 = r6.charAt(r2)     // Catch: java.lang.IllegalArgumentException -> L3a
            r5 = 31
            if (r3 <= r5) goto L36
            r5 = 127(0x7f, float:1.78E-43)
            if (r3 < r5) goto L28
            goto L36
        L28:
            java.lang.String r5 = " #%/:?@[\\]"
            int r3 = r5.indexOf(r3)     // Catch: java.lang.IllegalArgumentException -> L3a
            r5 = -1
            if (r3 == r5) goto L32
            goto L36
        L32:
            int r2 = r2 + 1
            goto L14
        L35:
            r4 = 0
        L36:
            if (r4 == 0) goto L39
            return r0
        L39:
            return r6
        L3a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.c.c.m.a(java.lang.String):java.lang.String");
    }
}
