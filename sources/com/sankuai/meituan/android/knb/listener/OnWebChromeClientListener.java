package com.sankuai.meituan.android.knb.listener;

import android.net.Uri;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface OnWebChromeClientListener {
    boolean onConsoleMessage(ConsoleMessage consoleMessage);

    boolean onFileChooser(ValueCallback<Uri> valueCallback, String str, String str2);

    boolean onShowFileChooser(ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams);
}
