package com.meituan.android.mrn.config;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static e b;

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4125b7cd6c2c988d2061ea40948d1f1", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4125b7cd6c2c988d2061ea40948d1f1");
        }
        if (y.a().b == null) {
            return b();
        }
        return y.a().b;
    }

    private static e b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "99dc6dbc056fdd1baf508351c704f752", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "99dc6dbc056fdd1baf508351c704f752");
        }
        if (b == null) {
            synchronized (c.class) {
                if (b == null) {
                    com.facebook.common.logging.a.d("getAppProvider", "", new RuntimeException("出错，走到ServiceLoader兜底逻辑"));
                    List a2 = com.sankuai.meituan.serviceloader.b.a(a.class, (String) null);
                    if (a2 != null && a2.size() > 0) {
                        b = (e) a2.get(0);
                    }
                    if (b == null) {
                        com.facebook.common.logging.a.d("getAppProviderDefault", "", new RuntimeException("出错，走到默认兜底逻辑"));
                        b = com.meituan.android.mrn.engine.a.p();
                    }
                }
            }
        }
        return b;
    }
}
