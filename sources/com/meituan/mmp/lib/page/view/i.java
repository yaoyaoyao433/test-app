package com.meituan.mmp.lib.page.view;

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
import com.meituan.mmp.lib.DebugHelper;
import com.meituan.mmp.lib.api.r;
import com.meituan.mmp.lib.utils.ai;
import com.meituan.mmp.lib.utils.ay;
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
public final class i implements b {
    public static ChangeQuickRedirect a;
    private Boolean b;
    private WebView c;
    private Context d;
    private volatile boolean e;

    @Override // com.meituan.mmp.lib.page.view.b
    public final void b(int i) {
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void d() {
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void e() {
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void f() {
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final long getWebViewInitializationDuration() {
        return 0L;
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void setOnFullScreenListener(e eVar) {
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void setOnRenderProcessGoneListener(com.meituan.mmp.lib.web.h hVar) {
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void setOnWebScrollChangeListener(com.meituan.mmp.lib.web.i iVar) {
    }

    public i(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e30ec92da9907229a5528f72895e406", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e30ec92da9907229a5528f72895e406");
            return;
        }
        this.e = false;
        this.d = context;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0431bbd94f2bdbdc98460cbf2c2e17d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0431bbd94f2bdbdc98460cbf2c2e17d9");
            return;
        }
        this.c = new WebView(this.d);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a7bfaa36751c8cfdf16b860aa58ddbba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a7bfaa36751c8cfdf16b860aa58ddbba");
        } else if (Build.VERSION.SDK_INT == 17 && this.b == null) {
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7dea80fb95b6dacc516d9a7fbbb8a2fa", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7dea80fb95b6dacc516d9a7fbbb8a2fa")).booleanValue() : ((AccessibilityManager) this.d.getSystemService("accessibility")).isEnabled()) {
                this.b = Boolean.TRUE;
                a(false);
            }
        }
        g();
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
        settings.setLoadWithOverviewMode(true);
        this.c.setVerticalScrollBarEnabled(false);
        this.c.setHorizontalScrollBarEnabled(false);
        if (Build.VERSION.SDK_INT > 14) {
            settings.setTextZoom(100);
        }
        settings.setAppCacheMaxSize(10485760L);
        settings.setAppCachePath(com.meituan.mmp.lib.utils.f.a(this.d, "webviewcache").getAbsolutePath());
        this.c.setWebChromeClient(new WebChromeClient() { // from class: com.meituan.mmp.lib.page.view.i.1
            public static ChangeQuickRedirect a;
            private String c;

            {
                this.c = i.this.getClass().getSimpleName();
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                Object[] objArr5 = {consoleMessage};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "0a2ebb204e26b02c8268928b19728488", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "0a2ebb204e26b02c8268928b19728488")).booleanValue();
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

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a(String str, @Nullable ValueCallback<String> valueCallback) {
        Object[] objArr = {str, valueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "511520218814d33439e888d26063d6bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "511520218814d33439e888d26063d6bf");
        } else {
            this.c.evaluateJavascript(str, valueCallback);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "088bcfb120a0af87e3e1f23476833a9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "088bcfb120a0af87e3e1f23476833a9e");
            return;
        }
        try {
            if (this.e) {
                com.meituan.mmp.lib.trace.b.b("HeraWebView", "SimpleWebView is destroyed");
                return;
            }
            this.e = true;
            this.c.setWebChromeClient(null);
            this.c.removeJavascriptInterface("HeraJSCore");
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a3a19368b2aee826166078c60e6206b8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a3a19368b2aee826166078c60e6206b8");
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
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "07c4696b4b249640b706024ff03c10d6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "07c4696b4b249640b706024ff03c10d6");
            } else if (this.b != null) {
                a(this.b.booleanValue());
            }
            this.c.destroy();
        } catch (Throwable unused) {
            com.meituan.mmp.lib.trace.b.d("HeraWebView", "destroy exception");
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a10638a299ede211a45a351310f4ca8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a10638a299ede211a45a351310f4ca8b");
        } else {
            this.c.loadUrl(str);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a(String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6c5f750afe117339ae3124dbb4910cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6c5f750afe117339ae3124dbb4910cd");
        } else {
            this.c.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final String getUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12d8a3a4e005d95ee359d8f5e7bdb29a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12d8a3a4e005d95ee359d8f5e7bdb29a") : this.c.getUrl();
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3aec52e60a7fa33fbb63a7e01f8eb54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3aec52e60a7fa33fbb63a7e01f8eb54");
        } else {
            this.c.addJavascriptInterface(obj, str);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final View getWebView() {
        return this.c;
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aeef924a4d57ef695f7504f432704f50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aeef924a4d57ef695f7504f432704f50");
        } else {
            this.c.clearHistory();
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd01ccd3d973c44975e000740e9ec368", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd01ccd3d973c44975e000740e9ec368");
        } else {
            this.c.requestLayout();
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed48826f9601475ea42159fe5f4035c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed48826f9601475ea42159fe5f4035c6");
        } else {
            this.c.scrollBy(0, i);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final String getUserAgentString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cc2bb974e15378b08a373decabbdadf", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cc2bb974e15378b08a373decabbdadf") : this.c.getSettings().getUserAgentString();
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void setUserAgentString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c62ffcd1fda7c176992890ef94add7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c62ffcd1fda7c176992890ef94add7b");
        } else {
            this.c.getSettings().setUserAgentString(str);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final int getWebPageHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa2688068f722e4565405393e5978625", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa2688068f722e4565405393e5978625")).intValue() : (int) (this.c.getContentHeight() * this.c.getScale());
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final int getWebScrollY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05fae1a4c4982cd56677431f594b7b20", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05fae1a4c4982cd56677431f594b7b20")).intValue() : this.c.getScrollY();
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void setOnPageFinishedListener(com.meituan.mmp.lib.web.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6b0c088f8efccdb0d26ae580e6e8058", RobustBitConfig.DEFAULT_VALUE)) {
            throw new RuntimeException("SimpleWebview not support setOnPageFinishedListener!");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6b0c088f8efccdb0d26ae580e6e8058");
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89968a3163a3e54fd3a14c350d116c90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89968a3163a3e54fd3a14c350d116c90");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3f8e27ac51ee19a6676bcd5846432b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3f8e27ac51ee19a6676bcd5846432b2");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "868b3657f362fd69be63c9cd1b7ab1d8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "868b3657f362fd69be63c9cd1b7ab1d8");
            } else {
                super.onPageStarted(webView, str, bitmap);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Object[] objArr = {webView, renderProcessGoneDetail};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f2948632f0373705e8a19296e0e84e1", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f2948632f0373705e8a19296e0e84e1")).booleanValue();
            }
            r.a(webView, renderProcessGoneDetail, "SimpleWebView", (com.meituan.mmp.lib.engine.m) null, (com.meituan.mmp.lib.web.h) null);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            Object[] objArr = {webView, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c04d7ce748f2f791b031f716fa4fcfc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c04d7ce748f2f791b031f716fa4fcfc");
            } else {
                super.onPageFinished(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(21)
        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            Object[] objArr = {webView, webResourceRequest};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b41e4e59893e81c632a7f73394bc9a5", RobustBitConfig.DEFAULT_VALUE)) {
                return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b41e4e59893e81c632a7f73394bc9a5");
            }
            WebResourceResponse a2 = a(webView.getContext(), webResourceRequest.getUrl().toString());
            return a2 != null ? a2 : super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            Object[] objArr = {webView, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3adab4ee664a24fd9cea1d3e46e03776", RobustBitConfig.DEFAULT_VALUE)) {
                return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3adab4ee664a24fd9cea1d3e46e03776");
            }
            WebResourceResponse a2 = a(webView.getContext(), str);
            return a2 != null ? a2 : super.shouldInterceptRequest(webView, str);
        }

        private WebResourceResponse a(Context context, String str) {
            Object[] objArr = {context, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce6ef4631d33418e59e6054f82db51f4", RobustBitConfig.DEFAULT_VALUE)) {
                return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce6ef4631d33418e59e6054f82db51f4");
            }
            if (DebugHelper.c) {
                if (str.startsWith("mtlocalfile://" + ay.a(context))) {
                    return a(ai.a(str), new DioFile(str.substring(14)));
                }
                return null;
            }
            return null;
        }

        private WebResourceResponse a(String str, DioFile dioFile) {
            Object[] objArr = {str, dioFile};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "442cc7e2f0ca32e5cd4099433d9a1aac", RobustBitConfig.DEFAULT_VALUE)) {
                return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "442cc7e2f0ca32e5cd4099433d9a1aac");
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
                    ChangeQuickRedirect changeQuickRedirect2 = i.a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9eacc75165b8eb81afde815e5266d46a", RobustBitConfig.DEFAULT_VALUE)) {
                        Pair pair = (Pair) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9eacc75165b8eb81afde815e5266d46a");
                    } else {
                        String th = e2.getCause() == null ? e2.toString() : e2.getCause().toString();
                        String stackTraceString = Log.getStackTraceString(e2);
                        if (stackTraceString.contains("android.content.pm.PackageManager$NameNotFoundException") || stackTraceString.contains("java.lang.RuntimeException: Cannot load WebView") || stackTraceString.contains("android.webkit.WebViewFactory$MissingWebViewPackageException: Failed to load WebView provider: No WebView installed")) {
                            com.meituan.mmp.lib.trace.b.d("HeraWebView", "isWebViewPackageException" + e2.getMessage());
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

    @Override // com.meituan.mmp.lib.page.view.b
    public final void setWidgetBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "161e7015416dde72680fd1e80e8df875", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "161e7015416dde72680fd1e80e8df875");
        } else {
            this.c.setBackgroundColor(i);
        }
    }
}
