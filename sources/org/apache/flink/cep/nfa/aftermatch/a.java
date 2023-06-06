package org.apache.flink.cep.nfa.aftermatch;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.flink.cep.nfa.sharedbuffer.e;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public abstract class a implements Serializable {
    private static final long serialVersionUID = -4048930333619068531L;

    protected abstract org.apache.flink.cep.nfa.sharedbuffer.a a(Collection<Map<String, List<org.apache.flink.cep.nfa.sharedbuffer.a>>> collection);

    protected abstract boolean a(org.apache.flink.cep.nfa.sharedbuffer.a aVar, org.apache.flink.cep.nfa.sharedbuffer.a aVar2);

    public abstract boolean c();

    public static c a() {
        return c.a;
    }

    public static b b() {
        return b.a;
    }

    public final void a(Collection<org.apache.flink.cep.nfa.a> collection, Collection<Map<String, List<org.apache.flink.cep.nfa.sharedbuffer.a>>> collection2, e<?> eVar) throws Exception {
        org.apache.flink.cep.nfa.sharedbuffer.a a = a(collection2);
        if (a != null) {
            ArrayList arrayList = new ArrayList();
            for (org.apache.flink.cep.nfa.a aVar : collection) {
                if (aVar.e != null && a(aVar.e, a)) {
                    eVar.b(aVar.d);
                    arrayList.add(aVar);
                }
            }
            collection.removeAll(arrayList);
        }
    }
}
