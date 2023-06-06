package rx.internal.util.unsafe;

import rx.internal.util.atomic.b;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class SpscLinkedQueue<E> extends BaseLinkedQueue<E> {
    public SpscLinkedQueue() {
        spProducerNode(new b<>());
        spConsumerNode(this.producerNode);
        this.consumerNode.lazySet(null);
    }

    @Override // java.util.Queue
    public final boolean offer(E e) {
        if (e == null) {
            throw new NullPointerException("null elements not allowed");
        }
        b<E> bVar = new b<>(e);
        this.producerNode.lazySet(bVar);
        this.producerNode = bVar;
        return true;
    }

    @Override // java.util.Queue
    public final E poll() {
        b<E> bVar = this.consumerNode.get();
        if (bVar != null) {
            E a = bVar.a();
            this.consumerNode = bVar;
            return a;
        }
        return null;
    }

    @Override // java.util.Queue
    public final E peek() {
        b<E> bVar = this.consumerNode.get();
        if (bVar != null) {
            return bVar.a;
        }
        return null;
    }
}
