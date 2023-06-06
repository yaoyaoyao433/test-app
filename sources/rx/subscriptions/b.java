package rx.subscriptions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class b implements k {
    private Set<k> a;
    private volatile boolean b;

    @Override // rx.k
    public final boolean isUnsubscribed() {
        return this.b;
    }

    public final void a(k kVar) {
        if (kVar.isUnsubscribed()) {
            return;
        }
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    if (this.a == null) {
                        this.a = new HashSet(4);
                    }
                    this.a.add(kVar);
                    return;
                }
            }
        }
        kVar.unsubscribe();
    }

    public final void b(k kVar) {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (!this.b && this.a != null) {
                boolean remove = this.a.remove(kVar);
                if (remove) {
                    kVar.unsubscribe();
                }
            }
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (!this.b && this.a != null) {
                Set<k> set = this.a;
                this.a = null;
                a(set);
            }
        }
    }

    @Override // rx.k
    public final void unsubscribe() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.b = true;
            Set<k> set = this.a;
            this.a = null;
            a(set);
        }
    }

    private static void a(Collection<k> collection) {
        if (collection == null) {
            return;
        }
        ArrayList arrayList = null;
        for (k kVar : collection) {
            try {
                kVar.unsubscribe();
            } catch (Throwable th) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th);
            }
        }
        rx.exceptions.b.a(arrayList);
    }

    public final boolean b() {
        boolean z = false;
        if (this.b) {
            return false;
        }
        synchronized (this) {
            if (!this.b && this.a != null && !this.a.isEmpty()) {
                z = true;
            }
        }
        return z;
    }
}
