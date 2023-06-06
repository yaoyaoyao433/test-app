package com.squareup.okhttp.internal.framed;

import com.dianping.titans.js.jshandler.ClosePageWithKeysJsHandler;
import com.meituan.android.customerservice.callbase.bean.proto.CSCallUris;
import com.meituan.metrics.common.Constants;
import com.sankuai.titans.widget.PlayerBuilder;
import com.squareup.okhttp.internal.framed.b;
import com.squareup.okhttp.internal.framed.h;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.s;
import okio.t;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class i implements p {
    private static final Logger a = Logger.getLogger(b.class.getName());
    private static final okio.f b = okio.f.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    @Override // com.squareup.okhttp.internal.framed.p
    public final com.squareup.okhttp.internal.framed.b a(okio.e eVar, boolean z) {
        return new c(eVar, 4096, z);
    }

    @Override // com.squareup.okhttp.internal.framed.p
    public final com.squareup.okhttp.internal.framed.c a(okio.d dVar, boolean z) {
        return new d(dVar, z);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class c implements com.squareup.okhttp.internal.framed.b {
        final h.a a;
        private final okio.e b;
        private final a c;
        private final boolean d;

        c(okio.e eVar, int i, boolean z) {
            this.b = eVar;
            this.d = z;
            this.c = new a(this.b);
            this.a = new h.a(4096, this.c);
        }

        @Override // com.squareup.okhttp.internal.framed.b
        public final void a() throws IOException {
            if (this.d) {
                return;
            }
            okio.f d = this.b.d(i.b.h());
            if (i.a.isLoggable(Level.FINE)) {
                i.a.fine(String.format("<< CONNECTION %s", d.f()));
            }
            if (!i.b.equals(d)) {
                throw i.c("Expected a connection header but was %s", d.a());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.squareup.okhttp.internal.framed.b
        public final boolean a(b.a aVar) throws IOException {
            try {
                this.b.a(9L);
                int a = i.a(this.b);
                if (a < 0 || a > 16384) {
                    throw i.c("FRAME_SIZE_ERROR: %s", Integer.valueOf(a));
                }
                byte g = (byte) (this.b.g() & 255);
                byte g2 = (byte) (this.b.g() & 255);
                int i = this.b.i() & Integer.MAX_VALUE;
                if (i.a.isLoggable(Level.FINE)) {
                    i.a.fine(b.a(true, i, a, g, g2));
                }
                switch (g) {
                    case 0:
                        boolean z = (g2 & 1) != 0;
                        if ((g2 & 32) != 0) {
                            throw i.c("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                        }
                        short g3 = (g2 & 8) != 0 ? (short) (this.b.g() & 255) : (short) 0;
                        aVar.a(z, i, this.b, i.a(a, g2, g3));
                        this.b.i(g3);
                        break;
                    case 1:
                        if (i == 0) {
                            throw i.c("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                        }
                        boolean z2 = (g2 & 1) != 0;
                        short g4 = (g2 & 8) != 0 ? (short) (this.b.g() & 255) : (short) 0;
                        if ((g2 & 32) != 0) {
                            a(aVar, i);
                            a -= 5;
                        }
                        aVar.a(false, z2, i, -1, a(i.a(a, g2, g4), g4, g2, i), g.HTTP_20_HEADERS);
                        break;
                    case 2:
                        if (a != 5) {
                            throw i.c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(a));
                        }
                        if (i == 0) {
                            throw i.c("TYPE_PRIORITY streamId == 0", new Object[0]);
                        }
                        a(aVar, i);
                        break;
                    case 3:
                        if (a != 4) {
                            throw i.c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(a));
                        }
                        if (i == 0) {
                            throw i.c("TYPE_RST_STREAM streamId == 0", new Object[0]);
                        }
                        int i2 = this.b.i();
                        com.squareup.okhttp.internal.framed.a b = com.squareup.okhttp.internal.framed.a.b(i2);
                        if (b == null) {
                            throw i.c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i2));
                        }
                        aVar.a(i, b);
                        break;
                    case 4:
                        if (i != 0) {
                            throw i.c("TYPE_SETTINGS streamId != 0", new Object[0]);
                        }
                        if ((g2 & 1) == 0) {
                            if (a % 6 != 0) {
                                throw i.c("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(a));
                            } else {
                                n nVar = new n();
                                for (int i3 = 0; i3 < a; i3 += 6) {
                                    short h = this.b.h();
                                    int i4 = this.b.i();
                                    switch (h) {
                                        case 1:
                                        case 6:
                                            break;
                                        case 2:
                                            if (i4 != 0 && i4 != 1) {
                                                throw i.c("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                            }
                                            break;
                                        case 3:
                                            h = 4;
                                            break;
                                        case 4:
                                            h = 7;
                                            if (i4 >= 0) {
                                                break;
                                            } else {
                                                throw i.c("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                            }
                                        case 5:
                                            if (i4 >= 16384 && i4 <= 16777215) {
                                                break;
                                            } else {
                                                throw i.c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i4));
                                            }
                                            break;
                                        default:
                                            throw i.c("PROTOCOL_ERROR invalid settings id: %s", Short.valueOf(h));
                                    }
                                    nVar.a(h, 0, i4);
                                }
                                aVar.a(false, nVar);
                                if (nVar.a() >= 0) {
                                    h.a aVar2 = this.a;
                                    int a2 = nVar.a();
                                    aVar2.a = a2;
                                    aVar2.b = a2;
                                    aVar2.a();
                                    break;
                                }
                            }
                        } else if (a != 0) {
                            throw i.c("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                        }
                        break;
                    case 5:
                        if (i == 0) {
                            throw i.c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                        }
                        short g5 = (g2 & 8) != 0 ? (short) (this.b.g() & 255) : (short) 0;
                        aVar.a(i, this.b.i() & Integer.MAX_VALUE, a(i.a(a - 4, g2, g5), g5, g2, i));
                        break;
                    case 6:
                        if (a != 8) {
                            throw i.c("TYPE_PING length != 8: %s", Integer.valueOf(a));
                        }
                        if (i != 0) {
                            throw i.c("TYPE_PING streamId != 0", new Object[0]);
                        }
                        aVar.a((g2 & 1) != 0, this.b.i(), this.b.i());
                        break;
                    case 7:
                        if (a < 8) {
                            throw i.c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(a));
                        }
                        if (i != 0) {
                            throw i.c("TYPE_GOAWAY streamId != 0", new Object[0]);
                        }
                        int i5 = this.b.i();
                        int i6 = this.b.i();
                        int i7 = a - 8;
                        com.squareup.okhttp.internal.framed.a b2 = com.squareup.okhttp.internal.framed.a.b(i6);
                        if (b2 == null) {
                            throw i.c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i6));
                        }
                        okio.f fVar = okio.f.b;
                        if (i7 > 0) {
                            fVar = this.b.d(i7);
                        }
                        aVar.a(i5, b2, fVar);
                        break;
                    case 8:
                        if (a != 4) {
                            throw i.c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(a));
                        }
                        long i8 = this.b.i() & 2147483647L;
                        if (i8 == 0) {
                            throw i.c("windowSizeIncrement was 0", Long.valueOf(i8));
                        }
                        aVar.a(i, i8);
                        break;
                    default:
                        this.b.i(a);
                        break;
                }
                return true;
            } catch (IOException unused) {
                return false;
            }
        }

        private List<f> a(int i, short s, byte b, int i2) throws IOException {
            a aVar = this.c;
            this.c.d = i;
            aVar.a = i;
            this.c.e = s;
            this.c.b = b;
            this.c.c = i2;
            this.a.b();
            return this.a.c();
        }

        private void a(b.a aVar, int i) throws IOException {
            this.b.i();
            this.b.g();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.b.close();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class d implements com.squareup.okhttp.internal.framed.c {
        private final okio.d a;
        private final boolean b;
        private final okio.c c = new okio.c();
        private final h.b d = new h.b(this.c);
        private int e = 16384;
        private boolean f;

        d(okio.d dVar, boolean z) {
            this.a = dVar;
            this.b = z;
        }

        @Override // com.squareup.okhttp.internal.framed.c
        public final synchronized void b() throws IOException {
            if (this.f) {
                throw new IOException(ClosePageWithKeysJsHandler.RESULT_KEY);
            }
            this.a.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.c
        public final synchronized void a(n nVar) throws IOException {
            if (this.f) {
                throw new IOException(ClosePageWithKeysJsHandler.RESULT_KEY);
            }
            int i = this.e;
            if ((nVar.a & 32) != 0) {
                i = nVar.d[5];
            }
            this.e = i;
            a(0, 0, (byte) 4, (byte) 1);
            this.a.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.c
        public final synchronized void a() throws IOException {
            if (this.f) {
                throw new IOException(ClosePageWithKeysJsHandler.RESULT_KEY);
            }
            if (this.b) {
                if (i.a.isLoggable(Level.FINE)) {
                    i.a.fine(String.format(">> CONNECTION %s", i.b.f()));
                }
                this.a.c(i.b.i());
                this.a.flush();
            }
        }

        @Override // com.squareup.okhttp.internal.framed.c
        public final synchronized void a(boolean z, boolean z2, int i, int i2, List<f> list) throws IOException {
            if (z2) {
                throw new UnsupportedOperationException();
            }
            if (this.f) {
                throw new IOException(ClosePageWithKeysJsHandler.RESULT_KEY);
            }
            if (this.f) {
                throw new IOException(ClosePageWithKeysJsHandler.RESULT_KEY);
            }
            this.d.a(list);
            long j = this.c.b;
            int min = (int) Math.min(this.e, j);
            long j2 = min;
            int i3 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
            byte b = i3 == 0 ? (byte) 4 : (byte) 0;
            if (z) {
                b = (byte) (b | 1);
            }
            a(i, min, (byte) 1, b);
            this.a.write(this.c, j2);
            if (i3 > 0) {
                b(i, j - j2);
            }
        }

        private void b(int i, long j) throws IOException {
            while (j > 0) {
                int min = (int) Math.min(this.e, j);
                long j2 = min;
                j -= j2;
                a(i, min, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
                this.a.write(this.c, j2);
            }
        }

        @Override // com.squareup.okhttp.internal.framed.c
        public final synchronized void a(int i, com.squareup.okhttp.internal.framed.a aVar) throws IOException {
            if (this.f) {
                throw new IOException(ClosePageWithKeysJsHandler.RESULT_KEY);
            }
            if (aVar.s == -1) {
                throw new IllegalArgumentException();
            }
            a(i, 4, (byte) 3, (byte) 0);
            this.a.f(aVar.s);
            this.a.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.c
        public final int c() {
            return this.e;
        }

        @Override // com.squareup.okhttp.internal.framed.c
        public final synchronized void a(boolean z, int i, okio.c cVar, int i2) throws IOException {
            if (this.f) {
                throw new IOException(ClosePageWithKeysJsHandler.RESULT_KEY);
            }
            a(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
            if (i2 > 0) {
                this.a.write(cVar, i2);
            }
        }

        @Override // com.squareup.okhttp.internal.framed.c
        public final synchronized void b(n nVar) throws IOException {
            if (this.f) {
                throw new IOException(ClosePageWithKeysJsHandler.RESULT_KEY);
            }
            int i = 0;
            a(0, Integer.bitCount(nVar.a) * 6, (byte) 4, (byte) 0);
            while (i < 10) {
                if (nVar.a(i)) {
                    this.a.g(i == 4 ? 3 : i == 7 ? 4 : i);
                    this.a.f(nVar.d[i]);
                }
                i++;
            }
            this.a.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.c
        public final synchronized void a(boolean z, int i, int i2) throws IOException {
            if (this.f) {
                throw new IOException(ClosePageWithKeysJsHandler.RESULT_KEY);
            }
            a(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            this.a.f(i);
            this.a.f(i2);
            this.a.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.c
        public final synchronized void a(int i, com.squareup.okhttp.internal.framed.a aVar, byte[] bArr) throws IOException {
            if (this.f) {
                throw new IOException(ClosePageWithKeysJsHandler.RESULT_KEY);
            }
            if (aVar.s == -1) {
                throw i.b("errorCode.httpCode == -1", new Object[0]);
            }
            a(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.a.f(i);
            this.a.f(aVar.s);
            if (bArr.length > 0) {
                this.a.c(bArr);
            }
            this.a.flush();
        }

        @Override // com.squareup.okhttp.internal.framed.c
        public final synchronized void a(int i, long j) throws IOException {
            if (this.f) {
                throw new IOException(ClosePageWithKeysJsHandler.RESULT_KEY);
            }
            if (j == 0 || j > 2147483647L) {
                throw i.b("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new Object[]{Long.valueOf(j)});
            }
            a(i, 4, (byte) 8, (byte) 0);
            this.a.f((int) j);
            this.a.flush();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() throws IOException {
            this.f = true;
            this.a.close();
        }

        private void a(int i, int i2, byte b, byte b2) throws IOException {
            if (i.a.isLoggable(Level.FINE)) {
                i.a.fine(b.a(false, i, i2, b, b2));
            }
            if (i2 > this.e) {
                throw i.b("FRAME_SIZE_ERROR length > %d: %d", new Object[]{Integer.valueOf(this.e), Integer.valueOf(i2)});
            }
            if ((Integer.MIN_VALUE & i) != 0) {
                throw i.b("reserved bit set: %s", new Object[]{Integer.valueOf(i)});
            }
            i.a(this.a, i2);
            this.a.h(b & 255);
            this.a.h(b2 & 255);
            this.a.f(i & Integer.MAX_VALUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IOException c(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a implements s {
        int a;
        byte b;
        int c;
        int d;
        short e;
        private final okio.e f;

        @Override // okio.s, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        public a(okio.e eVar) {
            this.f = eVar;
        }

        @Override // okio.s
        public final long read(okio.c cVar, long j) throws IOException {
            while (this.d == 0) {
                this.f.i(this.e);
                this.e = (short) 0;
                if ((this.b & 4) != 0) {
                    return -1L;
                }
                int i = this.c;
                int a = i.a(this.f);
                this.d = a;
                this.a = a;
                byte g = (byte) (this.f.g() & 255);
                this.b = (byte) (this.f.g() & 255);
                if (i.a.isLoggable(Level.FINE)) {
                    i.a.fine(b.a(true, this.c, this.a, g, this.b));
                }
                this.c = this.f.i() & Integer.MAX_VALUE;
                if (g != 9) {
                    throw i.c("%s != TYPE_CONTINUATION", Byte.valueOf(g));
                }
                if (this.c != i) {
                    throw i.c("TYPE_CONTINUATION streamId changed", new Object[0]);
                }
            }
            long read = this.f.read(cVar, Math.min(j, this.d));
            if (read == -1) {
                return -1L;
            }
            this.d = (int) (this.d - read);
            return read;
        }

        @Override // okio.s
        public final t timeout() {
            return this.f.timeout();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class b {
        private static final String[] a = {"DATA", PlayerBuilder.KEY_HEADERS, "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", CSCallUris.SVID_CALL_PING, "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        private static final String[] b = new String[64];
        private static final String[] c = new String[256];

        b() {
        }

        static String a(boolean z, int i, int i2, byte b2, byte b3) {
            String str;
            String format = b2 < a.length ? a[b2] : String.format("0x%02x", Byte.valueOf(b2));
            if (b3 != 0) {
                switch (b2) {
                    case 2:
                    case 3:
                    case 7:
                    case 8:
                        str = c[b3];
                        break;
                    case 4:
                    case 6:
                        if (b3 != 1) {
                            str = c[b3];
                            break;
                        } else {
                            str = CSCallUris.SVID_CALL_ACK;
                            break;
                        }
                    case 5:
                    default:
                        String str2 = b3 < b.length ? b[b3] : c[b3];
                        if (b2 == 5 && (b3 & 4) != 0) {
                            str = str2.replace(PlayerBuilder.KEY_HEADERS, "PUSH_PROMISE");
                            break;
                        } else if (b2 == 0 && (b3 & 32) != 0) {
                            str = str2.replace("PRIORITY", "COMPRESSED");
                            break;
                        } else {
                            str = str2;
                            break;
                        }
                        break;
                }
            } else {
                str = "";
            }
            Object[] objArr = new Object[5];
            objArr[0] = z ? "<<" : ">>";
            objArr[1] = Integer.valueOf(i);
            objArr[2] = Integer.valueOf(i2);
            objArr[3] = format;
            objArr[4] = str;
            return String.format("%s 0x%08x %5d %-13s %s", objArr);
        }

        static {
            int i;
            for (int i2 = 0; i2 < c.length; i2++) {
                c[i2] = String.format("%8s", Integer.toBinaryString(i2)).replace(Constants.SPACE, '0');
            }
            b[0] = "";
            b[1] = "END_STREAM";
            int[] iArr = {1};
            b[8] = "PADDED";
            for (int i3 = 0; i3 <= 0; i3++) {
                b[iArr[i3] | 8] = b[i] + "|PADDED";
            }
            b[4] = "END_HEADERS";
            b[32] = "PRIORITY";
            b[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i4 = 0; i4 < 3; i4++) {
                int i5 = iArr2[i4];
                for (int i6 = 0; i6 <= 0; i6++) {
                    int i7 = iArr[i6];
                    int i8 = i7 | i5;
                    b[i8] = b[i7] + '|' + b[i5];
                    b[i8 | 8] = b[i7] + '|' + b[i5] + "|PADDED";
                }
            }
            for (int i9 = 0; i9 < b.length; i9++) {
                if (b[i9] == null) {
                    b[i9] = c[i9];
                }
            }
        }
    }

    static /* synthetic */ int a(okio.e eVar) throws IOException {
        return (eVar.g() & 255) | ((eVar.g() & 255) << 16) | ((eVar.g() & 255) << 8);
    }

    static /* synthetic */ int a(int i, byte b2, short s) throws IOException {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    static /* synthetic */ IllegalArgumentException b(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    static /* synthetic */ void a(okio.d dVar, int i) throws IOException {
        dVar.h((i >>> 16) & 255);
        dVar.h((i >>> 8) & 255);
        dVar.h(i & 255);
    }
}
