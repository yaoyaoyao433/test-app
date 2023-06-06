package com.huawei.secure.android.common.webview;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static void a(WebView webView) {
        WebSettings settings = webView.getSettings();
        settings.setAllowFileAccess(false);
        if (Build.VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
        }
        if (Build.VERSION.SDK_INT >= 11) {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        }
        if (Build.VERSION.SDK_INT <= 18) {
            settings.setSavePassword(false);
        }
        settings.setGeolocationEnabled(false);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(1);
        }
        if (Build.VERSION.SDK_INT >= 11) {
            settings.setAllowContentAccess(false);
        }
    }
}
