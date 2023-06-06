package com.dianping.titans.client;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import com.dianping.monitor.impl.j;
import com.dianping.networklog.c;
import com.dianping.titans.cache.CachedResourceManager;
import com.dianping.titans.cache.MimeTypeInputStream;
import com.dianping.titans.js.JsHost;
import com.dianping.titans.js.KNBJsHost;
import com.dianping.titans.offline.OfflineCenter;
import com.dianping.titans.service.GsonProvider;
import com.dianping.titans.shark.SharkApi;
import com.dianping.titans.shark.SharkRetrofit;
import com.dianping.titans.ui.ITitleBar;
import com.dianping.titans.utils.Constants;
import com.dianping.titans.utils.CookieUtil;
import com.dianping.titans.utils.JavaScriptComposer;
import com.dianping.titans.utils.PerformanceAnalysis;
import com.dianping.titans.utils.TitansReporter;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.MD5;
import com.sankuai.meituan.android.knb.BuildConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import com.sankuai.meituan.android.knb.KNBWebManager;
import com.sankuai.meituan.android.knb.localresource.LocalResourceManager;
import com.sankuai.meituan.android.knb.proxy.NativeRetryManager;
import com.sankuai.meituan.android.knb.proxy.util.WebResourceRequestAnalysisHeaderData;
import com.sankuai.meituan.android.knb.proxy.util.WebResourceRequestUtil;
import com.sankuai.meituan.android.knb.util.EnvUtil;
import com.sankuai.meituan.android.knb.util.JsInjector;
import com.sankuai.meituan.android.knb.util.UriUtil;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.q;
import com.sankuai.titans.EventReporter;
import com.sankuai.titans.UriKit;
import com.sankuai.titans.debug.adapter.TitansDebugManager;
import com.sankuai.titans.debug.adapter.old.ILoadJs;
import com.sankuai.titans.debug.adapter.old.IOldAppMockIntercept;
import com.sankuai.titans.debug.adapter.old.IOldJsInject;
import com.sankuai.titans.debug.adapter.old.IOldTitansDebug;
import com.sankuai.titans.debug.adapter.old.IOldWebProxyIntercept;
import com.sankuai.titans.dns.TitansHttpDnsManager;
import com.sankuai.titans.result.privacy.PrivacyTitansManager;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpCookie;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class TitansWebViewClient extends WebViewClient {
    private static final String BURST_PATH_ONE = "/bsm";
    private static final String BURST_PATH_TWO = "/bs";
    private static final List<String> BURST_URL = Arrays.asList("https://s0.meituan.net", "https://s1.meituan.net", "https://s4.meituan.net", "https://static.meituan.net", "https://s0.meituan.com", "https://s1.meituan.com", "https://s.sankuai.com");
    private static final String JS_FUNCTION_DEFAULT = "javascript:(function(){var event = document.createEvent(\"HTMLEvents\");event.initEvent(\"DPJSBridgeReady\",true,false);document.dispatchEvent(event);document.dpReadyState='complete';})();";
    private static final String JS_FUNCTION_DP = "javascript:(function(){var event = document.createEvent(\"HTMLEvents\");event.osName = \"android\";%sevent.initEvent(\"DPJSBridgeReady\",true,false);document.dispatchEvent(event);document.dpReadyState='complete';})();";
    private static final String JS_INJECT = "javascript:(function () {\n  var script = document.createElement('script');\n  script.src = 'https://static.meituan.net/bs/mbs-patch/master/%s.js';\n  document.body.appendChild(script);\n}());";
    public static final String JS_INJECT_BY_SRC = "javascript:(function(){\nvar script = document.createElement('script');\nscript.src = '%s';\ndocument.head.appendChild(script);\n})();";
    public static final String JS_INJECT_VCONSOLE = "javascript:(function(){\nvar script = document.createElement('script');\nscript.src = 'https://static.meituan.net/bs/vconsole/3.3.4/vconsole.min.js';\nscript.onload=function(){var vConsole = new VConsole()};\ndocument.head.appendChild(script);\n})();";
    public static ChangeQuickRedirect changeQuickRedirect;
    private j dnsMonitorService;
    private String forMainFrameUrl;
    private boolean hasError;
    private boolean isError;
    private boolean isPageFinished;
    protected final JsHost jsHost;
    private long mPageStatedTime;
    private long mStartMillis;

    public TitansWebViewClient(@NonNull JsHost jsHost) {
        Object[] objArr = {jsHost};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f600882f0af4f21e6d653b585463a2de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f600882f0af4f21e6d653b585463a2de");
            return;
        }
        this.isError = false;
        this.isPageFinished = false;
        this.forMainFrameUrl = "";
        this.jsHost = jsHost;
    }

    public boolean isError() {
        return this.isError;
    }

    public void setError(boolean z) {
        this.isError = z;
    }

    public boolean isPageFinished() {
        return this.isPageFinished;
    }

    public long obtainPageStartedTime() {
        return this.mPageStatedTime;
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        ITitleBar titleBarHost;
        Object[] objArr = {webView, str, bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a06fa993837d905ed35f2249dfa229cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a06fa993837d905ed35f2249dfa229cd");
            return;
        }
        super.onPageStarted(webView, str, bitmap);
        this.mStartMillis = SystemClock.uptimeMillis();
        this.mPageStatedTime = System.currentTimeMillis();
        this.isPageFinished = false;
        this.jsHost.setUrl(str);
        TitansReporter.webviewLog("start load url", str);
        this.jsHost.resetJsHandler();
        if ((this.jsHost instanceof KNBJsHost ? ((KNBJsHost) this.jsHost).getDynamicTitleBar() : null) == null && (titleBarHost = this.jsHost.getTitleBarHost()) != null) {
            titleBarHost.showProgressBar(true);
        }
        TextView tvUrl = this.jsHost.getTvUrl();
        if (tvUrl != null) {
            tvUrl.setText(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        Object[] objArr = {webView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53203ccc00651f9f0b3337cd3316af97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53203ccc00651f9f0b3337cd3316af97");
            return;
        }
        super.onPageFinished(webView, str);
        this.isError = false;
        this.isPageFinished = true;
        PerformanceAnalysis.getInstance().onKnbPageFinished(str);
        this.jsHost.loadJs(JavaScriptComposer.makeCustomeEvent("titans-timestamp", GsonProvider.getGson().toJson(PerformanceAnalysis.getInstance().getTimeStamp())));
        EventReporter eventReporter = EventReporter.getInstance();
        Uri parse = str != null ? Uri.parse(str) : null;
        eventReporter.reportTiming("Page.Load", parse, SystemClock.uptimeMillis() - this.mStartMillis);
        eventReporter.reportPageAccess(parse, this.hasError ? 1 : 0, BuildConfig.VERSION_NAME);
        StringBuilder sb = new StringBuilder();
        sb.append(SystemClock.uptimeMillis() - this.mStartMillis);
        TitansReporter.webviewLog("page finish url: " + str + " load time", sb.toString());
        if (parse != null && !TextUtils.isEmpty(parse.getPath()) && parse.getPath().contains("error")) {
            TitansReporter.reportException("TitansWebViewClient_onPageFinished", UriKit.basicURLString(parse), new Exception("pageUrl contains error"));
        }
        this.hasError = false;
        if (this.jsHost.isInWhiteList(str)) {
            StringBuffer stringBuffer = new StringBuffer();
            Map<String, String> jsEventParams = getJsEventParams();
            for (String str2 : jsEventParams.keySet()) {
                stringBuffer.append(String.format("event.%s = \"%s\";", str2, jsEventParams.get(str2)));
            }
            TitansReporter.webviewLog(str + " load JS", stringBuffer.toString());
            this.jsHost.loadJs(String.format("javascript:(function(){var event = document.createEvent(\"HTMLEvents\");event.osName = \"android\";%sevent.initEvent(\"DPJSBridgeReady\",true,false);document.dispatchEvent(event);document.dpReadyState='complete';})();", stringBuffer));
        } else {
            TitansReporter.webviewLog(str + " load JS", "javascript:(function(){var event = document.createEvent(\"HTMLEvents\");event.initEvent(\"DPJSBridgeReady\",true,false);document.dispatchEvent(event);document.dpReadyState='complete';})();");
            this.jsHost.loadJs("javascript:(function(){var event = document.createEvent(\"HTMLEvents\");event.initEvent(\"DPJSBridgeReady\",true,false);document.dispatchEvent(event);document.dpReadyState='complete';})();");
        }
        String format = String.format("javascript:window.getWebViewState = function() {return %s}", this.jsHost.getWebViewEnv());
        TitansReporter.webviewLog(str + " load js ", format);
        this.jsHost.loadJs(format);
        try {
            injectJs(str);
        } catch (Exception e) {
            Log.e("KNB_DEBUG_JS", e.getMessage(), e);
            if (KNBWebManager.isDebug()) {
                throw e;
            }
        }
    }

    private void injectJs(String str) {
        IOldJsInject jsInject;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "358a9aa5a01ac2f3b3264a58ececf178", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "358a9aa5a01ac2f3b3264a58ececf178");
            return;
        }
        Uri parse = Uri.parse(str);
        if (parse.isHierarchical() && !TextUtils.isEmpty(parse.getQueryParameter("patch"))) {
            String messageDigest = MD5.getMessageDigest(UriUtil.clearQueryAndFragment(parse).getBytes());
            String queryParameter = parse.getQueryParameter("patch");
            if (!"default".equals(queryParameter)) {
                messageDigest = messageDigest + CommonConstant.Symbol.MINUS + queryParameter;
            }
            TitansReporter.webviewLog(str + " load js", String.format("javascript:(function () {\n  var script = document.createElement('script');\n  script.src = 'https://static.meituan.net/bs/mbs-patch/master/%s.js';\n  document.body.appendChild(script);\n}());", messageDigest));
            this.jsHost.loadJs(String.format("javascript:(function () {\n  var script = document.createElement('script');\n  script.src = 'https://static.meituan.net/bs/mbs-patch/master/%s.js';\n  document.body.appendChild(script);\n}());", messageDigest));
            return;
        }
        IOldTitansDebug oldTitansDebug = TitansDebugManager.getOldTitansDebug();
        if (oldTitansDebug != null && (jsInject = oldTitansDebug.getJsInject()) != null) {
            jsInject.onPageFinish(JsInjector.getInstance().isBitmapMonitorEnable(), JsInjector.getInstance().jsonArrayToList(), new ILoadJs() { // from class: com.dianping.titans.client.TitansWebViewClient.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.debug.adapter.old.ILoadJs
                public void loadJs(String str2) {
                    Object[] objArr2 = {str2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f2088974c49ac51699cbaea0cf12f5e9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f2088974c49ac51699cbaea0cf12f5e9");
                    } else {
                        TitansWebViewClient.this.jsHost.loadJs(str2);
                    }
                }
            });
        }
        JSONArray jSONArray = (JSONArray) KNBConfig.getConfig(KNBConfig.CONFIG_INJECT_PATCH_JS, JSONArray.class);
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            String optString = optJSONObject.optString("page");
            JSONArray optJSONArray = optJSONObject.optJSONArray("more");
            if (!TextUtils.isEmpty(optString) && str.contains(optString)) {
                if (optJSONArray == null || optJSONArray.length() == 0) {
                    String messageDigest2 = MD5.getMessageDigest(UriUtil.clearQueryAndFragment(parse).getBytes());
                    if (!TextUtils.isEmpty(messageDigest2)) {
                        TitansReporter.webviewLog(str + " load js", String.format("javascript:(function () {\n  var script = document.createElement('script');\n  script.src = 'https://static.meituan.net/bs/mbs-patch/master/%s.js';\n  document.body.appendChild(script);\n}());", messageDigest2));
                        this.jsHost.loadJs(String.format("javascript:(function () {\n  var script = document.createElement('script');\n  script.src = 'https://static.meituan.net/bs/mbs-patch/master/%s.js';\n  document.body.appendChild(script);\n}());", messageDigest2));
                    }
                } else {
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        String optString2 = optJSONArray.optString(i2);
                        if (!TextUtils.isEmpty(optString2)) {
                            TitansReporter.webviewLog(str + " load js", String.format("javascript:(function(){\nvar script = document.createElement('script');\nscript.src = '%s';\ndocument.head.appendChild(script);\n})();", optString2));
                            this.jsHost.loadJs(String.format("javascript:(function(){\nvar script = document.createElement('script');\nscript.src = '%s';\ndocument.head.appendChild(script);\n})();", optString2));
                        }
                    }
                }
            }
        }
    }

    public Map<String, String> getJsEventParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "361e62a7de1e65450bd9daea5ad9c73b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "361e62a7de1e65450bd9daea5ad9c73b");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("osVersion", Build.VERSION.RELEASE);
        hashMap.put("appName", this.jsHost.getPackageName());
        hashMap.put("appVersion", this.jsHost.getVersionName());
        return hashMap;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        Object[] objArr = {webView, Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8185f474ef71a815739daff784305232", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8185f474ef71a815739daff784305232");
            return;
        }
        super.onReceivedError(webView, i, str, str2);
        if (this.jsHost instanceof KNBJsHost) {
            ((KNBJsHost) this.jsHost).showMask(i, str, str2);
        } else {
            this.jsHost.showMask();
        }
        ITitleBar titleBarHost = this.jsHost.getTitleBarHost();
        if (titleBarHost != null) {
            titleBarHost.showProgressBar(false);
            if (this.jsHost.isShowTitlebarOnReceivedError()) {
                titleBarHost.showTitleBar(true);
            }
        }
        this.hasError = true;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(21)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Object[] objArr = {webView, webResourceRequest, webResourceError};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "deb5d5b3261ab6eaecab166fc609c586", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "deb5d5b3261ab6eaecab166fc609c586");
            return;
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (Build.VERSION.SDK_INT >= 23) {
            String uri = webResourceRequest.getUrl().toString();
            StringBuilder sb = new StringBuilder();
            sb.append(webResourceError.getErrorCode());
            TitansReporter.webviewLog(uri, sb.toString());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        String str;
        String str2;
        Object[] objArr = {webView, webResourceRequest, webResourceResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35b5202ee8646541a50fa56e5048d49e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35b5202ee8646541a50fa56e5048d49e");
            return;
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String uri = url.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(webResourceResponse.getStatusCode());
        TitansReporter.webviewLog(uri, sb.toString());
        boolean booleanConfig = KNBConfig.getBooleanConfig(KNBConfig.CONFIG_SWITCH_USING_CHECK_HTTP_ERROR, true);
        if (webResourceRequest.isForMainFrame() && booleanConfig) {
            try {
                str = String.format("错误码：%1$s<br>页面：%2$s", Integer.valueOf(webResourceResponse.getStatusCode()), UriUtil.clearQueryAndFragment(url));
                try {
                    str2 = String.format("StatusCode：%1$s\nUrl：%2$s", Integer.valueOf(webResourceResponse.getStatusCode()), url.toString());
                } catch (Throwable th) {
                    th = th;
                    th.printStackTrace();
                    str2 = "";
                    this.jsHost.loadUrl(Constants.getErrorUrl(Constants.ERROR_TYPE_HTTP_ERROR, str, str2));
                }
            } catch (Throwable th2) {
                th = th2;
                str = "";
            }
            this.jsHost.loadUrl(Constants.getErrorUrl(Constants.ERROR_TYPE_HTTP_ERROR, str, str2));
        }
    }

    private boolean isCompanyCDN(String str) {
        ArrayList arrayList;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a14ba0e7af66003a155b68936d4eb40e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a14ba0e7af66003a155b68936d4eb40e")).booleanValue();
        }
        try {
            arrayList = new ArrayList();
            arrayList.add(".meituan.net");
            arrayList.add(".dpfile.com");
        } catch (Exception e) {
            if (KNBWebManager.isDebug()) {
                e.printStackTrace();
            }
        }
        return UriUtil.hostEndWith(str, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onReceivedSslError(android.webkit.WebView r17, android.webkit.SslErrorHandler r18, android.net.http.SslError r19) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.titans.client.TitansWebViewClient.onReceivedSslError(android.webkit.WebView, android.webkit.SslErrorHandler, android.net.http.SslError):void");
    }

    private boolean isInCerWhiteList(SslError sslError) {
        JSONArray jSONArray;
        Object[] objArr = {sslError};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57874a264e200e962febf79307d4c360", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57874a264e200e962febf79307d4c360")).booleanValue();
        }
        if (sslError.getPrimaryError() != 3) {
            return false;
        }
        String url = sslError.getUrl();
        if (TextUtils.isEmpty(url) || (jSONArray = (JSONArray) KNBConfig.getConfig(KNBConfig.CONFIG_ACCESS_CERTIFICATE, JSONArray.class)) == null) {
            return false;
        }
        String host = Uri.parse(url).getHost();
        Date date = new Date();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("domain");
                    String optString2 = optJSONObject.optString("expires");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        simpleDateFormat.setLenient(false);
                        if (simpleDateFormat.parse(optString2).after(date) && UriUtil.isHostBelongToDomain(host, optString)) {
                            return true;
                        }
                    }
                }
            } catch (Exception unused) {
                TitansReporter.webviewLog("check cer whitelist", String.valueOf(jSONArray.optJSONObject(i)));
            }
        }
        return false;
    }

    private boolean isForbiddenFileUri(Uri uri) {
        String path;
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36684fe9942ade853e45b67e5ddf8376", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36684fe9942ade853e45b67e5ddf8376")).booleanValue();
        }
        if ("file".equals(uri.getScheme())) {
            try {
                path = new File(uri.getPath()).getCanonicalPath();
            } catch (Exception unused) {
                path = uri.getPath();
            }
            for (String str : KNBConfig.getStringListConfig(KNBConfig.CONFIG_FILE_PROTOCOL_WHITE_LIST, Collections.EMPTY_LIST)) {
                if (path.startsWith(str)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private void reportBurst(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66314c0ddb2a5ea0e802beece8c90f0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66314c0ddb2a5ea0e802beece8c90f0e");
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                if (KNBWebManager.showDebugUrl() || PrivacyTitansManager.getInstance().isBurstLogSwitch()) {
                    String path = Uri.parse(str).getPath();
                    for (String str3 : BURST_URL) {
                        if (str.startsWith(str3) && !TextUtils.isEmpty(path) && (path.startsWith(BURST_PATH_ONE) || path.startsWith(BURST_PATH_TWO))) {
                            reportBurstToBabel(str, str2);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    private void reportBurstToBabel(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39574ec21395f60e6121381a0ae9da99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39574ec21395f60e6121381a0ae9da99");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("case", "burst");
        hashMap.put("component", "knbWeb");
        hashMap.put("pageUrl", str2);
        hashMap.put("pageStatic", str);
        hashMap.put(DeviceInfo.TM, Long.valueOf(System.currentTimeMillis()));
        Log.Builder optional = new Log.Builder("").reportChannel("prism-report-knb").tag("titans-info").lv4LocalStatus(true).optional(hashMap);
        optional.value(1L);
        Babel.logRT(optional.build());
    }

    private void reportDNS(Context context, String str) {
        boolean z;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec86b80925d29c6d6a2dc3fedaba8959", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec86b80925d29c6d6a2dc3fedaba8959");
            return;
        }
        try {
            if (!TextUtils.isEmpty(str) && Math.random() <= 0.001d) {
                List<String> stringListConfig = KNBConfig.getStringListConfig(KNBConfig.CONFIG_REPORT_DNS, Collections.EMPTY_LIST);
                int size = stringListConfig.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        z = false;
                        break;
                    } else if (str.equals(stringListConfig.get(i))) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    for (InetAddress inetAddress : InetAddress.getAllByName(str)) {
                        String hostAddress = inetAddress.getHostAddress();
                        if (!TextUtils.isEmpty(hostAddress)) {
                            arrayList.add(hostAddress);
                        }
                    }
                    if (this.dnsMonitorService == null) {
                        this.dnsMonitorService = j.a(context.getApplicationContext(), KNBWebManager.getCatAppId(), (String) null);
                        this.dnsMonitorService.e = 1;
                    }
                    this.dnsMonitorService.a(str, arrayList, UriUtil.clearQueryAndFragment(this.jsHost.getUrl()));
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Object[] objArr = {webView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9e81b127c79df30a5d3d2401be81b54", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9e81b127c79df30a5d3d2401be81b54");
        }
        Uri parse = Uri.parse(str);
        if (isForbiddenFileUri(parse)) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(webView.getContext().getString(R.string.knb_access_forbidden).getBytes());
            if (Build.VERSION.SDK_INT < 21) {
                return new WebResourceResponse("text/plain", "utf-8", byteArrayInputStream);
            }
            return new WebResourceResponse("text/plain", "utf-8", 403, "forbidden", Collections.EMPTY_MAP, byteArrayInputStream);
        }
        reportDNS(webView.getContext(), parse.getHost());
        reportBurst(str, this.jsHost.getUrl());
        MimeTypeInputStream cachedResources = CachedResourceManager.getCachedResources(webView.getContext(), this.jsHost.getUrl(), str);
        if (cachedResources != null) {
            if (cachedResources.resourceResponse == null) {
                return new WebResourceResponse(cachedResources.mimeType, "UTF-8", cachedResources.in);
            }
            return cachedResources.resourceResponse;
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(21)
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        IOldAppMockIntercept appMock;
        Object[] objArr = {webView, webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f9ff105b4cffb8091367b97497e88a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f9ff105b4cffb8091367b97497e88a3");
        }
        String uri = webResourceRequest.getUrl().toString();
        if (webResourceRequest.isForMainFrame()) {
            this.forMainFrameUrl = uri;
        }
        TitansReporter.webviewLog("start intercept", uri);
        UriKit.basicURLString(webResourceRequest.getUrl());
        IOldTitansDebug oldTitansDebug = TitansDebugManager.getOldTitansDebug();
        if (oldTitansDebug != null) {
            IOldWebProxyIntercept webProxy = oldTitansDebug.getWebProxy();
            r0 = webProxy != null ? webProxy.interceptRequest(webResourceRequest) : null;
            if (r0 == null && (appMock = oldTitansDebug.getAppMock()) != null) {
                r0 = appMock.interceptRequest(webResourceRequest, KNBWebManager.getEnvironment().getUUID());
            }
        }
        reportBurst(uri, this.jsHost.getUrl());
        if (r0 == null && KNBConfig.getBooleanConfig(KNBConfig.CONFIG_SWITCH_USING_OFFLINE, true)) {
            try {
                r0 = OfflineCenter.getInstance().getWebResourceResponse(webResourceRequest, this.jsHost.getUrl());
            } catch (Exception e) {
                c.a("intercept_error: : " + webResourceRequest.getUrl() + ", ex: " + e.getMessage(), 3, new String[]{"offline_update"});
            }
        }
        if (EnvUtil.self().debugTitans()) {
            StringBuilder sb = new StringBuilder();
            sb.append(webResourceRequest.getUrl().toString());
            sb.append(": ");
            sb.append(r0 != null ? "离线" : "线上");
            android.util.Log.e(OfflineCenter.DEBUG_OFFLINE_TAG, sb.toString());
        }
        if (r0 == null) {
            try {
                r0 = LocalResourceManager.getLocalResourceResponse(this.jsHost.getContext(), webResourceRequest);
            } catch (Exception unused) {
            }
        }
        if (r0 == null) {
            try {
                r0 = NativeRetryManager.getInstance(webView.getContext()).getRetryResponse(webResourceRequest);
            } catch (Exception unused2) {
            }
        }
        if (r0 == null) {
            r0 = shouldInterceptRequest(webView, uri);
        }
        if (r0 == null) {
            r0 = getSharkResponse(webResourceRequest);
        }
        if (r0 == null) {
            try {
                return TitansHttpDnsManager.executeHttp(this.jsHost.getContext(), webResourceRequest);
            } catch (Exception unused3) {
            }
        }
        return r0;
    }

    private boolean needUsingShark(Uri uri, WebResourceRequest webResourceRequest) {
        Object[] objArr = {uri, webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d974262fdd66ba4a56acdae149d640b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d974262fdd66ba4a56acdae149d640b")).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 21 && KNBConfig.getBooleanConfig(KNBConfig.CONFIG_SWITCH_USING_SHARK, true) && uri.isHierarchical()) {
            if ("1".equals(uri.getQueryParameter(TrafficRecord.Detail.TUNNEL_SHARK))) {
                return true;
            }
            List<String> stringListConfig = KNBConfig.getStringListConfig(KNBConfig.CONFIG_ACCESS_SHARK, Collections.EMPTY_LIST);
            String lowerCase = UriUtil.clearScheme(uri.toString()).toLowerCase();
            for (String str : stringListConfig) {
                if (lowerCase.startsWith(str.toLowerCase())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @TargetApi(21)
    private WebResourceResponse getSharkResponse(WebResourceRequest webResourceRequest) {
        Call<ap> post;
        int i = 0;
        Object[] objArr = {webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "305dca45adaf5c20c537db11f1866a8d", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "305dca45adaf5c20c537db11f1866a8d");
        }
        try {
            Uri url = webResourceRequest.getUrl();
            if (needUsingShark(url, webResourceRequest)) {
                TitansReporter.webviewLog("start shark", webResourceRequest.getUrl().toString());
                long currentTimeMillis = System.currentTimeMillis();
                WebResourceRequestAnalysisHeaderData analysisHeader = WebResourceRequestUtil.analysisHeader(webResourceRequest);
                String uri = url.toString();
                String method = webResourceRequest.getMethod();
                SharkApi sharkApi = (SharkApi) SharkRetrofit.getInstance().getRetrofit().a(SharkApi.class);
                boolean z = analysisHeader.addAccessControlHeaderToResponse;
                if (com.sankuai.titans.proxy.util.Constants.KEY_METHOD_OPTIONS.equalsIgnoreCase(method)) {
                    post = sharkApi.options(uri, analysisHeader.requestHeaders);
                } else {
                    if ("GET".equalsIgnoreCase(method)) {
                        post = sharkApi.get(uri, analysisHeader.requestHeaders);
                    } else if (!"POST".equalsIgnoreCase(method)) {
                        return null;
                    } else {
                        post = sharkApi.post(uri, analysisHeader.requestHeaders, new SharkPostBody(analysisHeader.contentType, analysisHeader.body));
                    }
                    z = false;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                Response<ap> a = post.a();
                if (a != null && a.f()) {
                    long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
                    EventReporter.getInstance().reportTiming("Shark.Process", url, currentTimeMillis3);
                    TitansReporter.webviewLog(webResourceRequest.getUrl().toString() + "shark component time", currentTimeMillis3 + "ms");
                    List<q> d = a.d();
                    HashMap hashMap = new HashMap();
                    String str = "text/plain";
                    if (d != null && !d.isEmpty()) {
                        for (q qVar : d) {
                            String a2 = qVar.a();
                            String b = qVar.b();
                            if ("Content-Type".equalsIgnoreCase(a2)) {
                                int indexOf = b.indexOf(";");
                                str = indexOf > 0 ? b.substring(i, indexOf) : b;
                            } else if ("Set-Cookie".equalsIgnoreCase(a2)) {
                                try {
                                    List<HttpCookie> parse = HttpCookie.parse(b);
                                    for (HttpCookie httpCookie : parse) {
                                        if (httpCookie.getDomain() == null) {
                                            httpCookie.setDomain(url.getHost());
                                        }
                                    }
                                    CookieUtil.setWebViewCookiesForShark(parse);
                                } catch (Exception unused) {
                                    android.util.Log.e("Cookie", "Tag");
                                }
                            } else if (z && "Access-Control-Allow-Headers".equalsIgnoreCase(a2)) {
                                b = TextUtils.isEmpty(b) ? "X-TitansX-Body" : b + ",X-TitansX-Body";
                            }
                            hashMap.put(a2, b);
                            i = 0;
                        }
                    }
                    String str2 = str;
                    String c = a.c();
                    if (c == null) {
                        c = "empty reason for: " + a.b();
                    }
                    String str3 = c;
                    long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis;
                    EventReporter.getInstance().reportTiming("Shark.Titans-Process", webResourceRequest.getUrl(), currentTimeMillis4);
                    TitansReporter.webviewLog(webResourceRequest.getUrl().toString() + "titans(shark) time", currentTimeMillis4 + "ms");
                    return new WebResourceResponse(str2, "UTF-8", a.b(), str3, hashMap, a.e().source());
                }
                return null;
            }
            return null;
        } catch (Exception e) {
            TitansReporter.reportException("intercept_error", webResourceRequest.getUrl().toString(), e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class SharkPostBody implements ak {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final byte[] mContent;
        private final String mContentType;

        public SharkPostBody(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f81b3ca3617addd952c48346d2a566a1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f81b3ca3617addd952c48346d2a566a1");
                return;
            }
            this.mContentType = str;
            if (TextUtils.isEmpty(str2)) {
                this.mContent = new byte[0];
            } else {
                this.mContent = str2.getBytes();
            }
        }

        @Override // com.sankuai.meituan.retrofit2.ak
        public String contentType() {
            return this.mContentType;
        }

        @Override // com.sankuai.meituan.retrofit2.ak
        public long contentLength() {
            return this.mContent.length;
        }

        @Override // com.sankuai.meituan.retrofit2.ak
        public void writeTo(OutputStream outputStream) {
            Object[] objArr = {outputStream};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0cddb738fb7a8365077923b41dcd15ef", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0cddb738fb7a8365077923b41dcd15ef");
                return;
            }
            try {
                outputStream.write(this.mContent);
            } catch (IOException unused) {
            }
        }
    }
}
