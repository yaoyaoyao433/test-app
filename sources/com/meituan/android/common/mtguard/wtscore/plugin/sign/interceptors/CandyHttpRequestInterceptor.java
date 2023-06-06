package com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.internal.http.multipart.MultipartEntity;
import com.meituan.android.common.mtguard.wtscore.plugin.sign.core.a;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.protocol.HttpContext;
/* loaded from: classes2.dex */
public class CandyHttpRequestInterceptor implements HttpRequestInterceptor {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Context mContext;

    public CandyHttpRequestInterceptor() {
    }

    public CandyHttpRequestInterceptor(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a4a1b6dc532faa083844dfd2c23a7f2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a4a1b6dc532faa083844dfd2c23a7f2");
        } else {
            this.mContext = context;
        }
    }

    private URI createURI(HttpHost httpHost, RequestWrapper requestWrapper) {
        Object[] objArr = {httpHost, requestWrapper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b60638d487768dfee2cb7311556d87b7", 6917529027641081856L)) {
            return (URI) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b60638d487768dfee2cb7311556d87b7");
        }
        Uri parse = Uri.parse(requestWrapper.getOriginal().getRequestLine().getUri());
        Uri.Builder buildUpon = Uri.parse(URI.create(requestWrapper.getURI().toASCIIString()).toASCIIString()).buildUpon();
        if (TextUtils.isEmpty(parse.getHost()) && httpHost != null) {
            String uri = parse.toString();
            parse = Uri.parse(httpHost.toURI() + uri);
        }
        String uri2 = TextUtils.isEmpty(parse.getEncodedQuery()) ? parse.toString() : parse.toString().split("\\?")[0];
        return URI.create(uri2 + CommonConstant.Symbol.QUESTION_MARK + buildUpon.build().getEncodedQuery());
    }

    private URI createURIWithoutHost(URI uri) {
        String concat;
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a82c7da9a29b18868de80a4f8e9ed958", 6917529027641081856L)) {
            return (URI) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a82c7da9a29b18868de80a4f8e9ed958");
        }
        String aSCIIString = uri.toASCIIString();
        if (TextUtils.isEmpty(uri.getPath())) {
            Uri parse = Uri.parse(uri.toASCIIString());
            concat = "/?" + parse.getEncodedQuery();
        } else {
            concat = "/".concat(String.valueOf(aSCIIString.split("//", 2)[1].split("/", 2)[1]));
        }
        return URI.create(concat);
    }

    private static byte[] requestBody(HttpRequest httpRequest) {
        Object[] objArr = {httpRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "79d0fa11f41d723fd234ef02f94b22c3", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "79d0fa11f41d723fd234ef02f94b22c3");
        }
        if (httpRequest instanceof HttpEntityEnclosingRequest) {
            HttpEntityEnclosingRequest httpEntityEnclosingRequest = (HttpEntityEnclosingRequest) httpRequest;
            if (httpEntityEnclosingRequest.getEntity() != null) {
                BufferedHttpEntity entity = httpEntityEnclosingRequest.getEntity();
                try {
                    if (!httpEntityEnclosingRequest.getEntity().isRepeatable()) {
                        entity = new BufferedHttpEntity(httpEntityEnclosingRequest.getEntity());
                        httpEntityEnclosingRequest.setEntity(entity);
                    }
                    try {
                        return IOUtils.toByteArray(entity.getContent());
                    } catch (Exception e) {
                        MTGuardLog.setErrorLogan(e);
                        if (entity instanceof MultipartEntity) {
                            MultipartEntity multipartEntity = (MultipartEntity) entity;
                            if (multipartEntity.isRepeatable()) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) multipartEntity.getContentLength());
                                multipartEntity.writeTo(byteArrayOutputStream);
                                return byteArrayOutputStream.toByteArray();
                            }
                        }
                    }
                } catch (IOException e2) {
                    MTGuardLog.setErrorLogan(e2);
                }
            }
        }
        return null;
    }

    public void process(HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
        Header[] allHeaders;
        HttpEntity entity;
        Header contentType;
        Object[] objArr = {httpRequest, httpContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89b0f86cc372a00e18a76173b772bbdf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89b0f86cc372a00e18a76173b772bbdf");
        } else if (httpRequest instanceof RequestWrapper) {
            RequestWrapper requestWrapper = (RequestWrapper) httpRequest;
            HttpHost httpHost = (HttpHost) httpContext.getAttribute("http.target_host");
            HashMap hashMap = new HashMap();
            String str = "";
            HashMap hashMap2 = new HashMap();
            if ((httpRequest instanceof HttpEntityEnclosingRequest) && (entity = ((HttpEntityEnclosingRequest) httpRequest).getEntity()) != null && (contentType = entity.getContentType()) != null) {
                str = contentType.getValue();
            }
            String str2 = "";
            String str3 = str;
            for (Header header : httpRequest.getAllHeaders()) {
                hashMap2.put(header.getName(), header.getValue());
                if (header.getName().equalsIgnoreCase("user-agent")) {
                    str2 = header.getValue();
                }
                if (TextUtils.isEmpty(str3) && header.getName().equalsIgnoreCase("Content-Type")) {
                    str3 = header.getValue();
                }
            }
            URI a = httpRequest.getRequestLine().getMethod().equalsIgnoreCase("post") ? a.a(this.mContext, createURI(httpHost, requestWrapper), requestBody(httpRequest), str2, str3, hashMap, hashMap2) : httpRequest.getRequestLine().getMethod().equalsIgnoreCase("get") ? a.a(this.mContext, createURI(httpHost, requestWrapper), str2, str3, hashMap, hashMap2) : a.a(this.mContext, createURI(httpHost, requestWrapper), requestBody(httpRequest), str2, str3, hashMap, httpRequest.getRequestLine().getMethod(), hashMap2);
            if (a == null) {
                return;
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                if (httpRequest.containsHeader((String) entry.getKey())) {
                    httpRequest.setHeader((String) entry.getKey(), (String) entry.getValue());
                } else {
                    httpRequest.addHeader((String) entry.getKey(), (String) entry.getValue());
                }
            }
            if (TextUtils.isEmpty(requestWrapper.getURI().getHost())) {
                a = createURIWithoutHost(a);
            }
            requestWrapper.setURI(a);
        }
    }
}
