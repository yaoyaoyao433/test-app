package rx.internal.util;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public enum d {
    ;
    
    private static final Throwable a = new Throwable("Terminated");

    public static boolean a(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        Throwable aVar;
        do {
            th2 = atomicReference.get();
            if (th2 == a) {
                return false;
            }
            if (th2 == null) {
                aVar = th;
            } else if (th2 instanceof rx.exceptions.a) {
                ArrayList arrayList = new ArrayList(((rx.exceptions.a) th2).a);
                arrayList.add(th);
                aVar = new rx.exceptions.a(arrayList);
            } else {
                aVar = new rx.exceptions.a(th2, th);
            }
        } while (!atomicReference.compareAndSet(th2, aVar));
        return true;
    }

    public static Throwable a(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        return th != a ? atomicReference.getAndSet(a) : th;
    }

    public static boolean a(Throwable th) {
        return th == a;
    }
}
