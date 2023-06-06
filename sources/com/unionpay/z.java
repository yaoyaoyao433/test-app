package com.unionpay;
/* loaded from: classes6.dex */
public final class z implements ad {
    final /* synthetic */ WebViewJavascriptBridge a;
    private final String b;

    public z(WebViewJavascriptBridge webViewJavascriptBridge, String str) {
        this.a = webViewJavascriptBridge;
        this.b = str;
    }

    @Override // com.unionpay.ad
    public final void a(String str) {
        this.a._callbackJs(this.b, str);
    }
}
