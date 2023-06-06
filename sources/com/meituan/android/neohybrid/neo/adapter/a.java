package com.meituan.android.neohybrid.neo.adapter;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.meituan.android.neohybrid.core.u;
import com.meituan.android.neohybrid.util.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends WebViewClient {
    public static ChangeQuickRedirect a;
    public final List<WebViewClient> b;
    private final com.meituan.android.neohybrid.core.a c;
    private final WebViewClient d;
    private final List<com.meituan.android.neohybrid.neo.offline.a> e;

    public a(WebViewClient webViewClient, com.meituan.android.neohybrid.core.a aVar) {
        Object[] objArr = {webViewClient, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67cb02edfba84130365003bd129dfbb9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67cb02edfba84130365003bd129dfbb9");
            return;
        }
        this.c = aVar;
        this.d = webViewClient;
        this.b = new ArrayList();
        this.e = new ArrayList();
    }

    public final void a(com.meituan.android.neohybrid.neo.offline.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed969d7f3ede327ade808d45f7b14be1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed969d7f3ede327ade808d45f7b14be1");
        } else {
            this.e.add(aVar);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Object[] objArr = {webView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db3a6b6c56599c29d7f326d2fb2ce5ef", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db3a6b6c56599c29d7f326d2fb2ce5ef")).booleanValue();
        }
        if (this.d != null) {
            return this.d.shouldOverrideUrlLoading(webView, str);
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Object[] objArr = {webView, webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93ce99711dbbdfadec2935ad7346a386", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93ce99711dbbdfadec2935ad7346a386")).booleanValue();
        }
        if (this.d != null) {
            return this.d.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Object[] objArr = {webView, str, bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70520eaa98475c0f7c71f76bc70c125b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70520eaa98475c0f7c71f76bc70c125b");
        } else if (this.d != null) {
            this.d.onPageStarted(webView, str, bitmap);
        } else {
            super.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Object[] objArr = {webView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55d6c76337ab58bdcc7492c394f166b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55d6c76337ab58bdcc7492c394f166b0");
        } else if (this.d != null) {
            this.d.onPageFinished(webView, str);
        } else {
            super.onPageFinished(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Object[] objArr = {webView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84b6a64fc879b2ca7528e804b44ba7b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84b6a64fc879b2ca7528e804b44ba7b3");
        } else if (this.d != null) {
            this.d.onLoadResource(webView, str);
        } else {
            super.onLoadResource(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public final void onPageCommitVisible(WebView webView, String str) {
        Object[] objArr = {webView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f170887ae8041d705ea3e818b0efe2bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f170887ae8041d705ea3e818b0efe2bf");
        } else if (this.d != null) {
            this.d.onPageCommitVisible(webView, str);
        } else {
            super.onPageCommitVisible(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Object[] objArr = {webView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb6fbfdda5bb60fadc9bda35f97e7e57", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb6fbfdda5bb60fadc9bda35f97e7e57");
        }
        if (this.d != null) {
            return this.d.shouldInterceptRequest(webView, str);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
        if (r2.equals(r3) != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016c A[EDGE_INSN: B:63:0x016c->B:56:0x016c ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.webkit.WebResourceResponse a(android.webkit.WebView r21, android.webkit.WebResourceRequest r22) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.neohybrid.neo.adapter.a.a(android.webkit.WebView, android.webkit.WebResourceRequest):android.webkit.WebResourceResponse");
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebResourceResponse shouldInterceptRequest;
        Object[] objArr = {webView, webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a8a9431e41e45ba938e319d4b1e400b", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a8a9431e41e45ba938e319d4b1e400b");
        }
        WebResourceResponse a2 = a(webView, webResourceRequest);
        if (a2 != null) {
            return a2;
        }
        if (this.d != null) {
            shouldInterceptRequest = this.d.shouldInterceptRequest(webView, webResourceRequest);
        } else {
            shouldInterceptRequest = super.shouldInterceptRequest(webView, webResourceRequest);
        }
        if (com.meituan.android.neohybrid.init.a.h()) {
            String str = "线上资源";
            if (this.c.c instanceof u) {
                str = "线上资源;NSR流程";
            }
            f.a(str + " url=" + webResourceRequest.getUrl());
        }
        return shouldInterceptRequest;
    }

    @Override // android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        Object[] objArr = {webView, message, message2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e95598150da2cfe8794d2d1cc188427a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e95598150da2cfe8794d2d1cc188427a");
        } else if (this.d != null) {
            this.d.onTooManyRedirects(webView, message, message2);
        } else {
            super.onTooManyRedirects(webView, message, message2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        Object[] objArr = {webView, Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78311b9d4f052b74152be257513aa44d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78311b9d4f052b74152be257513aa44d");
        } else if (this.d != null) {
            this.d.onReceivedError(webView, i, str, str2);
        } else {
            super.onReceivedError(webView, i, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Object[] objArr = {webView, webResourceRequest, webResourceError};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51d4318720a210b5e0888ae1b96730d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51d4318720a210b5e0888ae1b96730d9");
        } else if (this.d != null) {
            this.d.onReceivedError(webView, webResourceRequest, webResourceError);
        } else {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Object[] objArr = {webView, webResourceRequest, webResourceResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "359dc6019917407b44f26108fbc8d204", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "359dc6019917407b44f26108fbc8d204");
        } else if (this.d != null) {
            this.d.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        } else {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        Object[] objArr = {webView, message, message2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e664ac7064622d925355a4ab951e24d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e664ac7064622d925355a4ab951e24d");
        } else if (this.d != null) {
            this.d.onFormResubmission(webView, message, message2);
        } else {
            super.onFormResubmission(webView, message, message2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        Object[] objArr = {webView, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ab43796b9cfbf2e7c46b759320633f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ab43796b9cfbf2e7c46b759320633f0");
        } else if (this.d != null) {
            this.d.doUpdateVisitedHistory(webView, str, z);
        } else {
            super.doUpdateVisitedHistory(webView, str, z);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        Object[] objArr = {webView, sslErrorHandler, sslError};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1167a0ed9f84f413f56c1a9d406583bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1167a0ed9f84f413f56c1a9d406583bc");
        } else if (this.d != null) {
            this.d.onReceivedSslError(webView, sslErrorHandler, sslError);
        } else {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        Object[] objArr = {webView, clientCertRequest};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45d26fe76532ef81ef00316850b9a4c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45d26fe76532ef81ef00316850b9a4c8");
        } else if (this.d != null) {
            this.d.onReceivedClientCertRequest(webView, clientCertRequest);
        } else {
            super.onReceivedClientCertRequest(webView, clientCertRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        Object[] objArr = {webView, httpAuthHandler, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a73febfd2430851d90a6d84f102658d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a73febfd2430851d90a6d84f102658d");
        } else if (this.d != null) {
            this.d.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        } else {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        Object[] objArr = {webView, keyEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa358b957628e25d2ede0be8572ebf38", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa358b957628e25d2ede0be8572ebf38")).booleanValue();
        }
        if (this.d != null) {
            return this.d.shouldOverrideKeyEvent(webView, keyEvent);
        }
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        Object[] objArr = {webView, keyEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6ed30c83b5dd4f738131acfe12c9180", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6ed30c83b5dd4f738131acfe12c9180");
        } else if (this.d != null) {
            this.d.onUnhandledKeyEvent(webView, keyEvent);
        } else {
            super.onUnhandledKeyEvent(webView, keyEvent);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f, float f2) {
        Object[] objArr = {webView, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c8285e8fde8e094b74590f9f74e36ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c8285e8fde8e094b74590f9f74e36ac");
        } else if (this.d != null) {
            this.d.onScaleChanged(webView, f, f2);
        } else {
            super.onScaleChanged(webView, f, f2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, @Nullable String str2, String str3) {
        Object[] objArr = {webView, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "094d1ef390fc3815b3fcf5199e10b6f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "094d1ef390fc3815b3fcf5199e10b6f3");
        } else if (this.d != null) {
            this.d.onReceivedLoginRequest(webView, str, str2, str3);
        } else {
            super.onReceivedLoginRequest(webView, str, str2, str3);
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Object[] objArr = {webView, renderProcessGoneDetail};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d15da0010d414abdaaaa5a86d40e575", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d15da0010d414abdaaaa5a86d40e575")).booleanValue();
        }
        for (WebViewClient webViewClient : this.b) {
            if (webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail)) {
                return true;
            }
        }
        if (this.d != null) {
            return this.d.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }
}
