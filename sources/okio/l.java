package okio;

import com.dianping.titans.js.jshandler.ClosePageWithKeysJsHandler;
import com.meituan.robust.common.CommonConstant;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class l implements s {
    private final e a;
    private final Inflater b;
    private int c;
    private boolean d;

    public l(s sVar, Inflater inflater) {
        this(m.a(sVar), inflater);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(e eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.a = eVar;
        this.b = inflater;
    }

    @Override // okio.s
    public final long read(c cVar, long j) throws IOException {
        Segment e;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.d) {
            throw new IllegalStateException(ClosePageWithKeysJsHandler.RESULT_KEY);
        } else {
            if (i == 0) {
                return 0L;
            }
            while (true) {
                boolean a = a();
                try {
                    e = cVar.e(1);
                    int inflate = this.b.inflate(e.data, e.limit, (int) Math.min(j, 8192 - e.limit));
                    if (inflate > 0) {
                        e.limit += inflate;
                        long j2 = inflate;
                        cVar.b += j2;
                        return j2;
                    } else if (this.b.finished() || this.b.needsDictionary()) {
                        break;
                    } else if (a) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e2) {
                    throw new IOException(e2);
                }
            }
            b();
            if (e.pos == e.limit) {
                cVar.a = e.pop();
                p.a(e);
                return -1L;
            }
            return -1L;
        }
    }

    public final boolean a() throws IOException {
        if (this.b.needsInput()) {
            b();
            if (this.b.getRemaining() != 0) {
                throw new IllegalStateException(CommonConstant.Symbol.QUESTION_MARK);
            }
            if (this.a.d()) {
                return true;
            }
            Segment segment = this.a.a().a;
            this.c = segment.limit - segment.pos;
            this.b.setInput(segment.data, segment.pos, this.c);
            return false;
        }
        return false;
    }

    private void b() throws IOException {
        if (this.c == 0) {
            return;
        }
        int remaining = this.c - this.b.getRemaining();
        this.c -= remaining;
        this.a.i(remaining);
    }

    @Override // okio.s
    public final t timeout() {
        return this.a.timeout();
    }

    @Override // okio.s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }
}
