package com.tencent.mapsdk.internal;

import com.meituan.robust.common.CommonConstant;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class n {
    public ByteBuffer a;
    protected String b;
    private r c;

    private n(ByteBuffer byteBuffer) {
        this.b = CommonConstant.Encoding.GBK;
        this.a = byteBuffer;
    }

    public n(int i) {
        this.b = CommonConstant.Encoding.GBK;
        this.a = ByteBuffer.allocate(i);
    }

    public n() {
        this(128);
    }

    private ByteBuffer b() {
        return this.a;
    }

    public final byte[] a() {
        byte[] bArr = new byte[this.a.position()];
        System.arraycopy(this.a.array(), 0, bArr, 0, this.a.position());
        return bArr;
    }

    private void a(int i) {
        if (this.a.remaining() < i) {
            try {
                ByteBuffer allocate = ByteBuffer.allocate((this.a.capacity() + i) * 2);
                allocate.put(this.a.array(), 0, this.a.position());
                this.a = allocate;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    private void b(byte b, int i) {
        if (i < 15) {
            this.a.put((byte) (b | (i << 4)));
        } else if (i < 256) {
            this.a.put((byte) (b | 240));
            this.a.put((byte) i);
        } else {
            throw new l("tag is too large: ".concat(String.valueOf(i)));
        }
    }

    public final void a(boolean z, int i) {
        a(z ? (byte) 1 : (byte) 0, i);
    }

    public final void a(byte b, int i) {
        a(3);
        if (b == 0) {
            b(p.ZERO_TAG, i);
            return;
        }
        b((byte) 0, i);
        this.a.put(b);
    }

    public final void a(short s, int i) {
        a(4);
        if (s >= -128 && s <= 127) {
            a((byte) s, i);
            return;
        }
        b((byte) 1, i);
        this.a.putShort(s);
    }

    public final void a(int i, int i2) {
        a(6);
        if (i >= -32768 && i <= 32767) {
            a((short) i, i2);
            return;
        }
        b((byte) 2, i2);
        this.a.putInt(i);
    }

    public final void a(long j, int i) {
        a(10);
        if (j >= -2147483648L && j <= 2147483647L) {
            a((int) j, i);
            return;
        }
        b((byte) 3, i);
        this.a.putLong(j);
    }

    public final void a(float f, int i) {
        a(6);
        b((byte) 4, i);
        this.a.putFloat(f);
    }

    public final void a(double d, int i) {
        a(10);
        b((byte) 5, i);
        this.a.putDouble(d);
    }

    private void b(String str, int i) {
        byte[] a = i.a(str);
        a(a.length + 10);
        if (a.length > 255) {
            b((byte) 7, i);
            this.a.putInt(a.length);
            this.a.put(a);
            return;
        }
        b((byte) 6, i);
        this.a.put((byte) a.length);
        this.a.put(a);
    }

    private void c(String str, int i) {
        a(str.length() + 10);
        byte[] a = i.a(str);
        if (a.length > 255) {
            b((byte) 7, i);
            this.a.putInt(a.length);
            this.a.put(a);
            return;
        }
        b((byte) 6, i);
        this.a.put((byte) a.length);
        this.a.put(a);
    }

    public final void a(String str, int i) {
        byte[] bytes;
        try {
            bytes = str.getBytes(this.b);
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        a(bytes.length + 10);
        if (bytes.length > 255) {
            b((byte) 7, i);
            this.a.putInt(bytes.length);
            this.a.put(bytes);
            return;
        }
        b((byte) 6, i);
        this.a.put((byte) bytes.length);
        this.a.put(bytes);
    }

    public final <K, V> void a(Map<K, V> map, int i) {
        a(8);
        b((byte) 8, i);
        a(map == null ? 0 : map.size(), 0);
        if (map != null) {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                a(entry.getKey(), 0);
                a(entry.getValue(), 1);
            }
        }
    }

    private void a(boolean[] zArr, int i) {
        a(8);
        b((byte) 9, i);
        a(zArr.length, 0);
        for (boolean z : zArr) {
            a(z, 0);
        }
    }

    public final void a(byte[] bArr, int i) {
        a(bArr.length + 8);
        b((byte) 13, i);
        b((byte) 0, 0);
        a(bArr.length, 0);
        this.a.put(bArr);
    }

    private void a(short[] sArr, int i) {
        a(8);
        b((byte) 9, i);
        a(sArr.length, 0);
        for (short s : sArr) {
            a(s, 0);
        }
    }

    private void a(int[] iArr, int i) {
        a(8);
        b((byte) 9, i);
        a(iArr.length, 0);
        for (int i2 : iArr) {
            a(i2, 0);
        }
    }

    private void a(long[] jArr, int i) {
        a(8);
        b((byte) 9, i);
        a(jArr.length, 0);
        for (long j : jArr) {
            a(j, 0);
        }
    }

    private void a(float[] fArr, int i) {
        a(8);
        b((byte) 9, i);
        a(fArr.length, 0);
        for (float f : fArr) {
            a(f, 0);
        }
    }

    private void a(double[] dArr, int i) {
        a(8);
        b((byte) 9, i);
        a(dArr.length, 0);
        for (double d : dArr) {
            a(d, 0);
        }
    }

    private <T> void a(T[] tArr, int i) {
        b(tArr, i);
    }

    private void b(Object[] objArr, int i) {
        a(8);
        b((byte) 9, i);
        a(objArr.length, 0);
        for (Object obj : objArr) {
            a(obj, 0);
        }
    }

    public final <T> void a(Collection<T> collection, int i) {
        a(8);
        b((byte) 9, i);
        a(collection == null ? 0 : collection.size(), 0);
        if (collection != null) {
            for (T t : collection) {
                a(t, 0);
            }
        }
    }

    public final void a(p pVar, int i) {
        a(2);
        b((byte) 10, i);
        pVar.writeTo(this);
        a(2);
        b((byte) 11, 0);
    }

    private void a(Byte b, int i) {
        a(b.byteValue(), i);
    }

    private void a(Boolean bool, int i) {
        a(bool.booleanValue(), i);
    }

    private void a(Short sh, int i) {
        a(sh.shortValue(), i);
    }

    private void a(Integer num, int i) {
        a(num.intValue(), i);
    }

    private void a(Long l, int i) {
        a(l.longValue(), i);
    }

    private void a(Float f, int i) {
        a(f.floatValue(), i);
    }

    private void a(Double d, int i) {
        a(d.doubleValue(), i);
    }

    public final void a(Object obj, int i) {
        if (obj instanceof Byte) {
            a(((Byte) obj).byteValue(), i);
        } else if (obj instanceof Boolean) {
            a(((Boolean) obj).booleanValue(), i);
        } else if (obj instanceof Short) {
            a(((Short) obj).shortValue(), i);
        } else if (obj instanceof Integer) {
            a(((Integer) obj).intValue(), i);
        } else if (obj instanceof Long) {
            a(((Long) obj).longValue(), i);
        } else if (obj instanceof Float) {
            a(((Float) obj).floatValue(), i);
        } else if (obj instanceof Double) {
            a(((Double) obj).doubleValue(), i);
        } else if (obj instanceof String) {
            a((String) obj, i);
        } else if (obj instanceof Map) {
            a((Map) obj, i);
        } else if (obj instanceof List) {
            a((Collection) ((List) obj), i);
        } else if (obj instanceof p) {
            a((p) obj, i);
        } else if (obj instanceof byte[]) {
            a((byte[]) obj, i);
        } else if (obj instanceof boolean[]) {
            a((boolean[]) obj, i);
        } else if (obj instanceof short[]) {
            a((short[]) obj, i);
        } else if (obj instanceof int[]) {
            a((int[]) obj, i);
        } else if (obj instanceof long[]) {
            a((long[]) obj, i);
        } else if (obj instanceof float[]) {
            a((float[]) obj, i);
        } else if (obj instanceof double[]) {
            a((double[]) obj, i);
        } else if (obj.getClass().isArray()) {
            b((Object[]) obj, i);
        } else if (obj instanceof Collection) {
            a((Collection) obj, i);
        } else {
            throw new l("write object error: unsupport type. " + obj.getClass());
        }
    }

    public final int a(String str) {
        this.b = str;
        return 0;
    }

    private r c() {
        return this.c;
    }

    private void a(r rVar) {
        this.c = rVar;
    }
}
