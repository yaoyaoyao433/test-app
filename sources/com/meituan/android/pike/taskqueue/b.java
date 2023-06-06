package com.meituan.android.pike.taskqueue;

import android.os.Process;
import com.meituan.android.pike.bean.PikeLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class b implements com.meituan.android.pike.taskqueue.base.a {
    public static ChangeQuickRedirect a;
    public String b;
    protected com.meituan.android.pike.taskqueue.a c;
    protected int d;
    protected long e;
    protected Object f;
    protected Queue<a> g;
    protected PriorityQueue<a> h;
    private List<Long> i;
    private Thread j;

    public abstract com.meituan.android.pike.taskqueue.a c();

    public abstract void d();

    public abstract long e();

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c12d14669d04f59ad304ebc573d27ff5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c12d14669d04f59ad304ebc573d27ff5");
            return;
        }
        this.b = "PikeSDK-RetryMessage";
        this.d = 0;
        this.e = 0L;
        this.f = new Object();
        this.g = new LinkedList();
        this.h = new PriorityQueue<>();
        this.i = new ArrayList();
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8233dcafdec638d3a8ec8547bb023ae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8233dcafdec638d3a8ec8547bb023ae")).intValue();
        }
        if (f() != 0) {
            return -1;
        }
        this.c = c();
        if (this.c == null) {
            return -1;
        }
        this.j = com.sankuai.android.jarvis.c.a(this.b, new Runnable() { // from class: com.meituan.android.pike.taskqueue.b.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2b23947e94ae5615006bab68b671d963", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2b23947e94ae5615006bab68b671d963");
                    return;
                }
                Process.setThreadPriority(-19);
                b.this.a(1);
                b.this.c.a(b.this);
                b.this.a(2);
            }
        });
        this.j.start();
        return 0;
    }

    public final long a(com.meituan.android.pike.taskqueue.base.b bVar, long j, boolean z) {
        Object[] objArr = {bVar, new Long(j), (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb20a9a8154f5f3ae9a6ed7dcfa6a55e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb20a9a8154f5f3ae9a6ed7dcfa6a55e")).longValue();
        }
        if (f() == 2) {
            return -1L;
        }
        long a2 = a(bVar, j, true, -1L);
        if (a2 != -1 && this.c != null) {
            com.meituan.android.pike.taskqueue.a aVar = this.c;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.pike.taskqueue.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "755c4ec21bb43ae9f12507e10bf23b68", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "755c4ec21bb43ae9f12507e10bf23b68");
            } else {
                aVar.a();
            }
        }
        return a2;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32864beb5bbef3e5aff7ae3c09746dff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32864beb5bbef3e5aff7ae3c09746dff");
        } else if (j < 0) {
        } else {
            synchronized (this.f) {
                this.i.add(Long.valueOf(j));
                boolean b = b(j);
                if (!b) {
                    b = c(j);
                }
                if (b) {
                    this.i.remove(Long.valueOf(j));
                }
            }
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78d8b071d21835d8759023b9e5bc3660", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78d8b071d21835d8759023b9e5bc3660");
        } else {
            g();
        }
    }

    private synchronized int f() {
        return this.d;
    }

    public final synchronized void a(int i) {
        this.d = i;
    }

    public final boolean a(a aVar) {
        boolean contains;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91833e0f582cde20aa37bad6ca66d04b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91833e0f582cde20aa37bad6ca66d04b")).booleanValue();
        }
        if (aVar == null) {
            return false;
        }
        synchronized (this.f) {
            contains = this.i.contains(Long.valueOf(aVar.e));
        }
        return contains;
    }

    public final void b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69ce0fb8efc419e4e75d16770da126ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69ce0fb8efc419e4e75d16770da126ff");
            return;
        }
        synchronized (this.f) {
            this.i.remove(Long.valueOf(aVar.e));
        }
    }

    public final void c(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6667ea438d8d66d167d39318922676cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6667ea438d8d66d167d39318922676cb");
        } else if (aVar == null || aVar.b == null) {
        } else {
            try {
                aVar.b.a();
            } catch (Exception e) {
                PikeLog.e("AbstractQueue", "AbstractQueue::runTask => exception: " + e.getMessage());
            }
        }
    }

    public final long a(com.meituan.android.pike.taskqueue.base.b bVar, long j, boolean z, long j2) {
        long j3 = j2;
        Object[] objArr = {bVar, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ead287f8cb66d5e1657099719ec88823", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ead287f8cb66d5e1657099719ec88823")).longValue();
        }
        if (bVar == null) {
            return -1L;
        }
        synchronized (this.f) {
            if (j3 == -1) {
                try {
                    long j4 = this.e + 1;
                    this.e = j4;
                    j3 = j4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.h.add(new a(bVar, j, z, j3));
        }
        return j3;
    }

    private boolean b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33d2aaf8edba3ccfe35187f34c3e4298", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33d2aaf8edba3ccfe35187f34c3e4298")).booleanValue();
        }
        synchronized (this.f) {
            Iterator<a> it = this.g.iterator();
            while (it.hasNext()) {
                if (it.next().e == j) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    private boolean c(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8697bbb217813566c4895fbe95fee3cd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8697bbb217813566c4895fbe95fee3cd")).booleanValue();
        }
        synchronized (this.f) {
            Iterator<a> it = this.h.iterator();
            while (it.hasNext()) {
                if (it.next().e == j) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    private boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69730d6eb3b1a785a13e3f7d711cae10", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69730d6eb3b1a785a13e3f7d711cae10")).booleanValue();
        }
        synchronized (this.f) {
            this.g.clear();
            this.h.clear();
            this.i.clear();
        }
        return true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a implements Comparable<a> {
        public static ChangeQuickRedirect a;
        com.meituan.android.pike.taskqueue.base.b b;
        long c;
        boolean d;
        long e;
        private long f;

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(a aVar) {
            a aVar2 = aVar;
            Object[] objArr = {aVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b153d4972620246a84c92b9249100898", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b153d4972620246a84c92b9249100898")).intValue();
            }
            int i = (aVar2.a() > a() ? 1 : (aVar2.a() == a() ? 0 : -1));
            if (i < 0) {
                return 1;
            }
            return i == 0 ? 0 : -1;
        }

        public a(com.meituan.android.pike.taskqueue.base.b bVar, long j, boolean z, long j2) {
            Object[] objArr = {bVar, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fbc323b23adb5512a137974ff1b69c0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fbc323b23adb5512a137974ff1b69c0");
                return;
            }
            this.b = bVar;
            this.c = j;
            this.d = z;
            this.e = j2;
            this.f = f.a();
        }

        public final long a() {
            if (this.c == Long.MAX_VALUE) {
                return this.c;
            }
            return this.f + this.c;
        }
    }
}
