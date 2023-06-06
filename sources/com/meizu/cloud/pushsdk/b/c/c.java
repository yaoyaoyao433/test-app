package com.meizu.cloud.pushsdk.b.c;

import java.lang.Thread;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes3.dex */
public final class c {
    private String b = null;
    private Boolean c = null;
    Integer a = null;
    private Thread.UncaughtExceptionHandler d = null;
    private ThreadFactory e = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ThreadFactory a(c cVar) {
        final String str = cVar.b;
        final Boolean bool = cVar.c;
        final Integer num = cVar.a;
        final Thread.UncaughtExceptionHandler uncaughtExceptionHandler = cVar.d;
        final ThreadFactory defaultThreadFactory = cVar.e != null ? cVar.e : Executors.defaultThreadFactory();
        final AtomicLong atomicLong = str != null ? new AtomicLong(0L) : null;
        return new ThreadFactory() { // from class: com.meizu.cloud.pushsdk.b.c.c.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread newThread = defaultThreadFactory.newThread(runnable);
                if (str != null) {
                    newThread.setName(String.format(str, Long.valueOf(atomicLong.getAndIncrement())));
                }
                if (bool != null) {
                    newThread.setDaemon(bool.booleanValue());
                }
                if (num != null) {
                    newThread.setPriority(num.intValue());
                }
                if (uncaughtExceptionHandler != null) {
                    newThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
                }
                return newThread;
            }
        };
    }

    public final c a(String str) {
        String.format(str, 0);
        this.b = str;
        return this;
    }
}
