package com.meituan.metrics.traffic.apache;

import android.support.annotation.Keep;
import com.meituan.android.common.mtguard.MTGConfigs;
import com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors.CandyHttpRequestInterceptor;
import com.meituan.privacy.PrivacyUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.protocol.HttpContext;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class ApacheCandyInterceptor implements HttpRequestInterceptor {
    public static ChangeQuickRedirect changeQuickRedirect;

    public void process(HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
        Header[] headers;
        Object[] objArr = {httpRequest, httpContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c67c00ed61e429d08f113547abcc3648", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c67c00ed61e429d08f113547abcc3648");
        } else if (!PrivacyUtil.a() || (headers = httpRequest.getHeaders(MTGConfigs.c)) == null || headers.length == 0) {
        } else {
            new CandyHttpRequestInterceptor().process(httpRequest, httpContext);
        }
    }
}
