package com.sankuai.meituan.android.knb.listener;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface OnWebClientListener {
    void onPageFinished(String str);

    void onPageStarted(String str, Bitmap bitmap);

    void onReceivedError(int i, String str, String str2);

    void onReceivedSslError(SslErrorHandler sslErrorHandler, SslError sslError);

    boolean shouldOverrideUrlLoading(String str);
}
