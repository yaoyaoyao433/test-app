package com.dianping.nvnetwork.tnold.zip.hpack;

import com.dianping.nvnetwork.tnold.zip.hpack.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import okhttp3.internal.http2.Header;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d implements com.dianping.nvnetwork.tnold.zip.e {
    public static ChangeQuickRedirect a;
    private static final String b = com.dianping.nvtunnelkit.logger.a.a("HpackDecoder");
    private static final IOException c = new IOException("decompression failure");
    private static final IOException d = new IOException("illegal index value");
    private static final IOException e = new IOException("invalid max dynamic table size");
    private static final IOException f = new IOException("max dynamic table size change required");
    private static final e g = new e("Hpack decoding failed");
    private static final byte[] h = new byte[0];
    private final com.dianping.nvnetwork.tnold.zip.hpack.a i;
    private int j;
    private int k;
    private int l;
    private boolean m;
    private long n;
    private a o;
    private h.a p;
    private int q;
    private boolean r;
    private int s;
    private int t;
    private int u;
    private byte[] v;
    private int w;
    private int x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum a {
        READ_HEADER_REPRESENTATION,
        READ_MAX_DYNAMIC_TABLE_SIZE,
        READ_INDEXED_HEADER,
        READ_INDEXED_HEADER_NAME,
        READ_LITERAL_HEADER_NAME_LENGTH_PREFIX,
        READ_LITERAL_HEADER_NAME_LENGTH,
        READ_LITERAL_HEADER_NAME,
        SKIP_LITERAL_HEADER_NAME,
        READ_LITERAL_HEADER_VALUE_LENGTH_PREFIX,
        READ_LITERAL_HEADER_VALUE_LENGTH,
        READ_LITERAL_HEADER_VALUE,
        SKIP_LITERAL_HEADER_VALUE;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95f2e445d8b00469d473295c7ae715ef", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95f2e445d8b00469d473295c7ae715ef");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b37e5cce3efa7cfb8ae0606bf50d5359", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b37e5cce3efa7cfb8ae0606bf50d5359") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b7650e49dc25204ac2f70c7b1f875d8", 6917529027641081856L) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b7650e49dc25204ac2f70c7b1f875d8") : (a[]) values().clone();
        }
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6587f13c74e1f2909393b14667374cd2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6587f13c74e1f2909393b14667374cd2");
            return;
        }
        this.w = 0;
        this.x = 0;
        this.i = new com.dianping.nvnetwork.tnold.zip.hpack.a(4096);
        this.j = Integer.MAX_VALUE;
        this.k = 4096;
        this.l = 4096;
        this.m = false;
        b();
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2f709cf197263d385c310a38668b0ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2f709cf197263d385c310a38668b0ca");
            return;
        }
        this.n = 0L;
        this.o = a.READ_HEADER_REPRESENTATION;
        this.p = h.a.NONE;
    }

    @Override // com.dianping.nvnetwork.tnold.zip.e
    public final String a(int i, boolean z, byte[] bArr) throws Exception {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50a4307a454f42bd394897a023dc8bf9", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50a4307a454f42bd394897a023dc8bf9");
        }
        final LinkedList<b> linkedList = new LinkedList();
        c cVar = new c() { // from class: com.dianping.nvnetwork.tnold.zip.hpack.d.1
            public static ChangeQuickRedirect a;

            @Override // com.dianping.nvnetwork.tnold.zip.hpack.c
            public final void a(byte[] bArr2, byte[] bArr3, boolean z2) {
                Object[] objArr2 = {bArr2, bArr3, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "814a27a578232e96cf9182ea1c5d05c7", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "814a27a578232e96cf9182ea1c5d05c7");
                } else {
                    linkedList.add(new b(bArr2, bArr3));
                }
            }
        };
        try {
            this.x = bArr.length;
            a(new ByteArrayInputStream(bArr), cVar);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f058891b327b062b8bda9f3bfca5b2f9", 6917529027641081856L)) {
                ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f058891b327b062b8bda9f3bfca5b2f9")).booleanValue();
            } else {
                int i2 = (this.n > this.j ? 1 : (this.n == this.j ? 0 : -1));
                b();
            }
            byte[] bArr2 = null;
            HashMap hashMap = new HashMap();
            StringBuilder sb = new StringBuilder();
            for (b bVar : linkedList) {
                String a2 = com.dianping.nvnetwork.tnold.zip.h.a(bVar.b);
                String a3 = com.dianping.nvnetwork.tnold.zip.h.a(bVar.c);
                if (a2.equals(":m-shark-check-sum")) {
                    bArr2 = bVar.c;
                } else {
                    sb.append(a2);
                    sb.append(a3);
                    hashMap.put(a2, a3);
                }
            }
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] a4 = com.dianping.nvnetwork.tnold.zip.h.a(sb.toString());
            this.w = a4.length;
            if (!a(bArr2, messageDigest.digest(a4))) {
                throw g;
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                Object obj = (String) entry.getValue();
                if (":m-shark-request-id".equals(str)) {
                    jSONObject.put("i", obj);
                } else if (Header.RESPONSE_STATUS_UTF8.equals(str)) {
                    jSONObject.put(com.huawei.hms.opendevice.c.a, obj);
                } else if (":m-shark-encrypt-status".equals(str)) {
                    jSONObject.put("s", obj);
                } else {
                    jSONObject2.put(str, obj);
                }
            }
            jSONObject.put("h", jSONObject2);
            return jSONObject.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            throw g;
        }
    }

    private static boolean a(byte[] bArr, byte[] bArr2) {
        Object[] objArr = {bArr, bArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b866cfeebc1d12cda703289b24add8f", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b866cfeebc1d12cda703289b24add8f")).booleanValue();
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                com.dianping.nvtunnelkit.logger.b.b(b, "Hpack-gzip: md5 check failed.");
                return false;
            }
        }
        return true;
    }

    @Override // com.dianping.nvnetwork.tnold.zip.e
    public final com.dianping.nvnetwork.tnold.zip.g a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d9e51d3d01b50f1db5f9976ed2c82ba", 6917529027641081856L)) {
            return (com.dianping.nvnetwork.tnold.zip.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d9e51d3d01b50f1db5f9976ed2c82ba");
        }
        com.dianping.nvnetwork.tnold.zip.g gVar = new com.dianping.nvnetwork.tnold.zip.g(this.x, this.w);
        this.x = 0;
        this.w = 0;
        return gVar;
    }

    private void a(InputStream inputStream, c cVar) throws IOException {
        Object[] objArr = {inputStream, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9605abfc21e2adfda451431cbfe9da3f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9605abfc21e2adfda451431cbfe9da3f");
            return;
        }
        while (inputStream.available() > 0) {
            switch (this.o) {
                case READ_HEADER_REPRESENTATION:
                    byte read = (byte) inputStream.read();
                    if (this.m && (read & 224) != 32) {
                        throw f;
                    }
                    if (read >= 0) {
                        if ((read & 64) != 64) {
                            if ((read & 32) == 32) {
                                this.q = read & 31;
                                if (this.q == 31) {
                                    this.o = a.READ_MAX_DYNAMIC_TABLE_SIZE;
                                    break;
                                } else {
                                    a(this.q);
                                    this.o = a.READ_HEADER_REPRESENTATION;
                                    break;
                                }
                            } else {
                                this.p = (read & 16) == 16 ? h.a.NEVER : h.a.NONE;
                                this.q = read & 15;
                                if (this.q == 0) {
                                    this.o = a.READ_LITERAL_HEADER_NAME_LENGTH_PREFIX;
                                    break;
                                } else if (this.q == 15) {
                                    this.o = a.READ_INDEXED_HEADER_NAME;
                                    break;
                                } else {
                                    b(this.q);
                                    this.o = a.READ_LITERAL_HEADER_VALUE_LENGTH_PREFIX;
                                    break;
                                }
                            }
                        } else {
                            this.p = h.a.INCREMENTAL;
                            this.q = read & 63;
                            if (this.q == 0) {
                                this.o = a.READ_LITERAL_HEADER_NAME_LENGTH_PREFIX;
                                break;
                            } else if (this.q == 63) {
                                this.o = a.READ_INDEXED_HEADER_NAME;
                                break;
                            } else {
                                b(this.q);
                                this.o = a.READ_LITERAL_HEADER_VALUE_LENGTH_PREFIX;
                                break;
                            }
                        }
                    } else {
                        this.q = read & Byte.MAX_VALUE;
                        if (this.q == 0) {
                            throw d;
                        }
                        if (this.q == 127) {
                            this.o = a.READ_INDEXED_HEADER;
                            break;
                        } else {
                            a(this.q, cVar);
                            break;
                        }
                    }
                    break;
                case READ_MAX_DYNAMIC_TABLE_SIZE:
                    int a2 = a(inputStream);
                    if (a2 == -1) {
                        return;
                    }
                    if (a2 > Integer.MAX_VALUE - this.q) {
                        throw c;
                    }
                    a(this.q + a2);
                    this.o = a.READ_HEADER_REPRESENTATION;
                    break;
                case READ_INDEXED_HEADER:
                    int a3 = a(inputStream);
                    if (a3 == -1) {
                        return;
                    }
                    if (a3 > Integer.MAX_VALUE - this.q) {
                        throw c;
                    }
                    a(this.q + a3, cVar);
                    this.o = a.READ_HEADER_REPRESENTATION;
                    break;
                case READ_INDEXED_HEADER_NAME:
                    int a4 = a(inputStream);
                    if (a4 == -1) {
                        return;
                    }
                    if (a4 > Integer.MAX_VALUE - this.q) {
                        throw c;
                    }
                    b(this.q + a4);
                    this.o = a.READ_LITERAL_HEADER_VALUE_LENGTH_PREFIX;
                    break;
                case READ_LITERAL_HEADER_NAME_LENGTH_PREFIX:
                    byte read2 = (byte) inputStream.read();
                    this.r = (read2 & 128) == 128;
                    this.q = read2 & Byte.MAX_VALUE;
                    if (this.q == 127) {
                        this.o = a.READ_LITERAL_HEADER_NAME_LENGTH;
                        break;
                    } else {
                        this.t = this.q;
                        if (this.t == 0) {
                            throw c;
                        }
                        if (a(this.t)) {
                            if (this.p == h.a.NONE) {
                                this.v = h;
                                this.s = this.t;
                                this.o = a.SKIP_LITERAL_HEADER_NAME;
                                break;
                            } else if (this.t + 32 > this.i.e) {
                                this.i.b();
                                this.v = h;
                                this.s = this.t;
                                this.o = a.SKIP_LITERAL_HEADER_NAME;
                                break;
                            }
                        }
                        this.o = a.READ_LITERAL_HEADER_NAME;
                        break;
                    }
                case READ_LITERAL_HEADER_NAME_LENGTH:
                    this.t = a(inputStream);
                    if (this.t == -1) {
                        return;
                    }
                    if (this.t > Integer.MAX_VALUE - this.q) {
                        throw c;
                    }
                    this.t += this.q;
                    if (a(this.t)) {
                        if (this.p == h.a.NONE) {
                            this.v = h;
                            this.s = this.t;
                            this.o = a.SKIP_LITERAL_HEADER_NAME;
                            break;
                        } else if (this.t + 32 > this.i.e) {
                            this.i.b();
                            this.v = h;
                            this.s = this.t;
                            this.o = a.SKIP_LITERAL_HEADER_NAME;
                            break;
                        }
                    }
                    this.o = a.READ_LITERAL_HEADER_NAME;
                    break;
                case READ_LITERAL_HEADER_NAME:
                    if (inputStream.available() >= this.t) {
                        this.v = a(inputStream, this.t);
                        this.o = a.READ_LITERAL_HEADER_VALUE_LENGTH_PREFIX;
                        break;
                    } else {
                        return;
                    }
                case SKIP_LITERAL_HEADER_NAME:
                    this.s = (int) (this.s - inputStream.skip(this.s));
                    if (this.s != 0) {
                        break;
                    } else {
                        this.o = a.READ_LITERAL_HEADER_VALUE_LENGTH_PREFIX;
                        break;
                    }
                case READ_LITERAL_HEADER_VALUE_LENGTH_PREFIX:
                    byte read3 = (byte) inputStream.read();
                    this.r = (read3 & 128) == 128;
                    this.q = read3 & Byte.MAX_VALUE;
                    if (this.q == 127) {
                        this.o = a.READ_LITERAL_HEADER_VALUE_LENGTH;
                        break;
                    } else {
                        this.u = this.q;
                        long j = this.t + this.u;
                        if (a(j)) {
                            this.n = this.j + 1;
                            if (this.p == h.a.NONE) {
                                this.o = a.SKIP_LITERAL_HEADER_VALUE;
                                break;
                            } else if (j + 32 > this.i.e) {
                                this.i.b();
                                this.o = a.SKIP_LITERAL_HEADER_VALUE;
                                break;
                            }
                        }
                        if (this.u == 0) {
                            a(cVar, this.v, h, this.p);
                            this.o = a.READ_HEADER_REPRESENTATION;
                            break;
                        } else {
                            this.o = a.READ_LITERAL_HEADER_VALUE;
                            break;
                        }
                    }
                case READ_LITERAL_HEADER_VALUE_LENGTH:
                    this.u = a(inputStream);
                    if (this.u == -1) {
                        return;
                    }
                    if (this.u > Integer.MAX_VALUE - this.q) {
                        throw c;
                    }
                    this.u += this.q;
                    long j2 = this.t + this.u;
                    if (this.n + j2 > this.j) {
                        this.n = this.j + 1;
                        if (this.p == h.a.NONE) {
                            this.o = a.SKIP_LITERAL_HEADER_VALUE;
                            break;
                        } else if (j2 + 32 > this.i.e) {
                            this.i.b();
                            this.o = a.SKIP_LITERAL_HEADER_VALUE;
                            break;
                        }
                    }
                    this.o = a.READ_LITERAL_HEADER_VALUE;
                    break;
                case READ_LITERAL_HEADER_VALUE:
                    if (inputStream.available() >= this.u) {
                        a(cVar, this.v, a(inputStream, this.u), this.p);
                        this.o = a.READ_HEADER_REPRESENTATION;
                        break;
                    } else {
                        return;
                    }
                case SKIP_LITERAL_HEADER_VALUE:
                    this.u = (int) (this.u - inputStream.skip(this.u));
                    if (this.u != 0) {
                        break;
                    } else {
                        this.o = a.READ_HEADER_REPRESENTATION;
                        break;
                    }
                default:
                    throw new IllegalStateException("should not reach here");
            }
        }
    }

    private void a(int i) throws IOException {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17a73429b36056911d7c493bd8eda9e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17a73429b36056911d7c493bd8eda9e0");
        } else if (i > this.k) {
            throw e;
        } else {
            this.l = i;
            this.m = false;
            this.i.b(i);
        }
    }

    private void b(int i) throws IOException {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7953a0d1b302e6ce21871bd97c423089", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7953a0d1b302e6ce21871bd97c423089");
        } else if (i <= l.b) {
            this.v = l.a(i).b;
        } else if (i - l.b <= this.i.a()) {
            this.v = this.i.a(i - l.b).b;
        } else {
            throw d;
        }
    }

    private void a(int i, c cVar) throws IOException {
        Object[] objArr = {Integer.valueOf(i), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9da832c1c9240479e52f70cf36fea05", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9da832c1c9240479e52f70cf36fea05");
        } else if (i <= l.b) {
            b a2 = l.a(i);
            a(cVar, a2.b, a2.c, false);
        } else if (i - l.b <= this.i.a()) {
            b a3 = this.i.a(i - l.b);
            a(cVar, a3.b, a3.c, false);
        } else {
            throw d;
        }
    }

    private void a(c cVar, byte[] bArr, byte[] bArr2, h.a aVar) {
        Object[] objArr = {cVar, bArr, bArr2, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74ed2bf75f81b86f258999cf2278c58d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74ed2bf75f81b86f258999cf2278c58d");
            return;
        }
        a(cVar, bArr, bArr2, aVar == h.a.NEVER);
        switch (aVar) {
            case NONE:
            case NEVER:
                return;
            case INCREMENTAL:
                this.i.a(new b(bArr, bArr2));
                return;
            default:
                throw new IllegalStateException("should not reach here");
        }
    }

    private void a(c cVar, byte[] bArr, byte[] bArr2, boolean z) {
        Object[] objArr = {cVar, bArr, bArr2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d11554fdfafdb928f5a3dab89a3819e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d11554fdfafdb928f5a3dab89a3819e");
        } else if (bArr.length == 0) {
            throw new AssertionError("name is empty");
        } else {
            long length = this.n + bArr.length + bArr2.length;
            if (length <= this.j) {
                cVar.a(bArr, bArr2, z);
                this.n = (int) length;
                return;
            }
            this.n = this.j + 1;
        }
    }

    private boolean a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "577f9661736b3069d132ce78a12a630a", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "577f9661736b3069d132ce78a12a630a")).booleanValue();
        }
        if (j + this.n <= this.j) {
            return false;
        }
        this.n = this.j + 1;
        return true;
    }

    private byte[] a(InputStream inputStream, int i) throws IOException {
        Object[] objArr = {inputStream, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a00e09b30546bce578e72651cb372a5", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a00e09b30546bce578e72651cb372a5");
        }
        byte[] bArr = new byte[i];
        if (inputStream.read(bArr) == i) {
            return this.r ? i.a.a(bArr) : bArr;
        }
        throw c;
    }

    private static int a(InputStream inputStream) throws IOException {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "154f07d8970598cffd29ca6856483869", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "154f07d8970598cffd29ca6856483869")).intValue();
        }
        inputStream.mark(5);
        int i = 0;
        for (int i2 = 0; i2 < 32; i2 += 7) {
            if (inputStream.available() == 0) {
                inputStream.reset();
                return -1;
            }
            byte read = (byte) inputStream.read();
            if (i2 == 28 && (read & 248) != 0) {
                break;
            }
            i |= (read & Byte.MAX_VALUE) << i2;
            if ((read & 128) == 0) {
                return i;
            }
        }
        inputStream.reset();
        throw c;
    }
}
