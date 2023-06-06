package com.squareup.okhttp.internal.framed;

import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.ViewCompat;
import com.dianping.titans.js.jshandler.ClosePageWithKeysJsHandler;
import com.squareup.okhttp.internal.framed.b;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.util.List;
import java.util.zip.Deflater;
import okio.r;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class o implements p {
    static final byte[] a;

    static {
        try {
            a = "\u0000\u0000\u0000\u0007options\u0000\u0000\u0000\u0004head\u0000\u0000\u0000\u0004post\u0000\u0000\u0000\u0003put\u0000\u0000\u0000\u0006delete\u0000\u0000\u0000\u0005trace\u0000\u0000\u0000\u0006accept\u0000\u0000\u0000\u000eaccept-charset\u0000\u0000\u0000\u000faccept-encoding\u0000\u0000\u0000\u000faccept-language\u0000\u0000\u0000\raccept-ranges\u0000\u0000\u0000\u0003age\u0000\u0000\u0000\u0005allow\u0000\u0000\u0000\rauthorization\u0000\u0000\u0000\rcache-control\u0000\u0000\u0000\nconnection\u0000\u0000\u0000\fcontent-base\u0000\u0000\u0000\u0010content-encoding\u0000\u0000\u0000\u0010content-language\u0000\u0000\u0000\u000econtent-length\u0000\u0000\u0000\u0010content-location\u0000\u0000\u0000\u000bcontent-md5\u0000\u0000\u0000\rcontent-range\u0000\u0000\u0000\fcontent-type\u0000\u0000\u0000\u0004date\u0000\u0000\u0000\u0004etag\u0000\u0000\u0000\u0006expect\u0000\u0000\u0000\u0007expires\u0000\u0000\u0000\u0004from\u0000\u0000\u0000\u0004host\u0000\u0000\u0000\bif-match\u0000\u0000\u0000\u0011if-modified-since\u0000\u0000\u0000\rif-none-match\u0000\u0000\u0000\bif-range\u0000\u0000\u0000\u0013if-unmodified-since\u0000\u0000\u0000\rlast-modified\u0000\u0000\u0000\blocation\u0000\u0000\u0000\fmax-forwards\u0000\u0000\u0000\u0006pragma\u0000\u0000\u0000\u0012proxy-authenticate\u0000\u0000\u0000\u0013proxy-authorization\u0000\u0000\u0000\u0005range\u0000\u0000\u0000\u0007referer\u0000\u0000\u0000\u000bretry-after\u0000\u0000\u0000\u0006server\u0000\u0000\u0000\u0002te\u0000\u0000\u0000\u0007trailer\u0000\u0000\u0000\u0011transfer-encoding\u0000\u0000\u0000\u0007upgrade\u0000\u0000\u0000\nuser-agent\u0000\u0000\u0000\u0004vary\u0000\u0000\u0000\u0003via\u0000\u0000\u0000\u0007warning\u0000\u0000\u0000\u0010www-authenticate\u0000\u0000\u0000\u0006method\u0000\u0000\u0000\u0003get\u0000\u0000\u0000\u0006status\u0000\u0000\u0000\u0006200 OK\u0000\u0000\u0000\u0007version\u0000\u0000\u0000\bHTTP/1.1\u0000\u0000\u0000\u0003url\u0000\u0000\u0000\u0006public\u0000\u0000\u0000\nset-cookie\u0000\u0000\u0000\nkeep-alive\u0000\u0000\u0000\u0006origin100101201202205206300302303304305306307402405406407408409410411412413414415416417502504505203 Non-Authoritative Information204 No Content301 Moved Permanently400 Bad Request401 Unauthorized403 Forbidden404 Not Found500 Internal Server Error501 Not Implemented503 Service UnavailableJan Feb Mar Apr May Jun Jul Aug Sept Oct Nov Dec 00:00:00 Mon, Tue, Wed, Thu, Fri, Sat, Sun, GMTchunked,text/html,image/png,image/jpg,image/gif,application/xml,application/xhtml+xml,text/plain,text/javascript,publicprivatemax-age=gzip,deflate,sdchcharset=utf-8charset=iso-8859-1,utf-,*,enq=0.".getBytes(com.squareup.okhttp.internal.j.c.name());
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }

    @Override // com.squareup.okhttp.internal.framed.p
    public final com.squareup.okhttp.internal.framed.b a(okio.e eVar, boolean z) {
        return new a(eVar, z);
    }

    @Override // com.squareup.okhttp.internal.framed.p
    public final c a(okio.d dVar, boolean z) {
        return new b(dVar, z);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    static final class a implements com.squareup.okhttp.internal.framed.b {
        private final okio.e a;
        private final boolean b;
        private final k c;

        @Override // com.squareup.okhttp.internal.framed.b
        public final void a() {
        }

        a(okio.e eVar, boolean z) {
            this.a = eVar;
            this.c = new k(this.a);
            this.b = z;
        }

        @Override // com.squareup.okhttp.internal.framed.b
        public final boolean a(b.a aVar) throws IOException {
            try {
                int i = this.a.i();
                int i2 = this.a.i();
                boolean z = (Integer.MIN_VALUE & i) != 0;
                int i3 = ((-16777216) & i2) >>> 24;
                int i4 = i2 & ViewCompat.MEASURED_SIZE_MASK;
                if (!z) {
                    aVar.a((i3 & 1) != 0, i & Integer.MAX_VALUE, this.a, i4);
                    return true;
                }
                int i5 = (2147418112 & i) >>> 16;
                int i6 = i & SupportMenu.USER_MASK;
                if (i5 != 3) {
                    throw new ProtocolException("version != 3: " + i5);
                }
                switch (i6) {
                    case 1:
                        int i7 = this.a.i() & Integer.MAX_VALUE;
                        int i8 = this.a.i() & Integer.MAX_VALUE;
                        this.a.h();
                        aVar.a((i3 & 2) != 0, (i3 & 1) != 0, i7, i8, this.c.a(i4 - 10), g.SPDY_SYN_STREAM);
                        return true;
                    case 2:
                        aVar.a(false, (i3 & 1) != 0, this.a.i() & Integer.MAX_VALUE, -1, this.c.a(i4 - 4), g.SPDY_REPLY);
                        return true;
                    case 3:
                        if (i4 == 8) {
                            int i9 = this.a.i() & Integer.MAX_VALUE;
                            int i10 = this.a.i();
                            com.squareup.okhttp.internal.framed.a a = com.squareup.okhttp.internal.framed.a.a(i10);
                            if (a != null) {
                                aVar.a(i9, a);
                                return true;
                            }
                            throw a("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i10));
                        }
                        throw a("TYPE_RST_STREAM length: %d != 8", Integer.valueOf(i4));
                    case 4:
                        a(aVar, i3, i4);
                        return true;
                    case 5:
                    default:
                        this.a.i(i4);
                        return true;
                    case 6:
                        if (i4 == 4) {
                            int i11 = this.a.i();
                            aVar.a(this.b == ((i11 & 1) == 1), i11, 0);
                            return true;
                        }
                        throw a("TYPE_PING length: %d != 4", Integer.valueOf(i4));
                    case 7:
                        if (i4 == 8) {
                            int i12 = this.a.i() & Integer.MAX_VALUE;
                            int i13 = this.a.i();
                            com.squareup.okhttp.internal.framed.a c = com.squareup.okhttp.internal.framed.a.c(i13);
                            if (c != null) {
                                aVar.a(i12, c, okio.f.b);
                                return true;
                            }
                            throw a("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i13));
                        }
                        throw a("TYPE_GOAWAY length: %d != 8", Integer.valueOf(i4));
                    case 8:
                        aVar.a(false, false, this.a.i() & Integer.MAX_VALUE, -1, this.c.a(i4 - 4), g.SPDY_HEADERS);
                        return true;
                    case 9:
                        if (i4 == 8) {
                            int i14 = this.a.i() & Integer.MAX_VALUE;
                            long i15 = this.a.i() & Integer.MAX_VALUE;
                            if (i15 != 0) {
                                aVar.a(i14, i15);
                                return true;
                            }
                            throw a("windowSizeIncrement was 0", Long.valueOf(i15));
                        }
                        throw a("TYPE_WINDOW_UPDATE length: %d != 8", Integer.valueOf(i4));
                }
            } catch (IOException unused) {
                return false;
            }
        }

        private void a(b.a aVar, int i, int i2) throws IOException {
            int i3 = this.a.i();
            if (i2 != (i3 * 8) + 4) {
                throw a("TYPE_SETTINGS length: %d != 4 + 8 * %d", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            n nVar = new n();
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = this.a.i();
                nVar.a(i5 & ViewCompat.MEASURED_SIZE_MASK, ((-16777216) & i5) >>> 24, this.a.i());
            }
            aVar.a((i & 1) != 0, nVar);
        }

        private static IOException a(String str, Object... objArr) throws IOException {
            throw new IOException(String.format(str, objArr));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.c.b.close();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    static final class b implements c {
        private final okio.d a;
        private final okio.c b;
        private final okio.d c;
        private final boolean d;
        private boolean e;

        @Override // com.squareup.okhttp.internal.framed.c
        public final void a(n nVar) {
        }

        @Override // com.squareup.okhttp.internal.framed.c
        public final int c() {
            return 16383;
        }

        b(okio.d dVar, boolean z) {
            this.a = dVar;
            this.d = z;
            Deflater deflater = new Deflater();
            deflater.setDictionary(o.a);
            this.b = new okio.c();
            this.c = okio.m.a(new okio.g((r) this.b, deflater));
        }

        @Override // com.squareup.okhttp.internal.framed.c
        public final synchronized void a() {
        }

        @Override // com.squareup.okhttp.internal.framed.c
        public final synchronized void b() throws IOException {
            if (this.e) {
                throw new IOException(ClosePageWithKeysJsHandler.RESULT_KEY);
            }
            this.a.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.c
        public final synchronized void a(boolean z, boolean z2, int i, int i2, List<f> list) throws IOException {
            if (this.e) {
                throw new IOException(ClosePageWithKeysJsHandler.RESULT_KEY);
            }
            a(list);
            int i3 = (int) (this.b.b + 10);
            int i4 = (z ? 1 : 0) | (z2 ? 2 : 0);
            this.a.f(-2147287039);
            this.a.f(((i4 & 255) << 24) | (i3 & ViewCompat.MEASURED_SIZE_MASK));
            this.a.f(i & Integer.MAX_VALUE);
            this.a.f(Integer.MAX_VALUE & i2);
            this.a.g(0);
            this.a.a(this.b);
            this.a.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.c
        public final synchronized void a(int i, com.squareup.okhttp.internal.framed.a aVar) throws IOException {
            if (this.e) {
                throw new IOException(ClosePageWithKeysJsHandler.RESULT_KEY);
            }
            if (aVar.t == -1) {
                throw new IllegalArgumentException();
            }
            this.a.f(-2147287037);
            this.a.f(8);
            this.a.f(i & Integer.MAX_VALUE);
            this.a.f(aVar.t);
            this.a.flush();
        }

        private void a(List<f> list) throws IOException {
            this.c.f(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                okio.f fVar = list.get(i).h;
                this.c.f(fVar.h());
                this.c.c(fVar);
                okio.f fVar2 = list.get(i).i;
                this.c.f(fVar2.h());
                this.c.c(fVar2);
            }
            this.c.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.c
        public final synchronized void b(n nVar) throws IOException {
            if (this.e) {
                throw new IOException(ClosePageWithKeysJsHandler.RESULT_KEY);
            }
            int bitCount = Integer.bitCount(nVar.a);
            this.a.f(-2147287036);
            this.a.f((((bitCount * 8) + 4) & ViewCompat.MEASURED_SIZE_MASK) | 0);
            this.a.f(bitCount);
            for (int i = 0; i <= 10; i++) {
                if (nVar.a(i)) {
                    this.a.f(((nVar.b(i) & 255) << 24) | (i & ViewCompat.MEASURED_SIZE_MASK));
                    this.a.f(nVar.d[i]);
                }
            }
            this.a.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.c
        public final synchronized void a(boolean z, int i, int i2) throws IOException {
            if (this.e) {
                throw new IOException(ClosePageWithKeysJsHandler.RESULT_KEY);
            }
            if (z != (this.d != ((i & 1) == 1))) {
                throw new IllegalArgumentException("payload != reply");
            }
            this.a.f(-2147287034);
            this.a.f(4);
            this.a.f(i);
            this.a.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.c
        public final synchronized void a(int i, com.squareup.okhttp.internal.framed.a aVar, byte[] bArr) throws IOException {
            if (this.e) {
                throw new IOException(ClosePageWithKeysJsHandler.RESULT_KEY);
            }
            if (aVar.u == -1) {
                throw new IllegalArgumentException("errorCode.spdyGoAwayCode == -1");
            }
            this.a.f(-2147287033);
            this.a.f(8);
            this.a.f(i);
            this.a.f(aVar.u);
            this.a.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.c
        public final synchronized void a(int i, long j) throws IOException {
            if (this.e) {
                throw new IOException(ClosePageWithKeysJsHandler.RESULT_KEY);
            }
            if (j == 0 || j > 2147483647L) {
                throw new IllegalArgumentException("windowSizeIncrement must be between 1 and 0x7fffffff: " + j);
            }
            this.a.f(-2147287031);
            this.a.f(8);
            this.a.f(i);
            this.a.f((int) j);
            this.a.flush();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() throws IOException {
            this.e = true;
            com.squareup.okhttp.internal.j.a((Closeable) this.a, (Closeable) this.c);
        }

        @Override // com.squareup.okhttp.internal.framed.c
        public final synchronized void a(boolean z, int i, okio.c cVar, int i2) throws IOException {
            if (this.e) {
                throw new IOException(ClosePageWithKeysJsHandler.RESULT_KEY);
            }
            long j = i2;
            if (j > 16777215) {
                throw new IllegalArgumentException("FRAME_TOO_LARGE max size is 16Mib: " + i2);
            }
            this.a.f(i & Integer.MAX_VALUE);
            this.a.f((((z ? 1 : 0) & 255) << 24) | (16777215 & i2));
            if (i2 > 0) {
                this.a.write(cVar, j);
            }
        }
    }
}
