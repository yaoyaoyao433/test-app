package com.meituan.android.identifycardrecognizer.request;

import com.meituan.android.common.candy.OkCandyInterceptor;
import com.meituan.android.paybase.net.a;
import com.meituan.android.paybase.utils.ah;
import com.meituan.metrics.traffic.reflection.OkHttp2Wrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
import com.squareup.okhttp.v;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static volatile ar b;
    private static volatile ar c;

    public static ar a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8b078aa652dfef5aa3ef12ff23b28f32", RobustBitConfig.DEFAULT_VALUE)) {
            return (ar) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8b078aa652dfef5aa3ef12ff23b28f32");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new ar.a().a(com.meituan.android.paybase.config.a.d().b()).a(d()).a(new com.meituan.android.paybase.encrypt.a(com.meituan.android.paybase.config.a.d().a(), true)).a(new com.meituan.android.paybase.net.interceptor.c()).a(new com.meituan.android.paybase.net.interceptor.b()).a(new com.meituan.android.paybase.net.interceptor.a()).a(new com.meituan.android.paybase.encrypt.b(com.meituan.android.paybase.config.a.d().a(), c.b())).a();
                }
            }
        }
        return b;
    }

    public static /* synthetic */ String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dabeb96fde1a13fa6d8bd79da06de9b9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dabeb96fde1a13fa6d8bd79da06de9b9") : com.meituan.android.paybase.config.a.d().j();
    }

    public static ar b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91647b1dcf83844e4e7d2caf75cf85a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (ar) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91647b1dcf83844e4e7d2caf75cf85a2");
        }
        if (c == null) {
            synchronized (b.class) {
                if (c == null) {
                    c = new ar.a().a(com.meituan.android.paybase.config.a.d().b()).a(d()).a(new com.meituan.android.paybase.encrypt.a(com.meituan.android.paybase.config.a.d().a(), false)).a(new com.meituan.android.paybase.net.interceptor.c()).a(new com.meituan.android.paybase.net.interceptor.b()).a(new com.meituan.android.paybase.net.interceptor.a()).a();
                }
            }
        }
        return c;
    }

    private static com.sankuai.meituan.retrofit2.callfactory.okhttp.a d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "396224802c1365314f6fd4a6237ff430", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.callfactory.okhttp.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "396224802c1365314f6fd4a6237ff430");
        }
        v vVar = new v();
        OkHttp2Wrapper.addInterceptorToClient(vVar);
        v a2 = com.sankuai.waimai.launcher.util.aop.b.a(vVar);
        a2.a(60L, TimeUnit.SECONDS);
        a2.b(60L, TimeUnit.SECONDS);
        a2.c(60L, TimeUnit.SECONDS);
        a2.a().add(new com.meituan.android.paybase.net.cat.c());
        if (ah.a(com.meituan.android.paybase.config.a.d().a())) {
            a2.a().add(new OkCandyInterceptor(com.meituan.android.paybase.config.a.d().a()));
            a2.a().add(new a.C0335a());
        } else {
            a2.b().add(new OkCandyInterceptor(com.meituan.android.paybase.config.a.d().a()));
        }
        a2.a().add(new com.meituan.android.paybase.net.cat.a());
        return com.sankuai.meituan.retrofit2.callfactory.okhttp.a.a(a2);
    }
}
