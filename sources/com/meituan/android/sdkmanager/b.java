package com.meituan.android.sdkmanager;

import com.meituan.metrics.traffic.reflection.OkHttp2Wrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ar;
import com.squareup.okhttp.v;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static b b;
    private ar c;

    public static synchronized b a() {
        synchronized (b.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb3cc12f44bbf42746ace1b0f05ef946", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb3cc12f44bbf42746ace1b0f05ef946");
            }
            if (b == null) {
                b = new b();
            }
            return b;
        }
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a24d11da6ce85c1297777043c6115eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a24d11da6ce85c1297777043c6115eb");
            return;
        }
        v vVar = new v();
        OkHttp2Wrapper.addInterceptorToClient(vVar);
        v a2 = com.sankuai.waimai.launcher.util.aop.b.a(vVar);
        a2.u = false;
        a2.a(60L, TimeUnit.SECONDS);
        a2.b(60L, TimeUnit.SECONDS);
        this.c = new ar.a().a("http://connor.fe.sankuai.com").a(com.sankuai.meituan.retrofit2.callfactory.okhttp.a.a(a2)).a(com.sankuai.meituan.retrofit2.converter.gson.a.a()).a();
    }

    public final Call<a> a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd7a553d0199999868d73a6e460c1322", RobustBitConfig.DEFAULT_VALUE) ? (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd7a553d0199999868d73a6e460c1322") : ((SDKInfoService) this.c.a(SDKInfoService.class)).getSDKManageResult(map);
    }
}
