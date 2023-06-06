package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class j extends t {
    public t a;

    public j(t tVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.a = tVar;
    }

    public final j a(t tVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.a = tVar;
        return this;
    }

    @Override // okio.t
    public final t timeout(long j, TimeUnit timeUnit) {
        return this.a.timeout(j, timeUnit);
    }

    @Override // okio.t
    public final long timeoutNanos() {
        return this.a.timeoutNanos();
    }

    @Override // okio.t
    public final boolean hasDeadline() {
        return this.a.hasDeadline();
    }

    @Override // okio.t
    public final long deadlineNanoTime() {
        return this.a.deadlineNanoTime();
    }

    @Override // okio.t
    public final t deadlineNanoTime(long j) {
        return this.a.deadlineNanoTime(j);
    }

    @Override // okio.t
    public final t clearTimeout() {
        return this.a.clearTimeout();
    }

    @Override // okio.t
    public final t clearDeadline() {
        return this.a.clearDeadline();
    }

    @Override // okio.t
    public final void throwIfReached() throws IOException {
        this.a.throwIfReached();
    }
}
