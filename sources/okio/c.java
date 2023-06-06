package okio;

import com.tencent.smtt.sdk.TbsListener;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class c implements Cloneable, ByteChannel, d, e {
    private static final byte[] c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    @Nullable
    public Segment a;
    public long b;

    @Override // okio.d, okio.e
    public final c a() {
        return this;
    }

    @Override // okio.d
    public final d c() {
        return this;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, okio.r
    public final void close() {
    }

    @Override // okio.d, okio.r, java.io.Flushable
    public final void flush() {
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // okio.d
    public final /* bridge */ /* synthetic */ d v() throws IOException {
        return this;
    }

    @Override // okio.d
    public final OutputStream b() {
        return new OutputStream() { // from class: okio.c.1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public final void flush() {
            }

            @Override // java.io.OutputStream
            public final void write(int i) {
                c.this.h((int) ((byte) i));
            }

            @Override // java.io.OutputStream
            public final void write(byte[] bArr, int i, int i2) {
                c.this.c(bArr, i, i2);
            }

            public final String toString() {
                return c.this + ".outputStream()";
            }
        };
    }

    @Override // okio.e
    public final boolean d() {
        return this.b == 0;
    }

    @Override // okio.e
    public final void a(long j) throws EOFException {
        if (this.b < j) {
            throw new EOFException();
        }
    }

    @Override // okio.e
    public final boolean b(long j) {
        return this.b >= j;
    }

    @Override // okio.e
    public final InputStream e() {
        return new InputStream() { // from class: okio.c.2
            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }

            @Override // java.io.InputStream
            public final int read() {
                if (c.this.b > 0) {
                    return c.this.g() & 255;
                }
                return -1;
            }

            @Override // java.io.InputStream
            public final int read(byte[] bArr, int i, int i2) {
                return c.this.a(bArr, i, i2);
            }

            @Override // java.io.InputStream
            public final int available() {
                return (int) Math.min(c.this.b, 2147483647L);
            }

            public final String toString() {
                return c.this + ".inputStream()";
            }
        };
    }

    public final c a(c cVar, long j, long j2) {
        if (cVar == null) {
            throw new IllegalArgumentException("out == null");
        }
        u.a(this.b, j, j2);
        if (j2 == 0) {
            return this;
        }
        cVar.b += j2;
        Segment segment = this.a;
        while (j >= segment.limit - segment.pos) {
            j -= segment.limit - segment.pos;
            segment = segment.next;
        }
        while (j2 > 0) {
            Segment sharedCopy = segment.sharedCopy();
            sharedCopy.pos = (int) (sharedCopy.pos + j);
            sharedCopy.limit = Math.min(sharedCopy.pos + ((int) j2), sharedCopy.limit);
            if (cVar.a == null) {
                sharedCopy.prev = sharedCopy;
                sharedCopy.next = sharedCopy;
                cVar.a = sharedCopy;
            } else {
                cVar.a.prev.push(sharedCopy);
            }
            j2 -= sharedCopy.limit - sharedCopy.pos;
            segment = segment.next;
            j = 0;
        }
        return this;
    }

    public final c a(InputStream inputStream) throws IOException {
        a(inputStream, Long.MAX_VALUE, true);
        return this;
    }

    private void a(InputStream inputStream, long j, boolean z) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        while (true) {
            Segment e = e(1);
            int read = inputStream.read(e.data, e.limit, (int) Math.min(j, 8192 - e.limit));
            if (read == -1) {
                return;
            }
            e.limit += read;
            long j2 = read;
            this.b += j2;
            j -= j2;
        }
    }

    public final long f() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        Segment segment = this.a.prev;
        return (segment.limit >= 8192 || !segment.owner) ? j : j - (segment.limit - segment.pos);
    }

    @Override // okio.e
    public final byte g() {
        if (this.b == 0) {
            throw new IllegalStateException("size == 0");
        }
        Segment segment = this.a;
        int i = segment.pos;
        int i2 = segment.limit;
        int i3 = i + 1;
        byte b = segment.data[i];
        this.b--;
        if (i3 == i2) {
            this.a = segment.pop();
            p.a(segment);
        } else {
            segment.pos = i3;
        }
        return b;
    }

    public final byte c(long j) {
        u.a(this.b, j, 1L);
        if (this.b - j > j) {
            Segment segment = this.a;
            while (true) {
                long j2 = segment.limit - segment.pos;
                if (j >= j2) {
                    j -= j2;
                    segment = segment.next;
                } else {
                    return segment.data[segment.pos + ((int) j)];
                }
            }
        } else {
            long j3 = j - this.b;
            Segment segment2 = this.a;
            do {
                segment2 = segment2.prev;
                j3 += segment2.limit - segment2.pos;
            } while (j3 < 0);
            return segment2.data[segment2.pos + ((int) j3)];
        }
    }

    @Override // okio.e
    public final short h() {
        if (this.b < 2) {
            throw new IllegalStateException("size < 2: " + this.b);
        }
        Segment segment = this.a;
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 2) {
            return (short) (((g() & 255) << 8) | (g() & 255));
        }
        byte[] bArr = segment.data;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
        this.b -= 2;
        if (i4 == i2) {
            this.a = segment.pop();
            p.a(segment);
        } else {
            segment.pos = i4;
        }
        return (short) i5;
    }

    @Override // okio.e
    public final int i() {
        if (this.b < 4) {
            throw new IllegalStateException("size < 4: " + this.b);
        }
        Segment segment = this.a;
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 4) {
            return ((g() & 255) << 24) | ((g() & 255) << 16) | ((g() & 255) << 8) | (g() & 255);
        }
        byte[] bArr = segment.data;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        int i8 = i6 + 1;
        int i9 = i7 | (bArr[i6] & 255);
        this.b -= 4;
        if (i8 == i2) {
            this.a = segment.pop();
            p.a(segment);
        } else {
            segment.pos = i8;
        }
        return i9;
    }

    @Override // okio.e
    public final long j() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (this.b < 8) {
            throw new IllegalStateException("size < 8: " + this.b);
        }
        Segment segment = this.a;
        int i8 = segment.pos;
        int i9 = segment.limit;
        if (i9 - i8 < 8) {
            return ((i() & 4294967295L) << 32) | (4294967295L & i());
        }
        byte[] bArr = segment.data;
        int i10 = i8 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
        long j = (bArr[i7] & 255) | ((bArr[i8] & 255) << 56) | ((bArr[i] & 255) << 48) | ((bArr[i2] & 255) << 40) | ((bArr[i3] & 255) << 32) | ((bArr[i4] & 255) << 24) | ((bArr[i5] & 255) << 16) | ((bArr[i6] & 255) << 8);
        this.b -= 8;
        if (i10 == i9) {
            this.a = segment.pop();
            p.a(segment);
        } else {
            segment.pos = i10;
        }
        return j;
    }

    @Override // okio.e
    public final short k() {
        return u.a(h());
    }

    @Override // okio.e
    public final int l() {
        return u.a(i());
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bb A[EDGE_INSN: B:50:0x00bb->B:41:0x00bb ?: BREAK  , SYNTHETIC] */
    @Override // okio.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m() {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.c.m():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0 A[EDGE_INSN: B:42:0x00a0->B:37:0x00a0 ?: BREAK  , SYNTHETIC] */
    @Override // okio.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long n() {
        /*
            r14 = this;
            long r0 = r14.b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto La7
            r0 = 0
            r4 = r2
            r1 = 0
        Lb:
            okio.Segment r6 = r14.a
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L13:
            if (r8 >= r9) goto L8c
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L22
            r11 = 57
            if (r10 > r11) goto L22
            int r11 = r10 + (-48)
            goto L3b
        L22:
            r11 = 97
            if (r10 < r11) goto L2f
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L2f
            int r11 = r10 + (-97)
            int r11 = r11 + 10
            goto L3b
        L2f:
            r11 = 65
            if (r10 < r11) goto L70
            r11 = 70
            if (r10 > r11) goto L70
            int r11 = r10 + (-65)
            int r11 = r11 + 10
        L3b:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4b
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L13
        L4b:
            okio.c r0 = new okio.c
            r0.<init>()
            okio.c r0 = r0.m(r4)
            okio.c r0 = r0.h(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Number too large: "
            r2.<init>(r3)
            java.lang.String r0 = r0.p()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L70:
            if (r0 == 0) goto L74
            r1 = 1
            goto L8c
        L74:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L8c:
            if (r8 != r9) goto L98
            okio.Segment r7 = r6.pop()
            r14.a = r7
            okio.p.a(r6)
            goto L9a
        L98:
            r6.pos = r8
        L9a:
            if (r1 != 0) goto La0
            okio.Segment r6 = r14.a
            if (r6 != 0) goto Lb
        La0:
            long r1 = r14.b
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.b = r1
            return r4
        La7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.c.n():long");
    }

    public final f o() {
        return new f(r());
    }

    @Override // okio.e
    public final f d(long j) throws EOFException {
        return new f(h(j));
    }

    @Override // okio.e
    public final void a(c cVar, long j) throws EOFException {
        if (this.b < j) {
            cVar.write(this, this.b);
            throw new EOFException();
        } else {
            cVar.write(this, j);
        }
    }

    public final String p() {
        try {
            return a(this.b, u.a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final String e(long j) throws EOFException {
        return a(j, u.a);
    }

    @Override // okio.e
    public final String a(Charset charset) {
        try {
            return a(this.b, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    private String a(long j, Charset charset) throws EOFException {
        u.a(this.b, 0L, j);
        if (charset != null) {
            if (j > 2147483647L) {
                throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
            } else if (j == 0) {
                return "";
            } else {
                Segment segment = this.a;
                if (segment.pos + j > segment.limit) {
                    return new String(h(j), charset);
                }
                String str = new String(segment.data, segment.pos, (int) j, charset);
                segment.pos = (int) (segment.pos + j);
                this.b -= j;
                if (segment.pos == segment.limit) {
                    this.a = segment.pop();
                    p.a(segment);
                }
                return str;
            }
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // okio.e
    public final String q() throws EOFException {
        return f(Long.MAX_VALUE);
    }

    @Override // okio.e
    public final String f(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException("limit < 0: " + j);
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long a2 = a((byte) 10, 0L, j2);
        if (a2 != -1) {
            return g(a2);
        }
        if (j2 < this.b && c(j2 - 1) == 13 && c(j2) == 10) {
            return g(j2);
        }
        c cVar = new c();
        a(cVar, 0L, Math.min(32L, this.b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.b, j) + " content=" + cVar.o().f() + (char) 8230);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String g(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (c(j2) == 13) {
                String e = e(j2);
                i(2L);
                return e;
            }
        }
        String e2 = e(j);
        i(1L);
        return e2;
    }

    @Override // okio.e
    public final byte[] r() {
        try {
            return h(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // okio.e
    public final byte[] h(long j) throws EOFException {
        u.a(this.b, 0L, j);
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        }
        byte[] bArr = new byte[(int) j];
        a(bArr);
        return bArr;
    }

    @Override // okio.e
    public final void a(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int a2 = a(bArr, i, bArr.length - i);
            if (a2 == -1) {
                throw new EOFException();
            }
            i += a2;
        }
    }

    public final int a(byte[] bArr, int i, int i2) {
        u.a(bArr.length, i, i2);
        Segment segment = this.a;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(i2, segment.limit - segment.pos);
        System.arraycopy(segment.data, segment.pos, bArr, i, min);
        segment.pos += min;
        this.b -= min;
        if (segment.pos == segment.limit) {
            this.a = segment.pop();
            p.a(segment);
        }
        return min;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) throws IOException {
        Segment segment = this.a;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), segment.limit - segment.pos);
        byteBuffer.put(segment.data, segment.pos, min);
        segment.pos += min;
        this.b -= min;
        if (segment.pos == segment.limit) {
            this.a = segment.pop();
            p.a(segment);
        }
        return min;
    }

    public final void s() {
        try {
            i(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // okio.e
    public final void i(long j) throws EOFException {
        while (j > 0) {
            if (this.a == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, this.a.limit - this.a.pos);
            long j2 = min;
            this.b -= j2;
            j -= j2;
            this.a.pos += min;
            if (this.a.pos == this.a.limit) {
                Segment segment = this.a;
                this.a = segment.pop();
                p.a(segment);
            }
        }
    }

    @Override // okio.d
    /* renamed from: a */
    public final c c(f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        fVar.a(this);
        return this;
    }

    @Override // okio.d
    /* renamed from: a */
    public final c b(String str) {
        return a(str, 0, str.length());
    }

    public final c a(String str, int i, int i2) {
        char charAt;
        if (str != null) {
            if (i < 0) {
                throw new IllegalArgumentException("beginIndex < 0: " + i);
            } else if (i2 < i) {
                throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
            } else if (i2 > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
            } else {
                while (i < i2) {
                    char charAt2 = str.charAt(i);
                    if (charAt2 < 128) {
                        Segment e = e(1);
                        byte[] bArr = e.data;
                        int i3 = e.limit - i;
                        int min = Math.min(i2, 8192 - i3);
                        int i4 = i + 1;
                        bArr[i + i3] = (byte) charAt2;
                        while (true) {
                            i = i4;
                            if (i >= min || (charAt = str.charAt(i)) >= 128) {
                                break;
                            }
                            i4 = i + 1;
                            bArr[i + i3] = (byte) charAt;
                        }
                        int i5 = (i3 + i) - e.limit;
                        e.limit += i5;
                        this.b += i5;
                    } else if (charAt2 < 2048) {
                        h((charAt2 >> 6) | 192);
                        h((charAt2 & '?') | 128);
                        i++;
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        h((charAt2 >> '\f') | TbsListener.ErrorCode.EXCEED_INCR_UPDATE);
                        h(((charAt2 >> 6) & 63) | 128);
                        h((charAt2 & '?') | 128);
                        i++;
                    } else {
                        int i6 = i + 1;
                        char charAt3 = i6 < i2 ? str.charAt(i6) : (char) 0;
                        if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                            h(63);
                            i = i6;
                        } else {
                            int i7 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + 65536;
                            h((i7 >> 18) | 240);
                            h(((i7 >> 12) & 63) | 128);
                            h(((i7 >> 6) & 63) | 128);
                            h((i7 & 63) | 128);
                            i += 2;
                        }
                    }
                }
                return this;
            }
        }
        throw new IllegalArgumentException("string == null");
    }

    public final c a(int i) {
        if (i < 128) {
            h(i);
        } else if (i < 2048) {
            h((i >> 6) | 192);
            h((i & 63) | 128);
        } else if (i < 65536) {
            if (i >= 55296 && i <= 57343) {
                h(63);
            } else {
                h((i >> 12) | TbsListener.ErrorCode.EXCEED_INCR_UPDATE);
                h(((i >> 6) & 63) | 128);
                h((i & 63) | 128);
            }
        } else if (i <= 1114111) {
            h((i >> 18) | 240);
            h(((i >> 12) & 63) | 128);
            h(((i >> 6) & 63) | 128);
            h((i & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
        }
        return this;
    }

    public final c a(String str, int i, int i2, Charset charset) {
        if (str != null) {
            if (i < 0) {
                throw new IllegalAccessError("beginIndex < 0: " + i);
            } else if (i2 < i) {
                throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
            } else if (i2 > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
            } else if (charset == null) {
                throw new IllegalArgumentException("charset == null");
            } else {
                if (charset.equals(u.a)) {
                    return a(str, i, i2);
                }
                byte[] bytes = str.substring(i, i2).getBytes(charset);
                return c(bytes, 0, bytes.length);
            }
        }
        throw new IllegalArgumentException("string == null");
    }

    @Override // okio.d
    /* renamed from: b */
    public final c c(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        return c(bArr, 0, bArr.length);
    }

    @Override // okio.d
    /* renamed from: b */
    public final c c(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = i2;
        u.a(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            Segment e = e(1);
            int min = Math.min(i3 - i, 8192 - e.limit);
            System.arraycopy(bArr, i, e.data, e.limit, min);
            i += min;
            e.limit += min;
        }
        this.b += j;
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            Segment e = e(1);
            int min = Math.min(i, 8192 - e.limit);
            byteBuffer.get(e.data, e.limit, min);
            i -= min;
            e.limit += min;
        }
        this.b += remaining;
        return remaining;
    }

    @Override // okio.d
    public final long a(s sVar) throws IOException {
        if (sVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long read = sVar.read(this, 8192L);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    @Override // okio.d
    /* renamed from: b */
    public final c h(int i) {
        Segment e = e(1);
        byte[] bArr = e.data;
        int i2 = e.limit;
        e.limit = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
        return this;
    }

    @Override // okio.d
    /* renamed from: c */
    public final c g(int i) {
        Segment e = e(2);
        byte[] bArr = e.data;
        int i2 = e.limit;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        e.limit = i3 + 1;
        this.b += 2;
        return this;
    }

    @Override // okio.d
    /* renamed from: d */
    public final c f(int i) {
        Segment e = e(4);
        byte[] bArr = e.data;
        int i2 = e.limit;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        e.limit = i5 + 1;
        this.b += 4;
        return this;
    }

    public final c j(long j) {
        Segment e = e(8);
        byte[] bArr = e.data;
        int i = e.limit;
        int i2 = i + 1;
        bArr[i] = (byte) ((j >>> 56) & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j >>> 48) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j >>> 40) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j >>> 32) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j >>> 24) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j >>> 16) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j >>> 8) & 255);
        bArr[i8] = (byte) (j & 255);
        e.limit = i8 + 1;
        this.b += 8;
        return this;
    }

    @Override // okio.d
    /* renamed from: k */
    public final c n(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return h(48);
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
        Segment e = e(i2);
        byte[] bArr = e.data;
        int i3 = e.limit + i2;
        while (j != 0) {
            i3--;
            bArr[i3] = c[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i3 - 1] = 45;
        }
        e.limit += i2;
        this.b += i2;
        return this;
    }

    @Override // okio.d
    /* renamed from: l */
    public final c m(long j) {
        if (j == 0) {
            return h(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        Segment e = e(numberOfTrailingZeros);
        byte[] bArr = e.data;
        int i = e.limit;
        for (int i2 = (e.limit + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = c[(int) (15 & j)];
            j >>>= 4;
        }
        e.limit += numberOfTrailingZeros;
        this.b += numberOfTrailingZeros;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Segment e(int i) {
        if (i <= 0 || i > 8192) {
            throw new IllegalArgumentException();
        }
        if (this.a == null) {
            this.a = p.a();
            Segment segment = this.a;
            Segment segment2 = this.a;
            Segment segment3 = this.a;
            segment2.prev = segment3;
            segment.next = segment3;
            return segment3;
        }
        Segment segment4 = this.a.prev;
        return (segment4.limit + i > 8192 || !segment4.owner) ? segment4.push(p.a()) : segment4;
    }

    @Override // okio.r
    public final void write(c cVar, long j) {
        if (cVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (cVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        u.a(cVar.b, 0L, j);
        while (j > 0) {
            if (j < cVar.a.limit - cVar.a.pos) {
                Segment segment = this.a != null ? this.a.prev : null;
                if (segment != null && segment.owner) {
                    if ((segment.limit + j) - (segment.shared ? 0 : segment.pos) <= 8192) {
                        cVar.a.writeTo(segment, (int) j);
                        cVar.b -= j;
                        this.b += j;
                        return;
                    }
                }
                cVar.a = cVar.a.split((int) j);
            }
            Segment segment2 = cVar.a;
            long j2 = segment2.limit - segment2.pos;
            cVar.a = segment2.pop();
            if (this.a == null) {
                this.a = segment2;
                Segment segment3 = this.a;
                Segment segment4 = this.a;
                Segment segment5 = this.a;
                segment4.prev = segment5;
                segment3.next = segment5;
            } else {
                this.a.prev.push(segment2).compact();
            }
            cVar.b -= j2;
            this.b += j2;
            j -= j2;
        }
    }

    @Override // okio.s
    public final long read(c cVar, long j) {
        if (cVar != null) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.b == 0) {
                return -1L;
            } else {
                if (j > this.b) {
                    j = this.b;
                }
                cVar.write(this, j);
                return j;
            }
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // okio.e
    public final long a(byte b) {
        return a((byte) 0, 0L, Long.MAX_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(byte r11, long r12, long r14) {
        /*
            r10 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 < 0) goto L78
            int r2 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r2 < 0) goto L78
            long r2 = r10.b
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 <= 0) goto L12
            long r14 = r10.b
        L12:
            r2 = -1
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r4 != 0) goto L19
            return r2
        L19:
            okio.Segment r4 = r10.a
            if (r4 != 0) goto L1e
            return r2
        L1e:
            long r5 = r10.b
            long r5 = r5 - r12
            int r5 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r5 >= 0) goto L35
            long r0 = r10.b
        L27:
            int r5 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r5 <= 0) goto L44
            okio.Segment r4 = r4.prev
            int r5 = r4.limit
            int r6 = r4.pos
            int r5 = r5 - r6
            long r5 = (long) r5
            long r0 = r0 - r5
            goto L27
        L35:
            int r5 = r4.limit
            int r6 = r4.pos
            int r5 = r5 - r6
            long r5 = (long) r5
            long r5 = r5 + r0
            int r7 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r7 >= 0) goto L44
            okio.Segment r4 = r4.next
            r0 = r5
            goto L35
        L44:
            int r5 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r5 >= 0) goto L77
            byte[] r5 = r4.data
            int r6 = r4.limit
            long r6 = (long) r6
            int r8 = r4.pos
            long r8 = (long) r8
            long r8 = r8 + r14
            long r8 = r8 - r0
            long r6 = java.lang.Math.min(r6, r8)
            int r6 = (int) r6
            int r7 = r4.pos
            long r7 = (long) r7
            long r7 = r7 + r12
            long r7 = r7 - r0
            int r12 = (int) r7
        L5d:
            if (r12 >= r6) goto L6c
            r13 = r5[r12]
            if (r13 != r11) goto L69
            int r11 = r4.pos
            int r12 = r12 - r11
            long r11 = (long) r12
            long r11 = r11 + r0
            return r11
        L69:
            int r12 = r12 + 1
            goto L5d
        L6c:
            int r12 = r4.limit
            int r13 = r4.pos
            int r12 = r12 - r13
            long r12 = (long) r12
            long r12 = r12 + r0
            okio.Segment r4 = r4.next
            r0 = r12
            goto L44
        L77:
            return r2
        L78:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            long r2 = r10.b
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0[r1] = r2
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r13 = 1
            r0[r13] = r12
            r12 = 2
            java.lang.Long r13 = java.lang.Long.valueOf(r14)
            r0[r12] = r13
            java.lang.String r12 = "size=%s fromIndex=%s toIndex=%s"
            java.lang.String r12 = java.lang.String.format(r12, r0)
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.c.a(byte, long, long):long");
    }

    public final long b(f fVar) {
        return a(fVar, 0L);
    }

    public final long a(f fVar, long j) {
        long j2;
        Segment segment = this.a;
        if (segment == null) {
            return -1L;
        }
        if (this.b - 0 >= 0) {
            j2 = 0;
            while (true) {
                long j3 = (segment.limit - segment.pos) + j2;
                if (j3 >= 0) {
                    break;
                }
                segment = segment.next;
                j2 = j3;
            }
        } else {
            j2 = this.b;
            while (j2 > 0) {
                segment = segment.prev;
                j2 -= segment.limit - segment.pos;
            }
        }
        if (fVar.h() == 2) {
            byte a2 = fVar.a(0);
            byte a3 = fVar.a(1);
            while (j2 < this.b) {
                byte[] bArr = segment.data;
                int i = segment.limit;
                for (int i2 = (int) ((segment.pos + j) - j2); i2 < i; i2++) {
                    byte b = bArr[i2];
                    if (b == a2 || b == a3) {
                        return (i2 - segment.pos) + j2;
                    }
                }
                j = (segment.limit - segment.pos) + j2;
                segment = segment.next;
                j2 = j;
            }
        } else {
            byte[] j4 = fVar.j();
            while (j2 < this.b) {
                byte[] bArr2 = segment.data;
                int i3 = segment.limit;
                for (int i4 = (int) ((segment.pos + j) - j2); i4 < i3; i4++) {
                    byte b2 = bArr2[i4];
                    for (byte b3 : j4) {
                        if (b2 == b3) {
                            return (i4 - segment.pos) + j2;
                        }
                    }
                }
                j = (segment.limit - segment.pos) + j2;
                segment = segment.next;
                j2 = j;
            }
        }
        return -1L;
    }

    @Override // okio.e
    public final boolean a(long j, f fVar) {
        int h = fVar.h();
        if (h < 0 || this.b - 0 < h || fVar.h() - 0 < h) {
            return false;
        }
        for (int i = 0; i < h; i++) {
            if (c(i + 0) != fVar.a(i + 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.r
    public final t timeout() {
        return t.NONE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.b != cVar.b) {
                return false;
            }
            long j = 0;
            if (this.b == 0) {
                return true;
            }
            Segment segment = this.a;
            Segment segment2 = cVar.a;
            int i = segment.pos;
            int i2 = segment2.pos;
            while (j < this.b) {
                long min = Math.min(segment.limit - i, segment2.limit - i2);
                int i3 = i2;
                int i4 = i;
                int i5 = 0;
                while (i5 < min) {
                    int i6 = i4 + 1;
                    int i7 = i3 + 1;
                    if (segment.data[i4] != segment2.data[i3]) {
                        return false;
                    }
                    i5++;
                    i4 = i6;
                    i3 = i7;
                }
                if (i4 == segment.limit) {
                    segment = segment.next;
                    i = segment.pos;
                } else {
                    i = i4;
                }
                if (i3 == segment2.limit) {
                    segment2 = segment2.next;
                    i2 = segment2.pos;
                } else {
                    i2 = i3;
                }
                j += min;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Segment segment = this.a;
        if (segment == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = segment.limit;
            for (int i3 = segment.pos; i3 < i2; i3++) {
                i = (i * 31) + segment.data[i3];
            }
            segment = segment.next;
        } while (segment != this.a);
        return i;
    }

    public final String toString() {
        return u().toString();
    }

    /* renamed from: t */
    public final c clone() {
        c cVar = new c();
        if (this.b == 0) {
            return cVar;
        }
        cVar.a = this.a.sharedCopy();
        Segment segment = cVar.a;
        Segment segment2 = cVar.a;
        Segment segment3 = cVar.a;
        segment2.prev = segment3;
        segment.next = segment3;
        Segment segment4 = this.a;
        while (true) {
            segment4 = segment4.next;
            if (segment4 != this.a) {
                cVar.a.prev.push(segment4.sharedCopy());
            } else {
                cVar.b = this.b;
                return cVar;
            }
        }
    }

    public final f u() {
        if (this.b > 2147483647L) {
            throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.b);
        }
        return i((int) this.b);
    }

    private f i(int i) {
        if (i == 0) {
            return f.b;
        }
        return new q(this, i);
    }

    public final a a(a aVar) {
        if (aVar.a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        aVar.a = this;
        aVar.b = true;
        return aVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class a implements Closeable {
        public c a;
        public boolean b;
        public byte[] d;
        private Segment g;
        public long c = -1;
        public int e = -1;
        public int f = -1;

        public final int a(long j) {
            int i = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
            if (i < 0 || j > this.a.b) {
                throw new ArrayIndexOutOfBoundsException(String.format("offset=%s > size=%s", Long.valueOf(j), Long.valueOf(this.a.b)));
            }
            if (i == 0 || j == this.a.b) {
                this.g = null;
                this.c = j;
                this.d = null;
                this.e = -1;
                this.f = -1;
                return -1;
            }
            long j2 = 0;
            long j3 = this.a.b;
            Segment segment = this.a.a;
            Segment segment2 = this.a.a;
            if (this.g != null) {
                long j4 = this.c - (this.e - this.g.pos);
                if (j4 > j) {
                    segment2 = this.g;
                    j3 = j4;
                } else {
                    segment = this.g;
                    j2 = j4;
                }
            }
            if (j3 - j > j - j2) {
                while (j >= (segment.limit - segment.pos) + j2) {
                    j2 += segment.limit - segment.pos;
                    segment = segment.next;
                }
            } else {
                j2 = j3;
                segment = segment2;
                while (j2 > j) {
                    segment = segment.prev;
                    j2 -= segment.limit - segment.pos;
                }
            }
            if (this.b && segment.shared) {
                Segment unsharedCopy = segment.unsharedCopy();
                if (this.a.a == segment) {
                    this.a.a = unsharedCopy;
                }
                segment = segment.push(unsharedCopy);
                segment.prev.pop();
            }
            this.g = segment;
            this.c = j;
            this.d = segment.data;
            this.e = segment.pos + ((int) (j - j2));
            this.f = segment.limit;
            return this.f - this.e;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.a == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.a = null;
            this.g = null;
            this.c = -1L;
            this.d = null;
            this.e = -1;
            this.f = -1;
        }
    }
}
