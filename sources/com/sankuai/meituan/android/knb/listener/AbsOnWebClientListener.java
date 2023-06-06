package com.sankuai.meituan.android.knb.listener;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class AbsOnWebClientListener implements OnWebClientListener {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
    public void onPageFinished(String str) {
    }

    @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
    public void onPageStarted(String str, Bitmap bitmap) {
    }

    @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
    public void onReceivedError(int i, String str, String str2) {
    }

    public boolean onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        return false;
    }

    @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
    public void onReceivedSslError(SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        return false;
    }

    @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
    public boolean shouldOverrideUrlLoading(String str) {
        return false;
    }
}
