package com.sankuai.titans.protocol.adaptor;

import android.content.Context;
import android.support.annotation.NonNull;
import com.sankuai.titans.protocol.services.IServiceManager;
import com.sankuai.titans.protocol.webcompat.IWebView;
import com.sankuai.titans.protocol.webcompat.elements.DynamicTitleBarEntity;
import com.sankuai.titans.protocol.webcompat.elements.ITitleBar;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface ITitansAppAdaptor {
    boolean canWebViewDownload(String str);

    IAppTitansInfo getAppInfo();

    IAppTitansPlugin getAppTitansPlugin();

    DynamicTitleBarEntity getDynamicTitleBar();

    IWebView getIWebView(Context context, String str);

    @NonNull
    IServiceManager getServiceManager();

    ITitleBar getTitleBar(Context context);

    void onCookieChange(CookieChangeListener cookieChangeListener);
}
