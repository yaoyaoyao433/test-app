package com.sankuai.xm.login.manager;

import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.component.anno.Component;
import com.sankuai.xm.base.service.l;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.trace.annotation.Trace;
import com.sankuai.xm.base.trace.i;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.base.util.b;
import com.sankuai.xm.login.manager.b;
import com.sankuai.xm.login.manager.connect.b;
import com.sankuai.xm.login.manager.heartbeat.a;
import com.sankuai.xm.login.manager.lvs.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
@Component(type = f.class)
/* loaded from: classes6.dex */
public class f extends d implements com.sankuai.xm.base.component.a, com.sankuai.xm.base.component.d, b.a, a.InterfaceC1410a, b.a {
    public static ChangeQuickRedirect b;
    public volatile int c;
    public volatile com.sankuai.xm.network.setting.e d;
    public Map<Integer, com.sankuai.xm.login.manager.lvs.b> e;
    private com.sankuai.xm.base.component.e f;
    private com.sankuai.xm.base.component.e g;
    private com.sankuai.xm.base.component.e h;
    private String i;
    private int j;
    private long k;
    private boolean l;
    private volatile boolean m;
    private volatile boolean n;
    private com.sankuai.xm.login.beans.c o;
    private com.sankuai.xm.base.component.e p;
    private com.sankuai.xm.base.component.e q;
    private final List<Object> r;
    private final ConcurrentHashMap<String, Object> s;
    private final Object t;

    private com.sankuai.xm.base.component.e i() {
        if (this.g == null) {
            synchronized (this.t) {
                if (this.g == null) {
                    this.g = new com.sankuai.xm.base.component.e(com.sankuai.xm.login.manager.connect.c.class, "mPolicy", this);
                }
            }
        }
        return this.g;
    }

    @Override // com.sankuai.xm.base.component.d
    public final <T> T a(String str, Class<T> cls, com.sankuai.xm.base.component.b bVar) {
        Object obj;
        Object dVar;
        Object[] objArr = {str, cls, bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4da24392e3cc71cee9d90289c4b44e5c", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4da24392e3cc71cee9d90289c4b44e5c");
        }
        if ("mNetworkDetector".equals(str) && cls == com.sankuai.xm.login.manager.connect.b.class) {
            obj = new com.sankuai.xm.login.manager.connect.b((b.a) ((Object[]) this.s.remove("mNetworkDetector"))[0]);
        } else if ("mConnectionChannel".equals(str) && cls == com.sankuai.xm.login.manager.channel.b.class) {
            Object[] objArr2 = (Object[]) this.s.remove("mConnectionChannel");
            obj = new com.sankuai.xm.login.manager.channel.b((e) objArr2[0], (com.sankuai.xm.login.manager.lvs.b) objArr2[1]);
        } else {
            if ("mPolicy".equals(str) && cls == com.sankuai.xm.login.manager.connect.c.class) {
                dVar = new com.sankuai.xm.login.manager.connect.a();
            } else if ("mSocketStableCheck".equals(str) && cls == com.sankuai.xm.login.manager.connect.d.class) {
                dVar = new com.sankuai.xm.login.manager.connect.d();
            } else if ("mHeartBeatManager".equals(str) && cls == com.sankuai.xm.login.manager.heartbeat.c.class) {
                Object[] objArr3 = (Object[]) this.s.remove("mHeartBeatManager");
                obj = new com.sankuai.xm.login.manager.heartbeat.c((f) objArr3[0], (a.InterfaceC1410a) objArr3[1]);
            } else {
                obj = null;
            }
            obj = dVar;
        }
        if (obj instanceof com.sankuai.xm.base.component.a) {
            ((com.sankuai.xm.base.component.a) obj).a(bVar);
        }
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }

    public final com.sankuai.xm.base.component.e d() {
        if (this.h == null) {
            synchronized (this.t) {
                if (this.h == null) {
                    this.h = new com.sankuai.xm.base.component.e(com.sankuai.xm.login.manager.connect.b.class, "mNetworkDetector", this);
                }
            }
        }
        return this.h;
    }

    public final com.sankuai.xm.base.component.e e() {
        if (this.f == null) {
            synchronized (this.t) {
                if (this.f == null) {
                    this.f = new com.sankuai.xm.base.component.e(com.sankuai.xm.login.manager.channel.b.class, "mConnectionChannel", this);
                }
            }
        }
        return this.f;
    }

    public final com.sankuai.xm.base.component.e f() {
        if (this.q == null) {
            synchronized (this.t) {
                if (this.q == null) {
                    this.q = new com.sankuai.xm.base.component.e(com.sankuai.xm.login.manager.connect.d.class, "mSocketStableCheck", this);
                }
            }
        }
        return this.q;
    }

    public final com.sankuai.xm.base.component.e g() {
        if (this.p == null) {
            synchronized (this.t) {
                if (this.p == null) {
                    this.p = new com.sankuai.xm.base.component.e(com.sankuai.xm.login.manager.heartbeat.c.class, "mHeartBeatManager", this);
                }
            }
        }
        return this.p;
    }

    public static /* synthetic */ long a(f fVar, long j) {
        fVar.k = -1L;
        return -1L;
    }

    public static /* synthetic */ com.sankuai.xm.login.manager.heartbeat.c c(f fVar) {
        return (com.sankuai.xm.login.manager.heartbeat.c) fVar.g().a();
    }

    public static /* synthetic */ com.sankuai.xm.login.manager.connect.d d(f fVar) {
        return (com.sankuai.xm.login.manager.connect.d) fVar.f().a();
    }

    public static /* synthetic */ com.sankuai.xm.login.manager.channel.b f(f fVar) {
        return (com.sankuai.xm.login.manager.channel.b) fVar.e().a();
    }

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d372ceda4c4fe3bd4c5cc6b9e62148f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d372ceda4c4fe3bd4c5cc6b9e62148f");
            return;
        }
        this.s = new ConcurrentHashMap<>();
        this.t = new Object();
        this.c = 0;
        this.m = false;
        this.n = false;
        this.r = new ArrayList();
        this.e = new ConcurrentHashMap();
        this.s.put("mConnectionChannel", com.sankuai.xm.base.component.c.a(this, b(0)));
        this.f = null;
        this.s.put("mHeartBeatManager", com.sankuai.xm.base.component.c.a(this, this));
        this.p = null;
        this.s.put("mNetworkDetector", com.sankuai.xm.base.component.c.a(this));
        this.h = null;
        this.g = null;
        this.i = "";
        this.j = 0;
        this.k = -1L;
        this.l = false;
        this.q = null;
    }

    public com.sankuai.xm.login.manager.lvs.b b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f8838fce56f2796158cdd4323559302", 6917529027641081856L)) {
            return (com.sankuai.xm.login.manager.lvs.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f8838fce56f2796158cdd4323559302");
        }
        if (i != 0 && i != 1) {
            i = 0;
        }
        com.sankuai.xm.login.manager.lvs.b bVar = this.e.get(Integer.valueOf(i));
        if (bVar == null) {
            com.sankuai.xm.login.manager.lvs.b bVar2 = new com.sankuai.xm.login.manager.lvs.b(i);
            this.e.put(Integer.valueOf(i), bVar2);
            return bVar2;
        }
        return bVar;
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d51e107288c627f3b95d98eb9c206ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d51e107288c627f3b95d98eb9c206ba");
        } else if (!z && !com.sankuai.xm.base.f.m().i() && !com.sankuai.xm.base.f.m().h()) {
            com.sankuai.xm.login.d.a("ConnectionManager::connect:: in background not connect");
        } else {
            if (z) {
                ((com.sankuai.xm.login.manager.connect.c) i().a()).a();
            }
            com.sankuai.xm.login.manager.lvs.b b2 = b(this.c);
            boolean d = b2.d();
            com.sankuai.xm.login.d.b("ConnectionManager::connect:: hasCandidates: %s, count: %s", Boolean.valueOf(d), b2.e() + " appState=" + com.sankuai.xm.base.f.m().f + " has network=" + m.a().k());
            if (d) {
                a(z, this.c);
            } else if (!b2.c()) {
                if (!f(true)) {
                    f(5);
                }
                b2.a(a.a(0, z, this.c), this);
            } else {
                a(z, this.c);
            }
            this.l = true;
        }
    }

    public final void c(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c51b95e40a02b3517063bb3c9e04863", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c51b95e40a02b3517063bb3c9e04863");
            return;
        }
        com.sankuai.xm.login.d.a("ConnectionManager::disconnect:: force true");
        ((com.sankuai.xm.login.manager.channel.b) e().a()).a(-3);
        b(true);
    }

    private boolean f(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4d731f423f72b044a7d1593acbfdb2c", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4d731f423f72b044a7d1593acbfdb2c")).booleanValue() : ((com.sankuai.xm.login.manager.channel.b) e().a()).a() || (z && a() == 5);
    }

    private void e(int i) {
        boolean z = true;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21d861002553627fe3299e25f645656c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21d861002553627fe3299e25f645656c");
        } else if (this.n) {
            if (i != 4) {
                switch (i) {
                    case -6:
                    case -5:
                    case -4:
                    case -3:
                    case -2:
                    case -1:
                        break;
                    default:
                        z = false;
                        break;
                }
            }
            if (z) {
                this.m = false;
                this.n = false;
                synchronized (this.r) {
                    Iterator<Object> it = this.r.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    this.r.clear();
                }
            }
        }
    }

    public final boolean a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ae8a7c59c13c941a2b96c268b38e156", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ae8a7c59c13c941a2b96c268b38e156")).booleanValue() : a(bArr, false);
    }

    public final boolean a(byte[] bArr, boolean z) {
        Object[] objArr = {bArr, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e52d6b80422fc2b991ef48f6637263e3", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e52d6b80422fc2b991ef48f6637263e3")).booleanValue() : a((String) null, bArr, z);
    }

    public final boolean a(String str, byte[] bArr, boolean z) {
        Object[] objArr = {str, bArr, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b009b57ef9632280588f646ec7bcb30", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b009b57ef9632280588f646ec7bcb30")).booleanValue();
        }
        if (!b()) {
            com.sankuai.xm.login.d.a("ConnectionManager::send:: connect is not open");
            return false;
        }
        return ((com.sankuai.xm.login.manager.channel.b) e().a()).a(str, bArr, z);
    }

    public void cancel(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0374d861b46bca5affa7b1f1edeaa1a2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0374d861b46bca5affa7b1f1edeaa1a2");
        } else if (!b()) {
            com.sankuai.xm.login.d.a("ConnectionManager::send:: connect is not open");
        } else {
            ((com.sankuai.xm.login.manager.channel.b) e().a()).cancel(str);
        }
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c7ba1c0d01da335b9ac0a58cafe61ab", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c7ba1c0d01da335b9ac0a58cafe61ab")).intValue() : ((com.sankuai.xm.login.manager.channel.b) e().a()).c;
    }

    private void f(int i) {
        Object[] objArr = {5};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a33d56e3de7f59d7f2c75e2d5af4b79", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a33d56e3de7f59d7f2c75e2d5af4b79");
        } else {
            ((com.sankuai.xm.login.manager.channel.b) e().a()).b(5);
        }
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c218a46fc3a97f7e1bf23e6b06effd07", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c218a46fc3a97f7e1bf23e6b06effd07")).booleanValue() : a() == 4;
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf870075baae08e08b85fff37e0990cc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf870075baae08e08b85fff37e0990cc");
        } else {
            ((com.sankuai.xm.login.manager.channel.b) e().a()).b(i, i2);
        }
    }

    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99f4a59269179013065ed74065393439", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99f4a59269179013065ed74065393439");
        } else {
            ((com.sankuai.xm.login.manager.channel.b) e().a()).c(i);
        }
    }

    public final boolean d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c05cdb4e7f1796e953a97a2f83196599", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c05cdb4e7f1796e953a97a2f83196599")).booleanValue();
        }
        if (c()) {
            if (m.a().k()) {
                if (b()) {
                    ((com.sankuai.xm.login.manager.heartbeat.c) g().a()).a();
                } else {
                    e(z);
                }
            } else {
                if (b()) {
                    ((com.sankuai.xm.login.manager.heartbeat.c) g().a()).a();
                }
                e(false);
            }
            return true;
        }
        return false;
    }

    public final boolean e(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf544d9453127f1f1ef874eb68d585ad", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf544d9453127f1f1ef874eb68d585ad")).booleanValue();
        }
        if (m.a().k()) {
            a(z);
            return true;
        }
        ((com.sankuai.xm.login.manager.connect.b) d().a()).a(z ? 2 : 1);
        return false;
    }

    @Override // com.sankuai.xm.login.manager.d, com.sankuai.xm.login.manager.g
    public final void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fafa1f9217dd1cbf00880a8f8c8c357", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fafa1f9217dd1cbf00880a8f8c8c357");
            return;
        }
        com.sankuai.xm.login.d.a("ConnectionManager::onStatusChanged:: status = " + i);
        switch (i) {
            case -7:
                ((com.sankuai.xm.login.manager.heartbeat.c) g().a()).b();
                this.n = true;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f363b30a60992d7b7e2fd6e50f807ca", 6917529027641081856L)) {
                    String a2 = m.c().a("switch_conn_interval");
                    com.sankuai.xm.login.d.a("ConnectionManager::reconnectForSwitch:: intervalStr = " + a2);
                    Long b2 = ac.a(a2) ? null : ac.b(a2);
                    if (b2 == null || b2.longValue() <= 0) {
                        com.sankuai.xm.login.d.a("ConnectionManager::reconnectForSwitch:: reconnect immediately.");
                        e(true);
                        break;
                    } else {
                        if (b2.longValue() > 500) {
                            b2 = 500L;
                        }
                        com.sankuai.xm.login.d.a("ConnectionManager::reconnectForSwitch:: reconnect with delay " + b2);
                        m.e().a(11, j.a(new Runnable() { // from class: com.sankuai.xm.login.manager.f.2
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "82a0e0d50c55185309e5deb38450a7db", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "82a0e0d50c55185309e5deb38450a7db");
                                } else {
                                    f.this.e(true);
                                }
                            }
                        }), b2.longValue());
                        break;
                    }
                } else {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f363b30a60992d7b7e2fd6e50f807ca");
                    break;
                }
                break;
            case -6:
            case -5:
            case -1:
                ((com.sankuai.xm.login.manager.heartbeat.c) g().a()).b();
                e(false);
                break;
            case -4:
            case -3:
            case -2:
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
                ((com.sankuai.xm.login.manager.heartbeat.c) g().a()).b();
                break;
            case 4:
                ((com.sankuai.xm.login.manager.connect.c) i().a()).a();
                com.sankuai.xm.login.manager.heartbeat.c cVar = (com.sankuai.xm.login.manager.heartbeat.c) g().a();
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.login.manager.heartbeat.c.a;
                if (!PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "fad2c34c731db3e7243cb80b6256e51b", 6917529027641081856L)) {
                    cVar.b.a();
                    break;
                } else {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "fad2c34c731db3e7243cb80b6256e51b");
                    break;
                }
        }
        ((com.sankuai.xm.login.manager.heartbeat.c) g().a()).d(i);
        e(i);
        super.d(i);
    }

    @Override // com.sankuai.xm.login.manager.d, com.sankuai.xm.login.manager.g
    public final void b(int i, byte[] bArr) {
        Object[] objArr = {Integer.valueOf(i), bArr};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69bb097c5d6a5f58b3f943d4df5b215d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69bb097c5d6a5f58b3f943d4df5b215d");
            return;
        }
        if (i == 196727) {
            Object[] objArr2 = {bArr};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "962871874c484c1780408e683a08eca4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "962871874c484c1780408e683a08eca4");
            } else {
                com.sankuai.xm.base.proto.protosingal.b bVar = new com.sankuai.xm.base.proto.protosingal.b();
                bVar.a(bArr);
                com.sankuai.xm.base.proto.protosingal.c cVar = new com.sankuai.xm.base.proto.protosingal.c();
                cVar.b = com.sankuai.xm.login.a.a().b;
                cVar.c = bVar.b;
                a(cVar.bS_());
            }
        }
        ((com.sankuai.xm.login.manager.heartbeat.c) g().a()).b(i, bArr);
        super.b(i, bArr);
    }

    @Override // com.sankuai.xm.login.manager.d, com.sankuai.xm.login.manager.e
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c326977052416eb17f0af47a1d38562", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c326977052416eb17f0af47a1d38562");
            return;
        }
        ((com.sankuai.xm.login.manager.heartbeat.c) g().a()).a(i);
        super.a(i);
    }

    @Override // com.sankuai.xm.login.manager.d, com.sankuai.xm.login.manager.g
    @Trace(name = "login_end", traceName = "login_im", type = i.recv)
    public final void a_(com.sankuai.xm.login.beans.c cVar) {
        boolean z = true;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f48616c33f7c16122e7af34b1e568bcd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f48616c33f7c16122e7af34b1e568bcd");
            return;
        }
        try {
            j.a(i.recv, "login_end", "login_im", 0L, "single", new Object[]{cVar});
            this.o = cVar;
            ((com.sankuai.xm.login.manager.heartbeat.c) g().a()).a_(cVar);
            int a2 = cVar.a();
            com.sankuai.xm.login.manager.lvs.a aVar = cVar.g.b;
            if (a2 == 0) {
                Object[] objArr2 = {cVar, aVar};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "db50f9767e8e496ec3fc54b19f336b74", 6917529027641081856L)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "db50f9767e8e496ec3fc54b19f336b74")).booleanValue();
                } else {
                    com.sankuai.xm.login.d.a("ConnectionManager::handleAuthSuccess xsid is empty? " + ac.a(cVar.c) + " uid=" + cVar.b);
                    com.sankuai.xm.login.manager.lvs.b b2 = b(cVar.g.d);
                    if (b2.d && aVar.g) {
                        com.sankuai.xm.login.d.a("ConnectionManager::handleAuthSuccess is fallback ip");
                        b2.a(a.a(1, false, cVar.g.d), this);
                    }
                }
            } else {
                com.sankuai.xm.login.d.d("ConnectionManager::onAuthRes::code = " + a2, new Object[0]);
                Object[] objArr3 = {cVar, aVar};
                ChangeQuickRedirect changeQuickRedirect3 = b;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2e6b12d3accf36ab830694676d3f2a72", 6917529027641081856L)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2e6b12d3accf36ab830694676d3f2a72")).booleanValue();
                } else {
                    int a3 = cVar.a();
                    if (a3 != 2 && a3 != 14) {
                        if (a3 != 28 && a3 != 38) {
                            switch (a3) {
                                case 25:
                                case 26:
                                    break;
                                default:
                                    com.sankuai.xm.login.a.a().a(com.sankuai.xm.login.a.a().b);
                                    com.sankuai.xm.login.a.a().b();
                                    this.l = false;
                                    break;
                            }
                        }
                    } else if (aVar != null) {
                        com.sankuai.xm.login.manager.lvs.b b3 = b(cVar.g.d);
                        Object[] objArr4 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.xm.login.manager.lvs.b.a;
                        if (PatchProxy.isSupport(objArr4, b3, changeQuickRedirect4, false, "c79948aad0ca723888d4f9eeaedc65ff", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr4, b3, changeQuickRedirect4, false, "c79948aad0ca723888d4f9eeaedc65ff");
                        } else {
                            b3.a(aVar, false, true);
                            b3.f();
                        }
                    }
                    ((com.sankuai.xm.login.manager.channel.b) e().a()).b(-5);
                    z = false;
                }
            }
            if (z) {
                super.a_(cVar);
            }
            j.a((Object) null);
        } catch (Throwable th) {
            j.a(th);
            throw th;
        }
    }

    @Override // com.sankuai.xm.login.manager.d, com.sankuai.xm.login.manager.g
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a194d85739109358a0c5577149f0d241", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a194d85739109358a0c5577149f0d241");
            return;
        }
        com.sankuai.xm.login.d.a("ConnectionManager::onLogoff:: offline = " + z);
        com.sankuai.xm.login.a.a().a(com.sankuai.xm.login.a.a().b);
        com.sankuai.xm.login.a.a().b();
        ((com.sankuai.xm.login.manager.heartbeat.c) g().a()).b(z);
        super.b(z);
    }

    @Override // com.sankuai.xm.login.manager.d, com.sankuai.xm.login.manager.g
    public final void b(long j, int i) {
        int i2 = 0;
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fff21c7df96113918c3f20c3f219e5b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fff21c7df96113918c3f20c3f219e5b5");
            return;
        }
        com.sankuai.xm.login.d.a("ConnectionManager::onKickedOut:: uid = " + j + ",reason = " + i);
        if (i == 8) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "be8e3723112a3f4ec90a74dcbc2779b4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "be8e3723112a3f4ec90a74dcbc2779b4");
                return;
            }
            final String a2 = m.a().a(true);
            final String a3 = m.a().a(false);
            if (ac.a(a3)) {
                i2 = 1;
            } else if (!ac.a(a2, a3)) {
                i2 = 2;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("result", Integer.valueOf(i2));
            m.d().a("kick_by_same_device", hashMap);
            if (i2 > 0) {
                ((l) m.a(l.class)).b(b.a.class).a(new b.a<b.a>() { // from class: com.sankuai.xm.login.manager.f.3
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.base.util.b.a
                    public final /* synthetic */ boolean a(b.a aVar) {
                        b.a aVar2 = aVar;
                        Object[] objArr3 = {aVar2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "76ec086188697eb753fc551f51b147f3", 6917529027641081856L)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "76ec086188697eb753fc551f51b147f3")).booleanValue();
                        }
                        aVar2.a(a2, a3);
                        return false;
                    }
                });
                return;
            }
            return;
        }
        com.sankuai.xm.login.a.a().a(com.sankuai.xm.login.a.a().b);
        com.sankuai.xm.login.a.a().b();
        ((com.sankuai.xm.login.manager.heartbeat.c) g().a()).b(j, i);
        super.b(j, i);
    }

    @Override // com.sankuai.xm.login.manager.lvs.b.a
    public final void a(Object obj, List<com.sankuai.xm.login.manager.lvs.a> list) {
        Object[] objArr = {obj, list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a3d8d2da9e7f1b569c7e94bed340bf5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a3d8d2da9e7f1b569c7e94bed340bf5");
            return;
        }
        a aVar = (a) obj;
        if (aVar.b == 0) {
            a(aVar.c, aVar.d);
        }
    }

    @Override // com.sankuai.xm.login.manager.heartbeat.a.InterfaceC1410a
    public final void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c027ff87e8b94bdc8c189526cb54d05c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c027ff87e8b94bdc8c189526cb54d05c");
        } else if (!z) {
            com.sankuai.xm.login.d.a("ConnectionManager::onSocketStatusChanged:: offline");
            switch (i) {
                case 0:
                case 1:
                    ((com.sankuai.xm.login.manager.channel.b) e().a()).a(-1, 11);
                    return;
                default:
                    return;
            }
        } else {
            com.sankuai.xm.login.d.a("ConnectionManager::onSocketStatusChanged:: channel is opened.");
        }
    }

    @Override // com.sankuai.xm.login.manager.connect.b.a
    public final void a(int i, boolean z, boolean z2) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "528376e0b99a11b611306eb50be27647", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "528376e0b99a11b611306eb50be27647");
            return;
        }
        com.sankuai.xm.login.d.a("ConnectionManager::onNetworkStatusChanged:: type: " + i + " hasNetwork: " + z + ", isReachMaxRetry = " + z2);
        if (z) {
            switch (i) {
                case 0:
                    return;
                case 1:
                    a(false);
                    return;
                case 2:
                    a(true);
                    return;
                default:
                    return;
            }
        }
    }

    public boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b071159cb275eb874c3d9be5c44e20e5", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b071159cb275eb874c3d9be5c44e20e5")).booleanValue();
        }
        if (!this.l) {
            com.sankuai.xm.login.d.a("ConnectionClient::canAutoConnect:: mCanConnect = false");
            return false;
        }
        int a2 = a();
        com.sankuai.xm.login.d.a("ConnectionClient::canAutoConnect:: state=" + a2);
        switch (a2) {
            case -7:
            case -6:
            case -5:
            case -1:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            case -4:
            case -3:
            case -2:
            default:
                return false;
        }
    }

    private boolean a(boolean z, final int i) {
        boolean z2;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "042e297931b4843b58bcfd2da864500c", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "042e297931b4843b58bcfd2da864500c")).booleanValue();
        }
        synchronized (this) {
            if (f(false)) {
                return false;
            }
            long c = ((com.sankuai.xm.login.manager.connect.c) i().a()).c();
            if (c == Long.MAX_VALUE && com.sankuai.xm.base.f.m().f != 0) {
                ((com.sankuai.xm.login.manager.connect.d) f().a()).c();
            }
            if (c == 0 && !com.sankuai.xm.base.f.m().i()) {
                com.sankuai.xm.login.manager.connect.d dVar = (com.sankuai.xm.login.manager.connect.d) f().a();
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.login.manager.connect.d.a;
                if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "d26c19edaf79b74c5f89a22e01eeecb5", 6917529027641081856L)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "d26c19edaf79b74c5f89a22e01eeecb5")).booleanValue();
                } else if (dVar.e) {
                    z2 = dVar.e;
                } else if (dVar.c == -1 || dVar.c > 20) {
                    z2 = false;
                } else {
                    dVar.e = true;
                    dVar.b();
                    z2 = true;
                }
                if (z2) {
                    c = LocationStrategy.LOCATION_TIMEOUT;
                }
            }
            if (this.k == -1) {
                ((com.sankuai.xm.login.manager.connect.c) i().a()).b();
            } else if (!z) {
                return false;
            } else {
                com.sankuai.xm.login.net.g.a().a(this.k);
                this.k = -1L;
            }
            com.sankuai.xm.login.d.a("ConnectionManager::connectInternal:: delay = " + c + ", force = " + z);
            long a2 = com.sankuai.xm.login.net.g.a().a(new com.sankuai.xm.login.net.taskqueue.base.b() { // from class: com.sankuai.xm.login.manager.f.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.login.net.taskqueue.base.b
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b8de8189c2d881695067736055d8a281", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b8de8189c2d881695067736055d8a281");
                        return;
                    }
                    synchronized (f.this) {
                        f.a(f.this, -1L);
                    }
                    com.sankuai.xm.login.manager.connect.d d = f.d(f.this);
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.xm.login.manager.connect.d.a;
                    if (PatchProxy.isSupport(objArr4, d, changeQuickRedirect4, false, "e7de34683d222fdc1a3803dd26129873", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr4, d, changeQuickRedirect4, false, "e7de34683d222fdc1a3803dd26129873");
                    } else if (d.d) {
                        d.b.addAndGet(1);
                    }
                    com.sankuai.xm.login.beans.a h = f.this.h();
                    h.d = i;
                    com.sankuai.xm.login.manager.channel.b f = f.f(f.this);
                    com.sankuai.xm.login.manager.lvs.b b2 = f.this.b(i);
                    Object[] objArr5 = {b2};
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.xm.login.manager.channel.b.a;
                    if (PatchProxy.isSupport(objArr5, f, changeQuickRedirect5, false, "ae2fb6b9aa7e3b918296c6dcfe390782", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr5, f, changeQuickRedirect5, false, "ae2fb6b9aa7e3b918296c6dcfe390782");
                    } else {
                        f.e = b2;
                        f.b.g = b2;
                    }
                    f.f(f.this).a(h);
                }
            }, c, false);
            this.k = a2;
            return a2 != -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public com.sankuai.xm.login.beans.a h() {
        com.sankuai.xm.login.beans.b bVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "576d5a3dd89ccc34037ebf493572bd2d", 6917529027641081856L)) {
            return (com.sankuai.xm.login.beans.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "576d5a3dd89ccc34037ebf493572bd2d");
        }
        synchronized (com.sankuai.xm.login.a.a()) {
            long j = com.sankuai.xm.login.a.a().b;
            String i = com.sankuai.xm.login.a.a().i();
            com.sankuai.xm.login.d.a("ConnectionManager::getAuthContext:: uid=" + j + " cookie is empty? " + ac.a(i));
            if (j != 0 && !ac.a(i)) {
                if (com.sankuai.xm.login.a.a().d()) {
                    com.sankuai.xm.login.beans.e eVar = new com.sankuai.xm.login.beans.e();
                    eVar.f = com.sankuai.xm.login.a.a().d;
                    Object[] objArr2 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.login.beans.e.e;
                    if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "aa09ded6b9e40fd593a0559bccef695d", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "aa09ded6b9e40fd593a0559bccef695d");
                    } else {
                        eVar.g = j;
                    }
                    eVar.i = com.sankuai.xm.login.a.a().k();
                    eVar.h = com.sankuai.xm.login.a.a().i();
                    eVar.j = com.sankuai.xm.login.a.a().l();
                    eVar.k = com.sankuai.xm.login.a.a().c;
                    eVar.l = com.sankuai.xm.login.a.a().n();
                    bVar = eVar;
                } else {
                    com.sankuai.xm.login.beans.d dVar = new com.sankuai.xm.login.beans.d();
                    dVar.f = com.sankuai.xm.login.a.a().d;
                    Object[] objArr3 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.login.beans.d.e;
                    if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "d8c2cdfba446ae8e44f42dfc24150842", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "d8c2cdfba446ae8e44f42dfc24150842");
                    } else {
                        dVar.g = j;
                    }
                    dVar.i = com.sankuai.xm.login.a.a().k();
                    dVar.h = com.sankuai.xm.login.a.a().i();
                    dVar.j = com.sankuai.xm.login.a.a().l();
                    dVar.k = com.sankuai.xm.login.a.a().c;
                    dVar.l = com.sankuai.xm.login.a.a().n();
                    bVar = dVar;
                }
            }
            com.sankuai.xm.login.beans.b bVar2 = new com.sankuai.xm.login.beans.b();
            bVar2.f = com.sankuai.xm.login.a.a().d;
            bVar2.g = com.sankuai.xm.login.a.a().h();
            com.sankuai.xm.login.a a2 = com.sankuai.xm.login.a.a();
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.xm.login.a.a;
            bVar2.h = PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "699a2788ec1476d6ef53805e29085642", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "699a2788ec1476d6ef53805e29085642") : ((com.sankuai.xm.base.a) a2.s().a()).e;
            bVar2.i = com.sankuai.xm.login.a.a().k();
            bVar2.j = com.sankuai.xm.login.a.a().l();
            bVar2.l = com.sankuai.xm.login.a.a().n();
            bVar2.k = com.sankuai.xm.login.a.a().c;
            bVar = bVar2;
        }
        return bVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public int b;
        public boolean c;
        public int d;

        public static a a(int i, boolean z, int i2) {
            Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1543f3a21671998abecdfd91df6dc52f", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1543f3a21671998abecdfd91df6dc52f");
            }
            a aVar = new a();
            aVar.b = i;
            aVar.c = z;
            aVar.d = i2;
            return aVar;
        }
    }

    @Override // com.sankuai.xm.base.component.a
    public final void a(com.sankuai.xm.base.component.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a29cb4d14983fb375b91fe3c504f6cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a29cb4d14983fb375b91fe3c504f6cd");
        } else if (bVar != null) {
            d().b = bVar;
            e().b = bVar;
            i().b = bVar;
            f().b = bVar;
            g().b = bVar;
        }
    }
}
