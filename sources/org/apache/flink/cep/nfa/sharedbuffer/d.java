package org.apache.flink.cep.nfa.sharedbuffer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class d<V> {
    org.apache.flink.cep.common.collections.b<a, b<V>> c = new org.apache.flink.cep.common.collections.b<>();
    org.apache.flink.cep.common.collections.b<c, b<g>> d = new org.apache.flink.cep.common.collections.b<>();
    Map<a, b<V>> a = new HashMap();
    Map<c, b<g>> b = new HashMap();
    private Map<Long, Integer> e = new HashMap();

    public final e<V> a() {
        return new e<>(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(long j) throws Exception {
        Iterator<Long> it = this.e.keySet().iterator();
        while (it.hasNext()) {
            if (it.next().longValue() < j) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final a a(V v, long j) throws Exception {
        Integer num = this.e.get(Long.valueOf(j));
        if (num == null) {
            num = 0;
        }
        a aVar = new a(num.intValue(), j);
        b<V> bVar = new b<>(v, 1);
        this.e.put(Long.valueOf(j), Integer.valueOf(num.intValue() + 1));
        this.c.put(aVar, bVar);
        return aVar;
    }

    public final void a(a aVar, b<V> bVar) {
        this.c.put(aVar, bVar);
    }

    public final void a(c cVar, b<g> bVar) {
        this.d.put(cVar, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(a aVar) throws Exception {
        this.c.remove(aVar);
        this.a.remove(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(c cVar) throws Exception {
        this.d.remove(cVar);
        this.b.remove(cVar);
    }

    public final b<g> b(c cVar) {
        return this.d.a(cVar, new org.apache.flink.cep.common.collections.a<c, b<g>>() { // from class: org.apache.flink.cep.nfa.sharedbuffer.d.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // org.apache.flink.cep.common.collections.a
            public b<g> a(c cVar2) {
                try {
                    return d.this.b.get(cVar2);
                } catch (Exception e) {
                    throw new org.apache.flink.cep.common.exception.b(e);
                }
            }
        });
    }

    public final b<V> b(a aVar) {
        return this.c.a(aVar, new org.apache.flink.cep.common.collections.a<a, b<V>>() { // from class: org.apache.flink.cep.nfa.sharedbuffer.d.2
            /* JADX INFO: Access modifiers changed from: private */
            @Override // org.apache.flink.cep.common.collections.a
            public b<V> a(a aVar2) {
                try {
                    return d.this.a.get(aVar2);
                } catch (Exception e) {
                    throw new org.apache.flink.cep.common.exception.b(e);
                }
            }
        });
    }
}
