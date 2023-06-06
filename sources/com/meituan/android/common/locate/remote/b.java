package com.meituan.android.common.locate.remote;

import com.meituan.android.common.locate.reporter.f;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.raw.a;
import java.io.IOException;
/* loaded from: classes2.dex */
public class b {
    private static String a = "https://apimobile.meituan.com/";
    private static String b = "https://mars.meituan.com/";
    private static String c = "https://maf.meituan.com/";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static String d = "http://mars.wpt.st.sankuai.com/";
    private static Interceptor e;

    public static ar a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9ae5667582253fa44260788d674ab25a", RobustBitConfig.DEFAULT_VALUE) ? (ar) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9ae5667582253fa44260788d674ab25a") : a(a);
    }

    private static ar a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4a562fcffc24fcb0ebfc5ed05084fe7e", RobustBitConfig.DEFAULT_VALUE)) {
            return (ar) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4a562fcffc24fcb0ebfc5ed05084fe7e");
        }
        try {
            a.InterfaceC0637a a2 = a.a();
            if (a2 == null) {
                LogUtils.a("there is no callfactory has been set");
                return null;
            }
            ar.a a3 = new ar.a().a(str).a(a2);
            if (e != null) {
                a3.a(e);
            }
            a3.a(d());
            if (f.b().getBoolean("traffic_statistics_switch", false)) {
                a3.a(new com.meituan.android.common.locate.platform.logs.networktraffic.b());
            }
            return a3.a();
        } catch (Throwable th) {
            LogUtils.a(b.class, th);
            return null;
        }
    }

    public static void a(Interceptor interceptor) {
        e = interceptor;
    }

    public static ar b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "052375345096ffaf5b1211a5540f8ca8", RobustBitConfig.DEFAULT_VALUE) ? (ar) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "052375345096ffaf5b1211a5540f8ca8") : a(b);
    }

    public static ar c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "719a29730b77aef97796def4e2b0688f", RobustBitConfig.DEFAULT_VALUE) ? (ar) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "719a29730b77aef97796def4e2b0688f") : a(b);
    }

    private static Interceptor d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "77eb6fbd7d35cba1c8886820617bef4a", RobustBitConfig.DEFAULT_VALUE) ? (Interceptor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "77eb6fbd7d35cba1c8886820617bef4a") : new Interceptor() { // from class: com.meituan.android.common.locate.remote.b.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.meituan.retrofit2.Interceptor
            public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c8355b8fc44a5af8adf997f2f4391f03", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c8355b8fc44a5af8adf997f2f4391f03");
                }
                com.meituan.android.common.locate.platform.logs.c.a("MtRetrofitFactory&Interceptor -> intercept", 3);
                aj.a a2 = aVar.request().a();
                com.meituan.android.common.locate.repo.request.b.a(a2);
                return aVar.a(a2.a());
            }
        };
    }
}
