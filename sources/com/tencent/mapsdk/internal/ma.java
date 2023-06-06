package com.tencent.mapsdk.internal;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ma implements md {
    private static byte a(InputStream inputStream) throws IOException {
        return (byte) inputStream.read();
    }

    private static byte[] a(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            i2 += inputStream.read(bArr, i2, i - i2);
        }
        return bArr;
    }

    private static int c(InputStream inputStream) throws IOException {
        return (int) a(2, inputStream);
    }

    private static int e(InputStream inputStream) throws IOException {
        return (int) a(4, inputStream);
    }

    private static long f(InputStream inputStream) throws IOException {
        return a(8, inputStream);
    }

    private static boolean b(InputStream inputStream) throws IOException {
        return ((byte) inputStream.read()) != 0;
    }

    private static char d(InputStream inputStream) throws IOException {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j |= (((byte) inputStream.read()) & 255) << (i * 8);
        }
        return (char) j;
    }

    private static String g(InputStream inputStream) throws IOException {
        int a = (int) a(2, inputStream);
        byte[] bArr = new byte[a];
        int i = 0;
        while (i < a) {
            i += inputStream.read(bArr, i, a - i);
        }
        return new String(bArr);
    }

    private static long a(int i, InputStream inputStream) throws IOException {
        long j = 0;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            j |= (((byte) inputStream.read()) & 255) << (i2 * 8);
        }
        return j;
    }
}
