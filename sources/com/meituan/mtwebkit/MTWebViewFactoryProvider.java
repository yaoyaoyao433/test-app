package com.meituan.mtwebkit;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.meituan.mtwebkit.MTWebView;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface MTWebViewFactoryProvider {

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface Statics {
        void clearClientCertPreferences(Runnable runnable);

        void enableSlowWholeDocumentDraw();

        String findAddress(String str);

        void freeMemoryForTests();

        String getDefaultUserAgent(Context context);

        Uri getSafeBrowsingPrivacyPolicyUrl();

        void initSafeBrowsing(Context context, MTValueCallback<Boolean> mTValueCallback);

        Uri[] parseFileChooserResult(int i, Intent intent);

        void setSafeBrowsingWhitelist(List<String> list, MTValueCallback<Boolean> mTValueCallback);

        void setWebContentsDebuggingEnabled(boolean z);
    }

    MTWebViewProvider createWebView(MTWebView mTWebView, MTWebView.PrivateAccess privateAccess);

    MTCookieManager getCookieManager();

    MTGeolocationPermissions getGeolocationPermissions();

    Statics getStatics();

    MTWebStorage getWebStorage();

    ClassLoader getWebViewClassLoader();

    MTWebViewDatabase getWebViewDatabase(Context context);
}
