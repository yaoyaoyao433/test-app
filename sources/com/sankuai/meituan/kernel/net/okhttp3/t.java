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
public final class t implements Interceptor {
    public static ChangeQuickRedirect a;

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Object[] objArr = {chain};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b6e788c95595a4d58407bb5873d347a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b6e788c95595a4d58407bb5873d347a");
        }
        Request request = chain.request();
        if (!request.url().queryParameterNames().contains("uuid") && TextUtils.isEmpty(request.url().queryParameter("uuid"))) {
            String g = com.sankuai.meituan.kernel.net.base.c.a() != null ? com.sankuai.meituan.kernel.net.base.c.a().g() : null;
            if (g == null) {
                g = "";
            }
            request = request.newBuilder().url(request.url().newBuilder().addQueryParameter("uuid", g).build()).build();
        }
        return chain.proceed(request);
    }
}
