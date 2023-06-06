package com.meituan.android.neohybrid.neo.ssr;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.meituan.android.neohybrid.neo.offline.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements com.meituan.android.neohybrid.neo.offline.a {
    public static ChangeQuickRedirect a;
    private final a b;

    public b(a aVar) {
        this.b = aVar;
    }

    @Override // com.meituan.android.neohybrid.neo.offline.a
    public final f a(WebView webView, WebResourceRequest webResourceRequest) {
        Object[] objArr = {webView, webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9173df4a2b98872b7f2a758b07c6d58c", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9173df4a2b98872b7f2a758b07c6d58c") : a.a(this.b, webView, webResourceRequest);
    }
}
