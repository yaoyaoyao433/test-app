package rx.internal.util.atomic;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.internal.util.unsafe.Pow2;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class d<T> extends AtomicReferenceArray<T> implements Queue<T> {
    private static final long serialVersionUID = 6210984603741293445L;
    final int a;
    final int b;
    final AtomicLong c;
    final AtomicLong d;

    public d(int i) {
        super(Pow2.roundToPowerOfTwo(i));
        int length = length();
        this.a = length - 1;
        this.b = length - i;
        this.c = new AtomicLong();
        this.d = new AtomicLong();
    }

    @Override // java.util.Queue
    public final boolean offer(T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        long j = this.c.get();
        int i = this.a;
        if (get(((int) (this.b + j)) & i) != null) {
            return false;
        }
        this.c.lazySet(j + 1);
        lazySet(i & ((int) j), t);
        return true;
    }

    @Override // java.util.Queue
    public final T poll() {
        long j = this.d.get();
        int i = ((int) j) & this.a;
        T t = get(i);
        if (t == null) {
            return null;
        }
        this.d.lazySet(j + 1);
        lazySet(i, null);
        return t;
    }

    @Override // java.util.Queue
    public final T peek() {
        return get(((int) this.d.get()) & this.a);
    }

    @Override // java.util.Collection
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.c == this.d;
    }

    @Override // java.util.Collection
    public final int size() {
        long j = this.d.get();
        while (true) {
            long j2 = this.c.get();
            long j3 = this.d.get();
            if (j == j3) {
                return (int) (j2 - j3);
            }
            j = j3;
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final <E> E[] toArray(E[] eArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public final T remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public final T element() {
        throw new UnsupportedOperationException();
    }
}
