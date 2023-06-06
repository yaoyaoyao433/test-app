package com.tencent.smtt.sdk;

import android.annotation.TargetApi;
import android.view.View;
import android.webkit.WebChromeClient;
import com.tencent.smtt.sdk.SystemWebChromeClient;
/* loaded from: classes6.dex */
public class e extends SystemWebChromeClient {
    /* JADX INFO: Access modifiers changed from: package-private */
    public e(WebView webView, WebChromeClient webChromeClient) {
        super(webView, webChromeClient);
    }

    @Override // android.webkit.WebChromeClient
    @TargetApi(7)
    public void onHideCustomView() {
        this.a.onHideCustomView();
    }

    @Override // android.webkit.WebChromeClient
    @TargetApi(14)
    @Deprecated
    public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        this.a.onShowCustomView(view, i, new SystemWebChromeClient.b(customViewCallback));
    }

    @Override // android.webkit.WebChromeClient
    @TargetApi(7)
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.a.onShowCustomView(view, new SystemWebChromeClient.b(customViewCallback));
    }
}
