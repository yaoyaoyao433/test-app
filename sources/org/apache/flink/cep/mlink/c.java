package org.apache.flink.cep.mlink;

import com.meituan.robust.common.CommonConstant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.concurrent.ScheduledExecutorService;
import org.apache.flink.cep.mlink.bean.BaseEvent;
import org.apache.flink.cep.mlink.bean.StreamData;
import org.apache.flink.cep.nfa.sharedbuffer.f;
import org.apache.flink.cep.nfa.sharedbuffer.g;
import org.apache.flink.cep.pattern.conditions.b;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class c<T extends BaseEvent> {
    org.apache.flink.cep.mlink.a a;
    boolean b;
    ScheduledExecutorService c = com.sankuai.android.jarvis.c.c("NFATimerThread");
    private final Map<String, org.apache.flink.cep.nfa.d<T>> d;
    private final long e;
    private final boolean f;

    public c(org.apache.flink.cep.mlink.a aVar, Collection<org.apache.flink.cep.nfa.d<T>> collection, long j, boolean z) {
        this.e = j;
        this.f = z;
        this.d = a(collection);
        this.a = aVar;
    }

    private static Map<String, org.apache.flink.cep.nfa.d<T>> a(Collection<org.apache.flink.cep.nfa.d<T>> collection) {
        HashMap hashMap = new HashMap(4);
        for (org.apache.flink.cep.nfa.d<T> dVar : collection) {
            hashMap.put(dVar.a, dVar);
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public final org.apache.flink.cep.nfa.c a() {
        LinkedList linkedList = new LinkedList();
        for (org.apache.flink.cep.nfa.d<T> dVar : this.d.values()) {
            if (dVar.b()) {
                linkedList.add(org.apache.flink.cep.nfa.a.a(dVar.a, new org.apache.flink.cep.nfa.b(1)));
            }
        }
        return new org.apache.flink.cep.nfa.c(linkedList);
    }

    private org.apache.flink.cep.nfa.d<T> a(org.apache.flink.cep.nfa.a aVar) {
        return this.d.get(aVar.a);
    }

    private boolean b(org.apache.flink.cep.nfa.a aVar) {
        org.apache.flink.cep.nfa.d<T> a2 = a(aVar);
        if (a2 == null) {
            throw new org.apache.flink.cep.common.b("State " + aVar.a + " does not exist in the NFA. NFA has states " + this.d.values());
        }
        return a2.b();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final java.util.Collection<java.util.Map<java.lang.String, java.util.List<T>>> a(org.apache.flink.cep.nfa.sharedbuffer.e<T> r23, org.apache.flink.cep.nfa.c r24, T r25, long r26, org.apache.flink.cep.nfa.aftermatch.a r28, org.apache.flink.cep.time.a r29) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.flink.cep.mlink.c.a(org.apache.flink.cep.nfa.sharedbuffer.e, org.apache.flink.cep.nfa.c, org.apache.flink.cep.mlink.bean.BaseEvent, long, org.apache.flink.cep.nfa.aftermatch.a, org.apache.flink.cep.time.a):java.util.Collection");
    }

    public final Collection<org.apache.flink.cep.common.tuple.b<Map<String, List<T>>, Long>> a(org.apache.flink.cep.nfa.sharedbuffer.e<T> eVar, org.apache.flink.cep.nfa.c cVar, long j) throws Exception {
        ArrayList arrayList = new ArrayList();
        PriorityQueue priorityQueue = new PriorityQueue(11, org.apache.flink.cep.nfa.c.d);
        for (org.apache.flink.cep.nfa.a aVar : cVar.a) {
            if (a(aVar, j)) {
                if (this.f) {
                    arrayList.add(org.apache.flink.cep.common.tuple.b.a(eVar.a(a(eVar, aVar)), Long.valueOf(aVar.c + this.e)));
                }
                eVar.b(aVar.d);
                cVar.c = true;
            } else {
                priorityQueue.add(aVar);
            }
        }
        cVar.a = priorityQueue;
        eVar.a(j);
        return arrayList;
    }

    private boolean a(org.apache.flink.cep.nfa.a aVar, long j) {
        return !b(aVar) && this.e > 0 && j - aVar.c >= this.e;
    }

    /* compiled from: ProGuard */
    /* renamed from: org.apache.flink.cep.mlink.c$c  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static class C1536c<T> {
        final org.apache.flink.cep.nfa.d<T> b;
        List<org.apache.flink.cep.nfa.e<T>> a = new ArrayList();
        int c = 0;
        int d = 0;

        C1536c(org.apache.flink.cep.nfa.d<T> dVar) {
            this.b = dVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public class b implements AutoCloseable {
        final T a;
        long b;
        private final org.apache.flink.cep.nfa.sharedbuffer.e<T> d;
        private org.apache.flink.cep.nfa.sharedbuffer.a e;

        b(T t, long j, org.apache.flink.cep.nfa.sharedbuffer.e<T> eVar) {
            this.a = t;
            this.b = j;
            this.d = eVar;
        }

        final org.apache.flink.cep.nfa.sharedbuffer.a a() throws Exception {
            if (this.e == null) {
                this.e = this.d.a((org.apache.flink.cep.nfa.sharedbuffer.e<T>) this.a, this.b);
            }
            return this.e;
        }

        @Override // java.lang.AutoCloseable
        public final void close() throws Exception {
            if (this.e != null) {
                this.d.a(this.e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Collection<org.apache.flink.cep.nfa.a> a(org.apache.flink.cep.nfa.sharedbuffer.e<T> eVar, org.apache.flink.cep.nfa.a aVar, c<T>.b bVar, org.apache.flink.cep.time.a aVar2) throws Exception {
        ArrayList arrayList;
        Iterator it;
        int i;
        a aVar3;
        long j;
        org.apache.flink.cep.nfa.sharedbuffer.a aVar4;
        ArrayList arrayList2;
        a aVar5;
        C1536c c1536c;
        int i2;
        org.apache.flink.cep.nfa.a aVar6;
        c<T>.b bVar2;
        org.apache.flink.cep.nfa.sharedbuffer.b<g> bVar3;
        int i3;
        boolean z;
        C1536c c1536c2;
        C1536c c1536c3;
        int i4;
        org.apache.flink.cep.nfa.b a2;
        org.apache.flink.cep.nfa.sharedbuffer.e<T> eVar2 = eVar;
        org.apache.flink.cep.nfa.a aVar7 = aVar;
        c<T>.b bVar4 = bVar;
        a aVar8 = new a(eVar, aVar, aVar2, bVar4.b);
        C1536c a3 = a(aVar8, aVar7, (org.apache.flink.cep.nfa.a) bVar4.a);
        List<org.apache.flink.cep.nfa.e<T>> list = a3.a;
        int max = Math.max(0, a3.c - 1);
        int i5 = a3.d;
        int max2 = Math.max(0, a3.c - 1);
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            org.apache.flink.cep.nfa.e eVar3 = (org.apache.flink.cep.nfa.e) it2.next();
            switch (eVar3.a) {
                case IGNORE:
                    c1536c = a3;
                    it = it2;
                    i = i5;
                    i2 = max2;
                    arrayList2 = arrayList3;
                    aVar5 = aVar8;
                    aVar6 = aVar7;
                    bVar2 = bVar4;
                    if (b(aVar6)) {
                        c1536c2 = c1536c;
                        break;
                    } else {
                        if (a(eVar3.c, a(aVar6))) {
                            c1536c3 = c1536c;
                            a2 = aVar6.b.a(a(c1536c3.d, c1536c3.c));
                            i4 = i;
                        } else {
                            c1536c3 = c1536c;
                            i4 = i - 1;
                            a2 = aVar6.b.a(i2 + i).a();
                        }
                        a(eVar, arrayList2, eVar3.c, aVar6.d, a2, aVar6.c, aVar6.e);
                        bVar4 = bVar2;
                        a3 = c1536c3;
                        aVar8 = aVar5;
                        aVar7 = aVar6;
                        it2 = it;
                        arrayList3 = arrayList2;
                        max2 = i2;
                        eVar2 = eVar;
                        i5 = i4;
                        continue;
                    }
                case TAKE:
                    org.apache.flink.cep.nfa.d<T> dVar = eVar3.c;
                    org.apache.flink.cep.nfa.d<T> dVar2 = eVar3.b;
                    org.apache.flink.cep.nfa.sharedbuffer.c cVar = aVar7.d;
                    org.apache.flink.cep.nfa.b a4 = aVar7.b.a(max);
                    org.apache.flink.cep.nfa.b a5 = new org.apache.flink.cep.nfa.b(a4).a();
                    int i6 = max - 1;
                    String str = dVar2.a;
                    it = it2;
                    org.apache.flink.cep.nfa.sharedbuffer.a a6 = bVar.a();
                    if (cVar != null) {
                        eVar2.a(cVar);
                    }
                    org.apache.flink.cep.common.c.a(str);
                    org.apache.flink.cep.nfa.sharedbuffer.c cVar2 = new org.apache.flink.cep.nfa.sharedbuffer.c(a6, str.split(CommonConstant.Symbol.COLON)[0]);
                    org.apache.flink.cep.nfa.sharedbuffer.b<g> b2 = eVar2.a.b(cVar2);
                    if (b2 == null) {
                        aVar3 = aVar8;
                        org.apache.flink.cep.nfa.sharedbuffer.b<g> bVar5 = new org.apache.flink.cep.nfa.sharedbuffer.b<>(new g(), 0);
                        org.apache.flink.cep.nfa.sharedbuffer.b<T> b3 = eVar2.a.b(a6);
                        if (b3 != null) {
                            i = i5;
                            bVar3 = bVar5;
                            i3 = 1;
                            z = true;
                        } else {
                            i = i5;
                            bVar3 = bVar5;
                            i3 = 1;
                            z = false;
                        }
                        Object[] objArr = new Object[i3];
                        objArr[0] = a6;
                        if (z) {
                            b3.a();
                            eVar2.a.a(a6, b3);
                            b2 = bVar3;
                        } else {
                            throw new IllegalStateException(org.apache.flink.cep.common.c.a("Referring to non existent event with id %s", objArr));
                        }
                    } else {
                        i = i5;
                        aVar3 = aVar8;
                    }
                    b2.a.a.add(new f(cVar, a4));
                    eVar2.a.a(cVar2, b2);
                    if (b(aVar7)) {
                        j = bVar4.b;
                        aVar4 = bVar.a();
                    } else {
                        j = aVar7.c;
                        aVar4 = aVar7.e;
                    }
                    long j2 = j;
                    arrayList2 = arrayList3;
                    aVar5 = aVar3;
                    c1536c = a3;
                    i2 = max2;
                    aVar6 = aVar7;
                    bVar2 = bVar4;
                    a(eVar, arrayList3, dVar, cVar2, a5, j2, aVar4);
                    org.apache.flink.cep.nfa.d a7 = a(aVar5, (org.apache.flink.cep.nfa.d<org.apache.flink.cep.nfa.d<T>>) dVar, (org.apache.flink.cep.nfa.d<T>) bVar2.a);
                    if (a7 != null) {
                        a(eVar, arrayList2, a7, cVar2, a5, j2, aVar4);
                    }
                    max = i6;
                    c1536c2 = c1536c;
                    break;
                default:
                    it = it2;
                    i = i5;
                    i2 = max2;
                    arrayList2 = arrayList3;
                    aVar5 = aVar8;
                    aVar6 = aVar7;
                    c1536c2 = a3;
                    bVar2 = bVar4;
                    break;
            }
            bVar4 = bVar2;
            a3 = c1536c2;
            aVar8 = aVar5;
            aVar7 = aVar6;
            it2 = it;
            i5 = i;
            arrayList3 = arrayList2;
            max2 = i2;
            eVar2 = eVar;
        }
        C1536c c1536c4 = a3;
        ArrayList arrayList4 = arrayList3;
        org.apache.flink.cep.nfa.a aVar9 = aVar7;
        if (b(aVar9)) {
            arrayList = arrayList4;
            arrayList.add(org.apache.flink.cep.nfa.a.a(aVar9.a, aVar9.b.a(a(c1536c4.d, c1536c4.c))));
        } else {
            arrayList = arrayList4;
        }
        if (aVar9.d != null) {
            eVar.b(aVar9.d);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000e A[Catch: Exception -> 0x0047, TryCatch #0 {Exception -> 0x0047, blocks: (B:3:0x0008, B:5:0x000e, B:6:0x001a, B:8:0x0020, B:10:0x002c, B:12:0x0034, B:14:0x003c, B:16:0x003f), top: B:23:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.apache.flink.cep.nfa.d<T> a(org.apache.flink.cep.mlink.c<T>.a r5, org.apache.flink.cep.nfa.d<T> r6, T r7) {
        /*
            r4 = this;
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            r0.push(r6)
        L8:
            boolean r6 = r0.isEmpty()     // Catch: java.lang.Exception -> L47
            if (r6 != 0) goto L45
            java.lang.Object r6 = r0.pop()     // Catch: java.lang.Exception -> L47
            org.apache.flink.cep.nfa.d r6 = (org.apache.flink.cep.nfa.d) r6     // Catch: java.lang.Exception -> L47
            java.util.Collection<org.apache.flink.cep.nfa.e<T>> r6 = r6.c     // Catch: java.lang.Exception -> L47
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Exception -> L47
        L1a:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Exception -> L47
            if (r1 == 0) goto L8
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Exception -> L47
            org.apache.flink.cep.nfa.e r1 = (org.apache.flink.cep.nfa.e) r1     // Catch: java.lang.Exception -> L47
            org.apache.flink.cep.nfa.f r2 = r1.a     // Catch: java.lang.Exception -> L47
            org.apache.flink.cep.nfa.f r3 = org.apache.flink.cep.nfa.f.PROCEED     // Catch: java.lang.Exception -> L47
            if (r2 != r3) goto L1a
            org.apache.flink.cep.pattern.conditions.b<T> r2 = r1.d     // Catch: java.lang.Exception -> L47
            boolean r2 = a(r5, r2, r7)     // Catch: java.lang.Exception -> L47
            if (r2 == 0) goto L1a
            org.apache.flink.cep.nfa.d<T> r2 = r1.c     // Catch: java.lang.Exception -> L47
            boolean r2 = r2.a()     // Catch: java.lang.Exception -> L47
            if (r2 == 0) goto L3f
            org.apache.flink.cep.nfa.d<T> r5 = r1.c     // Catch: java.lang.Exception -> L47
            return r5
        L3f:
            org.apache.flink.cep.nfa.d<T> r1 = r1.c     // Catch: java.lang.Exception -> L47
            r0.push(r1)     // Catch: java.lang.Exception -> L47
            goto L1a
        L45:
            r5 = 0
            return r5
        L47:
            r5 = move-exception
            org.apache.flink.cep.common.b r6 = new org.apache.flink.cep.common.b
            java.lang.String r7 = "Failure happened in filter function."
            r6.<init>(r7, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.flink.cep.mlink.c.a(org.apache.flink.cep.mlink.c$a, org.apache.flink.cep.nfa.d, org.apache.flink.cep.mlink.bean.BaseEvent):org.apache.flink.cep.nfa.d");
    }

    private static int a(int i, int i2) {
        if (i2 == 0 && i == 0) {
            return 0;
        }
        return i + Math.max(1, i2);
    }

    private C1536c<T> a(c<T>.a aVar, org.apache.flink.cep.nfa.a aVar2, T t) {
        org.apache.flink.cep.nfa.d<T> a2 = a(aVar2);
        C1536c<T> c1536c = new C1536c<>(a2);
        Stack stack = new Stack();
        stack.push(a2);
        while (!stack.isEmpty()) {
            Iterator it = ((org.apache.flink.cep.nfa.d) stack.pop()).c.iterator();
            while (it.hasNext()) {
                org.apache.flink.cep.nfa.e<T> eVar = (org.apache.flink.cep.nfa.e) it.next();
                try {
                    if (a(aVar, eVar.d, t)) {
                        switch (eVar.a) {
                            case IGNORE:
                            case TAKE:
                                if (!(a(eVar.c, c1536c.b) && eVar.a == org.apache.flink.cep.nfa.f.IGNORE)) {
                                    if (eVar.a == org.apache.flink.cep.nfa.f.IGNORE) {
                                        c1536c.d++;
                                    } else if (eVar.a == org.apache.flink.cep.nfa.f.TAKE) {
                                        c1536c.c++;
                                    }
                                }
                                c1536c.a.add(eVar);
                                break;
                            case PROCEED:
                                stack.push(eVar.c);
                                break;
                        }
                    }
                } catch (Exception e) {
                    throw new org.apache.flink.cep.common.b("Failure happened in filter function.", e);
                }
            }
        }
        return c1536c;
    }

    private static boolean a(c<T>.a aVar, org.apache.flink.cep.pattern.conditions.b<T> bVar, T t) throws Exception {
        return bVar == null || bVar.filter(t, aVar);
    }

    private org.apache.flink.cep.nfa.d<T> a(org.apache.flink.cep.nfa.a aVar, c<T>.a aVar2) {
        org.apache.flink.cep.nfa.d<T> a2 = a(aVar);
        if (a2 != null) {
            try {
                for (org.apache.flink.cep.nfa.e<T> eVar : a2.c) {
                    if (eVar.c.c() && eVar.a == org.apache.flink.cep.nfa.f.PROCEED) {
                        org.apache.flink.cep.pattern.conditions.b<T> bVar = eVar.d;
                        StreamData streamData = new StreamData();
                        if (bVar != null && bVar.filter(streamData, aVar2)) {
                            return eVar.c;
                        }
                    }
                }
                return null;
            } catch (Exception e) {
                throw new org.apache.flink.cep.common.b("Failure happened in filter function.", e);
            }
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public class a implements b.a<T> {
        private final org.apache.flink.cep.time.a b;
        private final long c;
        private org.apache.flink.cep.nfa.a d;
        private Map<String, List<T>> e;
        private org.apache.flink.cep.nfa.sharedbuffer.e<T> f;

        a(org.apache.flink.cep.nfa.sharedbuffer.e<T> eVar, org.apache.flink.cep.nfa.a aVar, org.apache.flink.cep.time.a aVar2, long j) {
            this.d = aVar;
            this.f = eVar;
            this.b = aVar2;
            this.c = j;
        }

        @Override // org.apache.flink.cep.pattern.conditions.b.a
        public final List<T> a(String str) throws Exception {
            org.apache.flink.cep.common.c.a(str);
            if (this.e == null) {
                org.apache.flink.cep.nfa.sharedbuffer.e<T> eVar = this.f;
                c cVar = c.this;
                this.e = eVar.a(c.a(this.f, this.d));
            }
            return this.e.get(str);
        }
    }

    private void a(org.apache.flink.cep.nfa.sharedbuffer.e<T> eVar, org.apache.flink.cep.nfa.c cVar, org.apache.flink.cep.nfa.aftermatch.a aVar, PriorityQueue<org.apache.flink.cep.nfa.a> priorityQueue, PriorityQueue<org.apache.flink.cep.nfa.a> priorityQueue2, List<Map<String, List<T>>> list) throws Exception {
        cVar.b.addAll(priorityQueue);
        org.apache.flink.cep.nfa.a peek = cVar.b.peek();
        if (peek != null) {
            while (peek != null) {
                org.apache.flink.cep.nfa.a peek2 = priorityQueue2.peek();
                if (peek2 != null) {
                    if (!(org.apache.flink.cep.nfa.c.d.compare(peek, peek2) <= 0)) {
                        break;
                    }
                }
                cVar.c = true;
                cVar.b.poll();
                List<Map<String, List<org.apache.flink.cep.nfa.sharedbuffer.a>>> a2 = eVar.a(peek.d, peek.b);
                aVar.a(priorityQueue2, a2, eVar);
                aVar.a(cVar.b, a2, eVar);
                list.add(eVar.a(a2.get(0)));
                eVar.b(peek.d);
                peek = cVar.b.peek();
            }
            Iterator<org.apache.flink.cep.nfa.a> it = cVar.a.iterator();
            while (it.hasNext()) {
                org.apache.flink.cep.nfa.a next = it.next();
                if (next.e != null && priorityQueue2.contains(next)) {
                    it.remove();
                }
            }
        }
    }

    static <T> boolean a(org.apache.flink.cep.nfa.d<T> dVar, org.apache.flink.cep.nfa.d<T> dVar2) {
        return dVar.a.equals(dVar2.a);
    }

    private static void a(org.apache.flink.cep.nfa.sharedbuffer.e<T> eVar, List<org.apache.flink.cep.nfa.a> list, org.apache.flink.cep.nfa.d<T> dVar, org.apache.flink.cep.nfa.sharedbuffer.c cVar, org.apache.flink.cep.nfa.b bVar, long j, org.apache.flink.cep.nfa.sharedbuffer.a aVar) throws Exception {
        list.add(org.apache.flink.cep.nfa.a.a(dVar.a, cVar, bVar, j, aVar));
        eVar.a(cVar);
    }

    static Map<String, List<org.apache.flink.cep.nfa.sharedbuffer.a>> a(org.apache.flink.cep.nfa.sharedbuffer.e<T> eVar, org.apache.flink.cep.nfa.a aVar) throws Exception {
        if (aVar.d == null) {
            return new HashMap();
        }
        List<Map<String, List<org.apache.flink.cep.nfa.sharedbuffer.a>>> a2 = eVar.a(aVar.d, aVar.b);
        if (a2.isEmpty()) {
            return new HashMap();
        }
        org.apache.flink.cep.common.c.a(a2.size() == 1);
        return a2.get(0);
    }
}
