package com.meituan.mmp.lib.devtools;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j {
    public static ChangeQuickRedirect a;
    private static h b;

    public static synchronized h a() {
        synchronized (j.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            h hVar = null;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "477702b8bec663cef2cb51e6b94c1e76", RobustBitConfig.DEFAULT_VALUE)) {
                return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "477702b8bec663cef2cb51e6b94c1e76");
            }
            if (b == null) {
                List a2 = com.sankuai.meituan.serviceloader.b.a(h.class, "mmp_performance_provider");
                if (a2 != null && a2.size() > 0) {
                    hVar = (h) a2.get(0);
                }
                b = hVar;
            }
            return b;
        }
    }
}
