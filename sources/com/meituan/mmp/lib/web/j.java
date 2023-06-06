package com.meituan.mmp.lib.web;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j {
    public static ChangeQuickRedirect a;
    private static IX5Provider b;

    public static synchronized IX5Provider a() {
        synchronized (j.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            IX5Provider iX5Provider = null;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4a5fbcacf52799a2e2574f16cd8359c", RobustBitConfig.DEFAULT_VALUE)) {
                return (IX5Provider) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4a5fbcacf52799a2e2574f16cd8359c");
            }
            if (b == null) {
                List a2 = com.sankuai.meituan.serviceloader.b.a(IX5Provider.class, "mmp_x5_provider");
                if (a2 != null && a2.size() > 0) {
                    iX5Provider = (IX5Provider) a2.get(0);
                }
                b = iX5Provider;
            }
            return b;
        }
    }
}
