package com.sankuai.xm.network.analyse;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.network.analyse.c;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d implements c.b {
    public static ChangeQuickRedirect a;
    public int b;
    private c c;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        protected static d a = new d();
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e27afb8cd3edc47687311a85b9543c08", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e27afb8cd3edc47687311a85b9543c08");
            return;
        }
        this.c = new c(this);
        this.b = -3;
    }

    @Override // com.sankuai.xm.network.analyse.c.b
    public final void a(int i) {
        this.b = i;
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e0683f10bd29fe95cb4d1ea3c3882d2", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e0683f10bd29fe95cb4d1ea3c3882d2")).booleanValue() : m.a().k();
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb761eab657ae1e15d7fd4d9cbebd70c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb761eab657ae1e15d7fd4d9cbebd70c");
            return;
        }
        com.sankuai.xm.login.d.a("NetworkAnalyse::CONN startDetect isForeground=" + z);
        this.b = -3;
        this.c.a();
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aab6fe48086d408d1123f5b8e913a78f", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aab6fe48086d408d1123f5b8e913a78f")).booleanValue();
        }
        boolean a2 = a();
        com.sankuai.xm.login.d.b("NetworkAnalyse::CONN isNetNormal %s, hasNet %s", Integer.valueOf(this.b), Boolean.valueOf(a2));
        return this.b == 0 || (this.b == -3 && a2);
    }

    public static d c() {
        return a.a;
    }
}
