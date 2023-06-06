package com.meituan.mmp.lib.page.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.webkit.ValueCallback;
import com.meituan.mmp.lib.DebugHelper;
import com.meituan.mmp.lib.api.r;
import com.meituan.mmp.lib.api.report.MetricsModule;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.lib.utils.v;
import com.meituan.mmp.main.ab;
import com.meituan.mtwebkit.MTConsoleMessage;
import com.meituan.mtwebkit.MTRenderProcessGoneDetail;
import com.meituan.mtwebkit.MTValueCallback;
import com.meituan.mtwebkit.MTWebChromeClient;
import com.meituan.mtwebkit.MTWebResourceRequest;
import com.meituan.mtwebkit.MTWebResourceResponse;
import com.meituan.mtwebkit.MTWebSettings;
import com.meituan.mtwebkit.MTWebView;
import com.meituan.mtwebkit.MTWebViewClient;
import com.meituan.mtwebkit.internal.hyper.SameLayerManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.bean.TitansConstants;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c implements b {
    public static ChangeQuickRedirect a;
    public static String f;
    @NonNull
    com.meituan.mmp.lib.config.a b;
    com.meituan.mmp.lib.web.i c;
    int d;
    e e;
    private Boolean g;
    private MTWebView h;
    private r i;
    private Context j;
    private a k;
    private volatile boolean l;
    private boolean m;
    private long n;

    @Override // com.meituan.mmp.lib.page.view.b
    public final void f() {
    }

    public c(Context context, @NonNull com.meituan.mmp.lib.config.a aVar, r rVar) throws Exception {
        Object[] objArr = {context, aVar, rVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64ea1650020c5e171337985c4052cbdc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64ea1650020c5e171337985c4052cbdc");
            return;
        }
        this.l = false;
        this.m = false;
        this.n = 0L;
        this.j = context;
        this.b = aVar;
        this.i = rVar;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e23605a0260b5542d24e3032f1698f0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e23605a0260b5542d24e3032f1698f0f");
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.h = new MTWebView(this.b.m(), this.j) { // from class: com.meituan.mmp.lib.page.view.c.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mtwebkit.MTWebView, android.view.View
            public final void onScrollChanged(int i, int i2, int i3, int i4) {
                Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7651f7082697012911e70f97aa89b4ac", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7651f7082697012911e70f97aa89b4ac");
                    return;
                }
                super.onScrollChanged(i, i2, i3, i4);
                if (c.this.c != null) {
                    c.this.c.a(i, i2, i3, i4);
                }
            }
        };
        this.n = SystemClock.elapsedRealtime() - elapsedRealtime;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "740a1076c24649244938afec6ab303c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "740a1076c24649244938afec6ab303c8");
        } else if (Build.VERSION.SDK_INT == 17 && this.g == null) {
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f8b43224987215f4d3208c87624e0685", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f8b43224987215f4d3208c87624e0685")).booleanValue() : ((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
                this.g = Boolean.TRUE;
                a(false);
            }
        }
        g();
        MTWebSettings settings = this.h.getSettings();
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
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setHorizontalScrollBarEnabled(false);
        if (Build.VERSION.SDK_INT > 14) {
            settings.setTextZoom(100);
        }
        settings.setAppCacheMaxSize(10485760L);
        settings.setAppCachePath(com.meituan.mmp.lib.utils.f.a(this.j, "webviewcache").getAbsolutePath());
        this.h.setWebChromeClient(new MTWebChromeClient() { // from class: com.meituan.mmp.lib.page.view.c.2
            public static ChangeQuickRedirect a;
            private String c = "MTWebViewImp";

            @Override // com.meituan.mtwebkit.MTWebChromeClient
            public final boolean onConsoleMessage(MTConsoleMessage mTConsoleMessage) {
                Object[] objArr5 = {mTConsoleMessage};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "35d48a639a5c72113bcaa400b710a70d", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "35d48a639a5c72113bcaa400b710a70d")).booleanValue();
                }
                if (mTConsoleMessage.messageLevel() == MTConsoleMessage.MessageLevel.ERROR) {
                    b.a.c("webview_log_" + this.c + " [error] " + mTConsoleMessage.message() + ", sourceId = " + mTConsoleMessage.sourceId() + ", lineNumber = " + mTConsoleMessage.lineNumber());
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.c);
                    sb.append("_log");
                    mTConsoleMessage.message();
                }
                return super.onConsoleMessage(mTConsoleMessage);
            }

            @Override // com.meituan.mtwebkit.MTWebChromeClient
            public final void onReceivedTitle(MTWebView mTWebView, String str) {
                Object[] objArr5 = {mTWebView, str};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "6d5b149c2fc8dac500e4ddd76afbd06b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "6d5b149c2fc8dac500e4ddd76afbd06b");
                    return;
                }
                super.onReceivedTitle(mTWebView, str);
                if (str.startsWith("mmp-page:")) {
                    mTWebView.evaluateJavascript(String.format("document.title = '%s@page_%s@%s';", c.this.b.c(), Integer.valueOf(c.this.d), str), null);
                }
            }

            @Override // com.meituan.mtwebkit.MTWebChromeClient
            public final void onShowCustomView(View view, final MTWebChromeClient.CustomViewCallback customViewCallback) {
                Object[] objArr5 = {view, customViewCallback};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "07bdc31e4068fbbc45d4c832f4ce7c24", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "07bdc31e4068fbbc45d4c832f4ce7c24");
                    return;
                }
                super.onShowCustomView(view, customViewCallback);
                if (c.this.e != null) {
                    c.this.e.a(view, new l() { // from class: com.meituan.mmp.lib.page.view.c.2.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.mmp.lib.page.view.l
                        public final void a() {
                            Object[] objArr6 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "80a3b8917624bc3bdbed3e8cc2d27dfc", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "80a3b8917624bc3bdbed3e8cc2d27dfc");
                            } else {
                                customViewCallback.onCustomViewHidden();
                            }
                        }
                    });
                }
            }

            @Override // com.meituan.mtwebkit.MTWebChromeClient
            public final void onHideCustomView() {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "3203f163b7493f56027dfcaca8eae010", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "3203f163b7493f56027dfcaca8eae010");
                } else if (c.this.e != null) {
                    c.this.e.a();
                }
            }
        });
        this.k = new a(this.j, this.i);
        this.k.b = this.b;
        this.h.setWebViewClient(this.k);
        this.m = com.meituan.mmp.lib.embeddedwidget.b.a(this.h);
        if (this.m) {
            com.meituan.mmp.lib.trace.b.a("MTWebView supportEmbed", Boolean.TRUE);
            MTWebView mTWebView = this.h;
            Object[] objArr5 = {mTWebView};
            ChangeQuickRedirect changeQuickRedirect5 = com.meituan.mmp.lib.embeddedwidget.b.a;
            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "ef8ac4a0d47d622c9b355b65359a1fd7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "ef8ac4a0d47d622c9b355b65359a1fd7");
                return;
            } else {
                SameLayerManager.bindProvider(mTWebView, new com.meituan.mmp.lib.embeddedwidget.a());
                return;
            }
        }
        com.meituan.mmp.lib.trace.b.a("MTWebView supportEmbed", Boolean.FALSE);
        PackageInfo e = com.meituan.mtwebkit.internal.l.e();
        MetricsModule.a("mmp.embed.webview.not.supported", v.a("mtWebViewStatus", Integer.valueOf(com.meituan.mtwebkit.internal.l.c()), "mtWebViewVersionCode", e != null ? Integer.valueOf(e.versionCode) : ""));
    }

    static void a(MTWebView mTWebView) {
        Object[] objArr = {mTWebView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ef280af733305b9ba422aebb2811156", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ef280af733305b9ba422aebb2811156");
        } else if (com.meituan.mmp.lib.embeddedwidget.b.a(mTWebView)) {
            if (f == null) {
                f = String.format("if (typeof __mpInfo === 'undefined') {var __mpInfo = {};} __mpInfo.embeddedWidgets = %s;", com.meituan.mmp.lib.utils.d.a(com.meituan.mmp.lib.embeddedwidget.a.b));
            }
            com.meituan.mmp.lib.trace.b.b("injectEmbedSupport", f);
            mTWebView.evaluateJavascript(f, null);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a(String str, @Nullable final ValueCallback<String> valueCallback) {
        String str2;
        int indexOf;
        int i = 0;
        Object[] objArr = {str, valueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdaaee901eddcd588542c73fdecdf826", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdaaee901eddcd588542c73fdecdf826");
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
        this.h.evaluateJavascript(str, new MTValueCallback<String>() { // from class: com.meituan.mmp.lib.page.view.c.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mtwebkit.MTValueCallback
            public final /* synthetic */ void onReceiveValue(String str3) {
                String str4 = str3;
                Object[] objArr2 = {str4};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e5434d8e4ecc171306b02c4da7ab785c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e5434d8e4ecc171306b02c4da7ab785c");
                } else if (valueCallback != null) {
                    valueCallback.onReceiveValue(str4);
                }
            }
        });
        ab.a(DebugHelper.w);
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daa41dab5651cc7a7335524f2191a8db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daa41dab5651cc7a7335524f2191a8db");
            return;
        }
        try {
            if (this.l) {
                com.meituan.mmp.lib.trace.b.b("MTWebView", "MTWebViewImp is destroyed");
                return;
            }
            this.l = true;
            this.e = null;
            this.h.setWebChromeClient(null);
            this.h.removeJavascriptInterface("HeraJSCore");
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e63ac8dc70115d7124d122db28191fc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e63ac8dc70115d7124d122db28191fc");
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
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3738d0432368b10752fb562c99436e6f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3738d0432368b10752fb562c99436e6f");
            } else if (this.g != null) {
                a(this.g.booleanValue());
            }
            this.h.destroy();
        } catch (Throwable unused) {
            com.meituan.mmp.lib.trace.b.d("MTWebView", "destroy exception");
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76b5e8fab030d71c68e843518b62f00a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76b5e8fab030d71c68e843518b62f00a");
            return;
        }
        this.h.loadUrl(str);
        if (DebugHelper.b()) {
            h();
        }
        a(this.h);
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a(String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dbb614577278b4b555d3e591feb8f93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dbb614577278b4b555d3e591feb8f93");
            return;
        }
        this.h.loadDataWithBaseURL(str, str2, str3, str4, str5);
        if (DebugHelper.b()) {
            h();
        }
        a(this.h);
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final String getUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "063034b889c18e4f2023bcb69cab7d7a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "063034b889c18e4f2023bcb69cab7d7a") : this.h.getUrl();
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "761b01e1b58de477c35bee5e09e0fc7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "761b01e1b58de477c35bee5e09e0fc7f");
        } else {
            this.h.addJavascriptInterface(obj, str);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final View getWebView() {
        return this.h;
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d17ed32c3c6ba9fffb99a96d3b0af45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d17ed32c3c6ba9fffb99a96d3b0af45");
        } else {
            this.h.clearHistory();
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90bbb1d0d33dcc89817ff1b84514b518", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90bbb1d0d33dcc89817ff1b84514b518");
        } else {
            this.h.requestLayout();
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2faae7e753faba172c4680ac0fb90471", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2faae7e753faba172c4680ac0fb90471");
        } else {
            this.h.scrollBy(0, i);
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59df8d018f237164282fa43f2bb61792", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59df8d018f237164282fa43f2bb61792") : this.h.getSettings().getUserAgentString();
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void setUserAgentString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a98d45a641a44388c1f7145f73ebe8da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a98d45a641a44388c1f7145f73ebe8da");
        } else {
            this.h.getSettings().setUserAgentString(str);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final int getWebPageHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57921f387f5745d97a26eb0991f72317", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57921f387f5745d97a26eb0991f72317")).intValue() : (int) (this.h.getContentHeight() * this.h.getScale());
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final int getWebScrollY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed630e534117d448eac84d392b1a20d9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed630e534117d448eac84d392b1a20d9")).intValue() : this.h.getScrollY();
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void setOnPageFinishedListener(com.meituan.mmp.lib.web.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1476c7dd9cded2e91052c5b79caaef9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1476c7dd9cded2e91052c5b79caaef9");
        } else {
            this.k.c = gVar;
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5ef2210b54d64423cc4e09c0f128fe5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5ef2210b54d64423cc4e09c0f128fe5");
        } else {
            this.h.onResume();
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "181dd62d595a4b97140a7e6383a34789", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "181dd62d595a4b97140a7e6383a34789");
        } else {
            this.h.onPause();
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void b(int i) {
        this.d = i;
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99c3007b9ba3b2dc9f3c866d8afdb4e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99c3007b9ba3b2dc9f3c866d8afdb4e7");
            return;
        }
        try {
            Method method = this.h.getClass().getMethod("removeJavascriptInterface", String.class);
            if (method != null) {
                method.invoke(this.h, "searchBoxJavaBridge_");
                method.invoke(this.h, "accessibility");
                method.invoke(this.h, "accessibilityTraversal");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f778c9ef61e7737d959b182fa99e82f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f778c9ef61e7737d959b182fa99e82f4");
            return;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.j.getSystemService("accessibility");
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
    public static class a extends MTWebViewClient {
        public static ChangeQuickRedirect a;
        private static File f;
        com.meituan.mmp.lib.config.a b;
        com.meituan.mmp.lib.web.g c;
        com.meituan.mmp.lib.web.h d;
        private r e;
        private Context g;
        private com.meituan.mmp.lib.resource.c h;

        public a(Context context, r rVar) {
            Object[] objArr = {context, rVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb5585d3e215dd63cf444a6411e005e6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb5585d3e215dd63cf444a6411e005e6");
                return;
            }
            this.h = new com.meituan.mmp.lib.resource.c();
            this.g = context;
            this.e = rVar;
            if (f == null) {
                f = com.meituan.mmp.lib.utils.f.b(context, null);
            }
        }

        @Override // com.meituan.mtwebkit.MTWebViewClient
        public final void onPageStarted(MTWebView mTWebView, String str, Bitmap bitmap) {
            Object[] objArr = {mTWebView, str, bitmap};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c0822774e727f7a5c9f5caee40da00f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c0822774e727f7a5c9f5caee40da00f");
            } else {
                super.onPageStarted(mTWebView, str, bitmap);
            }
        }

        @Override // com.meituan.mtwebkit.MTWebViewClient
        @TargetApi(26)
        public final boolean onRenderProcessGone(MTWebView mTWebView, MTRenderProcessGoneDetail mTRenderProcessGoneDetail) {
            Object[] objArr = {mTWebView, mTRenderProcessGoneDetail};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43eed3964032965825de8e69338900d0", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43eed3964032965825de8e69338900d0")).booleanValue();
            }
            this.e.a(mTWebView, mTRenderProcessGoneDetail.didCrash(), mTRenderProcessGoneDetail.rendererPriorityAtExit(), mTWebView.getUrl(), this.d);
            return true;
        }

        @Override // com.meituan.mtwebkit.MTWebViewClient
        public final void onPageFinished(MTWebView mTWebView, String str) {
            Object[] objArr = {mTWebView, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0fb045a758002152535fce89d5edc08", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0fb045a758002152535fce89d5edc08");
                return;
            }
            super.onPageFinished(mTWebView, str);
            c.a(mTWebView);
            if (this.c != null) {
                this.c.e(str);
            }
        }

        @Override // com.meituan.mtwebkit.MTWebViewClient
        @TargetApi(21)
        public final MTWebResourceResponse shouldInterceptRequest(MTWebView mTWebView, MTWebResourceRequest mTWebResourceRequest) {
            Object[] objArr = {mTWebView, mTWebResourceRequest};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba5b9de7158e5614485524dca08bc931", RobustBitConfig.DEFAULT_VALUE)) {
                return (MTWebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba5b9de7158e5614485524dca08bc931");
            }
            MTWebResourceResponse mTWebResourceResponse = (MTWebResourceResponse) m.a(mTWebView.getContext(), this.b, mTWebResourceRequest.getUrl().toString(), this.h);
            return mTWebResourceResponse != null ? mTWebResourceResponse : super.shouldInterceptRequest(mTWebView, mTWebResourceRequest);
        }

        @Override // com.meituan.mtwebkit.MTWebViewClient
        public final MTWebResourceResponse shouldInterceptRequest(MTWebView mTWebView, String str) {
            Object[] objArr = {mTWebView, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db012655569e42c228ddf5b7c796f7fa", RobustBitConfig.DEFAULT_VALUE)) {
                return (MTWebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db012655569e42c228ddf5b7c796f7fa");
            }
            MTWebResourceResponse mTWebResourceResponse = (MTWebResourceResponse) m.a(mTWebView.getContext(), this.b, str, this.h);
            return mTWebResourceResponse != null ? mTWebResourceResponse : super.shouldInterceptRequest(mTWebView, str);
        }
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "492a2c354857bb9025b3601d4d6a1488", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "492a2c354857bb9025b3601d4d6a1488");
        } else {
            this.k.d = hVar;
        }
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5847c99d402ab543ae9d95e564a12c9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5847c99d402ab543ae9d95e564a12c9d");
            return;
        }
        try {
            com.meituan.mmp.lib.devtools.c cVar = (com.meituan.mmp.lib.devtools.c) Class.forName("com.meituan.mmp.dev.devtools.ui.DebugView").getDeclaredConstructor(Context.class).newInstance(this.j);
            if (cVar != null) {
                MTWebView mTWebView = this.h;
                mTWebView.addView(cVar.a("MTWebView " + com.meituan.mtwebkit.internal.l.c() + StringUtil.SPACE + this.m));
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final long getWebViewInitializationDuration() {
        return this.n;
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void setWidgetBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e00df31e62d5a9c48961378123ffa786", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e00df31e62d5a9c48961378123ffa786");
        } else {
            this.h.setBackgroundColor(i);
        }
    }
}
