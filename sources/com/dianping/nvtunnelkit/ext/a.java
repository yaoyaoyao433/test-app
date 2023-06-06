package com.dianping.nvtunnelkit.ext;

import com.dianping.nvtunnelkit.conn.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class a<T extends com.dianping.nvtunnelkit.conn.b> implements com.dianping.nvtunnelkit.conn.d<T> {
    public static ChangeQuickRedirect a;
    com.dianping.nvtunnelkit.conn.d b;
    com.dianping.nvtunnelkit.core.e<T> c;
    protected rx.g d;
    private String e;
    private int f;
    private int g;
    private InterfaceC0106a h;
    private List<T> i;

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.nvtunnelkit.ext.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0106a {
        void a();

        void b();
    }

    public abstract T a(SocketAddress socketAddress);

    @Override // com.dianping.nvtunnelkit.conn.d
    public final /* bridge */ /* synthetic */ void a(com.dianping.nvtunnelkit.conn.c cVar, Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.conn.d
    public final /* synthetic */ void a(com.dianping.nvtunnelkit.conn.c cVar) {
        com.dianping.nvtunnelkit.conn.b bVar = (com.dianping.nvtunnelkit.conn.b) cVar;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce6516d0c2d19a0e87c54b6639cb7686", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce6516d0c2d19a0e87c54b6639cb7686");
        } else {
            a((a<T>) bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.conn.d
    public final /* synthetic */ void b(com.dianping.nvtunnelkit.conn.c cVar) {
        com.dianping.nvtunnelkit.conn.b bVar = (com.dianping.nvtunnelkit.conn.b) cVar;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3deed1125c3f3175595dd65fe78594c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3deed1125c3f3175595dd65fe78594c");
        } else {
            a((a<T>) bVar);
        }
    }

    public a(com.dianping.nvtunnelkit.conn.d dVar, int i) {
        Object[] objArr = {dVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4be5dc37864fe53cb8678a89bf0e6d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4be5dc37864fe53cb8678a89bf0e6d8");
            return;
        }
        this.e = com.dianping.nvtunnelkit.logger.a.a("ConnectRacingTask");
        this.d = rx.schedulers.a.e();
        this.b = dVar;
        this.f = i;
        this.i = new ArrayList();
    }

    public final void a(List<SocketAddress> list, InterfaceC0106a interfaceC0106a) {
        Object[] objArr = {list, interfaceC0106a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cb4c9bfa06ac8ab21b82872d79bfc47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cb4c9bfa06ac8ab21b82872d79bfc47");
        } else if (this.c == null) {
            throw new RuntimeException("attach method should be called before.");
        } else {
            this.h = interfaceC0106a;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "48c0573f8c63b17444f901c283bc28e3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "48c0573f8c63b17444f901c283bc28e3");
            } else {
                com.dianping.nvtunnelkit.logger.b.a(a(), "sendRacingStarted.....");
                if (this.h != null) {
                    this.h.a();
                }
            }
            this.g = com.dianping.nvtunnelkit.utils.a.a(list);
            if (this.g <= 0 || this.f <= 0) {
                b();
                return;
            }
            com.dianping.nvtunnelkit.logger.b.b(a(), "startConnectRacing connectionCount: " + this.g + ", maxConnectionCount: " + this.f);
            rx.d.a(new com.dianping.nvtunnelkit.core.j(), rx.d.a(list).d(new rx.functions.g<List<SocketAddress>, List<T>>() { // from class: com.dianping.nvtunnelkit.ext.a.2
                public static ChangeQuickRedirect a;

                @Override // rx.functions.g
                public final /* synthetic */ Object call(List<SocketAddress> list2) {
                    List<SocketAddress> list3 = list2;
                    Object[] objArr3 = {list3};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5f360047ce6e0360fd4a488be6e2b59e", RobustBitConfig.DEFAULT_VALUE)) {
                        return (List) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5f360047ce6e0360fd4a488be6e2b59e");
                    }
                    ArrayList arrayList = new ArrayList(list3.size());
                    for (SocketAddress socketAddress : list3) {
                        com.dianping.nvtunnelkit.conn.b a2 = a.this.a(socketAddress);
                        a2.a(a.this.b);
                        a2.a((com.dianping.nvtunnelkit.conn.d) a.this);
                        arrayList.add(a2);
                        com.dianping.nvtunnelkit.logger.b.a(a.this.a(), "start ready connect to : " + a2.q);
                    }
                    return arrayList;
                }
            }).b((rx.functions.b) new rx.functions.b<List<T>>() { // from class: com.dianping.nvtunnelkit.ext.a.1
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(Object obj) {
                    List<com.dianping.nvtunnelkit.conn.b> list2 = (List) obj;
                    Object[] objArr3 = {list2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "50306663babc56e927fd337d18b651f5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "50306663babc56e927fd337d18b651f5");
                        return;
                    }
                    for (com.dianping.nvtunnelkit.conn.b bVar : list2) {
                        bVar.a(bVar.l.d);
                    }
                }
            }).b(this.d));
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c03e0bf64923534b9b34edc080cbd507", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c03e0bf64923534b9b34edc080cbd507");
            return;
        }
        com.dianping.nvtunnelkit.logger.b.a(a(), "sendRacingCompleted.....");
        if (this.h != null) {
            this.h.b();
        }
    }

    private void a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b95d0236693db977b9197ae984ce9116", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b95d0236693db977b9197ae984ce9116");
            return;
        }
        synchronized (this) {
            if (this.i.contains(t)) {
                return;
            }
            String a2 = com.dianping.nvtunnelkit.utils.g.a(t.m);
            com.dianping.nvtunnelkit.logger.b.b(a(), "racing result, addressIp: " + a2 + ", time: " + t.o() + "ms");
            t.b(this);
            this.i.add(t);
            if (com.dianping.nvtunnelkit.utils.a.a(this.i) != this.g) {
                return;
            }
            if (this.f >= this.g) {
                b();
                return;
            }
            for (int i = 0; i < this.g; i++) {
                T t2 = this.i.get(i);
                com.dianping.nvtunnelkit.logger.b.b(a(), "close, ip " + t2.q + ", time " + t2.o() + "ms");
                if (this.c != null) {
                    this.c.d(t2);
                } else {
                    t2.s();
                }
            }
            b();
        }
    }

    public String a() {
        return this.e;
    }
}
