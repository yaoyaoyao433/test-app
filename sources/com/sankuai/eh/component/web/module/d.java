package com.sankuai.eh.component.web.module;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.context.ITitansContainerContext;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private WebView b;
    private ITitansContainerContext c;

    public d(ITitansContainerContext iTitansContainerContext) {
        Object[] objArr = {iTitansContainerContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d931591c115198b3e0e065d3ca65202e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d931591c115198b3e0e065d3ca65202e");
        } else {
            this.c = iTitansContainerContext;
        }
    }

    public d(WebView webView) {
        Object[] objArr = {webView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a9d1583e50c5ce0c9ca688c31f29089", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a9d1583e50c5ce0c9ca688c31f29089");
        } else {
            this.b = webView;
        }
    }

    public final void a(String str, ValueCallback<String> valueCallback) {
        Object[] objArr = {str, valueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bdb39c5aab8648de6db3e0136579944", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bdb39c5aab8648de6db3e0136579944");
        } else if (this.b != null) {
            this.b.evaluateJavascript(str, valueCallback);
        } else if (this.c != null) {
            this.c.loadJs(str, valueCallback);
        }
    }
}
