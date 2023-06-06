package org.apache.flink.cep.nfa.sharedbuffer;

import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class f {
    final c a;
    final org.apache.flink.cep.nfa.b b;

    public f(c cVar, org.apache.flink.cep.nfa.b bVar) {
        this.a = cVar;
        this.b = bVar;
    }

    public final String toString() {
        return "SharedBufferEdge{target=" + this.a + ", deweyNumber=" + this.b + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return Objects.equals(this.a, fVar.a) && Objects.equals(this.b, fVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
