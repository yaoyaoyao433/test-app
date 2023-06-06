package rx.internal.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class n<T> implements Queue<T> {
    private final LinkedList<T> a;
    private final int b;

    public n() {
        this.a = new LinkedList<>();
        this.b = -1;
    }

    public n(int i) {
        this.a = new LinkedList<>();
        this.b = i;
    }

    @Override // java.util.Collection
    public final synchronized boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Collection
    public final synchronized boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final synchronized Iterator<T> iterator() {
        return this.a.iterator();
    }

    @Override // java.util.Collection
    public final synchronized int size() {
        return this.a.size();
    }

    @Override // java.util.Queue, java.util.Collection
    public final synchronized boolean add(T t) {
        return this.a.add(t);
    }

    @Override // java.util.Collection
    public final synchronized boolean remove(Object obj) {
        return this.a.remove(obj);
    }

    @Override // java.util.Collection
    public final synchronized boolean containsAll(Collection<?> collection) {
        return this.a.containsAll(collection);
    }

    @Override // java.util.Collection
    public final synchronized boolean addAll(Collection<? extends T> collection) {
        return this.a.addAll(collection);
    }

    @Override // java.util.Collection
    public final synchronized boolean removeAll(Collection<?> collection) {
        return this.a.removeAll(collection);
    }

    @Override // java.util.Collection
    public final synchronized boolean retainAll(Collection<?> collection) {
        return this.a.retainAll(collection);
    }

    @Override // java.util.Collection
    public final synchronized void clear() {
        this.a.clear();
    }

    public final synchronized String toString() {
        return this.a.toString();
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            n nVar = (n) obj;
            if (this.a == null) {
                if (nVar.a != null) {
                    return false;
                }
            } else if (!this.a.equals(nVar.a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Queue
    public final synchronized T peek() {
        return this.a.peek();
    }

    @Override // java.util.Queue
    public final synchronized T element() {
        return this.a.element();
    }

    @Override // java.util.Queue
    public final synchronized T poll() {
        return this.a.poll();
    }

    @Override // java.util.Queue
    public final synchronized T remove() {
        return this.a.remove();
    }

    @Override // java.util.Queue
    public final synchronized boolean offer(T t) {
        if (this.b < 0 || this.a.size() + 1 <= this.b) {
            return this.a.offer(t);
        }
        return false;
    }

    public final synchronized Object clone() {
        n nVar;
        nVar = new n(this.b);
        nVar.addAll(this.a);
        return nVar;
    }

    @Override // java.util.Collection
    public final synchronized Object[] toArray() {
        return this.a.toArray();
    }

    @Override // java.util.Collection
    public final synchronized <R> R[] toArray(R[] rArr) {
        return (R[]) this.a.toArray(rArr);
    }
}
