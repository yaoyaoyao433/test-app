package com.sankuai.titans.proxy.shark;

import android.annotation.TargetApi;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.q;
import com.sankuai.titans.protocol.services.IStatisticsService;
import com.sankuai.titans.proxy.shark.net.SharkApi;
import com.sankuai.titans.proxy.shark.net.SharkPostBody;
import com.sankuai.titans.proxy.shark.net.SharkRetrofit;
import com.sankuai.titans.proxy.util.Constants;
import com.sankuai.titans.proxy.util.WebResourceRequestAnalysisHeaderData;
import com.sankuai.titans.proxy.util.WebResourceRequestUtil;
import java.net.HttpCookie;
import java.net.URLEncoder;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SharkManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final IStatisticsService statisticsService;

    public SharkManager(IStatisticsService iStatisticsService) {
        Object[] objArr = {iStatisticsService};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1958ba0119731059aed74b75d7adf871", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1958ba0119731059aed74b75d7adf871");
        } else {
            this.statisticsService = iStatisticsService;
        }
    }

    @TargetApi(21)
    public WebResourceResponse getSharkResponse(WebResourceRequest webResourceRequest) {
        Call<ap> post;
        Object[] objArr = {webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02a98e10d3e7577b0e172c37de6b2f4c", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02a98e10d3e7577b0e172c37de6b2f4c");
        }
        try {
            Uri url = webResourceRequest.getUrl();
            if (needUsingShark(url)) {
                WebResourceRequestAnalysisHeaderData analysisHeader = WebResourceRequestUtil.analysisHeader(webResourceRequest);
                String uri = url.toString();
                String method = webResourceRequest.getMethod();
                SharkApi sharkApi = (SharkApi) SharkRetrofit.getInstance().getRetrofit().a(SharkApi.class);
                boolean z = analysisHeader.addAccessControlHeaderToResponse;
                if (Constants.KEY_METHOD_OPTIONS.equalsIgnoreCase(method)) {
                    post = sharkApi.options(uri, analysisHeader.requestHeaders);
                } else {
                    if ("GET".equalsIgnoreCase(method)) {
                        post = sharkApi.get(uri, analysisHeader.requestHeaders);
                    } else if (!"POST".equalsIgnoreCase(method)) {
                        return null;
                    } else {
                        post = sharkApi.post(uri, analysisHeader.requestHeaders, new SharkPostBody(analysisHeader.contentType, analysisHeader.body, this.statisticsService));
                    }
                    z = false;
                }
                Response<ap> a = post.a();
                if (a != null && a.f()) {
                    List<q> d = a.d();
                    HashMap hashMap = new HashMap();
                    String str = "text/plain";
                    if (d != null && !d.isEmpty()) {
                        for (q qVar : d) {
                            String a2 = qVar.a();
                            String b = qVar.b();
                            if ("Content-Type".equalsIgnoreCase(a2)) {
                                int indexOf = b.indexOf(";");
                                str = indexOf > 0 ? b.substring(0, indexOf) : b;
                            } else if ("Set-Cookie".equalsIgnoreCase(a2)) {
                                try {
                                    List<HttpCookie> parse = HttpCookie.parse(b);
                                    for (HttpCookie httpCookie : parse) {
                                        if (httpCookie.getDomain() == null) {
                                            httpCookie.setDomain(url.getHost());
                                        }
                                    }
                                    setCookie(parse);
                                } catch (Exception e) {
                                    this.statisticsService.reportClassError("SharkManager", "getSharkResponse", e);
                                }
                            } else if (z && "Access-Control-Allow-Headers".equalsIgnoreCase(a2)) {
                                b = TextUtils.isEmpty(b) ? "X-TitansX-Body" : b + ",X-TitansX-Body";
                            }
                            hashMap.put(a2, b);
                        }
                    }
                    String str2 = str;
                    String c = a.c();
                    if (c == null) {
                        c = "empty reason for: " + a.b();
                    }
                    return new WebResourceResponse(str2, "UTF-8", a.b(), c, hashMap, a.e().source());
                }
                return null;
            }
            return null;
        } catch (Exception e2) {
            this.statisticsService.reportClassError("SharkManager", "getSharkResponse", e2);
            return null;
        }
    }

    private boolean needUsingShark(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f94c66296bf898333ae4888e4c51561", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f94c66296bf898333ae4888e4c51561")).booleanValue() : Build.VERSION.SDK_INT >= 21 && uri.isHierarchical() && "1".equals(uri.getQueryParameter(TrafficRecord.Detail.TUNNEL_SHARK));
    }

    private void setCookie(List<HttpCookie> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c774ad8017f8ae7809de2743dbd44698", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c774ad8017f8ae7809de2743dbd44698");
            return;
        }
        CookieManager cookieManager = CookieManager.getInstance();
        if (cookieManager != null) {
            for (HttpCookie httpCookie : list) {
                cookieManager.setCookie(httpCookie.getDomain(), getFormatCookieString(httpCookie));
            }
        }
    }

    private String getFormatCookieString(HttpCookie httpCookie) {
        String str;
        Object[] objArr = {httpCookie};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7372d228cfedfb28507e8488114d9c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7372d228cfedfb28507e8488114d9c4");
        }
        try {
            str = URLEncoder.encode(httpCookie.getValue(), "utf-8");
        } catch (Throwable th) {
            String value = httpCookie.getValue();
            this.statisticsService.reportClassError("SharkManager", "getFormatCookieString", th);
            str = value;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(httpCookie.getName());
        sb.append("=");
        sb.append(str);
        sb.append("; Domain=");
        sb.append(httpCookie.getDomain());
        if (!TextUtils.isEmpty(httpCookie.getPath())) {
            sb.append("; Path=");
            sb.append(httpCookie.getPath());
        }
        if (httpCookie.getMaxAge() > 0) {
            sb.append("; Expires=");
            sb.append(new Date(System.currentTimeMillis() + (httpCookie.getMaxAge() * 1000)).toString());
        }
        if (httpCookie.getSecure()) {
            sb.append("; Secure");
        }
        if (TextUtils.equals("token", httpCookie.getName()) || TextUtils.equals("dper", httpCookie.getName())) {
            sb.append("; HttpOnly");
        } else if (Build.VERSION.SDK_INT >= 24 && httpCookie.isHttpOnly()) {
            sb.append("; HttpOnly");
        }
        return sb.toString();
    }
}
