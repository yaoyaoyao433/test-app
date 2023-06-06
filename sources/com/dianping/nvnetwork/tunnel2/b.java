package com.dianping.nvnetwork.tunnel2;

import com.dianping.nvnetwork.tunnel.a;
import com.dianping.nvnetwork.tunnel2.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class b<T extends com.dianping.nvnetwork.tunnel2.a> implements a.InterfaceC0102a<T> {
    public static ChangeQuickRedirect a;
    final AtomicInteger b;
    protected a.C0100a c;
    protected a<T> d;
    boolean e;
    int f;
    protected int g;
    protected long h;
    private final List<T> i;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a<T extends com.dianping.nvnetwork.tunnel2.a> {
        void a(int i);

        void a(T t, int i);

        void a(Object obj);
    }

    public abstract T a(SocketAddress socketAddress);

    public b(a.C0100a c0100a, int i) {
        Object[] objArr = {c0100a, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a5d9e6a45aa231f3b15b0516510b52a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a5d9e6a45aa231f3b15b0516510b52a");
            return;
        }
        this.b = new AtomicInteger(0);
        this.i = new ArrayList();
        this.e = false;
        this.c = c0100a;
        this.g = i;
    }

    public synchronized void a(a<T> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a9c8c3a87848b3c549c84b7b1d8eef6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a9c8c3a87848b3c549c84b7b1d8eef6");
            return;
        }
        if (this.b.get() == 0) {
            com.dianping.nvnetwork.util.i.a("start connect racing.");
            this.d = aVar;
            this.h = System.currentTimeMillis();
            for (SocketAddress socketAddress : this.c.a) {
                T a2 = a(socketAddress);
                com.dianping.nvnetwork.util.g.a("start connect to : " + a2.c);
                com.dianping.nvnetwork.util.i.a("start connect to : " + a2.c);
                this.b.incrementAndGet();
                a2.a(10000, this);
                this.i.add(a2);
            }
        }
        this.e = true;
    }

    @Override // com.dianping.nvnetwork.tunnel2.a.InterfaceC0102a
    public final synchronized void a(T t, int i) {
        Object[] objArr = {t, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b7f4c42950a0cd6a3c343f4cdb11da7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b7f4c42950a0cd6a3c343f4cdb11da7");
            return;
        }
        if (this.b.get() > 0) {
            this.b.getAndDecrement();
        }
        if (this.f < this.g) {
            this.f++;
            this.i.remove(t);
            if (this.d != null) {
                this.d.a(t, i);
            }
            if (this.f == this.g) {
                this.b.set(0);
                for (T t2 : this.i) {
                    if (t2 != null) {
                        t2.a();
                    }
                }
                this.i.clear();
                if (this.d != null) {
                    this.d.a((int) (System.currentTimeMillis() - this.h));
                }
                com.dianping.nvnetwork.util.g.a("racing connect task complete. time:" + i);
                com.dianping.nvnetwork.util.i.a("racing connect task complete. time:" + i);
            } else if (this.b.get() == 0) {
                if (this.d != null) {
                    this.d.a((int) (System.currentTimeMillis() - this.h));
                }
                com.dianping.nvnetwork.util.g.a("racing connect task complete. time:" + i);
                com.dianping.nvnetwork.util.i.a("racing connect task complete. time:" + i);
            }
        } else {
            t.a();
        }
    }

    @Override // com.dianping.nvnetwork.tunnel2.a.InterfaceC0102a
    public final synchronized void a(T t, int i, Object obj) {
        Object[] objArr = {t, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "057338865f3144f3535f4e0b6bf2f9e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "057338865f3144f3535f4e0b6bf2f9e5");
            return;
        }
        if (this.b.get() > 0) {
            this.b.getAndDecrement();
        }
        this.i.remove(t);
        if (this.b.get() == 0) {
            if (this.f == 0) {
                if (this.d != null) {
                    this.d.a(obj);
                }
                com.dianping.nvnetwork.util.g.a("racing connect task failed.");
                com.dianping.nvnetwork.util.i.a("racing connect task failed.");
            } else if (this.f < this.g) {
                if (this.d != null) {
                    this.d.a((int) (System.currentTimeMillis() - this.h));
                }
                com.dianping.nvnetwork.util.g.a("racing connect task complete.");
                com.dianping.nvnetwork.util.i.a("racing connect task complete.");
            }
        }
    }

    public final synchronized int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77acc86af1885b103d98ae24a21e3b73", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77acc86af1885b103d98ae24a21e3b73")).intValue();
        }
        return this.i.size();
    }

    public final synchronized void a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75af6ab589c416e7fadabe3443a739bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75af6ab589c416e7fadabe3443a739bf");
            return;
        }
        if (t != null) {
            this.i.add(t);
        }
    }
}
