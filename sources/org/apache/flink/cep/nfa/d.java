package org.apache.flink.cep.nfa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class d<T> implements Serializable {
    private static final long serialVersionUID = 6658700025989097781L;
    public final String a;
    public a b;
    public final Collection<e<T>> c = new ArrayList();
    public long d;

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public enum a {
        Start,
        Final,
        Normal,
        Stop,
        Waiting
    }

    public d(String str, a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean a() {
        return this.b == a.Final;
    }

    public final boolean b() {
        return this.b == a.Start;
    }

    public final boolean c() {
        return this.b == a.Waiting;
    }

    private void a(f fVar, d<T> dVar, org.apache.flink.cep.pattern.conditions.b<T> bVar) {
        this.c.add(new e<>(this, fVar, dVar, bVar));
    }

    public final void a(org.apache.flink.cep.pattern.conditions.b<T> bVar) {
        a(f.IGNORE, this, bVar);
    }

    public final void a(d<T> dVar, org.apache.flink.cep.pattern.conditions.b<T> bVar) {
        a(f.IGNORE, dVar, bVar);
    }

    public final void b(d<T> dVar, org.apache.flink.cep.pattern.conditions.b<T> bVar) {
        a(f.TAKE, dVar, bVar);
    }

    public final void c(d<T> dVar, org.apache.flink.cep.pattern.conditions.b<T> bVar) {
        a(f.PROCEED, dVar, bVar);
    }

    public final void b(org.apache.flink.cep.pattern.conditions.b<T> bVar) {
        a(f.TAKE, this, bVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && this.b == dVar.b && this.c.equals(dVar.c);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append(" State ");
        sb.append(this.a);
        sb.append(" [\n");
        for (e<T> eVar : this.c) {
            sb.append("\t");
            sb.append(eVar);
            sb.append(",\n");
        }
        sb.append("])");
        return sb.toString();
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
