package com.dianping.nvnetwork.failover.fetcher;

import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.failover.fetcher.b;
import com.dianping.nvnetwork.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g extends a {
    public static ChangeQuickRedirect e;

    @Override // com.dianping.nvnetwork.failover.fetcher.b
    public final void b(Request request, b.a aVar) {
        Object[] objArr = {request, aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6b4ab181bc08ed59a83464b81194b6e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6b4ab181bc08ed59a83464b81194b6e");
            return;
        }
        a(request, aVar);
        a(request, this.b, aVar);
    }

    @Override // com.dianping.nvnetwork.failover.fetcher.a
    public final void a(Request request, q qVar, b.a aVar) {
        Object[] objArr = {request, qVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31adcafda6e8823c6d566ad73e720306", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31adcafda6e8823c6d566ad73e720306");
            return;
        }
        if (request != null) {
            com.dianping.nvnetwork.c.a(request.b()).a(-172);
        }
        super.a(request, qVar, aVar);
    }
}
