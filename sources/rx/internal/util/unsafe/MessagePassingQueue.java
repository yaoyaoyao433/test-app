package rx.internal.util.unsafe;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public interface MessagePassingQueue<M> {
    boolean isEmpty();

    boolean offer(M m);

    M peek();

    M poll();

    int size();
}
