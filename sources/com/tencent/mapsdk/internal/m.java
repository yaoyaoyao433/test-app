package com.tencent.mapsdk.internal;

import com.meituan.robust.common.CommonConstant;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class m {
    protected String a = CommonConstant.Encoding.GBK;
    private ByteBuffer b;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a {
        public byte a;
        public int b;

        private void a() {
            this.a = (byte) 0;
            this.b = 0;
        }
    }

    public m() {
    }

    private m(ByteBuffer byteBuffer) {
        this.b = byteBuffer;
    }

    public m(byte[] bArr) {
        this.b = ByteBuffer.wrap(bArr);
    }

    public m(byte[] bArr, byte b) {
        this.b = ByteBuffer.wrap(bArr);
        this.b.position(4);
    }

    private void b(byte[] bArr) {
        a(bArr);
    }

    public final void a(byte[] bArr) {
        this.b = ByteBuffer.wrap(bArr);
    }

    private static int a(a aVar, ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        aVar.a = (byte) (b & 15);
        aVar.b = (b & 240) >> 4;
        if (aVar.b == 15) {
            aVar.b = byteBuffer.get() & 255;
            return 2;
        }
        return 1;
    }

    private void a(a aVar) {
        a(aVar, this.b);
    }

    private int b(a aVar) {
        return a(aVar, this.b.duplicate());
    }

    private void a(int i) {
        this.b.position(this.b.position() + i);
    }

    private boolean b(int i) {
        try {
            a aVar = new a();
            while (true) {
                int a2 = a(aVar, this.b.duplicate());
                if (i <= aVar.b || aVar.a == 11) {
                    break;
                }
                a(a2);
                a(aVar.a);
            }
            if (aVar.a == 11) {
                return false;
            }
            return i == aVar.b;
        } catch (j | BufferUnderflowException unused) {
            return false;
        }
    }

    private void a() {
        a aVar = new a();
        do {
            a(aVar);
            a(aVar.a);
        } while (aVar.a != 11);
    }

    private void b() {
        a aVar = new a();
        a(aVar);
        a(aVar.a);
    }

    private void a(byte b) {
        int i = 0;
        switch (b) {
            case 0:
                a(1);
                return;
            case 1:
                a(2);
                return;
            case 2:
                a(4);
                return;
            case 3:
                a(8);
                return;
            case 4:
                a(4);
                return;
            case 5:
                a(8);
                return;
            case 6:
                int i2 = this.b.get();
                if (i2 < 0) {
                    i2 += 256;
                }
                a(i2);
                return;
            case 7:
                a(this.b.getInt());
                return;
            case 8:
                int a2 = a(0, 0, true);
                while (i < a2 * 2) {
                    b();
                    i++;
                }
                return;
            case 9:
                int a3 = a(0, 0, true);
                while (i < a3) {
                    b();
                    i++;
                }
                return;
            case 10:
                a();
                return;
            case 11:
            case 12:
                return;
            case 13:
                a aVar = new a();
                a(aVar);
                if (aVar.a != 0) {
                    throw new j("skipField with invalid type, type value: " + ((int) b) + ", " + ((int) aVar.a));
                }
                a(a(0, 0, true));
                return;
            default:
                throw new j("invalid type.");
        }
    }

    public final boolean a(int i, boolean z) {
        return a((byte) 0, i, z) != 0;
    }

    public final byte a(byte b, int i, boolean z) {
        if (!b(i)) {
            if (z) {
                throw new j("require field not exist.");
            }
            return b;
        }
        a aVar = new a();
        a(aVar);
        byte b2 = aVar.a;
        if (b2 != 0) {
            if (b2 == 12) {
                return (byte) 0;
            }
            throw new j("type mismatch.");
        }
        return this.b.get();
    }

    public final short a(short s, int i, boolean z) {
        if (!b(i)) {
            if (z) {
                throw new j("require field not exist.");
            }
            return s;
        }
        a aVar = new a();
        a(aVar);
        byte b = aVar.a;
        if (b != 12) {
            switch (b) {
                case 0:
                    return this.b.get();
                case 1:
                    return this.b.getShort();
                default:
                    throw new j("type mismatch.");
            }
        }
        return (short) 0;
    }

    public final int a(int i, int i2, boolean z) {
        if (!b(i2)) {
            if (z) {
                throw new j("require field not exist.");
            }
            return i;
        }
        a aVar = new a();
        a(aVar);
        byte b = aVar.a;
        if (b != 12) {
            switch (b) {
                case 0:
                    return this.b.get();
                case 1:
                    return this.b.getShort();
                case 2:
                    return this.b.getInt();
                default:
                    throw new j("type mismatch.");
            }
        }
        return 0;
    }

    public final long a(long j, int i, boolean z) {
        if (!b(i)) {
            if (z) {
                throw new j("require field not exist.");
            }
            return j;
        }
        a aVar = new a();
        a(aVar);
        byte b = aVar.a;
        if (b != 12) {
            switch (b) {
                case 0:
                    return this.b.get();
                case 1:
                    return this.b.getShort();
                case 2:
                    return this.b.getInt();
                case 3:
                    return this.b.getLong();
                default:
                    throw new j("type mismatch.");
            }
        }
        return 0L;
    }

    public final float a(float f, int i, boolean z) {
        if (!b(i)) {
            if (z) {
                throw new j("require field not exist.");
            }
            return f;
        }
        a aVar = new a();
        a(aVar);
        byte b = aVar.a;
        if (b != 4) {
            if (b == 12) {
                return 0.0f;
            }
            throw new j("type mismatch.");
        }
        return this.b.getFloat();
    }

    public final double a(double d, int i, boolean z) {
        if (!b(i)) {
            if (z) {
                throw new j("require field not exist.");
            }
            return d;
        }
        a aVar = new a();
        a(aVar);
        byte b = aVar.a;
        if (b != 12) {
            switch (b) {
                case 4:
                    return this.b.getFloat();
                case 5:
                    return this.b.getDouble();
                default:
                    throw new j("type mismatch.");
            }
        }
        return 0.0d;
    }

    private String a(String str, int i, boolean z) {
        if (!b(i)) {
            if (z) {
                throw new j("require field not exist.");
            }
            return str;
        }
        a aVar = new a();
        a(aVar);
        switch (aVar.a) {
            case 6:
                int i2 = this.b.get();
                if (i2 < 0) {
                    i2 += 256;
                }
                byte[] bArr = new byte[i2];
                this.b.get(bArr);
                return i.a(bArr);
            case 7:
                int i3 = this.b.getInt();
                if (i3 > 104857600 || i3 < 0 || i3 > this.b.capacity()) {
                    throw new j("String too long: ".concat(String.valueOf(i3)));
                }
                byte[] bArr2 = new byte[i3];
                this.b.get(bArr2);
                return i.a(bArr2);
            default:
                throw new j("type mismatch.");
        }
    }

    private String b(String str, int i, boolean z) {
        if (!b(i)) {
            if (z) {
                throw new j("require field not exist.");
            }
            return str;
        }
        a aVar = new a();
        a(aVar);
        switch (aVar.a) {
            case 6:
                int i2 = this.b.get();
                if (i2 < 0) {
                    i2 += 256;
                }
                byte[] bArr = new byte[i2];
                this.b.get(bArr);
                try {
                    return new String(bArr, this.a);
                } catch (UnsupportedEncodingException unused) {
                    return new String(bArr);
                }
            case 7:
                int i3 = this.b.getInt();
                if (i3 > 104857600 || i3 < 0 || i3 > this.b.capacity()) {
                    throw new j("String too long: ".concat(String.valueOf(i3)));
                }
                byte[] bArr2 = new byte[i3];
                this.b.get(bArr2);
                try {
                    return new String(bArr2, this.a);
                } catch (UnsupportedEncodingException unused2) {
                    return new String(bArr2);
                }
            default:
                throw new j("type mismatch.");
        }
    }

    public final String b(int i, boolean z) {
        if (!b(i)) {
            if (z) {
                throw new j("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar);
        switch (aVar.a) {
            case 6:
                int i2 = this.b.get();
                if (i2 < 0) {
                    i2 += 256;
                }
                byte[] bArr = new byte[i2];
                this.b.get(bArr);
                try {
                    return new String(bArr, this.a);
                } catch (UnsupportedEncodingException unused) {
                    return new String(bArr);
                }
            case 7:
                int i3 = this.b.getInt();
                if (i3 > 104857600 || i3 < 0 || i3 > this.b.capacity()) {
                    throw new j("String too long: ".concat(String.valueOf(i3)));
                }
                byte[] bArr2 = new byte[i3];
                this.b.get(bArr2);
                try {
                    return new String(bArr2, this.a);
                } catch (UnsupportedEncodingException unused2) {
                    return new String(bArr2);
                }
            default:
                throw new j("type mismatch.");
        }
    }

    private String[] a(String[] strArr, int i, boolean z) {
        return (String[]) a((Object[]) strArr, i, z);
    }

    private Map<String, String> d(int i, boolean z) {
        HashMap hashMap = new HashMap();
        if (b(i)) {
            a aVar = new a();
            a(aVar);
            if (aVar.a == 8) {
                int a2 = a(0, 0, true);
                if (a2 < 0) {
                    throw new j("size invalid: ".concat(String.valueOf(a2)));
                }
                for (int i2 = 0; i2 < a2; i2++) {
                    hashMap.put(b(0, true), b(1, true));
                }
            } else {
                throw new j("type mismatch.");
            }
        } else if (z) {
            throw new j("require field not exist.");
        }
        return hashMap;
    }

    public final <K, V> HashMap<K, V> a(Map<K, V> map, int i, boolean z) {
        return (HashMap) a(new HashMap(), map, i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> Map<K, V> a(Map<K, V> map, Map<K, V> map2, int i, boolean z) {
        if (map2 == null || map2.isEmpty()) {
            return new HashMap();
        }
        Map.Entry<K, V> next = map2.entrySet().iterator().next();
        K key = next.getKey();
        V value = next.getValue();
        if (b(i)) {
            a aVar = new a();
            a(aVar);
            if (aVar.a == 8) {
                int a2 = a(0, 0, true);
                if (a2 < 0) {
                    throw new j("size invalid: ".concat(String.valueOf(a2)));
                }
                for (int i2 = 0; i2 < a2; i2++) {
                    map.put(a((m) key, 0, true), a((m) value, 1, true));
                }
            } else {
                throw new j("type mismatch.");
            }
        } else if (z) {
            throw new j("require field not exist.");
        }
        return map;
    }

    private List e(int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (b(i)) {
            a aVar = new a();
            a(aVar);
            if (aVar.a == 9) {
                int a2 = a(0, 0, true);
                if (a2 < 0) {
                    throw new j("size invalid: ".concat(String.valueOf(a2)));
                }
                for (int i2 = 0; i2 < a2; i2++) {
                    a aVar2 = new a();
                    a(aVar2);
                    switch (aVar2.a) {
                        case 0:
                            a(1);
                            break;
                        case 1:
                            a(2);
                            break;
                        case 2:
                            a(4);
                            break;
                        case 3:
                            a(8);
                            break;
                        case 4:
                            a(4);
                            break;
                        case 5:
                            a(8);
                            break;
                        case 6:
                            int i3 = this.b.get();
                            if (i3 < 0) {
                                i3 += 256;
                            }
                            a(i3);
                            break;
                        case 7:
                            a(this.b.getInt());
                            break;
                        case 8:
                        case 9:
                            break;
                        case 10:
                            try {
                                p pVar = (p) Class.forName(p.class.getName()).getConstructor(new Class[0]).newInstance(new Object[0]);
                                pVar.readFrom(this);
                                a();
                                arrayList.add(pVar);
                                break;
                            } catch (Exception e) {
                                e.printStackTrace();
                                throw new j("type mismatch.".concat(String.valueOf(e)));
                            }
                        case 11:
                        default:
                            throw new j("type mismatch.");
                        case 12:
                            arrayList.add(0);
                            break;
                    }
                }
            } else {
                throw new j("type mismatch.");
            }
        } else if (z) {
            throw new j("require field not exist.");
        }
        return arrayList;
    }

    private boolean[] f(int i, boolean z) {
        if (!b(i)) {
            if (z) {
                throw new j("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar);
        if (aVar.a == 9) {
            int a2 = a(0, 0, true);
            if (a2 < 0) {
                throw new j("size invalid: ".concat(String.valueOf(a2)));
            }
            boolean[] zArr = new boolean[a2];
            for (int i2 = 0; i2 < a2; i2++) {
                zArr[i2] = a(0, true);
            }
            return zArr;
        }
        throw new j("type mismatch.");
    }

    public final byte[] c(int i, boolean z) {
        if (!b(i)) {
            if (z) {
                throw new j("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar);
        byte b = aVar.a;
        if (b == 9) {
            int a2 = a(0, 0, true);
            if (a2 < 0 || a2 > this.b.capacity()) {
                throw new j("size invalid: ".concat(String.valueOf(a2)));
            }
            byte[] bArr = new byte[a2];
            for (int i2 = 0; i2 < a2; i2++) {
                bArr[i2] = a(bArr[0], 0, true);
            }
            return bArr;
        } else if (b == 13) {
            a aVar2 = new a();
            a(aVar2);
            if (aVar2.a != 0) {
                throw new j("type mismatch, tag: " + i + ", type: " + ((int) aVar.a) + ", " + ((int) aVar2.a));
            }
            int a3 = a(0, 0, true);
            if (a3 < 0 || a3 > this.b.capacity()) {
                throw new j("invalid size, tag: " + i + ", type: " + ((int) aVar.a) + ", " + ((int) aVar2.a) + ", size: " + a3);
            }
            byte[] bArr2 = new byte[a3];
            this.b.get(bArr2);
            return bArr2;
        } else {
            throw new j("type mismatch.");
        }
    }

    private short[] g(int i, boolean z) {
        if (!b(i)) {
            if (z) {
                throw new j("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar);
        if (aVar.a == 9) {
            int a2 = a(0, 0, true);
            if (a2 < 0) {
                throw new j("size invalid: ".concat(String.valueOf(a2)));
            }
            short[] sArr = new short[a2];
            for (int i2 = 0; i2 < a2; i2++) {
                sArr[i2] = a(sArr[0], 0, true);
            }
            return sArr;
        }
        throw new j("type mismatch.");
    }

    private int[] h(int i, boolean z) {
        if (!b(i)) {
            if (z) {
                throw new j("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar);
        if (aVar.a == 9) {
            int a2 = a(0, 0, true);
            if (a2 < 0) {
                throw new j("size invalid: ".concat(String.valueOf(a2)));
            }
            int[] iArr = new int[a2];
            for (int i2 = 0; i2 < a2; i2++) {
                iArr[i2] = a(iArr[0], 0, true);
            }
            return iArr;
        }
        throw new j("type mismatch.");
    }

    private long[] i(int i, boolean z) {
        if (!b(i)) {
            if (z) {
                throw new j("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar);
        if (aVar.a == 9) {
            int a2 = a(0, 0, true);
            if (a2 < 0) {
                throw new j("size invalid: ".concat(String.valueOf(a2)));
            }
            long[] jArr = new long[a2];
            for (int i2 = 0; i2 < a2; i2++) {
                jArr[i2] = a(jArr[0], 0, true);
            }
            return jArr;
        }
        throw new j("type mismatch.");
    }

    private float[] j(int i, boolean z) {
        if (!b(i)) {
            if (z) {
                throw new j("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar);
        if (aVar.a == 9) {
            int a2 = a(0, 0, true);
            if (a2 < 0) {
                throw new j("size invalid: ".concat(String.valueOf(a2)));
            }
            float[] fArr = new float[a2];
            for (int i2 = 0; i2 < a2; i2++) {
                fArr[i2] = a(fArr[0], 0, true);
            }
            return fArr;
        }
        throw new j("type mismatch.");
    }

    private double[] k(int i, boolean z) {
        if (!b(i)) {
            if (z) {
                throw new j("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar);
        if (aVar.a == 9) {
            int a2 = a(0, 0, true);
            if (a2 < 0) {
                throw new j("size invalid: ".concat(String.valueOf(a2)));
            }
            double[] dArr = new double[a2];
            for (int i2 = 0; i2 < a2; i2++) {
                dArr[i2] = a(dArr[0], 0, true);
            }
            return dArr;
        }
        throw new j("type mismatch.");
    }

    private <T> T[] a(T[] tArr, int i, boolean z) {
        if (tArr == null || tArr.length == 0) {
            throw new j("unable to get type of key and value.");
        }
        return (T[]) b((m) tArr[0], i, z);
    }

    private <T> List<T> a(List<T> list, int i, boolean z) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        Object[] b = b((m) list.get(0), i, z);
        if (b == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : b) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> T[] b(T t, int i, boolean z) {
        if (!b(i)) {
            if (z) {
                throw new j("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar);
        if (aVar.a == 9) {
            int a2 = a(0, 0, true);
            if (a2 < 0) {
                throw new j("size invalid: ".concat(String.valueOf(a2)));
            }
            T[] tArr = (T[]) ((Object[]) Array.newInstance(t.getClass(), a2));
            for (int i2 = 0; i2 < a2; i2++) {
                tArr[i2] = a((m) t, 0, true);
            }
            return tArr;
        }
        throw new j("type mismatch.");
    }

    public final p a(p pVar) {
        if (b(0)) {
            try {
                p newInit = pVar.newInit();
                a aVar = new a();
                a(aVar);
                if (aVar.a != 10) {
                    throw new j("type mismatch.");
                }
                newInit.readFrom(this);
                a();
                return newInit;
            } catch (Exception e) {
                throw new j(e.getMessage());
            }
        }
        throw new j("require field not exist.");
    }

    public final p a(p pVar, int i, boolean z) {
        if (!b(i)) {
            if (z) {
                throw new j("require field not exist.");
            }
            return null;
        }
        try {
            p pVar2 = (p) pVar.getClass().newInstance();
            a aVar = new a();
            a(aVar);
            if (aVar.a != 10) {
                throw new j("type mismatch.");
            }
            pVar2.readFrom(this);
            a();
            return pVar2;
        } catch (Exception e) {
            throw new j(e.getMessage());
        }
    }

    private p[] a(p[] pVarArr, int i, boolean z) {
        return (p[]) a((Object[]) pVarArr, i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> Object a(T t, int i, boolean z) {
        if (t instanceof Byte) {
            return Byte.valueOf(a((byte) 0, i, z));
        }
        if (t instanceof Boolean) {
            return Boolean.valueOf(a(i, z));
        }
        if (t instanceof Short) {
            return Short.valueOf(a((short) 0, i, z));
        }
        if (t instanceof Integer) {
            return Integer.valueOf(a(0, i, z));
        }
        if (t instanceof Long) {
            return Long.valueOf(a(0L, i, z));
        }
        if (t instanceof Float) {
            return Float.valueOf(a(0.0f, i, z));
        }
        if (t instanceof Double) {
            return Double.valueOf(a(0.0d, i, z));
        }
        if (t instanceof String) {
            return b(i, z);
        }
        if (t instanceof Map) {
            return a((Map) t, i, z);
        }
        if (t instanceof List) {
            return a((List) t, i, z);
        }
        if (t instanceof p) {
            return a((p) t, i, z);
        }
        if (t.getClass().isArray()) {
            if ((t instanceof byte[]) || (t instanceof Byte[])) {
                return c(i, z);
            }
            if (t instanceof boolean[]) {
                return f(i, z);
            }
            if (t instanceof short[]) {
                return g(i, z);
            }
            if (t instanceof int[]) {
                return h(i, z);
            }
            if (t instanceof long[]) {
                return i(i, z);
            }
            if (t instanceof float[]) {
                return j(i, z);
            }
            if (t instanceof double[]) {
                return k(i, z);
            }
            return a((Object[]) t, i, z);
        }
        throw new j("read object error: unsupport type.");
    }

    public final int a(String str) {
        this.a = str;
        return 0;
    }

    private ByteBuffer c() {
        return this.b;
    }
}
