package rx.internal.util.unsafe;

import rx.internal.util.atomic.b;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public abstract class BaseLinkedQueueProducerNodeRef<E> extends BaseLinkedQueuePad0<E> {
    protected static final long P_NODE_OFFSET = UnsafeAccess.addressOf(BaseLinkedQueueProducerNodeRef.class, "producerNode");
    protected b<E> producerNode;

    /* JADX INFO: Access modifiers changed from: protected */
    public final void spProducerNode(b<E> bVar) {
        this.producerNode = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final b<E> lvProducerNode() {
        return (b) UnsafeAccess.UNSAFE.getObjectVolatile(this, P_NODE_OFFSET);
    }

    protected final b<E> lpProducerNode() {
        return this.producerNode;
    }
}
