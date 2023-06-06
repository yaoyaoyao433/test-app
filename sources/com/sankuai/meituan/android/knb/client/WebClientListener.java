package com.sankuai.meituan.android.knb.client;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface WebClientListener {
    Activity getActivity();

    WebView getWebView();

    void handleUri(Uri uri);

    @Deprecated
    void loadUrl(String str, Map<String, String> map);

    void loadUrl(String str, Map<String, String> map, boolean z);

    void mgeRedirectUrl(String str);

    boolean needWrapUrl(String str);

    void onPageFinished(String str);

    void onPageStarted(String str, Bitmap bitmap);

    void onReceivedError(int i, String str, String str2);

    void onReceivedSslError(SslErrorHandler sslErrorHandler, SslError sslError);

    boolean prefixContains(String str);

    void reportOnPageFinished(String str);

    void reportOnPageStarted(String str);

    void reportOnReceivedError(String str);

    boolean schemaContains(String str);

    void setErrorViewVisibility(int i);

    boolean shouldOverrideUrlLoading(String str);

    void updateTitle(String str);
}
