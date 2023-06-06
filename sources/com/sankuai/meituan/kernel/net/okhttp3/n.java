package com.sankuai.meituan.kernel.net.okhttp3;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class n implements Interceptor {
    public static ChangeQuickRedirect a;

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Object[] objArr = {chain};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "531b1e8e040ed889227eaae45f4ffdbc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "531b1e8e040ed889227eaae45f4ffdbc");
        }
        if (com.sankuai.meituan.kernel.net.tunnel.a.a != null) {
            return com.sankuai.meituan.kernel.net.tunnel.a.a.intercept(chain);
        }
        return chain.proceed(chain.request());
    }
}
