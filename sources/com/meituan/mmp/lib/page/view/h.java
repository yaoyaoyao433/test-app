package com.meituan.mmp.lib.page.view;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.webkit.ValueCallback;
import android.widget.Toast;
import com.meituan.android.cipstorage.q;
import com.meituan.dio.easy.DioFile;
import com.meituan.mmp.lib.DebugHelper;
import com.meituan.mmp.lib.utils.ai;
import com.meituan.mmp.lib.utils.ay;
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
import java.io.File;
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
public final class h implements b {
    public static ChangeQuickRedirect a;
    private Boolean b;
    private MTWebView c;
    private Context d;
    private String e;
    private volatile boolean f;

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

    public h(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd88f33128cce100d2f02680fe52e4a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd88f33128cce100d2f02680fe52e4a5");
            return;
        }
        this.f = false;
        this.d = context;
        this.e = str;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ed7cb69ed7a4e047611ad1b102952d61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ed7cb69ed7a4e047611ad1b102952d61");
            return;
        }
        this.c = new MTWebView(this.e, this.d);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2b172ac9a3fee04569611951aa3c0c2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2b172ac9a3fee04569611951aa3c0c2d");
        } else if (Build.VERSION.SDK_INT == 17 && this.b == null) {
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1972c3f3a780115d06dc76124d32af0c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1972c3f3a780115d06dc76124d32af0c")).booleanValue() : ((AccessibilityManager) this.d.getSystemService("accessibility")).isEnabled()) {
                this.b = Boolean.TRUE;
                a(false);
            }
        }
        g();
        MTWebSettings settings = this.c.getSettings();
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
        File a2 = q.a(this.d, "mtplatform_mmp", "webviewcache");
        if (a2 != null) {
            if (!a2.exists()) {
                a2.mkdirs();
            }
            settings.setAppCachePath(a2.getAbsolutePath());
        }
        this.c.setWebChromeClient(new MTWebChromeClient() { // from class: com.meituan.mmp.lib.page.view.h.1
            public static ChangeQuickRedirect a;
            private String c;

            {
                this.c = h.this.getClass().getSimpleName();
            }

            @Override // com.meituan.mtwebkit.MTWebChromeClient
            public final boolean onConsoleMessage(MTConsoleMessage mTConsoleMessage) {
                Object[] objArr5 = {mTConsoleMessage};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "86aa2ad76e5589f3382fc44b5d0d3325", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "86aa2ad76e5589f3382fc44b5d0d3325")).booleanValue();
                }
                if (mTConsoleMessage.messageLevel() == MTConsoleMessage.MessageLevel.ERROR) {
                    PrintStream printStream = System.out;
                    printStream.println("webview_log_" + this.c + " [error] " + mTConsoleMessage.message());
                    PrintStream printStream2 = System.out;
                    printStream2.println("webview_log_" + this.c + " [error] sourceId = " + mTConsoleMessage.sourceId());
                    PrintStream printStream3 = System.out;
                    printStream3.println("webview_log_" + this.c + " [error] lineNumber = " + mTConsoleMessage.lineNumber());
                } else {
                    new StringBuilder("webview_log_").append(this.c);
                    mTConsoleMessage.message();
                }
                return super.onConsoleMessage(mTConsoleMessage);
            }
        });
        this.c.setWebViewClient(new a());
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a(String str, @Nullable final ValueCallback<String> valueCallback) {
        Object[] objArr = {str, valueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e63728bad7e030675012db4a8d1ce675", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e63728bad7e030675012db4a8d1ce675");
        } else {
            this.c.evaluateJavascript(str, new MTValueCallback<String>() { // from class: com.meituan.mmp.lib.page.view.h.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mtwebkit.MTValueCallback
                public final /* synthetic */ void onReceiveValue(String str2) {
                    String str3 = str2;
                    Object[] objArr2 = {str3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d435073ada24efd10f1ce3792e81e1db", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d435073ada24efd10f1ce3792e81e1db");
                    } else if (valueCallback != null) {
                        valueCallback.onReceiveValue(str3);
                    }
                }
            });
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "758344eb62d9a11a46a926973177f270", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "758344eb62d9a11a46a926973177f270");
            return;
        }
        try {
            if (this.f) {
                com.meituan.mmp.lib.trace.b.b("MTWebView", "SimpleMTWebView is destroyed");
                return;
            }
            this.f = true;
            this.c.setWebChromeClient(null);
            this.c.removeJavascriptInterface("HeraJSCore");
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "64f4bf77533470a67c0ef03ad2726ec1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "64f4bf77533470a67c0ef03ad2726ec1");
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
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8c5c7b216a8c23ab885d6df7acf7f71a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8c5c7b216a8c23ab885d6df7acf7f71a");
            } else if (this.b != null) {
                a(this.b.booleanValue());
            }
            this.c.destroy();
        } catch (Throwable unused) {
            com.meituan.mmp.lib.trace.b.d("MTWebView", "destroy exception");
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9554537de57c90de63b1bf50977a4c1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9554537de57c90de63b1bf50977a4c1e");
        } else {
            this.c.loadUrl(str);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a(String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "319ddf7686e47ec8425c7cc72e3037cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "319ddf7686e47ec8425c7cc72e3037cf");
        } else {
            this.c.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final String getUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4592b5c9b38723425a540f184969ceb4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4592b5c9b38723425a540f184969ceb4") : this.c.getUrl();
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36a5be71e0fd4ca755dd9a4e635544b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36a5be71e0fd4ca755dd9a4e635544b2");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e86ce31d749d402bb64f434e5abf0ae1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e86ce31d749d402bb64f434e5abf0ae1");
        } else {
            this.c.clearHistory();
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40e50e419b6226aa34c0a738dcfb5825", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40e50e419b6226aa34c0a738dcfb5825");
        } else {
            this.c.requestLayout();
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c20206cf82ef7825c8df017e3d3b91c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c20206cf82ef7825c8df017e3d3b91c");
        } else {
            this.c.scrollBy(0, i);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final String getUserAgentString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bc53bb5bef8b3f16242897cb947a8ab", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bc53bb5bef8b3f16242897cb947a8ab") : this.c.getSettings().getUserAgentString();
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void setUserAgentString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cc416a6e27c6d9f181150dc26926352", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cc416a6e27c6d9f181150dc26926352");
        } else {
            this.c.getSettings().setUserAgentString(str);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final int getWebPageHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88b26eab4608a8fe167b08f13e5c4d90", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88b26eab4608a8fe167b08f13e5c4d90")).intValue() : (int) (this.c.getContentHeight() * this.c.getScale());
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final int getWebScrollY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4ce36b16bce2316decc0ddb481aba00", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4ce36b16bce2316decc0ddb481aba00")).intValue() : this.c.getScrollY();
    }

    @Override // com.meituan.mmp.lib.page.view.b
    public final void setOnPageFinishedListener(com.meituan.mmp.lib.web.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b49fcad303a914c981c79546dcc5db7", RobustBitConfig.DEFAULT_VALUE)) {
            throw new RuntimeException("SimpleWebview not support setOnPageFinishedListener!");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b49fcad303a914c981c79546dcc5db7");
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1560533eec8a38153e45232b022374f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1560533eec8a38153e45232b022374f");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5ebb6ba1e2f72a8c864dd9b30e50d19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5ebb6ba1e2f72a8c864dd9b30e50d19");
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
    public static class a extends MTWebViewClient {
        public static ChangeQuickRedirect a;

        @Override // com.meituan.mtwebkit.MTWebViewClient
        public final void onPageStarted(MTWebView mTWebView, String str, Bitmap bitmap) {
            Object[] objArr = {mTWebView, str, bitmap};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99aef0bb08e352666c63cbe798ed3c17", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99aef0bb08e352666c63cbe798ed3c17");
            } else {
                super.onPageStarted(mTWebView, str, bitmap);
            }
        }

        @Override // com.meituan.mtwebkit.MTWebViewClient
        @TargetApi(26)
        public final boolean onRenderProcessGone(MTWebView mTWebView, MTRenderProcessGoneDetail mTRenderProcessGoneDetail) {
            Object[] objArr = {mTWebView, mTRenderProcessGoneDetail};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "199a06fe10dfb1ea284b25e5c5d85c81", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "199a06fe10dfb1ea284b25e5c5d85c81")).booleanValue();
            }
            Context context = mTWebView.getContext();
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    Toast.makeText(context, "页面出现问题，请重新打开", 0).show();
                    activity.finish();
                }
            }
            return true;
        }

        @Override // com.meituan.mtwebkit.MTWebViewClient
        public final void onPageFinished(MTWebView mTWebView, String str) {
            Object[] objArr = {mTWebView, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5f285ef18d8458d9d7a78cd6841cf06", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5f285ef18d8458d9d7a78cd6841cf06");
            } else {
                super.onPageFinished(mTWebView, str);
            }
        }

        @Override // com.meituan.mtwebkit.MTWebViewClient
        @TargetApi(21)
        public final MTWebResourceResponse shouldInterceptRequest(MTWebView mTWebView, MTWebResourceRequest mTWebResourceRequest) {
            Object[] objArr = {mTWebView, mTWebResourceRequest};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fd5887357b50b08008ed63b83c1e94b", RobustBitConfig.DEFAULT_VALUE)) {
                return (MTWebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fd5887357b50b08008ed63b83c1e94b");
            }
            MTWebResourceResponse a2 = a(mTWebView.getContext(), mTWebResourceRequest.getUrl().toString());
            return a2 != null ? a2 : super.shouldInterceptRequest(mTWebView, mTWebResourceRequest);
        }

        @Override // com.meituan.mtwebkit.MTWebViewClient
        public final MTWebResourceResponse shouldInterceptRequest(MTWebView mTWebView, String str) {
            Object[] objArr = {mTWebView, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea20bbfd8f287fa65d3fe72da3a29ff5", RobustBitConfig.DEFAULT_VALUE)) {
                return (MTWebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea20bbfd8f287fa65d3fe72da3a29ff5");
            }
            MTWebResourceResponse a2 = a(mTWebView.getContext(), str);
            return a2 != null ? a2 : super.shouldInterceptRequest(mTWebView, str);
        }

        private MTWebResourceResponse a(Context context, String str) {
            Object[] objArr = {context, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98beaa0a9af2f045ea4fd40601907e83", RobustBitConfig.DEFAULT_VALUE)) {
                return (MTWebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98beaa0a9af2f045ea4fd40601907e83");
            }
            if (DebugHelper.c) {
                if (str.startsWith("mtlocalfile://" + ay.a(context))) {
                    return a(ai.a(str), new DioFile(str.substring(14)));
                }
                return null;
            }
            return null;
        }

        private MTWebResourceResponse a(String str, DioFile dioFile) {
            Object[] objArr = {str, dioFile};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "055efe7b33a1ff049f8a4b4fdf689be9", RobustBitConfig.DEFAULT_VALUE)) {
                return (MTWebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "055efe7b33a1ff049f8a4b4fdf689be9");
            }
            if (dioFile.c() || dioFile.k()) {
                try {
                    MTWebResourceResponse mTWebResourceResponse = new MTWebResourceResponse(str, "UTF-8", dioFile.b());
                    if (Build.VERSION.SDK_INT >= 21) {
                        Map<String, String> responseHeaders = mTWebResourceResponse.getResponseHeaders();
                        if (responseHeaders == null) {
                            responseHeaders = new HashMap<>();
                        }
                        responseHeaders.put("Cache-Control", "no-cache, no-store, must-revalidate");
                        responseHeaders.put("Pragma", "no-cache");
                        responseHeaders.put("Expires", "0");
                        mTWebResourceResponse.setResponseHeaders(responseHeaders);
                    }
                    return mTWebResourceResponse;
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    return null;
                } catch (IOException e2) {
                    Object[] objArr2 = {e2};
                    ChangeQuickRedirect changeQuickRedirect2 = h.a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "19a66a923a916b57d4e98c0cca6763d9", RobustBitConfig.DEFAULT_VALUE)) {
                        Pair pair = (Pair) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "19a66a923a916b57d4e98c0cca6763d9");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "584ca99ec17153fa9f73ef0773660794", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "584ca99ec17153fa9f73ef0773660794");
        } else {
            this.c.setBackgroundColor(i);
        }
    }
}
