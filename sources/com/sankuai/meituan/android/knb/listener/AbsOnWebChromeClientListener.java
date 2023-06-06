package com.sankuai.meituan.android.knb.listener;

import android.net.Uri;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class AbsOnWebChromeClientListener implements OnWebChromeClientListener {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.meituan.android.knb.listener.OnWebChromeClientListener
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return false;
    }

    @Override // com.sankuai.meituan.android.knb.listener.OnWebChromeClientListener
    public boolean onFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        return false;
    }

    @Override // com.sankuai.meituan.android.knb.listener.OnWebChromeClientListener
    public boolean onShowFileChooser(ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return false;
    }
}
