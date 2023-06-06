package com.sankuai.xm.login;

import android.content.Context;
import android.net.NetworkInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.component.anno.Component;
import com.sankuai.xm.base.service.l;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.base.util.w;
import com.sankuai.xm.login.manager.b;
import com.sankuai.xm.login.manager.g;
import com.sankuai.xm.monitor.cat.c;
import com.sankuai.xm.monitor.report.db.ReportDB;
import com.sankuai.xm.network.NetCheckManager;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
@Component
/* loaded from: classes6.dex */
public class c extends com.sankuai.xm.login.manager.b implements com.sankuai.xm.base.component.a, com.sankuai.xm.base.component.d {
    public static ChangeQuickRedirect a;
    private static volatile c k;
    private volatile Context i;
    private com.sankuai.xm.base.component.e j;
    private final ConcurrentHashMap<String, Object> l;
    private final Object m;

    private com.sankuai.xm.base.component.e s() {
        if (this.j == null) {
            synchronized (this.m) {
                if (this.j == null) {
                    this.j = new com.sankuai.xm.base.component.e(l.class, "mListenerService", this);
                }
            }
        }
        return this.j;
    }

    @Override // com.sankuai.xm.base.component.d
    public final <T> T a(String str, Class<T> cls, com.sankuai.xm.base.component.b bVar) {
        Object[] objArr = {str, cls, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ba27f56a99f848b8ab590517731bd39", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ba27f56a99f848b8ab590517731bd39");
        }
        if (cls.isInstance(null)) {
            return cls.cast(null);
        }
        return null;
    }

    @Override // com.sankuai.xm.base.component.a
    public final void a(com.sankuai.xm.base.component.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "160f8883f556382db3b0b0641067acef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "160f8883f556382db3b0b0641067acef");
        } else if (bVar != null) {
            s().a(bVar);
        }
    }

    @Override // com.sankuai.xm.base.init.a
    public final String c() {
        return "ConnectionClient";
    }

    public c() {
        super(b.H());
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfa22091175374856a5bb8801e8350cf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfa22091175374856a5bb8801e8350cf");
            return;
        }
        this.l = new ConcurrentHashMap<>();
        this.m = new Object();
        this.i = null;
        this.j = null;
    }

    @Override // com.sankuai.xm.base.init.a
    public final void a(com.sankuai.xm.base.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0916b15f9d5e32cbc883c8daefaf67a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0916b15f9d5e32cbc883c8daefaf67a7");
            return;
        }
        this.i = fVar.g();
        com.sankuai.xm.base.lifecycle.d.d().a(new com.sankuai.xm.base.lifecycle.a() { // from class: com.sankuai.xm.login.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.lifecycle.a
            public final void a(final int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fc8339a292538f58a029a87de5cb7475", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fc8339a292538f58a029a87de5cb7475");
                } else {
                    m.e().a(32, new Runnable() { // from class: com.sankuai.xm.login.c.1.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a6ccee81604b0fa48e72ad3384715665", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a6ccee81604b0fa48e72ad3384715665");
                            } else {
                                com.sankuai.xm.c.a().a(i);
                            }
                        }
                    });
                }
            }
        });
    }

    @Override // com.sankuai.xm.base.init.a
    public final void b(com.sankuai.xm.base.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e959f28f48765af15e3166dcc072077", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e959f28f48765af15e3166dcc072077");
            return;
        }
        ((l) s().a()).a(b.a.class).a(Integer.MAX_VALUE).a((l.a) new b.a() { // from class: com.sankuai.xm.login.c.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.login.manager.b.a
            public final void a(String str, String str2) {
                Object[] objArr2 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a72dec2469112c98880e09df6c138afb", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a72dec2469112c98880e09df6c138afb");
                    return;
                }
                if (ac.a(str2)) {
                    str2 = UUID.randomUUID().toString();
                }
                String str3 = "LocalDidChangeListener.onDidChanged, cache did = " + str + ", realDid = " + str2;
                Object[] objArr3 = {str3};
                ChangeQuickRedirect changeQuickRedirect3 = f.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "6f8b78156f18635522d2935af11522df", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "6f8b78156f18635522d2935af11522df");
                } else {
                    com.sankuai.xm.log.d.a().b("login", str3, new Object[0]);
                }
                w.a(str2, "NEW_DX_SDK_DEVICE_ID_3", com.sankuai.xm.base.f.m().c());
                a.a().f(str2);
            }
        });
        ((l) s().a()).a(g.class).a(Integer.MAX_VALUE).a((l.a) this);
    }

    @Override // com.sankuai.xm.base.init.a
    public final void c(com.sankuai.xm.base.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe5c05011615484cdfafd6cc69f4de1a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe5c05011615484cdfafd6cc69f4de1a");
        } else {
            m.a(ReportDB.class);
        }
    }

    @Override // com.sankuai.xm.base.init.a
    public final void d(com.sankuai.xm.base.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6515179892d1b91448cbec4b1125627", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6515179892d1b91448cbec4b1125627");
            return;
        }
        com.sankuai.xm.network.httpurlconnection.g a2 = com.sankuai.xm.network.httpurlconnection.g.a();
        Context g = fVar.g();
        Object[] objArr2 = {g};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.network.httpurlconnection.g.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "5d49be06a8261123757e89eaa9d83807", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "5d49be06a8261123757e89eaa9d83807");
        } else {
            a2.a(g);
        }
        com.sankuai.xm.base.hornconfig.a.a().a(fVar.f());
        com.sankuai.xm.log.c.a();
        com.sankuai.xm.base.util.net.d.b(this.i);
        m.a(com.sankuai.xm.monitor.b.class);
        com.sankuai.xm.monitor.cat.c cVar = c.a.a;
        Context context = this.i;
        int k2 = com.sankuai.xm.base.f.m().k();
        com.sankuai.xm.base.extendimpl.a.a();
        cVar.a(context, k2, "4.46.113");
        com.sankuai.xm.monitor.c.a("init");
        NetCheckManager.a().a(new NetCheckManager.a() { // from class: com.sankuai.xm.login.c.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.network.NetCheckManager.a
            public final void a(NetworkInfo networkInfo) {
                Object[] objArr3 = {networkInfo};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d4fd00d57196530c3428a5bcdc193ec5", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d4fd00d57196530c3428a5bcdc193ec5");
                } else {
                    c.this.m();
                }
            }
        });
        NetCheckManager a3 = NetCheckManager.a();
        Context context2 = this.i;
        Object[] objArr3 = {context2};
        ChangeQuickRedirect changeQuickRedirect3 = NetCheckManager.a;
        if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "282854c5686e6665a412c0327b68eb3d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "282854c5686e6665a412c0327b68eb3d");
        } else {
            a3.b = context2;
            a3.b();
        }
        com.sankuai.xm.c.a().j();
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d6012fe64f104ec98ae01f6d4c03a256", 6917529027641081856L)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d6012fe64f104ec98ae01f6d4c03a256");
        }
        if (k == null) {
            synchronized (c.class) {
                if (k == null) {
                    k = new c();
                }
            }
        }
        k.q();
        return k;
    }

    @Override // com.sankuai.xm.login.manager.b
    public final void a(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b278166bc59030cbccd951cf7843a826", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b278166bc59030cbccd951cf7843a826");
            return;
        }
        com.sankuai.xm.monitor.c.a(j);
        super.a(j, str);
    }

    public final short d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c42583aff1111a2a043a3d5ccf451a85", 6917529027641081856L) ? ((Short) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c42583aff1111a2a043a3d5ccf451a85")).shortValue() : a.a().m();
    }

    @Override // com.sankuai.xm.login.manager.b, com.sankuai.xm.login.manager.g
    public final void a_(com.sankuai.xm.login.beans.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47f6bf9421e7a0aa5f8fe70ac5e96997", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47f6bf9421e7a0aa5f8fe70ac5e96997");
            return;
        }
        super.a_(cVar);
        if (cVar.b() > 0) {
            com.sankuai.xm.monitor.c.a(cVar.b());
            com.sankuai.xm.monitor.c.a("connect");
            com.sankuai.xm.base.hornconfig.a.a().a(cVar.b());
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5074c2d177a9326db3d9cfbb9deb6f4c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5074c2d177a9326db3d9cfbb9deb6f4c");
            } else {
                com.sankuai.xm.network.http.d.a(com.sankuai.xm.base.hornconfig.a.a().a("http_engine"));
            }
        }
    }
}
