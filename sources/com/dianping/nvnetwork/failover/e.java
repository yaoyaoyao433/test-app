package com.dianping.nvnetwork.failover;

import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.h;
import com.dianping.nvnetwork.http.impl.RxDefaultHttpService;
import com.dianping.nvnetwork.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.net.URL;
import java.util.Set;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e implements com.dianping.nvnetwork.http.a {
    public static ChangeQuickRedirect a;
    private RxDefaultHttpService b;
    private com.dianping.nvnetwork.http.a c;

    public e(RxDefaultHttpService rxDefaultHttpService, com.dianping.nvnetwork.http.a aVar) {
        Object[] objArr = {rxDefaultHttpService, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87d285bc83a823dca66bff87f9e45f43", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87d285bc83a823dca66bff87f9e45f43");
            return;
        }
        this.b = rxDefaultHttpService;
        this.c = aVar;
    }

    private boolean a(Request request) {
        Set<String> set;
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fc7b32fd855f6cd213351625648c4cd", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fc7b32fd855f6cd213351625648c4cd")).booleanValue();
        }
        try {
            set = h.h().k;
        } catch (Exception unused) {
        }
        if (set != null && !set.isEmpty()) {
            URL url = new URL(request.d);
            StringBuilder sb = new StringBuilder();
            sb.append(url.getHost());
            sb.append(url.getPath());
            return set.contains(sb.toString());
        }
        return false;
    }

    @Override // com.dianping.nvnetwork.http.a
    public final rx.d<q> exec(Request request) {
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dde5989938ca8d6b732c6bffd80d269c", 6917529027641081856L)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dde5989938ca8d6b732c6bffd80d269c");
        }
        if (h.h().ac || a(request)) {
            return rx.d.a((d.a) new d(request, this.b, this.c));
        }
        return rx.d.a((d.a) new c(request, this.b, this.c));
    }
}
