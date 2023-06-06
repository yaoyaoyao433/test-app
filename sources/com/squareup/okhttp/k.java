package com.squareup.okhttp;

import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class k {
    static final /* synthetic */ boolean f = !k.class.desiredAssertionStatus();
    private static final k g;
    final Executor a;
    final int b;
    Runnable c;
    final Deque<com.squareup.okhttp.internal.io.b> d;
    final com.squareup.okhttp.internal.i e;
    private final long h;

    static {
        String property = System.getProperty("http.keepAlive");
        String property2 = System.getProperty("http.keepAliveDuration");
        String property3 = System.getProperty("http.maxConnections");
        long parseLong = property2 != null ? Long.parseLong(property2) : 300000L;
        if (property != null && !Boolean.parseBoolean(property)) {
            g = new k(0, parseLong);
        } else if (property3 != null) {
            g = new k(Integer.parseInt(property3), parseLong);
        } else {
            g = new k(5, parseLong);
        }
    }

    private k(int i, long j) {
        this(i, j, TimeUnit.MILLISECONDS);
    }

    public k(int i, long j, TimeUnit timeUnit) {
        this.a = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), com.squareup.okhttp.internal.j.a("OkHttp ConnectionPool", true));
        this.c = new Runnable() { // from class: com.squareup.okhttp.k.1
            @Override // java.lang.Runnable
            public final void run() {
                while (true) {
                    long a = k.this.a(System.nanoTime());
                    if (a == -1) {
                        return;
                    }
                    if (a > 0) {
                        long j2 = a / 1000000;
                        long j3 = a - (1000000 * j2);
                        synchronized (k.this) {
                            try {
                                k.this.wait(j2, (int) j3);
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                }
            }
        };
        this.d = new ArrayDeque();
        this.e = new com.squareup.okhttp.internal.i();
        this.b = i;
        this.h = timeUnit.toNanos(j);
        if (j > 0) {
            return;
        }
        throw new IllegalArgumentException("keepAliveDuration <= 0: " + j);
    }

    public static k a() {
        return g;
    }

    final long a(long j) {
        int size;
        synchronized (this) {
            long j2 = Long.MIN_VALUE;
            com.squareup.okhttp.internal.io.b bVar = null;
            int i = 0;
            int i2 = 0;
            for (com.squareup.okhttp.internal.io.b bVar2 : this.d) {
                List<Reference<com.squareup.okhttp.internal.http.s>> list = bVar2.h;
                int i3 = 0;
                while (true) {
                    if (i3 < list.size()) {
                        if (list.get(i3).get() == null) {
                            com.squareup.okhttp.internal.d.a.warning("A connection to " + bVar2.a.a.a + " was leaked. Did you forget to close a response body?");
                            list.remove(i3);
                            bVar2.i = true;
                            if (list.isEmpty()) {
                                bVar2.j = j - this.h;
                                size = 0;
                                break;
                            }
                        } else {
                            i3++;
                        }
                    } else {
                        size = list.size();
                        break;
                    }
                }
                if (size > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - bVar2.j;
                    if (j3 > j2) {
                        bVar = bVar2;
                        j2 = j3;
                    }
                }
            }
            if (j2 < this.h && i <= this.b) {
                if (i > 0) {
                    return this.h - j2;
                } else if (i2 > 0) {
                    return this.h;
                } else {
                    return -1L;
                }
            }
            this.d.remove(bVar);
            com.squareup.okhttp.internal.j.a(bVar.b);
            return 0L;
        }
    }
}
