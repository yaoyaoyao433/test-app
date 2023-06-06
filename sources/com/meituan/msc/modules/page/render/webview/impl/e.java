package com.meituan.msc.modules.page.render.webview.impl;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.meituan.dio.easy.DioFile;
import com.meituan.msc.common.utils.ag;
import com.meituan.msc.common.utils.ai;
import com.meituan.msc.modules.devtools.DebugHelper;
import com.meituan.msc.modules.page.render.webview.f;
import com.meituan.msc.modules.page.render.webview.h;
import com.meituan.msc.modules.page.render.webview.i;
import com.meituan.msc.modules.page.render.webview.j;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@TargetApi(19)
/* loaded from: classes3.dex */
public final class e implements com.meituan.msc.modules.page.render.webview.c {
    public static ChangeQuickRedirect a;
    private Boolean b;
    private WebView c;
    private Context d;
    private volatile boolean e;

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void b(int i) {
    }

    @Override // com.meituan.msc.modules.page.render.g
    public final void l() {
    }

    @Override // com.meituan.msc.modules.page.render.g
    public final void q() {
    }

    @Override // com.meituan.msc.modules.page.render.e
    public final void setOnContentScrollChangeListener(f fVar) {
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void setOnFullScreenListener(j jVar) {
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void setOnRenderProcessGoneListener(i iVar) {
    }

    public e(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4c6fbac3ccb2d71b2043d62c9fbf4ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4c6fbac3ccb2d71b2043d62c9fbf4ec");
            return;
        }
        this.e = false;
        this.d = context;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bac923f038bd89a26896c32fc2eceaee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bac923f038bd89a26896c32fc2eceaee");
            return;
        }
        this.c = new WebView(this.d);
        this.c.setOverScrollMode(2);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7087b74787387b49efbe5974dd16119d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7087b74787387b49efbe5974dd16119d");
        } else if (Build.VERSION.SDK_INT == 17 && this.b == null) {
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "fece22204ef39d3002a00f8ea63d21b3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "fece22204ef39d3002a00f8ea63d21b3")).booleanValue() : ((AccessibilityManager) this.d.getSystemService("accessibility")).isEnabled()) {
                this.b = Boolean.TRUE;
                a(false);
            }
        }
        b();
        WebSettings settings = this.c.getSettings();
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
        this.c.setVerticalScrollBarEnabled(false);
        this.c.setHorizontalScrollBarEnabled(false);
        if (Build.VERSION.SDK_INT > 14) {
            settings.setTextZoom(100);
        }
        settings.setAppCacheMaxSize(10485760L);
        settings.setAppCachePath(com.meituan.msc.common.utils.e.a(this.d, "webviewcache").getAbsolutePath());
        this.c.setWebChromeClient(new WebChromeClient() { // from class: com.meituan.msc.modules.page.render.webview.impl.e.1
            public static ChangeQuickRedirect a;
            private String c;

            {
                this.c = e.this.getClass().getSimpleName();
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                Object[] objArr5 = {consoleMessage};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "9e21cb1ab4149a72e47b1b5d66ec247e", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "9e21cb1ab4149a72e47b1b5d66ec247e")).booleanValue();
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
        });
        this.c.setWebViewClient(new a());
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void a(String str, @Nullable ValueCallback<String> valueCallback) {
        Object[] objArr = {str, valueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d32b74acb99c2dad146d2b417942c996", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d32b74acb99c2dad146d2b417942c996");
        } else {
            this.c.evaluateJavascript(str, valueCallback);
        }
    }

    @Override // com.meituan.msc.modules.page.render.g
    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d8fefceab6e08d4c553349a3fee13d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d8fefceab6e08d4c553349a3fee13d9");
            return;
        }
        try {
            if (this.e) {
                g.b("HeraWebView", "SimpleWebView is destroyed");
                return;
            }
            this.e = true;
            this.c.setWebChromeClient(null);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cfed6ac9d45606e08cdcecff2589f934", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cfed6ac9d45606e08cdcecff2589f934");
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
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d58c1db4f6d99b525bab6732e0247316", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d58c1db4f6d99b525bab6732e0247316");
            } else if (this.b != null) {
                a(this.b.booleanValue());
            }
            this.c.destroy();
        } catch (Throwable unused) {
            g.a("HeraWebView", "destroy exception");
        }
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void a(String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d19698b93e8d90986374806f2aeebce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d19698b93e8d90986374806f2aeebce");
        } else {
            this.c.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final String getUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67f8e2a01476819a7a059c153ce4efe3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67f8e2a01476819a7a059c153ce4efe3") : this.c.getUrl();
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void a(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "601f32e9780a7fcd2723ce3ededc361e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "601f32e9780a7fcd2723ce3ededc361e");
        } else {
            this.c.addJavascriptInterface(obj, str);
        }
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final View getWebView() {
        return this.c;
    }

    @Override // com.meituan.msc.modules.page.render.e
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55154b890c82893f5e38729bf83fa37e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55154b890c82893f5e38729bf83fa37e");
        } else {
            this.c.requestLayout();
        }
    }

    @Override // com.meituan.msc.modules.page.render.e
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "674ad721a8e2f09d7ca723d0bc1d2bd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "674ad721a8e2f09d7ca723d0bc1d2bd8");
        } else {
            this.c.scrollBy(0, i);
        }
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final String getUserAgentString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b66ecb7819c6bf72be9af0caf161e7d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b66ecb7819c6bf72be9af0caf161e7d") : this.c.getSettings().getUserAgentString();
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void setUserAgentString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "774b51a298df73baa7ca1ee0a13cd6d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "774b51a298df73baa7ca1ee0a13cd6d4");
        } else {
            this.c.getSettings().setUserAgentString(str);
        }
    }

    @Override // com.meituan.msc.modules.page.render.e
    public final int getContentHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95ce78e9c3d2bdbe97bd3d3b5b2718ea", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95ce78e9c3d2bdbe97bd3d3b5b2718ea")).intValue() : (int) (this.c.getContentHeight() * this.c.getScale());
    }

    @Override // com.meituan.msc.modules.page.render.e
    public final int getContentScrollY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6c57f4256e21de7bd7d7696833535b1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6c57f4256e21de7bd7d7696833535b1")).intValue() : this.c.getScrollY();
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void setOnPageFinishedListener(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "761c2c86664eaa95485f49fd3d44c0c1", RobustBitConfig.DEFAULT_VALUE)) {
            throw new RuntimeException("SimpleWebview not support setOnPageFinishedListener!");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "761c2c86664eaa95485f49fd3d44c0c1");
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0720c799a33b3b1354c63df1b5eca02c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0720c799a33b3b1354c63df1b5eca02c");
            return;
        }
        try {
            Method method = this.c.getClass().getMethod("removeJavascriptInterface", String.class);
            if (method != null) {
                method.invoke(this.c, "searchBoxJavaBridge_");
                method.invoke(this.c, "accessibility");
                method.invoke(this.c, "accessibilityTraversal");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cd2ec73ace030442e825e2a15117b8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cd2ec73ace030442e825e2a15117b8a");
            return;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.d.getSystemService("accessibility");
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
    public static class a extends WebViewClient {
        public static ChangeQuickRedirect a;

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Object[] objArr = {webView, str, bitmap};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a526f12b5072564ee17aa556e14cf20", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a526f12b5072564ee17aa556e14cf20");
            } else {
                super.onPageStarted(webView, str, bitmap);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Object[] objArr = {webView, renderProcessGoneDetail};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "091e9cdc3d066cc0bb439b0ebba182f2", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "091e9cdc3d066cc0bb439b0ebba182f2")).booleanValue();
            }
            com.meituan.msc.modules.api.g.a(webView, renderProcessGoneDetail, "SimpleWebView", null, null);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            Object[] objArr = {webView, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b55dc8c8f8e02b1e590b18b170d1460f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b55dc8c8f8e02b1e590b18b170d1460f");
            } else {
                super.onPageFinished(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(21)
        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            Object[] objArr = {webView, webResourceRequest};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da91b1a9d549316688e4ef46f1e6657e", RobustBitConfig.DEFAULT_VALUE)) {
                return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da91b1a9d549316688e4ef46f1e6657e");
            }
            WebResourceResponse a2 = a(webView.getContext(), webResourceRequest.getUrl().toString());
            return a2 != null ? a2 : super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            Object[] objArr = {webView, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad2024d0a3415a24ce08f93a4a4ef253", RobustBitConfig.DEFAULT_VALUE)) {
                return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad2024d0a3415a24ce08f93a4a4ef253");
            }
            WebResourceResponse a2 = a(webView.getContext(), str);
            return a2 != null ? a2 : super.shouldInterceptRequest(webView, str);
        }

        private WebResourceResponse a(Context context, String str) {
            Object[] objArr = {context, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a236e0f9acaf01942ef04a76b5940507", RobustBitConfig.DEFAULT_VALUE)) {
                return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a236e0f9acaf01942ef04a76b5940507");
            }
            if (DebugHelper.b) {
                if (str.startsWith("mtlocalfile://" + ag.a(context))) {
                    return a(ai.a(str), new DioFile(str.substring(14)));
                }
                return null;
            }
            return null;
        }

        private WebResourceResponse a(String str, DioFile dioFile) {
            Object[] objArr = {str, dioFile};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8a8bcb1aef2721f8a2b7475f1c814ab", RobustBitConfig.DEFAULT_VALUE)) {
                return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8a8bcb1aef2721f8a2b7475f1c814ab");
            }
            if (dioFile.c() || dioFile.k()) {
                try {
                    WebResourceResponse webResourceResponse = new WebResourceResponse(str, "UTF-8", dioFile.b());
                    if (Build.VERSION.SDK_INT >= 21) {
                        Map<String, String> responseHeaders = webResourceResponse.getResponseHeaders();
                        if (responseHeaders == null) {
                            responseHeaders = new HashMap<>();
                        }
                        responseHeaders.put("Cache-Control", "no-cache, no-store, must-revalidate");
                        responseHeaders.put("Pragma", "no-cache");
                        responseHeaders.put("Expires", "0");
                        webResourceResponse.setResponseHeaders(responseHeaders);
                    }
                    return webResourceResponse;
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    return null;
                } catch (IOException e2) {
                    Object[] objArr2 = {e2};
                    ChangeQuickRedirect changeQuickRedirect2 = e.a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2135de2580a64ade58fa6f8a7a579069", RobustBitConfig.DEFAULT_VALUE)) {
                        Pair pair = (Pair) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2135de2580a64ade58fa6f8a7a579069");
                    } else {
                        String th = e2.getCause() == null ? e2.toString() : e2.getCause().toString();
                        String stackTraceString = Log.getStackTraceString(e2);
                        if (stackTraceString.contains("android.content.pm.PackageManager$NameNotFoundException") || stackTraceString.contains("java.lang.RuntimeException: Cannot load WebView") || stackTraceString.contains("android.webkit.WebViewFactory$MissingWebViewPackageException: Failed to load WebView provider: No WebView installed")) {
                            g.a("HeraWebView", "isWebViewPackageException" + e2.getMessage());
                            Boolean bool = Boolean.TRUE;
                            new Pair(bool, "WebView load failed, " + th);
                        } else {
                            new Pair(Boolean.FALSE, th);
                        }
                    }
                    e2.printStackTrace();
                    return null;
                }
            }
            return null;
        }
    }
}
