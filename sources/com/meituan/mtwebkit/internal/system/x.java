package com.meituan.mtwebkit.internal.system;

import android.annotation.SuppressLint;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import com.meituan.mtwebkit.MTWebView;
import com.meituan.mtwebkit.MTWebViewRenderProcessClient;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@SuppressLint({"NewApi"})
/* loaded from: classes3.dex */
public final class x extends WebViewRenderProcessClient {
    public static ChangeQuickRedirect a;
    private MTWebViewRenderProcessClient b;
    private MTWebView c;

    public x(MTWebView mTWebView, MTWebViewRenderProcessClient mTWebViewRenderProcessClient) {
        Object[] objArr = {mTWebView, mTWebViewRenderProcessClient};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5172eb328b9f2816ca35133cbc906985", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5172eb328b9f2816ca35133cbc906985");
            return;
        }
        this.b = mTWebViewRenderProcessClient;
        this.c = mTWebView;
    }

    @Override // android.webkit.WebViewRenderProcessClient
    public final void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        Object[] objArr = {webView, webViewRenderProcess};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3b0e5d6db0fbb3fd88004856d84e63a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3b0e5d6db0fbb3fd88004856d84e63a");
        } else {
            this.b.onRenderProcessUnresponsive(this.c, new s(webViewRenderProcess));
        }
    }

    @Override // android.webkit.WebViewRenderProcessClient
    public final void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        Object[] objArr = {webView, webViewRenderProcess};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3a77aea9fd0f1174c928ff0308897e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3a77aea9fd0f1174c928ff0308897e0");
        } else {
            this.b.onRenderProcessResponsive(this.c, new s(webViewRenderProcess));
        }
    }
}
