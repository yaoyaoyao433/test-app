package com.sankuai.ehcore.module.loader;

import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.service.utils.thread.a;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements a.InterfaceC0552a {
    public static ChangeQuickRedirect a;
    private final g b;
    private final long c;
    private final int d;
    private final WebView e;

    public i(g gVar, long j, int i, WebView webView) {
        this.b = gVar;
        this.c = j;
        this.d = i;
        this.e = webView;
    }

    @Override // com.sankuai.eh.component.service.utils.thread.a.InterfaceC0552a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54aaf744e850b570fe9fef6907fdd4e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54aaf744e850b570fe9fef6907fdd4e6");
            return;
        }
        g gVar = this.b;
        long j = this.c;
        int i = this.d;
        WebView webView = this.e;
        Object[] objArr2 = {gVar, new Long(j), Integer.valueOf(i), webView};
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "431be89e4eef9df6f1c392f82400c107", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "431be89e4eef9df6f1c392f82400c107");
        } else if (!gVar.f && System.currentTimeMillis() - j > i) {
            gVar.f = true;
            com.sankuai.eh.component.service.tools.d.a("timing_detector", "autoshow轮询超时");
            com.sankuai.ehcore.util.a.a("autoshow.polling", new d.b().a("pattern", gVar.b.e().i).b, null);
            gVar.c.cancel(false);
        } else {
            webView.evaluateJavascript("(function(){ return location.href; })();", j.a(gVar, webView));
        }
    }
}
