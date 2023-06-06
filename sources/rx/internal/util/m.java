package rx.internal.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class m implements rx.k {
    public LinkedList<rx.k> a;
    public volatile boolean b;

    public m() {
    }

    public m(rx.k... kVarArr) {
        this.a = new LinkedList<>(Arrays.asList(kVarArr));
    }

    public m(rx.k kVar) {
        this.a = new LinkedList<>();
        this.a.add(kVar);
    }

    @Override // rx.k
    public final boolean isUnsubscribed() {
        return this.b;
    }

    public final void a(rx.k kVar) {
        if (kVar.isUnsubscribed()) {
            return;
        }
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    LinkedList<rx.k> linkedList = this.a;
                    if (linkedList == null) {
                        linkedList = new LinkedList<>();
                        this.a = linkedList;
                    }
                    linkedList.add(kVar);
                    return;
                }
            }
        }
        kVar.unsubscribe();
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
            LinkedList<rx.k> linkedList = this.a;
            ArrayList arrayList = null;
            this.a = null;
            if (linkedList != null) {
                for (rx.k kVar : linkedList) {
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
        }
    }
}
