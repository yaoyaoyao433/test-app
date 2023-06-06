package org.apache.flink.cep.nfa.aftermatch;

import java.util.Collection;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class b extends a {
    static final b a = new b();
    private static final long serialVersionUID = -5843740153729531775L;

    @Override // org.apache.flink.cep.nfa.aftermatch.a
    public final boolean c() {
        return false;
    }

    public final String toString() {
        return "NoSkipStrategy{}";
    }

    private b() {
    }

    @Override // org.apache.flink.cep.nfa.aftermatch.a
    protected final boolean a(org.apache.flink.cep.nfa.sharedbuffer.a aVar, org.apache.flink.cep.nfa.sharedbuffer.a aVar2) {
        throw new IllegalStateException("This should never happen. Please file a bug.");
    }

    @Override // org.apache.flink.cep.nfa.aftermatch.a
    protected final org.apache.flink.cep.nfa.sharedbuffer.a a(Collection<Map<String, List<org.apache.flink.cep.nfa.sharedbuffer.a>>> collection) {
        throw new IllegalStateException("This should never happen. Please file a bug.");
    }
}
