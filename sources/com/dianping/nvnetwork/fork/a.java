package com.dianping.nvnetwork.fork;

import com.dianping.monitor.impl.m;
import com.dianping.nvnetwork.g;
import com.dianping.nvnetwork.h;
import com.dianping.nvtunnelkit.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(String str, String str2) {
        m e;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "22c909c1aeab60fc8c877895014212a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "22c909c1aeab60fc8c877895014212a4");
            return;
        }
        try {
            if (!h.h().ap || f.a(str2) || (e = g.e()) == null) {
                return;
            }
            e.a("shark_reason", str).a("shark_url", str2).a("shark_force_http_android", new ArrayList(Collections.nCopies(1, Float.valueOf(1.0f)))).a();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
