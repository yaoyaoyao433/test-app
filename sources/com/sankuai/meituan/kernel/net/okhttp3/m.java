package com.sankuai.meituan.kernel.net.okhttp3;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class m implements Interceptor {
    public static ChangeQuickRedirect a;
    private com.sankuai.meituan.kernel.net.report.a b;

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Object[] objArr = {chain};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "873e6c0631a916dfc08e085f6510d0ec", RobustBitConfig.DEFAULT_VALUE) ? (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "873e6c0631a916dfc08e085f6510d0ec") : a(chain);
    }

    private Response a(Interceptor.Chain chain) throws IOException {
        StringWriter stringWriter;
        Object[] objArr = {chain};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93ecd0ba34dfa730aa1b981e69f8c816", RobustBitConfig.DEFAULT_VALUE)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93ecd0ba34dfa730aa1b981e69f8c816");
        }
        Request request = chain.request();
        if (this.b == null) {
            this.b = com.sankuai.meituan.kernel.net.report.a.a();
        }
        String str = request.url().url().getHost() + request.url().url().getPath();
        if (l.a(str)) {
            return chain.proceed(request);
        }
        int a2 = com.sankuai.meituan.kernel.net.utils.b.a(request.url().url().getProtocol());
        long currentTimeMillis = System.currentTimeMillis();
        int contentLength = (int) ((request.body() == null ? 0L : request.body().contentLength()) + com.sankuai.meituan.kernel.net.utils.b.a(request.headers()) + request.url().toString().getBytes().length);
        JSONObject jSONObject = new JSONObject();
        try {
            Response proceed = chain.proceed(request);
            int currentTimeMillis2 = (int) (System.currentTimeMillis() - currentTimeMillis);
            int a3 = d.a(proceed);
            if (a3 < 0) {
                String a4 = com.sankuai.meituan.common.net.a.a().a(request.url().host());
                l.a(jSONObject);
                l.a(jSONObject, a3, null, request, null);
                this.b.pv4(0L, str, 0, a2, a3, contentLength, 0, currentTimeMillis2, a4, jSONObject.toString());
                return proceed;
            }
            return proceed;
        } catch (Exception e) {
            e.printStackTrace(new PrintWriter(new StringWriter()));
            int a5 = d.a(e);
            com.dianping.codelog.b.a(e.getClass(), "url:" + request.url().toString() + ",code:" + a5 + stringWriter.toString());
            String a6 = com.sankuai.meituan.common.net.a.a().a(request.url().host());
            l.a(jSONObject);
            l.a(jSONObject, a5, null, request, null);
            this.b.pv4(0L, str, 0, a2, a5, contentLength, 0, (int) (System.currentTimeMillis() - currentTimeMillis), a6, jSONObject.toString());
            throw e;
        }
    }
}
