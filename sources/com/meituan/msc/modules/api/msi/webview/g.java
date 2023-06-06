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
import android.webkit.WebView;
import com.google.gson.JsonObject;
import com.meituan.msc.modules.api.msi.webview.a;
import com.meituan.msc.modules.page.render.webview.p;
import com.meituan.msi.bean.MsiContext;
import com.meituan.mtwebkit.MTConsoleMessage;
import com.meituan.mtwebkit.MTRenderProcessGoneDetail;
import com.meituan.mtwebkit.MTValueCallback;
import com.meituan.mtwebkit.MTWebChromeClient;
import com.meituan.mtwebkit.MTWebResourceRequest;
import com.meituan.mtwebkit.MTWebResourceResponse;
import com.meituan.mtwebkit.MTWebSettings;
import com.meituan.mtwebkit.MTWebView;
import com.meituan.mtwebkit.MTWebViewClient;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g extends a {
    public static ChangeQuickRedirect n;
    public MTValueCallback<Uri[]> o;
    public h p;

    public g(Context context, com.meituan.msc.modules.engine.h hVar, com.meituan.msc.modules.page.j jVar) {
        super(context, hVar, jVar);
        Object[] objArr = {context, hVar, jVar};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4eebff9fcf6e27fb1f638d3a395b1eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4eebff9fcf6e27fb1f638d3a395b1eb");
        }
    }

    @Override // com.meituan.msc.modules.api.msi.webview.a
    public final View a(final MsiContext msiContext, JsonObject jsonObject, WebViewComponentParam webViewComponentParam, com.meituan.msc.modules.page.j jVar) {
        Object[] objArr = {msiContext, jsonObject, webViewComponentParam, jVar};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9661b14132d486fd1991d75edf88d411", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9661b14132d486fd1991d75edf88d411");
        }
        this.p = new h(this.f.r.A(), msiContext.getActivity(), jVar.b(), msiContext.getEventDispatcher());
        this.h = this.p;
        this.e = this.p;
        MTWebSettings settings = this.p.getSettings();
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
        try {
            settings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Exception unused2) {
        }
        settings.setUserAgentString(c(webViewComponentParam.msc_ua_append));
        this.p.addJavascriptInterface(new WebJSBridge(new a.C0456a(), this.p, webViewComponentParam.htmlId, msiContext.getPageId()), "__wx");
        this.p.setWebChromeClient(new MTWebChromeClient() { // from class: com.meituan.msc.modules.api.msi.webview.MTWebViewComponentManager$1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mtwebkit.MTWebChromeClient
            public boolean onConsoleMessage(MTConsoleMessage mTConsoleMessage) {
                Object[] objArr2 = {mTConsoleMessage};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "380dbc731abf34d671c40bc36293b3e2", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "380dbc731abf34d671c40bc36293b3e2")).booleanValue();
                }
                if (mTConsoleMessage.messageLevel() == MTConsoleMessage.MessageLevel.ERROR) {
                    Log.e("web-view", "[error] " + mTConsoleMessage.message());
                    Log.e("web-view", "[error] sourceId = " + mTConsoleMessage.sourceId());
                    Log.e("web-view", "[error] lineNumber = " + mTConsoleMessage.lineNumber());
                } else {
                    Log.e("web-view", mTConsoleMessage.message());
                }
                return super.onConsoleMessage(mTConsoleMessage);
            }

            @Override // com.meituan.mtwebkit.MTWebChromeClient
            public void onReceivedTitle(MTWebView mTWebView, String str) {
                Object[] objArr2 = {mTWebView, str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "22b2437729b66d18e86d2e890aaa96ba", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "22b2437729b66d18e86d2e890aaa96ba");
                    return;
                }
                super.onReceivedTitle(mTWebView, str);
                if (!mTWebView.isAttachedToWindow() || TextUtils.isEmpty(str) || TextUtils.isEmpty(mTWebView.getUrl()) || mTWebView.getUrl().contains(str)) {
                    return;
                }
                g.this.b(str);
            }

            @Override // com.meituan.mtwebkit.MTWebChromeClient
            public boolean onShowFileChooser(MTWebView mTWebView, MTValueCallback<Uri[]> mTValueCallback, MTWebChromeClient.FileChooserParams fileChooserParams) {
                Object[] objArr2 = {mTWebView, mTValueCallback, fileChooserParams};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "672dafe98e0b2f9a933ed2d812f4d220", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "672dafe98e0b2f9a933ed2d812f4d220")).booleanValue();
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    Intent createIntent = fileChooserParams.createIntent();
                    g.this.o = mTValueCallback;
                    msiContext.startActivityForResult(createIntent, new com.meituan.msi.context.b() { // from class: com.meituan.msc.modules.api.msi.webview.MTWebViewComponentManager$1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.msi.context.b
                        public final void onActivityResult(int i, Intent intent) {
                            Object[] objArr3 = {Integer.valueOf(i), intent};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f7edcd07d4966d65ff6fdba3bf6655ad", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f7edcd07d4966d65ff6fdba3bf6655ad");
                                return;
                            }
                            com.meituan.msc.modules.reporter.g.d("MTWebViewComponentManager", "startActivityForResult onActivityResult requestCode:", Integer.valueOf(i));
                            g.this.a(i, intent);
                        }

                        @Override // com.meituan.msi.context.b
                        public final void onFail(int i, String str) {
                            Object[] objArr3 = {Integer.valueOf(i), str};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "af13abe199a15ed1726b9d79166fe71c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "af13abe199a15ed1726b9d79166fe71c");
                            } else {
                                com.meituan.msc.modules.reporter.g.d("MTWebViewComponentManager", "startActivityForResult onFail errorCode:", Integer.valueOf(i), "errorMsg:", str);
                            }
                        }
                    });
                    return true;
                }
                return super.onShowFileChooser(mTWebView, mTValueCallback, fileChooserParams);
            }

            @Keep
            public void openFileChooser(final MTValueCallback<Uri> mTValueCallback, String str) {
                Object[] objArr2 = {mTValueCallback, str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "617bd18e66f81b0a81698e495a580d71", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "617bd18e66f81b0a81698e495a580d71");
                    return;
                }
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
                if (TextUtils.isEmpty(str)) {
                    intent.setType("*/*");
                } else {
                    intent.setType(str);
                }
                g.this.o = new MTValueCallback<Uri[]>() { // from class: com.meituan.msc.modules.api.msi.webview.MTWebViewComponentManager$1.2
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.mtwebkit.MTValueCallback
                    public final /* synthetic */ void onReceiveValue(Uri[] uriArr) {
                        Uri[] uriArr2 = uriArr;
                        Object[] objArr3 = {uriArr2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "88484eaf7ab1a93ee4875ea5a35f78c6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "88484eaf7ab1a93ee4875ea5a35f78c6");
                        } else if (uriArr2 == null || uriArr2.length <= 0) {
                        } else {
                            mTValueCallback.onReceiveValue(uriArr2[0]);
                        }
                    }
                };
                msiContext.startActivityForResult(intent, new com.meituan.msi.context.b() { // from class: com.meituan.msc.modules.api.msi.webview.MTWebViewComponentManager$1.3
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.msi.context.b
                    public final void onFail(int i, String str2) {
                    }

                    @Override // com.meituan.msi.context.b
                    public final void onActivityResult(int i, Intent intent2) {
                        Object[] objArr3 = {Integer.valueOf(i), intent2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d2ecdb80af7c1971d804b0cc48d46ad3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d2ecdb80af7c1971d804b0cc48d46ad3");
                        } else {
                            g.this.a(i, intent2);
                        }
                    }
                });
            }

            @Override // com.meituan.mtwebkit.MTWebChromeClient
            public void onProgressChanged(MTWebView mTWebView, int i) {
                Object[] objArr2 = {mTWebView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "064244b9213fc379500e3e7d76925507", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "064244b9213fc379500e3e7d76925507");
                } else if (g.this.m) {
                } else {
                    g.this.k.a(i);
                    super.onProgressChanged(mTWebView, i);
                }
            }
        });
        this.p.setWebViewClient(new MTWebViewClient() { // from class: com.meituan.msc.modules.api.msi.webview.g.1
            public static ChangeQuickRedirect a;
            private com.meituan.msc.common.resource.c c = new com.meituan.msc.common.resource.c();
            private boolean d = false;

            @Override // com.meituan.mtwebkit.MTWebViewClient
            public final boolean onRenderProcessGone(MTWebView mTWebView, MTRenderProcessGoneDetail mTRenderProcessGoneDetail) {
                Object[] objArr2 = {mTWebView, mTRenderProcessGoneDetail};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1e8bb80971501ced7fc595f61681c495", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1e8bb80971501ced7fc595f61681c495")).booleanValue();
                }
                boolean didCrash = mTRenderProcessGoneDetail.didCrash();
                int rendererPriorityAtExit = mTRenderProcessGoneDetail.rendererPriorityAtExit();
                com.meituan.msc.modules.api.g.a(mTWebView, didCrash, rendererPriorityAtExit, "MTWebViewComponentManager" + mTWebView.getUrl(), g.this.f, null);
                return true;
            }

            @Override // com.meituan.mtwebkit.MTWebViewClient
            public final void onPageStarted(MTWebView mTWebView, String str, Bitmap bitmap) {
                Object[] objArr2 = {mTWebView, str, bitmap};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5541d25e753449cc631e2fc30a3bd718", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5541d25e753449cc631e2fc30a3bd718");
                    return;
                }
                this.d = false;
                if (Build.VERSION.SDK_INT >= 19) {
                    mTWebView.evaluateJavascript(a.d, null);
                } else {
                    mTWebView.loadUrl(a.d);
                }
                super.onPageStarted(mTWebView, str, bitmap);
                g.this.d(str);
            }

            @Override // com.meituan.mtwebkit.MTWebViewClient
            public final void onPageFinished(MTWebView mTWebView, String str) {
                Object[] objArr2 = {mTWebView, str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8e53110c4f8cc37bea2f5d7d0a76a990", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8e53110c4f8cc37bea2f5d7d0a76a990");
                    return;
                }
                super.onPageFinished(mTWebView, str);
                if (Build.VERSION.SDK_INT >= 19) {
                    mTWebView.evaluateJavascript(a.d, null);
                } else {
                    mTWebView.loadUrl(a.d);
                }
                g.this.a(mTWebView);
                if (!this.d) {
                    g.this.e(str);
                }
                g.this.b();
            }

            @Override // com.meituan.mtwebkit.MTWebViewClient
            public final void onReceivedError(MTWebView mTWebView, int i, String str, String str2) {
                Object[] objArr2 = {mTWebView, Integer.valueOf(i), str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "db30386a3211d731115755968df04a0a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "db30386a3211d731115755968df04a0a");
                    return;
                }
                super.onReceivedError(mTWebView, i, str, str2);
                this.d = true;
                g.this.a(i, str, str2);
            }

            @Override // com.meituan.mtwebkit.MTWebViewClient
            public final boolean shouldOverrideUrlLoading(MTWebView mTWebView, String str) {
                Object[] objArr2 = {mTWebView, str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ebbff6748cea71f5ef32e9990fc2cd82", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ebbff6748cea71f5ef32e9990fc2cd82")).booleanValue();
                }
                if (g.this.f(str)) {
                    return true;
                }
                return super.shouldOverrideUrlLoading(mTWebView, str);
            }

            @Override // com.meituan.mtwebkit.MTWebViewClient
            @TargetApi(21)
            public final MTWebResourceResponse shouldInterceptRequest(MTWebView mTWebView, MTWebResourceRequest mTWebResourceRequest) {
                Object[] objArr2 = {mTWebView, mTWebResourceRequest};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5b9b214fb7354c5930eece8729647d7b", RobustBitConfig.DEFAULT_VALUE)) {
                    return (MTWebResourceResponse) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5b9b214fb7354c5930eece8729647d7b");
                }
                MTWebResourceResponse mTWebResourceResponse = (MTWebResourceResponse) p.a(mTWebView.getContext(), g.this.f.d(), mTWebResourceRequest.getUrl().toString(), this.c);
                return mTWebResourceResponse != null ? mTWebResourceResponse : super.shouldInterceptRequest(mTWebView, mTWebResourceRequest);
            }

            @Override // com.meituan.mtwebkit.MTWebViewClient
            public final MTWebResourceResponse shouldInterceptRequest(MTWebView mTWebView, String str) {
                Object[] objArr2 = {mTWebView, str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "039ee9da1f01cfd6ee00e1dec672489b", RobustBitConfig.DEFAULT_VALUE)) {
                    return (MTWebResourceResponse) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "039ee9da1f01cfd6ee00e1dec672489b");
                }
                MTWebResourceResponse mTWebResourceResponse = (MTWebResourceResponse) p.a(mTWebView.getContext(), g.this.f.d(), str, this.c);
                return mTWebResourceResponse != null ? mTWebResourceResponse : super.shouldInterceptRequest(mTWebView, str);
            }
        });
        this.p.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.meituan.msc.modules.api.msi.webview.g.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85907b8daae7e95ddb9b6b5fcbd305bd", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85907b8daae7e95ddb9b6b5fcbd305bd")).booleanValue();
                }
                WebView.HitTestResult hitTestResult = ((WebView) view).getHitTestResult();
                if (hitTestResult != null) {
                    return com.meituan.msc.modules.api.web.a.a((Activity) g.this.g, g.this.f, hitTestResult.getType(), hitTestResult.getExtra());
                }
                return false;
            }
        });
        return this.p;
    }

    @Override // com.meituan.msc.modules.api.msi.webview.a
    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f30938e2dc56688d63f280f14ad1592", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f30938e2dc56688d63f280f14ad1592")).booleanValue();
        }
        if (this.p != null) {
            this.p.loadUrl(str);
            return true;
        }
        return false;
    }

    @Override // com.meituan.msc.modules.api.msi.webview.a
    public final void a(int i, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), intent};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb6b060049e05d10a0652f5f68e7c1bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb6b060049e05d10a0652f5f68e7c1bb");
        } else if (Build.VERSION.SDK_INT < 21 || this.o == null) {
        } else {
            this.o.onReceiveValue(MTWebChromeClient.FileChooserParams.parseResult(i, intent));
        }
    }

    @Override // com.meituan.msc.modules.api.msi.webview.a
    public final com.meituan.msi.view.e a() {
        return this.h;
    }
}
