package com.meizu.cloud.pushsdk.c.g;

import android.support.annotation.NonNull;
import com.tencent.smtt.sdk.TbsListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* loaded from: classes3.dex */
public final class b implements c, d, Cloneable {
    private static final byte[] c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    j a;
    public long b;

    private void c(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int a = a(bArr, i, bArr.length - i);
            if (a == -1) {
                throw new EOFException();
            }
            i += a;
        }
    }

    private byte[] d(long j) throws EOFException {
        o.a(this.b, 0L, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[(int) j];
            c(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
    }

    private void e(long j) throws EOFException {
        while (j > 0) {
            if (this.a == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, this.a.c - this.a.b);
            long j2 = min;
            this.b -= j2;
            j -= j2;
            this.a.b += min;
            if (this.a.b == this.a.c) {
                j jVar = this.a;
                this.a = jVar.a();
                k.a(jVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public b clone() {
        b bVar = new b();
        if (this.b == 0) {
            return bVar;
        }
        bVar.a = new j(this.a);
        j jVar = bVar.a;
        j jVar2 = bVar.a;
        j jVar3 = bVar.a;
        jVar2.g = jVar3;
        jVar.f = jVar3;
        j jVar4 = this.a;
        while (true) {
            jVar4 = jVar4.f;
            if (jVar4 == this.a) {
                bVar.b = this.b;
                return bVar;
            }
            bVar.a.g.a(new j(jVar4));
        }
    }

    public final int a(byte[] bArr, int i, int i2) {
        o.a(bArr.length, i, i2);
        j jVar = this.a;
        if (jVar == null) {
            return -1;
        }
        int min = Math.min(i2, jVar.c - jVar.b);
        System.arraycopy(jVar.a, jVar.b, bArr, i, min);
        jVar.b += min;
        this.b -= min;
        if (jVar.b == jVar.c) {
            this.a = jVar.a();
            k.a(jVar);
        }
        return min;
    }

    @Override // com.meizu.cloud.pushsdk.c.g.c
    public final long a(m mVar) throws IOException {
        if (mVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long b = mVar.b(this, 2048L);
            if (b == -1) {
                return j;
            }
            j += b;
        }
    }

    @Override // com.meizu.cloud.pushsdk.c.g.c
    public final b a() {
        return this;
    }

    public final b a(int i) {
        int i2;
        int i3;
        if (i >= 128) {
            if (i < 2048) {
                i3 = (i >> 6) | 192;
            } else {
                if (i < 65536) {
                    if (i >= 55296 && i <= 57343) {
                        throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
                    }
                    i2 = (i >> 12) | TbsListener.ErrorCode.EXCEED_INCR_UPDATE;
                } else if (i > 1114111) {
                    throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
                } else {
                    b((i >> 18) | 240);
                    i2 = ((i >> 12) & 63) | 128;
                }
                b(i2);
                i3 = ((i >> 6) & 63) | 128;
            }
            b(i3);
            i = (i & 63) | 128;
        }
        b(i);
        return this;
    }

    @Override // com.meizu.cloud.pushsdk.c.g.c
    /* renamed from: a */
    public final b c(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return b(48);
        }
        boolean z = false;
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return b("-9223372036854775808");
            }
            z = true;
        }
        if (j >= 100000000) {
            i2 = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i2 = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i2 = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i2 = 2;
        }
        if (z) {
            i2++;
        }
        j c2 = c(i2);
        byte[] bArr = c2.a;
        int i3 = c2.c + i2;
        while (j != 0) {
            i3--;
            bArr[i3] = c[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i3 - 1] = 45;
        }
        c2.c += i2;
        this.b += i2;
        return this;
    }

    @Override // com.meizu.cloud.pushsdk.c.g.c
    /* renamed from: a */
    public final b b(String str) {
        return a(str, 0, str.length());
    }

    public final b a(String str, int i, int i2) {
        char charAt;
        int i3;
        if (str != null) {
            if (i < 0) {
                throw new IllegalAccessError("beginIndex < 0: " + i);
            } else if (i2 < i) {
                throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
            } else if (i2 > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
            } else {
                while (i < i2) {
                    char charAt2 = str.charAt(i);
                    if (charAt2 < 128) {
                        j c2 = c(1);
                        byte[] bArr = c2.a;
                        int i4 = c2.c - i;
                        int min = Math.min(i2, 2048 - i4);
                        int i5 = i + 1;
                        bArr[i + i4] = (byte) charAt2;
                        while (true) {
                            i = i5;
                            if (i >= min || (charAt = str.charAt(i)) >= 128) {
                                break;
                            }
                            i5 = i + 1;
                            bArr[i + i4] = (byte) charAt;
                        }
                        int i6 = (i4 + i) - c2.c;
                        c2.c += i6;
                        this.b += i6;
                    } else {
                        if (charAt2 < 2048) {
                            i3 = (charAt2 >> 6) | 192;
                        } else if (charAt2 < 55296 || charAt2 > 57343) {
                            b((charAt2 >> '\f') | TbsListener.ErrorCode.EXCEED_INCR_UPDATE);
                            i3 = ((charAt2 >> 6) & 63) | 128;
                        } else {
                            int i7 = i + 1;
                            char charAt3 = i7 < i2 ? str.charAt(i7) : (char) 0;
                            if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                                b(63);
                                i = i7;
                            } else {
                                int i8 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + 65536;
                                b((i8 >> 18) | 240);
                                b(((i8 >> 12) & 63) | 128);
                                b(((i8 >> 6) & 63) | 128);
                                b((i8 & 63) | 128);
                                i += 2;
                            }
                        }
                        b(i3);
                        b((charAt2 & '?') | 128);
                        i++;
                    }
                }
                return this;
            }
        }
        throw new IllegalArgumentException("string == null");
    }

    @Override // com.meizu.cloud.pushsdk.c.g.c
    /* renamed from: a */
    public final b b(byte[] bArr) {
        if (bArr != null) {
            return c(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // com.meizu.cloud.pushsdk.c.g.m
    public final long b(b bVar, long j) {
        if (bVar != null) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.b == 0) {
                return -1L;
            } else {
                if (j > this.b) {
                    j = this.b;
                }
                bVar.a(this, j);
                return j;
            }
        }
        throw new IllegalArgumentException("sink == null");
    }

    public final b b(int i) {
        j c2 = c(1);
        byte[] bArr = c2.a;
        int i2 = c2.c;
        c2.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
        return this;
    }

    public final b b(long j) {
        if (j == 0) {
            return b(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        j c2 = c(numberOfTrailingZeros);
        byte[] bArr = c2.a;
        int i = c2.c;
        for (int i2 = (c2.c + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = c[(int) (15 & j)];
            j >>>= 4;
        }
        c2.c += numberOfTrailingZeros;
        this.b += numberOfTrailingZeros;
        return this;
    }

    @Override // com.meizu.cloud.pushsdk.c.g.c
    /* renamed from: b */
    public final b c(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = i2;
            o.a(bArr.length, i, j);
            int i3 = i2 + i;
            while (i < i3) {
                j c2 = c(1);
                int min = Math.min(i3 - i, 2048 - c2.c);
                System.arraycopy(bArr, i, c2.a, c2.c, min);
                i += min;
                c2.c += min;
            }
            this.b += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // com.meizu.cloud.pushsdk.c.g.d
    public final InputStream b() {
        return new InputStream() { // from class: com.meizu.cloud.pushsdk.c.g.b.1
            @Override // java.io.InputStream
            public final int available() {
                return (int) Math.min(b.this.b, 2147483647L);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }

            @Override // java.io.InputStream
            public final int read() {
                if (b.this.b > 0) {
                    return b.this.d() & 255;
                }
                return -1;
            }

            @Override // java.io.InputStream
            public final int read(@NonNull byte[] bArr, int i, int i2) {
                return b.this.a(bArr, i, i2);
            }

            public final String toString() {
                return b.this + ".inputStream()";
            }
        };
    }

    public final long c() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        j jVar = this.a.g;
        return (jVar.c >= 2048 || !jVar.e) ? j : j - (jVar.c - jVar.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j c(int i) {
        if (i <= 0 || i > 2048) {
            throw new IllegalArgumentException();
        }
        if (this.a != null) {
            j jVar = this.a.g;
            return (jVar.c + i > 2048 || !jVar.e) ? jVar.a(k.a()) : jVar;
        }
        this.a = k.a();
        j jVar2 = this.a;
        j jVar3 = this.a;
        j jVar4 = this.a;
        jVar3.g = jVar4;
        jVar2.f = jVar4;
        return jVar4;
    }

    @Override // com.meizu.cloud.pushsdk.c.g.l, java.io.Closeable, java.lang.AutoCloseable, com.meizu.cloud.pushsdk.c.g.m
    public final void close() {
    }

    public final byte d() {
        if (this.b != 0) {
            j jVar = this.a;
            int i = jVar.b;
            int i2 = jVar.c;
            int i3 = i + 1;
            byte b = jVar.a[i];
            this.b--;
            if (i3 == i2) {
                this.a = jVar.a();
                k.a(jVar);
            } else {
                jVar.b = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.b != bVar.b) {
                return false;
            }
            long j = 0;
            if (this.b == 0) {
                return true;
            }
            j jVar = this.a;
            j jVar2 = bVar.a;
            int i = jVar.b;
            int i2 = jVar2.b;
            while (j < this.b) {
                long min = Math.min(jVar.c - i, jVar2.c - i2);
                int i3 = i2;
                int i4 = i;
                int i5 = 0;
                while (i5 < min) {
                    int i6 = i4 + 1;
                    int i7 = i3 + 1;
                    if (jVar.a[i4] != jVar2.a[i3]) {
                        return false;
                    }
                    i5++;
                    i4 = i6;
                    i3 = i7;
                }
                if (i4 == jVar.c) {
                    jVar = jVar.f;
                    i = jVar.b;
                } else {
                    i = i4;
                }
                if (i3 == jVar2.c) {
                    jVar2 = jVar2.f;
                    i2 = jVar2.b;
                } else {
                    i2 = i3;
                }
                j += min;
            }
            return true;
        }
        return false;
    }

    @Override // com.meizu.cloud.pushsdk.c.g.d
    public final byte[] f() {
        try {
            return d(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.meizu.cloud.pushsdk.c.g.l, java.io.Flushable
    public final void flush() {
    }

    public final void g() {
        try {
            e(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final int hashCode() {
        j jVar = this.a;
        if (jVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = jVar.c;
            for (int i3 = jVar.b; i3 < i2; i3++) {
                i = (i * 31) + jVar.a[i3];
            }
            jVar = jVar.f;
        } while (jVar != this.a);
        return i;
    }

    @Override // com.meizu.cloud.pushsdk.c.g.d
    public final String e() {
        try {
            long j = this.b;
            Charset charset = o.a;
            o.a(this.b, 0L, j);
            if (charset != null) {
                if (j > 2147483647L) {
                    throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
                } else if (j == 0) {
                    return "";
                } else {
                    j jVar = this.a;
                    if (jVar.b + j > jVar.c) {
                        return new String(d(j), charset);
                    }
                    String str = new String(jVar.a, jVar.b, (int) j, charset);
                    jVar.b = (int) (jVar.b + j);
                    this.b -= j;
                    if (jVar.b == jVar.c) {
                        this.a = jVar.a();
                        k.a(jVar);
                    }
                    return str;
                }
            }
            throw new IllegalArgumentException("charset == null");
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.meizu.cloud.pushsdk.c.g.c
    /* renamed from: a */
    public final b b(e eVar) {
        if (eVar != null) {
            c(eVar.c, 0, eVar.c.length);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    @Override // com.meizu.cloud.pushsdk.c.g.l
    public final void a(b bVar, long j) {
        if (bVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (bVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        o.a(bVar.b, 0L, j);
        while (j > 0) {
            if (j < bVar.a.c - bVar.a.b) {
                j jVar = this.a != null ? this.a.g : null;
                if (jVar != null && jVar.e) {
                    if ((jVar.c + j) - (jVar.d ? 0 : jVar.b) <= 2048) {
                        bVar.a.a(jVar, (int) j);
                        bVar.b -= j;
                        this.b += j;
                        return;
                    }
                }
                j jVar2 = bVar.a;
                int i = (int) j;
                if (i <= 0 || i > jVar2.c - jVar2.b) {
                    throw new IllegalArgumentException();
                }
                j jVar3 = new j(jVar2);
                jVar3.c = jVar3.b + i;
                jVar2.b += i;
                jVar2.g.a(jVar3);
                bVar.a = jVar3;
            }
            j jVar4 = bVar.a;
            long j2 = jVar4.c - jVar4.b;
            bVar.a = jVar4.a();
            if (this.a == null) {
                this.a = jVar4;
                j jVar5 = this.a;
                j jVar6 = this.a;
                j jVar7 = this.a;
                jVar6.g = jVar7;
                jVar5.f = jVar7;
            } else {
                j a = this.a.g.a(jVar4);
                if (a.g == a) {
                    throw new IllegalStateException();
                }
                if (a.g.e) {
                    int i2 = a.c - a.b;
                    if (i2 <= (2048 - a.g.c) + (a.g.d ? 0 : a.g.b)) {
                        a.a(a.g, i2);
                        a.a();
                        k.a(a);
                    }
                }
            }
            bVar.b -= j2;
            this.b += j2;
            j -= j2;
        }
    }

    public final String toString() {
        if (this.b == 0) {
            return "Buffer[size=0]";
        }
        if (this.b <= 16) {
            return String.format("Buffer[size=%s data=%s]", Long.valueOf(this.b), new e(clone().f()).a());
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(this.a.a, this.a.b, this.a.c - this.a.b);
            j jVar = this.a;
            while (true) {
                jVar = jVar.f;
                if (jVar == this.a) {
                    return String.format("Buffer[size=%s md5=%s]", Long.valueOf(this.b), e.a(messageDigest.digest()).a());
                }
                messageDigest.update(jVar.a, jVar.b, jVar.c - jVar.b);
            }
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }
}
