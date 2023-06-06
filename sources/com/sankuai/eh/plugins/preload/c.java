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
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ff1c25c80bf43560f2352bd4f27d3c4", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0552a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ff1c25c80bf43560f2352bd4f27d3c4") : new c(aVar, jsonElement, str);
    }

    @Override // com.sankuai.eh.component.service.utils.thread.a.InterfaceC0552a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bef8ed0178b1cde66c78793205a2c3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bef8ed0178b1cde66c78793205a2c3d");
            return;
        }
        final a aVar = this.b;
        final JsonElement jsonElement = this.c;
        final String str = this.d;
        Object[] objArr2 = {aVar, jsonElement, str};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7c465d5119705ec651505e8a289154ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7c465d5119705ec651505e8a289154ee");
            return;
        }
        final TitansXWebView b = aVar.b();
        b.setWebViewClient(new a.c(b, b, jsonElement, str) { // from class: com.sankuai.eh.plugins.preload.a.2
            public static ChangeQuickRedirect a;
            public final /* synthetic */ TitansXWebView b;
            public final /* synthetic */ JsonElement c;
            public final /* synthetic */ String d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(b);
                a.this = aVar;
                this.b = b;
                this.c = jsonElement;
                this.d = str;
            }

            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str2) {
                Object[] objArr3 = {webView, str2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dc175ad3cb1a90b8dfc71077e1c7fa1c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dc175ad3cb1a90b8dfc71077e1c7fa1c");
                    return;
                }
                super.onPageFinished(webView, str2);
                a.this.a(a.this.a(this.b), com.sankuai.eh.component.service.utils.b.a(this.c, "pattern", new JsonPrimitive(this.d)));
            }
        });
    }
}
