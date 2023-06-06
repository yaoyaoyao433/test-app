package com.sankuai.titans.base.webkit;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.webcompat.IWebView;
import com.sankuai.titans.protocol.webcompat.IWebViewClient;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WebViewClientAdapter extends WebViewClient {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final IWebViewClient webViewClient;
    private final IWebView webViewT;

    public WebViewClientAdapter(IWebView iWebView, IWebViewClient iWebViewClient) {
        Object[] objArr = {iWebView, iWebViewClient};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e7e8900ec6189bd99a1a9f127156ef2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e7e8900ec6189bd99a1a9f127156ef2");
            return;
        }
        this.webViewT = iWebView;
        this.webViewClient = iWebViewClient;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Object[] objArr = {webView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2b3eaf62eef47eaefb1149288579d8b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2b3eaf62eef47eaefb1149288579d8b")).booleanValue() : this.webViewClient.shouldOverrideUrlLoading(this.webViewT, str);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 24)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Object[] objArr = {webView, webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56f1f9bd5114791535472d52fcdf9b22", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56f1f9bd5114791535472d52fcdf9b22")).booleanValue() : this.webViewClient.shouldOverrideUrlLoading(this.webViewT, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Object[] objArr = {webView, str, bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2662fbeab722071ed4af73952304577", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2662fbeab722071ed4af73952304577");
        } else {
            this.webViewClient.onPageStarted(this.webViewT, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        Object[] objArr = {webView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "005a819d704c71547a99cbec1055a018", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "005a819d704c71547a99cbec1055a018");
        } else {
            this.webViewClient.onPageFinished(this.webViewT, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        Object[] objArr = {webView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17a3bc53281d014079d6d26b9a4187c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17a3bc53281d014079d6d26b9a4187c6");
        } else {
            this.webViewClient.onLoadResource(this.webViewT, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        Object[] objArr = {webView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2dac99cb378edad7d81e0a1f46817fb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2dac99cb378edad7d81e0a1f46817fb7");
        } else {
            this.webViewClient.onPageCommitVisible(this.webViewT, str);
        }
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Object[] objArr = {webView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b4932fb903692c6eca149fb85ce5f39", RobustBitConfig.DEFAULT_VALUE) ? (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b4932fb903692c6eca149fb85ce5f39") : this.webViewClient.shouldInterceptRequest(this.webViewT, str);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 21)
    @Nullable
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Object[] objArr = {webView, webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "190ff4ac18a64968f1ea9549034883ff", RobustBitConfig.DEFAULT_VALUE) ? (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "190ff4ac18a64968f1ea9549034883ff") : this.webViewClient.shouldInterceptRequest(this.webViewT, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        Object[] objArr = {webView, message, message2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e634b71ca486d54010d60f745836c255", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e634b71ca486d54010d60f745836c255");
        } else {
            this.webViewClient.onTooManyRedirects(this.webViewT, message, message2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        Object[] objArr = {webView, Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "425dd73af874ad29d975936b86ad089f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "425dd73af874ad29d975936b86ad089f");
        } else {
            this.webViewClient.onReceivedError(this.webViewT, i, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Object[] objArr = {webView, webResourceRequest, webResourceError};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fa32b55b1517dcb8217bcb22e9fa297", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fa32b55b1517dcb8217bcb22e9fa297");
        } else {
            this.webViewClient.onReceivedError(this.webViewT, webResourceRequest, WebKitAdapterUtils.from(webResourceError));
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Object[] objArr = {webView, webResourceRequest, webResourceResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c95f82900bd3bb1db1042cf167f03da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c95f82900bd3bb1db1042cf167f03da");
            return;
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        this.webViewClient.onReceivedHttpError(this.webViewT, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        Object[] objArr = {webView, message, message2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a4893b1e5ac62f766ce726b1e67b981", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a4893b1e5ac62f766ce726b1e67b981");
        } else {
            this.webViewClient.onFormResubmission(this.webViewT, message, message2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        Object[] objArr = {webView, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1443cbf42e62b00792c2e5f65d4ef0a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1443cbf42e62b00792c2e5f65d4ef0a8");
        } else {
            this.webViewClient.doUpdateVisitedHistory(this.webViewT, str, z);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        Object[] objArr = {webView, sslErrorHandler, sslError};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "568a316dab0f6253d72c989ff36bd776", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "568a316dab0f6253d72c989ff36bd776");
        } else {
            this.webViewClient.onReceivedSslError(this.webViewT, WebKitAdapterUtils.from(sslErrorHandler), sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 21)
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        Object[] objArr = {webView, clientCertRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f4ac22611de90e8ea9b0f9351fe09b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f4ac22611de90e8ea9b0f9351fe09b1");
        } else {
            this.webViewClient.onReceivedClientCertRequest(this.webViewT, clientCertRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        Object[] objArr = {webView, httpAuthHandler, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5af2d9153d75572eac28462cbd9ade15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5af2d9153d75572eac28462cbd9ade15");
        } else {
            this.webViewClient.onReceivedHttpAuthRequest(this.webViewT, WebKitAdapterUtils.from(httpAuthHandler), str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        Object[] objArr = {webView, keyEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff0b279836443730e12671843544c5fd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff0b279836443730e12671843544c5fd")).booleanValue() : this.webViewClient.shouldOverrideKeyEvent(this.webViewT, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        Object[] objArr = {webView, keyEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c8aae538792d2e7a1fb0a30b04c9d7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c8aae538792d2e7a1fb0a30b04c9d7d");
        } else {
            this.webViewClient.onUnhandledKeyEvent(this.webViewT, keyEvent);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f, float f2) {
        Object[] objArr = {webView, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f458af7acced28b2a05109f3c8271de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f458af7acced28b2a05109f3c8271de");
        } else {
            this.webViewClient.onScaleChanged(this.webViewT, f, f2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, @Nullable String str2, String str3) {
        Object[] objArr = {webView, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b29c7f0503e71776a94dae4ba38ac1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b29c7f0503e71776a94dae4ba38ac1c");
        } else {
            this.webViewClient.onReceivedLoginRequest(this.webViewT, str, str2, str3);
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Object[] objArr = {webView, renderProcessGoneDetail};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "396c5c4819b4232e289aee484afe99ee", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "396c5c4819b4232e289aee484afe99ee")).booleanValue() : this.webViewClient.onRenderProcessGone(this.webViewT, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 27)
    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        Object[] objArr = {webView, webResourceRequest, Integer.valueOf(i), safeBrowsingResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "895dab833230f77e726cec0eef6ecb11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "895dab833230f77e726cec0eef6ecb11");
        } else {
            this.webViewClient.onSafeBrowsingHit(this.webViewT, webResourceRequest, i, safeBrowsingResponse);
        }
    }
}
