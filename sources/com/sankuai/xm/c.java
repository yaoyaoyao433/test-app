package com.sankuai.xm;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.component.anno.Component;
import com.sankuai.xm.base.component.e;
import com.sankuai.xm.base.service.i;
import com.sankuai.xm.base.service.l;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.login.manager.f;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Component
/* loaded from: classes6.dex */
public class c extends com.sankuai.xm.base.init.a implements com.sankuai.xm.base.component.a, com.sankuai.xm.base.component.d {
    public static ChangeQuickRedirect a;
    private static volatile c m;
    private e b;
    private e i;
    private e j;
    private e k;
    private volatile boolean l;
    private final ConcurrentHashMap<String, Object> n;
    private final Object o;

    private e s() {
        if (this.k == null) {
            synchronized (this.o) {
                if (this.k == null) {
                    this.k = new e(l.class, "mListenerService", this);
                }
            }
        }
        return this.k;
    }

    private e t() {
        if (this.i == null) {
            synchronized (this.o) {
                if (this.i == null) {
                    this.i = new e(com.sankuai.xm.login.plugins.a.class, "mStampPlugin", this);
                }
            }
        }
        return this.i;
    }

    private e u() {
        if (this.j == null) {
            synchronized (this.o) {
                if (this.j == null) {
                    this.j = new e(com.sankuai.xm.login.plugins.b.class, "mTokenPlugin", this);
                }
            }
        }
        return this.j;
    }

    @Override // com.sankuai.xm.base.component.d
    public final <T> T a(String str, Class<T> cls, com.sankuai.xm.base.component.b bVar) {
        Object[] objArr = {str, cls, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "096820af332269fc1947d4cadc897e13", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "096820af332269fc1947d4cadc897e13");
        }
        Object fVar = ("mConnectManager".equals(str) && cls == f.class) ? new f() : ("mStampPlugin".equals(str) && cls == com.sankuai.xm.login.plugins.a.class) ? new com.sankuai.xm.login.plugins.a() : ("mTokenPlugin".equals(str) && cls == com.sankuai.xm.login.plugins.b.class) ? new com.sankuai.xm.login.plugins.b() : null;
        if (fVar instanceof com.sankuai.xm.base.component.a) {
            ((com.sankuai.xm.base.component.a) fVar).a(bVar);
        }
        if (cls.isInstance(fVar)) {
            return cls.cast(fVar);
        }
        return null;
    }

    @Override // com.sankuai.xm.base.init.a
    public final List<com.sankuai.xm.base.init.a> b() {
        return null;
    }

    @Override // com.sankuai.xm.base.init.a
    public final String c() {
        return "IMCore";
    }

    @Override // com.sankuai.xm.base.init.a
    public final void c(com.sankuai.xm.base.f fVar) {
    }

    public final e n() {
        if (this.b == null) {
            synchronized (this.o) {
                if (this.b == null) {
                    this.b = new e(f.class, "mConnectManager", this);
                }
            }
        }
        return this.b;
    }

    public static /* synthetic */ void a(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "ec0afd0fc7fe3ec5e4618b4ae4c37cc9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "ec0afd0fc7fe3ec5e4618b4ae4c37cc9");
            return;
        }
        m.d().a("connect");
        if (cVar.l) {
            return;
        }
        synchronized (cVar) {
            if (!cVar.l) {
                com.sankuai.xm.base.init.a.a(true, false);
                cVar.l = true;
            }
        }
    }

    public static /* synthetic */ void a(c cVar, JSONObject jSONObject) throws JSONException {
        boolean z;
        boolean z2;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "2dbd967795444a9a5a0259f639c8f52e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "2dbd967795444a9a5a0259f639c8f52e");
            return;
        }
        com.sankuai.xm.base.util.net.c a2 = new com.sankuai.xm.base.util.net.c(jSONObject).a("data");
        if (a2 != null) {
            long d = a2.d("uid");
            String b = a2.b("xsid");
            if (d > 0 && !ac.a(b)) {
                com.sankuai.xm.login.d.b("IMCore::connect::, login uid = " + d + ", xsid is empty " + ac.a(b));
                if ((d == com.sankuai.xm.login.a.a().b && ac.a(b, com.sankuai.xm.login.a.a().i())) ? false : true) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "4276b33f450111ed6c588ac7202cdbcb", 6917529027641081856L)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "4276b33f450111ed6c588ac7202cdbcb")).booleanValue();
                    } else {
                        if (cVar.p()) {
                            f fVar = (f) cVar.n().a();
                            Object[] objArr3 = {(byte) 1};
                            ChangeQuickRedirect changeQuickRedirect3 = f.b;
                            if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "10336e4a6dca734b2649d66f934bbd0e", 6917529027641081856L)) {
                                z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "10336e4a6dca734b2649d66f934bbd0e")).booleanValue();
                            } else {
                                z2 = ((com.sankuai.xm.login.manager.channel.b) fVar.e().a()).b() || fVar.a() == 5;
                            }
                            if (z2) {
                                z = true;
                            }
                        }
                        z = false;
                    }
                    if (z || cVar.h()) {
                        cVar.g();
                    }
                }
                synchronized (com.sankuai.xm.login.a.a()) {
                    com.sankuai.xm.login.a.a().b(d);
                    com.sankuai.xm.login.a.a().c(b);
                }
                ((f) cVar.n().a()).a(true);
                return;
            }
            ((f) cVar.n().a()).a_(com.sankuai.xm.login.beans.c.a(24, d, b, null, null, null));
            return;
        }
        ((f) cVar.n().a()).a_(com.sankuai.xm.login.beans.c.a(1, 0L, null, null, null, null));
    }

    public static /* synthetic */ f b(c cVar) {
        return (f) cVar.n().a();
    }

    public static /* synthetic */ void c(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "930fcf85720c563e649d41f945a24908", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "930fcf85720c563e649d41f945a24908");
            return;
        }
        com.sankuai.xm.login.d.a("IMCore::connect visitor with request visitor api");
        HashMap hashMap = new HashMap();
        hashMap.put("appId", Short.valueOf(com.sankuai.xm.login.a.a().d));
        m.a();
        hashMap.put("deviceType", (short) 1);
        m.f().b(new com.sankuai.xm.network.httpurlconnection.e(com.sankuai.xm.network.setting.f.a().b().b() + "/crinfo/api/v1/registerTourist").b(hashMap).a(new com.sankuai.xm.network.httpurlconnection.d() { // from class: com.sankuai.xm.c.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.network.httpurlconnection.d
            public final void a(JSONObject jSONObject) throws Exception {
                Object[] objArr2 = {jSONObject};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ef6cfdb398090edd524343d6e74fc4cd", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ef6cfdb398090edd524343d6e74fc4cd");
                } else {
                    c.a(c.this, jSONObject);
                }
            }

            @Override // com.sankuai.xm.network.httpurlconnection.d
            public final void a(int i, String str) {
                Object[] objArr2 = {Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b30ef49f15e51a1c5d5ddbd9c4ec7a1b", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b30ef49f15e51a1c5d5ddbd9c4ec7a1b");
                } else {
                    c.b(c.this).a_(com.sankuai.xm.login.beans.c.a(1, 0L, null, null, null, null));
                }
            }
        }));
    }

    public c() {
        super(1);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f25cb5ec7200d175b1a89baf3cd0b850", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f25cb5ec7200d175b1a89baf3cd0b850");
            return;
        }
        this.n = new ConcurrentHashMap<>();
        this.o = new Object();
        this.b = null;
        this.i = null;
        this.j = null;
        this.l = false;
        this.k = null;
    }

    @Deprecated
    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d3f3564fcd6dabe745b7ac23cd5c5a22", 6917529027641081856L)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d3f3564fcd6dabe745b7ac23cd5c5a22");
        }
        if (m == null) {
            synchronized (c.class) {
                if (m == null) {
                    m = new c();
                }
            }
        }
        m.q();
        return m;
    }

    @Override // com.sankuai.xm.base.init.a
    public final void a(com.sankuai.xm.base.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0582a0f8ea15d28e4eda4bee6b68dad8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0582a0f8ea15d28e4eda4bee6b68dad8");
            return;
        }
        com.sankuai.xm.login.a.a().c(fVar.b);
        com.sankuai.xm.login.a.a().d = fVar.c;
        a(fVar.h, fVar.i == null ? "" : fVar.i);
        if (com.sankuai.xm.base.f.m().c == 1) {
            com.sankuai.xm.base.f.m().a(true);
        }
    }

    @Override // com.sankuai.xm.base.init.a
    public final void b(com.sankuai.xm.base.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ba97aa4d4d76cc2473e5831e88fe424", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ba97aa4d4d76cc2473e5831e88fe424");
            return;
        }
        ((f) n().a()).a((com.sankuai.xm.login.plugins.a) t().a());
        ((f) n().a()).a((com.sankuai.xm.login.plugins.b) u().a());
        f fVar2 = (f) n().a();
        com.sankuai.xm.network.setting.e eVar = com.sankuai.xm.base.f.m().d;
        Object[] objArr2 = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = f.b;
        if (PatchProxy.isSupport(objArr2, fVar2, changeQuickRedirect2, false, "e8af3a8a1c6a3118edf70313bfb0197b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, fVar2, changeQuickRedirect2, false, "e8af3a8a1c6a3118edf70313bfb0197b");
        } else {
            com.sankuai.xm.network.setting.f.a().a(eVar);
            if (fVar2.d != eVar) {
                if (fVar2.d == null) {
                    com.sankuai.xm.login.manager.lvs.b b = fVar2.b(fVar2.c);
                    if (!b.d() && !b.c()) {
                        com.sankuai.xm.log.a.a("ConnectionManager::setEnvironment, query lvs, no valid cache");
                        fVar2.b(fVar2.c).a(f.a.a(1, true, fVar2.c), fVar2);
                    } else {
                        com.sankuai.xm.log.a.a("ConnectionManager::setEnvironment, no need query lvs");
                    }
                } else {
                    for (com.sankuai.xm.login.manager.lvs.b bVar : fVar2.e.values()) {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.login.manager.lvs.b.a;
                        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "b286bbd63dc56eb656a65a57ada24fad", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "b286bbd63dc56eb656a65a57ada24fad");
                        } else {
                            bVar.c.b();
                        }
                    }
                    com.sankuai.xm.log.a.b("ConnectionManager::setEnvironment, query lvs, old=%s,new=%s", fVar2.d, eVar);
                    fVar2.b(fVar2.c).a(f.a.a(1, true, fVar2.c), fVar2);
                }
            }
            fVar2.d = eVar;
        }
        com.sankuai.xm.login.manager.channel.e.a(m.b().getBoolean("enable_conn_downgrade", true));
    }

    @Override // com.sankuai.xm.base.init.a
    public final void d(com.sankuai.xm.base.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "279b99ebc5dea79c4a40f6a628b666fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "279b99ebc5dea79c4a40f6a628b666fc");
            return;
        }
        com.sankuai.xm.login.net.mempool.heap.c.a().a(3145728, 4096, null);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "da406662550aa6a381731bf020a195c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "da406662550aa6a381731bf020a195c4");
            return;
        }
        int i = m.b().getInt("current_version", 0);
        if (i != m.a().f()) {
            m.b().a("pre_version", i);
            m.b().a("current_version", m.a().f());
        }
    }

    public final int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41a6493f3f9a63f3efc47107bf87a111", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41a6493f3f9a63f3efc47107bf87a111")).intValue();
        }
        com.sankuai.xm.login.d.a("IMCore::setSwimlane " + str);
        com.sankuai.xm.base.f.m().g = str;
        return 0;
    }

    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daac0ceda924f63b3ec3ef1adfa66ee2", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daac0ceda924f63b3ec3ef1adfa66ee2") : com.sankuai.xm.base.f.m().g;
    }

    public final f e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78ff324dc598e838130a0530522ce002", 6917529027641081856L)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78ff324dc598e838130a0530522ce002");
        }
        if (!p()) {
            com.sankuai.xm.login.d.a("IMCore::getConnectManager is not init");
            return null;
        }
        return (f) n().a();
    }

    public final boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd5a20abbdecb40e1f2b866239736139", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd5a20abbdecb40e1f2b866239736139")).booleanValue();
        }
        if (!p()) {
            com.sankuai.xm.login.d.a("IMCore::checkAndConnect:: is not init");
            return false;
        }
        com.sankuai.xm.login.d.a("IMCore::checkAndConnect");
        return ((f) n().a()).d(false);
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4e8b9057ee9c60cc54f20a7d6aef500", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4e8b9057ee9c60cc54f20a7d6aef500");
        } else if (!p()) {
            com.sankuai.xm.login.d.a("IMCore::disconnect:: is not init");
        } else {
            ((f) n().a()).c(true);
        }
    }

    @Deprecated
    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c805d182a336b593d0760dd2553bdf2", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c805d182a336b593d0760dd2553bdf2")).booleanValue() : p() && this.l && ((f) n().a()).b();
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fecc35b61b34d02cc2282de20daf8c18", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fecc35b61b34d02cc2282de20daf8c18");
            return;
        }
        com.sankuai.xm.login.d.a("IMCore::setPushToken");
        com.sankuai.xm.login.a.a().d(str);
        com.sankuai.xm.login.a.a().e(str2);
        if (h()) {
            ((com.sankuai.xm.login.plugins.b) u().a()).a();
        }
    }

    public final void a(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c489cb4d5940654fa696b7611b64155a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c489cb4d5940654fa696b7611b64155a");
            return;
        }
        Runnable a2 = j.a(new Runnable() { // from class: com.sankuai.xm.c.6
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "70b62d47d6b721a6c2bf2aaf227bfc9a", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "70b62d47d6b721a6c2bf2aaf227bfc9a");
                } else if (c.this.p()) {
                    com.sankuai.xm.login.d.b("IMCore::notifyAppStateChanged state:%d", Integer.valueOf(i));
                    if (c.this.l) {
                        f b = c.b(c.this);
                        int i2 = i;
                        Object[] objArr3 = {Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect3 = f.b;
                        if (PatchProxy.isSupport(objArr3, b, changeQuickRedirect3, false, "bf5d4dd5325e76c0611e07573be69985", 6917529027641081856L)) {
                            ((Boolean) PatchProxy.accessDispatch(objArr3, b, changeQuickRedirect3, false, "bf5d4dd5325e76c0611e07573be69985")).booleanValue();
                        } else {
                            com.sankuai.xm.login.d.a("ConnectionManager::notifyAppStateChanged:: state = " + i2);
                            if (com.sankuai.xm.base.f.m().h()) {
                                if (i2 != 0) {
                                    ((com.sankuai.xm.login.manager.connect.d) b.f().a()).a();
                                } else {
                                    ((com.sankuai.xm.login.manager.connect.d) b.f().a()).c();
                                }
                            }
                            com.sankuai.xm.login.manager.heartbeat.c cVar = (com.sankuai.xm.login.manager.heartbeat.c) b.g().a();
                            Object[] objArr4 = {Integer.valueOf(i2)};
                            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.xm.login.manager.heartbeat.c.a;
                            if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "c007fb00eb8b77e00ac8f49326363c29", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "c007fb00eb8b77e00ac8f49326363c29");
                            } else {
                                cVar.b.b(i2);
                            }
                            com.sankuai.xm.login.manager.channel.b bVar = (com.sankuai.xm.login.manager.channel.b) b.e().a();
                            Object[] objArr5 = {Integer.valueOf(i2)};
                            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.xm.login.manager.channel.b.a;
                            if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "046b6656c07f8b32e323062047d52f1f", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "046b6656c07f8b32e323062047d52f1f");
                            } else {
                                com.sankuai.xm.base.c cVar2 = bVar.d;
                                Object[] objArr6 = {Integer.valueOf(i2)};
                                ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.xm.base.b.a;
                                if (PatchProxy.isSupport(objArr6, cVar2, changeQuickRedirect6, false, "93a2a3a7d0cb35db33de7737d44ad362", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr6, cVar2, changeQuickRedirect6, false, "93a2a3a7d0cb35db33de7737d44ad362");
                                } else {
                                    cVar2.b = i2;
                                    if (i2 == 0) {
                                        cVar2.c = 0L;
                                    } else {
                                        cVar2.c = System.currentTimeMillis();
                                    }
                                }
                            }
                            if (i2 == 0) {
                                b.d(true);
                            }
                        }
                        if (i == 0) {
                            c.this.f();
                        }
                    }
                }
            }
        });
        if (m.e().a(Thread.currentThread().getName(), 32)) {
            a2.run();
        } else {
            m.e().a(32, a2);
        }
    }

    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "962e967cb336678a5f29023e37395b65", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "962e967cb336678a5f29023e37395b65");
        } else if (p()) {
            com.sankuai.xm.login.d.a("IMCore::notifyNetworkChange");
            final f fVar = (f) n().a();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = f.b;
            if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "9d2f016e03f3cd90b5bd155eafba69cb", 6917529027641081856L)) {
                ((Boolean) PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "9d2f016e03f3cd90b5bd155eafba69cb")).booleanValue();
            } else if (!fVar.c()) {
                com.sankuai.xm.login.d.a("ConnectionClient::notifyNetworkStateChanged:: can not auto connect");
            } else {
                com.sankuai.xm.login.manager.heartbeat.c cVar = (com.sankuai.xm.login.manager.heartbeat.c) fVar.g().a();
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.login.manager.heartbeat.c.a;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "a31e4cb2d80fada022856064061568d3", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "a31e4cb2d80fada022856064061568d3");
                }
                ((com.sankuai.xm.login.manager.connect.b) fVar.d().a()).a();
                final int l = m.a().l();
                m.a().a(new i.a() { // from class: com.sankuai.xm.login.manager.f.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.base.service.i.a
                    public final void a(String str) {
                        Object[] objArr4 = {str};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3f07b774c92b832375587fdf5e2d3cbc", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3f07b774c92b832375587fdf5e2d3cbc");
                            return;
                        }
                        com.sankuai.xm.login.d.a("ConnectionManager::notifyNetworkStateChanged:: old net/net/last ip/current ip=" + fVar.j + "/" + l + "/" + fVar.i + "/" + str);
                        fVar.j = l;
                        if (l != 0) {
                            if (ac.a(fVar.i) || (!ac.a(fVar.i) && !ac.a(str) && !fVar.i.equalsIgnoreCase(str))) {
                                fVar.e(com.sankuai.xm.base.f.m().i());
                            } else if (fVar.b()) {
                                f.c(fVar).a();
                            } else {
                                fVar.e(com.sankuai.xm.base.f.m().i());
                            }
                        } else {
                            if (fVar.b()) {
                                f.c(fVar).a();
                            }
                            fVar.e(false);
                        }
                        if (ac.a(str)) {
                            return;
                        }
                        fVar.i = str;
                    }
                });
            }
        }
    }

    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7805ad1f36db8dcd85557a37a8e7a1f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7805ad1f36db8dcd85557a37a8e7a1f9");
        } else if (p()) {
            com.sankuai.xm.login.d.a("IMCore::notifyMatrixConfigChange");
        }
    }

    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccb9dffeff69f526e3766d8a01ff4cf0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccb9dffeff69f526e3766d8a01ff4cf0");
        } else {
            a(bArr, false);
        }
    }

    private void a(byte[] bArr, boolean z) {
        Object[] objArr = {bArr, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50ffe9b20792a3ac5c1e2bd5bba091a2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50ffe9b20792a3ac5c1e2bd5bba091a2");
        } else {
            a((String) null, bArr, false);
        }
    }

    private void a(String str, byte[] bArr, boolean z) {
        Object[] objArr = {null, bArr, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70b05ed7aa49398051edac73df63aa4d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70b05ed7aa49398051edac73df63aa4d");
        } else if (!p()) {
            com.sankuai.xm.login.d.a("IMCore::send:: is not init");
        } else {
            ((f) n().a()).a((String) null, bArr, z);
        }
    }

    public void cancel(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74259c4a4eed8bbcc2ae81141c06345f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74259c4a4eed8bbcc2ae81141c06345f");
        } else if (!p()) {
            com.sankuai.xm.login.d.a("IMCore::cancel:: is not init");
        } else {
            ((f) n().a()).cancel(str);
        }
    }

    public final short k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f487276f53b33022431d32252f08e9c", 6917529027641081856L) ? ((Short) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f487276f53b33022431d32252f08e9c")).shortValue() : com.sankuai.xm.login.a.a().d;
    }

    public final long l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cce9f2b296881c16cd58b156aeabfff", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cce9f2b296881c16cd58b156aeabfff")).longValue() : com.sankuai.xm.login.a.a().b;
    }

    public final long a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2933f8e6b28fb98ac067b714c689710", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2933f8e6b28fb98ac067b714c689710")).longValue() : ((com.sankuai.xm.login.plugins.a) t().a()).a(j);
    }

    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f53c2cb1e48f12eda032effe4d3498f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f53c2cb1e48f12eda032effe4d3498f");
            return;
        }
        com.sankuai.xm.login.plugins.a aVar = (com.sankuai.xm.login.plugins.a) t().a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.login.plugins.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "9bab602c3e8a524efd6002e6e33782e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "9bab602c3e8a524efd6002e6e33782e8");
            return;
        }
        com.sankuai.xm.login.d.a("StampPlugin::notifySystemTimeChanged => time: " + System.currentTimeMillis());
        aVar.a();
        aVar.b = 0L;
    }

    @Override // com.sankuai.xm.base.component.a
    public final void a(com.sankuai.xm.base.component.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40fb499ed1b50ea665ff71f68b15ffd2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40fb499ed1b50ea665ff71f68b15ffd2");
        } else if (bVar != null) {
            s().b = bVar;
            n().b = bVar;
            t().b = bVar;
            u().b = bVar;
        }
    }
}
