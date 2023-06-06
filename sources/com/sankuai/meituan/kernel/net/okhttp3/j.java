package com.sankuai.meituan.kernel.net.okhttp3;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class j implements Interceptor {
    public static ChangeQuickRedirect a;

    public j() {
        com.sankuai.meituan.kernel.net.base.c.b();
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Object[] objArr = {chain};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea98bde18bf6fb4aca86bd997dd569b0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea98bde18bf6fb4aca86bd997dd569b0");
        }
        Request request = chain.request();
        if (com.sankuai.meituan.kernel.net.base.c.b()) {
            String a2 = com.sankuai.meituan.switchtestenv.a.a(com.sankuai.meituan.kernel.net.base.c.b, request.url().url().toString());
            if (!TextUtils.isEmpty(a2)) {
                request = request.newBuilder().url(a2).build();
            }
        }
        return chain.proceed(request);
    }
}
