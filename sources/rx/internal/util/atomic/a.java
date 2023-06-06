package rx.internal.util.atomic;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.internal.util.unsafe.Pow2;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public abstract class a<E> extends AbstractQueue<E> {
    protected final AtomicReferenceArray<E> a;
    protected final int b;

    public a(int i) {
        int roundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        this.b = roundToPowerOfTwo - 1;
        this.a = new AtomicReferenceArray<>(roundToPowerOfTwo);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int a(long j) {
        return ((int) j) & this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final E a(int i) {
        return this.a.get(i);
    }
}
