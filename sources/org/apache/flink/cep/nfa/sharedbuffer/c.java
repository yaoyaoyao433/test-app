package org.apache.flink.cep.nfa.sharedbuffer;

import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class c {
    final String a;
    final a b;

    public c(a aVar, String str) {
        this.b = aVar;
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return Objects.equals(this.b, cVar.b) && Objects.equals(this.a, cVar.a);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a);
    }

    public final String toString() {
        return "NodeId{eventId=" + this.b + ", pageName='" + this.a + "'}";
    }
}
