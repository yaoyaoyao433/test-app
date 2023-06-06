package com.sankuai.ehcore.module.loader;

import android.webkit.JavascriptInterface;
import com.google.gson.JsonElement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.service.utils.thread.a;
import java.util.concurrent.ScheduledFuture;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;
    public com.sankuai.ehcore.module.core.a b;
    public ScheduledFuture<?> c;
    public boolean d;
    boolean e;
    boolean f;

    public g(com.sankuai.ehcore.module.core.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9f8f19ad65d83b7f710fad16debfe46", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9f8f19ad65d83b7f710fad16debfe46");
            return;
        }
        this.b = aVar;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6b22f7db3c573ab9bdf152ac5bafe456", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6b22f7db3c573ab9bdf152ac5bafe456");
        } else if (com.sankuai.ehcore.horn.e.f() == null || !com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(com.sankuai.ehcore.horn.e.f(), "enabled"), true).booleanValue() || a() == null) {
        } else {
            this.d = true;
            this.b.e().d("autoshowV2");
            this.b.e.addJavascriptInterface(new a(), "eh");
        }
    }

    public JsonElement a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6eb457f02ac980bf73351bc8b2370f1b", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6eb457f02ac980bf73351bc8b2370f1b") : this.b.e().a().get("autoshowV2_1");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class a {
        public static ChangeQuickRedirect a;

        public a() {
            Object[] objArr = {g.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3efd6f5e54cbaa9671801801b135964", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3efd6f5e54cbaa9671801801b135964");
            }
        }

        @JavascriptInterface
        public final void onLoad(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc35c51bf92031b09b64699910d2665c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc35c51bf92031b09b64699910d2665c");
                return;
            }
            com.sankuai.eh.component.service.tools.d.a("timing_detector", str);
            String b = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(com.sankuai.eh.component.service.utils.b.a(str), "event"), "");
            if ("hide".equals(b)) {
                if (g.this.b.e().c("hide") == null) {
                    g.this.b.e().a("hide", 1);
                    com.sankuai.ehcore.util.a.a("autoshow.hide", new d.b().a(com.sankuai.ehcore.util.a.a(g.this.b.e())).b, Long.valueOf(g.this.b.e().b("at_eh_open")));
                    com.sankuai.eh.component.service.utils.thread.b a2 = com.sankuai.eh.component.service.utils.thread.b.a();
                    Object[] objArr2 = {this};
                    ChangeQuickRedirect changeQuickRedirect2 = k.a;
                    a2.a(new com.sankuai.eh.component.service.utils.thread.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "518dcb3a10b7cae52799bcb14916d63b", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0552a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "518dcb3a10b7cae52799bcb14916d63b") : new k(this)));
                }
            } else if ("autoshow".equals(b)) {
                com.sankuai.eh.component.service.utils.thread.b a3 = com.sankuai.eh.component.service.utils.thread.b.a();
                Object[] objArr3 = {this};
                ChangeQuickRedirect changeQuickRedirect3 = l.a;
                a3.a(new com.sankuai.eh.component.service.utils.thread.a(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "8eb0c843d7a76e8663989514eb711966", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0552a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "8eb0c843d7a76e8663989514eb711966") : new l(this)));
            }
        }
    }
}
