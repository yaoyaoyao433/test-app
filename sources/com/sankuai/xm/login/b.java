package com.sankuai.xm.login;

import android.content.Context;
import android.support.annotation.CallSuper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.db.g;
import com.sankuai.xm.base.service.CommonServiceRegistry;
import com.sankuai.xm.base.service.m;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class b extends com.sankuai.xm.base.init.a {
    private static volatile boolean a = false;
    public static ChangeQuickRedirect l;

    public static b H() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f1f8eb89763649568ad9f0cf67cb146a", 6917529027641081856L) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f1f8eb89763649568ad9f0cf67cb146a") : new a();
    }

    public b(int i) {
        this(i, H());
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "437d47b70d9c8543d7fb39b43888c17e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "437d47b70d9c8543d7fb39b43888c17e");
        }
    }

    public b(int i, com.sankuai.xm.base.init.a aVar) {
        super(i, aVar);
        Object[] objArr = {Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da6f61069e9a1bbdebe485e64bf876a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da6f61069e9a1bbdebe485e64bf876a7");
        }
    }

    static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a860e83a3856c722a7a1fdd9e7b8479", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a860e83a3856c722a7a1fdd9e7b8479")).booleanValue();
        }
        if (a) {
            return true;
        }
        synchronized (b.class) {
            if (!a) {
                com.sankuai.xm.base.f.m().a(context);
                m.a(new CommonServiceRegistry());
                com.sankuai.xm.base.lifecycle.d.d().a(context, false);
                com.sankuai.xm.base.lifecycle.d d = com.sankuai.xm.base.lifecycle.d.d();
                Object[] objArr2 = {(byte) 0};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.base.lifecycle.d.a;
                if (PatchProxy.isSupport(objArr2, d, changeQuickRedirect2, false, "34eaf98f969ae805611c9e04ea08bddf", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, d, changeQuickRedirect2, false, "34eaf98f969ae805611c9e04ea08bddf");
                } else if (d.b == -1) {
                    d.c();
                }
                a = com.sankuai.xm.c.a().e(com.sankuai.xm.base.f.m());
            }
        }
        return a;
    }

    @Override // com.sankuai.xm.base.init.a
    public final boolean f(com.sankuai.xm.base.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = l;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb6f8f5a247163d131fac7b2d511200a", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb6f8f5a247163d131fac7b2d511200a")).booleanValue() : super.f(fVar) && fVar.g() != null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a extends b {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.xm.base.init.a
        public final List<com.sankuai.xm.base.init.a> b() {
            return null;
        }

        @Override // com.sankuai.xm.base.init.a
        public final void b(com.sankuai.xm.base.f fVar) {
        }

        @Override // com.sankuai.xm.base.init.a
        public final String c() {
            return "__Proxy_";
        }

        @Override // com.sankuai.xm.base.init.a
        public final void d(com.sankuai.xm.base.f fVar) {
        }

        public a() {
            super(0, null);
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "764799f11e646e6d5adbb7f21239cc40", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "764799f11e646e6d5adbb7f21239cc40");
            }
        }

        @Override // com.sankuai.xm.base.init.a
        @CallSuper
        public final boolean e(com.sankuai.xm.base.f fVar) {
            Object[] objArr = {fVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71e130e5d07e359a885efcbd4c297bd2", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71e130e5d07e359a885efcbd4c297bd2")).booleanValue();
            }
            b.a(fVar.g());
            return true;
        }

        @Override // com.sankuai.xm.base.init.a
        public final void a(com.sankuai.xm.base.f fVar) {
            Object[] objArr = {fVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29011555526ee8c1c2c0e3ad0281101c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29011555526ee8c1c2c0e3ad0281101c");
            } else {
                b.a(fVar.g());
            }
        }

        @Override // com.sankuai.xm.base.init.a
        @CallSuper
        public final void c(com.sankuai.xm.base.f fVar) {
            Object[] objArr = {fVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afbc47a3b8e64a86b70ea7d1600e9712", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afbc47a3b8e64a86b70ea7d1600e9712");
            } else if (fVar.a() <= o()) {
                if (com.sankuai.xm.base.f.m().c() == 1) {
                    g.a().a(false, false);
                } else {
                    g.a().a(true, false);
                }
            }
        }
    }
}
