package rx.internal.util.unsafe;

import rx.internal.util.atomic.b;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public abstract class BaseLinkedQueueConsumerNodeRef<E> extends BaseLinkedQueuePad1<E> {
    protected static final long C_NODE_OFFSET = UnsafeAccess.addressOf(BaseLinkedQueueConsumerNodeRef.class, "consumerNode");
    protected b<E> consumerNode;

    /* JADX INFO: Access modifiers changed from: protected */
    public final void spConsumerNode(b<E> bVar) {
        this.consumerNode = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final b<E> lvConsumerNode() {
        return (b) UnsafeAccess.UNSAFE.getObjectVolatile(this, C_NODE_OFFSET);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final b<E> lpConsumerNode() {
        return this.consumerNode;
    }
}
