package okio;

import com.meituan.robust.common.CommonConstant;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public abstract class i implements s {
    private final s delegate;

    public i(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.delegate = sVar;
    }

    public final s delegate() {
        return this.delegate;
    }

    @Override // okio.s
    public long read(c cVar, long j) throws IOException {
        return this.delegate.read(cVar, j);
    }

    @Override // okio.s
    public t timeout() {
        return this.delegate.timeout();
    }

    @Override // okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public String toString() {
        return getClass().getSimpleName() + CommonConstant.Symbol.BRACKET_LEFT + this.delegate.toString() + CommonConstant.Symbol.BRACKET_RIGHT;
    }
}
