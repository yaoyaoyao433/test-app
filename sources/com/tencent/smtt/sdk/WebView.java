package com.tencent.smtt.sdk;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.net.http.SslCertificate;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.meituan.android.common.statistics.quickreport.QuickReportConstants;
import com.meituan.robust.common.CommonConstant;
import com.tencent.smtt.export.external.TbsCoreSettings;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebSettingsExtension;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebViewExtension;
import com.tencent.smtt.export.external.extension.proxy.X5ProxyWebViewClientExtension;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import com.tencent.smtt.sdk.stat.MttLoader;
import com.tencent.smtt.utils.FileUtil;
import com.tencent.smtt.utils.TbsLog;
import io.agora.rtc.Constants;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.FileLock;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class WebView extends FrameLayout implements View.OnLongClickListener {
    public static final int GETPVERROR = -1;
    public static final int NIGHT_MODE_COLOR = -16777216;
    public static final int NORMAL_MODE_ALPHA = 255;
    public static final String SCHEME_GEO = "geo:0,0?q=";
    public static final String SCHEME_MAILTO = "mailto:";
    public static final String SCHEME_TEL = "tel:";
    volatile int a;
    private final String b;
    private boolean e;
    private IX5WebViewBase f;
    private a g;
    private WebSettings h;
    private Context i;
    private volatile boolean k;
    private boolean m;
    public WebViewCallbackClient mWebViewCallbackClient;
    private WebViewClient o;
    private WebChromeClient p;
    private final int r;
    private final int s;
    private final int t;
    private final String u;
    private final String v;
    private Object y;
    private View.OnLongClickListener z;
    private static final Lock c = new ReentrantLock();
    private static OutputStream d = null;
    private static Context j = null;
    public static boolean mWebViewCreated = false;
    private static com.tencent.smtt.utils.o l = null;
    private static Method n = null;
    private static String q = null;
    public static boolean mSysWebviewCreated = false;
    private static Paint w = null;
    private static boolean x = true;
    public static int NIGHT_MODE_ALPHA = Constants.ERR_PUBLISH_STREAM_NOT_AUTHORIZED;

    /* loaded from: classes6.dex */
    public static class HitTestResult {
        @Deprecated
        public static final int ANCHOR_TYPE = 1;
        public static final int EDIT_TEXT_TYPE = 9;
        public static final int EMAIL_TYPE = 4;
        public static final int GEO_TYPE = 3;
        @Deprecated
        public static final int IMAGE_ANCHOR_TYPE = 6;
        public static final int IMAGE_TYPE = 5;
        public static final int PHONE_TYPE = 2;
        public static final int SRC_ANCHOR_TYPE = 7;
        public static final int SRC_IMAGE_ANCHOR_TYPE = 8;
        public static final int UNKNOWN_TYPE = 0;
        private IX5WebViewBase.HitTestResult a;
        private WebView.HitTestResult b;

        public HitTestResult() {
            this.b = null;
            this.a = null;
            this.b = null;
        }

        public HitTestResult(WebView.HitTestResult hitTestResult) {
            this.b = null;
            this.a = null;
            this.b = hitTestResult;
        }

        public HitTestResult(IX5WebViewBase.HitTestResult hitTestResult) {
            this.b = null;
            this.a = hitTestResult;
            this.b = null;
        }

        public String getExtra() {
            return this.a != null ? this.a.getExtra() : this.b != null ? this.b.getExtra() : "";
        }

        public int getType() {
            if (this.a != null) {
                return this.a.getType();
            }
            if (this.b != null) {
                return this.b.getType();
            }
            return 0;
        }
    }

    @Deprecated
    /* loaded from: classes6.dex */
    public interface PictureListener {
        @Deprecated
        void onNewPicture(WebView webView, Picture picture);
    }

    /* loaded from: classes6.dex */
    public class WebViewTransport {
        private WebView b;

        public WebViewTransport() {
        }

        public synchronized WebView getWebView() {
            return this.b;
        }

        public synchronized void setWebView(WebView webView) {
            this.b = webView;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class a extends android.webkit.WebView {
        public a(WebView webView, Context context) {
            this(context, null);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(WebView.this.d(context), attributeSet);
            if (QbSdk.getIsSysWebViewForcedByOuter() && TbsShareManager.isThirdPartyApp(context)) {
                return;
            }
            CookieSyncManager.createInstance(WebView.this.i).startSync();
            try {
                Method declaredMethod = Class.forName("android.webkit.WebViewWorker").getDeclaredMethod("getHandler", new Class[0]);
                declaredMethod.setAccessible(true);
                ((Handler) declaredMethod.invoke(null, new Object[0])).getLooper().getThread().setUncaughtExceptionHandler(new h());
                WebView.mSysWebviewCreated = true;
            } catch (Exception unused) {
            }
        }

        public void a() {
            super.computeScroll();
        }

        public void a(int i, int i2, int i3, int i4) {
            super.onScrollChanged(i, i2, i3, i4);
        }

        @TargetApi(9)
        public void a(int i, int i2, boolean z, boolean z2) {
            if (Build.VERSION.SDK_INT >= 9) {
                super.onOverScrolled(i, i2, z, z2);
            }
        }

        @TargetApi(9)
        public boolean a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
            if (Build.VERSION.SDK_INT >= 9) {
                return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
            }
            return false;
        }

        public boolean a(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public boolean b(MotionEvent motionEvent) {
            return super.dispatchTouchEvent(motionEvent);
        }

        public boolean c(MotionEvent motionEvent) {
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.webkit.WebView, android.view.View
        public void computeScroll() {
            if (WebView.this.mWebViewCallbackClient != null) {
                WebView.this.mWebViewCallbackClient.computeScroll(this);
            } else {
                super.computeScroll();
            }
        }

        @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            try {
                super.dispatchDraw(canvas);
                if (WebView.x || WebView.w == null) {
                    return;
                }
                canvas.save();
                canvas.drawPaint(WebView.w);
                canvas.restore();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return WebView.this.mWebViewCallbackClient != null ? WebView.this.mWebViewCallbackClient.dispatchTouchEvent(motionEvent, this) : super.dispatchTouchEvent(motionEvent);
        }

        @Override // android.webkit.WebView
        public android.webkit.WebSettings getSettings() {
            try {
                return super.getSettings();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override // android.view.View
        public void invalidate() {
            super.invalidate();
            if (WebView.this.mWebViewCallbackClient != null) {
                WebView.this.mWebViewCallbackClient.invalidate();
            }
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return WebView.this.mWebViewCallbackClient != null ? WebView.this.mWebViewCallbackClient.onInterceptTouchEvent(motionEvent, this) : super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.webkit.WebView, android.view.View
        @TargetApi(9)
        public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
            if (WebView.this.mWebViewCallbackClient != null) {
                WebView.this.mWebViewCallbackClient.onOverScrolled(i, i2, z, z2, this);
            } else if (Build.VERSION.SDK_INT >= 9) {
                super.onOverScrolled(i, i2, z, z2);
            }
        }

        @Override // android.webkit.WebView, android.view.View
        protected void onScrollChanged(int i, int i2, int i3, int i4) {
            if (WebView.this.mWebViewCallbackClient != null) {
                WebView.this.mWebViewCallbackClient.onScrollChanged(i, i2, i3, i4, this);
                return;
            }
            super.onScrollChanged(i, i2, i3, i4);
            WebView.this.onScrollChanged(i, i2, i3, i4);
        }

        @Override // android.webkit.WebView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (!hasFocus()) {
                requestFocus();
            }
            if (WebView.this.mWebViewCallbackClient != null) {
                return WebView.this.mWebViewCallbackClient.onTouchEvent(motionEvent, this);
            }
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Throwable th) {
                th.printStackTrace();
                return false;
            }
        }

        @Override // android.view.View
        @TargetApi(9)
        public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
            if (WebView.this.mWebViewCallbackClient != null) {
                return WebView.this.mWebViewCallbackClient.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z, this);
            }
            if (Build.VERSION.SDK_INT >= 9) {
                return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
            }
            return false;
        }

        @Override // android.webkit.WebView, android.view.View
        public void setOverScrollMode(int i) {
            try {
                super.setOverScrollMode(i);
            } catch (Exception unused) {
            }
        }
    }

    public WebView(Context context) {
        this(context, (AttributeSet) null);
    }

    public WebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WebView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, false);
    }

    @TargetApi(11)
    public WebView(Context context, AttributeSet attributeSet, int i, Map<String, Object> map, boolean z) {
        super(context, attributeSet, i);
        this.b = "WebView";
        this.e = false;
        this.h = null;
        this.i = null;
        this.a = 0;
        this.k = false;
        this.m = false;
        this.o = null;
        this.p = null;
        this.r = 1;
        this.s = 2;
        this.t = 3;
        this.u = "javascript:document.getElementsByTagName('HEAD').item(0).removeChild(document.getElementById('QQBrowserSDKNightMode'));";
        this.v = "javascript:var style = document.createElement('style');style.type='text/css';style.id='QQBrowserSDKNightMode';style.innerHTML='html,body{background:none !important;background-color: #1d1e2a !important;}html *{background-color: #1d1e2a !important; color:#888888 !important;border-color:#3e4f61 !important;text-shadow:none !important;box-shadow:none !important;}a,a *{border-color:#4c5b99 !important; color:#2d69b3 !important;text-decoration:none !important;}a:visited,a:visited *{color:#a600a6 !important;}a:active,a:active *{color:#5588AA !important;}input,select,textarea,option,button{background-image:none !important;color:#AAAAAA !important;border-color:#4c5b99 !important;}form,div,button,span{background-color:#1d1e2a !important; border-color:#4c5b99 !important;}img{opacity:0.5}';document.getElementsByTagName('HEAD').item(0).appendChild(style);";
        this.y = null;
        this.z = null;
        mWebViewCreated = true;
        com.tencent.smtt.utils.r.a("0");
        if (QbSdk.getIsSysWebViewForcedByOuter() && TbsShareManager.isThirdPartyApp(context)) {
            this.i = context;
            this.f = null;
            this.e = false;
            QbSdk.a(context, "failed to createTBSWebview!");
            this.g = new a(context, attributeSet);
            CookieManager.getInstance().a(context, true, false);
            CookieSyncManager.createInstance(this.i).startSync();
            try {
                Method declaredMethod = Class.forName("android.webkit.WebViewWorker").getDeclaredMethod("getHandler", new Class[0]);
                declaredMethod.setAccessible(true);
                ((Handler) declaredMethod.invoke(null, new Object[0])).getLooper().getThread().setUncaughtExceptionHandler(new h());
                mSysWebviewCreated = true;
            } catch (Exception unused) {
            }
            CookieManager.getInstance().a();
            this.g.setFocusableInTouchMode(true);
            addView(this.g, new FrameLayout.LayoutParams(-1, -1));
            TbsLog.i("WebView", "SystemWebView Created Success! #3, SysWebViewForcedByOuter.");
            TbsLog.e("WebView", "sys WebView: IsSysWebViewForcedByOuter = true", true);
            TbsCoreLoadStat.getInstance().a(context, 402);
            return;
        }
        if (TbsShareManager.isThirdPartyApp(context)) {
            TbsLog.setWriteLogJIT(true);
        } else {
            TbsLog.setWriteLogJIT(false);
        }
        TbsLog.initIfNeed(context);
        if (context == null) {
            throw new IllegalArgumentException("Invalid context argument");
        }
        if (l == null) {
            l = com.tencent.smtt.utils.o.a(context);
        }
        if (l.a) {
            TbsLog.e("WebView", "sys WebView: debug.conf force syswebview", true);
            QbSdk.a(context, "debug.conf force syswebview!");
        }
        c(context);
        this.i = context;
        if (context != null) {
            j = context.getApplicationContext();
        }
        if (!this.e || QbSdk.a) {
            this.f = null;
            if (TbsShareManager.isThirdPartyApp(this.i)) {
                this.g = new a(context, attributeSet);
            } else {
                this.g = new a(this, context);
            }
            TbsLog.i("WebView", "SystemWebView Created Success! #2");
            if (TbsShareManager.isThirdPartyApp(context)) {
                com.tencent.smtt.utils.r.a(context, "x5_webview_fail", "");
            }
            CookieManager.getInstance().a(context, true, false);
            CookieManager.getInstance().a();
            this.g.setFocusableInTouchMode(true);
            addView(this.g, new FrameLayout.LayoutParams(-1, -1));
            setDownloadListener(null);
            TbsLog.writeLogToDisk();
            p.a(context);
        } else {
            this.f = x.a().a(true).a(context);
            if (this.f == null || this.f.getView() == null) {
                TbsLog.e("WebView", "sys WebView: failed to createTBSWebview", true);
                this.f = null;
                this.e = false;
                QbSdk.a(context, "failed to createTBSWebview!");
                c(context);
                if (TbsShareManager.isThirdPartyApp(this.i)) {
                    this.g = new a(context, attributeSet);
                } else {
                    this.g = new a(this, context);
                }
                TbsLog.i("WebView", "SystemWebView Created Success! #1");
                CookieManager.getInstance().a(context, true, false);
                CookieManager.getInstance().a();
                this.g.setFocusableInTouchMode(true);
                addView(this.g, new FrameLayout.LayoutParams(-1, -1));
                try {
                    if (Build.VERSION.SDK_INT >= 11) {
                        removeJavascriptInterface("searchBoxJavaBridge_");
                        removeJavascriptInterface("accessibility");
                        removeJavascriptInterface("accessibilityTraversal");
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                TbsLog.writeLogToDisk();
                p.a(context);
                return;
            }
            TbsLog.i("WebView", "X5 WebView Created Success!!");
            if (TbsShareManager.isThirdPartyApp(context)) {
                StringBuilder sb = new StringBuilder();
                sb.append(QbSdk.getTbsVersion(context));
                com.tencent.smtt.utils.r.a(context, "x5_webview_ok", sb.toString());
            }
            com.tencent.smtt.utils.r.a("20");
            this.f.getView().setFocusableInTouchMode(true);
            a(attributeSet);
            addView(this.f.getView(), new FrameLayout.LayoutParams(-1, -1));
            this.f.setDownloadListener(new b(this, null, this.e));
            this.f.getX5WebViewExtension().setWebViewClientExtension(new X5ProxyWebViewClientExtension(x.a().a(true).k()) { // from class: com.tencent.smtt.sdk.WebView.1
                @Override // com.tencent.smtt.export.external.extension.proxy.ProxyWebViewClientExtension, com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
                public void invalidate() {
                }

                @Override // com.tencent.smtt.export.external.extension.proxy.ProxyWebViewClientExtension, com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
                public void onScrollChanged(int i2, int i3, int i4, int i5) {
                    super.onScrollChanged(i2, i3, i4, i5);
                    WebView.this.onScrollChanged(i4, i5, i2, i3);
                }
            });
        }
        try {
            if (Build.VERSION.SDK_INT >= 11) {
                removeJavascriptInterface("searchBoxJavaBridge_");
                removeJavascriptInterface("accessibility");
                removeJavascriptInterface("accessibilityTraversal");
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        if (("com.tencent.mobileqq".equals(this.i.getApplicationInfo().packageName) || "com.tencent.mm".equals(this.i.getApplicationInfo().packageName)) && g.a(true).h() && Build.VERSION.SDK_INT >= 11) {
            setLayerType(1, null);
        }
        if (this.f != null) {
            TbsLog.writeLogToDisk();
            if (!TbsShareManager.isThirdPartyApp(context)) {
                int i2 = TbsDownloadConfig.getInstance(context).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DECOUPLECOREVERSION, 0);
                if (i2 <= 0 || i2 == p.a().i(context) || i2 != p.a().j(context)) {
                    TbsLog.i("WebView", "webview construction #1 deCoupleCoreVersion is " + i2 + " getTbsCoreShareDecoupleCoreVersion is " + p.a().i(context) + " getTbsCoreInstalledVerInNolock is " + p.a().j(context));
                } else {
                    p.a().o(context);
                }
            }
        }
        QbSdk.continueLoadSo(context);
    }

    @Deprecated
    public WebView(Context context, AttributeSet attributeSet, int i, boolean z) {
        this(context, attributeSet, i, null, z);
    }

    public WebView(Context context, boolean z) {
        super(context);
        this.b = "WebView";
        this.e = false;
        this.h = null;
        this.i = null;
        this.a = 0;
        this.k = false;
        this.m = false;
        this.o = null;
        this.p = null;
        this.r = 1;
        this.s = 2;
        this.t = 3;
        this.u = "javascript:document.getElementsByTagName('HEAD').item(0).removeChild(document.getElementById('QQBrowserSDKNightMode'));";
        this.v = "javascript:var style = document.createElement('style');style.type='text/css';style.id='QQBrowserSDKNightMode';style.innerHTML='html,body{background:none !important;background-color: #1d1e2a !important;}html *{background-color: #1d1e2a !important; color:#888888 !important;border-color:#3e4f61 !important;text-shadow:none !important;box-shadow:none !important;}a,a *{border-color:#4c5b99 !important; color:#2d69b3 !important;text-decoration:none !important;}a:visited,a:visited *{color:#a600a6 !important;}a:active,a:active *{color:#5588AA !important;}input,select,textarea,option,button{background-image:none !important;color:#AAAAAA !important;border-color:#4c5b99 !important;}form,div,button,span{background-color:#1d1e2a !important; border-color:#4c5b99 !important;}img{opacity:0.5}';document.getElementsByTagName('HEAD').item(0).appendChild(style);";
        this.y = null;
        this.z = null;
    }

    private void a(AttributeSet attributeSet) {
        View view;
        if (attributeSet != null) {
            try {
                int attributeCount = attributeSet.getAttributeCount();
                for (int i = 0; i < attributeCount; i++) {
                    if (attributeSet.getAttributeName(i).equalsIgnoreCase("scrollbars")) {
                        int[] intArray = getResources().getIntArray(16842974);
                        int attributeIntValue = attributeSet.getAttributeIntValue(i, -1);
                        if (attributeIntValue == intArray[1]) {
                            this.f.getView().setVerticalScrollBarEnabled(false);
                            view = this.f.getView();
                        } else if (attributeIntValue == intArray[2]) {
                            this.f.getView().setVerticalScrollBarEnabled(false);
                        } else if (attributeIntValue == intArray[3]) {
                            view = this.f.getView();
                        }
                        view.setHorizontalScrollBarEnabled(false);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        boolean z2;
        com.tencent.smtt.utils.r.b("old03");
        if (!this.k && this.a != 0) {
            com.tencent.smtt.utils.r.b("old04");
            this.k = true;
            String str = "";
            String str2 = "";
            String str3 = "";
            if (this.e) {
                com.tencent.smtt.utils.r.b("old05");
                Bundle sdkQBStatisticsInfo = this.f.getX5WebViewExtension().getSdkQBStatisticsInfo();
                if (sdkQBStatisticsInfo != null) {
                    str = sdkQBStatisticsInfo.getString("guid");
                    str2 = sdkQBStatisticsInfo.getString("qua2");
                    str3 = sdkQBStatisticsInfo.getString("lc");
                }
                com.tencent.smtt.utils.r.b("old06");
            }
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            if ("com.qzone".equals(this.i.getApplicationInfo().packageName)) {
                int e = e(this.i);
                if (e == -1) {
                    e = this.a;
                }
                this.a = e;
                f(this.i);
            }
            try {
                com.tencent.smtt.utils.r.b("old07");
                z2 = this.f.getX5WebViewExtension().isX5CoreSandboxMode();
            } catch (Throwable th) {
                TbsLog.w("tbsWebviewDestroy", "exception: " + th);
                z2 = false;
            }
            com.tencent.smtt.utils.r.b("old08");
            com.tencent.smtt.sdk.stat.b.a(this.i, str4, str5, str6, this.a, this.e, i(), z2);
            com.tencent.smtt.utils.r.b("old09");
            this.a = 0;
            this.k = false;
        }
        com.tencent.smtt.utils.r.b("old10");
        if (this.e) {
            com.tencent.smtt.utils.r.b("old18");
            if (z) {
                this.f.destroy();
            }
            com.tencent.smtt.utils.r.b("old19");
        } else {
            try {
                com.tencent.smtt.utils.r.b("old11");
                Class<?> cls = Class.forName("android.webkit.WebViewClassic");
                Method method = cls.getMethod("fromWebView", android.webkit.WebView.class);
                method.setAccessible(true);
                Object invoke = method.invoke(null, this.g);
                if (invoke != null) {
                    com.tencent.smtt.utils.r.b("old12");
                    Field declaredField = cls.getDeclaredField("mListBoxDialog");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(invoke);
                    if (obj != null) {
                        com.tencent.smtt.utils.r.b("old13");
                        Dialog dialog = (Dialog) obj;
                        dialog.setOnCancelListener(null);
                        Class<?> cls2 = Class.forName("android.app.Dialog");
                        Field declaredField2 = cls2.getDeclaredField("CANCEL");
                        declaredField2.setAccessible(true);
                        int intValue = ((Integer) declaredField2.get(dialog)).intValue();
                        Field declaredField3 = cls2.getDeclaredField("mListenersHandler");
                        declaredField3.setAccessible(true);
                        ((Handler) declaredField3.get(dialog)).removeMessages(intValue);
                    }
                }
            } catch (Exception unused) {
            }
            com.tencent.smtt.utils.r.b("old14");
            if (z) {
                this.g.destroy();
            }
            try {
                com.tencent.smtt.utils.r.b("old15");
                TbsLog.i("sdkreport", "webview.tbsWebviewDestroy mQQMusicCrashFix is " + this.m);
                if (this.m) {
                    return;
                }
                Field declaredField4 = Class.forName("android.webkit.BrowserFrame").getDeclaredField("sConfigCallback");
                declaredField4.setAccessible(true);
                ComponentCallbacks componentCallbacks = (ComponentCallbacks) declaredField4.get(null);
                if (componentCallbacks != null) {
                    com.tencent.smtt.utils.r.b("old16");
                    declaredField4.set(null, null);
                    Field declaredField5 = Class.forName("android.view.ViewRoot").getDeclaredField("sConfigCallbacks");
                    declaredField5.setAccessible(true);
                    Object obj2 = declaredField5.get(null);
                    if (obj2 != null) {
                        List list = (List) obj2;
                        synchronized (list) {
                            list.remove(componentCallbacks);
                        }
                    }
                }
                com.tencent.smtt.utils.r.b("old17");
            } catch (Exception unused2) {
            }
        }
        TbsLog.i("WebView", "X5 GUID = " + QbSdk.b());
    }

    private boolean a(View view) {
        Object a2;
        if ((this.i == null || getTbsCoreVersion(this.i) <= 36200) && (a2 = com.tencent.smtt.utils.i.a(this.y, "onLongClick", new Class[]{View.class}, view)) != null) {
            return ((Boolean) a2).booleanValue();
        }
        return false;
    }

    private boolean a(WebChromeClient webChromeClient) {
        if (webChromeClient == null) {
            return false;
        }
        boolean z = false;
        boolean z2 = false;
        for (Class<?> cls = webChromeClient.getClass(); cls != WebChromeClient.class && (!z || !z2); cls = cls.getSuperclass()) {
            if (!z) {
                try {
                    cls.getDeclaredMethod("onShowCustomView", View.class, IX5WebChromeClient.CustomViewCallback.class);
                    z = true;
                } catch (NoSuchMethodException unused) {
                }
            }
            if (!z2) {
                try {
                    cls.getDeclaredMethod("onHideCustomView", new Class[0]);
                    z2 = true;
                } catch (NoSuchMethodException unused2) {
                }
            }
        }
        return z && z2;
    }

    private boolean b(Context context) {
        try {
            return context.getPackageName().indexOf("com.tencent.mobileqq") >= 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c() {
        try {
            new Thread(new Runnable() { // from class: com.tencent.smtt.sdk.WebView.8
                @Override // java.lang.Runnable
                public final void run() {
                    if (WebView.j == null) {
                        TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--mAppContext == null");
                        return;
                    }
                    g a2 = g.a(true);
                    if (g.b) {
                        TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--needReboot = true");
                        return;
                    }
                    n a3 = n.a(WebView.j);
                    int c2 = a3.c();
                    TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--installStatus = " + c2);
                    if (c2 == 2) {
                        TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--install setTbsNeedReboot true");
                        a2.a(String.valueOf(a3.b()));
                        a2.b(true);
                        return;
                    }
                    int b = a3.b("copy_status");
                    TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--copyStatus = " + b);
                    if (b == 1) {
                        TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--copy setTbsNeedReboot true");
                        a2.a(String.valueOf(a3.c("copy_core_ver")));
                        a2.b(true);
                    } else if (x.a().b()) {
                    } else {
                        if (c2 == 3 || b == 3) {
                            TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--setTbsNeedReboot true");
                            a2.a(String.valueOf(g.d()));
                            a2.b(true);
                        }
                    }
                }
            }).start();
        } catch (Throwable th) {
            TbsLog.e("webview", "updateRebootStatus excpetion: " + th);
        }
    }

    private void c(Context context) {
        if (QbSdk.i && TbsShareManager.isThirdPartyApp(context)) {
            TbsExtensionFunctionManager.getInstance().initTbsBuglyIfNeed(context);
        }
        x a2 = x.a();
        a2.a(context);
        this.e = a2.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context d(Context context) {
        return (Build.VERSION.SDK_INT < 21 || Build.VERSION.SDK_INT > 22) ? context : context.createConfigurationContext(new Configuration());
    }

    @Deprecated
    public static void disablePlatformNotifications() {
        if (x.a().b()) {
            return;
        }
        com.tencent.smtt.utils.i.a("android.webkit.WebView", "disablePlatformNotifications");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int e(Context context) {
        FileLock a2;
        String str;
        StringBuilder sb;
        FileOutputStream b = FileUtil.b(context, true, "tbslock.txt");
        if (b == null || (a2 = FileUtil.a(context, b)) == null) {
            return -1;
        }
        if (!c.tryLock()) {
            FileUtil.a(a2, b);
            return -1;
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                File tbsFolderDir = QbSdk.getTbsFolderDir(context);
                File file = new File(tbsFolderDir + File.separator + "core_private", "pv.db");
                if (file.exists()) {
                    Properties properties = new Properties();
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        properties.load(fileInputStream2);
                        fileInputStream2.close();
                        String property = properties.getProperty(QuickReportConstants.PV_CONFIG);
                        if (property != null) {
                            int parseInt = Integer.parseInt(property);
                            try {
                                fileInputStream2.close();
                            } catch (IOException e) {
                                TbsLog.e("getTbsCorePV", "TbsInstaller--getTbsCorePV IOException=" + e.toString());
                            }
                            c.unlock();
                            FileUtil.a(a2, b);
                            return parseInt;
                        }
                        try {
                            fileInputStream2.close();
                        } catch (IOException e2) {
                            e = e2;
                            str = "getTbsCorePV";
                            sb = new StringBuilder("TbsInstaller--getTbsCorePV IOException=");
                            sb.append(e.toString());
                            TbsLog.e(str, sb.toString());
                            c.unlock();
                            FileUtil.a(a2, b);
                            return -1;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        fileInputStream = fileInputStream2;
                        TbsLog.e("getTbsCorePV", "TbsInstaller--getTbsCorePV Exception=" + e.toString());
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e4) {
                                e = e4;
                                str = "getTbsCorePV";
                                sb = new StringBuilder("TbsInstaller--getTbsCorePV IOException=");
                                sb.append(e.toString());
                                TbsLog.e(str, sb.toString());
                                c.unlock();
                                FileUtil.a(a2, b);
                                return -1;
                            }
                        }
                        c.unlock();
                        FileUtil.a(a2, b);
                        return -1;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e5) {
                                TbsLog.e("getTbsCorePV", "TbsInstaller--getTbsCorePV IOException=" + e5.toString());
                            }
                        }
                        c.unlock();
                        FileUtil.a(a2, b);
                        throw th;
                    }
                }
            } catch (Exception e6) {
                e = e6;
            }
            c.unlock();
            FileUtil.a(a2, b);
            return -1;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Deprecated
    public static void enablePlatformNotifications() {
        if (x.a().b()) {
            return;
        }
        com.tencent.smtt.utils.i.a("android.webkit.WebView", "enablePlatformNotifications");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Context context) {
        try {
            File tbsFolderDir = QbSdk.getTbsFolderDir(context);
            File file = new File(tbsFolderDir + File.separator + "core_private", "pv.db");
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception e) {
            TbsLog.i("getTbsCorePV", "TbsInstaller--getTbsCorePV Exception=" + e.toString());
        }
    }

    @Deprecated
    public static String findAddress(String str) {
        if (x.a().b()) {
            return null;
        }
        return android.webkit.WebView.findAddress(str);
    }

    private void g() {
        String str;
        synchronized (WebView.class) {
            com.tencent.smtt.utils.r.b("new01");
            if (!this.k && this.a != 0) {
                j();
            }
            com.tencent.smtt.utils.r.b("new02");
        }
        if (this.e) {
            com.tencent.smtt.utils.r.b("new08");
            this.f.destroy();
            str = "new09";
        } else {
            com.tencent.smtt.utils.r.b("new03");
            this.g.destroy();
            com.tencent.smtt.utils.r.b("new04");
            try {
                TbsLog.i("sdkreport", "webview.destroyImplNow mQQMusicCrashFix is " + this.m);
                if (this.m) {
                    return;
                }
                Field declaredField = Class.forName("android.webkit.BrowserFrame").getDeclaredField("sConfigCallback");
                declaredField.setAccessible(true);
                ComponentCallbacks componentCallbacks = (ComponentCallbacks) declaredField.get(null);
                com.tencent.smtt.utils.r.b("new05");
                if (componentCallbacks != null) {
                    declaredField.set(null, null);
                    Field declaredField2 = Class.forName("android.view.ViewRoot").getDeclaredField("sConfigCallbacks");
                    declaredField2.setAccessible(true);
                    Object obj = declaredField2.get(null);
                    if (obj != null) {
                        List list = (List) obj;
                        synchronized (list) {
                            list.remove(componentCallbacks);
                        }
                    }
                }
                com.tencent.smtt.utils.r.b("new06");
                return;
            } catch (Exception unused) {
                str = "new07";
            }
        }
        com.tencent.smtt.utils.r.b(str);
    }

    public static String getCrashExtraMessage(Context context) {
        if (context == null) {
            return "";
        }
        String str = "tbs_core_version:" + QbSdk.getTbsVersionForCrash(context) + ";tbs_sdk_version:44165;";
        boolean z = false;
        if ("com.tencent.mm".equals(context.getApplicationInfo().packageName)) {
            try {
                Class.forName("de.robv.android.xposed.XposedBridge");
                z = true;
            } catch (ClassNotFoundException unused) {
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (z) {
            return str + "isXposed=true;";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(g.a(true).e());
        sb.append("\n");
        sb.append(str);
        if (!TbsShareManager.isThirdPartyApp(context) && QbSdk.o != null && QbSdk.o.containsKey(TbsCoreSettings.TBS_SETTINGS_WEAPP_ID_KEY) && QbSdk.o.containsKey(TbsCoreSettings.TBS_SETTINGS_WEAPP_NAME_KEY)) {
            sb.append("\n");
            sb.append("weapp_id:" + QbSdk.o.get(TbsCoreSettings.TBS_SETTINGS_WEAPP_ID_KEY) + ";weapp_name" + CommonConstant.Symbol.COLON + QbSdk.o.get(TbsCoreSettings.TBS_SETTINGS_WEAPP_NAME_KEY) + ";");
        }
        return sb.length() > 8192 ? sb.substring(sb.length() - 8192) : sb.toString();
    }

    public static PackageInfo getCurrentWebViewPackage() {
        if (x.a().b() || Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            return (PackageInfo) com.tencent.smtt.utils.i.a("android.webkit.WebView", "getCurrentWebViewPackage");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Deprecated
    public static synchronized Object getPluginList() {
        synchronized (WebView.class) {
            if (x.a().b()) {
                return null;
            }
            return com.tencent.smtt.utils.i.a("android.webkit.WebView", "getPluginList");
        }
    }

    public static int getTbsCoreVersion(Context context) {
        return QbSdk.getTbsVersion(context);
    }

    public static boolean getTbsNeedReboot() {
        c();
        return g.a(true).f();
    }

    public static int getTbsSDKVersion(Context context) {
        return 44165;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [com.tencent.smtt.sdk.WebView$2] */
    private void h() {
        try {
            com.tencent.smtt.utils.r.b("old01");
            if (!"com.xunmeng.pinduoduo".equals(this.i.getApplicationInfo().packageName)) {
                com.tencent.smtt.utils.r.b("old02");
                a(true);
                return;
            }
            new Thread("WebviewDestroy") { // from class: com.tencent.smtt.sdk.WebView.2
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    WebView.this.a(false);
                }
            }.start();
            if (this.e) {
                this.f.destroy();
            } else {
                this.g.destroy();
            }
        } catch (Throwable unused) {
            com.tencent.smtt.utils.r.b("old30");
            a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long i() {
        long j2;
        synchronized (QbSdk.h) {
            if (QbSdk.e) {
                QbSdk.g += System.currentTimeMillis() - QbSdk.f;
                TbsLog.d("sdkreport", "pv report, WebView.getWifiConnectedTime QbSdk.sWifiConnectedTime=" + QbSdk.g);
            }
            j2 = QbSdk.g / 1000;
            QbSdk.g = 0L;
            QbSdk.f = System.currentTimeMillis();
        }
        return j2;
    }

    private void j() {
        new Thread(new Runnable() { // from class: com.tencent.smtt.sdk.WebView.7
            @Override // java.lang.Runnable
            public void run() {
                Bundle sdkQBStatisticsInfo;
                if (WebView.this.k || WebView.this.a == 0) {
                    return;
                }
                synchronized (WebView.class) {
                    if (!WebView.this.k && WebView.this.a != 0) {
                        WebView.this.k = true;
                        String str = "";
                        String str2 = "";
                        String str3 = "";
                        if (WebView.this.e && (sdkQBStatisticsInfo = WebView.this.f.getX5WebViewExtension().getSdkQBStatisticsInfo()) != null) {
                            str = sdkQBStatisticsInfo.getString("guid");
                            str2 = sdkQBStatisticsInfo.getString("qua2");
                            str3 = sdkQBStatisticsInfo.getString("lc");
                        }
                        String str4 = str2;
                        String str5 = str3;
                        String str6 = str;
                        if ("com.qzone".equals(WebView.this.i.getApplicationInfo().packageName)) {
                            int e = WebView.this.e(WebView.this.i);
                            WebView webView = WebView.this;
                            if (e == -1) {
                                e = WebView.this.a;
                            }
                            webView.a = e;
                            WebView.this.f(WebView.this.i);
                        }
                        com.tencent.smtt.sdk.stat.b.a(WebView.this.i, str6, str4, str5, WebView.this.a, WebView.this.e, WebView.this.i(), WebView.this.f.getX5WebViewExtension().isX5CoreSandboxMode());
                        WebView.this.a = 0;
                        WebView.this.k = false;
                    }
                }
            }
        }).start();
    }

    public static void setDataDirectorySuffix(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                com.tencent.smtt.utils.i.a(Class.forName("android.webkit.WebView"), "setDataDirectorySuffix", (Class<?>[]) new Class[]{String.class}, str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("data_directory_suffix", str);
        QbSdk.initTbsSettings(hashMap);
    }

    public static synchronized void setSysDayOrNight(boolean z) {
        synchronized (WebView.class) {
            if (z == x) {
                return;
            }
            x = z;
            if (w == null) {
                Paint paint = new Paint();
                w = paint;
                paint.setColor(-16777216);
            }
            if (z) {
                if (w.getAlpha() != 255) {
                    w.setAlpha(255);
                }
            } else if (w.getAlpha() != NIGHT_MODE_ALPHA) {
                w.setAlpha(NIGHT_MODE_ALPHA);
            }
        }
    }

    public static void setWebContentsDebuggingEnabled(boolean z) {
        x a2 = x.a();
        if (a2 != null && a2.b()) {
            a2.c().a(z);
        } else if (Build.VERSION.SDK_INT >= 19) {
            try {
                Method declaredMethod = Class.forName("android.webkit.WebView").getDeclaredMethod("setWebContentsDebuggingEnabled", Boolean.TYPE);
                n = declaredMethod;
                if (declaredMethod != null) {
                    n.setAccessible(true);
                    n.invoke(null, Boolean.valueOf(z));
                }
            } catch (Exception e) {
                TbsLog.e("QbSdk", "Exception:" + e.getStackTrace());
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public android.webkit.WebView a() {
        if (this.e) {
            return null;
        }
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context) {
        int e;
        String str;
        if (e(context) != -1) {
            str = "PV=" + String.valueOf(e + 1);
        } else {
            str = "PV=1";
        }
        File file = new File(QbSdk.getTbsFolderDir(context) + File.separator + "core_private", "pv.db");
        try {
            file.getParentFile().mkdirs();
            if (!file.isFile() || !file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file, false);
            d = fileOutputStream;
            fileOutputStream.write(str.getBytes());
            if (d != null) {
                d.flush();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(android.webkit.WebView webView) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(IX5WebViewBase iX5WebViewBase) {
        this.f = iX5WebViewBase;
    }

    public void addJavascriptInterface(Object obj, String str) {
        if (this.e) {
            this.f.addJavascriptInterface(obj, str);
        } else {
            this.g.addJavascriptInterface(obj, str);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (!this.e) {
            this.g.addView(view);
            return;
        }
        View view2 = this.f.getView();
        try {
            Method a2 = com.tencent.smtt.utils.i.a(view2, "addView", View.class);
            a2.setAccessible(true);
            a2.invoke(view2, view);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IX5WebViewBase b() {
        return this.f;
    }

    public boolean canGoBack() {
        return !this.e ? this.g.canGoBack() : this.f.canGoBack();
    }

    public boolean canGoBackOrForward(int i) {
        return !this.e ? this.g.canGoBackOrForward(i) : this.f.canGoBackOrForward(i);
    }

    public boolean canGoForward() {
        return !this.e ? this.g.canGoForward() : this.f.canGoForward();
    }

    @Deprecated
    public boolean canZoomIn() {
        Object a2;
        if (this.e) {
            return this.f.canZoomIn();
        }
        if (Build.VERSION.SDK_INT < 11 || (a2 = com.tencent.smtt.utils.i.a(this.g, "canZoomIn")) == null) {
            return false;
        }
        return ((Boolean) a2).booleanValue();
    }

    @Deprecated
    public boolean canZoomOut() {
        Object a2;
        if (this.e) {
            return this.f.canZoomOut();
        }
        if (Build.VERSION.SDK_INT < 11 || (a2 = com.tencent.smtt.utils.i.a(this.g, "canZoomOut")) == null) {
            return false;
        }
        return ((Boolean) a2).booleanValue();
    }

    @Deprecated
    public Picture capturePicture() {
        if (this.e) {
            return this.f.capturePicture();
        }
        Object a2 = com.tencent.smtt.utils.i.a(this.g, "capturePicture");
        if (a2 == null) {
            return null;
        }
        return (Picture) a2;
    }

    public void clearCache(boolean z) {
        if (this.e) {
            this.f.clearCache(z);
        } else {
            this.g.clearCache(z);
        }
    }

    public void clearFormData() {
        if (this.e) {
            this.f.clearFormData();
        } else {
            this.g.clearFormData();
        }
    }

    public void clearHistory() {
        if (this.e) {
            this.f.clearHistory();
        } else {
            this.g.clearHistory();
        }
    }

    @TargetApi(3)
    public void clearMatches() {
        if (this.e) {
            this.f.clearMatches();
        } else {
            this.g.clearMatches();
        }
    }

    public void clearSslPreferences() {
        if (this.e) {
            this.f.clearSslPreferences();
        } else {
            this.g.clearSslPreferences();
        }
    }

    @Deprecated
    public void clearView() {
        if (this.e) {
            this.f.clearView();
        } else {
            com.tencent.smtt.utils.i.a(this.g, "clearView");
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        try {
            if (this.e) {
                Method a2 = com.tencent.smtt.utils.i.a(this.f.getView(), "computeHorizontalScrollExtent", new Class[0]);
                a2.setAccessible(true);
                return ((Integer) a2.invoke(this.f.getView(), new Object[0])).intValue();
            }
            Method a3 = com.tencent.smtt.utils.i.a(this.g, "computeHorizontalScrollExtent", new Class[0]);
            a3.setAccessible(true);
            return ((Integer) a3.invoke(this.g, new Object[0])).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        try {
            if (this.e) {
                Method a2 = com.tencent.smtt.utils.i.a(this.f.getView(), "computeHorizontalScrollOffset", new Class[0]);
                a2.setAccessible(true);
                return ((Integer) a2.invoke(this.f.getView(), new Object[0])).intValue();
            }
            Method a3 = com.tencent.smtt.utils.i.a(this.g, "computeHorizontalScrollOffset", new Class[0]);
            a3.setAccessible(true);
            return ((Integer) a3.invoke(this.g, new Object[0])).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        try {
            if (this.e) {
                return ((Integer) com.tencent.smtt.utils.i.a(this.f.getView(), "computeHorizontalScrollRange", new Class[0], new Object[0])).intValue();
            }
            Method a2 = com.tencent.smtt.utils.i.a(this.g, "computeHorizontalScrollRange", new Class[0]);
            a2.setAccessible(true);
            return ((Integer) a2.invoke(this.g, new Object[0])).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.e) {
            this.f.computeScroll();
        } else {
            this.g.computeScroll();
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        try {
            if (this.e) {
                Method a2 = com.tencent.smtt.utils.i.a(this.f.getView(), "computeVerticalScrollExtent", new Class[0]);
                a2.setAccessible(true);
                return ((Integer) a2.invoke(this.f.getView(), new Object[0])).intValue();
            }
            Method a3 = com.tencent.smtt.utils.i.a(this.g, "computeVerticalScrollExtent", new Class[0]);
            a3.setAccessible(true);
            return ((Integer) a3.invoke(this.g, new Object[0])).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        try {
            if (this.e) {
                Method a2 = com.tencent.smtt.utils.i.a(this.f.getView(), "computeVerticalScrollOffset", new Class[0]);
                a2.setAccessible(true);
                return ((Integer) a2.invoke(this.f.getView(), new Object[0])).intValue();
            }
            Method a3 = com.tencent.smtt.utils.i.a(this.g, "computeVerticalScrollOffset", new Class[0]);
            a3.setAccessible(true);
            return ((Integer) a3.invoke(this.g, new Object[0])).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        try {
            if (this.e) {
                return ((Integer) com.tencent.smtt.utils.i.a(this.f.getView(), "computeVerticalScrollRange", new Class[0], new Object[0])).intValue();
            }
            Method a2 = com.tencent.smtt.utils.i.a(this.g, "computeVerticalScrollRange", new Class[0]);
            a2.setAccessible(true);
            return ((Integer) a2.invoke(this.g, new Object[0])).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public WebBackForwardList copyBackForwardList() {
        return this.e ? WebBackForwardList.a(this.f.copyBackForwardList()) : WebBackForwardList.a(this.g.copyBackForwardList());
    }

    public Object createPrintDocumentAdapter(String str) {
        if (!this.e) {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return com.tencent.smtt.utils.i.a(this.g, "createPrintDocumentAdapter", new Class[]{String.class}, str);
        }
        try {
            return this.f.createPrintDocumentAdapter(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public void customDiskCachePathEnabled(boolean z, String str) {
        if (!this.e || getX5WebViewExtension() == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("enabled", z);
        bundle.putString("path", str);
        getX5WebViewExtension().invokeMiscMethod("customDiskCachePathEnabled", bundle);
    }

    public void destroy() {
        boolean z = false;
        this.m = false;
        try {
            if (this.i.getApplicationInfo().packageName.contains("com.tencent.qqmusic") && (Build.VERSION.SDK_INT == 21 || Build.VERSION.SDK_INT == 22)) {
                this.m = true;
                if (!com.tencent.smtt.utils.r.f(this.i)) {
                    z = true;
                }
            }
        } catch (Throwable th) {
            TbsLog.i("webview", "stack is " + Log.getStackTraceString(th));
        }
        TbsLog.i("webview", "destroy forceDestoyOld is " + z);
        if (z) {
            h();
        } else {
            g();
        }
    }

    public void documentHasImages(Message message) {
        if (this.e) {
            this.f.documentHasImages(message);
        } else {
            this.g.documentHasImages(message);
        }
    }

    public void dumpViewHierarchyWithProperties(BufferedWriter bufferedWriter, int i) {
        if (this.e) {
            this.f.dumpViewHierarchyWithProperties(bufferedWriter, i);
        } else {
            com.tencent.smtt.utils.i.a(this.g, "dumpViewHierarchyWithProperties", new Class[]{BufferedWriter.class, Integer.TYPE}, bufferedWriter, Integer.valueOf(i));
        }
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (this.e) {
            try {
                Method a2 = com.tencent.smtt.utils.i.a(this.f.getView(), "evaluateJavascript", String.class, android.webkit.ValueCallback.class);
                a2.setAccessible(true);
                a2.invoke(this.f.getView(), str, valueCallback);
            } catch (Exception e) {
                e.printStackTrace();
                loadUrl(str);
            }
        } else if (Build.VERSION.SDK_INT >= 19) {
            try {
                Method declaredMethod = Class.forName("android.webkit.WebView").getDeclaredMethod("evaluateJavascript", String.class, android.webkit.ValueCallback.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(this.g, str, valueCallback);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Deprecated
    public int findAll(String str) {
        if (this.e) {
            return this.f.findAll(str);
        }
        Object a2 = com.tencent.smtt.utils.i.a(this.g, "findAll", new Class[]{String.class}, str);
        if (a2 == null) {
            return 0;
        }
        return ((Integer) a2).intValue();
    }

    @TargetApi(16)
    public void findAllAsync(String str) {
        if (this.e) {
            this.f.findAllAsync(str);
        } else if (Build.VERSION.SDK_INT >= 16) {
            com.tencent.smtt.utils.i.a(this.g, "findAllAsync", new Class[]{String.class}, str);
        }
    }

    public View findHierarchyView(String str, int i) {
        return !this.e ? (View) com.tencent.smtt.utils.i.a(this.g, "findHierarchyView", new Class[]{String.class, Integer.TYPE}, str, Integer.valueOf(i)) : this.f.findHierarchyView(str, i);
    }

    @TargetApi(3)
    public void findNext(boolean z) {
        if (this.e) {
            this.f.findNext(z);
        } else {
            this.g.findNext(z);
        }
    }

    public void flingScroll(int i, int i2) {
        if (this.e) {
            this.f.flingScroll(i, i2);
        } else {
            this.g.flingScroll(i, i2);
        }
    }

    @Deprecated
    public void freeMemory() {
        if (this.e) {
            this.f.freeMemory();
        } else {
            com.tencent.smtt.utils.i.a(this.g, "freeMemory");
        }
    }

    public SslCertificate getCertificate() {
        return !this.e ? this.g.getCertificate() : this.f.getCertificate();
    }

    public int getContentHeight() {
        return !this.e ? this.g.getContentHeight() : this.f.getContentHeight();
    }

    public int getContentWidth() {
        if (this.e) {
            return this.f.getContentWidth();
        }
        Object a2 = com.tencent.smtt.utils.i.a(this.g, "getContentWidth");
        if (a2 == null) {
            return 0;
        }
        return ((Integer) a2).intValue();
    }

    public Bitmap getFavicon() {
        return !this.e ? this.g.getFavicon() : this.f.getFavicon();
    }

    public HitTestResult getHitTestResult() {
        return !this.e ? new HitTestResult(this.g.getHitTestResult()) : new HitTestResult(this.f.getHitTestResult());
    }

    public String[] getHttpAuthUsernamePassword(String str, String str2) {
        return !this.e ? this.g.getHttpAuthUsernamePassword(str, str2) : this.f.getHttpAuthUsernamePassword(str, str2);
    }

    public boolean getIsX5Core() {
        return this.e;
    }

    @TargetApi(3)
    public String getOriginalUrl() {
        return !this.e ? this.g.getOriginalUrl() : this.f.getOriginalUrl();
    }

    public int getProgress() {
        return !this.e ? this.g.getProgress() : this.f.getProgress();
    }

    public boolean getRendererPriorityWaivedWhenNotVisible() {
        Object a2;
        try {
            if (this.e || Build.VERSION.SDK_INT < 26 || (a2 = com.tencent.smtt.utils.i.a(this.g, "getRendererPriorityWaivedWhenNotVisible")) == null) {
                return false;
            }
            return ((Boolean) a2).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public int getRendererRequestedPriority() {
        Object a2;
        try {
            if (this.e || Build.VERSION.SDK_INT < 26 || (a2 = com.tencent.smtt.utils.i.a(this.g, "getRendererRequestedPriority")) == null) {
                return 0;
            }
            return ((Integer) a2).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Deprecated
    public float getScale() {
        if (this.e) {
            return this.f.getScale();
        }
        Object a2 = com.tencent.smtt.utils.i.a(this.g, "getScale");
        if (a2 == null) {
            return 0.0f;
        }
        return ((Float) a2).floatValue();
    }

    @Override // android.view.View
    public int getScrollBarDefaultDelayBeforeFade() {
        if (getView() == null) {
            return 0;
        }
        return getView().getScrollBarDefaultDelayBeforeFade();
    }

    @Override // android.view.View
    public int getScrollBarFadeDuration() {
        if (getView() == null) {
            return 0;
        }
        return getView().getScrollBarFadeDuration();
    }

    @Override // android.view.View
    public int getScrollBarSize() {
        if (getView() == null) {
            return 0;
        }
        return getView().getScrollBarSize();
    }

    @Override // android.view.View
    public int getScrollBarStyle() {
        if (getView() == null) {
            return 0;
        }
        return getView().getScrollBarStyle();
    }

    public WebSettings getSettings() {
        if (this.h != null) {
            return this.h;
        }
        WebSettings webSettings = this.e ? new WebSettings(this.f.getSettings()) : new WebSettings(this.g.getSettings());
        this.h = webSettings;
        return webSettings;
    }

    public IX5WebSettingsExtension getSettingsExtension() {
        if (this.e) {
            return this.f.getX5WebViewExtension().getSettingsExtension();
        }
        return null;
    }

    public int getSysNightModeAlpha() {
        return NIGHT_MODE_ALPHA;
    }

    public String getTitle() {
        return !this.e ? this.g.getTitle() : this.f.getTitle();
    }

    public String getUrl() {
        return !this.e ? this.g.getUrl() : this.f.getUrl();
    }

    public View getView() {
        return !this.e ? this.g : this.f.getView();
    }

    public int getVisibleTitleHeight() {
        if (this.e) {
            return this.f.getVisibleTitleHeight();
        }
        Object a2 = com.tencent.smtt.utils.i.a(this.g, "getVisibleTitleHeight");
        if (a2 == null) {
            return 0;
        }
        return ((Integer) a2).intValue();
    }

    public WebChromeClient getWebChromeClient() {
        return this.p;
    }

    public IX5WebChromeClientExtension getWebChromeClientExtension() {
        if (this.e) {
            return this.f.getX5WebViewExtension().getWebChromeClientExtension();
        }
        return null;
    }

    public int getWebScrollX() {
        return this.e ? this.f.getView().getScrollX() : this.g.getScrollX();
    }

    public int getWebScrollY() {
        return this.e ? this.f.getView().getScrollY() : this.g.getScrollY();
    }

    public WebViewClient getWebViewClient() {
        return this.o;
    }

    public IX5WebViewClientExtension getWebViewClientExtension() {
        if (this.e) {
            return this.f.getX5WebViewExtension().getWebViewClientExtension();
        }
        return null;
    }

    public IX5WebViewBase.HitTestResult getX5HitTestResult() {
        if (this.e) {
            return this.f.getHitTestResult();
        }
        return null;
    }

    public IX5WebViewExtension getX5WebViewExtension() {
        if (this.e) {
            return this.f.getX5WebViewExtension();
        }
        return null;
    }

    @Deprecated
    public View getZoomControls() {
        return !this.e ? (View) com.tencent.smtt.utils.i.a(this.g, "getZoomControls") : this.f.getZoomControls();
    }

    public void goBack() {
        if (this.e) {
            this.f.goBack();
        } else {
            this.g.goBack();
        }
    }

    public void goBackOrForward(int i) {
        if (this.e) {
            this.f.goBackOrForward(i);
        } else {
            this.g.goBackOrForward(i);
        }
    }

    public void goForward() {
        if (this.e) {
            this.f.goForward();
        } else {
            this.g.goForward();
        }
    }

    public void invokeZoomPicker() {
        if (this.e) {
            this.f.invokeZoomPicker();
        } else {
            this.g.invokeZoomPicker();
        }
    }

    public boolean isDayMode() {
        return x;
    }

    public boolean isPrivateBrowsingEnabled() {
        Object a2;
        if (this.e) {
            return this.f.isPrivateBrowsingEnable();
        }
        if (Build.VERSION.SDK_INT < 11 || (a2 = com.tencent.smtt.utils.i.a(this.g, "isPrivateBrowsingEnabled")) == null) {
            return false;
        }
        return ((Boolean) a2).booleanValue();
    }

    public void loadData(String str, String str2, String str3) {
        if (this.e) {
            this.f.loadData(str, str2, str3);
        } else {
            this.g.loadData(str, str2, str3);
        }
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (this.e) {
            this.f.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            this.g.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    public void loadUrl(String str) {
        if (str == null || showDebugView(str)) {
            return;
        }
        if (this.e) {
            this.f.loadUrl(str);
        } else {
            this.g.loadUrl(str);
        }
    }

    @TargetApi(8)
    public void loadUrl(String str, Map<String, String> map) {
        if (str == null || showDebugView(str)) {
            return;
        }
        if (this.e) {
            this.f.loadUrl(str, map);
        } else if (Build.VERSION.SDK_INT >= 8) {
            this.g.loadUrl(str, map);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.k || this.a == 0) {
            return;
        }
        j();
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        if (this.z == null || !this.z.onLongClick(view)) {
            return a(view);
        }
        return true;
    }

    public void onPause() {
        if (this.e) {
            this.f.onPause();
        } else {
            com.tencent.smtt.utils.i.a(this.g, "onPause");
        }
    }

    public void onResume() {
        if (this.e) {
            this.f.onResume();
        } else {
            com.tencent.smtt.utils.i.a(this.g, "onResume");
        }
    }

    @Override // android.view.View
    @TargetApi(11)
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (Build.VERSION.SDK_INT < 21 || !b(this.i) || !isHardwareAccelerated() || i <= 0 || i2 <= 0) {
            return;
        }
        getLayerType();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        if (this.i == null) {
            super.onVisibilityChanged(view, i);
            return;
        }
        if (q == null) {
            q = this.i.getApplicationInfo().packageName;
        }
        if (q != null && (q.equals("com.tencent.mm") || q.equals("com.tencent.mobileqq"))) {
            super.onVisibilityChanged(view, i);
            return;
        }
        if (i != 0 && !this.k && this.a != 0) {
            j();
        }
        super.onVisibilityChanged(view, i);
    }

    public boolean overlayHorizontalScrollbar() {
        return !this.e ? this.g.overlayHorizontalScrollbar() : this.f.overlayHorizontalScrollbar();
    }

    public boolean overlayVerticalScrollbar() {
        return this.e ? this.f.overlayVerticalScrollbar() : this.g.overlayVerticalScrollbar();
    }

    public boolean pageDown(boolean z) {
        return !this.e ? this.g.pageDown(z) : this.f.pageDown(z, -1);
    }

    public boolean pageUp(boolean z) {
        return !this.e ? this.g.pageUp(z) : this.f.pageUp(z, -1);
    }

    public void pauseTimers() {
        if (this.e) {
            this.f.pauseTimers();
        } else {
            this.g.pauseTimers();
        }
    }

    @TargetApi(5)
    public void postUrl(String str, byte[] bArr) {
        if (this.e) {
            this.f.postUrl(str, bArr);
        } else {
            this.g.postUrl(str, bArr);
        }
    }

    @Deprecated
    public void refreshPlugins(boolean z) {
        if (this.e) {
            this.f.refreshPlugins(z);
        } else {
            com.tencent.smtt.utils.i.a(this.g, "refreshPlugins", new Class[]{Boolean.TYPE}, Boolean.valueOf(z));
        }
    }

    public void reload() {
        if (this.e) {
            this.f.reload();
        } else {
            this.g.reload();
        }
    }

    @TargetApi(11)
    public void removeJavascriptInterface(String str) {
        if (this.e) {
            this.f.removeJavascriptInterface(str);
        } else if (Build.VERSION.SDK_INT >= 11) {
            com.tencent.smtt.utils.i.a(this.g, "removeJavascriptInterface", new Class[]{String.class}, str);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (!this.e) {
            this.g.removeView(view);
            return;
        }
        View view2 = this.f.getView();
        try {
            Method a2 = com.tencent.smtt.utils.i.a(view2, "removeView", View.class);
            a2.setAccessible(true);
            a2.invoke(view2, view);
        } catch (Throwable unused) {
        }
    }

    public JSONObject reportInitPerformance(long j2, int i, long j3, long j4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("IS_X5", this.e);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        if (!this.e) {
            a aVar = this.g;
            if (view == this) {
                view = this.g;
            }
            return aVar.requestChildRectangleOnScreen(view, rect, z);
        }
        View view2 = this.f.getView();
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            if (view == this) {
                view = view2;
            }
            return viewGroup.requestChildRectangleOnScreen(view, rect, z);
        }
        return false;
    }

    public void requestFocusNodeHref(Message message) {
        if (this.e) {
            this.f.requestFocusNodeHref(message);
        } else {
            this.g.requestFocusNodeHref(message);
        }
    }

    public void requestImageRef(Message message) {
        if (this.e) {
            this.f.requestImageRef(message);
        } else {
            this.g.requestImageRef(message);
        }
    }

    @Deprecated
    public boolean restorePicture(Bundle bundle, File file) {
        if (this.e) {
            return this.f.restorePicture(bundle, file);
        }
        Object a2 = com.tencent.smtt.utils.i.a(this.g, "restorePicture", new Class[]{Bundle.class, File.class}, bundle, file);
        if (a2 == null) {
            return false;
        }
        return ((Boolean) a2).booleanValue();
    }

    public WebBackForwardList restoreState(Bundle bundle) {
        return !this.e ? WebBackForwardList.a(this.g.restoreState(bundle)) : WebBackForwardList.a(this.f.restoreState(bundle));
    }

    public void resumeTimers() {
        if (this.e) {
            this.f.resumeTimers();
        } else {
            this.g.resumeTimers();
        }
    }

    @Deprecated
    public void savePassword(String str, String str2, String str3) {
        if (this.e) {
            this.f.savePassword(str, str2, str3);
        } else {
            com.tencent.smtt.utils.i.a(this.g, "savePassword", new Class[]{String.class, String.class, String.class}, str, str2, str3);
        }
    }

    @Deprecated
    public boolean savePicture(Bundle bundle, File file) {
        if (this.e) {
            return this.f.savePicture(bundle, file);
        }
        Object a2 = com.tencent.smtt.utils.i.a(this.g, "savePicture", new Class[]{Bundle.class, File.class}, bundle, file);
        if (a2 == null) {
            return false;
        }
        return ((Boolean) a2).booleanValue();
    }

    public WebBackForwardList saveState(Bundle bundle) {
        return !this.e ? WebBackForwardList.a(this.g.saveState(bundle)) : WebBackForwardList.a(this.f.saveState(bundle));
    }

    @TargetApi(11)
    public void saveWebArchive(String str) {
        if (this.e) {
            this.f.saveWebArchive(str);
        } else if (Build.VERSION.SDK_INT >= 11) {
            com.tencent.smtt.utils.i.a(this.g, "saveWebArchive", new Class[]{String.class}, str);
        }
    }

    @TargetApi(11)
    public void saveWebArchive(String str, boolean z, ValueCallback<String> valueCallback) {
        if (this.e) {
            this.f.saveWebArchive(str, z, valueCallback);
        } else if (Build.VERSION.SDK_INT >= 11) {
            com.tencent.smtt.utils.i.a(this.g, "saveWebArchive", new Class[]{String.class, Boolean.TYPE, android.webkit.ValueCallback.class}, str, Boolean.valueOf(z), valueCallback);
        }
    }

    public void setARModeEnable(boolean z) {
        try {
            if (this.e) {
                getSettingsExtension().setARModeEnable(z);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (this.e) {
            this.f.setBackgroundColor(i);
        } else {
            this.g.setBackgroundColor(i);
        }
        super.setBackgroundColor(i);
    }

    @Deprecated
    public void setCertificate(SslCertificate sslCertificate) {
        if (this.e) {
            this.f.setCertificate(sslCertificate);
        } else {
            this.g.setCertificate(sslCertificate);
        }
    }

    public void setDayOrNight(boolean z) {
        try {
            if (this.e) {
                getSettingsExtension().setDayOrNight(z);
            }
            setSysDayOrNight(z);
            getView().postInvalidate();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setDownloadListener(final DownloadListener downloadListener) {
        if (this.e) {
            this.f.setDownloadListener(new b(this, downloadListener, this.e));
        } else {
            this.g.setDownloadListener(new android.webkit.DownloadListener() { // from class: com.tencent.smtt.sdk.WebView.4
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
                    if (downloadListener != null) {
                        downloadListener.onDownloadStart(str, str2, str3, str4, j2);
                        return;
                    }
                    ApplicationInfo applicationInfo = WebView.this.i == null ? null : WebView.this.i.getApplicationInfo();
                    if (applicationInfo == null || !"com.tencent.mm".equals(applicationInfo.packageName)) {
                        MttLoader.loadUrl(WebView.this.i, str, null, null);
                    }
                }
            });
        }
    }

    @TargetApi(16)
    public void setFindListener(final IX5WebViewBase.FindListener findListener) {
        if (this.e) {
            this.f.setFindListener(findListener);
        } else if (Build.VERSION.SDK_INT >= 16) {
            this.g.setFindListener(new WebView.FindListener() { // from class: com.tencent.smtt.sdk.WebView.3
                @Override // android.webkit.WebView.FindListener
                public void onFindResultReceived(int i, int i2, boolean z) {
                    findListener.onFindResultReceived(i, i2, z);
                }
            });
        }
    }

    public void setHorizontalScrollbarOverlay(boolean z) {
        if (this.e) {
            this.f.setHorizontalScrollbarOverlay(z);
        } else {
            this.g.setHorizontalScrollbarOverlay(z);
        }
    }

    public void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4) {
        if (this.e) {
            this.f.setHttpAuthUsernamePassword(str, str2, str3, str4);
        } else {
            this.g.setHttpAuthUsernamePassword(str, str2, str3, str4);
        }
    }

    public void setInitialScale(int i) {
        if (this.e) {
            this.f.setInitialScale(i);
        } else {
            this.g.setInitialScale(i);
        }
    }

    @Deprecated
    public void setMapTrackballToArrowKeys(boolean z) {
        if (this.e) {
            this.f.setMapTrackballToArrowKeys(z);
        } else {
            com.tencent.smtt.utils.i.a(this.g, "setMapTrackballToArrowKeys", new Class[]{Boolean.TYPE}, Boolean.valueOf(z));
        }
    }

    public void setNetworkAvailable(boolean z) {
        if (this.e) {
            this.f.setNetworkAvailable(z);
        } else if (Build.VERSION.SDK_INT >= 3) {
            this.g.setNetworkAvailable(z);
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        if (!this.e) {
            this.g.setOnLongClickListener(onLongClickListener);
            return;
        }
        View view = this.f.getView();
        try {
            if (this.y == null) {
                Method a2 = com.tencent.smtt.utils.i.a(view, "getListenerInfo", new Class[0]);
                a2.setAccessible(true);
                Object invoke = a2.invoke(view, null);
                Field declaredField = invoke.getClass().getDeclaredField("mOnLongClickListener");
                declaredField.setAccessible(true);
                this.y = declaredField.get(invoke);
            }
            this.z = onLongClickListener;
            getView().setOnLongClickListener(this);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        getView().setOnTouchListener(onTouchListener);
    }

    @Deprecated
    public void setPictureListener(final PictureListener pictureListener) {
        if (this.e) {
            if (pictureListener == null) {
                this.f.setPictureListener(null);
            } else {
                this.f.setPictureListener(new IX5WebViewBase.PictureListener() { // from class: com.tencent.smtt.sdk.WebView.6
                    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewBase.PictureListener
                    public void onNewPicture(IX5WebViewBase iX5WebViewBase, Picture picture, boolean z) {
                        WebView.this.a(iX5WebViewBase);
                        pictureListener.onNewPicture(WebView.this, picture);
                    }

                    @Override // com.tencent.smtt.export.external.interfaces.IX5WebViewBase.PictureListener
                    public void onNewPictureIfHaveContent(IX5WebViewBase iX5WebViewBase, Picture picture) {
                    }
                });
            }
        } else if (pictureListener == null) {
            this.g.setPictureListener(null);
        } else {
            this.g.setPictureListener(new WebView.PictureListener() { // from class: com.tencent.smtt.sdk.WebView.5
                @Override // android.webkit.WebView.PictureListener
                public void onNewPicture(android.webkit.WebView webView, Picture picture) {
                    WebView.this.a(webView);
                    pictureListener.onNewPicture(WebView.this, picture);
                }
            });
        }
    }

    public void setRendererPriorityPolicy(int i, boolean z) {
        try {
            if (this.e || Build.VERSION.SDK_INT < 26) {
                return;
            }
            com.tencent.smtt.utils.i.a(this.g, "setRendererPriorityPolicy", new Class[]{Integer.TYPE, Boolean.TYPE}, Integer.valueOf(i), Boolean.valueOf(z));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.view.View
    public void setScrollBarStyle(int i) {
        if (this.e) {
            this.f.getView().setScrollBarStyle(i);
        } else {
            this.g.setScrollBarStyle(i);
        }
    }

    public void setSysNightModeAlpha(int i) {
        NIGHT_MODE_ALPHA = i;
    }

    public void setVerticalScrollbarOverlay(boolean z) {
        if (this.e) {
            this.f.setVerticalScrollbarOverlay(z);
        } else {
            this.g.setVerticalScrollbarOverlay(z);
        }
    }

    public boolean setVideoFullScreen(Context context, boolean z) {
        if (!context.getApplicationInfo().processName.contains("com.tencent.android.qqdownloader") || this.f == null) {
            return false;
        }
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putInt("DefaultVideoScreen", 2);
        } else {
            bundle.putInt("DefaultVideoScreen", 1);
        }
        this.f.getX5WebViewExtension().invokeMiscMethod("setVideoParams", bundle);
        return true;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (getView() == null) {
            return;
        }
        getView().setVisibility(i);
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        a aVar;
        android.webkit.WebChromeClient webChromeClient2 = null;
        if (this.e) {
            this.f.setWebChromeClient(webChromeClient != null ? new i(x.a().a(true).i(), this, webChromeClient) : null);
        } else {
            if (webChromeClient == null) {
                aVar = this.g;
            } else if (a(webChromeClient)) {
                aVar = this.g;
                webChromeClient2 = new e(this, webChromeClient);
            } else {
                aVar = this.g;
                webChromeClient2 = new SystemWebChromeClient(this, webChromeClient);
            }
            aVar.setWebChromeClient(webChromeClient2);
        }
        this.p = webChromeClient;
    }

    public void setWebChromeClientExtension(IX5WebChromeClientExtension iX5WebChromeClientExtension) {
        if (this.e) {
            this.f.getX5WebViewExtension().setWebChromeClientExtension(iX5WebChromeClientExtension);
        }
    }

    public void setWebViewCallbackClient(WebViewCallbackClient webViewCallbackClient) {
        this.mWebViewCallbackClient = webViewCallbackClient;
        if (!this.e || getX5WebViewExtension() == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("flag", true);
        getX5WebViewExtension().invokeMiscMethod("setWebViewCallbackClientFlag", bundle);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        if (this.e) {
            this.f.setWebViewClient(webViewClient != null ? new j(x.a().a(true).j(), this, webViewClient) : null);
        } else {
            this.g.setWebViewClient(webViewClient != null ? new SystemWebViewClient(this, webViewClient) : null);
        }
        this.o = webViewClient;
    }

    public void setWebViewClientExtension(IX5WebViewClientExtension iX5WebViewClientExtension) {
        if (this.e) {
            this.f.getX5WebViewExtension().setWebViewClientExtension(iX5WebViewClientExtension);
        }
    }

    @SuppressLint({"NewApi"})
    public boolean showDebugView(String str) {
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("https://debugtbs.qq.com")) {
            getView().setVisibility(4);
            com.tencent.smtt.utils.d.a(this.i).a(lowerCase, this, this.i, o.a().getLooper());
            return true;
        } else if (!lowerCase.startsWith("https://debugx5.qq.com") || this.e) {
            return false;
        } else {
            loadDataWithBaseURL(null, "<!DOCTYPE html><html><body>" + com.sankuai.titans.proxy.util.Constants.KEY_HEAD + "<title>无法打开debugx5</title><meta name=\"viewport\" content=\"width=device-width, user-scalable=no\" /></head><br/><br /><h2>debugx5页面仅在使用了X5内核时有效，由于当前没有使用X5内核，无法打开debugx5！</h2><br />尝试<a href=\"https://debugtbs.qq.com?10000\">进入DebugTbs安装或打开X5内核</a></body></html>", com.dianping.titans.utils.Constants.MIME_TYPE_HTML, "utf-8", null);
            return true;
        }
    }

    public boolean showFindDialog(String str, boolean z) {
        return false;
    }

    public void stopLoading() {
        if (this.e) {
            this.f.stopLoading();
        } else {
            this.g.stopLoading();
        }
    }

    public void super_computeScroll() {
        if (!this.e) {
            this.g.a();
            return;
        }
        try {
            com.tencent.smtt.utils.i.a(this.f.getView(), "super_computeScroll");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public boolean super_dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.e) {
            try {
                Object a2 = com.tencent.smtt.utils.i.a(this.f.getView(), "super_dispatchTouchEvent", new Class[]{MotionEvent.class}, motionEvent);
                if (a2 == null) {
                    return false;
                }
                return ((Boolean) a2).booleanValue();
            } catch (Throwable unused) {
                return false;
            }
        }
        return this.g.b(motionEvent);
    }

    public boolean super_onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.e) {
            try {
                Object a2 = com.tencent.smtt.utils.i.a(this.f.getView(), "super_onInterceptTouchEvent", new Class[]{MotionEvent.class}, motionEvent);
                if (a2 == null) {
                    return false;
                }
                return ((Boolean) a2).booleanValue();
            } catch (Throwable unused) {
                return false;
            }
        }
        return this.g.c(motionEvent);
    }

    public void super_onOverScrolled(int i, int i2, boolean z, boolean z2) {
        if (!this.e) {
            this.g.a(i, i2, z, z2);
            return;
        }
        try {
            com.tencent.smtt.utils.i.a(this.f.getView(), "super_onOverScrolled", new Class[]{Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z), Boolean.valueOf(z2));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void super_onScrollChanged(int i, int i2, int i3, int i4) {
        if (!this.e) {
            this.g.a(i, i2, i3, i4);
            return;
        }
        try {
            com.tencent.smtt.utils.i.a(this.f.getView(), "super_onScrollChanged", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public boolean super_onTouchEvent(MotionEvent motionEvent) {
        if (this.e) {
            try {
                Object a2 = com.tencent.smtt.utils.i.a(this.f.getView(), "super_onTouchEvent", new Class[]{MotionEvent.class}, motionEvent);
                if (a2 == null) {
                    return false;
                }
                return ((Boolean) a2).booleanValue();
            } catch (Throwable unused) {
                return false;
            }
        }
        return this.g.a(motionEvent);
    }

    public boolean super_overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        if (this.e) {
            try {
                Object a2 = com.tencent.smtt.utils.i.a(this.f.getView(), "super_overScrollBy", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Boolean.valueOf(z));
                if (a2 == null) {
                    return false;
                }
                return ((Boolean) a2).booleanValue();
            } catch (Throwable unused) {
                return false;
            }
        }
        return this.g.a(i, i2, i3, i4, i5, i6, i7, i8, z);
    }

    public void switchNightMode(boolean z) {
        String str;
        if (z == x) {
            return;
        }
        x = z;
        if (z) {
            TbsLog.e("QB_SDK", "deleteNightMode");
            str = "javascript:document.getElementsByTagName('HEAD').item(0).removeChild(document.getElementById('QQBrowserSDKNightMode'));";
        } else {
            TbsLog.e("QB_SDK", "nightMode");
            str = "javascript:var style = document.createElement('style');style.type='text/css';style.id='QQBrowserSDKNightMode';style.innerHTML='html,body{background:none !important;background-color: #1d1e2a !important;}html *{background-color: #1d1e2a !important; color:#888888 !important;border-color:#3e4f61 !important;text-shadow:none !important;box-shadow:none !important;}a,a *{border-color:#4c5b99 !important; color:#2d69b3 !important;text-decoration:none !important;}a:visited,a:visited *{color:#a600a6 !important;}a:active,a:active *{color:#5588AA !important;}input,select,textarea,option,button{background-image:none !important;color:#AAAAAA !important;border-color:#4c5b99 !important;}form,div,button,span{background-color:#1d1e2a !important; border-color:#4c5b99 !important;}img{opacity:0.5}';document.getElementsByTagName('HEAD').item(0).appendChild(style);";
        }
        loadUrl(str);
    }

    public void switchToNightMode() {
        TbsLog.e("QB_SDK", "switchToNightMode 01");
        if (x) {
            return;
        }
        TbsLog.e("QB_SDK", "switchToNightMode");
        loadUrl("javascript:var style = document.createElement('style');style.type='text/css';style.id='QQBrowserSDKNightMode';style.innerHTML='html,body{background:none !important;background-color: #1d1e2a !important;}html *{background-color: #1d1e2a !important; color:#888888 !important;border-color:#3e4f61 !important;text-shadow:none !important;box-shadow:none !important;}a,a *{border-color:#4c5b99 !important; color:#2d69b3 !important;text-decoration:none !important;}a:visited,a:visited *{color:#a600a6 !important;}a:active,a:active *{color:#5588AA !important;}input,select,textarea,option,button{background-image:none !important;color:#AAAAAA !important;border-color:#4c5b99 !important;}form,div,button,span{background-color:#1d1e2a !important; border-color:#4c5b99 !important;}img{opacity:0.5}';document.getElementsByTagName('HEAD').item(0).appendChild(style);");
    }

    public boolean zoomIn() {
        return !this.e ? this.g.zoomIn() : this.f.zoomIn();
    }

    public boolean zoomOut() {
        return !this.e ? this.g.zoomOut() : this.f.zoomOut();
    }
}
