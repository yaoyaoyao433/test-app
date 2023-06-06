package com.dianping.nvtunnelkit.ext;

import com.dianping.nvtunnelkit.conn.b;
import com.dianping.nvtunnelkit.ext.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class g<T extends com.dianping.nvtunnelkit.conn.b> extends com.dianping.nvtunnelkit.core.g<T> implements com.dianping.nvtunnelkit.core.e<T> {
    public static ChangeQuickRedirect c;
    private static final String e = com.dianping.nvtunnelkit.logger.a.a("NvRacingConnectionManager");
    protected int d;
    private final List<T> f;
    private boolean g;
    private final AtomicBoolean h;

    public abstract a<T> b(int i);

    public abstract void c(int i);

    public abstract void g();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.core.g, com.dianping.nvtunnelkit.conn.d
    public /* bridge */ /* synthetic */ void a(com.dianping.nvtunnelkit.conn.c cVar) {
        a((g<T>) ((com.dianping.nvtunnelkit.conn.b) cVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.core.e
    public /* synthetic */ void c(com.dianping.nvtunnelkit.conn.c cVar) {
        b((g<T>) ((com.dianping.nvtunnelkit.conn.b) cVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.nvtunnelkit.core.e
    public /* synthetic */ void d(com.dianping.nvtunnelkit.conn.c cVar) {
        c((g<T>) ((com.dianping.nvtunnelkit.conn.b) cVar));
    }

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5bac951977cc6bb5db95e6446a99970", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5bac951977cc6bb5db95e6446a99970");
            return;
        }
        this.d = 2;
        this.f = (List<T>) this.b;
        this.h = new AtomicBoolean(false);
    }

    @Override // com.dianping.nvtunnelkit.core.e
    public final void a(boolean z) {
        this.g = z;
    }

    @Override // com.dianping.nvtunnelkit.core.e
    public final void a(int i) {
        this.d = i;
    }

    public void a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fd4aea6b312595df0e4a8327ced7158", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fd4aea6b312595df0e4a8327ced7158");
            return;
        }
        synchronized (this.f) {
            if (this.f.size() < this.d) {
                super.a((g<T>) t);
            }
        }
    }

    @Override // com.dianping.nvtunnelkit.core.e
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2ee72699972e4fb12fd3d945f46c0a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2ee72699972e4fb12fd3d945f46c0a6");
            return;
        }
        com.dianping.nvtunnelkit.logger.b.a(e(), "prepareConnections....");
        synchronized (this.f) {
            if (f()) {
                int size = this.f.size();
                ArrayList arrayList = new ArrayList();
                List<SocketAddress> c2 = c();
                if (c2 != null) {
                    arrayList.addAll(c2);
                }
                if (size == 0 && !this.g) {
                    this.h.set(true);
                    c(arrayList);
                    return;
                }
                if (size > 0) {
                    b(arrayList);
                }
                if (arrayList.size() == 0) {
                    return;
                }
                this.h.set(true);
                c(arrayList);
            }
        }
    }

    public final boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29f3c96a446054f85335b8230243afa3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29f3c96a446054f85335b8230243afa3")).booleanValue();
        }
        synchronized (this.f) {
            if (this.h.get()) {
                com.dianping.nvtunnelkit.logger.b.a(e(), "connection racing task started.");
                return false;
            }
            int size = this.f.size();
            if (size >= this.d) {
                com.dianping.nvtunnelkit.logger.b.a(e(), "max connection count reached.");
                return false;
            } else if (size > 0 && !this.g) {
                com.dianping.nvtunnelkit.logger.b.a(e(), "single connection is active.");
                return false;
            } else {
                ArrayList arrayList = new ArrayList();
                List<SocketAddress> c2 = c();
                if (c2 != null) {
                    arrayList.addAll(c2);
                }
                if (size > 0) {
                    b(arrayList);
                }
                return arrayList.size() != 0;
            }
        }
    }

    private void b(List<SocketAddress> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e533b86e866e8be4bc893dbbb9fb057", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e533b86e866e8be4bc893dbbb9fb057");
            return;
        }
        Iterator<SocketAddress> it = list.iterator();
        while (it.hasNext()) {
            SocketAddress next = it.next();
            Iterator<T> it2 = this.f.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (next.equals(it2.next().w())) {
                    it.remove();
                    break;
                }
            }
        }
    }

    private void c(List<SocketAddress> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37ed19b466e085d2a11fac35f72edda5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37ed19b466e085d2a11fac35f72edda5");
            return;
        }
        int a = (this.g ? this.d : 1) - com.dianping.nvtunnelkit.utils.a.a(this.f);
        if (a <= 0) {
            this.h.set(false);
            com.dianping.nvtunnelkit.logger.b.b(e(), "add connection needConnectCount is less 0.");
            return;
        }
        a<T> b = b(a);
        if (b == null) {
            throw new RuntimeException("connectRacingTask cannot be null.");
        }
        b.c = this;
        b.a(list, new a.InterfaceC0106a() { // from class: com.dianping.nvtunnelkit.ext.g.1
            public static ChangeQuickRedirect a;

            @Override // com.dianping.nvtunnelkit.ext.a.InterfaceC0106a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "377d0ae5c3d19130bf02f8167102af68", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "377d0ae5c3d19130bf02f8167102af68");
                } else {
                    g.this.g();
                }
            }

            @Override // com.dianping.nvtunnelkit.ext.a.InterfaceC0106a
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "39b911f47e41bfcbf742e00296ae6675", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "39b911f47e41bfcbf742e00296ae6675");
                    return;
                }
                synchronized (g.this.f) {
                    g.this.c(g.this.f.size());
                    com.dianping.nvtunnelkit.logger.b.b(g.this.e(), "connection racing completed.");
                    g.this.h.set(false);
                }
            }
        });
    }

    @Override // com.dianping.nvtunnelkit.core.e
    public void a(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7ae160d9393b1283b9cf51f9544048b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7ae160d9393b1283b9cf51f9544048b");
        } else if (list != null) {
            synchronized (this.f) {
                list.addAll(this.f);
            }
        }
    }

    public void b(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a64a85fab88fb313e397ef1553bc1013", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a64a85fab88fb313e397ef1553bc1013");
            return;
        }
        synchronized (this.f) {
            this.f.remove(t);
        }
        t.s();
    }

    public void c(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b83d68c8b338db4422b5dbb8aba6cb5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b83d68c8b338db4422b5dbb8aba6cb5d");
            return;
        }
        synchronized (this.f) {
            if (!this.f.contains(t)) {
                t.t();
            }
        }
    }

    @Override // com.dianping.nvtunnelkit.core.g
    public String e() {
        return e;
    }

    @Override // com.dianping.nvtunnelkit.core.e
    public void d() {
        ArrayList<com.dianping.nvtunnelkit.conn.b> arrayList;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9edeae7f6372c93c5378c4bd0b6afa9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9edeae7f6372c93c5378c4bd0b6afa9e");
            return;
        }
        com.dianping.nvtunnelkit.logger.b.b(e(), "close Connections.");
        synchronized (this.f) {
            arrayList = new ArrayList(this.f);
            this.f.clear();
        }
        for (com.dianping.nvtunnelkit.conn.b bVar : arrayList) {
            bVar.s();
        }
    }
}
