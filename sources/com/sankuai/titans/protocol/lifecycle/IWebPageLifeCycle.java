package com.sankuai.titans.protocol.lifecycle;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.support.annotation.RequiresApi;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.sankuai.titans.protocol.context.ITitansWebPageContext;
import com.sankuai.titans.protocol.utils.SslErrorHandler;
import com.sankuai.titans.protocol.utils.WebResourceError;
import com.sankuai.titans.protocol.webcompat.IWebView;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IWebPageLifeCycle {
    boolean onConsoleMessage(ITitansWebPageContext iTitansWebPageContext, ConsoleMessage consoleMessage);

    void onReceivedWebResourceResponse(ITitansWebPageContext iTitansWebPageContext, String str);

    @RequiresApi(api = 21)
    boolean onShowFileChooser(ITitansWebPageContext iTitansWebPageContext, IWebView iWebView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams);

    void onWebDoUpdateVisitedHistory(ITitansWebPageContext iTitansWebPageContext, IWebView iWebView, String str, boolean z);

    @Deprecated
    void onWebDoUpdateVisitedHistory(ITitansWebPageContext iTitansWebPageContext, String str, boolean z);

    boolean onWebOverrideUrlLoading(ITitansWebPageContext iTitansWebPageContext, WebOverrideUrlLoadingParam webOverrideUrlLoadingParam);

    void onWebPageFinish(ITitansWebPageContext iTitansWebPageContext);

    void onWebPageStarted(ITitansWebPageContext iTitansWebPageContext, String str, Bitmap bitmap);

    @RequiresApi(api = 23)
    void onWebReceivedError(ITitansWebPageContext iTitansWebPageContext, WebResourceRequest webResourceRequest, WebResourceError webResourceError);

    void onWebReceivedError(ITitansWebPageContext iTitansWebPageContext, String str, int i, String str2);

    @RequiresApi(api = 23)
    void onWebReceivedHttpError(ITitansWebPageContext iTitansWebPageContext, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);

    boolean onWebReceivedSslError(ITitansWebPageContext iTitansWebPageContext, SslErrorHandler sslErrorHandler, SslError sslError);

    @RequiresApi(api = 21)
    WebResourceResponse onWebShouldInterceptRequest(ITitansWebPageContext iTitansWebPageContext, WebResourceRequest webResourceRequest);

    WebResourceResponse onWebShouldInterceptRequest(ITitansWebPageContext iTitansWebPageContext, String str);

    boolean onWebUrlLoad(ITitansWebPageContext iTitansWebPageContext, WebUrlLoadParam webUrlLoadParam);

    @Deprecated
    boolean openFileChooser(ITitansWebPageContext iTitansWebPageContext, ValueCallback<Uri> valueCallback, String str, String str2);
}
