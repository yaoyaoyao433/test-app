package com.sankuai.titans.protocol.webcompat;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import com.sankuai.titans.protocol.utils.JsPromptResult;
import com.sankuai.titans.protocol.utils.JsResult;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IWebChromeClient {
    @Nullable
    Bitmap getDefaultVideoPoster();

    @Nullable
    View getVideoLoadingProgressView();

    void getVisitedHistory(ValueCallback<String[]> valueCallback);

    boolean isCustomViewShowing();

    void onCloseWindow(IWebView iWebView);

    void onConsoleMessage(String str, int i, String str2);

    boolean onConsoleMessage(ConsoleMessage consoleMessage);

    boolean onCreateWindow(IWebView iWebView, boolean z, boolean z2, Message message);

    @Deprecated
    void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater);

    void onGeolocationPermissionsHidePrompt();

    void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback);

    void onHideCustomView();

    boolean onJsAlert(IWebView iWebView, String str, String str2, JsResult jsResult);

    boolean onJsBeforeUnload(IWebView iWebView, String str, String str2, JsResult jsResult);

    boolean onJsConfirm(IWebView iWebView, String str, String str2, JsResult jsResult);

    boolean onJsPrompt(IWebView iWebView, String str, String str2, String str3, JsPromptResult jsPromptResult);

    boolean onJsTimeout();

    @RequiresApi(api = 21)
    void onPermissionRequest(PermissionRequest permissionRequest);

    void onPermissionRequestCanceled(PermissionRequest permissionRequest);

    void onProgressChanged(IWebView iWebView, int i);

    @Deprecated
    void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater);

    void onReceivedIcon(IWebView iWebView, Bitmap bitmap);

    void onReceivedTitle(IWebView iWebView, String str);

    void onReceivedTouchIconUrl(IWebView iWebView, String str, boolean z);

    void onRequestFocus(IWebView iWebView);

    void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback);

    void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback);

    boolean onShowFileChooser(IWebView iWebView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams);

    @Deprecated
    void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2);
}
