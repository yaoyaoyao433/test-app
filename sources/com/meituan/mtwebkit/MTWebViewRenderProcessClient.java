package com.meituan.mtwebkit;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class MTWebViewRenderProcessClient {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract void onRenderProcessResponsive(MTWebView mTWebView, MTWebViewRenderProcess mTWebViewRenderProcess);

    public abstract void onRenderProcessUnresponsive(MTWebView mTWebView, MTWebViewRenderProcess mTWebViewRenderProcess);
}
