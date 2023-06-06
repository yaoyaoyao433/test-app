package rx.internal.util;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class k extends AtomicLong implements ThreadFactory {
    public static final ThreadFactory a = new ThreadFactory() { // from class: rx.internal.util.k.1
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            throw new AssertionError("No threads allowed.");
        }
    };
    private static final long serialVersionUID = -8841098858898482335L;
    final String b;

    public k(String str) {
        this.b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.b + incrementAndGet());
        thread.setDaemon(true);
        return thread;
    }
}
