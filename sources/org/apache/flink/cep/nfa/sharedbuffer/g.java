package org.apache.flink.cep.nfa.sharedbuffer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class g {
    public final List<f> a = new ArrayList();

    public final String toString() {
        return "SharedBufferNode{edges=" + this.a + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((g) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
