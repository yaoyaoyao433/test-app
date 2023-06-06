package com.meituan.mmp.lib.page.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.SystemClock;
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
import com.meituan.mmp.lib.DebugHelper;
import com.meituan.mmp.lib.api.r;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.main.ab;
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
public final class d implements b {
    public static ChangeQuickRedirect a;
    com.meituan.mmp.lib.config.a b;
    com.meituan.mmp.lib.web.i c;
    int d;
    e e;
    private Boolean f;
    private WebView g;
    private r h;
    private Context i;
    private a j;
    private long k;
    private volatile boolean l;

    @Override // com.meituan.mmp.lib.page.view.b
    public final void f() {
    }

    public d(Context context, com.meituan.mmp.lib.config.a aVar, r rVar) throws Exception {
        Object[] objArr = {context, aVar, rVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69ad8e49fca0353b986bee3bdbe50fe3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69ad8e49fca0353b986bee3bdbe50fe3");
            return;
        }
        this.k = 0L;
        this.l = false;
        this.i = context;
        this.b = aVar;
        this.h = rVar;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a98764c27a6adb4f1cf7093936035c6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a98764c27a6adb4f1cf7093936035c6f");
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.g = new WebView(this.i) { // from class: com.meituan.mmp.lib.page.view.d.1
            public static ChangeQuickRedirect a;

            @Override // android.webkit.WebView, android.view.View
            public final void onScrollChanged(int i, int i2, int i3, int i4) {
                Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "52ea53803bda85b974cb73e3f96016f1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "52ea53803bda85b974cb73e3f96016f1");
                    return;
                }
                super.onScrollChanged(i, i2, i3, i4);
                if (d.this.c != null) {
                    d.this.c.a(i, i2, i3, i4);
                }
            }
        };
        this.k = SystemClock.elapsedRealtime() - elapsedRealtime;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a5493e5a4fb790b69fe837e8e0f194b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a5493e5a4fb790b69fe837e8e0f194b2");
        } else if (Build.VERSION.SDK_INT == 17 && this.f == null) {
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3dea4ab7464ba003ac0f40d295beeef3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3dea4ab7464ba003ac0f40d295beeef3")).booleanValue() : ((AccessibilityManager) this.i.getSystemService("accessibility")).isEnabled()) {
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
        if (Build.VERSION.SDK_INT > 14) {
            settings.setTextZoom(100);
        }
        settings.setAppCacheMaxSize(10485760L);
        settings.setAppCachePath(com.meituan.mmp.lib.utils.f.a(this.i, "webviewcache").getAbsolutePath());
        this.g.setWebChromeClient(new WebChromeClient() { // from class: com.meituan.mmp.lib.page.view.d.2
            public static ChangeQuickRedirect a;
            private final String c = "NormalWebView";

            @Override // android.webkit.WebChromeClient
            public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                Object[] objArr5 = {consoleMessage};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8353d0b054f1d05f9a5503548944d553", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8353d0b054f1d05f9a5503548944d553")).booleanValue();
                }
                if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
                    b.a.c("webview_log_NormalWebView [error] " + consoleMessage.message() + ", sourceId = " + consoleMessage.sourceId() + ", lineNumber = " + consoleMessage.lineNumber());
                } else {
                    consoleMessage.message();
                }
                return super.onConsoleMessage(consoleMessage);
            }

            @Override // android.webkit.WebChromeClient
            public final void onReceivedTitle(WebView webView, String str) {
                Object[] objArr5 = {webView, str};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d7a01d9e55cffd42fe14e4cdbcd0a356", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d7a01d9e55cffd42fe14e4cdbcd0a356");
                    return;
                }
                super.onReceivedTitle(webView, str);
                if (str.startsWith("mmp-page:")) {
                    webView.evaluateJavascript(String.format("document.title = '%s@page_%s@%s';", d.this.b.c(), Integer.valueOf(d.this.d), str), null);
                }
            }

            @Override // android.webkit.WebChromeClient
            public final void onShowCustomView(View view, final WebChromeClient.CustomViewCallback customViewCallback) {
                Object[] objArr5 = {view, customViewCallback};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f8f0dc44c6ea85f0bf7513f407e24dd3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f8f0dc44c6ea85f0bf7513f407e24dd3");
                    return;
                }
                super.onShowCustomView(view, customViewCallback);
                if (d.this.e != null) {
                    d.this.e.a(view, new l() { // from class: com.meituan.mmp.lib.page.view.d.2.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.mmp.lib.page.view.l
                        public final void a() {
                            Object[] objArr6 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "8dd972b24d0b6f7066a65790c7e59d0c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "8dd972b24d0b6f7066a65790c7e59d0c");
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
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "cd90f7d53005edac4e04b9e6f6de5e04", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "cd90f7d53005edac4e04b9e6f6de5e04");
                } else if (d.this.e != null) {
                    d.this.e.a();
                }
            }
        });
        this.j = new a(this.i, this.h);
        this.j.b = this.b;
        this.g.setWebViewClient(this.j);
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void setOnFullScreenListener(e eVar) {
        if (this.e == null) {
            this.e = eVar;
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a(String str, @Nullable ValueCallback<String> valueCallback) {
        String str2;
        int indexOf;
        int i = 0;
        Object[] objArr = {str, valueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e19bcd0cc69e911225491fb86689cd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e19bcd0cc69e911225491fb86689cd4");
            return;
        }
        if (DebugHelper.w && "unknown".equals(str)) {
            if (str.startsWith(TitansConstants.JAVASCRIPT_PREFIX) && (indexOf = str.indexOf(CommonConstant.Symbol.DOT)) >= 0) {
                i = indexOf;
            }
            int length = str.length();
            int i2 = i + 90;
            if (length > i2) {
                length = i2;
            }
            str2 = str.substring(i, length);
        } else {
            str2 = str;
        }
        ab.a("WebView.evalJs: " + str.length() + " char, " + str2, DebugHelper.w);
        this.g.evaluateJavascript(str, valueCallback);
        ab.a(DebugHelper.w);
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0032fc8584b9ce4117d92064b5e63188", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0032fc8584b9ce4117d92064b5e63188");
            return;
        }
        try {
            if (this.l) {
                com.meituan.mmp.lib.trace.b.b("HeraWebView", "NormalWebView is destroyed");
                return;
            }
            this.l = true;
            this.e = null;
            this.g.setWebChromeClient(null);
            this.g.removeJavascriptInterface("HeraJSCore");
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a828d6de7e9ccd1cb96fef3cf4319526", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a828d6de7e9ccd1cb96fef3cf4319526");
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
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a21f5e60c4ec90f316d57dfebb6daed9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a21f5e60c4ec90f316d57dfebb6daed9");
            } else if (this.f != null) {
                a(this.f.booleanValue());
            }
            this.g.destroy();
        } catch (Throwable unused) {
            com.meituan.mmp.lib.trace.b.d("HeraWebView", "destroy exception");
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbe880016f484409f953a9c59834b5df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbe880016f484409f953a9c59834b5df");
        } else {
            this.g.loadUrl(str);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a(String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7502fbd579a893c4302fb977cdadbc7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7502fbd579a893c4302fb977cdadbc7a");
        } else {
            this.g.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final String getUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a41363a83dbdf015b37eb716afdcfa7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a41363a83dbdf015b37eb716afdcfa7") : this.g.getUrl();
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6fb8b26843c1fd530224d07c96fa3bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6fb8b26843c1fd530224d07c96fa3bc");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bf979ff137d248b8654cfbafa20501b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bf979ff137d248b8654cfbafa20501b");
        } else {
            this.g.clearHistory();
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7da4f02e2dbdc6c372f651e60b834c09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7da4f02e2dbdc6c372f651e60b834c09");
        } else {
            this.g.requestLayout();
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c43254b52976e1f4e22858a7a93e7f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c43254b52976e1f4e22858a7a93e7f1");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6529aa9b9298acd12597ddb605061335", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6529aa9b9298acd12597ddb605061335") : this.g.getSettings().getUserAgentString();
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void setUserAgentString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc8911f0cec07093726c73b2d693facb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc8911f0cec07093726c73b2d693facb");
        } else {
            this.g.getSettings().setUserAgentString(str);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final int getWebPageHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff266bfe2e7518d48380fcae7f68d9c3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff266bfe2e7518d48380fcae7f68d9c3")).intValue() : (int) (this.g.getContentHeight() * this.g.getScale());
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final int getWebScrollY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56abb133edb89035acf6bff224bbc0e4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56abb133edb89035acf6bff224bbc0e4")).intValue() : this.g.getScrollY();
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void setOnPageFinishedListener(com.meituan.mmp.lib.web.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "353f610c929e560421221482a8fb55ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "353f610c929e560421221482a8fb55ce");
        } else {
            this.j.c = gVar;
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea85b14142ee35ad58415a38b3e6f136", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea85b14142ee35ad58415a38b3e6f136");
        } else {
            this.g.onResume();
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24b30e3095f23ccc5175fc06531b8217", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24b30e3095f23ccc5175fc06531b8217");
        } else {
            this.g.onPause();
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void setOnRenderProcessGoneListener(com.meituan.mmp.lib.web.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8d24737478ef552b0a80726e6555edc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8d24737478ef552b0a80726e6555edc");
        } else {
            this.j.d = hVar;
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void b(int i) {
        this.d = i;
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bc79fd6d11a546215135178c6b924eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bc79fd6d11a546215135178c6b924eb");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91f04bb6934c1e18cd557311268789e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91f04bb6934c1e18cd557311268789e6");
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
    public static class a extends WebViewClient {
        public static ChangeQuickRedirect a;
        private static File f;
        com.meituan.mmp.lib.config.a b;
        com.meituan.mmp.lib.web.g c;
        com.meituan.mmp.lib.web.h d;
        private r e;
        private Context g;
        private com.meituan.mmp.lib.resource.a h;

        public a(Context context, r rVar) {
            Object[] objArr = {context, rVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "934575e70333cc349a8a0efce17aaa57", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "934575e70333cc349a8a0efce17aaa57");
                return;
            }
            this.h = new com.meituan.mmp.lib.resource.a();
            this.g = context;
            this.e = rVar;
            if (f == null) {
                f = com.meituan.mmp.lib.utils.f.b(context, null);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Object[] objArr = {webView, str, bitmap};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5ccaf7dffdaf4b21f147d26d89ab668", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5ccaf7dffdaf4b21f147d26d89ab668");
            } else {
                super.onPageStarted(webView, str, bitmap);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Object[] objArr = {webView, renderProcessGoneDetail};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bae2e09cc01702fdb1097efb8cae9b8", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bae2e09cc01702fdb1097efb8cae9b8")).booleanValue();
            }
            r rVar = this.e;
            rVar.a(webView, renderProcessGoneDetail, "NormalWebView " + webView.getUrl(), this.d);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            Object[] objArr = {webView, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98293cb02d7abafa35e3b35369a7d1bc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98293cb02d7abafa35e3b35369a7d1bc");
                return;
            }
            super.onPageFinished(webView, str);
            if (this.c != null) {
                this.c.e(str);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(21)
        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            Object[] objArr = {webView, webResourceRequest};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d39dfd81d8558d2338b4e6f07e9cf845", RobustBitConfig.DEFAULT_VALUE)) {
                return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d39dfd81d8558d2338b4e6f07e9cf845");
            }
            String uri = webResourceRequest.getUrl().toString();
            com.meituan.mmp.lib.trace.b.b("shouldInterceptRequest", String.format("url=%s", uri));
            WebResourceResponse webResourceResponse = (WebResourceResponse) m.a(webView.getContext(), this.b, uri, this.h);
            return webResourceResponse != null ? webResourceResponse : super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            Object[] objArr = {webView, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b68fad500fa53e24087859ad162be9e9", RobustBitConfig.DEFAULT_VALUE)) {
                return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b68fad500fa53e24087859ad162be9e9");
            }
            com.meituan.mmp.lib.trace.b.b("InterceptRequest", String.format("url=%s", str));
            WebResourceResponse webResourceResponse = (WebResourceResponse) m.a(webView.getContext(), this.b, str, this.h);
            return webResourceResponse != null ? webResourceResponse : super.shouldInterceptRequest(webView, str);
        }
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a361ddb8f2fc08eb40cd46d36d260562", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a361ddb8f2fc08eb40cd46d36d260562");
        }
        return "NormalWebView{@" + Integer.toHexString(hashCode()) + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final long getWebViewInitializationDuration() {
        return this.k;
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void setWidgetBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e3f331f29cc548ebafb2c66277664f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e3f331f29cc548ebafb2c66277664f8");
        } else {
            this.g.setBackgroundColor(i);
        }
    }
}
