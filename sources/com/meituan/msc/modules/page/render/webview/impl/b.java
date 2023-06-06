package com.meituan.msc.modules.page.render.webview.impl;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.webkit.ValueCallback;
import com.meituan.msc.modules.devtools.DebugHelper;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.page.render.webview.f;
import com.meituan.msc.modules.page.render.webview.i;
import com.meituan.msc.modules.page.render.webview.j;
import com.meituan.msc.modules.page.render.webview.m;
import com.meituan.msc.modules.page.render.webview.p;
import com.meituan.msc.modules.reporter.g;
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
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.bean.TitansConstants;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements com.meituan.msc.modules.page.render.webview.c {
    public static ChangeQuickRedirect a;
    public static String f;
    f b;
    int c;
    j d;
    h e;
    private Boolean g;
    private MTWebView h;
    private Context i;
    private a j;
    private volatile boolean k;
    private boolean l;

    public b(Context context, @NonNull h hVar) throws Exception {
        Object[] objArr = {context, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "484ea9656ce7f9b80ad02e3934a0cb8f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "484ea9656ce7f9b80ad02e3934a0cb8f");
            return;
        }
        this.k = false;
        this.l = false;
        this.i = context;
        this.e = hVar;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a460191eebe2bf68a7fa287a07d25869", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a460191eebe2bf68a7fa287a07d25869");
            return;
        }
        this.h = new MTWebView(this.e.r.A(), this.i) { // from class: com.meituan.msc.modules.page.render.webview.impl.b.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mtwebkit.MTWebView, android.view.View
            public final void onScrollChanged(int i, int i2, int i3, int i4) {
                Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "be187a90c0642c9a2362d1f6a056ef3d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "be187a90c0642c9a2362d1f6a056ef3d");
                    return;
                }
                super.onScrollChanged(i, i2, i3, i4);
                if (b.this.b != null) {
                    b.this.b.a(i, i2, i3, i4);
                }
            }
        };
        this.h.setOverScrollMode(2);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9a7cbe2da7c93d5ab43aa12cd5bfbe41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9a7cbe2da7c93d5ab43aa12cd5bfbe41");
        } else if (Build.VERSION.SDK_INT == 17 && this.g == null) {
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "02ebeeffbf1d9445bef0b8ed9909b3b6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "02ebeeffbf1d9445bef0b8ed9909b3b6")).booleanValue() : ((AccessibilityManager) this.i.getSystemService("accessibility")).isEnabled()) {
                this.g = Boolean.TRUE;
                a(false);
            }
        }
        b();
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
        settings.setAppCachePath(com.meituan.msc.common.utils.e.a(this.i, "webviewcache").getAbsolutePath());
        this.h.setWebChromeClient(new MTWebChromeClient() { // from class: com.meituan.msc.modules.page.render.webview.impl.b.2
            public static ChangeQuickRedirect a;
            private String c = "MTWebViewImp";

            @Override // com.meituan.mtwebkit.MTWebChromeClient
            public final boolean onConsoleMessage(MTConsoleMessage mTConsoleMessage) {
                Object[] objArr5 = {mTConsoleMessage};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "40adcb3cd15dd3bf833b79da2873fbab", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "40adcb3cd15dd3bf833b79da2873fbab")).booleanValue();
                }
                if (mTConsoleMessage.messageLevel() == MTConsoleMessage.MessageLevel.ERROR) {
                    g.d("webview_log_" + this.c + " [error] " + mTConsoleMessage.message() + ", sourceId = " + mTConsoleMessage.sourceId() + ", lineNumber = " + mTConsoleMessage.lineNumber());
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
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "07a49db7c66b64789169653d4ed6fa8e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "07a49db7c66b64789169653d4ed6fa8e");
                    return;
                }
                super.onReceivedTitle(mTWebView, str);
                if (str.startsWith("msc-page:")) {
                    mTWebView.evaluateJavascript(String.format("document.title = '%s@page_%s@%s';", b.this.e.r.j(), Integer.valueOf(b.this.c), str), null);
                }
            }

            @Override // com.meituan.mtwebkit.MTWebChromeClient
            public final void onShowCustomView(View view, final MTWebChromeClient.CustomViewCallback customViewCallback) {
                Object[] objArr5 = {view, customViewCallback};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "107fad868f7ba72baab915c642262dd3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "107fad868f7ba72baab915c642262dd3");
                    return;
                }
                super.onShowCustomView(view, customViewCallback);
                if (b.this.d != null) {
                    b.this.d.a(view, new m() { // from class: com.meituan.msc.modules.page.render.webview.impl.b.2.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.msc.modules.page.render.webview.m
                        public final void a() {
                            Object[] objArr6 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "4514028be80705bcd4249d4181e1062e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "4514028be80705bcd4249d4181e1062e");
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
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ea28790af21bd37bd9e5274b95e57fee", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ea28790af21bd37bd9e5274b95e57fee");
                } else if (b.this.d != null) {
                    b.this.d.a();
                }
            }
        });
        this.j = new a(this.i);
        this.h.setWebViewClient(this.j);
        this.l = com.meituan.msc.modules.page.embeddedwidget.b.a(this.h);
        if (!this.l) {
            g.b("MTWebView supportEmbed", Boolean.FALSE);
            return;
        }
        g.b("MTWebView supportEmbed", Boolean.TRUE);
        MTWebView mTWebView = this.h;
        Object[] objArr5 = {mTWebView};
        ChangeQuickRedirect changeQuickRedirect5 = com.meituan.msc.modules.page.embeddedwidget.b.a;
        if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "2c74e2b535d8fc7ed50017399d5a8992", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "2c74e2b535d8fc7ed50017399d5a8992");
        } else {
            SameLayerManager.bindProvider(mTWebView, new com.meituan.msc.modules.page.embeddedwidget.a());
        }
    }

    static void a(MTWebView mTWebView) {
        Object[] objArr = {mTWebView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d76e943ee0f3e9ffe561a65d830366ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d76e943ee0f3e9ffe561a65d830366ec");
        } else if (com.meituan.msc.modules.page.embeddedwidget.b.a(mTWebView)) {
            if (f == null) {
                f = String.format("if (typeof __mpInfo === 'undefined') {var __mpInfo = {};} __mpInfo.embeddedWidgets = %s;", com.meituan.msc.common.utils.d.a(com.meituan.msc.modules.page.embeddedwidget.a.b));
            }
            g.b("injectEmbedSupport", f);
            mTWebView.evaluateJavascript(f, null);
        }
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void a(String str, @Nullable final ValueCallback<String> valueCallback) {
        int indexOf;
        int i = 0;
        Object[] objArr = {str, valueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9d937c554d27a7da2a67b2c323a52d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9d937c554d27a7da2a67b2c323a52d4");
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
        this.h.evaluateJavascript(str, new MTValueCallback<String>() { // from class: com.meituan.msc.modules.page.render.webview.impl.b.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mtwebkit.MTValueCallback
            public final /* synthetic */ void onReceiveValue(String str2) {
                String str3 = str2;
                Object[] objArr2 = {str3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c802ece37c5c3bd4f20b2cf22ff59dcb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c802ece37c5c3bd4f20b2cf22ff59dcb");
                } else if (valueCallback != null) {
                    valueCallback.onReceiveValue(str3);
                }
            }
        });
    }

    @Override // com.meituan.msc.modules.page.render.g
    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a653141aecd98fca6e5a6533dca22a5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a653141aecd98fca6e5a6533dca22a5b");
            return;
        }
        try {
            if (this.k) {
                g.b("MTWebView", "MTWebViewImp is destroyed");
                return;
            }
            this.k = true;
            this.d = null;
            this.h.setWebChromeClient(null);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "768d2c85651e1b93d11f668f2f932752", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "768d2c85651e1b93d11f668f2f932752");
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
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ac006363a5695622c23427ca63234bc8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ac006363a5695622c23427ca63234bc8");
            } else if (this.g != null) {
                a(this.g.booleanValue());
            }
            this.h.destroy();
        } catch (Throwable unused) {
            g.a("MTWebView", "destroy exception");
        }
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void a(String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f42dd6c0da0d12c8efab73b9752fabd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f42dd6c0da0d12c8efab73b9752fabd");
            return;
        }
        this.h.loadDataWithBaseURL(str, str2, str3, str4, str5);
        a(this.h);
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final String getUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2900318c4c52e5a4586a04fb59de2bc2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2900318c4c52e5a4586a04fb59de2bc2") : this.h.getUrl();
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void a(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "035773d0a38d3f3914a6199872c9fd08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "035773d0a38d3f3914a6199872c9fd08");
        } else {
            this.h.addJavascriptInterface(obj, str);
        }
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final View getWebView() {
        return this.h;
    }

    @Override // com.meituan.msc.modules.page.render.e
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97e9005bbabefe270ed678ee234fdfef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97e9005bbabefe270ed678ee234fdfef");
        } else {
            this.h.requestLayout();
        }
    }

    @Override // com.meituan.msc.modules.page.render.e
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35194f86c202bda8b15870a900ea21cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35194f86c202bda8b15870a900ea21cd");
        } else {
            this.h.scrollBy(0, i);
        }
    }

    @Override // com.meituan.msc.modules.page.render.e
    public final void setOnContentScrollChangeListener(f fVar) {
        this.b = fVar;
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final String getUserAgentString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "038d78bf30e85cc425019625bfeb1e42", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "038d78bf30e85cc425019625bfeb1e42") : this.h.getSettings().getUserAgentString();
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void setUserAgentString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72d47ef0a07e213f7f229582ab189a05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72d47ef0a07e213f7f229582ab189a05");
        } else {
            this.h.getSettings().setUserAgentString(str);
        }
    }

    @Override // com.meituan.msc.modules.page.render.e
    public final int getContentHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17dd905a92791aede099d09cb34fcc7b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17dd905a92791aede099d09cb34fcc7b")).intValue() : (int) (this.h.getContentHeight() * this.h.getScale());
    }

    @Override // com.meituan.msc.modules.page.render.e
    public final int getContentScrollY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a1012f37831c231987820f785fe1b43", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a1012f37831c231987820f785fe1b43")).intValue() : this.h.getScrollY();
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void setOnPageFinishedListener(com.meituan.msc.modules.page.render.webview.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58851337f3883bc12e6bed15cf424ac9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58851337f3883bc12e6bed15cf424ac9");
        } else {
            this.j.b = hVar;
        }
    }

    @Override // com.meituan.msc.modules.page.render.g
    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdcaa5195f9ea9d463792189cc1bce0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdcaa5195f9ea9d463792189cc1bce0a");
        } else {
            this.h.onResume();
        }
    }

    @Override // com.meituan.msc.modules.page.render.g
    public final void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44840d721169e99454dec5b93867074a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44840d721169e99454dec5b93867074a");
        } else {
            this.h.onPause();
        }
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void b(int i) {
        this.c = i;
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7a50a5fdf6d8d6aa2d110981572a12f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7a50a5fdf6d8d6aa2d110981572a12f");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f6d8247f15045eb76fd67fe95376d7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f6d8247f15045eb76fd67fe95376d7e");
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
    public class a extends MTWebViewClient {
        public static ChangeQuickRedirect a;
        com.meituan.msc.modules.page.render.webview.h b;
        i c;
        private File e;
        private Context f;
        private com.meituan.msc.common.resource.c g;

        public a(Context context) {
            Object[] objArr = {b.this, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7cbda4653a2446abcc65f95dfb6b3c4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7cbda4653a2446abcc65f95dfb6b3c4");
                return;
            }
            this.g = new com.meituan.msc.common.resource.c();
            this.f = context;
            if (this.e == null) {
                this.e = com.meituan.msc.common.utils.e.b(context, null);
            }
        }

        @Override // com.meituan.mtwebkit.MTWebViewClient
        public final void onPageStarted(MTWebView mTWebView, String str, Bitmap bitmap) {
            Object[] objArr = {mTWebView, str, bitmap};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "491565e6258eacda025214fa30abcc85", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "491565e6258eacda025214fa30abcc85");
            } else {
                super.onPageStarted(mTWebView, str, bitmap);
            }
        }

        @Override // com.meituan.mtwebkit.MTWebViewClient
        @TargetApi(26)
        public final boolean onRenderProcessGone(MTWebView mTWebView, MTRenderProcessGoneDetail mTRenderProcessGoneDetail) {
            Object[] objArr = {mTWebView, mTRenderProcessGoneDetail};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba46baada2e73ecaf3781fc32a4bbccd", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba46baada2e73ecaf3781fc32a4bbccd")).booleanValue();
            }
            com.meituan.msc.modules.api.g.a(mTWebView, mTRenderProcessGoneDetail.didCrash(), mTRenderProcessGoneDetail.rendererPriorityAtExit(), mTWebView.getUrl(), b.this.e, this.c);
            return true;
        }

        @Override // com.meituan.mtwebkit.MTWebViewClient
        public final void onPageFinished(MTWebView mTWebView, String str) {
            Object[] objArr = {mTWebView, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42ba298eae26f0a3a1d95f187f8fe7a3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42ba298eae26f0a3a1d95f187f8fe7a3");
                return;
            }
            super.onPageFinished(mTWebView, str);
            b.a(mTWebView);
            if (this.b != null) {
                this.b.d(str);
            }
        }

        @Override // com.meituan.mtwebkit.MTWebViewClient
        @TargetApi(21)
        public final MTWebResourceResponse shouldInterceptRequest(MTWebView mTWebView, MTWebResourceRequest mTWebResourceRequest) {
            Object[] objArr = {mTWebView, mTWebResourceRequest};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d72fbf8ce3e71211a52d545fc1b4f503", RobustBitConfig.DEFAULT_VALUE)) {
                return (MTWebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d72fbf8ce3e71211a52d545fc1b4f503");
            }
            MTWebResourceResponse mTWebResourceResponse = (MTWebResourceResponse) p.a(mTWebView.getContext(), b.this.e.d(), mTWebResourceRequest.getUrl().toString(), this.g);
            return mTWebResourceResponse != null ? mTWebResourceResponse : super.shouldInterceptRequest(mTWebView, mTWebResourceRequest);
        }

        @Override // com.meituan.mtwebkit.MTWebViewClient
        public final MTWebResourceResponse shouldInterceptRequest(MTWebView mTWebView, String str) {
            Object[] objArr = {mTWebView, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50068acb3e6ae01cf354937a2b76528b", RobustBitConfig.DEFAULT_VALUE)) {
                return (MTWebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50068acb3e6ae01cf354937a2b76528b");
            }
            MTWebResourceResponse mTWebResourceResponse = (MTWebResourceResponse) p.a(mTWebView.getContext(), b.this.e.d(), str, this.g);
            return mTWebResourceResponse != null ? mTWebResourceResponse : super.shouldInterceptRequest(mTWebView, str);
        }
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void setOnFullScreenListener(j jVar) {
        if (this.d == null) {
            this.d = jVar;
        }
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void setOnRenderProcessGoneListener(i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea242e832619eb5157e53edf1fc2f97c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea242e832619eb5157e53edf1fc2f97c");
        } else {
            this.j.c = iVar;
        }
    }
}
