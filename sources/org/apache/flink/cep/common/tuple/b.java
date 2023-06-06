package org.apache.flink.cep.common.tuple;

import com.meituan.robust.common.CommonConstant;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class b<T0, T1> extends a {
    private static final long serialVersionUID = 1;
    public T0 a;
    public T1 b;

    public b() {
    }

    private b(T0 t0, T1 t1) {
        this.a = t0;
        this.b = t1;
    }

    public String toString() {
        return CommonConstant.Symbol.BRACKET_LEFT + org.apache.flink.cep.common.util.a.a(this.a) + CommonConstant.Symbol.COMMA + org.apache.flink.cep.common.util.a.a(this.b) + CommonConstant.Symbol.BRACKET_RIGHT;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.a == null ? bVar.a == null : this.a.equals(bVar.a)) {
                return this.b == null ? bVar.b == null : this.b.equals(bVar.b);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a != null ? this.a.hashCode() : 0) * 31) + (this.b != null ? this.b.hashCode() : 0);
    }

    public static <T0, T1> b<T0, T1> a(T0 t0, T1 t1) {
        return new b<>(t0, t1);
    }
}
