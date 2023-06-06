package com.dianping.nvnetwork.tunnel2;

import android.content.Context;
import com.dianping.nvnetwork.tunnel.a;
import com.dianping.nvnetwork.tunnel2.a;
import com.dianping.nvnetwork.tunnel2.b;
import com.dianping.nvnetwork.tunnel2.i;
import com.dianping.nvnetwork.util.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    public static ChangeQuickRedirect a;
    final List<h> b;
    com.dianping.nvnetwork.tunnel.a c;
    AtomicReference<a> d;
    e e;
    private Context f;
    private final Comparator<h> g;
    private Random h;

    public c(Context context, e eVar) {
        Object[] objArr = {context, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a40dab173c39af6d30de78de9954825", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a40dab173c39af6d30de78de9954825");
            return;
        }
        this.b = new ArrayList();
        this.d = new AtomicReference<>();
        this.g = new Comparator<h>() { // from class: com.dianping.nvnetwork.tunnel2.c.1
            public static ChangeQuickRedirect a;

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(h hVar, h hVar2) {
                h hVar3 = hVar;
                h hVar4 = hVar2;
                Object[] objArr2 = {hVar3, hVar4};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "96d7cd2b70943de949ad932524141763", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "96d7cd2b70943de949ad932524141763")).intValue() : Double.compare(hVar4.q(), hVar3.q());
            }
        };
        this.h = new Random(System.currentTimeMillis());
        this.f = context.getApplicationContext();
        this.e = eVar;
        this.c = com.dianping.nvnetwork.tunnel.a.a(this.f);
        com.sankuai.android.jarvis.c.c("shark_heartbeat").scheduleWithFixedDelay(new Runnable() { // from class: com.dianping.nvnetwork.tunnel2.c.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                boolean booleanValue;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4d74bb11fdca6f1d89a8cb12608faf40", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4d74bb11fdca6f1d89a8cb12608faf40");
                    return;
                }
                synchronized (c.this.b) {
                    if (!c.this.b.isEmpty()) {
                        for (h hVar : c.this.b) {
                            try {
                                int i = com.dianping.nvnetwork.h.h().M;
                                Object[] objArr3 = {Integer.valueOf(i)};
                                ChangeQuickRedirect changeQuickRedirect3 = com.dianping.nvnetwork.tunnel2.a.a;
                                if (!PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "ab93e330a502be8a1100d8ecda2c2ca8", 6917529027641081856L)) {
                                    if (hVar.k()) {
                                        throw new IOException("ping timeout.");
                                        break;
                                    }
                                    booleanValue = hVar.l() - hVar.d >= ((long) i);
                                } else {
                                    booleanValue = ((Boolean) PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "ab93e330a502be8a1100d8ecda2c2ca8")).booleanValue();
                                }
                                if (booleanValue) {
                                    com.dianping.nvnetwork.util.g.a("shark connection start ping~ " + hVar.m());
                                    hVar.d();
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                                com.dianping.nvnetwork.util.g.a("heartbeat exception.");
                                com.dianping.nvnetwork.util.i.a("heartbeat exception.");
                                hVar.a();
                            }
                        }
                    } else {
                        try {
                            c.this.b.wait();
                        } catch (InterruptedException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            }
        }, 0L, 10000L, TimeUnit.MILLISECONDS);
        l.a().a(j.class).e().a(rx.schedulers.a.d()).a(new rx.functions.b<j>() { // from class: com.dianping.nvnetwork.tunnel2.c.3
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(j jVar) {
                int i;
                j jVar2 = jVar;
                char c = 1;
                Object[] objArr2 = {jVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6a633d3c98a3f23a3e861cf8e8420203", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6a633d3c98a3f23a3e861cf8e8420203");
                } else if (jVar2 != null && jVar2.a == 1) {
                    LinkedList linkedList = (LinkedList) jVar2.b;
                    final c cVar = c.this;
                    Object[] objArr3 = {linkedList};
                    ChangeQuickRedirect changeQuickRedirect3 = c.a;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "b67e7b4e328f8a311e8310139fdd3083", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "b67e7b4e328f8a311e8310139fdd3083");
                        return;
                    }
                    com.dianping.nvnetwork.util.g.a("SmartRouting", "NIO processSoftSwitch");
                    List<h> list = cVar.b;
                    synchronized (list) {
                        if (list.size() == 0) {
                            return;
                        }
                        LinkedList linkedList2 = new LinkedList();
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            linkedList2.add(((i.b) it.next()).b);
                        }
                        Collections.sort(list, new Comparator<h>() { // from class: com.dianping.nvnetwork.tunnel2.c.6
                            public static ChangeQuickRedirect a;

                            @Override // java.util.Comparator
                            public final /* synthetic */ int compare(h hVar, h hVar2) {
                                h hVar3 = hVar;
                                h hVar4 = hVar2;
                                Object[] objArr4 = {hVar3, hVar4};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "dc718684ff0294ab0ceed4a17a1ebb16", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "dc718684ff0294ab0ceed4a17a1ebb16")).intValue() : hVar3.j() - hVar4.j();
                            }
                        });
                        LinkedList linkedList3 = new LinkedList();
                        for (h hVar : list) {
                            linkedList3.add(hVar.c);
                        }
                        int size = list.size() - 1;
                        int i2 = 0;
                        while (size >= 0) {
                            final h hVar2 = list.get(size);
                            int i3 = i2;
                            while (true) {
                                if (i3 >= linkedList.size()) {
                                    break;
                                }
                                i.b bVar = (i.b) linkedList.get(i3);
                                com.dianping.nvnetwork.util.g.a("SmartRouting", "current " + hVar2.c + ", rtt: " + hVar2.j());
                                com.dianping.nvnetwork.util.g.a("SmartRouting", "compare to " + bVar.b + ", rtt: " + bVar.a());
                                int indexOf = linkedList2.indexOf(hVar2.c);
                                if ((indexOf == -1 ? hVar2.j() : ((i.b) linkedList.get(indexOf)).a()) - com.dianping.nvnetwork.h.h().ab <= bVar.a()) {
                                    i3++;
                                    c = 1;
                                } else if (!linkedList3.contains(bVar.b)) {
                                    final SocketAddress socketAddress = bVar.b;
                                    Object[] objArr4 = new Object[2];
                                    objArr4[0] = hVar2;
                                    objArr4[c] = socketAddress;
                                    ChangeQuickRedirect changeQuickRedirect4 = c.a;
                                    i = i3;
                                    if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "92f9798799c89bfb7d058105e64b0903", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "92f9798799c89bfb7d058105e64b0903");
                                    } else {
                                        com.dianping.nvnetwork.util.g.a("SmartRouting", "softSwitch, old : " + hVar2.c + ", new :" + socketAddress);
                                        com.dianping.networklog.c.a("SmartRouting softSwitch, old : " + hVar2.c + ", new :" + socketAddress, 4);
                                        new h(cVar.e, socketAddress).a(10000, new a.InterfaceC0102a<h>() { // from class: com.dianping.nvnetwork.tunnel2.c.7
                                            public static ChangeQuickRedirect a;

                                            @Override // com.dianping.nvnetwork.tunnel2.a.InterfaceC0102a
                                            public final /* synthetic */ void a(h hVar3, int i4) {
                                                h hVar4 = hVar3;
                                                Object[] objArr5 = {hVar4, Integer.valueOf(i4)};
                                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "775a5dd495a8d959068f470e37eb3dc4", 6917529027641081856L)) {
                                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "775a5dd495a8d959068f470e37eb3dc4");
                                                    return;
                                                }
                                                synchronized (c.this.b) {
                                                    if (c.this.a(hVar2)) {
                                                        c.this.e.a(new Runnable() { // from class: com.dianping.nvnetwork.tunnel2.c.7.1
                                                            public static ChangeQuickRedirect a;

                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                Object[] objArr6 = new Object[0];
                                                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "f97060cf1ac0b929d691ee8c8c3cae9d", 6917529027641081856L)) {
                                                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "f97060cf1ac0b929d691ee8c8c3cae9d");
                                                                } else {
                                                                    hVar2.a();
                                                                }
                                                            }
                                                        }, c.this.e.c());
                                                    }
                                                    hVar4.h();
                                                    c.this.b.add(hVar4);
                                                    c.this.b.notifyAll();
                                                    com.dianping.nvnetwork.util.g.a("soft switch success : new ip is " + socketAddress);
                                                    com.dianping.networklog.c.a("soft switch success : new ip is " + socketAddress, 4);
                                                }
                                            }

                                            @Override // com.dianping.nvnetwork.tunnel2.a.InterfaceC0102a
                                            public final /* synthetic */ void a(h hVar3, int i4, Object obj) {
                                                Object[] objArr5 = {hVar3, Integer.valueOf(i4), obj};
                                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a56c6e994f3562b6c003549f9888f64e", 6917529027641081856L)) {
                                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a56c6e994f3562b6c003549f9888f64e");
                                                } else {
                                                    com.dianping.networklog.c.a("soft switch failed : timeout", 4);
                                                }
                                            }
                                        });
                                    }
                                }
                            }
                            i = i3;
                            size--;
                            i2 = i;
                            c = 1;
                        }
                    }
                }
            }
        }, new rx.functions.b<Throwable>() { // from class: com.dianping.nvnetwork.tunnel2.c.4
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Throwable th) {
                Throwable th2 = th;
                Object[] objArr2 = {th2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c6a5e3fdfa920f84f63010ebd7b13e30", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c6a5e3fdfa920f84f63010ebd7b13e30");
                } else {
                    th2.printStackTrace();
                }
            }
        });
    }

    public final void a() {
        a.C0100a a2;
        a aVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b330a138b098e43d01e2ee784c0354a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b330a138b098e43d01e2ee784c0354a");
            return;
        }
        synchronized (this.b) {
            if (com.dianping.nvnetwork.h.h().G) {
                if (!com.dianping.nvnetwork.h.h().g() && com.dianping.nvnetwork.g.o() != 10000 && (com.dianping.nvnetwork.g.o() != 10002 || !com.dianping.nvnetwork.h.h().B)) {
                    if (this.b.size() >= com.dianping.nvnetwork.h.h().H) {
                        return;
                    }
                    if (this.d.get() == null) {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "edf3800f9e6cbf9d0d77e4b84f3af455", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "edf3800f9e6cbf9d0d77e4b84f3af455")).booleanValue() : com.dianping.nvnetwork.util.j.a(this.f)) {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "957b4b0b6a0639d2073b006f3e7f179d", 6917529027641081856L)) {
                                a2 = (a.C0100a) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "957b4b0b6a0639d2073b006f3e7f179d");
                            } else {
                                a2 = this.c.a();
                                if (a2.a == null) {
                                    throw new IllegalArgumentException("you must init server addresses first!!");
                                }
                            }
                            if (com.dianping.nvnetwork.h.h().K || this.b.size() < a2.a.size()) {
                                if (a2 != null && !a2.a.isEmpty()) {
                                    if (!com.dianping.nvnetwork.h.h().K && this.b.size() > 0) {
                                        ArrayList arrayList = null;
                                        for (h hVar : this.b) {
                                            if (a2.a.contains(hVar.c)) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(hVar.c);
                                            }
                                        }
                                        if (arrayList != null && arrayList.size() > 0) {
                                            a2.a.removeAll(arrayList);
                                        }
                                    }
                                    if (a2.a.isEmpty()) {
                                        return;
                                    }
                                    if (a2.b == 3) {
                                        aVar = new b(a2);
                                    } else {
                                        aVar = new a(a2);
                                    }
                                    this.d.set(aVar);
                                    aVar.b();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "148c2b5eacb2c490a224f5ba72800426", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "148c2b5eacb2c490a224f5ba72800426");
            return;
        }
        final ArrayList arrayList = new ArrayList();
        synchronized (this.b) {
            arrayList.addAll(this.b);
            this.b.clear();
        }
        if (arrayList.size() > 0) {
            if (z) {
                this.e.a(new Runnable() { // from class: com.dianping.nvnetwork.tunnel2.c.5
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3d1a683471beedbf802c9174d84a5883", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3d1a683471beedbf802c9174d84a5883");
                            return;
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((h) it.next()).a();
                        }
                    }
                }, com.dianping.nvnetwork.h.h().c());
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                if (hVar != null) {
                    hVar.a();
                }
            }
        }
    }

    public final boolean a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e2811e5ffabb65bdbfec72fc5c95b5e", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e2811e5ffabb65bdbfec72fc5c95b5e")).booleanValue();
        }
        synchronized (this.b) {
            if (this.b.contains(hVar)) {
                com.dianping.nvnetwork.util.g.a("tunnel connect break");
                this.b.remove(hVar);
                com.dianping.nvnetwork.util.i.a("tunnel " + hVar.toString() + " disconnect.network:" + com.dianping.nvnetwork.g.f().a());
                return true;
            }
            return false;
        }
    }

    public final void a(List<h> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "335283ad2c7d979b8f9d75834480313e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "335283ad2c7d979b8f9d75834480313e");
            return;
        }
        synchronized (this.b) {
            if (this.b.size() > 0) {
                list.addAll(this.b);
                Collections.shuffle(list, this.h);
                Collections.sort(list, this.g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class b extends a {
        public static ChangeQuickRedirect m;
        final LinkedBlockingQueue<h> n;

        public b(a.C0100a c0100a) {
            super(c0100a);
            Object[] objArr = {c.this, c0100a};
            ChangeQuickRedirect changeQuickRedirect = m;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a0d7fde0e7338763747c92c15463d07", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a0d7fde0e7338763747c92c15463d07");
                return;
            }
            this.n = new LinkedBlockingQueue<>();
            for (SocketAddress socketAddress : c0100a.a) {
                this.n.add(a(socketAddress));
            }
        }

        /* compiled from: ProGuard */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public static ChangeQuickRedirect a;

            private a() {
                Object[] objArr = {b.this};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "171957c3fe48fb2e93af2c1aaae3cad3", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "171957c3fe48fb2e93af2c1aaae3cad3");
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                h poll;
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abbf5cd773213ff00048c2d9226c248b", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abbf5cd773213ff00048c2d9226c248b");
                    return;
                }
                while (b.this.f != b.this.g && !b.this.n.isEmpty()) {
                    while (b.this.a() <= b.this.g && !b.this.n.isEmpty() && (poll = b.this.n.poll()) != null) {
                        com.dianping.nvnetwork.util.g.a("SmartRouting", "start blocking connect to : " + poll.c);
                        b.this.b.incrementAndGet();
                        poll.a(10000, b.this);
                        b.this.a((b) poll);
                    }
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        @Override // com.dianping.nvnetwork.tunnel2.b
        public final synchronized void a(b.a<h> aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = m;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db75bb5acc8106304419c8c54e827e07", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db75bb5acc8106304419c8c54e827e07");
            } else if (this.e) {
            } else {
                if (this.b.get() == 0) {
                    this.d = aVar;
                    this.h = System.currentTimeMillis();
                    com.sankuai.android.jarvis.c.a("connect_racing_thread_jarvis", "connect_racing_thread", 60L).execute(new a());
                }
                this.e = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a extends com.dianping.nvnetwork.tunnel2.b<h> {
        public static ChangeQuickRedirect i;
        final AtomicInteger j;
        a.InterfaceC0102a<h> k;

        public static /* synthetic */ void a(a aVar, h hVar) {
            Object[] objArr = {hVar};
            ChangeQuickRedirect changeQuickRedirect = i;
            if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "bcc7fec101c3fa2234b2ea5dbbbb02cc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "bcc7fec101c3fa2234b2ea5dbbbb02cc");
                return;
            }
            hVar.h();
            c.this.b.add(hVar);
            c.this.b.notifyAll();
        }

        public a(a.C0100a c0100a) {
            super(c0100a, com.dianping.nvnetwork.h.h().K ? 1 : com.dianping.nvnetwork.h.h().H);
            Object[] objArr = {c.this, c0100a};
            ChangeQuickRedirect changeQuickRedirect = i;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8cc96a86093ef14e9f8d69ff994e2c4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8cc96a86093ef14e9f8d69ff994e2c4");
                return;
            }
            this.j = new AtomicInteger(0);
            this.k = new a.InterfaceC0102a<h>() { // from class: com.dianping.nvnetwork.tunnel2.c.a.2
                public static ChangeQuickRedirect a;

                @Override // com.dianping.nvnetwork.tunnel2.a.InterfaceC0102a
                public final /* synthetic */ void a(h hVar, int i2) {
                    h hVar2 = hVar;
                    Object[] objArr2 = {hVar2, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "13a2d69b0e20aaf308a7e939cbea2652", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "13a2d69b0e20aaf308a7e939cbea2652");
                        return;
                    }
                    synchronized (c.this.b) {
                        if (c.this.b.size() < com.dianping.nvnetwork.h.h().H) {
                            a.a(a.this, hVar2);
                            com.dianping.nvnetwork.util.g.a("normal connect success:" + hVar2.c + " time:" + i2 + "ms");
                            com.dianping.nvnetwork.util.i.a("normal connect success:" + hVar2.c + " time:" + i2 + "ms");
                        } else {
                            hVar2.a();
                        }
                    }
                    if (a.this.j.get() > 0) {
                        a.this.j.decrementAndGet();
                    }
                    if (a.this.j.get() == 0) {
                        c.this.d.set(null);
                        com.dianping.nvnetwork.util.i.a("shark connect racing task complete with success.");
                    }
                }

                @Override // com.dianping.nvnetwork.tunnel2.a.InterfaceC0102a
                public final /* synthetic */ void a(h hVar, int i2, Object obj) {
                    h hVar2 = hVar;
                    Object[] objArr2 = {hVar2, Integer.valueOf(i2), obj};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6744b4088b5f1053b411c204974dc998", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6744b4088b5f1053b411c204974dc998");
                        return;
                    }
                    if (a.this.j.get() > 0) {
                        a.this.j.decrementAndGet();
                    }
                    com.dianping.nvnetwork.util.g.a("normal connect fail:" + hVar2.c);
                    com.dianping.nvnetwork.util.i.a("normal connect fail:" + hVar2.c);
                    if (a.this.j.get() == 0) {
                        c.this.d.set(null);
                    }
                }
            };
        }

        @Override // com.dianping.nvnetwork.tunnel2.b
        /* renamed from: b */
        public final h a(SocketAddress socketAddress) {
            Object[] objArr = {socketAddress};
            ChangeQuickRedirect changeQuickRedirect = i;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f6ce5808fd868e2a005c1966a569036", 6917529027641081856L) ? (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f6ce5808fd868e2a005c1966a569036") : new h(c.this.e, socketAddress);
        }

        public final synchronized void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = i;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f53fbc4efb53f0070ffdb4a5f50a2ebf", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f53fbc4efb53f0070ffdb4a5f50a2ebf");
                return;
            }
            if (!this.e) {
                a(new b.a<h>() { // from class: com.dianping.nvnetwork.tunnel2.c.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.dianping.nvnetwork.tunnel2.b.a
                    public final /* synthetic */ void a(h hVar, int i2) {
                        h hVar2 = hVar;
                        Object[] objArr2 = {hVar2, Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d2f27e0756c4f07f6555ca441c92b0ac", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d2f27e0756c4f07f6555ca441c92b0ac");
                        } else if (a.this.g == 1) {
                            a.this.j.set(0);
                            synchronized (c.this.b) {
                                a.a(a.this, hVar2);
                                if (c.this.b.size() < com.dianping.nvnetwork.h.h().H) {
                                    for (int i3 = 0; i3 < com.dianping.nvnetwork.h.h().H - c.this.b.size(); i3++) {
                                        h hVar3 = new h(c.this.e, hVar2.c);
                                        a.this.j.incrementAndGet();
                                        hVar3.a(10000, a.this.k);
                                    }
                                } else {
                                    c.this.d.set(null);
                                    com.dianping.nvnetwork.util.g.a("tunnel", " shark connect racing task complete with success");
                                    com.dianping.nvnetwork.util.i.a("shark connect racing task complete with success.");
                                }
                            }
                        } else {
                            synchronized (c.this.b) {
                                if (c.this.b.size() < com.dianping.nvnetwork.h.h().H) {
                                    a.a(a.this, hVar2);
                                } else {
                                    hVar2.a();
                                }
                            }
                        }
                    }

                    @Override // com.dianping.nvnetwork.tunnel2.b.a
                    public final void a(int i2) {
                        Object[] objArr2 = {Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e7898b00449c152ef20381088d6e1214", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e7898b00449c152ef20381088d6e1214");
                        } else if (a.this.g > 1) {
                            c.this.d.set(null);
                            com.dianping.nvnetwork.util.i.a("shark connect racing task complete with success.");
                        }
                    }

                    @Override // com.dianping.nvnetwork.tunnel2.b.a
                    public final void a(Object obj) {
                        Object[] objArr2 = {obj};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cec0a16ff7ea2f3bbaf7913a9b88a4d5", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cec0a16ff7ea2f3bbaf7913a9b88a4d5");
                            return;
                        }
                        c.this.c.a(a.this.c);
                        c.this.d.set(null);
                        com.dianping.nvnetwork.util.i.a("shark connect racing task complete with fail.");
                    }
                });
            }
        }
    }
}
