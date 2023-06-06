package com.meituan.android.neohybrid.framework.neo.js;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.dianping.titans.client.TitansWebViewClient;
import com.dianping.titans.js.JsHandlerFactory;
import com.dianping.titans.js.JsHost;
import com.dianping.titans.js.KNBJsHost;
import com.dianping.titans.js.jshandler.JsHandler;
import com.dianping.titans.service.GsonProvider;
import com.dianping.titans.ui.ITitleBar;
import com.dianping.titans.utils.TitansReporter;
import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.metrics.common.Constants;
import com.meituan.msi.metrics.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBWebManager;
import com.sankuai.meituan.android.knb.bean.TitansReport;
import com.sankuai.meituan.android.knb.client.WebClientListener;
import com.sankuai.meituan.android.knb.client.WebClientListenerV2;
import com.sankuai.meituan.android.knb.client.WebClientListenerV3;
import com.sankuai.meituan.android.knb.listener.AbsOnWebClientListener;
import com.sankuai.meituan.android.knb.util.CrashUtil;
import com.sankuai.meituan.android.knb.util.UIUtil;
import com.sankuai.meituan.android.knb.util.UrlTokenUtils;
import com.sankuai.titans.EventReporter;
import com.sankuai.titans.protocol.bean.TitansConstants;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class j extends TitansWebViewClient {
    public static ChangeQuickRedirect a;
    private WebClientListener b;
    private String c;
    private boolean d;
    private TitansReport.Builder e;
    private AtomicBoolean f;

    public j(JsHost jsHost) {
        super(jsHost);
        Object[] objArr = {jsHost};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbe63d89948e758bf092ce258afa8f1e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbe63d89948e758bf092ce258afa8f1e");
        } else {
            this.f = new AtomicBoolean(true);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Object[] objArr = {webView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df3fea0ef43de460f2b983e9fb043876", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df3fea0ef43de460f2b983e9fb043876")).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(str)) {
            a(currentTimeMillis);
            return false;
        } else if (b(webView, str, currentTimeMillis)) {
            return true;
        } else {
            return a(webView, str, currentTimeMillis);
        }
    }

    private boolean a(WebView webView, String str, long j) {
        String str2;
        Object[] objArr = {webView, str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4af4ebafe8ed6f91e6c5ae424f00f63", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4af4ebafe8ed6f91e6c5ae424f00f63")).booleanValue();
        }
        if (str.startsWith("//")) {
            str2 = "https:" + str;
        } else {
            str2 = str;
        }
        CrashUtil.pushPage(str2);
        if (this.b != null && this.b.shouldOverrideUrlLoading(str2)) {
            a(j);
            return true;
        }
        Uri parse = Uri.parse(str2);
        if (!TextUtils.isEmpty(parse.getScheme())) {
            if (this.b != null && this.b.prefixContains(parse.getScheme().toLowerCase())) {
                this.b.handleUri(parse);
                a(j);
                return true;
            }
            boolean isHierarchical = parse.isHierarchical();
            HashMap hashMap = null;
            String queryParameter = isHierarchical ? parse.getQueryParameter("openInApp") : null;
            if (URLUtil.isNetworkUrl(str2) && "2".equals(queryParameter)) {
                this.b.handleUri(parse);
                a(j);
                return true;
            }
            String host = parse.getHost();
            String path = parse.getPath();
            if (!"0".equals(isHierarchical ? parse.getQueryParameter("_mtcq") : "") && !TextUtils.equals(host, "t.meituan.com")) {
                if (!TextUtils.equals(host + path, "m.dianping.com/synthesis/shortlink") && this.b != null && this.b.schemaContains(parse.getScheme().toLowerCase())) {
                    String url = webView.getUrl();
                    if (!TextUtils.isEmpty(url)) {
                        Uri parse2 = Uri.parse(url);
                        if (parse2.isHierarchical() && !"1".equals(parse2.getQueryParameter("noreferrer"))) {
                            hashMap = new HashMap();
                            if (KNBWebManager.needRemoveTokenInRefer(str2, url)) {
                                url = UrlTokenUtils.removeTokenInUrl(url);
                            }
                            hashMap.put(Constants.TRAFFIC_REFERER, url);
                        }
                    }
                    this.b.loadUrl(str2, hashMap, false);
                    a(j);
                    return true;
                }
            }
        }
        if (str2.startsWith(TitansConstants.JS_SCHEMA)) {
            Sniffer.smell("titans", "webview", "js_schema_in_url", "", "className: KNBWebViewClient, methodName: shouldOverrideUrlLoading, jsUrl: " + str2 + ", webview.getOriginalUrl: " + webView.getOriginalUrl() + ", webview.getUrl" + webView.getUrl());
            JsHandler createJsHandler = JsHandlerFactory.createJsHandler(this.jsHost, str2);
            if (createJsHandler != null) {
                createJsHandler.doExec();
                this.jsHost.putJsHandler(createJsHandler);
                a(j);
                com.meituan.msi.metrics.b.a(new b.a().a(b.EnumC0496b.TITANS).a("titans").b(createJsHandler.jsBean().method).a(false));
                return true;
            }
        }
        if (!TextUtils.isEmpty(parse.getScheme()) && !parse.getScheme().equals("http") && !parse.getScheme().equals("https")) {
            UIUtil.showShortToast(webView, String.format("不允许打开\"%s\"外部地址", parse.getScheme()));
            a(j);
            return true;
        }
        a(j);
        return false;
    }

    private boolean b(WebView webView, String str, long j) {
        Object[] objArr = {webView, str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "853390bbeed6f2eee7943d67854a9d7a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "853390bbeed6f2eee7943d67854a9d7a")).booleanValue();
        }
        if (KNBWebManager.isInBlackList(str)) {
            Locale locale = Locale.getDefault();
            String language = locale.getLanguage();
            String script = Build.VERSION.SDK_INT >= 21 ? locale.getScript() : "";
            String country = locale.getCountry();
            webView.loadUrl("https://static.meituan.net/bs/mbs-pages/master/error-url.html?language=" + language + "&script=" + script + "&country=" + country);
            a(j);
            return true;
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 21)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Object[] objArr = {webView, webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "305de001de1f2c87cd49fcbb5c21f130", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "305de001de1f2c87cd49fcbb5c21f130")).booleanValue();
        }
        String uri = webResourceRequest.getUrl().toString();
        long currentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(uri)) {
            a(currentTimeMillis);
            return false;
        } else if (b(webView, uri, currentTimeMillis)) {
            return true;
        } else {
            if (this.b != null && (this.b instanceof WebClientListenerV3) && ((WebClientListenerV3) this.b).shouldOverrideUrlLoading(webResourceRequest)) {
                return true;
            }
            return a(webView, uri, currentTimeMillis);
        }
    }

    private void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90140293730b7a8b992ac164a8474dd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90140293730b7a8b992ac164a8474dd1");
        } else if (this.e == null) {
        } else {
            this.e.setUrlPreProcessTime(System.currentTimeMillis() - j);
        }
    }

    @Override // com.dianping.titans.client.TitansWebViewClient, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Object[] objArr = {webView, str, bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b87683b028e509738d7c53fa0dafd80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b87683b028e509738d7c53fa0dafd80");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "27f5d84c66f389139dc951b60a14d83c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "27f5d84c66f389139dc951b60a14d83c");
        } else {
            try {
                if (this.e == null) {
                    this.e = TitansReporter.getReportBuilder(this.jsHost);
                }
                if (this.e != null) {
                    if (this.f.getAndSet(false)) {
                        this.e.setUrlPreProcessIsInterJump(false);
                        this.e.setH5EnvIsWebViewInitialed(TitansReport.isWebViewInited.getAndSet(true));
                    } else {
                        this.e.setUrlPreProcessIsInterJump(true);
                        this.e.removeH5Env();
                    }
                    String json = GsonProvider.getGson().toJson(this.e.create());
                    Log.e("rjh", json);
                    this.jsHost.loadJs(String.format("javascript:window.titansReport=%1$s", json));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        this.d = false;
        if (this.b != null) {
            this.b.setErrorViewVisibility(8);
        }
        super.onPageStarted(webView, str, bitmap);
        if (this.b != null) {
            this.b.onPageStarted(str, bitmap);
            this.b.reportOnPageStarted(str);
        }
        if (!TextUtils.isEmpty(this.c)) {
            if (TextUtils.isEmpty(this.c) || TextUtils.equals(this.c, str)) {
                return;
            }
            if (this.b != null) {
                this.b.mgeRedirectUrl(this.c);
            }
        }
        this.c = str;
    }

    @Override // com.dianping.titans.client.TitansWebViewClient, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Object[] objArr = {webView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "286ff9e5fbad6dffd91b7d00490fe5b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "286ff9e5fbad6dffd91b7d00490fe5b0");
            return;
        }
        super.onPageFinished(webView, str);
        if (this.b != null) {
            this.b.onPageFinished(str);
            this.b.reportOnPageFinished(str);
        }
        if (URLUtil.isValidUrl(str)) {
            if (this.b != null) {
                this.b.setErrorViewVisibility(this.d ? 0 : 8);
            }
            this.d = false;
        }
        if (this.b != null && !TextUtils.isEmpty(this.c) && !TextUtils.equals(str, this.c)) {
            this.b.mgeRedirectUrl(str);
        }
        this.c = null;
    }

    @Override // com.dianping.titans.client.TitansWebViewClient, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        Object[] objArr = {webView, Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2081b0cb082c07d973600efa67832e3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2081b0cb082c07d973600efa67832e3d");
        } else if ((this.jsHost instanceof KNBJsHost) && TextUtils.equals(((KNBJsHost) this.jsHost).getHostState().optString("current_download_url"), str2)) {
            ITitleBar titleBarHost = this.jsHost.getTitleBarHost();
            if (titleBarHost != null) {
                titleBarHost.showProgressBar(false);
            }
        } else {
            super.onReceivedError(webView, i, str, str2);
            if (this.b != null) {
                this.b.onReceivedError(i, str, str2);
                this.b.setErrorViewVisibility(0);
                this.b.reportOnReceivedError(str2);
            }
            this.d = true;
        }
    }

    @Override // com.dianping.titans.client.TitansWebViewClient, android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        Object[] objArr = {webView, sslErrorHandler, sslError};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89650aefac8b16ac277a8aeee824ed4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89650aefac8b16ac277a8aeee824ed4f");
            return;
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        if (this.b != null) {
            this.b.onReceivedSslError(sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        Object[] objArr = {webView, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffe5bada44a71a5889c6f4fc71c63fd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffe5bada44a71a5889c6f4fc71c63fd1");
            return;
        }
        super.doUpdateVisitedHistory(webView, str, z);
        if (this.b == null || !(this.b instanceof WebClientListenerV2)) {
            return;
        }
        ((WebClientListenerV2) this.b).doUpdateVisitedHistory(webView, str, z);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Activity activity;
        Object[] objArr = {webView, renderProcessGoneDetail};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99cc59e7226ae607614453e962f6d0f1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99cc59e7226ae607614453e962f6d0f1")).booleanValue();
        }
        if ((this.jsHost instanceof KNBJsHost) && renderProcessGoneDetail.didCrash() && (activity = this.jsHost.getActivity()) != null) {
            activity.finish();
        }
        PrintStream printStream = System.out;
        printStream.println("knb onRenderProcessGone[didCrash:" + renderProcessGoneDetail.didCrash() + ",rendererPriorityAtExit:" + renderProcessGoneDetail.rendererPriorityAtExit() + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        Object[] objArr = {webView, keyEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da97fb8779f2c3526d93125ded6eaa20", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da97fb8779f2c3526d93125ded6eaa20")).booleanValue();
        }
        if (this.b instanceof AbsOnWebClientListener) {
            return ((AbsOnWebClientListener) this.b).shouldOverrideKeyEvent(webView, keyEvent);
        }
        return false;
    }

    @Override // com.dianping.titans.client.TitansWebViewClient, android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Object[] objArr = {webView, webResourceRequest, webResourceResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a1ff9a641d399ddac315d7c29dcc32f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a1ff9a641d399ddac315d7c29dcc32f");
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            String path = webResourceRequest.getUrl().getPath();
            if (TextUtils.isEmpty(path) || !path.endsWith("/favicon.ico")) {
                EventReporter.getInstance().reportResponseError(webResourceResponse.getStatusCode(), webResourceRequest.getUrl().toString(), webView.getOriginalUrl(), "", webResourceRequest.isForMainFrame());
            }
        }
        if ((this.b instanceof AbsOnWebClientListener) && ((AbsOnWebClientListener) this.b).onReceivedHttpError(webView, webResourceRequest, webResourceResponse)) {
            return;
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }
}
