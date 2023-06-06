package com.huawei.secure.android.common.webview;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.net.http.SslError;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.huawei.secure.android.common.webview.c;
import java.util.Arrays;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SafeWebView extends WebView {
    private String a;
    private String[] b;
    private String[] c;
    private String[] d;
    private c e;

    public SafeWebView(Context context) {
        super(context);
        a();
    }

    public SafeWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    @TargetApi(9)
    @Deprecated
    public String[] getWhitelist() {
        if (this.b == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(this.b, this.b.length);
    }

    @TargetApi(9)
    @Deprecated
    public void setWhitelist(String[] strArr) {
        this.b = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @TargetApi(9)
    public String[] getWhitelistWithPath() {
        if (this.d == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(this.d, this.d.length);
    }

    @TargetApi(9)
    public void setWhitelistWithPath(String[] strArr) {
        this.d = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @Deprecated
    public String[] getWhitelistNotMathcSubDomain() {
        if (this.c == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(this.c, this.c.length);
    }

    @Deprecated
    public void setWhitelistNotMathcSubDomain(String[] strArr) {
        this.c = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public String getDefaultErrorPage() {
        return this.a;
    }

    public void setDefaultErrorPage(String str) {
        this.a = str;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(new a(webViewClient));
    }

    private void a() {
        com.huawei.secure.android.common.webview.a.a(this);
        setWebViewClient(null);
    }

    public c getWebViewLoadCallBack() {
        return this.e;
    }

    public void setWebViewLoadCallBack(c cVar) {
        this.e = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public final class a extends WebViewClient {
        private WebViewClient b;
        private boolean c;

        private a(WebViewClient webViewClient, boolean z) {
            this.b = webViewClient;
            this.c = z;
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(21)
        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            if (this.b != null) {
                return this.b.shouldInterceptRequest(webView, webResourceRequest);
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(11)
        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            if (this.b != null) {
                return this.b.shouldInterceptRequest(webView, str);
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (this.b != null) {
                return this.b.shouldOverrideUrlLoading(webView, str);
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(24)
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (this.b != null) {
                return this.b.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }

        /* JADX WARN: Removed duplicated region for block: B:54:0x00d5 A[LOOP:0: B:24:0x0045->B:54:0x00d5, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x00f1 A[EDGE_INSN: B:73:0x00f1->B:61:0x00f1 ?: BREAK  , SYNTHETIC] */
        @Override // android.webkit.WebViewClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onPageStarted(android.webkit.WebView r9, java.lang.String r10, android.graphics.Bitmap r11) {
            /*
                Method dump skipped, instructions count: 294
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.secure.android.common.webview.SafeWebView.a.onPageStarted(android.webkit.WebView, java.lang.String, android.graphics.Bitmap):void");
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            if (this.b != null) {
                this.b.onPageFinished(webView, str);
            } else {
                super.onPageFinished(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onLoadResource(WebView webView, String str) {
            if (this.b != null) {
                this.b.onLoadResource(webView, str);
            } else {
                super.onLoadResource(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(23)
        public final void onPageCommitVisible(WebView webView, String str) {
            if (this.b != null) {
                this.b.onPageCommitVisible(webView, str);
            } else {
                super.onPageCommitVisible(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
            if (this.b != null) {
                this.b.onTooManyRedirects(webView, message, message2);
            } else {
                super.onTooManyRedirects(webView, message, message2);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            if (this.b != null) {
                this.b.onReceivedError(webView, i, str, str2);
            } else {
                super.onReceivedError(webView, i, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(23)
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (this.b != null) {
                this.b.onReceivedError(webView, webResourceRequest, webResourceError);
            } else {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(23)
        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            if (this.b != null) {
                this.b.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            } else {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onFormResubmission(WebView webView, Message message, Message message2) {
            if (this.b != null) {
                this.b.onFormResubmission(webView, message, message2);
            } else {
                super.onFormResubmission(webView, message, message2);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
            if (this.b != null) {
                this.b.doUpdateVisitedHistory(webView, str, z);
            } else {
                super.doUpdateVisitedHistory(webView, str, z);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(21)
        public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
            if (this.b != null) {
                this.b.onReceivedClientCertRequest(webView, clientCertRequest);
            } else {
                super.onReceivedClientCertRequest(webView, clientCertRequest);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            if (this.b != null) {
                this.b.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            } else {
                super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
            if (this.b != null) {
                return this.b.shouldOverrideKeyEvent(webView, keyEvent);
            }
            return super.shouldOverrideKeyEvent(webView, keyEvent);
        }

        @Override // android.webkit.WebViewClient
        public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
            if (this.b != null) {
                this.b.onUnhandledKeyEvent(webView, keyEvent);
            } else {
                super.onUnhandledKeyEvent(webView, keyEvent);
            }
        }

        @Override // android.webkit.WebViewClient
        @SuppressLint({"NewApi"})
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (this.b != null) {
                return this.b.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient
        @SuppressLint({"NewApi"})
        public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
            if (this.b != null) {
                this.b.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
            } else {
                super.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onScaleChanged(WebView webView, float f, float f2) {
            if (this.b != null) {
                this.b.onScaleChanged(webView, f, f2);
            } else {
                super.onScaleChanged(webView, f, f2);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(12)
        public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
            if (this.b != null) {
                this.b.onReceivedLoginRequest(webView, str, str2, str3);
            } else {
                super.onReceivedLoginRequest(webView, str, str2, str3);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(8)
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (this.b != null) {
                this.b.onReceivedSslError(webView, sslErrorHandler, sslError);
            } else {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (URLUtil.isHttpUrl(str)) {
            Log.e("SafeWebView", "loadUrl: http url , not safe");
            if (!TextUtils.isEmpty(this.a)) {
                super.loadUrl(this.a);
                return;
            } else if (getWebViewLoadCallBack() != null) {
                Log.e("SafeWebView", "WebViewLoadCallBack");
                getWebViewLoadCallBack();
                int i = c.a.a;
                return;
            } else {
                return;
            }
        }
        super.loadUrl(str);
    }

    @Override // android.webkit.WebView
    public void postUrl(String str, byte[] bArr) {
        if (URLUtil.isHttpUrl(str)) {
            Log.e("SafeWebView", "postUrl: http url , not safe");
            if (!TextUtils.isEmpty(this.a)) {
                super.postUrl(this.a, bArr);
                return;
            } else if (getWebViewLoadCallBack() != null) {
                Log.e("SafeWebView", "WebViewLoadCallBack");
                getWebViewLoadCallBack();
                int i = c.a.a;
                return;
            } else {
                return;
            }
        }
        super.postUrl(str, bArr);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        if (URLUtil.isHttpUrl(str)) {
            Log.e("SafeWebView", "loadUrl: http url , not safe");
            if (!TextUtils.isEmpty(this.a)) {
                super.loadUrl(this.a, map);
                return;
            } else if (getWebViewLoadCallBack() != null) {
                Log.e("SafeWebView", "WebViewLoadCallBack");
                getWebViewLoadCallBack();
                int i = c.a.a;
                return;
            } else {
                return;
            }
        }
        super.loadUrl(str, map);
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (URLUtil.isHttpUrl(str)) {
            Log.e("SafeWebView", "loadDataWithBaseURL: http url , not safe");
            if (!TextUtils.isEmpty(this.a)) {
                super.loadDataWithBaseURL(this.a, str2, str3, str4, str5);
                return;
            } else if (getWebViewLoadCallBack() != null) {
                Log.e("SafeWebView", "WebViewLoadCallBack");
                getWebViewLoadCallBack();
                int i = c.a.a;
                return;
            } else {
                return;
            }
        }
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }
}
