package org.apache.flink.cep.nfa;

import android.support.annotation.Nullable;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class a {
    public final String a;
    public final b b;
    public final long c;
    @Nullable
    public final org.apache.flink.cep.nfa.sharedbuffer.c d;
    @Nullable
    public final org.apache.flink.cep.nfa.sharedbuffer.a e;

    private a(String str, @Nullable org.apache.flink.cep.nfa.sharedbuffer.c cVar, b bVar, @Nullable org.apache.flink.cep.nfa.sharedbuffer.a aVar, long j) {
        this.a = str;
        this.b = bVar;
        this.c = j;
        this.d = cVar;
        this.e = aVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return Objects.equals(this.a, aVar.a) && Objects.equals(this.b, aVar.b) && this.c == aVar.c && Objects.equals(this.e, aVar.e) && Objects.equals(this.d, aVar.d);
        }
        return false;
    }

    public final String toString() {
        return "ComputationState{currentStateName='" + this.a + "', version=" + this.b + ", startTimestamp=" + this.c + ", previousBufferEntry=" + this.d + ", startEventID=" + this.e + '}';
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Long.valueOf(this.c), this.e, this.d);
    }

    public static a a(String str, b bVar) {
        return a(str, null, bVar, -1L, null);
    }

    public static a a(String str, org.apache.flink.cep.nfa.sharedbuffer.c cVar, b bVar, long j, org.apache.flink.cep.nfa.sharedbuffer.a aVar) {
        return new a(str, cVar, bVar, aVar, j);
    }
}
