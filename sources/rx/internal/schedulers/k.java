package rx.internal.schedulers;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import rx.g;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class k extends rx.g {
    public static final k b = new k();

    static int a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    @Override // rx.g
    public final g.a a() {
        return new a();
    }

    private k() {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    static class a extends g.a implements rx.k {
        final AtomicInteger a = new AtomicInteger();
        final PriorityBlockingQueue<b> b = new PriorityBlockingQueue<>();
        private final rx.subscriptions.a c = new rx.subscriptions.a();
        private final AtomicInteger d = new AtomicInteger();

        a() {
        }

        private rx.k a(rx.functions.a aVar, long j) {
            if (this.c.isUnsubscribed()) {
                return rx.subscriptions.e.b();
            }
            final b bVar = new b(aVar, Long.valueOf(j), this.a.incrementAndGet());
            this.b.add(bVar);
            if (this.d.getAndIncrement() == 0) {
                do {
                    b poll = this.b.poll();
                    if (poll != null) {
                        poll.a.a();
                    }
                } while (this.d.decrementAndGet() > 0);
                return rx.subscriptions.e.b();
            }
            return rx.subscriptions.e.a(new rx.functions.a() { // from class: rx.internal.schedulers.k.a.1
                @Override // rx.functions.a
                public final void a() {
                    a.this.b.remove(bVar);
                }
            });
        }

        @Override // rx.k
        public final void unsubscribe() {
            this.c.unsubscribe();
        }

        @Override // rx.k
        public final boolean isUnsubscribed() {
            return this.c.isUnsubscribed();
        }

        @Override // rx.g.a
        public final rx.k a(rx.functions.a aVar) {
            return a(aVar, System.currentTimeMillis());
        }

        @Override // rx.g.a
        public final rx.k a(rx.functions.a aVar, long j, TimeUnit timeUnit) {
            long currentTimeMillis = System.currentTimeMillis() + timeUnit.toMillis(j);
            return a(new j(aVar, this, currentTimeMillis), currentTimeMillis);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static final class b implements Comparable<b> {
        final rx.functions.a a;
        final Long b;
        final int c;

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(b bVar) {
            b bVar2 = bVar;
            int compareTo = this.b.compareTo(bVar2.b);
            return compareTo == 0 ? k.a(this.c, bVar2.c) : compareTo;
        }

        b(rx.functions.a aVar, Long l, int i) {
            this.a = aVar;
            this.b = l;
            this.c = i;
        }
    }
}
