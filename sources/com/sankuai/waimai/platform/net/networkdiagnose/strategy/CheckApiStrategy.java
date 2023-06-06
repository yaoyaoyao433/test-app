package com.sankuai.waimai.platform.net.networkdiagnose.strategy;

import android.content.Context;
import com.meituan.android.common.candy.CandyHttpRequestInterceptor;
import com.meituan.android.common.statistics.Constants;
import com.meituan.metrics.traffic.reflection.ApacheHttpWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.g;
import com.sankuai.waimai.platform.net.c;
import com.sankuai.waimai.platform.net.e;
import com.sankuai.waimai.platform.net.util.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class CheckApiStrategy extends a {
    private static final String CHECK_API = "check-api-strategy";
    private static final String HEADER_CONTENT_TYPE = "Content-Type";
    public static final String TAG = "CHECK_API_STRATEGY";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.net.networkdiagnose.strategy.a
    public String getName() {
        return "检查业务API是否可以访问";
    }

    public CheckApiStrategy(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "515778cb6486461f4480dfa620fab697", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "515778cb6486461f4480dfa620fab697");
        }
    }

    public CheckApiStrategy(Context context, com.sankuai.waimai.platform.net.networkdiagnose.a aVar) {
        super(context, aVar);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bbe6b18b8ed7a1f38e251ffae5305c59", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bbe6b18b8ed7a1f38e251ffae5305c59");
        }
    }

    @Override // com.sankuai.waimai.platform.net.networkdiagnose.strategy.a
    public void onDiagnose() {
        long j;
        HttpResponse execute;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e96fad4c7101f9954a0aa33edfdf136", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e96fad4c7101f9954a0aa33edfdf136");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : e.b().entrySet()) {
            if (!entry.getKey().contains(Constants.PRIVACY.KEY_LATITUDE) && !entry.getKey().contains(Constants.PRIVACY.KEY_LONGITUDE)) {
                arrayList.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append(currentTimeMillis);
        arrayList.add(new BasicNameValuePair("req_time", sb.toString()));
        arrayList.add(new BasicNameValuePair("waimai_sign", com.sankuai.waimai.foundation.utils.security.a.a(f.a + "v7/loadInfo", com.sankuai.waimai.platform.b.A().b(), currentTimeMillis, com.sankuai.waimai.platform.b.A().p())));
        arrayList.add(new BasicNameValuePair("app_pn", com.sankuai.waimai.platform.b.A().k()));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(com.sankuai.waimai.platform.b.A().l());
        arrayList.add(new BasicNameValuePair("width", sb2.toString()));
        StringBuilder sb3 = new StringBuilder();
        sb3.append(com.sankuai.waimai.platform.b.A().m());
        arrayList.add(new BasicNameValuePair("height", sb3.toString()));
        double[] h = g.h();
        long j2 = 0;
        if (h != null) {
            j2 = (long) (h[0] * 1000000.0d);
            j = (long) (h[1] * 1000000.0d);
        } else {
            j = 0;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(j2);
        arrayList.add(new BasicNameValuePair("last_time_latitude", sb4.toString()));
        StringBuilder sb5 = new StringBuilder();
        sb5.append(j);
        arrayList.add(new BasicNameValuePair("last_time_longitude", sb5.toString()));
        DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
        ApacheHttpWrapper.addRequestAndResponseInterceptor(defaultHttpClient);
        ApacheHttpWrapper.addRequestAndResponseInterceptor(defaultHttpClient);
        defaultHttpClient.addRequestInterceptor(new com.sankuai.waimai.platform.net.intercepter.b(this.context));
        defaultHttpClient.addRequestInterceptor(new CandyHttpRequestInterceptor(this.context));
        defaultHttpClient.addRequestInterceptor(new com.sankuai.waimai.platform.net.intercepter.a());
        try {
            HttpPost httpPost = new HttpPost(f.c + f.a + "v7/loadInfo?" + c.a().f());
            httpPost.setHeader("Accept-Encoding", "gzip");
            httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
            httpPost.setEntity(new UrlEncodedFormEntity(arrayList));
            if (defaultHttpClient.execute(httpPost) != null) {
                publishResult(CHECK_API, "SUCCEED: " + execute.getStatusLine().getStatusCode());
                return;
            }
            publishResult(CHECK_API, "FAILED {response body is null}");
        } catch (IOException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            publishResult(CHECK_API, "FAILED {error: " + e.getMessage() + CommonConstant.Symbol.BIG_BRACKET_RIGHT);
        }
    }
}
