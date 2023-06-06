package com.sankuai.meituan.android.knb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.client.WebClientListenerV3;
import com.sankuai.meituan.android.knb.listener.OnWebClientListenerV2;
import com.sankuai.meituan.android.knb.listener.OnWebClientListenerV3;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class KNBWebClientListenerImpl implements WebClientListenerV3 {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final KNBWebCompatDelegate mKnbWebCompatDelegate;

    @Override // com.sankuai.meituan.android.knb.client.WebClientListener
    public final boolean needWrapUrl(String str) {
        return false;
    }

    public KNBWebClientListenerImpl(KNBWebCompatDelegate kNBWebCompatDelegate) {
        Object[] objArr = {kNBWebCompatDelegate};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "297dab60f331feb10d6045a1b300d18b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "297dab60f331feb10d6045a1b300d18b");
        } else {
            this.mKnbWebCompatDelegate = kNBWebCompatDelegate;
        }
    }

    @Override // com.sankuai.meituan.android.knb.client.WebClientListener
    public final boolean prefixContains(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48758402ca61d8193643efd2b1133f29", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48758402ca61d8193643efd2b1133f29")).booleanValue() : KNBWebManager.isInPrefixWhite(str);
    }

    @Override // com.sankuai.meituan.android.knb.client.WebClientListener
    public final boolean schemaContains(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4716eda7825311e8713af3119113aac0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4716eda7825311e8713af3119113aac0")).booleanValue() : KNBWebManager.isInSchemeWhite(str);
    }

    @Override // com.sankuai.meituan.android.knb.client.WebClientListener
    public final void handleUri(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "890e6278f2279b9e8ef9e51e1ecae250", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "890e6278f2279b9e8ef9e51e1ecae250");
        } else {
            this.mKnbWebCompatDelegate.handleUri(uri);
        }
    }

    @Override // com.sankuai.meituan.android.knb.client.WebClientListener
    public final Activity getActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4704f2c0d9426273282cd8f6728797d1", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4704f2c0d9426273282cd8f6728797d1") : this.mKnbWebCompatDelegate.getActivity();
    }

    @Override // com.sankuai.meituan.android.knb.client.WebClientListener
    public final WebView getWebView() {
        return this.mKnbWebCompatDelegate.mWebView;
    }

    @Override // com.sankuai.meituan.android.knb.client.WebClientListener
    public final void updateTitle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11f1be77b321443ab2433dc1ebd137fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11f1be77b321443ab2433dc1ebd137fa");
        } else {
            this.mKnbWebCompatDelegate.onWebViewTitleReceived(str);
        }
    }

    @Override // com.sankuai.meituan.android.knb.client.WebClientListener
    public final void reportOnPageStarted(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74af491e541b134ec6e4054c1d163558", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74af491e541b134ec6e4054c1d163558");
        } else {
            this.mKnbWebCompatDelegate.reportOnPageStarted(str);
        }
    }

    @Override // com.sankuai.meituan.android.knb.client.WebClientListener
    public final void reportOnPageFinished(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eab55140d52e9cfa149d478ee24cb32c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eab55140d52e9cfa149d478ee24cb32c");
        } else {
            this.mKnbWebCompatDelegate.reportOnPageFinished(str);
        }
    }

    @Override // com.sankuai.meituan.android.knb.client.WebClientListener
    public final void reportOnReceivedError(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6ab76e5f70c4b7dd81ae2e03392850f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6ab76e5f70c4b7dd81ae2e03392850f");
        } else {
            this.mKnbWebCompatDelegate.reportOnReceivedError(str);
        }
    }

    @Override // com.sankuai.meituan.android.knb.client.WebClientListener
    public final void mgeRedirectUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a7d39b5c933760d0f71d8db154e931d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a7d39b5c933760d0f71d8db154e931d");
        } else if (this.mKnbWebCompatDelegate.mMgeRedirectUrlListener != null) {
            this.mKnbWebCompatDelegate.mMgeRedirectUrlListener.mgeRedirectUrl(str);
        }
    }

    @Override // com.sankuai.meituan.android.knb.client.WebClientListener
    public final void setErrorViewVisibility(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7319e54a872f8eb904e6faad2d4ffd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7319e54a872f8eb904e6faad2d4ffd1");
        } else if (this.mKnbWebCompatDelegate instanceof KNBWebCompatDelegateImpl) {
            if (8 == i) {
                ((KNBWebCompatDelegateImpl) this.mKnbWebCompatDelegate).hideMask();
            } else {
                this.mKnbWebCompatDelegate.showMask();
            }
        }
    }

    @Override // com.sankuai.meituan.android.knb.client.WebClientListener
    public final void loadUrl(String str, Map<String, String> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66fa9448e671cd193f0c0b98c4957ac9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66fa9448e671cd193f0c0b98c4957ac9");
        } else {
            loadUrl(str, map, true);
        }
    }

    @Override // com.sankuai.meituan.android.knb.client.WebClientListener
    public final void loadUrl(String str, Map<String, String> map, boolean z) {
        Object[] objArr = {str, map, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67178947e27c46f37ec3d071c38eb66a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67178947e27c46f37ec3d071c38eb66a");
        } else {
            this.mKnbWebCompatDelegate.loadUrl(str, map, z);
        }
    }

    @Override // com.sankuai.meituan.android.knb.client.WebClientListener
    public final boolean shouldOverrideUrlLoading(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a9c6957a691a264adf6b40408bf1dbc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a9c6957a691a264adf6b40408bf1dbc")).booleanValue();
        }
        if (this.mKnbWebCompatDelegate.mOnWebClientListener != null) {
            return this.mKnbWebCompatDelegate.mOnWebClientListener.shouldOverrideUrlLoading(str);
        }
        return false;
    }

    @Override // com.sankuai.meituan.android.knb.client.WebClientListenerV3
    public final boolean shouldOverrideUrlLoading(WebResourceRequest webResourceRequest) {
        Object[] objArr = {webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46cec3d3daa0a4350c2f9a1faa13a872", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46cec3d3daa0a4350c2f9a1faa13a872")).booleanValue();
        }
        if (this.mKnbWebCompatDelegate.mOnWebClientListener == null || !(this.mKnbWebCompatDelegate.mOnWebClientListener instanceof OnWebClientListenerV3)) {
            return false;
        }
        return ((OnWebClientListenerV3) this.mKnbWebCompatDelegate.mOnWebClientListener).shouldOverrideUrlLoading(webResourceRequest);
    }

    @Override // com.sankuai.meituan.android.knb.client.WebClientListener
    public final void onPageStarted(String str, Bitmap bitmap) {
        Object[] objArr = {str, bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57bce2c50761e1236d1c3b955a894da4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57bce2c50761e1236d1c3b955a894da4");
            return;
        }
        resetLoading();
        showLoading();
        if (this.mKnbWebCompatDelegate.mOnWebClientListener != null) {
            this.mKnbWebCompatDelegate.mOnWebClientListener.onPageStarted(str, bitmap);
        }
    }

    @Override // com.sankuai.meituan.android.knb.client.WebClientListener
    public final void onPageFinished(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97c3709c2c1661a2107edc4f104e1a9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97c3709c2c1661a2107edc4f104e1a9d");
            return;
        }
        resetLoading();
        if (this.mKnbWebCompatDelegate.mOnWebClientListener != null) {
            this.mKnbWebCompatDelegate.mOnWebClientListener.onPageFinished(str);
        }
    }

    @Override // com.sankuai.meituan.android.knb.client.WebClientListener
    public final void onReceivedError(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca24bbba9a4eab7bc26580df88d2de8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca24bbba9a4eab7bc26580df88d2de8f");
            return;
        }
        resetLoading();
        if (this.mKnbWebCompatDelegate.mOnWebClientListener != null) {
            this.mKnbWebCompatDelegate.mOnWebClientListener.onReceivedError(i, str, str2);
        }
    }

    @Override // com.sankuai.meituan.android.knb.client.WebClientListener
    public final void onReceivedSslError(SslErrorHandler sslErrorHandler, SslError sslError) {
        Object[] objArr = {sslErrorHandler, sslError};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1be1ff121e2eeaa3c6037c8bf4d10970", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1be1ff121e2eeaa3c6037c8bf4d10970");
            return;
        }
        resetLoading();
        if (this.mKnbWebCompatDelegate.mOnWebClientListener != null) {
            this.mKnbWebCompatDelegate.mOnWebClientListener.onReceivedSslError(sslErrorHandler, sslError);
        }
    }

    private void resetLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "becd93d20f0c0a708dd5c7704de177b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "becd93d20f0c0a708dd5c7704de177b9");
        } else if (this.mKnbWebCompatDelegate instanceof KNBWebCompatDelegateImpl) {
            ((KNBWebCompatDelegateImpl) this.mKnbWebCompatDelegate).resetLoading();
        }
    }

    private void showLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba313409e47e57111ead02790fc5b82e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba313409e47e57111ead02790fc5b82e");
        } else if (this.mKnbWebCompatDelegate instanceof KNBWebCompatDelegateImpl) {
            ((KNBWebCompatDelegateImpl) this.mKnbWebCompatDelegate).showLoadingView();
        }
    }

    @Override // com.sankuai.meituan.android.knb.client.WebClientListenerV2
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        Object[] objArr = {webView, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04c99b0d9754162974d6ae602b34a231", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04c99b0d9754162974d6ae602b34a231");
        } else if (this.mKnbWebCompatDelegate.mOnWebClientListener == null || !(this.mKnbWebCompatDelegate.mOnWebClientListener instanceof OnWebClientListenerV2)) {
        } else {
            ((OnWebClientListenerV2) this.mKnbWebCompatDelegate.mOnWebClientListener).doUpdateVisitedHistory(webView, str, z);
        }
    }
}
