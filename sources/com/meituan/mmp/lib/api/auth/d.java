package com.meituan.mmp.lib.api.auth;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static IExternalAuthProvider b;

    private static synchronized IExternalAuthProvider b() {
        synchronized (d.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            IExternalAuthProvider iExternalAuthProvider = null;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "881a29d77acb66108e0fcbb2708d8dac", RobustBitConfig.DEFAULT_VALUE)) {
                return (IExternalAuthProvider) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "881a29d77acb66108e0fcbb2708d8dac");
            }
            if (b == null) {
                List a2 = com.sankuai.meituan.serviceloader.b.a(IExternalAuthProvider.class, "mmp_external_auth_provider");
                if (a2 != null && a2.size() > 0) {
                    iExternalAuthProvider = (IExternalAuthProvider) a2.get(0);
                }
                b = iExternalAuthProvider;
            }
            return b;
        }
    }

    public static f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "38c2b7f821ab71e89f260b00f2ff0745", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "38c2b7f821ab71e89f260b00f2ff0745");
        }
        IExternalAuthProvider b2 = b();
        if (b2 == null) {
            return null;
        }
        return b2.a();
    }
}
