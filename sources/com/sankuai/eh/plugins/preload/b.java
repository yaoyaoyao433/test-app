package com.sankuai.eh.plugins.preload;

import android.webkit.WebView;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.utils.thread.a;
import com.sankuai.eh.plugins.preload.a;
import com.sankuai.meituan.android.knb.TitansXWebView;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements a.InterfaceC0552a {
    public static ChangeQuickRedirect a;
    private final a b;
    private final JsonElement c;
    private final String d;

    private b(a aVar, JsonElement jsonElement, String str) {
        this.b = aVar;
        this.c = jsonElement;
        this.d = str;
    }

    public static a.InterfaceC0552a a(a aVar, JsonElement jsonElement, String str) {
        Object[] objArr = {aVar, jsonElement, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "56096685e7fed0290d5727d691ef904f", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0552a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "56096685e7fed0290d5727d691ef904f") : new b(aVar, jsonElement, str);
    }

    @Override // com.sankuai.eh.component.service.utils.thread.a.InterfaceC0552a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff9ebab9f50e76fb0ebb4c5d0e98d978", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff9ebab9f50e76fb0ebb4c5d0e98d978");
            return;
        }
        final a aVar = this.b;
        final JsonElement jsonElement = this.c;
        final String str = this.d;
        Object[] objArr2 = {aVar, jsonElement, str};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9433927875432d9c298e45ea7df01e58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9433927875432d9c298e45ea7df01e58");
            return;
        }
        aVar.b = aVar.b();
        TitansXWebView titansXWebView = aVar.b;
        final TitansXWebView titansXWebView2 = aVar.b;
        titansXWebView.setWebViewClient(new a.c(titansXWebView2, jsonElement, str) { // from class: com.sankuai.eh.plugins.preload.a.1
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
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "405fac12b4f8d05e625587a441d5f619", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "405fac12b4f8d05e625587a441d5f619");
                    return;
                }
                super.onPageFinished(webView, str2);
                a.this.a(a.this.a(a.this.b), com.sankuai.eh.component.service.utils.b.a(this.b, "pattern", new JsonPrimitive(this.c)));
            }
        });
    }
}
