package org.apache.flink.cep.nfa.aftermatch;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public abstract class d extends a {
    private static final long serialVersionUID = -3214720554878479037L;

    @Override // org.apache.flink.cep.nfa.aftermatch.a
    public final boolean c() {
        return true;
    }

    @Override // org.apache.flink.cep.nfa.aftermatch.a
    protected final boolean a(org.apache.flink.cep.nfa.sharedbuffer.a aVar, org.apache.flink.cep.nfa.sharedbuffer.a aVar2) {
        return aVar != null && aVar.compareTo(aVar2) <= 0;
    }
}
