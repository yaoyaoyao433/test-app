package com.meituan.mtwebkit.internal.system;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.meituan.mtwebkit.MTCookieManager;
import com.meituan.mtwebkit.MTGeolocationPermissions;
import com.meituan.mtwebkit.MTValueCallback;
import com.meituan.mtwebkit.MTWebStorage;
import com.meituan.mtwebkit.MTWebView;
import com.meituan.mtwebkit.MTWebViewDatabase;
import com.meituan.mtwebkit.MTWebViewFactory;
import com.meituan.mtwebkit.MTWebViewFactoryProvider;
import com.meituan.mtwebkit.MTWebViewProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class y implements MTWebViewFactoryProvider, MTWebViewFactoryProvider.Statics {
    public static ChangeQuickRedirect a;
    private static b b;

    @Override // com.meituan.mtwebkit.MTWebViewFactoryProvider
    public final MTWebViewFactoryProvider.Statics getStatics() {
        return this;
    }

    static {
        if (Build.VERSION.SDK_INT >= 28) {
            String dataDirectorySuffix = MTWebViewFactory.getDataDirectorySuffix();
            if (TextUtils.isEmpty(dataDirectorySuffix)) {
                return;
            }
            try {
                WebView.setDataDirectorySuffix(dataDirectorySuffix);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewFactoryProvider
    public final MTWebViewProvider createWebView(MTWebView mTWebView, MTWebView.PrivateAccess privateAccess) {
        Object[] objArr = {mTWebView, privateAccess};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d18eec0528a0ce404579e87c8b3850d", RobustBitConfig.DEFAULT_VALUE) ? (MTWebViewProvider) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d18eec0528a0ce404579e87c8b3850d") : new z(mTWebView, privateAccess);
    }

    @Override // com.meituan.mtwebkit.MTWebViewFactoryProvider
    public final MTGeolocationPermissions getGeolocationPermissions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7a45920a3e8836175fb6903c33cb8d1", RobustBitConfig.DEFAULT_VALUE) ? (MTGeolocationPermissions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7a45920a3e8836175fb6903c33cb8d1") : new d();
    }

    @Override // com.meituan.mtwebkit.MTWebViewFactoryProvider
    public final synchronized MTCookieManager getCookieManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ea499e71c8d25db41077cb058681242", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTCookieManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ea499e71c8d25db41077cb058681242");
        }
        if (b == null) {
            b = new b();
        }
        return b;
    }

    @Override // com.meituan.mtwebkit.MTWebViewFactoryProvider
    public final MTWebStorage getWebStorage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fafed77a936d592fa6c5210345c73e98", RobustBitConfig.DEFAULT_VALUE) ? (MTWebStorage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fafed77a936d592fa6c5210345c73e98") : new p();
    }

    @Override // com.meituan.mtwebkit.MTWebViewFactoryProvider
    public final MTWebViewDatabase getWebViewDatabase(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25df3a60710e1f7285127a658e719dc3", RobustBitConfig.DEFAULT_VALUE) ? (MTWebViewDatabase) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25df3a60710e1f7285127a658e719dc3") : new r();
    }

    @Override // com.meituan.mtwebkit.MTWebViewFactoryProvider
    public final ClassLoader getWebViewClassLoader() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb9cf2c3de26d1b579f49e87f64d2f4c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ClassLoader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb9cf2c3de26d1b579f49e87f64d2f4c");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return WebView.getWebViewClassLoader();
        }
        return null;
    }

    @Override // com.meituan.mtwebkit.MTWebViewFactoryProvider.Statics
    public final String findAddress(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c69ec78aa03c5b34d1db5bf935b67b6b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c69ec78aa03c5b34d1db5bf935b67b6b") : WebView.findAddress(str);
    }

    @Override // com.meituan.mtwebkit.MTWebViewFactoryProvider.Statics
    public final String getDefaultUserAgent(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2d1de831ba3f77c702ec1605b96d59e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2d1de831ba3f77c702ec1605b96d59e") : WebSettings.getDefaultUserAgent(context);
    }

    @Override // com.meituan.mtwebkit.MTWebViewFactoryProvider.Statics
    public final void freeMemoryForTests() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c055dc48f65234f76c2528907efaadb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c055dc48f65234f76c2528907efaadb0");
            return;
        }
        try {
            com.meituan.mtwebkit.internal.d.a((Class<?>) WebView.class).a("freeMemoryForTests", new Object[0]);
        } catch (Exception unused) {
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewFactoryProvider.Statics
    public final void setWebContentsDebuggingEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fd3e6330801bdb2d47ed7a46463650c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fd3e6330801bdb2d47ed7a46463650c");
        } else {
            WebView.setWebContentsDebuggingEnabled(z);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewFactoryProvider.Statics
    public final void clearClientCertPreferences(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7ca64eb85f474d1b0f52a3b37b5c25d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7ca64eb85f474d1b0f52a3b37b5c25d");
        } else {
            WebView.clearClientCertPreferences(runnable);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewFactoryProvider.Statics
    public final void enableSlowWholeDocumentDraw() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4df1b872100d38d79572de5ada936542", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4df1b872100d38d79572de5ada936542");
        } else {
            WebView.enableSlowWholeDocumentDraw();
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewFactoryProvider.Statics
    public final Uri[] parseFileChooserResult(int i, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2479a27d19692eeb80a7ca3038c8da7b", RobustBitConfig.DEFAULT_VALUE) ? (Uri[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2479a27d19692eeb80a7ca3038c8da7b") : WebChromeClient.FileChooserParams.parseResult(i, intent);
    }

    @Override // com.meituan.mtwebkit.MTWebViewFactoryProvider.Statics
    @SuppressLint({"WebViewApiAvailability"})
    public final void initSafeBrowsing(Context context, final MTValueCallback<Boolean> mTValueCallback) {
        Object[] objArr = {context, mTValueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43dd2b6952837238dcb156efb2f6be29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43dd2b6952837238dcb156efb2f6be29");
        } else if (Build.VERSION.SDK_INT >= 27) {
            WebView.startSafeBrowsing(context, mTValueCallback == null ? null : new ValueCallback<Boolean>() { // from class: com.meituan.mtwebkit.internal.system.y.1
                public static ChangeQuickRedirect a;

                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Boolean bool) {
                    Boolean bool2 = bool;
                    Object[] objArr2 = {bool2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e391f540aed0fe808d12ef8b7718339a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e391f540aed0fe808d12ef8b7718339a");
                    } else {
                        mTValueCallback.onReceiveValue(bool2);
                    }
                }
            });
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewFactoryProvider.Statics
    @SuppressLint({"WebViewApiAvailability"})
    public final void setSafeBrowsingWhitelist(List<String> list, final MTValueCallback<Boolean> mTValueCallback) {
        Object[] objArr = {list, mTValueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cabcb2c4a18777f453e32952161e2b83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cabcb2c4a18777f453e32952161e2b83");
        } else if (Build.VERSION.SDK_INT >= 27) {
            WebView.setSafeBrowsingWhitelist(list, mTValueCallback == null ? null : new ValueCallback<Boolean>() { // from class: com.meituan.mtwebkit.internal.system.y.2
                public static ChangeQuickRedirect a;

                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Boolean bool) {
                    Boolean bool2 = bool;
                    Object[] objArr2 = {bool2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c565d0612f9fd355d732c4251e8736ef", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c565d0612f9fd355d732c4251e8736ef");
                    } else {
                        mTValueCallback.onReceiveValue(bool2);
                    }
                }
            });
        }
    }

    @Override // com.meituan.mtwebkit.MTWebViewFactoryProvider.Statics
    public final Uri getSafeBrowsingPrivacyPolicyUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "843deeab5e79608bc1294a67964f7655", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "843deeab5e79608bc1294a67964f7655");
        }
        if (Build.VERSION.SDK_INT >= 27) {
            return WebView.getSafeBrowsingPrivacyPolicyUrl();
        }
        return null;
    }
}
