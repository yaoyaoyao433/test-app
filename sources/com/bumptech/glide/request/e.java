package com.bumptech.glide.request;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.bumptech.glide.request.target.j;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e<T, R> implements com.bumptech.glide.request.a<R>, Runnable {
    private static final a a = new a();
    private final Handler b;
    private final int c;
    private final int d;
    private final boolean e;
    private final a f;
    private R g;
    private c h;
    private boolean i;
    private Exception j;
    private boolean k;
    private boolean l;

    @Override // com.bumptech.glide.request.target.l
    public final void a(Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.l
    public final void b(Drawable drawable) {
    }

    @Override // com.bumptech.glide.manager.h
    public final void c() {
    }

    @Override // com.bumptech.glide.manager.h
    public final void d() {
    }

    @Override // com.bumptech.glide.manager.h
    public final void e() {
    }

    public e(Handler handler, int i, int i2) {
        this(handler, i, i2, true, a);
    }

    private e(Handler handler, int i, int i2, boolean z, a aVar) {
        this.b = handler;
        this.c = i;
        this.d = i2;
        this.e = true;
        this.f = aVar;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean cancel(boolean z) {
        if (this.i) {
            return true;
        }
        boolean z2 = !isDone();
        if (z2) {
            this.i = true;
            if (z) {
                this.b.post(this);
            }
            notifyAll();
        }
        return z2;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.i;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        boolean z;
        if (!this.i) {
            z = this.k;
        }
        return z;
    }

    @Override // java.util.concurrent.Future
    public final R get() throws InterruptedException, ExecutionException {
        try {
            return a((Long) null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.util.concurrent.Future
    public final R get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return a(Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // com.bumptech.glide.request.target.l
    public final void a(j jVar) {
        jVar.a(this.c, this.d);
    }

    @Override // com.bumptech.glide.request.target.l
    public final void a(c cVar) {
        this.h = cVar;
    }

    @Override // com.bumptech.glide.request.target.l
    public final c a() {
        return this.h;
    }

    @Override // com.bumptech.glide.request.target.l
    public final synchronized void a(Exception exc, Drawable drawable) {
        this.l = true;
        this.j = exc;
        notifyAll();
    }

    @Override // com.bumptech.glide.request.target.l
    public final synchronized void a(R r, com.bumptech.glide.request.animation.e<? super R> eVar) {
        this.k = true;
        this.g = r;
        notifyAll();
    }

    private synchronized R a(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.e) {
            com.bumptech.glide.util.h.b();
        }
        if (this.i) {
            throw new CancellationException();
        }
        if (this.l) {
            throw new ExecutionException(this.j);
        }
        if (this.k) {
            return this.g;
        }
        if (l != null) {
            if (l.longValue() > 0) {
                wait(l.longValue());
            }
        } else {
            wait(0L);
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this.l) {
            throw new ExecutionException(this.j);
        }
        if (this.i) {
            throw new CancellationException();
        }
        if (!this.k) {
            throw new TimeoutException();
        }
        return this.g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.h != null) {
            this.h.c();
            cancel(false);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class a {
        a() {
        }
    }
}
