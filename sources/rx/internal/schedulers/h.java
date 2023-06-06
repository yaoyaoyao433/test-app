package rx.internal.schedulers;

import java.util.LinkedList;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rx.internal.util.m;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class h extends AtomicReference<Thread> implements Runnable, rx.k {
    private static final long serialVersionUID = -3962399486978279857L;
    final m a;
    final rx.functions.a b;

    public h(rx.functions.a aVar) {
        this.b = aVar;
        this.a = new m();
    }

    public h(rx.functions.a aVar, rx.subscriptions.b bVar) {
        this.b = aVar;
        this.a = new m(new b(this, bVar));
    }

    public h(rx.functions.a aVar, m mVar) {
        this.b = aVar;
        this.a = new m(new c(this, mVar));
    }

    @Override // java.lang.Runnable
    public final void run() {
        IllegalStateException illegalStateException;
        try {
            lazySet(Thread.currentThread());
            this.b.a();
        } catch (Throwable th) {
            try {
                if (th instanceof rx.exceptions.f) {
                    illegalStateException = new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", th);
                } else {
                    illegalStateException = new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", th);
                }
                rx.plugins.e.a().b();
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, illegalStateException);
            } finally {
                unsubscribe();
            }
        }
    }

    @Override // rx.k
    public final boolean isUnsubscribed() {
        return this.a.isUnsubscribed();
    }

    @Override // rx.k
    public final void unsubscribe() {
        if (this.a.isUnsubscribed()) {
            return;
        }
        this.a.unsubscribe();
    }

    public final void a(Future<?> future) {
        this.a.a(new a(future));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    final class a implements rx.k {
        private final Future<?> b;

        a(Future<?> future) {
            this.b = future;
        }

        @Override // rx.k
        public final void unsubscribe() {
            if (h.this.get() != Thread.currentThread()) {
                this.b.cancel(true);
            } else {
                this.b.cancel(false);
            }
        }

        @Override // rx.k
        public final boolean isUnsubscribed() {
            return this.b.isCancelled();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    static final class b extends AtomicBoolean implements rx.k {
        private static final long serialVersionUID = 247232374289553518L;
        final h a;
        final rx.subscriptions.b b;

        public b(h hVar, rx.subscriptions.b bVar) {
            this.a = hVar;
            this.b = bVar;
        }

        @Override // rx.k
        public final boolean isUnsubscribed() {
            return this.a.isUnsubscribed();
        }

        @Override // rx.k
        public final void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.b.b(this.a);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class c extends AtomicBoolean implements rx.k {
        private static final long serialVersionUID = 247232374289553518L;
        final h a;
        final m b;

        public c(h hVar, m mVar) {
            this.a = hVar;
            this.b = mVar;
        }

        @Override // rx.k
        public final boolean isUnsubscribed() {
            return this.a.isUnsubscribed();
        }

        @Override // rx.k
        public final void unsubscribe() {
            if (compareAndSet(false, true)) {
                m mVar = this.b;
                h hVar = this.a;
                if (mVar.b) {
                    return;
                }
                synchronized (mVar) {
                    LinkedList<rx.k> linkedList = mVar.a;
                    if (!mVar.b && linkedList != null) {
                        boolean remove = linkedList.remove(hVar);
                        if (remove) {
                            hVar.unsubscribe();
                        }
                    }
                }
            }
        }
    }
}
