package org.apache.flink.cep.nfa.aftermatch;

import java.util.Collection;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class c extends d {
    public static final c a = new c();
    private static final long serialVersionUID = -8450320065949093169L;

    public final String toString() {
        return "SkipPastLastStrategy{}";
    }

    private c() {
    }

    @Override // org.apache.flink.cep.nfa.aftermatch.a
    protected final org.apache.flink.cep.nfa.sharedbuffer.a a(Collection<Map<String, List<org.apache.flink.cep.nfa.sharedbuffer.a>>> collection) {
        org.apache.flink.cep.nfa.sharedbuffer.a aVar = null;
        for (Map<String, List<org.apache.flink.cep.nfa.sharedbuffer.a>> map : collection) {
            for (List<org.apache.flink.cep.nfa.sharedbuffer.a> list : map.values()) {
                org.apache.flink.cep.nfa.sharedbuffer.a aVar2 = list.get(list.size() - 1);
                if (aVar2 != null && (aVar == null || aVar.compareTo(aVar2) < 0)) {
                    aVar = aVar2;
                }
            }
        }
        return aVar;
    }
}
