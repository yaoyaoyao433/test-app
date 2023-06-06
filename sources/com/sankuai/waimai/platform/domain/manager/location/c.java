package com.sankuai.waimai.platform.domain.manager.location;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements Interceptor {
    public static ChangeQuickRedirect a;

    @Override // okhttp3.Interceptor
    public final Response intercept(@NonNull Interceptor.Chain chain) throws IOException {
        Object[] objArr = {chain};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a117035b6c241270e6cd23eecdf9f05a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a117035b6c241270e6cd23eecdf9f05a");
        }
        Request request = chain.request();
        HttpUrl.Builder newBuilder = request.url().newBuilder();
        newBuilder.addQueryParameter("uuid", com.sankuai.waimai.platform.b.A().c());
        StringBuilder sb = new StringBuilder();
        sb.append(com.sankuai.waimai.platform.domain.manager.user.a.i().d());
        newBuilder.addQueryParameter("userid", sb.toString());
        newBuilder.addQueryParameter("utm_content", com.sankuai.waimai.platform.b.A().b());
        newBuilder.addQueryParameter("utm_source", com.sankuai.waimai.platform.b.A().d());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(com.sankuai.waimai.platform.b.A().j());
        newBuilder.addQueryParameter("utm_term", sb2.toString());
        Request.Builder url = request.newBuilder().url(newBuilder.build().toString());
        if (!a(request.headers())) {
            url.addHeader("uuid", com.sankuai.waimai.platform.b.A().c());
        }
        return chain.proceed(url.build());
    }

    private boolean a(Headers headers) {
        Object[] objArr = {headers};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "434bdd2dafb984a957f64c15aba41d4a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "434bdd2dafb984a957f64c15aba41d4a")).booleanValue();
        }
        if (headers == null) {
            return false;
        }
        for (String str : headers.names()) {
            if (!TextUtils.isEmpty(str) && "uuid".equals(str)) {
                return true;
            }
        }
        return false;
    }
}
