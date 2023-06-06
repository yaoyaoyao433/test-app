package com.unionpay;
/* loaded from: classes6.dex */
public final class x implements Runnable {
    final /* synthetic */ ac a;
    final /* synthetic */ String b;
    final /* synthetic */ ad c;
    final /* synthetic */ WebViewJavascriptBridge d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(WebViewJavascriptBridge webViewJavascriptBridge, ac acVar, String str, ad adVar) {
        this.d = webViewJavascriptBridge;
        this.a = acVar;
        this.b = str;
        this.c = adVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a != null) {
            this.a.a(this.b, this.c);
        }
    }
}
