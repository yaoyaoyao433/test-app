package org.apache.flink.cep.nfa.sharedbuffer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class e<V> implements AutoCloseable {
    public d<V> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(d<V> dVar) {
        this.a = dVar;
    }

    public final void a(long j) throws Exception {
        this.a.a(j);
    }

    public final org.apache.flink.cep.nfa.sharedbuffer.a a(V v, long j) throws Exception {
        return this.a.a((d<V>) v, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Stack] */
    public final List<Map<String, List<org.apache.flink.cep.nfa.sharedbuffer.a>>> a(c cVar, org.apache.flink.cep.nfa.b bVar) {
        Stack<org.apache.flink.cep.common.tuple.b<c, g>> stack;
        ArrayList arrayList = new ArrayList();
        Stack stack2 = new Stack();
        b<g> b = this.a.b(cVar);
        if (b != null) {
            stack2.add(new a(org.apache.flink.cep.common.tuple.b.a(cVar, b.a), bVar, new Stack()));
            while (!stack2.isEmpty()) {
                a aVar = (a) stack2.pop();
                Stack<org.apache.flink.cep.common.tuple.b<c, g>> stack3 = aVar.c;
                org.apache.flink.cep.common.tuple.b<c, g> bVar2 = aVar.a;
                if (bVar2 == null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    while (!stack3.isEmpty()) {
                        c cVar2 = stack3.pop().a;
                        String str = cVar2.a;
                        List list = (List) linkedHashMap.get(str);
                        if (list == null) {
                            list = new ArrayList();
                            linkedHashMap.put(str, list);
                        }
                        list.add(cVar2.b);
                    }
                    arrayList.add(linkedHashMap);
                } else {
                    stack3.push(bVar2);
                    boolean z = true;
                    for (f fVar : bVar2.b.a) {
                        if (aVar.b.a(fVar.b)) {
                            c cVar3 = fVar.a;
                            if (z) {
                                z = false;
                                stack = stack3;
                            } else {
                                stack = new Stack<>();
                                stack.addAll(stack3);
                            }
                            stack2.push(new a(cVar3 != null ? org.apache.flink.cep.common.tuple.b.a(cVar3, this.a.b(cVar3).a) : null, fVar.b, stack));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final Map<String, List<V>> a(Map<String, List<org.apache.flink.cep.nfa.sharedbuffer.a>> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map.size());
        for (Map.Entry<String, List<org.apache.flink.cep.nfa.sharedbuffer.a>> entry : map.entrySet()) {
            ArrayList arrayList = new ArrayList(entry.getValue().size());
            for (org.apache.flink.cep.nfa.sharedbuffer.a aVar : entry.getValue()) {
                try {
                    arrayList.add(this.a.b(aVar).a);
                } catch (Exception e) {
                    throw new org.apache.flink.cep.common.exception.b(e);
                }
            }
            linkedHashMap.put(entry.getKey(), arrayList);
        }
        return linkedHashMap;
    }

    public final void a(c cVar) {
        b<g> b = this.a.b(cVar);
        if (b != null) {
            b.a();
            this.a.a(cVar, b);
        }
    }

    public final void b(c cVar) throws Exception {
        c cVar2;
        b<g> b;
        Stack stack = new Stack();
        stack.push(cVar);
        while (!stack.isEmpty() && (b = this.a.b((cVar2 = (c) stack.pop()))) != null) {
            if (b.b()) {
                this.a.a(cVar2);
                a(cVar2.b);
                for (f fVar : b.a.a) {
                    c cVar3 = fVar.a;
                    if (cVar3 != null) {
                        stack.push(cVar3);
                    }
                }
            } else {
                this.a.a(cVar2, b);
            }
        }
    }

    public final void a(org.apache.flink.cep.nfa.sharedbuffer.a aVar) throws Exception {
        b<V> b = this.a.b(aVar);
        if (b != null) {
            if (b.b()) {
                this.a.a(aVar);
            } else {
                this.a.a(aVar, b);
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        d<V> dVar = this.a;
        if (!dVar.d.isEmpty()) {
            dVar.b.putAll(dVar.d);
            dVar.d.clear();
        }
        if (dVar.c.isEmpty()) {
            return;
        }
        dVar.a.putAll(dVar.c);
        dVar.c.clear();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static class a {
        final org.apache.flink.cep.common.tuple.b<c, g> a;
        final org.apache.flink.cep.nfa.b b;
        final Stack<org.apache.flink.cep.common.tuple.b<c, g>> c;

        a(org.apache.flink.cep.common.tuple.b<c, g> bVar, org.apache.flink.cep.nfa.b bVar2, Stack<org.apache.flink.cep.common.tuple.b<c, g>> stack) {
            this.a = bVar;
            this.b = bVar2;
            this.c = stack;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ExtractionState(");
            sb.append(this.a);
            sb.append(", ");
            sb.append(this.b);
            sb.append(", [");
            Stack<org.apache.flink.cep.common.tuple.b<c, g>> stack = this.c;
            sb.append(stack == null ? null : h.a(stack.iterator(), ", "));
            sb.append("])");
            return sb.toString();
        }
    }
}
