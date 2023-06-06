package okio;

import com.meituan.robust.common.CommonConstant;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class a extends t {
    private static final long IDLE_TIMEOUT_MILLIS = TimeUnit.SECONDS.toMillis(60);
    private static final long IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(IDLE_TIMEOUT_MILLIS);
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    @Nullable
    static a head;
    private boolean inQueue;
    @Nullable
    private a next;
    private long timeoutAt;

    protected void timedOut() {
    }

    public final void enter() {
        if (this.inQueue) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            this.inQueue = true;
            scheduleTimeout(this, timeoutNanos, hasDeadline);
        }
    }

    private static synchronized void scheduleTimeout(a aVar, long j, boolean z) {
        synchronized (a.class) {
            if (head == null) {
                head = new a();
                new C1534a().start();
            }
            long nanoTime = System.nanoTime();
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i != 0 && z) {
                aVar.timeoutAt = Math.min(j, aVar.deadlineNanoTime() - nanoTime) + nanoTime;
            } else if (i != 0) {
                aVar.timeoutAt = j + nanoTime;
            } else if (z) {
                aVar.timeoutAt = aVar.deadlineNanoTime();
            } else {
                throw new AssertionError();
            }
            long remainingNanos = aVar.remainingNanos(nanoTime);
            a aVar2 = head;
            while (aVar2.next != null && remainingNanos >= aVar2.next.remainingNanos(nanoTime)) {
                aVar2 = aVar2.next;
            }
            aVar.next = aVar2.next;
            aVar2.next = aVar;
            if (aVar2 == head) {
                a.class.notify();
            }
        }
    }

    public final boolean exit() {
        if (this.inQueue) {
            this.inQueue = false;
            return cancelScheduledTimeout(this);
        }
        return false;
    }

    private static synchronized boolean cancelScheduledTimeout(a aVar) {
        synchronized (a.class) {
            for (a aVar2 = head; aVar2 != null; aVar2 = aVar2.next) {
                if (aVar2.next == aVar) {
                    aVar2.next = aVar.next;
                    aVar.next = null;
                    return false;
                }
            }
            return true;
        }
    }

    private long remainingNanos(long j) {
        return this.timeoutAt - j;
    }

    public final r sink(final r rVar) {
        return new r() { // from class: okio.a.1
            @Override // okio.r
            public final void write(c cVar, long j) throws IOException {
                u.a(cVar.b, 0L, j);
                while (true) {
                    long j2 = 0;
                    if (j <= 0) {
                        return;
                    }
                    Segment segment = cVar.a;
                    while (true) {
                        if (j2 >= 65536) {
                            break;
                        }
                        j2 += segment.limit - segment.pos;
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        }
                        segment = segment.next;
                    }
                    a.this.enter();
                    try {
                        try {
                            rVar.write(cVar, j2);
                            j -= j2;
                            a.this.exit(true);
                        } catch (IOException e) {
                            throw a.this.exit(e);
                        }
                    } catch (Throwable th) {
                        a.this.exit(false);
                        throw th;
                    }
                }
            }

            @Override // okio.r, java.io.Flushable
            public final void flush() throws IOException {
                a.this.enter();
                try {
                    try {
                        rVar.flush();
                        a.this.exit(true);
                    } catch (IOException e) {
                        throw a.this.exit(e);
                    }
                } catch (Throwable th) {
                    a.this.exit(false);
                    throw th;
                }
            }

            @Override // okio.r, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                a.this.enter();
                try {
                    try {
                        rVar.close();
                        a.this.exit(true);
                    } catch (IOException e) {
                        throw a.this.exit(e);
                    }
                } catch (Throwable th) {
                    a.this.exit(false);
                    throw th;
                }
            }

            @Override // okio.r
            public final t timeout() {
                return a.this;
            }

            public final String toString() {
                return "AsyncTimeout.sink(" + rVar + CommonConstant.Symbol.BRACKET_RIGHT;
            }
        };
    }

    public final s source(final s sVar) {
        return new s() { // from class: okio.a.2
            @Override // okio.s
            public final long read(c cVar, long j) throws IOException {
                a.this.enter();
                try {
                    try {
                        long read = sVar.read(cVar, j);
                        a.this.exit(true);
                        return read;
                    } catch (IOException e) {
                        throw a.this.exit(e);
                    }
                } catch (Throwable th) {
                    a.this.exit(false);
                    throw th;
                }
            }

            @Override // okio.s, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                try {
                    try {
                        sVar.close();
                        a.this.exit(true);
                    } catch (IOException e) {
                        throw a.this.exit(e);
                    }
                } catch (Throwable th) {
                    a.this.exit(false);
                    throw th;
                }
            }

            @Override // okio.s
            public final t timeout() {
                return a.this;
            }

            public final String toString() {
                return "AsyncTimeout.source(" + sVar + CommonConstant.Symbol.BRACKET_RIGHT;
            }
        };
    }

    final void exit(boolean z) throws IOException {
        if (exit() && z) {
            throw newTimeoutException(null);
        }
    }

    final IOException exit(IOException iOException) throws IOException {
        return !exit() ? iOException : newTimeoutException(iOException);
    }

    protected IOException newTimeoutException(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* compiled from: ProGuard */
    /* renamed from: okio.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C1534a extends Thread {
        C1534a() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0015, code lost:
            r1.timedOut();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<okio.a> r0 = okio.a.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                okio.a r1 = okio.a.awaitTimeout()     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L0
            Lb:
                okio.a r2 = okio.a.head     // Catch: java.lang.Throwable -> L19
                if (r1 != r2) goto L14
                r1 = 0
                okio.a.head = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                r1.timedOut()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L19:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1     // Catch: java.lang.InterruptedException -> L0
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.a.C1534a.run():void");
        }
    }

    @Nullable
    static a awaitTimeout() throws InterruptedException {
        a aVar = head.next;
        if (aVar == null) {
            long nanoTime = System.nanoTime();
            a.class.wait(IDLE_TIMEOUT_MILLIS);
            if (head.next != null || System.nanoTime() - nanoTime < IDLE_TIMEOUT_NANOS) {
                return null;
            }
            return head;
        }
        long remainingNanos = aVar.remainingNanos(System.nanoTime());
        if (remainingNanos > 0) {
            long j = remainingNanos / 1000000;
            a.class.wait(j, (int) (remainingNanos - (1000000 * j)));
            return null;
        }
        head.next = aVar.next;
        aVar.next = null;
        return aVar;
    }
}
