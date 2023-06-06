package rx.internal.util.atomic;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class c<E> extends a<E> {
    private static final Integer g = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    final AtomicLong c;
    protected long d;
    final AtomicLong e;
    final int f;

    @Override // rx.internal.util.atomic.a, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // rx.internal.util.atomic.a, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    public c(int i) {
        super(i);
        this.c = new AtomicLong();
        this.e = new AtomicLong();
        this.f = Math.min(i / 4, g.intValue());
    }

    @Override // java.util.Queue
    public final boolean offer(E e) {
        if (e == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<E> atomicReferenceArray = this.a;
        int i = this.b;
        long j = this.c.get();
        int i2 = ((int) j) & i;
        if (j >= this.d) {
            long j2 = this.f + j;
            if (atomicReferenceArray.get(i & ((int) j2)) == null) {
                this.d = j2;
            } else if (atomicReferenceArray.get(i2) != null) {
                return false;
            }
        }
        atomicReferenceArray.lazySet(i2, e);
        this.c.lazySet(j + 1);
        return true;
    }

    @Override // java.util.Queue
    public final E poll() {
        long j = this.e.get();
        int a = a(j);
        AtomicReferenceArray<E> atomicReferenceArray = this.a;
        E e = atomicReferenceArray.get(a);
        if (e == null) {
            return null;
        }
        atomicReferenceArray.lazySet(a, null);
        this.e.lazySet(j + 1);
        return e;
    }

    @Override // java.util.Queue
    public final E peek() {
        return a(a(this.e.get()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        long j = this.e.get();
        while (true) {
            long j2 = this.c.get();
            long j3 = this.e.get();
            if (j == j3) {
                return (int) (j2 - j3);
            }
            j = j3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.c.get() == this.e.get();
    }
}
