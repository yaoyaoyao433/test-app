package com.dianping.nvnetwork.shark;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private final String b;
    private int c;
    private com.dianping.nvnetwork.debug.c d;
    private final a e;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        int a();

        int b();

        int c();

        int d();

        double e();

        String f();
    }

    public b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19273d4dda0e350508594fb8096a0f6a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19273d4dda0e350508594fb8096a0f6a");
            return;
        }
        this.b = com.dianping.nvnetwork.tunnel.e.a();
        this.e = aVar;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9220b662983698b4346e71d4ba400da6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9220b662983698b4346e71d4ba400da6");
        } else {
            com.dianping.nvnetwork.debug.a.a(com.dianping.nvnetwork.debug.b.NV_DEBUG_EVENT_CODE_SHARK_CONNECTION_INFO_CHANGE, b());
        }
    }

    public final com.dianping.nvnetwork.debug.c b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b83bdd681e06248cd3fe3b0f38ba86d9", 6917529027641081856L)) {
            return (com.dianping.nvnetwork.debug.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b83bdd681e06248cd3fe3b0f38ba86d9");
        }
        if (this.d == null) {
            this.d = new com.dianping.nvnetwork.debug.c();
            this.d.a = this.b;
            this.d.b = this.e.f();
        }
        this.d.e = this.e.a();
        this.d.d = this.e.b();
        this.d.c = this.e.c();
        this.d.f = this.e.d();
        this.d.g = this.e.e();
        this.d.h = this.c;
        return this.d;
    }
}
