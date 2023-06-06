package com.sankuai.meituan.android.knb.client;

import android.net.Uri;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface WebChromeListener {
    boolean handleJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult);

    boolean onConsoleMessage(ConsoleMessage consoleMessage);

    void onFileChooser(ValueCallback<Uri> valueCallback, String str, String str2);

    boolean onShowFileChooser(ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams);
}
