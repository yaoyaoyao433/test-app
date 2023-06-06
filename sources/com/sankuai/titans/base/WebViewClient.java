package com.sankuai.titans.base;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.utils.HttpAuthHandler;
import com.sankuai.titans.protocol.utils.SslErrorHandler;
import com.sankuai.titans.protocol.utils.WebResourceError;
import com.sankuai.titans.protocol.webcompat.IWebView;
import com.sankuai.titans.protocol.webcompat.IWebViewClient;
import java.io.PrintStream;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WebViewClient implements IWebViewClient {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Activity activity;
    private WebViewClientListener webViewClientListener;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface WebViewClientListener {
        void doUpdateVisitedHistory(IWebView iWebView, String str, boolean z);

        long obtainPageStartedTime();

        void onPageFinished(IWebView iWebView, String str);

        void onPageStarted(IWebView iWebView, String str, Bitmap bitmap);

        @Deprecated
        void onReceivedError(IWebView iWebView, int i, String str, String str2);

        @RequiresApi(api = 23)
        void onReceivedError(IWebView iWebView, WebResourceRequest webResourceRequest, WebResourceError webResourceError);

        @RequiresApi(api = 23)
        void onReceivedHttpError(IWebView iWebView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);

        void onReceivedSslError(IWebView iWebView, SslErrorHandler sslErrorHandler, SslError sslError);

        @RequiresApi(api = 21)
        WebResourceResponse shouldInterceptRequest(IWebView iWebView, WebResourceRequest webResourceRequest);

        @Deprecated
        WebResourceResponse shouldInterceptRequest(IWebView iWebView, String str);

        @Deprecated
        boolean shouldOverrideUrlLoading(IWebView iWebView, String str);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebViewClient
    public void onFormResubmission(IWebView iWebView, Message message, Message message2) {
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebViewClient
    public void onLoadResource(IWebView iWebView, String str) {
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebViewClient
    public void onPageCommitVisible(IWebView iWebView, String str) {
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebViewClient
    @RequiresApi(api = 21)
    public void onReceivedClientCertRequest(IWebView iWebView, ClientCertRequest clientCertRequest) {
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebViewClient
    public void onReceivedHttpAuthRequest(IWebView iWebView, HttpAuthHandler httpAuthHandler, String str, String str2) {
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebViewClient
    public void onReceivedLoginRequest(IWebView iWebView, String str, String str2, String str3) {
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebViewClient
    @RequiresApi(api = 27)
    public void onSafeBrowsingHit(IWebView iWebView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebViewClient
    public void onScaleChanged(IWebView iWebView, float f, float f2) {
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebViewClient
    public void onTooManyRedirects(IWebView iWebView, Message message, Message message2) {
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebViewClient
    public void onUnhandledKeyEvent(IWebView iWebView, KeyEvent keyEvent) {
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebViewClient
    public boolean shouldOverrideKeyEvent(IWebView iWebView, KeyEvent keyEvent) {
        return false;
    }

    public WebViewClient(Activity activity, @NonNull WebViewClientListener webViewClientListener) {
        Object[] objArr = {activity, webViewClientListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5878f23ad02a3e8596a63a91d24ecb2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5878f23ad02a3e8596a63a91d24ecb2");
            return;
        }
        this.activity = activity;
        this.webViewClientListener = webViewClientListener;
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebViewClient
    public long obtainPageStartedTime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0cf4f85b83431c815c4970ace6de618b", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0cf4f85b83431c815c4970ace6de618b")).longValue() : this.webViewClientListener.obtainPageStartedTime();
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebViewClient
    @Deprecated
    public boolean shouldOverrideUrlLoading(IWebView iWebView, String str) {
        Object[] objArr = {iWebView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c3a831924553389132d34250c98471d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c3a831924553389132d34250c98471d")).booleanValue() : this.webViewClientListener.shouldOverrideUrlLoading(iWebView, str);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebViewClient
    @RequiresApi(api = 24)
    public boolean shouldOverrideUrlLoading(IWebView iWebView, WebResourceRequest webResourceRequest) {
        Object[] objArr = {iWebView, webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a993e54c76a24949ae78e118bfc29f0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a993e54c76a24949ae78e118bfc29f0")).booleanValue() : shouldOverrideUrlLoading(iWebView, webResourceRequest.getUrl().toString());
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebViewClient
    public void onPageStarted(IWebView iWebView, String str, Bitmap bitmap) {
        Object[] objArr = {iWebView, str, bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96190202f4ad12f931b8fe6a88057438", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96190202f4ad12f931b8fe6a88057438");
        } else {
            this.webViewClientListener.onPageStarted(iWebView, str, bitmap);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebViewClient
    public void onPageFinished(IWebView iWebView, String str) {
        Object[] objArr = {iWebView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1be39ba4a84062953fc9f6f3f963e047", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1be39ba4a84062953fc9f6f3f963e047");
        } else {
            this.webViewClientListener.onPageFinished(iWebView, str);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebViewClient
    @Deprecated
    public WebResourceResponse shouldInterceptRequest(IWebView iWebView, String str) {
        Object[] objArr = {iWebView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2797f871d39e9aa6ed1871123110791", RobustBitConfig.DEFAULT_VALUE) ? (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2797f871d39e9aa6ed1871123110791") : this.webViewClientListener.shouldInterceptRequest(iWebView, str);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebViewClient
    @RequiresApi(api = 21)
    public WebResourceResponse shouldInterceptRequest(IWebView iWebView, WebResourceRequest webResourceRequest) {
        Object[] objArr = {iWebView, webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b763c48cd7b164f7e57f91c822536460", RobustBitConfig.DEFAULT_VALUE) ? (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b763c48cd7b164f7e57f91c822536460") : this.webViewClientListener.shouldInterceptRequest(iWebView, webResourceRequest);
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebViewClient
    @Deprecated
    public void onReceivedError(IWebView iWebView, int i, String str, String str2) {
        Object[] objArr = {iWebView, Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5165b4f40f0a0f8751d8a914e8a0833", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5165b4f40f0a0f8751d8a914e8a0833");
        } else {
            this.webViewClientListener.onReceivedError(iWebView, i, str, str2);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebViewClient
    @RequiresApi(api = 23)
    public void onReceivedError(IWebView iWebView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Object[] objArr = {iWebView, webResourceRequest, webResourceError};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb91f7d6668ffd6913905637b56a4337", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb91f7d6668ffd6913905637b56a4337");
        } else {
            this.webViewClientListener.onReceivedError(iWebView, webResourceRequest, webResourceError);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebViewClient
    @RequiresApi(api = 23)
    public void onReceivedHttpError(IWebView iWebView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Object[] objArr = {iWebView, webResourceRequest, webResourceResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a75d1aedfa4e9c133323adb12469956f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a75d1aedfa4e9c133323adb12469956f");
        } else {
            this.webViewClientListener.onReceivedHttpError(iWebView, webResourceRequest, webResourceResponse);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebViewClient
    public void onReceivedSslError(IWebView iWebView, SslErrorHandler sslErrorHandler, SslError sslError) {
        Object[] objArr = {iWebView, sslErrorHandler, sslError};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f390b6aed2ffb8c1a8d67ee7f8b8985a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f390b6aed2ffb8c1a8d67ee7f8b8985a");
        } else {
            this.webViewClientListener.onReceivedSslError(iWebView, sslErrorHandler, sslError);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebViewClient
    public void doUpdateVisitedHistory(IWebView iWebView, String str, boolean z) {
        Object[] objArr = {iWebView, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d2bd414426972356640fc4e0cc09826", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d2bd414426972356640fc4e0cc09826");
        } else {
            this.webViewClientListener.doUpdateVisitedHistory(iWebView, str, z);
        }
    }

    @Override // com.sankuai.titans.protocol.webcompat.IWebViewClient
    @RequiresApi(api = 26)
    public boolean onRenderProcessGone(IWebView iWebView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Object[] objArr = {iWebView, renderProcessGoneDetail};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d327c1fed14bcdfeba9b625e452935e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d327c1fed14bcdfeba9b625e452935e")).booleanValue();
        }
        if (renderProcessGoneDetail.didCrash() && this.activity != null) {
            this.activity.finish();
        }
        PrintStream printStream = System.out;
        printStream.println("knb onRenderProcessGone[didCrash:" + renderProcessGoneDetail.didCrash() + ",rendererPriorityAtExit:" + renderProcessGoneDetail.rendererPriorityAtExit() + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        return true;
    }
}
