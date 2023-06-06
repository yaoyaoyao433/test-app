package io.socket.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class a extends Thread {
    private static a c;
    private static ExecutorService d;
    private static final Logger a = Logger.getLogger(a.class.getName());
    private static final ThreadFactory b = new ThreadFactory() { // from class: io.socket.thread.a.1
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            a unused = a.c = new a(runnable);
            a.c.setName("EventThread");
            a.c.setDaemon(Thread.currentThread().isDaemon());
            return a.c;
        }
    };
    private static int e = 0;

    static /* synthetic */ ExecutorService a(ExecutorService executorService) {
        d = null;
        return null;
    }

    static /* synthetic */ int c() {
        int i = e;
        e = i - 1;
        return i;
    }

    private a(Runnable runnable) {
        super(runnable);
    }

    public static void b(final Runnable runnable) {
        ExecutorService executorService;
        synchronized (a.class) {
            e++;
            if (d == null) {
                d = Executors.newSingleThreadExecutor(b);
            }
            executorService = d;
        }
        executorService.execute(new Runnable() { // from class: io.socket.thread.a.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    runnable.run();
                    synchronized (a.class) {
                        a.c();
                        if (a.e == 0) {
                            a.d.shutdown();
                            a.a((ExecutorService) null);
                            a unused = a.c = null;
                        }
                    }
                } catch (Throwable th) {
                    try {
                        a.a.log(Level.SEVERE, "Task threw exception", th);
                        throw th;
                    } catch (Throwable th2) {
                        synchronized (a.class) {
                            a.c();
                            if (a.e == 0) {
                                a.d.shutdown();
                                a.a((ExecutorService) null);
                                a unused2 = a.c = null;
                            }
                            throw th2;
                        }
                    }
                }
            }
        });
    }

    public static void a(Runnable runnable) {
        if (currentThread() == c) {
            runnable.run();
        } else {
            b(runnable);
        }
    }
}
