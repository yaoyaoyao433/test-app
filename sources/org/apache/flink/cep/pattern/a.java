package org.apache.flink.cep.pattern;

import com.meituan.robust.common.CommonConstant;
import java.util.EnumSet;
import java.util.Objects;
import org.apache.flink.cep.common.c;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class a {
    private final EnumSet<Object> a;
    private final EnumC1540a b;
    private EnumC1540a c;

    /* compiled from: ProGuard */
    /* renamed from: org.apache.flink.cep.pattern.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public enum EnumC1540a {
        STRICT,
        SKIP_TILL_NEXT,
        SKIP_TILL_ANY,
        NOT_FOLLOW,
        NOT_NEXT
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return Objects.equals(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public final String toString() {
        return "Quantifier{properties=" + this.a + ", consumingStrategy=" + this.b + ", innerConsumingStrategy=" + this.c + '}';
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static class b {
        public final int a;
        public final int b;

        public b(int i, int i2) {
            c.a(i > 0, "The from should be a positive number greater than 0.");
            boolean z = i2 >= i;
            c.a(z, "The to should be a number greater than or equal to from: " + i + CommonConstant.Symbol.DOT);
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b));
        }
    }
}
