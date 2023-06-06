package com.meituan.mtwebkit;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MTWebViewClient {
    public static final int ERROR_AUTHENTICATION = -4;
    public static final int ERROR_BAD_URL = -12;
    public static final int ERROR_CONNECT = -6;
    public static final int ERROR_FAILED_SSL_HANDSHAKE = -11;
    public static final int ERROR_FILE = -13;
    public static final int ERROR_FILE_NOT_FOUND = -14;
    public static final int ERROR_HOST_LOOKUP = -2;
    public static final int ERROR_IO = -7;
    public static final int ERROR_PROXY_AUTHENTICATION = -5;
    public static final int ERROR_REDIRECT_LOOP = -9;
    public static final int ERROR_TIMEOUT = -8;
    public static final int ERROR_TOO_MANY_REQUESTS = -15;
    public static final int ERROR_UNKNOWN = -1;
    public static final int ERROR_UNSAFE_RESOURCE = -16;
    public static final int ERROR_UNSUPPORTED_AUTH_SCHEME = -3;
    public static final int ERROR_UNSUPPORTED_SCHEME = -10;
    public static final int SAFE_BROWSING_THREAT_BILLING = 4;
    public static final int SAFE_BROWSING_THREAT_MALWARE = 1;
    public static final int SAFE_BROWSING_THREAT_PHISHING = 2;
    public static final int SAFE_BROWSING_THREAT_UNKNOWN = 0;
    public static final int SAFE_BROWSING_THREAT_UNWANTED_SOFTWARE = 3;
    public static ChangeQuickRedirect changeQuickRedirect;

    public void doUpdateVisitedHistory(MTWebView mTWebView, String str, boolean z) {
    }

    public void onLoadResource(MTWebView mTWebView, String str) {
    }

    public void onPageCommitVisible(MTWebView mTWebView, String str) {
    }

    public void onPageFinished(MTWebView mTWebView, String str) {
    }

    public void onPageStarted(MTWebView mTWebView, String str, Bitmap bitmap) {
    }

    @Deprecated
    public void onReceivedError(MTWebView mTWebView, int i, String str, String str2) {
    }

    public void onReceivedHttpError(MTWebView mTWebView, MTWebResourceRequest mTWebResourceRequest, MTWebResourceResponse mTWebResourceResponse) {
    }

    public void onReceivedLoginRequest(MTWebView mTWebView, String str, String str2, String str3) {
    }

    public boolean onRenderProcessGone(MTWebView mTWebView, MTRenderProcessGoneDetail mTRenderProcessGoneDetail) {
        return false;
    }

    public void onScaleChanged(MTWebView mTWebView, float f, float f2) {
    }

    public void onUnhandledKeyEvent(MTWebView mTWebView, KeyEvent keyEvent) {
    }

    @Deprecated
    public MTWebResourceResponse shouldInterceptRequest(MTWebView mTWebView, String str) {
        return null;
    }

    public boolean shouldOverrideKeyEvent(MTWebView mTWebView, KeyEvent keyEvent) {
        return false;
    }

    @Deprecated
    public boolean shouldOverrideUrlLoading(MTWebView mTWebView, String str) {
        return false;
    }

    public boolean shouldOverrideUrlLoading(MTWebView mTWebView, MTWebResourceRequest mTWebResourceRequest) {
        Object[] objArr = {mTWebView, mTWebResourceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "146b15fa7a8dc7584ddb5e4c031187c2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "146b15fa7a8dc7584ddb5e4c031187c2")).booleanValue() : shouldOverrideUrlLoading(mTWebView, mTWebResourceRequest.getUrl().toString());
    }

    public MTWebResourceResponse shouldInterceptRequest(MTWebView mTWebView, MTWebResourceRequest mTWebResourceRequest) {
        Object[] objArr = {mTWebView, mTWebResourceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08168e3300c4acc56f78dfdcbc420176", RobustBitConfig.DEFAULT_VALUE) ? (MTWebResourceResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08168e3300c4acc56f78dfdcbc420176") : shouldInterceptRequest(mTWebView, mTWebResourceRequest.getUrl().toString());
    }

    @Deprecated
    public void onTooManyRedirects(MTWebView mTWebView, Message message, Message message2) {
        Object[] objArr = {mTWebView, message, message2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93f8ebd159e57c225f9751b3708a157a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93f8ebd159e57c225f9751b3708a157a");
        } else {
            message.sendToTarget();
        }
    }

    public void onReceivedError(MTWebView mTWebView, MTWebResourceRequest mTWebResourceRequest, MTWebResourceError mTWebResourceError) {
        Object[] objArr = {mTWebView, mTWebResourceRequest, mTWebResourceError};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2fc18bb277f02854936ca453f70c24da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2fc18bb277f02854936ca453f70c24da");
        } else if (mTWebResourceRequest.isForMainFrame()) {
            onReceivedError(mTWebView, mTWebResourceError.getErrorCode(), mTWebResourceError.getDescription().toString(), mTWebResourceRequest.getUrl().toString());
        }
    }

    public void onFormResubmission(MTWebView mTWebView, Message message, Message message2) {
        Object[] objArr = {mTWebView, message, message2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48de8f3e940bbcb16494522d908b131b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48de8f3e940bbcb16494522d908b131b");
        } else {
            message.sendToTarget();
        }
    }

    public void onReceivedSslError(MTWebView mTWebView, MTSslErrorHandler mTSslErrorHandler, SslError sslError) {
        Object[] objArr = {mTWebView, mTSslErrorHandler, sslError};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f09662d179fa81c03329dd7a422e0c98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f09662d179fa81c03329dd7a422e0c98");
        } else {
            mTSslErrorHandler.cancel();
        }
    }

    public void onReceivedClientCertRequest(MTWebView mTWebView, MTClientCertRequest mTClientCertRequest) {
        Object[] objArr = {mTWebView, mTClientCertRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a873a58147d28c1608513935eec5345d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a873a58147d28c1608513935eec5345d");
        } else {
            mTClientCertRequest.cancel();
        }
    }

    public void onReceivedHttpAuthRequest(MTWebView mTWebView, MTHttpAuthHandler mTHttpAuthHandler, String str, String str2) {
        Object[] objArr = {mTWebView, mTHttpAuthHandler, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5bd51ed2f39c896ed8599d590c5e9d72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5bd51ed2f39c896ed8599d590c5e9d72");
        } else {
            mTHttpAuthHandler.cancel();
        }
    }
}
