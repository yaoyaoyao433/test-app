package com.tencent.mapsdk.internal;

import com.meituan.metrics.common.Constants;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class q {
    private static final int a = 37;
    private static final int b = 17;
    private static final byte[] c;
    private static final byte[] d;

    private static int a(byte b2) {
        return b2 + 629;
    }

    private static int a(char c2) {
        return c2 + 629;
    }

    private static int a(int i) {
        return i + 629;
    }

    private static int a(long j) {
        return ((int) (j ^ (j >> 32))) + 629;
    }

    private static int a(short s) {
        return s + 629;
    }

    private static int a(boolean z) {
        return (!z ? 1 : 0) + 629;
    }

    public static boolean a(byte b2, byte b3) {
        return b2 == b3;
    }

    private static boolean a(char c2, char c3) {
        return c2 == c3;
    }

    private static boolean a(double d2, double d3) {
        return d2 == d3;
    }

    private static boolean a(float f, float f2) {
        return f == f2;
    }

    public static boolean a(int i, int i2) {
        return i == i2;
    }

    public static boolean a(long j, long j2) {
        return j == j2;
    }

    public static boolean a(short s, short s2) {
        return s == s2;
    }

    private static boolean a(boolean z, boolean z2) {
        return z == z2;
    }

    private static int b(byte b2, byte b3) {
        if (b2 < b3) {
            return -1;
        }
        return b2 > b3 ? 1 : 0;
    }

    private static int b(char c2, char c3) {
        if (c2 < c3) {
            return -1;
        }
        return c2 > c3 ? 1 : 0;
    }

    private static int b(double d2, double d3) {
        if (d2 < d3) {
            return -1;
        }
        return d2 > d3 ? 1 : 0;
    }

    private static int b(float f, float f2) {
        if (f < f2) {
            return -1;
        }
        return f > f2 ? 1 : 0;
    }

    private static int b(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    private static int b(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    private static int b(short s, short s2) {
        if (s < s2) {
            return -1;
        }
        return s > s2 ? 1 : 0;
    }

    private static int b(boolean z, boolean z2) {
        return (z ? 1 : 0) - (z2 ? 1 : 0);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj == obj2;
        }
        return obj.equals(obj2);
    }

    private static <T extends Comparable<T>> int a(T t, T t2) {
        return t.compareTo(t2);
    }

    private static <T extends Comparable<T>> int a(List<T> list, List<T> list2) {
        Iterator<T> it = list.iterator();
        Iterator<T> it2 = list2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compareTo = it.next().compareTo(it2.next());
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return b(it.hasNext(), it2.hasNext());
    }

    private static <T extends Comparable<T>> int a(T[] tArr, T[] tArr2) {
        int i = 0;
        for (int i2 = 0; i < tArr.length && i2 < tArr2.length; i2++) {
            int compareTo = tArr[i].compareTo(tArr2[i2]);
            if (compareTo != 0) {
                return compareTo;
            }
            i++;
        }
        return b(tArr.length, tArr2.length);
    }

    private static int a(boolean[] zArr, boolean[] zArr2) {
        int i = 0;
        for (int i2 = 0; i < zArr.length && i2 < zArr2.length; i2++) {
            int b2 = b(zArr[i], zArr2[i2]);
            if (b2 != 0) {
                return b2;
            }
            i++;
        }
        return b(zArr.length, zArr2.length);
    }

    private static int a(byte[] bArr, byte[] bArr2) {
        int i = 0;
        for (int i2 = 0; i < bArr.length && i2 < bArr2.length; i2++) {
            byte b2 = bArr[i];
            byte b3 = bArr2[i2];
            int i3 = b2 < b3 ? -1 : b2 > b3 ? 1 : 0;
            if (i3 != 0) {
                return i3;
            }
            i++;
        }
        return b(bArr.length, bArr2.length);
    }

    private static int a(char[] cArr, char[] cArr2) {
        int i = 0;
        for (int i2 = 0; i < cArr.length && i2 < cArr2.length; i2++) {
            char c2 = cArr[i];
            char c3 = cArr2[i2];
            int i3 = c2 < c3 ? -1 : c2 > c3 ? 1 : 0;
            if (i3 != 0) {
                return i3;
            }
            i++;
        }
        return b(cArr.length, cArr2.length);
    }

    private static int a(short[] sArr, short[] sArr2) {
        int i = 0;
        for (int i2 = 0; i < sArr.length && i2 < sArr2.length; i2++) {
            short s = sArr[i];
            short s2 = sArr2[i2];
            int i3 = s < s2 ? -1 : s > s2 ? 1 : 0;
            if (i3 != 0) {
                return i3;
            }
            i++;
        }
        return b(sArr.length, sArr2.length);
    }

    private static int a(int[] iArr, int[] iArr2) {
        int i = 0;
        for (int i2 = 0; i < iArr.length && i2 < iArr2.length; i2++) {
            int b2 = b(iArr[i], iArr2[i2]);
            if (b2 != 0) {
                return b2;
            }
            i++;
        }
        return b(iArr.length, iArr2.length);
    }

    private static int a(long[] jArr, long[] jArr2) {
        int i = 0;
        for (int i2 = 0; i < jArr.length && i2 < jArr2.length; i2++) {
            int i3 = (jArr[i] > jArr2[i2] ? 1 : (jArr[i] == jArr2[i2] ? 0 : -1));
            int i4 = i3 < 0 ? -1 : i3 > 0 ? 1 : 0;
            if (i4 != 0) {
                return i4;
            }
            i++;
        }
        return b(jArr.length, jArr2.length);
    }

    private static int a(float[] fArr, float[] fArr2) {
        int i = 0;
        for (int i2 = 0; i < fArr.length && i2 < fArr2.length; i2++) {
            float f = fArr[i];
            float f2 = fArr2[i2];
            int i3 = f < f2 ? -1 : f > f2 ? 1 : 0;
            if (i3 != 0) {
                return i3;
            }
            i++;
        }
        return b(fArr.length, fArr2.length);
    }

    private static int a(double[] dArr, double[] dArr2) {
        int i = 0;
        for (int i2 = 0; i < dArr.length && i2 < dArr2.length; i2++) {
            double d2 = dArr[i];
            double d3 = dArr2[i2];
            int i3 = d2 < d3 ? -1 : d2 > d3 ? 1 : 0;
            if (i3 != 0) {
                return i3;
            }
            i++;
        }
        return b(dArr.length, dArr2.length);
    }

    private static int a(boolean[] zArr) {
        if (zArr == null) {
            return 629;
        }
        int i = 17;
        for (boolean z : zArr) {
            i = (i * 37) + (!z ? 1 : 0);
        }
        return i;
    }

    private static int a(byte[] bArr) {
        if (bArr == null) {
            return 629;
        }
        int i = 17;
        for (byte b2 : bArr) {
            i = (i * 37) + b2;
        }
        return i;
    }

    private static int a(char[] cArr) {
        if (cArr == null) {
            return 629;
        }
        int i = 17;
        for (char c2 : cArr) {
            i = (i * 37) + c2;
        }
        return i;
    }

    private static int a(double d2) {
        long doubleToLongBits = Double.doubleToLongBits(d2);
        return ((int) (doubleToLongBits ^ (doubleToLongBits >> 32))) + 629;
    }

    private static int a(double[] dArr) {
        if (dArr == null) {
            return 629;
        }
        int i = 17;
        for (int i2 = 0; i2 < dArr.length; i2++) {
            i = (i * 37) + ((int) (Double.doubleToLongBits(dArr[i2]) ^ (Double.doubleToLongBits(dArr[i2]) >> 32)));
        }
        return i;
    }

    private static int a(float f) {
        return Float.floatToIntBits(f) + 629;
    }

    private static int a(float[] fArr) {
        if (fArr == null) {
            return 629;
        }
        int i = 17;
        for (float f : fArr) {
            i = (i * 37) + Float.floatToIntBits(f);
        }
        return i;
    }

    private static int a(short[] sArr) {
        if (sArr == null) {
            return 629;
        }
        int i = 17;
        for (short s : sArr) {
            i = (i * 37) + s;
        }
        return i;
    }

    private static int a(int[] iArr) {
        if (iArr == null) {
            return 629;
        }
        int i = 17;
        for (int i2 : iArr) {
            i = (i * 37) + i2;
        }
        return i;
    }

    private static int a(long[] jArr) {
        if (jArr == null) {
            return 629;
        }
        int i = 17;
        for (int i2 = 0; i2 < jArr.length; i2++) {
            i = (i * 37) + ((int) (jArr[i2] ^ (jArr[i2] >> 32)));
        }
        return i;
    }

    private static int a(p[] pVarArr) {
        if (pVarArr == null) {
            return 629;
        }
        int i = 17;
        for (p pVar : pVarArr) {
            i = (i * 37) + pVar.hashCode();
        }
        return i;
    }

    private static int a(Object obj) {
        while (obj != null) {
            if (obj.getClass().isArray()) {
                if (obj instanceof p[]) {
                    p[] pVarArr = (p[]) obj;
                    if (pVarArr == null) {
                        return 629;
                    }
                    int i = 17;
                    for (p pVar : pVarArr) {
                        i = (i * 37) + pVar.hashCode();
                    }
                    return i;
                }
                obj = (Object[]) obj;
            } else {
                return obj.hashCode() + 629;
            }
        }
        return 629;
    }

    public static byte[] a(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.position()];
        System.arraycopy(byteBuffer.array(), 0, bArr, 0, bArr.length);
        return bArr;
    }

    static {
        byte[] bArr = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
        byte[] bArr2 = new byte[256];
        byte[] bArr3 = new byte[256];
        for (int i = 0; i < 256; i++) {
            bArr2[i] = bArr[i >>> 4];
            bArr3[i] = bArr[i & 15];
        }
        c = bArr2;
        d = bArr3;
    }

    private static String b(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        int remaining = wrap.remaining();
        if (remaining == 0) {
            return "empty";
        }
        StringBuffer stringBuffer = new StringBuffer((wrap.remaining() * 3) - 1);
        int position = wrap.position();
        int i = wrap.get() & 255;
        stringBuffer.append((char) c[i]);
        stringBuffer.append((char) d[i]);
        for (int i2 = remaining - 1; i2 > 0; i2--) {
            stringBuffer.append(Constants.SPACE);
            int i3 = wrap.get() & 255;
            stringBuffer.append((char) c[i3]);
            stringBuffer.append((char) d[i3]);
        }
        wrap.position(position);
        return stringBuffer.toString();
    }

    private static String b(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            return "empty";
        }
        StringBuffer stringBuffer = new StringBuffer((byteBuffer.remaining() * 3) - 1);
        int position = byteBuffer.position();
        int i = byteBuffer.get() & 255;
        stringBuffer.append((char) c[i]);
        stringBuffer.append((char) d[i]);
        for (int i2 = remaining - 1; i2 > 0; i2--) {
            stringBuffer.append(Constants.SPACE);
            int i3 = byteBuffer.get() & 255;
            stringBuffer.append((char) c[i3]);
            stringBuffer.append((char) d[i3]);
        }
        byteBuffer.position(position);
        return stringBuffer.toString();
    }
}
