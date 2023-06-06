package com.meituan.mmp.lib.api.web;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.Keep;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.meituan.mmp.lib.api.r;
import com.meituan.mmp.lib.api.web.f;
import com.meituan.mmp.lib.model.Event;
import com.meituan.mmp.lib.page.view.m;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class WebViewModule extends BaseWebViewModule {
    public static ChangeQuickRedirect n;
    public ValueCallback<Uri[]> o;
    private r q;

    @Override // com.meituan.mmp.lib.api.web.BaseWebViewModule
    public final /* bridge */ /* synthetic */ void a(b bVar) {
        super.a(bVar);
    }

    @Override // com.meituan.mmp.lib.api.web.BaseWebViewModule, com.meituan.mmp.lib.api.InternalApi
    public final /* bridge */ /* synthetic */ String[] b() {
        return super.b();
    }

    @Override // com.meituan.mmp.lib.api.web.BaseWebViewModule, com.meituan.mmp.lib.api.AbsApi
    public /* bridge */ /* synthetic */ void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) {
        super.invoke(str, jSONObject, iApiCallback);
    }

    public WebViewModule(com.meituan.mmp.lib.api.h hVar, r rVar) {
        super(hVar);
        Object[] objArr = {hVar, rVar};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2d20940f7cf87a004a228ea40a48f78", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2d20940f7cf87a004a228ea40a48f78");
        } else {
            this.q = rVar;
        }
    }

    @Override // com.meituan.mmp.lib.api.web.BaseWebViewModule
    public final h c(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c20a2d96663ffa9c0f3a3875d55f349", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c20a2d96663ffa9c0f3a3875d55f349");
        }
        final h hVar = new h(getContext());
        d dVar = new d(getContext(), getPageByPageId(this.k));
        super.a((b) dVar);
        WebSettings settings = dVar.getSettings();
        settings.setAllowFileAccess(true);
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setBuiltInZoomControls(false);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSaveFormData(false);
        settings.setGeolocationEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(0);
        }
        settings.setDatabaseEnabled(true);
        settings.setDatabasePath(com.meituan.mmp.lib.utils.f.a(getContext(), "databases").getAbsolutePath());
        settings.setAppCacheMaxSize(10485760L);
        settings.setAppCachePath(com.meituan.mmp.lib.utils.f.a(getContext(), "webviewcache").getAbsolutePath());
        if (Build.VERSION.SDK_INT > 14) {
            settings.setTextZoom(100);
        }
        try {
            settings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Exception unused) {
        }
        settings.setUserAgentString(d(jSONObject.optString("mmp_ua_append", null)));
        try {
            settings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Exception unused2) {
        }
        dVar.addJavascriptInterface(new WebJSBridge(this.i, dVar, jSONObject, this.d), "__wx");
        dVar.setWebChromeClient(new WebChromeClient() { // from class: com.meituan.mmp.lib.api.web.WebViewModule.1
            public static ChangeQuickRedirect a;

            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                Object[] objArr2 = {consoleMessage};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2524ac8c4a126abf98c9db1bf28b484c", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2524ac8c4a126abf98c9db1bf28b484c")).booleanValue();
                }
                if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
                    Log.e("web-view", "[error] " + consoleMessage.message());
                    Log.e("web-view", "[error] sourceId = " + consoleMessage.sourceId());
                    Log.e("web-view", "[error] lineNumber = " + consoleMessage.lineNumber());
                } else {
                    Log.e("web-view", consoleMessage.message());
                }
                return super.onConsoleMessage(consoleMessage);
            }

            @Override // android.webkit.WebChromeClient
            public void onReceivedTitle(WebView webView, String str) {
                Object[] objArr2 = {webView, str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "90562502d793acf39de83f81996ebeee", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "90562502d793acf39de83f81996ebeee");
                    return;
                }
                super.onReceivedTitle(webView, str);
                if (!webView.isAttachedToWindow() || TextUtils.isEmpty(str) || TextUtils.isEmpty(webView.getUrl()) || webView.getUrl().contains(str)) {
                    return;
                }
                WebViewModule.this.i.a(new Event("setNavigationBarTitle", "{title:'" + str + "'}", null), (com.meituan.mmp.lib.interfaces.a) null);
            }

            @Override // android.webkit.WebChromeClient
            public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                Object[] objArr2 = {webView, valueCallback, fileChooserParams};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c8990a9fd52e5a8518142061140c0e6a", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c8990a9fd52e5a8518142061140c0e6a")).booleanValue();
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    WebViewModule.this.startActivityForResult(fileChooserParams.createIntent(), null);
                    WebViewModule.this.o = valueCallback;
                    return true;
                }
                return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
            }

            @Keep
            public void openFileChooser(final ValueCallback<Uri> valueCallback, String str) {
                Object[] objArr2 = {valueCallback, str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "78914bec5f24c56d93e7a5d66d9196ca", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "78914bec5f24c56d93e7a5d66d9196ca");
                    return;
                }
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
                if (TextUtils.isEmpty(str)) {
                    intent.setType("*/*");
                } else {
                    intent.setType(str);
                }
                WebViewModule.this.startActivityForResult(intent, null);
                WebViewModule.this.o = new ValueCallback<Uri[]>() { // from class: com.meituan.mmp.lib.api.web.WebViewModule.1.1
                    public static ChangeQuickRedirect a;

                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(Uri[] uriArr) {
                        Uri[] uriArr2 = uriArr;
                        Object[] objArr3 = {uriArr2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7b4aeef31ec32bf56d804cb5fb083ac0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7b4aeef31ec32bf56d804cb5fb083ac0");
                        } else if (uriArr2 == null || uriArr2.length <= 0) {
                        } else {
                            valueCallback.onReceiveValue(uriArr2[0]);
                        }
                    }
                };
            }

            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                final f progressBar;
                Object[] objArr2 = {webView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "409c8c43052306dda5517567389932f2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "409c8c43052306dda5517567389932f2");
                } else if (WebViewModule.this.m || (progressBar = hVar.getProgressBar()) == null || i <= progressBar.getCurProgress()) {
                } else {
                    if (8 == progressBar.getVisibility()) {
                        progressBar.setVisibility(0);
                    }
                    progressBar.a(i, new f.a() { // from class: com.meituan.mmp.lib.api.web.WebViewModule.1.2
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.mmp.lib.api.web.f.a
                        public final void a() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dabe942c7420130df6d52dc34ead3b10", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dabe942c7420130df6d52dc34ead3b10");
                            } else if (progressBar.getVisibility() == 0 && progressBar.getCurProgress() == 100) {
                                progressBar.a();
                            }
                        }
                    });
                    super.onProgressChanged(webView, i);
                }
            }
        });
        dVar.setWebViewClient(new WebViewClient() { // from class: com.meituan.mmp.lib.api.web.WebViewModule.2
            public static ChangeQuickRedirect a;
            private com.meituan.mmp.lib.resource.a c = new com.meituan.mmp.lib.resource.a();
            private boolean d = false;

            @Override // android.webkit.WebViewClient
            public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                Object[] objArr2 = {webView, renderProcessGoneDetail};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "088abee850a668b957f394e897c461ec", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "088abee850a668b957f394e897c461ec")).booleanValue();
                }
                r rVar = WebViewModule.this.q;
                rVar.a(webView, renderProcessGoneDetail, "WebViewModule" + webView.getUrl(), null);
                return true;
            }

            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                Object[] objArr2 = {webView, str, bitmap};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b42edc623912b5639650fb3b997ae648", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b42edc623912b5639650fb3b997ae648");
                    return;
                }
                this.d = false;
                if (Build.VERSION.SDK_INT >= 19) {
                    webView.evaluateJavascript(BaseWebViewModule.l, null);
                } else {
                    webView.loadUrl(BaseWebViewModule.l);
                }
                super.onPageStarted(webView, str, bitmap);
                WebViewModule.this.e(str);
            }

            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str) {
                Object[] objArr2 = {webView, str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fbf078bba1484ebd837bef91f1690c61", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fbf078bba1484ebd837bef91f1690c61");
                    return;
                }
                super.onPageFinished(webView, str);
                WebViewModule.this.m = true;
                if (Build.VERSION.SDK_INT >= 19) {
                    webView.evaluateJavascript(BaseWebViewModule.l, null);
                } else {
                    webView.loadUrl(BaseWebViewModule.l);
                }
                WebViewModule.this.a(webView);
                if (!this.d) {
                    WebViewModule.this.f(str);
                }
                WebViewModule.this.g();
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView, int i, String str, String str2) {
                Object[] objArr2 = {webView, Integer.valueOf(i), str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7d48824edbef82930751d239f6ef1ce5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7d48824edbef82930751d239f6ef1ce5");
                    return;
                }
                super.onReceivedError(webView, i, str, str2);
                this.d = true;
                WebViewModule.this.a(i, str, str2);
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                Object[] objArr2 = {webView, str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "80e2fe860adc08728a1e03f5f37ef131", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "80e2fe860adc08728a1e03f5f37ef131")).booleanValue();
                }
                if (WebViewModule.this.g(str)) {
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }

            @Override // android.webkit.WebViewClient
            @TargetApi(21)
            public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                Object[] objArr2 = {webView, webResourceRequest};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e95f690f9e25bc0d29243d4d46ea1e88", RobustBitConfig.DEFAULT_VALUE)) {
                    return (WebResourceResponse) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e95f690f9e25bc0d29243d4d46ea1e88");
                }
                WebResourceResponse webResourceResponse = (WebResourceResponse) m.a(webView.getContext(), WebViewModule.this.getAppConfig(), webResourceRequest.getUrl().toString(), this.c);
                return webResourceResponse != null ? webResourceResponse : super.shouldInterceptRequest(webView, webResourceRequest);
            }

            @Override // android.webkit.WebViewClient
            public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                Object[] objArr2 = {webView, str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e7c377d5eeeb67692fa2e0d69280ead2", RobustBitConfig.DEFAULT_VALUE)) {
                    return (WebResourceResponse) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e7c377d5eeeb67692fa2e0d69280ead2");
                }
                WebResourceResponse webResourceResponse = (WebResourceResponse) m.a(webView.getContext(), WebViewModule.this.getAppConfig(), str, this.c);
                return webResourceResponse != null ? webResourceResponse : super.shouldInterceptRequest(webView, str);
            }
        });
        dVar.setDownloadListener(g.a());
        dVar.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.meituan.mmp.lib.api.web.WebViewModule.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "539890b5f7af5f4de63d71c641980248", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "539890b5f7af5f4de63d71c641980248")).booleanValue();
                }
                WebView.HitTestResult hitTestResult = ((WebView) view).getHitTestResult();
                if (hitTestResult != null) {
                    WebViewModule.this.getActivity();
                    WebViewModule.this.getAppConfig();
                    hitTestResult.getType();
                    hitTestResult.getExtra();
                    return false;
                }
                return false;
            }
        });
        hVar.a(dVar, dVar);
        return hVar;
    }

    public static /* synthetic */ void a(String str, String str2, String str3, String str4, long j) {
        Object[] objArr = {str, str2, str3, str4, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "13ab884225245b3419705b7e7e4e4e77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "13ab884225245b3419705b7e7e4e4e77");
        } else if (MMPEnvHelper.getWebViewDownloadListener() != null) {
            MMPEnvHelper.getWebViewDownloadListener().onDownloadStart(str, str2, str3, str4, j);
        }
    }

    @Override // com.meituan.mmp.lib.api.web.BaseWebViewModule
    public final boolean a(h hVar, String str) {
        WebView webView;
        Object[] objArr = {hVar, str};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a13a82adb5bc62b6ddef933cf8c2ff0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a13a82adb5bc62b6ddef933cf8c2ff0")).booleanValue();
        }
        if (hVar == null || (webView = (WebView) hVar.getWebView()) == null) {
            return false;
        }
        webView.loadUrl(str);
        return true;
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void onActivityResult(int i, Intent intent, IApiCallback iApiCallback) {
        Object[] objArr = {Integer.valueOf(i), intent, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "111305b86df671573424ebe52752ba96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "111305b86df671573424ebe52752ba96");
        } else if (Build.VERSION.SDK_INT < 21 || this.o == null) {
        } else {
            this.o.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i, intent));
        }
    }
}
