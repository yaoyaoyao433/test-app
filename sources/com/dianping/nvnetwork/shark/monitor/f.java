package com.dianping.nvnetwork.shark.monitor;

import com.dianping.nvnetwork.util.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c54b8c63796bca77fa28efd5f5c2d9b8", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c54b8c63796bca77fa28efd5f5c2d9b8")).intValue();
        }
        c.a a2 = com.dianping.nvnetwork.util.c.a();
        if (a2.a < 0 || !a2.c) {
            return 0;
        }
        int i = a2.a * 10000;
        return a2.b > 0 ? i + a2.b : i;
    }
}
