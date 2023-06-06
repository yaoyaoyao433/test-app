package com.unionpay;

import android.webkit.WebView;
import android.webkit.WebViewClient;
/* loaded from: classes6.dex */
public final class ab extends WebViewClient {
    final /* synthetic */ WebViewJavascriptBridge a;

    private ab(WebViewJavascriptBridge webViewJavascriptBridge) {
        this.a = webViewJavascriptBridge;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ab(WebViewJavascriptBridge webViewJavascriptBridge, byte b) {
        this(webViewJavascriptBridge);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        com.unionpay.utils.j.a("test", "onPageFinished");
    }
}
