package com.huawei.hms.framework.common;

import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RunnableScheduledFutureEnhance<T> implements RunnableScheduledFuture<T> {
    private String parentName = Thread.currentThread().getName();
    private RunnableScheduledFuture<T> proxy;

    public RunnableScheduledFutureEnhance(RunnableScheduledFuture<T> runnableScheduledFuture) {
        this.proxy = runnableScheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.proxy.cancel(z);
    }

    @Override // java.lang.Comparable
    public int compareTo(Delayed delayed) {
        return this.proxy.compareTo(delayed);
    }

    public boolean equals(Object obj) {
        return this.proxy.equals(obj);
    }

    @Override // java.util.concurrent.Future
    public T get() {
        return (T) this.proxy.get();
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) {
        return (T) this.proxy.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.proxy.getDelay(timeUnit);
    }

    public String getParentName() {
        return this.parentName;
    }

    public int hashCode() {
        return this.proxy.hashCode();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.proxy.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.proxy.isDone();
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public boolean isPeriodic() {
        return this.proxy.isPeriodic();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        this.proxy.run();
    }
}
