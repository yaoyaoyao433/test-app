package com.meituan.mmp.lib.page.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.webkit.ValueCallback;
import com.meituan.mmp.lib.api.r;
import com.meituan.mmp.lib.utils.bb;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebViewExtension;
import com.tencent.smtt.export.external.interfaces.ConsoleMessage;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient;
import com.tencent.smtt.export.external.interfaces.WebResourceRequest;
import com.tencent.smtt.export.external.interfaces.WebResourceResponse;
import com.tencent.smtt.sdk.WebChromeClient;
import com.tencent.smtt.sdk.WebSettings;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.WebViewClient;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class n implements b {
    public static ChangeQuickRedirect a;
    com.meituan.mmp.lib.config.a b;
    com.meituan.mmp.lib.web.i c;
    int d;
    public e e;
    private Boolean f;
    private WebView g;
    private r h;
    private Context i;
    private a j;
    private volatile boolean k;
    private long l;

    @Override // com.meituan.mmp.lib.page.view.b
    public final void f() {
    }

    public n(Context context, com.meituan.mmp.lib.config.a aVar, r rVar) {
        Object[] objArr = {context, aVar, rVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ec5c26fd9790777080febf475e601e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ec5c26fd9790777080febf475e601e8");
            return;
        }
        this.k = false;
        this.l = 0L;
        this.i = context;
        this.b = aVar;
        this.h = rVar;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e2c397d5cd30d9976cc414b352918fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e2c397d5cd30d9976cc414b352918fd");
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.g = new WebView(this.i) { // from class: com.meituan.mmp.lib.page.view.n.1
            public static ChangeQuickRedirect b;

            @Override // android.view.View
            public final void onScrollChanged(int i, int i2, int i3, int i4) {
                Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect3 = b;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fd91c5325526baf2ad94cff0b49b93ae", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fd91c5325526baf2ad94cff0b49b93ae");
                    return;
                }
                super.onScrollChanged(i, i2, i3, i4);
                if (n.this.c != null) {
                    n.this.c.a(i, i2, i3, i4);
                }
            }

            @Override // android.view.View
            public final void setOverScrollMode(int i) {
                Pair pair;
                Object[] objArr3 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = b;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "81fcc98b69115f04987aad7e776a7660", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "81fcc98b69115f04987aad7e776a7660");
                    return;
                }
                try {
                    super.setOverScrollMode(i);
                } catch (Throwable th) {
                    Object[] objArr4 = {th};
                    ChangeQuickRedirect changeQuickRedirect4 = n.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "ea94a9f06b58c43c9f630e97e3a2a697", RobustBitConfig.DEFAULT_VALUE)) {
                        pair = (Pair) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "ea94a9f06b58c43c9f630e97e3a2a697");
                    } else {
                        String th2 = th.getCause() == null ? th.toString() : th.getCause().toString();
                        String stackTraceString = Log.getStackTraceString(th);
                        if (stackTraceString.contains("android.content.pm.PackageManager$NameNotFoundException") || stackTraceString.contains("java.lang.RuntimeException: Cannot load WebView") || stackTraceString.contains("android.webkit.WebViewFactory$MissingWebViewPackageException: Failed to load WebView provider: No WebView installed")) {
                            com.meituan.mmp.lib.trace.b.d("HeraWebView", "isWebViewPackageException" + th.getMessage());
                            Boolean bool = Boolean.TRUE;
                            pair = new Pair(bool, "WebView load failed, " + th2);
                        } else {
                            pair = new Pair(Boolean.FALSE, th2);
                        }
                    }
                    if (((Boolean) pair.first).booleanValue()) {
                        bb.a((String) pair.second, new Object[0]);
                        destroy();
                        return;
                    }
                    throw th;
                }
            }
        };
        this.l = SystemClock.elapsedRealtime() - elapsedRealtime;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "71e7c3c28ef2ea5e6c4041aaa89505e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "71e7c3c28ef2ea5e6c4041aaa89505e1");
        } else if (Build.VERSION.SDK_INT == 17 && this.f == null) {
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c21685ec8c8bbc14b14616c6d31d0b9f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c21685ec8c8bbc14b14616c6d31d0b9f")).booleanValue() : ((AccessibilityManager) this.i.getSystemService("accessibility")).isEnabled()) {
                this.f = Boolean.TRUE;
                a(false);
            }
        }
        g();
        WebSettings settings = this.g.getSettings();
        settings.setAllowFileAccess(true);
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setSupportMultipleWindows(false);
        settings.setAppCacheEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        try {
            settings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Exception unused) {
        }
        this.g.setVerticalScrollBarEnabled(false);
        this.g.setHorizontalScrollBarEnabled(false);
        settings.setAppCacheMaxSize(10485760L);
        settings.setAppCachePath(com.meituan.mmp.lib.utils.f.a(this.i, "webviewcache").getAbsolutePath());
        IX5WebViewExtension x5WebViewExtension = this.g.getX5WebViewExtension();
        if (x5WebViewExtension != null) {
            x5WebViewExtension.setScrollBarFadingEnabled(false);
            x5WebViewExtension.setVerticalScrollBarEnabled(false);
            x5WebViewExtension.setHorizontalScrollBarEnabled(false);
        }
        this.g.getView().setHorizontalScrollBarEnabled(false);
        this.g.getView().setVerticalScrollBarEnabled(false);
        this.g.setWebChromeClient(new WebChromeClient() { // from class: com.meituan.mmp.lib.page.view.n.2
            public static ChangeQuickRedirect a;
            private String c;

            {
                this.c = n.this.getClass().getSimpleName();
            }

            @Override // com.tencent.smtt.sdk.WebChromeClient
            public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                Object[] objArr5 = {consoleMessage};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a3b98cd0473b63c65b6baa56362405cf", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a3b98cd0473b63c65b6baa56362405cf")).booleanValue();
                }
                if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
                    PrintStream printStream = System.out;
                    printStream.println("webview_log_" + this.c + " [error] " + consoleMessage.message());
                    PrintStream printStream2 = System.out;
                    printStream2.println("webview_log_" + this.c + " [error] sourceId = " + consoleMessage.sourceId());
                    PrintStream printStream3 = System.out;
                    printStream3.println("webview_log_" + this.c + " [error] lineNumber = " + consoleMessage.lineNumber());
                } else {
                    new StringBuilder("webview_log_").append(this.c);
                    consoleMessage.message();
                }
                return super.onConsoleMessage(consoleMessage);
            }

            @Override // com.tencent.smtt.sdk.WebChromeClient
            public final void onReceivedTitle(WebView webView, String str) {
                Object[] objArr5 = {webView, str};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "648de6e1da825da6d57433933af146d1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "648de6e1da825da6d57433933af146d1");
                    return;
                }
                super.onReceivedTitle(webView, str);
                if (str.startsWith("mmp-page:")) {
                    webView.evaluateJavascript(String.format("document.title = '%s@page_%s@%s';", n.this.b.c(), Integer.valueOf(n.this.d), str), null);
                }
            }

            @Override // com.tencent.smtt.sdk.WebChromeClient
            public final void onShowCustomView(View view, final IX5WebChromeClient.CustomViewCallback customViewCallback) {
                Object[] objArr5 = {view, customViewCallback};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "06b78d1b4476a296e223361dd7d28a1b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "06b78d1b4476a296e223361dd7d28a1b");
                    return;
                }
                super.onShowCustomView(view, customViewCallback);
                if (n.this.e != null) {
                    n.this.e.a(view, new l() { // from class: com.meituan.mmp.lib.page.view.n.2.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.mmp.lib.page.view.l
                        public final void a() {
                            Object[] objArr6 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "e84e72b0c9273879582044abb8127748", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "e84e72b0c9273879582044abb8127748");
                            } else {
                                customViewCallback.onCustomViewHidden();
                            }
                        }
                    });
                }
            }

            @Override // com.tencent.smtt.sdk.WebChromeClient
            public final void onHideCustomView() {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "74b5e192d2856c07ff85c8d17c334369", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "74b5e192d2856c07ff85c8d17c334369");
                } else if (n.this.e != null) {
                    n.this.e.a();
                }
            }
        });
        this.j = new a(this.h);
        this.j.b = this.b;
        this.j.e = this.g;
        this.g.setWebViewClient(this.j);
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a(String str, @Nullable final ValueCallback<String> valueCallback) {
        Object[] objArr = {str, valueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b587536bac72f1071112fd69aea7469d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b587536bac72f1071112fd69aea7469d");
        } else {
            this.g.evaluateJavascript(str, new com.tencent.smtt.sdk.ValueCallback<String>() { // from class: com.meituan.mmp.lib.page.view.n.3
                public static ChangeQuickRedirect a;

                @Override // com.tencent.smtt.sdk.ValueCallback, android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Object obj) {
                    String str2 = (String) obj;
                    Object[] objArr2 = {str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3778002e206df5a5964f1c2e55853784", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3778002e206df5a5964f1c2e55853784");
                    } else if (valueCallback != null) {
                        valueCallback.onReceiveValue(str2);
                    }
                }
            });
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "171e9281cd70a61c7bfa892915e14240", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "171e9281cd70a61c7bfa892915e14240");
            return;
        }
        try {
            if (this.k) {
                com.meituan.mmp.lib.trace.b.b("X5WebView", "X5WebView is destroyed");
                return;
            }
            this.k = true;
            this.e = null;
            this.g.setWebChromeClient(null);
            this.g.removeJavascriptInterface("HeraJSCore");
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b1346a12c9e49a7f2135bb85d2f5d5af", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b1346a12c9e49a7f2135bb85d2f5d5af");
            } else if (Build.VERSION.SDK_INT < 19) {
                try {
                    Field declaredField = Class.forName("android.webkit.BrowserFrame").getDeclaredField("sConfigCallback");
                    if (declaredField != null) {
                        declaredField.setAccessible(true);
                        declaredField.set(null, null);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6ae7b2e82951a3edc1503e8aa02ca21e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6ae7b2e82951a3edc1503e8aa02ca21e");
            } else if (this.f != null) {
                a(this.f.booleanValue());
            }
            this.g.destroy();
        } catch (Throwable unused) {
            com.meituan.mmp.lib.trace.b.d("X5WebView", "destroy exception");
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6d2003e1eed127512124bcf7dbbcfd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6d2003e1eed127512124bcf7dbbcfd5");
        } else {
            this.g.loadUrl(str);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a(String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d4f2a9e80cf531798913812a1ee76b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d4f2a9e80cf531798913812a1ee76b9");
        } else {
            this.g.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final String getUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "059b24b6f4119947e160fefd8d4d6ca1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "059b24b6f4119947e160fefd8d4d6ca1") : this.g.getUrl();
    }

    @Override // com.meituan.mmp.lib.page.view.b
    @SuppressLint({"JavascriptInterface"})
    public final void a(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b625026fe034f09a0e42af596458b84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b625026fe034f09a0e42af596458b84");
        } else {
            this.g.addJavascriptInterface(obj, str);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final View getWebView() {
        return this.g;
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd529b2598976e397d48d316eaeda525", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd529b2598976e397d48d316eaeda525");
        } else {
            this.g.clearHistory();
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39ddc8a825608edeaa971d394a91077f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39ddc8a825608edeaa971d394a91077f");
        } else {
            this.g.requestLayout();
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5af30b72e6a5166cc56548b1f2433fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5af30b72e6a5166cc56548b1f2433fe");
        } else {
            this.g.scrollBy(0, i);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void setOnWebScrollChangeListener(com.meituan.mmp.lib.web.i iVar) {
        this.c = iVar;
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final String getUserAgentString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95af5e4c097a5e0970f2a6b3c6cca60c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95af5e4c097a5e0970f2a6b3c6cca60c") : this.g.getSettings().getUserAgentString();
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void setUserAgentString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a409d82596b8c58d00784d268d6b7991", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a409d82596b8c58d00784d268d6b7991");
        } else {
            this.g.getSettings().setUserAgentString(str);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final int getWebPageHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbae33263c571fa12077b0bf160f8b07", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbae33263c571fa12077b0bf160f8b07")).intValue() : (int) (this.g.getContentHeight() * this.g.getScale());
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final int getWebScrollY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ab27a0d8e1d2faac58a90aef3263e53", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ab27a0d8e1d2faac58a90aef3263e53")).intValue() : this.g.getScrollY();
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void setOnPageFinishedListener(com.meituan.mmp.lib.web.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "811c460e94ae6376744372324678b317", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "811c460e94ae6376744372324678b317");
        } else {
            this.j.c = gVar;
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95397217aac32ba6f763b9eb2ab9d110", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95397217aac32ba6f763b9eb2ab9d110");
        } else {
            this.g.onResume();
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a35505d5ea34e8952ce7fe0e5968132c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a35505d5ea34e8952ce7fe0e5968132c");
        } else {
            this.g.onPause();
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void b(int i) {
        this.d = i;
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void setOnFullScreenListener(e eVar) {
        if (this.e == null) {
            this.e = eVar;
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void setOnRenderProcessGoneListener(com.meituan.mmp.lib.web.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d28ad02fa4ffb17fb391065dee22e8da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d28ad02fa4ffb17fb391065dee22e8da");
        } else {
            this.j.d = hVar;
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final long getWebViewInitializationDuration() {
        return this.l;
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06fe7708efbc26b862659c0aaed964e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06fe7708efbc26b862659c0aaed964e3");
            return;
        }
        try {
            Method method = this.g.getClass().getMethod("removeJavascriptInterface", String.class);
            if (method != null) {
                method.invoke(this.g, "searchBoxJavaBridge_");
                method.invoke(this.g, "accessibility");
                method.invoke(this.g, "accessibilityTraversal");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "944f775a03078191942f1167c9e44ec0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "944f775a03078191942f1167c9e44ec0");
            return;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.i.getSystemService("accessibility");
        try {
            Method declaredMethod = accessibilityManager.getClass().getDeclaredMethod("setAccessibilityState", Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(accessibilityManager, Boolean.valueOf(z));
            declaredMethod.setAccessible(false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends WebViewClient implements com.meituan.mmp.lib.resource.b {
        public static ChangeQuickRedirect a;
        com.meituan.mmp.lib.config.a b;
        com.meituan.mmp.lib.web.g c;
        com.meituan.mmp.lib.web.h d;
        WebView e;
        private r f;

        public a(r rVar) {
            Object[] objArr = {rVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67013470997cb935606ba278a0cdae5a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67013470997cb935606ba278a0cdae5a");
            } else {
                this.f = rVar;
            }
        }

        @Override // com.tencent.smtt.sdk.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Object[] objArr = {webView, str, bitmap};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1daf5b67508ac2e68e2dd8fa331fe9e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1daf5b67508ac2e68e2dd8fa331fe9e");
            } else {
                super.onPageStarted(webView, str, bitmap);
            }
        }

        @Override // com.tencent.smtt.sdk.WebViewClient
        public final boolean onRenderProcessGone(WebView webView, WebViewClient.RenderProcessGoneDetail renderProcessGoneDetail) {
            Object[] objArr = {webView, renderProcessGoneDetail};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcc21cca00b16c49454aeb7c15f5b8ed", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcc21cca00b16c49454aeb7c15f5b8ed")).booleanValue();
            }
            this.f.a(webView, renderProcessGoneDetail.didCrash(), 2, webView.getUrl(), this.d);
            return true;
        }

        @Override // com.tencent.smtt.sdk.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            Object[] objArr = {webView, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ae9d7a79882f6e1950b3e6eb75f2535", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ae9d7a79882f6e1950b3e6eb75f2535");
                return;
            }
            super.onPageFinished(webView, str);
            if (this.c != null) {
                this.c.e(str);
            }
        }

        @Override // com.tencent.smtt.sdk.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            Object[] objArr = {webView, webResourceRequest};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea3b35e2cbd6f3bdbc86b43afb9ff65b", RobustBitConfig.DEFAULT_VALUE)) {
                return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea3b35e2cbd6f3bdbc86b43afb9ff65b");
            }
            WebResourceResponse webResourceResponse = (WebResourceResponse) m.a(webView.getContext(), this.b, webResourceRequest.getUrl().toString(), this);
            return webResourceResponse != null ? webResourceResponse : super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // com.tencent.smtt.sdk.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            Object[] objArr = {webView, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f074da757ab20a4f99f5863737690fc", RobustBitConfig.DEFAULT_VALUE)) {
                return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f074da757ab20a4f99f5863737690fc");
            }
            WebResourceResponse webResourceResponse = (WebResourceResponse) m.a(webView.getContext(), this.b, str, this);
            return webResourceResponse != null ? webResourceResponse : super.shouldInterceptRequest(webView, str);
        }

        @Override // com.meituan.mmp.lib.resource.b
        public final Object a(String str, Map<String, String> map, InputStream inputStream) {
            Object[] objArr = {str, map, inputStream};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16a2cf82e21deeda0813974e13ce9057", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16a2cf82e21deeda0813974e13ce9057");
            }
            WebResourceResponse webResourceResponse = new WebResourceResponse(str, "UTF-8", inputStream);
            if (map != null && !map.isEmpty()) {
                Map<String, String> responseHeaders = webResourceResponse.getResponseHeaders();
                if (responseHeaders == null) {
                    responseHeaders = new HashMap<>();
                }
                responseHeaders.putAll(map);
                webResourceResponse.setResponseHeaders(map);
            }
            return webResourceResponse;
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void setWidgetBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17d41039b02dcde88c0fb32250ffc99c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17d41039b02dcde88c0fb32250ffc99c");
        } else {
            this.g.setBackgroundColor(i);
        }
    }
}
