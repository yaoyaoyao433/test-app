package org.apache.flink.cep.nfa.sharedbuffer;

import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class b<T> {
    public final T a;
    private int b;

    public b(T t, int i) {
        this.b = i;
        this.a = t;
    }

    public final void a() {
        this.b++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        if (this.b <= 0) {
            return true;
        }
        this.b--;
        return this.b == 0;
    }

    public final String toString() {
        return "Lock{refCounter=" + this.b + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.b == bVar.b && Objects.equals(this.a, bVar.a);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), this.a);
    }
}
