package com.sankuai.xm.network.setting;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private static g c;
    private static e e;
    short b;
    private final HashMap<e, g> d;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a {
        public static final f a = new f();
    }

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "956148e6e2892b0d702d4356f4eef83f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "956148e6e2892b0d702d4356f4eef83f");
            return;
        }
        this.d = new HashMap<>();
        this.b = com.sankuai.xm.base.f.m().c;
        if (this.b == 0) {
            this.b = (short) 1;
        }
        a(com.sankuai.xm.base.f.m().d);
    }

    public static f a() {
        return a.a;
    }

    public final synchronized g b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "437d8128e881e9f657d0efa78857561e", 6917529027641081856L)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "437d8128e881e9f657d0efa78857561e");
        }
        if (c == null) {
            com.sankuai.xm.log.a.a("HostManager.getInstance()::getSetting => use default env : release.");
            c = new b();
            e = e.ENV_RELEASE;
            com.sankuai.xm.base.f.m().a(e);
        }
        return c;
    }

    public final synchronized e c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af9ff7014b63c165637891625ef4305e", 6917529027641081856L)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af9ff7014b63c165637891625ef4305e");
        }
        return b().e();
    }

    public final synchronized void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2e509fdacc7dfb29737541ebadab647", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2e509fdacc7dfb29737541ebadab647");
            return;
        }
        g gVar = this.d.get(eVar);
        if (gVar == null) {
            switch (eVar) {
                case ENV_TEST:
                    gVar = new d();
                    break;
                case ENV_STAGING:
                    gVar = new c();
                    break;
                default:
                    gVar = new b();
                    break;
            }
            com.sankuai.xm.log.a.a("HostManager.getInstance()::initSetting => use default env : " + gVar.e());
        } else {
            com.sankuai.xm.log.a.a("HostManager.getInstance()::initSetting => use udf env : " + gVar.e());
        }
        c = gVar;
        e = eVar;
        com.sankuai.xm.base.f.m().a(eVar);
    }

    public final short d() {
        return this.b;
    }

    public final synchronized String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "567c68d421907bc431d1496ca3855830", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "567c68d421907bc431d1496ca3855830");
        }
        String str = "prod";
        if (e == e.ENV_STAGING) {
            str = "st";
        } else if (e == e.ENV_TEST) {
            str = "test";
        }
        return str;
    }
}
