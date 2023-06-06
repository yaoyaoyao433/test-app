package com.sankuai.titans.dns;

import android.content.Context;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.meituan.android.httpdns.i;
import com.meituan.android.httpdns.j;
import com.meituan.metrics.traffic.reflection.OkHttp2Wrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.dns.config.ITitansHttpDnsConfigInit;
import com.sankuai.titans.dns.config.TitansHttpDnsConfig;
import com.sankuai.titans.dns.util.TitansHttpDnsLogUtil;
import com.sankuai.titans.dns.util.TitansHttpDnsUtil;
import com.sankuai.waimai.launcher.util.aop.b;
import com.squareup.okhttp.o;
import com.squareup.okhttp.r;
import com.squareup.okhttp.v;
import com.squareup.okhttp.x;
import com.squareup.okhttp.z;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TitansHttpDnsManager {
    private static final String ENCODING_UTF = "UTF-8";
    private static final String HTTP_HEADER_KEY_CONTENT_TYPE = "Content-Type";
    private static final String METHOD_GET = "GET";
    private static final String MIME_TYPE_PLAIN = "text/plain";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final AtomicBoolean isInit = new AtomicBoolean(false);
    private static volatile v sOkHttpClient;
    private static TitansHttpDnsConfig titansHttpDnsConfig;

    public static void init(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b147fb9cf7c022c01b36511e26a63411", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b147fb9cf7c022c01b36511e26a63411");
        } else if (isInit.getAndSet(true)) {
        } else {
            i.a(i);
            TitansHttpDnsLogUtil.log("TitansHttpDns插件初始化：[appId=" + i + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        }
    }

    public static void cityChanged(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5b47adedf781d9813f2f7de810f6ebef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5b47adedf781d9813f2f7de810f6ebef");
        } else if (isInit.get()) {
            i.a(context, str);
            obtainTitansConfig(context, str);
            TitansHttpDnsLogUtil.log("TitansHttpDns插件城市更改：[cityId=" + str + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        }
    }

    public static void setDnsConfig(TitansHttpDnsConfig titansHttpDnsConfig2) {
        Object[] objArr = {titansHttpDnsConfig2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4fd45011c29cac8d768b5099a12b0df7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4fd45011c29cac8d768b5099a12b0df7");
        } else if (!isInit.get() || titansHttpDnsConfig2 == null) {
        } else {
            titansHttpDnsConfig = titansHttpDnsConfig2;
            TitansHttpDnsLogUtil.log("TitansHttpDns插件外部传入配置：[config=" + titansHttpDnsConfig2.toString() + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        }
    }

    @RequiresApi(api = 21)
    public static WebResourceResponse executeHttp(Context context, WebResourceRequest webResourceRequest) {
        Object[] objArr = {context, webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9b936a6f4e361d7e657333922e0bd156", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9b936a6f4e361d7e657333922e0bd156");
        }
        if (!isInit.get()) {
            TitansHttpDnsLogUtil.log("TitansHttpDns插件转发请求失败：[not init]");
            return null;
        } else if (webResourceRequest == null) {
            TitansHttpDnsLogUtil.log("TitansHttpDns插件转发请求失败：[request is null]");
            return null;
        } else if (!"GET".equalsIgnoreCase(webResourceRequest.getMethod())) {
            TitansHttpDnsLogUtil.log("TitansHttpDns插件转发请求失败：[url=" + webResourceRequest.getUrl() + ",method=" + webResourceRequest.getMethod() + ",not GET method]");
            return null;
        } else if (titansHttpDnsConfig == null || !titansHttpDnsConfig.enable || titansHttpDnsConfig.whiteList == null || titansHttpDnsConfig.whiteList.size() == 0) {
            TitansHttpDnsLogUtil.log("TitansHttpDns插件转发请求失败：[config is null or enable is false or whiteList is empty]");
            return null;
        } else {
            String host = webResourceRequest.getUrl().getHost();
            if (!titansHttpDnsConfig.whiteList.contains(host)) {
                TitansHttpDnsLogUtil.log("TitansHttpDns插件转发请求失败：[host=" + host + ",not in whiteList]");
                return null;
            }
            try {
                String uri = webResourceRequest.getUrl().toString();
                TitansHttpDnsLogUtil.log("TitansHttpDns插件转发请求：[url=" + uri + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                x.a a = new x.a().a(uri);
                Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
                if (requestHeaders != null) {
                    for (Map.Entry<String, String> entry : requestHeaders.entrySet()) {
                        if (entry != null) {
                            a.b(entry.getKey(), entry.getValue());
                        }
                    }
                }
                z a2 = getOkHttpClient(context).a(a.a()).a();
                if (a2 == null) {
                    TitansHttpDnsLogUtil.log("TitansHttpDns插件转发请求失败：[url=" + uri + ",response is null]");
                    return null;
                }
                r rVar = a2.f;
                HashMap hashMap = new HashMap();
                String str = "text/plain";
                for (int i = 0; i < rVar.a.length / 2; i++) {
                    String a3 = rVar.a(i);
                    String b = rVar.b(i);
                    if ("Content-Type".equalsIgnoreCase(a3) && !TextUtils.isEmpty(b)) {
                        int indexOf = b.indexOf(";");
                        str = indexOf > 0 ? b.substring(0, indexOf) : b;
                    }
                    hashMap.put(a3, b);
                }
                String str2 = !TextUtils.isEmpty(a2.d) ? a2.d : "response message is empty";
                TitansHttpDnsLogUtil.log("TitansHttpDns插件转发请求结果：[url=" + uri + "，response=" + a2);
                return new WebResourceResponse(str, "UTF-8", a2.c, str2, hashMap, a2.g.d());
            } catch (Exception e) {
                TitansHttpDnsLogUtil.log("TitansHttpDns插件转发请求失败：[catch exception: " + Log.getStackTraceString(e) + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                return null;
            }
        }
    }

    private static v getOkHttpClient(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "aed0c601dba8a7e0dad32d7bc1732801", RobustBitConfig.DEFAULT_VALUE)) {
            return (v) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "aed0c601dba8a7e0dad32d7bc1732801");
        }
        if (sOkHttpClient == null) {
            synchronized (TitansHttpDnsManager.class) {
                if (sOkHttpClient == null) {
                    final j a = new j.a().a(context);
                    v vVar = new v();
                    OkHttp2Wrapper.addInterceptorToClient(vVar);
                    v a2 = b.a(vVar);
                    a2.s = new o() { // from class: com.sankuai.titans.dns.TitansHttpDnsManager.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // com.squareup.okhttp.o
                        public final List<InetAddress> lookup(String str) throws UnknownHostException {
                            Object[] objArr2 = {str};
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1acf1dfc04d57ff18afececbb78b1da9", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1acf1dfc04d57ff18afececbb78b1da9") : j.this.b(str);
                        }
                    };
                    sOkHttpClient = a2;
                }
            }
        }
        return sOkHttpClient;
    }

    private static void obtainTitansConfig(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3c266396b392b8be7ba94106bd54fd95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3c266396b392b8be7ba94106bd54fd95");
            return;
        }
        ITitansHttpDnsConfigInit configInit = TitansHttpDnsUtil.getConfigInit();
        if (configInit == null) {
            return;
        }
        configInit.fetchConfig(context, str, new ITitansHttpDnsConfigInit.ConfigCallback() { // from class: com.sankuai.titans.dns.TitansHttpDnsManager.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.titans.dns.config.ITitansHttpDnsConfigInit.ConfigCallback
            public final void onResult(TitansHttpDnsConfig titansHttpDnsConfig2) {
                Object[] objArr2 = {titansHttpDnsConfig2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bc3764d27e894546cee430be0820feda", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bc3764d27e894546cee430be0820feda");
                    return;
                }
                TitansHttpDnsConfig unused = TitansHttpDnsManager.titansHttpDnsConfig = titansHttpDnsConfig2;
                TitansHttpDnsLogUtil.log("TitansHttpDns插件拉取配置回调：[config=" + titansHttpDnsConfig2.toString() + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            }
        });
    }
}
