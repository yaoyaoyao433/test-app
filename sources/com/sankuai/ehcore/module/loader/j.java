package com.sankuai.ehcore.module.loader;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements ValueCallback {
    public static ChangeQuickRedirect a;
    private final g b;
    private final WebView c;

    private j(g gVar, WebView webView) {
        this.b = gVar;
        this.c = webView;
    }

    public static ValueCallback a(g gVar, WebView webView) {
        Object[] objArr = {gVar, webView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c6be8e01d810fecc65266b64a516386d", RobustBitConfig.DEFAULT_VALUE) ? (ValueCallback) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c6be8e01d810fecc65266b64a516386d") : new j(gVar, webView);
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd0b9578624dafad1ea5997c3acc6a87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd0b9578624dafad1ea5997c3acc6a87");
            return;
        }
        g gVar = this.b;
        WebView webView = this.c;
        String str = (String) obj;
        Object[] objArr2 = {gVar, webView, str};
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "678f82d5ceb6dbb25dbfc4f8ac5da2ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "678f82d5ceb6dbb25dbfc4f8ac5da2ff");
        } else if (gVar.e || TextUtils.isEmpty(str)) {
        } else {
            String replace = str.replace(CommonConstant.Symbol.DOUBLE_QUOTES, "");
            if ("about:blank".equals(replace) || !replace.startsWith("http")) {
                return;
            }
            gVar.e = true;
            Object[] objArr3 = {webView};
            ChangeQuickRedirect changeQuickRedirect3 = g.a;
            if (PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect3, false, "fa7b1f958627443d32e3703c4da5c802", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect3, false, "fa7b1f958627443d32e3703c4da5c802");
            } else {
                try {
                    String c = com.sankuai.ehcore.horn.e.c(com.sankuai.eh.component.service.utils.c.a(com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(com.sankuai.ehcore.horn.e.f(), "path"), "")));
                    if (!TextUtils.isEmpty(c)) {
                        webView.evaluateJavascript(c.replaceFirst("__eh_autoshow__", com.sankuai.eh.component.service.utils.b.a(gVar.a())), null);
                    }
                } catch (Exception e) {
                    com.sankuai.eh.component.service.tools.d.a(e);
                }
            }
            com.sankuai.eh.component.service.tools.d.a("timing_detector", "autoshow检测url已进入加载：" + replace);
            gVar.c.cancel(false);
        }
    }
}
