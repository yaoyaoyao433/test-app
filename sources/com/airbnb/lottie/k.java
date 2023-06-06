package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class k<T> {
    public Executor a;
    final Set<h<T>> b;
    final FutureTask<j<T>> c;
    @Nullable
    volatile j<T> d;
    @Nullable
    private Thread e;
    private final Set<h<Throwable>> f;
    private final Handler g;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public k(Callable<j<T>> callable) {
        this(callable, false);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    private k(Callable<j<T>> callable, boolean z) {
        this.a = Executors.newCachedThreadPool();
        this.b = new LinkedHashSet(1);
        this.f = new LinkedHashSet(1);
        this.g = new Handler(Looper.getMainLooper());
        this.d = null;
        this.c = new FutureTask<>(callable);
        com.sankuai.waimai.launcher.util.aop.b.a(this.a, this.c);
        b();
    }

    public final synchronized k<T> a(h<T> hVar) {
        if (this.d != null && this.d.a != null) {
            hVar.a(this.d.a);
        }
        this.b.add(hVar);
        b();
        return this;
    }

    public final synchronized k<T> b(h<T> hVar) {
        this.b.remove(hVar);
        a();
        return this;
    }

    public final synchronized k<T> c(h<Throwable> hVar) {
        if (this.d != null && this.d.b != null) {
            hVar.a(this.d.b);
        }
        this.f.add(hVar);
        b();
        return this;
    }

    public final synchronized k<T> d(h<T> hVar) {
        this.f.remove(hVar);
        a();
        return this;
    }

    private synchronized void b() {
        if (!c() && this.d == null) {
            this.e = new Thread("LottieTaskObserver") { // from class: com.airbnb.lottie.k.2
                private boolean b = false;

                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    while (!isInterrupted() && !this.b) {
                        if (k.this.c.isDone()) {
                            try {
                                k.a(k.this, k.this.c.get());
                            } catch (InterruptedException | ExecutionException e) {
                                k.a(k.this, new j(e));
                            }
                            this.b = true;
                            k.this.a();
                        }
                    }
                }
            };
            this.e.start();
            d.a("Starting TaskObserver thread");
        }
    }

    synchronized void a() {
        if (c()) {
            if (this.b.isEmpty() || this.d != null) {
                this.e.interrupt();
                this.e = null;
                d.a("Stopping TaskObserver thread");
            }
        }
    }

    private boolean c() {
        return this.e != null && this.e.isAlive();
    }

    static /* synthetic */ void a(k kVar, Throwable th) {
        ArrayList<h> arrayList = new ArrayList(kVar.f);
        if (arrayList.isEmpty()) {
            Log.w("LOTTIE", "Lottie encountered an error but no failure listener was added.", th);
            return;
        }
        for (h hVar : arrayList) {
            hVar.a(th);
        }
    }

    static /* synthetic */ void a(k kVar, j jVar) {
        if (kVar.d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        kVar.d = jVar;
        kVar.g.post(new Runnable() { // from class: com.airbnb.lottie.k.1
            @Override // java.lang.Runnable
            public final void run() {
                if (k.this.d == null || k.this.c.isCancelled()) {
                    return;
                }
                j<T> jVar2 = k.this.d;
                if (jVar2.a != null) {
                    k kVar2 = k.this;
                    T t = jVar2.a;
                    for (h hVar : new ArrayList(kVar2.b)) {
                        hVar.a(t);
                    }
                    return;
                }
                k.a(k.this, jVar2.b);
            }
        });
    }
}
