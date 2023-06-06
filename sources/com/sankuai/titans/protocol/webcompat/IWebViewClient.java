package com.sankuai.titans.protocol.webcompat;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.support.annotation.RequiresApi;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.sankuai.titans.protocol.utils.HttpAuthHandler;
import com.sankuai.titans.protocol.utils.SslErrorHandler;
import com.sankuai.titans.protocol.utils.WebResourceError;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IWebViewClient {
    void doUpdateVisitedHistory(IWebView iWebView, String str, boolean z);

    long obtainPageStartedTime();

    void onFormResubmission(IWebView iWebView, Message message, Message message2);

    void onLoadResource(IWebView iWebView, String str);

    void onPageCommitVisible(IWebView iWebView, String str);

    void onPageFinished(IWebView iWebView, String str);

    void onPageStarted(IWebView iWebView, String str, Bitmap bitmap);

    @RequiresApi(api = 21)
    void onReceivedClientCertRequest(IWebView iWebView, ClientCertRequest clientCertRequest);

    @Deprecated
    void onReceivedError(IWebView iWebView, int i, String str, String str2);

    @RequiresApi(api = 23)
    void onReceivedError(IWebView iWebView, WebResourceRequest webResourceRequest, WebResourceError webResourceError);

    void onReceivedHttpAuthRequest(IWebView iWebView, HttpAuthHandler httpAuthHandler, String str, String str2);

    @RequiresApi(api = 23)
    void onReceivedHttpError(IWebView iWebView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);

    void onReceivedLoginRequest(IWebView iWebView, String str, String str2, String str3);

    void onReceivedSslError(IWebView iWebView, SslErrorHandler sslErrorHandler, SslError sslError);

    @RequiresApi(api = 26)
    boolean onRenderProcessGone(IWebView iWebView, RenderProcessGoneDetail renderProcessGoneDetail);

    @RequiresApi(api = 27)
    void onSafeBrowsingHit(IWebView iWebView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse);

    void onScaleChanged(IWebView iWebView, float f, float f2);

    void onTooManyRedirects(IWebView iWebView, Message message, Message message2);

    void onUnhandledKeyEvent(IWebView iWebView, KeyEvent keyEvent);

    @RequiresApi(api = 21)
    WebResourceResponse shouldInterceptRequest(IWebView iWebView, WebResourceRequest webResourceRequest);

    @Deprecated
    WebResourceResponse shouldInterceptRequest(IWebView iWebView, String str);

    boolean shouldOverrideKeyEvent(IWebView iWebView, KeyEvent keyEvent);

    @RequiresApi(api = 24)
    boolean shouldOverrideUrlLoading(IWebView iWebView, WebResourceRequest webResourceRequest);

    @Deprecated
    boolean shouldOverrideUrlLoading(IWebView iWebView, String str);
}
