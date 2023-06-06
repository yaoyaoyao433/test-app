package com.sankuai.xm.login.manager;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.proto.protosingal.w;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.login.manager.f;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class b extends com.sankuai.xm.base.init.a implements e {
    public static ChangeQuickRedirect b;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(String str, String str2);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.login.manager.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public interface InterfaceC1409b {
        void a(String str);
    }

    @Override // com.sankuai.xm.login.manager.e
    public final void a(int i) {
    }

    public void a_(com.sankuai.xm.login.beans.c cVar) {
    }

    @Override // com.sankuai.xm.login.manager.g
    public final void b(int i, byte[] bArr) {
    }

    @Override // com.sankuai.xm.login.manager.g
    public final void b(long j, int i) {
    }

    @Override // com.sankuai.xm.login.manager.g
    public final void b(boolean z) {
    }

    @Override // com.sankuai.xm.login.manager.g
    public final void d(int i) {
    }

    public b(com.sankuai.xm.base.init.a aVar) {
        super(2, aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c08c4f974f18fb337d54c8e0f793da35", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c08c4f974f18fb337d54c8e0f793da35");
        }
    }

    @Override // com.sankuai.xm.base.init.a
    public final List<com.sankuai.xm.base.init.a> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8bbc2323a8e3a23838fb5ed14da1449", 6917529027641081856L) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8bbc2323a8e3a23838fb5ed14da1449") : com.sankuai.xm.base.util.b.a(com.sankuai.xm.c.a());
    }

    public void a(final long j, final String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "278ce36cc4e184e82be8ba5cfc0426a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "278ce36cc4e184e82be8ba5cfc0426a9");
            return;
        }
        final com.sankuai.xm.c a2 = com.sankuai.xm.c.a();
        Object[] objArr2 = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.c.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "008dc9bbd1a847ab6d258416edabac7f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "008dc9bbd1a847ab6d258416edabac7f");
        } else if (!a2.p()) {
            com.sankuai.xm.login.d.a("IMCore::connect:: is not init");
        } else {
            com.sankuai.xm.base.init.b.a(j == com.sankuai.xm.login.a.a().q());
            m.e().a(11, j.a(new Runnable() { // from class: com.sankuai.xm.c.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean z = false;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "07ee9e7cd23f2ab30b16dfa5dc0ae811", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "07ee9e7cd23f2ab30b16dfa5dc0ae811");
                        return;
                    }
                    com.sankuai.xm.login.a.a().e(j);
                    c.a(a2);
                    com.sankuai.xm.login.d.a("IMCore::connect:: uid=" + j + ", cookie is empty " + ac.a(str));
                    z = (j == com.sankuai.xm.login.a.a().b && ac.a(str, com.sankuai.xm.login.a.a().i())) ? true : true;
                    boolean h = a2.h();
                    synchronized (com.sankuai.xm.login.a.a()) {
                        if (!h && z) {
                            com.sankuai.xm.login.a.a().b();
                        }
                        com.sankuai.xm.login.a.a().c(j);
                        com.sankuai.xm.login.a.a().c(str);
                    }
                    c.b(a2).a(z);
                }
            }));
        }
    }

    public final void a(final String str, final String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cac6787f0bfd5b7ae80605e89a037e03", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cac6787f0bfd5b7ae80605e89a037e03");
            return;
        }
        final com.sankuai.xm.c a2 = com.sankuai.xm.c.a();
        Object[] objArr2 = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.c.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "a180dda439ed3236f202f83846020721", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "a180dda439ed3236f202f83846020721");
        } else if (!a2.p()) {
            com.sankuai.xm.login.d.a("IMCore::connect:: is not init");
        } else {
            com.sankuai.xm.base.init.b.a(ac.a(str, com.sankuai.xm.login.a.a().r()));
            m.e().a(11, j.a(new Runnable() { // from class: com.sankuai.xm.c.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3758c5c7e5599d136591e220c8d4bc65", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3758c5c7e5599d136591e220c8d4bc65");
                        return;
                    }
                    com.sankuai.xm.login.a.a().g(str);
                    c.a(a2);
                    boolean z = !ac.a(str, com.sankuai.xm.login.a.a().h());
                    com.sankuai.xm.login.d.a("IMCore::connect:: userId=" + str + ", token is empty " + ac.a(str2));
                    boolean h = a2.h();
                    synchronized (com.sankuai.xm.login.a.a()) {
                        if (!h && z) {
                            com.sankuai.xm.login.a.a().b();
                        }
                        com.sankuai.xm.login.a a3 = com.sankuai.xm.login.a.a();
                        String str3 = str2;
                        Object[] objArr4 = {str3};
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.xm.login.a.a;
                        if (PatchProxy.isSupport(objArr4, a3, changeQuickRedirect4, false, "8dcb75b53e3da671713df85897b158fe", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr4, a3, changeQuickRedirect4, false, "8dcb75b53e3da671713df85897b158fe");
                        } else {
                            ((com.sankuai.xm.base.a) a3.s().a()).e = str3;
                        }
                        com.sankuai.xm.login.a a4 = com.sankuai.xm.login.a.a();
                        String str4 = str;
                        Object[] objArr5 = {str4};
                        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.xm.login.a.a;
                        if (PatchProxy.isSupport(objArr5, a4, changeQuickRedirect5, false, "1c906d4b727a425be2594a726419e835", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr5, a4, changeQuickRedirect5, false, "1c906d4b727a425be2594a726419e835");
                        } else {
                            ((com.sankuai.xm.base.a) a4.s().a()).d = str4;
                            a4.g(str4);
                        }
                    }
                    c.b(a2).a(true);
                }
            }));
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6761809d87686ca84f11e75e78cf9849", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6761809d87686ca84f11e75e78cf9849");
            return;
        }
        final com.sankuai.xm.c a2 = com.sankuai.xm.c.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.c.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "09c1fbfc93f1b0ca2f0af313abfa9600", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "09c1fbfc93f1b0ca2f0af313abfa9600");
        } else if (!a2.p()) {
            com.sankuai.xm.login.d.a("IMCore::connect:: is not init");
        } else {
            com.sankuai.xm.base.init.b.a(true);
            com.sankuai.xm.base.init.b.a(32);
            m.e().a(11, j.a(new Runnable() { // from class: com.sankuai.xm.c.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "569a5b973f54a9e58d66de8d854abf34", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "569a5b973f54a9e58d66de8d854abf34");
                        return;
                    }
                    c.a(a2);
                    if (com.sankuai.xm.login.a.a().d() && com.sankuai.xm.login.a.a().b > 0 && !ac.a(com.sankuai.xm.login.a.a().i())) {
                        com.sankuai.xm.login.d.a("IMCore::connect visitor without request visitor api");
                        c.b(a2).a(true);
                        return;
                    }
                    c.c(a2);
                }
            }));
        }
    }

    public final boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abb2e733b7b32539588948d1fdbd354c", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abb2e733b7b32539588948d1fdbd354c")).booleanValue() : com.sankuai.xm.c.a().f();
    }

    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ccb4ecb0d1fad7667925780500a993a", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ccb4ecb0d1fad7667925780500a993a")).booleanValue();
        }
        final com.sankuai.xm.c a2 = com.sankuai.xm.c.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.c.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "cf90e9afe4685382e441430ebd449a93", 6917529027641081856L)) {
            ((Boolean) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "cf90e9afe4685382e441430ebd449a93")).booleanValue();
            return true;
        } else if (!a2.p()) {
            com.sankuai.xm.login.d.a("IMCore::logoff:: is not init");
            return true;
        } else {
            final long j = com.sankuai.xm.login.a.a().b;
            m.e().a(11, j.a(new Runnable() { // from class: com.sankuai.xm.c.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "82cdd002a803abdf4bb0929d34e2eba0", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "82cdd002a803abdf4bb0929d34e2eba0");
                        return;
                    }
                    f b2 = c.b(a2);
                    long j2 = j;
                    Object[] objArr4 = {new Long(j2)};
                    ChangeQuickRedirect changeQuickRedirect4 = f.b;
                    if (PatchProxy.isSupport(objArr4, b2, changeQuickRedirect4, false, "4778f63bb0afa40355583e6f64010639", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr4, b2, changeQuickRedirect4, false, "4778f63bb0afa40355583e6f64010639");
                    } else {
                        ((com.sankuai.xm.login.manager.channel.b) b2.e().a()).a(j2);
                    }
                }
            }));
            return true;
        }
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbe20635d5403203d4734d6ef6891ba3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbe20635d5403203d4734d6ef6891ba3");
        } else {
            com.sankuai.xm.c.a().g();
        }
    }

    public final int a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1812ec70209e047418d72161cd9c5a11", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1812ec70209e047418d72161cd9c5a11")).intValue();
        }
        com.sankuai.xm.c a2 = com.sankuai.xm.c.a();
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.c.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "8c4cd45169520a76b7a4ba5dbe2b0ac8", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "8c4cd45169520a76b7a4ba5dbe2b0ac8")).intValue();
        }
        if (!a2.p()) {
            com.sankuai.xm.login.d.a("IMCore::setAllowConnectAtBackground:: is not init");
            return 10023;
        }
        com.sankuai.xm.login.d.a("IMCore::setAllowConnectAtBackground " + z);
        com.sankuai.xm.base.f.m().a(z);
        return 0;
    }

    public final boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3140b648e9a608a84622f35666e5f836", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3140b648e9a608a84622f35666e5f836")).booleanValue();
        }
        com.sankuai.xm.c a2 = com.sankuai.xm.c.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.c.a;
        return PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "ac9a60669ee044f8cf5cff214f69c4d6", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "ac9a60669ee044f8cf5cff214f69c4d6")).booleanValue() : !a2.p() || ((f) a2.n().a()).a() == -2;
    }

    public final boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b830f6567d83d6ece98a2271ebe6b67", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b830f6567d83d6ece98a2271ebe6b67")).booleanValue();
        }
        com.sankuai.xm.c a2 = com.sankuai.xm.c.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.c.a;
        return PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "715103804fc5aaf7f0d2608c7d4e9bb4", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "715103804fc5aaf7f0d2608c7d4e9bb4")).booleanValue() : !a2.p() || ((f) a2.n().a()).a() == -3;
    }

    public final boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e31cff50c9503ce027048416b037e1e", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e31cff50c9503ce027048416b037e1e")).booleanValue();
        }
        com.sankuai.xm.c a2 = com.sankuai.xm.c.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.c.a;
        return PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "0800390ca36dbfb3ff551c15f39df067", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "0800390ca36dbfb3ff551c15f39df067")).booleanValue() : !a2.p() || ((f) a2.n().a()).a() == -4;
    }

    public final boolean l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0619d23055498ddb241032b9aa006c9f", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0619d23055498ddb241032b9aa006c9f")).booleanValue() : com.sankuai.xm.c.a().h();
    }

    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0a1df68f667cee90e15fb5f97f3e8ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0a1df68f667cee90e15fb5f97f3e8ab");
        } else {
            com.sankuai.xm.c.a().i();
        }
    }

    public final void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a0678c44969a09228ed768af15242b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a0678c44969a09228ed768af15242b8");
        } else {
            com.sankuai.xm.c.a().m();
        }
    }

    public final void a(short s, byte[] bArr) {
        Object[] objArr = {Short.valueOf(s), bArr};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a7a2040656edcb8f49d758a16ab77b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a7a2040656edcb8f49d758a16ab77b4");
            return;
        }
        com.sankuai.xm.c a2 = com.sankuai.xm.c.a();
        Object[] objArr2 = {Short.valueOf(s), bArr};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.c.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "d4da816cfc72681e5af7ee78ae790c25", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "d4da816cfc72681e5af7ee78ae790c25");
            return;
        }
        w wVar = new w();
        wVar.c(a2.k());
        wVar.b = s;
        wVar.a(a2.l());
        wVar.c = bArr;
        wVar.d = a2.d();
        com.sankuai.xm.base.trace.g a3 = j.a();
        if (a3 != null) {
            wVar.b(a3.b);
            int d = com.sankuai.xm.base.proto.protobase.f.d(bArr);
            com.sankuai.xm.login.d.a("IMCore:send: xm_trace " + a3.b + ",uri = " + d);
        } else {
            com.sankuai.xm.login.d.b("IMCore:send: info == null");
        }
        a2.a(wVar.bS_());
    }

    public final long a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dceca6d58e8f3df2cf0163b482119fba", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dceca6d58e8f3df2cf0163b482119fba")).longValue() : com.sankuai.xm.c.a().a(j);
    }

    @Deprecated
    public final void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18993f20415eea44a7cb2e719b4d4641", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18993f20415eea44a7cb2e719b4d4641");
            return;
        }
        com.sankuai.xm.c a2 = com.sankuai.xm.c.a();
        Object[] objArr2 = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.c.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "0ec4f76332675eba272b3c4cc07e7206", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "0ec4f76332675eba272b3c4cc07e7206");
        } else {
            com.sankuai.xm.login.a.a().c(j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7326b83c2ff26246526215687112ccd4", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7326b83c2ff26246526215687112ccd4")).intValue();
        }
        com.sankuai.xm.c a2 = com.sankuai.xm.c.a();
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.c.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "9fc67d22a67ac3b87e0228a5039b3b1f", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "9fc67d22a67ac3b87e0228a5039b3b1f")).intValue();
        }
        com.sankuai.xm.login.d.a("IMCore::setSupportMultiDevices " + z);
        byte b2 = z;
        if (com.sankuai.xm.login.a.a().d()) {
            com.sankuai.xm.login.d.c("IMCore::setSupportMultiDevices with false where in visitor mode.", new Object[0]);
            b2 = 0;
        }
        com.sankuai.xm.base.f m = com.sankuai.xm.base.f.m();
        Object[] objArr3 = {Byte.valueOf(b2)};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.base.f.a;
        if (PatchProxy.isSupport(objArr3, m, changeQuickRedirect3, false, "142326b45e069e9866d8ed96e382491b", 6917529027641081856L)) {
            com.sankuai.xm.base.f fVar = (com.sankuai.xm.base.f) PatchProxy.accessDispatch(objArr3, m, changeQuickRedirect3, false, "142326b45e069e9866d8ed96e382491b");
        } else if (b2 != 0) {
            m.j |= 1;
        } else {
            m.j &= -2;
        }
        return 0;
    }
}
