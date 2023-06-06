package com.sankuai.android.share.util;

import com.meituan.metrics.traffic.reflection.OkHttp2Wrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.raw.a;
import com.squareup.okhttp.v;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static a.InterfaceC0637a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a051c66feeb6de1c4c51009d0b08bd45", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a051c66feeb6de1c4c51009d0b08bd45");
        }
        v vVar = new v();
        OkHttp2Wrapper.addInterceptorToClient(vVar);
        v a2 = com.sankuai.waimai.launcher.util.aop.b.a(vVar);
        a2.b(60L, TimeUnit.SECONDS);
        a2.a(60L, TimeUnit.SECONDS);
        a2.c(60L, TimeUnit.SECONDS);
        return com.sankuai.meituan.retrofit2.callfactory.okhttp.a.a(a2);
    }
}
