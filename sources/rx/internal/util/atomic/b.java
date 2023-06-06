package rx.internal.util.atomic;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class b<E> extends AtomicReference<b<E>> {
    private static final long serialVersionUID = 2404266111789071508L;
    public E a;

    public b() {
    }

    public b(E e) {
        this.a = e;
    }

    public final E a() {
        E e = this.a;
        this.a = null;
        return e;
    }
}
