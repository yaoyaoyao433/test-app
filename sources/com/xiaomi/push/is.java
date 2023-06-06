package com.xiaomi.push;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
/* loaded from: classes6.dex */
public class is extends iw {
    private static final jb f = new jb();
    protected boolean a;
    protected boolean b;
    protected int c;
    protected boolean d;
    private byte[] g;
    private byte[] h;
    private byte[] i;
    private byte[] j;
    private byte[] k;
    private byte[] l;
    private byte[] m;
    private byte[] n;

    /* loaded from: classes6.dex */
    public static class a implements iy {
        protected boolean a;
        protected boolean b;
        protected int c;

        public a() {
            this(false, true);
        }

        public a(boolean z, boolean z2) {
            this(false, true, 0);
        }

        public a(boolean z, boolean z2, int i) {
            this.a = false;
            this.b = true;
            this.a = z;
            this.b = z2;
            this.c = i;
        }

        @Override // com.xiaomi.push.iy
        public iw a(jh jhVar) {
            is isVar = new is(jhVar, this.a, this.b);
            if (this.c != 0) {
                isVar.c(this.c);
            }
            return isVar;
        }
    }

    public is(jh jhVar, boolean z, boolean z2) {
        super(jhVar);
        this.a = false;
        this.b = true;
        this.d = false;
        this.g = new byte[1];
        this.h = new byte[2];
        this.i = new byte[4];
        this.j = new byte[8];
        this.k = new byte[1];
        this.l = new byte[2];
        this.m = new byte[4];
        this.n = new byte[8];
        this.a = z;
        this.b = z2;
    }

    private int a(byte[] bArr, int i, int i2) {
        d(i2);
        return this.e.c(bArr, 0, i2);
    }

    @Override // com.xiaomi.push.iw
    public final void a() {
        a((byte) 0);
    }

    @Override // com.xiaomi.push.iw
    public final void a(byte b) {
        this.g[0] = b;
        this.e.b(this.g, 0, 1);
    }

    @Override // com.xiaomi.push.iw
    public final void a(int i) {
        this.i[0] = (byte) ((i >> 24) & 255);
        this.i[1] = (byte) ((i >> 16) & 255);
        this.i[2] = (byte) ((i >> 8) & 255);
        this.i[3] = (byte) (i & 255);
        this.e.b(this.i, 0, 4);
    }

    @Override // com.xiaomi.push.iw
    public final void a(long j) {
        this.j[0] = (byte) ((j >> 56) & 255);
        this.j[1] = (byte) ((j >> 48) & 255);
        this.j[2] = (byte) ((j >> 40) & 255);
        this.j[3] = (byte) ((j >> 32) & 255);
        this.j[4] = (byte) ((j >> 24) & 255);
        this.j[5] = (byte) ((j >> 16) & 255);
        this.j[6] = (byte) ((j >> 8) & 255);
        this.j[7] = (byte) (j & 255);
        this.e.b(this.j, 0, 8);
    }

    @Override // com.xiaomi.push.iw
    public final void a(it itVar) {
        a(itVar.b);
        a(itVar.c);
    }

    @Override // com.xiaomi.push.iw
    public final void a(iu iuVar) {
        a(iuVar.a);
        a(iuVar.b);
    }

    @Override // com.xiaomi.push.iw
    public final void a(iv ivVar) {
        a(ivVar.a);
        a(ivVar.b);
        a(ivVar.c);
    }

    @Override // com.xiaomi.push.iw
    public final void a(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            a(bytes.length);
            this.e.b(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new iq("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.xiaomi.push.iw
    public final void a(ByteBuffer byteBuffer) {
        int limit = (byteBuffer.limit() - byteBuffer.position()) - byteBuffer.arrayOffset();
        a(limit);
        this.e.b(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), limit);
    }

    @Override // com.xiaomi.push.iw
    public final void a(short s) {
        this.h[0] = (byte) ((s >> 8) & 255);
        this.h[1] = (byte) (s & 255);
        this.e.b(this.h, 0, 2);
    }

    @Override // com.xiaomi.push.iw
    public final void a(boolean z) {
        a(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.xiaomi.push.iw
    public final it b() {
        byte g = g();
        return new it("", g, g == 0 ? (short) 0 : h());
    }

    public final String b(int i) {
        try {
            d(i);
            byte[] bArr = new byte[i];
            this.e.c(bArr, 0, i);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new iq("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.xiaomi.push.iw
    public iv c() {
        return new iv(g(), g(), i());
    }

    public final void c(int i) {
        this.c = i;
        this.d = true;
    }

    @Override // com.xiaomi.push.iw
    public iu d() {
        return new iu(g(), i());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d(int i) {
        if (i < 0) {
            throw new iq("Negative length: " + i);
        } else if (this.d) {
            this.c -= i;
            if (this.c >= 0) {
                return;
            }
            throw new iq("Message length exceeded: " + i);
        }
    }

    @Override // com.xiaomi.push.iw
    public ja e() {
        return new ja(g(), i());
    }

    @Override // com.xiaomi.push.iw
    public final boolean f() {
        return g() == 1;
    }

    @Override // com.xiaomi.push.iw
    public final byte g() {
        if (this.e.c() <= 0) {
            a(this.k, 0, 1);
            return this.k[0];
        }
        byte b = this.e.a()[this.e.b()];
        this.e.a(1);
        return b;
    }

    @Override // com.xiaomi.push.iw
    public final short h() {
        byte[] bArr = this.l;
        int i = 0;
        if (this.e.c() >= 2) {
            bArr = this.e.a();
            i = this.e.b();
            this.e.a(2);
        } else {
            a(this.l, 0, 2);
        }
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    @Override // com.xiaomi.push.iw
    public final int i() {
        byte[] bArr = this.m;
        int i = 0;
        if (this.e.c() >= 4) {
            bArr = this.e.a();
            i = this.e.b();
            this.e.a(4);
        } else {
            a(this.m, 0, 4);
        }
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    @Override // com.xiaomi.push.iw
    public final long j() {
        byte[] bArr = this.n;
        int i = 0;
        if (this.e.c() >= 8) {
            bArr = this.e.a();
            i = this.e.b();
            this.e.a(8);
        } else {
            a(this.n, 0, 8);
        }
        return (bArr[i + 7] & 255) | ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
    }

    @Override // com.xiaomi.push.iw
    public final double k() {
        return Double.longBitsToDouble(j());
    }

    @Override // com.xiaomi.push.iw
    public String l() {
        int i = i();
        if (this.e.c() >= i) {
            try {
                String str = new String(this.e.a(), this.e.b(), i, "UTF-8");
                this.e.a(i);
                return str;
            } catch (UnsupportedEncodingException unused) {
                throw new iq("JVM DOES NOT SUPPORT UTF-8");
            }
        }
        return b(i);
    }

    @Override // com.xiaomi.push.iw
    public ByteBuffer m() {
        int i = i();
        d(i);
        if (this.e.c() >= i) {
            ByteBuffer wrap = ByteBuffer.wrap(this.e.a(), this.e.b(), i);
            this.e.a(i);
            return wrap;
        }
        byte[] bArr = new byte[i];
        this.e.c(bArr, 0, i);
        return ByteBuffer.wrap(bArr);
    }
}
