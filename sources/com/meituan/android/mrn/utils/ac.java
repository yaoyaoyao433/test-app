package com.meituan.android.mrn.utils;

import com.meituan.metrics.traffic.reflection.OkHttp2Wrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.raw.a;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ac {
    public static ChangeQuickRedirect a;
    private static a.InterfaceC0637a b;

    public static a.InterfaceC0637a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84c1077e68c3ed1ab26ba9883ad51927", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84c1077e68c3ed1ab26ba9883ad51927");
        }
        if (b == null) {
            synchronized (ac.class) {
                if (b == null) {
                    com.squareup.okhttp.v vVar = new com.squareup.okhttp.v();
                    OkHttp2Wrapper.addInterceptorToClient(vVar);
                    b = com.sankuai.meituan.retrofit2.callfactory.okhttp.a.a(com.sankuai.waimai.launcher.util.aop.b.a(vVar));
                }
            }
        }
        return b;
    }
}
