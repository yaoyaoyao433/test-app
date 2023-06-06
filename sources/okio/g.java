package okio;

import com.meituan.robust.common.CommonConstant;
import java.io.IOException;
import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class g implements r {
    private final d a;
    private final Deflater b;
    private boolean c;

    public g(r rVar, Deflater deflater) {
        this(m.a(rVar), deflater);
    }

    private g(d dVar, Deflater deflater) {
        if (dVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (deflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.a = dVar;
        this.b = deflater;
    }

    @Override // okio.r
    public final void write(c cVar, long j) throws IOException {
        u.a(cVar.b, 0L, j);
        while (j > 0) {
            Segment segment = cVar.a;
            int min = (int) Math.min(j, segment.limit - segment.pos);
            this.b.setInput(segment.data, segment.pos, min);
            a(false);
            long j2 = min;
            cVar.b -= j2;
            segment.pos += min;
            if (segment.pos == segment.limit) {
                cVar.a = segment.pop();
                p.a(segment);
            }
            j -= j2;
        }
    }

    @IgnoreJRERequirement
    private void a(boolean z) throws IOException {
        Segment e;
        int deflate;
        c a = this.a.a();
        while (true) {
            e = a.e(1);
            if (z) {
                deflate = this.b.deflate(e.data, e.limit, 8192 - e.limit, 2);
            } else {
                deflate = this.b.deflate(e.data, e.limit, 8192 - e.limit);
            }
            if (deflate > 0) {
                e.limit += deflate;
                a.b += deflate;
                this.a.v();
            } else if (this.b.needsInput()) {
                break;
            }
        }
        if (e.pos == e.limit) {
            a.a = e.pop();
            p.a(e);
        }
    }

    @Override // okio.r, java.io.Flushable
    public final void flush() throws IOException {
        a(true);
        this.a.flush();
    }

    @Override // okio.r, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.c) {
            return;
        }
        Throwable th = null;
        try {
            this.b.finish();
            a(false);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.b.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.a.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.c = true;
        if (th != null) {
            u.a(th);
        }
    }

    @Override // okio.r
    public final t timeout() {
        return this.a.timeout();
    }

    public final String toString() {
        return "DeflaterSink(" + this.a + CommonConstant.Symbol.BRACKET_RIGHT;
    }
}
