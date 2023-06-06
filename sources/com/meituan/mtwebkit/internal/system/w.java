package com.meituan.mtwebkit.internal.system;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
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
import com.meituan.mtwebkit.MTWebResourceResponse;
import com.meituan.mtwebkit.MTWebView;
import com.meituan.mtwebkit.MTWebViewClient;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class w extends WebViewClient {
    public static ChangeQuickRedirect a;
    private MTWebViewClient b;
    private MTWebView c;

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
    }

    public w(MTWebView mTWebView, MTWebViewClient mTWebViewClient) {
        Object[] objArr = {mTWebView, mTWebViewClient};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5906fcf157b5403670f60225296f2fce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5906fcf157b5403670f60225296f2fce");
            return;
        }
        this.b = mTWebViewClient;
        this.c = mTWebView;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Object[] objArr = {webView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c0cddb45a76939f791f20045e415249", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c0cddb45a76939f791f20045e415249")).booleanValue() : this.b.shouldOverrideUrlLoading(this.c, str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Object[] objArr = {webView, webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "980c8d5f0f1172efa9e446b1a2d67008", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "980c8d5f0f1172efa9e446b1a2d67008")).booleanValue() : this.b.shouldOverrideUrlLoading(this.c, new m(webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Object[] objArr = {webView, str, bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7b6a400c1fea8fdf9ae1935f9eb8e01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7b6a400c1fea8fdf9ae1935f9eb8e01");
        } else {
            this.b.onPageStarted(this.c, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Object[] objArr = {webView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "093da5238fd8d038fea60711f41f70d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "093da5238fd8d038fea60711f41f70d8");
        } else {
            this.b.onPageFinished(this.c, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Object[] objArr = {webView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccec4fcf1e0829e7ec266708fe94f9e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccec4fcf1e0829e7ec266708fe94f9e0");
        } else {
            this.b.onLoadResource(this.c, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        Object[] objArr = {webView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f58438b5157c1414b711b6db9f1b2c5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f58438b5157c1414b711b6db9f1b2c5b");
        } else {
            this.b.onPageCommitVisible(this.c, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Object[] objArr = {webView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a1c1230e6cd9c1d39d6c49f3dc7d1d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a1c1230e6cd9c1d39d6c49f3dc7d1d0");
        }
        MTWebResourceResponse shouldInterceptRequest = this.b.shouldInterceptRequest(this.c, str);
        if (shouldInterceptRequest == null) {
            return null;
        }
        return new v(shouldInterceptRequest);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Object[] objArr = {webView, webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "335a07c5d4f9eb358ca43b72bc6de4dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "335a07c5d4f9eb358ca43b72bc6de4dd");
        }
        MTWebResourceResponse shouldInterceptRequest = this.b.shouldInterceptRequest(this.c, new m(webResourceRequest));
        if (shouldInterceptRequest == null) {
            return null;
        }
        return new v(shouldInterceptRequest);
    }

    @Override // android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        Object[] objArr = {webView, message, message2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0710eb7ffc38cec84e4617e0a0933f5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0710eb7ffc38cec84e4617e0a0933f5f");
        } else {
            this.b.onTooManyRedirects(this.c, message, message2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        Object[] objArr = {webView, Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e952d87031cd83defc540b4d8de25f24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e952d87031cd83defc540b4d8de25f24");
        } else {
            this.b.onReceivedError(this.c, i, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Object[] objArr = {webView, webResourceRequest, webResourceError};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85ce54b6002e82157272036de32f9cdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85ce54b6002e82157272036de32f9cdb");
        } else {
            this.b.onReceivedError(this.c, new m(webResourceRequest), new l(webResourceError));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Object[] objArr = {webView, webResourceRequest, webResourceResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bc3e59870bee0620f7d677277f0ffcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bc3e59870bee0620f7d677277f0ffcd");
        } else {
            this.b.onReceivedHttpError(this.c, new m(webResourceRequest), new n(webResourceResponse));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        Object[] objArr = {webView, message, message2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "462194dfc3dafef60bd18d0e8364195a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "462194dfc3dafef60bd18d0e8364195a");
        } else {
            this.b.onFormResubmission(this.c, message, message2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        Object[] objArr = {webView, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf23058325aecf69e36a4a600dc433b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf23058325aecf69e36a4a600dc433b9");
        } else {
            this.b.doUpdateVisitedHistory(this.c, str, z);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        Object[] objArr = {webView, sslErrorHandler, sslError};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8923d942aa0d2684e476148c5b3556a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8923d942aa0d2684e476148c5b3556a");
        } else {
            this.b.onReceivedSslError(this.c, new i(sslErrorHandler), sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        Object[] objArr = {webView, clientCertRequest};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abb65c03c2ce01cfb8f2b4123d352287", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abb65c03c2ce01cfb8f2b4123d352287");
        } else {
            this.b.onReceivedClientCertRequest(this.c, new a(clientCertRequest));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        Object[] objArr = {webView, httpAuthHandler, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51aade771012aa48cdc9c5a80ac46130", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51aade771012aa48cdc9c5a80ac46130");
        } else {
            this.b.onReceivedHttpAuthRequest(this.c, new e(httpAuthHandler), str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        Object[] objArr = {webView, keyEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c38049ba7275bb6bdc035fe1419d9d8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c38049ba7275bb6bdc035fe1419d9d8")).booleanValue() : this.b.shouldOverrideKeyEvent(this.c, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        Object[] objArr = {webView, keyEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7bbd51f6d9d41d23b63962d14d495f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7bbd51f6d9d41d23b63962d14d495f3");
        } else {
            this.b.onUnhandledKeyEvent(((q) webView).b, keyEvent);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f, float f2) {
        Object[] objArr = {webView, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e3ecb125e143acc167b4ed1e850ff8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e3ecb125e143acc167b4ed1e850ff8b");
        } else {
            this.b.onScaleChanged(this.c, f, f2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        Object[] objArr = {webView, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fc977e19878cc289bfc6a321b4e07c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fc977e19878cc289bfc6a321b4e07c2");
        } else {
            this.b.onReceivedLoginRequest(this.c, str, str2, str3);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Object[] objArr = {webView, renderProcessGoneDetail};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfead89905f435578730c244aae22e25", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfead89905f435578730c244aae22e25")).booleanValue() : this.b.onRenderProcessGone(this.c, new h(renderProcessGoneDetail));
    }
}
