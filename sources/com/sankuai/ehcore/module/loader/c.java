package com.sankuai.ehcore.module.loader;

import android.webkit.WebView;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.utils.thread.a;
import com.sankuai.ehcore.module.loader.a;
import com.sankuai.meituan.android.knb.TitansXWebView;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements a.InterfaceC0552a {
    public static ChangeQuickRedirect a;
    private final a b;
    private final JsonElement c;
    private final String d;

    private c(a aVar, JsonElement jsonElement, String str) {
        this.b = aVar;
        this.c = jsonElement;
        this.d = str;
    }

    public static a.InterfaceC0552a a(a aVar, JsonElement jsonElement, String str) {
        Object[] objArr = {aVar, jsonElement, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b722cd16b04f745dcd7a195ef426f7e9", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0552a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b722cd16b04f745dcd7a195ef426f7e9") : new c(aVar, jsonElement, str);
    }

    @Override // com.sankuai.eh.component.service.utils.thread.a.InterfaceC0552a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9be2b6fb19616fe7888beeba8527881", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9be2b6fb19616fe7888beeba8527881");
            return;
        }
        final a aVar = this.b;
        final JsonElement jsonElement = this.c;
        final String str = this.d;
        Object[] objArr2 = {aVar, jsonElement, str};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6b2f279c171852497565115f8e381d71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6b2f279c171852497565115f8e381d71");
            return;
        }
        aVar.d = aVar.b();
        TitansXWebView titansXWebView = aVar.d;
        final TitansXWebView titansXWebView2 = aVar.d;
        titansXWebView.setWebViewClient(new a.c(titansXWebView2, jsonElement, str) { // from class: com.sankuai.ehcore.module.loader.a.1
            public static ChangeQuickRedirect a;
            public final /* synthetic */ JsonElement b;
            public final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(titansXWebView2);
                a.this = aVar;
                this.b = jsonElement;
                this.c = str;
            }

            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str2) {
                Object[] objArr3 = {webView, str2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e2f9e868b56a864c2cd01c442d14fbb0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e2f9e868b56a864c2cd01c442d14fbb0");
                    return;
                }
                super.onPageFinished(webView, str2);
                a.this.a(a.this.a(a.this.d), com.sankuai.eh.component.service.utils.b.a(this.b, "pattern", new JsonPrimitive(this.c)));
            }
        });
    }
}
