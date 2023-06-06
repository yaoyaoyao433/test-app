package com.meizu.cloud.pushsdk.d.b.a;

import com.meizu.cloud.pushsdk.d.b.a;
import com.meizu.cloud.pushsdk.d.b.g;
import com.meizu.cloud.pushsdk.d.d.c;
import com.meizu.cloud.pushsdk.d.d.d;
import com.meizu.cloud.pushsdk.d.f.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes3.dex */
public class a extends com.meizu.cloud.pushsdk.d.b.a {
    private final String m;
    private d n;
    private int o;

    public a(a.C0527a c0527a) {
        super(c0527a);
        this.m = a.class.getSimpleName();
        this.n = new com.meizu.cloud.pushsdk.d.d.a(this.a, this.h);
        if (this.n.a()) {
            return;
        }
        this.n = new c(this.h);
        com.meizu.cloud.pushsdk.d.f.c.a(this.m, "init memory store", new Object[0]);
    }

    @Override // com.meizu.cloud.pushsdk.d.b.a
    public final void a() {
        b.a(new Runnable() { // from class: com.meizu.cloud.pushsdk.d.b.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                if (a.this.l.compareAndSet(false, true)) {
                    a.this.b();
                }
            }
        });
    }

    @Override // com.meizu.cloud.pushsdk.d.b.a
    public final void a(com.meizu.cloud.pushsdk.d.a.a aVar, boolean z) {
        this.n.a(aVar);
        String str = this.m;
        com.meizu.cloud.pushsdk.d.f.c.a(str, "isRunning " + this.l + " attemptEmit " + z, new Object[0]);
        if (!z) {
            try {
                this.k.sleep(1L);
            } catch (InterruptedException e) {
                String str2 = this.m;
                com.meizu.cloud.pushsdk.d.f.c.a(str2, "Emitter add thread sleep interrupted: " + e.toString(), new Object[0]);
            }
        }
        if (this.l.compareAndSet(false, true)) {
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public void b() {
        int i;
        if (!e.a(this.a)) {
            com.meizu.cloud.pushsdk.d.f.c.a(this.m, "Emitter loop stopping: emitter offline.", new Object[0]);
            this.l.compareAndSet(true, false);
            return;
        }
        long j = 0;
        if (this.n.b() <= 0) {
            if (this.o >= this.g) {
                com.meizu.cloud.pushsdk.d.f.c.a(this.m, "Emitter loop stopping: empty limit reached.", new Object[0]);
                this.l.compareAndSet(true, false);
                if (this.c != null) {
                    return;
                }
                return;
            }
            this.o++;
            com.meizu.cloud.pushsdk.d.f.c.a(this.m, "Emitter database empty: " + this.o, new Object[0]);
            try {
                this.k.sleep(this.f);
            } catch (InterruptedException e) {
                com.meizu.cloud.pushsdk.d.f.c.a(this.m, "Emitter thread sleep interrupted: " + e.toString(), new Object[0]);
            }
            b();
            return;
        }
        this.o = 0;
        com.meizu.cloud.pushsdk.d.b.c c = this.n.c();
        int size = c.a.size();
        LinkedList<Long> linkedList = c.b;
        LinkedList<com.meizu.cloud.pushsdk.d.b.e> linkedList2 = new LinkedList<>();
        long j2 = 22;
        if (this.d == com.meizu.cloud.pushsdk.d.b.d.a) {
            for (int i2 = 0; i2 < size; i2++) {
                LinkedList linkedList3 = new LinkedList();
                linkedList3.add(linkedList.get(i2));
                com.meizu.cloud.pushsdk.d.a.a aVar = c.a.get(i2);
                linkedList2.add(new com.meizu.cloud.pushsdk.d.b.e(aVar.b() + 22 > this.i, super.a(aVar), linkedList3));
            }
        } else {
            int i3 = 0;
            while (i3 < size) {
                LinkedList linkedList4 = new LinkedList();
                ArrayList<com.meizu.cloud.pushsdk.d.a.a> arrayList = new ArrayList<>();
                LinkedList linkedList5 = linkedList4;
                long j3 = j;
                int i4 = i3;
                while (i4 < this.e.d + i3 && i4 < size) {
                    com.meizu.cloud.pushsdk.d.a.a aVar2 = c.a.get(i4);
                    long b = aVar2.b() + j2;
                    if (b + 88 > this.j) {
                        ArrayList<com.meizu.cloud.pushsdk.d.a.a> arrayList2 = new ArrayList<>();
                        LinkedList linkedList6 = new LinkedList();
                        arrayList2.add(aVar2);
                        linkedList6.add(linkedList.get(i4));
                        linkedList2.add(new com.meizu.cloud.pushsdk.d.b.e(true, super.a(arrayList2), linkedList6));
                    } else {
                        j3 += b;
                        if (j3 + 88 + (arrayList.size() - 1) > this.j) {
                            linkedList2.add(new com.meizu.cloud.pushsdk.d.b.e(false, super.a(arrayList), linkedList5));
                            ArrayList<com.meizu.cloud.pushsdk.d.a.a> arrayList3 = new ArrayList<>();
                            LinkedList linkedList7 = new LinkedList();
                            arrayList3.add(aVar2);
                            linkedList7.add(linkedList.get(i4));
                            linkedList5 = linkedList7;
                            j3 = b;
                            arrayList = arrayList3;
                        } else {
                            arrayList.add(aVar2);
                            linkedList5.add(linkedList.get(i4));
                        }
                    }
                    i4++;
                    j2 = 22;
                }
                if (!arrayList.isEmpty()) {
                    linkedList2.add(new com.meizu.cloud.pushsdk.d.b.e(false, super.a(arrayList), linkedList5));
                }
                i3 += this.e.d;
                j = 0;
                j2 = 22;
            }
        }
        LinkedList<g> a = a(linkedList2);
        com.meizu.cloud.pushsdk.d.f.c.c(this.m, "Processing emitter results.", new Object[0]);
        LinkedList<Long> linkedList8 = new LinkedList<>();
        Iterator<g> it = a.iterator();
        int i5 = 0;
        int i6 = 0;
        while (it.hasNext()) {
            g next = it.next();
            if (next.a) {
                linkedList8.addAll(next.b);
                i5 += next.b.size();
            } else {
                i6 += next.b.size();
                com.meizu.cloud.pushsdk.d.f.c.a(this.m, "Request sending failed but we will retry later.", new Object[0]);
            }
        }
        b(linkedList8);
        com.meizu.cloud.pushsdk.d.f.c.b(this.m, "Success Count: %s", Integer.valueOf(i5));
        com.meizu.cloud.pushsdk.d.f.c.b(this.m, "Failure Count: %s", Integer.valueOf(i6));
        if (i6 <= 0 || i5 != 0) {
            b();
            return;
        }
        if (e.a(this.a)) {
            i = 0;
            com.meizu.cloud.pushsdk.d.f.c.a(this.m, "Ensure collector path is valid: %s", this.b.clearQuery().build().toString());
        } else {
            i = 0;
        }
        com.meizu.cloud.pushsdk.d.f.c.a(this.m, "Emitter loop stopping: failures.", new Object[i]);
        this.l.compareAndSet(true, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.LinkedList<com.meizu.cloud.pushsdk.d.b.g> a(java.util.LinkedList<com.meizu.cloud.pushsdk.d.b.e> r11) {
        /*
            r10 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            java.util.Iterator r2 = r11.iterator()
        Le:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L29
            java.lang.Object r3 = r2.next()
            com.meizu.cloud.pushsdk.d.b.e r3 = (com.meizu.cloud.pushsdk.d.b.e) r3
            com.meizu.cloud.pushsdk.c.c.i r3 = r3.b
            com.meizu.cloud.pushsdk.d.b.a.a$2 r4 = new com.meizu.cloud.pushsdk.d.b.a.a$2
            r4.<init>()
            java.util.concurrent.Future r3 = com.meizu.cloud.pushsdk.d.b.a.b.a(r4)
            r1.add(r3)
            goto Le
        L29:
            java.lang.String r2 = r10.m
            java.lang.String r3 = "Request Futures: %s"
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            int r6 = r1.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 0
            r5[r7] = r6
            com.meizu.cloud.pushsdk.d.f.c.b(r2, r3, r5)
            r2 = 0
        L3f:
            int r3 = r1.size()
            if (r2 >= r3) goto Lc2
            r3 = -1
            java.lang.Object r5 = r1.get(r2)     // Catch: java.util.concurrent.TimeoutException -> L5c java.util.concurrent.ExecutionException -> L6a java.lang.InterruptedException -> L78
            java.util.concurrent.Future r5 = (java.util.concurrent.Future) r5     // Catch: java.util.concurrent.TimeoutException -> L5c java.util.concurrent.ExecutionException -> L6a java.lang.InterruptedException -> L78
            r8 = 5
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.util.concurrent.TimeoutException -> L5c java.util.concurrent.ExecutionException -> L6a java.lang.InterruptedException -> L78
            java.lang.Object r5 = r5.get(r8, r6)     // Catch: java.util.concurrent.TimeoutException -> L5c java.util.concurrent.ExecutionException -> L6a java.lang.InterruptedException -> L78
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.util.concurrent.TimeoutException -> L5c java.util.concurrent.ExecutionException -> L6a java.lang.InterruptedException -> L78
            int r5 = r5.intValue()     // Catch: java.util.concurrent.TimeoutException -> L5c java.util.concurrent.ExecutionException -> L6a java.lang.InterruptedException -> L78
            r3 = r5
            goto L88
        L5c:
            r5 = move-exception
            java.lang.String r6 = r10.m
            java.lang.String r8 = "Request Future had a timeout: %s"
            java.lang.Object[] r9 = new java.lang.Object[r4]
            java.lang.String r5 = r5.getMessage()
            r9[r7] = r5
            goto L85
        L6a:
            r5 = move-exception
            java.lang.String r6 = r10.m
            java.lang.String r8 = "Request Future failed: %s"
            java.lang.Object[] r9 = new java.lang.Object[r4]
            java.lang.String r5 = r5.getMessage()
            r9[r7] = r5
            goto L85
        L78:
            r5 = move-exception
            java.lang.String r6 = r10.m
            java.lang.String r8 = "Request Future was interrupted: %s"
            java.lang.Object[] r9 = new java.lang.Object[r4]
            java.lang.String r5 = r5.getMessage()
            r9[r7] = r5
        L85:
            com.meizu.cloud.pushsdk.d.f.c.a(r6, r8, r9)
        L88:
            java.lang.Object r5 = r11.get(r2)
            com.meizu.cloud.pushsdk.d.b.e r5 = (com.meizu.cloud.pushsdk.d.b.e) r5
            boolean r5 = r5.a
            if (r5 == 0) goto La3
            com.meizu.cloud.pushsdk.d.b.g r3 = new com.meizu.cloud.pushsdk.d.b.g
            java.lang.Object r5 = r11.get(r2)
            com.meizu.cloud.pushsdk.d.b.e r5 = (com.meizu.cloud.pushsdk.d.b.e) r5
            java.util.LinkedList<java.lang.Long> r5 = r5.c
            r3.<init>(r4, r5)
            r0.add(r3)
            goto Lbe
        La3:
            com.meizu.cloud.pushsdk.d.b.g r5 = new com.meizu.cloud.pushsdk.d.b.g
            r6 = 200(0xc8, float:2.8E-43)
            if (r3 < r6) goto Laf
            r6 = 300(0x12c, float:4.2E-43)
            if (r3 >= r6) goto Laf
            r3 = 1
            goto Lb0
        Laf:
            r3 = 0
        Lb0:
            java.lang.Object r6 = r11.get(r2)
            com.meizu.cloud.pushsdk.d.b.e r6 = (com.meizu.cloud.pushsdk.d.b.e) r6
            java.util.LinkedList<java.lang.Long> r6 = r6.c
            r5.<init>(r3, r6)
            r0.add(r5)
        Lbe:
            int r2 = r2 + 1
            goto L3f
        Lc2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.d.b.a.a.a(java.util.LinkedList):java.util.LinkedList");
    }

    private LinkedList<Boolean> b(LinkedList<Long> linkedList) {
        String str;
        String str2;
        Object[] objArr;
        boolean z;
        LinkedList<Boolean> linkedList2 = new LinkedList<>();
        LinkedList linkedList3 = new LinkedList();
        Iterator<Long> it = linkedList.iterator();
        while (it.hasNext()) {
            final Long next = it.next();
            linkedList3.add(b.a(new Callable<Boolean>() { // from class: com.meizu.cloud.pushsdk.d.b.a.a.3
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Boolean call() throws Exception {
                    return Boolean.valueOf(a.this.n.a(next.longValue()));
                }
            }));
        }
        com.meizu.cloud.pushsdk.d.f.c.b(this.m, "Removal Futures: %s", Integer.valueOf(linkedList3.size()));
        for (int i = 0; i < linkedList3.size(); i++) {
            try {
                z = ((Boolean) ((Future) linkedList3.get(i)).get(5L, TimeUnit.SECONDS)).booleanValue();
            } catch (InterruptedException e) {
                str = this.m;
                str2 = "Removal Future was interrupted: %s";
                objArr = new Object[]{e.getMessage()};
                com.meizu.cloud.pushsdk.d.f.c.a(str, str2, objArr);
                z = false;
                linkedList2.add(Boolean.valueOf(z));
            } catch (ExecutionException e2) {
                str = this.m;
                str2 = "Removal Future failed: %s";
                objArr = new Object[]{e2.getMessage()};
                com.meizu.cloud.pushsdk.d.f.c.a(str, str2, objArr);
                z = false;
                linkedList2.add(Boolean.valueOf(z));
            } catch (TimeoutException e3) {
                str = this.m;
                str2 = "Removal Future had a timeout: %s";
                objArr = new Object[]{e3.getMessage()};
                com.meizu.cloud.pushsdk.d.f.c.a(str, str2, objArr);
                z = false;
                linkedList2.add(Boolean.valueOf(z));
            }
            linkedList2.add(Boolean.valueOf(z));
        }
        return linkedList2;
    }
}
