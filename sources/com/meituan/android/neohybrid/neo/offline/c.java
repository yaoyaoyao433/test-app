package com.meituan.android.neohybrid.neo.offline;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements a {
    public static ChangeQuickRedirect a;
    private final com.meituan.android.neohybrid.core.a b;

    public c(com.meituan.android.neohybrid.core.a aVar) {
        this.b = aVar;
    }

    @Override // com.meituan.android.neohybrid.neo.offline.a
    public final f a(WebView webView, WebResourceRequest webResourceRequest) {
        Object[] objArr = {webView, webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe8d838f2e86022325b316bb2b121251", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe8d838f2e86022325b316bb2b121251") : b.a(this.b, webView, webResourceRequest);
    }
}
