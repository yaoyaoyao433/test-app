package com.sankuai.meituan.kernel.net.okhttp3;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.util.UUID;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f implements Interceptor {
    public static ChangeQuickRedirect a;
    private final com.sankuai.meituan.kernel.net.base.b b;
    private final com.sankuai.meituan.kernel.net.singleton.b c;

    public f(com.sankuai.meituan.kernel.net.singleton.b bVar, com.sankuai.meituan.kernel.net.base.b bVar2) {
        Object[] objArr = {bVar, bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2102900dd0fcc18bb552809612dff99a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2102900dd0fcc18bb552809612dff99a");
            return;
        }
        this.c = bVar;
        this.b = bVar2;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        String builder;
        Object[] objArr = {chain};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7a69483bd265e3e8bb8a77a1237eccf", RobustBitConfig.DEFAULT_VALUE)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7a69483bd265e3e8bb8a77a1237eccf");
        }
        Request request = chain.request();
        Request.Builder newBuilder = request.newBuilder();
        String aSCIIString = request.url().uri().toASCIIString();
        boolean isHttps = request.isHttps();
        Object[] objArr2 = {aSCIIString, Byte.valueOf(isHttps ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b59828707bb144c3cbf80c0dfc189701", RobustBitConfig.DEFAULT_VALUE)) {
            builder = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b59828707bb144c3cbf80c0dfc189701");
        } else {
            Uri parse = Uri.parse(aSCIIString);
            Uri.Builder a2 = this.c.a(parse, isHttps);
            if (TextUtils.isEmpty(parse.getQueryParameter("__reqTraceID"))) {
                a2.appendQueryParameter("__reqTraceID", UUID.randomUUID().toString());
            }
            builder = a2.toString();
        }
        Request.Builder url = newBuilder.url(builder);
        if (this.b != null && this.b.a() != 0 && TextUtils.isEmpty(request.header("userid"))) {
            url.addHeader("userid", String.valueOf(this.b.a()));
        }
        return chain.proceed(url.build());
    }
}
