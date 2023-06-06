package com.meituan.msc.modules.page.render.webview.impl;

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
import com.meituan.android.cipstorage.q;
import com.meituan.dio.easy.DioFile;
import com.meituan.msc.common.utils.ag;
import com.meituan.msc.common.utils.ai;
import com.meituan.msc.common.utils.aw;
import com.meituan.msc.modules.devtools.DebugHelper;
import com.meituan.msc.modules.page.render.webview.f;
import com.meituan.msc.modules.page.render.webview.h;
import com.meituan.msc.modules.page.render.webview.i;
import com.meituan.msc.modules.page.render.webview.j;
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
public final class d implements com.meituan.msc.modules.page.render.webview.c {
    public static ChangeQuickRedirect a;
    private Boolean b;
    private MTWebView c;
    private Context d;
    private String e;
    private volatile boolean f;

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

    public d(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d75ee6ff5cb296aa99c0a33b36e675cc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d75ee6ff5cb296aa99c0a33b36e675cc");
            return;
        }
        this.f = false;
        this.d = context;
        this.e = str;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "95fcb2f58c488a6613be1acc3e448694", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "95fcb2f58c488a6613be1acc3e448694");
            return;
        }
        this.c = new MTWebView(this.e, this.d);
        this.c.setOverScrollMode(2);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "199bd79285d2418aecfbdf17fe468b15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "199bd79285d2418aecfbdf17fe468b15");
        } else if (Build.VERSION.SDK_INT == 17 && this.b == null) {
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "cd4a781da42b06bf5f961f9e726048ac", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "cd4a781da42b06bf5f961f9e726048ac")).booleanValue() : ((AccessibilityManager) this.d.getSystemService("accessibility")).isEnabled()) {
                this.b = Boolean.TRUE;
                a(false);
            }
        }
        b();
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
        this.c.setWebChromeClient(new MTWebChromeClient() { // from class: com.meituan.msc.modules.page.render.webview.impl.d.1
            public static ChangeQuickRedirect a;
            private String c;

            {
                this.c = d.this.getClass().getSimpleName();
            }

            @Override // com.meituan.mtwebkit.MTWebChromeClient
            public final boolean onConsoleMessage(MTConsoleMessage mTConsoleMessage) {
                Object[] objArr5 = {mTConsoleMessage};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "196bc2c89a38f38108073bf4c12bdb96", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "196bc2c89a38f38108073bf4c12bdb96")).booleanValue();
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

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void a(String str, @Nullable final ValueCallback<String> valueCallback) {
        Object[] objArr = {str, valueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dee2b5683f1bf8f5eb5b22a995f0303e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dee2b5683f1bf8f5eb5b22a995f0303e");
        } else {
            this.c.evaluateJavascript(str, new MTValueCallback<String>() { // from class: com.meituan.msc.modules.page.render.webview.impl.d.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mtwebkit.MTValueCallback
                public final /* synthetic */ void onReceiveValue(String str2) {
                    String str3 = str2;
                    Object[] objArr2 = {str3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eb7d8af308df560e2c1d047d2e85e761", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eb7d8af308df560e2c1d047d2e85e761");
                    } else if (valueCallback != null) {
                        valueCallback.onReceiveValue(str3);
                    }
                }
            });
        }
    }

    @Override // com.meituan.msc.modules.page.render.g
    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe910dbaebbc44d81cc35e85bbafaacf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe910dbaebbc44d81cc35e85bbafaacf");
            return;
        }
        try {
            if (this.f) {
                g.b("MTWebView", "SimpleMTWebView is destroyed");
                return;
            }
            this.f = true;
            this.c.setWebChromeClient(null);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4289a542085c23e6a3a89d90054f235a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4289a542085c23e6a3a89d90054f235a");
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
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "84ea9f9a451c43189d0f396f0a75afcc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "84ea9f9a451c43189d0f396f0a75afcc");
            } else if (this.b != null) {
                a(this.b.booleanValue());
            }
            this.c.destroy();
        } catch (Throwable unused) {
            g.a("MTWebView", "destroy exception");
        }
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void a(String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91e4b53475e011aa7a52ef0bfb182f88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91e4b53475e011aa7a52ef0bfb182f88");
        } else {
            this.c.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final String getUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58382306934560a2a00efb1bef298410", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58382306934560a2a00efb1bef298410") : this.c.getUrl();
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void a(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35dd355742ecc25fcccb725d73c11553", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35dd355742ecc25fcccb725d73c11553");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6465e24431126505e006cff9692049d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6465e24431126505e006cff9692049d");
        } else {
            this.c.requestLayout();
        }
    }

    @Override // com.meituan.msc.modules.page.render.e
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7273487c3fe5bb15d63b7a3c4b486846", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7273487c3fe5bb15d63b7a3c4b486846");
        } else {
            this.c.scrollBy(0, i);
        }
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final String getUserAgentString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cf6133fee7ffaea5025ff6ad4744e19", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cf6133fee7ffaea5025ff6ad4744e19") : this.c.getSettings().getUserAgentString();
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void setUserAgentString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bcbd0c817ba5aa1be38452dab762952", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bcbd0c817ba5aa1be38452dab762952");
        } else {
            this.c.getSettings().setUserAgentString(str);
        }
    }

    @Override // com.meituan.msc.modules.page.render.e
    public final int getContentHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2569e12683e5dd58f91c507f8ec02c3d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2569e12683e5dd58f91c507f8ec02c3d")).intValue() : (int) (this.c.getContentHeight() * this.c.getScale());
    }

    @Override // com.meituan.msc.modules.page.render.e
    public final int getContentScrollY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df6ea24609122590f2a00b237494c8b2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df6ea24609122590f2a00b237494c8b2")).intValue() : this.c.getScrollY();
    }

    @Override // com.meituan.msc.modules.page.render.webview.c
    public final void setOnPageFinishedListener(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1025c5ee3496959eec05f651ba3fed4c", RobustBitConfig.DEFAULT_VALUE)) {
            throw new RuntimeException("SimpleWebview not support setOnPageFinishedListener!");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1025c5ee3496959eec05f651ba3fed4c");
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d72c09bf7c619a872172e3a82003eb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d72c09bf7c619a872172e3a82003eb0");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9312177403412590f6dd50a1499e9e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9312177403412590f6dd50a1499e9e1");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f215279d68f7b665d10e1a28ae100d3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f215279d68f7b665d10e1a28ae100d3");
            } else {
                super.onPageStarted(mTWebView, str, bitmap);
            }
        }

        @Override // com.meituan.mtwebkit.MTWebViewClient
        @TargetApi(26)
        public final boolean onRenderProcessGone(MTWebView mTWebView, MTRenderProcessGoneDetail mTRenderProcessGoneDetail) {
            Object[] objArr = {mTWebView, mTRenderProcessGoneDetail};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "422fa3a3823ee9026133d6a078418e21", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "422fa3a3823ee9026133d6a078418e21")).booleanValue();
            }
            Context context = mTWebView.getContext();
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    aw.a("页面出现问题，请重新打开", new Object[0]);
                    activity.finish();
                }
            }
            return true;
        }

        @Override // com.meituan.mtwebkit.MTWebViewClient
        public final void onPageFinished(MTWebView mTWebView, String str) {
            Object[] objArr = {mTWebView, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9063164ae49b8dc1073c336876e8fd94", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9063164ae49b8dc1073c336876e8fd94");
            } else {
                super.onPageFinished(mTWebView, str);
            }
        }

        @Override // com.meituan.mtwebkit.MTWebViewClient
        @TargetApi(21)
        public final MTWebResourceResponse shouldInterceptRequest(MTWebView mTWebView, MTWebResourceRequest mTWebResourceRequest) {
            Object[] objArr = {mTWebView, mTWebResourceRequest};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8dd2758e305fb351e3dae4c352a366a", RobustBitConfig.DEFAULT_VALUE)) {
                return (MTWebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8dd2758e305fb351e3dae4c352a366a");
            }
            MTWebResourceResponse a2 = a(mTWebView.getContext(), mTWebResourceRequest.getUrl().toString());
            return a2 != null ? a2 : super.shouldInterceptRequest(mTWebView, mTWebResourceRequest);
        }

        @Override // com.meituan.mtwebkit.MTWebViewClient
        public final MTWebResourceResponse shouldInterceptRequest(MTWebView mTWebView, String str) {
            Object[] objArr = {mTWebView, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dee6f294044a53d73b564662676e13c", RobustBitConfig.DEFAULT_VALUE)) {
                return (MTWebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dee6f294044a53d73b564662676e13c");
            }
            MTWebResourceResponse a2 = a(mTWebView.getContext(), str);
            return a2 != null ? a2 : super.shouldInterceptRequest(mTWebView, str);
        }

        private MTWebResourceResponse a(Context context, String str) {
            Object[] objArr = {context, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb7f9e7654277af984a2eb8545964cb6", RobustBitConfig.DEFAULT_VALUE)) {
                return (MTWebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb7f9e7654277af984a2eb8545964cb6");
            }
            if (DebugHelper.b) {
                if (str.startsWith("mtlocalfile://" + ag.a(context))) {
                    return a(ai.a(str), new DioFile(str.substring(14)));
                }
                return null;
            }
            return null;
        }

        private MTWebResourceResponse a(String str, DioFile dioFile) {
            Object[] objArr = {str, dioFile};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cfd7361e6c3668964857a8d8e892a00", RobustBitConfig.DEFAULT_VALUE)) {
                return (MTWebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cfd7361e6c3668964857a8d8e892a00");
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
                    ChangeQuickRedirect changeQuickRedirect2 = d.a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "feb16a3f1c4be3dd50041b0398dd688c", RobustBitConfig.DEFAULT_VALUE)) {
                        Pair pair = (Pair) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "feb16a3f1c4be3dd50041b0398dd688c");
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
