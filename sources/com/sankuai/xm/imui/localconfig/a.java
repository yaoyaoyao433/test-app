package com.sankuai.xm.imui.localconfig;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.q;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a extends q {
    public static ChangeQuickRedirect h;
    private static a i;
    private boolean j;
    private boolean k;
    private boolean l;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc06120d92d00fe179d898273cfe429e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc06120d92d00fe179d898273cfe429e");
            return;
        }
        this.j = true;
        this.k = true;
        this.l = true;
    }

    public static a c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d1dbccfbf3be9220344ea43c1ee2363", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d1dbccfbf3be9220344ea43c1ee2363");
        }
        if (i == null) {
            synchronized (a.class) {
                if (i == null) {
                    i = new a();
                }
            }
        }
        return i;
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0a02103141dbcfb17e94da1ccfb1067", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0a02103141dbcfb17e94da1ccfb1067");
        } else {
            super.a("second_page", false, true);
        }
    }

    @Override // com.sankuai.xm.base.util.q
    public final void b() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57a882c8a3e15c3083a72917ed53313e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57a882c8a3e15c3083a72917ed53313e");
            return;
        }
        synchronized (this) {
            this.j = this.f.optInt("atpage", 1) == 1;
            this.k = this.f.optInt("webviewpage", 1) == 1;
            this.l = this.f.optInt("filedownloadpage", 1) == 1;
        }
    }

    public final boolean e() {
        boolean z;
        synchronized (this) {
            z = this.j;
        }
        return z;
    }

    public final boolean f() {
        boolean z;
        synchronized (this) {
            z = this.l;
        }
        return z;
    }
}
