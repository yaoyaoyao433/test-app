package com.sankuai.titans.base.webkit;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
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
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.webcompat.IWebChromeClient;
import com.sankuai.titans.protocol.webcompat.IWebView;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WebChromeClientAdapter extends WebChromeClient {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final IWebChromeClient chromeClient;
    private final IWebView<WebView> webViewT;

    public WebChromeClientAdapter(IWebView<WebView> iWebView, IWebChromeClient iWebChromeClient) {
        Object[] objArr = {iWebView, iWebChromeClient};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d5a872ee2b90dc3db1339dca6eacd96", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d5a872ee2b90dc3db1339dca6eacd96");
            return;
        }
        this.webViewT = iWebView;
        this.chromeClient = iWebChromeClient;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        Object[] objArr = {webView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53737126ed20b3abd67bf7260d381bde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53737126ed20b3abd67bf7260d381bde");
        } else {
            this.chromeClient.onProgressChanged(this.webViewT, i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        Object[] objArr = {webView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e050ae6e5dbb48c8ebfce63b1760066", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e050ae6e5dbb48c8ebfce63b1760066");
        } else {
            this.chromeClient.onReceivedTitle(this.webViewT, str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        Object[] objArr = {webView, bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eccbdc0b7151f89f89dc4522a1beb72a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eccbdc0b7151f89f89dc4522a1beb72a");
        } else {
            this.chromeClient.onReceivedIcon(this.webViewT, bitmap);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        Object[] objArr = {webView, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb607a7af0466b6a69bfb2ac16da5d9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb607a7af0466b6a69bfb2ac16da5d9d");
        } else {
            this.chromeClient.onReceivedTouchIconUrl(this.webViewT, str, z);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Object[] objArr = {view, customViewCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b70c1361b3fab39a8ea2078d6410e8f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b70c1361b3fab39a8ea2078d6410e8f7");
        } else {
            this.chromeClient.onShowCustomView(view, customViewCallback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        Object[] objArr = {view, Integer.valueOf(i), customViewCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9acf633ffac217ca01e3f038a845bc34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9acf633ffac217ca01e3f038a845bc34");
        } else {
            this.chromeClient.onShowCustomView(view, i, customViewCallback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92f303ddb4ed6a28248e67ecc7197e1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92f303ddb4ed6a28248e67ecc7197e1a");
        } else {
            this.chromeClient.onHideCustomView();
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        Object[] objArr = {webView, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), message};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f736fccb1741f4866ae825d8608e378", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f736fccb1741f4866ae825d8608e378")).booleanValue() : this.chromeClient.onCreateWindow(this.webViewT, z, z2, message);
    }

    @Override // android.webkit.WebChromeClient
    public void onRequestFocus(WebView webView) {
        Object[] objArr = {webView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23f8137a1e2e1767a36528bfed99ff24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23f8137a1e2e1767a36528bfed99ff24");
        } else {
            this.chromeClient.onRequestFocus(this.webViewT);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView webView) {
        Object[] objArr = {webView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66b3677346527496b063dc0fe471b37b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66b3677346527496b063dc0fe471b37b");
        } else {
            this.chromeClient.onCloseWindow(this.webViewT);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        Object[] objArr = {webView, str, str2, jsResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "424d614b609ec1bcf18494c3edb01dd9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "424d614b609ec1bcf18494c3edb01dd9")).booleanValue() : this.chromeClient.onJsAlert(this.webViewT, str, str2, WebKitAdapterUtils.from(jsResult));
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        Object[] objArr = {webView, str, str2, jsResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0d98b68c53ef807b16e651610fe6354", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0d98b68c53ef807b16e651610fe6354")).booleanValue() : this.chromeClient.onJsConfirm(this.webViewT, str, str2, WebKitAdapterUtils.from(jsResult));
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        Object[] objArr = {webView, str, str2, str3, jsPromptResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "404e947868e98b6fc8d58fe0c79e6f4a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "404e947868e98b6fc8d58fe0c79e6f4a")).booleanValue() : this.chromeClient.onJsPrompt(this.webViewT, str, str2, str3, WebKitAdapterUtils.from(jsPromptResult));
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        Object[] objArr = {webView, str, str2, jsResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc2718d4c01c9a32f54b62e3e1ec4641", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc2718d4c01c9a32f54b62e3e1ec4641")).booleanValue() : this.chromeClient.onJsBeforeUnload(this.webViewT, str, str2, WebKitAdapterUtils.from(jsResult));
    }

    @Override // android.webkit.WebChromeClient
    public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        Object[] objArr = {str, str2, new Long(j), new Long(j2), new Long(j3), quotaUpdater};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0eea2361e10bfa704e59ede78488397", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0eea2361e10bfa704e59ede78488397");
        } else {
            this.chromeClient.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        Object[] objArr = {new Long(j), new Long(j2), quotaUpdater};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f47e3b7281d269bcdd6822b8f8dc7a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f47e3b7281d269bcdd6822b8f8dc7a2");
        } else {
            this.chromeClient.onReachedMaxAppCacheSize(j, j2, quotaUpdater);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        Object[] objArr = {str, callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30a85894dfe912c759f94a8b837f2a89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30a85894dfe912c759f94a8b837f2a89");
        } else {
            this.chromeClient.onGeolocationPermissionsShowPrompt(str, callback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsHidePrompt() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23414a6c66e41c30e6e8a083684cb184", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23414a6c66e41c30e6e8a083684cb184");
        } else {
            this.chromeClient.onGeolocationPermissionsHidePrompt();
        }
    }

    @Override // android.webkit.WebChromeClient
    @RequiresApi(api = 21)
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        Object[] objArr = {permissionRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b410cbffc8c4928a7820d77c95781485", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b410cbffc8c4928a7820d77c95781485");
        } else {
            this.chromeClient.onPermissionRequest(permissionRequest);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        Object[] objArr = {permissionRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b5143879b7ec260faeff36ed6f31c68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b5143879b7ec260faeff36ed6f31c68");
        } else {
            this.chromeClient.onPermissionRequestCanceled(permissionRequest);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsTimeout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e174b762e377dbea463601c753dc1e69", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e174b762e377dbea463601c753dc1e69")).booleanValue() : this.chromeClient.onJsTimeout();
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a0bcf829c27fe0112c0e604fa074d07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a0bcf829c27fe0112c0e604fa074d07");
        } else {
            this.chromeClient.onConsoleMessage(str, i, str2);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        Object[] objArr = {consoleMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e68e1e51699c1f39282d69d758cf4c9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e68e1e51699c1f39282d69d758cf4c9")).booleanValue() : this.chromeClient.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    @Nullable
    public Bitmap getDefaultVideoPoster() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "007cbc26597cd568078aeacc5c2c82b9", RobustBitConfig.DEFAULT_VALUE) ? (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "007cbc26597cd568078aeacc5c2c82b9") : this.chromeClient.getDefaultVideoPoster();
    }

    @Override // android.webkit.WebChromeClient
    @Nullable
    public View getVideoLoadingProgressView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1627144c909ec776f938d75909f1371", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1627144c909ec776f938d75909f1371") : this.chromeClient.getVideoLoadingProgressView();
    }

    @Override // android.webkit.WebChromeClient
    public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        Object[] objArr = {valueCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96c97f13ee2c78d9c997c552a4a19a7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96c97f13ee2c78d9c997c552a4a19a7d");
        } else {
            this.chromeClient.getVisitedHistory(valueCallback);
        }
    }

    @Override // android.webkit.WebChromeClient
    @RequiresApi(api = 21)
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Object[] objArr = {webView, valueCallback, fileChooserParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9925be54b1812e016abae3e321ff0a2b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9925be54b1812e016abae3e321ff0a2b")).booleanValue() : this.chromeClient.onShowFileChooser(this.webViewT, valueCallback, fileChooserParams);
    }
}
