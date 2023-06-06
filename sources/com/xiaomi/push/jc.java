package com.xiaomi.push;

import com.xiaomi.push.is;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
/* loaded from: classes6.dex */
public final class jc extends is {
    private static int f = 10000;
    private static int g = 10000;
    private static int h = 10000;
    private static int i = 10485760;
    private static int j = 104857600;

    /* loaded from: classes6.dex */
    public static class a extends is.a {
        public a() {
            super(false, true);
        }

        public a(boolean z, boolean z2, int i) {
            super(true, true, i);
        }

        @Override // com.xiaomi.push.is.a, com.xiaomi.push.iy
        public final iw a(jh jhVar) {
            jc jcVar = new jc(jhVar, this.a, this.b);
            if (this.c != 0) {
                jcVar.c(this.c);
            }
            return jcVar;
        }
    }

    public jc(jh jhVar, boolean z, boolean z2) {
        super(jhVar, z, z2);
    }

    @Override // com.xiaomi.push.is, com.xiaomi.push.iw
    public final iv c() {
        byte g2 = g();
        byte g3 = g();
        int i2 = i();
        if (i2 <= f) {
            return new iv(g2, g3, i2);
        }
        throw new ix(3, "Thrift map size " + i2 + " out of range!");
    }

    @Override // com.xiaomi.push.is, com.xiaomi.push.iw
    public final iu d() {
        byte g2 = g();
        int i2 = i();
        if (i2 <= g) {
            return new iu(g2, i2);
        }
        throw new ix(3, "Thrift list size " + i2 + " out of range!");
    }

    @Override // com.xiaomi.push.is, com.xiaomi.push.iw
    public final ja e() {
        byte g2 = g();
        int i2 = i();
        if (i2 <= h) {
            return new ja(g2, i2);
        }
        throw new ix(3, "Thrift set size " + i2 + " out of range!");
    }

    @Override // com.xiaomi.push.is, com.xiaomi.push.iw
    public final String l() {
        int i2 = i();
        if (i2 > i) {
            throw new ix(3, "Thrift string size " + i2 + " out of range!");
        } else if (this.e.c() >= i2) {
            try {
                String str = new String(this.e.a(), this.e.b(), i2, "UTF-8");
                this.e.a(i2);
                return str;
            } catch (UnsupportedEncodingException unused) {
                throw new iq("JVM DOES NOT SUPPORT UTF-8");
            }
        } else {
            return b(i2);
        }
    }

    @Override // com.xiaomi.push.is, com.xiaomi.push.iw
    public final ByteBuffer m() {
        int i2 = i();
        if (i2 > j) {
            throw new ix(3, "Thrift binary size " + i2 + " out of range!");
        }
        d(i2);
        if (this.e.c() >= i2) {
            ByteBuffer wrap = ByteBuffer.wrap(this.e.a(), this.e.b(), i2);
            this.e.a(i2);
            return wrap;
        }
        byte[] bArr = new byte[i2];
        this.e.c(bArr, 0, i2);
        return ByteBuffer.wrap(bArr);
    }
}
