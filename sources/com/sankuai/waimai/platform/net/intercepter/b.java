package com.sankuai.waimai.platform.net.intercepter;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.URI;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.protocol.HttpContext;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements HttpRequestInterceptor {
    public static ChangeQuickRedirect a;
    private static String c = System.getProperty("http.agent");
    private Context b;

    public b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01912bb5c11f8e59c0f555c2541b229f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01912bb5c11f8e59c0f555c2541b229f");
        } else {
            this.b = context;
        }
    }

    public final void process(HttpRequest httpRequest, HttpContext httpContext) {
        Object[] objArr = {httpRequest, httpContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b2880e228119331c17e6574b8dc481a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b2880e228119331c17e6574b8dc481a");
            return;
        }
        try {
            if (httpRequest instanceof RequestWrapper) {
                RequestWrapper requestWrapper = (RequestWrapper) httpRequest;
                requestWrapper.setURI(new URI(requestWrapper.getURI().toASCIIString()));
                if (TextUtils.isEmpty(c)) {
                    return;
                }
                httpRequest.addHeader("User-Agent", c);
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.e("CommonParamsInterceptor.process", e.getMessage(), new Object[0]);
        }
    }
}
