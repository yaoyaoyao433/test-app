package com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.mtguard.wtscore.plugin.sign.core.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.c;
/* loaded from: classes2.dex */
public class Ok3CandyInterceptor implements Interceptor {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Context mContext;

    public Ok3CandyInterceptor() {
    }

    public Ok3CandyInterceptor(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a98ae8653181e02042ce60ca721e673", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a98ae8653181e02042ce60ca721e673");
        } else {
            this.mContext = context;
        }
    }

    private void initOriginalHeaders(Map<String, String> map, Request request) {
        Object[] objArr = {map, request};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "068b177717c78d51def443e8fa40e149", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "068b177717c78d51def443e8fa40e149");
            return;
        }
        int size = request.headers().size();
        for (int i = 0; i < size; i++) {
            map.put(request.headers().name(i), request.headers().value(i));
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NonNull Interceptor.Chain chain) throws IOException {
        byte[] bArr;
        URI a;
        MediaType contentType;
        Object[] objArr = {chain};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c979c68496e98dd5ffdd84b42750a26", 6917529027641081856L)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c979c68496e98dd5ffdd84b42750a26");
        }
        Request request = chain.request();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        String header = request.header("User-Agent");
        String str = "";
        RequestBody body = request.body();
        if (body != null && (contentType = body.contentType()) != null) {
            str = contentType.toString();
        }
        if (TextUtils.isEmpty(str)) {
            str = request.header("Content-Type");
        }
        String str2 = str;
        initOriginalHeaders(hashMap2, request);
        if (request.method().equalsIgnoreCase("post")) {
            c cVar = new c();
            request.body().writeTo(cVar);
            byte[] r = cVar.r();
            a = a.a(this.mContext, request.url().uri(), r, header, str2, hashMap, hashMap2);
            request = request.newBuilder().post(RequestBody.create(request.body().contentType(), r)).build();
        } else if (request.method().equalsIgnoreCase("get")) {
            a = a.a(this.mContext, request.url().uri(), header, str2, hashMap, hashMap2);
        } else {
            RequestBody body2 = request.body();
            if (body2 == null || body2.contentLength() <= 0) {
                bArr = null;
            } else {
                c cVar2 = new c();
                request.body().writeTo(cVar2);
                bArr = cVar2.r();
            }
            a = a.a(this.mContext, request.url().uri(), bArr, header, str2, hashMap, request.method(), hashMap2);
        }
        if (a == null) {
            return chain.proceed(request);
        }
        Request.Builder url = request.newBuilder().url(URI.create(a.toASCIIString()).toURL());
        for (Map.Entry entry : hashMap.entrySet()) {
            url.removeHeader((String) entry.getKey());
            url.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        return chain.proceed(url.build());
    }
}
