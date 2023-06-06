package com.meituan.mmp.lib.page.view;

import android.support.annotation.Nullable;
import android.view.View;
import android.webkit.ValueCallback;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface b {
    void a();

    void a(int i);

    void a(Object obj, String str);

    void a(String str);

    void a(String str, @Nullable ValueCallback<String> valueCallback);

    void a(String str, String str2, String str3, String str4, String str5);

    void b();

    void b(int i);

    void c();

    void d();

    void e();

    void f();

    String getUrl();

    String getUserAgentString();

    int getWebPageHeight();

    int getWebScrollY();

    View getWebView();

    long getWebViewInitializationDuration();

    void setOnFullScreenListener(e eVar);

    void setOnPageFinishedListener(com.meituan.mmp.lib.web.g gVar);

    void setOnRenderProcessGoneListener(com.meituan.mmp.lib.web.h hVar);

    void setOnWebScrollChangeListener(com.meituan.mmp.lib.web.i iVar);

    void setUserAgentString(String str);

    void setWidgetBackgroundColor(int i);
}
