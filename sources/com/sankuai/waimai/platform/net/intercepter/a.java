package com.sankuai.waimai.platform.net.intercepter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.capacity.log.c;
import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.protocol.HttpContext;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements HttpRequestInterceptor {
    public static ChangeQuickRedirect a;

    public final void process(HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
        Object[] objArr = {httpRequest, httpContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1810f9fc3273e6615f7e4d6b7192e63f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1810f9fc3273e6615f7e4d6b7192e63f");
        } else if (httpRequest == null || httpRequest.getRequestLine() == null || httpRequest.getRequestLine().getUri() == null) {
        } else {
            com.sankuai.waimai.foundation.utils.log.a.b("dnsupload", httpRequest.getRequestLine().getUri(), new Object[0]);
            c.a().a(httpRequest.getRequestLine().getUri());
        }
    }
}
