package com.meituan.metrics.traffic.apache;

import android.support.annotation.Keep;
import com.meituan.metrics.traffic.reflection.ReflectWrapper;
import com.meituan.privacy.PrivacyUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.net.URI;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.protocol.HttpContext;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class ApachePrivacyInterceptor implements ReflectWrapper, HttpRequestInterceptor, HttpResponseInterceptor {
    public static ChangeQuickRedirect changeQuickRedirect;

    public void process(HttpResponse httpResponse, HttpContext httpContext) {
    }

    public void process(HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
        PrivacyUtil.b a;
        Object[] objArr = {httpRequest, httpContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "726b1769110d2fa999d7aebf0e6ba091", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "726b1769110d2fa999d7aebf0e6ba091");
        } else if (PrivacyUtil.a() && (httpRequest instanceof HttpUriRequest)) {
            HttpRequestBase httpRequestBase = (HttpUriRequest) httpRequest;
            if (httpRequestBase instanceof RequestWrapper) {
                RequestWrapper requestWrapper = (RequestWrapper) httpRequestBase;
                if (requestWrapper.getOriginal() instanceof HttpRequestBase) {
                    httpRequestBase = requestWrapper.getOriginal();
                }
            }
            if (httpRequestBase.getURI() != null && PrivacyUtil.a(httpRequestBase.getURI())) {
                URI uri = httpRequestBase.getURI();
                Object[] objArr2 = {3, uri};
                ChangeQuickRedirect changeQuickRedirect3 = PrivacyUtil.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "c67a70a53e26c0905b846fcaecf7ff9c", RobustBitConfig.DEFAULT_VALUE)) {
                    a = (PrivacyUtil.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "c67a70a53e26c0905b846fcaecf7ff9c");
                } else {
                    a = PrivacyUtil.a(3, uri != null ? uri.toString() : null);
                }
                if (a.a == 2) {
                    throw new PrivacyForbiddenException("CIPPrivacy forbid request");
                }
                if (a.a == 1 && (httpRequest instanceof RequestWrapper)) {
                    ((RequestWrapper) httpRequest).setURI(URI.create(a.b));
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class PrivacyForbiddenException extends HttpException {
        public static ChangeQuickRedirect changeQuickRedirect;

        public PrivacyForbiddenException(String str) {
            super(str);
        }
    }

    @Override // com.meituan.metrics.traffic.reflection.ReflectWrapper
    public void onWrapper(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4c665bb5c3a140080f8701c18756aa5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4c665bb5c3a140080f8701c18756aa5");
        } else if (obj instanceof DefaultHttpClient) {
            DefaultHttpClient defaultHttpClient = (DefaultHttpClient) obj;
            defaultHttpClient.addRequestInterceptor(this);
            defaultHttpClient.addResponseInterceptor(this);
            defaultHttpClient.addRequestInterceptor(new ApacheCandyInterceptor());
        }
    }
}
