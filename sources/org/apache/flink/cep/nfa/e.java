package org.apache.flink.cep.nfa;

import com.meituan.robust.common.CommonConstant;
import java.io.Serializable;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class e<T> implements Serializable {
    private static final long serialVersionUID = -4825345749997891838L;
    public final f a;
    public final d<T> b;
    public final d<T> c;
    public org.apache.flink.cep.pattern.conditions.b<T> d;

    public e(d<T> dVar, f fVar, d<T> dVar2, org.apache.flink.cep.pattern.conditions.b<T> bVar) {
        this.a = fVar;
        this.c = dVar2;
        this.b = dVar;
        this.d = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.a == eVar.a && this.b.a.equals(eVar.b.a) && this.c.a.equals(eVar.c.a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.c.a, this.b.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StateTransition(");
        sb.append(this.a);
        sb.append(", from ");
        sb.append(this.b.a);
        sb.append(" to ");
        sb.append(this.c.a);
        sb.append(this.d != null ? ", with condition)" : CommonConstant.Symbol.BRACKET_RIGHT);
        return sb.toString();
    }
}
