package okio;

import com.meituan.robust.common.CommonConstant;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public abstract class h implements r {
    private final r delegate;

    public h(r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.delegate = rVar;
    }

    public final r delegate() {
        return this.delegate;
    }

    @Override // okio.r
    public void write(c cVar, long j) throws IOException {
        this.delegate.write(cVar, j);
    }

    @Override // okio.r, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // okio.r
    public t timeout() {
        return this.delegate.timeout();
    }

    @Override // okio.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public String toString() {
        return getClass().getSimpleName() + CommonConstant.Symbol.BRACKET_LEFT + this.delegate.toString() + CommonConstant.Symbol.BRACKET_RIGHT;
    }
}
