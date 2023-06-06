package rx.internal.util.unsafe;

import rx.internal.util.atomic.b;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class MpscLinkedQueue<E> extends BaseLinkedQueue<E> {
    public MpscLinkedQueue() {
        this.consumerNode = new b<>();
        xchgProducerNode(this.consumerNode);
    }

    protected final b<E> xchgProducerNode(b<E> bVar) {
        b<E> bVar2;
        do {
            bVar2 = this.producerNode;
        } while (!UnsafeAccess.UNSAFE.compareAndSwapObject(this, P_NODE_OFFSET, bVar2, bVar));
        return bVar2;
    }

    @Override // java.util.Queue
    public final boolean offer(E e) {
        if (e == null) {
            throw new NullPointerException("null elements not allowed");
        }
        b<E> bVar = new b<>(e);
        xchgProducerNode(bVar).lazySet(bVar);
        return true;
    }

    @Override // java.util.Queue
    public final E poll() {
        b<E> bVar;
        b<E> lpConsumerNode = lpConsumerNode();
        b<E> bVar2 = lpConsumerNode.get();
        if (bVar2 != null) {
            E a = bVar2.a();
            spConsumerNode(bVar2);
            return a;
        } else if (lpConsumerNode != lvProducerNode()) {
            do {
                bVar = lpConsumerNode.get();
            } while (bVar == null);
            E a2 = bVar.a();
            this.consumerNode = bVar;
            return a2;
        } else {
            return null;
        }
    }

    @Override // java.util.Queue
    public final E peek() {
        b<E> bVar;
        b<E> bVar2 = this.consumerNode;
        b<E> bVar3 = bVar2.get();
        if (bVar3 == null) {
            if (bVar2 != lvProducerNode()) {
                do {
                    bVar = bVar2.get();
                } while (bVar == null);
                return bVar.a;
            }
            return null;
        }
        return bVar3.a;
    }
}
