package org.apache.flink.cep.nfa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class c {
    public static final Comparator<a> d = new Comparator<a>() { // from class: org.apache.flink.cep.nfa.c.1
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(a aVar, a aVar2) {
            a aVar3 = aVar;
            a aVar4 = aVar2;
            int compare = Long.compare(aVar3.e != null ? aVar3.e.b : Long.MAX_VALUE, aVar4.e != null ? aVar4.e.b : Long.MAX_VALUE);
            if (compare != 0) {
                return compare;
            }
            return Integer.compare(aVar3.e != null ? aVar3.e.a : Integer.MAX_VALUE, aVar4.e != null ? aVar4.e.a : Integer.MAX_VALUE);
        }
    };
    public Queue<a> a = new PriorityQueue(11, d);
    public Queue<a> b;
    public boolean c;

    public c(Iterable<a> iterable) {
        for (a aVar : iterable) {
            this.a.add(aVar);
        }
        this.b = new PriorityQueue(11, d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.a.toArray(), cVar.a.toArray()) && Arrays.equals(this.b.toArray(), cVar.b.toArray());
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return "NFAState{partialMatches=" + this.a + ", completedMatches=" + this.b + ", stateChanged=" + this.c + '}';
    }
}
