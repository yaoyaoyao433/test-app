package com.meituan.msc.modules.api.msi.webview;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
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
import com.google.gson.JsonObject;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.api.msi.webview.a;
import com.meituan.msc.modules.page.render.webview.p;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class k extends a {
    public static ChangeQuickRedirect n;
    public b o;

    public k(Context context, com.meituan.msc.modules.engine.h hVar, com.meituan.msc.modules.page.j jVar) {
        super(context, hVar, jVar);
        Object[] objArr = {context, hVar, jVar};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "729f4892079758b4c8839ffe8ea5dbb3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "729f4892079758b4c8839ffe8ea5dbb3");
        }
    }

    @Override // com.meituan.msc.modules.api.msi.webview.a
    public final View a(final MsiContext msiContext, JsonObject jsonObject, WebViewComponentParam webViewComponentParam, com.meituan.msc.modules.page.j jVar) {
        Object[] objArr = {msiContext, jsonObject, webViewComponentParam, jVar};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9c88034354c481a9f23401af25a2cda", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9c88034354c481a9f23401af25a2cda");
        }
        this.o = new b(msiContext.getActivity(), jVar.b(), msiContext.getEventDispatcher());
        this.h = this.o;
        this.e = this.o;
        WebSettings settings = this.o.getSettings();
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
        settings.setDatabasePath(com.meituan.msc.common.utils.e.a(msiContext.getActivity(), "databases").getAbsolutePath());
        settings.setAppCacheMaxSize(10485760L);
        settings.setAppCachePath(com.meituan.msc.common.utils.e.a(msiContext.getActivity(), "webviewcache").getAbsolutePath());
        if (Build.VERSION.SDK_INT > 14) {
            settings.setTextZoom(100);
        }
        try {
            settings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Exception unused) {
        }
        settings.setUserAgentString(c(webViewComponentParam.msc_ua_append));
        try {
            settings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Exception unused2) {
        }
        this.o.addJavascriptInterface(new WebJSBridge(new a.C0456a(), this.o, webViewComponentParam.htmlId, msiContext.getPageId()), "__wx");
        this.o.evaluateJavascript("javascript:window.__webviewEnv = 'msc';", null);
        this.o.setWebChromeClient(new WebChromeClient() { // from class: com.meituan.msc.modules.api.msi.webview.WebViewComponentManager$1
            public static ChangeQuickRedirect a;

            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                Object[] objArr2 = {consoleMessage};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9f7a64d11ffde0e68dab298f6df073b9", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9f7a64d11ffde0e68dab298f6df073b9")).booleanValue();
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
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "72d43f19062105e8b1cd90edad45a6b0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "72d43f19062105e8b1cd90edad45a6b0");
                    return;
                }
                super.onReceivedTitle(webView, str);
                if (!webView.isAttachedToWindow() || TextUtils.isEmpty(str) || TextUtils.isEmpty(webView.getUrl()) || webView.getUrl().contains(str)) {
                    return;
                }
                k.this.b(str);
            }

            @Override // android.webkit.WebChromeClient
            public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                Object[] objArr2 = {webView, valueCallback, fileChooserParams};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "11e864ae4355ec9e75550d51637bbdb7", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "11e864ae4355ec9e75550d51637bbdb7")).booleanValue();
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    Intent createIntent = fileChooserParams.createIntent();
                    k.this.j = valueCallback;
                    msiContext.startActivityForResult(createIntent, new com.meituan.msi.context.b() { // from class: com.meituan.msc.modules.api.msi.webview.WebViewComponentManager$1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.msi.context.b
                        public final void onActivityResult(int i, Intent intent) {
                            Object[] objArr3 = {Integer.valueOf(i), intent};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "95e6458630197d86c697be1acd3c230c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "95e6458630197d86c697be1acd3c230c");
                                return;
                            }
                            com.meituan.msc.modules.reporter.g.d("WebViewComponentManager", "startActivityForResult onActivityResult requestCode:", Integer.valueOf(i));
                            k.this.a(i, intent);
                        }

                        @Override // com.meituan.msi.context.b
                        public final void onFail(int i, String str) {
                            Object[] objArr3 = {Integer.valueOf(i), str};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fc44137810bbb6d6c85bc72a25d45245", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fc44137810bbb6d6c85bc72a25d45245");
                            } else {
                                com.meituan.msc.modules.reporter.g.d("WebViewComponentManager", "startActivityForResult onFail errorCode:", Integer.valueOf(i), "errorMsg:", str);
                            }
                        }
                    });
                    return true;
                }
                return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
            }

            @Keep
            public void openFileChooser(final ValueCallback<Uri> valueCallback, String str) {
                Object[] objArr2 = {valueCallback, str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d86af7e5a5fe5ce6227dc68543e5772a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d86af7e5a5fe5ce6227dc68543e5772a");
                    return;
                }
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
                if (TextUtils.isEmpty(str)) {
                    intent.setType("*/*");
                } else {
                    intent.setType(str);
                }
                k.this.j = new ValueCallback<Uri[]>() { // from class: com.meituan.msc.modules.api.msi.webview.WebViewComponentManager$1.2
                    public static ChangeQuickRedirect a;

                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(Uri[] uriArr) {
                        Uri[] uriArr2 = uriArr;
                        Object[] objArr3 = {uriArr2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b74c539940ab7dbea49bb6c8ccb1dad8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b74c539940ab7dbea49bb6c8ccb1dad8");
                        } else if (uriArr2 == null || uriArr2.length <= 0) {
                        } else {
                            valueCallback.onReceiveValue(uriArr2[0]);
                        }
                    }
                };
                msiContext.startActivityForResult(intent, new com.meituan.msi.context.b() { // from class: com.meituan.msc.modules.api.msi.webview.WebViewComponentManager$1.3
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.msi.context.b
                    public final void onFail(int i, String str2) {
                    }

                    @Override // com.meituan.msi.context.b
                    public final void onActivityResult(int i, Intent intent2) {
                        Object[] objArr3 = {Integer.valueOf(i), intent2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bb30c036f4505284bca0bd9782ba586e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bb30c036f4505284bca0bd9782ba586e");
                        } else {
                            k.this.a(i, intent2);
                        }
                    }
                });
            }

            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                Object[] objArr2 = {webView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3eb7e76ed8b4af34efa780621a106ef0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3eb7e76ed8b4af34efa780621a106ef0");
                } else if (k.this.m) {
                } else {
                    k.this.k.a(i);
                    super.onProgressChanged(webView, i);
                }
            }
        });
        this.o.setWebViewClient(new WebViewClient() { // from class: com.meituan.msc.modules.api.msi.webview.k.1
            public static ChangeQuickRedirect a;
            private com.meituan.msc.common.resource.a c = new com.meituan.msc.common.resource.a();
            private boolean d = false;

            @Override // android.webkit.WebViewClient
            public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                Object[] objArr2 = {webView, renderProcessGoneDetail};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "79f13779b751cee13fb932cb68183e3c", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "79f13779b751cee13fb932cb68183e3c")).booleanValue();
                }
                com.meituan.msc.modules.api.g.a(webView, renderProcessGoneDetail, "WebViewComponentManager" + webView.getUrl(), k.this.f, null);
                return true;
            }

            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                Object[] objArr2 = {webView, str, bitmap};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "56f4636b879499aa180f974de98d3680", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "56f4636b879499aa180f974de98d3680");
                    return;
                }
                this.d = false;
                if (Build.VERSION.SDK_INT >= 19) {
                    webView.evaluateJavascript(a.d, null);
                } else {
                    webView.loadUrl(a.d);
                }
                super.onPageStarted(webView, str, bitmap);
                k.this.d(str);
            }

            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str) {
                Object[] objArr2 = {webView, str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9bd0f6cd2dec99b737a87512cec4dcb5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9bd0f6cd2dec99b737a87512cec4dcb5");
                    return;
                }
                super.onPageFinished(webView, str);
                k.this.m = true;
                if (Build.VERSION.SDK_INT >= 19) {
                    webView.evaluateJavascript(a.d, null);
                } else {
                    webView.loadUrl(a.d);
                }
                k.this.a(webView);
                if (!this.d) {
                    k.this.e(str);
                }
                k.this.b();
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView, int i, String str, String str2) {
                Object[] objArr2 = {webView, Integer.valueOf(i), str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "69050b8d6ce1fac1f523728232dd7128", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "69050b8d6ce1fac1f523728232dd7128");
                    return;
                }
                super.onReceivedError(webView, i, str, str2);
                this.d = true;
                k.this.a(i, str, str2);
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                Object[] objArr2 = {webView, str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "362330640a24a22d4d5242730929213c", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "362330640a24a22d4d5242730929213c")).booleanValue();
                }
                if (k.this.f(str)) {
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }

            @Override // android.webkit.WebViewClient
            @TargetApi(21)
            public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                Object[] objArr2 = {webView, webResourceRequest};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9bde6d07f23e2dc5017772a5f1a6998d", RobustBitConfig.DEFAULT_VALUE)) {
                    return (WebResourceResponse) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9bde6d07f23e2dc5017772a5f1a6998d");
                }
                WebResourceResponse webResourceResponse = (WebResourceResponse) p.a(webView.getContext(), k.this.f.d(), webResourceRequest.getUrl().toString(), this.c);
                return webResourceResponse != null ? webResourceResponse : super.shouldInterceptRequest(webView, webResourceRequest);
            }

            @Override // android.webkit.WebViewClient
            public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                Object[] objArr2 = {webView, str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5fe0279329acdb7015cbdb384cb667e0", RobustBitConfig.DEFAULT_VALUE)) {
                    return (WebResourceResponse) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5fe0279329acdb7015cbdb384cb667e0");
                }
                WebResourceResponse webResourceResponse = (WebResourceResponse) p.a(webView.getContext(), k.this.f.d(), str, this.c);
                return webResourceResponse != null ? webResourceResponse : super.shouldInterceptRequest(webView, str);
            }
        });
        this.o.setDownloadListener(l.a());
        this.o.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.meituan.msc.modules.api.msi.webview.k.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "14151e53f0a2c18048977f454d31ee58", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "14151e53f0a2c18048977f454d31ee58")).booleanValue();
                }
                WebView.HitTestResult hitTestResult = ((WebView) view).getHitTestResult();
                if (hitTestResult != null) {
                    return com.meituan.msc.modules.api.web.a.a((Activity) k.this.g, k.this.f, hitTestResult.getType(), hitTestResult.getExtra());
                }
                return false;
            }
        });
        return this.o;
    }

    public static /* synthetic */ void a(String str, String str2, String str3, String str4, long j) {
        Object[] objArr = {str, str2, str3, str4, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9876150a8f8e2716b438905cbabb5291", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9876150a8f8e2716b438905cbabb5291");
        } else if (MSCEnvHelper.getWebViewDownloadListener() != null) {
            MSCEnvHelper.getWebViewDownloadListener().onDownloadStart(str, str2, str3, str4, j);
        }
    }

    @Override // com.meituan.msc.modules.api.msi.webview.a
    public final com.meituan.msi.view.e a() {
        return this.h;
    }

    @Override // com.meituan.msc.modules.api.msi.webview.a
    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75c7006efb250d8d6bfbe4f5fc9046a3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75c7006efb250d8d6bfbe4f5fc9046a3")).booleanValue();
        }
        if (this.o != null) {
            this.o.loadUrl(str);
            return true;
        }
        return false;
    }

    @Override // com.meituan.msc.modules.api.msi.webview.a
    public final void a(int i, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), intent};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db70e4d55adfe3c460444054f2333394", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db70e4d55adfe3c460444054f2333394");
        } else if (Build.VERSION.SDK_INT < 21 || this.j == null) {
        } else {
            this.j.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i, intent));
        }
    }
}
