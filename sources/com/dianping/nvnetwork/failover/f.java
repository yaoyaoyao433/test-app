package com.dianping.nvnetwork.failover;

import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.g;
import com.dianping.nvnetwork.q;
import com.meituan.android.common.unionid.oneid.network.OneIdNetworkTool;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static q a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "771d726c391799bf29a66e9a2af864d1", 6917529027641081856L)) {
            return (q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "771d726c391799bf29a66e9a2af864d1");
        }
        q.a aVar = new q.a();
        aVar.c = i;
        aVar.j = str;
        return aVar.build();
    }

    public static long a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e8350625435efb2ede988f37f6153c43", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e8350625435efb2ede988f37f6153c43")).longValue() : System.currentTimeMillis();
    }

    public static void a(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e0752664fc41a98de96651aa5569c94", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e0752664fc41a98de96651aa5569c94");
        } else if (g.p()) {
            StringBuilder sb = new StringBuilder("[tid: ");
            sb.append(Thread.currentThread().getId());
            sb.append(", hash: ");
            sb.append(i);
            sb.append("] -> ");
            sb.append(str2);
        }
    }

    public static boolean a(Request request) {
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e56da196f1a72a690f92cd559e83aaf8", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e56da196f1a72a690f92cd559e83aaf8")).booleanValue();
        }
        if (request == null || request.n || !request.m) {
            return true;
        }
        return !request.l && (request.f.equals("POST") || request.f.equals(OneIdNetworkTool.PUT) || request.f.equals("DELETE"));
    }
}
