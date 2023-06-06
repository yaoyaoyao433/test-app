package org.apache.flink.cep.nfa.sharedbuffer;

import java.util.Comparator;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class a implements Comparable<a> {
    public static final Comparator<a> c = new Comparator<a>() { // from class: org.apache.flink.cep.nfa.sharedbuffer.a.1
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(a aVar, a aVar2) {
            a aVar3 = aVar;
            a aVar4 = aVar2;
            int compare = Long.compare(aVar3 != null ? aVar3.b : Long.MAX_VALUE, aVar4 != null ? aVar4.b : Long.MAX_VALUE);
            if (compare != 0) {
                return compare;
            }
            return Integer.compare(aVar3 != null ? aVar3.a : Integer.MAX_VALUE, aVar4 != null ? aVar4.a : Integer.MAX_VALUE);
        }
    };
    public final int a;
    public final long b;

    public a(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Long.valueOf(this.b));
    }

    public final String toString() {
        return "EventId{id=" + this.a + ", timestamp=" + this.b + '}';
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(a aVar) {
        return c.compare(this, aVar);
    }
}
