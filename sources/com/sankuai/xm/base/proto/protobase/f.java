package com.sankuai.xm.base.proto.protobase;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.proto.protobase.a;
import com.sankuai.xm.base.util.ac;
import com.tencent.smtt.export.external.interfaces.ISelectionInterface;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class f<T extends a> implements b<T> {
    public static ChangeQuickRedirect n;
    protected ByteBuffer o;
    protected ByteBuffer p;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6dbf41320edb1f1eb965bbd5c914730", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6dbf41320edb1f1eb965bbd5c914730");
            return;
        }
        this.o = null;
        this.p = null;
    }

    public void a(ByteBuffer byteBuffer) {
        this.o = byteBuffer;
    }

    @Deprecated
    public final ByteBuffer k() {
        return this.o;
    }

    private int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f785a2f65068ac3918331702879ad71", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f785a2f65068ac3918331702879ad71")).intValue();
        }
        short o = o();
        return o < 0 ? o & ISelectionInterface.HELD_NOTHING : o;
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d9f3b267c02779963a914d37c2bc403", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d9f3b267c02779963a914d37c2bc403");
            return;
        }
        if (this.p == null) {
            this.p = ByteBuffer.allocate(256);
            this.p.position(((a) x()).a());
        }
        if (this.p.remaining() <= i) {
            int capacity = this.p.capacity();
            int position = this.p.position();
            do {
                float f = capacity;
                capacity = (int) (f + (0.75f * f) + 1.0f);
            } while (capacity < position + i);
            ByteBuffer allocate = ByteBuffer.allocate(Math.min(capacity, 65536));
            this.p.position(0);
            this.p.limit(position);
            allocate.put(this.p);
            this.p = allocate;
        }
    }

    public final void a(Boolean bool) {
        Object[] objArr = {bool};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e2f3e71b40f286e9a7442f649130505", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e2f3e71b40f286e9a7442f649130505");
            return;
        }
        b(1);
        this.p.put(bool.booleanValue() ? (byte) 1 : (byte) 0);
    }

    public final Boolean l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6275ce770e305ae8a660fca6d2b7b42f", 6917529027641081856L)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6275ce770e305ae8a660fca6d2b7b42f");
        }
        if (this.o.remaining() == 0) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(this.o.get() == 1);
    }

    public final void c(byte b) {
        Object[] objArr = {Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27fe3642008c114d17c6f7a0e8929d55", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27fe3642008c114d17c6f7a0e8929d55");
            return;
        }
        b(1);
        this.p.put(b);
    }

    public final byte m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4ecf8e1025a87ded49a32075beebe72", 6917529027641081856L)) {
            return ((Byte) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4ecf8e1025a87ded49a32075beebe72")).byteValue();
        }
        if (this.o.remaining() == 0) {
            return (byte) 0;
        }
        return this.o.get();
    }

    public final void b(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b700b52b453c11d837cd5f5dab6a0d2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b700b52b453c11d837cd5f5dab6a0d2");
        } else if (bArr == null || bArr.length == 0) {
            b(2);
            this.p.putShort((short) 0);
        } else {
            b(bArr.length + 2);
            this.p.putShort((short) bArr.length);
            this.p.put(bArr);
        }
    }

    public final byte[] n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1b0f5008a842d41718f506be31d88e4", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1b0f5008a842d41718f506be31d88e4");
        }
        int b = b();
        if (b <= 0 || b > this.o.remaining()) {
            return null;
        }
        byte[] bArr = new byte[b];
        this.o.get(bArr);
        return bArr;
    }

    public final void d(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "128f816b72815242576ed3f3b19b425b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "128f816b72815242576ed3f3b19b425b");
            return;
        }
        b(2);
        this.p.putShort(s);
    }

    public final short o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "319f1e5512b30f076fddf77bd35e158a", 6917529027641081856L)) {
            return ((Short) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "319f1e5512b30f076fddf77bd35e158a")).shortValue();
        }
        if (this.o.remaining() < 2) {
            return (short) 0;
        }
        return this.o.getShort();
    }

    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0856f1c420866f9db4f0f9576abe5ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0856f1c420866f9db4f0f9576abe5ae");
            return;
        }
        b(4);
        this.p.putInt(i);
    }

    public final int p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5b48f7eb5a1ce2f4a979679f92120b8", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5b48f7eb5a1ce2f4a979679f92120b8")).intValue();
        }
        if (this.o.remaining() < 4) {
            return 0;
        }
        return this.o.getInt();
    }

    public final void d(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3f925c531a53a35d65e93c6e3296174", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3f925c531a53a35d65e93c6e3296174");
            return;
        }
        b(8);
        this.p.putLong(j);
    }

    public final long q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e8b57a4c92d986ca38962b7b85c64e5", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e8b57a4c92d986ca38962b7b85c64e5")).longValue();
        }
        if (this.o.remaining() < 8) {
            return 0L;
        }
        return this.o.getLong();
    }

    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d18c0bcb5c11b481bd05acc69a82542", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d18c0bcb5c11b481bd05acc69a82542");
        } else if (str == null) {
            b(2);
            this.p.putShort((short) 0);
        } else {
            try {
                int a = a(str);
                if (a > 32767) {
                    throw new RuntimeException("string too long");
                }
                short s = (short) a;
                b(s + 2);
                this.p.putShort(s);
                this.p.put(str.getBytes());
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final String r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98b6b7ae521069d4e674a0a218364c03", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98b6b7ae521069d4e674a0a218364c03");
        }
        int b = b();
        if (b <= 0 || b > this.o.remaining()) {
            return "";
        }
        byte[] bArr = new byte[b];
        this.o.get(bArr);
        return new String(bArr);
    }

    public final void b(long[] jArr) {
        Object[] objArr = {jArr};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d6a3556dcf28df516adc992ee253e18", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d6a3556dcf28df516adc992ee253e18");
        } else if (jArr == null) {
            d((short) 0);
        } else {
            d((short) jArr.length);
            for (long j : jArr) {
                d(j);
            }
        }
    }

    public final long[] s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "525ebc71d9f164a6c606ad40644b5489", 6917529027641081856L)) {
            return (long[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "525ebc71d9f164a6c606ad40644b5489");
        }
        int b = b();
        if (b == 0) {
            return null;
        }
        long[] jArr = new long[b];
        for (int i = 0; i < b; i++) {
            jArr[i] = q();
        }
        return jArr;
    }

    public final String[] t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d8d1a6c72bb53f86c445af453b414b9", 6917529027641081856L)) {
            return (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d8d1a6c72bb53f86c445af453b414b9");
        }
        int b = b();
        if (b == 0) {
            return null;
        }
        String[] strArr = new String[b];
        for (int i = 0; i < b; i++) {
            strArr[i] = r();
        }
        return strArr;
    }

    private Object a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcedfc9229015cb6f0ff3859d2fa869f", 6917529027641081856L)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcedfc9229015cb6f0ff3859d2fa869f");
        }
        if (obj instanceof Short) {
            return Short.valueOf(o());
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(p());
        }
        if (obj instanceof Long) {
            return Long.valueOf(q());
        }
        if (obj instanceof String) {
            return r();
        }
        if (obj instanceof f) {
            return b(obj.getClass());
        }
        if (obj instanceof h) {
            return b(((h) obj).v().getClass());
        }
        if (obj instanceof Boolean) {
            return l();
        }
        if (obj instanceof Byte) {
            return Byte.valueOf(m());
        }
        throw new RuntimeException("Unsupported Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> Map<K, V> a(K k, V v) {
        Object[] objArr = {k, v};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e471cffe7419e2d99292690b65551a32", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e471cffe7419e2d99292690b65551a32");
        }
        int b = b();
        if (b == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < b; i++) {
            hashMap.put(a(k), a(v));
        }
        return hashMap;
    }

    private f b(Class cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "576c3c9222b98bad0563d8f862684992", 6917529027641081856L)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "576c3c9222b98bad0563d8f862684992");
        }
        try {
            f fVar = (f) cls.newInstance();
            fVar.a(this.o);
            return fVar;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Lcom/sankuai/xm/base/proto/protobase/f;>(Ljava/lang/Class<TT;>;)TT; */
    private f c(Class cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb79c59374e97940ac7b65de43ad66b3", 6917529027641081856L)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb79c59374e97940ac7b65de43ad66b3");
        }
        try {
            f fVar = (f) cls.newInstance();
            fVar.a(this.o);
            return fVar;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Lcom/sankuai/xm/base/proto/protobase/f;>(Ljava/lang/Class<TT;>;)[TT; */
    public final f[] a(Class cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42d234481a501e5c066206f26e5de74d", 6917529027641081856L)) {
            return (f[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42d234481a501e5c066206f26e5de74d");
        }
        int b = b();
        if (b == 0) {
            return null;
        }
        f[] fVarArr = (f[]) Array.newInstance(cls, b);
        for (int i = 0; i < b; i++) {
            fVarArr[i] = c(cls);
        }
        return fVarArr;
    }

    public final void b(byte[][] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e19f8632130d04a37ed85ade18520768", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e19f8632130d04a37ed85ade18520768");
        } else if (bArr == null) {
            d((short) 0);
        } else {
            d((short) bArr.length);
            for (byte[] bArr2 : bArr) {
                b(bArr2);
            }
        }
    }

    public final byte[][] u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da65cafe926e77ec5f519814c3e56031", 6917529027641081856L)) {
            return (byte[][]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da65cafe926e77ec5f519814c3e56031");
        }
        int b = b();
        if (b == 0) {
            return null;
        }
        byte[][] bArr = new byte[b];
        for (int i = 0; i < b; i++) {
            bArr[i] = n();
        }
        return bArr;
    }

    private static int a(String str) throws UnsupportedEncodingException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "93a82568d152bac5e91514f54dcbb7aa", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "93a82568d152bac5e91514f54dcbb7aa")).intValue();
        }
        if (ac.a(str)) {
            return 0;
        }
        return str.getBytes("UTF-8").length;
    }

    public static boolean d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2e1ac6520ed46ad53eb4c59b8de7c86f", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2e1ac6520ed46ad53eb4c59b8de7c86f")).booleanValue();
        }
        try {
            return a(str) > 32767;
        } catch (Exception e) {
            com.sankuai.xm.log.a.a(e);
            return false;
        }
    }

    public static boolean c(byte[] bArr) {
        return bArr != null && bArr.length > 32767;
    }

    public static int d(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd46cef75ada1ee2173f9035a55fe939", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd46cef75ada1ee2173f9035a55fe939")).intValue();
        }
        if (bArr == null || bArr.length <= 8) {
            return 0;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.getInt();
        return wrap.getInt();
    }
}
