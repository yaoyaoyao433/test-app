package com.meizu.cloud.pushsdk.d.d;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes3.dex */
public final class c implements d {
    private final int a;
    private final AtomicLong b = new AtomicLong(0);
    private final Map<Long, byte[]> c = new ConcurrentHashMap();
    private final List<Long> d = new CopyOnWriteArrayList();

    public c(int i) {
        this.a = i;
    }

    @Override // com.meizu.cloud.pushsdk.d.d.d
    public final boolean a() {
        return true;
    }

    @Override // com.meizu.cloud.pushsdk.d.d.d
    public final boolean a(long j) {
        return this.d.remove(Long.valueOf(j)) && this.c.remove(Long.valueOf(j)) != null;
    }

    @Override // com.meizu.cloud.pushsdk.d.d.d
    public final long b() {
        return this.d.size();
    }

    @Override // com.meizu.cloud.pushsdk.d.d.d
    public final com.meizu.cloud.pushsdk.d.b.c c() {
        LinkedList linkedList = new LinkedList();
        ArrayList arrayList = new ArrayList();
        int b = (int) b();
        if (b > this.a) {
            b = this.a;
        }
        for (int i = 0; i < b; i++) {
            Long l = this.d.get(i);
            if (l != null) {
                com.meizu.cloud.pushsdk.d.a.c cVar = new com.meizu.cloud.pushsdk.d.a.c();
                cVar.a(a.a(this.c.get(l)));
                com.meizu.cloud.pushsdk.d.f.c.c("MemoryStore", " current key " + l + " payload " + cVar, new Object[0]);
                linkedList.add(l);
                arrayList.add(cVar);
            }
        }
        return new com.meizu.cloud.pushsdk.d.b.c(arrayList, linkedList);
    }

    @Override // com.meizu.cloud.pushsdk.d.d.d
    public final void a(com.meizu.cloud.pushsdk.d.a.a aVar) {
        byte[] a = a.a(aVar.a());
        long andIncrement = this.b.getAndIncrement();
        this.d.add(Long.valueOf(andIncrement));
        this.c.put(Long.valueOf(andIncrement), a);
    }
}
