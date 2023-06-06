package com.meituan.msc.modules.devtools;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static c b;

    public static synchronized c a() {
        synchronized (a.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            c cVar = null;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a185f60bc1bacf2729fe9d78c25ab449", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a185f60bc1bacf2729fe9d78c25ab449");
            }
            if (b == null) {
                List a2 = com.sankuai.meituan.serviceloader.b.a(c.class, "msc_devtools_provider");
                if (a2 != null && a2.size() > 0) {
                    cVar = (c) a2.get(0);
                }
                b = cVar;
            }
            return b;
        }
    }
}
