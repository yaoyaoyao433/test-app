package com.meituan.msc.modules.page.render.webview.impl;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.annotation.Nullable;
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
import com.meituan.msc.modules.devtools.DebugHelper;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.page.render.webview.f;
import com.meituan.msc.modules.page.render.webview.i;
import com.meituan.msc.modules.page.render.webview.j;
import com.meituan.msc.modules.page.render.webview.m;
import com.meituan.msc.modules.page.render.webview.p;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.bean.TitansConstants;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
@TargetApi(19)
/* loaded from: classes3.dex */
public final class c implements com.meituan.msc.modules.page.render.webview.c {
    public static ChangeQuickRedirect a;
    h b;
    f c;
    int d;
    j e;
    private Boolean f;
    private WebView g;
    private Context h;
    private a i;
    private volatile boolean j;

    public c(Context context, h hVar) throws Exception {
        Object[] objArr = {context, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63e2a2d607ad3bddb61ea9c8feeca233", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63e2a2d607ad3bddb61ea9c8feeca233");
            return;
        }
        this.j = false;
        this.h = context;
        this.b = hVar;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fa279e5334ae711247f34f1e5722beb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fa279e5334ae711247f34f1e5722beb0");
            return;
        }
        this.g = new WebView(this.h) { // from class: com.meituan.msc.modules.page.render.webview.impl.c.1
            public static ChangeQuickRedirect a;

            @Override // android.webkit.WebView, android.view.View
            public final void onScrollChanged(int i, int i2, int i3, int i4) {
                Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ccb44085b7c6fef814d1030e3dd8415d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ccb44085b7c6fef814d1030e3dd8415d");
                    return;
                }
                super.onScrollChanged(i, i2, i3, i4);
                if (c.this.c != null) {
                    c.this.c.a(i, i2, i3, i4);
                }
            }
        };
        this.g.setOverScrollMode(2);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6302a3eca42a92da85ae8cd71988f0f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6302a3eca42a92da85ae8cd71988f0f4");
        } else if (Build.VERSION.SDK_INT == 17 && this.f == null) {
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "faab552f8be02e318dc89307b04f5290", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "faab552f8be02e318dc89307b04f5290")).booleanValue() : ((AccessibilityManager) this.h.getSystemService("accessibility")).isEnabled()) {
                this.f = Boolean.TRUE;
                a(false);
            }
        }
        b();
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
        try {
            settings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Exception unused) {
        }
        this.g.setVerticalScrollBarEnabled(false);
        this.g.setHorizontalScrollBarEnabled(false);
        if (Build.VERSION.SDK_INT > 14) {
            settings.setTextZoom(100);
        }
        settings.setAppCacheMaxSize(10485760L);
        settings.setAppCachePath(com.meituan.msc.common.utils.e.a(this.h, "webviewcache").getAbsolutePath());
        this.g.setWebChromeClient(new WebChromeClient() { // from class: com.meituan.msc.modules.page.render.webview.impl.c.2
            public static ChangeQuickRedirect a;
            private final String c = "NormalWebView";

            @Override // android.webkit.WebChromeClient
            public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                Object[] objArr5 = {consoleMessage};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "2d45809db503b78e192f113958e013ae", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "2d45809db503b78e192f113958e013ae")).booleanValue();
                }
                if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
                    g.d("webview_log_NormalWebView [error] " + consoleMessage.message() + ", sourceId = " + consoleMessage.sourceId() + ", lineNumber = " + consoleMessage.lineNumber());
                } else {
                    consoleMessage.message();
                }
                return super.onConsoleMessage(consoleMessage);
            }

            @Override // android.webkit.WebChromeClient
            public final void onReceivedTitle(WebView webView, String str) {
                Object[] objArr5 = {webView, str};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "1e5cd93d621d7329a5ca11ebba910b95", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "1e5cd93d621d7329a5ca11ebba910b95");
                    return;
                }
                super.onReceivedTitle(webView, str);
                if (str.startsWith("msc-page:")) {
                    webView.evaluateJavascript(String.format("document.title = '%s@page_%s@%s';", c.this.b.r.j(), Integer.valueOf(c.this.d), str), null);
                }
            }

            @Override // android.webkit.WebChromeClient
            public final void onShowCustomView(View view, final WebChromeClient.CustomViewCallback customViewCallback) {
                Object[] objArr5 = {view, customViewCallback};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ce01d399ed77b77563a00e0bd58beb40", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ce01d399ed77b77563a00e0bd58beb40");
                    return;
                }
                super.onShowCustomView(view, customViewCallback);
                if (c.this.e != null) {
                    c.this.e.a(view, new m() { // from class: com.meituan.msc.modules.page.render.webview.impl.c.2.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.msc.modules.page.render.webview.m
                        public final void a() {
                            Object[] objArr6 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "5ede3acf4eb7bced68d0267fcf4070ea", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "5ede3acf4eb7bced68d0267fcf4070ea");
                            } else {
                                customViewCallback.onCustomViewHidden();
                            }
                        }
                    });
                }
            }

            @Override // android.webkit.WebChromeClient
            public final void onHideCustomView() {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "c183c89c61a572c0c9761fe30dcc2a6d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "c183c89c61a572c0c9761fe30dcc2a6d");
                } else if (c.this.e != null) {
                    c.this.e.a();
                }
            }
        });
        this.i = new a(this.h);
        this.g.setWebViewClient(this.i);
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void setOnFullScreenListener(j jVar) {
        if (this.e == null) {
            this.e = jVar;
        }
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void a(String str, @Nullable ValueCallback<String> valueCallback) {
        int indexOf;
        int i = 0;
        Object[] objArr = {str, valueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "729278d1909fefa8088c7d128a37e7ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "729278d1909fefa8088c7d128a37e7ad");
            return;
        }
        if (DebugHelper.n && "unknown".equals(str)) {
            if (str.startsWith(TitansConstants.JAVASCRIPT_PREFIX) && (indexOf = str.indexOf(CommonConstant.Symbol.DOT)) >= 0) {
                i = indexOf;
            }
            int length = str.length();
            int i2 = i + 90;
            if (length > i2) {
                length = i2;
            }
            str.substring(i, length);
        }
        this.g.evaluateJavascript(str, valueCallback);
    }

    @Override // com.meituan.msc.modules.page.render.g
    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5cf0f23b1db1a8c371646b3d10364e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5cf0f23b1db1a8c371646b3d10364e9");
            return;
        }
        try {
            if (this.j) {
                g.b("HeraWebView", "NormalWebView is destroyed");
                return;
            }
            this.j = true;
            this.e = null;
            this.g.setWebChromeClient(null);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2a05076e1dba0d3de7b0930ba71e921a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2a05076e1dba0d3de7b0930ba71e921a");
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
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a5c5e58f1b0784f54376275bd67a86cf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a5c5e58f1b0784f54376275bd67a86cf");
            } else if (this.f != null) {
                a(this.f.booleanValue());
            }
            this.g.destroy();
        } catch (Throwable unused) {
            g.a("HeraWebView", "destroy exception");
        }
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void a(String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a34f86a451b41a575f22d4a39cb5fbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a34f86a451b41a575f22d4a39cb5fbf");
        } else {
            this.g.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final String getUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24deeb2bd78ecaa045bf4301dd454931", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24deeb2bd78ecaa045bf4301dd454931") : this.g.getUrl();
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void a(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "372866ca0019141fcba2c8b482242033", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "372866ca0019141fcba2c8b482242033");
        } else {
            this.g.addJavascriptInterface(obj, str);
        }
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final View getWebView() {
        return this.g;
    }

    @Override // com.meituan.msc.modules.page.render.e
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "603fc60c49a8d45baa98c20ee4479f7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "603fc60c49a8d45baa98c20ee4479f7a");
        } else {
            this.g.requestLayout();
        }
    }

    @Override // com.meituan.msc.modules.page.render.e
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4bad3e3ca4fe442673ee7583e05a671", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4bad3e3ca4fe442673ee7583e05a671");
        } else {
            this.g.scrollBy(0, i);
        }
    }

    @Override // com.meituan.msc.modules.page.render.e
    public final void setOnContentScrollChangeListener(f fVar) {
        this.c = fVar;
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final String getUserAgentString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76f2371fc2f963b5d54d82012d684ac7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76f2371fc2f963b5d54d82012d684ac7") : this.g.getSettings().getUserAgentString();
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void setUserAgentString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cc343ee85aceb0bff13a029b1d37011", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cc343ee85aceb0bff13a029b1d37011");
        } else {
            this.g.getSettings().setUserAgentString(str);
        }
    }

    @Override // com.meituan.msc.modules.page.render.e
    public final int getContentHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "620f599e96553dbe503590e9f5cbfcb2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "620f599e96553dbe503590e9f5cbfcb2")).intValue() : (int) (this.g.getContentHeight() * this.g.getScale());
    }

    @Override // com.meituan.msc.modules.page.render.e
    public final int getContentScrollY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4d6d1145d2f1e706edfc7f6ddbfc305", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4d6d1145d2f1e706edfc7f6ddbfc305")).intValue() : this.g.getScrollY();
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void setOnPageFinishedListener(com.meituan.msc.modules.page.render.webview.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87dc00e9be0a2db929d292a2f8ca4bc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87dc00e9be0a2db929d292a2f8ca4bc3");
        } else {
            this.i.b = hVar;
        }
    }

    @Override // com.meituan.msc.modules.page.render.g
    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaa4e3aa820e2f6bda02ece068b7986f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaa4e3aa820e2f6bda02ece068b7986f");
        } else {
            this.g.onResume();
        }
    }

    @Override // com.meituan.msc.modules.page.render.g
    public final void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd7766e082e1ac9de118a132925305f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd7766e082e1ac9de118a132925305f2");
        } else {
            this.g.onPause();
        }
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void setOnRenderProcessGoneListener(i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af70542709fc56199ebd89b7f70e6949", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af70542709fc56199ebd89b7f70e6949");
        } else {
            this.i.c = iVar;
        }
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void b(int i) {
        this.d = i;
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05c572c3890c338a7b89719793dc55ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05c572c3890c338a7b89719793dc55ea");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66ea467010ab04d8ac76a9ca93c41177", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66ea467010ab04d8ac76a9ca93c41177");
            return;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.h.getSystemService("accessibility");
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
    class a extends WebViewClient {
        public static ChangeQuickRedirect a;
        com.meituan.msc.modules.page.render.webview.h b;
        i c;
        private File e;
        private Context f;
        private com.meituan.msc.common.resource.a g;

        public a(Context context) {
            Object[] objArr = {c.this, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aeb3a2f5a18cf2f3c2877d23214fe395", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aeb3a2f5a18cf2f3c2877d23214fe395");
                return;
            }
            this.g = new com.meituan.msc.common.resource.a();
            this.f = context;
            if (this.e == null) {
                this.e = com.meituan.msc.common.utils.e.b(context, null);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Object[] objArr = {webView, str, bitmap};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fb5de7b225be63d6d53fdd6591d3127", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fb5de7b225be63d6d53fdd6591d3127");
            } else {
                super.onPageStarted(webView, str, bitmap);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Object[] objArr = {webView, renderProcessGoneDetail};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b848e1edfe684c549e94702d05a9d26", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b848e1edfe684c549e94702d05a9d26")).booleanValue();
            }
            com.meituan.msc.modules.api.g.a(webView, renderProcessGoneDetail, "NormalWebView " + webView.getUrl(), c.this.b, this.c);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            Object[] objArr = {webView, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08a47e87ae213248ed604de69c5a0c28", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08a47e87ae213248ed604de69c5a0c28");
                return;
            }
            super.onPageFinished(webView, str);
            if (this.b != null) {
                this.b.d(str);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(21)
        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            Object[] objArr = {webView, webResourceRequest};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "501a4ec708113a86350c63f67477c3a1", RobustBitConfig.DEFAULT_VALUE)) {
                return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "501a4ec708113a86350c63f67477c3a1");
            }
            WebResourceResponse webResourceResponse = (WebResourceResponse) p.a(webView.getContext(), c.this.b.d(), webResourceRequest.getUrl().toString(), this.g);
            return webResourceResponse != null ? webResourceResponse : super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            Object[] objArr = {webView, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce210745a5233133dbb7951ce46d6931", RobustBitConfig.DEFAULT_VALUE)) {
                return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce210745a5233133dbb7951ce46d6931");
            }
            WebResourceResponse webResourceResponse = (WebResourceResponse) p.a(webView.getContext(), c.this.b.d(), str, this.g);
            return webResourceResponse != null ? webResourceResponse : super.shouldInterceptRequest(webView, str);
        }
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "982bc01e8b90506d524935bb7d55524d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "982bc01e8b90506d524935bb7d55524d");
        }
        return "NormalWebView{@" + Integer.toHexString(hashCode()) + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
    }
}
