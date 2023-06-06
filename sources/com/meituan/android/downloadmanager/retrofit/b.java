package com.meituan.android.downloadmanager.retrofit;

import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.android.downloadmanager.MultiDownloadService;
import com.meituan.metrics.traffic.reflection.OkHttp3Wrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static volatile b c;
    public ar b;

    private b(MultiDownloadService multiDownloadService) {
        Object[] objArr = {multiDownloadService};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4485798ff6f4dda9bef2d374674b7c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4485798ff6f4dda9bef2d374674b7c2");
            return;
        }
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        OkHttp3Wrapper.addInterceptorToBuilder(builder);
        this.b = new ar.a().a("http://apimobile.meituan.com/").a(com.sankuai.meituan.retrofit2.callfactory.okhttp3.a.a(builder.connectTimeout(LocationStrategy.LOCATION_TIMEOUT, TimeUnit.MILLISECONDS).readTimeout(20000L, TimeUnit.MILLISECONDS).build())).a(a.a()).a();
    }

    public static b a(MultiDownloadService multiDownloadService) {
        Object[] objArr = {multiDownloadService};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f5dfdcdf223064a252bb4374f3ff1e82", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f5dfdcdf223064a252bb4374f3ff1e82");
        }
        if (c == null) {
            synchronized (b.class) {
                if (c == null) {
                    c = new b(multiDownloadService);
                }
            }
        }
        return c;
    }
}
