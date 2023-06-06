package com.unionpay;
/* loaded from: classes6.dex */
public final class y implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ WebViewJavascriptBridge b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(WebViewJavascriptBridge webViewJavascriptBridge, String str) {
        this.b = webViewJavascriptBridge;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.mWebView.loadUrl(this.a);
    }
}
