package com.facebook.react.common.futures;

import android.support.annotation.Nullable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SimpleSettableFuture<T> implements Future<T> {
    public final CountDownLatch a = new CountDownLatch(1);
    @Nullable
    public Exception b;
    @Nullable
    private T c;

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    public final void a(@Nullable T t) {
        b();
        this.c = t;
        this.a.countDown();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.a.getCount() == 0;
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public T get() throws InterruptedException, ExecutionException {
        this.a.await();
        if (this.b != null) {
            throw new ExecutionException(this.b);
        }
        return this.c;
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        if (!this.a.await(j, timeUnit)) {
            throw new TimeoutException("Timed out waiting for result");
        }
        if (this.b != null) {
            throw new ExecutionException(this.b);
        }
        return this.c;
    }

    @Nullable
    public final T a() {
        try {
            return get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public void b() {
        if (this.a.getCount() == 0) {
            throw new RuntimeException("Result has already been set!");
        }
    }
}
