package com.sankuai.ehcore.module.loader;

import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.utils.thread.a;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {
    public static ChangeQuickRedirect a;
    private final g b;
    private final long c;
    private final int d;
    private final WebView e;

    private h(g gVar, long j, int i, WebView webView) {
        this.b = gVar;
        this.c = j;
        this.d = i;
        this.e = webView;
    }

    public static Runnable a(g gVar, long j, int i, WebView webView) {
        Object[] objArr = {gVar, new Long(j), Integer.valueOf(i), webView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d8fdf4a215bbac4c78cfe218d0ea5c93", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d8fdf4a215bbac4c78cfe218d0ea5c93") : new h(gVar, j, i, webView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4c9c8b25a2e65456691d6f1c194ebb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4c9c8b25a2e65456691d6f1c194ebb5");
            return;
        }
        g gVar = this.b;
        long j = this.c;
        int i = this.d;
        WebView webView = this.e;
        Object[] objArr2 = {gVar, new Long(j), Integer.valueOf(i), webView};
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0e8cae008fc12d745fe397fa7baccb44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0e8cae008fc12d745fe397fa7baccb44");
            return;
        }
        com.sankuai.eh.component.service.utils.thread.b a2 = com.sankuai.eh.component.service.utils.thread.b.a();
        Object[] objArr3 = {gVar, new Long(j), Integer.valueOf(i), webView};
        ChangeQuickRedirect changeQuickRedirect3 = i.a;
        a2.a(new com.sankuai.eh.component.service.utils.thread.a(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "499275ba3eda7ad42032c83c22dda79a", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0552a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "499275ba3eda7ad42032c83c22dda79a") : new i(gVar, j, i, webView)));
    }
}
