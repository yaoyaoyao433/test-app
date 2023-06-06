package com.tencent.mapsdk.internal;

import android.support.v4.view.MotionEventCompat;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class mc implements md {
    private static final String g = "UTF-16LE";
    private ByteArrayOutputStream h = new ByteArrayOutputStream();

    private void c(byte[] bArr) {
        this.h.write(bArr, 0, bArr.length);
    }

    private void a(byte b) {
        this.h.write(b);
    }

    private void a(boolean z) {
        a(z ? (byte) 1 : (byte) 0);
    }

    private void a(int i) {
        a(i, 2);
    }

    private void a(char c) {
        for (int i = 0; i < 2; i++) {
            a((byte) ((c >> (i * 8)) & 255));
        }
    }

    private static byte[] b(int i) {
        byte[] bArr = new byte[4];
        long j = i;
        for (int i2 = 3; i2 >= 0; i2--) {
            bArr[(4 - i2) - 1] = (byte) ((j >> (i2 * 8)) & 255);
        }
        return bArr;
    }

    private static void a(long j, byte[] bArr) {
        for (int i = 3; i >= 0; i--) {
            bArr[(4 - i) - 1] = (byte) ((j >> (i * 8)) & 255);
        }
    }

    private void c(int i) {
        a(i, 4);
    }

    private void a(long j) {
        a(j, 8);
    }

    private void a(String str) {
        if (str == null) {
            return;
        }
        byte[] bytes = str.getBytes();
        a(bytes.length, 2);
        this.h.write(bytes, 0, bytes.length);
    }

    private byte[] a() {
        byte[] byteArray;
        byte[] bArr = null;
        try {
            this.h.close();
            byteArray = this.h.toByteArray();
        } catch (IOException e) {
            e = e;
        }
        try {
            this.h = null;
            return byteArray;
        } catch (IOException e2) {
            e = e2;
            bArr = byteArray;
            e.printStackTrace();
            return bArr;
        }
    }

    private void a(long j, int i) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            a((byte) ((j >> (i2 * 8)) & 255));
        }
    }

    private static byte[] d(int i) {
        return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)};
    }

    public static int a(byte[] bArr) {
        return ((bArr[3] << 24) & (-16777216)) | (bArr[0] & 255) | ((bArr[1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | ((bArr[2] << 16) & 16711680);
    }

    private static boolean d(byte[] bArr) {
        return bArr[0] > 0;
    }

    private static byte[] b(long j) {
        return new byte[]{(byte) j, (byte) (j >> 8), (byte) (j >> 16), (byte) (j >> 24), (byte) (j >> 32), (byte) (j >> 40), (byte) (j >> 48), (byte) (j >> 56)};
    }

    private static long e(byte[] bArr) {
        return (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 24) | ((bArr[4] & 255) << 32) | ((bArr[5] & 255) << 40) | ((bArr[6] & 255) << 48) | ((bArr[7] & 255) << 56);
    }

    private static byte[] a(float f) {
        int floatToIntBits = Float.floatToIntBits(f);
        return new byte[]{(byte) floatToIntBits, (byte) (floatToIntBits >> 8), (byte) (floatToIntBits >> 16), (byte) (floatToIntBits >> 24)};
    }

    private static float f(byte[] bArr) {
        return Float.intBitsToFloat(a(bArr));
    }

    private static byte[] a(double d) {
        long doubleToLongBits = Double.doubleToLongBits(d);
        return new byte[]{(byte) doubleToLongBits, (byte) (doubleToLongBits >> 8), (byte) (doubleToLongBits >> 16), (byte) (doubleToLongBits >> 24), (byte) (doubleToLongBits >> 32), (byte) (doubleToLongBits >> 40), (byte) (doubleToLongBits >> 48), (byte) (doubleToLongBits >> 56)};
    }

    private static byte[] b(String str) {
        if (str != null) {
            try {
                return str.getBytes(g);
            } catch (Exception unused) {
            }
        }
        return new byte[0];
    }

    public static String b(byte[] bArr) {
        try {
            return new String(bArr, g).trim();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(byte[] bArr, String str) {
        try {
            return new String(bArr, str).trim();
        } catch (Exception unused) {
            return null;
        }
    }

    private static double g(byte[] bArr) {
        return Double.longBitsToDouble((bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 24) | ((bArr[4] & 255) << 32) | ((bArr[5] & 255) << 40) | ((bArr[6] & 255) << 48) | ((bArr[7] & 255) << 56));
    }
}
