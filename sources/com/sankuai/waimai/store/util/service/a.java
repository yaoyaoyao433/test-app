package com.sankuai.waimai.store.util.service;

import android.support.annotation.NonNull;
import com.meituan.android.singleton.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.kernel.net.d;
import com.sankuai.meituan.retrofit2.ar;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static volatile a c;
    @NonNull
    public ar b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42ada56760e3ff5f1dcbf1f36ca1f212", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42ada56760e3ff5f1dcbf1f36ca1f212");
            return;
        }
        this.b = new ar.a().a("http://localhost/").a(i.a(new d() { // from class: com.sankuai.waimai.store.util.service.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.kernel.net.d
            public final void a(@NonNull OkHttpClient.Builder builder) {
                Object[] objArr2 = {builder};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d6578cafef625edeedab966adf3d22ff", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d6578cafef625edeedab966adf3d22ff");
                } else {
                    builder.connectTimeout(60L, TimeUnit.SECONDS).writeTimeout(60L, TimeUnit.SECONDS).readTimeout(60L, TimeUnit.SECONDS).addInterceptor(new Interceptor() { // from class: com.sankuai.waimai.store.util.service.a.1.1
                        public static ChangeQuickRedirect a;

                        @Override // okhttp3.Interceptor
                        public final Response intercept(Interceptor.Chain chain) throws IOException {
                            Object[] objArr3 = {chain};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "60d65ad5da5e48b73e77332eabea7de3", RobustBitConfig.DEFAULT_VALUE) ? (Response) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "60d65ad5da5e48b73e77332eabea7de3") : chain.proceed(chain.request());
                        }
                    });
                }
            }
        })).a();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd97fc1d09440ced1bc95d20bc218dce", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd97fc1d09440ced1bc95d20bc218dce");
        }
        if (c == null) {
            synchronized (com.sankuai.waimai.store.logcenter.d.class) {
                if (c == null) {
                    c = new a();
                }
            }
        }
        return c;
    }
}
