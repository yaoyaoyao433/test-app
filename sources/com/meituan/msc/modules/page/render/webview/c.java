package com.meituan.msc.modules.page.render.webview;

import android.support.annotation.Nullable;
import android.view.View;
import android.webkit.ValueCallback;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface c extends com.meituan.msc.modules.page.render.e, com.meituan.msc.modules.page.render.g {
    void a(Object obj, String str);

    void a(String str, @Nullable ValueCallback<String> valueCallback);

    void a(String str, String str2, String str3, String str4, String str5);

    void b(int i);

    String getUrl();

    String getUserAgentString();

    View getWebView();

    void setOnFullScreenListener(j jVar);

    void setOnPageFinishedListener(h hVar);

    void setOnRenderProcessGoneListener(i iVar);

    void setUserAgentString(String str);
}
