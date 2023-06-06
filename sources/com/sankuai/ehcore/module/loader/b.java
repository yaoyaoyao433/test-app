package com.sankuai.ehcore.module.loader;

import android.text.TextUtils;
import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.service.utils.thread.a;
import com.sankuai.ehcore.module.loader.a;
import com.sankuai.meituan.android.knb.TitansXWebView;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements a.InterfaceC0552a {
    public static ChangeQuickRedirect a;
    private final a b;

    private b(a aVar) {
        this.b = aVar;
    }

    public static a.InterfaceC0552a a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a1ce8597dec28c130277992a9cfc5ffa", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0552a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a1ce8597dec28c130277992a9cfc5ffa") : new b(aVar);
    }

    @Override // com.sankuai.eh.component.service.utils.thread.a.InterfaceC0552a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46e0d9b611973438bc6ea5433ca851f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46e0d9b611973438bc6ea5433ca851f4");
            return;
        }
        final a aVar = this.b;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "47be2eab2a257097e6ece56f2f5f5f27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "47be2eab2a257097e6ece56f2f5f5f27");
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "5045dc1d472b3333af503c427b2e8412", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "5045dc1d472b3333af503c427b2e8412");
        } else if (aVar.b) {
        } else {
            aVar.c = false;
            if (TextUtils.isEmpty(aVar.d())) {
                return;
            }
            final TitansXWebView b = aVar.b();
            if (aVar.c() == 1) {
                aVar.d = b;
            }
            com.sankuai.ehcore.util.a.a("eh_report", new d.b().a("name", "eh.report").a("event", "commonPrefetch").b);
            b.setWebViewClient(new a.c(b, b) { // from class: com.sankuai.ehcore.module.loader.a.3
                public static ChangeQuickRedirect a;
                public final /* synthetic */ TitansXWebView b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(b);
                    a.this = aVar;
                    this.b = b;
                }

                @Override // android.webkit.WebViewClient
                public final void onPageFinished(WebView webView, String str) {
                    Object[] objArr4 = {webView, str};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f52f24272ddf90d4f789f007eaa1ca5a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f52f24272ddf90d4f789f007eaa1ca5a");
                        return;
                    }
                    super.onPageFinished(webView, str);
                    a.this.b = true;
                    a.this.c = true;
                    a.this.a(a.this.a(this.b), com.sankuai.ehcore.horn.e.d());
                }
            });
        }
    }
}
