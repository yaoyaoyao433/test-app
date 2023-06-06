package com.squareup.okhttp;

import com.squareup.okhttp.e;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class n {
    private ExecutorService c;
    private int a = 64;
    private int b = 5;
    private final Deque<e.b> d = new ArrayDeque();
    private final Deque<e.b> e = new ArrayDeque();
    private final Deque<e> f = new ArrayDeque();

    public n(ExecutorService executorService) {
        this.c = executorService;
    }

    public n() {
    }

    private synchronized ExecutorService a() {
        if (this.c == null) {
            this.c = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), com.squareup.okhttp.internal.j.a("OkHttp Dispatcher", false));
        }
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(e.b bVar) {
        if (this.e.size() < this.a && c(bVar) < this.b) {
            this.e.add(bVar);
            a().execute(bVar);
            return;
        }
        this.d.add(bVar);
    }

    public final synchronized void cancel(Object obj) {
        for (e.b bVar : this.d) {
            if (com.squareup.okhttp.internal.j.a(obj, bVar.b())) {
                bVar.cancel();
            }
        }
        for (e.b bVar2 : this.e) {
            if (com.squareup.okhttp.internal.j.a(obj, bVar2.b())) {
                e.this.b = true;
                com.squareup.okhttp.internal.http.h hVar = e.this.d;
                if (hVar != null) {
                    hVar.cancel();
                }
            }
        }
        for (e eVar : this.f) {
            if (com.squareup.okhttp.internal.j.a(obj, eVar.c.e)) {
                eVar.cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(e.b bVar) {
        if (!this.e.remove(bVar)) {
            throw new AssertionError("AsyncCall wasn't running!");
        }
        b();
    }

    private void b() {
        if (this.e.size() < this.a && !this.d.isEmpty()) {
            Iterator<e.b> it = this.d.iterator();
            while (it.hasNext()) {
                e.b next = it.next();
                if (c(next) < this.b) {
                    it.remove();
                    this.e.add(next);
                    a().execute(next);
                }
                if (this.e.size() >= this.a) {
                    return;
                }
            }
        }
    }

    private int c(e.b bVar) {
        int i = 0;
        for (e.b bVar2 : this.e) {
            if (bVar2.a().equals(bVar.a())) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(e eVar) {
        this.f.add(eVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(e eVar) {
        if (!this.f.remove(eVar)) {
            throw new AssertionError("Call wasn't in-flight!");
        }
    }
}
