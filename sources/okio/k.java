package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class k implements s {
    private final e b;
    private final Inflater c;
    private final l d;
    private int a = 0;
    private final CRC32 e = new CRC32();

    public k(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        this.c = new Inflater(true);
        this.b = m.a(sVar);
        this.d = new l(this.b, this.c);
    }

    @Override // okio.s
    public final long read(c cVar, long j) throws IOException {
        long j2;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (i == 0) {
            return 0L;
        } else {
            if (this.a == 0) {
                this.b.a(10L);
                byte c = this.b.a().c(3L);
                boolean z = ((c >> 1) & 1) == 1;
                if (z) {
                    a(this.b.a(), 0L, 10L);
                }
                a("ID1ID2", 8075, this.b.h());
                this.b.i(8L);
                if (((c >> 2) & 1) == 1) {
                    this.b.a(2L);
                    if (z) {
                        a(this.b.a(), 0L, 2L);
                    }
                    long k = this.b.a().k();
                    this.b.a(k);
                    if (z) {
                        j2 = k;
                        a(this.b.a(), 0L, k);
                    } else {
                        j2 = k;
                    }
                    this.b.i(j2);
                }
                if (((c >> 3) & 1) == 1) {
                    long a = this.b.a((byte) 0);
                    if (a == -1) {
                        throw new EOFException();
                    }
                    if (z) {
                        a(this.b.a(), 0L, a + 1);
                    }
                    this.b.i(a + 1);
                }
                if (((c >> 4) & 1) == 1) {
                    long a2 = this.b.a((byte) 0);
                    if (a2 == -1) {
                        throw new EOFException();
                    }
                    if (z) {
                        a(this.b.a(), 0L, a2 + 1);
                    }
                    this.b.i(a2 + 1);
                }
                if (z) {
                    a("FHCRC", this.b.k(), (short) this.e.getValue());
                    this.e.reset();
                }
                this.a = 1;
            }
            if (this.a == 1) {
                long j3 = cVar.b;
                long read = this.d.read(cVar, j);
                if (read != -1) {
                    a(cVar, j3, read);
                    return read;
                }
                this.a = 2;
            }
            if (this.a == 2) {
                a("CRC", this.b.l(), (int) this.e.getValue());
                a("ISIZE", this.b.l(), (int) this.c.getBytesWritten());
                this.a = 3;
                if (!this.b.d()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
    }

    @Override // okio.s
    public final t timeout() {
        return this.b.timeout();
    }

    @Override // okio.s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
    }

    private void a(c cVar, long j, long j2) {
        int i;
        Segment segment = cVar.a;
        while (j >= segment.limit - segment.pos) {
            j -= segment.limit - segment.pos;
            segment = segment.next;
        }
        while (j2 > 0) {
            int min = (int) Math.min(segment.limit - i, j2);
            this.e.update(segment.data, (int) (segment.pos + j), min);
            j2 -= min;
            segment = segment.next;
            j = 0;
        }
    }

    private static void a(String str, int i, int i2) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }
}
