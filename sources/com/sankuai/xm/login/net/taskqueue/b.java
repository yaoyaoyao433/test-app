package com.sankuai.xm.login.net.taskqueue;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class b implements com.sankuai.xm.login.net.taskqueue.base.a {
    private static int c;
    public static ChangeQuickRedirect e;
    private List<Long> a;
    private Thread b;
    public com.sankuai.xm.login.net.taskqueue.a f;
    protected int g;
    protected long h;
    protected final Object i;
    protected Queue<a> j;
    protected PriorityQueue<a> k;

    public String b() {
        return "queue";
    }

    public abstract com.sankuai.xm.login.net.taskqueue.a c();

    public abstract void f();

    public abstract long g();

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a56d109b64ba3bfefaad67440fa4827c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a56d109b64ba3bfefaad67440fa4827c");
            return;
        }
        this.i = new Object();
        this.g = 0;
        this.h = 0L;
        this.j = new LinkedList();
        this.k = new PriorityQueue<>();
        this.a = new ArrayList();
    }

    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b37ab0a8e731104c25daa2287f197ed", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b37ab0a8e731104c25daa2287f197ed")).intValue();
        }
        if (a() != 0) {
            return -1;
        }
        this.f = c();
        if (this.f == null) {
            return -1;
        }
        c++;
        this.b = m.e().a(b(), new com.sankuai.xm.base.trace.d() { // from class: com.sankuai.xm.login.net.taskqueue.b.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "28cbebdc462790e205eeea6278cbb583", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "28cbebdc462790e205eeea6278cbb583");
                    return;
                }
                m.e().a(-19);
                b.this.c(1);
                b.this.f.a(b.this);
                b.this.c(2);
            }
        });
        this.b.start();
        return 0;
    }

    public final long a(com.sankuai.xm.login.net.taskqueue.base.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ba0a17ec9dda0343eae146ef417a790", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ba0a17ec9dda0343eae146ef417a790")).longValue();
        }
        if (a() == 2) {
            return -1L;
        }
        long b = b(bVar);
        if (b != -1 && this.f != null) {
            this.f.c();
        }
        return b;
    }

    public final long a(com.sankuai.xm.login.net.taskqueue.base.b bVar, long j, boolean z) {
        Object[] objArr = {bVar, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5d858e6a4ef1dc32103422e314a9d51", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5d858e6a4ef1dc32103422e314a9d51")).longValue();
        }
        if (a() == 2) {
            return -1L;
        }
        long a2 = a(bVar, j, z, -1L);
        if (a2 != -1 && this.f != null) {
            this.f.c();
        }
        return a2;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ace647d967e73bd0e0df8e123bf2d26", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ace647d967e73bd0e0df8e123bf2d26");
        } else if (j < 0) {
        } else {
            synchronized (this.i) {
                this.a.add(Long.valueOf(j));
                boolean b = b(j);
                if (!b) {
                    b = c(j);
                }
                if (b) {
                    this.a.remove(Long.valueOf(j));
                }
            }
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9482cbde4a4770d4d071e8cd8af50506", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9482cbde4a4770d4d071e8cd8af50506");
        } else {
            h();
        }
    }

    private synchronized int a() {
        return this.g;
    }

    public final synchronized void c(int i) {
        this.g = i;
    }

    public final boolean a(a aVar) {
        boolean contains;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bb660bd09b8b3f07874ce137cb4a700", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bb660bd09b8b3f07874ce137cb4a700")).booleanValue();
        }
        if (aVar == null) {
            return false;
        }
        synchronized (this.i) {
            contains = this.a.contains(Long.valueOf(aVar.e));
        }
        return contains;
    }

    public final void b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2de19ea8e3268769565b0a21d7c72b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2de19ea8e3268769565b0a21d7c72b3");
        } else if (aVar == null) {
        } else {
            synchronized (this.i) {
                this.a.remove(Long.valueOf(aVar.e));
            }
        }
    }

    public final void c(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b035ea78f38c9517387d02aa69f1dffe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b035ea78f38c9517387d02aa69f1dffe");
        } else if (aVar == null || aVar.b == null) {
        } else {
            try {
                aVar.b.a();
            } catch (Exception e2) {
                com.sankuai.xm.login.d.a(e2, "AbstractQueue::runTask:: exception: " + e2.getMessage(), new Object[0]);
            }
        }
    }

    private long b(com.sankuai.xm.login.net.taskqueue.base.b bVar) {
        long j;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb8be69ef2a17dd1d3a55347583a59e0", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb8be69ef2a17dd1d3a55347583a59e0")).longValue();
        }
        if (bVar == null) {
            return -1L;
        }
        synchronized (this.i) {
            j = this.h + 1;
            this.h = j;
            this.j.add(new a(bVar, 0L, false, j));
        }
        return j;
    }

    public final long a(com.sankuai.xm.login.net.taskqueue.base.b bVar, long j, boolean z, long j2) {
        long j3 = j2;
        Object[] objArr = {bVar, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j3)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13ffff48daad6cd50194b70276781f30", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13ffff48daad6cd50194b70276781f30")).longValue();
        }
        if (bVar == null) {
            return -1L;
        }
        synchronized (this.i) {
            if (j3 == -1) {
                try {
                    long j4 = this.h + 1;
                    this.h = j4;
                    j3 = j4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.k.add(new a(bVar, j, z, j3));
        }
        return j3;
    }

    private boolean b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b33b05987a35ee77e9b12071a793ec80", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b33b05987a35ee77e9b12071a793ec80")).booleanValue();
        }
        synchronized (this.i) {
            Iterator<a> it = this.j.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next != null && next.e == j) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    private boolean c(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6be4ac6a8cc4847e5ae14cf0141fdde4", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6be4ac6a8cc4847e5ae14cf0141fdde4")).booleanValue();
        }
        synchronized (this.i) {
            Iterator<a> it = this.k.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next != null && next.e == j) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    private boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77fbac61d95f231b34b09eae637e176c", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77fbac61d95f231b34b09eae637e176c")).booleanValue();
        }
        synchronized (this.i) {
            this.j.clear();
            this.k.clear();
            this.a.clear();
        }
        return true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a implements Comparable<a> {
        public static ChangeQuickRedirect a;
        com.sankuai.xm.login.net.taskqueue.base.b b;
        long c;
        boolean d;
        long e;
        private long f;

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(a aVar) {
            a aVar2 = aVar;
            Object[] objArr = {aVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02bbcb2e290dba3b3ca060d6f0b8ea51", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02bbcb2e290dba3b3ca060d6f0b8ea51")).intValue();
            }
            int i = (aVar2.a() > a() ? 1 : (aVar2.a() == a() ? 0 : -1));
            if (i < 0) {
                return 1;
            }
            return i == 0 ? 0 : -1;
        }

        public a(com.sankuai.xm.login.net.taskqueue.base.b bVar, long j, boolean z, long j2) {
            Object[] objArr = {bVar, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aed902f9b34aefcb246be28fa785533f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aed902f9b34aefcb246be28fa785533f");
                return;
            }
            this.b = bVar;
            this.c = j;
            this.d = z;
            this.e = j2;
            this.f = g.a();
        }

        public final long a() {
            if (this.c == Long.MAX_VALUE) {
                return this.c;
            }
            return this.f + this.c;
        }
    }
}
