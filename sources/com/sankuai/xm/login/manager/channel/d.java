package com.sankuai.xm.login.manager.channel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.f;
import com.sankuai.xm.login.net.g;
import com.sankuai.xm.login.net.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d implements com.sankuai.xm.login.net.a {
    public static ChangeQuickRedirect a;
    a b;
    volatile int c;
    c d;
    volatile boolean e;
    volatile boolean f;
    public volatile com.sankuai.xm.login.manager.lvs.b g;
    private com.sankuai.xm.login.net.a h;
    private Map<Integer, com.sankuai.xm.login.manager.lvs.a> i;
    private volatile long j;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(com.sankuai.xm.login.manager.lvs.a aVar);

        void a(com.sankuai.xm.login.manager.lvs.a aVar, boolean z);

        void a(boolean z, int i, int i2);

        void c();
    }

    public d(a aVar, com.sankuai.xm.login.net.a aVar2, com.sankuai.xm.login.manager.lvs.b bVar) {
        Object[] objArr = {aVar, aVar2, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc473edb10f0b029c40e940627e8652e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc473edb10f0b029c40e940627e8652e");
            return;
        }
        this.b = new b(aVar);
        this.h = aVar2;
        this.c = -1;
        this.i = new HashMap(3);
        this.d = new c();
        this.j = -1L;
        this.e = false;
        this.f = false;
        this.g = bVar;
    }

    public final com.sankuai.xm.login.manager.lvs.a a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17fb1ff7605f153ffa496bc608c5151d", 6917529027641081856L)) {
            return (com.sankuai.xm.login.manager.lvs.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17fb1ff7605f153ffa496bc608c5151d");
        }
        synchronized (this.i) {
            com.sankuai.xm.login.manager.lvs.a aVar = this.i.get(Integer.valueOf(i));
            if (aVar != null) {
                return aVar;
            }
            return null;
        }
    }

    @Override // com.sankuai.xm.login.net.a
    public final void c(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8cfe46b1f95e9424c3d02e4e2de5add", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8cfe46b1f95e9424c3d02e4e2de5add");
            return;
        }
        com.sankuai.xm.login.d.a("Connector::onConnected:: link id is " + i + " mLinkId=" + this.c + " connect time=" + i2);
        if (this.c == -1) {
            this.c = i;
            this.h.c(i, i2);
            g.a().a(i, 1);
            this.b.a(a(i), true);
        }
        b(this.c);
        this.b.a(true, 1, 0);
    }

    @Override // com.sankuai.xm.login.net.a
    public final void a(int i, com.sankuai.xm.login.net.mempool.heap.b bVar) {
        Object[] objArr = {Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3659aa6c03a3ceb54928853e5168355", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3659aa6c03a3ceb54928853e5168355");
            return;
        }
        com.sankuai.xm.login.d.a("Connector::onData:: link id is " + i);
        if (this.c == i) {
            this.h.a(i, bVar);
        }
    }

    @Override // com.sankuai.xm.login.net.a
    public final void a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c468b4fff5d58746fc7d218b0b726f3c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c468b4fff5d58746fc7d218b0b726f3c");
            return;
        }
        com.sankuai.xm.login.d.a("Connector::onDisconnected:: link id is " + i + " mLinkId=" + this.c + " disconnect time=" + i3);
        if (this.c == -1) {
            c(i);
            a(0, i2);
        } else if (this.c == i) {
            this.h.a(i, i2, i3);
        }
    }

    @Override // com.sankuai.xm.login.net.a
    public final void d(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "180e526a10daa3e4bd54665c0913b2d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "180e526a10daa3e4bd54665c0913b2d8");
            return;
        }
        com.sankuai.xm.login.d.a("Connector::onTimeout:: link id is " + i + " mLinkId=" + this.c + ", id is " + i2);
        if (this.c == -1) {
            c(i);
            a(1, 111);
        } else if (this.c == i) {
            this.h.d(i, i2);
        }
    }

    @Override // com.sankuai.xm.login.net.a
    public final void a(int i, String str, byte[] bArr, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), str, bArr, Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca91ef4ac054c6077f475e10029176f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca91ef4ac054c6077f475e10029176f5");
            return;
        }
        com.sankuai.xm.login.d.a("Connector::onRequestOverLimit:: link id is " + i);
        if (this.c == i) {
            this.h.a(i, str, bArr, i2, i3);
        }
    }

    private void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f2c9245e91e824cbacc83dd31449676", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f2c9245e91e824cbacc83dd31449676");
            return;
        }
        com.sankuai.xm.login.d.a("Connector::retryConnections:: reason=" + i + " mScheduleTaskId=" + this.j);
        if (!com.sankuai.xm.network.analyse.d.c().a()) {
            com.sankuai.xm.login.d.a("Connector::retryConnections:: hasNet false");
            if (c() == 0) {
                b();
                this.b.a(false, 2, 112);
            }
        } else if (c() == 0) {
            if (!this.d.a()) {
                com.sankuai.xm.login.d.a("Connector::retryConnections:: hasUnusedAddressCandidates false");
                b();
                this.b.a(false, i, i2);
                return;
            }
            com.sankuai.xm.login.d.a("Connector::retryConnections::getConnectionCount() = 0, mScheduleTaskId = " + this.j);
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bd85159e798a3d6fa8ffdc59c9ec805", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bd85159e798a3d6fa8ffdc59c9ec805")).booleanValue();
        }
        if (d()) {
            f();
            return true;
        }
        g();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88dad50a63d5d74c8a9381ca7454ea99", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88dad50a63d5d74c8a9381ca7454ea99");
            return;
        }
        b(this.c);
        if (this.c != -1) {
            g.a().b(this.c);
            g.a().a(this.c);
            this.c = -1;
        }
    }

    private void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00d0949742571d6f3221d3a62efda4e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00d0949742571d6f3221d3a62efda4e8");
            return;
        }
        g();
        d(i);
    }

    private boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa0cc9dde0dd157f97739a202aa35b02", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa0cc9dde0dd157f97739a202aa35b02")).booleanValue();
        }
        if (e()) {
            return false;
        }
        com.sankuai.xm.login.manager.lvs.a a2 = this.d.a(true);
        if (a2 == null) {
            com.sankuai.xm.login.d.c("Connector::newConnection:: no available address", new Object[0]);
            return false;
        }
        com.sankuai.xm.login.d.a("Connector::newConnection");
        if (!this.e && this.d.b() == 0) {
            this.e = true;
        }
        if (this.e && !this.f) {
            com.sankuai.xm.network.analyse.d.c().a(f.m().i());
            this.f = true;
        }
        this.e = true;
        a(g.a().a(this), a2);
        return true;
    }

    private boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdf5bb222b4f983eca4dce96a280dcc1", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdf5bb222b4f983eca4dce96a280dcc1")).booleanValue();
        }
        if (c() >= 3) {
            com.sankuai.xm.login.d.c("Connector::newConnection:: current count is more than 3", new Object[0]);
            return true;
        }
        return false;
    }

    private boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00e57e23b94b214a0c33be643cf7f55d", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00e57e23b94b214a0c33be643cf7f55d")).booleanValue();
        }
        g();
        this.j = g.a().a(new com.sankuai.xm.login.net.taskqueue.base.b() { // from class: com.sankuai.xm.login.manager.channel.d.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.login.net.taskqueue.base.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4df036c615df6d63fb54dfa76876e9ea", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4df036c615df6d63fb54dfa76876e9ea");
                } else {
                    d.this.a();
                }
            }
        }, 4000L, false);
        return this.j != -1;
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce871fb1e6fb7d1a974067e964b2deda", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce871fb1e6fb7d1a974067e964b2deda");
        } else if (this.j != -1) {
            g.a().a(this.j);
            this.j = -1L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        int size;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "643ae1e1afb2a217f3446df13f92fc4c", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "643ae1e1afb2a217f3446df13f92fc4c")).intValue();
        }
        synchronized (this.i) {
            size = this.i.size();
        }
        return size;
    }

    private void a(int i, com.sankuai.xm.login.manager.lvs.a aVar) {
        Object[] objArr = {Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24aba317379724f2a8e2d87c66631f40", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24aba317379724f2a8e2d87c66631f40");
            return;
        }
        String a2 = com.sankuai.xm.login.manager.lvs.b.a(aVar);
        short s = aVar.c;
        com.sankuai.xm.login.d.a("Connector::addConnection::  link id is " + i + ", address " + a2 + ", port " + ((int) s));
        g.a().a(i, a2, s);
        g.a().a(i, 1, 10000);
        synchronized (this.i) {
            this.i.put(Integer.valueOf(i), aVar);
        }
        this.b.a(aVar);
    }

    private com.sankuai.xm.login.manager.lvs.a c(int i) {
        com.sankuai.xm.login.manager.lvs.a remove;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d8c611d856e2f17ca173145ab10e765", 6917529027641081856L)) {
            return (com.sankuai.xm.login.manager.lvs.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d8c611d856e2f17ca173145ab10e765");
        }
        g.a().b(i);
        g a2 = g.a();
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = h.b;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "7166a6af91a932a3b7b6041f8067bd83", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "7166a6af91a932a3b7b6041f8067bd83");
        } else {
            com.sankuai.xm.login.net.d dVar = a2.c.get(Integer.valueOf(i));
            if (dVar != null) {
                dVar.a(false, 15);
                a2.c.remove(Integer.valueOf(i));
            } else {
                com.sankuai.xm.login.d.a("SocketQueue.closeSync => invalid linkId=" + i);
            }
            com.sankuai.xm.login.d.a("SocketQueue::closeSync => link id = " + i);
        }
        synchronized (this.i) {
            remove = this.i.remove(Integer.valueOf(i));
        }
        if (remove != null) {
            this.b.a(remove, false);
        }
        return remove;
    }

    private void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30943a93f98d7fb6dea2c2ca88a83b02", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30943a93f98d7fb6dea2c2ca88a83b02");
            return;
        }
        synchronized (this.i) {
            for (Integer num : this.i.keySet()) {
                int intValue = num.intValue();
                if (intValue != i) {
                    g.a().b(intValue);
                    g.a().a(intValue);
                }
            }
            this.i.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class c {
        public static ChangeQuickRedirect a;
        private List<a> c;

        /* compiled from: ProGuard */
        /* loaded from: classes6.dex */
        public class a {
            public static ChangeQuickRedirect a;
            com.sankuai.xm.login.manager.lvs.a b;
            boolean c;

            public a(com.sankuai.xm.login.manager.lvs.a aVar, boolean z) {
                Object[] objArr = {c.this, aVar, (byte) 0};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1165c80a68864a4e0f81ca062ba71d4e", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1165c80a68864a4e0f81ca062ba71d4e");
                    return;
                }
                this.b = aVar;
                this.c = false;
            }
        }

        private c() {
            Object[] objArr = {d.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "665d9817e92b632924758faf2aa7dd83", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "665d9817e92b632924758faf2aa7dd83");
            } else {
                this.c = new ArrayList();
            }
        }

        boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2aa591af0cc45d776e9e21fa169acb4a", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2aa591af0cc45d776e9e21fa169acb4a")).booleanValue() : b() > 0;
        }

        int b() {
            int i = 0;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92d916e8e7653867e27b85faaebfef11", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92d916e8e7653867e27b85faaebfef11")).intValue();
            }
            synchronized (this.c) {
                for (a aVar : this.c) {
                    if (!aVar.c) {
                        i++;
                    }
                }
            }
            return i;
        }

        com.sankuai.xm.login.manager.lvs.a a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9bb546b0b789a92dc431f00fba8d68d", 6917529027641081856L)) {
                return (com.sankuai.xm.login.manager.lvs.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9bb546b0b789a92dc431f00fba8d68d");
            }
            synchronized (this.c) {
                for (a aVar : this.c) {
                    if (!aVar.c) {
                        if (z) {
                            aVar.c = true;
                        }
                        return aVar.b;
                    }
                }
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0988667f082ed9714743ebfbc75f3423", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0988667f082ed9714743ebfbc75f3423");
                return;
            }
            synchronized (this.c) {
                this.c.clear();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(List<com.sankuai.xm.login.manager.lvs.a> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01370aa731ea607d6f72c25d0646fbd7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01370aa731ea607d6f72c25d0646fbd7");
                return;
            }
            synchronized (this.c) {
                this.c.clear();
                if (list != null) {
                    for (com.sankuai.xm.login.manager.lvs.a aVar : list) {
                        this.c.add(new a(aVar, false));
                    }
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    class b implements a {
        public static ChangeQuickRedirect a;
        private a c;

        private b(a aVar) {
            Object[] objArr = {d.this, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "886b570597c7b41043665d744cb1afbf", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "886b570597c7b41043665d744cb1afbf");
            } else {
                this.c = aVar;
            }
        }

        @Override // com.sankuai.xm.login.manager.channel.d.a
        public final void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18d33ea318caece34a2683c6cbd5245e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18d33ea318caece34a2683c6cbd5245e");
            } else {
                this.c.c();
            }
        }

        @Override // com.sankuai.xm.login.manager.channel.d.a
        public final void a(com.sankuai.xm.login.manager.lvs.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dbf51fa49840288dbd4a7011735ce3e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dbf51fa49840288dbd4a7011735ce3e");
            } else {
                this.c.a(aVar);
            }
        }

        @Override // com.sankuai.xm.login.manager.channel.d.a
        public final void a(com.sankuai.xm.login.manager.lvs.a aVar, boolean z) {
            Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00b8dcbe233dc9981efca9202948319b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00b8dcbe233dc9981efca9202948319b");
            } else if (aVar != null) {
                this.c.a(aVar, z);
                StringBuilder sb = new StringBuilder("Connector::onAddressStop:: result = ");
                sb.append(z);
                sb.append(", address = ");
                sb.append(aVar != null ? aVar.toString() : null);
                com.sankuai.xm.login.d.a(sb.toString());
            }
        }

        @Override // com.sankuai.xm.login.manager.channel.d.a
        public final void a(boolean z, int i, int i2) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e366ed16c97867da477e449aef6c3bb9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e366ed16c97867da477e449aef6c3bb9");
                return;
            }
            com.sankuai.xm.login.d.a("Connector::onStop:: result = " + z + " reason=" + i + " appstate=" + f.m().f);
            d.this.f = false;
            d.this.e = false;
            this.c.a(z, i, i2);
        }
    }
}
