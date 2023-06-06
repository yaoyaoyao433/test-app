package com.sankuai.titans.protocol.lifecycle;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.titans.protocol.context.ITitansWebPageContext;
import com.sankuai.titans.protocol.utils.SslErrorHandler;
import com.sankuai.titans.protocol.utils.WebResourceError;
import com.sankuai.titans.protocol.webcompat.IWebView;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class WebPageLifeCycleAdapter implements IWebPageLifeCycle {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    public boolean onConsoleMessage(ITitansWebPageContext iTitansWebPageContext, ConsoleMessage consoleMessage) {
        return false;
    }

    @Override // com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    public void onReceivedWebResourceResponse(ITitansWebPageContext iTitansWebPageContext, String str) {
    }

    @Override // com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    public boolean onShowFileChooser(ITitansWebPageContext iTitansWebPageContext, IWebView iWebView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return false;
    }

    @Override // com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    public void onWebDoUpdateVisitedHistory(ITitansWebPageContext iTitansWebPageContext, IWebView iWebView, String str, boolean z) {
    }

    @Override // com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    @Deprecated
    public void onWebDoUpdateVisitedHistory(ITitansWebPageContext iTitansWebPageContext, String str, boolean z) {
    }

    @Override // com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    public boolean onWebOverrideUrlLoading(ITitansWebPageContext iTitansWebPageContext, WebOverrideUrlLoadingParam webOverrideUrlLoadingParam) {
        return false;
    }

    @Override // com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    public void onWebPageFinish(ITitansWebPageContext iTitansWebPageContext) {
    }

    @Override // com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    public void onWebPageStarted(ITitansWebPageContext iTitansWebPageContext, String str, Bitmap bitmap) {
    }

    @Override // com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    public void onWebReceivedError(ITitansWebPageContext iTitansWebPageContext, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
    }

    @Override // com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    public void onWebReceivedError(ITitansWebPageContext iTitansWebPageContext, String str, int i, String str2) {
    }

    @Override // com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    public void onWebReceivedHttpError(ITitansWebPageContext iTitansWebPageContext, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    @Override // com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    public boolean onWebReceivedSslError(ITitansWebPageContext iTitansWebPageContext, SslErrorHandler sslErrorHandler, SslError sslError) {
        return true;
    }

    @Override // com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    public WebResourceResponse onWebShouldInterceptRequest(ITitansWebPageContext iTitansWebPageContext, WebResourceRequest webResourceRequest) {
        return null;
    }

    @Override // com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    public WebResourceResponse onWebShouldInterceptRequest(ITitansWebPageContext iTitansWebPageContext, String str) {
        return null;
    }

    @Override // com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    public boolean onWebUrlLoad(ITitansWebPageContext iTitansWebPageContext, WebUrlLoadParam webUrlLoadParam) {
        return false;
    }

    @Override // com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle
    public boolean openFileChooser(ITitansWebPageContext iTitansWebPageContext, ValueCallback<Uri> valueCallback, String str, String str2) {
        return false;
    }
}
