package com.sankuai.meituan.android.knb;

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
import com.dianping.titans.utils.TitansTimingReport;
import com.meituan.metrics.common.Constants;
import com.meituan.msi.metrics.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
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
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class KNBWebViewClient extends TitansWebViewClient {
    public static ChangeQuickRedirect changeQuickRedirect;
    private WebClientListener clientListener;
    private AtomicBoolean isTitansDataFirstInject;
    private String redirectUrl;
    private boolean shouldErrorDisplayed;
    private TitansReport.Builder titansReportBuilder;

    public KNBWebViewClient(JsHost jsHost) {
        super(jsHost);
        Object[] objArr = {jsHost};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb92a35785cb5bbb157b5425f06e5ff3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb92a35785cb5bbb157b5425f06e5ff3");
        } else {
            this.isTitansDataFirstInject = new AtomicBoolean(true);
        }
    }

    public KNBWebViewClient(JsHost jsHost, WebClientListener webClientListener) {
        this(jsHost);
        Object[] objArr = {jsHost, webClientListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9bb94cd4825fdde3c18db27f1a2bc5b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9bb94cd4825fdde3c18db27f1a2bc5b2");
        } else {
            this.clientListener = webClientListener;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Object[] objArr = {webView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7eaae1cc21cf76fc5105e77eb7e1fc6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7eaae1cc21cf76fc5105e77eb7e1fc6")).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(str)) {
            recordUrlProcessTime(currentTimeMillis);
            return false;
        } else if (filterBlackUrl(webView, str, currentTimeMillis)) {
            return true;
        } else {
            return shouldOverrideUrlLoadingContent(webView, str, currentTimeMillis);
        }
    }

    private boolean shouldOverrideUrlLoadingContent(WebView webView, String str, long j) {
        String str2;
        Object[] objArr = {webView, str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d525de9e4910757a4156d195563c39a2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d525de9e4910757a4156d195563c39a2")).booleanValue();
        }
        if (str.startsWith("//")) {
            str2 = "https:" + str;
        } else {
            str2 = str;
        }
        CrashUtil.pushPage(str2);
        if (this.clientListener != null && this.clientListener.shouldOverrideUrlLoading(str2)) {
            recordUrlProcessTime(j);
            return true;
        }
        Uri parse = Uri.parse(str2);
        if (!TextUtils.isEmpty(parse.getScheme())) {
            if (this.clientListener != null && this.clientListener.prefixContains(parse.getScheme().toLowerCase())) {
                this.clientListener.handleUri(parse);
                recordUrlProcessTime(j);
                return true;
            }
            boolean isHierarchical = parse.isHierarchical();
            HashMap hashMap = null;
            String queryParameter = isHierarchical ? parse.getQueryParameter("openInApp") : null;
            if (URLUtil.isNetworkUrl(str2) && "2".equals(queryParameter)) {
                this.clientListener.handleUri(parse);
                recordUrlProcessTime(j);
                return true;
            }
            String host = parse.getHost();
            String path = parse.getPath();
            if (!"0".equals(isHierarchical ? parse.getQueryParameter("_mtcq") : "") && !TextUtils.equals(host, "t.meituan.com")) {
                if (!TextUtils.equals(host + path, "m.dianping.com/synthesis/shortlink") && this.clientListener != null && this.clientListener.schemaContains(parse.getScheme().toLowerCase())) {
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
                    this.clientListener.loadUrl(str2, hashMap, false);
                    recordUrlProcessTime(j);
                    return true;
                }
            }
        }
        if (str2.startsWith(TitansConstants.JS_SCHEMA)) {
            TitansReporter.reportException("js_schema_in_url", webView.getOriginalUrl(), new Exception("使用shouldOverrideUrlLoading方式调用桥"));
            JsHandler createJsHandler = JsHandlerFactory.createJsHandler(this.jsHost, str2);
            if (createJsHandler != null) {
                createJsHandler.doExec();
                this.jsHost.putJsHandler(createJsHandler);
                recordUrlProcessTime(j);
                b.a aVar = new b.a();
                aVar.b = b.EnumC0496b.TITANS;
                aVar.c = "titans";
                aVar.d = createJsHandler.jsBean().method;
                b.a(aVar.a(false));
                return true;
            }
        }
        if (!TextUtils.isEmpty(parse.getScheme()) && !parse.getScheme().equals("http") && !parse.getScheme().equals("https")) {
            UIUtil.showShortToast(webView, String.format("不允许打开\"%s\"外部地址", parse.getScheme()));
            recordUrlProcessTime(j);
            return true;
        }
        recordUrlProcessTime(j);
        return false;
    }

    private boolean filterBlackUrl(WebView webView, String str, long j) {
        Object[] objArr = {webView, str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1fa64b88b86f1509cc4e40c255aba763", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1fa64b88b86f1509cc4e40c255aba763")).booleanValue();
        }
        if (KNBWebManager.isInBlackList(str)) {
            Locale locale = Locale.getDefault();
            String language = locale.getLanguage();
            String script = Build.VERSION.SDK_INT >= 21 ? locale.getScript() : "";
            String country = locale.getCountry();
            webView.loadUrl("https://static.meituan.net/bs/mbs-pages/master/error-url.html?language=" + language + "&script=" + script + "&country=" + country);
            recordUrlProcessTime(j);
            return true;
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 21)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Object[] objArr = {webView, webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21ef8a1da1aae5222c771048bc4f8386", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21ef8a1da1aae5222c771048bc4f8386")).booleanValue();
        }
        String uri = webResourceRequest.getUrl().toString();
        long currentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(uri)) {
            recordUrlProcessTime(currentTimeMillis);
            return false;
        } else if (filterBlackUrl(webView, uri, currentTimeMillis)) {
            return true;
        } else {
            if (this.clientListener != null && (this.clientListener instanceof WebClientListenerV3) && ((WebClientListenerV3) this.clientListener).shouldOverrideUrlLoading(webResourceRequest)) {
                return true;
            }
            return shouldOverrideUrlLoadingContent(webView, uri, currentTimeMillis);
        }
    }

    private void recordUrlProcessTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af03b494ba6931b2acbf938506a65d28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af03b494ba6931b2acbf938506a65d28");
        } else if (this.titansReportBuilder == null) {
        } else {
            this.titansReportBuilder.setUrlPreProcessTime(System.currentTimeMillis() - j);
        }
    }

    @Override // com.dianping.titans.client.TitansWebViewClient, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Object[] objArr = {webView, str, bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "490304a566cc30d29c0cfbba0b9743f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "490304a566cc30d29c0cfbba0b9743f9");
            return;
        }
        TitansTimingReport.getInstance().onPageStart(str);
        reportTitansDataOnPageStarted();
        this.shouldErrorDisplayed = false;
        if (this.clientListener != null) {
            this.clientListener.setErrorViewVisibility(8);
        }
        super.onPageStarted(webView, str, bitmap);
        if (this.clientListener != null) {
            this.clientListener.onPageStarted(str, bitmap);
            this.clientListener.reportOnPageStarted(str);
        }
        if (!TextUtils.isEmpty(this.redirectUrl)) {
            if (TextUtils.isEmpty(this.redirectUrl) || TextUtils.equals(this.redirectUrl, str)) {
                return;
            }
            if (this.clientListener != null) {
                this.clientListener.mgeRedirectUrl(this.redirectUrl);
            }
        }
        this.redirectUrl = str;
    }

    private void reportTitansDataOnPageStarted() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee1453f8ff9fb4de141aea0589851194", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee1453f8ff9fb4de141aea0589851194");
            return;
        }
        try {
            if (this.titansReportBuilder == null) {
                this.titansReportBuilder = TitansReporter.getReportBuilder(this.jsHost);
            }
            if (this.titansReportBuilder != null) {
                if (this.isTitansDataFirstInject.getAndSet(false)) {
                    this.titansReportBuilder.setUrlPreProcessIsInterJump(false);
                    this.titansReportBuilder.setH5EnvIsWebViewInitialed(TitansReport.isWebViewInited.getAndSet(true));
                } else {
                    this.titansReportBuilder.setUrlPreProcessIsInterJump(true);
                    this.titansReportBuilder.removeH5Env();
                }
                String json = GsonProvider.getGson().toJson(this.titansReportBuilder.create());
                Log.e("rjh", json);
                this.jsHost.loadJs(String.format("javascript:window.titansReport=%1$s", json));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.dianping.titans.client.TitansWebViewClient, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        Object[] objArr = {webView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c85cefb47d956c950402a19a9bc61dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c85cefb47d956c950402a19a9bc61dc");
            return;
        }
        super.onPageFinished(webView, str);
        TitansTimingReport.getInstance().onPageFinish(str);
        if (this.clientListener != null) {
            this.clientListener.onPageFinished(str);
            this.clientListener.reportOnPageFinished(str);
        }
        if (URLUtil.isValidUrl(str)) {
            if (this.clientListener != null) {
                this.clientListener.setErrorViewVisibility(this.shouldErrorDisplayed ? 0 : 8);
            }
            this.shouldErrorDisplayed = false;
        }
        if (this.clientListener != null && !TextUtils.isEmpty(this.redirectUrl) && !TextUtils.equals(str, this.redirectUrl)) {
            this.clientListener.mgeRedirectUrl(str);
        }
        this.redirectUrl = null;
    }

    @Override // com.dianping.titans.client.TitansWebViewClient, android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        Object[] objArr = {webView, Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47981c6303d14c17bf02c0e80a36f244", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47981c6303d14c17bf02c0e80a36f244");
        } else if ((this.jsHost instanceof KNBJsHost) && TextUtils.equals(((KNBJsHost) this.jsHost).getHostState().optString("current_download_url"), str2)) {
            ITitleBar titleBarHost = this.jsHost.getTitleBarHost();
            if (titleBarHost != null) {
                titleBarHost.showProgressBar(false);
            }
        } else {
            super.onReceivedError(webView, i, str, str2);
            if (this.clientListener != null) {
                this.clientListener.onReceivedError(i, str, str2);
                this.clientListener.setErrorViewVisibility(0);
                this.clientListener.reportOnReceivedError(str2);
            }
            this.shouldErrorDisplayed = true;
        }
    }

    @Override // com.dianping.titans.client.TitansWebViewClient, android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        Object[] objArr = {webView, sslErrorHandler, sslError};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14fc39fb605686e0a2674be4be40e977", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14fc39fb605686e0a2674be4be40e977");
            return;
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        if (this.clientListener != null) {
            this.clientListener.onReceivedSslError(sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        Object[] objArr = {webView, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bcc8ac4b2f5421d4de6be8aee7751c29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bcc8ac4b2f5421d4de6be8aee7751c29");
            return;
        }
        super.doUpdateVisitedHistory(webView, str, z);
        if (this.clientListener == null || !(this.clientListener instanceof WebClientListenerV2)) {
            return;
        }
        ((WebClientListenerV2) this.clientListener).doUpdateVisitedHistory(webView, str, z);
    }

    public void setWebClientListener(WebClientListener webClientListener) {
        this.clientListener = webClientListener;
    }

    public static String convertStreamToString(InputStream inputStream) {
        String str;
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "47cfec6166132727171263ebb3dc2410", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "47cfec6166132727171263ebb3dc2410");
        }
        str = "";
        try {
            Scanner useDelimiter = new Scanner(inputStream, "UTF-8").useDelimiter("\\A");
            str = useDelimiter.hasNext() ? useDelimiter.next() : "";
            inputStream.close();
        } catch (IOException unused) {
        }
        return str;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Activity activity;
        Object[] objArr = {webView, renderProcessGoneDetail};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa36647fca03032cf484cda51bbd98cc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa36647fca03032cf484cda51bbd98cc")).booleanValue();
        }
        if ((this.jsHost instanceof KNBJsHost) && renderProcessGoneDetail.didCrash() && (activity = this.jsHost.getActivity()) != null) {
            activity.finish();
        }
        PrintStream printStream = System.out;
        printStream.println("knb onRenderProcessGone[didCrash:" + renderProcessGoneDetail.didCrash() + ",rendererPriorityAtExit:" + renderProcessGoneDetail.rendererPriorityAtExit() + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        Object[] objArr = {webView, keyEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c389da2b60bf29acb90c3838e7b6c8bf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c389da2b60bf29acb90c3838e7b6c8bf")).booleanValue();
        }
        if (this.clientListener instanceof AbsOnWebClientListener) {
            return ((AbsOnWebClientListener) this.clientListener).shouldOverrideKeyEvent(webView, keyEvent);
        }
        return false;
    }

    @Override // com.dianping.titans.client.TitansWebViewClient, android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Object[] objArr = {webView, webResourceRequest, webResourceResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cfbbc02190d1f23c3e9cc437c70f78d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cfbbc02190d1f23c3e9cc437c70f78d9");
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            String path = webResourceRequest.getUrl().getPath();
            if (TextUtils.isEmpty(path) || !path.endsWith("/favicon.ico")) {
                EventReporter.getInstance().reportResponseError(webResourceResponse.getStatusCode(), webResourceRequest.getUrl().toString(), webView.getOriginalUrl(), "", webResourceRequest.isForMainFrame());
            }
        }
        if ((this.clientListener instanceof AbsOnWebClientListener) && ((AbsOnWebClientListener) this.clientListener).onReceivedHttpError(webView, webResourceRequest, webResourceResponse)) {
            return;
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }
}
