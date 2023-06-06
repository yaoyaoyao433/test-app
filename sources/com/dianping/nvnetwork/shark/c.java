package com.dianping.nvnetwork.shark;

import com.dianping.nvnetwork.shark.b;
import com.dianping.nvnetwork.tnold.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.net.SocketAddress;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c extends n implements b.a {
    public static ChangeQuickRedirect b;
    final b c;

    public c(com.dianping.nvtunnelkit.conn.a aVar, SocketAddress socketAddress) {
        super(aVar, socketAddress);
        Object[] objArr = {aVar, socketAddress};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07f4e9974718ebe1b8eb748a55a2ac1e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07f4e9974718ebe1b8eb748a55a2ac1e");
        } else {
            this.c = new b(this);
        }
    }

    @Override // com.dianping.nvnetwork.tnold.a, com.dianping.nvtunnelkit.kit.w
    public final double g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d13b7281a4080cdf266d59975176ac44", 6917529027641081856L)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d13b7281a4080cdf266d59975176ac44")).doubleValue();
        }
        double g = super.g();
        this.c.a();
        return g;
    }

    @Override // com.dianping.nvtunnelkit.conn.b
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce0a36bdf0f7ef8c6fb587a4e5da56d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce0a36bdf0f7ef8c6fb587a4e5da56d8");
            return;
        }
        super.h();
        this.c.a();
    }

    @Override // com.dianping.nvtlstunnel.a, com.dianping.nvtunnelkit.conn.b
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4da55bda72fb5f866435a0cc2daeef33", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4da55bda72fb5f866435a0cc2daeef33");
            return;
        }
        super.i();
        b bVar = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "19f5c888a95d2f997b8dbda05dbe2f95", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "19f5c888a95d2f997b8dbda05dbe2f95");
        } else {
            com.dianping.nvnetwork.debug.a.a(com.dianping.nvnetwork.debug.b.NV_DEBUG_EVENT_CODE_SHARK_CONNECTION_ADDED, bVar.b());
        }
    }

    @Override // com.dianping.nvtunnelkit.conn.b
    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe98f029191ef4466d646023643efa83", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe98f029191ef4466d646023643efa83");
            return;
        }
        super.j();
        b bVar = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "6b01010f93b034b75b97bc08ed55998b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "6b01010f93b034b75b97bc08ed55998b");
        } else {
            com.dianping.nvnetwork.debug.a.a(com.dianping.nvnetwork.debug.b.NV_DEBUG_EVENT_CODE_SHARK_CONNECTION_REMOVED, bVar.b());
        }
    }
}
