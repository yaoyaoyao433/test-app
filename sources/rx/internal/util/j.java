package rx.internal.util;

import java.util.Queue;
import rx.internal.util.unsafe.SpmcArrayQueue;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class j implements rx.k {
    static int b;
    public static final int c;
    public static f<Queue<Object>> d;
    public static f<Queue<Object>> e;
    private static final rx.internal.operators.c<Object> f = rx.internal.operators.c.a();
    public volatile Object a;
    private Queue<Object> g;
    private final int h;
    private final f<Queue<Object>> i;

    public static j a() {
        if (UnsafeAccess.isUnsafeAvailable()) {
            return new j(d, c);
        }
        return new j();
    }

    public static j b() {
        if (UnsafeAccess.isUnsafeAvailable()) {
            return new j(e, c);
        }
        return new j();
    }

    static {
        b = 128;
        if (h.a()) {
            b = 16;
        }
        String property = System.getProperty("rx.ring-buffer.size");
        if (property != null) {
            try {
                b = Integer.parseInt(property);
            } catch (Exception e2) {
                System.err.println("Failed to set 'rx.buffer.size' with value " + property + " => " + e2.getMessage());
            }
        }
        c = b;
        d = new f<Queue<Object>>() { // from class: rx.internal.util.j.1
            @Override // rx.internal.util.f
            protected final /* synthetic */ Queue<Object> b() {
                return new SpscArrayQueue(j.c);
            }
        };
        e = new f<Queue<Object>>() { // from class: rx.internal.util.j.2
            @Override // rx.internal.util.f
            protected final /* synthetic */ Queue<Object> b() {
                return new SpmcArrayQueue(j.c);
            }
        };
    }

    private j(Queue<Object> queue, int i) {
        this.g = queue;
        this.i = null;
        this.h = i;
    }

    private j(f<Queue<Object>> fVar, int i) {
        this.i = fVar;
        this.g = fVar.a();
        this.h = i;
    }

    public final synchronized void c() {
        Queue<Object> queue = this.g;
        f<Queue<Object>> fVar = this.i;
        if (fVar != null && queue != null) {
            queue.clear();
            this.g = null;
            if (queue != null) {
                fVar.a.offer(queue);
            }
        }
    }

    @Override // rx.k
    public final void unsubscribe() {
        c();
    }

    j() {
        this(new n(c), c);
    }

    public final void a(Object obj) throws rx.exceptions.c {
        boolean z;
        boolean z2;
        synchronized (this) {
            Queue<Object> queue = this.g;
            z = true;
            if (queue != null) {
                z2 = !queue.offer(rx.internal.operators.c.a(obj));
                z = false;
            } else {
                z2 = false;
            }
        }
        if (z) {
            throw new IllegalStateException("This instance has been unsubscribed and the queue is no longer usable.");
        }
        if (z2) {
            throw new rx.exceptions.c();
        }
    }

    public final boolean d() {
        Queue<Object> queue = this.g;
        if (queue == null) {
            return true;
        }
        return queue.isEmpty();
    }

    public final Object e() {
        synchronized (this) {
            Queue<Object> queue = this.g;
            if (queue == null) {
                return null;
            }
            Object poll = queue.poll();
            Object obj = this.a;
            if (poll == null && obj != null && queue.peek() == null) {
                this.a = null;
                poll = obj;
            }
            return poll;
        }
    }

    public final Object f() {
        synchronized (this) {
            Queue<Object> queue = this.g;
            if (queue == null) {
                return null;
            }
            Object peek = queue.peek();
            Object obj = this.a;
            if (peek == null && obj != null && queue.peek() == null) {
                peek = obj;
            }
            return peek;
        }
    }

    public static boolean b(Object obj) {
        return rx.internal.operators.c.b(obj);
    }

    public static Object c(Object obj) {
        return rx.internal.operators.c.c(obj);
    }

    @Override // rx.k
    public final boolean isUnsubscribed() {
        return this.g == null;
    }
}
