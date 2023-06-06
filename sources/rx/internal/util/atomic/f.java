package rx.internal.util.atomic;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.internal.util.unsafe.Pow2;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class f<T> implements Queue<T> {
    static final int a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final Object j = new Object();
    final AtomicLong b;
    protected int c;
    protected long d;
    protected int e;
    protected AtomicReferenceArray<Object> f;
    protected int g;
    protected AtomicReferenceArray<Object> h;
    final AtomicLong i;

    public f(int i) {
        int roundToPowerOfTwo = Pow2.roundToPowerOfTwo(Math.max(8, i));
        int i2 = roundToPowerOfTwo - 1;
        this.b = new AtomicLong();
        this.i = new AtomicLong();
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(roundToPowerOfTwo + 1);
        this.f = atomicReferenceArray;
        this.e = i2;
        this.c = Math.min(roundToPowerOfTwo / 4, a);
        this.h = atomicReferenceArray;
        this.g = i2;
        this.d = i2 - 1;
        a(0L);
    }

    @Override // java.util.Queue
    public final boolean offer(T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.f;
        long j2 = this.b.get();
        int i = this.e;
        int i2 = ((int) j2) & i;
        if (j2 < this.d) {
            return a(atomicReferenceArray, t, j2, i2);
        }
        long j3 = this.c + j2;
        if (atomicReferenceArray.get(((int) j3) & i) == null) {
            this.d = j3 - 1;
            return a(atomicReferenceArray, t, j2, i2);
        }
        long j4 = j2 + 1;
        if (atomicReferenceArray.get(((int) j4) & i) != null) {
            return a(atomicReferenceArray, t, j2, i2);
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f = atomicReferenceArray2;
        this.d = (j2 + i) - 1;
        a(j4);
        atomicReferenceArray2.lazySet(i2, t);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i2, j);
        return true;
    }

    private boolean a(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j2, int i) {
        a(j2 + 1);
        atomicReferenceArray.lazySet(i, t);
        return true;
    }

    private static AtomicReferenceArray<Object> a(AtomicReferenceArray<Object> atomicReferenceArray) {
        return (AtomicReferenceArray) atomicReferenceArray.get(atomicReferenceArray.length() - 1);
    }

    @Override // java.util.Queue
    public final T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.h;
        long j2 = this.i.get();
        int i = this.g & ((int) j2);
        T t = (T) atomicReferenceArray.get(i);
        boolean z = t == j;
        if (t != null && !z) {
            b(j2 + 1);
            atomicReferenceArray.lazySet(i, null);
            return t;
        } else if (z) {
            AtomicReferenceArray<Object> a2 = a(atomicReferenceArray);
            this.h = a2;
            T t2 = (T) a2.get(i);
            if (t2 == null) {
                return null;
            }
            b(j2 + 1);
            a2.lazySet(i, null);
            return t2;
        } else {
            return null;
        }
    }

    @Override // java.util.Queue
    public final T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.h;
        int i = ((int) this.i.get()) & this.g;
        T t = (T) atomicReferenceArray.get(i);
        if (t == j) {
            AtomicReferenceArray<Object> a2 = a(atomicReferenceArray);
            this.h = a2;
            return (T) a2.get(i);
        }
        return t;
    }

    @Override // java.util.Collection
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    private void a(long j2) {
        this.b.lazySet(j2);
    }

    private void b(long j2) {
        this.i.lazySet(j2);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
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

    @Override // java.util.Collection
    public final int size() {
        long j2 = this.i.get();
        while (true) {
            long j3 = this.b.get();
            long j4 = this.i.get();
            if (j2 == j4) {
                return (int) (j3 - j4);
            }
            j2 = j4;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.b.get() == this.i.get();
    }
}
