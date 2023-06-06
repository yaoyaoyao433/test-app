package com.meituan.mtwebkit.internal.system;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import com.meituan.mtwebkit.MTGeolocationPermissions;
import com.meituan.mtwebkit.MTValueCallback;
import com.meituan.mtwebkit.MTWebChromeClient;
import com.meituan.mtwebkit.MTWebStorage;
import com.meituan.mtwebkit.MTWebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class u extends WebChromeClient {
    public static ChangeQuickRedirect a;
    private MTWebView b;
    private MTWebChromeClient c;

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
    }

    public u(MTWebView mTWebView, MTWebChromeClient mTWebChromeClient) {
        Object[] objArr = {mTWebView, mTWebChromeClient};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "302ed5c59a313c2fe9bd1ae9f8ea2d4b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "302ed5c59a313c2fe9bd1ae9f8ea2d4b");
            return;
        }
        this.b = mTWebView;
        this.c = mTWebChromeClient;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        Object[] objArr = {webView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "451eb9d85f238bb8e6c4f6db6563ec25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "451eb9d85f238bb8e6c4f6db6563ec25");
        } else {
            this.c.onProgressChanged(this.b, i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        Object[] objArr = {webView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0135b9933b1eb9d0aae1a815bc136def", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0135b9933b1eb9d0aae1a815bc136def");
        } else {
            this.c.onReceivedTitle(this.b, str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        Object[] objArr = {webView, bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e841d6347eda2a4a90d6df1bb071ed0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e841d6347eda2a4a90d6df1bb071ed0");
        } else {
            this.c.onReceivedIcon(this.b, bitmap);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        Object[] objArr = {webView, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0665af98d0748b196eb783effd769ee5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0665af98d0748b196eb783effd769ee5");
        } else {
            this.c.onReceivedTouchIconUrl(this.b, str, z);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, final WebChromeClient.CustomViewCallback customViewCallback) {
        Object[] objArr = {view, customViewCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e427106228d5fdbe15c7dd6b220e390e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e427106228d5fdbe15c7dd6b220e390e");
        } else {
            this.c.onShowCustomView(view, new MTWebChromeClient.CustomViewCallback() { // from class: com.meituan.mtwebkit.internal.system.u.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mtwebkit.MTWebChromeClient.CustomViewCallback
                public final void onCustomViewHidden() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c46454fb62fc8b749573d3d189bb5713", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c46454fb62fc8b749573d3d189bb5713");
                    } else {
                        customViewCallback.onCustomViewHidden();
                    }
                }
            });
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i, final WebChromeClient.CustomViewCallback customViewCallback) {
        Object[] objArr = {view, Integer.valueOf(i), customViewCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ccbbe5ef5f6c0f1fcbff4b6894246e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ccbbe5ef5f6c0f1fcbff4b6894246e8");
        } else {
            this.c.onShowCustomView(view, i, new MTWebChromeClient.CustomViewCallback() { // from class: com.meituan.mtwebkit.internal.system.u.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mtwebkit.MTWebChromeClient.CustomViewCallback
                public final void onCustomViewHidden() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "30c2b2ee33d72b53da5f75c38f0dd032", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "30c2b2ee33d72b53da5f75c38f0dd032");
                    } else {
                        customViewCallback.onCustomViewHidden();
                    }
                }
            });
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bbc70a9349aa90e45d7ff5f6c473c00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bbc70a9349aa90e45d7ff5f6c473c00");
        } else {
            this.c.onHideCustomView();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        Object[] objArr = {webView, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8940d8bf04491b2d47c009f1153c8941", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8940d8bf04491b2d47c009f1153c8941")).booleanValue();
        }
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        MTWebView mTWebView = this.b;
        mTWebView.getClass();
        MTWebView.WebViewTransport webViewTransport2 = new MTWebView.WebViewTransport();
        message.obj = webViewTransport2;
        boolean onCreateWindow = this.c.onCreateWindow(this.b, z, z2, message);
        MTWebView webView2 = webViewTransport2.getWebView();
        if (webView2 != null) {
            webViewTransport.setWebView(((z) webView2.getWebViewProvider()).b);
        }
        message.obj = webViewTransport;
        return onCreateWindow;
    }

    @Override // android.webkit.WebChromeClient
    public final void onRequestFocus(WebView webView) {
        Object[] objArr = {webView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3de34bbdfa11f2bfe0c0e64e08a4a7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3de34bbdfa11f2bfe0c0e64e08a4a7c");
        } else {
            this.c.onRequestFocus(this.b);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        Object[] objArr = {webView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66c079c86806a556800bc99cd261ad98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66c079c86806a556800bc99cd261ad98");
        } else {
            this.c.onCloseWindow(this.b);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        Object[] objArr = {webView, str, str2, jsResult};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df00b31f9f00b6cec3d47de69402f517", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df00b31f9f00b6cec3d47de69402f517")).booleanValue() : this.c.onJsAlert(this.b, str, str2, new g(jsResult));
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        Object[] objArr = {webView, str, str2, jsResult};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "116fd8e016e5f8b358fbc1ba600fac98", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "116fd8e016e5f8b358fbc1ba600fac98")).booleanValue() : this.c.onJsConfirm(this.b, str, str2, new g(jsResult));
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        Object[] objArr = {webView, str, str2, str3, jsPromptResult};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe406f032f0c31d4a48e16ac82cb2934", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe406f032f0c31d4a48e16ac82cb2934")).booleanValue() : this.c.onJsPrompt(this.b, str, str2, str3, new f(jsPromptResult));
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        Object[] objArr = {webView, str, str2, jsResult};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac8502e152fb924b8ecd9da14eadf257", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac8502e152fb924b8ecd9da14eadf257")).booleanValue() : this.c.onJsBeforeUnload(this.b, str, str2, new g(jsResult));
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, final WebStorage.QuotaUpdater quotaUpdater) {
        Object[] objArr = {str, str2, new Long(j), new Long(j2), new Long(j3), quotaUpdater};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb12e9032c997faedee80917681d7ffc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb12e9032c997faedee80917681d7ffc");
        } else {
            this.c.onExceededDatabaseQuota(str, str2, j, j2, j3, new MTWebStorage.QuotaUpdater() { // from class: com.meituan.mtwebkit.internal.system.u.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mtwebkit.MTWebStorage.QuotaUpdater
                public final void updateQuota(long j4) {
                    Object[] objArr2 = {new Long(j4)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "700bc823e2f588de24ed540bbf2bf85e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "700bc823e2f588de24ed540bbf2bf85e");
                    } else {
                        quotaUpdater.updateQuota(j4);
                    }
                }
            });
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReachedMaxAppCacheSize(long j, long j2, final WebStorage.QuotaUpdater quotaUpdater) {
        Object[] objArr = {new Long(j), new Long(j2), quotaUpdater};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "208ed0c37f8f9ed38c02b1c4f7d87c12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "208ed0c37f8f9ed38c02b1c4f7d87c12");
        } else {
            this.c.onReachedMaxAppCacheSize(j, j2, new MTWebStorage.QuotaUpdater() { // from class: com.meituan.mtwebkit.internal.system.u.4
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mtwebkit.MTWebStorage.QuotaUpdater
                public final void updateQuota(long j3) {
                    Object[] objArr2 = {new Long(j3)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eca3b8727d592341c84bf2c2c1281d1c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eca3b8727d592341c84bf2c2c1281d1c");
                    } else {
                        quotaUpdater.updateQuota(j3);
                    }
                }
            });
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, final GeolocationPermissions.Callback callback) {
        Object[] objArr = {str, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e83abc70e976b7f365f0139f959baee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e83abc70e976b7f365f0139f959baee");
        } else {
            this.c.onGeolocationPermissionsShowPrompt(str, new MTGeolocationPermissions.Callback() { // from class: com.meituan.mtwebkit.internal.system.u.5
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mtwebkit.MTGeolocationPermissions.Callback
                public final void invoke(String str2, boolean z, boolean z2) {
                    Object[] objArr2 = {str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de6e7dec13bcfce9d9621f2aa74c1991", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de6e7dec13bcfce9d9621f2aa74c1991");
                    } else {
                        callback.invoke(str2, z, z2);
                    }
                }
            });
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e71a8a17d6ff2b005cc6142d4de3c3b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e71a8a17d6ff2b005cc6142d4de3c3b0");
        } else {
            this.c.onGeolocationPermissionsHidePrompt();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsTimeout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a6e87c3d7c47b4b9c53f808e701cdb6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a6e87c3d7c47b4b9c53f808e701cdb6")).booleanValue() : this.c.onJsTimeout();
    }

    @Override // android.webkit.WebChromeClient
    public final void onConsoleMessage(String str, int i, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f617648b6e9144718e5b9c4c72c1f3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f617648b6e9144718e5b9c4c72c1f3e");
        } else {
            this.c.onConsoleMessage(str, i, str2);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        Object[] objArr = {consoleMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7045aba01f336ddf466080a0e51eb22d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7045aba01f336ddf466080a0e51eb22d")).booleanValue() : this.c.onConsoleMessage(new t(consoleMessage));
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31dec1588f83ef77d46bc341a49455a8", RobustBitConfig.DEFAULT_VALUE) ? (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31dec1588f83ef77d46bc341a49455a8") : this.c.getDefaultVideoPoster();
    }

    @Override // android.webkit.WebChromeClient
    public final View getVideoLoadingProgressView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39b22883e639ca3a6bdd03d036760ed3", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39b22883e639ca3a6bdd03d036760ed3") : this.c.getVideoLoadingProgressView();
    }

    @Override // android.webkit.WebChromeClient
    public final void getVisitedHistory(final ValueCallback<String[]> valueCallback) {
        Object[] objArr = {valueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e15d39b33510959a5ca329000841dc33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e15d39b33510959a5ca329000841dc33");
        } else {
            this.c.getVisitedHistory(valueCallback == null ? null : new MTValueCallback<String[]>() { // from class: com.meituan.mtwebkit.internal.system.u.6
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mtwebkit.MTValueCallback
                public final /* synthetic */ void onReceiveValue(String[] strArr) {
                    String[] strArr2 = strArr;
                    Object[] objArr2 = {strArr2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1242dc43b05dfa10e78c57a0df565069", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1242dc43b05dfa10e78c57a0df565069");
                    } else {
                        valueCallback.onReceiveValue(strArr2);
                    }
                }
            });
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, final ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Object[] objArr = {webView, valueCallback, fileChooserParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f52754f94fc043668f31d259cbb1526f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f52754f94fc043668f31d259cbb1526f")).booleanValue();
        }
        return this.c.onShowFileChooser(this.b, valueCallback == null ? null : new MTValueCallback<Uri[]>() { // from class: com.meituan.mtwebkit.internal.system.u.7
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mtwebkit.MTValueCallback
            public final /* synthetic */ void onReceiveValue(Uri[] uriArr) {
                Uri[] uriArr2 = uriArr;
                Object[] objArr2 = {uriArr2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a76365ef6d53981df27a7542f0c0b8e3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a76365ef6d53981df27a7542f0c0b8e3");
                } else {
                    valueCallback.onReceiveValue(uriArr2);
                }
            }
        }, new c(fileChooserParams));
    }
}
