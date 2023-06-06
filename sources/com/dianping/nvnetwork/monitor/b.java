package com.dianping.nvnetwork.monitor;

import com.dianping.monitor.impl.m;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.g;
import com.dianping.nvnetwork.h;
import com.dianping.nvnetwork.q;
import com.dianping.nvnetwork.util.j;
import com.dianping.nvtunnelkit.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(Request request, q qVar, q qVar2) {
        Object[] objArr = {request, qVar, qVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        String str = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "61f0392bca73485faae655a39c606900", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "61f0392bca73485faae655a39c606900");
            return;
        }
        String str2 = request != null ? request.d : null;
        if (f.a(str2) || qVar == null) {
            return;
        }
        try {
            Set<String> set = h.h().o;
            if (set != null && set.size() > 0) {
                if (set.contains("*")) {
                    str = "*";
                } else if (set.contains(str2)) {
                    str = str2;
                }
            }
            if (str == null) {
                return;
            }
            String valueOf = String.valueOf(qVar.statusCode());
            String valueOf2 = qVar2 == null ? "-666" : String.valueOf(qVar2.statusCode());
            m e = g.e();
            if (e != null) {
                e.a("shark_tcp_error_code", valueOf).a("shark_http_code", valueOf2).a("shark_url", str).a("shark_net_connected", String.valueOf(j.a(g.b()))).a("shark_tcp_error_monitor", new ArrayList(Collections.nCopies(1, Float.valueOf(1.0f)))).a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
